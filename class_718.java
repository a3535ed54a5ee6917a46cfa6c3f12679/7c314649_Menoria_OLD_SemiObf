
// $FF: renamed from: wx
public class class_718 extends class_716 {

   // $FF: renamed from: aJ aji
   private aji field_3230;


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double, aji, int) void
   public void method_4108(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12, aji var14, int var15) {
      super.method_4093(var1, var2, var4, var6, var8, var10, var12);
      this.field_3230 = var14;
      this.method_4103(var14.method_2448(0, var15));
      this.field_3220 = var14.field_2006;
      this.field_3221 = this.field_3222 = this.field_3223 = 0.6F;
      this.field_3219 /= 2.0F;
   }

   // $FF: renamed from: b (int, int, int) wx
   public class_718 method_4109(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      aji var10000 = this.field_3230;
      if(var4 != null) {
         if(this.field_3230 == class_1192.field_6027) {
            return this;
         }

         var10000 = this.field_3230;
      }

      int var5 = var10000.method_2495(this.field_2990, var1, var2, var3);
      this.field_3221 *= (float)(var5 >> 16 & 255) / 255.0F;
      this.field_3222 *= (float)(var5 >> 8 & 255) / 255.0F;
      this.field_3223 *= (float)(var5 & 255) / 255.0F;
      return this;
   }

   // $FF: renamed from: c (int) wx
   public class_718 method_4110(int var1) {
      String[] var2 = class_752.method_4253();
      aji var10000 = this.field_3230;
      if(var2 != null) {
         if(this.field_3230 == class_1192.field_6027) {
            return this;
         }

         var10000 = this.field_3230;
      }

      int var3 = var10000.method_2494(var1);
      this.field_3221 *= (float)(var3 >> 16 & 255) / 255.0F;
      this.field_3222 *= (float)(var3 >> 8 & 255) / 255.0F;
      this.field_3223 *= (float)(var3 & 255) / 255.0F;
      return this;
   }

   // $FF: renamed from: e () int
   public int method_4102() {
      return 1;
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var9 = ((float)this.field_3213 + this.field_3215 / 4.0F) / 16.0F;
      float var10 = var9 + 0.015609375F;
      float var11 = ((float)this.field_3214 + this.field_3216 / 4.0F) / 16.0F;
      float var12 = var11 + 0.015609375F;
      String[] var10000 = class_752.method_4253();
      float var13 = 0.1F * this.field_3219;
      String[] var8 = var10000;
      class_718 var17 = this;
      if(var8 != null) {
         if(this.field_3225 != null) {
            var9 = this.field_3225.method_370((double)(this.field_3215 / 4.0F * 16.0F));
            var10 = this.field_3225.method_370((double)((this.field_3215 + 1.0F) / 4.0F * 16.0F));
            var11 = this.field_3225.method_373((double)(this.field_3216 / 4.0F * 16.0F));
            var12 = this.field_3225.method_373((double)((this.field_3216 + 1.0F) / 4.0F * 16.0F));
         }

         var17 = this;
      }

      float var14 = (float)(var17.field_2991 + (this.field_2994 - this.field_2991) * (double)var2 - field_3226);
      float var15 = (float)(this.field_2992 + (this.field_2995 - this.field_2992) * (double)var2 - field_3227);
      float var16 = (float)(this.field_2993 + (this.field_2996 - this.field_2993) * (double)var2 - field_3228);
      var1.setVisible6(this.field_3221, this.field_3222, this.field_3223);
      var1.addVertexWithUV((double)(var14 - var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 - var5 * var13 - var7 * var13), (double)var9, (double)var12);
      var1.addVertexWithUV((double)(var14 - var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 - var5 * var13 + var7 * var13), (double)var9, (double)var11);
      var1.addVertexWithUV((double)(var14 + var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 + var5 * var13 + var7 * var13), (double)var10, (double)var11);
      var1.addVertexWithUV((double)(var14 + var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 + var5 * var13 - var7 * var13), (double)var10, (double)var12);
   }
}
