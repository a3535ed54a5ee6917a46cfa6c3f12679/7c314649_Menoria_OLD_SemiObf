
// $FF: renamed from: wv
public class class_721 extends class_716 {

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4093(var1, var2, var4, var6, var8, var10, var12);
      float var14 = this.field_3028.nextFloat() * 0.1F + 0.2F;
      this.field_3221 = var14;
      this.field_3222 = var14;
      this.field_3223 = var14;
      this.method_4104(0);
      this.method_3852(0.02F, 0.02F);
      this.field_3219 *= this.field_3028.nextFloat() * 0.6F + 0.5F;
      this.field_2997 *= 0.019999999552965164D;
      this.field_2998 *= 0.019999999552965164D;
      this.field_2999 *= 0.019999999552965164D;
      this.field_3218 = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
      this.field_3026 = true;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      this.field_2991 = this.field_2994;
      String[] var10000 = class_752.method_4253();
      this.field_2992 = this.field_2995;
      String[] var1 = var10000;
      this.field_2993 = this.field_2996;
      this.method_3864(this.field_2997, this.field_2998, this.field_2999);
      this.field_2997 *= 0.99D;
      this.field_2998 *= 0.99D;
      this.field_2999 *= 0.99D;
      class_721 var2 = this;
      if(var1 != null) {
         if(this.field_3218-- > 0) {
            return;
         }

         var2 = this;
      }

      var2.method_3851();
   }
}
