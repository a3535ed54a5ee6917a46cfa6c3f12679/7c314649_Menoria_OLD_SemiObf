package com.mojang.authlib.yggdrasil;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.HttpMinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService$1;
import com.mojang.authlib.yggdrasil.request.JoinMinecraftServerRequest;
import com.mojang.authlib.yggdrasil.response.Response;
import com.mojang.util.UUIDTypeAdapter;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Logger;

public class YggdrasilMinecraftSessionService extends HttpMinecraftSessionService {

   private static final String[] WHITELISTED_DOMAINS;
   private static final Logger LOGGER;
   private static final URL JOIN_URL;
   private static final URL CHECK_URL;
   private final PublicKey publicKey;
   private final Gson gson;
   private final LoadingCache<GameProfile, GameProfile> insecureProfiles;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2980;


   // $FF: renamed from: <init> (com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService) void
   protected void method_3837(YggdrasilAuthenticationService var1) {
      super.method_3836(var1);
      GsonBuilder var10001 = new GsonBuilder();
      UUIDTypeAdapter var10003 = new UUIDTypeAdapter;
      var10003.method_3218();
      this.gson = var10001.registerTypeAdapter(UUID.class, var10003).create();
      CacheBuilder var7 = CacheBuilder.newBuilder().expireAfterWrite(6L, TimeUnit.HOURS);
      YggdrasilMinecraftSessionService$1 var10002 = new YggdrasilMinecraftSessionService$1;
      var10002.method_1439(this);
      this.insecureProfiles = var7.build(var10002);

      try {
         X509EncodedKeySpec var6 = new X509EncodedKeySpec(IOUtils.toByteArray(YggdrasilMinecraftSessionService.class.getResourceAsStream("/yggdrasil_session_pubkey.der")));
         String[] var4 = field_2980;
         X509EncodedKeySpec var2 = var6;
         KeyFactory var3 = KeyFactory.getInstance("RSA");
         this.publicKey = var3.generatePublic(var2);
      } catch (Exception var5) {
         Error var10000 = new Error("Missing/invalid yggdrasil public key!");
         String[] var8 = field_2980;
         throw var10000;
      }
   }

   public void joinServer(GameProfile var1, String var2, String var3) {
      JoinMinecraftServerRequest var10000 = new JoinMinecraftServerRequest;
      var10000.method_5055();
      JoinMinecraftServerRequest var4 = var10000;
      var4.accessToken = var2;
      var4.selectedProfile = var1.getId();
      var4.serverId = var3;
      this.getAuthenticationService().makeRequest(JOIN_URL, var4, Response.class);
   }

   public GameProfile hasJoinedServer(GameProfile param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> getTextures(GameProfile param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public GameProfile fillProfileProperties(GameProfile param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   protected GameProfile fillGameProfile(GameProfile param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public YggdrasilAuthenticationService getAuthenticationService() {
      return (YggdrasilAuthenticationService)super.getAuthenticationService();
   }

   private static boolean isWhitelistedDomain(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_3838() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_3839(Exception var0) {
      return var0;
   }
}
