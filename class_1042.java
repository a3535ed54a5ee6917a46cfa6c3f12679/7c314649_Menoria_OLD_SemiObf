import java.util.concurrent.Callable;

// $FF: renamed from: dp
class class_1042 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_5508;
   // $FF: renamed from: b aji
   final aji field_5509;
   // $FF: renamed from: c ahb
   final ahb field_5510;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5511;


   // $FF: renamed from: <init> (ahb, aji) void
   void method_5896(ahb var1, aji var2) {
      this.field_5510 = var1;
      this.field_5509 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_5897() {
      try {
         String[] var2 = field_5511;
         return String.format("ID #%d (%s // %s)", new Object[]{Integer.valueOf(aji.method_2415(this.field_5509)), this.field_5509.method_2510(), this.field_5509.getClass().getCanonicalName()});
      } catch (Throwable var3) {
         StringBuilder var10000 = new StringBuilder();
         String[] var10001 = field_5511;
         return var10000.append("ID #").append(aji.method_2415(this.field_5509)).toString();
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_5898() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "óUd(zù]nqÙ<={jgù]n";
      int var4 = "óUd(zù]nqÙ<={jgù]n".length();
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
                  field_5511 = var5;
                  String[] var10 = field_5511;
                  field_5508 = "CL_00000142";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 188;
               break;
            case 1:
               var10009 = 21;
               break;
            case 2:
               var10009 = 66;
               break;
            case 3:
               var10009 = 173;
               break;
            case 4:
               var10009 = 88;
               break;
            case 5:
               var10009 = 177;
               break;
            default:
               var10009 = 186;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
