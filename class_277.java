
// $FF: renamed from: sz
public class class_277 extends class_250 {

   // $FF: renamed from: c int
   private int field_1468;
   // $FF: renamed from: d int
   private int field_1469;
   // $FF: renamed from: e int
   private int field_1470;
   // $FF: renamed from: f int
   private int field_1471;
   // $FF: renamed from: g int
   private int field_1472;
   // $FF: renamed from: h boolean
   private boolean field_1473;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int, int, int, boolean) void
   public void method_1589(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      super.method_1449();
      this.field_1468 = var1;
      this.field_1470 = var2;
      this.field_1471 = var3;
      this.field_1472 = var4;
      this.field_1469 = var5;
      this.field_1473 = var6;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1468 = var1.readInt();
      this.field_1470 = var1.readInt();
      this.field_1471 = var1.readByte() & 255;
      this.field_1472 = var1.readInt();
      this.field_1469 = var1.readInt();
      this.field_1473 = var1.readBoolean();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1468);
      var1.writeInt(this.field_1470);
      var1.writeByte(this.field_1471 & 255);
      var1.writeInt(this.field_1472);
      var1.writeInt(this.field_1469);
      var1.writeBoolean(this.field_1473);
   }

   // $FF: renamed from: b (tF) void
   public void method_1590(class_64 var1) {
      var1.getBlock5(this);
   }

   // $FF: renamed from: a () boolean
   public boolean method_1591() {
      return this.field_1473;
   }

   // $FF: renamed from: e () int
   public int method_1592() {
      return this.field_1468;
   }

   // $FF: renamed from: f () int
   public int method_1593() {
      return this.field_1469;
   }

   // $FF: renamed from: g () int
   public int method_1594() {
      return this.field_1470;
   }

   // $FF: renamed from: h () int
   public int method_1595() {
      return this.field_1471;
   }

   // $FF: renamed from: i () int
   public int method_1596() {
      return this.field_1472;
   }
}
