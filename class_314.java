
// $FF: renamed from: sQ
public class class_314 extends class_250 {

   // $FF: renamed from: c int
   private int field_1605;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int) void
   public void method_1788(int var1) {
      super.method_1449();
      this.field_1605 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1605 = var1.readByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(this.field_1605);
   }

   // $FF: renamed from: b (tF) void
   public void method_1789(class_64 var1) {
      var1.method_316(this);
   }

   // $FF: renamed from: a () int
   public int method_1790() {
      return this.field_1605;
   }
}
