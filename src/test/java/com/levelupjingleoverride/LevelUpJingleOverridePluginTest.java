package com.levelupjingleoverride;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LevelUpJingleOverridePluginTest
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("hi");
		ExternalPluginManager.loadBuiltin(LevelUpJingleOverridePlugin.class);
		RuneLite.main(args);
	}
}