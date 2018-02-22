import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

// $FF: renamed from: rk
public class class_1569 {

   // $FF: renamed from: a java.lang.String
   private static final String field_8255;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8256;


   // $FF: renamed from: <init> () void
   public void method_8607() {
      super();
   }

   // $FF: renamed from: b (java.io.InputStream) ro
   public static class_1583 method_8608(InputStream var0) {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)));

      class_1583 var2;
      try {
         var2 = method_8617(var1, class_1567.field_8249);
      } finally {
         var1.close();
      }

      return var2;
   }

   // $FF: renamed from: b (ro, java.io.OutputStream) void
   public static void method_8609(class_1583 var0, OutputStream var1) {
      DataOutputStream var2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var1)));

      try {
         method_8618(var0, var2);
      } finally {
         var2.close();
      }

   }

   // $FF: renamed from: b (byte[], ri) ro
   public static class_1583 method_8610(byte[] var0, class_1567 var1) {
      DataInputStream var2 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var0))));

      class_1583 var3;
      try {
         var3 = method_8617(var2, var1);
      } finally {
         var2.close();
      }

      return var3;
   }

   // $FF: renamed from: b (ro) byte[]
   public static byte[] method_8611(class_1583 var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         method_8618(var0, var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   // $FF: renamed from: b (ro, java.io.File) void
   public static void method_8612(class_1583 param0, File param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (ro, java.io.File) void
   public static void method_8613(class_1583 var0, File var1) {
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

      try {
         method_8618(var0, var2);
      } finally {
         var2.close();
      }

   }

   // $FF: renamed from: b (java.io.File) ro
   public static class_1583 method_8614(File var0) {
      return method_8615(var0, class_1567.field_8249);
   }

   // $FF: renamed from: b (java.io.File, ri) ro
   public static class_1583 method_8615(File var0, class_1567 var1) {
      try {
         if(!var0.exists()) {
            return null;
         }
      } catch (class_643 var8) {
         throw method_8621(var8);
      }

      DataInputStream var2 = new DataInputStream(new FileInputStream(var0));

      class_1583 var3;
      try {
         var3 = method_8617(var2, var1);
      } finally {
         var2.close();
      }

      return var3;
   }

   // $FF: renamed from: b (java.io.DataInputStream) ro
   public static class_1583 method_8616(DataInputStream var0) {
      return method_8617(var0, class_1567.field_8249);
   }

   // $FF: renamed from: b (java.io.DataInput, ri) ro
   public static class_1583 method_8617(DataInput param0, class_1567 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ro, java.io.DataOutput) void
   public static void method_8618(class_1583 var0, DataOutput var1) {
      method_8619(var0, var1);
   }

   // $FF: renamed from: b (rm, java.io.DataOutput) void
   private static void method_8619(class_1571 param0, DataOutput param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) rm
   private static class_1571 method_8620(DataInput param0, int param1, class_1567 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_8621(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8622() {
      // $FF: Couldn't be decompiled
   }
}
