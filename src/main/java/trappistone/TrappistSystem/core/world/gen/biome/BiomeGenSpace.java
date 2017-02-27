package trappistone.TrappistSystem.core.world.gen.biome;


import trappistone.TrappistSystem.core.world.gen.TPBiomeGenBase;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.BiomeDictionary;

public class BiomeGenSpace extends TPBiomeGenBase
{
	public BiomeGenSpace(int var1)
	{
		super(var1);
		this.topBlock = Blocks.grass;
		this.fillerBlock = Blocks.dirt;
		this.stoneBlock = Blocks.stone;
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		if (!ConfigManagerCore.disableBiomeTypeRegistrations)
	    {
		        BiomeDictionary.registerBiomeType(this, BiomeDictionary.Type.COLD, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.SPOOKY);
	    }
	}
	
    
}