
// $FF: renamed from: s0
public class class_341 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1711;
   // $FF: renamed from: d java.lang.String
   private String field_1712;
   // $FF: renamed from: e int
   private int field_1713;
   // $FF: renamed from: f int
   private int field_1714;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
      this.field_1711 = "";
      this.field_1712 = "";
   }

   // $FF: renamed from: <init> (ki, int) void
   public void method_1930(class_1345 var1, int var2) {
      super.method_1449();
      this.field_1711 = "";
      this.field_1712 = "";
      this.field_1711 = var1.writeText5();
      this.field_1712 = var1.writeText4().GuiTextField7();
      this.field_1713 = var1.writeText2();
      this.field_1714 = var2;
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_1931(String var1) {
      super.method_1449();
      this.field_1711 = "";
      this.field_1712 = "";
      this.field_1711 = var1;
      this.field_1712 = "";
      this.field_1713 = 0;
      this.field_1714 = 1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_1711 = var1.method_524(16);
      String[] var2 = var10000;
      this.field_1714 = var1.readByte();
      class_341 var3 = this;
      if(var2 != null) {
         if(this.field_1714 == 1) {
            return;
         }

         this.field_1712 = var1.method_524(16);
         var3 = this;
      }

      var3.field_1713 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      var1.method_525(this.field_1711);
      var1.writeByte(this.field_1714);
      String[] var2 = var10000;
      if(var2 != null) {
         if(this.field_1714 == 1) {
            return;
         }

         var1.method_525(this.field_1712);
      }

      var1.writeInt(this.field_1713);
   }

   // $FF: renamed from: b (tF) void
   public void method_1932(class_64 var1) {
      var1.method_324(this);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1933() {
      return this.field_1711;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_1934() {
      return this.field_1712;
   }

   // $FF: renamed from: f () int
   public int method_1935() {
      return this.field_1713;
   }

   // $FF: renamed from: g () int
   public int method_1936() {
      return this.field_1714;
   }
}
