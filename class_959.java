import java.util.Arrays;
import java.util.List;
import java.util.Random;

// $FF: renamed from: d1
public class class_959 extends class_958 {

   // $FF: renamed from: e dz
   private class_985 field_4851;
   // $FF: renamed from: f float
   private float field_4852;


   // $FF: renamed from: <init> (dz, float) void
   public void method_5548(class_985 var1, float var2) {
      super.method_5533();
      this.field_4851 = var1;
      this.field_4852 = var2;
   }

   // $FF: renamed from: b (int, int) dz
   public class_985 method_5537(int var1, int var2) {
      return this.field_4851;
   }

   // $FF: renamed from: b (dz[], int, int, int, int) dz[]
   public class_985[] method_5540(class_985[] var1, int var2, int var3, int var4, int var5) {
      class_985[] var10000;
      label20: {
         String[] var6 = class_752.method_4253();
         var10000 = var1;
         if(var6 != null) {
            if(var1 != null) {
               var10000 = var1;
               if(var6 == null) {
                  return var10000;
               }

               if(var1.length >= var4 * var5) {
                  break label20;
               }
            }

            var10000 = new class_985[var4 * var5];
         }

         var1 = var10000;
      }

      Arrays.fill(var1, 0, var4 * var5, this.field_4851);
      var10000 = var1;
      return var10000;
   }

   // $FF: renamed from: b (float[], int, int, int, int) float[]
   public float[] method_5538(float[] var1, int var2, int var3, int var4, int var5) {
      float[] var10000;
      label20: {
         String[] var6 = class_752.method_4253();
         var10000 = var1;
         if(var6 != null) {
            if(var1 != null) {
               var10000 = var1;
               if(var6 == null) {
                  return var10000;
               }

               if(var1.length >= var4 * var5) {
                  break label20;
               }
            }

            var10000 = new float[var4 * var5];
         }

         var1 = var10000;
      }

      Arrays.fill(var1, 0, var4 * var5, this.field_4852);
      var10000 = var1;
      return var10000;
   }

   // $FF: renamed from: c (dz[], int, int, int, int) dz[]
   public class_985[] method_5541(class_985[] var1, int var2, int var3, int var4, int var5) {
      class_985[] var10000;
      label20: {
         String[] var6 = class_752.method_4253();
         var10000 = var1;
         if(var6 != null) {
            if(var1 != null) {
               var10000 = var1;
               if(var6 == null) {
                  return var10000;
               }

               if(var1.length >= var4 * var5) {
                  break label20;
               }
            }

            var10000 = new class_985[var4 * var5];
         }

         var1 = var10000;
      }

      Arrays.fill(var1, 0, var4 * var5, this.field_4851);
      var10000 = var1;
      return var10000;
   }

   // $FF: renamed from: b (dz[], int, int, int, int, boolean) dz[]
   public class_985[] method_5542(class_985[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return this.method_5541(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: b (int, int, int, java.util.List, java.util.Random) dd
   public class_1034 method_5544(int var1, int var2, int var3, List var4, Random var5) {
      if(var4.contains(this.field_4851)) {
         class_1034 var10000 = new class_1034;
         var10000.method_5854(var1 - var3 + var5.nextInt(var3 * 2 + 1), 0, var2 - var3 + var5.nextInt(var3 * 2 + 1));
         return var10000;
      } else {
         return null;
      }
   }

   // $FF: renamed from: b (int, int, int, java.util.List) boolean
   public boolean method_5543(int var1, int var2, int var3, List var4) {
      return var4.contains(this.field_4851);
   }
}
