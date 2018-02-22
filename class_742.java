
// $FF: renamed from: wa
public class class_742 extends class_716 {

   // $FF: renamed from: aJ float
   float field_3287;


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.method_4133(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double, float) void
   public void method_4133(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super.method_4093(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_2997 *= 0.10000000149011612D;
      this.field_2998 *= 0.10000000149011612D;
      this.field_2999 *= 0.10000000149011612D;
      this.field_2997 += var8 * 0.4D;
      this.field_2998 += var10 * 0.4D;
      this.field_2999 += var12 * 0.4D;
      this.field_3221 = this.field_3222 = this.field_3223 = (float)(Math.random() * 0.30000001192092896D + 0.6000000238418579D);
      this.field_3219 *= 0.75F;
      this.field_3219 *= var14;
      this.field_3287 = this.field_3219;
      this.field_3218 = (int)(6.0D / (Math.random() * 0.8D + 0.6D));
      this.field_3218 = (int)((float)this.field_3218 * var14);
      this.field_3026 = false;
      this.method_4104(65);
      this.method_3856();
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var9;
      label23: {
         float var10;
         label25: {
            var9 = ((float)this.field_3217 + var2) / (float)this.field_3218 * 32.0F;
            String[] var8 = class_752.method_4253();
            float var11;
            int var10000 = (var11 = var9 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
            if(var8 != null) {
               if(var10000 < 0) {
                  var9 = 0.0F;
               }

               var10 = var9;
               if(var8 == null) {
                  break label25;
               }

               float var12;
               var10000 = (var12 = var9 - 1.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
            }

            if(var10000 <= 0) {
               break label23;
            }

            var10 = 1.0F;
         }

         var9 = var10;
      }

      this.field_3219 = this.field_3287 * var9;
      super.method_4101(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      class_742 var2;
      label25: {
         this.field_2991 = this.field_2994;
         String[] var1 = class_752.method_4253();
         this.field_2992 = this.field_2995;
         this.field_2993 = this.field_2996;
         int var10000 = this.field_3217++;
         if(var1 != null) {
            if(var10000 >= this.field_3218) {
               this.method_3851();
            }

            this.method_3864(this.field_2997, this.field_2998, this.field_2999);
            this.field_3222 = (float)((double)this.field_3222 * 0.96D);
            this.field_3223 = (float)((double)this.field_3223 * 0.9D);
            this.field_2997 *= 0.699999988079071D;
            this.field_2998 *= 0.699999988079071D;
            this.field_2999 *= 0.699999988079071D;
            this.field_2998 -= 0.019999999552965164D;
            var2 = this;
            if(var1 == null) {
               break label25;
            }

            var10000 = this.field_3005;
         }

         if(var10000 == 0) {
            return;
         }

         this.field_2997 *= 0.699999988079071D;
         var2 = this;
      }

      var2.field_2999 *= 0.699999988079071D;
   }
}
