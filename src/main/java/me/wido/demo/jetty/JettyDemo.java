package me.wido.demo.jetty;

import org.eclipse.jetty.xml.XmlConfiguration;



public class JettyDemo {
	public static void main(String... args) throws Exception {
		
		XmlConfiguration.main(new String[] { "src/main/resources/jetty.xml" });
		
//        Resource xml = Resource.newSystemResource("jetty.xml");
//        XmlConfiguration configuration = new XmlConfiguration(xml.getInputStream());
//        Server server = (Server) configuration.configure();
//
//        WebAppContext context = new org.eclipse.jetty.webapp.WebAppContext();
//        context.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern", ".*");
//        context.setContextPath("/");
//        context.setWar("src/main/webapp");
//        
//        
//        server.setHandler(context);
//        server.start();
//        server.join();
	}
}
