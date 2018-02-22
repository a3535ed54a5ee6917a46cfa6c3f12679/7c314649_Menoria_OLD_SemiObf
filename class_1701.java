import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $FF: renamed from: vf
public class class_1701 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8922;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8923;


   // $FF: renamed from: <init> () void
   public void method_9417() {
      super();
   }

   // $FF: renamed from: b () javax.crypto.SecretKey
   public static SecretKey method_9418() {
      try {
         String[] var10000 = field_8923;
         KeyGenerator var0 = KeyGenerator.getInstance("AES");
         var0.init(128);
         return var0.generateKey();
      } catch (NoSuchAlgorithmException var1) {
         throw new Error(var1);
      }
   }

   // $FF: renamed from: c () java.security.KeyPair
   public static KeyPair method_9419() {
      try {
         String[] var1 = field_8923;
         KeyPairGenerator var0 = KeyPairGenerator.getInstance("RSA");
         var0.initialize(1024);
         return var0.generateKeyPair();
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         String[] var10001 = field_8923;
         System.err.println("Key pair generation failed!");
         return null;
      }
   }

   // $FF: renamed from: b (java.lang.String, java.security.PublicKey, javax.crypto.SecretKey) byte[]
   public static byte[] method_9420(String var0, PublicKey var1, SecretKey var2) {
      try {
         String[] var4 = field_8923;
         return method_9421("SHA-1", new byte[][]{var0.getBytes("ISO_8859_1"), var2.getEncoded(), var1.getEncoded()});
      } catch (UnsupportedEncodingException var5) {
         var5.printStackTrace();
         return null;
      }
   }

   // $FF: renamed from: b (java.lang.String, byte[][]) byte[]
   private static byte[] method_9421(String var0, byte[] ... var1) {
      String[] var2 = class_752.method_4253();

      try {
         MessageDigest var3 = MessageDigest.getInstance(var0);
         byte[][] var4 = var1;
         int var5 = var1.length;
         int var6 = 0;

         MessageDigest var10000;
         while(true) {
            if(var6 < var5) {
               byte[] var7 = var4[var6];

               try {
                  var10000 = var3;
                  if(var2 == null) {
                     break;
                  }

                  var3.update(var7);
                  ++var6;
                  if(var2 != null) {
                     continue;
                  }
               } catch (NoSuchAlgorithmException var8) {
                  throw method_9429(var8);
               }
            }

            var10000 = var3;
            break;
         }

         return var10000.digest();
      } catch (NoSuchAlgorithmException var9) {
         var9.printStackTrace();
         return null;
      }
   }

   // $FF: renamed from: b (byte[]) java.security.PublicKey
   public static PublicKey method_9422(byte[] var0) {
      try {
         X509EncodedKeySpec var1 = new X509EncodedKeySpec(var0);
         String[] var3 = field_8923;
         KeyFactory var2 = KeyFactory.getInstance("RSA");
         return var2.generatePublic(var1);
      } catch (NoSuchAlgorithmException var4) {
         ;
      } catch (InvalidKeySpecException var5) {
         ;
      }

      String[] var10001 = field_8923;
      System.err.println("Public key reconstitute failed!");
      return null;
   }

   // $FF: renamed from: b (java.security.PrivateKey, byte[]) javax.crypto.SecretKey
   public static SecretKey method_9423(PrivateKey var0, byte[] var1) {
      SecretKeySpec var10000 = new SecretKeySpec;
      byte[] var10002 = method_9425(var0, var1);
      String[] var10003 = field_8923;
      var10000.<init>(var10002, "AES");
      return var10000;
   }

   // $FF: renamed from: b (java.security.Key, byte[]) byte[]
   public static byte[] method_9424(Key var0, byte[] var1) {
      return method_9426(1, var0, var1);
   }

   // $FF: renamed from: c (java.security.Key, byte[]) byte[]
   public static byte[] method_9425(Key var0, byte[] var1) {
      return method_9426(2, var0, var1);
   }

   // $FF: renamed from: b (int, java.security.Key, byte[]) byte[]
   private static byte[] method_9426(int var0, Key var1, byte[] var2) {
      try {
         return method_9427(var0, var1.getAlgorithm(), var1).doFinal(var2);
      } catch (IllegalBlockSizeException var4) {
         var4.printStackTrace();
      } catch (BadPaddingException var5) {
         var5.printStackTrace();
      }

      String[] var10001 = field_8923;
      System.err.println("Cipher data failed!");
      return null;
   }

   // $FF: renamed from: b (int, java.lang.String, java.security.Key) javax.crypto.Cipher
   private static Cipher method_9427(int var0, String var1, Key var2) {
      try {
         Cipher var3 = Cipher.getInstance(var1);
         var3.init(var0, var2);
         return var3;
      } catch (InvalidKeyException var4) {
         var4.printStackTrace();
      } catch (NoSuchAlgorithmException var5) {
         var5.printStackTrace();
      } catch (NoSuchPaddingException var6) {
         var6.printStackTrace();
      }

      String[] var10001 = field_8923;
      System.err.println("Cipher creation failed!");
      return null;
   }

   // $FF: renamed from: b (int, java.security.Key) javax.crypto.Cipher
   public static Cipher method_9428(int var0, Key var1) {
      try {
         String[] var10000 = field_8923;
         Cipher var2 = Cipher.getInstance("AES/CFB8/NoPadding");
         var2.init(var0, var1, new IvParameterSpec(var1.getEncoded()));
         return var2;
      } catch (GeneralSecurityException var3) {
         throw new RuntimeException(var3);
      }
   }

   // $FF: renamed from: b (java.security.NoSuchAlgorithmException) java.security.NoSuchAlgorithmException
   private static NoSuchAlgorithmException method_9429(NoSuchAlgorithmException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9430() {
      // $FF: Couldn't be decompiled
   }
}
