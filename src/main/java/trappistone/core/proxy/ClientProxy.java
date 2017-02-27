package trappistone.core.proxy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.client.render.block.BlockRendererMachine;
import micdoodle8.mods.galacticraft.core.client.render.item.ItemRendererKey;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.common.MinecraftForge;

import com.google.common.collect.Maps;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.ObfuscationReflectionHelper;


public class ClientProxy extends CommonProxy {
	

	public static Minecraft mc = FMLClientHandler.instance().getClient();
	
	@Override
    public void preload() {
		
		
	}

    @Override
    public void load()
    {  
    	registerEntityRenderers();
    	registerItemRenderers();    	
     }
	
    @Override
    public void postload() {   	
		
	}
    
	public static void registerEntityRenderers()
    {
	
    }
	
	public static void registerItemRenderers()
    {
		
        
    }
 
	    
	public void register_event(Object obj)
	{
    	FMLCommonHandler.instance().bus().register(obj);
    	MinecraftForge.EVENT_BUS.register(obj);
	}

 
 }
