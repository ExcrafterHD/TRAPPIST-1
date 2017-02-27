package trappistone.TrappistSystem;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import net.minecraft.util.ResourceLocation;
import trappistone.Core;
import trappistone.TrappistSystem.planets.trappistOneB.dimension.TeleportTypeTrappistOneB;
import trappistone.TrappistSystem.planets.trappistOneB.dimension.WorldProviderTrappistOneB;


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
				TrappistOneSystem = new SolarSystem("TrappistOneSystem", "milkyWay").setMapPosition(new Vector3(0.0F, 1.0F, 0.0F));
				TrappistOneA = (Star) new Star("TrappistOneA").setParentSolarSystem(TrappistOneSystem).setTierRequired(-1);
				TrappistOneA.setBodyIcon(new ResourceLocation(Core.ASSET_PREFIX, "textures/gui/celestialbodies/trappistone/TrappistOneA.png"));
				TrappistOneSystem.setMainStar(TrappistOneA);
		// --------------------------------------------        
        // TODO TrappistOneB -------------------------------
				TrappistOneB = (Planet) new Planet("TrappistOneB").setParentSolarSystem(TrappistOneSystem);
				TrappistOneB.setRingColorRGB(0.0F, 0.4F, 0.9F);
				TrappistOneB.setPhaseShift((float) Math.PI);
				TrappistOneB.setTierRequired(1);
				TrappistOneB.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.25F, 0.25F));
				TrappistOneB.setRelativeOrbitTime(0.24096385542168674698795180722892F);
				TrappistOneB.setBodyIcon(new ResourceLocation(Core.ASSET_PREFIX, "textures/gui/celestialbodies/trappistone/TrappistOneB.png"));
				TrappistOneB.setDimensionInfo(-35, WorldProviderTrappistOneB.class);
    	// --------------------------------------------
		// TODO TrappistOneC -------------------------------
				TrappistOneC = (Planet) new Planet("TrappistOneC").setParentSolarSystem(TrappistOneSystem);
				TrappistOneC.setRingColorRGB(0.0F, 0.4F, 0.9F);
				TrappistOneC.setPhaseShift((float) Math.PI / 2);
				TrappistOneC.setTierRequired(1);
				TrappistOneC.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.3F, 0.3F));
				TrappistOneC.setRelativeOrbitTime(1.24096385542168674698795180722892F);
				TrappistOneC.setBodyIcon(new ResourceLocation(Core.ASSET_PREFIX, "textures/gui/celestialbodies/trappistone/TrappistOneC.png"));
				//TrappistOneB.setDimensionInfo(GSConfigDimensions.dimensionIDMercury, WorldProviderMercury.class);
		// --------------------------------------------
		// TODO TrappistOneD -------------------------------
				TrappistOneD = (Planet) new Planet("TrappistOneD").setParentSolarSystem(TrappistOneSystem);
				TrappistOneD.setRingColorRGB(0.0F, 0.4F, 0.9F);
				TrappistOneD.setPhaseShift((float) Math.PI / 4);
				TrappistOneD.setTierRequired(1);
				TrappistOneD.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.35F, 0.35F));
				TrappistOneD.setRelativeOrbitTime(2.24096385542168674698795180722892F);
				TrappistOneD.setBodyIcon(new ResourceLocation(Core.ASSET_PREFIX, "textures/gui/celestialbodies/trappistone/TrappistOneD.png"));
				//TrappistOneB.setDimensionInfo(GSConfigDimensions.dimensionIDMercury, WorldProviderMercury.class);
		// --------------------------------------------	
		// TODO TrappistOneE -------------------------------
				TrappistOneE = (Planet) new Planet("TrappistOneE").setParentSolarSystem(TrappistOneSystem);
				TrappistOneE.setRingColorRGB(0.0F, 0.4F, 0.9F);
				TrappistOneE.setPhaseShift((float) Math.PI / 6);
				TrappistOneE.setTierRequired(1);
				TrappistOneE.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.4F, 0.4F));
				TrappistOneE.setRelativeOrbitTime(3.24096385542168674698795180722892F);
				TrappistOneE.setBodyIcon(new ResourceLocation(Core.ASSET_PREFIX, "textures/gui/celestialbodies/trappistone/TrappistOneE.png"));
				//TrappistOneB.setDimensionInfo(GSConfigDimensions.dimensionIDMercury, WorldProviderMercury.class);
		// --------------------------------------------
		// TODO TrappistOneF -------------------------------
				TrappistOneF = (Planet) new Planet("TrappistOneF").setParentSolarSystem(TrappistOneSystem);
				TrappistOneF.setRingColorRGB(0.0F, 0.4F, 0.9F);
				TrappistOneF.setPhaseShift((float) Math.PI * 2);
				TrappistOneF.setTierRequired(1);
				TrappistOneF.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.45F, 0.45F));
				TrappistOneF.setRelativeOrbitTime(4.24096385542168674698795180722892F);
				TrappistOneF.setBodyIcon(new ResourceLocation(Core.ASSET_PREFIX, "textures/gui/celestialbodies/trappistone/TrappistOneF.png"));
				//TrappistOneB.setDimensionInfo(GSConfigDimensions.dimensionIDMercury, WorldProviderMercury.class);
		// --------------------------------------------
		// TODO TrappistOneG -------------------------------
				TrappistOneG = (Planet) new Planet("TrappistOneG").setParentSolarSystem(TrappistOneSystem);
				TrappistOneG.setRingColorRGB(0.0F, 0.4F, 0.9F);
				TrappistOneG.setPhaseShift((float) Math.PI * 2 / 4);
				TrappistOneG.setTierRequired(1);
				TrappistOneG.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.5F, 0.5F));
				TrappistOneG.setRelativeOrbitTime(5.24096385542168674698795180722892F);
				TrappistOneG.setBodyIcon(new ResourceLocation(Core.ASSET_PREFIX, "textures/gui/celestialbodies/trappistone/TrappistOneG.png"));
				//TrappistOneB.setDimensionInfo(GSConfigDimensions.dimensionIDMercury, WorldProviderMercury.class);
		// --------------------------------------------
		// TODO TrappistOneH -------------------------------
				TrappistOneH = (Planet) new Planet("TrappistOneH").setParentSolarSystem(TrappistOneSystem);
				TrappistOneH.setRingColorRGB(0.0F, 0.4F, 0.9F);
				TrappistOneH.setPhaseShift((float) Math.PI * 2 / 6);
				TrappistOneH.setTierRequired(1);
				TrappistOneH.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.55F, 0.55F));
				TrappistOneH.setRelativeOrbitTime(6.24096385542168674698795180722892F);
				TrappistOneH.setBodyIcon(new ResourceLocation(Core.ASSET_PREFIX, "textures/gui/celestialbodies/trappistone/TrappistOneH.png"));
				//TrappistOneB.setDimensionInfo(GSConfigDimensions.dimensionIDMercury, WorldProviderMercury.class);
		// --------------------------------------------
				
				
		registrycelestial();
    	registryteleport();
    	
    	//body, classP, gravity, pressure, temp, wind, daytime, breath, solar

	}
	
	private static void registrycelestial()
	{
		GalaxyRegistry.registerSolarSystem(TrappistOneSystem);
		
		GalaxyRegistry.registerPlanet(TrappistOneB);
		GalaxyRegistry.registerPlanet(TrappistOneC);
		GalaxyRegistry.registerPlanet(TrappistOneD);
		GalaxyRegistry.registerPlanet(TrappistOneE);
		GalaxyRegistry.registerPlanet(TrappistOneF);
		GalaxyRegistry.registerPlanet(TrappistOneG);
		GalaxyRegistry.registerPlanet(TrappistOneH);
	}
	
	private static void registryteleport()
	{
		GalacticraftRegistry.registerTeleportType(WorldProviderTrappistOneB.class, new TeleportTypeTrappistOneB());
		
	}
	

}
