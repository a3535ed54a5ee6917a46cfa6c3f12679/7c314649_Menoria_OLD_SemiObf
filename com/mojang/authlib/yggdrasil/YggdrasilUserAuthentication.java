package com.mojang.authlib.yggdrasil;

import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.HttpUserAuthentication;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.request.ValidateRequest;
import com.mojang.authlib.yggdrasil.response.Response;
import com.mojang.authlib.yggdrasil.response.User;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Logger;

public class YggdrasilUserAuthentication extends HttpUserAuthentication {

   private static final Logger LOGGER;
   private static final String BASE_URL;
   private static final URL ROUTE_AUTHENTICATE;
   private static final URL ROUTE_REFRESH;
   private static final URL ROUTE_VALIDATE;
   private static final URL ROUTE_INVALIDATE;
   private static final URL ROUTE_SIGNOUT;
   private static final String STORAGE_KEY_ACCESS_TOKEN;
   private final Agent agent;
   private GameProfile[] profiles;
   private String accessToken;
   private boolean isOnline;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_367;


   // $FF: renamed from: <init> (com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService, com.mojang.authlib.Agent) void
   public void method_647(YggdrasilAuthenticationService var1, Agent var2) {
      super.method_646(var1);
      this.agent = var2;
   }

   public boolean canLogIn() {
      // $FF: Couldn't be decompiled
   }

   public void logIn() {
      // $FF: Couldn't be decompiled
   }

   protected void logInWithPassword() {
      // $FF: Couldn't be decompiled
   }

   protected void updateUserProperties(User param1) {
      // $FF: Couldn't be decompiled
   }

   protected void logInWithToken() {
      // $FF: Couldn't be decompiled
   }

   protected boolean checkTokenValidity() {
      ValidateRequest var10000 = new ValidateRequest;
      var10000.method_3421(this);
      ValidateRequest var1 = var10000;

      try {
         this.getAuthenticationService().makeRequest(ROUTE_VALIDATE, var1, Response.class);
         return true;
      } catch (AuthenticationException var3) {
         return false;
      }
   }

   public void logOut() {
      super.logOut();
      this.accessToken = null;
      this.profiles = null;
      this.isOnline = false;
   }

   public GameProfile[] getAvailableProfiles() {
      return this.profiles;
   }

   public boolean isLoggedIn() {
      return StringUtils.isNotBlank(this.accessToken);
   }

   public boolean canPlayOnline() {
      // $FF: Couldn't be decompiled
   }

   public void selectGameProfile(GameProfile param1) {
      // $FF: Couldn't be decompiled
   }

   public void loadFromStorage(Map<String, Object> var1) {
      super.loadFromStorage(var1);
      String[] var10002 = field_367;
      this.accessToken = String.valueOf(var1.get("accessToken"));
   }

   public Map<String, Object> saveForStorage() {
      // $FF: Couldn't be decompiled
   }

   public String getSessionToken() {
      // $FF: Couldn't be decompiled
   }

   public String getAuthenticatedToken() {
      return this.accessToken;
   }

   public Agent getAgent() {
      return this.agent;
   }

   public String toString() {
      String var1 = YggdrasilAuthenticationService.method_1433();

      try {
         StringBuilder var10000 = new StringBuilder();
         String[] var2 = field_367;
         String var4 = var10000.append("YggdrasilAuthenticationService{agent=").append(this.agent).append(", profiles=").append(Arrays.toString(this.profiles)).append(", selectedProfile=").append(this.getSelectedProfile()).append(", username=\'").append(this.getUsername()).append('\'').append(", isLoggedIn=").append(this.isLoggedIn()).append(", userType=").append(this.getUserType()).append(", canPlayOnline=").append(this.canPlayOnline()).append(", accessToken=\'").append(this.accessToken).append('\'').append(", clientToken=\'").append(this.getAuthenticationService().getClientToken()).append('\'').append('}').toString();
         if(class_689.method_3976() != 0) {
            YggdrasilAuthenticationService.method_1432("W0uIn");
         }

         return var4;
      } catch (IllegalArgumentException var3) {
         throw method_648(var3);
      }
   }

   public YggdrasilAuthenticationService getAuthenticationService() {
      return (YggdrasilAuthenticationService)super.getAuthenticationService();
   }

   // $FF: renamed from: <clinit> () void
   static void method_644() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_648(IllegalArgumentException var0) {
      return var0;
   }
}
