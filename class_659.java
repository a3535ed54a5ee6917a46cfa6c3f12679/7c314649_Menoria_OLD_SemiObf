import java.util.ArrayList;

// $FF: renamed from: AW
class class_659 extends ArrayList {

   // $FF: renamed from: a java.lang.String
   private static final String field_2823 = "CL_00001439";


   // $FF: renamed from: <init> () void
   private void method_3572() {
      super();
   }

   // $FF: renamed from: <init> (java.lang.Object) void
   void method_3573(Object var1) {
      this.method_3572();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3574() {
      boolean var10000 = true;
      char[] var10003 = "]^6õ2Ñ/&Zü".toCharArray();
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
            field_2823 = (new String((char[])var4)).intern();
            String var2 = field_2823;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 23;
            break;
         case 1:
            var10009 = 27;
            break;
         case 2:
            var10009 = 96;
            break;
         case 3:
            var10009 = 204;
            break;
         case 4:
            var10009 = 11;
            break;
         case 5:
            var10009 = 33;
            break;
         default:
            var10009 = 232;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
