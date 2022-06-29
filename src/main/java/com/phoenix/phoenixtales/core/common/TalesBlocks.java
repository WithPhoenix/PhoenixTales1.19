package com.phoenix.phoenixtales.core.common;

import com.phoenix.phoenixtales.core.PhoenixTales;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TalesBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PhoenixTales.MOD_ID);
    
//    public static List<Block> blocks = new ArrayList<>();
//
//    public static final Block REALMSTONE = createBlock("realmstone", new Block(AbstractBlock.Properties.create((Material.ROCK), MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(12f, 12f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE).setRequiresTool()));
//
//    public static final Block SEARING_STONE = createBlock("searing_stone", new Block(AbstractBlock.Properties.create((Material.ROCK), MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(7f, 10f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE).setRequiresTool()));
//    public static final Block SEARING_COBBLESTONE = createBlock("searing_cobblestone", new Block(AbstractBlock.Properties.create((Material.ROCK), MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(8f, 10f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE).setRequiresTool()));
//    public static final Block SEARING_DIRT /*r 122 g 80 b 77*/ = createBlock("searing_dirt", new Block(AbstractBlock.Properties.create(Material.EARTH, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(0.6F).sound(SoundType.GROUND).harvestTool(ToolType.SHOVEL)));
//    public static final Block SEARING_GRASS_BLOCK = createBlock("searing_grass_block", new OriginsGrassBlock(AbstractBlock.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)));
//
//    public static final Block ASHEN_STONE = createBlock("ashen_stone", new Block(AbstractBlock.Properties.create((Material.ROCK), MaterialColor.LIGHT_GRAY).hardnessAndResistance(7f, 10f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE).setRequiresTool()));
//    public static final Block ASHEN_COBBLESTONE = createBlock("ashen_cobblestone", new Block(AbstractBlock.Properties.create((Material.ROCK), MaterialColor.LIGHT_GRAY).hardnessAndResistance(8f, 10f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE).setRequiresTool()));
//    public static final Block ASHEN_DIRT = createBlock("ashen_dirt", new Block(AbstractBlock.Properties.create(Material.EARTH, MaterialColor.CLAY).hardnessAndResistance(0.6f).harvestTool(ToolType.SHOVEL).sound(SoundType.GROUND)));
//    public static final Block ASHEN_GRASS_BLOCK = createBlock("ashen_grass_block", new OriginsGrassBlock(AbstractBlock.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)));
//
////    private static Block createBlock(String id, Block block) {
////        block.(new ResourceLocation(PhoenixTales.MOD_ID, id));
////        blocks.add(block);
////        return block;
////    }
}
