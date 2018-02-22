package net.minecraft.client;


public class ClientBrandRetriever {

   // $FF: renamed from: a java.lang.String
   private static String field_6223;
   // $FF: renamed from: h java.lang.String
   private static final String field_6224;


   // $FF: renamed from: <init> () void
   public void method_6432() {
      super();
   }

   public static String getClientModName() {
      return field_6224;
   }

   // $FF: renamed from: a (java.lang.String) void
   public static void method_6433(String var0) {
      field_6223 = var0;
   }

   // $FF: renamed from: a () java.lang.String
   public static String method_6434() {
      return field_6223;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6435() {
      method_6433((String)null);
      boolean var10000 = true;
      char[] var10003 = "Å9|¥6û".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6224 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 134;
            break;
         case 1:
            var10009 = 217;
            break;
         case 2:
            var10009 = 98;
            break;
         case 3:
            var10009 = 32;
            break;
         case 4:
            var10009 = 252;
            break;
         case 5:
            var10009 = 111;
            break;
         default:
            var10009 = 175;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
