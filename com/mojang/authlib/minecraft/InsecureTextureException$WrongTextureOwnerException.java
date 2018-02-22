package com.mojang.authlib.minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.UUID;

public class InsecureTextureException$WrongTextureOwnerException extends InsecureTextureException {

   private final GameProfile expected;
   private final UUID resultId;
   private final String resultName;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1343;


   // $FF: renamed from: <init> (com.mojang.authlib.GameProfile, java.util.UUID, java.lang.String) void
   public void method_1354(GameProfile var1, UUID var2, String var3) {
      StringBuilder var10001 = new StringBuilder();
      String[] var6 = field_1343;
      super.method_1348(var10001.append("Decrypted textures payload was for another user (expected ").append(var1.getId()).append("/").append(var1.getName()).append(" but was for ").append(var2).append("/").append(var3).append(")").toString());
      String var10000 = MinecraftProfileTexture$Type.method_3335();
      this.expected = var1;
      String var4 = var10000;
      this.resultId = var2;
      this.resultName = var3;
      if(var4 != null) {
         int var5 = class_689.method_3976();
         ++var5;
         class_689.method_3975(var5);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_1355() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "7¶ \"[-Ádô39\tz:S±6$*Ôr°u\"\"Ôb¦0%[*Án¸:7z×v§u0(vº:\"?Ò7¡&3\tzr¬%3.Åsô";
      int var4 = "7¶ \"[-Ádô39\tz:S±6$*Ôr°u\"\"Ôb¦0%[*Án¸:7z×v§u0(vº:\"?Ò7¡&3\tzr¬%3.Åsô".length();
      char var1 = 13;
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
                  field_1343 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 125;
               break;
            case 1:
               var10009 = 190;
               break;
            case 2:
               var10009 = 63;
               break;
            case 3:
               var10009 = 60;
               break;
            case 4:
               var10009 = 17;
               break;
            case 5:
               var10009 = 48;
               break;
            default:
               var10009 = 202;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
