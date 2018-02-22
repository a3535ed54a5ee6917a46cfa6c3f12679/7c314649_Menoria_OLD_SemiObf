package net.minecraft.realms;


public class RealmsSharedConstants {

   public static int NETWORK_PROTOCOL_VERSION;
   public static int TICKS_PER_SECOND;
   public static String VERSION_STRING;


   // $FF: renamed from: <init> () void
   public void method_5170() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5171() {
      boolean var10000 = true;
      char[] var10003 = "=ºô9".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var4)).intern();
            NETWORK_PROTOCOL_VERSION = 5;
            TICKS_PER_SECOND = 20;
            VERSION_STRING = var0;
            return;
         }

         char var10007 = (char)((Object[])var4)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 71;
            break;
         case 1:
            var10009 = 223;
            break;
         case 2:
            var10009 = 136;
            break;
         case 3:
            var10009 = 125;
            break;
         case 4:
            var10009 = 110;
            break;
         case 5:
            var10009 = 66;
            break;
         default:
            var10009 = 127;
         }

         ((Object[])var4)[var1] = (char)(var10007 ^ var5 ^ var10009);
         ++var1;
      }
   }
}
