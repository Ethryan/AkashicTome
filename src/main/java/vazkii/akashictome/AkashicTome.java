package vazkii.akashictome;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import vazkii.akashictome.proxy.CommonProxy;
import vazkii.botania.client.lib.LibResources;
import vazkii.botania.common.core.BotaniaCreativeTab;
import vazkii.botania.common.lib.LibMisc;

import java.util.List;

@Mod(modid = AkashicTome.MOD_ID, name = AkashicTome.MOD_NAME, version = AkashicTome.VERSION, dependencies = AkashicTome.DEPENDENCIES, guiFactory = AkashicTome.GUI_FACTORY)
public class AkashicTome {

	public static final String MOD_ID = "akashictome";
	public static final String MOD_NAME = "Akashic Tome";
	public static final String BUILD = "GRADLE:BUILD";
	public static final String VERSION = "GRADLE:VERSION-" + BUILD;
	public static final String DEPENDENCIES = "required-before:autoreglib";
	public static final String GUI_FACTORY = "vazkii.akashictome.client.GuiFactory";

	@SidedProxy(clientSide = "vazkii.akashictome.proxy.ClientProxy", serverSide = "vazkii.akashictome.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
		proxy.preInit();
	}

}
