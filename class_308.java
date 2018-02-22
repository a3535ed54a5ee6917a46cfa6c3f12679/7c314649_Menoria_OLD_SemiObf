
// $FF: renamed from: sW
public class class_308 extends class_250 {

   // $FF: renamed from: c float
   private float field_1586;
   // $FF: renamed from: d int
   private int field_1587;
   // $FF: renamed from: e int
   private int field_1588;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (float, int, int) void
   public void method_1758(float var1, int var2, int var3) {
      super.method_1449();
      this.field_1586 = var1;
      this.field_1587 = var2;
      this.field_1588 = var3;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1586 = var1.readFloat();
      this.field_1588 = var1.readShort();
      this.field_1587 = var1.readShort();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeFloat(this.field_1586);
      var1.writeShort(this.field_1588);
      var1.writeShort(this.field_1587);
   }

   // $FF: renamed from: b (tF) void
   public void method_1759(class_64 var1) {
      var1.method_321(this);
   }

   // $FF: renamed from: a () float
   public float method_1760() {
      return this.field_1586;
   }

   // $FF: renamed from: e () int
   public int method_1761() {
      return this.field_1587;
   }

   // $FF: renamed from: f () int
   public int method_1762() {
      return this.field_1588;
   }
}
