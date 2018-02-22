import java.util.Random;

// $FF: renamed from: i0
class class_1197 extends class_1195 {

   // $FF: renamed from: a java.lang.String
   private static final String field_6222 = "CL_00000478";


   // $FF: renamed from: <init> () void
   private void method_6429() {
      super.method_6422();
   }

   // $FF: renamed from: b (java.util.Random, int, int, int, boolean) void
   public void method_6423(Random var1, int var2, int var3, int var4, boolean var5) {
      label16: {
         String[] var6 = class_752.method_4253();
         if(var6 != null) {
            if(var1.nextFloat() >= 0.4F) {
               break label16;
            }

            this.field_6219 = class_1192.field_6029;
         }

         if(var6 != null) {
            return;
         }
      }

      this.field_6219 = class_1192.field_6075;
   }

   // $FF: renamed from: <init> (java.lang.Object) void
   void method_6430(Object var1) {
      this.method_6429();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6431() {
      boolean var10000 = true;
      char[] var10003 = "/?Ù,¹Bh\\G±$".toCharArray();
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
            field_6222 = (new String((char[])var4)).intern();
            String var2 = field_6222;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 79;
            break;
         case 1:
            var10009 = 80;
            break;
         case 2:
            var10009 = 165;
            break;
         case 3:
            var10009 = 63;
            break;
         case 4:
            var10009 = 170;
            break;
         case 5:
            var10009 = 81;
            break;
         default:
            var10009 = 123;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
