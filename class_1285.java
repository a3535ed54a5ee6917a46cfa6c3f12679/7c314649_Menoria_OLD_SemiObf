import java.util.concurrent.Callable;

// $FF: renamed from: jG
final class class_1285 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6591 = "CL_00000560";
   // $FF: renamed from: b int
   final int field_6592;


   // $FF: renamed from: <init> (int) void
   void method_6717(int var1) {
      this.field_6592 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6718() {
      return String.valueOf(class_985.method_5725(this.field_6592));
   }

   // $FF: renamed from: <clinit> () void
   static void method_6719() {
      boolean var10000 = true;
      char[] var10003 = "@7+4`3NB".toCharArray();
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
            field_6591 = (new String((char[])var4)).intern();
            String var2 = field_6591;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 60;
            break;
         case 1:
            var10009 = 68;
            break;
         case 2:
            var10009 = 75;
            break;
         case 3:
            var10009 = 130;
            break;
         case 4:
            var10009 = 59;
            break;
         case 5:
            var10009 = 135;
            break;
         default:
            var10009 = 111;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
