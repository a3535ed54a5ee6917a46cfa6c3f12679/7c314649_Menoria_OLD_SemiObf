
// $FF: renamed from: wt
public class class_723 extends class_716 {

   // $FF: renamed from: aJ int
   private int field_3236;


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      String[] var10000 = class_752.method_4253();
      super.method_4093(var1, var2, var4, var6, var8, var10, var12);
      this.field_3236 = 128;
      this.field_2998 *= 0.20000000298023224D;
      String[] var14 = var10000;
      if(var14 != null) {
         if(var8 == 0.0D && var12 == 0.0D) {
            this.field_2997 *= 0.10000000149011612D;
            this.field_2999 *= 0.10000000149011612D;
         }

         this.field_3219 *= 0.75F;
         this.field_3218 = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
         this.field_3026 = false;
      }

   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      label25: {
         String[] var10000 = class_752.method_4253();
         float var9 = ((float)this.field_3217 + var2) / (float)this.field_3218 * 32.0F;
         String[] var8 = var10000;
         float var12;
         int var10 = (var12 = var9 - 0.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
         if(var8 != null) {
            if(var10 < 0) {
               var9 = 0.0F;
            }

            if(var8 == null) {
               break label25;
            }

            float var13;
            var10 = (var13 = var9 - 1.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
         }

         if(var10 > 0) {
            float var11 = 1.0F;
         }
      }

      super.method_4101(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      this.field_2991 = this.field_2994;
      String[] var1 = var10000;
      this.field_2992 = this.field_2995;
      this.field_2993 = this.field_2996;
      int var2 = this.field_3217++;
      if(var1 != null) {
         if(var2 >= this.field_3218) {
            this.method_3851();
         }

         this.method_4104(this.field_3236 + (7 - this.field_3217 * 8 / this.field_3218));
         this.field_2998 += 0.004D;
         this.method_3864(this.field_2997, this.field_2998, this.field_2999);
         double var4;
         var2 = (var4 = this.field_2995 - this.field_2992) == 0.0D?0:(var4 < 0.0D?-1:1);
      }

      class_723 var3;
      label34: {
         if(var1 != null) {
            if(var2 == 0) {
               this.field_2997 *= 1.1D;
               this.field_2999 *= 1.1D;
            }

            this.field_2997 *= 0.9599999785423279D;
            this.field_2998 *= 0.9599999785423279D;
            this.field_2999 *= 0.9599999785423279D;
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

   // $FF: renamed from: c (int) void
   public void method_4112(int var1) {
      this.field_3236 = var1;
   }
}
