package com.mojang.authlib.minecraft;

import com.mojang.authlib.HttpAuthenticationService;
import com.mojang.authlib.minecraft.BaseMinecraftSessionService;

public abstract class HttpMinecraftSessionService extends BaseMinecraftSessionService {

   // $FF: renamed from: <init> (com.mojang.authlib.HttpAuthenticationService) void
   protected void method_3836(HttpAuthenticationService var1) {
      super.method_3835(var1);
   }

   public HttpAuthenticationService getAuthenticationService() {
      return (HttpAuthenticationService)super.getAuthenticationService();
   }
}
