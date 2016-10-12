package org.infosys.eclbuilderstarter;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Starter {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8090);
		 
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/ECLBuilder");
        webapp.setWar("ECLBuilder.war");
        server.setHandler(webapp);
 
        server.start();
        server.join();
	}

}
