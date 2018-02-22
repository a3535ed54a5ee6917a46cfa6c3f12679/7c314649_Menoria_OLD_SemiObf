import ca.diiza.e.class_805;

// $FF: renamed from: qN
final class class_1474 extends class_1469 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7748 = "CL_00001398";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
   }

   // $FF: renamed from: b (ahb, q7) Aj
   protected class_12 method_7945(ahb var1, class_45 var2) {
      class_805 var10000 = new class_805;
      var10000.method_4705(var1, var2.method_179(), var2.method_180(), var2.method_181());
      class_805 var3 = var10000;
      var3.field_3761 = 1;
      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "ÒÐ{ðÞ ì¶s".toCharArray();
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
            field_7748 = (new String((char[])var4)).intern();
            String var2 = field_7748;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 155;
            break;
         case 1:
            var10009 = 213;
            break;
         case 2:
            var10009 = 133;
            break;
         case 3:
            var10009 = 65;
            break;
         case 4:
            var10009 = 202;
            break;
         case 5:
            var10009 = 165;
            break;
         default:
            var10009 = 228;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
