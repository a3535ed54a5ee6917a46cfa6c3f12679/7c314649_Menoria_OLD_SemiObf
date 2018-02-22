
// $FF: renamed from: nr
public class class_1430 {

   // $FF: renamed from: a nq[]
   private class_1429[] field_7587;
   // $FF: renamed from: b np[]
   private class_1428[] field_7588;
   // $FF: renamed from: c float
   public final float field_7589;
   // $FF: renamed from: d float
   public final float field_7590;
   // $FF: renamed from: e float
   public final float field_7591;
   // $FF: renamed from: f float
   public final float field_7592;
   // $FF: renamed from: g float
   public final float field_7593;
   // $FF: renamed from: h float
   public final float field_7594;
   // $FF: renamed from: i java.lang.String
   public String field_7595;


   // $FF: renamed from: <init> (bix, int, int, float, float, float, int, int, int, float) void
   public void method_7787(bix var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      super();
      this.field_7589 = var4;
      this.field_7590 = var5;
      this.field_7591 = var6;
      this.field_7592 = var4 + (float)var7;
      this.field_7593 = var5 + (float)var8;
      this.field_7594 = var6 + (float)var9;
      this.field_7587 = new class_1429[8];
      this.field_7588 = new class_1428[6];
      float var11 = var4 + (float)var7;
      float var12 = var5 + (float)var8;
      float var13 = var6 + (float)var9;
      var4 -= var10;
      var5 -= var10;
      var6 -= var10;
      var11 += var10;
      var12 += var10;
      var13 += var10;
      if(var1.field_6553) {
         float var14 = var11;
         var11 = var4;
         var4 = var14;
      }

      class_1429 var10000 = new class_1429;
      var10000.method_7783(var4, var5, var6, 0.0F, 0.0F);
      class_1429 var23 = var10000;
      var10000 = new class_1429;
      var10000.method_7783(var11, var5, var6, 0.0F, 8.0F);
      class_1429 var15 = var10000;
      var10000 = new class_1429;
      var10000.method_7783(var11, var12, var6, 8.0F, 8.0F);
      class_1429 var16 = var10000;
      var10000 = new class_1429;
      var10000.method_7783(var4, var12, var6, 8.0F, 0.0F);
      class_1429 var17 = var10000;
      var10000 = new class_1429;
      var10000.method_7783(var4, var5, var13, 0.0F, 0.0F);
      class_1429 var18 = var10000;
      var10000 = new class_1429;
      var10000.method_7783(var11, var5, var13, 0.0F, 8.0F);
      class_1429 var19 = var10000;
      var10000 = new class_1429;
      var10000.method_7783(var11, var12, var13, 8.0F, 8.0F);
      class_1429 var20 = var10000;
      var10000 = new class_1429;
      var10000.method_7783(var4, var12, var13, 8.0F, 0.0F);
      class_1429 var21 = var10000;
      this.field_7587[0] = var23;
      this.field_7587[1] = var15;
      this.field_7587[2] = var16;
      this.field_7587[3] = var17;
      this.field_7587[4] = var18;
      this.field_7587[5] = var19;
      this.field_7587[6] = var20;
      this.field_7587[7] = var21;
      class_1428[] var24 = this.field_7588;
      class_1428 var10002 = new class_1428;
      var10002.method_7780(new class_1429[]{var19, var15, var16, var20}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var9, var3 + var9 + var8, var1.field_6541, var1.field_6542);
      var24[0] = var10002;
      var24 = this.field_7588;
      var10002 = new class_1428;
      var10002.method_7780(new class_1429[]{var23, var18, var21, var17}, var2, var3 + var9, var2 + var9, var3 + var9 + var8, var1.field_6541, var1.field_6542);
      var24[1] = var10002;
      var24 = this.field_7588;
      var10002 = new class_1428;
      var10002.method_7780(new class_1429[]{var19, var18, var23, var15}, var2 + var9, var3, var2 + var9 + var7, var3 + var9, var1.field_6541, var1.field_6542);
      var24[2] = var10002;
      var24 = this.field_7588;
      var10002 = new class_1428;
      var10002.method_7780(new class_1429[]{var16, var17, var21, var20}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var7, var3, var1.field_6541, var1.field_6542);
      var24[3] = var10002;
      var24 = this.field_7588;
      var10002 = new class_1428;
      var10002.method_7780(new class_1429[]{var15, var23, var17, var16}, var2 + var9, var3 + var9, var2 + var9 + var7, var3 + var9 + var8, var1.field_6541, var1.field_6542);
      var24[4] = var10002;
      var24 = this.field_7588;
      var10002 = new class_1428;
      var10002.method_7780(new class_1429[]{var18, var19, var20, var21}, var2 + var9 + var7 + var9, var3 + var9, var2 + var9 + var7 + var9 + var7, var3 + var9 + var8, var1.field_6541, var1.field_6542);
      var24[5] = var10002;
      if(var1.field_6553) {
         for(int var22 = 0; var22 < this.field_7588.length; ++var22) {
            this.field_7588[var22].method_7781();
         }
      }

   }

   // $FF: renamed from: b (bmh, float) void
   public void method_7788(bmh var1, float var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < this.field_7588.length) {
         this.field_7588[var4].method_7782(var1, var2);
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.lang.String) nr
   public class_1430 method_7789(String var1) {
      this.field_7595 = var1;
      return this;
   }
}
