
// $FF: renamed from: su
public class class_280 extends class_250 {

   // $FF: renamed from: c int
   private int field_1494;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int) void
   public void method_1618(int var1) {
      super.method_1449();
      this.field_1494 = var1;
   }

   // $FF: renamed from: b (tF) void
   public void method_1619(class_64 var1) {
      var1.getBlock2(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1494 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1494);
   }

   // $FF: renamed from: b () boolean
   public boolean method_1456() {
      return true;
   }

   // $FF: renamed from: a () int
   public int method_1620() {
      return this.field_1494;
   }
}
