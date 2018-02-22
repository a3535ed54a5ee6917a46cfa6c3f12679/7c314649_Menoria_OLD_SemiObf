import org.lwjgl.opengl.GL11;

// $FF: renamed from: oW
public class class_822 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3830;
   // $FF: renamed from: h java.lang.String
   private static final String field_3831;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
   }

   // $FF: renamed from: b (wF, double, double, double, float, float) void
   public void method_4783(class_749 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslated(var2, var4, var6);
      GL11.glRotatef(var8, 0.0F, 1.0F, 0.0F);
      GL11.glEnable('\u803a');
      this.method_4731(var1);
      class_925 var10 = var1.field_3299;
      float var11 = 0.0625F;
      GL11.glScalef(var11, var11, var11);
      this.method_4785(var1, var10.field_4702, var10.field_4703, var10.field_4704, var10.field_4705);
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (wF) bqx
   protected bqx method_4784(class_749 var1) {
      return field_3830;
   }

   // $FF: renamed from: b (wF, int, int, int, int) void
   private void method_4785(class_749 var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      float var7 = (float)(-var2) / 2.0F;
      float var8 = (float)(-var3) / 2.0F;
      float var9 = 0.5F;
      String[] var6 = var10000;
      float var10 = 0.75F;
      float var11 = 0.8125F;
      float var12 = 0.0F;
      float var13 = 0.0625F;
      float var14 = 0.75F;
      float var15 = 0.8125F;
      float var16 = 0.001953125F;
      float var17 = 0.001953125F;
      float var18 = 0.7519531F;
      float var19 = 0.7519531F;
      float var20 = 0.0F;
      float var21 = 0.0625F;
      int var22 = 0;

      while(var22 < var2 / 16) {
         int var23 = 0;

         while(true) {
            if(var23 < var3 / 16) {
               float var24 = var7 + (float)((var22 + 1) * 16);
               float var25 = var7 + (float)(var22 * 16);
               float var26 = var8 + (float)((var23 + 1) * 16);
               float var27 = var8 + (float)(var23 * 16);
               this.method_4786(var1, (var24 + var25) / 2.0F, (var26 + var27) / 2.0F);
               float var28 = (float)(var4 + var2 - var22 * 16) / 256.0F;
               float var29 = (float)(var4 + var2 - (var22 + 1) * 16) / 256.0F;
               float var30 = (float)(var5 + var3 - var23 * 16) / 256.0F;
               float var31 = (float)(var5 + var3 - (var23 + 1) * 16) / 256.0F;
               bmh var32 = bmh.instance;
               var32.setVisible2();
               var32.method_7466(0.0F, 0.0F, -1.0F);
               var32.addVertexWithUV((double)var24, (double)var27, (double)(-var9), (double)var29, (double)var30);
               var32.addVertexWithUV((double)var25, (double)var27, (double)(-var9), (double)var28, (double)var30);
               var32.addVertexWithUV((double)var25, (double)var26, (double)(-var9), (double)var28, (double)var31);
               var32.addVertexWithUV((double)var24, (double)var26, (double)(-var9), (double)var29, (double)var31);
               var32.method_7466(0.0F, 0.0F, 1.0F);
               var32.addVertexWithUV((double)var24, (double)var26, (double)var9, (double)var10, (double)var12);
               var32.addVertexWithUV((double)var25, (double)var26, (double)var9, (double)var11, (double)var12);
               var32.addVertexWithUV((double)var25, (double)var27, (double)var9, (double)var11, (double)var13);
               var32.addVertexWithUV((double)var24, (double)var27, (double)var9, (double)var10, (double)var13);
               var32.method_7466(0.0F, 1.0F, 0.0F);
               var32.addVertexWithUV((double)var24, (double)var26, (double)(-var9), (double)var14, (double)var16);
               var32.addVertexWithUV((double)var25, (double)var26, (double)(-var9), (double)var15, (double)var16);
               var32.addVertexWithUV((double)var25, (double)var26, (double)var9, (double)var15, (double)var17);
               var32.addVertexWithUV((double)var24, (double)var26, (double)var9, (double)var14, (double)var17);
               var32.method_7466(0.0F, -1.0F, 0.0F);
               var32.addVertexWithUV((double)var24, (double)var27, (double)var9, (double)var14, (double)var16);
               var32.addVertexWithUV((double)var25, (double)var27, (double)var9, (double)var15, (double)var16);
               var32.addVertexWithUV((double)var25, (double)var27, (double)(-var9), (double)var15, (double)var17);
               var32.addVertexWithUV((double)var24, (double)var27, (double)(-var9), (double)var14, (double)var17);
               var32.method_7466(-1.0F, 0.0F, 0.0F);
               var32.addVertexWithUV((double)var24, (double)var26, (double)var9, (double)var19, (double)var20);
               var32.addVertexWithUV((double)var24, (double)var27, (double)var9, (double)var19, (double)var21);
               var32.addVertexWithUV((double)var24, (double)var27, (double)(-var9), (double)var18, (double)var21);
               var32.addVertexWithUV((double)var24, (double)var26, (double)(-var9), (double)var18, (double)var20);
               var32.method_7466(1.0F, 0.0F, 0.0F);
               var32.addVertexWithUV((double)var25, (double)var26, (double)(-var9), (double)var19, (double)var20);
               var32.addVertexWithUV((double)var25, (double)var27, (double)(-var9), (double)var19, (double)var21);
               var32.addVertexWithUV((double)var25, (double)var27, (double)var9, (double)var18, (double)var21);
               var32.addVertexWithUV((double)var25, (double)var26, (double)var9, (double)var18, (double)var20);
               var32.getVisible8();
               ++var23;
               if(var6 == null) {
                  break;
               }

               if(var6 != null) {
                  continue;
               }
            }

            ++var22;
            break;
         }

         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (wF, float, float) void
   private void method_4786(class_749 var1, float var2, float var3) {
      String[] var4;
      int var5;
      int var6;
      int var7;
      int var11;
      label40: {
         var5 = class_1715.method_9561(var1.field_2994);
         String[] var10000 = class_752.method_4253();
         var6 = class_1715.method_9561(var1.field_2995 + (double)(var3 / 16.0F));
         var4 = var10000;
         var7 = class_1715.method_9561(var1.field_2996);
         var11 = var1.field_3294;
         byte var10001 = 2;
         if(var4 != null) {
            if(var1.field_3294 == 2) {
               var5 = class_1715.method_9561(var1.field_2994 + (double)(var2 / 16.0F));
            }

            var11 = var1.field_3294;
            if(var4 == null) {
               break label40;
            }

            var10001 = 1;
         }

         if(var11 == var10001) {
            var7 = class_1715.method_9561(var1.field_2996 - (double)(var2 / 16.0F));
         }

         var11 = var1.field_3294;
      }

      if(var4 != null) {
         if(var11 == 0) {
            var5 = class_1715.method_9561(var1.field_2994 - (double)(var2 / 16.0F));
         }

         var11 = var1.field_3294;
      }

      if(var4 != null) {
         if(var11 == 3) {
            var7 = class_1715.method_9561(var1.field_2996 + (double)(var2 / 16.0F));
         }

         var11 = this.field_3788.field_7425.method_32(var5, var6, var7, 0);
      }

      int var8 = var11;
      int var9 = var8 % 65536;
      int var10 = var8 / 65536;
      buu.method_9080(buu.field_8557, (float)var9, (float)var10);
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4784((class_749)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4783((class_749)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "%·bu{É\"ýj`gØ8¼}.hÅ?¦sozó: srfÊ7·h^lØ%·hr{Í?¶4qnE1É9`â+9";
      int var5 = "%·bu{É\"ýj`gØ8¼}.hÅ?¦sozó: srfÊ7·h^lØ%·hr{Í?¶4qnE1É9`â+9".length();
      char var2 = 55;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  field_3831 = "CL_00001018";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/painting/paintings_kristoffer_zetterstrand.png");
                  field_3830 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 174;
               break;
            case 1:
               var10009 = 45;
               break;
            case 2:
               var10009 = 229;
               break;
            case 3:
               var10009 = 254;
               break;
            case 4:
               var10009 = 6;
               break;
            case 5:
               var10009 = 246;
               break;
            default:
               var10009 = 83;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
