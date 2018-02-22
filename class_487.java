import java.util.Random;

// $FF: renamed from: d8
public class class_487 extends class_473 {

   // $FF: renamed from: <init> () void
   public void method_2852() {
      super.method_2427(awt.field_4175);
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_593 var10000 = new class_593;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      byte var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.method_2172(var2, var3, var4);
      }

      byte var7 = var10000;
      int var8 = var1.method_33(var2, var3, var4);
      int var10 = var8 & 1;
      if(var6 != null) {
         var10 = var10 != 0?1:0;
      }

      int var9 = var10;
      var10 = var7;
      if(var6 != null) {
         label45: {
            if(var7 != 0) {
               var10 = var9;
               if(var6 == null) {
                  break label45;
               }

               if(var9 == 0) {
                  var1.method_2055(var2, var3, var4, var8 | 1, 4);
                  var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
                  if(var6 != null) {
                     return;
                  }
               }
            }

            var10 = var7;
         }
      }

      if(var6 != null) {
         if(var10 != 0) {
            return;
         }

         var10 = var9;
      }

      if(var6 != null && var10 != 0) {
         var1.method_2055(var2, var3, var4, var8 & -2, 4);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var10000 = class_752.method_4253();
      class_580 var7 = var1.method_31(var2, var3, var4);
      String[] var6 = var10000;
      class_580 var9 = var7;
      if(var6 != null) {
         if(var7 == null) {
            return;
         }

         var9 = var7;
      }

      if(var6 != null) {
         if(!(var9 instanceof class_593)) {
            return;
         }

         var9 = var7;
      }

      class_926 var8 = ((class_593)var9).method_3160();
      var8.method_5440(var1);
      var1.method_2221(var2, var3, var4, this);
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 1;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      class_593 var10 = (class_593)var1.method_31(var2, var3, var4);
      if(var10 != null) {
         var5.method_4586(var10);
      }

      return true;
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return true;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      byte var9;
      label23: {
         String[] var10000 = class_752.method_4253();
         class_580 var7 = var1.method_31(var2, var3, var4);
         String[] var6 = var10000;
         class_580 var8 = var7;
         if(var6 != null) {
            if(var7 == null) {
               break label23;
            }

            var8 = var7;
         }

         var9 = var8 instanceof class_593;
         if(var6 == null) {
            return var9;
         }

         if(var9 != 0) {
            return ((class_593)var7).method_3160().method_5434();
         }
      }

      var9 = 0;
      return var9;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      class_593 var7 = (class_593)var1.method_31(var2, var3, var4);
      if(var6.method_3773()) {
         var7.method_3160().method_5441(var6.method_3770());
      }

   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }
}
