
// $FF: renamed from: tm
public class class_265 extends class_264 {

   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
      this.field_1433 = true;
   }

   // $FF: renamed from: <init> (float, float, boolean) void
   public void method_1544(float var1, float var2, boolean var3) {
      super.method_1449();
      this.field_1429 = var1;
      this.field_1430 = var2;
      this.field_1431 = var3;
      this.field_1433 = true;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1429 = var1.readFloat();
      this.field_1430 = var1.readFloat();
      super.method_1453(var1);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeFloat(this.field_1429);
      var1.writeFloat(this.field_1430);
      super.method_1454(var1);
   }
}
