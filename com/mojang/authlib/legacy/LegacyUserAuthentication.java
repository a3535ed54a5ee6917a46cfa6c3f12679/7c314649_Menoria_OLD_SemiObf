package com.mojang.authlib.legacy;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.HttpUserAuthentication;
import com.mojang.authlib.legacy.LegacyAuthenticationService;
import java.net.URL;

public class LegacyUserAuthentication extends HttpUserAuthentication {

   private static final URL AUTHENTICATION_URL;
   private static final int AUTHENTICATION_VERSION = 14;
   private static final int RESPONSE_PART_PROFILE_NAME = 2;
   private static final int RESPONSE_PART_SESSION_TOKEN = 3;
   private static final int RESPONSE_PART_PROFILE_ID = 4;
   private String sessionToken;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_368;


   // $FF: renamed from: <init> (com.mojang.authlib.legacy.LegacyAuthenticationService) void
   protected void method_649(LegacyAuthenticationService var1) {
      super.method_646(var1);
   }

   public void logIn() {
      // $FF: Couldn't be decompiled
   }

   public void logOut() {
      super.logOut();
      this.sessionToken = null;
   }

   public boolean canPlayOnline() {
      // $FF: Couldn't be decompiled
   }

   public GameProfile[] getAvailableProfiles() {
      try {
         if(this.getSelectedProfile() != null) {
            return new GameProfile[]{this.getSelectedProfile()};
         }
      } catch (UnsupportedOperationException var1) {
         throw method_650(var1);
      }

      return new GameProfile[0];
   }

   public void selectGameProfile(GameProfile var1) {
      UnsupportedOperationException var10000 = new UnsupportedOperationException("Game profiles cannot be changed in the legacy authentication service");
      String[] var10002 = field_368;
      throw var10000;
   }

   public String getAuthenticatedToken() {
      return this.sessionToken;
   }

   public String getUserID() {
      return this.getUsername();
   }

   public LegacyAuthenticationService getAuthenticationService() {
      return (LegacyAuthenticationService)super.getAuthenticationService();
   }

   // $FF: renamed from: <clinit> () void
   static void method_644() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_650(Exception var0) {
      return var0;
   }
}
