
// $FF: renamed from: sc
public class class_299 extends class_250 {

   // $FF: renamed from: c int
   private int field_1554;
   // $FF: renamed from: d int
   private int field_1555;
   // $FF: renamed from: e int
   private int field_1556;
   // $FF: renamed from: f int
   private int field_1557;
   // $FF: renamed from: g ro
   private class_1583 field_1558;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int, int, ro) void
   public void method_1710(int var1, int var2, int var3, int var4, class_1583 var5) {
      super.method_1449();
      this.field_1554 = var1;
      this.field_1555 = var2;
      this.field_1556 = var3;
      this.field_1557 = var4;
      this.field_1558 = var5;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1554 = var1.readInt();
      this.field_1555 = var1.readShort();
      this.field_1556 = var1.readInt();
      this.field_1557 = var1.readUnsignedByte();
      this.field_1558 = var1.method_521();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1554);
      var1.writeShort(this.field_1555);
      var1.writeInt(this.field_1556);
      var1.writeByte((byte)this.field_1557);
      var1.method_520(this.field_1558);
   }

   // $FF: renamed from: b (tF) void
   public void method_1711(class_64 var1) {
      var1.method_282(this);
   }

   // $FF: renamed from: a () int
   public int method_1712() {
      return this.field_1554;
   }

   // $FF: renamed from: e () int
   public int method_1713() {
      return this.field_1555;
   }

   // $FF: renamed from: f () int
   public int method_1714() {
      return this.field_1556;
   }

   // $FF: renamed from: g () int
   public int method_1715() {
      return this.field_1557;
   }

   // $FF: renamed from: h () ro
   public class_1583 method_1716() {
      return this.field_1558;
   }
}
