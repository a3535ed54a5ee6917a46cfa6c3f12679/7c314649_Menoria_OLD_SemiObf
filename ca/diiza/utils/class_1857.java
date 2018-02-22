package ca.diiza.utils;

import ca.diiza.j.class_243;
import ca.diiza.j.class_244;
import ca.diiza.j.class_246;
import ca.diiza.utils.MP3Player;
import com.google.common.collect.ImmutableList;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

// $FF: renamed from: ca.diiza.utils.f
public class class_1857 implements Callable<Map<UUID, String>> {

   // $FF: renamed from: a double
   private static final double field_9488 = 150.0D;
   // $FF: renamed from: b java.lang.String
   private static final String field_9489;
   // $FF: renamed from: c ca.diiza.j.f
   private final class_246 field_9490;
   // $FF: renamed from: d java.util.List
   private final List<String> field_9491;
   // $FF: renamed from: e boolean
   private final boolean field_9492;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9493;


   // $FF: renamed from: <init> (java.util.List, boolean) void
   public void method_10053(List<String> var1, boolean var2) {
      super();
      class_246 var10001 = new class_246;
      var10001.method_1376();
      this.field_9490 = var10001;
      this.field_9491 = ImmutableList.copyOf(var1);
      this.field_9492 = var2;
   }

   // $FF: renamed from: <init> (java.util.List) void
   public void method_10054(List<String> var1) {
      this.method_10053(var1, true);
   }

   // $FF: renamed from: a () java.util.Map
   public Map<UUID, String> method_10055() {
      HashMap var2 = new HashMap();
      int[] var10000 = MP3Player.method_3212();
      int var3 = (int)Math.ceil((double)this.field_9491.size() / 150.0D);
      int[] var1 = var10000;
      int var4 = 0;

      while(var4 < var3) {
         HttpURLConnection var5 = method_10057();
         String var6 = class_243.method_1337(this.field_9491.subList(var4 * 100, Math.min((var4 + 1) * 100, this.field_9491.size())));
         method_10056(var5, var6);
         class_243 var7 = (class_243)this.field_9490.method_1383(new InputStreamReader(var5.getInputStream()));
         Iterator var8 = var7.iterator();

         while(true) {
            if(var8.hasNext()) {
               Object var9 = var8.next();
               class_244 var10 = (class_244)var9;
               String[] var14 = field_9493;
               String var11 = (String)var10.get("id");
               String var12 = (String)var10.get("name");
               UUID var13 = method_10058(var11);

               try {
                  var2.put(var13, var12);
                  if(var1 != null) {
                     break;
                  }

                  if(var1 == null) {
                     continue;
                  }
               } catch (IllegalArgumentException var17) {
                  throw method_10061(var17);
               }
            }

            label42: {
               int var18;
               label41: {
                  try {
                     var18 = this.field_9492;
                     if(var1 != null) {
                        break label41;
                     }

                     if(!this.field_9492) {
                        break label42;
                     }
                  } catch (IllegalArgumentException var16) {
                     throw method_10061(var16);
                  }

                  var18 = var4;
               }

               try {
                  if(var18 != var3 - 1) {
                     Thread.sleep(100L);
                  }
               } catch (IllegalArgumentException var15) {
                  throw method_10061(var15);
               }
            }

            ++var4;
            break;
         }

         if(var1 != null) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: a (java.net.HttpURLConnection, java.lang.String) void
   private static void method_10056(HttpURLConnection var0, String var1) {
      OutputStream var2 = var0.getOutputStream();
      var2.write(var1.getBytes());
      var2.flush();
      var2.close();
   }

   // $FF: renamed from: b () java.net.HttpURLConnection
   private static HttpURLConnection method_10057() {
      URL var10000 = new URL("https://auth.menoria.com/getName");
      String[] var2 = field_9493;
      URL var0 = var10000;
      HttpURLConnection var1 = (HttpURLConnection)var0.openConnection();
      var1.setRequestMethod("POST");
      var1.setRequestProperty("Content-Type", "application/json");
      var1.setUseCaches(false);
      var1.setDoInput(true);
      var1.setDoOutput(true);
      return var1;
   }

   // $FF: renamed from: a (java.lang.String) java.util.UUID
   private static UUID method_10058(String var0) {
      return UUID.fromString(var0.substring(0, 8) + "-" + var0.substring(8, 12) + "-" + var0.substring(12, 16) + "-" + var0.substring(16, 20) + "-" + var0.substring(20, 32));
   }

   // $FF: renamed from: a (java.util.UUID) byte[]
   public static byte[] method_10059(UUID var0) {
      ByteBuffer var1 = ByteBuffer.wrap(new byte[16]);
      var1.putLong(var0.getMostSignificantBits());
      var1.putLong(var0.getLeastSignificantBits());
      return var1.array();
   }

   // $FF: renamed from: a (byte[]) java.util.UUID
   public static UUID method_10060(byte[] param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_10061(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_10062() {
      // $FF: Couldn't be decompiled
   }
}
