package micdoodle8.mods.galacticraft.core.event;

import com.google.common.collect.ImmutableList;
import micdoodle8.mods.galacticraft.core.Constants;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

import java.util.List;

public class LootHandlerGC
{
    public static ResourceLocation TABLE_CRASHED_PROBE;

    public static void registerAll()
    {
        System.err.println("findthis");
        TABLE_CRASHED_PROBE = register("crashed_probe");
    }

    private static ResourceLocation register(String table)
    {
        return LootTableList.register(new ResourceLocation(Constants.MOD_ID_CORE, table));
    }
}