import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

// $FF: renamed from: ut
class class_1685 implements GenericFutureListener {

   // $FF: renamed from: a java.lang.String
   private static final String field_8802 = "CL_00001453";
   // $FF: renamed from: b fq
   final class_1082 field_8803;
   // $FF: renamed from: c us
   final class_1684 field_8804;


   // $FF: renamed from: <init> (us, fq) void
   void method_9296(class_1684 var1, class_1082 var2) {
      this.field_8804 = var1;
      this.field_8803 = var2;
      super();
   }

   public void operationComplete(Future var1) {
      this.field_8804.field_8783.method_558(this.field_8803);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9297() {
      boolean var10000 = true;
      char[] var10003 = "äéiÔ\n4¯×".toCharArray();
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
            field_8802 = (new String((char[])var4)).intern();
            String var2 = field_8802;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 125;
            break;
         case 1:
            var10009 = 127;
            break;
         case 2:
            var10009 = 236;
            break;
         case 3:
            var10009 = 62;
            break;
         case 4:
            var10009 = 224;
            break;
         case 5:
            var10009 = 222;
            break;
         default:
            var10009 = 69;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
