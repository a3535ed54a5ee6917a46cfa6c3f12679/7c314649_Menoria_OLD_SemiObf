import java.util.concurrent.Callable;

// $FF: renamed from: gC
class class_1065 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String buttonList9;
   // $FF: renamed from: b gi
   final class_580 field_5610;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5611;


   // $FF: renamed from: <init> (gi) void
   void method_5998(class_580 var1) {
      this.field_5610 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_5999() {
      StringBuilder var10000 = (new StringBuilder()).append((String)class_580.method_3107().get(this.field_5610.getClass()));
      String[] var10001 = field_5611;
      return var10000.append(" // ").append(this.field_5610.getClass().getCanonicalName()).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6000() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "cºjZq qÑka Êz";
      int var4 = "cºjZq qÑka Êz".length();
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
                  field_5611 = var5;
                  String[] var10 = field_5611;
                  buttonList9 = "CL_00000341";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 217;
               break;
            case 1:
               var10009 = 183;
               break;
            case 2:
               var10009 = 125;
               break;
            case 3:
               var10009 = 194;
               break;
            case 4:
               var10009 = 242;
               break;
            case 5:
               var10009 = 217;
               break;
            default:
               var10009 = 136;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
