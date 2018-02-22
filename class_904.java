
// $FF: renamed from: ae
public enum class_904 {

   // $FF: renamed from: a ae
   field_4440,
   // $FF: renamed from: b ae
   field_4441;
   // $FF: renamed from: d ae[]
   private static final class_904[] field_4442;
   // $FF: renamed from: e java.lang.String
   private static final String field_4443;
   // $FF: renamed from: f ae[]
   private static final class_904[] field_4444;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int) void
   private void method_5319(String var1, int var2, String var3, int var4) {
      super(var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5320() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "L®^{óV·\bW|N§s\"`:ÉpPª\f@";
      int var5 = "L®^{óV·\bW|N§s\"`:ÉpPª\f@".length();
      char var2 = 13;
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
                  field_4443 = "CL_00001813";
                  class_904 var9 = new class_904;
                  var9.method_5319("ERROR", 0, "ERROR", 0);
                  field_4440 = var9;
                  var9 = new class_904;
                  var9.method_5319("INVALID_TOKEN", 1, "INVALID_TOKEN", 1);
                  field_4441 = var9;
                  field_4444 = new class_904[]{field_4440, field_4441};
                  field_4442 = new class_904[]{field_4440, field_4441};
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 31;
               break;
            case 1:
               var10009 = 76;
               break;
            case 2:
               var10009 = 182;
               break;
            case 3:
               var10009 = 13;
               break;
            case 4:
               var10009 = 92;
               break;
            case 5:
               var10009 = 124;
               break;
            default:
               var10009 = 249;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
