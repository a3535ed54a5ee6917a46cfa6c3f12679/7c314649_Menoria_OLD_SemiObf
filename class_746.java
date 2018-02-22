
// $FF: renamed from: v9
public class class_746 extends class_716 {

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_4093(var1, var2, var4, var6, var8, var10, var12);
      this.field_3221 = 1.0F;
      this.field_3222 = 1.0F;
      this.field_3223 = 1.0F;
      this.method_4104(32);
      this.method_3852(0.02F, 0.02F);
      this.field_3219 *= this.field_3028.nextFloat() * 0.6F + 0.2F;
      this.field_2997 = var8 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.field_2998 = var10 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.field_2999 = var12 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.field_3218 = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      this.field_2991 = this.field_2994;
      this.field_2992 = this.field_2995;
      this.field_2993 = this.field_2996;
      this.field_2998 += 0.002D;
      String[] var10000 = class_752.method_4253();
      this.method_3864(this.field_2997, this.field_2998, this.field_2999);
      this.field_2997 *= 0.8500000238418579D;
      String[] var1 = var10000;
      this.field_2998 *= 0.8500000238418579D;
      this.field_2999 *= 0.8500000238418579D;
      class_746 var2 = this;
      if(var1 != null) {
         if(this.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996)).method_2424() != awt.field_4177) {
            this.method_3851();
         }

         var2 = this;
      }

      if(var1 != null) {
         int var10002 = var2.field_3218;
         class_746 var10001 = var2;
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
