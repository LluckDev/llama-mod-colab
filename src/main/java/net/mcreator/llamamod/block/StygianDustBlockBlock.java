
package net.mcreator.llamamod.block;

import net.minecraft.block.material.Material;

@LlamaModModElements.ModElement.Tag
public class StygianDustBlockBlock extends LlamaModModElements.ModElement {

	@ObjectHolder("llama_mod:stygian_dust_block")
	public static final Block block = null;

	public StygianDustBlockBlock(LlamaModModElements instance) {
		super(instance, 107);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(LlamacreativetabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).lightValue(0).harvestLevel(2)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("stygian_dust_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
