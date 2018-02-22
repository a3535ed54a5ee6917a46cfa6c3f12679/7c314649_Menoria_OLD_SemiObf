package com.mojang.authlib;

import com.mojang.authlib.BaseUserAuthentication;
import com.mojang.authlib.HttpAuthenticationService;

public abstract class HttpUserAuthentication extends BaseUserAuthentication {

   // $FF: renamed from: <init> (com.mojang.authlib.HttpAuthenticationService) void
   protected void method_646(HttpAuthenticationService var1) {
      super.method_643(var1);
   }

   public HttpAuthenticationService getAuthenticationService() {
      return (HttpAuthenticationService)super.getAuthenticationService();
   }
}
