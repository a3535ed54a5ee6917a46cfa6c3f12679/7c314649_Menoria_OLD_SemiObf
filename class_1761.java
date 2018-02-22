
// $FF: renamed from: yE
public class class_1761 extends class_1727 {

   // $FF: renamed from: c wI
   private class_761 field_9203;
   // $FF: renamed from: d double
   private double field_9204;
   // $FF: renamed from: e double
   private double field_9205;
   // $FF: renamed from: f double
   private double field_9206;
   // $FF: renamed from: g double
   private double field_9207;


   // $FF: renamed from: <init> (wI, double) void
   public void method_9719(class_761 var1, double var2) {
      super.method_9648();
      this.field_9203 = var1;
      this.field_9207 = var2;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      class_761 var10000 = this.field_9203;
      if(var1 != null) {
         if(this.field_9203.method_4337()) {
            return false;
         }

         var10000 = this.field_9203;
      }

      class_1661 var2 = var10000.method_4340();
      azw var3 = class_1787.method_9819(this.field_9203, 16, 7, azw.method_5086((double)var2.field_8646, (double)var2.field_8647, (double)var2.field_8648));
      if(var1 != null) {
         if(var3 == null) {
            return false;
         }

         this.field_9204 = var3.field_4220;
         this.field_9205 = var3.field_4221;
         this.field_9206 = var3.field_4222;
      }

      return true;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9203.method_4257().method_9801();
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9203.method_4257().method_9794(this.field_9204, this.field_9205, this.field_9206, this.field_9207);
   }
}
