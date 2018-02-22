
// $FF: renamed from: zb
class class_1850 {

   // $FF: renamed from: b sv
   public class_752 field_9445;
   // $FF: renamed from: c int
   public int field_9446;
   // $FF: renamed from: d java.lang.String
   private static final String field_9447 = "CL_00001632";
   // $FF: renamed from: e za
   final class_1849 field_9448;


   // $FF: renamed from: <init> (za, sv, int) void
   void method_10031(class_1849 var1, class_752 var2, int var3) {
      this.field_9448 = var1;
      super();
      this.field_9445 = var2;
      this.field_9446 = var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_10032() {
      boolean var10000 = true;
      char[] var10003 = "l(ë©×zÓR«".toCharArray();
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
            field_9447 = (new String((char[])var4)).intern();
            String var2 = field_9447;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 189;
            break;
         case 1:
            var10009 = 246;
            break;
         case 2:
            var10009 = 38;
            break;
         case 3:
            var10009 = 11;
            break;
         case 4:
            var10009 = 117;
            break;
         case 5:
            var10009 = 216;
            break;
         default:
            var10009 = 113;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
