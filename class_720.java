import org.lwjgl.opengl.GL11;

// $FF: renamed from: ww
public class class_720 extends class_716 {

   // $FF: renamed from: aJ sa
   private class_689 field_3231;
   // $FF: renamed from: aK sa
   private class_689 field_3232;
   // $FF: renamed from: aL int
   private int field_3233;
   // $FF: renamed from: aM int
   private int field_3234;
   // $FF: renamed from: aN float
   private float field_3235;


   // $FF: renamed from: <init> (ahb, sa, sa, float) void
   public void method_4111(ahb var1, class_689 var2, class_689 var3, float var4) {
      super.method_4093(var1, var2.field_2994, var2.field_2995, var2.field_2996, var2.field_2997, var2.field_2998, var2.field_2999);
      this.field_3231 = var2;
      this.field_3232 = var3;
      this.field_3234 = 3;
      this.field_3235 = var4;
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.field_3233 + var2) / (float)this.field_3234;
      var8 *= var8;
      double var9 = this.field_3231.field_2994;
      double var11 = this.field_3231.field_2995;
      double var13 = this.field_3231.field_2996;
      double var15 = this.field_3232.field_3021 + (this.field_3232.field_2994 - this.field_3232.field_3021) * (double)var2;
      double var17 = this.field_3232.field_3022 + (this.field_3232.field_2995 - this.field_3232.field_3022) * (double)var2 + (double)this.field_3235;
      double var19 = this.field_3232.field_3023 + (this.field_3232.field_2996 - this.field_3232.field_3023) * (double)var2;
      double var21 = var9 + (var15 - var9) * (double)var8;
      double var23 = var11 + (var17 - var11) * (double)var8;
      double var25 = var13 + (var19 - var13) * (double)var8;
      int var27 = this.method_3883(var2);
      int var28 = var27 % 65536;
      int var29 = var27 / 65536;
      buu.method_9080(buu.field_8557, (float)var28 / 1.0F, (float)var29 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var21 -= field_3226;
      var23 -= field_3227;
      var25 -= field_3228;
      bnn.field_7418.method_7622(this.field_3231, (double)((float)var21), (double)((float)var23), (double)((float)var25), this.field_3231.field_3000, var2);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      ++this.field_3233;
      String[] var1 = var10000;
      class_720 var2 = this;
      if(var1 != null) {
         if(this.field_3233 != this.field_3234) {
            return;
         }

         var2 = this;
      }

      var2.method_3851();
   }

   // $FF: renamed from: e () int
   public int method_4102() {
      return 3;
   }
}
