package org.starwatercraft.bytecraft.block;

import net.minecraft.block.Block;

public class DisplayBlock extends Block {
    public DisplayBlock(Settings settings) {
        super(settings.requiresTool());
    }
}
