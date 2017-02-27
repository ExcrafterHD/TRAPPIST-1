package trappistone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent.Serializer;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public class ThreadVersionCheck extends Thread
{
	public static ThreadVersionCheck INSTANCE = new ThreadVersionCheck();
	private int count = 0;
	
	private String URLMF = "";
	private String URLMC = "";
	private String URLVK = "";

	public static int remoteMajVer;
	public static int remoteMinVer;
	public static int remoteBuildVer;
	public static String information;
	public static boolean newversion = false;

	public ThreadVersionCheck()
	{
		super("Galaxy Space Version Check Thread");
	}

	public static void startCheck()
	{
		Thread thread = new Thread(ThreadVersionCheck.INSTANCE);
		thread.start();
	}

	@Override
	public void run()
	{
		Side sideToCheck = FMLCommonHandler.instance().getSide();

		if (sideToCheck == null)
		{
			return;
		}

		while (this.count < 3 && remoteBuildVer == 0)
		{
			try
			{
				URL url = new URL("http://demigods.at.ua/version.txt");
				HttpURLConnection http = (HttpURLConnection) url.openConnection();
				http.addRequestProperty("User-Agent", "Mozilla/4.76");
				BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
				String str;
				String str2[] = null;

				while ((str = in.readLine()) != null)
				{
					if (str.contains("Version"))
					{
						str = str.replace("Version=", "");
						str2 = str.split("#");

						if (str2.length == 3)
						{
							remoteMajVer = Integer.parseInt(str2[0]);
							remoteMinVer = Integer.parseInt(str2[1]);
							remoteBuildVer = Integer.parseInt(str2[2]);
						}

						if (remoteMajVer > Core.major_version || remoteMajVer == Core.major_version && remoteMinVer > Core.minor_version || remoteMajVer == Core.major_version && remoteMinVer == Core.minor_version && remoteBuildVer > Core.build_version)
						{
							this.newversion = true;
							Thread.sleep(5000);

							if (sideToCheck.equals(Side.CLIENT))
							{/*
								if (GSConfigCore.enableCheckVersion == true)
								{
									FMLClientHandler.instance().getClient().thePlayer.addChatMessage(Serializer.func_150699_a("[{text:\"" + EnumChatFormatting.GRAY + "New \",extra:[{text:\"" + EnumChatFormatting.AQUA + "Galaxy Space\"},{text:\"" + EnumChatFormatting.GRAY + " version available!\"},{text:\"" + EnumChatFormatting.GREEN + EnumChatFormatting.BOLD + " v" + String.valueOf(remoteMajVer) + "." + String.valueOf(remoteMinVer) + "." + String.valueOf(remoteBuildVer) + " \"}]}]"));
									FMLClientHandler.instance().getClient().thePlayer.addChatMessage(Serializer.func_150699_a("[{text:\"" + EnumChatFormatting.RED + "Download: " + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + "Minecraftforum\",hoverEvent:{action:show_text,value:\"" + EnumChatFormatting.YELLOW + EnumChatFormatting.BOLD + "Download Latest Version\"},clickEvent:{action:open_url,value:\"" + this.URLMF + "\"}}]"));
									FMLClientHandler.instance().getClient().thePlayer.addChatMessage(Serializer.func_150699_a("[{text:\"" + EnumChatFormatting.RED + "Download: " + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + "Micdoodle8 Forum\",hoverEvent:{action:show_text,value:\"" + EnumChatFormatting.YELLOW + EnumChatFormatting.BOLD + "Download Latest Version\"},clickEvent:{action:open_url,value:\"" + this.URLMC + "\"}}]"));
									//FMLClientHandler.instance().getClient().thePlayer.addChatMessage(Serializer.func_150699_a("[{text:\"" + EnumChatFormatting.RED + "Download: " + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + "Galaxy Space Forum\",hoverEvent:{action:show_text,value:\"" + EnumChatFormatting.YELLOW + EnumChatFormatting.BOLD + "Download Latest Version\"},clickEvent:{action:open_url,value:\"" + "http://galaxyspace.esy.es/forum/" + "\"}}]"));
									FMLClientHandler.instance().getClient().thePlayer.addChatMessage(Serializer.func_150699_a("[{text:\"" + EnumChatFormatting.RED + "Download: [RUS] " + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + "[VK] Galaxy Space Group\",hoverEvent:{action:show_text,value:\"" + EnumChatFormatting.YELLOW + EnumChatFormatting.BOLD + "Download Latest Version\"},clickEvent:{action:open_url,value:\"" + this.URLVK + "\"}}]"));
									
								}*/
							}
							else if (sideToCheck.equals(Side.SERVER))
							{/*
								if (GSConfigCore.enableCheckVersion == true)
								{
									GalaxySpace.info("New version available! v" + String.valueOf(remoteMajVer) + "." + String.valueOf(remoteMinVer) + "." + String.valueOf(remoteBuildVer) + " ");
								}*/
							}
						}
					}
				}
			}
			catch (Exception e) {}

			/*if (remoteBuildVer == 0)
			{
				try
				{
					GalaxySpace.severe(StatCollector.translateToLocal("gs.failed.name"));
					Thread.sleep(15000);
				}
				catch (InterruptedException e) {}
			}
			else
			{*/
				Core.info(StatCollector.translateToLocal("tp.success.name") + " " + remoteMajVer + "." + remoteMinVer + "." + remoteBuildVer);
			//}
			this.count++;
		}
	}
}
