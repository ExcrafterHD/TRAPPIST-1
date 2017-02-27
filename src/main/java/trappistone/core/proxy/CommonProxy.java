package trappistone.core.proxy;

import micdoodle8.mods.galacticraft.api.vector.Vector3;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;

public class CommonProxy {
	
	
	
    public void preload() {
		
	}
	
	
    public void load()
    {  
    	
	}
	
	
    public void postload() {
		 
	}


	public void register_event(Object obj)
	{
    	FMLCommonHandler.instance().bus().register(obj);
    	MinecraftForge.EVENT_BUS.register(obj);
	}

 
}
