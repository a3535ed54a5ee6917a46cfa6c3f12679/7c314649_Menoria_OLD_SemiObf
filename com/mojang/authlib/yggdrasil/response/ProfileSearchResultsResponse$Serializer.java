package com.mojang.authlib.yggdrasil.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.response.ProfileSearchResultsResponse;
import com.mojang.authlib.yggdrasil.response.Response;
import java.lang.reflect.Type;

public class ProfileSearchResultsResponse$Serializer implements JsonDeserializer<ProfileSearchResultsResponse> {

   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2975;


   // $FF: renamed from: <init> () void
   public void method_3820() {
      super();
   }

   public ProfileSearchResultsResponse deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      ProfileSearchResultsResponse var6;
      label46: {
         int[] var10000 = Response.method_1303();
         ProfileSearchResultsResponse var10001 = new ProfileSearchResultsResponse;
         var10001.method_1301();
         var6 = var10001;
         int[] var4 = var10000;
         JsonElement var9 = var1;
         if(var4 == null) {
            if(!(var1 instanceof JsonObject)) {
               break label46;
            }

            var9 = var1;
         }

         JsonObject var7 = (JsonObject)var9;
         String[] var8 = field_2975;
         boolean var10 = var7.has("error");
         if(var4 == null) {
            if(var10) {
               var6.setError(var7.getAsJsonPrimitive("error").getAsString());
            }

            var8 = field_2975;
            var10 = var7.has("errorMessage");
         }

         if(var4 == null) {
            if(var10) {
               var8 = field_2975;
               var6.setError(var7.getAsJsonPrimitive("errorMessage").getAsString());
            }

            var8 = field_2975;
            var10 = var7.has("cause");
         }

         if(var10) {
            String[] var10002 = field_2975;
            var6.setError(var7.getAsJsonPrimitive("cause").getAsString());
         }

         if(var4 == null) {
            return var6;
         }

         int var5 = class_689.method_3977();
         ++var5;
         class_689.method_3975(var5);
      }

      ProfileSearchResultsResponse.access$002(var6, (GameProfile[])((GameProfile[])var3.deserialize(var1, GameProfile[].class)));
      return var6;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3821() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "_*oï\\wI+|çKY9hóK_*oï\\";
      int var4 = "_*oï\\wI+|çKY9hóK_*oï\\".length();
      char var1 = 12;
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
                  field_2975 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 148;
               break;
            case 1:
               var10009 = 246;
               break;
            case 2:
               var10009 = 179;
               break;
            case 3:
               var10009 = 46;
               break;
            case 4:
               var10009 = 128;
               break;
            case 5:
               var10009 = 103;
               break;
            default:
               var10009 = 188;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
