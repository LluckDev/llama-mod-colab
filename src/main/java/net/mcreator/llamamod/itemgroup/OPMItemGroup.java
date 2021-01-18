
package net.mcreator.llamamod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.llamamod.item.StygianIronSwordItem;
import net.mcreator.llamamod.LlamaModModElements;

@LlamaModModElements.ModElement.Tag
public class OPMItemGroup extends LlamaModModElements.ModElement {
	public OPMItemGroup(LlamaModModElements instance) {
		super(instance, 128);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabopm") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(StygianIronSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
