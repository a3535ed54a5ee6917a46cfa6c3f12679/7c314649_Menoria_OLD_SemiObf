
// $FF: renamed from: yG
public class class_1759 extends class_1727 {

   // $FF: renamed from: c ahb
   ahb field_9192;
   // $FF: renamed from: d sw
   class_753 field_9193;
   // $FF: renamed from: e sv
   class_752 field_9194;
   // $FF: renamed from: f int
   int field_9195;


   // $FF: renamed from: <init> (sw) void
   public void method_9717(class_753 var1) {
      super.method_9648();
      this.field_9193 = var1;
      this.field_9192 = var1.field_2990;
      this.method_9655(3);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var10000 = class_752.method_4253();
      class_752 var2 = this.field_9193.method_4259();
      String[] var1 = var10000;
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         this.field_9194 = var2;
      }

      return true;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9194.method_3917();
      if(var1 != null) {
         if(var10000 == 0) {
            return false;
         }

         double var2;
         var10000 = (var2 = this.field_9193.method_3891(this.field_9194) - 225.0D) == 0.0D?0:(var2 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var10000 > 0) {
            return false;
         }

         var10000 = this.field_9193.method_4257().method_9801();
      }

      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = this.method_9649();
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 == 0) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9194 = null;
      this.field_9193.method_4257().method_9802();
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      String[] var1;
      int var8;
      label45: {
         double var2;
         double var4;
         double var6;
         label48: {
            this.field_9193.method_4254().method_9975(this.field_9194, 30.0F, 30.0F);
            String[] var10000 = class_752.method_4253();
            var2 = (double)(this.field_9193.field_3014 * 2.0F * this.field_9193.field_3014 * 2.0F);
            var4 = this.field_9193.method_3889(this.field_9194.field_2994, this.field_9194.field_3004.field_6910, this.field_9194.field_2996);
            var6 = 0.8D;
            var1 = var10000;
            double var9;
            var8 = (var9 = var4 - var2) == 0.0D?0:(var9 < 0.0D?-1:1);
            if(var1 != null) {
               label42: {
                  if(var8 > 0) {
                     double var10;
                     var8 = (var10 = var4 - 16.0D) == 0.0D?0:(var10 < 0.0D?-1:1);
                     if(var1 == null) {
                        break label42;
                     }

                     if(var8 < 0) {
                        var6 = 1.33D;
                        if(var1 != null) {
                           break label48;
                        }
                     }
                  }

                  double var11;
                  var8 = (var11 = var4 - 225.0D) == 0.0D?0:(var11 < 0.0D?-1:1);
               }
            }

            if(var1 == null) {
               break label45;
            }

            if(var8 < 0) {
               var6 = 0.6D;
            }
         }

         this.field_9193.method_4257().method_9796(this.field_9194, var6);
         this.field_9195 = Math.max(this.field_9195 - 1, 0);
         double var12;
         var8 = (var12 = var4 - var2) == 0.0D?0:(var12 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var8 > 0) {
            return;
         }

         var8 = this.field_9195;
      }

      if(var1 != null) {
         if(var8 > 0) {
            return;
         }

         this.field_9195 = 20;
         this.field_9193.method_4228(this.field_9194);
      }

   }
}
