package com.mojang.authlib.yggdrasil.request;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import com.mojang.authlib.yggdrasil.request.ValidateRequest;

public class RefreshRequest {

   private String clientToken;
   private String accessToken;
   private GameProfile selectedProfile;
   private boolean requestUser;


   // $FF: renamed from: <init> (com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication) void
   public void method_3228(YggdrasilUserAuthentication var1) {
      this.method_3229(var1, (GameProfile)null);
   }

   // $FF: renamed from: <init> (com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication, com.mojang.authlib.GameProfile) void
   public void method_3229(YggdrasilUserAuthentication var1, GameProfile var2) {
      super();
      this.requestUser = true;
      this.clientToken = var1.getAuthenticationService().getClientToken();
      ValidateRequest.method_3423();
      this.accessToken = var1.getAuthenticatedToken();
      this.selectedProfile = var2;
      if(class_689.method_3977() == 0) {
         ValidateRequest.method_3422(new class_689[2]);
      }

   }
}
