
// $FF: renamed from: qP
final class class_1472 extends class_1469 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7746 = "CL_00001405";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
   }

   // $FF: renamed from: b (ahb, q7) Aj
   protected class_12 method_7945(ahb var1, class_45 var2) {
      class_802 var10000 = new class_802;
      var10000.method_4683(var1, var2.method_179(), var2.method_180(), var2.method_181());
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "EC%mË:7;w ".toCharArray();
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
            field_7746 = (new String((char[])var4)).intern();
            String var2 = field_7746;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 224;
            break;
         case 1:
            var10009 = 233;
            break;
         case 2:
            var10009 = 161;
            break;
         case 3:
            var10009 = 243;
            break;
         case 4:
            var10009 = 187;
            break;
         case 5:
            var10009 = 29;
            break;
         default:
            var10009 = 236;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
