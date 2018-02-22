package com.mojang.authlib.minecraft;

import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MinecraftProfileTexture {

   private final String url;
   private final Map<String, String> metadata;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2943;


   // $FF: renamed from: <init> (java.lang.String, java.util.Map) void
   public void method_3708(String var1, Map<String, String> var2) {
      super();
      this.url = var1;
      this.metadata = var2;
   }

   public String getUrl() {
      return this.url;
   }

   public String getMetadata(String var1) {
      String var2 = MinecraftProfileTexture$Type.method_3335();
      Object var10000 = this.metadata;
      if(var2 == null) {
         if(this.metadata == null) {
            return null;
         }

         var10000 = this.metadata.get(var1);
      }

      return (String)var10000;
   }

   public String getHash() {
      return FilenameUtils.getBaseName(this.url);
   }

   public String toString() {
      ToStringBuilder var10000 = new ToStringBuilder(this);
      String[] var1 = field_2943;
      return var10000.append("url", this.url).append("hash", this.getHash()).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3709() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ó9wî&";
      int var4 = "ó9wî&".length();
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
                  field_2943 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 250;
               break;
            case 1:
               var10009 = 20;
               break;
            case 2:
               var10009 = 43;
               break;
            case 3:
               var10009 = 126;
               break;
            case 4:
               var10009 = 130;
               break;
            case 5:
               var10009 = 247;
               break;
            default:
               var10009 = 248;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
