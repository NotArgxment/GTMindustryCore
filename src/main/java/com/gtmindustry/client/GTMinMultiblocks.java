package com.gtmindustry.client;

import com.gtmindustry.client.e.GTMinCreativeTab;

import static com.gtmindustry.GTMindustryCore.GTMinRegistry;

public class GTMinMultiblocks {

    static {
        GTMinRegistry.creativeModeTab(() -> GTMinCreativeTab.CREATIVE_TAB);
    }

    /*
    public static MultiblockMachineDefinition KILN = GTMinRegistry
            .multiblock("kiln", WorkableElectricMultiblockMachine::new)
            .noRecipeModifier()
            .recipeType(GTMinRecipeTypes.Kiln)
            .pattern(definition -> FactoryBlockPattern.start()

                    .aisle("", "", "")
                    .aisle("", "", "")
                    .aisle("", "", "")
                    .where('@')
                    .where('')

                    .build())
            .register();
     */
}
