
// $FF: renamed from: sq
public class class_283 extends class_250 {

   // $FF: renamed from: c int
   private int field_1506;
   // $FF: renamed from: d byte
   private byte field_1507;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sa, byte) void
   public void method_1635(class_689 var1, byte var2) {
      super.method_1449();
      this.field_1506 = var1.method_3845();
      this.field_1507 = var2;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1506 = var1.readInt();
      this.field_1507 = var1.readByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1506);
      var1.writeByte(this.field_1507);
   }

   // $FF: renamed from: b (tF) void
   public void method_1636(class_64 var1) {
      var1.method_298(this);
   }

   // $FF: renamed from: b (ahb) sa
   public class_689 method_1637(ahb var1) {
      return var1.method_2160(this.field_1506);
   }

   // $FF: renamed from: a () byte
   public byte method_1638() {
      return this.field_1507;
   }
}
