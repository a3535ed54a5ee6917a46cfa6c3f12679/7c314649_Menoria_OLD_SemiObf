
// $FF: renamed from: xQ
final class class_1774 {

   // $FF: renamed from: b int[]
   static final int[] field_9261;
   // $FF: renamed from: c java.lang.String
   private static final String field_9262 = "CL_00001536";


   // $FF: renamed from: <init> () void
   void method_9749() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9750() {
      boolean var10000 = true;
      char[] var10003 = "üÃ©âófºÅ".toCharArray();
      Object var10004 = var10003.length;
      Object var11 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var12 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_9262 = (new String((char[])var11)).intern();
            String var9 = field_9262;
            field_9261 = new int[class_920.values().length];

            try {
               field_9261[class_920.field_4639.ordinal()] = 1;
            } catch (NoSuchFieldError var7) {
               ;
            }

            try {
               field_9261[class_920.field_4640.ordinal()] = 2;
            } catch (NoSuchFieldError var6) {
               ;
            }

            try {
               field_9261[class_920.field_4641.ordinal()] = 3;
            } catch (NoSuchFieldError var5) {
               ;
            }

            try {
               field_9261[class_920.field_4642.ordinal()] = 4;
            } catch (NoSuchFieldError var4) {
               ;
            }

            try {
               field_9261[class_920.field_4643.ordinal()] = 5;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_9261[class_920.field_4644.ordinal()] = 6;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var11)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 22;
            break;
         case 1:
            var10009 = 38;
            break;
         case 2:
            var10009 = 95;
            break;
         case 3:
            var10009 = 26;
            break;
         case 4:
            var10009 = 123;
            break;
         case 5:
            var10009 = 106;
            break;
         default:
            var10009 = 255;
         }

         ((Object[])var11)[var0] = (char)(var10007 ^ var12 ^ var10009);
         ++var0;
      }
   }
}
