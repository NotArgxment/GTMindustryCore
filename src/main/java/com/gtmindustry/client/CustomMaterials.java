package com.gtmindustry.client;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;

public class CustomMaterials {

    public static void init(){
        CustomMaterialBuilder.register();
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
            p.setIgnored(CustomMaterials.SporePod);
        }

        // Only raw + ores
        for (TagPrefix p : new TagPrefix[]{
                block, dust, dustSmall, dustTiny,
                crushed, crushedPurified, crushedRefined,
                dustImpure, dustPure, rawOreBlock
        }) {
            p.setIgnored(CustomMaterials.Scrap);
        }

        // Ingot only
        for (TagPrefix p : new TagPrefix[]{
                block, nugget, dust, dustSmall, dustTiny
        }) {
            p.setIgnored(CustomMaterials.Metaglass);
        }
    }

}
