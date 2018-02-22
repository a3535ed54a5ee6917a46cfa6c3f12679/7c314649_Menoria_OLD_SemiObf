
// $FF: renamed from: tj
public class class_264 extends class_250 {

   // $FF: renamed from: c double
   protected double field_1425;
   // $FF: renamed from: d double
   protected double field_1426;
   // $FF: renamed from: e double
   protected double field_1427;
   // $FF: renamed from: f double
   protected double field_1428;
   // $FF: renamed from: g float
   protected float field_1429;
   // $FF: renamed from: h float
   protected float field_1430;
   // $FF: renamed from: i boolean
   protected boolean field_1431;
   // $FF: renamed from: j boolean
   protected boolean field_1432;
   // $FF: renamed from: k boolean
   protected boolean field_1433;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (boolean) void
   public void method_1532(boolean var1) {
      super.method_1449();
      this.field_1431 = var1;
   }

   // $FF: renamed from: b (tL) void
   public void method_1533(class_63 var1) {
      var1.method_262(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      String[] var2 = class_752.method_4253();
      int var10001 = var1.readUnsignedByte();
      if(var2 != null) {
         var10001 = var10001 != 0?1:0;
      }

      this.field_1431 = (boolean)var10001;
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var2 = class_752.method_4253();
      int var10001 = this.field_1431;
      if(var2 != null) {
         var10001 = this.field_1431?1:0;
      }

      var1.writeByte(var10001);
   }

   // $FF: renamed from: a () double
   public double method_1534() {
      return this.field_1425;
   }

   // $FF: renamed from: e () double
   public double method_1535() {
      return this.field_1426;
   }

   // $FF: renamed from: f () double
   public double method_1536() {
      return this.field_1427;
   }

   // $FF: renamed from: g () double
   public double method_1537() {
      return this.field_1428;
   }

   // $FF: renamed from: h () float
   public float method_1538() {
      return this.field_1429;
   }

   // $FF: renamed from: i () float
   public float method_1539() {
      return this.field_1430;
   }

   // $FF: renamed from: j () boolean
   public boolean method_1540() {
      return this.field_1431;
   }

   // $FF: renamed from: k () boolean
   public boolean method_1541() {
      return this.field_1432;
   }

   // $FF: renamed from: l () boolean
   public boolean method_1542() {
      return this.field_1433;
   }

   // $FF: renamed from: b (boolean) void
   public void method_1543(boolean var1) {
      this.field_1432 = var1;
   }
}
