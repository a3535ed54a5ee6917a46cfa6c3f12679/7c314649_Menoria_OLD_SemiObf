
// $FF: renamed from: kD
final class class_1312 {

   // $FF: renamed from: b int[]
   static final int[] field_6730;
   // $FF: renamed from: c java.lang.String
   private static final String field_6731 = "CL_00000638";


   // $FF: renamed from: <init> () void
   void method_6917() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6918() {
      boolean var10000 = true;
      char[] var10003 = "þéÊº¹Õ¦²".toCharArray();
      Object var10004 = var10003.length;
      Object var7 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var8 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6731 = (new String((char[])var7)).intern();
            String var5 = field_6731;
            field_6730 = new int[class_100.values().length];

            try {
               field_6730[class_100.field_86.ordinal()] = 1;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_6730[class_100.field_85.ordinal()] = 2;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var7)[var0];
         byte var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 14;
            break;
         case 1:
            var10009 = 22;
            break;
         case 2:
            var10009 = 38;
            break;
         case 3:
            var10009 = 57;
            break;
         case 4:
            var10009 = 58;
            break;
         case 5:
            var10009 = 86;
            break;
         default:
            var10009 = 8;
         }

         ((Object[])var7)[var0] = (char)(var10007 ^ var8 ^ var10009);
         ++var0;
      }
   }
}
