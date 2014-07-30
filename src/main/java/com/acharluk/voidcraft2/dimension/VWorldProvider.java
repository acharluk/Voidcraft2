package com.acharluk.voidcraft2.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

/**
 * Created by ACharLuk on 24/07/2014.
 */
public class VWorldProvider extends WorldProvider {

    public void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.mushroomIsland, 0.8F);
        this.dimensionId = VWorld.dimID;
    }

    public IChunkProvider createChunkGenerator(){
        return new VChunkProvider(worldObj, worldObj.getSeed());
    }

    @Override
    public String getDimensionName() {
        return "The Void";
    }
}
