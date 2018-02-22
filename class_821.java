import org.lwjgl.opengl.GL11;

// $FF: renamed from: oX
public class class_821 extends bno {

   // $FF: renamed from: g blm
   private blm field_3828;
   // $FF: renamed from: h java.lang.String
   private static final String field_3829 = "CL_00001030";


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      blm var10001 = new blm;
      var10001.method_7203();
      this.field_3828 = var10001;
      this.field_3790 = 0.5F;
   }

   // $FF: renamed from: b (xA, double, double, double, float, float) void
   public void method_4781(class_714 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      GL11.glPushMatrix();
      String[] var10 = var10000;
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var13 = (float)var1.field_3201 - var9 + 1.0F;
      float var10001 = 10.0F;
      float var11;
      if(var10 != null) {
         if(var13 < 10.0F) {
            label40: {
               var11 = 1.0F - ((float)var1.field_3201 - var9 + 1.0F) / 10.0F;
               float var15;
               int var14 = (var15 = var11 - 0.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
               if(var10 != null) {
                  if(var14 < 0) {
                     var11 = 0.0F;
                  }

                  var13 = var11;
                  var10001 = 1.0F;
                  if(var10 == null) {
                     break label40;
                  }

                  float var16;
                  var14 = (var16 = var11 - 1.0F) == 0.0F?0:(var16 < 0.0F?-1:1);
               }

               if(var14 > 0) {
                  var11 = 1.0F;
               }

               var11 *= var11;
               var11 *= var11;
               var13 = 1.0F;
               var10001 = var11 * 0.3F;
            }

            float var12 = var13 + var10001;
            GL11.glScalef(var12, var12, var12);
         }

         var13 = 1.0F - ((float)var1.field_3201 - var9 + 1.0F) / 100.0F;
         var10001 = 0.8F;
      }

      var11 = var13 * var10001;
      this.method_4731(var1);
      this.field_3828.drawTextBox6(class_1192.field_6073, 0, var1.method_3884(var9));
      if(var10 != null) {
         if(var1.field_3201 / 5 % 2 == 0) {
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 772);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, var11);
            this.field_3828.drawTextBox6(class_1192.field_6073, 0, 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glEnable(3553);
         }

         GL11.glPopMatrix();
      }

   }

   // $FF: renamed from: b (xA) bqx
   protected bqx method_4782(class_714 var1) {
      return bpz.field_7757;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4782((class_714)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4781((class_714)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "¶\tÖC!RÄuº".toCharArray();
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
            field_3829 = (new String((char[])var4)).intern();
            String var2 = field_3829;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 189;
            break;
         case 1:
            var10009 = 13;
            break;
         case 2:
            var10009 = 193;
            break;
         case 3:
            var10009 = 107;
            break;
         case 4:
            var10009 = 59;
            break;
         case 5:
            var10009 = 89;
            break;
         default:
            var10009 = 42;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
