
// $FF: renamed from: iV
public abstract class class_1119 extends class_1116 {

   // $FF: renamed from: h java.lang.String
   private static final String field_5822 = "CL_00000532";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int) void
   protected void method_6266(class_1118 var1, int var2) {
      super.method_6266(var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "hy­u|".toCharArray();
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
            field_5822 = (new String((char[])var4)).intern();
            String var2 = field_5822;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 207;
            break;
         case 1:
            var10009 = 174;
            break;
         case 2:
            var10009 = 197;
            break;
         case 3:
            var10009 = 189;
            break;
         case 4:
            var10009 = 195;
            break;
         case 5:
            var10009 = 23;
            break;
         default:
            var10009 = 56;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
