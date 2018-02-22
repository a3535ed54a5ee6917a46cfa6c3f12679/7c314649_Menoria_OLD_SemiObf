
// $FF: renamed from: y4
class class_1778 {

   // $FF: renamed from: b yh
   public class_1727 field_9286;
   // $FF: renamed from: c int
   public int field_9287;
   // $FF: renamed from: d java.lang.String
   private static final String field_9288 = "CL_00001589";
   // $FF: renamed from: e y3
   final class_1776 field_9289;


   // $FF: renamed from: <init> (y3, int, yh) void
   public void method_9775(class_1776 var1, int var2, class_1727 var3) {
      this.field_9289 = var1;
      super();
      this.field_9287 = var2;
      this.field_9286 = var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9776() {
      boolean var10000 = true;
      char[] var10003 = "µ¤¯H~®ÇÝÈA".toCharArray();
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
            field_9288 = (new String((char[])var4)).intern();
            String var2 = field_9288;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 13;
            break;
         case 1:
            var10009 = 19;
            break;
         case 2:
            var10009 = 11;
            break;
         case 3:
            var10009 = 131;
            break;
         case 4:
            var10009 = 181;
            break;
         case 5:
            var10009 = 207;
            break;
         default:
            var10009 = 101;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
