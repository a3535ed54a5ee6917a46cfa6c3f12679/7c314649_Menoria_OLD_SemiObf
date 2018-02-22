package ca.diiza.v.a;


// $FF: renamed from: ca.diiza.v.a.b
public enum class_1008 {

   COUNTDOWN,
   LAUNCHED,
   ENDED;
   // $FF: renamed from: a ca.diiza.v.a.b[]
   // $FF: synthetic field
   private static final class_1008[] field_5109;


   // $FF: renamed from: <init> (java.lang.String, int) void
   private void method_5742(String var1, int var2) {
      super(var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5743() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "õy]ÊµÕôôhVÚ\bûy]Ý¹ß";
      int var5 = "õy]ÊµÕôôhVÚ\bûy]Ý¹ß".length();
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
                  class_1008 var9 = new class_1008;
                  var9.method_5742("COUNTDOWN", 0);
                  COUNTDOWN = var9;
                  var9 = new class_1008;
                  var9.method_5742("LAUNCHED", 1);
                  LAUNCHED = var9;
                  var9 = new class_1008;
                  var9.method_5742("ENDED", 2);
                  ENDED = var9;
                  field_5109 = new class_1008[]{COUNTDOWN, LAUNCHED, ENDED};
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 87;
               break;
            case 1:
               var10009 = 41;
               break;
            case 2:
               var10009 = 191;
               break;
            case 3:
               var10009 = 128;
               break;
            case 4:
               var10009 = 13;
               break;
            case 5:
               var10009 = 98;
               break;
            default:
               var10009 = 9;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
