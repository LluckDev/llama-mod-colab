
package net.mcreator.llamamod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.llamamod.LlamaModModElements;

@LlamaModModElements.ModElement.Tag
public class StygianIronPickaxeItem extends LlamaModModElements.ModElement {
	@ObjectHolder("llama_mod:stygian_iron_pickaxe")
	public static final Item block = null;
	public StygianIronPickaxeItem(LlamaModModElements instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(StygianIronIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("stygian_iron_pickaxe"));
	}
}
