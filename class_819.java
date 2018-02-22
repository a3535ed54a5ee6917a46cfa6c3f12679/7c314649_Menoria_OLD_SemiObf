import org.lwjgl.opengl.GL11;

// $FF: renamed from: of
public class class_819 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3822;
   // $FF: renamed from: h java.lang.String
   private static final String field_3823;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
   }

   // $FF: renamed from: b (xB, double, double, double, float, float) void
   public void method_4776(class_713 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4731(var1);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(var1.field_3002 + (var1.field_3000 - var1.field_3002) * var9 - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var1.field_3003 + (var1.field_3001 - var1.field_3003) * var9, 0.0F, 0.0F, 1.0F);
      bmh var11 = bmh.instance;
      byte var12 = 0;
      float var13 = 0.0F;
      float var14 = 0.5F;
      float var15 = (float)(0 + var12 * 10) / 32.0F;
      String[] var10000 = class_752.method_4253();
      float var16 = (float)(5 + var12 * 10) / 32.0F;
      float var17 = 0.0F;
      float var18 = 0.15625F;
      float var19 = (float)(5 + var12 * 10) / 32.0F;
      float var20 = (float)(10 + var12 * 10) / 32.0F;
      float var21 = 0.05625F;
      String[] var10 = var10000;
      GL11.glEnable('\u803a');
      float var22 = (float)var1.field_3193 - var9;
      float var26;
      int var25 = (var26 = var22 - 0.0F) == 0.0F?0:(var26 < 0.0F?-1:1);
      if(var10 != null) {
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
            if(var10 == null) {
               break;
            }

            if(var10 != null) {
               continue;
            }
         }

         GL11.glDisable('\u803a');
         GL11.glPopMatrix();
         break;
      }

   }

   // $FF: renamed from: b (xB) bqx
   protected bqx method_4777(class_713 var1) {
      return field_3822;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4777((class_713)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4776((class_713)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "Ü·ý¿¯mßõë1¹úËÊì{£ûÐÛæ{¿ýÖØ±$ª";
      int var5 = "Ü·ý¿¯mßõë1¹úËÊì{£ûÐÛæ{¿ýÖØ±$ª".length();
      char var2 = 11;
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
                  field_3823 = "CL_00000978";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/arrow.png");
                  field_3822 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 210;
               break;
            case 1:
               var10009 = 25;
               break;
            case 2:
               var10009 = 165;
               break;
            case 3:
               var10009 = 128;
               break;
            case 4:
               var10009 = 194;
               break;
            case 5:
               var10009 = 244;
               break;
            default:
               var10009 = 226;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
