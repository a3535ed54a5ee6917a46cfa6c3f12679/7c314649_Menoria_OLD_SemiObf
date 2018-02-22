package com.mojang.authlib.yggdrasil;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;

class YggdrasilMinecraftSessionService$1 extends CacheLoader {

   final YggdrasilMinecraftSessionService this$0;


   // $FF: renamed from: <init> (com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService) void
   void method_1439(YggdrasilMinecraftSessionService var1) {
      this.this$0 = var1;
      super();
   }

   public Object load(Object var1) {
      return this.this$0.fillGameProfile((GameProfile)var1, false);
   }
}
