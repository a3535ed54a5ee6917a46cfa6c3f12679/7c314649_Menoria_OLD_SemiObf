import java.util.Random;

// $FF: renamed from: dL
class class_996 extends class_994 {

   // $FF: renamed from: aG java.lang.String
   private static final String field_5074 = "CL_00000172";
   // $FF: renamed from: aH dD
   final class_1003 field_5075;


   // $FF: renamed from: <init> (dD, int, dz) void
   void method_5730(class_1003 var1, int var2, class_985 var3) {
      this.field_5075 = var1;
      super.method_5729(var2, var3);
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      this.field_5071.method_5714(var1, var2, var3, var4);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "=æó÷s?".toCharArray();
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
            field_5074 = (new String((char[])var4)).intern();
            String var2 = field_5074;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 37;
            break;
         case 1:
            var10009 = 32;
            break;
         case 2:
            var10009 = 162;
            break;
         case 3:
            var10009 = 235;
            break;
         case 4:
            var10009 = 193;
            break;
         case 5:
            var10009 = 89;
            break;
         default:
            var10009 = 48;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
