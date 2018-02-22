
// $FF: renamed from: qR
class class_1470 extends class_1469 {

   // $FF: renamed from: a add
   // $FF: synthetic field
   final add field_7743;
   // $FF: renamed from: d t0
   // $FF: synthetic field
   final class_1585 field_7744;


   // $FF: renamed from: <init> (t0, add) void
   void method_7948(class_1585 var1, add var2) {
      this.field_7744 = var1;
      this.field_7743 = var2;
      super.method_7939();
   }

   // $FF: renamed from: b (ahb, q7) Aj
   protected class_12 method_7945(ahb var1, class_45 var2) {
      class_798 var10000 = new class_798;
      var10000.method_4693(var1, var2.method_179(), var2.method_180(), var2.method_181(), this.field_7743.method_3754());
      return var10000;
   }

   // $FF: renamed from: b () float
   protected float method_7946() {
      return super.method_7946() * 0.5F;
   }

   // $FF: renamed from: c () float
   protected float method_7947() {
      return super.method_7947() * 1.25F;
   }
}
