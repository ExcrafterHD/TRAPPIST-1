package trappistone;

import java.util.ArrayList;
import java.util.List;

import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Moon;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.world.IAtmosphericGas;
import micdoodle8.mods.galacticraft.core.util.GCCoreUtil;

public class BodiesInfo {
	
	//Stars type
	public static String brown = GCCoreUtil.translate("gui.info.browndwarf.name");
	public static String red = GCCoreUtil.translate("gui.info.reddwarf.name");
	public static String orange = GCCoreUtil.translate("gui.info.orange.name");
	public static String yellow = GCCoreUtil.translate("gui.info.yellow.name");
	public static String white = GCCoreUtil.translate("gui.info.yellowdwarf.name");
	public static String lightblue = GCCoreUtil.translate("gui.info.lightblue.name");
	//---------------------
	public static String dwarf = GCCoreUtil.translate("gui.info.dwarf.name");	
	public static String subdwarf = GCCoreUtil.translate("gui.info.subdwarf.name");	
	//Planets -------------
	public static String selena = GCCoreUtil.translate("gui.info.selena.name");
	public static String desert = GCCoreUtil.translate("gui.info.desert.name");
	public static String terra = GCCoreUtil.translate("gui.info.terra.name");
	public static String gasgiant = GCCoreUtil.translate("gui.info.gasgiant.name");
	public static String icegiant = GCCoreUtil.translate("gui.info.icegiant.name");
	public static String iceworld = GCCoreUtil.translate("gui.info.iceworld.name");
	public static String asteroid = GCCoreUtil.translate("gui.info.asteroid.name");
	public static String oceanide = GCCoreUtil.translate("gui.info.oceanide.name");
	public static String titan = GCCoreUtil.translate("gui.info.titan.name");
	//---------------------
	
	public static List<CelestialBody> bodies = new ArrayList();
	public static List<String> classPlanet = new ArrayList();
	public static List<Float> gravityPlanet = new ArrayList();
	public static List<Integer> pressurePlanet = new ArrayList();
	public static List<Integer> tempPlanet = new ArrayList();
	public static List<Float> windPlanet = new ArrayList();
	public static List<Long> dayPlanet = new ArrayList();
	public static List<Boolean> breathablePlanet = new ArrayList();
	public static List<Boolean> solarPlanet = new ArrayList();
	
	public static void registerBody(CelestialBody body, String classP, float gravity, int pressure, int temp, float wind, long daytime, boolean breath, boolean solar, boolean registr)
	{
		if(registr)
		{
			if(body instanceof Planet) GalaxyRegistry.registerPlanet((Planet) body);
			if(body instanceof Moon) GalaxyRegistry.registerMoon((Moon) body);
		}
		registerBody(body, classP, gravity, pressure, temp, wind, daytime, breath, solar);
	}
	
	public static void registerBody(CelestialBody body, String classP, float gravity, int pressure, int temp, float wind, long daytime, boolean breath, boolean solar)
	{
		bodies.add(body);
		classPlanet.add(classP);
		gravityPlanet.add(gravity);
		pressurePlanet.add(pressure);
		tempPlanet.add(temp);
		windPlanet.add(wind);
		dayPlanet.add(daytime);
		breathablePlanet.add(breath);
		solarPlanet.add(solar);		
	}
	
	public static float calculateGravity(float Si) {
		return ((9.81F - Si) * (0.085F / 9.81F));
	}
	

}
