
// $FF: renamed from: sI
public class class_322 extends class_250 {

   // $FF: renamed from: c int
   private int field_1631;
   // $FF: renamed from: d int
   private int field_1632;
   // $FF: renamed from: e int
   private int field_1633;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int) void
   public void method_1833(int var1, int var2, int var3) {
      super.method_1449();
      this.field_1631 = var1;
      this.field_1632 = var2;
      this.field_1633 = var3;
   }

   // $FF: renamed from: b (tF) void
   public void method_1834(class_64 var1) {
      var1.method_281(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1631 = var1.readInt();
      this.field_1632 = var1.readInt();
      this.field_1633 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1631);
      var1.writeInt(this.field_1632);
      var1.writeInt(this.field_1633);
   }

   // $FF: renamed from: a () int
   public int method_1835() {
      return this.field_1631;
   }

   // $FF: renamed from: e () int
   public int method_1836() {
      return this.field_1632;
   }

   // $FF: renamed from: f () int
   public int method_1837() {
      return this.field_1633;
   }
}
