import java.util.Random;

// $FF: renamed from: dK
class class_997 extends class_994 {

   // $FF: renamed from: aG java.lang.String
   private static final String field_5076 = "CL_00001861";
   // $FF: renamed from: aH dD
   final class_1003 field_5077;


   // $FF: renamed from: <init> (dD, int, dz) void
   void method_5731(class_1003 var1, int var2, class_985 var3) {
      this.field_5077 = var1;
      super.method_5729(var2, var3);
   }

   // $FF: renamed from: b (java.util.Random) hd
   public class_1162 method_5696(Random var1) {
      return var1.nextBoolean()?class_1003.field_5096:class_1003.field_5097;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "Lãj*\"ï>+".toCharArray();
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
            field_5076 = (new String((char[])var4)).intern();
            String var2 = field_5076;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 103;
            break;
         case 1:
            var10009 = 199;
            break;
         case 2:
            var10009 = 93;
            break;
         case 3:
            var10009 = 114;
            break;
         case 4:
            var10009 = 122;
            break;
         case 5:
            var10009 = 94;
            break;
         default:
            var10009 = 183;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
