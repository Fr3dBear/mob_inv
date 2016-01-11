package mob_inv_pkg;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public final class mob_inv_listner implements Listener 
{
	//myPlugin.getDataFolder() file read right location
	
	public static HashMap<UUID, Inventory> mob_invs = new HashMap<UUID, Inventory>(); //created temp 
	public static HashMap<UUID, ArrayList<ItemStack>> from_file = new HashMap<UUID, ArrayList<ItemStack>>(); //filled from file
	
	@EventHandler
	public void onEntityDeathEvent(final EntityDeathEvent event)
	{
		event.setDroppedExp(0);
		for(ItemStack i : mob_invs.get(event.getEntity().getUniqueId()))
		{
			event.getDrops().add(i);
		}
	}
	
    @EventHandler
    public void onPlayerInteract(PlayerInteractEntityEvent event) 
    {
    	Entity clicked_entity = event.getRightClicked();
    	if(mob_invs.containsKey(clicked_entity.getUniqueId()))
    	{
    		event.getPlayer().openInventory(mob_invs.get(clicked_entity.getUniqueId()));
    	}
    	else if(from_file.containsKey(clicked_entity.getUniqueId()))
    	{
    		create_inv(clicked_entity.getUniqueId(), event.getPlayer(), event.getRightClicked());
    		event.getPlayer().openInventory(mob_invs.get(clicked_entity.getUniqueId()));
    	}
    	else
    	{	
			if(event.getRightClicked().getType().equals(EntityType.WOLF))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 18, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    			
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.OCELOT))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 18, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    			
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.PIG))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 18, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.HORSE))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 36, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if (event.getRightClicked().getType().equals(EntityType.VILLAGER))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 27, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.ENDER_DRAGON))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 54, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.GHAST))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 27, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.GIANT))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 27, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.BAT))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 9, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.MAGMA_CUBE))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 9, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.SHEEP))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 18, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.COW))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 18, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.MUSHROOM_COW))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 18, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.CHICKEN))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 9, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.SQUID))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 9, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if(event.getRightClicked().getType().equals(EntityType.RABBIT))
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 9, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else if (event.getRightClicked() instanceof Monster) //grabs most mobs slime, ghast, bat, magdma cube, sheep, cow, chicken, ocelot, mooshroom, squid, rabbit, villiger
    		{
    			Inventory temp_inv = Bukkit.createInventory(event.getPlayer(), 9, (event.getRightClicked().getName() + " " + event.getRightClicked().getEntityId()));
    			mob_invs.put(clicked_entity.getUniqueId(), temp_inv);
    		}
    		else{}
    	}
    }
    
    public void create_inv(UUID uuid, Player player, Entity entity)
    {
    	int size = 0;
    	
    	if(entity.getType().equals(EntityType.WOLF))
        {
        	size = 18;
        }
        else if(entity.getType().equals(EntityType.PIG))
        {
        	size = 18;
        }
        else if(entity.getType().equals(EntityType.HORSE))
        {
        	size = 36;
        }
        else if(entity.getType().equals(EntityType.ENDER_DRAGON))
        {
        	size = 54;
        }
        else
        {
        	size = 9;
        }
    	Inventory temp_inv = Bukkit.createInventory(player, size);
    	for(ItemStack i : from_file.get(uuid))
    	{
    		temp_inv.addItem(i);
    	}
    	mob_invs.put(uuid, temp_inv);
    }
}