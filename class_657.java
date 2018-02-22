import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

// $FF: renamed from: AU
final class class_657 extends URLStreamHandler {

   // $FF: renamed from: a java.lang.String
   private static final String field_2820 = "CL_00001143";
   // $FF: renamed from: b bqx
   final bqx field_2821;


   // $FF: renamed from: <init> (bqx) void
   void method_3561(bqx var1) {
      this.field_2821 = var1;
      super();
   }

   protected URLConnection openConnection(URL var1) {
      class_656 var10000 = new class_656;
      var10000.method_3559(this, var1);
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3562() {
      boolean var10000 = true;
      char[] var10003 = "[¥DÏlå0¦".toCharArray();
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
            field_2820 = (new String((char[])var4)).intern();
            String var2 = field_2820;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 250;
            break;
         case 1:
            var10009 = 115;
            break;
         case 2:
            var10009 = 163;
            break;
         case 3:
            var10009 = 50;
            break;
         case 4:
            var10009 = 17;
            break;
         case 5:
            var10009 = 211;
            break;
         default:
            var10009 = 88;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
