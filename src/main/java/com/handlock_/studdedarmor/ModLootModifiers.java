/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 */
package com.handlock_.studdedarmor;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.handlock_.studdedarmor.loot.StuddedTemplateLootModifier;

/** Registrazione di tutti i Global Loot Modifier del mod. */
public final class ModLootModifiers {

    /** Registry dei codec (Forge 47 usa questa chiave). */
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, StuddedArmor.MOD_ID);

    /** Codec del loot-modifier che aggiunge lo smithing template. */
    public static final RegistryObject<Codec<StuddedTemplateLootModifier>> STUDDED_TEMPLATE =
            LOOT_MODIFIERS.register("studded_template", () -> StuddedTemplateLootModifier.CODEC);

    private ModLootModifiers() { /* no-instantiation */ }

    public static void register(IEventBus bus) {
        LOOT_MODIFIERS.register(bus);
    }
}
