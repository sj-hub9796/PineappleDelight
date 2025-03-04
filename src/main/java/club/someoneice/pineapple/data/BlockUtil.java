package club.someoneice.pineapple.data;

import club.someoneice.pineapple.common.CropHelper;
import club.someoneice.pineapple.init.BlockList;
import club.someoneice.pineapple.init.ItemList;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.block.WildCropBlock;

public class BlockUtil {
    public static Block pie() {
        return new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ItemList.PINEAPPLE_PIE_SIDE);
    }

    public static Block wildBlock() {
        return new WildCropBlock(MobEffects.SATURATION, 8,Block.Properties.of(Material.PLANT).noCollission().noOcclusion().sound(SoundType.CROP).randomTicks().instabreak());
    }

    public static Block crop() {
        // return new CropHelper(BlockList.PINEAPPLE_CROP_ITEM.get());
        return new CropHelper();
    }
}
