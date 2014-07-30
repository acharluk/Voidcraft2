package com.acharluk.voidcraft2.dimension;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

/**
 * Created by ACharLuk on 24/07/2014.
 */
public class VTeleporter extends Teleporter {

    private double tX;
    private double tY;
    private double tZ;

    public VTeleporter(WorldServer worldServer, double tX, double tY, double tZ) {
        super(worldServer);

        this.tX = tX;
        this.tY = tY;
        this.tZ = tZ;
    }

    @Override
    public void placeInPortal(Entity entity, double x, double y, double z, float r)
    {
        entity.setLocationAndAngles(this.tX, this.tY, this.tZ, entity.rotationYaw, entity.rotationPitch);
    }

    @Override
    public void removeStalePortalLocations(long par1)
    {
    }

    @Override
    public boolean placeInExistingPortal(Entity par1Entity, double par2, double par4, double par6, float par8)
    {
        return false;
    }

    public static void teleport(EntityPlayer player, double x, double y, double z, int dim)
    {
        if (player instanceof EntityPlayerMP)
        {
            EntityPlayerMP thePlayer = (EntityPlayerMP) player;

            if (player.dimension == dim)
            {
                player.setLocationAndAngles(x, y, z, player.rotationYaw, player.rotationPitch);
            } else if (thePlayer.dimension == 1)
            {      //If teleporting from the end this has to be run twice or the world wont load properly
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, dim, new VTeleporter(thePlayer.mcServer.worldServerForDimension(dim), x, y, z));
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, dim, new VTeleporter(thePlayer.mcServer.worldServerForDimension(dim), x, y, z));
            } else
            {
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, dim, new VTeleporter(thePlayer.mcServer.worldServerForDimension(dim), x, y, z));
            }
        }
    }

}
