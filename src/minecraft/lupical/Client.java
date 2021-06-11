package lupical;

import lupical.gui.SplashProgress;
import net.arikia.dev.drpc.DiscordRPC;

public class Client {
   private static final  Client INSTANCE = new Client();
   public static final Client getInstance() {
	   return INSTANCE;
	   }
   private lupical.discordRPC discordRPC = new discordRPC();
   
	public void init() {
		SplashProgress.setProgress(1, "connecting to discord");
		discordRPC.start();
}
public void shutdown() {
	discordRPC.shutdown();
}
public 	discordRPC getDiscordRpc() {
	return discordRPC;
}
}
