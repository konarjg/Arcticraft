package com.github.konarjg.arcticraft;

import org.slf4j.Logger;

import com.github.konarjg.arcticraft.registry.Blocks;
import com.github.konarjg.arcticraft.registry.Items;
import com.mojang.logging.LogUtils;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;

@Mod(Main.MODID)
public class Main
{
    public static final String MODID = "arc";
    public static final Logger LOGGER = LogUtils.getLogger();
    
	public static CreativeModeTab TAB;
    
    public Main()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Blocks.BLOCKS.register(modEventBus);
        Items.ITEMS.register(modEventBus);
        
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::registerCreativeTab);
        modEventBus.addListener(this::buildContents);

        MinecraftForge.EVENT_BUS.register(this);
    }
    
	private void registerCreativeTab(final CreativeModeTabEvent.Register event)
	{
		TAB = event.registerCreativeModeTab(new ResourceLocation(Main.MODID, "arcticraft"), configurator -> 
			configurator.icon(() -> new ItemStack(Blocks.HARD_SNOW.get())).title(Component.translatable("item_group." + Main.MODID + ".arcticraft"))
		);
	}
    
    private void buildContents(final CreativeModeTabEvent.BuildContents event)
    {
    	if(event.getTab() == TAB)
    	{
    		for (RegistryObject<Item> item : Items.ITEMS.getEntries())
    			event.accept(item.get());
    	}
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        
    }
}
