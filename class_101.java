
// $FF: renamed from: P
public enum class_101 {

   // $FF: renamed from: a P
   field_90,
   // $FF: renamed from: b P
   field_91,
   MUSIC_SOUND,
   // $FF: renamed from: c P
   field_92,
   // $FF: renamed from: d P
   field_93,
   // $FF: renamed from: e P
   field_94,
   // $FF: renamed from: f P
   field_95,
   // $FF: renamed from: g P
   field_96,
   // $FF: renamed from: h P
   field_97,
   // $FF: renamed from: i P
   field_98,
   // $FF: renamed from: j P
   field_99,
   // $FF: renamed from: k P
   field_100,
   // $FF: renamed from: l P
   field_101,
   // $FF: renamed from: m P
   field_102,
   // $FF: renamed from: n P
   field_103,
   // $FF: renamed from: o P
   field_104,
   // $FF: renamed from: p P
   field_105,
   // $FF: renamed from: q P
   field_106,
   // $FF: renamed from: r P
   field_107,
   // $FF: renamed from: s P
   field_108,
   // $FF: renamed from: t P
   field_109,
   // $FF: renamed from: u P
   field_110,
   // $FF: renamed from: v P
   field_111,
   // $FF: renamed from: w P
   field_112,
   // $FF: renamed from: x P
   field_113,
   // $FF: renamed from: y P
   field_114,
   // $FF: renamed from: z P
   field_115,
   // $FF: renamed from: A P
   field_116,
   // $FF: renamed from: B P
   field_117,
   // $FF: renamed from: C P
   field_118,
   // $FF: renamed from: D P
   field_119,
   // $FF: renamed from: E P
   field_120,
   // $FF: renamed from: F P
   field_121,
   // $FF: renamed from: G P
   field_122,
   // $FF: renamed from: H P
   field_123,
   // $FF: renamed from: I P
   field_124,
   // $FF: renamed from: J P
   field_125,
   // $FF: renamed from: K P
   field_126,
   // $FF: renamed from: L P
   field_127,
   // $FF: renamed from: M P
   field_128,
   // $FF: renamed from: N P
   field_129,
   // $FF: renamed from: O P
   field_130,
   // $FF: renamed from: P P
   field_131,
   // $FF: renamed from: Q P
   field_132,
   // $FF: renamed from: R P
   field_133,
   FOG_FANCY,
   FOG_START,
   MIPMAP_TYPE,
   LOAD_FAR,
   PRELOADED_CHUNKS,
   SMOOTH_FPS,
   CLOUDS,
   CLOUD_HEIGHT,
   TREES,
   GRASS,
   RAIN,
   WATER,
   ANIMATED_WATER,
   ANIMATED_LAVA,
   ANIMATED_FIRE,
   ANIMATED_PORTAL,
   AO_LEVEL,
   LAGOMETER,
   AUTOSAVE_TICKS,
   BETTER_GRASS,
   ANIMATED_REDSTONE,
   ANIMATED_EXPLOSION,
   ANIMATED_FLAME,
   ANIMATED_SMOKE,
   WEATHER,
   SKY,
   STARS,
   SUN_MOON,
   CHUNK_UPDATES,
   CHUNK_UPDATES_DYNAMIC,
   TIME,
   CLEAR_WATER,
   SMOOTH_WORLD,
   DEPTH_FOG,
   VOID_PARTICLES,
   WATER_PARTICLES,
   RAIN_SPLASH,
   PORTAL_PARTICLES,
   POTION_PARTICLES,
   PROFILER,
   DRIPPING_WATER_LAVA,
   BETTER_SNOW,
   FULLSCREEN_MODE,
   ANIMATED_TERRAIN,
   ANIMATED_ITEMS,
   SWAMP_COLORS,
   RANDOM_MOBS,
   SMOOTH_BIOMES,
   CUSTOM_FONTS,
   CUSTOM_COLORS,
   SHOW_CAPES,
   CONNECTED_TEXTURES,
   AA_LEVEL,
   ANIMATED_TEXTURES,
   NATURAL_TEXTURES,
   CHUNK_LOADING,
   HELD_ITEM_TOOLTIPS,
   DROPPED_ITEMS,
   LAZY_CHUNK_LOADING,
   CUSTOM_SKY,
   FAST_MATH,
   FAST_RENDER,
   TRANSLUCENT_BLOCKS;
   // $FF: renamed from: T boolean
   private final boolean field_134;
   // $FF: renamed from: U boolean
   private final boolean field_135;
   // $FF: renamed from: V java.lang.String
   private final String field_136;
   // $FF: renamed from: W float
   private final float field_137;
   // $FF: renamed from: X float
   private float field_138;
   // $FF: renamed from: Y float
   private float field_139;
   // $FF: renamed from: Z P[]
   private static final class_101[] field_140;
   // $FF: renamed from: aa P[]
   private static final class_101[] field_141;
   // $FF: renamed from: ab P[]
   private static final class_101[] field_142;
   // $FF: renamed from: ac java.lang.String
   private static final String field_143;
   // $FF: renamed from: ad P[]
   private static final class_101[] field_144;


   // $FF: renamed from: b (int) P
   public static class_101 method_464(int var0) {
      class_101[] var2 = values();
      String[] var10000 = class_752.method_4253();
      int var3 = var2.length;
      String[] var1 = var10000;
      int var4 = 0;

      while(var4 < var3) {
         class_101 var5 = var2[var4];
         if(var1 != null) {
            if(var5.method_469() == var0) {
               return var5;
            }

            ++var4;
         }

         if(var1 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, boolean, boolean) void
   private void method_465(String var1, int var2, String var3, int var4, String var5, int var6, String var7, int var8, String var9, boolean var10, boolean var11) {
      this.method_466(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, 0.0F, 1.0F, 0.0F);
   }

   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, boolean, boolean, float, float, float) void
   private void method_466(String var1, int var2, String var3, int var4, String var5, int var6, String var7, int var8, String var9, boolean var10, boolean var11, float var12, float var13, float var14) {
      super(var1, var2);
      this.field_136 = var9;
      this.field_134 = var10;
      this.field_135 = var11;
      this.field_138 = var12;
      this.field_139 = var13;
      this.field_137 = var14;
   }

   // $FF: renamed from: b () boolean
   public boolean method_467() {
      return this.field_134;
   }

   // $FF: renamed from: c () boolean
   public boolean method_468() {
      return this.field_135;
   }

   // $FF: renamed from: d () int
   public int method_469() {
      return this.ordinal();
   }

   // $FF: renamed from: e () java.lang.String
   public String method_470() {
      return this.field_136;
   }

   // $FF: renamed from: g () float
   public float method_471() {
      return this.field_139;
   }

   // $FF: renamed from: b (float) void
   public void method_472(float var1) {
      this.field_139 = var1;
   }

   // $FF: renamed from: d (float) float
   public float method_473(float var1) {
      return class_1715.method_9569((this.method_475(var1) - this.field_138) / (this.field_139 - this.field_138), 0.0F, 1.0F);
   }

   // $FF: renamed from: e (float) float
   public float method_474(float var1) {
      return this.method_475(this.field_138 + (this.field_139 - this.field_138) * class_1715.method_9569(var1, 0.0F, 1.0F));
   }

   // $FF: renamed from: f (float) float
   public float method_475(float var1) {
      var1 = this.method_476(var1);
      return class_1715.method_9569(var1, this.field_138, this.field_139);
   }

   // $FF: renamed from: g (float) float
   protected float method_476(float var1) {
      String[] var2 = class_752.method_4253();
      float var10000 = this.field_137;
      if(var2 != null) {
         if(this.field_137 > 0.0F) {
            var1 = this.field_137 * (float)Math.round(var1 / this.field_137);
         }

         var10000 = var1;
      }

      return var10000;
   }

   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, boolean, boolean, float, float, float, java.lang.Object) void
   private void method_477(String var1, int var2, String var3, int var4, String var5, int var6, String var7, int var8, String var9, boolean var10, boolean var11, float var12, float var13, float var14, Object var15) {
      this.method_466(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, boolean, boolean, float, float, float, java.lang.Object, java.lang.Object) void
   private void method_478(String var1, int var2, String var3, int var4, String var5, int var6, String var7, int var8, String var9, boolean var10, boolean var11, float var12, float var13, float var14, Object var15, Object var16) {
      this.method_477(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, boolean, boolean, float, float, float, java.lang.Object, java.lang.Object, java.lang.Object) void
   private void method_479(String var1, int var2, String var3, int var4, String var5, int var6, String var7, int var8, String var9, boolean var10, boolean var11, float var12, float var13, float var14, Object var15, Object var16, Object var17) {
      this.method_478(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
   }

   // $FF: renamed from: b (P) float
   static float method_480(class_101 var0) {
      return var0.field_139;
   }

   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, int, java.lang.String, boolean, boolean, float, float, float, java.lang.Object, java.lang.Object, java.lang.Object, kO) void
   void method_481(String var1, int var2, String var3, int var4, String var5, int var6, String var7, int var8, String var9, boolean var10, boolean var11, float var12, float var13, float var14, Object var15, Object var16, Object var17, class_1326 var18) {
      this.method_479(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17);
   }

   // $FF: renamed from: <clinit> () void
   static void method_482() {
      // $FF: Couldn't be decompiled
   }
}
