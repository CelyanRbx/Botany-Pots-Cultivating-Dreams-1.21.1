package fr.celyanrbx.botanypotscultivatingdreams.datagen;

import com.glodblock.github.appflux.common.AFSingletons;
import fr.celyanrbx.botanypotscultivatingdreams.block.ModBlocks;
import mekanism.common.registries.MekanismItems;
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLONIUM_BLOCK.get())
                .pattern("HHH")
                .pattern("HHH")
                .pattern("HHH")
                .define('H', MekanismItems.POLONIUM_PELLET)
                .unlockedBy("has_polonium", has(ModBlocks.POLONIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MekanismItems.POLONIUM_PELLET, 9)
                .requires(ModBlocks.POLONIUM_BLOCK)
                .unlockedBy("has_polonium_block", has(ModBlocks.POLONIUM_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTONIUM_BLOCK.get())
                .pattern("HHH")
                .pattern("HHH")
                .pattern("HHH")
                .define('H', MekanismItems.PLUTONIUM_PELLET)
                .unlockedBy("has_polonium", has(ModBlocks.PLUTONIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MekanismItems.PLUTONIUM_PELLET, 9)
                .requires(ModBlocks.PLUTONIUM_BLOCK)
                .unlockedBy("has_polonium_block", has(ModBlocks.PLUTONIUM_BLOCK)).save(recipeOutput);
    }
}