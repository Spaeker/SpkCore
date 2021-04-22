package com.spaeker.spkcore.item;

import com.spaeker.SpkCore;
import com.spaeker.spkcore.util.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
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
                    () -> new BadApple());
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



    public static final RegistryObject<Item> FEVNE_SHOVEL =
            Registration.ITEMS.register("fevne_shovel",
                    () -> new ShovelItem(ModItemTier.FEVNE, 0f, 0f,
                            new Item.Properties()
                                    .durability(100)
                                    .addToolType(ToolType.SHOVEL, 0)
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
    //armor
    public static final RegistryObject<Item> FORBIDDEN_DIRT_HELMET =
            Registration.ITEMS.register("forbidden_dirt_helmet",
                    () -> new ArmorItem(ModArmorMaterial.FORBIDDEN_DIRT, EquipmentSlotType.HEAD,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_CHESTPLATE =
            Registration.ITEMS.register("forbidden_dirt_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.FORBIDDEN_DIRT, EquipmentSlotType.CHEST,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_LEGGINGS =
            Registration.ITEMS.register("forbidden_dirt_leggings",
                    () -> new ArmorItem(ModArmorMaterial.FORBIDDEN_DIRT, EquipmentSlotType.LEGS,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_BOOTS =
            Registration.ITEMS.register("forbidden_dirt_boots",
                    () -> new ArmorItem(ModArmorMaterial.FORBIDDEN_DIRT, EquipmentSlotType.FEET,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));



    public static final RegistryObject<Item> SILVER_HELMET =
            Registration.ITEMS.register("silver_helmet",
                    () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.HEAD,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> SILVER_CHESTPLATE =
            Registration.ITEMS.register("silver_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.CHEST,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> SILVER_LEGGINGS =
            Registration.ITEMS.register("silver_leggings",
                    () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.LEGS,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> SILVER_BOOTS =
            Registration.ITEMS.register("silver_boots",
                    () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.FEET,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));



    public static final RegistryObject<Item> MJELLIA_HELMET =
            Registration.ITEMS.register("mjellia_helmet",
                    () -> new ArmorItem(ModArmorMaterial.MJELLIA, EquipmentSlotType.HEAD,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> MJELLIA_CHESTPLATE =
            Registration.ITEMS.register("mjellia_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.MJELLIA, EquipmentSlotType.CHEST,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> MJELLIA_LEGGINGS =
            Registration.ITEMS.register("mjellia_leggings",
                    () -> new ArmorItem(ModArmorMaterial.MJELLIA, EquipmentSlotType.LEGS,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> MJELLIA_BOOTS =
            Registration.ITEMS.register("mjellia_boots",
                    () -> new ArmorItem(ModArmorMaterial.MJELLIA, EquipmentSlotType.FEET,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));



    public static final RegistryObject<Item> CELLSIA_HELMET =
            Registration.ITEMS.register("cellsia_helmet",
                    () -> new ArmorItem(ModArmorMaterial.CELLSIA, EquipmentSlotType.HEAD,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> CELLSIA_CHESTPLATE =
            Registration.ITEMS.register("cellsia_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.CELLSIA, EquipmentSlotType.CHEST,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> CELLSIA_LEGGINGS =
            Registration.ITEMS.register("cellsia_leggings",
                    () -> new ArmorItem(ModArmorMaterial.CELLSIA, EquipmentSlotType.LEGS,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> CELLSIA_BOOTS =
            Registration.ITEMS.register("cellsia_boots",
                    () -> new ArmorItem(ModArmorMaterial.CELLSIA, EquipmentSlotType.FEET,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));



    public static final RegistryObject<Item> FEVNE_HELMET =
            Registration.ITEMS.register("fevne_helmet",
                    () -> new ArmorItem(ModArmorMaterial.FEVNE, EquipmentSlotType.HEAD,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FEVNE_CHESTPLATE =
            Registration.ITEMS.register("fevne_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.FEVNE, EquipmentSlotType.CHEST,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FEVNE_LEGGINGS =
            Registration.ITEMS.register("fevne_leggings",
                    () -> new ArmorItem(ModArmorMaterial.FEVNE, EquipmentSlotType.LEGS,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FEVNE_BOOTS =
            Registration.ITEMS.register("fevne_boots",
                    () -> new ArmorItem(ModArmorMaterial.FEVNE, EquipmentSlotType.FEET,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));



    public static final RegistryObject<Item> APOTHIS_HELMET =
            Registration.ITEMS.register("apothis_helmet",
                    () -> new ArmorItem(ModArmorMaterial.APOTHIS, EquipmentSlotType.HEAD,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> APOTHIS_CHESTPLATE =
            Registration.ITEMS.register("apothis_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.APOTHIS, EquipmentSlotType.CHEST,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> APOTHIS_LEGGINGS =
            Registration.ITEMS.register("apothis_leggings",
                    () -> new ArmorItem(ModArmorMaterial.APOTHIS, EquipmentSlotType.LEGS,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> APOTHIS_BOOTS =
            Registration.ITEMS.register("apothis_boots",
                    () -> new ArmorItem(ModArmorMaterial.APOTHIS, EquipmentSlotType.FEET,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));
    public static void register() {
    }

    public enum ModItemTier implements IItemTier {
        //tier 1
        FORBIDDEN_DIRT(9, 13500, 10f, 15f, 40,
                Ingredient.of(new ItemStack(ItemMod.FORBIDDEN_DIRT_BAR.get()))),
        SILVER(4, 1550, 3f, 4f, 20,
                    Ingredient.of(new ItemStack(ItemMod.SILVER_INGOT.get()))),
        CELLSIA(5, 1600, 3f, 5f, 20,
                Ingredient.of(new ItemStack(ItemMod.CELLSIA_INGOT.get()))),
        FEVNE(6, 1700, 3f, 6f, 15,
                Ingredient.of(new ItemStack(ItemMod.FEVNE_INGOT.get()))),
        MJELLIA(3, 1500, 5f, 3f, 22,
               Ingredient.of(new ItemStack(ItemMod.MJELLIA_INGOT.get()))),
        //tier 2
        APOTHIS(7, 1850, 10f, 12f, 20,
               Ingredient.of(new ItemStack(ItemMod.APOTHIS_INGOT.get()))),
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

    public enum ModArmorMaterial implements IArmorMaterial {
        //tier 1
        SILVER(700, new int[]{5, 7, 6, 4}, 15,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.SILVER_INGOT.get())), SpkCore.MOD_ID + ":silver", 2, 0.2f),
        MJELLIA(600, new int[]{4, 6, 5, 3}, 14,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.MJELLIA_INGOT.get())), SpkCore.MOD_ID + ":mjellia", 1, 0.1f),
        CELLSIA(800, new int[]{6, 8, 7, 5}, 16,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.CELLSIA_INGOT.get())), SpkCore.MOD_ID + ":cellsia", 3, 0.3f),
        FEVNE(900, new int[]{7, 9, 8, 6}, 18,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.FEVNE_INGOT.get())), SpkCore.MOD_ID + ":fevne", 3, 0.3f),
        FORBIDDEN_DIRT(3500, new int[]{24, 46, 32, 28}, 34,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.FORBIDDEN_DIRT_BAR.get())), SpkCore.MOD_ID + ":forbidden_dirt", 8, 1.5f),
        //tier 2
        APOTHIS(1200, new int[]{9, 14, 15, 8}, 15,
        SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.APOTHIS_INGOT.get())), SpkCore.MOD_ID + ":apothis", 2, 0.2f),
        NYTSI(1500, new int[]{13, 17, 16, 12}, 14,
        SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.NYTSI_INGOT.get())), SpkCore.MOD_ID + ":nytsi", 1, 0.1f),
        JORDDE(1800, new int[]{18, 24, 23, 17}, 16,
        SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.JORDDE_INGOT.get())), SpkCore.MOD_ID + ":jordde", 3, 0.3f),
        HELLIUM(2000, new int[]{7, 9, 8, 6}, 18,
        SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.HELLIUM_INGOT.get())), SpkCore.MOD_ID + ":hellium", 3, 0.3f);


        private final int durability;
        private final int[] damageReductionAmountarray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final Ingredient repairMaterial;
        private final String name;
        private final float toughness;
        private final float knockbackResistance;

        ModArmorMaterial(int durability, int[] damageReductionAmountarray, int enchantability,
                         SoundEvent soundEvent, Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
            this.durability = durability;
            this.damageReductionAmountarray = damageReductionAmountarray;
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.repairMaterial = repairMaterial;
            this.name = name;
            this.toughness = toughness;
            this.knockbackResistance = knockbackResistance;
        }

        @Override
        public int getDurabilityForSlot(EquipmentSlotType equipmentSlotType) {
            return durability;
        }

        @Override
        public int getDefenseForSlot(EquipmentSlotType equipmentSlotType) {
            return damageReductionAmountarray[equipmentSlotType.getIndex()];
        }

        @Override
        public int getEnchantmentValue() {
            return enchantability;
        }

        @Override
        public SoundEvent getEquipSound() {
            return soundEvent;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return repairMaterial;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public float getToughness() {
            return toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return knockbackResistance;
        }
    }
}
