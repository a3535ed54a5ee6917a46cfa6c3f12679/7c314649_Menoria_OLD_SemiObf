import org.lwjgl.opengl.GL11;

// $FF: renamed from: oV
public class class_824 extends class_823 {

   // $FF: renamed from: g java.lang.String
   private static final String field_3836 = "CL_00001029";


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
   }

   // $FF: renamed from: b (xz, float, aji, int) void
   protected void method_4790(class_691 var1, float var2, aji var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_4012();
      String[] var5 = var10000;
      int var9 = var6;
      byte var10001 = -1;
      if(var5 != null) {
         label53: {
            if(var6 > -1) {
               float var12;
               var9 = (var12 = (float)var6 - var2 + 1.0F - 10.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
               if(var5 == null) {
                  break label53;
               }

               if(var9 < 0) {
                  float var10;
                  float var11;
                  label58: {
                     float var7 = 1.0F - ((float)var6 - var2 + 1.0F) / 10.0F;
                     float var13;
                     var9 = (var13 = var7 - 0.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
                     if(var5 != null) {
                        if(var9 < 0) {
                           var7 = 0.0F;
                        }

                        var10 = var7;
                        var11 = 1.0F;
                        if(var5 == null) {
                           break label58;
                        }

                        float var14;
                        var9 = (var14 = var7 - 1.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
                     }

                     if(var9 > 0) {
                        var7 = 1.0F;
                     }

                     var7 *= var7;
                     var7 *= var7;
                     var10 = 1.0F;
                     var11 = var7 * 0.3F;
                  }

                  float var8 = var10 + var11;
                  GL11.glScalef(var8, var8, var8);
               }
            }

            super.method_4789(var1, var2, var3, var4);
            var9 = var6;
         }

         var10001 = -1;
      }

      if(var5 != null) {
         if(var9 <= var10001) {
            return;
         }

         var9 = var6 / 5;
         var10001 = 2;
      }

      var9 %= var10001;
      if(var5 != null) {
         if(var9 != 0) {
            return;
         }

         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 772);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, (1.0F - ((float)var6 - var2 + 1.0F) / 100.0F) * 0.8F);
         GL11.glPushMatrix();
         this.field_3834.drawTextBox6(class_1192.field_6073, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(2896);
         var9 = 3553;
      }

      GL11.glEnable(var9);
   }

   // $FF: renamed from: b (xr, float, aji, int) void
   protected void method_4789(class_690 var1, float var2, aji var3, int var4) {
      this.method_4790((class_691)var1, var2, var3, var4);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "3üÆþAåæõ".toCharArray();
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
            field_3836 = (new String((char[])var4)).intern();
            String var2 = field_3836;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 158;
            break;
         case 1:
            var10009 = 59;
            break;
         case 2:
            var10009 = 58;
            break;
         case 3:
            var10009 = 34;
            break;
         case 4:
            var10009 = 24;
            break;
         case 5:
            var10009 = 83;
            break;
         default:
            var10009 = 32;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
