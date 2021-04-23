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

public class ForbiddenDirtArmor {

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

    public static void register() {}

    public enum ModArmorMaterial implements IArmorMaterial {
        FORBIDDEN_DIRT(3500, new int[]{24, 46, 32, 28}, 34,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.FORBIDDEN_DIRT_BAR.get())),
                SpkCore.MOD_ID + ":forbidden_dirt", 8, 1.5f);


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


