import net.minecraft.server.MinecraftServer;

// $FF: renamed from: AQ
class class_653 extends Thread {

   // $FF: renamed from: a java.lang.String
   private static final String field_2810 = "CL_00001418";
   // $FF: renamed from: b net.minecraft.server.MinecraftServer
   final MinecraftServer field_2811;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, java.lang.String) void
   void method_3552(MinecraftServer var1, String var2) {
      this.field_2811 = var1;
      super(var2);
   }

   public void run() {
      this.field_2811.run();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3553() {
      boolean var10000 = true;
      char[] var10003 = "L;ð]ãó|D".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2810 = (new String((char[])var4)).intern();
            String var2 = field_2810;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 58;
            break;
         case 1:
            var10009 = 47;
            break;
         case 2:
            var10009 = 165;
            break;
         case 3:
            var10009 = 148;
            break;
         case 4:
            var10009 = 227;
            break;
         case 5:
            var10009 = 40;
            break;
         default:
            var10009 = 133;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
