package fr.celyanrbx.botanypotscultivatingdreams.init;

import fr.celyanrbx.botanypotscultivatingdreams.BotanyPotsCultivatingDreams;
import fr.celyanrbx.botanypotscultivatingdreams.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BotanyPotsCultivatingDreams.MODID);

    public static final Supplier<CreativeModeTab> BOTANYPOTS_CULTIVATING_DREAMS_TAB = CREATIVE_MODE_TAB.register("botanypots_cultivating_dreams_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HARDEN_INSULATING_RESIN_BLOCK))
                    .title(Component.translatable("creativetab.botanypotscultivatingdreams.botanypots_cultivating_dreams"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HARDEN_INSULATING_RESIN_BLOCK.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
