
// $FF: renamed from: AB
public class class_642 extends class_637 {

   // $FF: renamed from: h java.lang.String
   private static final String field_2775 = "commands.generic.num.invalid";


   // $FF: renamed from: <init> () void
   public void method_3523() {
      this.method_3515("commands.generic.num.invalid", new Object[0]);
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.Object[]) void
   public void method_3515(String var1, Object ... var2) {
      super.method_3515(var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3524() {
      boolean var10000 = true;
      char[] var10003 = "j|ÝÀ z=×È¯`pÃ´Z`}ÆÌ­".toCharArray();
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
            field_2775 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 74;
            break;
         case 1:
            var10009 = 80;
            break;
         case 2:
            var10009 = 243;
            break;
         case 3:
            var10009 = 238;
            break;
         case 4:
            var10009 = 130;
            break;
         case 5:
            var10009 = 186;
            break;
         default:
            var10009 = 55;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
