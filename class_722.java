
// $FF: renamed from: wu
public class class_722 extends class_716 {

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4093(var1, var2, var4 - 0.125D, var6, var8, var10, var12);
      this.field_3221 = 0.4F;
      this.field_3222 = 0.4F;
      this.field_3223 = 0.7F;
      this.method_4104(0);
      this.method_3852(0.01F, 0.01F);
      this.field_3219 *= this.field_3028.nextFloat() * 0.6F + 0.2F;
      this.field_2997 = var8 * 0.0D;
      this.field_2998 = var10 * 0.0D;
      this.field_2999 = var12 * 0.0D;
      this.field_3218 = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      this.field_2991 = this.field_2994;
      this.field_2992 = this.field_2995;
      String[] var1 = var10000;
      this.field_2993 = this.field_2996;
      this.method_3864(this.field_2997, this.field_2998, this.field_2999);
      class_722 var2 = this;
      if(var1 != null) {
         if(this.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996)).method_2424() != awt.field_4177) {
            this.method_3851();
         }

         var2 = this;
      }

      if(var1 != null) {
         int var10002 = var2.field_3218;
         class_722 var10001 = var2;
         int var3 = var2.field_3218;
         var10001.field_3218 = var10002 - 1;
         if(var3 > 0) {
            return;
         }

         var2 = this;
      }

      var2.method_3851();
   }
}
