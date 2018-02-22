import org.lwjgl.opengl.GL11;

// $FF: renamed from: og
public class class_818 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3820;
   // $FF: renamed from: h bhr
   protected bhr field_3821;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      this.field_3790 = 0.5F;
      class_1229 var10001 = new class_1229;
      var10001.method_6510();
      this.field_3821 = var10001;
   }

   // $FF: renamed from: b (xo, double, double, double, float, float) void
   public void method_4774(class_701 var1, double var2, double var4, double var6, float var8, float var9) {
      float var15;
      label23: {
         GL11.glPushMatrix();
         String[] var10000 = class_752.method_4253();
         GL11.glTranslatef((float)var2, (float)var4, (float)var6);
         GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
         String[] var10 = var10000;
         float var11 = (float)var1.method_4047() - var9;
         float var12 = var1.method_4045() - var9;
         float var16;
         int var14 = (var16 = var12 - 0.0F) == 0.0F?0:(var16 < 0.0F?-1:1);
         if(var10 != null) {
            if(var14 < 0) {
               var12 = 0.0F;
            }

            var15 = var11;
            if(var10 == null) {
               break label23;
            }

            float var17;
            var14 = (var17 = var11 - 0.0F) == 0.0F?0:(var17 < 0.0F?-1:1);
         }

         if(var14 > 0) {
            GL11.glRotatef(class_1715.method_9555(var11) * var11 * var12 / 10.0F * (float)var1.method_4049(), 1.0F, 0.0F, 0.0F);
         }

         var15 = 0.75F;
      }

      float var13 = var15;
      GL11.glScalef(var13, var13, var13);
      GL11.glScalef(1.0F / var13, 1.0F / var13, 1.0F / var13);
      this.method_4731(var1);
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      this.field_3821.method_6511(var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (xo) bqx
   protected bqx method_4775(class_701 var1) {
      return field_3820;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "£ÏÒ³îí¤Ï©~õü®È¨kè¦§ÄÍ".toCharArray();
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
            field_3820 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 90;
            break;
         case 1:
            var10009 = 39;
            break;
         case 2:
            var10009 = 39;
            break;
         case 3:
            var10009 = 74;
            break;
         case 4:
            var10009 = 135;
            break;
         case 5:
            var10009 = 17;
            break;
         default:
            var10009 = 5;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
