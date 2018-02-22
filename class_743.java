
// $FF: renamed from: wA
public class class_743 extends class_716 {

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4092(ahb var1, double var2, double var4, double var6) {
      super.method_4093(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_2997 *= 0.30000001192092896D;
      this.field_2998 = (double)((float)Math.random() * 0.2F + 0.1F);
      this.field_2999 *= 0.30000001192092896D;
      this.field_3221 = 1.0F;
      this.field_3222 = 1.0F;
      this.field_3223 = 1.0F;
      this.method_4104(19 + this.field_3028.nextInt(4));
      this.method_3852(0.01F, 0.01F);
      this.field_3220 = 0.06F;
      this.field_3218 = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1;
      int var5;
      class_743 var6;
      label52: {
         this.field_2991 = this.field_2994;
         this.field_2992 = this.field_2995;
         this.field_2993 = this.field_2996;
         this.field_2998 -= (double)this.field_3220;
         this.method_3864(this.field_2997, this.field_2998, this.field_2999);
         String[] var10000 = class_752.method_4253();
         this.field_2997 *= 0.9800000190734863D;
         this.field_2998 *= 0.9800000190734863D;
         var1 = var10000;
         this.field_2999 *= 0.9800000190734863D;
         var5 = this.field_3218--;
         if(var1 != null) {
            if(var5 <= 0) {
               this.method_3851();
            }

            var6 = this;
            if(var1 == null) {
               break label52;
            }

            var5 = this.field_3005;
         }

         if(var5 != 0) {
            if(Math.random() < 0.5D) {
               this.method_3851();
            }

            this.field_2997 *= 0.699999988079071D;
            this.field_2999 *= 0.699999988079071D;
         }

         var6 = this;
      }

      awt var2 = var6.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996)).method_2424();
      var5 = var2.method_5062();
      if(var1 != null) {
         label40: {
            if(var5 == 0) {
               var5 = var2.method_5063();
               if(var1 == null) {
                  break label40;
               }

               if(var5 == 0) {
                  return;
               }
            }

            var5 = class_1715.method_9561(this.field_2995) + 1;
         }
      }

      double var3 = (double)((float)var5 - class_366.method_2552(this.field_2990.method_33(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996))));
      var6 = this;
      if(var1 != null) {
         if(this.field_2995 >= var3) {
            return;
         }

         var6 = this;
      }

      var6.method_3851();
   }
}
