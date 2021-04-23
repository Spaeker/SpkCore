package com.spaeker.spkcore.registry.block;

import com.spaeker.SpkCore;
import com.spaeker.spkcore.util.Registration;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class BlockMod {
    //ForbiddenDirt
    public static final RegistryObject<Block>  FORBIDDEN_DIRT = register("forbidden_dirt",
            () -> new Block(AbstractBlock.Properties.of(Material.DIRT)
                    .strength(3f, 10f).sound(SoundType.GRAVEL).harvestLevel(3).requiresCorrectToolForDrops().harvestTool(ToolType.SHOVEL)));
    public static final RegistryObject<Block>  FORBIDDEN_DIRT_BLOCK = register("forbidden_dirt_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));

    //silver
    public static final RegistryObject<Block>  SIlVER_BLOCK = register("silver_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block>  SIlVER_ORE = register("silver_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 10f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().harvestLevel(3)));

    //Mjellia
    public static final RegistryObject<Block>  MJELLIA_BLOCK = register("mjellia_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block>  MJELLIA_ORE = register("mjellia_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 10f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().harvestLevel(3)));

    //Cellsia
    public static final RegistryObject<Block>  CELLSIA_BLOCK = register("cellsia_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block>  CELLSIA_ORE = register("cellsia_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 10f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().harvestLevel(4)));

    //FEVNE
    public static final RegistryObject<Block>  FEVNE_BLOCK = register("fevne_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block>  FEVNE_ORE = register("fevne_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 10f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().harvestLevel(5)));

    //APOTHIS
    public static final RegistryObject<Block>  APOTHIS_BLOCK = register("apothis_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(30f, 100f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block>  APOTHIS_ORE = register("apothis_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(30f, 100f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().harvestLevel(6)));

    //NYTSI
    public static final RegistryObject<Block>  NYTSI_BLOCK = register("nytsi_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(30f, 100f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block>  NYTSI_ORE = register("nytsi_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(30f, 100f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().harvestLevel(7)));


    public static void register() {}

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name,
                () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(SpkCore.SPK_TAB)));
        return toReturn;


    }
}
