package com.gadgetwrench.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class GadgetWrench extends JavaPlugin {
	
	@Override
    public void onEnable() {
       
    }
   
    @Override
    public void onDisable() {
       
    }
   
    @Override
    public boolean onCommand(CommandSender sender,
            Command command,
            String label,
            String[] args) {
        if (command.getName().equalsIgnoreCase("test")) {
            sender.sendMessage("Test succesful!");
            return true;
        }
        return false;
    }
   
}
