
// $FF: renamed from: sR
public class class_313 extends class_250 {

   // $FF: renamed from: c int
   private int field_1603;
   // $FF: renamed from: d java.lang.String
   private String field_1604;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, kh) void
   public void method_1784(int var1, class_1344 var2) {
      String[] var10000 = class_752.method_4253();
      super.method_1449();
      String[] var3 = var10000;
      class_313 var4 = this;
      if(var3 != null) {
         this.field_1603 = var1;
         if(var2 == null) {
            this.field_1604 = "";
            if(var3 != null) {
               return;
            }
         }

         var4 = this;
      }

      var4.field_1604 = var2.GuiTextField7();
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1603 = var1.readByte();
      this.field_1604 = var1.method_524(16);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(this.field_1603);
      var1.method_525(this.field_1604);
   }

   // $FF: renamed from: b (tF) void
   public void method_1785(class_64 var1) {
      var1.method_317(this);
   }

   // $FF: renamed from: a () int
   public int method_1786() {
      return this.field_1603;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_1787() {
      return this.field_1604;
   }
}
