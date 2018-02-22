import org.lwjgl.opengl.GL11;

// $FF: renamed from: oj
public class class_815 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3816;
   // $FF: renamed from: h java.lang.String
   private static final String field_3817;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      this.field_3790 = 0.15F;
      this.field_3791 = 0.75F;
   }

   // $FF: renamed from: b (wC, double, double, double, float, float) void
   public void method_4770(class_715 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.method_4731(var1);
      int var10 = var1.method_4089();
      float var11 = (float)(var10 % 4 * 16 + 0) / 64.0F;
      float var12 = (float)(var10 % 4 * 16 + 16) / 64.0F;
      float var13 = (float)(var10 / 4 * 16 + 0) / 64.0F;
      float var14 = (float)(var10 / 4 * 16 + 16) / 64.0F;
      float var15 = 1.0F;
      float var16 = 0.5F;
      float var17 = 0.25F;
      int var18 = var1.method_3883(var9);
      int var19 = var18 % 65536;
      int var20 = var18 / 65536;
      buu.method_9080(buu.field_8557, (float)var19 / 1.0F, (float)var20 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var21 = 255.0F;
      float var22 = ((float)var1.field_3205 + var9) / 2.0F;
      var20 = (int)((class_1715.method_9555(var22 + 0.0F) + 1.0F) * 0.5F * var21);
      int var23 = (int)var21;
      int var24 = (int)((class_1715.method_9555(var22 + 4.1887903F) + 1.0F) * 0.1F * var21);
      int var25 = var20 << 16 | var23 << 8 | var24;
      GL11.glRotatef(180.0F - this.field_3788.field_7428, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.field_3788.field_7429, 1.0F, 0.0F, 0.0F);
      float var26 = 0.3F;
      GL11.glScalef(var26, var26, var26);
      bmh var27 = bmh.instance;
      var27.setVisible2();
      var27.method_7464(var25, 128);
      var27.method_7466(0.0F, 1.0F, 0.0F);
      var27.addVertexWithUV((double)(0.0F - var16), (double)(0.0F - var17), 0.0D, (double)var11, (double)var14);
      var27.addVertexWithUV((double)(var15 - var16), (double)(0.0F - var17), 0.0D, (double)var12, (double)var14);
      var27.addVertexWithUV((double)(var15 - var16), (double)(1.0F - var17), 0.0D, (double)var12, (double)var13);
      var27.addVertexWithUV((double)(0.0F - var16), (double)(1.0F - var17), 0.0D, (double)var11, (double)var13);
      var27.getVisible8();
      GL11.glDisable(3042);
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (wC) bqx
   protected bqx method_4771(class_715 var1) {
      return field_3816;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4771((class_715)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4770((class_715)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "Ý3ÞÛ°+ÚyÃÁ«:ÐyÃ×§<À3ÈÌ!Û4ß¥êùFò~o";
      int var5 = "Ý3ÞÛ°+ÚyÃÁ«:ÐyÃ×§<À3ÈÌ!Û4ß¥êùFò~o".length();
      char var2 = 34;
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
                  field_3817 = "CL_00000993";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/experience_orb.png");
                  field_3816 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 204;
               break;
            case 1:
               var10009 = 51;
               break;
            case 2:
               var10009 = 195;
               break;
            case 3:
               var10009 = 202;
               break;
            case 4:
               var10009 = 19;
               break;
            case 5:
               var10009 = 167;
               break;
            default:
               var10009 = 43;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
