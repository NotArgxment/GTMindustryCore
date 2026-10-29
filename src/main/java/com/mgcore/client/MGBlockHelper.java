package com.mgcore.client;

import com.gregtechceu.gtceu.data.recipe.CustomTags;

import com.mgcore.MindgregCore;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullBiFunction;

public class MGBlockHelper {

    public static BlockEntry<Block> customCasingRegister(String name, String id, String texture,
                                                         NonNullBiFunction<Block, Item.Properties, ? extends BlockItem> func) {
        return MindgregCore.MGCoreRegistry
                .block(id, Block::new)
                .initialProperties(() -> Blocks.IRON_BLOCK)
                .tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .tag(CustomTags.MINEABLE_WITH_CONFIG_VALID_PICKAXE_WRENCH)
                .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false)
                        .strength(5.0f, 6.0f)
                        .requiresCorrectToolForDrops())
                .blockstate((ctx, prov) -> prov.simpleBlock(ctx.getEntry(),
                        prov.models().cubeAll(ctx.getName(), MindgregCore.id("block/casings/" + texture))))
                .lang(name)
                .item(func)
                .build()
                .register();
    }

}