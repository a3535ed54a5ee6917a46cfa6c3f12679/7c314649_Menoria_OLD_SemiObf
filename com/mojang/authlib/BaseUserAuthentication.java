package com.mojang.authlib;

import com.mojang.authlib.AuthenticationService;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.UserAuthentication;
import com.mojang.authlib.UserType;
import com.mojang.authlib.properties.PropertyMap;
import java.util.Map;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.Logger;

public abstract class BaseUserAuthentication implements UserAuthentication {

   private static final Logger LOGGER;
   protected static final String STORAGE_KEY_PROFILE_NAME;
   protected static final String STORAGE_KEY_PROFILE_ID;
   protected static final String STORAGE_KEY_PROFILE_PROPERTIES;
   protected static final String STORAGE_KEY_USER_NAME;
   protected static final String STORAGE_KEY_USER_ID;
   protected static final String STORAGE_KEY_USER_PROPERTIES;
   private final AuthenticationService authenticationService;
   private final PropertyMap userProperties;
   private String userid;
   private String username;
   private String password;
   private GameProfile selectedProfile;
   private UserType userType;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_366;


   // $FF: renamed from: <init> (com.mojang.authlib.AuthenticationService) void
   protected void method_643(AuthenticationService var1) {
      super();
      PropertyMap var10001 = new PropertyMap;
      var10001.getBlock84();
      this.userProperties = var10001;
      Validate.notNull(var1);
      this.authenticationService = var1;
   }

   public boolean canLogIn() {
      // $FF: Couldn't be decompiled
   }

   public void logOut() {
      this.password = null;
      this.userid = null;
      this.setSelectedProfile((GameProfile)null);
      this.getModifiableUserProperties().clear();
      this.setUserType((UserType)null);
   }

   public boolean isLoggedIn() {
      boolean var10000;
      try {
         if(this.getSelectedProfile() != null) {
            var10000 = true;
            return var10000;
         }
      } catch (IllegalStateException var1) {
         throw method_645(var1);
      }

      var10000 = false;
      return var10000;
   }

   public void setUsername(String param1) {
      // $FF: Couldn't be decompiled
   }

   public void setPassword(String param1) {
      // $FF: Couldn't be decompiled
   }

   protected String getUsername() {
      return this.username;
   }

   protected String getPassword() {
      return this.password;
   }

   public void loadFromStorage(Map<String, Object> param1) {
      // $FF: Couldn't be decompiled
   }

   public Map<String, Object> saveForStorage() {
      // $FF: Couldn't be decompiled
   }

   protected void setSelectedProfile(GameProfile var1) {
      this.selectedProfile = var1;
   }

   public GameProfile getSelectedProfile() {
      return this.selectedProfile;
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }

   public AuthenticationService getAuthenticationService() {
      return this.authenticationService;
   }

   public String getUserID() {
      return this.userid;
   }

   public PropertyMap getUserProperties() {
      PropertyMap var10000;
      if(this.isLoggedIn()) {
         var10000 = new PropertyMap;
         var10000.getBlock84();
         PropertyMap var1 = var10000;
         var1.putAll(this.getModifiableUserProperties());
         return var1;
      } else {
         var10000 = new PropertyMap;
         var10000.getBlock84();
         return var10000;
      }
   }

   protected PropertyMap getModifiableUserProperties() {
      return this.userProperties;
   }

   public UserType getUserType() {
      // $FF: Couldn't be decompiled
   }

   protected void setUserType(UserType var1) {
      this.userType = var1;
   }

   protected void setUserid(String var1) {
      this.userid = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_644() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_645(Throwable var0) {
      return var0;
   }
}
