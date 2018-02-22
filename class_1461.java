import java.util.Random;

// $FF: renamed from: qZ
final class class_1461 extends class_1460 {

   // $FF: renamed from: a java.lang.String
   private static final String field_7731 = "CL_00001412";


   // $FF: renamed from: <init> () void
   void method_7939() {
      super.method_7939();
   }

   // $FF: renamed from: a (qH, add) add
   public add method_7940(class_48 var1, add var2) {
      class_905 var3 = class_484.method_2849(var1.method_186());
      class_45 var4 = class_484.method_2848(var1);
      double var5 = var4.method_179() + (double)((float)var3.method_5322() * 0.3F);
      double var7 = var4.method_180() + (double)((float)var3.method_5322() * 0.3F);
      double var9 = var4.method_181() + (double)((float)var3.method_5324() * 0.3F);
      ahb var11 = var1.method_182();
      Random var12 = var11.field_1819;
      double var13 = var12.nextGaussian() * 0.05D + (double)var3.method_5322();
      double var15 = var12.nextGaussian() * 0.05D + (double)var3.method_5323();
      double var17 = var12.nextGaussian() * 0.05D + (double)var3.method_5324();
      class_710 var10001 = new class_710;
      var10001.method_4064(var11, var5, var7, var9, var13, var15, var17);
      var11.method_2089(var10001);
      var2.method_3729(1);
      return var2;
   }

   // $FF: renamed from: b (qH) void
   protected void method_7942(class_48 var1) {
      var1.method_182().method_2210(1009, var1.method_183(), var1.method_184(), var1.method_185(), 0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_177() {
      boolean var10000 = true;
      char[] var10003 = "¶ÐyÿëØÒ".toCharArray();
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
            field_7731 = (new String((char[])var4)).intern();
            String var2 = field_7731;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 67;
            break;
         case 1:
            var10009 = 82;
            break;
         case 2:
            var10009 = 100;
            break;
         case 3:
            var10009 = 109;
            break;
         case 4:
            var10009 = 186;
            break;
         case 5:
            var10009 = 51;
            break;
         default:
            var10009 = 196;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
