package lupical;

import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.util.ResourceLocation;

public class serverDataFeatured extends ServerData{

	public static final ResourceLocation STAR_ICON =new ResourceLocation("lupical/star.png");
	
	public serverDataFeatured(String serverName, String serverIP) {
		super(serverName, serverIP, false);
		// TODO Auto-generated constructor stub
	}

}
