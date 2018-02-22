package com.mojang.authlib.yggdrasil.response;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.response.Response;

public class ProfileSearchResultsResponse extends Response {

   private GameProfile[] profiles;


   // $FF: renamed from: <init> () void
   public void method_1301() {
      super.method_1301();
   }

   public GameProfile[] getProfiles() {
      return this.profiles;
   }

   static GameProfile[] access$002(ProfileSearchResultsResponse var0, GameProfile[] var1) {
      return var0.profiles = var1;
   }
}
