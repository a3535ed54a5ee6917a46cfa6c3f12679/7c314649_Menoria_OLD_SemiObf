import java.util.concurrent.Callable;

// $FF: renamed from: h5
class class_1088 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_5728 = "CL_00000508";
   // $FF: renamed from: b g4
   final class_1052 field_5729;


   // $FF: renamed from: <init> (g4) void
   void method_6157(class_1052 var1) {
      this.field_5729 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6158() {
      return this.field_5729.getClass().getCanonicalName();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6159() {
      boolean var10000 = true;
      char[] var10003 = "oSïg<".toCharArray();
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
            field_5728 = (new String((char[])var4)).intern();
            String var2 = field_5728;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 27;
            break;
         case 1:
            var10009 = 111;
            break;
         case 2:
            var10009 = 64;
            break;
         case 3:
            var10009 = 227;
            break;
         case 4:
            var10009 = 147;
            break;
         case 5:
            var10009 = 245;
            break;
         default:
            var10009 = 106;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
