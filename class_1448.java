import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: oe
public class class_1448 extends class_1447 {

   // $FF: renamed from: a oe
   private static class_1448 field_7695;
   // $FF: renamed from: g java.nio.FloatBuffer
   private FloatBuffer field_7696;
   // $FF: renamed from: h java.nio.FloatBuffer
   private FloatBuffer field_7697;
   // $FF: renamed from: i java.nio.FloatBuffer
   private FloatBuffer field_7698;
   // $FF: renamed from: j java.lang.String
   private static final String field_7699 = "CL_00000975";


   // $FF: renamed from: <init> () void
   public void method_7886() {
      super.method_7886();
      this.field_7696 = ban.method_5200(16);
      this.field_7697 = ban.method_5200(16);
      this.field_7698 = ban.method_5200(16);
   }

   // $FF: renamed from: b () od
   public static class_1447 method_7890() {
      field_7695.method_7892();
      return field_7695;
   }

   // $FF: renamed from: b (float[][], int) void
   private void method_7891(float[][] var1, int var2) {
      float var3 = class_1715.method_9557(var1[var2][0] * var1[var2][0] + var1[var2][1] * var1[var2][1] + var1[var2][2] * var1[var2][2]);
      var1[var2][0] /= var3;
      var1[var2][1] /= var3;
      var1[var2][2] /= var3;
      var1[var2][3] /= var3;
   }

   // $FF: renamed from: c () void
   private void method_7892() {
      this.field_7696.clear();
      this.field_7697.clear();
      this.field_7698.clear();
      GL11.glGetFloat(2983, this.field_7696);
      GL11.glGetFloat(2982, this.field_7697);
      this.field_7696.flip().limit(16);
      this.field_7696.get(this.field_7691);
      this.field_7697.flip().limit(16);
      this.field_7697.get(this.field_7692);
      this.field_7693[0] = this.field_7692[0] * this.field_7691[0] + this.field_7692[1] * this.field_7691[4] + this.field_7692[2] * this.field_7691[8] + this.field_7692[3] * this.field_7691[12];
      this.field_7693[1] = this.field_7692[0] * this.field_7691[1] + this.field_7692[1] * this.field_7691[5] + this.field_7692[2] * this.field_7691[9] + this.field_7692[3] * this.field_7691[13];
      this.field_7693[2] = this.field_7692[0] * this.field_7691[2] + this.field_7692[1] * this.field_7691[6] + this.field_7692[2] * this.field_7691[10] + this.field_7692[3] * this.field_7691[14];
      this.field_7693[3] = this.field_7692[0] * this.field_7691[3] + this.field_7692[1] * this.field_7691[7] + this.field_7692[2] * this.field_7691[11] + this.field_7692[3] * this.field_7691[15];
      this.field_7693[4] = this.field_7692[4] * this.field_7691[0] + this.field_7692[5] * this.field_7691[4] + this.field_7692[6] * this.field_7691[8] + this.field_7692[7] * this.field_7691[12];
      this.field_7693[5] = this.field_7692[4] * this.field_7691[1] + this.field_7692[5] * this.field_7691[5] + this.field_7692[6] * this.field_7691[9] + this.field_7692[7] * this.field_7691[13];
      this.field_7693[6] = this.field_7692[4] * this.field_7691[2] + this.field_7692[5] * this.field_7691[6] + this.field_7692[6] * this.field_7691[10] + this.field_7692[7] * this.field_7691[14];
      this.field_7693[7] = this.field_7692[4] * this.field_7691[3] + this.field_7692[5] * this.field_7691[7] + this.field_7692[6] * this.field_7691[11] + this.field_7692[7] * this.field_7691[15];
      this.field_7693[8] = this.field_7692[8] * this.field_7691[0] + this.field_7692[9] * this.field_7691[4] + this.field_7692[10] * this.field_7691[8] + this.field_7692[11] * this.field_7691[12];
      this.field_7693[9] = this.field_7692[8] * this.field_7691[1] + this.field_7692[9] * this.field_7691[5] + this.field_7692[10] * this.field_7691[9] + this.field_7692[11] * this.field_7691[13];
      this.field_7693[10] = this.field_7692[8] * this.field_7691[2] + this.field_7692[9] * this.field_7691[6] + this.field_7692[10] * this.field_7691[10] + this.field_7692[11] * this.field_7691[14];
      this.field_7693[11] = this.field_7692[8] * this.field_7691[3] + this.field_7692[9] * this.field_7691[7] + this.field_7692[10] * this.field_7691[11] + this.field_7692[11] * this.field_7691[15];
      this.field_7693[12] = this.field_7692[12] * this.field_7691[0] + this.field_7692[13] * this.field_7691[4] + this.field_7692[14] * this.field_7691[8] + this.field_7692[15] * this.field_7691[12];
      this.field_7693[13] = this.field_7692[12] * this.field_7691[1] + this.field_7692[13] * this.field_7691[5] + this.field_7692[14] * this.field_7691[9] + this.field_7692[15] * this.field_7691[13];
      this.field_7693[14] = this.field_7692[12] * this.field_7691[2] + this.field_7692[13] * this.field_7691[6] + this.field_7692[14] * this.field_7691[10] + this.field_7692[15] * this.field_7691[14];
      this.field_7693[15] = this.field_7692[12] * this.field_7691[3] + this.field_7692[13] * this.field_7691[7] + this.field_7692[14] * this.field_7691[11] + this.field_7692[15] * this.field_7691[15];
      this.field_7690[0][0] = this.field_7693[3] - this.field_7693[0];
      this.field_7690[0][1] = this.field_7693[7] - this.field_7693[4];
      this.field_7690[0][2] = this.field_7693[11] - this.field_7693[8];
      this.field_7690[0][3] = this.field_7693[15] - this.field_7693[12];
      this.method_7891(this.field_7690, 0);
      this.field_7690[1][0] = this.field_7693[3] + this.field_7693[0];
      this.field_7690[1][1] = this.field_7693[7] + this.field_7693[4];
      this.field_7690[1][2] = this.field_7693[11] + this.field_7693[8];
      this.field_7690[1][3] = this.field_7693[15] + this.field_7693[12];
      this.method_7891(this.field_7690, 1);
      this.field_7690[2][0] = this.field_7693[3] + this.field_7693[1];
      this.field_7690[2][1] = this.field_7693[7] + this.field_7693[5];
      this.field_7690[2][2] = this.field_7693[11] + this.field_7693[9];
      this.field_7690[2][3] = this.field_7693[15] + this.field_7693[13];
      this.method_7891(this.field_7690, 2);
      this.field_7690[3][0] = this.field_7693[3] - this.field_7693[1];
      this.field_7690[3][1] = this.field_7693[7] - this.field_7693[5];
      this.field_7690[3][2] = this.field_7693[11] - this.field_7693[9];
      this.field_7690[3][3] = this.field_7693[15] - this.field_7693[13];
      this.method_7891(this.field_7690, 3);
      this.field_7690[4][0] = this.field_7693[3] - this.field_7693[2];
      this.field_7690[4][1] = this.field_7693[7] - this.field_7693[6];
      this.field_7690[4][2] = this.field_7693[11] - this.field_7693[10];
      this.field_7690[4][3] = this.field_7693[15] - this.field_7693[14];
      this.method_7891(this.field_7690, 4);
      this.field_7690[5][0] = this.field_7693[3] + this.field_7693[2];
      this.field_7690[5][1] = this.field_7693[7] + this.field_7693[6];
      this.field_7690[5][2] = this.field_7693[11] + this.field_7693[10];
      this.field_7690[5][3] = this.field_7693[15] + this.field_7693[14];
      this.method_7891(this.field_7690, 5);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7889() {
      boolean var10000 = true;
      char[] var10003 = "ÔóÕÕ§a".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7699 = (new String((char[])var5)).intern();
            String var2 = field_7699;
            class_1448 var3 = new class_1448;
            var3.method_7886();
            field_7695 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 86;
            break;
         case 1:
            var10009 = 153;
            break;
         case 2:
            var10009 = 109;
            break;
         case 3:
            var10009 = 243;
            break;
         case 4:
            var10009 = 36;
            break;
         case 5:
            var10009 = 112;
            break;
         default:
            var10009 = 36;
         }

         ((Object[])var5)[var0] = (char)(var10007 ^ var6 ^ var10009);
         ++var0;
      }
   }
}
