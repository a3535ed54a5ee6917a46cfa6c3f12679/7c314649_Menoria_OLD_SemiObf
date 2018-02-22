import java.util.Random;

// $FF: renamed from: fB
public class class_413 extends aji {

   // $FF: renamed from: M boolean
   private final boolean field_2120;


   // $FF: renamed from: <init> (boolean) void
   public void method_2656(boolean var1) {
      super.method_2427(awt.field_4189);
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         this.field_2120 = var1;
         if(var1) {
            this.method_2430(1.0F);
         }
      }

   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var5 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = this.field_2120;
      }

      if(var5 != null) {
         label38: {
            if(var10000) {
               var10000 = var1.method_2172(var2, var3, var4);
               if(var5 == null) {
                  break label38;
               }

               if(!var10000) {
                  var1.method_2110(var2, var3, var4, this, 4);
                  if(var5 != null) {
                     return;
                  }
               }
            }

            var10000 = this.field_2120;
         }
      }

      if(var5 != null) {
         if(var10000) {
            return;
         }

         var10000 = var1.method_2172(var2, var3, var4);
      }

      if(var5 != null && var10000) {
         var1.method_2054(var2, var3, var4, class_1192.field_6148, 0, 2);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = this.field_2120;
      }

      if(var6 != null) {
         label38: {
            if(var10000) {
               var10000 = var1.method_2172(var2, var3, var4);
               if(var6 == null) {
                  break label38;
               }

               if(!var10000) {
                  var1.method_2110(var2, var3, var4, this, 4);
                  if(var6 != null) {
                     return;
                  }
               }
            }

            var10000 = this.field_2120;
         }
      }

      if(var6 != null) {
         if(var10000) {
            return;
         }

         var10000 = var1.method_2172(var2, var3, var4);
      }

      if(var6 != null && var10000) {
         var1.method_2054(var2, var3, var4, class_1192.field_6148, 0, 2);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = this.field_2120;
      }

      if(var6 != null) {
         if(!var10000) {
            return;
         }

         var10000 = var1.method_2172(var2, var3, var4);
      }

      if(var6 != null && !var10000) {
         var1.method_2054(var2, var3, var4, class_1192.field_6147, 0, 2);
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return adb.method_2920(class_1192.field_6147);
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return adb.method_2920(class_1192.field_6147);
   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      add var10000 = new add;
      var10000.method_3721(class_1192.field_6147);
      return var10000;
   }
}
