
// $FF: renamed from: ao
public enum class_915 {

   // $FF: renamed from: a ao
   field_4609,
   // $FF: renamed from: b ao
   field_4610;
   // $FF: renamed from: d ao[]
   private static final class_915[] field_4611;
   // $FF: renamed from: e int
   private final int field_4612;
   // $FF: renamed from: f ao[]
   private static final class_915[] field_4613;
   // $FF: renamed from: g java.lang.String
   private static final String field_4614;
   // $FF: renamed from: h ao[]
   private static final class_915[] field_4615;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, int) void
   private void method_5382(String var1, int var2, String var3, int var4, int var5) {
      super(var1, var2);
      this.field_4612 = var5;
   }

   // $FF: renamed from: b () ao[]
   static class_915[] method_5383() {
      return field_4611;
   }

   // $FF: renamed from: b (ao) int
   static int method_5384(class_915 var0) {
      return var0.field_4612;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5385() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "ôkÕÐ´éþ·¡ÇáþüoÄÚ";
      int var5 = "ôkÕÐ´éþ·¡ÇáþüoÄÚ".length();
      char var2 = 8;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var14 = true;
         char[] var13 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var13;
            var13 = var10001;
            var10001 = var10003;
            char[] var15 = var13;
            var13 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var14)).intern();
               if((var1 += var2) >= var5) {
                  field_4614 = "CL_00001358";
                  class_915 var12 = new class_915;
                  var12.method_5382("INTERACT", 0, "INTERACT", 0, 0);
                  field_4609 = var12;
                  var12 = new class_915;
                  var12.method_5382("ATTACK", 1, "ATTACK", 1, 1);
                  field_4610 = var12;
                  field_4615 = new class_915[]{field_4609, field_4610};
                  field_4611 = new class_915[values().length];
                  field_4613 = new class_915[]{field_4609, field_4610};
                  class_915[] var8 = values();
                  int var9 = var8.length;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     class_915 var11 = var8[var10];
                     field_4611[var11.field_4612] = var11;
                  }

                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var14)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 206;
               break;
            case 1:
               var10009 = 161;
               break;
            case 2:
               var10009 = 184;
               break;
            case 3:
               var10009 = 93;
               break;
            case 4:
               var10009 = 244;
               break;
            case 5:
               var10009 = 226;
               break;
            default:
               var10009 = 132;
            }

            ((Object[])var14)[var7] = (char)(var10007 ^ var15 ^ var10009);
            ++var7;
         }
      }
   }
}
