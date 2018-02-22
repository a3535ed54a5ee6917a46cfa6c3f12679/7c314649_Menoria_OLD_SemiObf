import java.util.concurrent.Callable;

// $FF: renamed from: kK
class class_1320 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6787 = "CL_00000646";
   // $FF: renamed from: b bao
   final bao field_6788;


   // $FF: renamed from: <init> (bao) void
   void method_6946(bao var1) {
      this.field_6788 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6947() {
      return buu.method_9040();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_6948() {
      return this.method_6947();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6949() {
      boolean var10000 = true;
      char[] var10003 = "zYÁs·\"\t#ªu".toCharArray();
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
            field_6787 = (new String((char[])var4)).intern();
            String var2 = field_6787;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 139;
            break;
         case 1:
            var10009 = 167;
            break;
         case 2:
            var10009 = 44;
            break;
         case 3:
            var10009 = 241;
            break;
         case 4:
            var10009 = 148;
            break;
         case 5:
            var10009 = 53;
            break;
         default:
            var10009 = 160;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
