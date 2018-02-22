import java.net.Authenticator;
import java.net.PasswordAuthentication;

// $FF: renamed from: AS
final class class_655 extends Authenticator {

   // $FF: renamed from: a java.lang.String
   private static final String field_2815 = "CL_00000829";
   // $FF: renamed from: b java.lang.String
   final String field_2816;
   // $FF: renamed from: c java.lang.String
   final String field_2817;


   // $FF: renamed from: <init> (java.lang.String, java.lang.String) void
   void method_3557(String var1, String var2) {
      this.field_2816 = var1;
      this.field_2817 = var2;
      super();
   }

   protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.field_2816, this.field_2817.toCharArray());
   }

   // $FF: renamed from: <clinit> () void
   static void method_3558() {
      boolean var10000 = true;
      char[] var10003 = "ñN\\asË9:1h".toCharArray();
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
            field_2815 = (new String((char[])var4)).intern();
            String var2 = field_2815;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 148;
            break;
         case 1:
            var10009 = 36;
            break;
         case 2:
            var10009 = 37;
            break;
         case 3:
            var10009 = 119;
            break;
         case 4:
            var10009 = 101;
            break;
         case 5:
            var10009 = 221;
            break;
         default:
            var10009 = 47;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
