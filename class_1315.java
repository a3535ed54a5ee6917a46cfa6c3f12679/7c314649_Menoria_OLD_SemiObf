import java.util.concurrent.Callable;

// $FF: renamed from: kG
class class_1315 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6737 = "CL_00000642";
   // $FF: renamed from: b bao
   final bao field_6738;


   // $FF: renamed from: <init> (bao) void
   void method_6925(bao var1) {
      this.field_6738 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6926() {
      return this.field_6738.enableBackgroundDrawing6.getClass().getCanonicalName();
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_6927() {
      return this.method_6926();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6928() {
      boolean var10000 = true;
      char[] var10003 = "ã+@üî÷á".toCharArray();
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
            field_6737 = (new String((char[])var4)).intern();
            String var2 = field_6737;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 52;
            break;
         case 1:
            var10009 = 32;
            break;
         case 2:
            var10009 = 59;
            break;
         case 3:
            var10009 = 43;
            break;
         case 4:
            var10009 = 227;
            break;
         case 5:
            var10009 = 83;
            break;
         default:
            var10009 = 136;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
