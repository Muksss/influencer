package com.influencer.constant;

import java.util.HashMap;
import java.util.Map;

public class Keyword {
    private static Map<String, CategoryEnum> dataHolder = new HashMap<>();

    static {
        //Politics
        add("indiafirst", CategoryEnum.POLITICS);
        add("GST", CategoryEnum.POLITICS);
        add("Modi", CategoryEnum.POLITICS);
        add("Army", CategoryEnum.POLITICS);
        add("Tax", CategoryEnum.POLITICS);
        add("proudindian", CategoryEnum.POLITICS);
        add("kashmir", CategoryEnum.POLITICS);
        add("india", CategoryEnum.POLITICS);
        add("kashmiri", CategoryEnum.POLITICS);
        add("kashmiris", CategoryEnum.POLITICS);
        add("sringar", CategoryEnum.POLITICS);
        add("gilgit", CategoryEnum.POLITICS);
        add("pakistan", CategoryEnum.POLITICS);
        add("islamabad", CategoryEnum.POLITICS);
        add("kashmiriyat", CategoryEnum.POLITICS);
        add("mirpur", CategoryEnum.POLITICS);
        add("mirpuri", CategoryEnum.POLITICS);

        //food
        add("food brands", CategoryEnum.FOOD);
        add("britannia", CategoryEnum.FOOD);
        add("macD", CategoryEnum.FOOD);
        add("KFC", CategoryEnum.FOOD);
        add("Dominoes", CategoryEnum.FOOD);
        add("Pizza Hut", CategoryEnum.FOOD);
        add("rasmalai ", CategoryEnum.FOOD);
        add("dessert ", CategoryEnum.FOOD);
        add("sweet ", CategoryEnum.FOOD);
        add("sweettooth ", CategoryEnum.FOOD);
        add("indianblogger ", CategoryEnum.FOOD);
        add("indiansweets ", CategoryEnum.FOOD);
        add("foodporn ", CategoryEnum.FOOD);
        add("dessertporn ", CategoryEnum.FOOD);
        add("foodie ", CategoryEnum.FOOD);
        add("foodblogger ", CategoryEnum.FOOD);
        add("like4like ", CategoryEnum.FOOD);
        add("dailyfoodfeed ", CategoryEnum.FOOD);
        add("hungry ", CategoryEnum.FOOD);
        add("cravings ", CategoryEnum.FOOD);
        add("desifood ", CategoryEnum.FOOD);
        add("delhifood ", CategoryEnum.FOOD);
        add("foodoftheday ", CategoryEnum.FOOD);
        add("desserttable  ", CategoryEnum.FOOD);
        add("curry", CategoryEnum.FOOD);

        //health
        add("milk", CategoryEnum.HEALTH);
        add("protein", CategoryEnum.HEALTH);
        add("eats", CategoryEnum.HEALTH);
        add("picoftheday ", CategoryEnum.HEALTH);
        add("onplan", CategoryEnum.HEALTH);
        add("foodoptimising", CategoryEnum.HEALTH);
        add("weightloss", CategoryEnum.HEALTH);
        add("chicken", CategoryEnum.HEALTH);
        add("asparagus", CategoryEnum.HEALTH);
        add("diet", CategoryEnum.HEALTH);
        add("dietplan", CategoryEnum.HEALTH);
        add("plant", CategoryEnum.HEALTH);
        add("plantbased", CategoryEnum.HEALTH);
        add("plantbaseddiet ", CategoryEnum.HEALTH);
        add("dedication", CategoryEnum.HEALTH);
        add("passion", CategoryEnum.HEALTH);
        add("fav", CategoryEnum.HEALTH);
        add("fitness", CategoryEnum.HEALTH);

        //fashion
        add("earrings", CategoryEnum.FASHION);
        add("import", CategoryEnum.FASHION);
        add("importação", CategoryEnum.FASHION);
        add("joias", CategoryEnum.FASHION);
        add("jewerly", CategoryEnum.FASHION);
        add("moda", CategoryEnum.FASHION);
        add("bohemian", CategoryEnum.FASHION);
        add("gypsy", CategoryEnum.FASHION);
        add("boho", CategoryEnum.FASHION);
        add("estiloboho", CategoryEnum.FASHION);
        add("bohostyle", CategoryEnum.FASHION);
        add("hippie", CategoryEnum.FASHION);
        add("joiasemprata", CategoryEnum.FASHION);
        add("life", CategoryEnum.FASHION);
        add("tiffany", CategoryEnum.FASHION);
        add("pandora", CategoryEnum.FASHION);
        add("atacadodejoias", CategoryEnum.FASHION);
        add("atacadista", CategoryEnum.FASHION);
        add("vendasonline", CategoryEnum.FASHION);
        add("hippiestyle", CategoryEnum.FASHION);
        add("earcuff", CategoryEnum.FASHION);
        add("pedrasnaturais", CategoryEnum.FASHION);
        add("filtrodossonhos ", CategoryEnum.FASHION);
        add("bluenails", CategoryEnum.FASHION);
        add("turquoiseblue", CategoryEnum.FASHION);
        add("kurti", CategoryEnum.FASHION);
        add("desi", CategoryEnum.FASHION);
        add("desigirl", CategoryEnum.FASHION);
        add("suit", CategoryEnum.FASHION);
        add("ootd ", CategoryEnum.FASHION);
        add("missindia", CategoryEnum.FASHION);
        add("model", CategoryEnum.FASHION);
        add("saree", CategoryEnum.FASHION);
        add("jhumkas", CategoryEnum.FASHION);
        add("bindi", CategoryEnum.FASHION);
        add("sexy", CategoryEnum.FASHION);
        add("sexynessoverload", CategoryEnum.FASHION);
        add("stayblessed", CategoryEnum.FASHION);
        add("indiangirltattoo", CategoryEnum.FASHION);
        add("blackandgreytattoo", CategoryEnum.FASHION);
        add("realismtattoo", CategoryEnum.FASHION);
        add("realist", CategoryEnum.FASHION);
        add("tattoobali", CategoryEnum.FASHION);
        add("vivid", CategoryEnum.FASHION);
        add("colourful", CategoryEnum.FASHION);
        add("happy", CategoryEnum.FASHION);
        add("countingmyblessings", CategoryEnum.FASHION);
        add("mynaturalnails", CategoryEnum.FASHION);
        add("colours", CategoryEnum.FASHION);
        add("colorful", CategoryEnum.FASHION);
        add("colors", CategoryEnum.FASHION);
        add("aqua", CategoryEnum.FASHION);

        //travel
        add("beautifulmatters", CategoryEnum.TRAVEL);
        add("travel_drops", CategoryEnum.TRAVEL);
        add("europe_vacations", CategoryEnum.TRAVEL);
        add("best_streetview", CategoryEnum.TRAVEL);
        add("cityview", CategoryEnum.TRAVEL);
        add("seemycity", CategoryEnum.TRAVEL);
        add("cityscape", CategoryEnum.TRAVEL);
        add("tv_living", CategoryEnum.TRAVEL);
        add("super_europe", CategoryEnum.TRAVEL);
        add("welltravelled", CategoryEnum.TRAVEL);
        add("openmyworld", CategoryEnum.TRAVEL);
        add("athomeintheworld", CategoryEnum.TRAVEL);
        add("allthealleys", CategoryEnum.TRAVEL);
        add("europe", CategoryEnum.TRAVEL);
        add("cbviews", CategoryEnum.TRAVEL);
        add("guardiancities", CategoryEnum.TRAVEL);
        add("postcardplaces", CategoryEnum.TRAVEL);
        add("weroamgermany", CategoryEnum.TRAVEL);
        add("lensbible", CategoryEnum.TRAVEL);
        add("travelling", CategoryEnum.TRAVEL);
        add("summer", CategoryEnum.TRAVEL);
        add("exploremore", CategoryEnum.TRAVEL);
        add("traveladdict", CategoryEnum.TRAVEL);
        add("passionpassport", CategoryEnum.TRAVEL);
        add("lonelyplanet", CategoryEnum.TRAVEL);
        add("tasteintravel", CategoryEnum.TRAVEL);
        add("facetnation", CategoryEnum.TRAVEL);
        add("lifeofadventure", CategoryEnum.TRAVEL);
        add("exploringtheglobe", CategoryEnum.TRAVEL);
        add("livefolk", CategoryEnum.TRAVEL);
        add("wildernessculture", CategoryEnum.TRAVEL);
        add("ourplanetdaily", CategoryEnum.TRAVEL);
        add("livetravelchannel ", CategoryEnum.TRAVEL);
        add("travelstoke", CategoryEnum.TRAVEL);
        add("mmmexplore ", CategoryEnum.TRAVEL);
        add("cityscapes", CategoryEnum.TRAVEL);
        add("streetshot", CategoryEnum.TRAVEL);
        add("street", CategoryEnum.TRAVEL);
        add("urban", CategoryEnum.TRAVEL);
        add("dopeshotbro", CategoryEnum.TRAVEL);
        add("streetartfiles", CategoryEnum.TRAVEL);
        add("streetartphotography", CategoryEnum.TRAVEL);
        add("streetarteverywhere", CategoryEnum.TRAVEL);
        add("igersnyc", CategoryEnum.TRAVEL);
        add("instahub", CategoryEnum.TRAVEL);
        add("urbanexploration", CategoryEnum.TRAVEL);
        add("globalstreetart", CategoryEnum.TRAVEL);
        add("streetart_daily", CategoryEnum.TRAVEL);
        add("streetart_official", CategoryEnum.TRAVEL);
    }

    private static void add(String keyword, CategoryEnum category) {
        dataHolder.put(keyword, category);
    }

    public static CategoryEnum getCatagory(String keyword) {
        return dataHolder.get(keyword.toLowerCase());
    }
}
