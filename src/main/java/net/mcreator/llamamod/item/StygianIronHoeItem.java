
package net.mcreator.llamamod.item;

@LlamaModModElements.ModElement.Tag
public class StygianIronHoeItem extends LlamaModModElements.ModElement {

	@ObjectHolder("llama_mod:stygian_iron_hoe")
	public static final Item block = null;

	public StygianIronHoeItem(LlamaModModElements instance) {
		super(instance, 41);
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
				return Ingredient.fromStacks(new ItemStack(StygianIronIngotItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(OPMItemGroup.tab)) {

		}.setRegistryName("stygian_iron_hoe"));
	}

}
