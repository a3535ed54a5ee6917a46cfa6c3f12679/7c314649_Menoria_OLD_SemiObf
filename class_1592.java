import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: t7
public class class_1592 implements Callable {

   // $FF: renamed from: b net.minecraft.server.MinecraftServer
   // $FF: synthetic field
   final MinecraftServer field_8303;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8304;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer) void
   public void method_8721(MinecraftServer var1) {
      this.field_8303 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8722() {
      StringBuilder var10000 = (new StringBuilder()).append(MinecraftServer.method_2407(this.field_8303).method_8915());
      String[] var1 = field_8304;
      return var10000.append(" / ").append(MinecraftServer.method_2407(this.field_8303).method_8916()).append("; ").append(MinecraftServer.method_2407(this.field_8303).field_8456).toString();
   }

   // $FF: synthetic method
   public Object call() {
      return this.method_8722();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8723() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ÕÚÎÕÛ";
      int var4 = "ÕÚÎÕÛ".length();
      char var1 = 2;
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
                  field_8304 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 44;
               break;
            case 1:
               var10009 = 56;
               break;
            case 2:
               var10009 = 57;
               break;
            case 3:
               var10009 = 128;
               break;
            case 4:
               var10009 = 24;
               break;
            case 5:
               var10009 = 72;
               break;
            default:
               var10009 = 106;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
