package rtg.world.biome.realistic.abyssalcraft;

import net.minecraft.init.Biomes;
import rtg.api.biome.BiomeConfig;
import rtg.world.gen.surface.abyssalcraft.SurfaceACDarklandsPlains;
import rtg.world.gen.terrain.abyssalcraft.TerrainACDarklandsPlains;

import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeACDarklandsPlains extends RealisticBiomeACBase
{

    public RealisticBiomeACDarklandsPlains(BiomeGenBase acBiome, BiomeConfig config)
    {
    
        super(config, 
            acBiome, Biomes.river,
            new TerrainACDarklandsPlains(),
            new SurfaceACDarklandsPlains(config, acBiome.topBlock, acBiome.fillerBlock));
    }
}
