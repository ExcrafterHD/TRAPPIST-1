package trappistone.TrappistSystem.planets.trappistOneB.dimension;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

import trappistone.TrappistSystem.core.world.gen.ChunkProviderSpaceCraters;
import trappistone.TrappistSystem.core.world.gen.TPBiomeGenBase;
import trappistone.TrappistSystem.planets.trappistOneB.world.gen.BiomeDecoratorTrappistOneBOre;
import trappistone.TrappistSystem.planets.trappistOneB.world.gen.MapGenCavesTrappistOneB;
import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.MapGenBaseMeta;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedCreeper;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSkeleton;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import micdoodle8.mods.galacticraft.core.perlin.NoiseModule;
import micdoodle8.mods.galacticraft.core.perlin.generator.Gradient;
import micdoodle8.mods.galacticraft.core.world.gen.EnumCraterSize;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;
import net.minecraft.world.chunk.IChunkProvider;

import com.google.common.collect.Lists;


 

public class ChunkProviderTrappistOneB extends ChunkProviderSpaceCraters {
	
	
    private List<MapGenBaseMeta> worldGenerators;
    
    private BiomeGenBase[] biomesForGeneration = this.getBiomesForGeneration();
    private final MapGenCavesTrappistOneB caveGenerator = new MapGenCavesTrappistOneB();

 @Override
    protected List<MapGenBaseMeta> getWorldGenerators()
    {
        List<MapGenBaseMeta> generators = Lists.newArrayList();
        generators.add(this.caveGenerator);
        return generators;
    }

public ChunkProviderTrappistOneB(World par1World, long seed, boolean mapFeaturesEnabled) 

{
	super(par1World, seed, mapFeaturesEnabled);

}

@Override

protected BiomeDecoratorSpace getBiomeGenerator() {


    return new BiomeDecoratorTrappistOneBOre();

}



 //This should be a custom biome for your mod, but I'm opting to go desert instead out of quickness

//and the fact that biomes are outside the scope of this tutorial

@Override

protected BiomeGenBase[] getBiomesForGeneration() {


    return new BiomeGenBase[]{TPBiomeGenBase.Space};

}



@Override
public int getCraterProbability() {

    return 300;

}



@Override
protected SpawnListEntry[] getCreatures() {

 

    return new SpawnListEntry[]{};

}


@Override
public double getHeightModifier() {

    // TODO Auto-generated method stub

    return 20;

}



@Override

protected SpawnListEntry[] getMonsters() {

    SpawnListEntry skele = new SpawnListEntry(EntityEvolvedSkeleton.class, 100, 4, 4);
    SpawnListEntry creeper = new SpawnListEntry(EntityEvolvedCreeper.class, 100, 4, 4);
    SpawnListEntry spider = new SpawnListEntry(EntityEvolvedSpider.class, 100, 4, 4);
    
    return new SpawnListEntry[]{skele, creeper, spider};

}



@Override

public double getMountainHeightModifier() {

    return 0;

}



@Override

protected int getSeaLevel() {

    return 80;

}



@Override

public double getSmallFeatureHeightModifier() {

    return 1;

}



@Override

public double getValleyHeightModifier() {

    return 0;

}


@Override
public void onChunkProvide(int cX, int cZ, Block[] blocks, byte[] metadata) {

}



@Override

public void onPopulate(IChunkProvider arg0, int arg1, int arg2){
	
	
	

}


@Override

public boolean chunkExists(int x, int y){

    return false;

}


@Override
protected SpawnListEntry[] getWaterCreatures() {

	return new SpawnListEntry[]{};
}

@Override
protected BlockMetaPair getGrassBlock() {
	return new BlockMetaPair(Blocks.snow, (byte) 0);
}

@Override
protected BlockMetaPair getDirtBlock() {
	return new BlockMetaPair(Blocks.dirt, (byte) 0);
}

@Override
protected BlockMetaPair getStoneBlock() {
	return new BlockMetaPair(Blocks.stone, (byte) 0);
}

@Override
protected boolean enableBiomeGenBaseBlock() {
	return false;
}

}