import org.lwjgl.opengl.GL11;

// $FF: renamed from: oi
public class class_816 extends bno {

   // $FF: renamed from: g bqx
   private static final bqx field_3818;
   // $FF: renamed from: h bhr
   private bhr field_3819;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
      this.field_3790 = 0.5F;
      class_1209 var10001 = new class_1209;
      var10001.method_6517(0.0F, true);
      this.field_3819 = var10001;
   }

   // $FF: renamed from: b (xk, double, double, double, float, float) void
   public void method_4772(class_705 var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = (float)var1.field_3155 + var9;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.method_4732(field_3818);
      float var11 = class_1715.method_9555(var10 * 0.2F) / 2.0F + 0.5F;
      var11 += var11 * var11;
      this.field_3819.method_6511(var1, 0.0F, var10 * 3.0F, var11 * 0.2F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (xk) bqx
   protected bqx method_4773(class_705 var1) {
      return field_3818;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "f&1NaZ<0_kZ< Yq!0G=6!H`\f&%\nb".toCharArray();
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
            field_3818 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 117;
            break;
         case 1:
            var10009 = 18;
            break;
         case 2:
            var10009 = 141;
            break;
         case 3:
            var10009 = 53;
            break;
         case 4:
            var10009 = 35;
            break;
         case 5:
            var10009 = 1;
            break;
         default:
            var10009 = 76;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
