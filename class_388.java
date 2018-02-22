import java.util.Random;

// $FF: renamed from: es
public class class_388 extends aji {

   // $FF: renamed from: M java.lang.String
   private static final String field_2074 = "CL_00000206";


   // $FF: renamed from: <init> () void
   public void method_2604() {
      super.method_2427(awt.field_4173);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      IIcon var4;
      label17: {
         String[] var3 = class_752.method_4253();
         int var10000 = var1;
         if(var3 != null) {
            if(var1 == 1) {
               break label17;
            }

            var10000 = var1;
         }

         if(var10000 != 0) {
            var4 = super.method_2448(var1, var2);
            return var4;
         }
      }

      var4 = class_1192.field_6030.getBlockTextureFromSide(var1);
      return var4;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 3;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5198;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "%·-é\"ø³VÉBï".toCharArray();
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
            field_2074 = (new String((char[])var4)).intern();
            String var2 = field_2074;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 210;
            break;
         case 1:
            var10009 = 79;
            break;
         case 2:
            var10009 = 198;
            break;
         case 3:
            var10009 = 109;
            break;
         case 4:
            var10009 = 166;
            break;
         case 5:
            var10009 = 124;
            break;
         default:
            var10009 = 55;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
