/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2025 HandLock_
 */
package com.handlock_.studdedarmor;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StuddedArmor.MOD_ID)
public final class StuddedArmor {

    public static final String MOD_ID = "studdedarmor";

    public StuddedArmor() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus(); // warning OK
        ModItems.REGISTER.register(modBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
