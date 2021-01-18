
package net.mcreator.llamamod.item;

@LlamaModModElements.ModElement.Tag
public class StygianIronPickaxeItem extends LlamaModModElements.ModElement {

	@ObjectHolder("llama_mod:stygian_iron_pickaxe")
	public static final Item block = null;

	public StygianIronPickaxeItem(LlamaModModElements instance) {
		super(instance, 38);
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
		}, 1, -3f, new Item.Properties().group(OPMItemGroup.tab)) {

		}.setRegistryName("stygian_iron_pickaxe"));
	}

}
