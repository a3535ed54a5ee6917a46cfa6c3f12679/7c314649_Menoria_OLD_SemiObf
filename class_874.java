
// $FF: renamed from: bf
final class class_874 extends class_872 {

   // $FF: renamed from: a java.lang.String
   private static final String xPosition6 = "CL_00000017";


   // $FF: renamed from: <init> (int, java.lang.String) void
   void method_5146(int var1, String var2) {
      super.method_5146(var1, var2);
   }

   // $FF: renamed from: f () adb
   public adb method_5151() {
      return class_1010.field_5116;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5166() {
      boolean var10000 = true;
      char[] var10003 = "3Þbðù]Ù".toCharArray();
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
            xPosition6 = (new String((char[])var4)).intern();
            String var2 = xPosition6;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 35;
            break;
         case 1:
            var10009 = 42;
            break;
         case 2:
            var10009 = 143;
            break;
         case 3:
            var10009 = 13;
            break;
         case 4:
            var10009 = 177;
            break;
         case 5:
            var10009 = 194;
            break;
         default:
            var10009 = 83;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
