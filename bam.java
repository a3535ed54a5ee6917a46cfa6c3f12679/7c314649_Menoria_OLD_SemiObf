import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class bam {

   // $FF: renamed from: a java.nio.FloatBuffer
   private static FloatBuffer text3;
   // $FF: renamed from: b azw
   private static final azw text4;
   // $FF: renamed from: c azw
   private static final azw text5;
   private static final String __OBFID = "CL_00000629";


   // $FF: renamed from: <init> () void
   public void method_5211() {
      super();
   }

   // $FF: renamed from: a () void
   public static void method_5212() {
      GL11.glDisable(2896);
      GL11.glDisable(16384);
      GL11.glDisable(16385);
      GL11.glDisable(2903);
   }

   // $FF: renamed from: b () void
   public static void method_5213() {
      GL11.glEnable(2896);
      GL11.glEnable(16384);
      GL11.glEnable(16385);
      GL11.glEnable(2903);
      GL11.glColorMaterial(1032, 5634);
      float var0 = 0.4F;
      float var1 = 0.6F;
      float var2 = 0.0F;
      GL11.glLight(16384, 4611, method_5214(text4.field_4220, text4.field_4221, text4.field_4222, 0.0D));
      GL11.glLight(16384, 4609, method_5215(var1, var1, var1, 1.0F));
      GL11.glLight(16384, 4608, method_5215(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16384, 4610, method_5215(var2, var2, var2, 1.0F));
      GL11.glLight(16385, 4611, method_5214(text5.field_4220, text5.field_4221, text5.field_4222, 0.0D));
      GL11.glLight(16385, 4609, method_5215(var1, var1, var1, 1.0F));
      GL11.glLight(16385, 4608, method_5215(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16385, 4610, method_5215(var2, var2, var2, 1.0F));
      GL11.glShadeModel(7424);
      GL11.glLightModel(2899, method_5215(var0, var0, var0, 1.0F));
   }

   // $FF: renamed from: a (double, double, double, double) java.nio.FloatBuffer
   private static FloatBuffer method_5214(double var0, double var2, double var4, double var6) {
      return method_5215((float)var0, (float)var2, (float)var4, (float)var6);
   }

   // $FF: renamed from: a (float, float, float, float) java.nio.FloatBuffer
   private static FloatBuffer method_5215(float var0, float var1, float var2, float var3) {
      text3.clear();
      text3.put(var0).put(var1).put(var2).put(var3);
      text3.flip();
      return text3;
   }

   // $FF: renamed from: c () void
   public static void method_5216() {
      GL11.glPushMatrix();
      GL11.glRotatef(-30.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(165.0F, 1.0F, 0.0F, 0.0F);
      method_5213();
      GL11.glPopMatrix();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5217() {
      boolean var10000 = true;
      char[] var10003 = "üpESí\nèL".toCharArray();
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
            __OBFID = (new String((char[])var4)).intern();
            String var2 = __OBFID;
            text3 = ban.method_5200(16);
            text4 = azw.method_5086(0.20000000298023224D, 1.0D, -0.699999988079071D).method_5090();
            text5 = azw.method_5086(-0.20000000298023224D, 1.0D, 0.699999988079071D).method_5090();
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 189;
            break;
         case 1:
            var10009 = 62;
            break;
         case 2:
            var10009 = 216;
            break;
         case 3:
            var10009 = 119;
            break;
         case 4:
            var10009 = 97;
            break;
         case 5:
            var10009 = 223;
            break;
         default:
            var10009 = 57;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
