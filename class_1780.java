
// $FF: renamed from: xU
final class class_1780 implements class_82 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9293 = "CL_00001541";


   // $FF: renamed from: <init> () void
   void method_9778() {
      super();
   }

   // $FF: renamed from: b (sa) boolean
   public boolean method_402(class_689 var1) {
      return var1.method_3917();
   }

   // $FF: renamed from: <clinit> () void
   static void method_403() {
      boolean var10000 = true;
      char[] var10003 = "s 8ôäµ\r\nk9".toCharArray();
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
            field_9293 = (new String((char[])var4)).intern();
            String var2 = field_9293;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 13;
            break;
         case 1:
            var10009 = 14;
            break;
         case 2:
            var10009 = 110;
            break;
         case 3:
            var10009 = 57;
            break;
         case 4:
            var10009 = 245;
            break;
         case 5:
            var10009 = 229;
            break;
         default:
            var10009 = 180;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
