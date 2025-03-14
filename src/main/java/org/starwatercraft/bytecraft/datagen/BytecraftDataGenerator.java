package org.starwatercraft.bytecraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.util.Identifier;
import org.starwatercraft.bytecraft.ByteCraftReference;

public class BytecraftDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createBuiltinResourcePack(Identifier.of(ByteCraftReference.MOD_ID));

        pack.addProvider(BlockLootTables::new);
    }
}
