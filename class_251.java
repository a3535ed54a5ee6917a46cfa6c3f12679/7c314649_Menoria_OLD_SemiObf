import com.mojang.authlib.GameProfile;
import java.util.UUID;

// $FF: renamed from: tz
public class class_251 extends class_250 {

   // $FF: renamed from: c com.mojang.authlib.GameProfile
   private GameProfile field_1381;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (com.mojang.authlib.GameProfile) void
   public void method_1460(GameProfile var1) {
      super.method_1449();
      this.field_1381 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      GameProfile var10001 = new GameProfile;
      var10001.method_1305((UUID)null, var1.method_524(16));
      this.field_1381 = var10001;
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(this.field_1381.getName());
   }

   // $FF: renamed from: b (tP) void
   public void method_1461(class_60 var1) {
      var1.method_244(this);
   }

   // $FF: renamed from: a () com.mojang.authlib.GameProfile
   public GameProfile method_1462() {
      return this.field_1381;
   }
}
