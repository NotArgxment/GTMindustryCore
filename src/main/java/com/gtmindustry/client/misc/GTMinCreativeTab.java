package com.gtmindustry.client.misc;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.gregtechceu.gtceu.common.data.machines.GCYMMachines;
import com.gtmindustry.GTMindustryCore;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.CreativeModeTab;

import static com.gtmindustry.GTMindustryCore.GTMinRegistry;

public class GTMinCreativeTab {

    public static RegistryEntry<CreativeModeTab> CREATIVE_TAB = GTMinRegistry
            .defaultCreativeTab(GTMindustryCore.MOD_ID,
                    builder -> builder
                            .displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(GTMindustryCore.MOD_ID, GTMinRegistry))
                            .title(GTMinRegistry.addLang("itemGroup", GTMindustryCore.id("creative_tab"), "GT Mindustry Core"))
                            .icon(GCYMMachines.LARGE_ASSEMBLER::asStack)
                            .build())
            .register();

}
