import com.mojang.authlib.GameProfile;
import java.util.UUID;

// $FF: renamed from: tw
public class class_254 extends class_250 {

   // $FF: renamed from: c com.mojang.authlib.GameProfile
   private GameProfile field_1386;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (com.mojang.authlib.GameProfile) void
   public void method_1471(GameProfile var1) {
      super.method_1449();
      this.field_1386 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      String var2 = var1.method_524(36);
      String var3 = var1.method_524(16);
      UUID var4 = UUID.fromString(var2);
      GameProfile var10001 = new GameProfile;
      var10001.method_1305(var4, var3);
      this.field_1386 = var10001;
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String var4;
      label14: {
         String[] var10000 = class_752.method_4253();
         UUID var3 = this.field_1386.getId();
         String[] var2 = var10000;
         UUID var10001 = var3;
         if(var2 != null) {
            if(var3 == null) {
               var4 = "";
               break label14;
            }

            var10001 = var3;
         }

         var4 = var10001.toString();
      }

      var1.method_525(var4);
      var1.method_525(this.field_1386.getName());
   }

   // $FF: renamed from: b (tO) void
   public void method_1472(class_61 var1) {
      var1.method_247(this);
   }

   // $FF: renamed from: b () boolean
   public boolean method_1456() {
      return true;
   }
}
