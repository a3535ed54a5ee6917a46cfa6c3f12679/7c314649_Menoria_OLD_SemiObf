import java.util.regex.Pattern;

// $FF: renamed from: vw
public class class_1723 {

   // $FF: renamed from: b java.util.regex.Pattern
   private static final Pattern field_9029;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9030;


   // $FF: renamed from: b (int) java.lang.String
   public static String method_9628(int var0) {
      int var1 = var0 / 20;
      int var2 = var1 / 60;
      var1 %= 60;
      if(var1 < 10) {
         StringBuilder var10000 = (new StringBuilder()).append(var2);
         String[] var10001 = field_9030;
         return var10000.append(":0").append(var1).toString();
      } else {
         return var2 + ":" + var1;
      }
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static String method_9629(String var0) {
      return field_9029.matcher(var0).replaceAll("");
   }

   // $FF: renamed from: c (java.lang.String) boolean
   public static boolean method_9630(String var0) {
      boolean var2;
      label24: {
         String[] var1 = class_752.method_4253();
         String var10000 = var0;
         if(var1 != null) {
            if(var0 == null) {
               break label24;
            }

            var10000 = "";
         }

         var2 = var10000.equals(var0);
         if(var1 == null) {
            return var2;
         }

         if(!var2) {
            var2 = false;
            return var2;
         }
      }

      var2 = true;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9631() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ÔX¯ÔºïÌ&ñý¸âæ½Jí¥¡ÆW";
      int var4 = "ÔX¯ÔºïÌ&ñý¸âæ½Jí¥¡ÆW".length();
      char var1 = 22;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var11 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_9030 = var5;
                  String[] var8 = field_9030;
                  field_9029 = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var10)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 69;
               break;
            case 1:
               var10009 = 222;
               break;
            case 2:
               var10009 = 127;
               break;
            case 3:
               var10009 = 31;
               break;
            case 4:
               var10009 = 49;
               break;
            case 5:
               var10009 = 118;
               break;
            default:
               var10009 = 102;
            }

            ((Object[])var10)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
