
// $FF: renamed from: zS
public class class_1814 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9360;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9360;
      return "setworldspawn";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 2;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9360;
      return "commands.setworldspawn.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (AD) AD
   private static class_641 method_9904(class_641 var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "6¥g¸&äy\n­\'¦n©;äyº&¹\r&¯~¶1¹z®6¥g¸&äy\n­\'¦n©;ä¸";
      int var4 = "6¥g¸&äy\n­\'¦n©;äyº&¹\r&¯~¶1¹z®6¥g¸&äy\n­\'¦n©;ä¸".length();
      char var1 = 30;
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
                  field_9360 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 209;
               break;
            case 1:
               var10009 = 78;
               break;
            case 2:
               var10009 = 142;
               break;
            case 3:
               var10009 = 235;
               break;
            case 4:
               var10009 = 93;
               break;
            case 5:
               var10009 = 110;
               break;
            default:
               var10009 = 114;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
