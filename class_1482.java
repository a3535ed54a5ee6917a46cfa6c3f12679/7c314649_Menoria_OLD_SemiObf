
// $FF: renamed from: pU
class class_1482 {

   // $FF: renamed from: b pR
   final class_43 field_7794;
   // $FF: renamed from: c java.lang.Class
   final Class field_7795;
   // $FF: renamed from: d java.lang.String
   private static final String field_7796 = "CL_00001103";
   // $FF: renamed from: e pS
   final class_1479 field_7797;


   // $FF: renamed from: <init> (pS, pR, java.lang.Class) void
   private void method_7995(class_1479 var1, class_43 var2, Class var3) {
      this.field_7797 = var1;
      super();
      this.field_7794 = var2;
      this.field_7795 = var3;
   }

   // $FF: renamed from: <init> (pS, pR, java.lang.Class, java.lang.Object) void
   void method_7996(class_1479 var1, class_43 var2, Class var3, Object var4) {
      this.method_7995(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7997() {
      boolean var10000 = true;
      char[] var10003 = "5|ÄìÃOGüÇ".toCharArray();
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
            field_7796 = (new String((char[])var4)).intern();
            String var2 = field_7796;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 107;
            break;
         case 1:
            var10009 = 45;
            break;
         case 2:
            var10009 = 209;
            break;
         case 3:
            var10009 = 233;
            break;
         case 4:
            var10009 = 193;
            break;
         case 5:
            var10009 = 238;
            break;
         default:
            var10009 = 98;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
