package org.starwatercraft.bytecraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.starwatercraft.bytecraft.ByteCraftReference;

import java.util.function.Function;

public class ModBlocks {

    public static final Block COMPUTER = register("computer", ComputerBlock::new);
    public static final Block DISPLAY = register("display", DisplayBlock::new);

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory) {
        final Identifier identifier = Identifier.of(ByteCraftReference.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, AbstractBlock.Settings.create());
        final Item item = Items.register(block);
        return block;
    }

    public static void initialize(ItemGroup.Builder itemGroup) {
        itemGroup.entries((context, entries) -> {
            entries.add(COMPUTER);
            entries.add(DISPLAY);
        });
    }
}
