
// $FF: renamed from: H
public enum class_95 {

   // $FF: renamed from: a H
   field_53,
   // $FF: renamed from: b H
   field_54;
   // $FF: renamed from: c int
   public final int field_55;
   // $FF: renamed from: d java.lang.String
   private static final String field_56;
   // $FF: renamed from: e H[]
   // $FF: synthetic field
   private static final class_95[] field_57;


   // $FF: renamed from: <init> (java.lang.String, int, int) void
   private void method_452(String var1, int var2, int var3) {
      super(var1, var2);
      this.field_55 = var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_453() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "gôFÉfÔvDëQ©EvóP";
      int var5 = "gôFÉfÔvDëQ©EvóP".length();
      char var2 = 5;
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
                  field_56 = "CL_00000151";
                  class_95 var9 = new class_95;
                  var9.method_452("Sky", 0, 15);
                  field_53 = var9;
                  var9 = new class_95;
                  var9.method_452("Block", 1, 0);
                  field_54 = var9;
                  field_57 = new class_95[]{field_53, field_54};
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 191;
               break;
            case 1:
               var10009 = 2;
               break;
            case 2:
               var10009 = 179;
               break;
            case 3:
               var10009 = 238;
               break;
            case 4:
               var10009 = 56;
               break;
            case 5:
               var10009 = 65;
               break;
            default:
               var10009 = 251;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
