package ca.diiza.k;


// $FF: renamed from: ca.diiza.k.a
public enum class_601 {

   COUNTDOWN,
   LAUNCHED,
   ENDED;
   // $FF: renamed from: a ca.diiza.k.a[]
   // $FF: synthetic field
   private static final class_601[] field_2601;


   // $FF: renamed from: <init> (java.lang.String, int) void
   private void method_3247(String var1, int var2) {
      super(var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3248() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "x[òë±QyyJùû\bv[òü½[";
      int var5 = "x[òë±QyyJùû\bv[òü½[".length();
      char var2 = 9;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  class_601 var9 = new class_601;
                  var9.method_3247("COUNTDOWN", 0);
                  COUNTDOWN = var9;
                  var9 = new class_601;
                  var9.method_3247("LAUNCHED", 1);
                  LAUNCHED = var9;
                  var9 = new class_601;
                  var9.method_3247("ENDED", 2);
                  ENDED = var9;
                  field_2601 = new class_601[]{COUNTDOWN, LAUNCHED, ENDED};
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 139;
               break;
            case 1:
               var10009 = 224;
               break;
            case 2:
               var10009 = 217;
               break;
            case 3:
               var10009 = 107;
               break;
            case 4:
               var10009 = 104;
               break;
            case 5:
               var10009 = 34;
               break;
            default:
               var10009 = 201;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
