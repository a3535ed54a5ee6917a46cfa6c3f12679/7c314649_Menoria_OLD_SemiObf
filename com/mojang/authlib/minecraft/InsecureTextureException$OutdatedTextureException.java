package com.mojang.authlib.minecraft;

import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.Calendar;
import java.util.Date;

public class InsecureTextureException$OutdatedTextureException extends InsecureTextureException {

   private final Date validFrom;
   private final Calendar limit;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1342;


   // $FF: renamed from: <init> (java.util.Date, java.util.Calendar) void
   public void method_1351(Date var1, Calendar var2) {
      StringBuilder var10001 = new StringBuilder();
      String[] var4 = field_1342;
      super.method_1348(var10001.append("Decrypted textures payload is too old (").append(var1).append(", but we need it to be at least ").append(var2).append(")").toString());
      MinecraftProfileTexture$Type.method_3335();
      this.validFrom = var1;

      try {
         this.limit = var2;
         if(class_689.method_3976() != 0) {
            MinecraftProfileTexture$Type.method_3334("o4MGZb");
         }

      } catch (InsecureTextureException$OutdatedTextureException var5) {
         throw method_1352(var5);
      }
   }

   // $FF: renamed from: b (com.mojang.authlib.minecraft.InsecureTextureException$OutdatedTextureException) com.mojang.authlib.minecraft.InsecureTextureException$OutdatedTextureException
   private static InsecureTextureException$OutdatedTextureException method_1352(InsecureTextureException$OutdatedTextureException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1353() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "grÇcW $fèQ)´mfäA8Qãa2ªP2¡mfëP}Y¦i5þ\'L#éV$E·m\"ªP8M·}4ïW}E¢q*åE9ª{fþK2¬d\"ª\f";
      int var4 = "grÇcW $fèQ)´mfäA8Qãa2ªP2¡mfëP}Y¦i5þ\'L#éV$E·m\"ªP8M·}4ïW}E¢q*åE9ª{fþK2¬d\"ª\f".length();
      char var1 = 6;
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
                  field_1342 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 173;
               break;
            case 1:
               var10009 = 227;
               break;
            case 2:
               var10009 = 47;
               break;
            case 3:
               var10009 = 129;
               break;
            case 4:
               var10009 = 248;
               break;
            case 5:
               var10009 = 144;
               break;
            default:
               var10009 = 102;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
