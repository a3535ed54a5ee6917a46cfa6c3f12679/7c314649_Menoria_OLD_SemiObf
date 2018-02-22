
// $FF: renamed from: wc
public class class_740 extends class_716 {

   // $FF: renamed from: aJ float
   private float field_3280;
   // $FF: renamed from: aK double
   private double field_3281;
   // $FF: renamed from: aL double
   private double field_3282;
   // $FF: renamed from: aM double
   private double field_3283;


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4093(var1, var2, var4, var6, var8, var10, var12);
      this.field_2997 = var8;
      this.field_2998 = var10;
      this.field_2999 = var12;
      this.field_3281 = this.field_2994 = var2;
      this.field_3282 = this.field_2995 = var4;
      this.field_3283 = this.field_2996 = var6;
      float var14 = this.field_3028.nextFloat() * 0.6F + 0.4F;
      this.field_3280 = this.field_3219 = this.field_3028.nextFloat() * 0.5F + 0.2F;
      this.field_3221 = this.field_3222 = this.field_3223 = 1.0F * var14;
      this.field_3222 *= 0.9F;
      this.field_3221 *= 0.9F;
      this.field_3218 = (int)(Math.random() * 10.0D) + 30;
      this.field_3026 = true;
      this.method_4104((int)(Math.random() * 26.0D + 1.0D + 224.0D));
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = super.method_3883(var1);
      float var4 = (float)this.field_3217 / (float)this.field_3218;
      String[] var2 = var10000;
      var4 *= var4;
      var4 *= var4;
      int var5 = var3 & 255;
      int var6 = var3 >> 16 & 255;
      var6 += (int)(var4 * 15.0F * 16.0F);
      int var7 = var6;
      int var10001 = 240;
      if(var2 != null) {
         if(var6 > 240) {
            var6 = 240;
         }

         var7 = var5;
         var10001 = var6 << 16;
      }

      return var7 | var10001;
   }

   // $FF: renamed from: d (float) float
   public float method_3884(float var1) {
      float var2 = super.method_3884(var1);
      float var3 = (float)this.field_3217 / (float)this.field_3218;
      var3 *= var3;
      var3 *= var3;
      return var2 * (1.0F - var3) + var3;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      this.field_2991 = this.field_2994;
      String[] var10000 = class_752.method_4253();
      this.field_2992 = this.field_2995;
      this.field_2993 = this.field_2996;
      String[] var1 = var10000;
      float var2 = (float)this.field_3217 / (float)this.field_3218;
      var2 = 1.0F - var2;
      float var3 = 1.0F - var2;
      var3 *= var3;
      var3 *= var3;
      this.field_2994 = this.field_3281 + this.field_2997 * (double)var2;
      this.field_2995 = this.field_3282 + this.field_2998 * (double)var2 - (double)(var3 * 1.2F);
      this.field_2996 = this.field_3283 + this.field_2999 * (double)var2;
      class_740 var4 = this;
      if(var1 != null) {
         if(this.field_3217++ < this.field_3218) {
            return;
         }

         var4 = this;
      }

      var4.method_3851();
   }
}
