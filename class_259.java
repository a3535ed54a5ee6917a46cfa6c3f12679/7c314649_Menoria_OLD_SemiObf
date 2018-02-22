
// $FF: renamed from: tr
public class class_259 extends class_250 {

   // $FF: renamed from: c int
   private int field_1405;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int) void
   public void method_1497(int var1) {
      super.method_1449();
      this.field_1405 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1405 = var1.readShort();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeShort(this.field_1405);
   }

   // $FF: renamed from: b (tL) void
   public void method_1498(class_63 var1) {
      var1.method_267(this);
   }

   // $FF: renamed from: a () int
   public int method_1499() {
      return this.field_1405;
   }
}
