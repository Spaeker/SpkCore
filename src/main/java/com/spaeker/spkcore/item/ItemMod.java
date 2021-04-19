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

    public static final RegistryObject<Item>  FORBIDDEN_DIRT_BAR =
            Registration.ITEMS.register("forbidden_dirt_bar",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item>  FORBIDDEN_DIRT_DUST =
            Registration.ITEMS.register("forbidden_dirt_dust",
                    () -> new Item(new Item.Properties().tab(SpkCore.SPK_TAB)));
    public static final RegistryObject<Item>  BAD_APPLE =
            Registration.ITEMS.register("bad_apple",
                    () -> new BadApple());


    //tools
    public static final RegistryObject<Item> FORBIDDEN_DIRT_SHOVEL =
            Registration.ITEMS.register("forbidden_dirt_shovel",
                    () -> new ShovelItem(ModItemTier.FORBIDDEN_DIRT, 0f, 0f,
                            new Item.Properties()
                                .durability(50)
                                .addToolType(ToolType.SHOVEL, 2)
                                .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_SWORD =
            Registration.ITEMS.register("forbidden_dirt_sword",
                    () -> new SwordItem(ModItemTier.FORBIDDEN_DIRT, 9, 0f,
                            new Item.Properties()
                                    .durability(50)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_AXE =
            Registration.ITEMS.register("forbidden_dirt_axe",
                    () -> new AxeItem((ModItemTier.FORBIDDEN_DIRT), 0f, 0f,
                            new Item.Properties()
                                    .durability(50)
                                    .addToolType(ToolType.AXE, 2)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_PICKAXE =
            Registration.ITEMS.register("forbidden_dirt_pickaxe",
                    () -> new PickaxeItem(ModItemTier.FORBIDDEN_DIRT, 0, 0f,
                            new Item.Properties()
                                    .durability(50)
                                    .addToolType(ToolType.PICKAXE, 2)
                                    .tab(SpkCore.SPK_TAB)));

    public static final RegistryObject<Item> FORBIDDEN_DIRT_HOE =
            Registration.ITEMS.register("forbidden_dirt_hoe",
                    () -> new HoeItem(ModItemTier.FORBIDDEN_DIRT, 0, 0f,
                            new Item.Properties()
                                    .durability(50)
                                    .addToolType(ToolType.HOE, 2)
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



    public static void register() {}
    public enum ModItemTier implements IItemTier {
        FORBIDDEN_DIRT(3, 1500, 3f, 0f, 40,
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
    public enum ModArmorMaterial implements IArmorMaterial{
        FORBIDDEN_DIRT(500, new int[]{7, 13, 11, 9}, 10,
                SoundEvents.ARMOR_EQUIP_IRON, Ingredient.of(new ItemStack(ItemMod.FORBIDDEN_DIRT_BAR.get())), SpkCore.MOD_ID + ":forbidden_dirt", 3, 0.3f);

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
