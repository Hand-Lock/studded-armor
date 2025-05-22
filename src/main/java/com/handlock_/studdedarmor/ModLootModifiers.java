/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2025 HandLock_
 */

package com.handlock_.studdedarmor;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.handlock_.studdedarmor.loot.StuddedTemplateLootModifier;


public final class ModLootModifiers {

    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, StuddedArmor.MOD_ID);

    public static final RegistryObject<Codec<StuddedTemplateLootModifier>> STUDDED_TEMPLATE =
            LOOT_MODIFIERS.register("studded_template", () -> StuddedTemplateLootModifier.CODEC);

    private ModLootModifiers() { /* no-instantiation */ }

    public static void register(IEventBus bus) {
        LOOT_MODIFIERS.register(bus);
    }
}
