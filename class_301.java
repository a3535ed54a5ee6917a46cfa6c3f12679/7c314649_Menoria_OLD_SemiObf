
// $FF: renamed from: sb
public class class_301 extends class_250 {

   // $FF: renamed from: c int
   private int field_1562;
   // $FF: renamed from: d int
   private int field_1563;
   // $FF: renamed from: e int
   private int field_1564;
   // $FF: renamed from: f int
   private int field_1565;
   // $FF: renamed from: g int
   private int field_1566;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int, int, int) void
   public void method_1720(int var1, int var2, int var3, int var4, int var5) {
      super.method_1449();
      this.field_1562 = var1;
      this.field_1563 = var2;
      this.field_1564 = var3;
      this.field_1565 = var4;
      this.field_1566 = var5;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1562 = var1.method_518();
      this.field_1563 = var1.readInt();
      this.field_1564 = var1.readInt();
      this.field_1565 = var1.readInt();
      this.field_1566 = var1.readUnsignedByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_519(this.field_1562);
      var1.writeInt(this.field_1563);
      var1.writeInt(this.field_1564);
      var1.writeInt(this.field_1565);
      var1.writeByte(this.field_1566);
   }

   // $FF: renamed from: b (tF) void
   public void method_1721(class_64 var1) {
      var1.method_280(this);
   }

   // $FF: renamed from: a () int
   public int method_1722() {
      return this.field_1562;
   }

   // $FF: renamed from: e () int
   public int method_1723() {
      return this.field_1563;
   }

   // $FF: renamed from: f () int
   public int method_1724() {
      return this.field_1564;
   }

   // $FF: renamed from: g () int
   public int method_1725() {
      return this.field_1565;
   }

   // $FF: renamed from: h () int
   public int method_1726() {
      return this.field_1566;
   }
}
