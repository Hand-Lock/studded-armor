/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 */
package com.handlock_.studdedarmor.loot;

import com.handlock_.studdedarmor.ModItems;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import org.jetbrains.annotations.NotNull;

/**
 * Inserisce lo smithing-template <em>studded_upgrade_smithing_template</em>
 * nei drop gestiti da questo Global Loot Modifier.
 * La probabilità viene controllata esclusivamente dalle condizioni JSON.
 */
public final class StuddedTemplateLootModifier extends LootModifier {

    /** Codec ⇄ JSON richiesto da Forge. */
    public static final Codec<StuddedTemplateLootModifier> CODEC =
            RecordCodecBuilder.create(inst ->
                    LootModifier.codecStart(inst)           // ← solo l’array conditions[]
                            .apply(inst, StuddedTemplateLootModifier::new));

    /** Costruttore usato dal codec. */
    public StuddedTemplateLootModifier(LootItemCondition[] conditions) {
        super(conditions);
    }

    /* ------------------------------------------------------------ */

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(@NotNull ObjectArrayList<ItemStack> generated,
                                                 @NotNull LootContext ctx) {
        // aggiunge sempre il template: saranno le condizioni JSON a decidere quando
        generated.clear();
        generated.add(new ItemStack(ModItems.STUDDED_TEMPLATE.get()));
        return generated;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}
