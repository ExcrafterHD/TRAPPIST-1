package trappistone.TrappistSystem;

import trappistone.BodiesInfo;
import trappistone.Core;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Moon;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.Satellite;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IAtmosphericGas;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.world.gen.OverworldGenerator;
import micdoodle8.mods.galacticraft.planets.asteroids.AsteroidsModule;
import micdoodle8.mods.galacticraft.planets.mars.MarsModule;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldProvider;
import cpw.mods.fml.common.registry.GameRegistry;


public class TrappistOnePlanets {

	public static SolarSystem TrappistOneSystem;
	public static Star TrappistOneA;
	
	public static Planet TrappistOneB;
	public static Planet TrappistOneC;
	public static Planet TrappistOneD;
	public static Planet TrappistOneE;
	public static Planet TrappistOneF;
	public static Planet TrappistOneG;
	public static Planet TrappistOneH;
	
	public static void init()
	{
		/*
		 * Sun Distance: 0.0F
		 * Mercury Distance: 0.5F
		 * Venus Distance: 0.75F
		 * Overworld Distance: 1.0F
		 		*Moon Distance: 13.0F	 
		 * Mars Distance: 1.25F
		 		*Phobos Distance: 8.0F
		 		*Deimos Distance: 16.0F 
		 * Ceres Distance: 1.5F
		 * Asteroids Distance: 1.75F
		 * Jupiter Distance: 2.0F
		 		*Io Distance: 10.0F
		 		*Europa Distance: 15.0F
		 		*Ganymede Distance: 20.0F
		 		*Callisto Distance: 30.0F
		 * Saturn Distance: 2.25F
		 		*Enceladus Distance: 15.0F
		 		*Titan Distance: 35.0F 
		 * Uranus Distance: 2.5F
		 * Neptune Distance: 2.75F
		 * Pluto Distance: 3.0F
		 * Kuiper Belt Distance: 3.25F
		 * Haumea Distance: 3.5F
		 * Makemake Distance: 3.75F
		 * Eris Distance: 4.0F
		*/
		
		  // TODO Trappist One System ----------------------------
		TrappistOneSystem = new SolarSystem("TrappistOneSystem", "milkyWay").setMapPosition(new Vector3(1.0F, -2.0F, 0.0F));
		TrappistOneA = (Star) new Star("TrappistOneA").setParentSolarSystem(TrappistOneSystem).setTierRequired(-1);
		TrappistOneA.setBodyIcon(new ResourceLocation(Core.ASSET_PREFIX, "textures/gui/celestialbodies/trappistone/TrappistOneA.png"));
		TrappistOneSystem.setMainStar(TrappistOneA);
      
        
        // TODO TrappistOneB -------------------------------
		TrappistOneB = (Planet) new Planet("TrappistOneB").setParentSolarSystem(TrappistOneSystem);
		TrappistOneB.setRingColorRGB(0.0F, 0.4F, 0.9F);
		TrappistOneB.setPhaseShift(1.45F);
		TrappistOneB.setTierRequired(1);
		TrappistOneB.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.25F, 0.25F));
		TrappistOneB.setRelativeOrbitTime(0.24096385542168674698795180722892F);
		TrappistOneB.setBodyIcon(new ResourceLocation(Core.ASSET_PREFIX, "textures/gui/celestialbodies/trappistone/TrappistOneB.png"));
		//TrappistOneB.setDimensionInfo(GSConfigDimensions.dimensionIDMercury, WorldProviderMercury.class);
    	// --------------------------------------------
    	registrycelestial();
    	registryteleport();
    	
    	//body, classP, gravity, pressure, temp, wind, daytime, breath, solar

	}
	
	private static void registrycelestial()
	{
		GalaxyRegistry.registerSolarSystem(TrappistOneSystem);
		
		BodiesInfo.registerBody(TrappistOneSystem.getMainStar(), BodiesInfo.red + " " + BodiesInfo.dwarf, 28.088F, 0, 999, 0, 0, false, false);
		
	}
	
	private static void registryteleport()
	{
		//GalacticraftRegistry.registerTeleportType(WorldProviderMercury.class, new WorldProviderMercury());
		
	}
	

}
