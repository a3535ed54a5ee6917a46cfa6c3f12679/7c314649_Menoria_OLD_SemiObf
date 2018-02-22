
// $FF: renamed from: uv
final class class_1688 {

   // $FF: renamed from: b int[]
   static final int[] field_8815;
   // $FF: renamed from: c java.lang.String
   private static final String field_8816 = "CL_00001455";


   // $FF: renamed from: <init> () void
   void method_9309() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9310() {
      boolean var10000 = true;
      char[] var10003 = "çÅ39>v¯6".toCharArray();
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
            field_8816 = (new String((char[])var8)).intern();
            String var6 = field_8816;
            field_8815 = new int[class_913.values().length];

            try {
               field_8815[class_913.field_4598.ordinal()] = 1;
            } catch (NoSuchFieldError var4) {
               ;
            }

            try {
               field_8815[class_913.field_4599.ordinal()] = 2;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_8815[class_913.field_4600.ordinal()] = 3;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var8)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 230;
            break;
         case 1:
            var10009 = 10;
            break;
         case 2:
            var10009 = 59;
            break;
         case 3:
            var10009 = 162;
            break;
         case 4:
            var10009 = 11;
            break;
         case 5:
            var10009 = 168;
            break;
         default:
            var10009 = 175;
         }

         ((Object[])var8)[var0] = (char)(var10007 ^ var9 ^ var10009);
         ++var0;
      }
   }
}
