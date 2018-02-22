import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

// $FF: renamed from: kt
public class class_1355 {

   // $FF: renamed from: b float
   public static float field_7044;
   // $FF: renamed from: c float
   public static float field_7045;
   // $FF: renamed from: d float
   public static float field_7046;
   // $FF: renamed from: e java.nio.IntBuffer
   private static IntBuffer field_7047;
   // $FF: renamed from: f java.nio.FloatBuffer
   private static FloatBuffer field_7048;
   // $FF: renamed from: g java.nio.FloatBuffer
   private static FloatBuffer field_7049;
   // $FF: renamed from: h java.nio.FloatBuffer
   private static FloatBuffer field_7050;
   // $FF: renamed from: i float
   public static float field_7051;
   // $FF: renamed from: j float
   public static float field_7052;
   // $FF: renamed from: k float
   public static float field_7053;
   // $FF: renamed from: l float
   public static float field_7054;
   // $FF: renamed from: m float
   public static float field_7055;
   // $FF: renamed from: n java.lang.String
   private static final String field_7056 = "CL_00000626";


   // $FF: renamed from: <init> () void
   public void getMaxStringLength7() {
      super();
   }

   // $FF: renamed from: b (yz, boolean) void
   public static void getMaxStringLength8(class_792 var0, boolean var1) {
      GL11.glGetFloat(2982, field_7048);
      GL11.glGetFloat(2983, field_7049);
      GL11.glGetInteger(2978, field_7047);
      float var3 = (float)((field_7047.get(0) + field_7047.get(2)) / 2);
      float var4 = (float)((field_7047.get(1) + field_7047.get(3)) / 2);
      GLU.gluUnProject(var3, var4, 0.0F, field_7048, field_7049, field_7047, field_7050);
      String[] var10000 = class_752.method_4253();
      field_7044 = field_7050.get(0);
      String[] var2 = var10000;
      field_7045 = field_7050.get(1);
      field_7046 = field_7050.get(2);
      int var8 = var1;
      if(var2 != null) {
         var8 = var1 != 0?1:0;
      }

      int var5 = var8;
      float var6 = var0.field_3001;
      float var7 = var0.field_3000;
      field_7051 = class_1715.method_9556(var7 * 3.1415927F / 180.0F) * (float)(1 - var5 * 2);
      field_7053 = class_1715.method_9555(var7 * 3.1415927F / 180.0F) * (float)(1 - var5 * 2);
      field_7054 = -field_7053 * class_1715.method_9555(var6 * 3.1415927F / 180.0F) * (float)(1 - var5 * 2);
      field_7055 = field_7051 * class_1715.method_9555(var6 * 3.1415927F / 180.0F) * (float)(1 - var5 * 2);
      field_7052 = class_1715.method_9556(var6 * 3.1415927F / 180.0F);
   }

   // $FF: renamed from: a (sv, double) azw
   public static azw getMaxStringLength9(class_752 var0, double var1) {
      double var3 = var0.field_2991 + (var0.field_2994 - var0.field_2991) * var1;
      double var5 = var0.field_2992 + (var0.field_2995 - var0.field_2992) * var1 + (double)var0.method_3880();
      double var7 = var0.field_2993 + (var0.field_2996 - var0.field_2993) * var1;
      double var9 = var3 + (double)(field_7044 * 1.0F);
      double var11 = var5 + (double)(field_7045 * 1.0F);
      double var13 = var7 + (double)(field_7046 * 1.0F);
      return azw.method_5086(var9, var11, var13);
   }

   // $FF: renamed from: b (ahb, sv, float) aji
   public static aji getCursorPosition0(ahb var0, class_752 var1, float var2) {
      azw var4 = getMaxStringLength9(var1, (double)var2);
      class_1034 var10000 = new class_1034;
      var10000.method_5855(var4);
      class_1034 var5 = var10000;
      String[] var9 = class_752.method_4253();
      aji var6 = var0.getBlock(var5.field_5472, var5.field_5473, var5.field_5474);
      String[] var3 = var9;
      aji var10 = var6;
      if(var3 != null) {
         if(var6.method_2424().method_5062()) {
            float var7 = class_366.method_2552(var0.method_33(var5.field_5472, var5.field_5473, var5.field_5474)) - 0.11111111F;
            float var8 = (float)(var5.field_5473 + 1) - var7;
            if(var4.field_4221 >= (double)var8) {
               var6 = var0.getBlock(var5.field_5472, var5.field_5473 + 1, var5.field_5474);
            }
         }

         var10 = var6;
      }

      return var10;
   }

   // $FF: renamed from: <clinit> () void
   static void getCursorPosition1() {
      boolean var10000 = true;
      char[] var10003 = "AÄe\f\r2¾\b\n".toCharArray();
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
            field_7056 = (new String((char[])var4)).intern();
            String var2 = field_7056;
            field_7047 = ban.method_5199(16);
            field_7048 = ban.method_5200(16);
            field_7049 = ban.method_5200(16);
            field_7050 = ban.method_5200(3);
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 10;
            break;
         case 1:
            var10009 = 128;
            break;
         case 2:
            var10009 = 50;
            break;
         case 3:
            var10009 = 52;
            break;
         case 4:
            var10009 = 53;
            break;
         case 5:
            var10009 = 164;
            break;
         default:
            var10009 = 173;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
