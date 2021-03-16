package com.garume.Garuff.mixin.mixins;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.garume.Garuff.module.ModuleManager;
import com.garume.Garuff.module.modules.player.NoSlow;

import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Mixin(BlockSoulSand.class)
public class MixinBlockSoulSand {
	@Inject(method = "onEntityCollision", at = @At("HEAD"), cancellable = true)
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn, CallbackInfo info) {
		if (ModuleManager.isModuleEnabled("noSlow") && ((NoSlow)ModuleManager.getModuleByName("noSlow")).soulSand.isEnabled())
			info.cancel();
	}
}