
// $FF: renamed from: jh
final class class_866 extends awt {

   // $FF: renamed from: P java.lang.String
   private static final String field_4211 = "CL_00000543";


   // $FF: renamed from: <init> (jj) void
   void method_5061(class_1319 var1) {
      super.method_5061(var1);
   }

   // $FF: renamed from: c () boolean
   public boolean method_5065() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5080() {
      boolean var10000 = true;
      char[] var10003 = "JatudC9v".toCharArray();
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
            field_4211 = (new String((char[])var4)).intern();
            String var2 = field_4211;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 1;
            break;
         case 1:
            var10009 = 37;
            break;
         case 2:
            var10009 = 35;
            break;
         case 3:
            var10009 = 77;
            break;
         case 4:
            var10009 = 92;
            break;
         case 5:
            var10009 = 123;
            break;
         default:
            var10009 = 191;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
