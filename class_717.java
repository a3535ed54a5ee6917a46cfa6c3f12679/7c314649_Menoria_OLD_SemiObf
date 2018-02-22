
// $FF: renamed from: wz
public class class_717 extends class_716 {

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4093(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_2997 *= 0.30000001192092896D;
      this.field_2998 = (double)((float)Math.random() * 0.2F + 0.1F);
      this.field_2999 *= 0.30000001192092896D;
      this.field_3221 = 1.0F;
      this.field_3222 = 1.0F;
      this.field_3223 = 1.0F;
      this.method_4104(19);
      this.method_3852(0.01F, 0.01F);
      this.field_3218 = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.field_3220 = 0.0F;
      this.field_2997 = var8;
      this.field_2998 = var10;
      this.field_2999 = var12;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      this.field_2991 = this.field_2994;
      this.field_2992 = this.field_2995;
      this.field_2993 = this.field_2996;
      this.field_2998 -= (double)this.field_3220;
      this.method_3864(this.field_2997, this.field_2998, this.field_2999);
      this.field_2997 *= 0.9800000190734863D;
      this.field_2998 *= 0.9800000190734863D;
      this.field_2999 *= 0.9800000190734863D;
      int var2 = 60 - this.field_3218;
      float var3 = (float)var2 * 0.001F;
      String[] var10000 = class_752.method_4253();
      this.method_3852(var3, var3);
      String[] var1 = var10000;
      this.method_4104(19 + var2 % 4);
      class_717 var4 = this;
      if(var1 != null) {
         if(this.field_3218-- > 0) {
            return;
         }

         var4 = this;
      }

      var4.method_3851();
   }
}
