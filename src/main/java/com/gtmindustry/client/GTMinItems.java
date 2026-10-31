package com.gtmindustry.client;

import com.gtmindustry.client.misc.GTMinCreativeTab;

import static com.gtmindustry.GTMindustryCore.GTMinRegistry;

public class GTMinItems {

    static {
        GTMinRegistry.creativeModeTab(() -> GTMinCreativeTab.CREATIVE_TAB);
    }

}
