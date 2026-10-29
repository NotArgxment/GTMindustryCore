package com.mgcore.client;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;

import com.mgcore.MindgregCore;

import static com.mgcore.client.CustomMaterials.*;

public class CustomMaterialBuilder {

    public static void register() {

        Scrap = new Material.Builder(MindgregCore.id("scrap"))
                .ore()
                .color(0xEB9834)
                .secondaryColor(0xD9B993)
                .iconSet(MaterialIconSet.DULL)
                .buildAndRegister();

        SporePod = new Material.Builder(MindgregCore.id("spore_pod"))
                .gem()
                .color(0x9F78DC)
                .secondaryColor(0x5441B0)
                .iconSet(MaterialIconSet.QUARTZ)
                .buildAndRegister();

        Metaglass = new Material.Builder(MindgregCore.id("metaglass"))
                .ingot()
                .color(0xD1D0E0)
                .secondaryColor(0xFFFFFF)
                .iconSet(MaterialIconSet.SHINY)
                .buildAndRegister();

    }
}
