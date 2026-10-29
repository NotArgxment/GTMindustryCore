package com.mgcore.client;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

import static com.mgcore.client.MGBlockHelper.customCasingRegister;

public class Casings {

    public static final BlockEntry<Block> STURDY_WROUGHT_IRON_CASING = customCasingRegister(
            "Sturdy Wrought Iron Casing", "sturdy_wrought_iron_casing",
            "machine_casing_sturdy_wrought_iron", BlockItem::new
    );

    public static void init() {
    }
}
