
// $FF: renamed from: sK
public class class_320 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1621;
   // $FF: renamed from: d boolean
   private boolean field_1622;
   // $FF: renamed from: e int
   private int field_1623;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.lang.String, boolean, int) void
   public void method_1814(String var1, boolean var2, int var3) {
      super.method_1449();
      this.field_1621 = var1;
      this.field_1622 = var2;
      this.field_1623 = var3;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1621 = var1.method_524(16);
      this.field_1622 = var1.readBoolean();
      this.field_1623 = var1.readShort();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(this.field_1621);
      var1.writeBoolean(this.field_1622);
      var1.writeShort(this.field_1623);
   }

   // $FF: renamed from: b (tF) void
   public void method_1815(class_64 var1) {
      var1.method_311(this);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1816() {
      return this.field_1621;
   }

   // $FF: renamed from: e () boolean
   public boolean method_1817() {
      return this.field_1622;
   }

   // $FF: renamed from: f () int
   public int method_1818() {
      return this.field_1623;
   }
}
