
// $FF: renamed from: mL
final class class_1374 {

   // $FF: renamed from: b int[]
   static final int[] field_7296;
   // $FF: renamed from: c int[]
   static final int[] field_7297;
   // $FF: renamed from: d int[]
   static final int[] field_7298;
   // $FF: renamed from: e java.lang.String
   private static final String field_7299 = "CL_00001839";


   // $FF: renamed from: <init> () void
   void method_7499() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7500() {
      boolean var10000 = true;
      char[] var10003 = "Û¸ÚfS2¨©Ì¶o".toCharArray();
      Object var10004 = var10003.length;
      Object var15 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var16 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7299 = (new String((char[])var15)).intern();
            String var13 = field_7299;
            field_7298 = new int[class_904.values().length];

            try {
               field_7298[class_904.field_4441.ordinal()] = 1;
            } catch (NoSuchFieldError var12) {
               ;
            }

            try {
               field_7298[class_904.field_4440.ordinal()] = 2;
            } catch (NoSuchFieldError var11) {
               ;
            }

            field_7297 = new int[class_929.values().length];

            try {
               field_7297[class_929.field_4723.ordinal()] = 1;
            } catch (NoSuchFieldError var10) {
               ;
            }

            try {
               field_7297[class_929.field_4724.ordinal()] = 2;
            } catch (NoSuchFieldError var9) {
               ;
            }

            field_7296 = new int[class_104.values().length];

            try {
               field_7296[class_104.field_161.ordinal()] = 1;
            } catch (NoSuchFieldError var8) {
               ;
            }

            try {
               field_7296[class_104.field_162.ordinal()] = 2;
            } catch (NoSuchFieldError var7) {
               ;
            }

            try {
               field_7296[class_104.field_160.ordinal()] = 3;
            } catch (NoSuchFieldError var6) {
               ;
            }

            try {
               field_7296[class_104.field_158.ordinal()] = 4;
            } catch (NoSuchFieldError var5) {
               ;
            }

            try {
               field_7296[class_104.field_165.ordinal()] = 5;
            } catch (NoSuchFieldError var4) {
               ;
            }

            try {
               field_7296[class_104.field_156.ordinal()] = 6;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_7296[class_104.field_164.ordinal()] = 7;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var15)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 118;
            break;
         case 1:
            var10009 = 26;
            break;
         case 2:
            var10009 = 107;
            break;
         case 3:
            var10009 = 184;
            break;
         case 4:
            var10009 = 141;
            break;
         case 5:
            var10009 = 236;
            break;
         default:
            var10009 = 118;
         }

         ((Object[])var15)[var0] = (char)(var10007 ^ var16 ^ var10009);
         ++var0;
      }
   }
}
