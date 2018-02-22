import java.nio.IntBuffer;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bma implements class_21 {

   // $FF: renamed from: m org.apache.logging.log4j.Logger
   private static final Logger field_7167;
   // $FF: renamed from: n bqx
   private static final bqx field_7168;
   // $FF: renamed from: o bqx
   private static final bqx field_7169;
   // $FF: renamed from: p bqx
   private static final bqx field_7170;
   // $FF: renamed from: q bqx
   private static final bqx field_7171;
   // $FF: renamed from: a java.util.List
   public List field_7172;
   // $FF: renamed from: r bjf
   public bjf field_7173;
   // $FF: renamed from: s bqf
   public final bqf field_7174;
   // $FF: renamed from: t CompactArrayList
   public CompactArrayList field_7175;
   // $FF: renamed from: u blo[]
   private blo[] field_7176;
   // $FF: renamed from: v blo[]
   private blo[] field_7177;
   // $FF: renamed from: w int
   private int field_7178;
   // $FF: renamed from: x int
   private int field_7179;
   // $FF: renamed from: y int
   private int field_7180;
   // $FF: renamed from: z int
   public int field_7181;
   // $FF: renamed from: A bao
   public bao field_7182;
   // $FF: renamed from: B blm
   public blm field_7183;
   // $FF: renamed from: C java.nio.IntBuffer
   private IntBuffer field_7184;
   // $FF: renamed from: D boolean
   private boolean field_7185;
   // $FF: renamed from: E int
   private int field_7186;
   // $FF: renamed from: F int
   private int field_7187;
   // $FF: renamed from: G int
   private int field_7188;
   // $FF: renamed from: H int
   private int field_7189;
   // $FF: renamed from: I int
   private int field_7190;
   // $FF: renamed from: J int
   private int field_7191;
   // $FF: renamed from: K int
   private int field_7192;
   // $FF: renamed from: L int
   private int field_7193;
   // $FF: renamed from: M int
   private int field_7194;
   // $FF: renamed from: N int
   private int field_7195;
   // $FF: renamed from: O java.util.Map
   public final Map field_7196;
   // $FF: renamed from: P java.util.Map
   private final Map field_7197;
   // $FF: renamed from: Q vL[]
   private class_73[] field_7198;
   // $FF: renamed from: R boolean
   private boolean field_7199;
   // $FF: renamed from: S int
   private int field_7200;
   // $FF: renamed from: T int
   private int field_7201;
   // $FF: renamed from: U int
   private int field_7202;
   // $FF: renamed from: V int
   private int field_7203;
   // $FF: renamed from: W int
   private int field_7204;
   // $FF: renamed from: X int
   private int field_7205;
   // $FF: renamed from: b java.nio.IntBuffer
   IntBuffer field_7206;
   // $FF: renamed from: Y int
   private int field_7207;
   // $FF: renamed from: Z int
   private int field_7208;
   // $FF: renamed from: aa int
   private int field_7209;
   // $FF: renamed from: ab int
   private int field_7210;
   // $FF: renamed from: ac int
   private int field_7211;
   // $FF: renamed from: ad int
   private int field_7212;
   // $FF: renamed from: ae int
   private int field_7213;
   // $FF: renamed from: af java.util.List
   private List field_7214;
   // $FF: renamed from: ag n1[]
   private class_1378[] field_7215;
   // $FF: renamed from: c double
   double field_7216;
   // $FF: renamed from: d double
   double field_7217;
   // $FF: renamed from: e double
   double field_7218;
   // $FF: renamed from: f double
   double field_7219;
   // $FF: renamed from: g double
   double field_7220;
   // $FF: renamed from: h double
   double field_7221;
   // $FF: renamed from: i int
   int field_7222;
   // $FF: renamed from: j int
   int field_7223;
   // $FF: renamed from: k int
   int field_7224;
   // $FF: renamed from: l int
   int field_7225;
   private IntBuffer glListBuffer;
   double prevReposX;
   double prevReposY;
   double prevReposZ;
   public class_689 renderedEntity;
   private int glListClouds;
   private boolean isFancyGlListClouds;
   private int cloudTickCounterGlList;
   private double cloudPlayerX;
   private double cloudPlayerY;
   private double cloudPlayerZ;
   private int countSortedWorldRenderers;
   private int effectivePreloadedChunks;
   private int vertexResortCounter;
   public WrDisplayListAllocator displayListAllocator;
   public class_752 renderViewEntity;
   private long lastMovedTime;
   private long lastActionTime;
   private static class_1343 AABB_INFINITE;
   private static final String __OBFID;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] field_7226;


   // $FF: renamed from: <init> (bao) void
   public void getSelectionEnd4(bao param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i () void
   private void getSelectionEnd5() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bjf) void
   public void getSelectionEnd6(bjf param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   public void getSelectionEnd7() {
      // $FF: Couldn't be decompiled
   }

   public static void chestFinder(double var0, double var2, double var4) {
      GL11.glBlendFunc(770, 771);
      GL11.glColor3f(2.5F, 2.5F, 0.5F);
      GL11.glLineWidth(3.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      class_1343 var10000 = new class_1343;
      var10000.method_7094(var0 + 1.0D, var2 + 1.0D, var4 + 1.0D, var0, var2, var4);
      setSelectionPos4(var10000, -1);
      GL11.glDepthMask(true);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
   }

   // $FF: renamed from: a (sv, bmv, float) void
   public void getSelectionEnd8(class_752 param1, bmv param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () java.lang.String
   public String getSelectionEnd9() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_7226;
      return var10000.append("C: ").append(this.field_7210).append("/").append(this.field_7207).append(". F: ").append(this.field_7208).append(", O: ").append(this.field_7209).append(", E: ").append(this.field_7211).toString();
   }

   // $FF: renamed from: e () java.lang.String
   public String getWidth0() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_7226;
      return var10000.append("E: ").append(this.field_7204).append("/").append(this.field_7203).append(". B: ").append(this.field_7205).append(", I: ").append(this.field_7203 - this.field_7205 - this.field_7204).append(", ").append(Config.getVersion()).toString();
   }

   // $FF: renamed from: b () void
   public void method_82() {
      this.field_7199 = true;
   }

   // $FF: renamed from: f () void
   public void getWidth1() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int, int) void
   private void getWidth2(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sv, int, double) int
   public int getWidth3(class_752 param1, int param2, double param3) {
      // $FF: Couldn't be decompiled
   }

   private void checkOcclusionQueryResult(int param1, int param2, double param3, double param5, double param7) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int, double) int
   private int getWidth4(int param1, int param2, int param3, double param4) {
      // $FF: Couldn't be decompiled
   }

   private int renderSortedRenderersFast(int param1, int param2, int param3, double param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, double) void
   public void getWidth5(int var1, double var2) {
      this.field_7182.enableBackgroundDrawing8.setTextColor8(var2);
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(true) {
         if(var5 < this.field_7215.length) {
            try {
               this.field_7215[var5].method_7523();
               ++var5;
               if(var4 == null) {
                  break;
               }

               if(var4 != null) {
                  continue;
               }
            } catch (class_643 var6) {
               throw setCanLoseFocus1(var6);
            }
         }

         this.field_7182.enableBackgroundDrawing8.setTextColor7(var2);
         break;
      }

   }

   // $FF: renamed from: g () void
   public void getWidth6() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (float) void
   public void getWidth7(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (float) void
   public void getWidth8(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (double, double, double, float) boolean
   public boolean getWidth9(double var1, double var3, double var5, float var7) {
      return false;
   }

   // $FF: renamed from: c (float) void
   public void setSelectionPos0(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sv, boolean) boolean
   public boolean setSelectionPos1(class_752 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bmh, yz, float) void
   public void setSelectionPos2(bmh var1, class_792 var2, float var3) {
      this.setSelectionPos2(var1, var2, var3);
   }

   public void drawBlockDamageTexture(bmh param1, class_752 param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (yz, azu, int, float) void
   public void setSelectionPos3(class_792 var1, azu var2, int var3, float var4) {
      String[] var5 = class_752.method_4253();

      try {
         if(var3 != 0 || var2.field_4212 != class_100.field_85) {
            return;
         }
      } catch (class_643 var15) {
         throw setCanLoseFocus1(var15);
      }

      GL11.glEnable(3042);
      buu.method_9081(770, 771, 1, 0);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(3553);
      GL11.glDepthMask(false);
      float var6 = 0.002F;
      aji var7 = this.field_7173.getBlock(var2.field_4213, var2.field_4214, var2.field_4215);

      label28: {
         label27: {
            try {
               if(var5 == null) {
                  break label28;
               }

               if(var7.method_2424() == awt.field_4170) {
                  break label27;
               }
            } catch (class_643 var14) {
               throw setCanLoseFocus1(var14);
            }

            var7.method_2486(this.field_7173, var2.field_4213, var2.field_4214, var2.field_4215);
            double var8 = var1.field_3021 + (var1.field_2994 - var1.field_3021) * (double)var4;
            double var10 = var1.field_3022 + (var1.field_2995 - var1.field_3022) * (double)var4;
            double var12 = var1.field_3023 + (var1.field_2996 - var1.field_3023) * (double)var4;
            setSelectionPos4(var7.method_2450(this.field_7173, var2.field_4213, var2.field_4214, var2.field_4215).method_7097((double)var6, (double)var6, (double)var6).method_7099(-var8, -var10, -var12), -1);
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
      }

      GL11.glDisable(3042);
   }

   // $FF: renamed from: a (kg, int) void
   public static void setSelectionPos4(class_1343 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, int, int, int) void
   public void setSelectionPos5(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_70(int var1, int var2, int var3) {
      this.setSelectionPos5(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_71(int var1, int var2, int var3) {
      this.setSelectionPos5(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   // $FF: renamed from: a (int, int, int, int, int, int) void
   public void method_72(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.setSelectionPos5(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1);
   }

   // $FF: renamed from: a (bmv, float) void
   public void setSelectionPos6(bmv param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String, int, int, int) void
   public void method_78(String param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String, double, double, double, float, float) void
   public void method_73(String var1, double var2, double var4, double var6, float var8, float var9) {}

   // $FF: renamed from: a (yz, java.lang.String, double, double, double, float, float) void
   public void method_74(class_792 var1, String var2, double var3, double var5, double var7, float var9, float var10) {}

   // $FF: renamed from: a (java.lang.String, double, double, double, double, double, double) void
   public void method_75(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      try {
         this.setSelectionPos7(var1, var2, var4, var6, var8, var10, var12);
      } catch (Throwable var18) {
         String[] var17 = field_7226;
         class_1346 var15 = class_1346.method_7153(var18, "Exception while adding particle");
         class_1605 var16 = var15.method_7150("Particle being added");
         var16.method_8778("Name", var1);
         class_1420 var10002 = new class_1420;
         var10002.method_7755(this, var2, var4, var6);
         var16.method_8777("Position", var10002);
         class_643 var10000 = new class_643;
         var10000.method_3525(var15);
         throw var10000;
      }
   }

   // $FF: renamed from: b (java.lang.String, double, double, double, double, double, double) v7
   public class_716 setSelectionPos7(String param1, double param2, double param4, double param6, double param8, double param10, double param12) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa) void
   public void method_76(class_689 var1) {
      RandomMobs.entityLoaded(var1);
   }

   // $FF: renamed from: b (sa) void
   public void method_77(class_689 var1) {}

   // $FF: renamed from: h () void
   public void setSelectionPos8() {
      ban.method_5196(this.field_7181);
      this.displayListAllocator.deleteDisplayLists();
   }

   // $FF: renamed from: a (int, int, int, int, int) void
   public void method_79(int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (yz, int, int, int, int, int) void
   public void method_80(class_792 param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, int, int) void
   public void method_81(int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (vM) void
   public void setSelectionPos9(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_7198 = new class_73[10];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_7198.length) {
         class_73[] var4 = this.field_7198;
         StringBuilder var10003 = new StringBuilder();
         String[] var10004 = field_7226;
         var4[var3] = var1.method_375(var10003.append("destroy_stage_").append(var3).toString());
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   public void setAllRenderersVisible() {
      String[] var1 = class_752.method_4253();
      if(this.field_7177 != null) {
         int var2 = 0;

         while(var2 < this.field_7177.length) {
            this.field_7177[var2].field_1905 = true;
            ++var2;
            if(var1 == null) {
               break;
            }
         }
      }

   }

   public boolean isMoving(class_752 param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean isMovingNow(class_752 param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean isActing() {
      // $FF: Couldn't be decompiled
   }

   public boolean isActingNow() {
      // $FF: Couldn't be decompiled
   }

   public int renderAllSortedRenderers(int var1, double var2) {
      return this.getWidth4(0, this.countSortedWorldRenderers, var1, var2);
   }

   public void updateCapes() {}

   public class_1343 getTileEntityBoundingBox(class_580 param1) {
      // $FF: Couldn't be decompiled
   }

   public void addToSortedWorldRenderers(blo param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void setCanLoseFocus0() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (AG) AG
   private static class_643 setCanLoseFocus1(class_643 var0) {
      return var0;
   }
}
