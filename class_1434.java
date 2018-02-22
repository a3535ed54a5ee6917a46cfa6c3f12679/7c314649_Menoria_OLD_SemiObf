import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import javax.crypto.SecretKey;

// $FF: renamed from: nu
class class_1434 implements GenericFutureListener {

   // $FF: renamed from: a java.lang.String
   private static final String field_7608 = "CL_00000877";
   // $FF: renamed from: b javax.crypto.SecretKey
   final SecretKey field_7609;
   // $FF: renamed from: c nt
   final class_1432 field_7610;


   // $FF: renamed from: <init> (nt, javax.crypto.SecretKey) void
   void method_7803(class_1432 var1, SecretKey var2) {
      this.field_7610 = var1;
      this.field_7609 = var2;
      super();
   }

   public void operationComplete(Future var1) {
      class_1432.method_7793(this.field_7610).method_562(this.field_7609);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7804() {
      boolean var10000 = true;
      char[] var10003 = "Âê7ÿ¿s±_ø".toCharArray();
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
            field_7608 = (new String((char[])var4)).intern();
            String var2 = field_7608;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 53;
            break;
         case 1:
            var10009 = 18;
            break;
         case 2:
            var10009 = 220;
            break;
         case 3:
            var10009 = 123;
            break;
         case 4:
            var10009 = 59;
            break;
         case 5:
            var10009 = 247;
            break;
         default:
            var10009 = 150;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
