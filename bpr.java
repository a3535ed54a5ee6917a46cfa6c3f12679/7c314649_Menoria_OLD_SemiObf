import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

public class bpr extends bpu {

   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_7774;
   // $FF: renamed from: d java.util.concurrent.atomic.AtomicInteger
   private static final AtomicInteger field_7775;
   // $FF: renamed from: e java.io.File
   private final File field_7776;
   // $FF: renamed from: f java.lang.String
   private final String field_7777;
   // $FF: renamed from: g nY
   private final class_36 field_7778;
   // $FF: renamed from: h java.awt.image.BufferedImage
   private BufferedImage field_7779;
   // $FF: renamed from: i java.lang.Thread
   private Thread field_7780;
   // $FF: renamed from: j boolean
   private boolean field_7781;
   private static final String __OBFID;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_7782;


   // $FF: renamed from: <init> (java.io.File, java.lang.String, bqx, nY) void
   public void method_7970(File var1, String var2, bqx var3, class_36 var4) {
      super.method_7967(var3);
      this.field_7776 = var1;
      this.field_7777 = var2;
      this.field_7778 = var4;
   }

   // $FF: renamed from: f () void
   private void method_7971() {
      String[] var1 = class_752.method_4253();
      bpr var10000 = this;
      if(var1 != null) {
         if(this.field_7781) {
            return;
         }

         var10000 = this;
      }

      if(var1 != null) {
         if(var10000.field_7779 == null) {
            return;
         }

         var10000 = this;
      }

      if(var1 != null) {
         if(var10000.field_7772 != null) {
            this.method_7951();
         }

         bqi.method_8145(super.method_222(), this.field_7779);
         var10000 = this;
      }

      var10000.field_7781 = true;
   }

   // $FF: renamed from: b () int
   public int method_222() {
      this.method_7971();
      return super.method_222();
   }

   // $FF: renamed from: a (java.awt.image.BufferedImage) void
   public void method_7972(BufferedImage var1) {
      String[] var10000 = class_752.method_4253();
      this.field_7779 = var1;
      String[] var2 = var10000;
      class_36 var3 = this.field_7778;
      if(var2 != null) {
         if(this.field_7778 == null) {
            return;
         }

         var3 = this.field_7778;
      }

      var3.method_162();
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   protected void method_7973() {
      class_647 var10001 = new class_647;
      StringBuilder var10004 = new StringBuilder();
      String[] var10005 = field_7782;
      var10001.method_3533(this, var10004.append("Texture Downloader #").append(field_7775.incrementAndGet()).toString());
      this.field_7780 = var10001;
      this.field_7780.setDaemon(true);
      this.field_7780.start();
   }

   public boolean isTextureUploaded() {
      this.method_7971();
      return this.field_7781;
   }

   // $FF: renamed from: a (bpr) java.lang.String
   static String method_7974(bpr var0) {
      return var0.field_7777;
   }

   // $FF: renamed from: b (bpr) java.io.File
   static File method_7975(bpr var0) {
      return var0.field_7776;
   }

   // $FF: renamed from: e () org.apache.logging.log4j.Logger
   static Logger method_7976() {
      return field_7774;
   }

   // $FF: renamed from: c (bpr) nY
   static class_36 method_7977(bpr var0) {
      return var0.field_7778;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7968() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_7978(IOException var0) {
      return var0;
   }
}
