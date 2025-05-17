/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2025 HandLock_
 */
package com.handlock_.studdedarmor;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/** Definizione di tutti gli Item/Armor della mod. */
public final class ModItems {

    public static final DeferredRegister<Item> REGISTER =
            DeferredRegister.create(ForgeRegistries.ITEMS, StuddedArmor.MOD_ID);

    private static final Item.Properties PROPS = new Item.Properties();

    /* ---- Materiali grezzi --------------------------------------------- */
    public static final RegistryObject<Item> CHAINLINKS    = item("chainlinks");
    public static final RegistryObject<Item> LEATHER_STRIP = item("leather_strip");
    public static final RegistryObject<Item> STUD          = item("stud");

    /* ---- Template per la forgia --------------------------------------- */
    public static final RegistryObject<Item> STUDDED_TEMPLATE =
            REGISTER.register("studded_upgrade_smithing_template", () -> new SmithingTemplateItem(
                    Component.translatable("item.studdedarmor.smithing_template.studded_upgrade.applies_to")
                            .withStyle(ChatFormatting.BLUE),
                    Component.translatable("item.studdedarmor.smithing_template.studded_upgrade.ingredients")
                            .withStyle(ChatFormatting.BLUE),
                    Component.translatable("upgrade.studdedarmor.studded_upgrade").withStyle(ChatFormatting.GRAY),
                    Component.translatable("item.minecraft.smithing_template.upgrade_base_slot"),
                    Component.translatable("item.minecraft.smithing_template.upgrade_additions_slot"),
                    List.of(
                            new ResourceLocation("item/empty_armor_slot_helmet"),
                            new ResourceLocation("item/empty_armor_slot_chestplate"),
                            new ResourceLocation("item/empty_armor_slot_leggings"),
                            new ResourceLocation("item/empty_armor_slot_boots")
                    ),
                    List.of(new ResourceLocation("item/empty_slot_ingot"))
            ));

    /* ---- Armatura borchiata ------------------------------------------ */
    private static final StuddedArmorMaterial STUDDED_MAT = new StuddedArmorMaterial();

    public static final RegistryObject<Item> STUDDED_HELMET  = armor("studded_helmet",     ArmorItem.Type.HELMET);
    public static final RegistryObject<Item> STUDDED_CHEST   = armor("studded_chestplate", ArmorItem.Type.CHESTPLATE);
    public static final RegistryObject<Item> STUDDED_LEGS    = armor("studded_leggings",   ArmorItem.Type.LEGGINGS);
    public static final RegistryObject<Item> STUDDED_BOOTS   = armor("studded_boots",      ArmorItem.Type.BOOTS);

    /* ==== helpers ====================================================== */
    private static RegistryObject<Item> item(String name) {
        return REGISTER.register(name, () -> new Item(PROPS));
    }

    private static RegistryObject<Item> armor(String name, ArmorItem.Type slot) {
        return REGISTER.register(name, () -> new ArmorItem(STUDDED_MAT, slot, PROPS));
    }

    private ModItems() {}
}
