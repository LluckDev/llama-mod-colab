
package net.mcreator.llamamod.item;

@LlamaModModElements.ModElement.Tag
public class StygianIronSwordItem extends LlamaModModElements.ModElement {

	@ObjectHolder("llama_mod:stygian_iron_sword")
	public static final Item block = null;

	public StygianIronSwordItem(LlamaModModElements instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, 3, -3f, new Item.Properties().group(OPMItemGroup.tab)) {

		}.setRegistryName("stygian_iron_sword"));
	}

}
