import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import javax.imageio.ImageIO;

// $FF: renamed from: pn
public class class_1506 implements class_56 {

   // $FF: renamed from: b java.util.Set
   public static final Set field_7938;
   // $FF: renamed from: c java.util.Map
   private final Map field_7939;
   // $FF: renamed from: d java.lang.String
   private static final String field_7940;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7941;


   // $FF: renamed from: <init> (java.util.Map) void
   public void method_8178(Map var1) {
      super();
      this.field_7939 = var1;
   }

   // $FF: renamed from: b (bqx) java.io.InputStream
   public InputStream method_228(bqx param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bqx) java.io.InputStream
   public InputStream method_8179(bqx var1) {
      String[] var10000 = class_752.method_4253();
      File var3 = (File)this.field_7939.get(var1.toString());
      String[] var2 = var10000;

      FileInputStream var7;
      label28: {
         File var6;
         label27: {
            try {
               var6 = var3;
               if(var2 == null) {
                  break label27;
               }

               if(var3 == null) {
                  break label28;
               }
            } catch (RuntimeException var5) {
               throw method_8182(var5);
            }

            var6 = var3;
         }

         try {
            if(var6.isFile()) {
               var7 = new FileInputStream(var3);
               return var7;
            }
         } catch (RuntimeException var4) {
            throw method_8182(var4);
         }
      }

      var7 = null;
      return var7;
   }

   // $FF: renamed from: e (bqx) java.io.InputStream
   private InputStream method_8180(bqx var1) {
      StringBuilder var10001 = new StringBuilder();
      String[] var10002 = field_7941;
      return class_1506.class.getResourceAsStream(var10001.append("/assets/").append(var1.method_8229()).append("/").append(var1.method_8228()).toString());
   }

   // $FF: renamed from: c (bqx) boolean
   public boolean method_229(bqx param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () java.util.Set
   public Set method_230() {
      return field_7938;
   }

   // $FF: renamed from: b (pS, java.lang.String) pQ
   public class_42 method_231(class_1479 var1, String var2) {
      try {
         FileInputStream var10000 = new FileInputStream((File)this.field_7939.get("pack.mcmeta"));
         String[] var10003 = field_7941;
         FileInputStream var3 = var10000;
         return class_1502.method_8138(var1, var3, var2);
      } catch (RuntimeException var4) {
         return null;
      } catch (FileNotFoundException var5) {
         return null;
      }
   }

   // $FF: renamed from: b () java.awt.image.BufferedImage
   public BufferedImage method_232() {
      StringBuilder var10001 = (new StringBuilder()).append("/");
      bqx var10002 = new bqx;
      String[] var10004 = field_7941;
      var10002.method_8227("pack.png");
      return ImageIO.read(class_1506.class.getResourceAsStream(var10001.append(var10002.method_8228()).toString()));
   }

   // $FF: renamed from: c () java.lang.String
   public String method_233() {
      String[] var10000 = field_7941;
      return "Default";
   }

   // $FF: renamed from: <clinit> () void
   static void method_8181() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_8182(RuntimeException var0) {
      return var0;
   }
}
