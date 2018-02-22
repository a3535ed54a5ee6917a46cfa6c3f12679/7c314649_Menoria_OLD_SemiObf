package ca.diiza.v.a;


// $FF: renamed from: ca.diiza.v.a.c
public enum class_1007 {

   CAVE,
   JUNGLE;
   // $FF: renamed from: a ca.diiza.v.a.c[]
   // $FF: synthetic field
   private static final class_1007[] field_5108;


   // $FF: renamed from: <init> (java.lang.String, int) void
   private void method_5740(String var1, int var2) {
      super(var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5741() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "_âûæ|Vöãä";
      int var5 = "_âûæ|Vöãä".length();
      char var2 = 6;
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
                  class_1007 var9 = new class_1007;
                  var9.method_5740("CAVE", 0);
                  CAVE = var9;
                  var9 = new class_1007;
                  var9.method_5740("JUNGLE", 1);
                  JUNGLE = var9;
                  field_5108 = new class_1007[]{CAVE, JUNGLE};
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 123;
               break;
            case 1:
               var10009 = 217;
               break;
            case 2:
               var10009 = 219;
               break;
            case 3:
               var10009 = 207;
               break;
            case 4:
               var10009 = 94;
               break;
            case 5:
               var10009 = 59;
               break;
            default:
               var10009 = 248;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
