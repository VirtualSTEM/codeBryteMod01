package com.example.examplemod.entities.projectiles;

import com.example.examplemod.init.ItemInitializer;
import org.jetbrains.annotations.NotNull;

import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.network.NetworkHooks;

public class CustomArrowEntity extends AbstractArrow {


    public CustomArrowEntity(EntityType<CustomArrowEntity> entityType, Level world) {
        super(entityType, world);
    }

    public CustomArrowEntity(EntityType<CustomArrowEntity> entityType, double x, double y, double z, Level world) {
        super(entityType, x, y, z, world);
    }

    public CustomArrowEntity(EntityType<CustomArrowEntity> entityType, LivingEntity shooter, Level world) {
        super(entityType, shooter, world);
    }

    // TODO 3: Override the AbstractArrow class' getPickupItem() method to make the pickup item a CustomArrowItem.
    @Override
    public @NotNull ItemStack getPickupItem() {
        return new ItemStack(ItemInitializer.CUSTOM_ARROW.get());
    }

    @Override
    public @NotNull Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void onHitEntity(@NotNull EntityHitResult hit) {
        super.onHitEntity(hit);
    }

    @Override
    protected void onHitBlock(@NotNull BlockHitResult hit) {
        super.onHitBlock(hit);
    }

    // TODO 2: Override the AbstractArrow class' tickDespawn() method to cause an explosion when a CustomArrowItem has been in a Block for 60 Ticks (i.e., 3 seconds).
    @Override
    protected void tickDespawn() {
        if (this.inGroundTime > 60){
            this.level.explode(this, this.getX(), this.getY(), this.getZ(), 4.0f, true, Level.ExplosionInteraction.BLOCK);
            this.discard();
        }
    }


}
