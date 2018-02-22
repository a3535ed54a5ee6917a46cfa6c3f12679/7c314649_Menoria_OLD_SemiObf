import java.util.concurrent.Callable;

// $FF: renamed from: j7
class class_1262 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_6535;
   // $FF: renamed from: b jY
   final class_1303 field_6536;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6537;


   // $FF: renamed from: <init> (jY) void
   void method_6631(class_1303 var1) {
      this.field_6536 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_6632() {
      String[] var10000 = field_6537;
      return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", new Object[]{Integer.valueOf(class_1303.method_6886(this.field_6536)), Boolean.valueOf(class_1303.method_6887(this.field_6536)), Integer.valueOf(class_1303.method_6888(this.field_6536)), Boolean.valueOf(class_1303.method_6889(this.field_6536))});
   }

   // $FF: renamed from: <clinit> () void
   static void method_6633() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "DÒÀÀ7«i3Uÿ9DÐÖjûj\nÕÆÐ/ð?]ÊÕe·|\nÊiú5XÐÖjûj\nÕÆÐ/ð?]ÊÕe·";
      int var4 = "DÒÀÀ7«i3Uÿ9DÐÖjûj\nÕÆÐ/ð?]ÊÕe·|\nÊiú5XÐÖjûj\nÕÆÐ/ð?]ÊÕe·".length();
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
                  field_6537 = var5;
                  String[] var10 = field_6537;
                  field_6535 = "CL_00000595";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 164;
               break;
            case 1:
               var10009 = 61;
               break;
            case 2:
               var10009 = 243;
               break;
            case 3:
               var10009 = 137;
               break;
            case 4:
               var10009 = 83;
               break;
            case 5:
               var10009 = 1;
               break;
            default:
               var10009 = 83;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
