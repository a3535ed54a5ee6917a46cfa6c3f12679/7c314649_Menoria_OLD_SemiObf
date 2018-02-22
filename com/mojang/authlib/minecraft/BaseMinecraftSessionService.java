package com.mojang.authlib.minecraft;

import com.mojang.authlib.AuthenticationService;
import com.mojang.authlib.minecraft.MinecraftSessionService;

public abstract class BaseMinecraftSessionService implements MinecraftSessionService {

   private final AuthenticationService authenticationService;


   // $FF: renamed from: <init> (com.mojang.authlib.AuthenticationService) void
   protected void method_3835(AuthenticationService var1) {
      super();
      this.authenticationService = var1;
   }

   public AuthenticationService getAuthenticationService() {
      return this.authenticationService;
   }
}
