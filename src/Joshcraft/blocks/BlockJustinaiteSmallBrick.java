package Joshcraft.blocks;

import Joshcraft.res.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockJustinaiteSmallBrick extends Block {

	public BlockJustinaiteSmallBrick(int par1, Material par2Material) {
		super(par1, par2Material);
		
	}
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir){
            this.blockIcon = ir.registerIcon(ModInfo.ID + ":" + "justinaitebricksmall");
           
    }

}
