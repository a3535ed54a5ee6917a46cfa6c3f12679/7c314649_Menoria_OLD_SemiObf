
// $FF: renamed from: aD
public class class_888 extends IllegalArgumentException {

   // $FF: renamed from: h java.lang.String[]
   private static final String[] yPosition7;


   // $FF: renamed from: <init> (rR, java.lang.String) void
   public void method_5172(class_1081 var1, String var2) {
      String[] var10001 = yPosition7;
      super(String.format("Error parsing: %s: %s", new Object[]{var1, var2}));
   }

   // $FF: renamed from: <init> (rR, int) void
   public void method_5173(class_1081 var1, int var2) {
      String[] var10001 = yPosition7;
      super(String.format("Invalid index %d requested for %s", new Object[]{Integer.valueOf(var2), var1}));
   }

   // $FF: renamed from: <init> (rR, java.lang.Throwable) void
   public void method_5174(class_1081 var1, Throwable var2) {
      String[] var10001 = yPosition7;
      super(String.format("Error while parsing: %s", new Object[]{var1}), var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5175() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "_ø*çíáS6ÿ2âäð3ò|ôäùBså(ãå¨Qyä|£òSä.éó¨Gwä/ïïï\r6³/¼¡­DSä.éó¨@~ÿ0ã¡øVdå5èæ²3å";
      int var4 = "_ø*çíáS6ÿ2âäð3ò|ôäùBså(ãå¨Qyä|£òSä.éó¨Gwä/ïïï\r6³/¼¡­DSä.éó¨@~ÿ0ã¡øVdå5èæ²3å".length();
      char var1 = 33;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  yPosition7 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 40;
               break;
            case 1:
               var10009 = 168;
               break;
            case 2:
               var10009 = 98;
               break;
            case 3:
               var10009 = 184;
               break;
            case 4:
               var10009 = 191;
               break;
            case 5:
               var10009 = 182;
               break;
            default:
               var10009 = 9;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
