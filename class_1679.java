
// $FF: renamed from: un
final class class_1679 {

   // $FF: renamed from: b int[]
   static final int[] field_8753;
   // $FF: renamed from: c java.lang.String
   private static final String field_8754 = "CL_00001446";


   // $FF: renamed from: <init> () void
   void method_9249() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9250() {
      boolean var10000 = true;
      char[] var10003 = "pÖóôÿ®ò".toCharArray();
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
            field_8754 = (new String((char[])var7)).intern();
            String var5 = field_8754;
            field_8753 = new int[class_906.values().length];

            try {
               field_8753[class_906.field_4462.ordinal()] = 1;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_8753[class_906.field_4461.ordinal()] = 2;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var7)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 235;
            break;
         case 1:
            var10009 = 66;
            break;
         case 2:
            var10009 = 116;
            break;
         case 3:
            var10009 = 28;
            break;
         case 4:
            var10009 = 248;
            break;
         case 5:
            var10009 = 121;
            break;
         default:
            var10009 = 23;
         }

         ((Object[])var7)[var0] = (char)(var10007 ^ var8 ^ var10009);
         ++var0;
      }
   }
}
