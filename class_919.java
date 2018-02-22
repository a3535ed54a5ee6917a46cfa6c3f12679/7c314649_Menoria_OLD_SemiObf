
// $FF: renamed from: c3
final class class_919 implements class_17 {

   // $FF: renamed from: b float
   public float field_4636;
   // $FF: renamed from: c at
   public class_923 field_4637;
   // $FF: renamed from: d java.lang.String
   private static final String field_4638 = "CL_00000112";


   // $FF: renamed from: <init> () void
   private void method_5396() {
      super();
   }

   // $FF: renamed from: b (cH, int) void
   public void method_53(class_940 var1, int var2) {
      this.field_4636 += var1.method_5486(var2, this.field_4637);
   }

   // $FF: renamed from: <init> (java.lang.Object) void
   void method_5397(Object var1) {
      this.method_5396();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5398() {
      boolean var10000 = true;
      char[] var10003 = "5ñÍ`nHó".toCharArray();
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
            field_4638 = (new String((char[])var4)).intern();
            String var2 = field_4638;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 11;
            break;
         case 1:
            var10009 = 44;
            break;
         case 2:
            var10009 = 117;
            break;
         case 3:
            var10009 = 148;
            break;
         case 4:
            var10009 = 168;
            break;
         case 5:
            var10009 = 5;
            break;
         default:
            var10009 = 255;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
