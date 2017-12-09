package th.ac.kmitl.science.comsci.example;

import th.ac.kmitl.science.comsci.example.utils.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ConfigurationInitServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Configuration.init("webconfig.properties");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
