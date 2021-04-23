package com.spaeker.spkcore.registry.tools;

import com.spaeker.SpkCore;
import com.spaeker.spkcore.registry.items.ItemMod;
import com.spaeker.spkcore.util.Registration;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ForbiddenDirtTools {


    public static final RegistryObject<Item> FORBIDDEN_DIRT_SHOVEL =
            Registration.ITEMS.register("forbidden_dirt_shovel",
                    () -> new ShovelItem(ModItemTier.FORBIDDEN_DIRT, 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.SHOVEL, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_SWORD =
            Registration.ITEMS.register("forbidden_dirt_sword",
                    () -> new SwordItem(ModItemTier.FORBIDDEN_DIRT, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_AXE =
            Registration.ITEMS.register("forbidden_dirt_axe",
                    () -> new AxeItem((ModItemTier.FORBIDDEN_DIRT), 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.AXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_PICKAXE =
            Registration.ITEMS.register("forbidden_dirt_pickaxe",
                    () -> new PickaxeItem(ModItemTier.FORBIDDEN_DIRT, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.PICKAXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_HOE =
            Registration.ITEMS.register("forbidden_dirt_hoe",
                    () -> new HoeItem(ModItemTier.FORBIDDEN_DIRT, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.HOE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static void register() {}

    public enum ModItemTier implements IItemTier {
        FORBIDDEN_DIRT(9, 13500, 10f, 15f, 40,
                Ingredient.of(new ItemStack(ItemMod.FORBIDDEN_DIRT_BAR.get())));
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackdamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackdamage,
                int enchantability, Ingredient repairMaterial) {

        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackdamage = attackdamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return harvestLevel;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackdamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial;
    }

}
}
