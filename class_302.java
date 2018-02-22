
// $FF: renamed from: tB
public class class_302 extends class_250 {

   // $FF: renamed from: c long
   private long field_1567;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (long) void
   public void method_1727(long var1) {
      super.method_1449();
      this.field_1567 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1567 = var1.readLong();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeLong(this.field_1567);
   }

   // $FF: renamed from: b (tQ) void
   public void method_1728(class_59 var1) {
      var1.method_243(this);
   }

   // $FF: renamed from: b () boolean
   public boolean method_1456() {
      return true;
   }

   // $FF: renamed from: a () long
   public long method_1729() {
      return this.field_1567;
   }
}
