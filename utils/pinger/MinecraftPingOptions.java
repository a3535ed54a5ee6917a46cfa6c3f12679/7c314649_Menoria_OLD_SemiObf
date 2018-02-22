package utils.pinger;


public class MinecraftPingOptions {

   private String hostname;
   private int port;
   private int timeout;
   private String charset;
   // $FF: renamed from: h java.lang.String
   private static final String field_5563 = "UTF-8";


   // $FF: renamed from: <init> () void
   public void method_5958() {
      super();
      this.port = 25565;
      this.timeout = 2000;
      this.charset = "UTF-8";
   }

   public MinecraftPingOptions setHostname(String var1) {
      this.hostname = var1;
      return this;
   }

   public MinecraftPingOptions setPort(int var1) {
      this.port = var1;
      return this;
   }

   public MinecraftPingOptions setTimeout(int var1) {
      this.timeout = var1;
      return this;
   }

   public MinecraftPingOptions setCharset(String var1) {
      this.charset = var1;
      return this;
   }

   public String getHostname() {
      return this.hostname;
   }

   public int getPort() {
      return this.port;
   }

   public int getTimeout() {
      return this.timeout;
   }

   public String getCharset() {
      return this.charset;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5959() {
      boolean var10000 = true;
      char[] var10003 = "å¥é".toCharArray();
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
            field_5563 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 222;
            break;
         case 1:
            var10009 = 178;
            break;
         case 2:
            var10009 = 174;
            break;
         case 3:
            var10009 = 230;
            break;
         case 4:
            var10009 = 191;
            break;
         case 5:
            var10009 = 17;
            break;
         default:
            var10009 = 229;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
