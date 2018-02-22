
// $FF: renamed from: yM
public class class_1753 extends class_1727 {

   // $FF: renamed from: c wI
   private class_761 field_9159;
   // $FF: renamed from: d double
   private double field_9160;
   // $FF: renamed from: e double
   private double field_9161;
   // $FF: renamed from: f double
   private double field_9162;
   // $FF: renamed from: g double
   private double field_9163;


   // $FF: renamed from: <init> (wI, double) void
   public void method_9705(class_761 var1, double var2) {
      super.method_9648();
      this.field_9159 = var1;
      this.field_9163 = var2;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1;
      class_761 var3;
      label32: {
         var1 = class_752.method_4253();
         int var10000 = this.field_9159.method_4172();
         if(var1 != null) {
            if(var10000 >= 100) {
               return false;
            }

            var3 = this.field_9159;
            if(var1 == null) {
               break label32;
            }

            var10000 = this.field_9159.method_4165().nextInt(120);
         }

         if(var10000 != 0) {
            return false;
         }

         var3 = this.field_9159;
      }

      azw var2 = class_1787.method_9818(var3, 10, 7);
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         this.field_9160 = var2.field_4220;
         this.field_9161 = var2.field_4221;
         this.field_9162 = var2.field_4222;
      }

      return true;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9159.method_4257().method_9801();
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9159.method_4257().method_9794(this.field_9160, this.field_9161, this.field_9162, this.field_9163);
   }
}
