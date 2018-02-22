package ca.diiza.p;

import ca.diiza.e.class_805;
import ca.diiza.p.class_854;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.p.b
public class class_855 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3949;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
   }

   // $FF: renamed from: a (ca.diiza.e.b, double, double, double, float, float) void
   public void method_4947(class_805 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4731(var1);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(var1.field_3002 + (var1.field_3000 - var1.field_3002) * var9 - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var1.field_3003 + (var1.field_3001 - var1.field_3003) * var9, 0.0F, 0.0F, 1.0F);
      bmh var12 = bmh.instance;
      byte var13 = 0;
      float var14 = 0.0F;
      String[] var10000 = class_854.method_4946();
      float var15 = 0.5F;
      float var16 = (float)(0 + var13 * 10) / 32.0F;
      float var17 = (float)(5 + var13 * 10) / 32.0F;
      String[] var10 = var10000;
      float var18 = 0.0F;
      float var19 = 0.15625F;
      float var20 = (float)(5 + var13 * 10) / 32.0F;
      float var21 = (float)(10 + var13 * 10) / 32.0F;
      float var22 = 0.05625F;
      GL11.glEnable('\u803a');
      float var23 = (float)var1.field_3762 - var9;
      float var27;
      int var26 = (var27 = var23 - 0.0F) == 0.0F?0:(var27 < 0.0F?-1:1);
      if(var10 == null) {
         if(var26 > 0) {
            float var24 = -class_1715.method_9555(var23 * 3.0F) * var23;
            GL11.glRotatef(var24, 0.0F, 0.0F, 1.0F);
         }

         GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(var22, var22, var22);
         GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
         GL11.glNormal3f(var22, 0.0F, 0.0F);
         var12.setVisible2();
         var12.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)var18, (double)var20);
         var12.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)var19, (double)var20);
         var12.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)var19, (double)var21);
         var12.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)var18, (double)var21);
         var12.getVisible8();
         GL11.glNormal3f(-var22, 0.0F, 0.0F);
         var12.setVisible2();
         var12.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)var18, (double)var20);
         var12.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)var19, (double)var20);
         var12.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)var19, (double)var21);
         var12.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)var18, (double)var21);
         var12.getVisible8();
         var26 = 0;
      }

      int var25 = var26;

      while(true) {
         if(var25 < 4) {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glNormal3f(0.0F, 0.0F, var22);
            var12.setVisible2();
            var12.addVertexWithUV(-8.0D, -2.0D, 0.0D, (double)var14, (double)var16);
            var12.addVertexWithUV(8.0D, -2.0D, 0.0D, (double)var15, (double)var16);
            var12.addVertexWithUV(8.0D, 2.0D, 0.0D, (double)var15, (double)var17);
            var12.addVertexWithUV(-8.0D, 2.0D, 0.0D, (double)var14, (double)var17);
            var12.getVisible8();
            ++var25;
            if(var10 != null) {
               break;
            }

            if(var10 == null) {
               continue;
            }

            int var11 = class_689.method_3976();
            ++var11;
            class_689.method_3975(var11);
         }

         GL11.glDisable('\u803a');
         GL11.glPopMatrix();
         break;
      }

   }

   // $FF: renamed from: a (ca.diiza.e.b) bqx
   protected bqx method_4948(class_805 var1) {
      return field_3949;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4948((class_805)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4947((class_805)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "QÇúøÙwVçâÂf\\òãØ}KýãþÄeÒìë".toCharArray();
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
            field_3949 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 151;
            break;
         case 1:
            var10009 = 16;
            break;
         case 2:
            var10009 = 48;
            break;
         case 3:
            var10009 = 62;
            break;
         case 4:
            var10009 = 95;
            break;
         case 5:
            var10009 = 25;
            break;
         default:
            var10009 = 160;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
