package com.mojang.authlib.minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.Map;

public interface MinecraftSessionService {

   void joinServer(GameProfile var1, String var2, String var3);

   GameProfile hasJoinedServer(GameProfile var1, String var2);

   Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> getTextures(GameProfile var1, boolean var2);

   GameProfile fillProfileProperties(GameProfile var1, boolean var2);
}
