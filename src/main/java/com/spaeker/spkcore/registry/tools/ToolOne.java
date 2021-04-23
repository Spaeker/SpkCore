package com.spaeker.spkcore.registry.tools;

import com.spaeker.SpkCore;
import com.spaeker.spkcore.registry.items.ItemMod;
import com.spaeker.spkcore.util.Registration;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ToolOne {
    public static final RegistryObject<Item> CELLSIA_SHOVEL =
            Registration.ITEMS.register("cellsia_shovel",
                    () -> new ShovelItem(ModItemTier.CELLSIA, 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.SHOVEL, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> CELLSIA_SWORD =
            Registration.ITEMS.register("cellsia_sword",
                    () -> new SwordItem(ModItemTier.CELLSIA, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> CELLSIA_AXE =
            Registration.ITEMS.register("cellsia_axe",
                    () -> new AxeItem((ModItemTier.CELLSIA), 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.AXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> CELLSIA_PICKAXE =
            Registration.ITEMS.register("cellsia_pickaxe",
                    () -> new PickaxeItem(ModItemTier.CELLSIA, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.PICKAXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> CELLSIA_HOE =
            Registration.ITEMS.register("cellsia_hoe",
                    () -> new HoeItem(ModItemTier.CELLSIA, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.HOE, 0)
                                    .tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item> FEVNE_SHOVEL =
            Registration.ITEMS.register("fevne_shovel",
                    () -> new ShovelItem(ModItemTier.FEVNE, 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.SHOVEL, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> SILVER_SHOVEL =
            Registration.ITEMS.register("silver_shovel",
                    () -> new ShovelItem(ModItemTier.SILVER, 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.SHOVEL, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> SILVER_SWORD =
            Registration.ITEMS.register("silver_sword",
                    () -> new SwordItem(ModItemTier.SILVER, 0, 0f,
                            new Item.Properties()
                                    .durability(150)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> SILVER_AXE =
            Registration.ITEMS.register("silver_axe",
                    () -> new AxeItem((ModItemTier.SILVER), 0f, 0f,
                            new Item.Properties()
                                    .durability(150)
                                    .addToolType(ToolType.AXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> SILVER_PICKAXE =
            Registration.ITEMS.register("silver_pickaxe",
                    () -> new PickaxeItem(ModItemTier.SILVER, 0, 0f,
                            new Item.Properties()
                                    .durability(150)
                                    .addToolType(ToolType.PICKAXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> SILVER_HOE =
            Registration.ITEMS.register("silver_hoe",
                    () -> new HoeItem(ModItemTier.SILVER, 0, 0f,
                            new Item.Properties()
                                    .durability(150)
                                    .addToolType(ToolType.HOE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FEVNE_SWORD =
            Registration.ITEMS.register("fevne_sword",
                    () -> new SwordItem(ModItemTier.FEVNE, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FEVNE_AXE =
            Registration.ITEMS.register("fevne_axe",
                    () -> new AxeItem((ModItemTier.FEVNE), 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.AXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FEVNE_PICKAXE =
            Registration.ITEMS.register("fevne_pickaxe",
                    () -> new PickaxeItem(ModItemTier.FEVNE, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.PICKAXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FEVNE_HOE =
            Registration.ITEMS.register("fevne_hoe",
                    () -> new HoeItem(ModItemTier.FEVNE, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.HOE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> MJELLIA_SHOVEL =
            Registration.ITEMS.register("mjellia_shovel",
                    () -> new ShovelItem(ModItemTier.MJELLIA, 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.SHOVEL, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> MJELLIA_SWORD =
            Registration.ITEMS.register("mjellia_sword",
                    () -> new SwordItem(ModItemTier.MJELLIA, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> MJELLIA_AXE =
            Registration.ITEMS.register("mjellia_axe",
                    () -> new AxeItem((ModItemTier.MJELLIA), 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.AXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> MJELLIA_PICKAXE =
            Registration.ITEMS.register("mjellia_pickaxe",
                    () -> new PickaxeItem(ModItemTier.MJELLIA, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.PICKAXE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> MJELLIA_HOE =
            Registration.ITEMS.register("mjellia_hoe",
                    () -> new HoeItem(ModItemTier.MJELLIA, 0, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.HOE, 0)
                                    .tab(SpkCore.SPK_TAB)));

    public static void register() {}

    public enum ModItemTier implements IItemTier {
        CELLSIA(5, 1600, 3f, 5f, 20,
                Ingredient.of(new ItemStack(ItemMod.CELLSIA_INGOT.get()))),
        FEVNE(6, 1700, 3f, 6f, 15,
              Ingredient.of(new ItemStack(ItemMod.FEVNE_INGOT.get()))),
        SILVER(4, 1550, 3f, 4f, 20,
               Ingredient.of(new ItemStack(ItemMod.SILVER_INGOT.get()))),
        MJELLIA(3, 1500, 5f, 3f, 22,
                Ingredient.of(new ItemStack(ItemMod.MJELLIA_INGOT.get())));

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
