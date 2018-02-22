
// $FF: renamed from: z7
final class class_1839 implements class_82 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9388 = "CL_00001688";


   // $FF: renamed from: <init> () void
   void method_9949() {
      super();
   }

   // $FF: renamed from: b (sa) boolean
   public boolean method_402(class_689 var1) {
      return var1 instanceof class_10;
   }

   // $FF: renamed from: <clinit> () void
   static void method_403() {
      boolean var10000 = true;
      char[] var10003 = "ÌØê!Yb¾a¿â".toCharArray();
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
            field_9388 = (new String((char[])var4)).intern();
            String var2 = field_9388;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 101;
            break;
         case 1:
            var10009 = 189;
            break;
         case 2:
            var10009 = 109;
            break;
         case 3:
            var10009 = 48;
            break;
         case 4:
            var10009 = 251;
            break;
         case 5:
            var10009 = 131;
            break;
         default:
            var10009 = 184;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
