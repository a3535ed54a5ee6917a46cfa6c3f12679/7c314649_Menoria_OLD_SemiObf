package com.mojang.authlib.yggdrasil.response;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.Map;
import java.util.UUID;

public class MinecraftTexturesPayload {

   private long timestamp;
   private UUID profileId;
   private String profileName;
   private boolean isPublic;
   private Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> textures;


   // $FF: renamed from: <init> () void
   public void method_2038() {
      super();
   }

   public long getTimestamp() {
      return this.timestamp;
   }

   public UUID getProfileId() {
      return this.profileId;
   }

   public String getProfileName() {
      return this.profileName;
   }

   public boolean isPublic() {
      return this.isPublic;
   }

   public Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> getTextures() {
      return this.textures;
   }
}
