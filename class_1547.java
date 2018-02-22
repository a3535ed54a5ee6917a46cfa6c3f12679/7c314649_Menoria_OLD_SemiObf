
// $FF: renamed from: qo
final class class_1547 {

   // $FF: renamed from: b int[]
   static final int[] field_8110;
   // $FF: renamed from: c java.lang.String
   private static final String field_8111 = "CL_00001150";


   // $FF: renamed from: <init> () void
   void method_8405() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8406() {
      boolean var10000 = true;
      char[] var10003 = "ÙL\'\'å«1M".toCharArray();
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
            field_8111 = (new String((char[])var7)).intern();
            String var5 = field_8111;
            field_8110 = new int[class_107.values().length];

            try {
               field_8110[class_107.field_188.ordinal()] = 1;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_8110[class_107.field_189.ordinal()] = 2;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var7)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 45;
            break;
         case 1:
            var10009 = 183;
            break;
         case 2:
            var10009 = 207;
            break;
         case 3:
            var10009 = 147;
            break;
         case 4:
            var10009 = 160;
            break;
         case 5:
            var10009 = 12;
            break;
         default:
            var10009 = 98;
         }

         ((Object[])var7)[var0] = (char)(var10007 ^ var8 ^ var10009);
         ++var0;
      }
   }
}
