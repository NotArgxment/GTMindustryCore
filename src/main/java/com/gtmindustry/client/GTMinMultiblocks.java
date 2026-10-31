package com.gtmindustry.client;

import com.gtmindustry.client.misc.GTMinCreativeTab;

import static com.gtmindustry.GTMindustryCore.GTMinRegistry;

public class GTMinMultiblocks {

    static {
        GTMinRegistry.creativeModeTab(() -> GTMinCreativeTab.CREATIVE_TAB);
    }

}
