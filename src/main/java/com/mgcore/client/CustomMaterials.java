package com.mgcore.client;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

public class CustomMaterials {

    public static void init(){
        CustomMaterialBuilder.register();
    }

    // Obtainable
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

}
