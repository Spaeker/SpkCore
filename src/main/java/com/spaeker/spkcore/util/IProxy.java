package com.spaeker.spkcore.util;

import net.minecraft.world.World;

public interface IProxy {
    void init();

    World getClientWorld();
}
