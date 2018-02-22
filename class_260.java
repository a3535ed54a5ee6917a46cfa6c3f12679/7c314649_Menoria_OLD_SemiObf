
// $FF: renamed from: tq
public class class_260 extends class_250 {

   // $FF: renamed from: c float
   private float field_1406;
   // $FF: renamed from: d float
   private float field_1407;
   // $FF: renamed from: e boolean
   private boolean field_1408;
   // $FF: renamed from: f boolean
   private boolean field_1409;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (float, float, boolean, boolean) void
   public void method_1500(float var1, float var2, boolean var3, boolean var4) {
      super.method_1449();
      this.field_1406 = var1;
      this.field_1407 = var2;
      this.field_1408 = var3;
      this.field_1409 = var4;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1406 = var1.readFloat();
      this.field_1407 = var1.readFloat();
      this.field_1408 = var1.readBoolean();
      this.field_1409 = var1.readBoolean();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeFloat(this.field_1406);
      var1.writeFloat(this.field_1407);
      var1.writeBoolean(this.field_1408);
      var1.writeBoolean(this.field_1409);
   }

   // $FF: renamed from: b (tL) void
   public void method_1501(class_63 var1) {
      var1.method_266(this);
   }

   // $FF: renamed from: a () float
   public float method_1502() {
      return this.field_1406;
   }

   // $FF: renamed from: e () float
   public float method_1503() {
      return this.field_1407;
   }

   // $FF: renamed from: f () boolean
   public boolean method_1504() {
      return this.field_1408;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1505() {
      return this.field_1409;
   }
}
