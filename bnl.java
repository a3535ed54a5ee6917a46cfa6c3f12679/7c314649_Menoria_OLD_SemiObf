import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bnl extends class_827 {

   // $FF: renamed from: f bqx
   private static final bqx field_3938;
   // $FF: renamed from: g bqx
   private static final bqx field_3939;
   // $FF: renamed from: h bqx
   private static final bqx field_3940;
   // $FF: renamed from: k bqx
   private static final bqx field_3941;
   // $FF: renamed from: a nn
   protected class_1210 field_3942;
   private static final String __OBFID;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1210 var10001 = new class_1210;
      var10001.method_6519(0.0F);
      super.method_4798(var10001, 0.5F);
      this.field_3942 = (class_1210)this.field_3844;
      this.method_4799(this.field_3844);
   }

   // $FF: renamed from: a (xa, float, float, float) void
   protected void method_4933(class_758 var1, float var2, float var3, float var4) {
      float var6 = (float)var1.method_4317(7, var4)[0];
      float var7 = (float)(var1.method_4317(5, var4)[1] - var1.method_4317(10, var4)[1]);
      String[] var10000 = class_752.method_4253();
      GL11.glRotatef(-var6, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var7 * 10.0F, 1.0F, 0.0F, 0.0F);
      String[] var5 = var10000;
      GL11.glTranslatef(0.0F, 0.0F, 1.0F);
      int var9 = var1.field_3318;
      if(var5 != null) {
         if(var1.field_3318 <= 0) {
            return;
         }

         var9 = var1.field_3318;
      }

      float var8 = ((float)var9 + var4 - 1.0F) / 20.0F * 1.6F;
      var8 = class_1715.method_9557(var8);
      float var10 = var8;
      float var10001 = 1.0F;
      if(var5 != null) {
         if(var8 > 1.0F) {
            var8 = 1.0F;
         }

         var10 = var8 * this.method_4812(var1);
         var10001 = 0.0F;
      }

      GL11.glRotatef(var10, var10001, 0.0F, 1.0F);
   }

   // $FF: renamed from: a (xa, float, float, float, float, float, float) void
   protected void method_4934(class_758 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String[] var8 = class_752.method_4253();
      int var10000 = var1.field_3416;
      if(var8 != null) {
         if(var1.field_3416 > 0) {
            float var9 = (float)var1.field_3416 / 200.0F;
            GL11.glDepthFunc(515);
            GL11.glEnable(3008);
            GL11.glAlphaFunc(516, var9);
            this.method_4732(field_3938);
            this.field_3844.method_6511(var1, var2, var3, var4, var5, var6, var7);
            GL11.glAlphaFunc(516, 0.1F);
            GL11.glDepthFunc(514);
         }

         this.method_4731(var1);
         this.field_3844.method_6511(var1, var2, var3, var4, var5, var6, var7);
         var10000 = var1.field_3315;
      }

      if(var8 != null) {
         if(var10000 <= 0) {
            return;
         }

         GL11.glDepthFunc(514);
         GL11.glDisable(3553);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.5F);
         this.field_3844.method_6511(var1, var2, var3, var4, var5, var6, var7);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         var10000 = 515;
      }

      GL11.glDepthFunc(var10000);
   }

   // $FF: renamed from: a (xa, double, double, double, float, float) void
   public void method_4935(class_758 var1, double var2, double var4, double var6, float var8, float var9) {
      GuiTextField9.method_7631(var1, false);
      String[] var10000 = class_752.method_4253();
      super.method_4830(var1, var2, var4, var6, var8, var9);
      String[] var10 = var10000;
      class_705 var26 = var1.field_3417;
      if(var10 != null) {
         if(var1.field_3417 == null) {
            return;
         }

         var26 = var1.field_3417;
      }

      float var11 = (float)var26.field_3155 + var9;
      float var12 = class_1715.method_9555(var11 * 0.2F) / 2.0F + 0.5F;
      var12 = (var12 * var12 + var12) * 0.2F;
      float var13 = (float)(var1.field_3417.field_2994 - var1.field_2994 - (var1.field_2991 - var1.field_2994) * (double)(1.0F - var9));
      float var14 = (float)((double)var12 + var1.field_3417.field_2995 - 1.0D - var1.field_2995 - (var1.field_2992 - var1.field_2995) * (double)(1.0F - var9));
      float var15 = (float)(var1.field_3417.field_2996 - var1.field_2996 - (var1.field_2993 - var1.field_2996) * (double)(1.0F - var9));
      float var16 = class_1715.method_9557(var13 * var13 + var15 * var15);
      float var17 = class_1715.method_9557(var13 * var13 + var14 * var14 + var15 * var15);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4 + 2.0F, (float)var6);
      GL11.glRotatef((float)(-Math.atan2((double)var15, (double)var13)) * 180.0F / 3.1415927F - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef((float)(-Math.atan2((double)var16, (double)var14)) * 180.0F / 3.1415927F - 90.0F, 1.0F, 0.0F, 0.0F);
      bmh var18 = bmh.instance;
      bam.method_5212();
      GL11.glDisable(2884);
      this.method_4732(field_3939);
      GL11.glShadeModel(7425);
      float var19 = 0.0F - ((float)var1.field_3029 + var9) * 0.01F;
      float var20 = class_1715.method_9557(var13 * var13 + var14 * var14 + var15 * var15) / 32.0F - ((float)var1.field_3029 + var9) * 0.01F;
      var18.setVisible3(5);
      byte var21 = 8;
      int var22 = 0;

      while(true) {
         if(var22 <= var21) {
            float var23 = class_1715.method_9555((float)(var22 % var21) * 3.1415927F * 2.0F / (float)var21) * 0.75F;
            float var24 = class_1715.method_9556((float)(var22 % var21) * 3.1415927F * 2.0F / (float)var21) * 0.75F;
            float var25 = (float)(var22 % var21) * 1.0F / (float)var21;
            var18.method_7463(0);
            var18.addVertexWithUV((double)(var23 * 0.2F), (double)(var24 * 0.2F), 0.0D, (double)var25, (double)var20);
            var18.method_7463(16777215);
            var18.addVertexWithUV((double)var23, (double)var24, (double)var17, (double)var25, (double)var19);
            ++var22;
            if(var10 == null) {
               break;
            }

            if(var10 != null) {
               continue;
            }
         }

         var18.getVisible8();
         GL11.glEnable(2884);
         GL11.glShadeModel(7424);
         bam.method_5213();
         break;
      }

      GL11.glPopMatrix();
   }

   // $FF: renamed from: a (xa) bqx
   protected bqx method_4936(class_758 var1) {
      return field_3941;
   }

   // $FF: renamed from: a (xa, float) void
   protected void method_4937(class_758 var1, float var2) {
      String[] var10000 = class_752.method_4253();
      super.method_4807(var1, var2);
      String[] var3 = var10000;
      bmh var4 = bmh.instance;
      int var11 = var1.field_3416;
      if(var3 != null) {
         if(var1.field_3416 <= 0) {
            return;
         }

         bam.method_5212();
         var11 = var1.field_3416;
      }

      float var5;
      float var6;
      label31: {
         var5 = ((float)var11 + var2) / 200.0F;
         var6 = 0.0F;
         float var12 = var5;
         float var10001 = 0.8F;
         if(var3 != null) {
            if(var5 <= 0.8F) {
               break label31;
            }

            var12 = var5 - 0.8F;
            var10001 = 0.2F;
         }

         var6 = var12 / var10001;
      }

      Random var7 = new Random(432L);
      GL11.glDisable(3553);
      GL11.glShadeModel(7425);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 1);
      GL11.glDisable(3008);
      GL11.glEnable(2884);
      GL11.glDepthMask(false);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, -1.0F, -2.0F);
      int var8 = 0;

      while(true) {
         if((float)var8 < (var5 + var5 * var5) / 2.0F * 60.0F) {
            GL11.glRotatef(var7.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var7.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var7.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(var7.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var7.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var7.nextFloat() * 360.0F + var5 * 90.0F, 0.0F, 0.0F, 1.0F);
            var4.setVisible3(6);
            float var9 = var7.nextFloat() * 20.0F + 5.0F + var6 * 10.0F;
            float var10 = var7.nextFloat() * 2.0F + 1.0F + var6 * 2.0F;
            var4.method_7464(16777215, (int)(255.0F * (1.0F - var6)));
            var4.method_7462(0.0D, 0.0D, 0.0D);
            var4.method_7464(16711935, 0);
            var4.method_7462(-0.866D * (double)var10, (double)var9, (double)(-0.5F * var10));
            var4.method_7462(0.866D * (double)var10, (double)var9, (double)(-0.5F * var10));
            var4.method_7462(0.0D, (double)var9, (double)(1.0F * var10));
            var4.method_7462(-0.866D * (double)var10, (double)var9, (double)(-0.5F * var10));
            var4.getVisible8();
            ++var8;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         GL11.glPopMatrix();
         GL11.glDepthMask(true);
         GL11.glDisable(2884);
         GL11.glDisable(3042);
         GL11.glShadeModel(7424);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(3553);
         GL11.glEnable(3008);
         break;
      }

      bam.method_5213();
   }

   // $FF: renamed from: a (xa, int, float) int
   protected int method_4938(class_758 var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var2;
      if(var4 != null) {
         if(var2 == 1) {
            GL11.glDepthFunc(515);
         }

         var10000 = var2;
      }

      if(var4 != null) {
         if(var10000 != 0) {
            return -1;
         }

         this.method_4732(field_3940);
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         GL11.glDisable(2896);
         GL11.glDepthFunc(514);
         var10000 = '\uf0f0';
      }

      int var5 = var10000;
      int var6 = var5 % 65536;
      int var7 = var5 / 65536;
      buu.method_9080(buu.field_8557, (float)var6 / 1.0F, (float)var7 / 1.0F);
      GL11.glEnable(2896);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      return 1;
   }

   // $FF: renamed from: a (sw, double, double, double, float, float) void
   public void method_4830(class_753 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4935((class_758)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sv, int, float) int
   protected int method_4810(class_752 var1, int var2, float var3) {
      return this.method_4938((class_758)var1, var2, var3);
   }

   // $FF: renamed from: c (sv, float) void
   protected void method_4807(class_752 var1, float var2) {
      this.method_4937((class_758)var1, var2);
   }

   // $FF: renamed from: a (sv, float, float, float) void
   protected void method_4804(class_752 var1, float var2, float var3, float var4) {
      this.method_4933((class_758)var1, var2, var3, var4);
   }

   // $FF: renamed from: a (sv, float, float, float, float, float, float) void
   protected void method_4802(class_752 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_4934((class_758)var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4935((class_758)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4936((class_758)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4935((class_758)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      // $FF: Couldn't be decompiled
   }
}
