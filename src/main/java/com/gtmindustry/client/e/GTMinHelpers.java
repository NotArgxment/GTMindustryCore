package com.gtmindustry.client.e;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.data.recipe.CustomTags;

import com.gtmindustry.GTMindustryCore;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullBiFunction;

public class GTMinHelpers {

    public static BlockEntry<Block> customCasingRegister(String name, String id, String texture,
                                                         NonNullBiFunction<Block, Item.Properties, ? extends BlockItem> func) {
        return GTMindustryCore.GTMinRegistry
                .block(id, Block::new)
                .initialProperties(() -> Blocks.IRON_BLOCK)
                .tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .tag(CustomTags.MINEABLE_WITH_CONFIG_VALID_PICKAXE_WRENCH)
                .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false)
                        .strength(5.0f, 6.0f)
                        .requiresCorrectToolForDrops())
                .blockstate((ctx, prov) -> prov.simpleBlock(ctx.getEntry(),
                        prov.models().cubeAll(ctx.getName(), GTMindustryCore.id("block/casings/" + texture))))
                .lang(name)
                .item(func)
                .build()
                .register();
    }

    public static GTRecipeType customRecipeType(String name, String group, RecipeType<?>... proxyRecipes) {
        var recipeType = new GTRecipeType(GTCEu.id(name), group, proxyRecipes);
        GTRegistries.register(BuiltInRegistries.RECIPE_TYPE, recipeType.registryName, recipeType);
        GTRegistries.register(BuiltInRegistries.RECIPE_SERIALIZER, recipeType.registryName, new GTRecipeSerializer());
        GTRegistries.RECIPE_TYPES.register(recipeType.registryName, recipeType);
        return recipeType;
    }

}