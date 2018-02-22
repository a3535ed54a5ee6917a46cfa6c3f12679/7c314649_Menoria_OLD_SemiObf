
// $FF: renamed from: xZ
public class class_1788 {

   // $FF: renamed from: b char[]
   public static final char[] field_9319;


   // $FF: renamed from: b (char) boolean
   public static boolean method_9823(char var0) {
      char var10000;
      label32: {
         String[] var1 = class_752.method_4253();
         var10000 = var0;
         short var10001 = 167;
         if(var1 != null) {
            if(var0 == 167) {
               break label32;
            }

            var10000 = var0;
            var10001 = 32;
         }

         if(var1 != null) {
            if(var10000 < var10001) {
               break label32;
            }

            var10000 = var0;
            if(var1 == null) {
               return (boolean)var10000;
            }

            var10001 = 127;
         }

         if(var10000 != var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static String method_9824(String var0) {
      StringBuilder var2 = new StringBuilder();
      char[] var3 = var0.toCharArray();
      String[] var10000 = class_752.method_4253();
      int var4 = var3.length;
      int var5 = 0;
      String[] var1 = var10000;

      while(var5 < var4) {
         char var6 = var3[var5];
         if(var1 != null) {
            if(method_9823(var6)) {
               var2.append(var6);
            }

            ++var5;
         }

         if(var1 == null) {
            break;
         }
      }

      return var2.toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9825() {
      field_9319 = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};
   }
}
