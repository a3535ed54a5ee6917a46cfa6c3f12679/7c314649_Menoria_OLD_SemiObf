import java.util.List;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: z2
public class class_1836 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9385;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9385;
      return "time";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 2;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9385;
      return "commands.time.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, java.lang.String[]) java.util.List
   public List method_48(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, int) void
   protected void method_9943(class_20 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < MinecraftServer.method_2348().field_1927.length) {
         MinecraftServer.method_2348().field_1927[var4].method_2186((long)var2);
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (bh, int) void
   protected void method_9944(class_20 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < MinecraftServer.method_2348().field_1927.length) {
         class_354 var5 = MinecraftServer.method_2348().field_1927[var4];
         var5.method_2186(var5.method_2185() + (long)var2);
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (AD) AD
   private static class_641 method_9945(class_641 var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}
