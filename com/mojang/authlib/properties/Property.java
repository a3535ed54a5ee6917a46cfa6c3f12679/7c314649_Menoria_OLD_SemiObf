package com.mojang.authlib.properties;

import com.mojang.authlib.properties.PropertyMap;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.apache.commons.codec.binary.Base64;

public class Property {

   private final String name;
   private final String value;
   private final String signature;
   // $FF: renamed from: h java.lang.String
   private static final String field_4845 = "SHA1withRSA";


   // $FF: renamed from: <init> (java.lang.String, java.lang.String) void
   public void method_5530(String var1, String var2) {
      this.method_5531(var1, var2, (String)null);
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.String, java.lang.String) void
   public void method_5531(String var1, String var2, String var3) {
      int[] var10000 = PropertyMap.getBlock86();
      super();
      int[] var4 = var10000;
      this.name = var1;
      this.value = var2;
      this.signature = var3;
      if(var4 == null) {
         int var5 = class_689.method_3976();
         ++var5;
         class_689.method_3975(var5);
      }

   }

   public String getName() {
      return this.name;
   }

   public String getValue() {
      return this.value;
   }

   public String getSignature() {
      return this.signature;
   }

   public boolean hasSignature() {
      return this.signature != null;
   }

   public boolean isSignatureValid(PublicKey var1) {
      try {
         Signature var2 = Signature.getInstance("SHA1withRSA");
         var2.initVerify(var1);
         var2.update(this.value.getBytes());
         return var2.verify(Base64.decodeBase64(this.signature));
      } catch (NoSuchAlgorithmException var3) {
         var3.printStackTrace();
      } catch (InvalidKeyException var4) {
         var4.printStackTrace();
      } catch (SignatureException var5) {
         var5.printStackTrace();
      }

      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5532() {
      boolean var10000 = true;
      char[] var10003 = "elJD´ð^v:".toCharArray();
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
            field_4845 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 91;
            break;
         case 1:
            var10009 = 73;
            break;
         case 2:
            var10009 = 60;
            break;
         case 3:
            var10009 = 22;
            break;
         case 4:
            var10009 = 94;
            break;
         case 5:
            var10009 = 176;
            break;
         default:
            var10009 = 233;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
