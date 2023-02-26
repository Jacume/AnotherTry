package com.jacume.anothertry.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ANOTHER_TAB = new CreativeModeTab( "anothertab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FOSSILIZED_ORB.get());
        }
    };
}
