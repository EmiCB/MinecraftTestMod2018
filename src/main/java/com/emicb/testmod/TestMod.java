package com.emicb.testmod;

import com.emicb.testmod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class TestMod {
	//Instance
	@Instance
	public static TestMod instance;
	
	//Proxy
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	//Initialization Events (allows the mod to process blocks & items & stuff)
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
