import java.util.concurrent.Callable;

// $FF: renamed from: uu
class class_1686 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8805 = "CL_00001454";
   // $FF: renamed from: b r1
   final class_250 field_8806;
   // $FF: renamed from: c us
   final class_1684 field_8807;


   // $FF: renamed from: <init> (us, r1) void
   void method_9298(class_1684 var1, class_250 var2) {
      this.field_8807 = var1;
      this.field_8806 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_9299() {
      return this.field_8806.getClass().getCanonicalName();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9300() {
      boolean var10000 = true;
      char[] var10003 = "N\tÖVH/<icÒ".toCharArray();
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
            field_8805 = (new String((char[])var4)).intern();
            String var2 = field_8805;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 217;
            break;
         case 1:
            var10009 = 137;
            break;
         case 2:
            var10009 = 130;
            break;
         case 3:
            var10009 = 50;
            break;
         case 4:
            var10009 = 178;
            break;
         case 5:
            var10009 = 172;
            break;
         default:
            var10009 = 203;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
