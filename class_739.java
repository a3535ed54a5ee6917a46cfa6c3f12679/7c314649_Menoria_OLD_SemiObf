
// $FF: renamed from: wd
public class class_739 extends class_716 {

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4093(var1, var2, var4, var6, var8, var10, var12);
      this.field_2997 = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.field_2998 = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.field_2999 = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.field_3221 = this.field_3222 = this.field_3223 = this.field_3028.nextFloat() * 0.3F + 0.7F;
      this.field_3219 = this.field_3028.nextFloat() * this.field_3028.nextFloat() * 6.0F + 1.0F;
      this.field_3218 = (int)(16.0D / ((double)this.field_3028.nextFloat() * 0.8D + 0.2D)) + 2;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      class_739 var3;
      label25: {
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

            this.method_4104(7 - this.field_3217 * 8 / this.field_3218);
            this.field_2998 += 0.004D;
            this.method_3864(this.field_2997, this.field_2998, this.field_2999);
            this.field_2997 *= 0.8999999761581421D;
            this.field_2998 *= 0.8999999761581421D;
            this.field_2999 *= 0.8999999761581421D;
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
