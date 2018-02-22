
// $FF: renamed from: sO
public class class_316 extends class_250 {

   // $FF: renamed from: c int
   private int field_1609;
   // $FF: renamed from: d aq
   private class_918 field_1610;
   // $FF: renamed from: e G
   private class_94 field_1611;
   // $FF: renamed from: f du
   private class_1046 field_1612;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, aq, du, G) void
   public void method_1795(int var1, class_918 var2, class_1046 var3, class_94 var4) {
      super.method_1449();
      this.field_1609 = var1;
      this.field_1610 = var2;
      this.field_1611 = var4;
      this.field_1612 = var3;
   }

   // $FF: renamed from: b (tF) void
   public void method_1796(class_64 var1) {
      var1.method_314(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_1609 = var1.readInt();
      String[] var2 = var10000;
      this.field_1610 = class_918.method_5393(var1.readUnsignedByte());
      this.field_1611 = class_94.method_449(var1.readUnsignedByte());
      this.field_1612 = class_1046.method_5931(var1.method_524(16));
      class_316 var3 = this;
      if(var2 != null) {
         if(this.field_1612 != null) {
            return;
         }

         var3 = this;
      }

      var3.field_1612 = class_1046.field_5527;
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1609);
      var1.writeByte(this.field_1610.method_5392());
      var1.writeByte(this.field_1611.method_443());
      var1.method_525(this.field_1612.method_5922());
   }

   // $FF: renamed from: a () int
   public int method_1797() {
      return this.field_1609;
   }

   // $FF: renamed from: e () aq
   public class_918 method_1798() {
      return this.field_1610;
   }

   // $FF: renamed from: f () G
   public class_94 method_1799() {
      return this.field_1611;
   }

   // $FF: renamed from: g () du
   public class_1046 method_1800() {
      return this.field_1612;
   }
}
