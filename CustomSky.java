import java.io.FileNotFoundException;
import org.lwjgl.opengl.GL11;

public class CustomSky {

   private static CustomSkyLayer[][] worldSkyLayers;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_146;


   // $FF: renamed from: <init> () void
   public void method_484() {
      super();
   }

   public static void reset() {
      worldSkyLayers = (CustomSkyLayer[][])((CustomSkyLayer[][])null);
   }

   public static void update() {
      reset();
      if(Config.isCustomSky()) {
         worldSkyLayers = readCustomSkies();
      }

   }

   private static CustomSkyLayer[][] readCustomSkies() {
      // $FF: Couldn't be decompiled
   }

   public static void renderSky(ahb var0, bqf var1, float var2, float var3) {
      String[] var4 = class_752.method_4253();
      if(worldSkyLayers != null) {
         int var10000 = Config.getGameSettings().field_4487;
         if(var4 != null) {
            if(var10000 < 8) {
               return;
            }

            var10000 = var0.field_1820.field_5738;
         }

         int var5 = var10000;
         var10000 = var5;
         if(var4 != null) {
            if(var5 < 0) {
               return;
            }

            var10000 = var5;
         }

         if(var10000 < worldSkyLayers.length) {
            CustomSkyLayer[] var6 = worldSkyLayers[var5];
            if(var6 != null) {
               long var7 = var0.method_2185();
               int var9 = (int)(var7 % 24000L);
               int var10 = 0;

               while(true) {
                  if(var10 < var6.length) {
                     CustomSkyLayer var11 = var6[var10];
                     if(var4 == null) {
                        break;
                     }

                     if(var4 != null) {
                        if(var11.isActive(var9)) {
                           var11.render(var9, var2, var3);
                        }

                        ++var10;
                     }

                     if(var4 != null) {
                        continue;
                     }
                  }

                  clearBlend(var3);
                  break;
               }
            }
         }
      }

   }

   public static boolean hasSkyLayers(ahb var0) {
      String[] var1 = class_752.method_4253();
      if(worldSkyLayers == null) {
         return false;
      } else {
         int var10000 = Config.getGameSettings().field_4487;
         if(var1 != null) {
            if(var10000 < 8) {
               return false;
            }

            var10000 = var0.field_1820.field_5738;
         }

         int var2 = var10000;
         var10000 = var2;
         if(var1 != null) {
            if(var2 >= 0) {
               var10000 = var2;
               if(var1 == null) {
                  return (boolean)var10000;
               }

               if(var2 < worldSkyLayers.length) {
                  CustomSkyLayer[] var3 = worldSkyLayers[var2];
                  CustomSkyLayer[] var4 = var3;
                  if(var1 != null) {
                     if(var3 == null) {
                        var10000 = 0;
                        return (boolean)var10000;
                     }

                     var4 = var3;
                  }

                  var10000 = var4.length;
                  if(var1 != null) {
                     var10000 = var10000 > 0?1:0;
                  }

                  return (boolean)var10000;
               }
            }

            var10000 = 0;
         }

         return (boolean)var10000;
      }
   }

   private static void clearBlend(float var0) {
      GL11.glDisable(3008);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 1);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_485() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.FileNotFoundException) java.io.FileNotFoundException
   private static FileNotFoundException method_486(FileNotFoundException var0) {
      return var0;
   }
}
