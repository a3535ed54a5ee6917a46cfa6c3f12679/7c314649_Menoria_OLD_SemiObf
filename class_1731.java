
// $FF: renamed from: yv
public class class_1731 extends class_1727 {

   // $FF: renamed from: c sw
   class_753 field_9047;
   // $FF: renamed from: d sv
   class_752 field_9048;
   // $FF: renamed from: e float
   float field_9049;


   // $FF: renamed from: <init> (sw, float) void
   public void method_9661(class_753 var1, float var2) {
      super.method_9648();
      this.field_9047 = var1;
      this.field_9049 = var2;
      this.method_9655(5);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var10000 = class_752.method_4253();
      this.field_9048 = this.field_9047.method_4259();
      String[] var1 = var10000;
      class_1731 var4 = this;
      if(var1 != null) {
         if(this.field_9048 == null) {
            return false;
         }

         var4 = this;
      }

      double var2 = var4.field_9047.method_3891(this.field_9048);
      double var6;
      int var5 = (var6 = var2 - 4.0D) == 0.0D?0:(var6 < 0.0D?-1:1);
      if(var1 != null) {
         if(var5 >= 0) {
            label47: {
               double var7;
               var5 = (var7 = var2 - 16.0D) == 0.0D?0:(var7 < 0.0D?-1:1);
               if(var1 != null) {
                  if(var5 > 0) {
                     break label47;
                  }

                  var5 = this.field_9047.field_3005;
               }

               if(var1 != null) {
                  if(var5 == 0) {
                     return false;
                  }

                  var5 = this.field_9047.method_4165().nextInt(5);
               }

               if(var1 != null) {
                  if(var5 != 0) {
                     return false;
                  }

                  var5 = 1;
               }

               return (boolean)var5;
            }
         }

         var5 = 0;
      }

      return (boolean)var5;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9047.field_3005;
      if(var1 != null) {
         var10000 = !this.field_9047.field_3005;
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      double var1 = this.field_9048.field_2994 - this.field_9047.field_2994;
      double var3 = this.field_9048.field_2996 - this.field_9047.field_2996;
      float var5 = class_1715.method_9558(var1 * var1 + var3 * var3);
      this.field_9047.field_2997 += var1 / (double)var5 * 0.5D * 0.800000011920929D + this.field_9047.field_2997 * 0.20000000298023224D;
      this.field_9047.field_2999 += var3 / (double)var5 * 0.5D * 0.800000011920929D + this.field_9047.field_2999 * 0.20000000298023224D;
      this.field_9047.field_2998 = (double)this.field_9049;
   }
}
