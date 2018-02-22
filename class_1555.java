
// $FF: renamed from: qu
final class class_1555 {

   // $FF: renamed from: b int[]
   static final int[] field_8160;
   // $FF: renamed from: c java.lang.String
   private static final String field_8161 = "CL_00001821";


   // $FF: renamed from: <init> () void
   void method_8476() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8477() {
      boolean var10000 = true;
      char[] var10003 = "X°9¨ú*ÄT".toCharArray();
      Object var10004 = var10003.length;
      Object var16 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var17 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8161 = (new String((char[])var16)).intern();
            String var14 = field_8161;
            field_8160 = new int[class_901.values().length];

            try {
               field_8160[class_901.enabledColor7.ordinal()] = 1;
            } catch (NoSuchFieldError var13) {
               ;
            }

            try {
               field_8160[class_901.enabledColor9.ordinal()] = 2;
            } catch (NoSuchFieldError var12) {
               ;
            }

            try {
               field_8160[class_901.disabledColor1.ordinal()] = 3;
            } catch (NoSuchFieldError var11) {
               ;
            }

            try {
               field_8160[class_901.disabledColor3.ordinal()] = 4;
            } catch (NoSuchFieldError var10) {
               ;
            }

            try {
               field_8160[class_901.disabledColor5.ordinal()] = 5;
            } catch (NoSuchFieldError var9) {
               ;
            }

            try {
               field_8160[class_901.disabledColor0.ordinal()] = 6;
            } catch (NoSuchFieldError var8) {
               ;
            }

            try {
               field_8160[class_901.enabledColor6.ordinal()] = 7;
            } catch (NoSuchFieldError var7) {
               ;
            }

            try {
               field_8160[class_901.enabledColor5.ordinal()] = 8;
            } catch (NoSuchFieldError var6) {
               ;
            }

            try {
               field_8160[class_901.enabledColor4.ordinal()] = 9;
            } catch (NoSuchFieldError var5) {
               ;
            }

            try {
               field_8160[class_901.disabledColor7.ordinal()] = 10;
            } catch (NoSuchFieldError var4) {
               ;
            }

            try {
               field_8160[class_901.disabledColor6.ordinal()] = 11;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_8160[class_901.disabledColor4.ordinal()] = 12;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var16)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 169;
            break;
         case 1:
            var10009 = 78;
            break;
         case 2:
            var10009 = 212;
            break;
         case 3:
            var10009 = 4;
            break;
         case 4:
            var10009 = 42;
            break;
         case 5:
            var10009 = 155;
            break;
         default:
            var10009 = 120;
         }

         ((Object[])var16)[var0] = (char)(var10007 ^ var17 ^ var10009);
         ++var0;
      }
   }
}
