
// $FF: renamed from: hZ
final class class_1253 {

   // $FF: renamed from: b int[]
   static final int[] field_6500;
   // $FF: renamed from: c java.lang.String
   private static final String field_6501 = "CL_00000486";


   // $FF: renamed from: <init> () void
   void method_6602() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6603() {
      boolean var10000 = true;
      char[] var10003 = "Àò_Åöª³sY".toCharArray();
      Object var10004 = var10003.length;
      Object var9 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var10 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6501 = (new String((char[])var9)).intern();
            String var7 = field_6501;
            field_6500 = new int[class_98.values().length];

            try {
               field_6500[class_98.field_71.ordinal()] = 1;
            } catch (NoSuchFieldError var5) {
               ;
            }

            try {
               field_6500[class_98.field_72.ordinal()] = 2;
            } catch (NoSuchFieldError var4) {
               ;
            }

            try {
               field_6500[class_98.field_73.ordinal()] = 3;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_6500[class_98.field_74.ordinal()] = 4;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var9)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 143;
            break;
         case 1:
            var10009 = 178;
            break;
         case 2:
            var10009 = 71;
            break;
         case 3:
            var10009 = 99;
            break;
         case 4:
            var10009 = 249;
            break;
         case 5:
            var10009 = 202;
            break;
         default:
            var10009 = 150;
         }

         ((Object[])var9)[var0] = (char)(var10007 ^ var10 ^ var10009);
         ++var0;
      }
   }
}
