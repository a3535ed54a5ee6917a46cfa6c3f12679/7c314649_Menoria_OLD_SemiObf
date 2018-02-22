package com.mojang.authlib.minecraft;

import com.mojang.authlib.minecraft.InsecureTextureException;

public class InsecureTextureException$MissingTextureException extends InsecureTextureException {

   // $FF: renamed from: h java.lang.String
   private static final String field_1341 = "No texture information found";


   // $FF: renamed from: <init> () void
   public void method_1349() {
      super.method_1348("No texture information found");
   }

   // $FF: renamed from: <clinit> () void
   static void method_1350() {
      boolean var10000 = true;
      char[] var10003 = "û_¢÷¦è*æöû°ú0æ·æ·ó1´¹ç°ø".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_1341 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 106;
            break;
         case 1:
            var10009 = 161;
            break;
         case 2:
            var10009 = 74;
            break;
         case 3:
            var10009 = 227;
            break;
         case 4:
            var10009 = 167;
            break;
         case 5:
            var10009 = 235;
            break;
         default:
            var10009 = 169;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
