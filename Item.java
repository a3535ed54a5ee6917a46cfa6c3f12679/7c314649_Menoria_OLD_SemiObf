import ca.diiza.i.class_507;
import ca.diiza.i.class_508;
import ca.diiza.i.class_574;
import ca.diiza.i.class_575;
import ca.diiza.i.class_576;
import ca.diiza.i.class_577;
import ca.diiza.i.class_578;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import net.minecraft.item.ItemSuperBow;

public class Item {

   // $FF: renamed from: e cw
   public static final class_1025 field_2329;
   // $FF: renamed from: f java.util.UUID
   protected static final UUID field_2330;
   // $FF: renamed from: a a5
   private class_872 field_2331;
   // $FF: renamed from: g java.util.Random
   protected static Random field_2332;
   // $FF: renamed from: h int
   protected int field_2333;
   // $FF: renamed from: b int
   private int field_2334;
   // $FF: renamed from: i boolean
   protected boolean field_2335;
   // $FF: renamed from: j boolean
   protected boolean field_2336;
   // $FF: renamed from: c adb
   private adb field_2337;
   // $FF: renamed from: d java.lang.String
   private String field_2338;
   // $FF: renamed from: m java.lang.String
   private String field_2339;
   // $FF: renamed from: k vL
   protected class_73 field_2340;
   // $FF: renamed from: l java.lang.String
   protected String field_2341;
   private static final String __OBFID;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_2342;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super();
      this.field_2333 = 64;
   }

   // $FF: renamed from: b (adb) int
   public static int method_2918(adb var0) {
      return var0 == null?0:field_2329.method_5816(var0);
   }

   // $FF: renamed from: d (int) adb
   public static adb method_2919(int var0) {
      return (adb)field_2329.method_5817(var0);
   }

   // $FF: renamed from: a (aji) adb
   public static adb method_2920(aji var0) {
      return method_2919(aji.method_2415(var0));
   }

   // $FF: renamed from: l () void
   public static void method_2921() {
      class_1025 var10000 = field_2329;
      String[] var8 = field_2342;
      class_540 var10003 = new class_540;
      var10003.getBlock15(class_133.field_338);
      var10000.method_5812(256, "iron_shovel", var10003.setUnlocalizedName("shovelIron").method_2979("iron_shovel"));
      var10000 = field_2329;
      class_541 var9 = new class_541;
      var9.getBlock16(class_133.field_338);
      var10000.method_5812(257, "iron_pickaxe", var9.setUnlocalizedName("pickaxeIron").method_2979("iron_pickaxe"));
      var10000 = field_2329;
      class_542 var10 = new class_542;
      var10.getBlock17(class_133.field_338);
      var10000.method_5812(258, "iron_axe", var10.setUnlocalizedName("hatchetIron").method_2979("iron_axe"));
      var10000 = field_2329;
      class_527 var11 = new class_527;
      var11.method_2917();
      var10000.method_5812(259, "flint_and_steel", var11.setUnlocalizedName("flintAndSteel").method_2979("flint_and_steel"));
      var10000 = field_2329;
      class_557 var12 = new class_557;
      var12.getBlock40(4, 0.3F, false);
      var10000.method_5812(260, "apple", var12.setUnlocalizedName("apple").method_2979("apple"));
      var10000 = field_2329;
      class_573 var14 = new class_573;
      var14.method_2917();
      var10000.method_5812(261, "bow", var14.setUnlocalizedName("bow").method_2979("bow"));
      var10000 = field_2329;
      adb var16 = new adb;
      var16.method_2917();
      var10000.method_5812(262, "arrow", var16.setUnlocalizedName("arrow").method_2974(class_872.fontRendererInstance2).method_2979("arrow"));
      var10000 = field_2329;
      class_546 var18 = new class_546;
      var18.method_2917();
      var10000.method_5812(263, "coal", var18.setUnlocalizedName("coal").method_2979("coal"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(264, "diamond", var16.setUnlocalizedName("diamond").method_2974(class_872.fontRendererInstance4).method_2979("diamond"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(265, "iron_ingot", var16.setUnlocalizedName("ingotIron").method_2974(class_872.fontRendererInstance4).method_2979("iron_ingot"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(266, "gold_ingot", var16.setUnlocalizedName("ingotGold").method_2974(class_872.fontRendererInstance4).method_2979("gold_ingot"));
      var10000 = field_2329;
      class_511 var22 = new class_511;
      var22.method_2984(class_133.field_338);
      var10000.method_5812(267, "iron_sword", var22.setUnlocalizedName("swordIron").method_2979("iron_sword"));
      var10000 = field_2329;
      var22 = new class_511;
      var22.method_2984(class_133.field_336);
      var10000.method_5812(268, "wooden_sword", var22.setUnlocalizedName("swordWood").method_2979("wood_sword"));
      var10000 = field_2329;
      var10003 = new class_540;
      var10003.getBlock15(class_133.field_336);
      var10000.method_5812(269, "wooden_shovel", var10003.setUnlocalizedName("shovelWood").method_2979("wood_shovel"));
      var10000 = field_2329;
      var9 = new class_541;
      var9.getBlock16(class_133.field_336);
      var10000.method_5812(270, "wooden_pickaxe", var9.setUnlocalizedName("pickaxeWood").method_2979("wood_pickaxe"));
      var10000 = field_2329;
      var10 = new class_542;
      var10.getBlock17(class_133.field_336);
      var10000.method_5812(271, "wooden_axe", var10.setUnlocalizedName("hatchetWood").method_2979("wood_axe"));
      var10000 = field_2329;
      var22 = new class_511;
      var22.method_2984(class_133.field_337);
      var10000.method_5812(272, "stone_sword", var22.setUnlocalizedName("swordStone").method_2979("stone_sword"));
      var10000 = field_2329;
      var10003 = new class_540;
      var10003.getBlock15(class_133.field_337);
      var10000.method_5812(273, "stone_shovel", var10003.setUnlocalizedName("shovelStone").method_2979("stone_shovel"));
      var10000 = field_2329;
      var9 = new class_541;
      var9.getBlock16(class_133.field_337);
      var10000.method_5812(274, "stone_pickaxe", var9.setUnlocalizedName("pickaxeStone").method_2979("stone_pickaxe"));
      var10000 = field_2329;
      var10 = new class_542;
      var10.getBlock17(class_133.field_337);
      var10000.method_5812(275, "stone_axe", var10.setUnlocalizedName("hatchetStone").method_2979("stone_axe"));
      var10000 = field_2329;
      var22 = new class_511;
      var22.method_2984(class_133.field_339);
      var10000.method_5812(276, "diamond_sword", var22.setUnlocalizedName("swordDiamond").method_2979("diamond_sword"));
      var10000 = field_2329;
      var10003 = new class_540;
      var10003.getBlock15(class_133.field_339);
      var10000.method_5812(277, "diamond_shovel", var10003.setUnlocalizedName("shovelDiamond").method_2979("diamond_shovel"));
      var10000 = field_2329;
      var9 = new class_541;
      var9.getBlock16(class_133.field_339);
      var10000.method_5812(278, "diamond_pickaxe", var9.setUnlocalizedName("pickaxeDiamond").method_2979("diamond_pickaxe"));
      var10000 = field_2329;
      var10 = new class_542;
      var10.getBlock17(class_133.field_339);
      var10000.method_5812(279, "diamond_axe", var10.setUnlocalizedName("hatchetDiamond").method_2979("diamond_axe"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(280, "stick", var16.method_2941().setUnlocalizedName("stick").method_2974(class_872.fontRendererInstance4).method_2979("stick"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(281, "bowl", var16.setUnlocalizedName("bowl").method_2974(class_872.fontRendererInstance4).method_2979("bowl"));
      var10000 = field_2329;
      class_559 var30 = new class_559;
      var30.getBlock49(6);
      var10000.method_5812(282, "mushroom_stew", var30.setUnlocalizedName("mushroomStew").method_2979("mushroom_stew"));
      var10000 = field_2329;
      var22 = new class_511;
      var22.method_2984(class_133.field_340);
      var10000.method_5812(283, "golden_sword", var22.setUnlocalizedName("swordGold").method_2979("gold_sword"));
      var10000 = field_2329;
      var10003 = new class_540;
      var10003.getBlock15(class_133.field_340);
      var10000.method_5812(284, "golden_shovel", var10003.setUnlocalizedName("shovelGold").method_2979("gold_shovel"));
      var10000 = field_2329;
      var9 = new class_541;
      var9.getBlock16(class_133.field_340);
      var10000.method_5812(285, "golden_pickaxe", var9.setUnlocalizedName("pickaxeGold").method_2979("gold_pickaxe"));
      var10000 = field_2329;
      var10 = new class_542;
      var10.getBlock17(class_133.field_340);
      var10000.method_5812(286, "golden_axe", var10.setUnlocalizedName("hatchetGold").method_2979("gold_axe"));
      var10000 = field_2329;
      class_523 var33 = new class_523;
      var33.method_2989(class_1192.field_6156);
      var10000.method_5812(287, "string", var33.setUnlocalizedName("string").method_2974(class_872.fontRendererInstance4).method_2979("string"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(288, "feather", var16.setUnlocalizedName("feather").method_2960(class_1011.field_5368).method_2974(class_872.fontRendererInstance4).method_2979("feather"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(289, "gunpowder", var16.setUnlocalizedName("sulphur").method_2960(class_1011.field_5366).method_2974(class_872.fontRendererInstance4).method_2979("gunpowder"));
      var10000 = field_2329;
      class_555 var36 = new class_555;
      var36.getBlock36(class_133.field_336);
      var10000.method_5812(290, "wooden_hoe", var36.setUnlocalizedName("hoeWood").method_2979("wood_hoe"));
      var10000 = field_2329;
      var36 = new class_555;
      var36.getBlock36(class_133.field_337);
      var10000.method_5812(291, "stone_hoe", var36.setUnlocalizedName("hoeStone").method_2979("stone_hoe"));
      var10000 = field_2329;
      var36 = new class_555;
      var36.getBlock36(class_133.field_338);
      var10000.method_5812(292, "iron_hoe", var36.setUnlocalizedName("hoeIron").method_2979("iron_hoe"));
      var10000 = field_2329;
      var36 = new class_555;
      var36.getBlock36(class_133.field_339);
      var10000.method_5812(293, "diamond_hoe", var36.setUnlocalizedName("hoeDiamond").method_2979("diamond_hoe"));
      var10000 = field_2329;
      var36 = new class_555;
      var36.getBlock36(class_133.field_340);
      var10000.method_5812(294, "golden_hoe", var36.setUnlocalizedName("hoeGold").method_2979("gold_hoe"));
      var10000 = field_2329;
      class_518 var38 = new class_518;
      var38.method_2988(class_1192.field_6086, class_1192.field_6087);
      var10000.method_5812(295, "wheat_seeds", var38.setUnlocalizedName("seeds").method_2979("seeds_wheat"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(296, "wheat", var16.setUnlocalizedName("wheat").method_2974(class_872.fontRendererInstance4).method_2979("wheat"));
      var10000 = field_2329;
      var12 = new class_557;
      var12.getBlock40(5, 0.6F, false);
      var10000.method_5812(297, "bread", var12.setUnlocalizedName("bread").method_2979("bread"));
      var10000 = field_2329;
      class_525 var40 = new class_525;
      var40.method_2990(class_131.field_306, 0, 0);
      var10000.method_5812(298, "leather_helmet", var40.setUnlocalizedName("helmetCloth").method_2979("leather_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_306, 0, 1);
      var10000.method_5812(299, "leather_chestplate", var40.setUnlocalizedName("chestplateCloth").method_2979("leather_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_306, 0, 2);
      var10000.method_5812(300, "leather_leggings", var40.setUnlocalizedName("leggingsCloth").method_2979("leather_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_306, 0, 3);
      var10000.method_5812(301, "leather_boots", var40.setUnlocalizedName("bootsCloth").method_2979("leather_boots"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_307, 1, 0);
      var10000.method_5812(302, "chainmail_helmet", var40.setUnlocalizedName("helmetChain").method_2979("chainmail_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_307, 1, 1);
      var10000.method_5812(303, "chainmail_chestplate", var40.setUnlocalizedName("chestplateChain").method_2979("chainmail_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_307, 1, 2);
      var10000.method_5812(304, "chainmail_leggings", var40.setUnlocalizedName("leggingsChain").method_2979("chainmail_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_307, 1, 3);
      var10000.method_5812(305, "chainmail_boots", var40.setUnlocalizedName("bootsChain").method_2979("chainmail_boots"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_308, 2, 0);
      var10000.method_5812(306, "iron_helmet", var40.setUnlocalizedName("helmetIron").method_2979("iron_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_308, 2, 1);
      var10000.method_5812(307, "iron_chestplate", var40.setUnlocalizedName("chestplateIron").method_2979("iron_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_308, 2, 2);
      var10000.method_5812(308, "iron_leggings", var40.setUnlocalizedName("leggingsIron").method_2979("iron_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_308, 2, 3);
      var10000.method_5812(309, "iron_boots", var40.setUnlocalizedName("bootsIron").method_2979("iron_boots"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_310, 3, 0);
      var10000.method_5812(310, "diamond_helmet", var40.setUnlocalizedName("helmetDiamond").method_2979("diamond_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_310, 3, 1);
      var10000.method_5812(311, "diamond_chestplate", var40.setUnlocalizedName("chestplateDiamond").method_2979("diamond_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_310, 3, 2);
      var10000.method_5812(312, "diamond_leggings", var40.setUnlocalizedName("leggingsDiamond").method_2979("diamond_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_310, 3, 3);
      var10000.method_5812(313, "diamond_boots", var40.setUnlocalizedName("bootsDiamond").method_2979("diamond_boots"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_309, 4, 0);
      var10000.method_5812(314, "golden_helmet", var40.setUnlocalizedName("helmetGold").method_2979("gold_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_309, 4, 1);
      var10000.method_5812(315, "golden_chestplate", var40.setUnlocalizedName("chestplateGold").method_2979("gold_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_309, 4, 2);
      var10000.method_5812(316, "golden_leggings", var40.setUnlocalizedName("leggingsGold").method_2979("gold_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.field_309, 4, 3);
      var10000.method_5812(317, "golden_boots", var40.setUnlocalizedName("bootsGold").method_2979("gold_boots"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(318, "flint", var16.setUnlocalizedName("flint").method_2974(class_872.fontRendererInstance4).method_2979("flint"));
      var10000 = field_2329;
      var12 = new class_557;
      var12.getBlock40(3, 0.3F, true);
      var10000.method_5812(319, "porkchop", var12.setUnlocalizedName("porkchopRaw").method_2979("porkchop_raw"));
      var10000 = field_2329;
      var12 = new class_557;
      var12.getBlock40(8, 0.8F, true);
      var10000.method_5812(320, "cooked_porkchop", var12.setUnlocalizedName("porkchopCooked").method_2979("porkchop_cooked"));
      var10000 = field_2329;
      class_556 var53 = new class_556;
      var53.getBlock38(class_749.class);
      var10000.method_5812(321, "painting", var53.setUnlocalizedName("painting").method_2979("painting"));
      var10000 = field_2329;
      class_561 var54 = new class_561;
      var54.getBlock40(4, 1.2F, false);
      var10000.method_5812(322, "golden_apple", var54.getBlock47().getBlock46(class_1635.field_8500.field_8526, 5, 1, 1.0F).setUnlocalizedName("appleGold").method_2979("apple_golden"));
      var10000 = field_2329;
      class_516 var55 = new class_516;
      var55.method_2917();
      var10000.method_5812(323, "sign", var55.setUnlocalizedName("sign").method_2979("sign"));
      var10000 = field_2329;
      class_538 var57 = new class_538;
      var57.getBlock10(awt.field_4173);
      var10000.method_5812(324, "wooden_door", var57.setUnlocalizedName("doorWood").method_2979("door_wood"));
      class_548 var49 = new class_548;
      var49.getBlock22(class_1192.field_6025);
      adb var2 = var49.setUnlocalizedName("bucket").method_2922(16).method_2979("bucket_empty");
      field_2329.method_5812(325, "bucket", var2);
      var10000 = field_2329;
      class_548 var59 = new class_548;
      var59.getBlock22(class_1192.field_6033);
      var10000.method_5812(326, "water_bucket", var59.setUnlocalizedName("bucketWater").method_2948(var2).method_2979("bucket_water"));
      var10000 = field_2329;
      var59 = new class_548;
      var59.getBlock22(class_1192.field_6035);
      var10000.method_5812(327, "lava_bucket", var59.setUnlocalizedName("bucketLava").method_2948(var2).method_2979("bucket_lava"));
      var10000 = field_2329;
      class_552 var62 = new class_552;
      var62.getBlock34(0);
      var10000.method_5812(328, "minecart", var62.setUnlocalizedName("minecart").method_2979("minecart_normal"));
      String[] var52 = class_752.method_4253();
      class_1025 var10001 = field_2329;
      class_519 var10004 = new class_519;
      var10004.method_2917();
      var10001.method_5812(329, "saddle", var10004.setUnlocalizedName("saddle").method_2979("saddle"));
      var10001 = field_2329;
      class_538 var13 = new class_538;
      var13.getBlock10(awt.field_4175);
      var10001.method_5812(330, "iron_door", var13.setUnlocalizedName("doorIron").method_2979("door_iron"));
      var10001 = field_2329;
      class_526 var15 = new class_526;
      var15.method_2917();
      var10001.method_5812(331, "redstone", var15.setUnlocalizedName("redstone").method_2960(class_1011.field_5364).method_2979("redstone_dust"));
      var10001 = field_2329;
      class_513 var17 = new class_513;
      var17.method_2917();
      var10001.method_5812(332, "snowball", var17.setUnlocalizedName("snowball").method_2979("snowball"));
      var10001 = field_2329;
      class_522 var19 = new class_522;
      var19.method_2917();
      var10001.method_5812(333, "boat", var19.setUnlocalizedName("boat").method_2979("boat"));
      var10001 = field_2329;
      adb var20 = new adb;
      var20.method_2917();
      var10001.method_5812(334, "leather", var20.setUnlocalizedName("leather").method_2974(class_872.fontRendererInstance4).method_2979("leather"));
      var10001 = field_2329;
      class_553 var21 = new class_553;
      var21.method_2917();
      var10001.method_5812(335, "milk_bucket", var21.setUnlocalizedName("milk").method_2948(var2).method_2979("bucket_milk"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(336, "brick", var20.setUnlocalizedName("brick").method_2974(class_872.fontRendererInstance4).method_2979("brick"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(337, "clay_ball", var20.setUnlocalizedName("clay").method_2974(class_872.fontRendererInstance4).method_2979("clay_ball"));
      var10001 = field_2329;
      class_523 var23 = new class_523;
      var23.method_2989(class_1192.field_6109);
      var10001.method_5812(338, "reeds", var23.setUnlocalizedName("reeds").method_2974(class_872.fontRendererInstance4).method_2979("reeds"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(339, "paper", var20.setUnlocalizedName("paper").method_2974(class_872.field_4248).method_2979("paper"));
      var10001 = field_2329;
      class_521 var24 = new class_521;
      var24.method_2917();
      var10001.method_5812(340, "book", var24.setUnlocalizedName("book").method_2974(class_872.field_4248).method_2979("book_normal"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(341, "slime_ball", var20.setUnlocalizedName("slimeball").method_2974(class_872.field_4248).method_2979("slimeball"));
      var10001 = field_2329;
      class_552 var25 = new class_552;
      var25.getBlock34(1);
      var10001.method_5812(342, "chest_minecart", var25.setUnlocalizedName("minecartChest").method_2979("minecart_chest"));
      var10001 = field_2329;
      class_536 var26 = new class_536;
      var26.method_2917();
      var10001.method_5812(344, "egg", var26.setUnlocalizedName("egg").method_2979("egg"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(345, "compass", var20.setUnlocalizedName("compass").method_2974(class_872.fontRendererInstance1).method_2979("compass"));
      var10001 = field_2329;
      class_528 var27 = new class_528;
      var27.method_2917();
      var10001.method_5812(346, "fishing_rod", var27.setUnlocalizedName("fishingRod").method_2979("fishing_rod"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(347, "clock", var20.setUnlocalizedName("clock").method_2974(class_872.fontRendererInstance1).method_2979("clock"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(348, "glowstone_dust", var20.setUnlocalizedName("yellowDust").method_2960(class_1011.field_5365).method_2974(class_872.fontRendererInstance4).method_2979("glowstone_dust"));
      var10001 = field_2329;
      class_558 var28 = new class_558;
      var28.getBlock48(false);
      var10001.method_5812(349, "fish", var28.setUnlocalizedName("fish").method_2979("fish_raw").method_2933(true));
      var10001 = field_2329;
      var28 = new class_558;
      var28.getBlock48(true);
      var10001.method_5812(350, "cooked_fished", var28.setUnlocalizedName("fish").method_2979("fish_cooked").method_2933(true));
      var10001 = field_2329;
      class_537 var29 = new class_537;
      var29.method_2917();
      var10001.method_5812(351, "dye", var29.setUnlocalizedName("dyePowder").method_2979("dye_powder"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(352, "bone", var20.setUnlocalizedName("bone").method_2941().method_2974(class_872.field_4248).method_2979("bone"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(353, "sugar", var20.setUnlocalizedName("sugar").method_2960(class_1011.field_5357).method_2974(class_872.fontRendererInstance4).method_2979("sugar"));
      var10001 = field_2329;
      var23 = new class_523;
      var23.method_2989(class_1192.field_6118);
      var10001.method_5812(354, "cake", var23.method_2922(1).setUnlocalizedName("cake").method_2974(class_872.fontRendererInstance0).method_2979("cake"));
      var10001 = field_2329;
      class_524 var31 = new class_524;
      var31.method_2917();
      var10001.method_5812(355, "bed", var31.method_2922(1).setUnlocalizedName("bed").method_2979("bed"));
      var10001 = field_2329;
      var23 = new class_523;
      var23.method_2989(class_1192.field_6119);
      var10001.method_5812(356, "repeater", var23.setUnlocalizedName("diode").method_2974(class_872.field_4246).method_2979("repeater"));
      var10001 = field_2329;
      class_557 var32 = new class_557;
      var32.getBlock40(2, 0.1F, false);
      var10001.method_5812(357, "cookie", var32.setUnlocalizedName("cookie").method_2979("cookie"));
      var10001 = field_2329;
      class_544 var34 = new class_544;
      var34.method_2917();
      var10001.method_5812(358, "filled_map", var34.setUnlocalizedName("map").method_2979("map_filled"));
      var10001 = field_2329;
      class_517 var35 = new class_517;
      var35.method_2917();
      var10001.method_5812(359, "shears", var35.setUnlocalizedName("shears").method_2979("shears"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(2, 0.3F, false);
      var10001.method_5812(360, "melon", var32.setUnlocalizedName("melon").method_2979("melon"));
      var10001 = field_2329;
      class_518 var37 = new class_518;
      var37.method_2988(class_1192.field_6129, class_1192.field_6087);
      var10001.method_5812(361, "pumpkin_seeds", var37.setUnlocalizedName("seeds_pumpkin").method_2979("seeds_pumpkin"));
      var10001 = field_2329;
      var37 = new class_518;
      var37.method_2988(class_1192.field_6130, class_1192.field_6087);
      var10001.method_5812(362, "melon_seeds", var37.setUnlocalizedName("seeds_melon").method_2979("seeds_melon"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(3, 0.3F, true);
      var10001.method_5812(363, "beef", var32.setUnlocalizedName("beefRaw").method_2979("beef_raw"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(8, 0.8F, true);
      var10001.method_5812(364, "cooked_beef", var32.setUnlocalizedName("beefCooked").method_2979("beef_cooked"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(2, 0.3F, true);
      var10001.method_5812(365, "chicken", var32.getBlock46(class_1635.field_8507.field_8526, 30, 0, 0.3F).setUnlocalizedName("chickenRaw").method_2979("chicken_raw"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(6, 0.6F, true);
      var10001.method_5812(366, "cooked_chicken", var32.setUnlocalizedName("chickenCooked").method_2979("chicken_cooked"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(4, 0.1F, true);
      var10001.method_5812(367, "rotten_flesh", var32.getBlock46(class_1635.field_8507.field_8526, 30, 0, 0.8F).setUnlocalizedName("rottenFlesh").method_2979("rotten_flesh"));
      var10001 = field_2329;
      class_533 var39 = new class_533;
      var39.method_2917();
      var10001.method_5812(368, "ender_pearl", var39.setUnlocalizedName("enderPearl").method_2960(class_1011.field_5369).method_2979("ender_pearl"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(369, "blaze_rod", var20.setUnlocalizedName("blazeRod").method_2974(class_872.fontRendererInstance4).method_2979("blaze_rod"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(370, "ghast_tear", var20.setUnlocalizedName("ghastTear").method_2960("+0-1-2-3&4-4+13").method_2974(class_872.fontRendererInstance3).method_2979("ghast_tear"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(371, "gold_nugget", var20.setUnlocalizedName("goldNugget").method_2974(class_872.fontRendererInstance4).method_2979("gold_nugget"));
      var10001 = field_2329;
      var37 = new class_518;
      var37.method_2988(class_1192.field_6140, class_1192.field_6114);
      var10001.method_5812(372, "nether_wart", var37.setUnlocalizedName("netherStalkSeeds").method_2960("+4").method_2979("nether_wart"));
      var10001 = field_2329;
      class_550 var41 = new class_550;
      var41.method_2917();
      var10001.method_5812(373, "potion", var41.setUnlocalizedName("potion").method_2979("potion"));
      var10001 = field_2329;
      class_520 var42 = new class_520;
      var42.method_2917();
      var10001.method_5812(374, "glass_bottle", var42.setUnlocalizedName("glassBottle").method_2979("potion_bottle_empty"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(2, 0.8F, false);
      var10001.method_5812(375, "spider_eye", var32.getBlock46(class_1635.field_8509.field_8526, 5, 0, 1.0F).setUnlocalizedName("spiderEye").method_2960(class_1011.field_5359).method_2979("spider_eye"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(376, "fermented_spider_eye", var20.setUnlocalizedName("fermentedSpiderEye").method_2960(class_1011.field_5360).method_2974(class_872.fontRendererInstance3).method_2979("spider_eye_fermented"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(377, "blaze_powder", var20.setUnlocalizedName("blazePowder").method_2960(class_1011.field_5362).method_2974(class_872.fontRendererInstance3).method_2979("blaze_powder"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(378, "magma_cream", var20.setUnlocalizedName("magmaCream").method_2960(class_1011.field_5363).method_2974(class_872.fontRendererInstance3).method_2979("magma_cream"));
      var10001 = field_2329;
      var23 = new class_523;
      var23.method_2989(class_1192.field_6142);
      var10001.method_5812(379, "brewing_stand", var23.setUnlocalizedName("brewingStand").method_2974(class_872.fontRendererInstance3).method_2979("brewing_stand"));
      var10001 = field_2329;
      class_534 var43 = new class_534;
      var43.method_2917();
      var10001.method_5812(381, "ender_eye", var43.setUnlocalizedName("eyeOfEnder").method_2979("ender_eye"));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(382, "speckled_melon", var20.setUnlocalizedName("speckledMelon").method_2960(class_1011.field_5361).method_2974(class_872.fontRendererInstance3).method_2979("melon_speckled"));
      var10001 = field_2329;
      class_512 var44 = new class_512;
      var44.method_2917();
      var10001.method_5812(383, "spawn_egg", var44.setUnlocalizedName("monsterPlacer").method_2979("spawn_egg"));
      var10001 = field_2329;
      class_532 var45 = new class_532;
      var45.method_2917();
      var10001.method_5812(384, "experience_bottle", var45.setUnlocalizedName("expBottle").method_2979("experience_bottle"));
      var10001 = field_2329;
      class_531 var46 = new class_531;
      var46.method_2917();
      var10001.method_5812(385, "fire_charge", var46.setUnlocalizedName("fireball").method_2979("fireball"));
      var10001 = field_2329;
      class_510 var47 = new class_510;
      var47.method_2917();
      var10001.method_5812(386, "writable_book", var47.setUnlocalizedName("writingBook").method_2974(class_872.field_4248).method_2979("book_writable"));
      var10001 = field_2329;
      class_509 var48 = new class_509;
      var48.method_2917();
      var10001.method_5812(387, "written_book", var48.setUnlocalizedName("writtenBook").method_2979("book_written").method_2922(16));
      var10001 = field_2329;
      var20 = new adb;
      var20.method_2917();
      var10001.method_5812(388, "emerald", var20.setUnlocalizedName("emerald").method_2974(class_872.fontRendererInstance4).method_2979("emerald"));
      var10001 = field_2329;
      class_556 var50 = new class_556;
      var50.getBlock38(class_751.class);
      var10001.method_5812(389, "item_frame", var50.setUnlocalizedName("frame").method_2979("item_frame"));
      var10001 = field_2329;
      var23 = new class_523;
      var23.method_2989(class_1192.field_6164);
      var10001.method_5812(390, "flower_pot", var23.setUnlocalizedName("flowerPot").method_2974(class_872.field_4245).method_2979("flower_pot"));
      var10001 = field_2329;
      class_560 var51 = new class_560;
      var51.getBlock50(4, 0.6F, class_1192.field_6165, class_1192.field_6087);
      var10001.method_5812(391, "carrot", var51.setUnlocalizedName("carrots").method_2979("carrot"));
      var10001 = field_2329;
      var51 = new class_560;
      var51.getBlock50(1, 0.3F, class_1192.field_6166, class_1192.field_6087);
      var10001.method_5812(392, "potato", var51.setUnlocalizedName("potato").method_2979("potato"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(6, 0.6F, false);
      var10001.method_5812(393, "baked_potato", var32.setUnlocalizedName("potatoBaked").method_2979("potato_baked"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(2, 0.3F, false);
      var10001.method_5812(394, "poisonous_potato", var32.getBlock46(class_1635.field_8509.field_8526, 5, 0, 0.6F).setUnlocalizedName("potatoPoisonous").method_2979("potato_poisonous"));
      var10001 = field_2329;
      class_545 var56 = new class_545;
      var56.method_2917();
      var10001.method_5812(395, "map", var56.setUnlocalizedName("emptyMap").method_2979("map_empty"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(6, 1.2F, false);
      var10001.method_5812(396, "golden_carrot", var32.setUnlocalizedName("carrotGolden").method_2960(class_1011.field_5367).method_2979("carrot_golden"));
      var10001 = field_2329;
      class_514 var60 = new class_514;
      var60.method_2917();
      var10001.method_5812(397, "skull", var60.setUnlocalizedName("skull").method_2979("skull"));
      var10001 = field_2329;
      class_547 var61 = new class_547;
      var61.method_2917();
      var10001.method_5812(398, "carrot_on_a_stick", var61.setUnlocalizedName("carrotOnAStick").method_2979("carrot_on_a_stick"));
      var10001 = field_2329;
      class_515 var63 = new class_515;
      var63.method_2917();
      var10001.method_5812(399, "nether_star", var63.setUnlocalizedName("netherStar").method_2974(class_872.fontRendererInstance4).method_2979("nether_star"));
      var10001 = field_2329;
      var32 = new class_557;
      var32.getBlock40(8, 0.3F, false);
      var10001.method_5812(400, "pumpkin_pie", var32.setUnlocalizedName("pumpkinPie").method_2974(class_872.fontRendererInstance0).method_2979("pumpkin_pie"));
      var10001 = field_2329;
      class_529 var65 = new class_529;
      var65.method_2917();
      var10001.method_5812(401, "fireworks", var65.setUnlocalizedName("fireworks").method_2979("fireworks"));
      var10001 = field_2329;
      class_530 var66 = new class_530;
      var66.method_2917();
      var10001.method_5812(402, "firework_charge", var66.setUnlocalizedName("fireworksCharge").method_2974(class_872.field_4248).method_2979("fireworks_charge"));
      var10001 = field_2329;
      class_535 var67 = new class_535;
      var67.method_2917();
      var10001.method_5812(403, "enchanted_book", var67.method_2922(1).setUnlocalizedName("enchantedBook").method_2979("book_enchanted"));
      var10001 = field_2329;
      var23 = new class_523;
      var23.method_2989(class_1192.field_6173);
      var10001.method_5812(404, "comparator", var23.setUnlocalizedName("comparator").method_2974(class_872.field_4246).method_2979("comparator"));
      String[] var0 = var52;
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(405, "netherbrick", var16.setUnlocalizedName("netherbrick").method_2974(class_872.fontRendererInstance4).method_2979("netherbrick"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(406, "quartz", var16.setUnlocalizedName("netherquartz").method_2974(class_872.fontRendererInstance4).method_2979("quartz"));
      var10000 = field_2329;
      var62 = new class_552;
      var62.getBlock34(3);
      var10000.method_5812(407, "tnt_minecart", var62.setUnlocalizedName("minecartTnt").method_2979("minecart_tnt"));
      var10000 = field_2329;
      var62 = new class_552;
      var62.getBlock34(5);
      var10000.method_5812(408, "hopper_minecart", var62.setUnlocalizedName("minecartHopper").method_2979("minecart_hopper"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(417, "iron_horse_armor", var16.setUnlocalizedName("horsearmormetal").method_2922(1).method_2974(class_872.field_4248).method_2979("iron_horse_armor"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(418, "golden_horse_armor", var16.setUnlocalizedName("horsearmorgold").method_2922(1).method_2974(class_872.field_4248).method_2979("gold_horse_armor"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(419, "diamond_horse_armor", var16.setUnlocalizedName("horsearmordiamond").method_2922(1).method_2974(class_872.field_4248).method_2979("diamond_horse_armor"));
      var10000 = field_2329;
      class_554 var68 = new class_554;
      var68.method_2917();
      var10000.method_5812(420, "lead", var68.setUnlocalizedName("leash").method_2979("lead"));
      var10000 = field_2329;
      class_551 var69 = new class_551;
      var69.method_2917();
      var10000.method_5812(421, "name_tag", var69.setUnlocalizedName("nameTag").method_2979("name_tag"));
      var10000 = field_2329;
      var62 = new class_552;
      var62.getBlock34(6);
      var10000.method_5812(422, "command_block_minecart", var62.setUnlocalizedName("minecartCommandBlock").method_2979("minecart_command_block").method_2974((class_872)null));
      var10000 = field_2329;
      class_549 var70 = new class_549;
      var70.getBlock25("13");
      var10000.method_5812(2256, "record_13", var70.setUnlocalizedName("record").method_2979("record_13"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("cat");
      var10000.method_5812(2257, "record_cat", var70.setUnlocalizedName("record").method_2979("record_cat"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("blocks");
      var10000.method_5812(2258, "record_blocks", var70.setUnlocalizedName("record").method_2979("record_blocks"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("chirp");
      var10000.method_5812(2259, "record_chirp", var70.setUnlocalizedName("record").method_2979("record_chirp"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("far");
      var10000.method_5812(2260, "record_far", var70.setUnlocalizedName("record").method_2979("record_far"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("mall");
      var10000.method_5812(2261, "record_mall", var70.setUnlocalizedName("record").method_2979("record_mall"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("mellohi");
      var10000.method_5812(2262, "record_mellohi", var70.setUnlocalizedName("record").method_2979("record_mellohi"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("stal");
      var10000.method_5812(2263, "record_stal", var70.setUnlocalizedName("record").method_2979("record_stal"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("strad");
      var10000.method_5812(2264, "record_strad", var70.setUnlocalizedName("record").method_2979("record_strad"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("ward");
      var10000.method_5812(2265, "record_ward", var70.setUnlocalizedName("record").method_2979("record_ward"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("11");
      var10000.method_5812(2266, "record_11", var70.setUnlocalizedName("record").method_2979("record_11"));
      var10000 = field_2329;
      var70 = new class_549;
      var70.getBlock25("wait");
      var10000.method_5812(2267, "record_wait", var70.setUnlocalizedName("record").method_2979("record_wait"));
      var10000 = field_2329;
      var22 = new class_511;
      var22.method_2984(class_133.OBSIDIAN);
      var10000.method_5812(500, "obsidian_sword", var22.setUnlocalizedName("swordObsidian").method_2979("obsidian_sword"));
      var10000 = field_2329;
      var22 = new class_511;
      var22.method_2984(class_133.TITANE);
      var10000.method_5812(501, "titane_sword", var22.setUnlocalizedName("swordTitane").method_2979("titane_sword"));
      var10000 = field_2329;
      var22 = new class_511;
      var22.method_2984(class_133.EXONITE);
      var10000.method_5812(502, "exonite_sword", var22.setUnlocalizedName("swordExonite").method_2979("exonite_sword"));
      var10000 = field_2329;
      var22 = new class_511;
      var22.method_2984(class_133.AMBRE);
      var10000.method_5812(503, "ambre_sword", var22.setUnlocalizedName("swordAmbre").method_2979("ambre_sword"));
      var10000 = field_2329;
      var22 = new class_511;
      var22.method_2984(class_133.MENORIUM);
      var10000.method_5812(504, "menorium_sword", var22.setUnlocalizedName("swordMenorium").method_2979("menorium_sword"));
      var10000 = field_2329;
      var22 = new class_511;
      var22.method_2984(class_133.RENFORCED);
      var10000.method_5812(505, "dagger_ambre", var22.setUnlocalizedName("daggerAmbre").method_2979("daggerAmbre"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.OBSIDIAN, 5, 0);
      var10000.method_5812(506, "obsidian_helmet", var40.setUnlocalizedName("helmetObsidian").method_2979("obsidian_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.OBSIDIAN, 5, 1);
      var10000.method_5812(507, "obsidian_chestplate", var40.setUnlocalizedName("chestplateObsidian").method_2979("obsidian_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.OBSIDIAN, 5, 2);
      var10000.method_5812(508, "obsidian_leggings", var40.setUnlocalizedName("leggingsObsidian").method_2979("obsidian_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.OBSIDIAN, 5, 3);
      var10000.method_5812(509, "obsidian_boots", var40.setUnlocalizedName("bootsObsidian").method_2979("obsidian_boots"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.TITANE, 6, 0);
      var10000.method_5812(510, "titane_helmet", var40.setUnlocalizedName("helmetTitane").method_2979("titane_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.TITANE, 6, 1);
      var10000.method_5812(511, "titane_chestplate", var40.setUnlocalizedName("chestplateTitane").method_2979("titane_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.TITANE, 6, 2);
      var10000.method_5812(512, "titane_leggings", var40.setUnlocalizedName("leggingsTitane").method_2979("titane_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.TITANE, 6, 3);
      var10000.method_5812(513, "titane_boots", var40.setUnlocalizedName("bootsTitane").method_2979("titane_boots"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.EXONITE, 7, 0);
      var10000.method_5812(514, "exonite_helmet", var40.setUnlocalizedName("helmetExonite").method_2979("exonite_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.EXONITE, 7, 1);
      var10000.method_5812(515, "exonite_chestplate", var40.setUnlocalizedName("chestplateExonite").method_2979("exonite_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.EXONITE, 7, 2);
      var10000.method_5812(516, "exonite_leggings", var40.setUnlocalizedName("leggingsExonite").method_2979("exonite_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.EXONITE, 7, 3);
      var10000.method_5812(517, "exonite_boots", var40.setUnlocalizedName("bootsExonite").method_2979("exonite_boots"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.AMBRE, 8, 0);
      var10000.method_5812(518, "ambre_helmet", var40.setUnlocalizedName("helmetAmbre").method_2979("ambre_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.AMBRE, 8, 1);
      var10000.method_5812(519, "ambre_chestplate", var40.setUnlocalizedName("chestplateAmbre").method_2979("ambre_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.AMBRE, 8, 2);
      var10000.method_5812(520, "ambre_leggings", var40.setUnlocalizedName("leggingsAmbre").method_2979("ambre_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.AMBRE, 8, 3);
      var10000.method_5812(521, "ambre_boots", var40.setUnlocalizedName("bootsAmbre").method_2979("ambre_boots"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.MENORIUM, 9, 0);
      var10000.method_5812(522, "menorium_helmet", var40.setUnlocalizedName("helmetMenorium").method_2979("menorium_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.MENORIUM, 9, 1);
      var10000.method_5812(523, "menorium_chestplate", var40.setUnlocalizedName("chestplateMenorium").method_2979("menorium_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.MENORIUM, 9, 2);
      var10000.method_5812(524, "menorium_leggings", var40.setUnlocalizedName("leggingsMenorium").method_2979("menorium_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.MENORIUM, 9, 3);
      var10000.method_5812(525, "menorium_boots", var40.setUnlocalizedName("bootsMenorium").method_2979("menorium_boots"));
      var10000 = field_2329;
      var36 = new class_555;
      var36.getBlock36(class_133.OBSIDIAN);
      var10000.method_5812(526, "obsidian_hoe", var36.setUnlocalizedName("hoeObsidian").method_2979("obsidian_hoe"));
      var10000 = field_2329;
      var10003 = new class_540;
      var10003.getBlock15(class_133.OBSIDIAN);
      var10000.method_5812(527, "obsidian_shovel", var10003.setUnlocalizedName("shovelObsidian").method_2979("obsidian_shovel"));
      var10000 = field_2329;
      var9 = new class_541;
      var9.getBlock16(class_133.OBSIDIAN);
      var10000.method_5812(528, "obsidian_pickaxe", var9.setUnlocalizedName("pickaxeObsidian").method_2979("obsidian_pickaxe"));
      var10000 = field_2329;
      var10 = new class_542;
      var10.getBlock17(class_133.OBSIDIAN);
      var10000.method_5812(529, "obsidian_axe", var10.setUnlocalizedName("hatchetObsidian").method_2979("obsidian_axe"));
      var10000 = field_2329;
      var36 = new class_555;
      var36.getBlock36(class_133.TITANE);
      var10000.method_5812(530, "titane_hoe", var36.setUnlocalizedName("hoeTitane").method_2979("titane_hoe"));
      var10000 = field_2329;
      var10003 = new class_540;
      var10003.getBlock15(class_133.TITANE);
      var10000.method_5812(531, "titane_shovel", var10003.setUnlocalizedName("shovelTitane").method_2979("titane_shovel"));
      var10000 = field_2329;
      var9 = new class_541;
      var9.getBlock16(class_133.TITANE);
      var10000.method_5812(532, "titane_pickaxe", var9.setUnlocalizedName("pickaxeTitane").method_2979("titane_pickaxe"));
      var10000 = field_2329;
      var10 = new class_542;
      var10.getBlock17(class_133.TITANE);
      var10000.method_5812(533, "titane_axe", var10.setUnlocalizedName("hatchetTitane").method_2979("titane_axe"));
      var10000 = field_2329;
      var36 = new class_555;
      var36.getBlock36(class_133.EXONITE);
      var10000.method_5812(534, "exonite_hoe", var36.setUnlocalizedName("hoeExonite").method_2979("exonite_hoe"));
      var10000 = field_2329;
      var10003 = new class_540;
      var10003.getBlock15(class_133.EXONITE);
      var10000.method_5812(535, "exonite_shovel", var10003.setUnlocalizedName("shovelExonite").method_2979("exonite_shovel"));
      var10000 = field_2329;
      var9 = new class_541;
      var9.getBlock16(class_133.EXONITE);
      var10000.method_5812(536, "exonite_pickaxe", var9.setUnlocalizedName("pickaxeExonite").method_2979("exonite_pickaxe"));
      var10000 = field_2329;
      var10 = new class_542;
      var10.getBlock17(class_133.EXONITE);
      var10000.method_5812(537, "exonite_axe", var10.setUnlocalizedName("hatchetExonite").method_2979("exonite_axe"));
      var10000 = field_2329;
      var36 = new class_555;
      var36.getBlock36(class_133.AMBRE);
      var10000.method_5812(538, "ambre_hoe", var36.setUnlocalizedName("hoeAmbre").method_2979("ambre_hoe"));
      var10000 = field_2329;
      var10003 = new class_540;
      var10003.getBlock15(class_133.AMBRE);
      var10000.method_5812(539, "ambre_shovel", var10003.setUnlocalizedName("shovelAmbre").method_2979("ambre_shovel"));
      var10000 = field_2329;
      var9 = new class_541;
      var9.getBlock16(class_133.AMBRE);
      var10000.method_5812(540, "ambre_pickaxe", var9.setUnlocalizedName("pickaxeAmbre").method_2979("ambre_pickaxe"));
      var10000 = field_2329;
      var10 = new class_542;
      var10.getBlock17(class_133.AMBRE);
      var10000.method_5812(541, "ambre_axe", var10.setUnlocalizedName("hatchetAmbre").method_2979("ambre_axe"));
      var10000 = field_2329;
      var36 = new class_555;
      var36.getBlock36(class_133.MENORIUM);
      var10000.method_5812(542, "menorium_hoe", var36.setUnlocalizedName("hoeMenorium").method_2979("menorium_hoe"));
      var10000 = field_2329;
      var10003 = new class_540;
      var10003.getBlock15(class_133.MENORIUM);
      var10000.method_5812(543, "menorium_shovel", var10003.setUnlocalizedName("shovelMenorium").method_2979("menorium_shovel"));
      var10000 = field_2329;
      var9 = new class_541;
      var9.getBlock16(class_133.MENORIUM);
      var10000.method_5812(544, "menorium_pickaxe", var9.setUnlocalizedName("pickaxeMenorium").method_2979("menorium_pickaxe"));
      var10000 = field_2329;
      var10 = new class_542;
      var10.getBlock17(class_133.MENORIUM);
      var10000.method_5812(545, "menorium_axe", var10.setUnlocalizedName("hatchetMenorium").method_2979("menorium_axe"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(546, "obsidian_ingot", var16.setUnlocalizedName("obsidian").method_2974(class_872.fontRendererInstance4).method_2979("obsidian"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(547, "titane", var16.setUnlocalizedName("titane").method_2974(class_872.fontRendererInstance4).method_2979("titane"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(548, "exonite", var16.setUnlocalizedName("exonite").method_2974(class_872.fontRendererInstance4).method_2979("exonite"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(549, "ambre", var16.setUnlocalizedName("ambre").method_2974(class_872.fontRendererInstance4).method_2979("ambre"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(550, "menorium", var16.setUnlocalizedName("menorium").method_2974(class_872.fontRendererInstance4).method_2979("menorium"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(551, "reinforced_ambre", var16.setUnlocalizedName("reinforcedAmbre").method_2974(class_872.fontRendererInstance4).method_2979("reinforced_ambre"));
      var10000 = field_2329;
      var12 = new class_557;
      var12.getBlock40(10, 1.2F, false);
      var10000.method_5812(552, "emeraldCookie", var12.getBlock47().getBlock46(class_1635.field_8495.field_8526, 120, 1, 1.0F).setUnlocalizedName("emeraldCookie").method_2979("emeraldCookie"));
      var10000 = field_2329;
      var12 = new class_557;
      var12.getBlock40(10, 1.2F, false);
      var10000.method_5812(553, "exonite_melon", var12.getBlock47().getBlock46(class_1635.field_8491.field_8526, 360, 1, 1.0F).setUnlocalizedName("exonite_melon").method_2979("exonite_melon"));
      var10000 = field_2329;
      class_577 var72 = new class_577;
      var72.method_2917();
      var10000.method_5812(555, "obsidian_bow", var72.setUnlocalizedName("obsidianBow").method_2979("obsidian_bow").method_2935(500));
      var10000 = field_2329;
      class_576 var73 = new class_576;
      var73.method_2917();
      var10000.method_5812(556, "titane_bow", var73.setUnlocalizedName("titaneBow").method_2979("titane_bow").method_2935(1000));
      var10000 = field_2329;
      class_574 var74 = new class_574;
      var74.method_2917();
      var10000.method_5812(557, "exonite_bow", var74.setUnlocalizedName("exoniteBow").method_2979("exonite_bow").method_2935(1500));
      var10000 = field_2329;
      class_575 var75 = new class_575;
      var75.method_2917();
      var10000.method_5812(558, "ambre_bow", var75.setUnlocalizedName("ambreBow").method_2979("ambre_bow").method_2935(2000));
      var10000 = field_2329;
      class_578 var76 = new class_578;
      var76.method_2917();
      var10000.method_5812(559, "menorium_bow", var76.setUnlocalizedName("menoriumBow").method_2979("menorium_bow").method_2935(2500));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(560, "gold", var16.setUnlocalizedName("gold").method_2979("gold"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(562, "key", var16.setUnlocalizedName("key").method_2979("key"));
      var10000 = field_2329;
      class_507 var77 = new class_507;
      var77.method_2917();
      var10000.method_5812(563, "milkPotion", var77.setUnlocalizedName("milkPotion").method_2979("milkPotion"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.AMBRE_R, 10, 0);
      var10000.method_5812(564, "ambrer_helmet", var40.setUnlocalizedName("helmetAmbreR").method_2979("ambrer_helmet"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.AMBRE_R, 10, 1);
      var10000.method_5812(565, "ambrer_chestplate", var40.setUnlocalizedName("chestplateAmbreR").method_2979("ambrer_chestplate"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.AMBRE_R, 10, 2);
      var10000.method_5812(566, "ambrer_leggings", var40.setUnlocalizedName("leggingsAmbreR").method_2979("ambrer_leggings"));
      var10000 = field_2329;
      var40 = new class_525;
      var40.method_2990(class_131.AMBRE_R, 10, 3);
      var10000.method_5812(567, "ambrer_boots", var40.setUnlocalizedName("bootsAmbreR").method_2979("ambrer_boots"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(568, "fire_arrow", var16.setUnlocalizedName("fire_arrow").method_2974(class_872.fontRendererInstance2).method_2979("fire_arrow"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(569, "poison_arrow", var16.setUnlocalizedName("poison_arrow").method_2974(class_872.fontRendererInstance2).method_2979("poison_arrow"));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(570, "slow_arrow", var16.setUnlocalizedName("slow_arrow").method_2974(class_872.fontRendererInstance2).method_2979("slow_arrow"));
      var10000 = field_2329;
      ItemSuperBow var80 = new ItemSuperBow;
      var80.method_2917();
      var10000.method_5812(571, "ambrer_bow", var80.setUnlocalizedName("ambrer_bow").method_2979("ambrer_bow").method_2935(2500));
      var10000 = field_2329;
      var16 = new adb;
      var16.method_2917();
      var10000.method_5812(572, "pb", var16.setUnlocalizedName("pb").method_2979("pb"));
      var10000 = field_2329;
      class_508 var81 = new class_508;
      var81.method_2917();
      var10000.method_5812(573, "menoball", var81.setUnlocalizedName("menoball").method_2979("menoball"));
      HashSet var3 = Sets.newHashSet(new aji[]{class_1192.field_6025, class_1192.field_6142, class_1192.field_6053, class_1192.field_6140, class_1192.field_6164, class_1192.field_6086, class_1192.field_6109, class_1192.field_6118, class_1192.field_6168, class_1192.field_6061, class_1192.field_6063, class_1192.field_6100, class_1192.field_6120, class_1192.field_6129, class_1192.field_6089, class_1192.field_6174, class_1192.field_6156, class_1192.field_6148, class_1192.field_6130, class_1192.field_6101, class_1192.field_6173, class_1192.field_6082, class_1192.field_6094, class_1192.field_6119, class_1192.field_6097, class_1192.field_6090});
      Iterator var4 = aji.field_1973.method_5806().iterator();

      while(var4.hasNext()) {
         String var5;
         aji var6;
         Object var7;
         label349: {
            aji var78;
            class_562 var79;
            label350: {
               var5 = (String)var4.next();
               var6 = (aji)aji.field_1973.method_5813(var5);
               var78 = var6;
               aji var58 = class_1192.field_6062;
               if(var0 != null) {
                  if(var6 == class_1192.field_6062) {
                     var79 = new class_562;
                     var79.getBlock51(class_1192.field_6062);
                     var8 = field_2342;
                     var7 = var79.setUnlocalizedName("cloth");
                     if(var0 != null) {
                        break label349;
                     }

                     int var1 = class_689.method_3977();
                     ++var1;
                     class_689.method_3975(var1);
                  }

                  var78 = var6;
                  if(var0 == null) {
                     break label350;
                  }

                  var58 = class_1192.field_6183;
               }

               if(var78 == var58) {
                  var79 = new class_562;
                  var79.getBlock51(class_1192.field_6183);
                  var8 = field_2342;
                  var7 = var79.setUnlocalizedName("clayHardenedStained");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
            }

            if(var0 != null) {
               if(var78 == class_1192.field_6192) {
                  var79 = new class_562;
                  var79.getBlock51(class_1192.field_6192);
                  var8 = field_2342;
                  var7 = var79.setUnlocalizedName("stainedGlass");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
            }

            Object var64 = class_1192.field_6193;
            if(var0 != null) {
               if(var78 == class_1192.field_6193) {
                  var79 = new class_562;
                  var79.getBlock51(class_1192.field_6193);
                  var8 = field_2342;
                  var7 = var79.setUnlocalizedName("stainedGlassPane");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6185;
            }

            class_565 var82;
            label352: {
               if(var0 != null) {
                  if(var78 == var64) {
                     var79 = new class_562;
                     var79.getBlock51(class_1192.field_6185);
                     var8 = field_2342;
                     var7 = var79.setUnlocalizedName("woolCarpet");
                     if(var0 != null) {
                        break label349;
                     }
                  }

                  var78 = var6;
                  if(var0 == null) {
                     break label352;
                  }

                  var64 = class_1192.field_6028;
               }

               if(var78 == var64) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6028, class_1192.field_6028, class_419.field_2139);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("dirt");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
            }

            var64 = class_1192.field_6037;
            if(var0 != null) {
               if(var78 == class_1192.field_6037) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6037, class_1192.field_6037, class_465.field_2230);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("sand");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6042;
            }

            if(var0 != null) {
               if(var78 == var64) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6042, class_1192.field_6042, class_409.field_2115);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("log");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6043;
            }

            if(var0 != null) {
               if(var78 == var64) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6043, class_1192.field_6043, class_410.field_2117);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("log");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6030;
            }

            if(var0 != null) {
               if(var78 == var64) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6030, class_1192.field_6030, class_422.field_2149);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("wood");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6122;
            }

            if(var0 != null) {
               if(var78 == var64) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6122, class_1192.field_6122, class_364.field_2026);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("monsterStoneEgg");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6123;
            }

            if(var0 != null) {
               if(var78 == var64) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6123, class_1192.field_6123, class_391.field_2082);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("stonebricksmooth");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6051;
            }

            label354: {
               if(var0 != null) {
                  if(var78 == var64) {
                     var82 = new class_565;
                     var82.getBlock56(class_1192.field_6051, class_1192.field_6051, class_406.field_2106);
                     var8 = field_2342;
                     var7 = var82.setUnlocalizedName("sandStone");
                     if(var0 != null) {
                        break label349;
                     }
                  }

                  var78 = var6;
                  if(var0 == null) {
                     break label354;
                  }

                  var64 = class_1192.field_6179;
               }

               if(var78 == var64) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6179, class_1192.field_6179, class_359.field_2014);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("quartzBlock");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
            }

            var64 = class_1192.field_6071;
            class_563 var83;
            if(var0 != null) {
               if(var78 == class_1192.field_6071) {
                  var83 = new class_563;
                  var83.getBlock54(class_1192.field_6071, class_1192.field_6071, class_1192.field_6070, false);
                  var8 = field_2342;
                  var7 = var83.setUnlocalizedName("stoneSlab");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6070;
            }

            if(var0 != null) {
               if(var78 == var64) {
                  var83 = new class_563;
                  var83.getBlock54(class_1192.field_6070, class_1192.field_6071, class_1192.field_6070, true);
                  var8 = field_2342;
                  var7 = var83.setUnlocalizedName("stoneSlab");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6150;
            }

            if(var0 != null) {
               if(var78 == var64) {
                  var83 = new class_563;
                  var83.getBlock54(class_1192.field_6150, class_1192.field_6150, class_1192.field_6149, false);
                  var8 = field_2342;
                  var7 = var83.setUnlocalizedName("woodSlab");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6149;
            }

            label356: {
               if(var0 != null) {
                  if(var78 == var64) {
                     var83 = new class_563;
                     var83.getBlock54(class_1192.field_6149, class_1192.field_6150, class_1192.field_6149, true);
                     var8 = field_2342;
                     var7 = var83.setUnlocalizedName("woodSlab");
                     if(var0 != null) {
                        break label349;
                     }
                  }

                  var78 = var6;
                  if(var0 == null) {
                     break label356;
                  }

                  var64 = class_1192.field_6031;
               }

               if(var78 == var64) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6031, class_1192.field_6031, class_456.field_2210);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("sapling");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
            }

            var64 = class_1192.field_6044;
            class_568 var84;
            if(var0 != null) {
               if(var78 == class_1192.field_6044) {
                  var84 = new class_568;
                  var84.getBlock58(class_1192.field_6044);
                  var8 = field_2342;
                  var7 = var84.setUnlocalizedName("leaves");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6045;
            }

            class_569 var85;
            label358: {
               if(var0 != null) {
                  if(var78 == var64) {
                     var84 = new class_568;
                     var84.getBlock58(class_1192.field_6045);
                     var8 = field_2342;
                     var7 = var84.setUnlocalizedName("leaves");
                     if(var0 != null) {
                        break label349;
                     }
                  }

                  var78 = var6;
                  if(var0 == null) {
                     break label358;
                  }

                  var64 = class_1192.field_6131;
               }

               if(var78 == var64) {
                  var85 = new class_569;
                  var85.getBlock59(class_1192.field_6131, false);
                  var7 = var85;
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
            }

            String[] var71;
            if(var0 != null) {
               if(var78 == class_1192.field_6058) {
                  var85 = new class_569;
                  var85.getBlock59(class_1192.field_6058, true);
                  var71 = new String[3];
                  var8 = field_2342;
                  var71[0] = "shrub";
                  var71[1] = "grass";
                  var71[2] = "fern";
                  var7 = var85.getBlock60(var71);
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
            }

            var64 = class_1192.field_6064;
            if(var0 != null) {
               if(var78 == class_1192.field_6064) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6064, class_1192.field_6064, class_447.field_2191);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("flower");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6065;
            }

            if(var0 != null) {
               if(var78 == var64) {
                  var82 = new class_565;
                  var82.getBlock56(class_1192.field_6065, class_1192.field_6065, class_447.field_2190);
                  var8 = field_2342;
                  var7 = var82.setUnlocalizedName("rose");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6104;
            }

            label360: {
               if(var0 != null) {
                  if(var78 == var64) {
                     class_572 var86 = new class_572;
                     var86.getBlock61(class_1192.field_6104, class_1192.field_6104);
                     var7 = var86;
                     if(var0 != null) {
                        break label349;
                     }
                  }

                  var78 = var6;
                  if(var0 == null) {
                     break label360;
                  }

                  var64 = class_1192.field_6136;
               }

               if(var78 == var64) {
                  class_570 var87 = new class_570;
                  var87.getBlock51(class_1192.field_6136);
                  var7 = var87;
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
            }

            var64 = class_1192.field_6060;
            class_564 var88;
            if(var0 != null) {
               if(var78 == class_1192.field_6060) {
                  var88 = new class_564;
                  var88.getBlock51(class_1192.field_6060);
                  var7 = var88;
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6056;
            }

            if(var0 != null) {
               if(var78 == var64) {
                  var88 = new class_564;
                  var88.getBlock51(class_1192.field_6056);
                  var7 = var88;
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
               var64 = class_1192.field_6163;
            }

            label362: {
               if(var0 != null) {
                  if(var78 == var64) {
                     var82 = new class_565;
                     var82.getBlock56(class_1192.field_6163, class_1192.field_6163, class_424.field_2151);
                     var8 = field_2342;
                     var7 = var82.setUnlocalizedName("cobbleWall");
                     if(var0 != null) {
                        break label349;
                     }
                  }

                  var78 = var6;
                  if(var0 == null) {
                     break label362;
                  }

                  var64 = class_1192.field_6169;
               }

               if(var78 == var64) {
                  class_567 var89 = new class_567;
                  var89.getBlock51(class_1192.field_6169);
                  var8 = field_2342;
                  var7 = var89.setUnlocalizedName("anvil");
                  if(var0 != null) {
                     break label349;
                  }
               }

               var78 = var6;
            }

            if(var78 == class_1192.field_6191) {
               class_566 var90 = new class_566;
               var90.getBlock57(class_1192.field_6191, class_1192.field_6191, class_448.field_2194);
               var71 = field_2342;
               var7 = var90.setUnlocalizedName("doublePlant");
               if(var0 != null) {
                  break label349;
               }
            }

            if(var3.contains(var6) && var0 != null) {
               continue;
            }

            abh var91 = new abh;
            var91.getBlock51(var6);
            var7 = var91;
         }

         field_2329.method_5812(aji.method_2415(var6), var5, var7);
         if(var0 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e (int) adb
   public adb method_2922(int var1) {
      this.field_2333 = var1;
      return this;
   }

   // $FF: renamed from: d () int
   public int getSpriteNumber() {
      return 1;
   }

   // $FF: renamed from: b_ (int) vL
   public class_73 getIconFromDamage(int var1) {
      return this.field_2340;
   }

   // $FF: renamed from: j (add) vL
   public final class_73 method_2925(add var1) {
      return this.getIconFromDamage(var1.method_3745());
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return false;
   }

   // $FF: renamed from: a (add, aji) float
   public float method_2927(add var1, aji var2) {
      return 1.0F;
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      return var1;
   }

   // $FF: renamed from: b (add, ahb, yz) add
   public add method_2929(add var1, ahb var2, class_792 var3) {
      return var1;
   }

   // $FF: renamed from: m () int
   public int method_2930() {
      return this.field_2333;
   }

   // $FF: renamed from: a (int) int
   public int method_2931(int var1) {
      return 0;
   }

   // $FF: renamed from: n () boolean
   public boolean method_2932() {
      return this.field_2336;
   }

   // $FF: renamed from: a (boolean) adb
   protected adb method_2933(boolean var1) {
      this.field_2336 = var1;
      return this;
   }

   // $FF: renamed from: o () int
   public int method_2934() {
      return this.field_2334;
   }

   // $FF: renamed from: f (int) adb
   protected adb method_2935(int var1) {
      this.field_2334 = var1;
      return this;
   }

   // $FF: renamed from: p () boolean
   public boolean method_2936() {
      int var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_2334;
         if(var1 != null) {
            if(this.field_2334 <= 0) {
               break label24;
            }

            var10000 = this.field_2336;
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 == 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (add, sv, sv) boolean
   public boolean method_2937(add var1, class_752 var2, class_752 var3) {
      return false;
   }

   // $FF: renamed from: a (add, ahb, aji, int, int, int, sv) boolean
   public boolean method_2938(add var1, ahb var2, aji var3, int var4, int var5, int var6, class_752 var7) {
      return false;
   }

   // $FF: renamed from: b (aji) boolean
   public boolean method_2939(aji var1) {
      return false;
   }

   // $FF: renamed from: a (add, yz, sv) boolean
   public boolean method_2940(add var1, class_792 var2, class_752 var3) {
      return false;
   }

   // $FF: renamed from: q () adb
   public adb method_2941() {
      this.field_2335 = true;
      return this;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2942() {
      return this.field_2335;
   }

   // $FF: renamed from: g () boolean
   public boolean method_2943() {
      return false;
   }

   // $FF: renamed from: c (java.lang.String) adb
   public adb setUnlocalizedName(String var1) {
      this.field_2339 = var1;
      return this;
   }

   // $FF: renamed from: k (add) java.lang.String
   public String method_2945(add var1) {
      String[] var10000 = class_752.method_4253();
      String var3 = this.getUnlocalizedName(var1);
      String[] var2 = var10000;
      String var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            var4 = "";
            return var4;
         }

         var4 = var3;
      }

      var4 = class_1563.method_8581(var4);
      return var4;
   }

   // $FF: renamed from: a () java.lang.String
   public String getUnlocalizedName() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_2342;
      return var10000.append("item.").append(this.field_2339).toString();
   }

   // $FF: renamed from: a (add) java.lang.String
   public String getUnlocalizedName(add var1) {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_2342;
      return var10000.append("item.").append(this.field_2339).toString();
   }

   // $FF: renamed from: c (adb) adb
   public adb method_2948(adb var1) {
      this.field_2337 = var1;
      return this;
   }

   // $FF: renamed from: l (add) boolean
   public boolean method_2949(add var1) {
      return true;
   }

   // $FF: renamed from: s () boolean
   public boolean method_2950() {
      return true;
   }

   // $FF: renamed from: t () adb
   public adb method_2951() {
      return this.field_2337;
   }

   // $FF: renamed from: u () boolean
   public boolean method_2952() {
      return this.field_2337 != null;
   }

   // $FF: renamed from: a (add, int) int
   public int method_2953(add var1, int var2) {
      return 16777215;
   }

   // $FF: renamed from: a (add, ahb, sa, int, boolean) void
   public void method_2954(add var1, ahb var2, class_689 var3, int var4, boolean var5) {}

   // $FF: renamed from: d (add, ahb, yz) void
   public void method_2955(add var1, ahb var2, class_792 var3) {}

   // $FF: renamed from: h () boolean
   public boolean method_2956() {
      return false;
   }

   // $FF: renamed from: d (add) A
   public class_92 method_2957(add var1) {
      return class_92.field_23;
   }

   // $FF: renamed from: d_ (add) int
   public int method_2958(add var1) {
      return 0;
   }

   // $FF: renamed from: a (add, ahb, yz, int) void
   public void method_2959(add var1, ahb var2, class_792 var3, int var4) {}

   // $FF: renamed from: e (java.lang.String) adb
   protected adb method_2960(String var1) {
      this.field_2338 = var1;
      return this;
   }

   // $FF: renamed from: i (add) java.lang.String
   public String method_2961(add var1) {
      return this.field_2338;
   }

   // $FF: renamed from: m (add) boolean
   public boolean method_2962(add var1) {
      return this.method_2961(var1) != null;
   }

   // $FF: renamed from: a (add, yz, java.util.List, boolean) void
   public void method_2963(add var1, class_792 var2, List var3, boolean var4) {}

   // $FF: renamed from: n (add) java.lang.String
   public String method_2964(add var1) {
      StringBuilder var10000 = (new StringBuilder()).append("");
      StringBuilder var10001 = (new StringBuilder()).append(this.method_2945(var1));
      String[] var10002 = field_2342;
      return var10000.append(class_1563.method_8581(var10001.append(".name").toString())).toString().trim();
   }

   // $FF: renamed from: e (add) boolean
   public boolean method_2965(add var1) {
      return var1.method_3779();
   }

   // $FF: renamed from: f (add) z
   public class_134 method_2966(add var1) {
      return var1.method_3779()?class_134.field_352:class_134.field_350;
   }

   // $FF: renamed from: e_ (add) boolean
   public boolean method_2967(add var1) {
      int var10000;
      label24: {
         String[] var2 = class_752.method_4253();
         var10000 = this.method_2930();
         if(var2 != null) {
            if(var10000 != 1) {
               break label24;
            }

            var10000 = this.method_2936();
         }

         if(var2 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (ahb, yz, boolean) azu
   protected azu method_2968(ahb var1, class_792 var2, boolean var3) {
      float var5 = 1.0F;
      String[] var10000 = class_752.method_4253();
      float var6 = var2.field_3003 + (var2.field_3001 - var2.field_3003) * var5;
      float var7 = var2.field_3002 + (var2.field_3000 - var2.field_3002) * var5;
      String[] var4 = var10000;
      double var8 = var2.field_2991 + (var2.field_2994 - var2.field_2991) * (double)var5;
      double var10 = var2.field_2992 + (var2.field_2995 - var2.field_2992) * (double)var5 + 1.62D - (double)var2.field_3013;
      double var12 = var2.field_2993 + (var2.field_2996 - var2.field_2993) * (double)var5;
      azw var14 = azw.method_5086(var8, var10, var12);
      float var15 = class_1715.method_9556(-var7 * 0.017453292F - 3.1415927F);
      float var16 = class_1715.method_9555(-var7 * 0.017453292F - 3.1415927F);
      float var17 = -class_1715.method_9556(-var6 * 0.017453292F);
      float var18 = class_1715.method_9555(-var6 * 0.017453292F);
      float var19 = var16 * var17;
      float var20 = var15 * var17;
      double var21 = 5.0D;
      azw var23 = var14.method_5093((double)var19 * var21, (double)var18 * var21, (double)var20 * var21);
      boolean var10004 = var3;
      if(var4 != null) {
         var10004 = !var3;
      }

      return var1.method_2081(var14, var23, var3, var10004, false);
   }

   // $FF: renamed from: c () int
   public int method_2969() {
      return 0;
   }

   // $FF: renamed from: b () boolean
   public boolean method_2970() {
      return false;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2971(int var1, int var2) {
      return this.getIconFromDamage(var1);
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void getSubItems(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
   }

   // $FF: renamed from: n_ () a5
   public class_872 getCreativeTab() {
      return this.field_2331;
   }

   // $FF: renamed from: a (a5) adb
   public adb method_2974(class_872 var1) {
      this.field_2331 = var1;
      return this;
   }

   // $FF: renamed from: v () boolean
   public boolean method_2975() {
      return true;
   }

   // $FF: renamed from: a (add, add) boolean
   public boolean method_2976(add var1, add var2) {
      return false;
   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      this.field_2340 = var1.method_375(this.method_2980());
   }

   // $FF: renamed from: k () com.google.common.collect.Multimap
   public Multimap method_2978() {
      return HashMultimap.create();
   }

   // $FF: renamed from: f (java.lang.String) adb
   protected adb method_2979(String var1) {
      this.field_2341 = var1;
      return this;
   }

   // $FF: renamed from: w () java.lang.String
   protected String method_2980() {
      String[] var1 = class_752.method_4253();
      adb var10000 = this;
      String var2;
      if(var1 != null) {
         if(this.field_2341 == null) {
            StringBuilder var3 = new StringBuilder();
            String[] var10001 = field_2342;
            var2 = var3.append("MISSING_ICON_ITEM_").append(field_2329.method_5816(this)).append("_").append(this.field_2339).toString();
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_2341;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      // $FF: Couldn't be decompiled
   }
}
