
// $FF: renamed from: wp
public class class_727 extends class_716 {

   // $FF: renamed from: aJ float
   private float field_3240;
   // $FF: renamed from: aK double
   private double field_3241;
   // $FF: renamed from: aL double
   private double field_3242;
   // $FF: renamed from: aM double
   private double field_3243;


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4093(var1, var2, var4, var6, var8, var10, var12);
      this.field_2997 = var8;
      this.field_2998 = var10;
      this.field_2999 = var12;
      this.field_3241 = this.field_2994 = var2;
      this.field_3242 = this.field_2995 = var4;
      this.field_3243 = this.field_2996 = var6;
      float var14 = this.field_3028.nextFloat() * 0.6F + 0.4F;
      this.field_3240 = this.field_3219 = this.field_3028.nextFloat() * 0.2F + 0.5F;
      this.field_3221 = this.field_3222 = this.field_3223 = 1.0F * var14;
      this.field_3222 *= 0.3F;
      this.field_3221 *= 0.9F;
      this.field_3218 = (int)(Math.random() * 10.0D) + 40;
      this.field_3026 = true;
      this.method_4104((int)(Math.random() * 8.0D));
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.field_3217 + var2) / (float)this.field_3218;
      var8 = 1.0F - var8;
      var8 *= var8;
      var8 = 1.0F - var8;
      this.field_3219 = this.field_3240 * var8;
      super.method_4101(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      int var3 = super.method_3883(var1);
      String[] var10000 = class_752.method_4253();
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
      var3 = var3 * var3 * var3 * var3;
      return var2 * (1.0F - var3) + var3;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      this.field_2991 = this.field_2994;
      this.field_2992 = this.field_2995;
      this.field_2993 = this.field_2996;
      float var2 = (float)this.field_3217 / (float)this.field_3218;
      String[] var1 = var10000;
      float var3 = var2;
      var2 = -var2 + var2 * var2 * 2.0F;
      var2 = 1.0F - var2;
      this.field_2994 = this.field_3241 + this.field_2997 * (double)var2;
      this.field_2995 = this.field_3242 + this.field_2998 * (double)var2 + (double)(1.0F - var3);
      this.field_2996 = this.field_3243 + this.field_2999 * (double)var2;
      class_727 var4 = this;
      if(var1 != null) {
         if(this.field_3217++ < this.field_3218) {
            return;
         }

         var4 = this;
      }

      var4.method_3851();
   }
}
