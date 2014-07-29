package com.lordmortus.rebuildit.Handlers;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Lord Mortus on 7/28/2014.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try
        {
            configuration.load();
            boolean configValue = configuration.get("Some Category", "configValue", true, "Some text").getBoolean(true);
        }
        catch (Exception e)
        {
            // Catch any exceptions  (annotation added to remove empty block notice)
        }
        finally
        {
            if (configuration.hasChanged())
            {
            configuration.save();
            }
        }
    }
}
