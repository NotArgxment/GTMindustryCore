package com.gtmindustry.client;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gtmindustry.client.misc.GTMinCreativeTab;
import com.gtmindustry.client.misc.GTMinMaterialBuilder;

import java.util.Set;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gtmindustry.GTMindustryCore.GTMinRegistry;

public class GTMinMaterials {

    static {
        GTMinRegistry.creativeModeTab(() -> GTMinCreativeTab.CREATIVE_TAB);
    }

    public static void init(){
        GTMinMaterialBuilder.registerMaterials();
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

    private static final Set<TagPrefix> SporePodIgnored = Set.of(
            TagPrefix.ore,
            TagPrefix.gem
    );

    public static void ignoreForms() {

        // Keep Ore and Gem forms
        TagPrefix.PREFIXES.values().stream()
                .filter(p -> p != TagPrefix.ore && p != TagPrefix.gem)
                .forEach(p -> p.setIgnored(GTMinMaterials.SporePod));

        // Keep Ore form
        TagPrefix.PREFIXES.values().stream()
                .filter(p -> p != TagPrefix.ore && p != TagPrefix.gem)
                .forEach(p -> p.setIgnored(GTMinMaterials.Scrap));

        // Keep ingot form
        TagPrefix.PREFIXES.values().stream()
                .filter(p -> p != TagPrefix.ingot)
                .forEach(p -> p.setIgnored(GTMinMaterials.Metaglass));

        // Keep gem form
        TagPrefix.PREFIXES.values().stream()
                .filter(p -> p != TagPrefix.gem)
                .forEach(p -> p.setIgnored(GTMinMaterials.Pyratite));

        // Keep ingot form
        TagPrefix.PREFIXES.values().stream()
                .filter(p -> p != TagPrefix.ingot)
                .forEach(p -> p.setIgnored(GTMinMaterials.Plastanium));

        // Keep gem form
        TagPrefix.PREFIXES.values().stream()
                .filter(p -> p != TagPrefix.gem)
                .forEach(p -> p.setIgnored(GTMinMaterials.PhaseFabric));

        // Keep ingot form
        TagPrefix.PREFIXES.values().stream()
                .filter(p -> p != TagPrefix.ingot)
                .forEach(p -> p.setIgnored(GTMinMaterials.Graphite));


    }

}
