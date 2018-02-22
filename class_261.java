
// $FF: renamed from: tp
public class class_261 extends class_250 {

   // $FF: renamed from: c int
   private int field_1410;
   // $FF: renamed from: d int
   private int field_1411;
   // $FF: renamed from: e int
   private int field_1412;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sa, int) void
   public void method_1506(class_689 var1, int var2) {
      this.method_1507(var1, var2, 0);
   }

   // $FF: renamed from: <init> (sa, int, int) void
   public void method_1507(class_689 var1, int var2, int var3) {
      super.method_1449();
      this.field_1410 = var1.method_3845();
      this.field_1411 = var2;
      this.field_1412 = var3;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1410 = var1.readInt();
      this.field_1411 = var1.readByte();
      this.field_1412 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1410);
      var1.writeByte(this.field_1411);
      var1.writeInt(this.field_1412);
   }

   // $FF: renamed from: b (tL) void
   public void method_1508(class_63 var1) {
      var1.method_265(this);
   }

   // $FF: renamed from: a () int
   public int method_1509() {
      return this.field_1411;
   }

   // $FF: renamed from: d () int
   public int method_1510() {
      return this.field_1412;
   }
}
