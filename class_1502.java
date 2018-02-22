import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: pj
public abstract class class_1502 implements class_56 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_7918;
   // $FF: renamed from: b java.io.File
   protected final File field_7919;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7920;


   // $FF: renamed from: <init> (java.io.File) void
   public void method_8132(File var1) {
      super();
      this.field_7919 = var1;
   }

   // $FF: renamed from: a (bqx) java.lang.String
   private static String method_8133(bqx var0) {
      String[] var1 = field_7920;
      return String.format("%s/%s/%s", new Object[]{"assets", var0.method_8229(), var0.method_8228()});
   }

   // $FF: renamed from: b (java.io.File, java.io.File) java.lang.String
   protected static String method_8134(File var0, File var1) {
      return var0.toURI().relativize(var1.toURI()).getPath();
   }

   // $FF: renamed from: b (bqx) java.io.InputStream
   public InputStream method_228(bqx var1) {
      return this.method_8135(method_8133(var1));
   }

   // $FF: renamed from: c (bqx) boolean
   public boolean method_229(bqx var1) {
      return this.method_8136(method_8133(var1));
   }

   // $FF: renamed from: b (java.lang.String) java.io.InputStream
   protected abstract InputStream method_8135(String var1);

   // $FF: renamed from: c (java.lang.String) boolean
   protected abstract boolean method_8136(String var1);

   // $FF: renamed from: d (java.lang.String) void
   protected void method_8137(String var1) {
      String[] var10001 = field_7920;
      field_7918.warn("ResourcePack: ignored non-lowercase namespace: %s in %s", new Object[]{var1, this.field_7919});
   }

   // $FF: renamed from: b (pS, java.lang.String) pQ
   public class_42 method_231(class_1479 var1, String var2) {
      String[] var10002 = field_7920;
      return method_8138(var1, this.method_8135("pack.mcmeta"), var2);
   }

   // $FF: renamed from: b (pS, java.io.InputStream, java.lang.String) pQ
   static class_42 method_8138(class_1479 var0, InputStream var1, String var2) {
      JsonObject var3 = null;
      BufferedReader var4 = null;

      try {
         var4 = new BufferedReader(new InputStreamReader(var1, Charsets.UTF_8));
         var3 = (new JsonParser()).parse(var4).getAsJsonObject();
      } catch (RuntimeException var9) {
         throw new JsonParseException(var9);
      } finally {
         IOUtils.closeQuietly(var4);
      }

      return var0.method_7985(var2, var3);
   }

   // $FF: renamed from: b () java.awt.image.BufferedImage
   public BufferedImage method_232() {
      String[] var10001 = field_7920;
      return ImageIO.read(this.method_8135("pack.png"));
   }

   // $FF: renamed from: c () java.lang.String
   public String method_233() {
      return this.field_7919.getName();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8139() {
      // $FF: Couldn't be decompiled
   }
}
