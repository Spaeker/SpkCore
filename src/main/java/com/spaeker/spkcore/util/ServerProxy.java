package com.spaeker.spkcore.util;

import net.minecraft.world.World;

public class ServerProxy implements IProxy{
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Cannot be ran on Server");
    }
}
