import net.minecraft.server.MinecraftServer;

// $FF: renamed from: zM
public class class_1820 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9366;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9366;
      return "publish";
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9366;
      return "commands.publish.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 var1, String[] var2) {
      label16: {
         String[] var10000 = class_752.method_4253();
         String var4 = MinecraftServer.method_2348().method_2389(class_94.field_45, false);
         String[] var3 = var10000;
         if(var3 != null) {
            if(var4 == null) {
               break label16;
            }

            String[] var5 = field_9366;
            method_9857(var1, this, "commands.publish.started", new Object[]{var4});
         }

         if(var3 != null) {
            return;
         }
      }

      String[] var10002 = field_9366;
      method_9857(var1, this, "commands.publish.failed", new Object[0]);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}
