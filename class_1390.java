import java.util.concurrent.Callable;

// $FF: renamed from: nJ
class GuiTextField0 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7390 = "CL_00000916";
   // $FF: renamed from: b v7
   final class_716 field_7391;
   // $FF: renamed from: c bkn
   final bkn field_7392;


   // $FF: renamed from: <init> (bkn, v7) void
   void method_7593(bkn var1, class_716 var2) {
      this.field_7392 = var1;
      this.field_7391 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7594() {
      return this.field_7391.toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7595() {
      boolean var10000 = true;
      char[] var10003 = "*»_lOEYÎ1j".toCharArray();
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
            field_7390 = (new String((char[])var4)).intern();
            String var2 = field_7390;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 248;
            break;
         case 1:
            var10009 = 102;
            break;
         case 2:
            var10009 = 145;
            break;
         case 3:
            var10009 = 205;
            break;
         case 4:
            var10009 = 238;
            break;
         case 5:
            var10009 = 47;
            break;
         default:
            var10009 = 228;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
