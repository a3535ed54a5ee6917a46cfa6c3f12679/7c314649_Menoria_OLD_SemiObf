
// $FF: renamed from: sX
public class class_307 extends class_250 {

   // $FF: renamed from: c float
   private float field_1583;
   // $FF: renamed from: d int
   private int field_1584;
   // $FF: renamed from: e float
   private float field_1585;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (float, int, float) void
   public void method_1753(float var1, int var2, float var3) {
      super.method_1449();
      this.field_1583 = var1;
      this.field_1584 = var2;
      this.field_1585 = var3;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1583 = var1.readFloat();
      this.field_1584 = var1.readShort();
      this.field_1585 = var1.readFloat();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeFloat(this.field_1583);
      var1.writeShort(this.field_1584);
      var1.writeFloat(this.field_1585);
   }

   // $FF: renamed from: b (tF) void
   public void method_1754(class_64 var1) {
      var1.method_322(this);
   }

   // $FF: renamed from: a () float
   public float method_1755() {
      return this.field_1583;
   }

   // $FF: renamed from: e () int
   public int method_1756() {
      return this.field_1584;
   }

   // $FF: renamed from: f () float
   public float method_1757() {
      return this.field_1585;
   }
}
