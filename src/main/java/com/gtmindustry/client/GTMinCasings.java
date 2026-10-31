package com.gtmindustry.client;

import com.gtmindustry.client.misc.GTMinCreativeTab;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

import static com.gtmindustry.GTMindustryCore.GTMinRegistry;
import static com.gtmindustry.client.misc.GTMinHelpers.customCasingRegister;

public class GTMinCasings {

    static {
        GTMinRegistry.creativeModeTab(() -> GTMinCreativeTab.CREATIVE_TAB);
    }

    static String texturePath = "block/casings/";

    public static final BlockEntry<Block> REINFORCED_IRON_CASING = customCasingRegister(
            "Reinforced Iron Casing", "reinforced_iron_casing", texturePath + "reinforced_iron_casing"
    );

    public static final BlockEntry<Block> PLATED_STEEL_CASING = customCasingRegister(
            "Plated Steel Casing", "plated_steel_casing", texturePath + "plated_steel_casing"
    );

    public static void init() {
    }
}
