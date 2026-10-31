package com.gtmindustry;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;

import com.gtmindustry.client.GTMinRecipes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@SuppressWarnings("unused")
@GTAddon
public class GTMindustryGTAddon implements IGTAddon {

    @Override
    public GTRegistrate getRegistrate() {
        return GTMindustryCore.GTMinRegistry;
    }

    @Override
    public void initializeAddon() {}

    @Override
    public String addonModId() {
        return GTMindustryCore.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
        // CustomTagPrefixes.recipeLoader();
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        GTMinRecipes.init(provider);
    }

    @Override
    public void registerElements() {
        // CustomElements.recipeLoader();
    }

}
