package com.thesarlaacsweep.radioactiveblocksmod.items;

import com.thesarlaacsweep.radioactiveblocksmod.Main;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModItems;
import com.thesarlaacsweep.radioactiveblocksmod.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class RadioactiveAxe extends ItemAxe implements IHasModel {

	public RadioactiveAxe(String name, ToolMaterial material, float attackSpeed, float attackDamage) {
		super(material, attackDamage, attackSpeed);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.radioactiveblockstab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		attacker.addPotionEffect(new PotionEffect(MobEffects.STRENGTH));
		if (target.isCreatureType(EnumCreatureType.MONSTER, false)) {
			target.setFire(2000);
		}
		return true;
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
