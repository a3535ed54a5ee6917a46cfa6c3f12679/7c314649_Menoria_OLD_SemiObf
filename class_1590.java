import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: t5
class class_1590 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8297;
   // $FF: renamed from: b net.minecraft.server.MinecraftServer
   final MinecraftServer field_8298;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8299;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer) void
   void method_8715(MinecraftServer var1) {
      this.field_8298 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8716() {
      String[] var1 = class_752.method_4253();
      class_1535 var10000 = this.field_8298.field_1922;
      String var2;
      if(var1 != null) {
         if(!this.field_8298.field_1922.field_8062) {
            String[] var3 = field_8299;
            var2 = "N/A (disabled)";
            return var2;
         }

         var10000 = this.field_8298.field_1922;
      }

      var2 = var10000.method_8336();
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8717() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ti^g00y\n@3iDDcÇT3)";
      int var4 = "ti^g00y\n@3iDDcÇT3)".length();
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
                  field_8299 = var5;
                  String[] var10 = field_8299;
                  field_8297 = "CL_00001419";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 179;
               break;
            case 1:
               var10009 = 161;
               break;
            case 2:
               var10009 = 133;
               break;
            case 3:
               var10009 = 47;
               break;
            case 4:
               var10009 = 181;
               break;
            case 5:
               var10009 = 211;
               break;
            default:
               var10009 = 132;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
