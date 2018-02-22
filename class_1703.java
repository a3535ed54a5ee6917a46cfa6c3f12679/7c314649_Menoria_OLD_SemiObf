import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: vh
public class class_1703 {

   // $FF: renamed from: b java.util.concurrent.atomic.AtomicInteger
   private static final AtomicInteger field_8925;
   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_8926;
   // $FF: renamed from: d java.lang.String
   private static final String field_8927;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8928;


   // $FF: renamed from: <init> () void
   public void method_9457() {
      super();
   }

   // $FF: renamed from: b (java.util.Map) java.lang.String
   public static String method_9458(Map param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.net.URL, java.util.Map, boolean) java.lang.String
   public static String method_9459(URL var0, Map var1, boolean var2) {
      return method_9460(var0, method_9458(var1), var2);
   }

   // $FF: renamed from: b (java.net.URL, java.lang.String, boolean) java.lang.String
   private static String method_9460(URL param0, String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.File, java.lang.String, vj, java.util.Map, int, vu, java.net.Proxy) void
   public static void method_9461(File var0, String var1, class_77 var2, Map var3, int var4, class_81 var5, Proxy var6) {
      Thread var10000 = new Thread;
      class_1704 var10002 = new class_1704;
      var10002.method_9467(var5, var1, var6, var3, var0, var2, var4);
      StringBuilder var10003 = new StringBuilder();
      String[] var10004 = field_8928;
      var10000.<init>(var10002, var10003.append("File Downloader #").append(field_8925.incrementAndGet()).toString());
      Thread var7 = var10000;
      var7.setDaemon(true);
      var7.start();
   }

   // $FF: renamed from: b () int
   public static int method_9462() {
      String[] var10000 = class_752.method_4253();
      ServerSocket var1 = null;
      String[] var0 = var10000;
      boolean var2 = true;

      int var3;
      try {
         var1 = new ServerSocket(0);
         var3 = var1.getLocalPort();
      } finally {
         try {
            label78: {
               ServerSocket var15;
               label77: {
                  try {
                     var15 = var1;
                     if(var0 == null) {
                        break label77;
                     }

                     if(var1 == null) {
                        break label78;
                     }
                  } catch (IOException var12) {
                     throw method_9466(var12);
                  }

                  var15 = var1;
               }

               var15.close();
            }
         } catch (IOException var13) {
            ;
         }

      }

      return var3;
   }

   // $FF: renamed from: b (java.net.URL) java.lang.String
   public static String method_9463(URL var0) {
      HttpURLConnection var2 = (HttpURLConnection)var0.openConnection();
      String[] var10000 = class_752.method_4253();
      String[] var10002 = field_8928;
      var2.setRequestMethod("GET");
      String[] var1 = var10000;
      BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.getInputStream()));
      StringBuilder var4 = new StringBuilder();

      while(true) {
         String var5;
         if((var5 = var3.readLine()) != null) {
            var4.append(var5);
            var4.append('\r');
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         var3.close();
         break;
      }

      return var4.toString();
   }

   // $FF: renamed from: c () org.apache.logging.log4j.Logger
   static Logger method_9464() {
      return field_8926;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9465() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_9466(Exception var0) {
      return var0;
   }
}
