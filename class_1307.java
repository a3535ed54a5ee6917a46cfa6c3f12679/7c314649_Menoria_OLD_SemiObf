import java.util.Random;

// $FF: renamed from: jd
public class class_1307 extends class_1306 {

   // $FF: renamed from: b i_[]
   private class_1264[] field_6712;
   // $FF: renamed from: c int
   private int field_6713;


   // $FF: renamed from: <init> (java.util.Random, int) void
   public void method_6899(Random var1, int var2) {
      super.method_6898();
      this.field_6713 = var2;
      this.field_6712 = new class_1264[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         class_1264[] var10000 = this.field_6712;
         class_1264 var10002 = new class_1264;
         var10002.method_6668(var1);
         var10000[var3] = var10002;
      }

   }

   // $FF: renamed from: b (double, double) double
   public double method_6900(double var1, double var3) {
      double var6 = 0.0D;
      double var8 = 1.0D;
      String[] var5 = class_752.method_4253();
      int var10 = 0;

      double var10000;
      while(true) {
         if(var10 < this.field_6713) {
            var6 += this.field_6712[var10].method_6671(var1 * var8, var3 * var8) / var8;
            var10000 = var8 / 2.0D;
            if(var5 == null) {
               break;
            }

            var8 = var10000;
            ++var10;
            if(var5 != null) {
               continue;
            }
         }

         var10000 = var6;
         break;
      }

      return var10000;
   }

   // $FF: renamed from: b (double[], double, double, int, int, double, double, double) double[]
   public double[] method_6901(double[] var1, double var2, double var4, int var6, int var7, double var8, double var10, double var12) {
      return this.method_6902(var1, var2, var4, var6, var7, var8, var10, var12, 0.5D);
   }

   // $FF: renamed from: b (double[], double, double, int, int, double, double, double, double) double[]
   public double[] method_6902(double[] var1, double var2, double var4, int var6, int var7, double var8, double var10, double var12, double var14) {
      String[] var16;
      label46: {
         int var22;
         label42: {
            label41: {
               var16 = class_752.method_4253();
               double[] var10000 = var1;
               if(var16 != null) {
                  if(var1 != null) {
                     var22 = var1.length;
                     if(var16 == null) {
                        break label42;
                     }

                     if(var22 >= var6 * var7) {
                        break label41;
                     }
                  }

                  var10000 = new double[var6 * var7];
               }

               var1 = var10000;
               if(var16 != null) {
                  break label46;
               }
            }

            var22 = 0;
         }

         int var17 = var22;

         while(var17 < var1.length) {
            var1[var17] = 0.0D;
            ++var17;
            if(var16 == null) {
               break;
            }
         }
      }

      double var23 = 1.0D;
      double var19 = 1.0D;
      int var21 = 0;

      while(var21 < this.field_6713) {
         this.field_6712[var21].method_6672(var1, var2, var4, var6, var7, var8 * var19 * var23, var10 * var19 * var23, 0.55D / var23);
         var19 *= var12;
         var23 *= var14;
         ++var21;
         if(var16 == null) {
            break;
         }
      }

      return var1;
   }
}
