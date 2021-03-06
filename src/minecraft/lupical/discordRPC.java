package lupical;
import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;
import net.arikia.dev.drpc.DiscordUser;
import net.arikia.dev.drpc.callbacks.ReadyCallback;
public class discordRPC {
    private boolean running = true;
    private long created= 0;
	public void start(){
		this.created = System.currentTimeMillis();
	
		DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler(new ReadyCallback() {
			@Override
			public void apply(DiscordUser user ) {
		    	 System.out.println("welcome"+user.username+"#"+user.discriminator+".");
		    	 update("Browsing Menu","");
		     }
		     }).build();
		    DiscordRPC.discordInitialize("851484121950715935", handlers, true);
		    new Thread("DISCORD RPC CALLBACK") {
		    	@Override
		    	public void run(){
		    		while(running) {
		    			DiscordRPC.discordRunCallbacks();
		    		}
		    	}
		    }.start();
	}
	public void shutdown() {
     running = false;
     DiscordRPC.discordShutdown();
	}
	public void update(String firstLine, String secondLine) {
		DiscordRichPresence.Builder  b = new DiscordRichPresence.Builder(secondLine);
		b.setBigImage("lupis","");
		b.setDetails(firstLine);
		b.setSmallImage("Large","");
		b.setStartTimestamps(created);
		DiscordRPC.discordUpdatePresence(b.build());
	}
}
