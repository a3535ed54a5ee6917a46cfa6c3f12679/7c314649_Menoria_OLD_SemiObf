
// $FF: renamed from: bb
final class class_878 extends class_872 {

   // $FF: renamed from: a java.lang.String
   private static final String yPosition0 = "CL_00000012";


   // $FF: renamed from: <init> (int, java.lang.String) void
   void method_5146(int var1, String var2) {
      super.method_5146(var1, var2);
   }

   // $FF: renamed from: f () adb
   public adb method_5151() {
      return adb.method_2920(class_1192.field_6054);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5166() {
      boolean var10000 = true;
      char[] var10003 = "Kxyä¨?Ü8æ".toCharArray();
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
            yPosition0 = (new String((char[])var4)).intern();
            String var2 = yPosition0;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 20;
            break;
         case 1:
            var10009 = 40;
            break;
         case 2:
            var10009 = 58;
            break;
         case 3:
            var10009 = 200;
            break;
         case 4:
            var10009 = 132;
            break;
         case 5:
            var10009 = 19;
            break;
         default:
            var10009 = 240;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
