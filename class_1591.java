import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: t6
class class_1591 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8300;
   // $FF: renamed from: b net.minecraft.server.MinecraftServer
   final MinecraftServer field_8301;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8302;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer) void
   void method_8718(MinecraftServer var1) {
      this.field_8301 = var1;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8719() {
      byte var1 = 0;
      int var2 = 56 * var1;
      int var3 = var2 / 1024 / 1024;
      byte var4 = 0;
      int var5 = 56 * var4;
      int var6 = var5 / 1024 / 1024;
      StringBuilder var10000 = (new StringBuilder()).append(var1);
      String[] var7 = field_8302;
      return var10000.append(" (").append(var2).append(" bytes; ").append(var3).append(" MB) allocated, ").append(var4).append(" (").append(var5).append(" bytes; ").append(var6).append(" MB) used").toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8720() {
      // $FF: Couldn't be decompiled
   }
}
