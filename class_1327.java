
// $FF: renamed from: kP
final class class_1327 {

   // $FF: renamed from: b int[]
   static final int[] field_6809;
   // $FF: renamed from: c java.lang.String
   private static final String field_6810 = "CL_00000652";


   // $FF: renamed from: <init> () void
   void method_6978() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6979() {
      boolean var10000 = true;
      char[] var10003 = "\nûyã".toCharArray();
      Object var10004 = var10003.length;
      Object var20 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var21 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6810 = (new String((char[])var20)).intern();
            String var18 = field_6810;
            field_6809 = new int[class_101.values().length];

            try {
               field_6809[class_101.field_90.ordinal()] = 1;
            } catch (NoSuchFieldError var17) {
               ;
            }

            try {
               field_6809[class_101.field_96.ordinal()] = 2;
            } catch (NoSuchFieldError var16) {
               ;
            }

            try {
               field_6809[class_101.field_97.ordinal()] = 3;
            } catch (NoSuchFieldError var15) {
               ;
            }

            try {
               field_6809[class_101.field_98.ordinal()] = 4;
            } catch (NoSuchFieldError var14) {
               ;
            }

            try {
               field_6809[class_101.field_100.ordinal()] = 5;
            } catch (NoSuchFieldError var13) {
               ;
            }

            try {
               field_6809[class_101.field_105.ordinal()] = 6;
            } catch (NoSuchFieldError var12) {
               ;
            }

            try {
               field_6809[class_101.field_108.ordinal()] = 7;
            } catch (NoSuchFieldError var11) {
               ;
            }

            try {
               field_6809[class_101.field_109.ordinal()] = 8;
            } catch (NoSuchFieldError var10) {
               ;
            }

            try {
               field_6809[class_101.field_111.ordinal()] = 9;
            } catch (NoSuchFieldError var9) {
               ;
            }

            try {
               field_6809[class_101.field_112.ordinal()] = 10;
            } catch (NoSuchFieldError var8) {
               ;
            }

            try {
               field_6809[class_101.field_113.ordinal()] = 11;
            } catch (NoSuchFieldError var7) {
               ;
            }

            try {
               field_6809[class_101.field_114.ordinal()] = 12;
            } catch (NoSuchFieldError var6) {
               ;
            }

            try {
               field_6809[class_101.field_115.ordinal()] = 13;
            } catch (NoSuchFieldError var5) {
               ;
            }

            try {
               field_6809[class_101.field_116.ordinal()] = 14;
            } catch (NoSuchFieldError var4) {
               ;
            }

            try {
               field_6809[class_101.field_130.ordinal()] = 15;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_6809[class_101.field_123.ordinal()] = 16;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var20)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 45;
            break;
         case 1:
            var10009 = 211;
            break;
         case 2:
            var10009 = 178;
            break;
         case 3:
            var10009 = 213;
            break;
         case 4:
            var10009 = 43;
            break;
         case 5:
            var10009 = 81;
            break;
         default:
            var10009 = 197;
         }

         ((Object[])var20)[var0] = (char)(var10007 ^ var21 ^ var10009);
         ++var0;
      }
   }
}
