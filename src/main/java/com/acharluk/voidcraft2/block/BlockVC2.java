package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by ACharLuk on 17/06/2014.
 */
public class BlockVC2 extends Block {

    public BlockVC2() {
        super(Material.rock);
    }
    public BlockVC2(Material material) {
        super(material);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("%s%s", Strings.RESOURCESPREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Strings.RESOURCESPREFIX + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public static void register(BlockVC2 block)
    {
        GameRegistry.registerBlock(block, block.getUnwrappedUnlocalizedName(block.getUnlocalizedName()));
    }

}
