import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

// $FF: renamed from: AT
class class_656 extends URLConnection {

   // $FF: renamed from: a java.lang.String
   private static final String field_2818 = "CL_00001144";
   // $FF: renamed from: b AU
   final class_657 field_2819;


   // $FF: renamed from: <init> (AU, java.net.URL) void
   void method_3559(class_657 var1, URL var2) {
      this.field_2819 = var1;
      super(var2);
   }

   public void connect() {}

   public InputStream getInputStream() {
      return bao.method_5273().method_5289().method_224(this.field_2819.field_2821).method_234();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3560() {
      boolean var10000 = true;
      char[] var10003 = "§Rí\"5Õ/qé".toCharArray();
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
            field_2818 = (new String((char[])var4)).intern();
            String var2 = field_2818;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 76;
            break;
         case 1:
            var10009 = 182;
            break;
         case 2:
            var10009 = 237;
            break;
         case 3:
            var10009 = 117;
            break;
         case 4:
            var10009 = 186;
            break;
         case 5:
            var10009 = 29;
            break;
         default:
            var10009 = 173;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
