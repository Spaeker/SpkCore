package com.spaeker.spkcore.registry.items;

import com.spaeker.SpkCore;
import com.spaeker.spkcore.util.Registration;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ItemMod {

    //items
    public static final RegistryObject<Item> FORBIDDEN_DIRT_BAR =
            Registration.ITEMS.register("forbidden_dirt_bar",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item> FORBIDDEN_DIRT_DUST =
            Registration.ITEMS.register("forbidden_dirt_dust",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item> BAD_APPLE =
            Registration.ITEMS.register("bad_apple",
                    BadApple::new);
    public static final RegistryObject<Item> SILVER_INGOT =
            Registration.ITEMS.register("silver_ingot",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item> MJELLIA_INGOT =
            Registration.ITEMS.register("mjellia_ingot",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item> CELLSIA_INGOT =
            Registration.ITEMS.register("cellsia_ingot",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item> FEVNE_INGOT =
            Registration.ITEMS.register("fevne_ingot",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item> APOTHIS_INGOT =
            Registration.ITEMS.register("apothis_ingot",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item> NYTSI_INGOT =
            Registration.ITEMS.register("nytsi_ingot",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item> JORDDE_INGOT =
            Registration.ITEMS.register("jordde_ingot",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item> HELLIUM_INGOT =
            Registration.ITEMS.register("hellium_ingot",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));

    //tools







    public static void register() {
    }

    public enum ModItemTier implements IItemTier {
        //tier 1



        //tier 2
        NYTSI(8, 1900, 10f, 13f, 20,
                Ingredient.of(new ItemStack(ItemMod.NYTSI_INGOT.get()))),
        JORDDE(9, 2000, 10f, 14f, 15,
              Ingredient.of(new ItemStack(ItemMod.JORDDE_INGOT.get()))),
        HELLIUM(10, 2200, 10f, 15f, 22,
                Ingredient.of(new ItemStack(ItemMod.HELLIUM_INGOT.get())));

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
