import java.util.List;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: zD
public class class_1829 extends class_1790 {

   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9376;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9376;
      return "banlist";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 3;
   }

   // $FF: renamed from: b (bh) boolean
   public boolean method_47(class_20 var1) {
      boolean var10000;
      label30: {
         String[] var2 = class_752.method_4253();
         var10000 = MinecraftServer.method_2348().method_2383().method_8895().method_8988();
         if(var2 != null) {
            label25: {
               if(!var10000) {
                  var10000 = MinecraftServer.method_2348().method_2383().method_8894().method_8988();
                  if(var2 == null) {
                     break label25;
                  }

                  if(!var10000) {
                     break label30;
                  }
               }

               var10000 = super.method_47(var1);
            }
         }

         if(var2 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9376;
      return "commands.banlist.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 var1, String[] var2) {
      class_1081 var10001;
      class_1082 var6;
      label18: {
         String[] var3 = class_752.method_4253();
         int var10000 = var2.length;
         String[] var4;
         if(var3 != null) {
            if(var10000 < 1) {
               break label18;
            }

            String var5 = var2[0];
            var4 = field_9376;
            var10000 = var5.equalsIgnoreCase("ips");
         }

         if(var10000 != 0) {
            var10001 = new class_1081;
            var4 = field_9376;
            var10001.method_6126("commands.banlist.ips", new Object[]{Integer.valueOf(MinecraftServer.method_2348().method_2383().method_8895().method_8993().length)});
            var1.method_66(var10001);
            var6 = new class_1082;
            var6.method_6134(method_9851(MinecraftServer.method_2348().method_2383().method_8895().method_8993()));
            var1.method_66(var6);
            if(var3 != null) {
               return;
            }
         }
      }

      var10001 = new class_1081;
      String[] var10003 = field_9376;
      var10001.method_6126("commands.banlist.players", new Object[]{Integer.valueOf(MinecraftServer.method_2348().method_2383().method_8894().method_8993().length)});
      var1.method_66(var10001);
      var6 = new class_1082;
      var6.method_6134(method_9851(MinecraftServer.method_2348().method_2383().method_8894().method_8993()));
      var1.method_66(var6);
   }

   // $FF: renamed from: b (bh, java.lang.String[]) java.util.List
   public List method_48(class_20 var1, String[] var2) {
      String[] var3 = class_752.method_4253();
      String[] var10000 = var2;
      if(var3 != null) {
         if(var2.length != 1) {
            return null;
         }

         var10000 = var2;
      }

      String[] var10001 = new String[2];
      String[] var4 = field_9376;
      var10001[0] = "players";
      var10001[1] = "ips";
      return method_9855(var10000, var10001);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}
