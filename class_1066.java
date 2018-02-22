import java.util.concurrent.Callable;

// $FF: renamed from: gD
class class_1066 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_5612;
   // $FF: renamed from: b gi
   final class_580 field_5613;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5614;


   // $FF: renamed from: <init> (gi) void
   void method_6001(class_580 var1) {
      this.field_5613 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6002() {
      int var1 = aji.method_2415(this.field_5613.field_2464.getBlock(this.field_5613.field_2465, this.field_5613.field_2466, this.field_5613.field_2467));

      try {
         String[] var3 = field_5614;
         return String.format("ID #%d (%s // %s)", new Object[]{Integer.valueOf(var1), aji.method_2416(var1).method_2510(), aji.method_2416(var1).getClass().getCanonicalName()});
      } catch (Throwable var4) {
         StringBuilder var10000 = new StringBuilder();
         String[] var10001 = field_5614;
         return var10000.append("ID #").append(var1).toString();
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_6003() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "mÎ¯ngÆÐ}`¹»~mÎ¯nuÃ\f¯ümù¦";
      int var4 = "mÎ¯ngÆÐ}`¹»~mÎ¯nuÃ\f¯ümù¦".length();
      char var1 = 4;
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
                  field_5614 = var5;
                  String[] var10 = field_5614;
                  field_5612 = "CL_00000343";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 112;
               break;
            case 1:
               var10009 = 222;
               break;
            case 2:
               var10009 = 219;
               break;
            case 3:
               var10009 = 25;
               break;
            case 4:
               var10009 = 4;
               break;
            case 5:
               var10009 = 243;
               break;
            default:
               var10009 = 239;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
