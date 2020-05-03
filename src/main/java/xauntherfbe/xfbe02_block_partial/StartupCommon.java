package xauntherfbe.xfbe02_block_partial;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**                                                                                                                                                                                                         
 * User: The Grey Ghost                                                                                                                                                                                     
 * Date: 24/12/2014                                                                                                                                                                                         
 *                                                                                                                                                                                                          
 * The Startup classes for this example are called during startup, in the following order:                                                                                                                  
 *  preInitCommon                                                                                                                                                                                           
 *  preInitClientOnly                                                                                                                                                                                       
 *  initCommon                                                                                                                                                                                              
 *  initClientOnly                                                                                                                                                                                          
 *  postInitCommon                                                                                                                                                                                          
 *  postInitClientOnly                                                                                                                                                                                      
 *  See MinecraftByExample class for more information                                                                                                                                                       
 */

public class StartupCommon
{
	public static BlockPartial blockPartial; //Holds the unique instance of the block
	public static ItemBlock itemBlockPartial; //Holds the unique instance of the ItemBlock corresponding to the block
	
	public static void preInitCommon()
	{
		// each instance of your block should have two names:                                            
	    // 1) a registry name that is used to uniquely identify this block.  Should be unique within your mod.  use lower case.                                                                              
	    // 2) an 'unlocalised name' that is used to retrieve the text name of your block in the player'slanguage.  For example-                                                                             
	    //    the unlocalised name might be "water", which is printed on the user's screen as "Wasser" in German or                                                                                          
	    //    "aqua" in Italian.                                                                         
	    //                                                                                               
	    //    Multiple blocks can have the same unlocalised name - for example                           
	    //  +----RegistryName----+---UnlocalisedName----+                                                
	    //  |  flowing_water     +       water          |                                                
	    //  |  stationary_water  +       water          |                                                
	    //  +--------------------+----------------------+                                                
	    //
		blockPartial =new BlockPartial();
		blockPartial.setUnlocalizedName("xfbe02_block_partial");
		blockPartial.setRegistryName("xfbe02_block_partial");
		ForgeRegistries.BLOCKS.register(blockPartial);
		// We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
		itemBlockPartial = new ItemBlock(blockPartial);
		itemBlockPartial.setRegistryName(blockPartial.getRegistryName());
		ForgeRegistries.ITEMS.register(itemBlockPartial);
	}
	
	public static void initCommon()
	{
		
	}
	
	public static void postInitCommon()
	{
		
	}
}
