
// $FF: renamed from: mY
public class class_1244 extends class_1242 {

   // $FF: renamed from: v boolean
   public boolean field_6475;
   // $FF: renamed from: w boolean
   public boolean field_6476;


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.drawCenteredString1(0.0F, -14.0F, 64, 32);
      float var1 = -14.0F;
      float var2 = 0.0F;
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6461 = var10001;
      this.field_6461.method_6644(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.field_6461.method_6645(0.0F, 0.0F + var1, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 32, 16);
      this.field_6462 = var10001;
      this.field_6462.method_6644(-4.0F, 0.0F, -2.0F, 8, 12, 4, var2);
      this.field_6462.method_6645(0.0F, 0.0F + var1, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 56, 0);
      this.field_6463 = var10001;
      this.field_6463.method_6644(-1.0F, -2.0F, -1.0F, 2, 30, 2, var2);
      this.field_6463.method_6645(-3.0F, 2.0F + var1, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 56, 0);
      this.field_6464 = var10001;
      this.field_6464.field_6553 = true;
      this.field_6464.method_6644(-1.0F, -2.0F, -1.0F, 2, 30, 2, var2);
      this.field_6464.method_6645(5.0F, 2.0F + var1, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 56, 0);
      this.field_6465 = var10001;
      this.field_6465.method_6644(-1.0F, 0.0F, -1.0F, 2, 30, 2, var2);
      this.field_6465.method_6645(-2.0F, 12.0F + var1, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 56, 0);
      this.field_6466 = var10001;
      this.field_6466.field_6553 = true;
      this.field_6466.method_6644(-1.0F, 0.0F, -1.0F, 2, 30, 2, var2);
      this.field_6466.method_6645(2.0F, 12.0F + var1, 0.0F);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      super.method_6512(var1, var2, var3, var4, var5, var6, var7);
      this.field_6460.field_6554 = true;
      float var9 = -14.0F;
      String[] var10000 = class_752.method_4253();
      this.field_6462.field_6548 = 0.0F;
      this.field_6462.field_6546 = var9;
      this.field_6462.field_6547 = -0.0F;
      this.field_6465.field_6548 -= 0.0F;
      this.field_6466.field_6548 -= 0.0F;
      this.field_6463.field_6548 = (float)((double)this.field_6463.field_6548 * 0.5D);
      this.field_6464.field_6548 = (float)((double)this.field_6464.field_6548 * 0.5D);
      String[] var8 = var10000;
      this.field_6465.field_6548 = (float)((double)this.field_6465.field_6548 * 0.5D);
      this.field_6466.field_6548 = (float)((double)this.field_6466.field_6548 * 0.5D);
      float var10 = 0.4F;
      float var13;
      int var12 = (var13 = this.field_6463.field_6548 - var10) == 0.0F?0:(var13 < 0.0F?-1:1);
      if(var8 != null) {
         if(var12 > 0) {
            this.field_6463.field_6548 = var10;
         }

         float var14;
         var12 = (var14 = this.field_6464.field_6548 - var10) == 0.0F?0:(var14 < 0.0F?-1:1);
      }

      if(var8 != null) {
         if(var12 > 0) {
            this.field_6464.field_6548 = var10;
         }

         float var15;
         var12 = (var15 = this.field_6463.field_6548 - -var10) == 0.0F?0:(var15 < 0.0F?-1:1);
      }

      if(var8 != null) {
         if(var12 < 0) {
            this.field_6463.field_6548 = -var10;
         }

         float var16;
         var12 = (var16 = this.field_6464.field_6548 - -var10) == 0.0F?0:(var16 < 0.0F?-1:1);
      }

      if(var8 != null) {
         if(var12 < 0) {
            this.field_6464.field_6548 = -var10;
         }

         float var17;
         var12 = (var17 = this.field_6465.field_6548 - var10) == 0.0F?0:(var17 < 0.0F?-1:1);
      }

      if(var8 != null) {
         if(var12 > 0) {
            this.field_6465.field_6548 = var10;
         }

         float var18;
         var12 = (var18 = this.field_6466.field_6548 - var10) == 0.0F?0:(var18 < 0.0F?-1:1);
      }

      if(var8 != null) {
         if(var12 > 0) {
            this.field_6466.field_6548 = var10;
         }

         float var19;
         var12 = (var19 = this.field_6465.field_6548 - -var10) == 0.0F?0:(var19 < 0.0F?-1:1);
      }

      if(var8 != null) {
         if(var12 < 0) {
            this.field_6465.field_6548 = -var10;
         }

         float var20;
         var12 = (var20 = this.field_6466.field_6548 - -var10) == 0.0F?0:(var20 < 0.0F?-1:1);
      }

      if(var8 != null) {
         if(var12 < 0) {
            this.field_6466.field_6548 = -var10;
         }

         var12 = this.field_6475;
      }

      if(var8 != null) {
         if(var12 != 0) {
            this.field_6463.field_6548 = -0.5F;
            this.field_6464.field_6548 = -0.5F;
            this.field_6463.field_6550 = 0.05F;
            this.field_6464.field_6550 = -0.05F;
         }

         this.field_6463.field_6547 = 0.0F;
         this.field_6464.field_6547 = 0.0F;
         this.field_6465.field_6547 = 0.0F;
         this.field_6466.field_6547 = 0.0F;
         this.field_6465.field_6546 = 9.0F + var9;
         this.field_6466.field_6546 = 9.0F + var9;
         this.field_6460.field_6547 = -0.0F;
         this.field_6460.field_6546 = var9 + 1.0F;
         this.field_6461.field_6545 = this.field_6460.field_6545;
         this.field_6461.field_6546 = this.field_6460.field_6546;
         this.field_6461.field_6547 = this.field_6460.field_6547;
         this.field_6461.field_6548 = this.field_6460.field_6548;
         this.field_6461.field_6549 = this.field_6460.field_6549;
         this.field_6461.field_6550 = this.field_6460.field_6550;
         var12 = this.field_6476;
      }

      if(var12 != 0) {
         float var11 = 1.0F;
         this.field_6460.field_6546 -= var11 * 5.0F;
      }

   }
}
