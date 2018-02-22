
// $FF: renamed from: sA
public class class_330 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1668;
   // $FF: renamed from: d float
   private float field_1669;
   // $FF: renamed from: e float
   private float field_1670;
   // $FF: renamed from: f float
   private float field_1671;
   // $FF: renamed from: g float
   private float field_1672;
   // $FF: renamed from: h float
   private float field_1673;
   // $FF: renamed from: i float
   private float field_1674;
   // $FF: renamed from: j float
   private float field_1675;
   // $FF: renamed from: k int
   private int field_1676;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.lang.String, float, float, float, float, float, float, float, int) void
   public void method_1871(String var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      super.method_1449();
      this.field_1668 = var1;
      this.field_1669 = var2;
      this.field_1670 = var3;
      this.field_1671 = var4;
      this.field_1672 = var5;
      this.field_1673 = var6;
      this.field_1674 = var7;
      this.field_1675 = var8;
      this.field_1676 = var9;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1668 = var1.method_524(64);
      this.field_1669 = var1.readFloat();
      this.field_1670 = var1.readFloat();
      this.field_1671 = var1.readFloat();
      this.field_1672 = var1.readFloat();
      this.field_1673 = var1.readFloat();
      this.field_1674 = var1.readFloat();
      this.field_1675 = var1.readFloat();
      this.field_1676 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(this.field_1668);
      var1.writeFloat(this.field_1669);
      var1.writeFloat(this.field_1670);
      var1.writeFloat(this.field_1671);
      var1.writeFloat(this.field_1672);
      var1.writeFloat(this.field_1673);
      var1.writeFloat(this.field_1674);
      var1.writeFloat(this.field_1675);
      var1.writeInt(this.field_1676);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1872() {
      return this.field_1668;
   }

   // $FF: renamed from: e () double
   public double method_1873() {
      return (double)this.field_1669;
   }

   // $FF: renamed from: f () double
   public double method_1874() {
      return (double)this.field_1670;
   }

   // $FF: renamed from: g () double
   public double method_1875() {
      return (double)this.field_1671;
   }

   // $FF: renamed from: h () float
   public float method_1876() {
      return this.field_1672;
   }

   // $FF: renamed from: i () float
   public float method_1877() {
      return this.field_1673;
   }

   // $FF: renamed from: j () float
   public float method_1878() {
      return this.field_1674;
   }

   // $FF: renamed from: k () float
   public float method_1879() {
      return this.field_1675;
   }

   // $FF: renamed from: l () int
   public int method_1880() {
      return this.field_1676;
   }

   // $FF: renamed from: b (tF) void
   public void method_1881(class_64 var1) {
      var1.getBlock9(this);
   }
}
