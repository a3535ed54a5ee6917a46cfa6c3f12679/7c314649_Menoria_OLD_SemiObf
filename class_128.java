import java.io.File;
import java.io.FileNotFoundException;

// $FF: renamed from: t
public class class_128 extends FileNotFoundException {

   // $FF: renamed from: h java.lang.String
   private static final String field_271 = "\'%s\' in ResourcePack \'%s\'";


   // $FF: renamed from: <init> (java.io.File, java.lang.String) void
   public void method_588(File var1, String var2) {
      super(String.format("\'%s\' in ResourcePack \'%s\'", new Object[]{var2, var1}));
   }

   // $FF: renamed from: <clinit> () void
   static void method_589() {
      boolean var10000 = true;
      char[] var10003 = "°ºwkH8e·Ía?$yôúT-:+°ºwk".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_271 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 31;
            break;
         case 1:
            var10009 = 23;
            break;
         case 2:
            var10009 = 140;
            break;
         case 3:
            var10009 = 196;
            break;
         case 4:
            var10009 = 224;
            break;
         case 5:
            var10009 = 217;
            break;
         default:
            var10009 = 131;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
