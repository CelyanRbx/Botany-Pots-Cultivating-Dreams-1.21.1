package fr.celyanrbx.botanypotscultivatingdreams.datagen;

import com.glodblock.github.appflux.common.AFSingletons;
import fr.celyanrbx.botanypotscultivatingdreams.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HARDEN_INSULATING_RESIN_BLOCK.get())
                .pattern("HHH")
                .pattern("HHH")
                .pattern("HHH")
                .define('H', AFSingletons.HARDEN_INSULATING_RESIN)
                .unlockedBy("has_harden_insulating_resin", has(ModBlocks.HARDEN_INSULATING_RESIN_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AFSingletons.HARDEN_INSULATING_RESIN, 9)
                .requires(ModBlocks.HARDEN_INSULATING_RESIN_BLOCK)
                .unlockedBy("has_harden_insulating_resin_block", has(ModBlocks.HARDEN_INSULATING_RESIN_BLOCK)).save(recipeOutput);

    }
}