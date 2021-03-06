package com.thesarlaacsweep.radioactiveblocks.items;

import com.thesarlaacsweep.radioactiveblocks.config.ModConfig;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.world.World;

import java.util.Objects;

public class RadioactivePickaxeItem extends PickaxeItem {
    int enchantmentId;
    int levelOfEnchantment;

    public RadioactivePickaxeItem(
            IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder, int enchantmentIdIn, int levelOfEnchantmentIn
    ) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
        this.enchantmentId = enchantmentIdIn;
        this.levelOfEnchantment = levelOfEnchantmentIn;
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
        if (ModConfig.COMMON_CONFIG.has_radiation_effect.get()) {
            stack.addEnchantment(Objects.requireNonNull(Enchantment.getEnchantmentByID(this.enchantmentId)), this.levelOfEnchantment);
        }
    }
}
