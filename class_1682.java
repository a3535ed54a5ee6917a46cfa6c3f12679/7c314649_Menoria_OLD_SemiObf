import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

// $FF: renamed from: ur
class class_1682 implements GenericFutureListener {

   // $FF: renamed from: a java.lang.String
   private static final String field_8766 = "CL_00001451";
   // $FF: renamed from: b l
   final class_120 field_8767;
   // $FF: renamed from: c fq
   final class_1082 field_8768;
   // $FF: renamed from: d uo
   final class_1680 field_8769;


   // $FF: renamed from: <init> (uo, l, fq) void
   void method_9263(class_1680 var1, class_120 var2, class_1082 var3) {
      this.field_8769 = var1;
      this.field_8767 = var2;
      this.field_8768 = var3;
      super();
   }

   public void operationComplete(Future var1) {
      this.field_8767.method_558(this.field_8768);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9264() {
      boolean var10000 = true;
      char[] var10003 = "ödÉø\'áÈ".toCharArray();
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
            field_8766 = (new String((char[])var4)).intern();
            String var2 = field_8766;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 248;
            break;
         case 1:
            var10009 = 101;
            break;
         case 2:
            var10009 = 153;
            break;
         case 3:
            var10009 = 180;
            break;
         case 4:
            var10009 = 133;
            break;
         case 5:
            var10009 = 90;
            break;
         default:
            var10009 = 108;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
