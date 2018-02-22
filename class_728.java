
// $FF: renamed from: wo
public class class_728 extends class_716 {

   // $FF: renamed from: aJ float
   float field_3244;


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4093(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      float var14 = 2.5F;
      this.field_2997 *= 0.10000000149011612D;
      this.field_2998 *= 0.10000000149011612D;
      this.field_2999 *= 0.10000000149011612D;
      this.field_2997 += var8;
      this.field_2998 += var10;
      this.field_2999 += var12;
      this.field_3221 = this.field_3222 = this.field_3223 = 1.0F - (float)(Math.random() * 0.30000001192092896D);
      this.field_3219 *= 0.75F;
      this.field_3219 *= var14;
      this.field_3244 = this.field_3219;
      this.field_3218 = (int)(8.0D / (Math.random() * 0.8D + 0.3D));
      this.field_3218 = (int)((float)this.field_3218 * var14);
      this.field_3026 = false;
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

      this.field_3219 = this.field_3244 * var9;
      super.method_4101(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      this.field_2991 = this.field_2994;
      this.field_2992 = this.field_2995;
      String[] var10000 = class_752.method_4253();
      this.field_2993 = this.field_2996;
      String[] var1 = var10000;
      class_728 var3 = this;
      int var10001 = this.field_3217;
      if(var1 != null) {
         if(this.field_3217++ >= this.field_3218) {
            this.method_3851();
         }

         var3 = this;
         var10001 = 7 - this.field_3217 * 8 / this.field_3218;
      }

      label38: {
         int var4;
         label39: {
            var3.method_4104(var10001);
            this.method_3864(this.field_2997, this.field_2998, this.field_2999);
            this.field_2997 *= 0.9599999785423279D;
            this.field_2998 *= 0.9599999785423279D;
            this.field_2999 *= 0.9599999785423279D;
            class_792 var2 = this.field_2990.method_2174(this, 2.0D);
            if(var2 != null) {
               double var5;
               var4 = (var5 = this.field_2995 - var2.field_3004.field_6910) == 0.0D?0:(var5 < 0.0D?-1:1);
               if(var1 == null) {
                  break label39;
               }

               if(var4 > 0) {
                  this.field_2995 += (var2.field_3004.field_6910 - this.field_2995) * 0.2D;
                  this.field_2998 += (var2.field_2998 - this.field_2998) * 0.2D;
                  this.method_3854(this.field_2994, this.field_2995, this.field_2996);
               }
            }

            var3 = this;
            if(var1 == null) {
               break label38;
            }

            var4 = this.field_3005;
         }

         if(var4 == 0) {
            return;
         }

         this.field_2997 *= 0.699999988079071D;
         var3 = this;
      }

      var3.field_2999 *= 0.699999988079071D;
   }
}
