
package net.mcreator.llamamod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.llamamod.itemgroup.OPMItemGroup;
import net.mcreator.llamamod.LlamaModModElements;

@LlamaModModElements.ModElement.Tag
public class StygianDustHoeItem extends LlamaModModElements.ModElement {
	@ObjectHolder("llama_mod:stygian_dust_hoe")
	public static final Item block = null;
	public StygianDustHoeItem(LlamaModModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(StygianDustDustItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(OPMItemGroup.tab)) {
		}.setRegistryName("stygian_dust_hoe"));
	}
}
