
// $FF: renamed from: sm
public class class_287 extends class_250 {

   // $FF: renamed from: c int
   private int field_1515;
   // $FF: renamed from: d int
   private int field_1516;
   // $FF: renamed from: e int
   private int field_1517;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int) void
   public void method_1652(int var1, int var2, int var3) {
      super.method_1449();
      this.field_1515 = var1;
      this.field_1516 = var2;
      this.field_1517 = var3;
   }

   // $FF: renamed from: b (tF) void
   public void method_1653(class_64 var1) {
      var1.method_293(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1515 = var1.readUnsignedByte();
      this.field_1516 = var1.readShort();
      this.field_1517 = var1.readShort();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(this.field_1515);
      var1.writeShort(this.field_1516);
      var1.writeShort(this.field_1517);
   }

   // $FF: renamed from: a () int
   public int method_1654() {
      return this.field_1515;
   }

   // $FF: renamed from: e () int
   public int method_1655() {
      return this.field_1516;
   }

   // $FF: renamed from: f () int
   public int method_1656() {
      return this.field_1517;
   }
}
