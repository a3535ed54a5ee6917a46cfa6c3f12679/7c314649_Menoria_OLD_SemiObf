
// $FF: renamed from: sY
public class class_306 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1580;
   // $FF: renamed from: d java.lang.String
   private String field_1581;
   // $FF: renamed from: e int
   private int field_1582;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (kh, int) void
   public void method_1748(class_1344 var1, int var2) {
      super.method_1449();
      this.field_1580 = var1.GuiTextField7();
      this.field_1581 = var1.GuiTextField9();
      this.field_1582 = var2;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1580 = var1.method_524(16);
      this.field_1581 = var1.method_524(32);
      this.field_1582 = var1.readByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(this.field_1580);
      var1.method_525(this.field_1581);
      var1.writeByte(this.field_1582);
   }

   // $FF: renamed from: b (tF) void
   public void method_1749(class_64 var1) {
      var1.method_275(this);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1750() {
      return this.field_1580;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_1751() {
      return this.field_1581;
   }

   // $FF: renamed from: f () int
   public int method_1752() {
      return this.field_1582;
   }
}
