
// $FF: renamed from: yb
public class class_1842 {

   // $FF: renamed from: b sv
   private class_752 field_9405;
   // $FF: renamed from: c int
   private int field_9406;
   // $FF: renamed from: d float
   private float field_9407;


   // $FF: renamed from: <init> (sv) void
   public void method_9968(class_752 var1) {
      super();
      this.field_9405 = var1;
   }

   // $FF: renamed from: b () void
   public void method_9969() {
      String[] var10000 = class_752.method_4253();
      double var2 = this.field_9405.field_2994 - this.field_9405.field_2991;
      String[] var1 = var10000;
      double var4 = this.field_9405.field_2996 - this.field_9405.field_2993;
      if(var1 != null) {
         if(var2 * var2 + var4 * var4 <= 2.500000277905201E-7D) {
            float var6;
            class_1842 var10;
            label27: {
               label33: {
                  var6 = 75.0F;
                  float var11;
                  int var8 = (var11 = Math.abs(this.field_9405.field_3332 - this.field_9407) - 15.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
                  if(var1 != null) {
                     if(var8 > 0) {
                        this.field_9406 = 0;
                        this.field_9407 = this.field_9405.field_3332;
                        if(var1 != null) {
                           break label33;
                        }
                     }

                     ++this.field_9406;
                     boolean var9 = true;
                  }

                  var10 = this;
                  if(var1 == null) {
                     break label27;
                  }

                  if(this.field_9406 > 10) {
                     var6 = Math.max(1.0F - (float)(this.field_9406 - 10) / 10.0F, 0.0F) * 75.0F;
                  }
               }

               var10 = this;
            }

            var10.field_9405.field_3330 = this.method_9970(this.field_9405.field_3332, this.field_9405.field_3330, var6);
            return;
         }

         this.field_9405.field_3330 = this.field_9405.field_3000;
         this.field_9405.field_3332 = this.method_9970(this.field_9405.field_3330, this.field_9405.field_3332, 75.0F);
         this.field_9407 = this.field_9405.field_3332;
         this.field_9406 = 0;
      }

   }

   // $FF: renamed from: b (float, float, float) float
   private float method_9970(float var1, float var2, float var3) {
      String[] var10000 = class_752.method_4253();
      float var5 = class_1715.method_9579(var1 - var2);
      String[] var4 = var10000;
      float var8;
      int var6 = (var8 = var5 - -var3) == 0.0F?0:(var8 < 0.0F?-1:1);
      float var10001;
      float var7;
      if(var4 != null) {
         if(var6 < 0) {
            var5 = -var3;
         }

         var7 = var5;
         var10001 = var3;
         if(var4 == null) {
            return var7 - var10001;
         }

         float var9;
         var6 = (var9 = var5 - var3) == 0.0F?0:(var9 < 0.0F?-1:1);
      }

      if(var6 >= 0) {
         var5 = var3;
      }

      var7 = var1;
      var10001 = var5;
      return var7 - var10001;
   }
}
