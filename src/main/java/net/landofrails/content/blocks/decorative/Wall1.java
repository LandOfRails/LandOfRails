package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Wall1 extends ADecorativeBlock {

	public Wall1() {
		super(Material.rock);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 1");
		desc.add("Image from SeltixSub");
		desc.add("Generated with GIMP");
	}

}
