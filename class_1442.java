import java.util.concurrent.Callable;

// $FF: renamed from: nz
class class_1442 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7660;
   // $FF: renamed from: b bjf
   final bjf field_7661;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7662;


   // $FF: renamed from: <init> (bjf) void
   void method_7869(bjf var1) {
      this.field_7661 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7870() {
      StringBuilder var10000 = (new StringBuilder()).append(bjf.method_2236(this.field_7661).size());
      String[] var10001 = field_7662;
      return var10000.append(" total; ").append(bjf.method_2236(this.field_7661).toString()).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7871() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "û^/=û*nUÅs6ë^\tV";
      int var4 = "û^/=û*nUÅs6ë^\tV".length();
      char var1 = 8;
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
                  field_7662 = var5;
                  String[] var10 = field_7662;
                  field_7660 = "CL_00000883";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 153;
               break;
            case 1:
               var10009 = 36;
               break;
            case 2:
               var10009 = 115;
               break;
            case 3:
               var10009 = 39;
               break;
            case 4:
               var10009 = 183;
               break;
            case 5:
               var10009 = 1;
               break;
            default:
               var10009 = 68;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
