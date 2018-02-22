import net.minecraft.server.MinecraftServer;

// $FF: renamed from: zE
public class class_1828 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9375;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9375;
      return "list";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 0;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9375;
      return "commands.players.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 var1, String[] var2) {
      class_1081 var10001 = new class_1081;
      String[] var3 = field_9375;
      var10001.method_6126("commands.players.list", new Object[]{Integer.valueOf(MinecraftServer.method_2348().method_2342()), Integer.valueOf(MinecraftServer.method_2348().method_2343())});
      var1.method_66(var10001);
      class_1082 var4 = new class_1082;
      var4.method_6134(MinecraftServer.method_2348().method_2383().method_8891(var2.length > 0 && "uuids".equalsIgnoreCase(var2[0])));
      var1.method_66(var4);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}
