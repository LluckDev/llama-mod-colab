
package net.mcreator.llamamod.item;

@LlamaModModElements.ModElement.Tag
public class Opm112khdlksflhItem extends LlamaModModElements.ModElement {

	@ObjectHolder("llama_mod:opm_112khdlksflh")
	public static final Item block = null;

	public Opm112khdlksflhItem(LlamaModModElements instance) {
		super(instance, 84);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("opm_112khdlksflh");
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
