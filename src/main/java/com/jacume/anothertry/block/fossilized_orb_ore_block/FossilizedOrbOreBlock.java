package com.jacume.anothertry.block.fossilized_orb_ore_block;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
public class FossilizedOrbOreBlock extends Block{
    public FossilizedOrbOreBlock(float strength) {
        super(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(strength)
                        .requiresCorrectToolForDrops()
                        .lightLevel((lightLevel) -> {
                            return 1;
                        }));
    }
    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader world, RandomSource randomSource, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? 1 + randomSource.nextInt(10) : 0;
    }
}
