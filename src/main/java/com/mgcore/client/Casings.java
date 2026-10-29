package com.mgcore.client;

import com.mgcore.MindgregCore;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

import static com.gregtechceu.gtceu.common.data.GTBlocks.createCasingBlock;

public class Casings {

    public static final BlockEntry<Block> STURDY_WROUGHT_IRON_CASING = createCasingBlock(
            "sturdy_wrought_iron_casing",
            MindgregCore.id("block/casings/sturdy_wrought_iron_casing")
    );

}
