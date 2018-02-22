import java.util.concurrent.Callable;

// $FF: renamed from: kH
class class_1316 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6739 = "CL_00000643";
   // $FF: renamed from: b bao
   final bao field_6740;


   // $FF: renamed from: <init> (bao) void
   void method_6929(bao var1) {
      this.field_6740 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6930() {
      return bao.method_5304(this.field_6740);
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_6931() {
      return this.method_6930();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6932() {
      boolean var10000 = true;
      char[] var10003 = "6û^vm]".toCharArray();
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
            field_6739 = (new String((char[])var4)).intern();
            String var2 = field_6739;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 170;
            break;
         case 1:
            var10009 = 183;
            break;
         case 2:
            var10009 = 133;
            break;
         case 3:
            var10009 = 194;
            break;
         case 4:
            var10009 = 39;
            break;
         case 5:
            var10009 = 81;
            break;
         default:
            var10009 = 130;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
