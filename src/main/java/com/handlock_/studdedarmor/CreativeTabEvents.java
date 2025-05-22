/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2025 HandLock_
 */

package com.handlock_.studdedarmor;

import java.util.List;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;


@Mod.EventBusSubscriber(modid = StuddedArmor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class CreativeTabEvents {

    private static ItemStack stack(Object o) {
        return (o instanceof ItemStack s) ? s : new ItemStack((Item) o);
    }

    @SubscribeEvent
    public static void onBuildTabs(BuildCreativeModeTabContentsEvent evt) {

        /* ---------- COMBAT ------------------------------------------------ */
        if (evt.getTabKey() == CreativeModeTabs.COMBAT) {
            ItemStack anchor = stack(Items.GOLDEN_BOOTS);

            for (RegistryObject<Item> ro : List.of(
                    ModItems.STUDDED_HELMET,
                    ModItems.STUDDED_CHEST,
                    ModItems.STUDDED_LEGS,
                    ModItems.STUDDED_BOOTS)) {

                ItemStack piece = new ItemStack(ro.get());
                evt.getEntries().putAfter(anchor, piece, PARENT_AND_SEARCH_TABS);
                anchor = piece;
            }
        }

        /* ---------- INGREDIENTS ------------------------------------------- */
        if (evt.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            evt.getEntries().putAfter(stack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                    stack(ModItems.STUDDED_TEMPLATE.get()),
                    PARENT_AND_SEARCH_TABS);

            evt.getEntries().putAfter(stack(Items.LEATHER),
                    stack(ModItems.LEATHER_STRIP.get()),
                    PARENT_AND_SEARCH_TABS);

            evt.getEntries().putAfter(stack(ModItems.LEATHER_STRIP.get()),
                    stack(ModItems.CHAINLINKS.get()),
                    PARENT_AND_SEARCH_TABS);

            evt.getEntries().putAfter(stack(ModItems.CHAINLINKS.get()),
                    stack(ModItems.STUD.get()),
                    PARENT_AND_SEARCH_TABS);
        }
    }

    private CreativeTabEvents() {}
}
