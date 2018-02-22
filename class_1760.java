
// $FF: renamed from: yF
public class class_1760 extends class_1727 {

   // $FF: renamed from: c wI
   private class_761 field_9196;
   // $FF: renamed from: d sv
   private class_752 field_9197;
   // $FF: renamed from: e double
   private double field_9198;
   // $FF: renamed from: f double
   private double field_9199;
   // $FF: renamed from: g double
   private double field_9200;
   // $FF: renamed from: h double
   private double field_9201;
   // $FF: renamed from: i float
   private float field_9202;


   // $FF: renamed from: <init> (wI, double, float) void
   public void method_9718(class_761 var1, double var2, float var4) {
      super.method_9648();
      this.field_9196 = var1;
      this.field_9201 = var2;
      this.field_9202 = var4;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1;
      class_1760 var4;
      label32: {
         String[] var10000 = class_752.method_4253();
         this.field_9197 = this.field_9196.method_4259();
         var1 = var10000;
         class_752 var3 = this.field_9197;
         if(var1 != null) {
            if(this.field_9197 == null) {
               return false;
            }

            var4 = this;
            if(var1 == null) {
               break label32;
            }

            var3 = this.field_9197;
         }

         if(var3.method_3891(this.field_9196) > (double)(this.field_9202 * this.field_9202)) {
            return false;
         }

         var4 = this;
      }

      azw var2 = class_1787.method_9819(var4.field_9196, 16, 7, azw.method_5086(this.field_9197.field_2994, this.field_9197.field_2995, this.field_9197.field_2996));
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         this.field_9198 = var2.field_4220;
         this.field_9199 = var2.field_4221;
         this.field_9200 = var2.field_4222;
      }

      return true;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      int var10000;
      label32: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_9196.method_4257().method_9801();
         if(var1 != null) {
            if(var10000 != 0) {
               break label32;
            }

            var10000 = this.field_9197.method_3917();
         }

         if(var1 != null) {
            if(var10000 == 0) {
               break label32;
            }

            double var2;
            var10000 = (var2 = this.field_9197.method_3891(this.field_9196) - (double)(this.field_9202 * this.field_9202)) == 0.0D?0:(var2 < 0.0D?-1:1);
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 < 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9197 = null;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9196.method_4257().method_9794(this.field_9198, this.field_9199, this.field_9200, this.field_9201);
   }
}
