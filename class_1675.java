
// $FF: renamed from: vR
class class_1675 extends class_1674 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8747 = "CL_00001733";
   // $FF: renamed from: g Aw
   final class_675 field_8748;


   // $FF: renamed from: <init> (Aw, java.lang.String, boolean, int) void
   void method_9239(class_675 var1, String var2, boolean var3, int var4) {
      this.field_8748 = var1;
      super.method_9235(var2, var3, var4);
   }

   // $FF: renamed from: l () void
   public void method_91() {
      super.method_91();
      this.field_8748.method_3659(this);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9240() {
      boolean var10000 = true;
      char[] var10003 = "¶®¶¿{ÄÕÚ¼".toCharArray();
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
            field_8747 = (new String((char[])var4)).intern();
            String var2 = field_8747;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 201;
            break;
         case 1:
            var10009 = 222;
            break;
         case 2:
            var10009 = 213;
            break;
         case 3:
            var10009 = 179;
            break;
         case 4:
            var10009 = 115;
            break;
         case 5:
            var10009 = 19;
            break;
         default:
            var10009 = 119;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
