
// $FF: renamed from: ak
enum class_907 {

   // $FF: renamed from: e java.lang.String
   private static final String field_4471 = "CL_00001249";


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, int, java.lang.Object) void
   void method_5341(String var1, int var2, String var3, int var4, int var5, Object var6) {
      super.method_5338(var1, var2, var3, var4, var5, var6, (class_910)null);
      this.method_5329(0, class_252.class);
      this.method_5329(1, class_253.class);
      this.method_5329(2, class_254.class);
      this.method_5328(0, class_251.class);
      this.method_5328(1, class_303.class);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5339() {
      boolean var10000 = true;
      char[] var10003 = "Æ¶6Éj¤´È]À".toCharArray();
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
            field_4471 = (new String((char[])var4)).intern();
            String var2 = field_4471;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 37;
            break;
         case 1:
            var10009 = 90;
            break;
         case 2:
            var10009 = 201;
            break;
         case 3:
            var10009 = 89;
            break;
         case 4:
            var10009 = 250;
            break;
         case 5:
            var10009 = 52;
            break;
         default:
            var10009 = 29;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
