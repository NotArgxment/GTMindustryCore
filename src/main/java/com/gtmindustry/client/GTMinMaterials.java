package com.gtmindustry.client;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gtmindustry.client.e.GTMinCreativeTab;
import com.gtmindustry.client.e.GTMinMaterialBuilder;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gtmindustry.GTMindustryCore.GTMinRegistry;

public class GTMinMaterials {

    static {
        GTMinRegistry.creativeModeTab(() -> GTMinCreativeTab.CREATIVE_TAB);
    }

    public static void init(){
        GTMinMaterialBuilder.register();
        ignoreForms();
    }

    // Item
    public static Material Scrap;
    public static Material SporePod;
    public static Material Metaglass;
    public static Material Pyratite;
    public static Material Plastanium;
    public static Material PhaseFabric;
    public static Material SurgeAlloy;
    public static Material BlastCompound;
    public static Material Oxide;
    public static Material Carbide;
    public static Material Graphite;

    // Fluids
    public static Material Slag;
    public static Material Cryofluid;
    public static Material Arkycite;
    public static Material Neoplasm;

    // Gases
    public static Material Ozone;
    public static Material Cyanogen;

    public static void ignoreForms() {

        // Only quartzite form + ore
        for (TagPrefix p : new TagPrefix[]{
                block, dust, dustSmall, dustTiny,
                gemChipped, gemFlawed, gemFlawless, gemExquisite,
                crushed, crushedPurified, crushedRefined,
                dustImpure, dustPure, rawOre, rawOreBlock
        }) {
            p.setIgnored(GTMinMaterials.SporePod);
        }

        // Only raw + ores
        for (TagPrefix p : new TagPrefix[]{
                block, dust, dustSmall, dustTiny,
                crushed, crushedPurified, crushedRefined,
                dustImpure, dustPure, rawOreBlock
        }) {
            p.setIgnored(GTMinMaterials.Scrap);
        }

        // Ingot only
        for (TagPrefix p : new TagPrefix[]{
                block, nugget, dust, dustSmall, dustTiny
        }) {
            p.setIgnored(GTMinMaterials.Metaglass);
        }
    }

}
