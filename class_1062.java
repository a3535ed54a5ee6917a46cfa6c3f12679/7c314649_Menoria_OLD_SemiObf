
// $FF: renamed from: gc
final class class_1062 extends class_1061 {

   // $FF: renamed from: a java.lang.String
   private static final String buttonList3;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] buttonList4;


   // $FF: renamed from: <init> (java.lang.String, float, float) void
   void method_5991(String var1, float var2, float var3) {
      super.method_5991(var1, var2, var3);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_5994() {
      String[] var10000 = buttonList4;
      return "dig.stone";
   }

   // $FF: renamed from: e () java.lang.String
   public String method_5996() {
      String[] var10000 = buttonList4;
      return "random.anvil_land";
   }

   // $FF: renamed from: <clinit> () void
   static void method_5997() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "aâkwÙ£dÔ¬ádF½\'@Ã½5ÃH";
      int var4 = "aâkwÙ£dÔ¬ádF½\'@Ã½5ÃH".length();
      char var1 = 9;
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
                  buttonList4 = var5;
                  String[] var10 = buttonList4;
                  buttonList3 = "CL_00000202";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 23;
               break;
            case 1:
               var10009 = 227;
               break;
            case 2:
               var10009 = 106;
               break;
            case 3:
               var10009 = 175;
               break;
            case 4:
               var10009 = 98;
               break;
            case 5:
               var10009 = 225;
               break;
            default:
               var10009 = 159;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
