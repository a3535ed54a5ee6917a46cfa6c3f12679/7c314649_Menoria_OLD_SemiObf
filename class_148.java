
// $FF: renamed from: k5
class class_148 extends class_145 {

   // $FF: renamed from: s java.lang.String
   private static final String field_473;
   // $FF: renamed from: t lJ
   final class_224 field_474;
   // $FF: renamed from: u java.lang.String[]
   private static final String[] field_475;


   // $FF: renamed from: <init> (lJ, int, int, int) void
   public void method_770(class_224 var1, int var2, int var3, int var4) {
      this.field_474 = var1;
      super.method_765(var2, var3, var4, class_224.method_1217(), 112, 220);
   }

   // $FF: renamed from: b (int, int) void
   public void method_755(int var1, int var2) {
      String[] var10001 = field_475;
      class_224.method_1218(this.field_474, class_1450.method_7896("gui.cancel", new Object[0]), var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "&Ê\b·&U±\b\nóIäLxãL";
      int var4 = "&Ê\b·&U±\b\nóIäLxãL".length();
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
                  field_475 = var5;
                  String[] var10 = field_475;
                  field_473 = "CL_00000740";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 168;
               break;
            case 1:
               var10009 = 75;
               break;
            case 2:
               var10009 = 237;
               break;
            case 3:
               var10009 = 245;
               break;
            case 4:
               var10009 = 74;
               break;
            case 5:
               var10009 = 224;
               break;
            default:
               var10009 = 219;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
