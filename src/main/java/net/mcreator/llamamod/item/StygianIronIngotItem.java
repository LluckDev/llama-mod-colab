
package net.mcreator.llamamod.item;

@LlamaModModElements.ModElement.Tag
public class StygianIronIngotItem extends LlamaModModElements.ModElement {

	@ObjectHolder("llama_mod:stygian_iron_ingot")
	public static final Item block = null;

	public StygianIronIngotItem(LlamaModModElements instance) {
		super(instance, 35);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(OPMItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("stygian_iron_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
