package net.angelos.darksoulsthreeweapons.item;

import net.angelos.darksoulsthreeweapons.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	protected String itemName;
	
	public ItemBase(String itemName) {
		this.itemName = itemName;
		setItemName(this, itemName);
		setCreativeTab(Main.creativeTab);
	}

	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, itemName);
	}
	
	public static void setItemName(Item item, String itemName) {
		item.setRegistryName(itemName);
		item.setUnlocalizedName(item.getRegistryName().toString());
	}
}