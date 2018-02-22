
// $FF: renamed from: Av
class class_676 extends class_671 {

   // $FF: renamed from: i java.lang.String
   private static final String field_2907 = "CL_00001649";
   // $FF: renamed from: l wT
   final class_770 field_2908;


   // $FF: renamed from: <init> (wT) void
   void method_3692(class_770 var1) {
      this.field_2908 = var1;
      super.method_3645();
   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3678() {
      boolean var10000 = true;
      char[] var10003 = "FË¾Y4±è".toCharArray();
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
            field_2907 = (new String((char[])var4)).intern();
            String var2 = field_2907;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 157;
            break;
         case 1:
            var10009 = 31;
            break;
         case 2:
            var10009 = 68;
            break;
         case 3:
            var10009 = 190;
            break;
         case 4:
            var10009 = 22;
            break;
         case 5:
            var10009 = 174;
            break;
         default:
            var10009 = 241;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
