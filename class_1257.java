import java.util.concurrent.Callable;

// $FF: renamed from: j2
class class_1257 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6523 = "CL_00000590";
   // $FF: renamed from: b jY
   final class_1303 field_6524;


   // $FF: renamed from: <init> (jY) void
   void method_6615(class_1303 var1) {
      this.field_6524 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6616() {
      return class_1303.method_6878(this.field_6524);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6617() {
      boolean var10000 = true;
      char[] var10003 = "3qêXI}@kê".toCharArray();
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
            field_6523 = (new String((char[])var4)).intern();
            String var2 = field_6523;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 162;
            break;
         case 1:
            var10009 = 140;
            break;
         case 2:
            var10009 = 252;
            break;
         case 3:
            var10009 = 8;
            break;
         case 4:
            var10009 = 186;
            break;
         case 5:
            var10009 = 171;
            break;
         default:
            var10009 = 159;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
