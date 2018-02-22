import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: uK
public class class_1628 extends class_1627 {

   // $FF: renamed from: a ro
   private class_1583 field_8471;
   // $FF: renamed from: x java.lang.String
   private static final String field_8472 = "That name is already taken.";


   // $FF: renamed from: <init> (up) void
   public void method_8932(class_357 var1) {
      super.method_8872(var1);
      this.method_8930(10);
   }

   // $FF: renamed from: c (xi) void
   protected void method_8879(class_793 var1) {
      label13: {
         String[] var2 = class_752.method_4253();
         class_793 var10000 = var1;
         if(var2 != null) {
            if(!var1.method_64().equals(this.method_8933().method_2351())) {
               break label13;
            }

            class_1583 var10001 = new class_1583;
            var10001.method_8628();
            this.field_8471 = var10001;
            var10000 = var1;
         }

         var10000.method_3904(this.field_8471);
      }

      super.method_8879(var1);
   }

   // $FF: renamed from: b (java.net.SocketAddress, com.mojang.authlib.GameProfile) java.lang.String
   public String method_8883(SocketAddress var1, GameProfile var2) {
      String[] var3 = class_752.method_4253();
      String var10000 = var2.getName();
      if(var3 != null) {
         class_1628 var4;
         label17: {
            if(var10000.equalsIgnoreCase(this.method_8933().method_2351())) {
               var4 = this;
               if(var3 == null) {
                  break label17;
               }

               if(this.method_8900(var2.getName()) != null) {
                  return "That name is already taken.";
               }
            }

            var4 = this;
         }

         var10000 = var4.method_8883(var1, var2);
      }

      return var10000;
   }

   // $FF: renamed from: t () up
   public class_357 method_8933() {
      return (class_357)super.method_8921();
   }

   // $FF: renamed from: r () ro
   public class_1583 method_8922() {
      return this.field_8471;
   }

   // $FF: renamed from: q () net.minecraft.server.MinecraftServer
   // $FF: synthetic method
   public MinecraftServer method_8921() {
      return this.method_8933();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8931() {
      boolean var10000 = true;
      char[] var10003 = "Ëº75Kò·vfó 3q\\[ë³={".toCharArray();
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
            field_8472 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 31;
            break;
         case 1:
            var10009 = 82;
            break;
         case 2:
            var10009 = 214;
            break;
         case 3:
            var10009 = 115;
            break;
         case 4:
            var10009 = 149;
            break;
         case 5:
            var10009 = 165;
            break;
         default:
            var10009 = 251;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
