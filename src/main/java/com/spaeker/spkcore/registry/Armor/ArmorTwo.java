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

public class ArmorTwo {
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

    public static final RegistryObject<Item> NYTSI_HELMET =
            Registration.ITEMS.register("nytsi_helmet",
                    () -> new ArmorItem(ModArmorMaterial.NYTSI, EquipmentSlotType.HEAD,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> NYTSI_CHESTPLATE =
            Registration.ITEMS.register("nytsi_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.NYTSI, EquipmentSlotType.CHEST,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> NYTSI_LEGGINGS =
            Registration.ITEMS.register("nytsi_leggings",
                    () -> new ArmorItem(ModArmorMaterial.NYTSI, EquipmentSlotType.LEGS,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> NYTSI_BOOTS =
            Registration.ITEMS.register("nytsi_boots",
                    () -> new ArmorItem(ModArmorMaterial.NYTSI, EquipmentSlotType.FEET,
                            new Item.Properties()
                                    .tab(SpkCore.SPK_TAB)));

    public static void register() {}

    public enum ModArmorMaterial implements IArmorMaterial {
        APOTHIS(1200, new int[]{9, 14, 15, 8}, 15,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.APOTHIS_INGOT.get())),
                SpkCore.MOD_ID + ":apothis", 3, 0.3f),
        NYTSI(1400, new int[]{11, 16, 17, 10}, 26,
        SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.NYTSI_INGOT.get())),
        SpkCore.MOD_ID + ":nytsi", 3, 0.3f);

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
