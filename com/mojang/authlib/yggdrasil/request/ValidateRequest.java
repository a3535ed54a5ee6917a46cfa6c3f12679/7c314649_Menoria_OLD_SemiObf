package com.mojang.authlib.yggdrasil.request;

import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;

public class ValidateRequest {

   private String clientToken;
   private String accessToken;
   // $FF: renamed from: a sa[]
   private static class_689[] field_2699;


   // $FF: renamed from: <init> (com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication) void
   public void method_3421(YggdrasilUserAuthentication var1) {
      super();
      this.clientToken = var1.getAuthenticationService().getClientToken();
      this.accessToken = var1.getAuthenticatedToken();
   }

   // $FF: renamed from: b (sa[]) void
   public static void method_3422(class_689[] var0) {
      field_2699 = var0;
   }

   // $FF: renamed from: a () sa[]
   public static class_689[] method_3423() {
      return field_2699;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3424() {
      if(method_3423() != null) {
         method_3422(new class_689[4]);
      }

   }
}
