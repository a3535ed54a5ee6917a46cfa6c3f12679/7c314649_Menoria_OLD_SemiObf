
// $FF: renamed from: AK
class class_647 extends Thread {

   // $FF: renamed from: a java.lang.String
   private static final String field_2784;
   // $FF: renamed from: b bpr
   final bpr field_2785;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2786;


   // $FF: renamed from: <init> (bpr, java.lang.String) void
   void method_3533(bpr var1, String var2) {
      this.field_2785 = var1;
      super(var2);
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_3534(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3535() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÜÊ_Ç6DÍÉL-ÍS2DÝÃC0&ÞÈW&\rÇÁ6Ò^7Ì]/DÒÛbÔ(öÖÐsT";
      int var4 = "ÜÊ_Ç6DÍÉL-ÍS2DÝÃC0&ÞÈW&\rÇÁ6Ò^7Ì]/DÒÛbÔ(öÖÐsT".length();
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2786 = var5;
                  String[] var10 = field_2786;
                  field_2784 = "CL_00001050";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 255;
               break;
            case 1:
               var10009 = 217;
               break;
            case 2:
               var10009 = 20;
               break;
            case 3:
               var10009 = 27;
               break;
            case 4:
               var10009 = 134;
               break;
            case 5:
               var10009 = 91;
               break;
            default:
               var10009 = 93;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
