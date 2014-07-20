package com.acharluk.voidcraft2.fluid;

import com.acharluk.voidcraft2.lib.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by ACharLuk on 15/07/2014.
 */
public class VFluid {

    public static Fluid voidFluid;
    public static Block voidFluidBlock;

    public static void init() {
        voidFluid = new Fluid("VoidFluid").setUnlocalizedName(Names.Fluids.voidFluid);
        voidFluidBlock = new VoidFluidBlock(voidFluid, Material.lava);

        registerFluids();
    }

    public static void registerFluids() {
        GameRegistry.registerBlock(voidFluidBlock, "void_fluid_block");
        FluidRegistry.registerFluid(voidFluid);
    }

}
