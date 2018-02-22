
// $FF: renamed from: wf
public class class_737 extends class_716 {

   // $FF: renamed from: aJ int
   private int field_3271;
   // $FF: renamed from: aK boolean
   private boolean field_3272;
   // $FF: renamed from: aL boolean
   private boolean field_3273;
   // $FF: renamed from: aM bkn
   private final bkn field_3274;
   // $FF: renamed from: aN float
   private float field_3275;
   // $FF: renamed from: aO float
   private float field_3276;
   // $FF: renamed from: aP float
   private float field_3277;
   // $FF: renamed from: aQ boolean
   private boolean field_3278;


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double, bkn) void
   public void method_4127(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12, bkn var14) {
      super.method_4092(var1, var2, var4, var6);
      this.field_3271 = 160;
      this.field_2997 = var8;
      this.field_2998 = var10;
      this.field_2999 = var12;
      this.field_3274 = var14;
      this.field_3219 *= 0.75F;
      this.field_3218 = 48 + this.field_3028.nextInt(12);
      this.field_3026 = false;
   }

   // $FF: renamed from: f (boolean) void
   public void method_4128(boolean var1) {
      this.field_3272 = var1;
   }

   // $FF: renamed from: g (boolean) void
   public void method_4129(boolean var1) {
      this.field_3273 = var1;
   }

   // $FF: renamed from: c (int) void
   public void method_4130(int var1) {
      float var2 = (float)((var1 & 16711680) >> 16) / 255.0F;
      float var3 = (float)((var1 & '\uff00') >> 8) / 255.0F;
      float var4 = (float)((var1 & 255) >> 0) / 255.0F;
      float var5 = 1.0F;
      this.method_4096(var2 * var5, var3 * var5, var4 * var5);
   }

   // $FF: renamed from: j (int) void
   public void method_4131(int var1) {
      this.field_3275 = (float)((var1 & 16711680) >> 16) / 255.0F;
      this.field_3276 = (float)((var1 & '\uff00') >> 8) / 255.0F;
      this.field_3277 = (float)((var1 & 255) >> 0) / 255.0F;
      this.field_3278 = true;
   }

   // $FF: renamed from: J () kg
   public class_1343 method_3871() {
      return null;
   }

   // $FF: renamed from: S () boolean
   public boolean method_3898() {
      return false;
   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String[] var8 = class_752.method_4253();
      class_737 var10000 = this;
      if(var8 != null) {
         label22: {
            if(this.field_3273) {
               var10000 = this;
               if(var8 == null) {
                  break label22;
               }

               if(this.field_3217 >= this.field_3218 / 3) {
                  var10000 = this;
                  if(var8 == null) {
                     break label22;
                  }

                  if((this.field_3217 + this.field_3218) / 3 % 2 != 0) {
                     return;
                  }
               }
            }

            var10000 = this;
         }
      }

      var10000.method_4101(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1;
      int var10001;
      int var3;
      label73: {
         String[] var10000 = class_752.method_4253();
         this.field_2991 = this.field_2994;
         var1 = var10000;
         this.field_2992 = this.field_2995;
         this.field_2993 = this.field_2996;
         var3 = this.field_3217++;
         var10001 = this.field_3218;
         if(var1 != null) {
            if(var3 >= this.field_3218) {
               this.method_3851();
            }

            var3 = this.field_3217;
            if(var1 == null) {
               break label73;
            }

            var10001 = this.field_3218 / 2;
         }

         if(var3 > var10001) {
            this.method_4097(1.0F - ((float)this.field_3217 - (float)(this.field_3218 / 2)) / (float)this.field_3218);
            var3 = this.field_3278;
            if(var1 == null) {
               break label73;
            }

            if(this.field_3278) {
               this.field_3221 += (this.field_3275 - this.field_3221) * 0.2F;
               this.field_3222 += (this.field_3276 - this.field_3222) * 0.2F;
               this.field_3223 += (this.field_3277 - this.field_3223) * 0.2F;
            }
         }

         this.method_4104(this.field_3271 + (7 - this.field_3217 * 8 / this.field_3218));
         this.field_2998 -= 0.004D;
         this.method_3864(this.field_2997, this.field_2998, this.field_2999);
         this.field_2997 *= 0.9100000262260437D;
         this.field_2998 *= 0.9100000262260437D;
         this.field_2999 *= 0.9100000262260437D;
         var3 = this.field_3005;
      }

      if(var1 != null) {
         if(var3 != 0) {
            this.field_2997 *= 0.699999988079071D;
            this.field_2999 *= 0.699999988079071D;
         }

         var3 = this.field_3272;
      }

      if(var1 != null) {
         if(var3 == 0) {
            return;
         }

         var3 = this.field_3217;
      }

      class_737 var4;
      label76: {
         var10001 = this.field_3218 / 2;
         if(var1 != null) {
            if(var3 >= var10001) {
               return;
            }

            var4 = this;
            if(var1 == null) {
               break label76;
            }

            var3 = this.field_3217 + this.field_3218;
            var10001 = 2;
         }

         if(var3 % var10001 != 0) {
            return;
         }

         var4 = new class_737;
         var4.method_4127(this.field_2990, this.field_2994, this.field_2995, this.field_2996, 0.0D, 0.0D, 0.0D, this.field_3274);
      }

      class_737 var2 = var4;
      var2.method_4096(this.field_3221, this.field_3222, this.field_3223);
      var2.field_3217 = var2.field_3218 / 2;
      var4 = this;
      if(var1 != null) {
         if(this.field_3278) {
            var2.field_3278 = true;
            var2.field_3275 = this.field_3275;
            var2.field_3276 = this.field_3276;
            var2.field_3277 = this.field_3277;
         }

         var2.field_3273 = this.field_3273;
         var4 = this;
      }

      var4.field_3274.method_6968(var2);
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      return 15728880;
   }

   // $FF: renamed from: d (float) float
   public float method_3884(float var1) {
      return 1.0F;
   }
}
