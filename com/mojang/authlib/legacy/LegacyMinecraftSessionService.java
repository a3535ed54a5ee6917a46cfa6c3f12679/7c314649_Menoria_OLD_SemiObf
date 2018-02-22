package com.mojang.authlib.legacy;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.HttpAuthenticationService;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.legacy.LegacyAuthenticationService;
import com.mojang.authlib.minecraft.HttpMinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class LegacyMinecraftSessionService extends HttpMinecraftSessionService {

   private static final String BASE_URL;
   private static final URL JOIN_URL;
   private static final URL CHECK_URL;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2981;


   // $FF: renamed from: <init> (com.mojang.authlib.legacy.LegacyAuthenticationService) void
   protected void method_3840(LegacyAuthenticationService var1) {
      super.method_3836(var1);
   }

   public void joinServer(GameProfile var1, String var2, String var3) {
      HashMap var5 = new HashMap();
      String[] var8 = field_2981;
      var5.put("user", var1.getName());
      var5.put("sessionId", var2);
      int var4 = LegacyAuthenticationService.method_1436();
      var5.put("serverId", var3);
      URL var6 = HttpAuthenticationService.concatenateURL(JOIN_URL, HttpAuthenticationService.buildQuery(var5));

      try {
         String var7 = this.getAuthenticationService().performGetRequest(var6);

         try {
            if(!var7.equals("OK")) {
               AuthenticationException var12 = new AuthenticationException;
               var12.method_428(var7);
               throw var12;
            }
         } catch (IOException var10) {
            throw method_3842(var10);
         }
      } catch (IOException var11) {
         AuthenticationUnavailableException var10000 = new AuthenticationUnavailableException;
         var10000.method_430(var11);
         throw var10000;
      }

      try {
         if(class_689.method_3976() != 0) {
            ++var4;
            LegacyAuthenticationService.method_1435(var4);
         }

      } catch (IOException var9) {
         throw method_3842(var9);
      }
   }

   public GameProfile hasJoinedServer(GameProfile var1, String var2) {
      HashMap var3 = new HashMap();
      String[] var6 = field_2981;
      var3.put("user", var1.getName());
      var3.put("serverId", var2);
      URL var4 = HttpAuthenticationService.concatenateURL(CHECK_URL, HttpAuthenticationService.buildQuery(var3));

      try {
         String var5 = this.getAuthenticationService().performGetRequest(var4);

         GameProfile var9;
         try {
            if(var5.equals("YES")) {
               var9 = var1;
               return var9;
            }
         } catch (IOException var7) {
            throw method_3842(var7);
         }

         var9 = null;
         return var9;
      } catch (IOException var8) {
         AuthenticationUnavailableException var10000 = new AuthenticationUnavailableException;
         var10000.method_430(var8);
         throw var10000;
      }
   }

   public Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> getTextures(GameProfile var1, boolean var2) {
      return new HashMap();
   }

   public GameProfile fillProfileProperties(GameProfile var1, boolean var2) {
      return var1;
   }

   public LegacyAuthenticationService getAuthenticationService() {
      return (LegacyAuthenticationService)super.getAuthenticationService();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3841() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_3842(IOException var0) {
      return var0;
   }
}
