
// $FF: renamed from: q2
final class class_1478 implements class_41 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7754 = "CL_00001200";


   // $FF: renamed from: <init> () void
   void method_7949() {
      super();
   }

   // $FF: renamed from: b (qH, add) add
   public add method_176(class_48 var1, add var2) {
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "µðú]7ËÇóú".toCharArray();
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
            field_7754 = (new String((char[])var4)).intern();
            String var2 = field_7754;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 144;
            break;
         case 1:
            var10009 = 218;
            break;
         case 2:
            var10009 = 165;
            break;
         case 3:
            var10009 = 172;
            break;
         case 4:
            var10009 = 11;
            break;
         case 5:
            var10009 = 97;
            break;
         default:
            var10009 = 157;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
