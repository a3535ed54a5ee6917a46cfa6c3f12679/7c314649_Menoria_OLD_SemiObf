
// $FF: renamed from: AE
public class class_639 extends class_637 {

   // $FF: renamed from: h java.lang.String
   private static final String field_2773 = "commands.generic.player.notFound";


   // $FF: renamed from: <init> () void
   public void method_3519() {
      this.method_3515("commands.generic.player.notFound", new Object[0]);
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.Object[]) void
   public void method_3515(String var1, Object ... var2) {
      super.method_3515(var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3520() {
      boolean var10000 = true;
      char[] var10003 = ")aÉ¬PA9 Ã¤[W#m±_\\/|¯Jc%{Ê¥".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2773 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 123;
            break;
         case 1:
            var10009 = 63;
            break;
         case 2:
            var10009 = 149;
            break;
         case 3:
            var10009 = 240;
            break;
         case 4:
            var10009 = 198;
            break;
         case 5:
            var10009 = 15;
            break;
         default:
            var10009 = 20;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
