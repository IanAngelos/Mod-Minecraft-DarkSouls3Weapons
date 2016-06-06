package net.angelos.darksoulsthreeweapons;

import net.angelos.darksoulsthreeweapons.init.ModItems;
import net.angelos.darksoulsthreeweapons.item.Guardian_Sword;
import net.angelos.darksoulsthreeweapons.item.Rapier;
import net.angelos.darksoulsthreeweapons.proxy.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.modId, name = Main.name, version = Main.version, acceptedMinecraftVersions = "[1.9]")
public class Main {
	public static final String modId = "darksoulsthreeweapons";
	public static final String name = "Dark Souls 3 Weapons Mod";
	public static final String version = "1.0.0";
	public static CreativeTab creativeTab;
	
	@Mod.Instance(modId)
	public static Main instance;

	@SidedProxy(serverSide = "net.angelos.darksoulsthreeweapons.proxy.CommonProxy", clientSide = "net.angelos.darksoulsthreeweapons.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e){
		creativeTab = new CreativeTab();
		ModItems.registerItems();
	
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e){
		MinecraftForge.EVENT_BUS.register(new DropHandler());
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e){
	}
}