import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: AL
public class class_648 extends Thread {

   // $FF: renamed from: b qe
   private final class_1528 field_2787;
   // $FF: renamed from: c java.net.InetAddress
   private final InetAddress field_2788;
   // $FF: renamed from: d java.net.MulticastSocket
   private final MulticastSocket field_2789;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2790;


   // $FF: renamed from: <init> (qe) void
   public void method_3536(class_1528 var1) {
      StringBuilder var10001 = new StringBuilder();
      String[] var2 = field_2790;
      super(var10001.append("LanServerDetector #").append(class_1526.method_8270().incrementAndGet()).toString());
      this.field_2787 = var1;
      this.setDaemon(true);
      this.field_2789 = new MulticastSocket(4445);
      this.field_2788 = InetAddress.getByName("224.0.2.60");
      this.field_2789.setSoTimeout(5000);
      this.field_2789.joinGroup(this.field_2788);
   }

   public void run() {
      String[] var10000 = class_752.method_4253();
      byte[] var3 = new byte[1024];
      String[] var1 = var10000;

      while(true) {
         if(!this.isInterrupted()) {
            label38: {
               DatagramPacket var2 = new DatagramPacket(var3, var3.length);

               Logger var9;
               label29: {
                  try {
                     this.field_2789.receive(var2);
                  } catch (SocketTimeoutException var7) {
                     continue;
                  } catch (IOException var8) {
                     var9 = class_1526.method_8271();
                     String[] var5 = field_2790;
                     var9.error("Couldn\'t ping server", var8);
                     if(var1 != null) {
                        break label38;
                     }
                     break label29;
                  }

                  if(var1 == null) {
                     break;
                  }
               }

               String var4 = new String(var2.getData(), var2.getOffset(), var2.getLength());
               var9 = class_1526.method_8271();
               StringBuilder var10001 = (new StringBuilder()).append(var2.getAddress());
               String[] var10002 = field_2790;
               var9.debug(var10001.append(": ").append(var4).toString());
               this.field_2787.method_8282(var4, var2.getAddress());
               if(var1 != null) {
                  continue;
               }
            }
         }

         try {
            this.field_2789.leaveGroup(this.field_2788);
         } catch (IOException var6) {
            ;
         }
         break;
      }

      this.field_2789.close();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3537() {
      // $FF: Couldn't be decompiled
   }
}
