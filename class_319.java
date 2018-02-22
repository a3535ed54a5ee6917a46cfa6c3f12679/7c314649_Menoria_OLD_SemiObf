
// $FF: renamed from: sL
public class class_319 extends class_250 {

   // $FF: renamed from: c int
   private int field_1617;
   // $FF: renamed from: d int
   private int field_1618;
   // $FF: renamed from: e int
   private int field_1619;
   // $FF: renamed from: f int
   private int field_1620;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (yz, int, int, int) void
   public void method_1808(class_792 var1, int var2, int var3, int var4) {
      super.method_1449();
      this.field_1618 = var2;
      this.field_1619 = var3;
      this.field_1620 = var4;
      this.field_1617 = var1.method_3845();
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1617 = var1.readInt();
      this.field_1618 = var1.readInt();
      this.field_1619 = var1.readByte();
      this.field_1620 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1617);
      var1.writeInt(this.field_1618);
      var1.writeByte(this.field_1619);
      var1.writeInt(this.field_1620);
   }

   // $FF: renamed from: b (tF) void
   public void method_1809(class_64 var1) {
      var1.method_297(this);
   }

   // $FF: renamed from: b (ahb) yz
   public class_792 method_1810(ahb var1) {
      return (class_792)var1.method_2160(this.field_1617);
   }

   // $FF: renamed from: a () int
   public int method_1811() {
      return this.field_1618;
   }

   // $FF: renamed from: e () int
   public int method_1812() {
      return this.field_1619;
   }

   // $FF: renamed from: f () int
   public int method_1813() {
      return this.field_1620;
   }
}
