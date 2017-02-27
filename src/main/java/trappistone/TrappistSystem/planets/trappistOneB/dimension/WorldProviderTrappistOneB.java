package trappistone.TrappistSystem.planets.trappistOneB.dimension;

 


import java.util.Random;

import trappistone.TrappistSystem.TrappistOnePlanets;
import trappistone.TrappistSystem.planets.trappistOneB.dimension.sky.SkyProviderTrappistOneB;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IExitHeight;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import micdoodle8.mods.galacticraft.api.world.ITeleportType;
import micdoodle8.mods.galacticraft.core.client.CloudRenderer;
import micdoodle8.mods.galacticraft.core.entities.player.GCPlayerStats;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import micdoodle8.mods.galacticraft.planets.mars.entities.EntityLandingBalloons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

 

public class WorldProviderTrappistOneB extends WorldProviderSpace implements IExitHeight, ISolarLevel{

		
	@Override
    public float getGravity() {
        return 0.03F;
    }
	
	@Override
	public float getThermalLevelModifier() {
	    return -1F;
	} 

	@Override
	public float getWindLevel() {
	    return 0.0F;
	}
	
	@Override
    public long getDayLength() {
        return 24000L;
    }

    @Override
    public boolean hasBreathableAtmosphere() {
        return false;
    }
    
    @Override
    public boolean canSpaceshipTierPass(int tier) {

        return tier >= this.getCelestialBody().getTierRequirement();

    }

    @Override
    public double getHorizon()
    {
        return 44.0D;
    }

    @Override

    public float getFallDamageModifier() {

        return 0.16F;

    }

 

    @Override

    public double getFuelUsageMultiplier() {

        return 0.8;

    }

    @Override
    public double getMeteorFrequency() {

        return 3.0;

    }

 

    @Override

    public float getSoundVolReductionAmount() {

        return Float.MAX_VALUE;

    }

    @Override

    public boolean canRainOrSnow() {

        return false;

    }

 

    @Override

    public CelestialBody getCelestialBody() {

        return TrappistOnePlanets.TrappistOneB;

    }

 

     //Created later

    @Override

    public Class<? extends IChunkProvider> getChunkProviderClass() {

        return ChunkProviderTrappistOneB.class;

    }
    
    @Override
    public Vector3 getFogColor() {

    	return new Vector3(0, 0, 0);

    }

    @Override
    public Vector3 getSkyColor() {

    	return new Vector3(0, 0, 0);

    }

     
     @Override
     public boolean isSkyColored()
     {
         return true;
     }
 

     @Override

     public Class<? extends WorldChunkManager> getWorldChunkManagerClass() {

        return WorldChunkManagerTrappistOneB.class;

     }

 

    @Override

    public boolean hasSunset() {

        return false;

    }

 

    //Can players respawn here?

    @Override

    public boolean shouldForceRespawn() {

        return !ConfigManagerCore.forceOverworldRespawn;

    }

 

    @Override

    public double getSolarEnergyMultiplier() {

        return 0.2;

    }

 

    @Override

    public double getYCoordinateToTeleport() {

        return 800;

    }

  
    @Override
    @SideOnly(Side.CLIENT)
    public float getStarBrightness(float par1)
    {
        final float var2 = this.worldObj.getCelestialAngle(par1);
        float var3 = 1.0F - (MathHelper.cos(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.25F);

        if (var3 < 0.0F)
        {
            var3 = 0.0F;
        }

        if (var3 > 1.0F)
        {
            var3 = 1.0F;
        }

        return var3 * var3 * 0.5F + 0.3F;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public float getSunBrightness(float par1) {
       float f1 = this.worldObj.getCelestialAngle(1.0F);
       float f2 = 1.25F - (MathHelper.cos(f1 * 3.1415927F * 2.0F) * 2.0F + 0.2F);
       if(f2 < 0.0F) {
          f2 = 0.0F;
       }

       if(f2 > 1.0F) {
          f2 = 1.0F;
       }

       f2 = 1.2F - f2;
       return f2 * 1.0F;
    }
    
    @Override
    public IRenderHandler getCloudRenderer(){

    	if(super.getCloudRenderer() == null)
    	{
    		this.setCloudRenderer(new CloudRenderer());
    	}
        return super.getCloudRenderer();
        
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public IRenderHandler getSkyRenderer()
    {
    	if (super.getSkyRenderer() == null)
		{
			this.setSkyRenderer(new SkyProviderTrappistOneB());
		}

		return super.getSkyRenderer();
    }
}