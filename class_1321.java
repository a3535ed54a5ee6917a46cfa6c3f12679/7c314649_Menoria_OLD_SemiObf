
// $FF: renamed from: jk
final class class_1321 {

   // $FF: renamed from: b int[]
   static final int[] field_6789;
   // $FF: renamed from: c java.lang.String
   private static final String field_6790 = "CL_00000548";


   // $FF: renamed from: <init> () void
   void method_6950() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6951() {
      boolean var10000 = true;
      char[] var10003 = "Ø= uò«De\b".toCharArray();
      Object var10004 = var10003.length;
      Object var8 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var9 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6790 = (new String((char[])var8)).intern();
            String var6 = field_6790;
            field_6789 = new int[class_99.values().length];

            try {
               field_6789[class_99.field_78.ordinal()] = 1;
            } catch (NoSuchFieldError var4) {
               ;
            }

            try {
               field_6789[class_99.field_79.ordinal()] = 2;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_6789[class_99.field_80.ordinal()] = 3;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var8)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 49;
            break;
         case 1:
            var10009 = 219;
            break;
         case 2:
            var10009 = 251;
            break;
         case 3:
            var10009 = 154;
            break;
         case 4:
            var10009 = 6;
            break;
         case 5:
            var10009 = 239;
            break;
         default:
            var10009 = 104;
         }

         ((Object[])var8)[var0] = (char)(var10007 ^ var9 ^ var10009);
         ++var0;
      }
   }
}
