import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.nio.IntBuffer;

public class TextureUtils {

   public static final String texGrassTop;
   public static final String texStone;
   public static final String texDirt;
   public static final String texGrassSide;
   public static final String texStoneslabSide;
   public static final String texStoneslabTop;
   public static final String texBedrock;
   public static final String texSand;
   public static final String texGravel;
   public static final String texLogOak;
   public static final String texLogOakTop;
   public static final String texGoldOre;
   public static final String texIronOre;
   public static final String texCoalOre;
   public static final String texObsidian;
   public static final String texGrassSideOverlay;
   public static final String texSnow;
   public static final String texGrassSideSnowed;
   public static final String texMyceliumSide;
   public static final String texMyceliumTop;
   public static final String texDiamondOre;
   public static final String texRedstoneOre;
   public static final String texLapisOre;
   public static final String texLeavesOak;
   public static final String texLeavesOakOpaque;
   public static final String texLeavesJungle;
   public static final String texLeavesJungleOpaque;
   public static final String texCactusSide;
   public static final String texClay;
   public static final String texFarmlandWet;
   public static final String texFarmlandDry;
   public static final String texNetherrack;
   public static final String texSoulSand;
   public static final String texGlowstone;
   public static final String texLogSpruce;
   public static final String texLogBirch;
   public static final String texLeavesSpruce;
   public static final String texLeavesSpruceOpaque;
   public static final String texLogJungle;
   public static final String texEndStone;
   public static final String texSandstoneTop;
   public static final String texSandstoneBottom;
   public static final String texRedstoneLampOff;
   public static final String texRedstoneLampOn;
   public static final String texWaterStill;
   public static final String texWaterFlow;
   public static final String texLavaStill;
   public static final String texLavaFlow;
   public static final String texFireLayer0;
   public static final String texFireLayer1;
   public static final String texPortal;
   public static class_73 iconGrassTop;
   public static class_73 iconGrassSide;
   public static class_73 iconGrassSideOverlay;
   public static class_73 iconSnow;
   public static class_73 iconGrassSideSnowed;
   public static class_73 iconMyceliumSide;
   public static class_73 iconMyceliumTop;
   public static class_73 iconWaterStill;
   public static class_73 iconWaterFlow;
   public static class_73 iconLavaStill;
   public static class_73 iconLavaFlow;
   public static class_73 iconPortal;
   public static class_73 iconFireLayer0;
   public static class_73 iconFireLayer1;
   private static IntBuffer staticBuffer;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2753;


   // $FF: renamed from: <init> () void
   public void method_3488() {
      super();
   }

   public static void update() {
      String[] var10000 = class_752.method_4253();
      bpz var1 = bpz.textureMapBlocks;
      String[] var0 = var10000;
      bpz var3 = var1;
      if(var0 != null) {
         if(var1 == null) {
            return;
         }

         String[] var2 = field_2753;
         iconGrassTop = var1.getIconSafe("grass_top");
         iconGrassSide = var1.getIconSafe("grass_side");
         iconGrassSideOverlay = var1.getIconSafe("grass_side_overlay");
         iconSnow = var1.getIconSafe("snow");
         iconGrassSideSnowed = var1.getIconSafe("grass_side_snowed");
         iconMyceliumSide = var1.getIconSafe("mycelium_side");
         iconMyceliumTop = var1.getIconSafe("mycelium_top");
         iconWaterStill = var1.getIconSafe("water_still");
         iconWaterFlow = var1.getIconSafe("water_flow");
         iconLavaStill = var1.getIconSafe("lava_still");
         iconLavaFlow = var1.getIconSafe("lava_flow");
         iconFireLayer0 = var1.getIconSafe("fire_layer_0");
         iconFireLayer1 = var1.getIconSafe("fire_layer_1");
         var3 = var1;
      }

      String[] var10001 = field_2753;
      iconPortal = var3.getIconSafe("portal");
   }

   public static BufferedImage fixTextureDimensions(String var0, BufferedImage var1) {
      BufferedImage var8;
      label29: {
         String[] var2 = class_752.method_4253();
         String[] var7 = field_2753;
         int var10000 = var0.startsWith("/mob/zombie");
         if(var2 != null) {
            label24: {
               if(var10000 == 0) {
                  var10000 = var0.startsWith("/mob/pigzombie");
                  if(var2 == null) {
                     break label24;
                  }

                  if(var10000 == 0) {
                     break label29;
                  }
               }

               var10000 = var1.getWidth();
            }
         }

         int var3 = var10000;
         var8 = var1;
         if(var2 == null) {
            return var8;
         }

         int var4 = var1.getHeight();
         if(var3 == var4 * 2) {
            BufferedImage var5 = new BufferedImage(var3, var4 * 2, 2);
            Graphics2D var6 = var5.createGraphics();
            var6.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            var6.drawImage(var1, 0, 0, var3, var4, (ImageObserver)null);
            return var5;
         }
      }

      var8 = var1;
      return var8;
   }

   public static bqd getTextureAtlasSprite(class_73 var0) {
      String[] var1 = class_752.method_4253();
      class_73 var10000 = var0;
      bqd var2;
      if(var1 != null) {
         if(!(var0 instanceof bqd)) {
            var2 = null;
            return var2;
         }

         var10000 = var0;
      }

      var2 = (bqd)var10000;
      return var2;
   }

   public static int ceilPowerOfTwo(int var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = 1;
      String[] var1 = var10000;

      int var3;
      while(true) {
         if(var2 < var0) {
            var3 = var2 * 2;
            if(var1 == null) {
               break;
            }

            var2 = var3;
            if(var1 != null) {
               continue;
            }
         }

         var3 = var2;
         break;
      }

      return var3;
   }

   public static int getPowerOfTwo(int var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = 1;
      int var3 = 0;
      String[] var1 = var10000;

      int var4;
      while(true) {
         if(var2 < var0) {
            var4 = var2 * 2;
            if(var1 == null) {
               break;
            }

            var2 = var4;
            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         var4 = var3;
         break;
      }

      return var4;
   }

   public static int twoToPower(int var0) {
      int var2 = 1;
      String[] var1 = class_752.method_4253();
      int var3 = 0;

      int var10000;
      while(true) {
         if(var3 < var0) {
            var10000 = var2 * 2;
            if(var1 == null) {
               break;
            }

            var2 = var10000;
            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   public static void refreshBlockTextures() {
      String[] var10000 = field_2753;
      Config.dbg("*** Reloading block textures ***");
      WrUpdates.finishCurrentUpdate();
      bpz.textureMapBlocks.loadTextureSafe(Config.getResourceManager());
      update();
      NaturalTextures.update();
      bpz.textureMapBlocks.method_7958();
   }

   public static bqh getTexture(String var0) {
      bqx var10000 = new bqx;
      var10000.method_8227(var0);
      return getTexture(var10000);
   }

   public static bqh getTexture(bqx var0) {
      String[] var10000 = class_752.method_4253();
      bqh var2 = Config.getTextureManager().method_8121(var0);
      String[] var1 = var10000;
      bqh var4 = var2;
      if(var1 != null) {
         if(var2 == null) {
            if(!Config.hasResource(var0)) {
               return null;
            }

            bpu var5 = new bpu;
            var5.method_7967(var0);
            bpu var3 = var5;
            Config.getTextureManager().method_8120(var0, var3);
            return var3;
         }

         var4 = var2;
      }

      return var4;
   }

   public static void resourcesReloaded(bqy var0) {
      String[] var1 = class_752.method_4253();
      if(var1 != null) {
         if(bpz.textureMapBlocks == null) {
            return;
         }

         String[] var10000 = field_2753;
         Config.dbg("*** Reloading custom textures ***");
         CustomSky.reset();
         TextureAnimations.reset();
         WrUpdates.finishCurrentUpdate();
         update();
         NaturalTextures.update();
         TextureAnimations.update();
         CustomColorizer.update();
         CustomSky.update();
         RandomMobs.resetTextures();
         Config.updateTexturePackClouds();
      }

      Config.getTextureManager().method_220();
   }

   public static void refreshTextureMaps(bqy var0) {
      bpz.textureMapBlocks.loadTextureSafe(var0);
      bpz.textureMapItems.loadTextureSafe(var0);
      update();
      NaturalTextures.update();
   }

   public static void registerResourceListener() {
      label13: {
         bqy var1 = Config.getResourceManager();
         String[] var0 = class_752.method_4253();
         bqy var10000 = var1;
         if(var0 != null) {
            if(!(var1 instanceof class_54)) {
               break label13;
            }

            var10000 = var1;
         }

         class_54 var2 = (class_54)var10000;
         class_892 var6 = new class_892;
         var6.method_5187();
         class_892 var3 = var6;
         var2.method_227(var3);
      }

      class_893 var7 = new class_893;
      var7.method_5188();
      class_893 var4 = var7;
      bqx var8 = new bqx;
      String[] var10002 = field_2753;
      var8.method_8227("optifine/TickableTextures");
      bqx var5 = var8;
      Config.getTextureManager().method_8119(var5, var4);
   }

   public static String fixResourcePath(String var0, String var1) {
      boolean var10000;
      String[] var2;
      String var6;
      label50: {
         String[] var5 = field_2753;
         String var3 = "assets/minecraft/";
         var2 = class_752.method_4253();
         var10000 = var0.startsWith(var3);
         if(var2 != null) {
            if(var10000) {
               var0 = var0.substring(var3.length());
               return var0;
            }

            var6 = var0;
            if(var2 == null) {
               break label50;
            }

            var5 = field_2753;
            var10000 = var0.startsWith("./");
         }

         if(var10000) {
            var0 = var0.substring(2);
            var6 = var1;
            if(var2 != null) {
               if(!var1.endsWith("/")) {
                  var1 = var1 + "/";
               }

               var0 = var1 + var0;
               var6 = var0;
            }

            return var6;
         }

         var5 = field_2753;
         var6 = "mcpatcher/";
      }

      String var4 = var6;
      String[] var10001 = field_2753;
      var10000 = var0.startsWith("~/");
      if(var2 != null) {
         if(var10000) {
            var0 = var0.substring(2);
            var0 = var4 + var0;
            return var0;
         }

         var6 = var0;
         if(var2 == null) {
            return var6;
         }

         var10000 = var0.startsWith("/");
      }

      if(var10000) {
         var0 = var4 + var0.substring(1);
         return var0;
      } else {
         var6 = var0;
         return var6;
      }
   }

   public static String getBasePath(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0?"":var0.substring(0, var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3489() {
      // $FF: Couldn't be decompiled
   }
}
