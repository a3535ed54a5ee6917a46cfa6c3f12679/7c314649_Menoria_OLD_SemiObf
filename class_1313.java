
// $FF: renamed from: kE
class class_1313 implements class_70 {

   // $FF: renamed from: a java.lang.String
   private static final String field_6732;
   // $FF: renamed from: b bao
   final bao field_6733;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6734;


   // $FF: renamed from: <init> (bao) void
   void method_6919(bao var1) {
      this.field_6733 = var1;
      super();
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public String method_363(String var1) {
      try {
         return String.format(var1, new Object[]{bbj.method_5347(this.field_6733.canLoseFocus7.field_4538.getEnableBackgroundDrawing8())});
      } catch (Exception var3) {
         StringBuilder var10000 = new StringBuilder();
         String[] var10001 = field_6734;
         return var10000.append("Error: ").append(var3.getLocalizedMessage()).toString();
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_6920() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "yËp,9\n±tõ5Ò2&)";
      int var4 = "yËp,9\n±tõ5Ò2&)".length();
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
                  field_6734 = var5;
                  String[] var10 = field_6734;
                  field_6732 = "CL_00000639";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 43;
               break;
            case 1:
               var10009 = 150;
               break;
            case 2:
               var10009 = 86;
               break;
            case 3:
               var10009 = 172;
               break;
            case 4:
               var10009 = 81;
               break;
            case 5:
               var10009 = 13;
               break;
            default:
               var10009 = 24;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
