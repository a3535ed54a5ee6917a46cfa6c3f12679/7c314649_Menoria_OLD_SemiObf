import org.lwjgl.opengl.GL11;

// $FF: renamed from: mX
public class class_1242 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6460;
   // $FF: renamed from: c bix
   public bix field_6461;
   // $FF: renamed from: d bix
   public bix field_6462;
   // $FF: renamed from: e bix
   public bix field_6463;
   // $FF: renamed from: f bix
   public bix field_6464;
   // $FF: renamed from: g bix
   public bix field_6465;
   // $FF: renamed from: h bix
   public bix field_6466;
   // $FF: renamed from: i bix
   public bix field_6467;
   // $FF: renamed from: j bix
   public bix field_6468;
   // $FF: renamed from: k int
   public int field_6469;
   // $FF: renamed from: l int
   public int field_6470;
   // $FF: renamed from: m boolean
   public boolean field_6471;
   // $FF: renamed from: n boolean
   public boolean field_6472;
   // $FF: renamed from: o java.lang.String
   private static final String field_6473 = "CL_00000840";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      this.drawCenteredString0(0.0F);
   }

   // $FF: renamed from: <init> (float) void
   public void drawCenteredString0(float var1) {
      this.drawCenteredString1(var1, 0.0F, 64, 32);
   }

   // $FF: renamed from: <init> (float, float, int, int) void
   public void drawCenteredString1(float var1, float var2, int var3, int var4) {
      super.method_6510();
      this.field_6264 = var3;
      this.field_6265 = var4;
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6468 = var10001;
      this.field_6468.method_6644(-5.0F, 0.0F, -1.0F, 10, 16, 1, var1);
      var10001 = new bix;
      var10001.method_6639(this, 24, 0);
      this.field_6467 = var10001;
      this.field_6467.method_6644(-3.0F, -6.0F, -1.0F, 6, 6, 1, var1);
      var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6460 = var10001;
      this.field_6460.method_6644(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.field_6460.method_6645(0.0F, 0.0F + var2, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 32, 0);
      this.field_6461 = var10001;
      this.field_6461.method_6644(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.field_6461.method_6645(0.0F, 0.0F + var2, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 16, 16);
      this.field_6462 = var10001;
      this.field_6462.method_6644(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.field_6462.method_6645(0.0F, 0.0F + var2, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 40, 16);
      this.field_6463 = var10001;
      this.field_6463.method_6644(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.field_6463.method_6645(-5.0F, 2.0F + var2, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 40, 16);
      this.field_6464 = var10001;
      this.field_6464.field_6553 = true;
      this.field_6464.method_6644(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.field_6464.method_6645(5.0F, 2.0F + var2, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6465 = var10001;
      this.field_6465.method_6644(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.field_6465.method_6645(-1.9F, 12.0F + var2, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6466 = var10001;
      this.field_6466.field_6553 = true;
      this.field_6466.method_6644(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.field_6466.method_6645(1.9F, 12.0F + var2, 0.0F);
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      String[] var8 = class_752.method_4253();
      class_1242 var10000 = this;
      if(var8 != null) {
         if(this.field_6262) {
            float var9 = 2.0F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / var9, 1.5F / var9, 1.5F / var9);
            GL11.glTranslatef(0.0F, 16.0F * var7, 0.0F);
            this.field_6460.method_6646(var7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var9, 1.0F / var9, 1.0F / var9);
            GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
            this.field_6462.method_6646(var7);
            this.field_6463.method_6646(var7);
            this.field_6464.method_6646(var7);
            this.field_6465.method_6646(var7);
            this.field_6466.method_6646(var7);
            this.field_6461.method_6646(var7);
            GL11.glPopMatrix();
            if(var8 != null) {
               return;
            }
         }

         this.field_6460.method_6646(var7);
         this.field_6462.method_6646(var7);
         this.field_6463.method_6646(var7);
         this.field_6464.method_6646(var7);
         this.field_6465.method_6646(var7);
         this.field_6466.method_6646(var7);
         var10000 = this;
      }

      var10000.field_6461.method_6646(var7);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      this.field_6460.field_6549 = var4 / 57.295776F;
      this.field_6460.field_6548 = var5 / 57.295776F;
      this.field_6461.field_6549 = this.field_6460.field_6549;
      String[] var10000 = class_752.method_4253();
      this.field_6461.field_6548 = this.field_6460.field_6548;
      this.field_6463.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 2.0F * var2 * 0.5F;
      this.field_6464.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
      this.field_6463.field_6550 = 0.0F;
      this.field_6464.field_6550 = 0.0F;
      String[] var8 = var10000;
      this.field_6465.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 1.4F * var2;
      this.field_6466.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_6465.field_6549 = 0.0F;
      this.field_6466.field_6549 = 0.0F;
      int var12 = this.field_6260;
      if(var8 != null) {
         if(this.field_6260) {
            this.field_6463.field_6548 += -0.62831855F;
            this.field_6464.field_6548 += -0.62831855F;
            this.field_6465.field_6548 = -1.2566371F;
            this.field_6466.field_6548 = -1.2566371F;
            this.field_6465.field_6549 = 0.31415927F;
            this.field_6466.field_6549 = -0.31415927F;
         }

         var12 = this.field_6469;
      }

      if(var8 != null) {
         if(var12 != 0) {
            this.field_6464.field_6548 = this.field_6464.field_6548 * 0.5F - 0.31415927F * (float)this.field_6469;
         }

         var12 = this.field_6470;
      }

      if(var8 != null) {
         if(var12 != 0) {
            this.field_6463.field_6548 = this.field_6463.field_6548 * 0.5F - 0.31415927F * (float)this.field_6470;
         }

         this.field_6463.field_6549 = 0.0F;
         this.field_6464.field_6549 = 0.0F;
         float var14;
         var12 = (var14 = this.field_6259 - -9990.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
      }

      float var9;
      float var10;
      label49: {
         class_1242 var13;
         label56: {
            if(var8 != null) {
               if(var12 > 0) {
                  var9 = this.field_6259;
                  this.field_6462.field_6549 = class_1715.method_9555(class_1715.method_9557(var9) * 3.1415927F * 2.0F) * 0.2F;
                  this.field_6463.field_6547 = class_1715.method_9555(this.field_6462.field_6549) * 5.0F;
                  this.field_6463.field_6545 = -class_1715.method_9556(this.field_6462.field_6549) * 5.0F;
                  this.field_6464.field_6547 = -class_1715.method_9555(this.field_6462.field_6549) * 5.0F;
                  this.field_6464.field_6545 = class_1715.method_9556(this.field_6462.field_6549) * 5.0F;
                  this.field_6463.field_6549 += this.field_6462.field_6549;
                  this.field_6464.field_6549 += this.field_6462.field_6549;
                  this.field_6464.field_6548 += this.field_6462.field_6549;
                  var9 = 1.0F - this.field_6259;
                  var9 *= var9;
                  var9 *= var9;
                  var9 = 1.0F - var9;
                  var10 = class_1715.method_9555(var9 * 3.1415927F);
                  float var11 = class_1715.method_9555(this.field_6259 * 3.1415927F) * -(this.field_6460.field_6548 - 0.7F) * 0.75F;
                  this.field_6463.field_6548 = (float)((double)this.field_6463.field_6548 - ((double)var10 * 1.2D + (double)var11));
                  this.field_6463.field_6549 += this.field_6462.field_6549 * 2.0F;
                  this.field_6463.field_6550 = class_1715.method_9555(this.field_6259 * 3.1415927F) * -0.4F;
               }

               var13 = this;
               if(var8 == null) {
                  break label56;
               }

               var12 = this.field_6471;
            }

            if(var12 != 0) {
               this.field_6462.field_6548 = 0.5F;
               this.field_6463.field_6548 += 0.4F;
               this.field_6464.field_6548 += 0.4F;
               this.field_6465.field_6547 = 4.0F;
               this.field_6466.field_6547 = 4.0F;
               this.field_6465.field_6546 = 9.0F;
               this.field_6466.field_6546 = 9.0F;
               this.field_6460.field_6546 = 1.0F;
               this.field_6461.field_6546 = 1.0F;
               if(var8 != null) {
                  break label49;
               }
            }

            this.field_6462.field_6548 = 0.0F;
            this.field_6465.field_6547 = 0.1F;
            this.field_6466.field_6547 = 0.1F;
            this.field_6465.field_6546 = 12.0F;
            this.field_6466.field_6546 = 12.0F;
            this.field_6460.field_6546 = 0.0F;
            var13 = this;
         }

         var13.field_6461.field_6546 = 0.0F;
      }

      this.field_6463.field_6550 += class_1715.method_9556(var3 * 0.09F) * 0.05F + 0.05F;
      this.field_6464.field_6550 -= class_1715.method_9556(var3 * 0.09F) * 0.05F + 0.05F;
      this.field_6463.field_6548 += class_1715.method_9555(var3 * 0.067F) * 0.05F;
      this.field_6464.field_6548 -= class_1715.method_9555(var3 * 0.067F) * 0.05F;
      if(this.field_6472) {
         var9 = 0.0F;
         var10 = 0.0F;
         this.field_6463.field_6550 = 0.0F;
         this.field_6464.field_6550 = 0.0F;
         this.field_6463.field_6549 = -(0.1F - var9 * 0.6F) + this.field_6460.field_6549;
         this.field_6464.field_6549 = 0.1F - var9 * 0.6F + this.field_6460.field_6549 + 0.4F;
         this.field_6463.field_6548 = -1.5707964F + this.field_6460.field_6548;
         this.field_6464.field_6548 = -1.5707964F + this.field_6460.field_6548;
         this.field_6463.field_6548 -= var9 * 1.2F - var10 * 0.4F;
         this.field_6464.field_6548 -= var9 * 1.2F - var10 * 0.4F;
         this.field_6463.field_6550 += class_1715.method_9556(var3 * 0.09F) * 0.05F + 0.05F;
         this.field_6464.field_6550 -= class_1715.method_9556(var3 * 0.09F) * 0.05F + 0.05F;
         this.field_6463.field_6548 += class_1715.method_9555(var3 * 0.067F) * 0.05F;
         this.field_6464.field_6548 -= class_1715.method_9555(var3 * 0.067F) * 0.05F;
      }

   }

   // $FF: renamed from: a (float) void
   public void drawCenteredString2(float var1) {
      this.field_6467.field_6549 = this.field_6460.field_6549;
      this.field_6467.field_6548 = this.field_6460.field_6548;
      this.field_6467.field_6545 = 0.0F;
      this.field_6467.field_6546 = 0.0F;
      this.field_6467.method_6646(var1);
   }

   // $FF: renamed from: b (float) void
   public void drawCenteredString3(float var1) {
      this.field_6468.method_6646(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void drawCenteredString4() {
      boolean var10000 = true;
      char[] var10003 = "&ÐqéóéM".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6473 = (new String((char[])var4)).intern();
            String var2 = field_6473;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 169;
            break;
         case 1:
            var10009 = 187;
            break;
         case 2:
            var10009 = 19;
            break;
         case 3:
            var10009 = 202;
            break;
         case 4:
            var10009 = 138;
            break;
         case 5:
            var10009 = 43;
            break;
         default:
            var10009 = 179;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
