
package com.garume.Garuff.mixin.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.client.multiplayer.PlayerControllerMP;

@Mixin(PlayerControllerMP.class)
public interface AccessorPlayerControllerMP {

    @Accessor("blockHitDelay")
    int getBlockHitDelay();

    @Accessor("blockHitDelay")
    void setBlockHitDelay(int value);

    @Accessor("isHittingBlock")
    void kbSetIsHittingBlock(boolean value);

    @Accessor("currentPlayerItem")
    int getCurrentPlayerItem();

    @Invoker("syncCurrentPlayItem")
    void kb_invokeSyncCurrentPlayItem(); // Mixin bug #430 https://github.com/SpongePowered/Mixin/issues/430

}