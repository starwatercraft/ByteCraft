package org.starwatercraft.bytecraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.starwatercraft.bytecraft.block.ModBlocks;
import org.starwatercraft.bytecraft.item.Items;

import static net.minecraft.data.DataProvider.LOGGER;

public class Bytecraft implements ModInitializer {

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing " + ByteCraftReference.DISPLAY_NAME);

        ItemGroup.Builder itemGroupBuilder = FabricItemGroup.builder()
                // .icon(() -> new ItemStack(TutorialItems.CUSTOM_ITEM))
                .displayName(Text.translatable(ByteCraftReference.DISPLAY_NAME));

        Items.initialize(itemGroupBuilder);
        ModBlocks.initialize(itemGroupBuilder);

        ItemGroup itemGroup = itemGroupBuilder.build();

        Registry.register(Registries.ITEM_GROUP, Identifier.of(ByteCraftReference.MOD_ID, "main"), itemGroup);

        LOGGER.info("Initialized " + ByteCraftReference.DISPLAY_NAME);
    }
}
