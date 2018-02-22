
// $FF: renamed from: AO
class class_651 extends Thread {

   // $FF: renamed from: a java.lang.String
   private static final String field_2803 = "CL_00001810";
   // $FF: renamed from: b AN
   final class_650 field_2804;


   // $FF: renamed from: <init> (AN, java.lang.String) void
   void method_3547(class_650 var1, String var2) {
      this.field_2804 = var1;
      super(var2);
   }

   public void run() {
      this.field_2804.field_2801.method_191();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3548() {
      boolean var10000 = true;
      char[] var10003 = "ÁâaHët³÷a".toCharArray();
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
            field_2803 = (new String((char[])var4)).intern();
            String var2 = field_2803;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 234;
            break;
         case 1:
            var10009 = 167;
            break;
         case 2:
            var10009 = 213;
            break;
         case 3:
            var10009 = 57;
            break;
         case 4:
            var10009 = 16;
            break;
         case 5:
            var10009 = 179;
            break;
         default:
            var10009 = 44;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
