package trappistone.TrappistSystem.planets.trappistOneB.world.gen;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import net.minecraft.world.World;

public class BiomeDecoratorTrappistOneBOre extends BiomeDecoratorSpace
{
	private World world;

	public BiomeDecoratorTrappistOneBOre()
	{

	}	

	@Override
	protected void decorate()
	{

	}

	@Override
	protected void setCurrentWorld(World world)
	{
		this.world = world;
	}

	@Override
	protected World getCurrentWorld()
	{
		return this.world;
	}
}