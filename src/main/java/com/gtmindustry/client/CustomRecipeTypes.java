package com.gtmindustry.client;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeType;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MULTIBLOCK;

public class CustomRecipeTypes {

    public final static GTRecipeType GraphitePress = customRecipeType("graphite_press", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType MultiPress = customRecipeType("multi_press", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType SiliconSmelter = customRecipeType("silicon_smelter", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType SiliconCrucible = customRecipeType("silicon_crucible", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType Kiln = customRecipeType("kiln", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType PhaseWeaver = customRecipeType("phase_weaver", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType SurgeSmelter = customRecipeType("surge_smelter", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType CryofluidMixer = customRecipeType("cryofluid_mixer", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType PyratiteMixer = customRecipeType("pyratite_mixer", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType Melter = customRecipeType("melter", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType Separator = customRecipeType("separator", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType SlagDisassembler = customRecipeType("slag_disassembler", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType SporePress = customRecipeType("spore_press", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType Pulverizer = customRecipeType("pulverizer", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType CoalCentrifuge = customRecipeType("coal_centrifuge", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType Incinerator = customRecipeType("incinerator", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType SiliconArcFurnace = customRecipeType("silicon_arc_furnace", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType ErekirElectrolyzer = customRecipeType("erekir_electrolyzer", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType AtmosphericConcentrator = customRecipeType("atmospheric_concentrator", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType OxidationChamber = customRecipeType("oxidation_chamber", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType CarbideCrucible = customRecipeType("carbide_crucible", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType SurgeCrucible = customRecipeType("surge_crucible", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType CryanogenSynthesizer = customRecipeType("cryanogen_synthesizer", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType PhaseSynthesizer = customRecipeType("phase_synthesizer", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public final static GTRecipeType SlagIncinerator = customRecipeType("slag_incinerator", MULTIBLOCK)
            .setMaxIOSize(2, 2, 2, 2)
            .setEUIO(IO.IN);

    public static GTRecipeType customRecipeType(String name, String group, RecipeType<?>... proxyRecipes) {
        var recipeType = new GTRecipeType(GTCEu.id(name), group, proxyRecipes);
        GTRegistries.register(BuiltInRegistries.RECIPE_TYPE, recipeType.registryName, recipeType);
        GTRegistries.register(BuiltInRegistries.RECIPE_SERIALIZER, recipeType.registryName, new GTRecipeSerializer());
        GTRegistries.RECIPE_TYPES.register(recipeType.registryName, recipeType);
        return recipeType;
    }

}
