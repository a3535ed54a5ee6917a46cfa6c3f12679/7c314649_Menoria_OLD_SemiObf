
// $FF: renamed from: yQ
public class class_1749 extends class_1727 {

   // $FF: renamed from: c wR
   private class_772 field_9140;
   // $FF: renamed from: d double
   private double field_9141;
   // $FF: renamed from: e double
   private double field_9142;
   // $FF: renamed from: f double
   private double field_9143;
   // $FF: renamed from: g double
   private double field_9144;


   // $FF: renamed from: <init> (wR, double) void
   public void method_9698(class_772 var1, double var2) {
      super.method_9648();
      this.field_9140 = var1;
      this.field_9141 = var2;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9140.method_4406();
      if(var1 != null) {
         if(!var10000) {
            label29: {
               class_772 var3 = this.field_9140;
               if(var1 != null) {
                  if(this.field_9140.field_2987 == null) {
                     break label29;
                  }

                  var3 = this.field_9140;
               }

               azw var2 = class_1787.method_9818(var3, 5, 4);
               if(var1 != null) {
                  if(var2 == null) {
                     return false;
                  }

                  this.field_9142 = var2.field_4220;
                  this.field_9143 = var2.field_4221;
                  this.field_9144 = var2.field_4222;
               }

               return true;
            }
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9140.method_4257().method_9794(this.field_9142, this.field_9143, this.field_9144, this.field_9141);
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      boolean var2;
      label17: {
         String[] var1 = class_752.method_4253();
         Object var10000 = this.field_9140;
         if(var1 != null) {
            if(this.field_9140.method_4257().method_9801()) {
               break label17;
            }

            var10000 = this.field_9140.field_2987;
         }

         if(var10000 != null) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      class_689 var4;
      label39: {
         String[] var1 = class_752.method_4253();
         int var10000 = this.field_9140.method_4165().nextInt(50);
         if(var1 != null) {
            if(var10000 != 0) {
               return;
            }

            var4 = this.field_9140.field_2987;
            if(var1 == null) {
               break label39;
            }

            var10000 = this.field_9140.field_2987 instanceof class_792;
         }

         if(var10000 != 0) {
            int var2 = this.field_9140.method_4426();
            int var3 = this.field_9140.method_4439();
            if(var1 != null) {
               label24: {
                  if(var3 > 0) {
                     var10000 = this.field_9140.method_4165().nextInt(var3);
                     if(var1 == null) {
                        break label24;
                     }

                     if(var10000 < var2) {
                        this.field_9140.method_4460((class_792)this.field_9140.field_2987);
                        this.field_9140.field_2990.method_2191(this.field_9140, (byte)7);
                        return;
                     }
                  }

                  this.field_9140.method_4428(5);
               }
            }
         }

         var4 = this.field_9140.field_2987;
      }

      var4.method_3925((class_689)null);
      this.field_9140.field_2987 = null;
      this.field_9140.method_4457();
      this.field_9140.field_2990.method_2191(this.field_9140, (byte)6);
   }
}
