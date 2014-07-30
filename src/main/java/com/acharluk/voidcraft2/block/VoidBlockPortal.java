package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.VC2;
import com.acharluk.voidcraft2.dimension.VTeleporter;
import com.acharluk.voidcraft2.dimension.VWorld;
import com.acharluk.voidcraft2.lib.Names;
import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by ACharLuk on 24/07/2014.
 */
public class VoidBlockPortal extends Block {
    protected VoidBlockPortal(Material material) {
        super(material);
        this.setBlockName(Names.Blocks.voidBlockPortal);
        this.setBlockTextureName(Names.Blocks.voidBlockPortal);
        this.setCreativeTab(VC2.getCreativeTabBlock());

    }

    public boolean isOpaqueCube() {
        return false;
    }

    double xa = 0, ya = 70, za = 0;
    double xx = 0, yy = 70, zz = 0;

    int overworldID = 0;
    int voidID = VWorld.dimID;

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        if (entityPlayer.dimension == overworldID) {
            xa = entityPlayer.posX;
            ya = entityPlayer.posY;
            za = entityPlayer.posZ;
            entityPlayer.travelToDimension(voidID);
        } else {
            xx = entityPlayer.posX;
            yy = entityPlayer.posY;
            zz = entityPlayer.posZ;
            VTeleporter.teleport(entityPlayer, xa, ya, za, overworldID);
        }

        return true;
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Strings.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(Strings.TEXTURELOC + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

}
