
// $FF: renamed from: u9
final class class_1615 implements class_71 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8417 = "CL_00001476";


   // $FF: renamed from: <init> () void
   void method_8825() {
      super();
   }

   // $FF: renamed from: b (int) java.lang.String
   public String method_364(int var1) {
      return class_1601.method_8759().format((double)var1 * 0.1D);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8826() {
      boolean var10000 = true;
      char[] var10003 = "à¹®©Bä¿".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8417 = (new String((char[])var4)).intern();
            String var2 = field_8417;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 226;
            break;
         case 1:
            var10009 = 114;
            break;
         case 2:
            var10009 = 146;
            break;
         case 3:
            var10009 = 200;
            break;
         case 4:
            var10009 = 223;
            break;
         case 5:
            var10009 = 216;
            break;
         default:
            var10009 = 51;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
