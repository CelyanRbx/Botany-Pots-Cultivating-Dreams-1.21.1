package fr.celyanrbx.botanypotscultivatingdreams.item;

import fr.celyanrbx.botanypotscultivatingdreams.BotanyPotsCultivatingDreams;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BotanyPotsCultivatingDreams.MODID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
