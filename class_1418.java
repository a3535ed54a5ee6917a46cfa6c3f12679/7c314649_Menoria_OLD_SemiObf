import javax.vecmath.Matrix4f;

// $FF: renamed from: o_
public class class_1418 extends class_1417 {

   // $FF: renamed from: l java.lang.String
   private static final String field_7552 = "dummy";


   // $FF: renamed from: <init> () void
   public void method_7751() {
      super.method_7732("dummy", 4, 1, (class_1404)null);
   }

   // $FF: renamed from: b (float) void
   public void method_7737(float var1) {}

   // $FF: renamed from: b (float, float) void
   public void method_7738(float var1, float var2) {}

   // $FF: renamed from: b (float, float, float) void
   public void method_7739(float var1, float var2, float var3) {}

   // $FF: renamed from: b (float, float, float, float) void
   public void method_7740(float var1, float var2, float var3, float var4) {}

   // $FF: renamed from: c (float, float, float, float) void
   public void method_7741(float var1, float var2, float var3, float var4) {}

   // $FF: renamed from: b (int, int, int, int) void
   public void method_7742(int var1, int var2, int var3, int var4) {}

   // $FF: renamed from: b (float[]) void
   public void method_7743(float[] var1) {}

   // $FF: renamed from: b (float, float, float, float, float, float, float, float, float, float, float, float, float, float, float, float) void
   public void method_7744(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {}

   // $FF: renamed from: b (javax.vecmath.Matrix4f) void
   public void method_7745(Matrix4f var1) {}

   // $FF: renamed from: <clinit> () void
   static void method_7750() {
      boolean var10000 = true;
      char[] var10003 = "ep¦s".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7552 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 136;
            break;
         case 1:
            var10009 = 100;
            break;
         case 2:
            var10009 = 148;
            break;
         case 3:
            var10009 = 66;
            break;
         case 4:
            var10009 = 131;
            break;
         case 5:
            var10009 = 160;
            break;
         default:
            var10009 = 126;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
