package com.acharluk.voidcraft2.item.battle;

import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

/**
 * Created by ACharLuk on 23/06/2014.
 */
public class VoidHoe extends ItemHoe {

    public VoidHoe(ToolMaterial toolMaterial) {
        super(toolMaterial);
    }

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
            UseHoeEvent event = new UseHoeEvent(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return false;
            }

            if (event.getResult() == Event.Result.ALLOW)
            {
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return true;
            }

            Block block = par3World.getBlock(par4, par5, par6);

            if (par7 != 0 && par3World.getBlock(par4, par5 + 1, par6).isAir(par3World, par4, par5 + 1, par6) && (block == Blocks.grass || block == Blocks.dirt))
            {
                Block block1 = Blocks.farmland;
                par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), block1.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);

                if (par3World.isRemote)
                {
                    return true;
                }
                else
                {
                    for(int x = -5; x < 5; x++) {
                        for(int z = -5; z < 5; z++) {
                            int nx = par4 + x;
                            int nz = par6 + z;
                            Block targetBlock = par3World.getBlock(nx, par5, nz);
                            if(targetBlock == Blocks.dirt || targetBlock == Blocks.grass) {
                                if(par3World.getBlock(nx, par5 + 1, nz).isAir(par3World, nx, par5 + 1, nz)) {
                                    par3World.setBlock(nx, par5, nz, block1);
                                } else {
                                    //System.out.println("Block at " + nx + "," + par5 + 1 + "," + nz + " is not air!");
                                }
                            } else {
                                //System.out.println("Block " + block + "at " + nx + "," + par5 + "," + nz + " is not dirt!");
                            }
                        }
                    }
                    par1ItemStack.damageItem(1, par2EntityPlayer);
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Strings.RESOURCESPREFIX + (super.getUnlocalizedName().substring(5)));
    }
}
