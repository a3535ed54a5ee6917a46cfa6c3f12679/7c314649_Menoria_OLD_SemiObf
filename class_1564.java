import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

// $FF: renamed from: rf
public class class_1564 {

   // $FF: renamed from: b java.util.regex.Pattern
   private static final Pattern field_8236;
   // $FF: renamed from: c com.google.common.base.Splitter
   private static final Splitter field_8237;
   // $FF: renamed from: d rf
   private static class_1564 field_8238;
   // $FF: renamed from: e java.util.Map
   private final Map field_8239;
   // $FF: renamed from: f long
   private long field_8240;
   // $FF: renamed from: g java.lang.String
   private static final String field_8241;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8242;


   // $FF: renamed from: <init> () void
   public void method_8587() {
      super();
      this.field_8239 = Maps.newHashMap();

      try {
         String[] var7 = field_8242;
         InputStream var1 = class_1564.class.getResourceAsStream("/assets/minecraft/lang/en_US.lang");
         Iterator var2 = IOUtils.readLines(var1, Charsets.UTF_8).iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();

            try {
               if(var3.isEmpty() || var3.charAt(0) == 35) {
                  continue;
               }
            } catch (IOException var9) {
               throw method_8596(var9);
            }

            String[] var4 = (String[])((String[])Iterables.toArray(field_8237.split(var3), String.class));

            try {
               if(var4 == null || var4.length != 2) {
                  continue;
               }
            } catch (IOException var8) {
               throw method_8596(var8);
            }

            String var5 = var4[0];
            Matcher var10000 = field_8236.matcher(var4[1]);
            String[] var10001 = field_8242;
            String var6 = var10000.replaceAll("%$1s");
            this.field_8239.put(var5, var6);
         }

         this.field_8240 = System.currentTimeMillis();
      } catch (IOException var10) {
         ;
      }

   }

   // $FF: renamed from: b () rf
   public static class_1564 method_8588() {
      return field_8238;
   }

   // $FF: renamed from: b (java.util.Map) void
   public static synchronized void method_8589(Map var0) {
      field_8238.field_8239.clear();
      field_8238.field_8239.putAll(var0);
      field_8238.field_8240 = System.currentTimeMillis();
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public synchronized String method_8590(String var1) {
      return this.method_8592(var1);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.Object[]) java.lang.String
   public synchronized String method_8591(String var1, Object ... var2) {
      String var3 = this.method_8592(var1);

      try {
         return String.format(var3, var2);
      } catch (IllegalFormatException var5) {
         StringBuilder var10000 = new StringBuilder();
         String[] var10001 = field_8242;
         return var10000.append("Format error: ").append(var3).toString();
      }
   }

   // $FF: renamed from: d (java.lang.String) java.lang.String
   private String method_8592(String var1) {
      String[] var10000 = class_752.method_4253();
      String var3 = (String)this.field_8239.get(var1);
      String[] var2 = var10000;

      String var5;
      label32: {
         try {
            var5 = var3;
            if(var2 == null) {
               return var5;
            }

            if(var3 == null) {
               break label32;
            }
         } catch (IllegalFormatException var4) {
            throw method_8596(var4);
         }

         var5 = var3;
         return var5;
      }

      var5 = var1;
      return var5;
   }

   // $FF: renamed from: e (java.lang.String) boolean
   public synchronized boolean method_8593(String var1) {
      return this.field_8239.containsKey(var1);
   }

   // $FF: renamed from: d () long
   public long method_8594() {
      return this.field_8240;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8595() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_8596(Exception var0) {
      return var0;
   }
}
