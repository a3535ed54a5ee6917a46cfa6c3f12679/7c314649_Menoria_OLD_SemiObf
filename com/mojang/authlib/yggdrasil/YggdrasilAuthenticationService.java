package com.mojang.authlib.yggdrasil;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.HttpAuthenticationService;
import com.mojang.authlib.UserAuthentication;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.properties.PropertyMap$Serializer;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService$1;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService$GameProfileSerializer;
import com.mojang.authlib.yggdrasil.YggdrasilGameProfileRepository;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import com.mojang.authlib.yggdrasil.response.ProfileSearchResultsResponse;
import com.mojang.authlib.yggdrasil.response.ProfileSearchResultsResponse$Serializer;
import com.mojang.authlib.yggdrasil.response.Response;
import com.mojang.util.UUIDTypeAdapter;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.UUID;

public class YggdrasilAuthenticationService extends HttpAuthenticationService {

   private final String clientToken;
   private final Gson gson;
   // $FF: renamed from: a java.lang.String
   private static String field_1372;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_1373;


   // $FF: renamed from: <init> (java.net.Proxy, java.lang.String) void
   public void method_1431(Proxy var1, String var2) {
      super.method_1428(var1);
      this.clientToken = var2;
      GsonBuilder var3 = new GsonBuilder();
      YggdrasilAuthenticationService$GameProfileSerializer var10002 = new YggdrasilAuthenticationService$GameProfileSerializer;
      var10002.method_3830((YggdrasilAuthenticationService$1)null);
      var3.registerTypeAdapter(GameProfile.class, var10002);
      PropertyMap$Serializer var4 = new PropertyMap$Serializer;
      var4.method_5105();
      var3.registerTypeAdapter(PropertyMap.class, var4);
      UUIDTypeAdapter var5 = new UUIDTypeAdapter;
      var5.method_3218();
      var3.registerTypeAdapter(UUID.class, var5);
      ProfileSearchResultsResponse$Serializer var6 = new ProfileSearchResultsResponse$Serializer;
      var6.method_3820();
      var3.registerTypeAdapter(ProfileSearchResultsResponse.class, var6);
      this.gson = var3.create();
   }

   public UserAuthentication createUserAuthentication(Agent var1) {
      YggdrasilUserAuthentication var10000 = new YggdrasilUserAuthentication;
      var10000.method_647(this, var1);
      return var10000;
   }

   public MinecraftSessionService createMinecraftSessionService() {
      YggdrasilMinecraftSessionService var10000 = new YggdrasilMinecraftSessionService;
      var10000.method_3837(this);
      return var10000;
   }

   public GameProfileRepository createProfileRepository() {
      YggdrasilGameProfileRepository var10000 = new YggdrasilGameProfileRepository;
      var10000.method_7760(this);
      return var10000;
   }

   protected <T extends Response> T makeRequest(URL param1, Object param2, Class<T> param3) {
      // $FF: Couldn't be decompiled
   }

   public String getClientToken() {
      return this.clientToken;
   }

   // $FF: renamed from: a (java.lang.String) void
   public static void method_1432(String var0) {
      field_1372 = var0;
   }

   // $FF: renamed from: a () java.lang.String
   public static String method_1433() {
      return field_1372;
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_1434(IOException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1429() {
      // $FF: Couldn't be decompiled
   }
}
