package org.starwatercraft.bytecraft.block;

import net.minecraft.block.Block;

public class ComputerBlock extends Block {
    public ComputerBlock(Settings settings) {
        super(settings.requiresTool());
    }
}
