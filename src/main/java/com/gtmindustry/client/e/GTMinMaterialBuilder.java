package com.gtmindustry.client.e;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;

import com.gtmindustry.GTMindustryCore;

import static com.gtmindustry.client.GTMinMaterials.*;

public class GTMinMaterialBuilder {

    public static void register() {

        Scrap = new Material.Builder(GTMindustryCore.id("scrap"))
                .ore()
                .color(0xEB9834).secondaryColor(0xD9B993)
                .iconSet(MaterialIconSet.DULL)
                .buildAndRegister();

        SporePod = new Material.Builder(GTMindustryCore.id("spore_pod"))
                .gem().ore()
                .color(0x9F78DC).secondaryColor(0x5441B0)
                .iconSet(MaterialIconSet.QUARTZ)
                .buildAndRegister();

        Metaglass = new Material.Builder(GTMindustryCore.id("metaglass"))
                .ingot()
                .color(0xD1D0E0)
                .secondaryColor(0xFFFFFF)
                .iconSet(MaterialIconSet.SHINY)
                .buildAndRegister();

        Graphite = new Material.Builder(GTMindustryCore.id("graphite"))
                .ingot()
                .color(0x95ABD8)
                .secondaryColor(0x6B77A0)
                .iconSet(MaterialIconSet.METALLIC)
                .buildAndRegister();

        Plastanium = new Material.Builder(GTMindustryCore.id("plastanium"))
                .ingot()
                .color(0x9DB765)
                .secondaryColor(0xCBD97F)
                .iconSet(MaterialIconSet.METALLIC)
                .buildAndRegister();

        Pyratite = new Material.Builder(GTMindustryCore.id("plastanium"))
                .gem()
                .color(0xFFA95F)
                .secondaryColor(0xD37F47)
                .iconSet(MaterialIconSet.QUARTZ)
                .buildAndRegister();

        PhaseFabric = new Material.Builder(GTMindustryCore.id("plastanium"))
                .ingot()
                .color(0xFFD49E)
                .secondaryColor(0xF39C86)
                .iconSet(MaterialIconSet.SHINY)
                .buildAndRegister();

        /*
        SurgeAlloy = new Material.Builder(GTMindustryCore.id("plastanium"))
                .ingot()
                .buildAndRegister();

        BlastCompound = new Material.Builder(GTMindustryCore.id("plastanium"))
                .gem()
                .buildAndRegister();

        Oxide = new Material.Builder(GTMindustryCore.id("plastanium"))
                .ingot()
                .buildAndRegister();

        Carbide = new Material.Builder(GTMindustryCore.id("plastanium"))
                .ingot()
                .buildAndRegister();

        Slag = new Material.Builder(GTMindustryCore.id("slag"))
                .fluid()
                .buildAndRegister();

        Cryofluid = new Material.Builder(GTMindustryCore.id("slag"))
                .fluid()
                .buildAndRegister();

        Arkycite = new Material.Builder(GTMindustryCore.id("slag"))
                .fluid()
                .buildAndRegister();

        Neoplasm = new Material.Builder(GTMindustryCore.id("slag"))
                .gas()
                .buildAndRegister();

        Ozone = new Material.Builder(GTMindustryCore.id("slag"))
                .gas()
                .buildAndRegister();

        Cyanogen = new Material.Builder(GTMindustryCore.id("slag"))
                .gas()
                .buildAndRegister();
         */
    }
}
