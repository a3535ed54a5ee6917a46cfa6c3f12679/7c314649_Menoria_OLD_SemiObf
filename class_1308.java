import java.util.Random;

// $FF: renamed from: jc
public class class_1308 extends class_1306 {

   // $FF: renamed from: b jb[]
   private class_1309[] field_6714;
   // $FF: renamed from: c int
   private int field_6715;


   // $FF: renamed from: <init> (java.util.Random, int) void
   public void method_6903(Random var1, int var2) {
      super.method_6898();
      this.field_6715 = var2;
      String[] var10000 = class_752.method_4253();
      this.field_6714 = new class_1309[var2];
      String[] var3 = var10000;
      int var4 = 0;

      while(var4 < var2) {
         class_1309[] var5 = this.field_6714;
         class_1309 var10002 = new class_1309;
         var10002.method_6906(var1);
         var5[var4] = var10002;
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (double[], int, int, int, int, int, int, double, double, double) double[]
   public double[] method_6904(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7, double var8, double var10, double var12) {
      String[] var14;
      label38: {
         label34: {
            var14 = class_752.method_4253();
            double[] var10000 = var1;
            if(var14 != null) {
               if(var1 != null) {
                  break label34;
               }

               var10000 = new double[var5 * var6 * var7];
            }

            var1 = var10000;
            if(var14 != null) {
               break label38;
            }
         }

         int var15 = 0;

         while(var15 < var1.length) {
            var1[var15] = 0.0D;
            ++var15;
            if(var14 == null) {
               break;
            }
         }
      }

      double var28 = 1.0D;
      int var17 = 0;

      while(var17 < this.field_6715) {
         double var18 = (double)var2 * var28 * var8;
         double var20 = (double)var3 * var28 * var10;
         double var22 = (double)var4 * var28 * var12;
         long var24 = class_1715.method_9562(var18);
         long var26 = class_1715.method_9562(var22);
         var18 -= (double)var24;
         var22 -= (double)var26;
         var24 %= 16777216L;
         var26 %= 16777216L;
         var18 += (double)var24;
         var22 += (double)var26;
         this.field_6714[var17].method_6910(var1, var18, var20, var22, var5, var6, var7, var8 * var28, var10 * var28, var12 * var28, var28);
         var28 /= 2.0D;
         ++var17;
         if(var14 == null) {
            break;
         }
      }

      return var1;
   }

   // $FF: renamed from: b (double[], int, int, int, int, double, double, double) double[]
   public double[] method_6905(double[] var1, int var2, int var3, int var4, int var5, double var6, double var8, double var10) {
      return this.method_6904(var1, var2, 10, var3, var4, 1, var5, var6, 1.0D, var8);
   }
}
