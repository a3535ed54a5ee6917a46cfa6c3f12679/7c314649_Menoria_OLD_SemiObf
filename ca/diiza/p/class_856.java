package ca.diiza.p;

import ca.diiza.e.class_806;
import ca.diiza.p.class_854;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.p.a
public class class_856 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3950;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
   }

   // $FF: renamed from: a (ca.diiza.e.a, double, double, double, float, float) void
   public void method_4949(class_806 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4731(var1);
      String[] var10000 = class_854.method_4946();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(var1.field_3002 + (var1.field_3000 - var1.field_3002) * var9 - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var1.field_3003 + (var1.field_3001 - var1.field_3003) * var9, 0.0F, 0.0F, 1.0F);
      bmh var11 = bmh.instance;
      String[] var10 = var10000;
      byte var12 = 0;
      float var13 = 0.0F;
      float var14 = 0.5F;
      float var15 = (float)(0 + var12 * 10) / 32.0F;
      float var16 = (float)(5 + var12 * 10) / 32.0F;
      float var17 = 0.0F;
      float var18 = 0.15625F;
      float var19 = (float)(5 + var12 * 10) / 32.0F;
      float var20 = (float)(10 + var12 * 10) / 32.0F;
      float var21 = 0.05625F;
      GL11.glEnable('\u803a');
      float var22 = (float)var1.field_3778 - var9;
      float var26;
      int var25 = (var26 = var22 - 0.0F) == 0.0F?0:(var26 < 0.0F?-1:1);
      if(var10 == null) {
         if(var25 > 0) {
            float var23 = -class_1715.method_9555(var22 * 3.0F) * var22;
            GL11.glRotatef(var23, 0.0F, 0.0F, 1.0F);
         }

         GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(var21, var21, var21);
         GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
         GL11.glNormal3f(var21, 0.0F, 0.0F);
         var11.setVisible2();
         var11.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)var17, (double)var19);
         var11.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)var18, (double)var19);
         var11.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)var18, (double)var20);
         var11.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)var17, (double)var20);
         var11.getVisible8();
         GL11.glNormal3f(-var21, 0.0F, 0.0F);
         var11.setVisible2();
         var11.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)var17, (double)var19);
         var11.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)var18, (double)var19);
         var11.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)var18, (double)var20);
         var11.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)var17, (double)var20);
         var11.getVisible8();
         var25 = 0;
      }

      int var24 = var25;

      while(true) {
         if(var24 < 4) {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glNormal3f(0.0F, 0.0F, var21);
            var11.setVisible2();
            var11.addVertexWithUV(-8.0D, -2.0D, 0.0D, (double)var13, (double)var15);
            var11.addVertexWithUV(8.0D, -2.0D, 0.0D, (double)var14, (double)var15);
            var11.addVertexWithUV(8.0D, 2.0D, 0.0D, (double)var14, (double)var16);
            var11.addVertexWithUV(-8.0D, 2.0D, 0.0D, (double)var13, (double)var16);
            var11.getVisible8();
            ++var24;
            if(var10 != null) {
               break;
            }

            if(var10 == null) {
               continue;
            }
         }

         GL11.glDisable('\u803a');
         GL11.glPopMatrix();
         break;
      }

   }

   // $FF: renamed from: a (ca.diiza.e.a) bqx
   protected bqx method_4950(class_806 var1) {
      return field_3950;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4950((class_806)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4949((class_806)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "âÓkäðRåSÎqåëCïSÍvãçh÷Ùpæ¬Gø".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var5)).intern();
            bqx var3 = new bqx;
            var3.method_8227(var0);
            field_3950 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 95;
            break;
         case 1:
            var10009 = 181;
            break;
         case 2:
            var10009 = 98;
            break;
         case 3:
            var10009 = 214;
            break;
         case 4:
            var10009 = 88;
            break;
         case 5:
            var10009 = 75;
            break;
         default:
            var10009 = 254;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
