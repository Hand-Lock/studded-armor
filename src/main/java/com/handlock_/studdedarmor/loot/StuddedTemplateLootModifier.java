/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2025 HandLock_
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

public final class StuddedTemplateLootModifier extends LootModifier {

    public static final Codec<StuddedTemplateLootModifier> CODEC =
            RecordCodecBuilder.create(inst ->
                    LootModifier.codecStart(inst)
                            .apply(inst, StuddedTemplateLootModifier::new));

    public StuddedTemplateLootModifier(LootItemCondition[] conditions) {
        super(conditions);
    }

    /* ------------------------------------------------------------ */

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(@NotNull ObjectArrayList<ItemStack> generated,
                                                 @NotNull LootContext ctx) {
        generated.clear();
        generated.add(new ItemStack(ModItems.STUDDED_TEMPLATE.get()));
        return generated;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}
