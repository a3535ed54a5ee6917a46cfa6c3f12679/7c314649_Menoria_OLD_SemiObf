
// $FF: renamed from: wh
public class class_735 extends class_716 {

   // $FF: renamed from: aJ float
   private float field_3264;


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4093(var1, var2, var4, var6, var8, var10, var12);
      this.field_2997 = this.field_2997 * 0.009999999776482582D + var8;
      this.field_2998 = this.field_2998 * 0.009999999776482582D + var10;
      this.field_2999 = this.field_2999 * 0.009999999776482582D + var12;
      double var10000 = var2 + (double)((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.05F);
      var10000 = var4 + (double)((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.05F);
      var10000 = var6 + (double)((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.05F);
      this.field_3264 = this.field_3219;
      this.field_3221 = this.field_3222 = this.field_3223 = 1.0F;
      this.field_3218 = (int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4;
      this.field_3026 = true;
      this.method_4104(48);
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.field_3217 + var2) / (float)this.field_3218;
      this.field_3219 = this.field_3264 * (1.0F - var8 * var8 * 0.5F);
      super.method_4101(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      String[] var10000 = class_752.method_4253();
      float var3 = ((float)this.field_3217 + var1) / (float)this.field_3218;
      String[] var2 = var10000;
      float var8;
      int var7 = (var8 = var3 - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
      if(var2 != null) {
         if(var7 < 0) {
            var3 = 0.0F;
         }

         float var9;
         var7 = (var9 = var3 - 1.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
      }

      if(var2 != null) {
         if(var7 > 0) {
            var3 = 1.0F;
         }

         var7 = super.method_3883(var1);
      }

      int var4 = var7;
      int var5 = var4 & 255;
      int var6 = var4 >> 16 & 255;
      var5 += (int)(var3 * 15.0F * 16.0F);
      var7 = var5;
      int var10001 = 240;
      if(var2 != null) {
         if(var5 > 240) {
            var5 = 240;
         }

         var7 = var5;
         var10001 = var6 << 16;
      }

      return var7 | var10001;
   }

   // $FF: renamed from: d (float) float
   public float method_3884(float var1) {
      float var3;
      float var6;
      label23: {
         String[] var10000 = class_752.method_4253();
         var3 = ((float)this.field_3217 + var1) / (float)this.field_3218;
         String[] var2 = var10000;
         float var7;
         int var5 = (var7 = var3 - 0.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
         if(var2 != null) {
            if(var5 < 0) {
               var3 = 0.0F;
            }

            var6 = var3;
            if(var2 == null) {
               break label23;
            }

            float var8;
            var5 = (var8 = var3 - 1.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
         }

         if(var5 > 0) {
            var3 = 1.0F;
         }

         var6 = super.method_3884(var1);
      }

      float var4 = var6;
      return var4 * var3 + (1.0F - var3);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      class_735 var3;
      label25: {
         String[] var10000 = class_752.method_4253();
         this.field_2991 = this.field_2994;
         String[] var1 = var10000;
         this.field_2992 = this.field_2995;
         this.field_2993 = this.field_2996;
         int var2 = this.field_3217++;
         if(var1 != null) {
            if(var2 >= this.field_3218) {
               this.method_3851();
            }

            this.method_3864(this.field_2997, this.field_2998, this.field_2999);
            this.field_2997 *= 0.9599999785423279D;
            this.field_2998 *= 0.9599999785423279D;
            this.field_2999 *= 0.9599999785423279D;
            var3 = this;
            if(var1 == null) {
               break label25;
            }

            var2 = this.field_3005;
         }

         if(var2 == 0) {
            return;
         }

         this.field_2997 *= 0.699999988079071D;
         var3 = this;
      }

      var3.field_2999 *= 0.699999988079071D;
   }
}
