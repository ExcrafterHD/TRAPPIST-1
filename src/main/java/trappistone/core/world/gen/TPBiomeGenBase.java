package trappistone.core.world.gen;

import trappistone.core.world.gen.biome.BiomeGenSpace;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

public abstract class TPBiomeGenBase extends BiomeGenBase
{
	public static BiomeGenBase Space = new BiomeGenSpace(100).setBiomeName("Space").setHeight(height_LowHills);

	public Block stoneBlock;
	public byte topMeta;
	public byte fillerMeta;
	public byte stoneMeta;
	
	public TPBiomeGenBase(int id)
	{
		super(id);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.rainfall = 0F;
		this.setColor(-16744448);
		
		this.theBiomeDecorator.treesPerChunk = -999;
		this.theBiomeDecorator.flowersPerChunk = -999;
		this.theBiomeDecorator.grassPerChunk = -999;
	}

	@Override
	public TPBiomeGenBase setColor(int var1)
	{
		return (TPBiomeGenBase) super.setColor(var1);
	}

	@Override
	public float getSpawningChance()
	{
		return 0.1F;
	}
	
	@Override
	public BiomeDecorator createBiomeDecorator()
	{
		return new TPBiomeDecorator();
	}

	protected TPBiomeDecorator getBiomeDecorator()
	{
		return (TPBiomeDecorator)this.theBiomeDecorator;
	}
	
	/*
	@Override
	public void genTerrainBlocks(World world, Random rand, Block[] block, byte[] meta, int x, int z, double stoneNoise)
	{
		this.genSpaceBiomeTerrain(world, rand, block, meta, x, z, stoneNoise);
	}

	public void genSpaceBiomeTerrain(World world, Random rand, Block[] block, byte[] meta, int x, int z, double stoneNoise)
	{
		Block topBlock = this.topBlock;
		byte topMeta = this.topMeta;
		Block fillerBlock = this.fillerBlock;
		byte fillerMeta = this.fillerMeta;
		int currentFillerDepth = -1;
		int maxFillerDepth = (int)(stoneNoise / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		int maskX = x & 15;
		int maskZ = z & 15;
		int worldHeight = block.length / 256;
		int height = 63;
		int seaLevel = 63;

		for (int y = 255; y >= 0; y--)
		{
			int index = (maskZ * 16 + maskX) * worldHeight + y;

			if (y <= 0 + rand.nextInt(5))
			{
				block[index] = Blocks.bedrock;
			}
			else
			{
				Block currentBlock = block[index];

				if (currentBlock != null && currentBlock.getMaterial() != Material.air)
				{
					if (currentBlock == Blocks.stone)
					{
						if (this.stoneBlock != null)
						{
							block[index] = this.stoneBlock;
							meta[index] = this.stoneMeta;
						}
						if (currentFillerDepth == -1)
						{
							if (maxFillerDepth <= 0)
							{
								topBlock = null;
								topMeta = 0;
								fillerBlock = Blocks.dirt;
								fillerMeta = 0;
							}
							else if (y >= seaLevel - 5 && y <= seaLevel)
							{
								topBlock = this.topBlock;
								topMeta = this.topMeta;
								fillerBlock = this.fillerBlock;
								fillerMeta = 0;
							}
							if (y < seaLevel - 1 && (topBlock == null || topBlock.getMaterial() == Material.air))
							{
								if (this.getFloatTemperature(x, y, z) < 0.15F)
								{
									topBlock = Blocks.ice;
									topMeta = 0;
								}
								else
								{
									topBlock = Blocks.water;
									topMeta = 0;
								}
							}

							currentFillerDepth = maxFillerDepth;

							if (y >= seaLevel - 2)
							{
								block[index] = topBlock;
								meta[index] = topMeta;
							}
							else if (y < seaLevel - 8 - maxFillerDepth)
							{
								topBlock = null;
								fillerBlock = Blocks.dirt;
								fillerMeta = 0;
								block[index] = Blocks.gravel;
							}
							else
							{
								block[index] = fillerBlock;
								meta[index] = fillerMeta;
							}
						}
						else if (currentFillerDepth > 0)
						{
							currentFillerDepth--;
							block[index] = fillerBlock;
							meta[index] = fillerMeta;

							if (currentFillerDepth == 0 && fillerBlock == Blocks.sand)
							{
								currentFillerDepth = rand.nextInt(4) + Math.max(0, y - (seaLevel - 1));
								fillerBlock = Blocks.sandstone;
								fillerMeta = 0;
							}
						}
					}
				}
			}
		}
	}
	*/
}