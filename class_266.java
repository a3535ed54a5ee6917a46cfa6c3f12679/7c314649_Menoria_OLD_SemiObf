
// $FF: renamed from: tl
public class class_266 extends class_264 {

   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
      this.field_1432 = true;
      this.field_1433 = true;
   }

   // $FF: renamed from: <init> (double, double, double, double, float, float, boolean) void
   public void method_1545(double var1, double var3, double var5, double var7, float var9, float var10, boolean var11) {
      super.method_1449();
      this.field_1425 = var1;
      this.field_1426 = var3;
      this.field_1428 = var5;
      this.field_1427 = var7;
      this.field_1429 = var9;
      this.field_1430 = var10;
      this.field_1431 = var11;
      this.field_1433 = true;
      this.field_1432 = true;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1425 = var1.readDouble();
      this.field_1426 = var1.readDouble();
      this.field_1428 = var1.readDouble();
      this.field_1427 = var1.readDouble();
      this.field_1429 = var1.readFloat();
      this.field_1430 = var1.readFloat();
      super.method_1453(var1);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeDouble(this.field_1425);
      var1.writeDouble(this.field_1426);
      var1.writeDouble(this.field_1428);
      var1.writeDouble(this.field_1427);
      var1.writeFloat(this.field_1429);
      var1.writeFloat(this.field_1430);
      super.method_1454(var1);
   }
}
