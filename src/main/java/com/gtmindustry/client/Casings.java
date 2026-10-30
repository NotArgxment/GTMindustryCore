package com.gtmindustry.client;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

import static com.gtmindustry.client.MGBlockHelper.customCasingRegister;

public class Casings {

    public static final BlockEntry<Block> REINFORCED_IRON_CASING = customCasingRegister(
            "Reinforced Iron Casing", "reinforced_iron_casing",
            "reinforced_iron_casing", BlockItem::new
    );

    public static void init() {
    }
}
