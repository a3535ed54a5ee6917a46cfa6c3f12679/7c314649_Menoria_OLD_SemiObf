
// $FF: renamed from: Y
public enum class_108 {

   // $FF: renamed from: a Y
   field_194,
   // $FF: renamed from: b Y
   field_195;
   // $FF: renamed from: d int
   private final int field_196;
   // $FF: renamed from: e Y[]
   private static final class_108[] field_197;
   // $FF: renamed from: f java.lang.String
   private static final String field_198;
   // $FF: renamed from: g Y[]
   private static final class_108[] field_199;


   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String, int, int) void
   private void method_507(String var1, int var2, String var3, int var4, int var5) {
      super(var1, var2);
      this.field_196 = var5;
   }

   // $FF: renamed from: b () int
   public int method_508() {
      return this.field_196;
   }

   // $FF: renamed from: <clinit> () void
   static void method_509() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "kn`ûclæfm";
      int var5 = "kn`ûclæfm".length();
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
                  field_198 = "CL_00001126";
                  class_108 var9 = new class_108;
                  var9.method_507("NONE", 0, "NONE", 0, 0);
                  field_194 = var9;
                  var9 = new class_108;
                  var9.method_507("LINEAR", 1, "LINEAR", 1, 2);
                  field_195 = var9;
                  field_199 = new class_108[]{field_194, field_195};
                  field_197 = new class_108[]{field_194, field_195};
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 72;
               break;
            case 1:
               var10009 = 55;
               break;
            case 2:
               var10009 = 193;
               break;
            case 3:
               var10009 = 69;
               break;
            case 4:
               var10009 = 222;
               break;
            case 5:
               var10009 = 70;
               break;
            default:
               var10009 = 36;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
