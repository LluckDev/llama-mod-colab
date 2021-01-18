
package net.mcreator.llamamod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.llamamod.item.Opm112khdlksflhItem;
import net.mcreator.llamamod.LlamaModModElements;

@LlamaModModElements.ModElement.Tag
public class OpmItemGroup extends LlamaModModElements.ModElement {
	public OpmItemGroup(LlamaModModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabopm") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Opm112khdlksflhItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
