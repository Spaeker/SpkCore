package com.spaeker.spkcore.world.gen;

import com.spaeker.spkcore.block.BlockMod;
import net.minecraft.block.Block;

public enum OreType {
    FEVNE(BlockMod.FEVNE_ORE.get(), 10, 1, 55),
    SILVER(BlockMod.SIlVER_ORE.get(), 10, 1, 55),
    CELLSIA(BlockMod.CELLSIA_ORE.get(), 10, 1, 55),
    APOTHIS(BlockMod.APOTHIS_ORE.get(), 10, 90, 155),
    MJELLIA(BlockMod.MJELLIA_ORE.get(), 10, 1, 55),
    FORBIDDEN_DIRT(BlockMod.FORBIDDEN_DIRT.get(), 1, 1, 5);

    private final Block block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Block block, int maxVeinSize, int minHeight, int maxHeight){
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public Block getBlock() {
        return block;
    }
    public static OreType getInstance(Block block){
        for(OreType ore : values()){
            if(block == ore.block){
                return ore;

            }
        }
        return null;

    }


}
