package utils.pinger;

import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import utils.pinger.MinecraftPingOptions;
import utils.pinger.MinecraftPingReply;
import utils.pinger.MinecraftPingUtil;

public class MinecraftPing {

   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_1913;


   // $FF: renamed from: <init> () void
   public void method_2309() {
      super();
   }

   public MinecraftPingReply getPing(String var1) {
      MinecraftPingOptions var10001 = new MinecraftPingOptions;
      var10001.method_5958();
      return this.getPing(var10001.setHostname(var1));
   }

   public MinecraftPingReply getPing(MinecraftPingOptions var1) {
      String var10000 = var1.getHostname();
      String[] var13 = field_1913;
      MinecraftPingUtil.validate(var10000, "Hostname cannot be null.");
      MinecraftPingUtil.validate(Integer.valueOf(var1.getPort()), "Port cannot be null.");
      int var15 = MinecraftPingReply.method_425();
      Socket var4 = new Socket();
      var4.connect(new InetSocketAddress(var1.getHostname(), var1.getPort()), var1.getTimeout());
      int var2 = var15;
      DataInputStream var5 = new DataInputStream(var4.getInputStream());
      DataOutputStream var6 = new DataOutputStream(var4.getOutputStream());
      ByteArrayOutputStream var7 = new ByteArrayOutputStream();
      DataOutputStream var8 = new DataOutputStream(var7);
      var8.writeByte(MinecraftPingUtil.PACKET_HANDSHAKE);
      MinecraftPingUtil.writeVarInt(var8, MinecraftPingUtil.PROTOCOL_VERSION);
      MinecraftPingUtil.writeVarInt(var8, var1.getHostname().length());
      var8.writeBytes(var1.getHostname());
      var8.writeShort(var1.getPort());
      MinecraftPingUtil.writeVarInt(var8, MinecraftPingUtil.STATUS_HANDSHAKE);
      MinecraftPingUtil.writeVarInt(var6, var7.size());
      var6.write(var7.toByteArray());
      var6.writeByte(1);
      var6.writeByte(MinecraftPingUtil.PACKET_STATUSREQUEST);
      MinecraftPingUtil.readVarInt(var5);
      int var9 = MinecraftPingUtil.readVarInt(var5);
      var15 = var9;
      if(var2 != 0) {
         var15 = var9 == -1?1:0;
      }

      var13 = field_1913;
      MinecraftPingUtil.method_3823((boolean)var15, "Server prematurely ended stream.");
      var15 = var9;
      if(var2 != 0) {
         var15 = var9 != MinecraftPingUtil.PACKET_STATUSREQUEST?1:0;
      }

      var13 = field_1913;
      MinecraftPingUtil.method_3823((boolean)var15, "Server returned invalid packet.");
      int var10 = MinecraftPingUtil.readVarInt(var5);
      var15 = var10;
      if(var2 != 0) {
         var15 = var10 == -1?1:0;
      }

      var13 = field_1913;
      MinecraftPingUtil.method_3823((boolean)var15, "Server prematurely ended stream.");
      var15 = var10;
      if(var2 != 0) {
         var15 = var10 == 0?1:0;
      }

      var13 = field_1913;
      MinecraftPingUtil.method_3823((boolean)var15, "Server returned unexpected value.");
      byte[] var11 = new byte[var10];
      var5.readFully(var11);
      String var12 = new String(var11, var1.getCharset());
      var6.writeByte(9);
      var6.writeByte(MinecraftPingUtil.PACKET_PING);
      var6.writeLong(System.currentTimeMillis());
      MinecraftPingUtil.readVarInt(var5);
      var9 = MinecraftPingUtil.readVarInt(var5);
      var15 = var9;
      if(var2 != 0) {
         var15 = var9 == -1?1:0;
      }

      var13 = field_1913;
      MinecraftPingUtil.method_3823((boolean)var15, "Server prematurely ended stream.");
      var15 = var9;
      if(var2 != 0) {
         var15 = var9 != MinecraftPingUtil.PACKET_PING?1:0;
      }

      String[] var10001 = field_1913;
      MinecraftPingUtil.method_3823((boolean)var15, "Server returned invalid packet.");
      var8.close();
      var7.close();
      var6.close();
      var5.close();
      var4.close();
      MinecraftPingReply var14 = (MinecraftPingReply)(new Gson()).fromJson(var12, MinecraftPingReply.class);
      if(var2 == 0) {
         int var3 = class_689.method_3977();
         ++var3;
         class_689.method_3975(var3);
      }

      return var14;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2310() {
      // $FF: Couldn't be decompiled
   }
}
