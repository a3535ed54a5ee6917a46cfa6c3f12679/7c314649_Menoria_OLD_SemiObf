
// $FF: renamed from: rC
abstract class class_1522 {

   // $FF: renamed from: b java.lang.String
   protected String field_8003;
   // $FF: renamed from: c java.lang.String
   private static final String field_8004 = "CL_00001233";


   // $FF: renamed from: <init> () void
   void method_8262() {
      super();
   }

   // $FF: renamed from: b () rm
   public abstract class_1571 method_8263();

   // $FF: renamed from: <clinit> () void
   static void method_8264() {
      boolean var10000 = true;
      char[] var10003 = "óð¿H,^ÓK".toCharArray();
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
            field_8004 = (new String((char[])var4)).intern();
            String var2 = field_8004;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 120;
            break;
         case 1:
            var10009 = 116;
            break;
         case 2:
            var10009 = 40;
            break;
         case 3:
            var10009 = 176;
            break;
         case 4:
            var10009 = 212;
            break;
         case 5:
            var10009 = 166;
            break;
         default:
            var10009 = 246;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
