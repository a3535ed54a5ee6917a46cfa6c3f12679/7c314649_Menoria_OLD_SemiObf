import com.google.gson.JsonParseException;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: mJ
public class class_1373 extends class_1371 {

   // $FF: renamed from: d org.apache.logging.log4j.Logger
   private static final Logger field_7280;
   // $FF: renamed from: e pt
   private final class_56 field_7281;
   // $FF: renamed from: f bqx
   private final bqx field_7282;
   // $FF: renamed from: g java.lang.String
   private static final String field_7283;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_7284;


   // $FF: renamed from: <init> (lZ) void
   public void method_7471(class_189 var1) {
      super.method_7471(var1);
      this.field_7281 = this.field_7276.method_5290().field_7954;

      bpq var2;
      try {
         bpq var10000 = new bpq;
         var10000.method_7979(this.field_7281.method_232());
         var2 = var10000;
      } catch (IOException var4) {
         var2 = bqi.field_7928;
      }

      bqf var10001 = this.field_7276.method_5288();
      String[] var10002 = field_7284;
      this.field_7282 = var10001.method_8122("texturepackicon", var2);
   }

   // $FF: renamed from: b () java.lang.String
   protected String method_7472() {
      String[] var1 = class_752.method_4253();

      String[] var3;
      try {
         label38: {
            var3 = field_7284;
            class_1488 var2 = (class_1488)this.field_7281.method_231(this.field_7276.method_5290().field_7956, "pack");

            class_1488 var10000;
            try {
               var10000 = var2;
               if(var1 == null) {
                  return var10000.method_8031().method_343();
               }

               if(var2 == null) {
                  break label38;
               }
            } catch (JsonParseException var4) {
               throw method_7483(var4);
            }

            var10000 = var2;
            return var10000.method_8031().method_343();
         }
      } catch (JsonParseException var5) {
         var3 = field_7284;
         field_7280.error("Couldn\'t load metadata info", var5);
      } catch (IOException var6) {
         var3 = field_7284;
         field_7280.error("Couldn\'t load metadata info", var6);
      }

      StringBuilder var7 = (new StringBuilder()).append(class_130.field_288);
      var3 = field_7284;
      return var7.append("Missing ").append("pack.mcmeta").append(" :(").toString();
   }

   // $FF: renamed from: f () boolean
   protected boolean method_7476() {
      return false;
   }

   // $FF: renamed from: g () boolean
   protected boolean method_7477() {
      return false;
   }

   // $FF: renamed from: h () boolean
   protected boolean method_7478() {
      return false;
   }

   // $FF: renamed from: i () boolean
   protected boolean method_7479() {
      return false;
   }

   // $FF: renamed from: c () java.lang.String
   protected String method_7473() {
      String[] var10000 = field_7284;
      return "Default";
   }

   // $FF: renamed from: d () void
   protected void method_7474() {
      this.field_7276.method_5288().bindTexture(this.field_7282);
   }

   // $FF: renamed from: e () boolean
   protected boolean method_7475() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7480() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (com.google.gson.JsonParseException) com.google.gson.JsonParseException
   private static JsonParseException method_7483(JsonParseException var0) {
      return var0;
   }
}
