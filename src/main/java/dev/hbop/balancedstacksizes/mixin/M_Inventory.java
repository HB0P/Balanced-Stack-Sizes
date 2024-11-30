package dev.hbop.balancedstacksizes.mixin;

import dev.hbop.balancedstacksizes.BalancedStackSizes;
import net.minecraft.inventory.Inventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Inventory.class)
public interface M_Inventory {
    
    // increase max stack size
    @ModifyConstant(
            method = "getMaxCountPerStack",
            constant = @Constant(intValue = 99)
    )
    default int getMaxCountPerStack(int constant) {
        return BalancedStackSizes.MAX_STACK_SIZE;
    }
}
