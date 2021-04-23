package com.spaeker.spkcore.registry.Armor;

import com.spaeker.SpkCore;
import com.spaeker.spkcore.registry.items.ItemMod;
import com.spaeker.spkcore.util.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;

public class ArmorOne {
    //cellsia
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

    //fevne
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

    //Iryte
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

    //Mjellia
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

    public static void register() {}

    public enum ModArmorMaterial implements IArmorMaterial {
        CELLSIA(800, new int[]{6, 8, 7, 5}, 16,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.CELLSIA_INGOT.get())),
                SpkCore.MOD_ID + ":cellsia", 3, 0.3f),
        FEVNE(900, new int[]{7, 9, 8, 6}, 18,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.FEVNE_INGOT.get())),
                SpkCore.MOD_ID + ":fevne", 3, 0.3f),
        SILVER(700, new int[]{5, 7, 6, 4}, 15,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.SILVER_INGOT.get())),
              SpkCore.MOD_ID + ":silver", 2, 0.2f),
        MJELLIA(600, new int[]{4, 6, 5, 3}, 14,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.MJELLIA_INGOT.get())),
                SpkCore.MOD_ID + ":mjellia", 1, 0.1f);



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
