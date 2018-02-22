
// $FF: renamed from: s4
public class class_337 extends class_250 {

   // $FF: renamed from: c int
   private int field_1698;
   // $FF: renamed from: d int
   private int field_1699;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_1911(int var1, int var2) {
      super.method_1449();
      this.field_1698 = var1;
      this.field_1699 = var2;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1698 = var1.readInt();
      this.field_1699 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1698);
      var1.writeInt(this.field_1699);
   }

   // $FF: renamed from: b (tF) void
   public void method_1912(class_64 var1) {
      var1.method_329(this);
   }

   // $FF: renamed from: a () int
   public int method_1913() {
      return this.field_1698;
   }

   // $FF: renamed from: e () int
   public int method_1914() {
      return this.field_1699;
   }
}
