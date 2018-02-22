
// $FF: renamed from: yJ
public class class_1756 extends class_1727 {

   // $FF: renamed from: c wI
   private class_761 field_9174;
   // $FF: renamed from: d double
   private double field_9175;
   // $FF: renamed from: e double
   private double field_9176;
   // $FF: renamed from: f double
   private double field_9177;
   // $FF: renamed from: g double
   private double field_9178;


   // $FF: renamed from: <init> (wI, double) void
   public void method_9710(class_761 var1, double var2) {
      super.method_9648();
      this.field_9174 = var1;
      this.field_9175 = var2;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      class_761 var10000 = this.field_9174;
      if(var1 != null) {
         label24: {
            if(this.field_9174.method_4166() == null) {
               var10000 = this.field_9174;
               if(var1 == null) {
                  break label24;
               }

               if(!this.field_9174.method_3936()) {
                  return false;
               }
            }

            var10000 = this.field_9174;
         }
      }

      azw var2 = class_1787.method_9818(var10000, 5, 4);
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         this.field_9176 = var2.field_4220;
         this.field_9177 = var2.field_4221;
         this.field_9178 = var2.field_4222;
      }

      return true;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9174.method_4257().method_9794(this.field_9176, this.field_9177, this.field_9178, this.field_9175);
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9174.method_4257().method_9801();
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }
}
