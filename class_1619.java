import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

// $FF: renamed from: uB
final class class_1619 implements ProfileLookupCallback {

   // $FF: renamed from: b com.mojang.authlib.GameProfile[]
   // $FF: synthetic field
   final GameProfile[] field_8430;


   // $FF: renamed from: <init> (com.mojang.authlib.GameProfile[]) void
   void method_8846(GameProfile[] var1) {
      this.field_8430 = var1;
      super();
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.field_8430[0] = var1;
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      this.field_8430[0] = null;
   }
}
