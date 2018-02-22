import java.util.concurrent.Callable;

// $FF: renamed from: j8
class class_1263 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6538;
   // $FF: renamed from: b jY
   final class_1303 field_6539;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6540;


   // $FF: renamed from: <init> (jY) void
   void method_6634(class_1303 var1) {
      this.field_6539 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6635() {
      String[] var10000 = field_6540;
      return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", new Object[]{class_1303.method_6890(this.field_6539).method_444(), Integer.valueOf(class_1303.method_6890(this.field_6539).method_443()), Boolean.valueOf(class_1303.method_6891(this.field_6539)), Boolean.valueOf(class_1303.method_6892(this.field_6539))});
   }

   // $FF: renamed from: <clinit> () void
   static void method_6636() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "V¯kÕiu«RÕnË&9,ÕnÜ/?î 9Üe~¼\rÏkd?î+.ÙrbôHÐ)R7Å{6!ûQÂ";
      int var4 = "V¯kÕiu«RÕnË&9,ÕnÜ/?î 9Üe~¼\rÏkd?î+.ÙrbôHÐ)R7Å{6!ûQÂ".length();
      char var1 = 47;
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
                  field_6540 = var5;
                  String[] var10 = field_6540;
                  field_6538 = "CL_00000597";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 250;
               break;
            case 1:
               var10009 = 37;
               break;
            case 2:
               var10009 = 131;
               break;
            case 3:
               var10009 = 30;
               break;
            case 4:
               var10009 = 160;
               break;
            case 5:
               var10009 = 83;
               break;
            default:
               var10009 = 237;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
