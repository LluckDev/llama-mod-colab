
package net.mcreator.llamamod.item;

@LlamaModModElements.ModElement.Tag
public class StygianDustPickaxeItem extends LlamaModModElements.ModElement {

	@ObjectHolder("llama_mod:stygian_dust_pickaxe")
	public static final Item block = null;

	public StygianDustPickaxeItem(LlamaModModElements instance) {
		super(instance, 111);
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
				return Ingredient.fromStacks(new ItemStack(StygianDustDustItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(OPMItemGroup.tab)) {

		}.setRegistryName("stygian_dust_pickaxe"));
	}

}
