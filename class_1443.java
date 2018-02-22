import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.apache.commons.io.IOUtils;

// $FF: renamed from: pA
public class class_1443 implements bqw {

   // $FF: renamed from: b java.util.Map
   private final Map field_7663;
   // $FF: renamed from: c bqx
   private final bqx field_7664;
   // $FF: renamed from: d java.io.InputStream
   private final InputStream field_7665;
   // $FF: renamed from: e java.io.InputStream
   private final InputStream field_7666;
   // $FF: renamed from: f pS
   private final class_1479 field_7667;
   // $FF: renamed from: g boolean
   private boolean field_7668;
   // $FF: renamed from: h com.google.gson.JsonObject
   private JsonObject field_7669;
   // $FF: renamed from: i java.lang.String
   private static final String field_7670 = "CL_00001093";


   // $FF: renamed from: <init> (bqx, java.io.InputStream, java.io.InputStream, pS) void
   public void method_7872(bqx var1, InputStream var2, InputStream var3, class_1479 var4) {
      super();
      this.field_7663 = Maps.newHashMap();
      this.field_7664 = var1;
      this.field_7665 = var2;
      this.field_7666 = var3;
      this.field_7667 = var4;
   }

   // $FF: renamed from: b () java.io.InputStream
   public InputStream method_234() {
      return this.field_7665;
   }

   // $FF: renamed from: c () boolean
   public boolean method_235() {
      return this.field_7666 != null;
   }

   // $FF: renamed from: a (java.lang.String) pQ
   public class_42 method_236(String var1) {
      String[] var2 = class_752.method_4253();
      class_1443 var10000 = this;
      if(var2 != null) {
         if(!this.method_235()) {
            return null;
         }

         var10000 = this;
      }

      Object var8 = var10000.field_7669;
      if(var2 != null) {
         label79: {
            if(var8 == null) {
               var8 = this;
               if(var2 == null) {
                  break label79;
               }

               if(!this.field_7668) {
                  this.field_7668 = true;
                  BufferedReader var3 = null;

                  try {
                     var3 = new BufferedReader(new InputStreamReader(this.field_7666));
                     this.field_7669 = (new JsonParser()).parse(var3).getAsJsonObject();
                  } finally {
                     IOUtils.closeQuietly(var3);
                  }
               }
            }

            var8 = this.field_7663.get(var1);
         }
      }

      class_42 var7 = (class_42)var8;
      class_42 var9 = var7;
      if(var2 != null) {
         if(var7 == null) {
            var7 = this.field_7667.method_7985(var1, this.field_7669);
         }

         var9 = var7;
      }

      return var9;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this == var1) {
            return true;
         }

         var10000 = var1;
      }

      boolean var4 = var10000 instanceof class_1443;
      if(var2 != null) {
         if(var4) {
            class_1443 var3 = (class_1443)var1;
            bqx var5 = this.field_7664;
            if(var2 != null) {
               if(this.field_7664 != null) {
                  var4 = this.field_7664.equals(var3.field_7664);
                  return var4;
               }

               var5 = var3.field_7664;
            }

            var4 = var5 == null;
            return var4;
         }

         var4 = false;
      }

      return var4;
   }

   public int hashCode() {
      String[] var1 = class_752.method_4253();
      bqx var10000 = this.field_7664;
      int var2;
      if(var1 != null) {
         if(this.field_7664 == null) {
            var2 = 0;
            return var2;
         }

         var10000 = this.field_7664;
      }

      var2 = var10000.hashCode();
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7873() {
      boolean var10000 = true;
      char[] var10003 = "ËÖ!,Wiº¹ªG/".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7670 = (new String((char[])var4)).intern();
            String var2 = field_7670;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 114;
            break;
         case 1:
            var10009 = 96;
            break;
         case 2:
            var10009 = 132;
            break;
         case 3:
            var10009 = 230;
            break;
         case 4:
            var10009 = 157;
            break;
         case 5:
            var10009 = 163;
            break;
         default:
            var10009 = 112;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
