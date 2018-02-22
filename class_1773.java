import java.util.concurrent.Callable;

// $FF: renamed from: xP
class class_1773 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_9259 = "CL_00001535";
   // $FF: renamed from: b sa
   final class_689 field_9260;


   // $FF: renamed from: <init> (sa) void
   void method_9745(class_689 var1) {
      this.field_9260 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_9746() {
      return this.field_9260.method_64();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_9747() {
      return this.method_9746();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9748() {
      boolean var10000 = true;
      char[] var10003 = "OÏÜÖPcp=¶°Ó".toCharArray();
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
            field_9259 = (new String((char[])var4)).intern();
            String var2 = field_9259;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 118;
            break;
         case 1:
            var10009 = 249;
            break;
         case 2:
            var10009 = 249;
            break;
         case 3:
            var10009 = 156;
            break;
         case 4:
            var10009 = 26;
            break;
         case 5:
            var10009 = 41;
            break;
         default:
            var10009 = 58;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
