
// $FF: renamed from: r2
public class class_349 extends class_250 {

   // $FF: renamed from: c double
   private double field_1775;
   // $FF: renamed from: d double
   private double field_1776;
   // $FF: renamed from: e double
   private double field_1777;
   // $FF: renamed from: f float
   private float field_1778;
   // $FF: renamed from: g float
   private float field_1779;
   // $FF: renamed from: h boolean
   private boolean field_1780;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (double, double, double, float, float, boolean) void
   public void method_2009(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      super.method_1449();
      this.field_1775 = var1;
      this.field_1776 = var3;
      this.field_1777 = var5;
      this.field_1778 = var7;
      this.field_1779 = var8;
      this.field_1780 = var9;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1775 = var1.readDouble();
      this.field_1776 = var1.readDouble();
      this.field_1777 = var1.readDouble();
      this.field_1778 = var1.readFloat();
      this.field_1779 = var1.readFloat();
      this.field_1780 = var1.readBoolean();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeDouble(this.field_1775);
      var1.writeDouble(this.field_1776);
      var1.writeDouble(this.field_1777);
      var1.writeFloat(this.field_1778);
      var1.writeFloat(this.field_1779);
      var1.writeBoolean(this.field_1780);
   }

   // $FF: renamed from: b (tF) void
   public void method_2010(class_64 var1) {
      var1.getBlock8(this);
   }

   // $FF: renamed from: a () double
   public double method_2011() {
      return this.field_1775;
   }

   // $FF: renamed from: e () double
   public double method_2012() {
      return this.field_1776;
   }

   // $FF: renamed from: f () double
   public double method_2013() {
      return this.field_1777;
   }

   // $FF: renamed from: g () float
   public float method_2014() {
      return this.field_1778;
   }

   // $FF: renamed from: h () float
   public float method_2015() {
      return this.field_1779;
   }

   // $FF: renamed from: i () boolean
   public boolean method_2016() {
      return this.field_1780;
   }
}
