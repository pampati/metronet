package com.metronet.base;

import freemarker.core.Environment;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private  Properties properties;

    public ConfigFileReader(){
        EnvironmentVariables variables= SystemEnvironmentVariables.createEnvironmentVariables();
        String env=variables.getProperty("env");
        String propertiesFilePath=System.getProperty("user.dir")+"/config/"+env+".properties";
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(propertiesFilePath));
            properties = new Properties();
            properties.load(reader);
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("config file is not found at"+ propertiesFilePath);
        }

    }
    public String getApplicationUrl(){
        return properties.getProperty("url");
    }
    public String getUsername(){
        return properties.getProperty("username");
    }
    public String getPassword(){
        return properties.getProperty("password");
    }


}