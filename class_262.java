
// $FF: renamed from: to
public class class_262 extends class_250 {

   // $FF: renamed from: c int
   private int field_1413;
   // $FF: renamed from: d int
   private int field_1414;
   // $FF: renamed from: e int
   private int field_1415;
   // $FF: renamed from: f int
   private int field_1416;
   // $FF: renamed from: g int
   private int field_1417;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int, int, int) void
   public void method_1511(int var1, int var2, int var3, int var4, int var5) {
      super.method_1449();
      this.field_1417 = var1;
      this.field_1413 = var2;
      this.field_1414 = var3;
      this.field_1415 = var4;
      this.field_1416 = var5;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1417 = var1.readUnsignedByte();
      this.field_1413 = var1.readInt();
      this.field_1414 = var1.readUnsignedByte();
      this.field_1415 = var1.readInt();
      this.field_1416 = var1.readUnsignedByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(this.field_1417);
      var1.writeInt(this.field_1413);
      var1.writeByte(this.field_1414);
      var1.writeInt(this.field_1415);
      var1.writeByte(this.field_1416);
   }

   // $FF: renamed from: b (tL) void
   public void method_1512(class_63 var1) {
      var1.method_264(this);
   }

   // $FF: renamed from: a () int
   public int method_1513() {
      return this.field_1413;
   }

   // $FF: renamed from: e () int
   public int method_1514() {
      return this.field_1414;
   }

   // $FF: renamed from: f () int
   public int method_1515() {
      return this.field_1415;
   }

   // $FF: renamed from: g () int
   public int method_1516() {
      return this.field_1416;
   }

   // $FF: renamed from: h () int
   public int method_1517() {
      return this.field_1417;
   }
}
