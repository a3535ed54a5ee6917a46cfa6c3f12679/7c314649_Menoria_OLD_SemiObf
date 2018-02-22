import java.util.concurrent.Callable;

// $FF: renamed from: qa
class class_1519 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7994;
   // $FF: renamed from: b up
   final class_357 field_7995;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7996;


   // $FF: renamed from: <init> (up) void
   void method_8245(class_357 var1) {
      this.field_7995 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8246() {
      String[] var10000 = field_7996;
      return "Integrated Server (map_client.txt)";
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_8247() {
      return this.method_8246();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8248() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ýÓq»aÿ¿q\"ßø$Fù0ºÔèarî#¸Ôþa\tæ0¾îï-Hî?ºø9U¢";
      int var4 = "ýÓq»aÿ¿q\"ßø$Fù0ºÔèarî#¸Ôþa\tæ0¾îï-Hî?ºø9U¢".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_7996 = var5;
                  String[] var10 = field_7996;
                  field_7994 = "CL_00001130";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 33;
               break;
            case 1:
               var10009 = 94;
               break;
            case 2:
               var10009 = 99;
               break;
            case 3:
               var10009 = 174;
               break;
            case 4:
               var10009 = 206;
               break;
            case 5:
               var10009 = 100;
               break;
            default:
               var10009 = 190;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
