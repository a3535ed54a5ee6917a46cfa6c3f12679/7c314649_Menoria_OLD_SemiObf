import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: t4
class class_1589 implements class_81 {

   // $FF: renamed from: a long
   private long field_8293;
   // $FF: renamed from: b java.lang.String
   private static final String field_8294;
   // $FF: renamed from: c net.minecraft.server.MinecraftServer
   final MinecraftServer field_8295;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8296;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer) void
   void method_8713(MinecraftServer var1) {
      this.field_8295 = var1;
      super();
      this.field_8293 = System.currentTimeMillis();
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_397(String var1) {}

   // $FF: renamed from: c (java.lang.String) void
   public void method_398(String var1) {}

   // $FF: renamed from: b (int) void
   public void method_400(int var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         if(System.currentTimeMillis() - this.field_8293 < 1000L) {
            return;
         }

         this.field_8293 = System.currentTimeMillis();
      }

      Logger var10000 = MinecraftServer.method_2406();
      StringBuilder var10001 = new StringBuilder();
      String[] var10002 = field_8296;
      var10000.info(var10001.append("Converting... ").append(var1).append("%").toString());
   }

   // $FF: renamed from: f () void
   public void method_401() {}

   // $FF: renamed from: d (java.lang.String) void
   public void method_399(String var1) {}

   // $FF: renamed from: <clinit> () void
   static void method_8714() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "´Uæ\tÎÆ-´v×[\\XwÞÐ\f";
      int var4 = "´Uæ\tÎÆ-´v×[\\XwÞÐ\f".length();
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
                  field_8296 = var5;
                  String[] var10 = field_8296;
                  field_8294 = "CL_00001417";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 86;
               break;
            case 1:
               var10009 = 184;
               break;
            case 2:
               var10009 = 24;
               break;
            case 3:
               var10009 = 140;
               break;
            case 4:
               var10009 = 152;
               break;
            case 5:
               var10009 = 95;
               break;
            default:
               var10009 = 141;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
