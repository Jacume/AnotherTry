package com.jacume.anothertry.item;

import com.jacume.anothertry.AnotherTry;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AnotherTry.MOD_ID);
    public static final RegistryObject<Item> FOSSILIZED_ORB = ITEMS.register("fossilized_orb", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ANOTHER_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
