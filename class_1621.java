import com.mojang.authlib.GameProfile;
import java.util.Date;

// $FF: renamed from: uD
class class_1621 {

   // $FF: renamed from: a com.mojang.authlib.GameProfile
   private final GameProfile field_8431;
   // $FF: renamed from: b java.util.Date
   private final Date field_8432;
   // $FF: renamed from: c uA
   // $FF: synthetic field
   final class_1618 field_8433;


   // $FF: renamed from: <init> (uA, com.mojang.authlib.GameProfile, java.util.Date) void
   private void method_8848(class_1618 var1, GameProfile var2, Date var3) {
      this.field_8433 = var1;
      super();
      this.field_8431 = var2;
      this.field_8432 = var3;
   }

   // $FF: renamed from: b () com.mojang.authlib.GameProfile
   public GameProfile method_8849() {
      return this.field_8431;
   }

   // $FF: renamed from: c () java.util.Date
   public Date method_8850() {
      return this.field_8432;
   }

   // $FF: renamed from: <init> (uA, com.mojang.authlib.GameProfile, java.util.Date, uB) void
   // $FF: synthetic method
   void method_8851(class_1618 var1, GameProfile var2, Date var3, class_1619 var4) {
      this.method_8848(var1, var2, var3);
   }

   // $FF: renamed from: b (uD) java.util.Date
   // $FF: synthetic method
   static Date method_8852(class_1621 var0) {
      return var0.field_8432;
   }
}
