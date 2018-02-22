
// $FF: renamed from: tD
public class class_298 extends class_250 {

   // $FF: renamed from: c long
   private long field_1553;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (long) void
   public void method_1707(long var1) {
      super.method_1449();
      this.field_1553 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1553 = var1.readLong();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeLong(this.field_1553);
   }

   // $FF: renamed from: b (tY) void
   public void method_1708(class_58 var1) {
      var1.method_240(this);
   }

   // $FF: renamed from: b () boolean
   public boolean method_1456() {
      return true;
   }

   // $FF: renamed from: a () long
   public long method_1709() {
      return this.field_1553;
   }
}
