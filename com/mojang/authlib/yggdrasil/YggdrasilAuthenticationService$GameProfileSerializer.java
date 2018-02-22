package com.mojang.authlib.yggdrasil;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService$1;
import java.lang.reflect.Type;
import java.util.UUID;

class YggdrasilAuthenticationService$GameProfileSerializer implements JsonSerializer<GameProfile>, JsonDeserializer<GameProfile> {

   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2978;


   // $FF: renamed from: <init> () void
   private void method_3829() {
      super();
   }

   public GameProfile deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      String var10000 = YggdrasilAuthenticationService.method_1433();
      JsonObject var5 = (JsonObject)var1;
      String var4 = var10000;
      Object var9 = var5;
      String[] var8;
      if(var4 != null) {
         var8 = field_2978;
         var9 = var5.has("id")?var3.deserialize(var5.get("id"), UUID.class):null;
      }

      UUID var6;
      label21: {
         var6 = (UUID)((UUID)var9);
         JsonObject var10 = var5;
         var8 = field_2978;
         String var10001 = "name";
         if(var4 != null) {
            if(!var5.has("name")) {
               var10000 = null;
               break label21;
            }

            var10 = var5;
            var10001 = "name";
         }

         var10000 = var10.getAsJsonPrimitive(var10001).getAsString();
      }

      String var7 = var10000;
      GameProfile var11 = new GameProfile;
      var11.method_1305(var6, var7);
      return var11;
   }

   public JsonElement serialize(GameProfile var1, Type var2, JsonSerializationContext var3) {
      String var10000 = YggdrasilAuthenticationService.method_1433();
      JsonObject var5 = new JsonObject();
      String var4 = var10000;
      GameProfile var7 = var1;
      if(var4 != null) {
         if(var1.getId() != null) {
            String[] var6 = field_2978;
            var5.add("id", var3.serialize(var1.getId()));
         }

         var7 = var1;
      }

      if(var7.getName() != null) {
         String[] var10001 = field_2978;
         var5.addProperty("name", var1.getName());
      }

      return var5;
   }

   // $FF: renamed from: <init> (com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService$1) void
   void method_3830(YggdrasilAuthenticationService$1 var1) {
      this.method_3829();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3831() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Àe{Å";
      int var4 = "Àe{Å".length();
      char var1 = 4;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2978 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 245;
               break;
            case 1:
               var10009 = 43;
               break;
            case 2:
               var10009 = 130;
               break;
            case 3:
               var10009 = 148;
               break;
            case 4:
               var10009 = 196;
               break;
            case 5:
               var10009 = 61;
               break;
            default:
               var10009 = 164;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
