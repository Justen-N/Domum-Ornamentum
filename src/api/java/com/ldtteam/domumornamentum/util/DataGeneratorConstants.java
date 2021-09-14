package com.ldtteam.domumornamentum.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.ldtteam.datagenerators.IJsonSerializable;

public class DataGeneratorConstants
{

    public static final Gson GSON     = new GsonBuilder().disableHtmlEscaping().create();
    public static final Gson GSONLang = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();

    private static final String DATAPACK_DIR = "data/" + Constants.MOD_ID + "/";
    private static final String RESOURCEPACK_DIR = "assets/" + Constants.MOD_ID + "/";

    // DataPack Directories \\

    public static final String LOOT_TABLES_DIR = DATAPACK_DIR + "loot_tables/blocks";

    public static final String TAGS_DIR = DATAPACK_DIR + "tags/";

    public static final String RECIPES_DIR = DATAPACK_DIR + "/recipes/";

    // ResourcePack Directories \\

    public static final String SHINGLES_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/shingle/";
    public static final String PAPERWALLS_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/paperwalls/";
    public static final String FENCES_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/fences/";
    public static final String WALLS_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/walls/";
    public static final String SLABS_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/slabs/";
    public static final String FENCE_GATES_BLOCK_MODELS_DIR =  RESOURCEPACK_DIR + "models/block/fence_gates/";
    public static final String SHINGLE_SLABS_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/shingle_slab/";
    public static final String STAIRS_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/stairs/";
    public static final String FLOATING_CARPETS_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/floating_carpet/";
    public static final String EXTRA_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/extra/";
    public static final String BRICK_BLOCK_MODELS_DIR     = RESOURCEPACK_DIR + "models/block/brick/";
    public static final String TRAPDOORS_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/trapdoors/";
    public static final String DOORS_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/doors/";
    public static final String FANCY_DOORS_BLOCK_MODELS_DIR = DOORS_BLOCK_MODELS_DIR + "fancy/";
    public static final String FANCY_TRAPDOORS_BLOCK_MODELS_DIR = TRAPDOORS_BLOCK_MODELS_DIR + "fancy/";

    public static final String TIMBER_FRAMES_BLOCK_MODELS_DIR = RESOURCEPACK_DIR + "models/block/timber_frames/";

    public static final String EN_US_LANG = RESOURCEPACK_DIR +  "/lang/en_us.json";

    public static final String ITEM_MODEL_DIR = RESOURCEPACK_DIR + "/models/item/";

    public static final String BLOCKSTATE_DIR = RESOURCEPACK_DIR + "blockstates/";

    /**
     * Utility method to add a "message" to the json objects before writing.
     *
     * @param serializable the serializable
     * @return the new jsonElement
     */
    public static JsonElement serialize(IJsonSerializable serializable)
    {
        JsonElement jsonElement = serializable.serialize();
        if (jsonElement.isJsonObject())
            jsonElement.getAsJsonObject().addProperty("READ ME!!!", "DO NOT EDIT THIS FILE. DON'T TOUCH IT, TOUCH IT AND YOU WILL REGRET IT ~~ AshersLab (Use the Data Generators!");
        return jsonElement;
    }
}
