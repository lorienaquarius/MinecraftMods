package net.sage7rules.titaniummod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sage7rules.titaniummod.TitaniumMod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TitaniumMod.MODID);

    public static final RegistryObject<Item> TITANIUM = ITEMS.register("titanium_bar",
                                                        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> new Item(new Item.Properties().stacksTo(1).durability(4000)));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);

    }

}
