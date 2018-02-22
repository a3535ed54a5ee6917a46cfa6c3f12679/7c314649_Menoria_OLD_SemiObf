import java.util.List;
import java.util.Random;

// $FF: renamed from: fb
public class class_380 extends class_378 {

   // $FF: renamed from: N java.lang.String[]
   public static final String[] field_2054;
   // $FF: renamed from: O vL
   private class_73 field_2055;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_2056;


   // $FF: renamed from: <init> (boolean) void
   public void method_2587(boolean var1) {
      super.method_2583(var1, awt.field_4174);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      int var4 = var2 & 7;
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_2052;
      if(var3 != null) {
         label88: {
            if(this.field_2052) {
               var10000 = var2 & 8;
               if(var3 == null) {
                  break label88;
               }

               if(var10000 != 0) {
                  var1 = 1;
               }
            }

            var10000 = var4;
         }
      }

      if(var3 != null) {
         if(var10000 == 0) {
            var10000 = var1;
            if(var3 != null) {
               if(var1 == 1) {
                  return this.field_2010;
               }

               var10000 = var1;
            }

            if(var10000 != 0) {
               return this.field_2055;
            }

            return this.field_2010;
         }

         var10000 = var4;
      }

      byte var10001 = 1;
      if(var3 != null) {
         if(var10000 == 1) {
            return class_1192.field_6051.getBlockTextureFromSide(var1);
         }

         var10000 = var4;
         var10001 = 2;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return class_1192.field_6030.getBlockTextureFromSide(var1);
         }

         var10000 = var4;
         var10001 = 3;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return class_1192.field_6029.getBlockTextureFromSide(var1);
         }

         var10000 = var4;
         var10001 = 4;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return class_1192.field_6072.getBlockTextureFromSide(var1);
         }

         var10000 = var4;
         var10001 = 5;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return class_1192.field_6123.method_2448(var1, 0);
         }

         var10000 = var4;
         var10001 = 6;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return class_1192.field_6137.getBlockTextureFromSide(1);
         }

         var10000 = var4;
         var10001 = 7;
      }

      return var10000 == var10001?class_1192.field_6179.getBlockTextureFromSide(var1):this.field_2010;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var2 = field_2056;
      this.field_2010 = var1.method_375("stone_slab_top");
      this.field_2055 = var1.method_375("stone_slab_side");
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return adb.method_2920(class_1192.field_6071);
   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      add var10000 = new add;
      var10000.method_3726(adb.method_2920(class_1192.field_6071), 2, var1 & 7);
      return var10000;
   }

   // $FF: renamed from: c (int) java.lang.String
   public String method_2585(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         label17: {
            if(var1 >= 0) {
               var10000 = var1;
               if(var2 == null) {
                  break label17;
               }

               if(var1 < field_2054.length) {
                  return super.method_2510() + "." + field_2054[var1];
               }
            }

            var10000 = 0;
         }
      }

      var1 = var10000;
      return super.method_2510() + "." + field_2054[var1];
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      String[] var4 = class_752.method_4253();
      if(var1 != adb.method_2920(class_1192.field_6070)) {
         int var5 = 0;

         while(var5 <= 7) {
            if(var4 != null && var5 != 2) {
               add var10001 = new add;
               var10001.method_3726(var1, 1, var5);
               var3.add(var10001);
            }

            ++var5;
            if(var4 == null) {
               break;
            }
         }

      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
