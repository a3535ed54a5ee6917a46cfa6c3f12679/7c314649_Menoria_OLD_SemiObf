package com.mojang.authlib.yggdrasil.request;

import com.mojang.authlib.Agent;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import com.mojang.authlib.yggdrasil.request.ValidateRequest;

public class AuthenticationRequest {

   private Agent agent;
   private String username;
   private String password;
   private String clientToken;
   private boolean requestUser;


   // $FF: renamed from: <init> (com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication, java.lang.String, java.lang.String) void
   public void method_3208(YggdrasilUserAuthentication var1, String var2, String var3) {
      super();
      class_689[] var10000 = ValidateRequest.method_3423();
      this.requestUser = true;
      class_689[] var4 = var10000;
      this.agent = var1.getAgent();
      this.username = var2;
      this.clientToken = var1.getAuthenticationService().getClientToken();
      this.password = var3;
      if(var4 != null) {
         int var5 = class_689.method_3977();
         ++var5;
         class_689.method_3975(var5);
      }

   }
}
