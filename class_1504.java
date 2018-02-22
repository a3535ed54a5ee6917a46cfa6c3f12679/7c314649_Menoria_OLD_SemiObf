import com.google.common.base.Splitter;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// $FF: renamed from: pk
public class class_1504 extends class_1502 implements Closeable {

   // $FF: renamed from: c com.google.common.base.Splitter
   public static final Splitter field_7922;
   // $FF: renamed from: d java.util.zip.ZipFile
   private ZipFile field_7923;
   // $FF: renamed from: e java.lang.String
   private static final String field_7924;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_7925;


   // $FF: renamed from: <init> (java.io.File) void
   public void method_8132(File var1) {
      super.method_8132(var1);
   }

   // $FF: renamed from: e () java.util.zip.ZipFile
   private ZipFile method_8140() {
      String[] var1 = class_752.method_4253();
      ZipFile var10000 = this.field_7923;
      if(var1 != null) {
         if(this.field_7923 == null) {
            this.field_7923 = new ZipFile(this.field_7919);
         }

         var10000 = this.field_7923;
      }

      return var10000;
   }

   // $FF: renamed from: b (java.lang.String) java.io.InputStream
   protected InputStream method_8135(String var1) {
      ZipFile var2 = this.method_8140();
      ZipEntry var3 = var2.getEntry(var1);
      if(var3 == null) {
         class_128 var10000 = new class_128;
         var10000.method_588(this.field_7919, var1);
         throw var10000;
      } else {
         return var2.getInputStream(var3);
      }
   }

   // $FF: renamed from: c (java.lang.String) boolean
   public boolean method_8136(String var1) {
      try {
         boolean var10000;
         try {
            if(this.method_8140().getEntry(var1) != null) {
               var10000 = true;
               return var10000;
            }
         } catch (IOException var3) {
            throw method_8141(var3);
         }

         var10000 = false;
         return var10000;
      } catch (IOException var4) {
         return false;
      }
   }

   // $FF: renamed from: a () java.util.Set
   public Set method_230() {
      // $FF: Couldn't be decompiled
   }

   protected void finalize() {
      this.close();
      super.finalize();
   }

   public void close() {
      String[] var1 = class_752.method_4253();
      ZipFile var10000 = this.field_7923;
      if(var1 != null) {
         if(this.field_7923 == null) {
            return;
         }

         var10000 = this.field_7923;
      }

      var10000.close();
      this.field_7923 = null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8139() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "®6$a&®Wrg~TíÆR";
      int var4 = "®6$a&®Wrg~TíÆR".length();
      char var1 = 7;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_7925 = var5;
                  String[] var10 = field_7925;
                  field_7924 = "CL_00001075";
                  field_7922 = Splitter.on('/').omitEmptyStrings().limit(3);
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 155;
               break;
            case 1:
               var10009 = 35;
               break;
            case 2:
               var10009 = 15;
               break;
            case 3:
               var10009 = 153;
               break;
            case 4:
               var10009 = 188;
               break;
            case 5:
               var10009 = 169;
               break;
            default:
               var10009 = 176;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_8141(IOException var0) {
      return var0;
   }
}
