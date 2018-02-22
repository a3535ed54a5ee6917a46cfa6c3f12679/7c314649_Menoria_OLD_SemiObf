
// $FF: renamed from: qW
final class class_1464 extends class_1460 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7734 = "CL_00001403";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
   }

   // $FF: renamed from: a (qH, add) add
   protected add method_7940(class_48 var1, add var2) {
      class_905 var3 = class_484.method_2849(var1.method_186());
      ahb var4 = var1.method_182();
      int var5 = var1.method_183() + var3.method_5322();
      int var6 = var1.method_184() + var3.method_5323();
      int var7 = var1.method_185() + var3.method_5324();
      class_714 var10000 = new class_714;
      var10000.method_4083(var4, (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), (double)((float)var7 + 0.5F), (class_752)null);
      class_714 var8 = var10000;
      var4.method_2089(var8);
      --var2.field_2958;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "V9Kñ>¾$A$ò".toCharArray();
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
            field_7734 = (new String((char[])var4)).intern();
            String var2 = field_7734;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 136;
            break;
         case 1:
            var10009 = 232;
            break;
         case 2:
            var10009 = 137;
            break;
         case 3:
            var10009 = 92;
            break;
         case 4:
            var10009 = 147;
            break;
         case 5:
            var10009 = 19;
            break;
         default:
            var10009 = 162;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
