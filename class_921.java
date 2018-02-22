
// $FF: renamed from: c4
final class class_921 implements class_17 {

   // $FF: renamed from: b int
   public int field_4649;
   // $FF: renamed from: c vX
   public class_1691 field_4650;
   // $FF: renamed from: d java.lang.String
   private static final String field_4651 = "CL_00000114";


   // $FF: renamed from: <init> () void
   private void method_5402() {
      super();
   }

   // $FF: renamed from: b (cH, int) void
   public void method_53(class_940 var1, int var2) {
      this.field_4649 += var1.method_5485(var2, this.field_4650);
   }

   // $FF: renamed from: <init> (java.lang.Object) void
   void method_5403(Object var1) {
      this.method_5402();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5404() {
      boolean var10000 = true;
      char[] var10003 = "Årï|êÖ\"¶x".toCharArray();
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
            field_4651 = (new String((char[])var4)).intern();
            String var2 = field_4651;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 102;
            break;
         case 1:
            var10009 = 222;
            break;
         case 2:
            var10009 = 80;
            break;
         case 3:
            var10009 = 172;
            break;
         case 4:
            var10009 = 58;
            break;
         case 5:
            var10009 = 6;
            break;
         default:
            var10009 = 242;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
