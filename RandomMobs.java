import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomMobs {

   private static Map textureVariantsMap;
   private static bma renderGlobal;
   private static boolean initialized;
   private static Random random;
   private static Field fieldEntityUuid;
   private static boolean working;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2969;


   // $FF: renamed from: <init> () void
   public void method_3798() {
      super();
   }

   public static void entityLoaded(class_689 param0) {
      // $FF: Couldn't be decompiled
   }

   private static Field getField(Class var0, Class var1) {
      try {
         Field[] var2 = var0.getDeclaredFields();

         for(int var3 = 0; var3 < var2.length; ++var3) {
            Field var4 = var2[var3];
            Class var5 = var4.getType();
            if(var5 == var1) {
               var4.setAccessible(true);
               return var4;
            }
         }

         return null;
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public static void worldChanged(ahb var0, ahb var1) {
      String[] var2 = class_752.method_4253();
      ahb var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return;
         }

         var10000 = var1;
      }

      List var3 = var10000.method_2161();
      int var4 = 0;

      while(var4 < var3.size()) {
         class_689 var5 = (class_689)var3.get(var4);
         entityLoaded(var5);
         ++var4;
         if(var2 == null) {
            break;
         }
      }

   }

   public static bqx getTextureLocation(bqx param0) {
      // $FF: Couldn't be decompiled
   }

   private static bqx getTextureLocation(bqx var0, int var1) {
      String[] var2 = class_752.method_4253();
      if(var1 <= 0) {
         return var0;
      } else {
         String var3 = var0.method_8228();
         bqx[] var4 = (bqx[])((bqx[])((bqx[])textureVariantsMap.get(var3)));
         bqx[] var10000 = var4;
         if(var2 != null) {
            if(var4 == null) {
               var4 = getTextureVariants(var0);
               textureVariantsMap.put(var3, var4);
            }

            var10000 = var4;
         }

         if(var2 != null) {
            if(var10000 == null) {
               return var0;
            }

            var10000 = var4;
         }

         int var7 = var10000.length;
         if(var2 != null) {
            if(var7 <= 0) {
               return var0;
            }

            var7 = var1 % var4.length;
         }

         int var5 = var7;
         bqx var6 = var4[var5];
         return var6;
      }
   }

   private static bqx[] getTextureVariants(bqx var0) {
      TextureUtils.getTexture(var0);
      String[] var10000 = class_752.method_4253();
      bqx[] var2 = new bqx[0];
      String var3 = var0.method_8228();
      String[] var1 = var10000;
      int var4 = var3.lastIndexOf(46);
      if(var4 < 0) {
         return var2;
      } else {
         String var5 = var3.substring(0, var4);
         String var6 = var3.substring(var4);
         String[] var12 = field_2969;
         String var7 = "textures/entity/";
         int var13 = var5.startsWith(var7);
         StringBuilder var14;
         if(var1 != null) {
            if(var13 == 0) {
               return var2;
            }

            var5 = var5.substring(var7.length());
            var14 = new StringBuilder();
            var12 = field_2969;
            var5 = var14.append("mcpatcher/mob/").append(var5).toString();
            var13 = getCountTextureVariants(var5, var6);
         }

         int var8 = var13;
         var13 = var8;
         if(var1 != null) {
            if(var8 <= 1) {
               return var2;
            }

            var2 = new bqx[var8];
            var2[0] = var0;
            var13 = 1;
         }

         int var9 = var13;

         while(true) {
            if(var9 < var2.length) {
               int var10 = var9 + 1;
               String var11 = var5 + var10 + var6;
               bqx var10002 = new bqx;
               var10002.method_8226(var0.method_8229(), var11);
               var2[var9] = var10002;
               TextureUtils.getTexture(var2[var9]);
               ++var9;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            }

            var14 = new StringBuilder();
            var12 = field_2969;
            Config.dbg(var14.append("RandomMobs: ").append(var0).append(", variants: ").append(var2.length).toString());
            break;
         }

         return var2;
      }
   }

   private static int getCountTextureVariants(String var0, String var1) {
      short var3 = 1000;
      String[] var10000 = class_752.method_4253();
      int var4 = 2;
      String[] var2 = var10000;

      short var8;
      while(true) {
         if(var4 < var3) {
            String var5 = var0 + var4 + var1;
            bqx var7 = new bqx;
            var7.method_8227(var5);
            bqx var6 = var7;
            if(var2 != null) {
               var8 = Config.hasResource(var6);
               if(var2 == null) {
                  break;
               }

               if(var8 == 0) {
                  return var4 - 1;
               }

               ++var4;
            }

            if(var2 != null) {
               continue;
            }
         }

         var8 = var3;
         break;
      }

      return var8;
   }

   public static void resetTextures() {
      textureVariantsMap.clear();
      if(Config.isRandomMobs()) {
         initialize();
      }

   }

   private static void initialize() {
      String[] var10000 = class_752.method_4253();
      renderGlobal = Config.getRenderGlobal();
      String[] var0 = var10000;
      if(var0 != null) {
         if(renderGlobal == null) {
            return;
         }

         initialized = true;
      }

      ArrayList var1 = new ArrayList();
      String[] var6 = field_2969;
      var1.add("bat");
      var1.add("blaze");
      var1.add("cat/black");
      var1.add("cat/ocelot");
      var1.add("cat/red");
      var1.add("cat/siamese");
      var1.add("chicken");
      var1.add("cow/cow");
      var1.add("cow/mooshroom");
      var1.add("creeper/creeper");
      var1.add("enderman/enderman");
      var1.add("enderman/enderman_eyes");
      var1.add("ghast/ghast");
      var1.add("ghast/ghast_shooting");
      var1.add("iron_golem");
      var1.add("pig/pig");
      var1.add("sheep/sheep");
      var1.add("sheep/sheep_fur");
      var1.add("silverfish");
      var1.add("skeleton/skeleton");
      var1.add("skeleton/wither_skeleton");
      var1.add("slime/slime");
      var1.add("slime/magmacube");
      var1.add("snowman");
      var1.add("spider/cave_spider");
      var1.add("spider/spider");
      var1.add("spider_eyes");
      var1.add("squid");
      var1.add("villager/villager");
      var1.add("villager/butcher");
      var1.add("villager/farmer");
      var1.add("villager/librarian");
      var1.add("villager/priest");
      var1.add("villager/smith");
      var1.add("wither/wither");
      var1.add("wither/wither_armor");
      var1.add("wither/wither_invulnerable");
      var1.add("wolf/wolf");
      var1.add("wolf/wolf_angry");
      var1.add("wolf/wolf_collar");
      var1.add("wolf/wolf_tame");
      var1.add("zombie_pigman");
      var1.add("zombie/zombie");
      var1.add("zombie/zombie_villager");
      int var2 = 0;

      while(var2 < var1.size()) {
         String var3 = (String)var1.get(var2);
         StringBuilder var7 = new StringBuilder();
         var6 = field_2969;
         String var4 = var7.append("textures/entity/").append(var3).append(".png").toString();
         bqx var8 = new bqx;
         var8.method_8227(var4);
         bqx var5 = var8;
         if(var0 != null) {
            if(!Config.hasResource(var5)) {
               Config.warn("Not found: " + var5);
            }

            getTextureLocation(var5, 100);
         }

         ++var2;
         if(var0 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_3799() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_3800(Exception var0) {
      return var0;
   }
}
