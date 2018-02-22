
// $FF: renamed from: tv
public class class_255 extends class_250 {

   // $FF: renamed from: c int
   private int field_1387;
   // $FF: renamed from: d java.lang.String
   private String field_1388;
   // $FF: renamed from: e int
   private int field_1389;
   // $FF: renamed from: f ag
   private class_906 field_1390;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, java.lang.String, int, ag) void
   public void method_1473(int var1, String var2, int var3, class_906 var4) {
      super.method_1449();
      this.field_1387 = var1;
      this.field_1388 = var2;
      this.field_1389 = var3;
      this.field_1390 = var4;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1387 = var1.method_518();
      this.field_1388 = var1.method_524(255);
      this.field_1389 = var1.readUnsignedShort();
      this.field_1390 = class_906.method_5335(var1.method_518());
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_519(this.field_1387);
      var1.method_525(this.field_1388);
      var1.writeShort(this.field_1389);
      var1.method_519(this.field_1390.method_5334());
   }

   // $FF: renamed from: b (tN) void
   public void method_1474(class_62 var1) {
      var1.method_249(this);
   }

   // $FF: renamed from: b () boolean
   public boolean method_1456() {
      return true;
   }

   // $FF: renamed from: a () ag
   public class_906 method_1475() {
      return this.field_1390;
   }

   // $FF: renamed from: e () int
   public int method_1476() {
      return this.field_1387;
   }
}
