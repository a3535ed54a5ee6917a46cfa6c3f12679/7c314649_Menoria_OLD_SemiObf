import java.util.concurrent.Callable;

// $FF: renamed from: tM
class class_1599 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8323 = "CL_00001382";
   // $FF: renamed from: b kj
   final class_1346 field_8324;


   // $FF: renamed from: <init> (kj) void
   void method_8741(class_1346 var1) {
      this.field_8324 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8742() {
      return class_1323.method_6958();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8743() {
      boolean var10000 = true;
      char[] var10003 = "Ùéd»,à«¹".toCharArray();
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
            field_8323 = (new String((char[])var4)).intern();
            String var2 = field_8323;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 194;
            break;
         case 1:
            var10009 = 253;
            break;
         case 2:
            var10009 = 99;
            break;
         case 3:
            var10009 = 211;
            break;
         case 4:
            var10009 = 68;
            break;
         case 5:
            var10009 = 125;
            break;
         default:
            var10009 = 136;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
