
// $FF: renamed from: vG
public class class_1662 extends class_1661 {

   // $FF: renamed from: a long
   public long field_8650;
   // $FF: renamed from: e java.lang.String
   private static final String field_8651 = "CL_00000154";
   // $FF: renamed from: f dw
   final class_1048 field_8652;


   // $FF: renamed from: <init> (dw, int, int, int, long) void
   public void method_9158(class_1048 var1, int var2, int var3, int var4, long var5) {
      this.field_8652 = var1;
      super.method_9151(var2, var3, var4);
      this.field_8650 = var5;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9157() {
      boolean var10000 = true;
      char[] var10003 = "\bØ¡2ruxÜ".toCharArray();
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
            field_8651 = (new String((char[])var4)).intern();
            String var2 = field_8651;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 184;
            break;
         case 1:
            var10009 = 190;
            break;
         case 2:
            var10009 = 183;
            break;
         case 3:
            var10009 = 18;
            break;
         case 4:
            var10009 = 210;
            break;
         case 5:
            var10009 = 107;
            break;
         default:
            var10009 = 248;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
