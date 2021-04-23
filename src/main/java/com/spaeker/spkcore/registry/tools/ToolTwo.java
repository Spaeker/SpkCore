package com.spaeker.spkcore.registry.tools;

import com.spaeker.SpkCore;
import com.spaeker.spkcore.registry.items.ItemMod;
import com.spaeker.spkcore.util.Registration;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ToolTwo {
    public static final RegistryObject<Item> APOTHIS_SHOVEL =
            Registration.ITEMS.register("apothis_shovel",
                    () -> new ShovelItem(ModItemTier.APOTHIS, 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.SHOVEL, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> APOTHIS_SWORD =
            Registration.ITEMS.register("apothis_sword",
                    () -> new SwordItem(ModItemTier.APOTHIS, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> APOTHIS_AXE =
            Registration.ITEMS.register("apothis_axe",
                    () -> new AxeItem((ModItemTier.APOTHIS), 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.AXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> APOTHIS_PICKAXE =
            Registration.ITEMS.register("apothis_pickaxe",
                    () -> new PickaxeItem(ModItemTier.APOTHIS, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.PICKAXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> APOTHIS_HOE =
            Registration.ITEMS.register("apothis_hoe",
                    () -> new HoeItem(ModItemTier.APOTHIS, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.HOE, 0)
                                    .tab(SpkCore.SPK_TAB)));



    public static final RegistryObject<Item> NYTSI_SHOVEL =
            Registration.ITEMS.register("nytsi_shovel",
                    () -> new ShovelItem(ModItemTier.NYTSI, 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.SHOVEL, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> NYTSI_SWORD =
            Registration.ITEMS.register("nytsi_sword",
                    () -> new SwordItem(ModItemTier.NYTSI, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> NYTSI_AXE =
            Registration.ITEMS.register("nytsi_axe",
                    () -> new AxeItem((ModItemTier.NYTSI), 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.AXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> NYTSI_PICKAXE =
            Registration.ITEMS.register("nytsi_pickaxe",
                    () -> new PickaxeItem(ModItemTier.NYTSI, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.PICKAXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> NYTSI_HOE =
            Registration.ITEMS.register("nytsi_hoe",
                    () -> new HoeItem(ModItemTier.NYTSI, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.HOE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static void register() {}

    public enum ModItemTier implements IItemTier {
        APOTHIS(7, 1850, 10f, 12f, 20,
                Ingredient.of(new ItemStack(ItemMod.APOTHIS_INGOT.get()))),
        NYTSI(8, 2000, 12f, 14f, 25,
                Ingredient.of(new ItemStack(ItemMod.NYTSI_INGOT.get())));
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
