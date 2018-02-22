import java.util.concurrent.Callable;

// $FF: renamed from: j3
class class_1258 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6525 = "CL_00000591";
   // $FF: renamed from: b jY
   final class_1303 field_6526;


   // $FF: renamed from: <init> (jY) void
   void method_6618(class_1303 var1) {
      this.field_6526 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6619() {
      return class_1605.method_8776(class_1303.method_6879(this.field_6526), class_1303.method_6880(this.field_6526), class_1303.method_6881(this.field_6526));
   }

   // $FF: renamed from: <clinit> () void
   static void method_6620() {
      boolean var10000 = true;
      char[] var10003 = "BëøE=Y1D".toCharArray();
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
            field_6525 = (new String((char[])var4)).intern();
            String var2 = field_6525;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 145;
            break;
         case 1:
            var10009 = 55;
            break;
         case 2:
            var10009 = 55;
            break;
         case 3:
            var10009 = 229;
            break;
         case 4:
            var10009 = 157;
            break;
         case 5:
            var10009 = 34;
            break;
         default:
            var10009 = 249;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
