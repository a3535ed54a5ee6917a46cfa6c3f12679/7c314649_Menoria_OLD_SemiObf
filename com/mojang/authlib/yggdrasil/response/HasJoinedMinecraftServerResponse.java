package com.mojang.authlib.yggdrasil.response;

import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.response.Response;
import java.util.UUID;

public class HasJoinedMinecraftServerResponse extends Response {

   // $FF: renamed from: id java.util.UUID
   private UUID field_1289;
   private PropertyMap properties;


   // $FF: renamed from: <init> () void
   public void method_1301() {
      super.method_1301();
   }

   public UUID getId() {
      return this.field_1289;
   }

   public PropertyMap getProperties() {
      return this.properties;
   }
}
