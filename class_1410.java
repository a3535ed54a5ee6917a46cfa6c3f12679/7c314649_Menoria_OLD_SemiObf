import java.util.concurrent.Callable;

// $FF: renamed from: nV
class class_1410 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7515 = "CL_00000948";
   // $FF: renamed from: b blt
   final blt field_7516;


   // $FF: renamed from: <init> (blt) void
   void method_7700(blt var1) {
      this.field_7516 = var1;
      super();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_7701() {
      return blt.setFocused3(this.field_7516).enableBackgroundDrawing6.getClass().getCanonicalName();
   }

   // $FF: renamed from: b () java.lang.Object
   public Object method_7702() {
      return this.method_7701();
   }

   public Object call() {
      return this.method_7701();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7703() {
      boolean var10000 = true;
      char[] var10003 = "~üXóãüdô".toCharArray();
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
            field_7515 = (new String((char[])var4)).intern();
            String var2 = field_7515;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 225;
            break;
         case 1:
            var10009 = 112;
            break;
         case 2:
            var10009 = 12;
            break;
         case 3:
            var10009 = 225;
            break;
         case 4:
            var10009 = 69;
            break;
         case 5:
            var10009 = 238;
            break;
         default:
            var10009 = 254;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
