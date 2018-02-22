
// $FF: renamed from: gW
public class class_1091 extends class_1089 {

   // $FF: renamed from: m java.lang.String
   private static final String field_5743 = "Overworld";


   // $FF: renamed from: <init> () void
   public void method_6160() {
      super.method_6160();
   }

   // $FF: renamed from: m () java.lang.String
   public String method_6180() {
      return "Overworld";
   }

   // $FF: renamed from: <clinit> () void
   static void method_6181() {
      boolean var10000 = true;
      char[] var10003 = "û\tZîf¶Ø".toCharArray();
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
            field_5743 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 194;
            break;
         case 1:
            var10009 = 9;
            break;
         case 2:
            var10009 = 73;
            break;
         case 3:
            var10009 = 234;
            break;
         case 4:
            var10009 = 103;
            break;
         case 5:
            var10009 = 131;
            break;
         default:
            var10009 = 178;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
