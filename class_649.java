import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: AM
public class class_649 extends Thread {

   // $FF: renamed from: b java.util.concurrent.atomic.AtomicInteger
   private static final AtomicInteger field_2791;
   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_2792;
   // $FF: renamed from: d java.lang.String
   private final String field_2793;
   // $FF: renamed from: e java.net.DatagramSocket
   private final DatagramSocket field_2794;
   // $FF: renamed from: f boolean
   private boolean field_2795;
   // $FF: renamed from: g java.lang.String
   private final String field_2796;
   // $FF: renamed from: h java.lang.String
   private static final String field_2797;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_2798;


   // $FF: renamed from: <init> (java.lang.String, java.lang.String) void
   public void method_3538(String var1, String var2) {
      StringBuilder var10001 = new StringBuilder();
      String[] var10002 = field_2798;
      super(var10001.append("LanServerPinger #").append(field_2791.incrementAndGet()).toString());
      this.field_2795 = true;
      this.field_2793 = var1;
      this.field_2796 = var2;
      this.setDaemon(true);
      this.field_2794 = new DatagramSocket();
   }

   public void run() {
      String[] var10000 = class_752.method_4253();
      String var2 = method_3539(this.field_2793, this.field_2796);
      String[] var1 = var10000;
      byte[] var3 = var2.getBytes();

      while(true) {
         try {
            if(this.isInterrupted() || !this.field_2795) {
               break;
            }
         } catch (IOException var9) {
            throw method_3543(var9);
         }

         try {
            String[] var6 = field_2798;
            InetAddress var4 = InetAddress.getByName("224.0.2.60");
            DatagramPacket var5 = new DatagramPacket(var3, var3.length, var4, 4445);
            this.field_2794.send(var5);
         } catch (IOException var8) {
            Logger var10 = field_2792;
            StringBuilder var10001 = new StringBuilder();
            String[] var10002 = field_2798;
            var10.warn(var10001.append("LanServerPinger: ").append(var8.getMessage()).toString());
            break;
         }

         try {
            sleep(1500L);
         } catch (InterruptedException var7) {
            if(var1 == null) {
               break;
            }
         }
      }

   }

   public void interrupt() {
      super.interrupt();
      this.field_2795 = false;
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) java.lang.String
   public static String method_3539(String var0, String var1) {
      StringBuilder var10000 = new StringBuilder();
      String[] var2 = field_2798;
      return var10000.append("[MOTD]").append(var0).append("[/MOTD][AD]").append(var1).append("[/AD]").toString();
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static String method_3540(String var0) {
      String[] var10000 = class_752.method_4253();
      String[] var4 = field_2798;
      int var2 = var0.indexOf("[MOTD]");
      String[] var1 = var10000;
      int var5 = var2;
      if(var1 != null) {
         if(var2 < 0) {
            return "missing no";
         }

         var4 = field_2798;
         var5 = var0.indexOf("[/MOTD]", var2 + "[MOTD]".length());
      }

      int var3 = var5;
      String var6;
      if(var3 < var2) {
         var4 = field_2798;
         var6 = "missing no";
      } else {
         String[] var10002 = field_2798;
         var6 = var0.substring(var2 + "[MOTD]".length(), var3);
      }

      return var6;
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   public static String method_3541(String var0) {
      String[] var10000 = class_752.method_4253();
      String[] var6 = field_2798;
      int var2 = var0.indexOf("[/MOTD]");
      String[] var1 = var10000;
      int var7 = var2;
      if(var1 != null) {
         if(var2 < 0) {
            return null;
         }

         var6 = field_2798;
         var7 = var0.indexOf("[/MOTD]", var2 + "[/MOTD]".length());
      }

      int var3 = var7;
      var7 = var3;
      if(var1 != null) {
         if(var3 >= 0) {
            return null;
         }

         var6 = field_2798;
         var7 = var0.indexOf("[AD]", var2 + "[/MOTD]".length());
      }

      int var4 = var7;
      var7 = var4;
      if(var1 != null) {
         if(var4 < 0) {
            return null;
         }

         var6 = field_2798;
         var7 = var0.indexOf("[/AD]", var4 + "[AD]".length());
      }

      int var5 = var7;
      String var8;
      if(var5 < var4) {
         var8 = null;
      } else {
         String[] var10002 = field_2798;
         var8 = var0.substring(var4 + "[AD]".length(), var5);
      }

      return var8;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3542() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_3543(IOException var0) {
      return var0;
   }
}
