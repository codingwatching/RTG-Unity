package rtg.world.gen.terrain.biomesoplenty;

import rtg.util.noise.CellNoise;
import rtg.util.noise.OpenSimplexNoise;
import rtg.world.gen.terrain.TerrainBase;

public class TerrainBOPBrushland extends TerrainBase {
    private float baseHeight = 76f;
    private float hillStrength = 20f;

    public TerrainBOPBrushland() {

    }

    public TerrainBOPBrushland(float bh, float hs) {
        baseHeight = bh;
        hillStrength = hs;
    }

    @Override
    public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {

        groundNoise = groundNoise(x, y, groundNoiseAmplitudeHills, simplex);

        float m = hills(x, y, hillStrength, simplex, river);

        return baseHeight + groundNoise + m;
    }
}
