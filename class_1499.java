import java.util.concurrent.Callable;

// $FF: renamed from: qG
class class_1499 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7901;
   // $FF: renamed from: b kj
   final class_1346 field_7902;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7903;


   // $FF: renamed from: <init> (kj) void
   void method_8112(class_1346 var1) {
      this.field_7902 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8113() {
      String[] var10000 = field_7903;
      return "1.7.10";
   }

   // $FF: renamed from: <clinit> () void
   static void method_8114() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "¯4&»OÊÅÝI@¼ÝVN¥NÊ";
      int var4 = "¯4&»OÊÅÝI@¼ÝVN¥NÊ".length();
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
                  field_7903 = var5;
                  String[] var10 = field_7903;
                  field_7901 = "CL_00001197";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 218;
               break;
            case 1:
               var10009 = 78;
               break;
            case 2:
               var10009 = 79;
               break;
            case 3:
               var10009 = 189;
               break;
            case 4:
               var10009 = 73;
               break;
            case 5:
               var10009 = 204;
               break;
            default:
               var10009 = 195;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
