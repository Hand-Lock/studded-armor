/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2025 HandLock_
 */
package com.handlock_.studdedarmor;

import java.util.Map;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;


public final class StuddedArmorMaterial implements ArmorMaterial {

    private static final Map<ArmorItem.Type, Integer> DURABILITY = Map.of(
            ArmorItem.Type.BOOTS,      312,
            ArmorItem.Type.LEGGINGS,   360,
            ArmorItem.Type.CHESTPLATE, 384,
            ArmorItem.Type.HELMET,     264
    );

    private static final Map<ArmorItem.Type, Integer> DEFENSE = Map.of(
            ArmorItem.Type.BOOTS,      2,
            ArmorItem.Type.LEGGINGS,   6,
            ArmorItem.Type.CHESTPLATE, 7,
            ArmorItem.Type.HELMET,     2
    );

    @Override public int   getDurabilityForType(@NotNull ArmorItem.Type s){ return Objects.requireNonNull(DURABILITY.get(s)); }
    @Override public int   getDefenseForType   (@NotNull ArmorItem.Type s){ return Objects.requireNonNull(DEFENSE   .get(s)); }
    @Override public int   getEnchantmentValue()               { return 12; }
    @Override public float getToughness()                       { return 1.0F; }
    @Override public float getKnockbackResistance()             { return 0.0F; }
    @Override @NotNull public SoundEvent  getEquipSound()       { return SoundEvents.ARMOR_EQUIP_LEATHER; }
    @Override @NotNull public Ingredient  getRepairIngredient() { return Ingredient.of(ModItems.STUD.get()); }
    @Override @NotNull public String      getName()             { return StuddedArmor.MOD_ID + ":studded"; }
}
