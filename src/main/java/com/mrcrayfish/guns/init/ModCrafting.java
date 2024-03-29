package com.mrcrayfish.guns.init;

import com.mrcrayfish.guns.common.WorkbenchRegistry;
import com.mrcrayfish.guns.item.ItemScope;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;

/**
 * Author: MrCrayfish
 */
public class ModCrafting
{
    @SuppressWarnings("ConstantConditions")
    public static void register()
    {
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.PISTOL),
                new ItemStack(Blocks.IRON_BLOCK, 2));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.DESERT_EAGLE),
                new ItemStack(Blocks.IRON_BLOCK, 2));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.MACHINE_PISTOL),
                new ItemStack(Blocks.IRON_BLOCK, 3));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.SHOTGUN),
                new ItemStack(Blocks.IRON_BLOCK, 5));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.RIFLE),
                new ItemStack(Blocks.IRON_BLOCK, 7),
                new ItemStack(Items.DIAMOND, 1));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.GRENADE_LAUNCHER),
                new ItemStack(Blocks.IRON_BLOCK, 10),
                new ItemStack(Items.REDSTONE, 8 ));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.BAZOOKA),
                new ItemStack(Blocks.IRON_BLOCK, 30),
                new ItemStack(Blocks.REDSTONE_BLOCK, 30 ));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.CHAIN_GUN),
                new ItemStack(Blocks.IRON_BLOCK, 25),
                new ItemStack(Blocks.REDSTONE_BLOCK, 25));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.ASSAULT_RIFLE),
                new ItemStack(Blocks.IRON_BLOCK, 7));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.AUG_A3),
                new ItemStack(Blocks.IRON_BLOCK, 6));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.PNOVENTA),
                new ItemStack(Blocks.IRON_BLOCK, 7));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.PKP_PECHENEG),
                new ItemStack(Blocks.IRON_BLOCK, 12));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.RECORTADA),
                new ItemStack(Blocks.IRON_BLOCK, 6));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.NERF),
                new ItemStack(Blocks.CONCRETE, 10),
                new ItemStack(Items.DYE, 4, EnumDyeColor.ORANGE.getDyeDamage()),
                new ItemStack(Items.DYE, 4, EnumDyeColor.YELLOW.getDyeDamage()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.AK47),
                new ItemStack(Blocks.IRON_BLOCK, 6));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.BASIC_AMMO, 7),
                new ItemStack(Items.GUNPOWDER, 3),
                new ItemStack(Items.IRON_INGOT, 10));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.ADVANCED_AMMO, 6),
                new ItemStack(Items.GUNPOWDER, 5),
                new ItemStack(Items.IRON_INGOT, 10));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.BALA_GOMA, 10),
                new ItemStack(Blocks.WOOL, 3));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.SHELL, 12),
                new ItemStack(Items.GUNPOWDER, 1),
                new ItemStack(Items.GOLD_INGOT, 1),
                new ItemStack(Items.IRON_INGOT, 2));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.GRENADE, 2),
                new ItemStack(Items.GUNPOWDER, 10),
                new ItemStack(Items.IRON_INGOT, 20));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.MISSILE, 2),
                new ItemStack(Items.GUNPOWDER, 64),
                new ItemStack(Items.IRON_INGOT, 64));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.STUN_GRENADE, 2),
                new ItemStack(Items.GLOWSTONE_DUST, 4),
                new ItemStack(Items.GUNPOWDER, 10),
                new ItemStack(Items.IRON_INGOT, 10));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.SCOPES, 1, ItemScope.Type.SMALL.ordinal()),
                new ItemStack(Items.IRON_INGOT, 4),
                new ItemStack(Blocks.GLASS_PANE, 1),
                new ItemStack(Items.DYE, 1, EnumDyeColor.RED.getDyeDamage()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.SCOPES, 1, ItemScope.Type.MEDIUM.ordinal()),
                new ItemStack(Items.IRON_INGOT, 6),
                new ItemStack(Blocks.GLASS_PANE, 2),
                new ItemStack(Items.DYE, 1, EnumDyeColor.BLACK.getDyeDamage()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.SCOPES, 1, ItemScope.Type.LONG.ordinal()),
                new ItemStack(Items.IRON_INGOT, 8),
                new ItemStack(Blocks.GLASS_PANE, 3),
                new ItemStack(Items.DYE, 2, EnumDyeColor.BLACK.getDyeDamage()));
        WorkbenchRegistry.registerRecipe(new ItemStack(ModGuns.SILENCER),
                new ItemStack(Items.IRON_INGOT, 12));
    }
}