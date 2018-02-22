import java.util.Random;

// $FF: renamed from: eK
public class class_441 extends aji {

   // $FF: renamed from: M vL
   private IIcon field_2178;
   // $FF: renamed from: N vL
   private IIcon field_2179;
   // $FF: renamed from: O vL
   private IIcon field_2180;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_2181;


   // $FF: renamed from: <init> () void
   protected void method_2759() {
      super.method_2427(awt.field_4201);
      this.method_2440(true);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.method_33(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      this.method_2443(var7, 0.0F, var6, 1.0F - var6, var8, 1.0F - var6);
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      float var1 = 0.0625F;
      float var2 = 0.5F;
      this.method_2443(var1, 0.0F, var1, 1.0F - var1, var2, 1.0F - var1);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.method_33(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return class_1343.method_7093((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8 - var6), (double)((float)(var4 + 1) - var6));
   }

   // $FF: renamed from: g (ahb, int, int, int) kg
   public class_1343 method_2450(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.method_33(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return class_1343.method_7093((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8), (double)((float)(var4 + 1) - var6));
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            return this.field_2178;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(var10000 == 0) {
            return this.field_2179;
         }

         var10000 = var2;
      }

      if(var3 != null) {
         if(var10000 <= 0) {
            return this.field_2010;
         }

         var10000 = var1;
      }

      if(var10000 == 4) {
         return this.field_2180;
      } else {
         return this.field_2010;
      }
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2181;
      this.field_2010 = var1.method_375(var10002.append("_side").toString());
      this.field_2180 = var1.method_375(this.method_2533() + "_inner");
      this.field_2178 = var1.method_375(this.method_2533() + "_top");
      this.field_2179 = var1.method_375(this.method_2533() + "_bottom");
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      this.method_2760(var1, var2, var3, var4, var5);
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz) void
   public void method_2484(ahb var1, int var2, int var3, int var4, class_792 var5) {
      this.method_2760(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: c (ahb, int, int, int, yz) void
   private void method_2760(ahb var1, int var2, int var3, int var4, class_792 var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5.method_4624(false);
      if(var6 != null) {
         if(var10000 == 0) {
            return;
         }

         var5.method_4623().method_3632(2, 0.1F);
         var10000 = var1.method_33(var2, var3, var4) + 1;
      }

      int var7 = var10000;
      if(var6 != null) {
         if(var7 >= 6) {
            var1.method_2056(var2, var3, var4);
            if(var6 != null) {
               return;
            }
         }

         var1.method_2055(var2, var3, var4, var7, 2);
      }

   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = super.method_2480(var1, var2, var3, var4);
      if(var5 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = this.method_2505(var1, var2, var3, var4);
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      if(var6 != null && !this.method_2505(var1, var2, var3, var4)) {
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      return var1.getBlock(var2, var3 - 1, var4).method_2424().method_5063();
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return null;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5211;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
