import java.util.concurrent.Callable;

// $FF: renamed from: rg
class class_1565 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8243 = "CL_00001216";
   // $FF: renamed from: b java.lang.String
   final String field_8244;
   // $FF: renamed from: c ro
   final class_1583 field_8245;


   // $FF: renamed from: <init> (ro, java.lang.String) void
   void method_8597(class_1583 var1, String var2) {
      this.field_8245 = var1;
      this.field_8244 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8598() {
      return class_1571.field_8259[((class_1571)class_1583.method_8698(this.field_8245).get(this.field_8244)).method_8631()];
   }

   // $FF: renamed from: <clinit> () void
   static void method_8599() {
      boolean var10000 = true;
      char[] var10003 = "þD¾Ó§:â¸".toCharArray();
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
            field_8243 = (new String((char[])var4)).intern();
            String var2 = field_8243;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 67;
            break;
         case 1:
            var10009 = 246;
            break;
         case 2:
            var10009 = 45;
            break;
         case 3:
            var10009 = 112;
            break;
         case 4:
            var10009 = 29;
            break;
         case 5:
            var10009 = 105;
            break;
         default:
            var10009 = 211;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
