import java.net.UnknownHostException;

// $FF: renamed from: mH
class class_1370 implements Runnable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7246;
   // $FF: renamed from: b mG
   final Gui9 field_7247;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7248;


   // $FF: renamed from: <init> (mG) void
   void getVisible4(Gui9 var1) {
      this.field_7247 = var1;
      super();
   }

   public void run() {
      class_1386 var10000;
      StringBuilder var10001;
      try {
         Gui9.getVisible1(this.field_7247).method_1014().method_7582(Gui9.getVisible0(this.field_7247));
      } catch (UnknownHostException var3) {
         Gui9.getVisible0(this.field_7247).field_7365 = -1L;
         var10000 = Gui9.getVisible0(this.field_7247);
         var10001 = (new StringBuilder()).append(class_130.field_280);
         String[] var2 = field_7248;
         var10000.field_7364 = var10001.append("Can\'t resolve hostname").toString();
      } catch (Exception var4) {
         Gui9.getVisible0(this.field_7247).field_7365 = -1L;
         var10000 = Gui9.getVisible0(this.field_7247);
         var10001 = (new StringBuilder()).append(class_130.field_280);
         String[] var10002 = field_7248;
         var10000.field_7364 = var10001.append("Can\'t connect to server.").toString();
      }

   }

   // $FF: renamed from: <clinit> () void
   static void getVisible5() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ec»7a´Il»uvàËRmõcpæCpûeN %¤Û:ä(ec»7a´Cqº|cñËNm¦d{õC";
      int var4 = "ec»7a´Il»uvàËRmõcpæCpûeN %¤Û:ä(ec»7a´Cqº|cñËNm¦d{õC".length();
      char var1 = 24;
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
                  field_7248 = var5;
                  String[] var10 = field_7248;
                  field_7246 = "CL_00000818";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 141;
               break;
            case 1:
               var10009 = 169;
               break;
            case 2:
               var10009 = 126;
               break;
            case 3:
               var10009 = 187;
               break;
            case 4:
               var10009 = 190;
               break;
            case 5:
               var10009 = 63;
               break;
            default:
               var10009 = 64;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
