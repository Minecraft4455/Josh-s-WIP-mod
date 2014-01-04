package Joshcraft.items;

import Joshcraft.res.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class ShovelDimRoseShovel extends ItemSpade{

	public ShovelDimRoseShovel(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		
	}
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir){
            this.itemIcon = ir.registerIcon(ModInfo.ID + ":" + "dimroseshovel");
           
    }

}
