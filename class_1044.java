import java.util.concurrent.Callable;

// $FF: renamed from: dr
class class_1044 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_5515 = "CL_00000144";
   // $FF: renamed from: b ahb
   final ahb field_5516;


   // $FF: renamed from: <init> (ahb) void
   void method_5902(ahb var1) {
      this.field_5516 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_5903() {
      return this.field_5516.field_1822.method_110();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5904() {
      boolean var10000 = true;
      char[] var10003 = "¡,´éÜG°".toCharArray();
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
            field_5515 = (new String((char[])var4)).intern();
            String var2 = field_5515;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 91;
            break;
         case 1:
            var10009 = 111;
            break;
         case 2:
            var10009 = 241;
            break;
         case 3:
            var10009 = 6;
            break;
         case 4:
            var10009 = 168;
            break;
         case 5:
            var10009 = 185;
            break;
         default:
            var10009 = 41;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
