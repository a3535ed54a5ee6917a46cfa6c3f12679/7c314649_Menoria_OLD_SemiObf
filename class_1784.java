
// $FF: renamed from: xW
final class class_1784 implements class_82 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9310 = "CL_00001867";


   // $FF: renamed from: <init> () void
   void method_9811() {
      super();
   }

   // $FF: renamed from: b (sa) boolean
   public boolean method_402(class_689 var1) {
      boolean var10000;
      label24: {
         String[] var2 = class_752.method_4253();
         var10000 = var1 instanceof class_22;
         if(var2 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = var1.method_3917();
         }

         if(var2 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_403() {
      boolean var10000 = true;
      char[] var10003 = "¿\bòv Í|tõ".toCharArray();
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
            field_9310 = (new String((char[])var4)).intern();
            String var2 = field_9310;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 167;
            break;
         case 1:
            var10009 = 31;
            break;
         case 2:
            var10009 = 25;
            break;
         case 3:
            var10009 = 153;
            break;
         case 4:
            var10009 = 29;
            break;
         case 5:
            var10009 = 230;
            break;
         default:
            var10009 = 203;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
