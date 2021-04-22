package com.spaeker;

import com.spaeker.spkcore.block.BlockMod;
import com.spaeker.spkcore.item.ItemMod;
import com.spaeker.spkcore.util.*;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SpkCore.MOD_ID)
public class SpkCore
{
    public static final String MOD_ID = "spkcore";

    public static final ItemGroup SPK_TAB = new ItemGroup("spkTab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemMod.FORBIDDEN_DIRT_BAR.get());
        }
    };

    public static IProxy proxy;


    private static final Logger LOGGER = LogManager.getLogger();

    public SpkCore() {

        registerModAddins();
        //ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        //ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);

        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Config.loadCongfigFile(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("spk-client.toml").toString());
        // Config.loadCongfigFile(Config.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("spk-server.toml").toString());


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
        proxy.init();
    }

    private void registerModAddins(){
        Registration.init();

        ItemMod.register();
        BlockMod.register();
       // ModTileEntities.register()
        MinecraftForge.EVENT_BUS.register(new ModEvents());

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            LOGGER.info("HELLO from Register Block");
        }
    }
}
