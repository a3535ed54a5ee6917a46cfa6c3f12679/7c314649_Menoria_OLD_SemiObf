
// $FF: renamed from: wB
public class class_744 extends class_743 {

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4093(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      String[] var10000 = class_752.method_4253();
      super.method_4092(var1, var2, var4, var6);
      String[] var14 = var10000;
      this.field_3220 = 0.04F;
      this.method_4105();
      double var16;
      int var15 = (var16 = var10 - 0.0D) == 0.0D?0:(var16 < 0.0D?-1:1);
      if(var14 != null) {
         if(var15 != 0) {
            return;
         }

         double var17;
         var15 = (var17 = var8 - 0.0D) == 0.0D?0:(var17 < 0.0D?-1:1);
      }

      label19: {
         if(var14 != null) {
            if(var15 != 0) {
               break label19;
            }

            double var18;
            var15 = (var18 = var12 - 0.0D) == 0.0D?0:(var18 < 0.0D?-1:1);
         }

         if(var15 == 0) {
            return;
         }
      }

      this.field_2997 = var8;
      this.field_2998 = var10 + 0.1D;
      this.field_2999 = var12;
   }
}
