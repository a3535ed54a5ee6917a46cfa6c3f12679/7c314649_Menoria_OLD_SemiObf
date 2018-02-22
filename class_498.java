
// $FF: renamed from: aU
class class_498 extends class_492 {

   // $FF: renamed from: a java.lang.String
   private static final String field_2304 = "CL_00001747";
   // $FF: renamed from: g Ao
   final class_683 field_2305;


   // $FF: renamed from: <init> (Ao, vI, int, int, int) void
   void method_2894(class_683 var1, class_22 var2, int var3, int var4, int var5) {
      this.field_2305 = var1;
      super.method_2869(var2, var3, var4, var5);
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2895() {
      boolean var10000 = true;
      char[] var10003 = "ãJx5_<12".toCharArray();
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
            field_2304 = (new String((char[])var4)).intern();
            String var2 = field_2304;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 219;
            break;
         case 1:
            var10009 = 125;
            break;
         case 2:
            var10009 = 92;
            break;
         case 3:
            var10009 = 126;
            break;
         case 4:
            var10009 = 20;
            break;
         case 5:
            var10009 = 87;
            break;
         default:
            var10009 = 119;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
