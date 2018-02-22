import java.util.concurrent.Callable;

// $FF: renamed from: nL
class GuiTextField2 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7397 = "CL_00000918";
   // $FF: renamed from: b v7
   final class_716 field_7398;
   // $FF: renamed from: c bkn
   final bkn field_7399;


   // $FF: renamed from: <init> (bkn, v7) void
   void method_7599(bkn var1, class_716 var2) {
      this.field_7399 = var1;
      this.field_7398 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7600() {
      return this.field_7398.toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7601() {
      boolean var10000 = true;
      char[] var10003 = "X:9É3×+OWÁ".toCharArray();
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
            field_7397 = (new String((char[])var4)).intern();
            String var2 = field_7397;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 157;
            break;
         case 1:
            var10009 = 240;
            break;
         case 2:
            var10009 = 224;
            break;
         case 3:
            var10009 = 127;
            break;
         case 4:
            var10009 = 133;
            break;
         case 5:
            var10009 = 55;
            break;
         default:
            var10009 = 97;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
