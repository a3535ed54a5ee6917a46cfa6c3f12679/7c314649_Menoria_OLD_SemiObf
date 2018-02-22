
// $FF: renamed from: wj
public class class_733 extends class_716 {

   // $FF: renamed from: aJ float
   float field_3258;


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.method_4119(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double, float) void
   public void method_4119(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super.method_4093(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_2997 *= 0.009999999776482582D;
      this.field_2998 *= 0.009999999776482582D;
      this.field_2999 *= 0.009999999776482582D;
      this.field_2998 += 0.1D;
      this.field_3219 *= 0.75F;
      this.field_3219 *= var14;
      this.field_3258 = this.field_3219;
      this.field_3218 = 16;
      this.field_3026 = false;
      this.method_4104(80);
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var9;
      label23: {
         float var11;
         label25: {
            String[] var10000 = class_752.method_4253();
            var9 = ((float)this.field_3217 + var2) / (float)this.field_3218 * 32.0F;
            String[] var8 = var10000;
            float var12;
            int var10 = (var12 = var9 - 0.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
            if(var8 != null) {
               if(var10 < 0) {
                  var9 = 0.0F;
               }

               var11 = var9;
               if(var8 == null) {
                  break label25;
               }

               float var13;
               var10 = (var13 = var9 - 1.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
            }

            if(var10 <= 0) {
               break label23;
            }

            var11 = 1.0F;
         }

         var9 = var11;
      }

      this.field_3219 = this.field_3258 * var9;
      super.method_4101(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      this.field_2991 = this.field_2994;
      this.field_2992 = this.field_2995;
      this.field_2993 = this.field_2996;
      String[] var1 = var10000;
      int var2 = this.field_3217++;
      if(var1 != null) {
         if(var2 >= this.field_3218) {
            this.method_3851();
         }

         this.method_3864(this.field_2997, this.field_2998, this.field_2999);
         double var4;
         var2 = (var4 = this.field_2995 - this.field_2992) == 0.0D?0:(var4 < 0.0D?-1:1);
      }

      class_733 var3;
      label34: {
         if(var1 != null) {
            if(var2 == 0) {
               this.field_2997 *= 1.1D;
               this.field_2999 *= 1.1D;
            }

            this.field_2997 *= 0.8600000143051147D;
            this.field_2998 *= 0.8600000143051147D;
            this.field_2999 *= 0.8600000143051147D;
            var3 = this;
            if(var1 == null) {
               break label34;
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
