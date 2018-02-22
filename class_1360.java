import java.util.concurrent.Callable;

// $FF: renamed from: ky
class Gui0 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7142 = "CL_00000635";
   // $FF: renamed from: b bao
   final bao field_7143;


   // $FF: renamed from: <init> (bao) void
   void isFocused4(bao var1) {
      this.field_7143 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String isFocused5() {
      return bao.method_5305(this.field_7143).method_7907().toString();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object isFocused6() {
      return this.isFocused5();
   }

   // $FF: renamed from: <clinit> () void
   static void isFocused7() {
      boolean var10000 = true;
      char[] var10003 = "é·[¥ßÍ7 ".toCharArray();
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
            field_7142 = (new String((char[])var4)).intern();
            String var2 = field_7142;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 89;
            break;
         case 1:
            var10009 = 8;
            break;
         case 2:
            var10009 = 247;
            break;
         case 3:
            var10009 = 102;
            break;
         case 4:
            var10009 = 28;
            break;
         case 5:
            var10009 = 205;
            break;
         default:
            var10009 = 65;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
