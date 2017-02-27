package trappistone.TrappistSystem.core.world.gen;

import java.util.Random;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType;
import net.minecraftforge.event.terraingen.TerrainGen;

public class TPBiomeDecorator extends BiomeDecorator {

    	public TPBiomeDecorator()
    	{
    	}

    	@Override
    	public void decorateChunk(World world, Random rand, BiomeGenBase biome, int x, int z)
    	{
    		if (this.currentWorld != null)
    		{
    			throw new RuntimeException("Already decorating!!");
    		}
    		else
    		{
    			this.currentWorld = world;
    			this.randomGenerator = rand;
    			this.chunk_X = x;
    			this.chunk_Z = z;
    			this.genDecorations(biome);
    			this.currentWorld = null;
    			this.randomGenerator = null;
    		}
    	}

    	@Override
    	protected void genDecorations(BiomeGenBase biome)
    	{
    		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z));
   	
    		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z));
    	}

    	private boolean getGen(EventType event)
    	{
    		return TerrainGen.decorate(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, event);
    	}
    	
    	
}