import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

public class CustomColorizer {

   private static int[] grassColors;
   private static int[] waterColors;
   private static int[] foliageColors;
   private static int[] foliagePineColors;
   private static int[] foliageBirchColors;
   private static int[] swampFoliageColors;
   private static int[] swampGrassColors;
   private static int[][] blockPalettes;
   private static int[][] paletteColors;
   private static int[] skyColors;
   private static int[] fogColors;
   private static int[] underwaterColors;
   private static float[][][] lightMapsColorsRgb;
   private static int[] lightMapsHeight;
   private static float[][] sunRgbs;
   private static float[][] torchRgbs;
   private static int[] redstoneColors;
   private static int[] stemColors;
   private static int[] myceliumParticleColors;
   private static boolean useDefaultColorMultiplier;
   private static int particleWaterColor;
   private static int particlePortalColor;
   private static int lilyPadColor;
   private static azw fogColorNether;
   private static azw fogColorEnd;
   private static azw skyColorEnd;
   private static final int TYPE_NONE = 0;
   private static final int TYPE_GRASS = 1;
   private static final int TYPE_FOLIAGE = 2;
   private static Random random;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1378;


   // $FF: renamed from: <init> () void
   public void method_1446() {
      super();
   }

   public static void update() {
      // $FF: Couldn't be decompiled
   }

   private static int getTextureHeight(String param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static float[][] toRgb(int[] var0) {
      float[][] var2 = new float[var0.length][3];
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var1 = var10000;

      float[][] var9;
      while(true) {
         if(var3 < var0.length) {
            int var4 = var0[var3];
            float var5 = (float)(var4 >> 16 & 255) / 255.0F;
            float var6 = (float)(var4 >> 8 & 255) / 255.0F;
            float var7 = (float)(var4 & 255) / 255.0F;
            var9 = var2;
            if(var1 == null) {
               break;
            }

            float[] var8 = var2[var3];
            var8[0] = var5;
            var8[1] = var6;
            var8[2] = var7;
            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         var9 = var2;
         break;
      }

      return var9;
   }

   private static void readColorProperties(String var0) {
      String[] var1 = class_752.method_4253();

      try {
         bqx var10000 = new bqx;
         var10000.method_8227(var0);
         bqx var2 = var10000;
         InputStream var3 = Config.getResourceStream(var2);

         String[] var5;
         label31: {
            try {
               if(var1 == null) {
                  break label31;
               }

               if(var3 == null) {
                  return;
               }
            } catch (FileNotFoundException var6) {
               throw method_1448(var6);
            }

            StringBuilder var9 = new StringBuilder();
            var5 = field_1378;
            Config.log(var9.append("Loading ").append(var0).toString());
         }

         Properties var4 = new Properties();
         var4.load(var3);
         var5 = field_1378;
         lilyPadColor = readColor(var4, "lilypad");
         particleWaterColor = readColor(var4, new String[]{"particle.water", "drop.water"});
         particlePortalColor = readColor(var4, "particle.portal");
         fogColorNether = readColorVec3(var4, "fog.nether");
         fogColorEnd = readColorVec3(var4, "fog.end");
         skyColorEnd = readColorVec3(var4, "sky.end");
         readCustomPalettes(var4, var0);
      } catch (FileNotFoundException var7) {
         return;
      } catch (IOException var8) {
         var8.printStackTrace();
      }

   }

   private static void readCustomPalettes(Properties param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   private static int readColor(Properties param0, String[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static int readColor(Properties param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   private static azw readColorVec3(Properties param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   private static int[] getCustomColors(String param0, String[] param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static int[] getCustomColors(String param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public static void updateUseDefaultColorMultiplier() {
      // $FF: Couldn't be decompiled
   }

   public static int getColorMultiplier(aji param0, ahl param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private static int getSmoothColorMultiplier(aji param0, ahl param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   public static int getFluidColor(aji param0, ahl param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private static int getCustomColor(int[] var0, ahl var1, int var2, int var3, int var4) {
      class_985 var5 = var1.method_35(var2, var4);
      double var6 = (double)class_1715.method_9569(var5.method_5713(var2, var3, var4), 0.0F, 1.0F);
      double var8 = (double)class_1715.method_9569(var5.method_5712(), 0.0F, 1.0F);
      var8 *= var6;
      int var10 = (int)((1.0D - var6) * 255.0D);
      int var11 = (int)((1.0D - var8) * 255.0D);
      return var0[var11 << 8 | var10] & 16777215;
   }

   public static void updatePortalFX(class_716 var0) {
      String[] var1 = class_752.method_4253();

      int var10000;
      label20: {
         try {
            var10000 = particlePortalColor;
            if(var1 == null) {
               break label20;
            }

            if(particlePortalColor < 0) {
               return;
            }
         } catch (NumberFormatException var9) {
            throw method_1448(var9);
         }

         var10000 = particlePortalColor;
      }

      int var2 = var10000;
      int var3 = var2 >> 16 & 255;
      int var4 = var2 >> 8 & 255;
      int var5 = var2 & 255;
      float var6 = (float)var3 / 255.0F;
      float var7 = (float)var4 / 255.0F;
      float var8 = (float)var5 / 255.0F;
      var0.method_4096(var6, var7, var8);
   }

   public static void updateMyceliumFX(class_716 var0) {
      String[] var1 = class_752.method_4253();

      int[] var10000;
      label20: {
         try {
            var10000 = myceliumParticleColors;
            if(var1 == null) {
               break label20;
            }

            if(myceliumParticleColors == null) {
               return;
            }
         } catch (NumberFormatException var9) {
            throw method_1448(var9);
         }

         var10000 = myceliumParticleColors;
      }

      int var2 = var10000[random.nextInt(myceliumParticleColors.length)];
      int var3 = var2 >> 16 & 255;
      int var4 = var2 >> 8 & 255;
      int var5 = var2 & 255;
      float var6 = (float)var3 / 255.0F;
      float var7 = (float)var4 / 255.0F;
      float var8 = (float)var5 / 255.0F;
      var0.method_4096(var6, var7, var8);
   }

   public static void updateReddustFX(class_716 param0, ahl param1, double param2, double param4, double param6) {
      // $FF: Couldn't be decompiled
   }

   public static int getRedstoneColor(int param0) {
      // $FF: Couldn't be decompiled
   }

   public static void updateWaterFX(class_716 param0, ahl param1) {
      // $FF: Couldn't be decompiled
   }

   public static int getLilypadColor() {
      // $FF: Couldn't be decompiled
   }

   public static azw getFogColorNether(azw var0) {
      String[] var1 = class_752.method_4253();

      azw var10000;
      label32: {
         try {
            var10000 = fogColorNether;
            if(var1 == null) {
               return var10000;
            }

            if(fogColorNether == null) {
               break label32;
            }
         } catch (NumberFormatException var2) {
            throw method_1448(var2);
         }

         var10000 = fogColorNether;
         return var10000;
      }

      var10000 = var0;
      return var10000;
   }

   public static azw getFogColorEnd(azw var0) {
      String[] var1 = class_752.method_4253();

      azw var10000;
      label32: {
         try {
            var10000 = fogColorEnd;
            if(var1 == null) {
               return var10000;
            }

            if(fogColorEnd == null) {
               break label32;
            }
         } catch (NumberFormatException var2) {
            throw method_1448(var2);
         }

         var10000 = fogColorEnd;
         return var10000;
      }

      var10000 = var0;
      return var10000;
   }

   public static azw getSkyColorEnd(azw var0) {
      String[] var1 = class_752.method_4253();

      azw var10000;
      label32: {
         try {
            var10000 = skyColorEnd;
            if(var1 == null) {
               return var10000;
            }

            if(skyColorEnd == null) {
               break label32;
            }
         } catch (NumberFormatException var2) {
            throw method_1448(var2);
         }

         var10000 = skyColorEnd;
         return var10000;
      }

      var10000 = var0;
      return var10000;
   }

   public static azw getSkyColor(azw param0, ahl param1, double param2, double param4, double param6) {
      // $FF: Couldn't be decompiled
   }

   public static azw getFogColor(azw param0, ahl param1, double param2, double param4, double param6) {
      // $FF: Couldn't be decompiled
   }

   public static azw getUnderwaterColor(ahl param0, double param1, double param3, double param5) {
      // $FF: Couldn't be decompiled
   }

   public static int getSmoothColor(int[] var0, ahl var1, double var2, double var4, double var6, int var8, int var9) {
      String[] var10 = class_752.method_4253();

      try {
         if(var0 == null) {
            return -1;
         }
      } catch (NumberFormatException var23) {
         throw method_1448(var23);
      }

      int var11 = (int)Math.floor(var2);
      int var12 = (int)Math.floor(var4);
      int var13 = (int)Math.floor(var6);
      int var14 = var8 * var9 / 2;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = var11 - var14;

      int var10000;
      int var20;
      int var21;
      while(true) {
         if(var19 <= var11 + var14) {
            var10000 = var13 - var14;
            if(var10 == null) {
               break;
            }

            var20 = var10000;

            while(true) {
               if(var20 <= var13 + var14) {
                  var21 = getCustomColor(var0, var1, var19, var12, var20);
                  var15 += var21 >> 16 & 255;
                  var16 += var21 >> 8 & 255;
                  var17 += var21 & 255;
                  ++var18;
                  var20 += var9;

                  try {
                     if(var10 == null) {
                        break;
                     }

                     if(var10 != null) {
                        continue;
                     }
                  } catch (NumberFormatException var22) {
                     throw method_1448(var22);
                  }
               }

               var19 += var9;
               break;
            }

            if(var10 != null) {
               continue;
            }
         }

         var19 = var15 / var18;
         var10000 = var16 / var18;
         break;
      }

      var20 = var10000;
      var21 = var17 / var18;
      return var19 << 16 | var20 << 8 | var21;
   }

   public static int mixColors(int param0, int param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   private static int averageColor(int var0, int var1) {
      int var2 = var0 >> 16 & 255;
      int var3 = var0 >> 8 & 255;
      int var4 = var0 & 255;
      int var5 = var1 >> 16 & 255;
      int var6 = var1 >> 8 & 255;
      int var7 = var1 & 255;
      int var8 = (var2 + var5) / 2;
      int var9 = (var3 + var6) / 2;
      int var10 = (var4 + var7) / 2;
      return var8 << 16 | var9 << 8 | var10;
   }

   public static int getStemColorMultiplier(class_455 var0, ahl var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();

      try {
         if(stemColors == null) {
            return var0.method_2495(var1, var2, var3, var4);
         }
      } catch (NumberFormatException var9) {
         throw method_1448(var9);
      }

      int var6 = var1.method_33(var2, var3, var4);

      int var10000;
      label42: {
         label41: {
            try {
               var10000 = var6;
               if(var5 == null) {
                  break label42;
               }

               if(var6 >= 0) {
                  break label41;
               }
            } catch (NumberFormatException var8) {
               throw method_1448(var8);
            }

            var6 = 0;
         }

         var10000 = var6;
      }

      label32: {
         try {
            if(var5 == null) {
               return var10000;
            }

            if(var10000 < stemColors.length) {
               break label32;
            }
         } catch (NumberFormatException var7) {
            throw method_1448(var7);
         }

         var6 = stemColors.length - 1;
      }

      var10000 = stemColors[var6];
      return var10000;
   }

   public static boolean updateLightmap(ahb param0, float param1, int[] param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   private static void getLightMapColumn(float[][] param0, float param1, int param2, int param3, float[][] param4) {
      // $FF: Couldn't be decompiled
   }

   public static azw getWorldFogColor(azw var0, bjf var1, float var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = var1.field_1820.field_5738;
      String[] var3 = var10000;

      label36: {
         label35: {
            label34: {
               try {
                  if(var3 == null) {
                     break label34;
                  }

                  switch(var4) {
                  case -1:
                     break;
                  case 0:
                     break label35;
                  case 1:
                     break label36;
                  default:
                     return var0;
                  }
               } catch (NumberFormatException var6) {
                  throw method_1448(var6);
               }

               var0 = getFogColorNether(var0);
            }

            if(var3 != null) {
               return var0;
            }
         }

         bao var5 = bao.method_5273();
         var0 = getFogColor(var0, var5.cursorCounter6, var5.cursorCounter9.field_2994, var5.cursorCounter9.field_2995 + 1.0D, var5.cursorCounter9.field_2996);
         if(var3 != null) {
            return var0;
         }
      }

      var0 = getFogColorEnd(var0);
      return var0;
   }

   public static azw getWorldSkyColor(azw var0, bjf var1, class_752 var2, float var3) {
      int var5 = var1.field_1820.field_5738;
      String[] var4 = class_752.method_4253();
      switch(var5) {
      case 0:
         bao var6 = bao.method_5273();
         var0 = getSkyColor(var0, var6.cursorCounter6, var6.cursorCounter9.field_2994, var6.cursorCounter9.field_2995 + 1.0D, var6.cursorCounter9.field_2996);
         if(var4 != null) {
            break;
         }
      case 1:
         var0 = getSkyColorEnd(var0);
      }

      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1447() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_1448(Exception var0) {
      return var0;
   }
}
