
// $FF: renamed from: sj
public class class_290 extends class_250 {

   // $FF: renamed from: c int
   private int field_1526;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int) void
   public void method_1670(int var1) {
      super.method_1449();
      this.field_1526 = var1;
   }

   // $FF: renamed from: b (tF) void
   public void method_1671(class_64 var1) {
      var1.method_290(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1526 = var1.readUnsignedByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(this.field_1526);
   }
}
