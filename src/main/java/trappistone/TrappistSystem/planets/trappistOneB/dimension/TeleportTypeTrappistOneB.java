package trappistone.TrappistSystem.planets.trappistOneB.dimension;

import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.ITeleportType;
import micdoodle8.mods.galacticraft.core.entities.player.GCPlayerStats;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import micdoodle8.mods.galacticraft.planets.mars.entities.EntityLandingBalloons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

import java.util.Random;

public class TeleportTypeTrappistOneB implements ITeleportType
{
    @Override
    public boolean useParachute()
    {
    	return ConfigManagerCore.disableLander;
    }

    @Override
    public Vector3 getPlayerSpawnLocation(WorldServer world, EntityPlayerMP player)
    {
        if (player != null)
        {
            GCPlayerStats stats = GCPlayerStats.get(player);
            return new Vector3(stats.coordsTeleportedFromX, ConfigManagerCore.disableLander ? 250.0 : 900.0, stats.coordsTeleportedFromZ);
        }

        return null;
    }

    @Override
    public Vector3 getEntitySpawnLocation(WorldServer world, Entity entity)
    {
        return new Vector3(entity.posX, ConfigManagerCore.disableLander ? 250.0 : 900.0, entity.posZ);
    }

    @Override
    public Vector3 getParaChestSpawnLocation(WorldServer world, EntityPlayerMP player, Random rand)
    {
    	if (ConfigManagerCore.disableLander)
        {
            final double x = (rand.nextDouble() * 2 - 1.0D) * 5.0D;
            final double z = (rand.nextDouble() * 2 - 1.0D) * 5.0D;
            return new Vector3(x, 220.0D, z);
        }
        return null;
    }

    @Override
    public void onSpaceDimensionChanged(World newWorld, EntityPlayerMP player, boolean ridingAutoRocket)
    {
        if (!ridingAutoRocket && player != null && GCPlayerStats.get(player).teleportCooldown <= 0)
        {
            if (player.capabilities.isFlying)
            {
                player.capabilities.isFlying = false;
            }

            EntityLandingBalloons lander = new EntityLandingBalloons(player);

            if (!newWorld.isRemote)
            {
                newWorld.spawnEntityInWorld(lander);
            }

            GCPlayerStats.get(player).teleportCooldown = 10;
        }
    }

	@Override
	public void setupAdventureSpawn(EntityPlayerMP player) {
	
	}
}
