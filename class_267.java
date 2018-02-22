
// $FF: renamed from: tk
public class class_267 extends class_264 {

   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
      this.field_1432 = true;
   }

   // $FF: renamed from: <init> (double, double, double, double, boolean) void
   public void method_1546(double var1, double var3, double var5, double var7, boolean var9) {
      super.method_1449();
      this.field_1425 = var1;
      this.field_1426 = var3;
      this.field_1428 = var5;
      this.field_1427 = var7;
      this.field_1431 = var9;
      this.field_1432 = true;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1425 = var1.readDouble();
      this.field_1426 = var1.readDouble();
      this.field_1428 = var1.readDouble();
      this.field_1427 = var1.readDouble();
      super.method_1453(var1);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeDouble(this.field_1425);
      var1.writeDouble(this.field_1426);
      var1.writeDouble(this.field_1428);
      var1.writeDouble(this.field_1427);
      super.method_1454(var1);
   }
}
