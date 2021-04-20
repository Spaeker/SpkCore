package com.spaeker.spkcore.block;

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

    //OverWorld
    public static final RegistryObject<Block>  FORBIDDEN_DIRT = register("forbidden_dirt",
            () -> new Block(AbstractBlock.Properties.of(Material.DIRT)
                    .strength(3f, 10f).sound(SoundType.GRAVEL).harvestLevel(3).requiresCorrectToolForDrops().harvestTool(ToolType.SHOVEL)));
    public static final RegistryObject<Block>  FORBIDDEN_DIRT_BLOCK = register("forbidden_dirt_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));

    //Forgotten Black Wood
    public static final RegistryObject<Block>  FORGOTTEN_BLACK_LOG = register("forgotten_black_log",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(3f, 10f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block>  FORGOTTEN_BLACK_PLANKS = register("forgotten_black_planks",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(3f, 10f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block>  FORGOTTEN_BLACK_CRAFTING_TABLE = register("forgotten_black_crafting_table",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(3f, 10f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block>  FORGOTTEN_BLACK_STAIRS = register("forgotten_black_stairs",
            () -> new StairsBlock(() -> BlockMod.FORGOTTEN_BLACK_PLANKS.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.WOOD).strength(3f, 10f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block>  FORGOTTEN_BLACK_FENCE = register("forgotten_black_fence",
            () -> new FenceBlock(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(3f, 10f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block>  FORGOTTEN_BLACK_FENCE_GATE = register("forgotten_black_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(3f, 10f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block>  FORGOTTEN_BLACK_SLAB = register("forgotten_black_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(3f, 10f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block>  FORGOTTEN_BLACK_PRESSURE_PLATE = register("forgotten_black_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.of(Material.WOOD)
                    .strength(3f, 10f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block>  FORGOTTEN_BLACK_BUTTON = register("forgotten_black_button",
            () -> new WoodButtonBlock(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(3f, 10f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));

    //silver
    public static final RegistryObject<Block>  SIlVER_BLOCK = register("silver_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block>  SIlVER_ORE = register("silver_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(3f, 10f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));



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
