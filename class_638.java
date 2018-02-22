
// $FF: renamed from: AF
public class class_638 extends class_637 {

   // $FF: renamed from: h java.lang.String
   private static final String field_2772 = "commands.generic.notFound";


   // $FF: renamed from: <init> () void
   public void method_3517() {
      this.method_3515("commands.generic.notFound", new Object[0]);
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.Object[]) void
   public void method_3515(String var1, Object ... var2) {
      super.method_3515(var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3518() {
      boolean var10000 = true;
      char[] var10003 = "óÐÎ!GÀã@ÚÆ.LÖù\rÍ/]âÿÓÇ".toCharArray();
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
            field_2772 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 164;
            break;
         case 1:
            var10009 = 90;
            break;
         case 2:
            var10009 = 137;
            break;
         case 3:
            var10009 = 151;
            break;
         case 4:
            var10009 = 116;
            break;
         case 5:
            var10009 = 29;
            break;
         default:
            var10009 = 144;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
