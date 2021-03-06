package com.mojang.authlib;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.UserType;
import com.mojang.authlib.properties.PropertyMap;
import java.util.Map;

public interface UserAuthentication {

   boolean canLogIn();

   void logIn();

   void logOut();

   boolean isLoggedIn();

   boolean canPlayOnline();

   GameProfile[] getAvailableProfiles();

   GameProfile getSelectedProfile();

   void selectGameProfile(GameProfile var1);

   void loadFromStorage(Map<String, Object> var1);

   Map<String, Object> saveForStorage();

   void setUsername(String var1);

   void setPassword(String var1);

   String getAuthenticatedToken();

   String getUserID();

   PropertyMap getUserProperties();

   UserType getUserType();
}
