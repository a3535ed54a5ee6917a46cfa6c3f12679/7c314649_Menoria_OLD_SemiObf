package com.mojang.authlib.yggdrasil.request;

import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;

public class InvalidateRequest {

   private String accessToken;
   private String clientToken;


   // $FF: renamed from: <init> (com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication) void
   public void method_9991(YggdrasilUserAuthentication var1) {
      super();
      this.accessToken = var1.getAuthenticatedToken();
      this.clientToken = var1.getAuthenticationService().getClientToken();
   }
}
