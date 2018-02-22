package net.minecraft.realms;


public class Tezzelator {

   // $FF: renamed from: t bmh
   public static bmh field_2629;
   public static final Tezzelator instance;


   // $FF: renamed from: <init> () void
   public void method_3321() {
      super();
   }

   public int end() {
      return field_2629.getVisible8();
   }

   public void vertex(double var1, double var3, double var5) {
      field_2629.method_7462(var1, var3, var5);
   }

   public void color(float var1, float var2, float var3, float var4) {
      field_2629.setVisible7(var1, var2, var3, var4);
   }

   public void color(int var1, int var2, int var3) {
      field_2629.setVisible8(var1, var2, var3);
   }

   public void tex2(int var1) {
      field_2629.setVisible5(var1);
   }

   public void normal(float var1, float var2, float var3) {
      field_2629.method_7466(var1, var2, var3);
   }

   public void noColor() {
      field_2629.method_7465();
   }

   public void color(int var1) {
      field_2629.method_7463(var1);
   }

   public void color(float var1, float var2, float var3) {
      field_2629.setVisible6(var1, var2, var3);
   }

   public bmi sortQuads(float var1, float var2, float var3) {
      return field_2629.getVisible9(var1, var2, var3);
   }

   public void restoreState(bmi var1) {
      field_2629.setVisible0(var1);
   }

   public void begin(int var1) {
      field_2629.setVisible3(var1);
   }

   public void begin() {
      field_2629.setVisible2();
   }

   public void vertexUV(double var1, double var3, double var5, double var7, double var9) {
      field_2629.addVertexWithUV(var1, var3, var5, var7, var9);
   }

   public void color(int var1, int var2) {
      field_2629.method_7464(var1, var2);
   }

   public void offset(double var1, double var3, double var5) {
      field_2629.method_7467(var1, var3, var5);
   }

   public void color(int var1, int var2, int var3, int var4) {
      field_2629.setVisible9(var1, var2, var3, var4);
   }

   public void addOffset(float var1, float var2, float var3) {
      field_2629.method_7468(var1, var2, var3);
   }

   public void tex(double var1, double var3) {
      field_2629.setVisible4(var1, var3);
   }

   public void color(byte var1, byte var2, byte var3) {
      field_2629.method_7460(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3322() {
      field_2629 = bmh.instance;
      Tezzelator var10000 = new Tezzelator;
      var10000.method_3321();
      instance = var10000;
   }
}
