package com.mojang.authlib;

import com.mojang.authlib.BaseAuthenticationService;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.Logger;

public abstract class HttpAuthenticationService extends BaseAuthenticationService {

   private static final Logger LOGGER;
   private final Proxy proxy;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1371;


   // $FF: renamed from: <init> (java.net.Proxy) void
   protected void method_1428(Proxy var1) {
      super.method_1427();
      Validate.notNull(var1);
      this.proxy = var1;
   }

   public Proxy getProxy() {
      return this.proxy;
   }

   protected HttpURLConnection createUrlConnection(URL var1) {
      Validate.notNull(var1);
      Logger var10000 = LOGGER;
      StringBuilder var10001 = new StringBuilder();
      String[] var10002 = field_1371;
      var10000.debug(var10001.append("Opening connection to ").append(var1).toString());
      HttpURLConnection var2 = (HttpURLConnection)var1.openConnection(this.proxy);
      var2.setConnectTimeout(15000);
      var2.setReadTimeout(15000);
      var2.setUseCaches(false);
      return var2;
   }

   public String performPostRequest(URL var1, String var2, String var3) {
      int[] var10000 = GameProfile.method_1307();
      Validate.notNull(var1);
      Validate.notNull(var2);
      int[] var4 = var10000;
      Validate.notNull(var3);
      HttpURLConnection var5 = this.createUrlConnection(var1);
      byte[] var6 = var2.getBytes(Charsets.UTF_8);
      String[] var13 = field_1371;
      var5.setRequestProperty("Content-Type", var3 + "; charset=utf-8");
      var5.setRequestProperty("Content-Length", "" + var6.length);
      var5.setDoOutput(true);
      LOGGER.debug("Writing POST data to " + var1 + ": " + var2);
      OutputStream var7 = null;

      try {
         var7 = var5.getOutputStream();
         IOUtils.write(var6, var7);
      } finally {
         IOUtils.closeQuietly(var7);
      }

      Logger var30 = LOGGER;
      StringBuilder var10001 = new StringBuilder();
      var13 = field_1371;
      var30.debug(var10001.append("Reading data from ").append(var1).toString());
      InputStream var8 = null;
      boolean var19 = false;

      String var10;
      label150: {
         String var11;
         try {
            var19 = true;
            var8 = var5.getInputStream();
            String var9 = IOUtils.toString(var8, Charsets.UTF_8);
            LOGGER.debug("Successful read, server response was " + var5.getResponseCode());
            LOGGER.debug("Response: " + var9);
            var10 = var9;
            var19 = false;
            break label150;
         } catch (IOException var28) {
            IOUtils.closeQuietly(var8);
            var8 = var5.getErrorStream();

            label160: {
               try {
                  if(var4 != null) {
                     throw var28;
                  }

                  if(var8 != null) {
                     break label160;
                  }
               } catch (IOException var27) {
                  throw method_1430(var27);
               }

               String[] var31 = field_1371;
               LOGGER.debug("Request failed", var28);
               throw var28;
            }

            var30 = LOGGER;
            var10001 = new StringBuilder();
            var13 = field_1371;
            var30.debug(var10001.append("Reading error page from ").append(var1).toString());
            var10 = IOUtils.toString(var8, Charsets.UTF_8);
            LOGGER.debug("Successful read, server response was " + var5.getResponseCode());
            LOGGER.debug("Response: " + var10);
            var11 = var10;
            var19 = false;
         } finally {
            if(var19) {
               IOUtils.closeQuietly(var8);
            }
         }

         try {
            IOUtils.closeQuietly(var8);
            if(class_689.method_3976() != 0) {
               GameProfile.method_1306(new int[5]);
            }

            return var11;
         } catch (IOException var25) {
            throw method_1430(var25);
         }
      }

      IOUtils.closeQuietly(var8);
      return var10;
   }

   public String performGetRequest(URL var1) {
      int[] var10000 = GameProfile.method_1307();
      Validate.notNull(var1);
      int[] var2 = var10000;
      HttpURLConnection var4 = this.createUrlConnection(var1);
      Logger var17 = LOGGER;
      StringBuilder var10001 = new StringBuilder();
      String[] var10 = field_1371;
      var17.debug(var10001.append("Reading data from ").append(var1).toString());
      InputStream var5 = null;

      String var8;
      try {
         String var7;
         try {
            var5 = var4.getInputStream();
            String var6 = IOUtils.toString(var5, Charsets.UTF_8);
            LOGGER.debug("Successful read, server response was " + var4.getResponseCode());
            LOGGER.debug("Response: " + var6);
            var7 = var6;
            return var7;
         } catch (IOException var15) {
            IOUtils.closeQuietly(var5);
            var5 = var4.getErrorStream();

            label93: {
               try {
                  if(var2 != null) {
                     throw var15;
                  }

                  if(var5 != null) {
                     break label93;
                  }
               } catch (IOException var14) {
                  throw method_1430(var14);
               }

               String[] var18 = field_1371;
               LOGGER.debug("Request failed", var15);
               throw var15;
            }

            var17 = LOGGER;
            var10001 = new StringBuilder();
            var10 = field_1371;
            var17.debug(var10001.append("Reading error page from ").append(var1).toString());
            var7 = IOUtils.toString(var5, Charsets.UTF_8);
            LOGGER.debug("Successful read, server response was " + var4.getResponseCode());
            LOGGER.debug("Response: " + var7);
            var8 = var7;
         }
      } finally {
         IOUtils.closeQuietly(var5);
      }

      if(var2 != null) {
         int var3 = class_689.method_3976();
         ++var3;
         class_689.method_3975(var3);
      }

      return var8;
   }

   public static URL constantURL(String var0) {
      try {
         return new URL(var0);
      } catch (MalformedURLException var2) {
         Error var10000 = new Error;
         StringBuilder var10002 = new StringBuilder();
         String[] var10003 = field_1371;
         var10000.<init>(var10002.append("Couldn\'t create constant for ").append(var0).toString(), var2);
         throw var10000;
      }
   }

   public static String buildQuery(Map<String, Object> param0) {
      // $FF: Couldn't be decompiled
   }

   public static URL concatenateURL(URL param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_1429() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_1430(Exception var0) {
      return var0;
   }
}
