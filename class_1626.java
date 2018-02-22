import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: uI
final class class_1626 implements ProfileLookupCallback {

   // $FF: renamed from: b net.minecraft.server.MinecraftServer
   // $FF: synthetic field
   final MinecraftServer field_8446;
   // $FF: renamed from: c java.util.List
   // $FF: synthetic field
   final List field_8447;
   // $FF: renamed from: h java.lang.String
   private static final String field_8448 = "Could not lookup user whitelist entry for ";


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, java.util.List) void
   void method_8870(MinecraftServer var1, List var2) {
      this.field_8446 = var1;
      this.field_8447 = var2;
      super();
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field_8446.method_2403().method_8835(var1);
      this.field_8447.add(var1);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      class_1623.method_8861().warn("Could not lookup user whitelist entry for " + var1.getName(), var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8871() {
      boolean var10000 = true;
      char[] var10003 = "gÁ)Ôz\'KÚÙ)ß5\"QÞÙ0Ã?;Ù,Ä?%MÝeÕ4=V×Ù#ß(i".toCharArray();
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
            field_8448 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 57;
            break;
         case 1:
            var10009 = 179;
            break;
         case 2:
            var10009 = 228;
            break;
         case 3:
            var10009 = 88;
            break;
         case 4:
            var10009 = 173;
            break;
         case 5:
            var10009 = 71;
            break;
         default:
            var10009 = 84;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
