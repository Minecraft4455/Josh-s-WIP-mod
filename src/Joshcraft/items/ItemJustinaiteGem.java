package Joshcraft.items;

import Joshcraft.res.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemJustinaiteGem extends Item{

	public ItemJustinaiteGem(int id) {
		super(id);
		
	}
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir){
		
            this.itemIcon = ir.registerIcon(ModInfo.ID + ":" + "justinaitegem");
           
    }
}
