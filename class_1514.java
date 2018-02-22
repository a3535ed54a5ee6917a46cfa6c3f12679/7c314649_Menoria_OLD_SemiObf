import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

// $FF: renamed from: px
public class class_1514 {

   // $FF: renamed from: a java.io.File
   private final File field_7967;
   // $FF: renamed from: b pt
   private class_56 field_7968;
   // $FF: renamed from: c pZ
   private class_1488 field_7969;
   // $FF: renamed from: d java.awt.image.BufferedImage
   private BufferedImage field_7970;
   // $FF: renamed from: e bqx
   private bqx field_7971;
   // $FF: renamed from: f java.lang.String
   private static final String field_7972;
   // $FF: renamed from: g pu
   final class_1511 field_7973;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7974;


   // $FF: renamed from: <init> (pu, java.io.File) void
   private void method_8216(class_1511 var1, File var2) {
      this.field_7973 = var1;
      super();
      this.field_7967 = var2;
   }

   // $FF: renamed from: b () void
   public void method_8217() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bqf) void
   public void method_8218(bqf var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         if(this.field_7971 == null) {
            String[] var10002 = field_7974;
            bpq var10003 = new bpq;
            var10003.method_7979(this.field_7970);
            this.field_7971 = var1.method_8122("texturepackicon", var10003);
         }

         var1.bindTexture(this.field_7971);
      }

   }

   // $FF: renamed from: c () void
   public void method_8219() {
      String[] var1 = class_752.method_4253();
      class_56 var10000 = this.field_7968;
      if(var1 != null) {
         if(!(this.field_7968 instanceof Closeable)) {
            return;
         }

         var10000 = this.field_7968;
      }

      IOUtils.closeQuietly((Closeable)var10000);
   }

   // $FF: renamed from: d () pt
   public class_56 method_8220() {
      return this.field_7968;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_8221() {
      return this.field_7968.method_233();
   }

   // $FF: renamed from: f () java.lang.String
   public String method_8222() {
      String[] var1 = class_752.method_4253();
      class_1488 var10000 = this.field_7969;
      String var2;
      if(var1 != null) {
         if(this.field_7969 == null) {
            StringBuilder var3 = (new StringBuilder()).append(class_130.field_288);
            String[] var10001 = field_7974;
            var2 = var3.append("Invalid pack.mcmeta (or missing \'pack\' section)").toString();
            return var2;
         }

         var10000 = this.field_7969;
      }

      var2 = var10000.method_8031().method_343();
      return var2;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      boolean var3;
      if(var2 != null) {
         if(this == var1) {
            var3 = true;
            return var3;
         }

         var10000 = var1;
      }

      var3 = var10000 instanceof class_1514;
      if(var2 != null) {
         var3 = var3?this.toString().equals(var1.toString()):false;
      }

      return var3;
   }

   public int hashCode() {
      return this.toString().hashCode();
   }

   public String toString() {
      String[] var1 = class_752.method_4253();
      String[] var2 = field_7974;
      Object[] var10001 = new Object[3];
      Object[] var10002 = var10001;
      byte var10003 = 0;
      String var10004 = this.field_7967.getName();
      if(var1 != null) {
         var10001[0] = var10004;
         var10002 = var10001;
         var10003 = 1;
         if(this.field_7967.isDirectory()) {
            var10004 = "folder";
         } else {
            String[] var3 = field_7974;
            var10004 = "zip";
         }
      }

      var10002[var10003] = var10004;
      var10001[2] = Long.valueOf(this.field_7967.lastModified());
      return String.format("%s:%s:%d", var10001);
   }

   // $FF: renamed from: <init> (pu, java.io.File, java.lang.Object) void
   void method_8223(class_1511 var1, File var2, Object var3) {
      this.method_8216(var1, var2);
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_8224(IOException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8225() {
      // $FF: Couldn't be decompiled
   }
}
