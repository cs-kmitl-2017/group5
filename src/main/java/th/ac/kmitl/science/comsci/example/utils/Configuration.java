package th.ac.kmitl.science.comsci.example.utils;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class Configuration {

    private static Configuration instance;
    private static boolean isInitialized = false;

    public static Configuration getInstance() {
        if(instance == null || !isInitialized)
            throw new RuntimeException("Configuration must be initialized by calling Configuration.init() first");
        return instance;
    }

    public static void init(String configurationFile) {
        if(isInitialized) throw new RuntimeException("Configuration is initialized.");
        instance = new Configuration(configurationFile);
        isInitialized = true;
    }

    private final Properties properties = new Properties();

    private Configuration(String configurationFile) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream input = classLoader.getResourceAsStream(configurationFile);
        try {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
