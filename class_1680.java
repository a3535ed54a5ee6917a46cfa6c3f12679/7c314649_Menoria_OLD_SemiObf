import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: uo
public class class_1680 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_8755;
   // $FF: renamed from: b io.netty.channel.nio.NioEventLoopGroup
   private static final NioEventLoopGroup field_8756;
   // $FF: renamed from: c net.minecraft.server.MinecraftServer
   private final MinecraftServer field_8757;
   // $FF: renamed from: d boolean
   public volatile boolean field_8758;
   // $FF: renamed from: f java.util.List
   private final List field_8759;
   // $FF: renamed from: g java.util.List
   private final List field_8760;
   // $FF: renamed from: h java.lang.String
   private static final String field_8761;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_8762;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer) void
   public void method_9251(MinecraftServer var1) {
      super();
      this.field_8759 = Collections.synchronizedList(new ArrayList());
      this.field_8760 = Collections.synchronizedList(new ArrayList());
      this.field_8757 = var1;
      this.field_8758 = true;
   }

   // $FF: renamed from: b (java.net.InetAddress, int) void
   public void method_9252(InetAddress var1, int var2) {
      List var3 = this.field_8759;
      List var4 = this.field_8759;
      synchronized(this.field_8759) {
         List var10000 = this.field_8759;
         ServerBootstrap var10001 = (ServerBootstrap)(new ServerBootstrap()).channel(NioServerSocketChannel.class);
         class_117 var10002 = new class_117;
         var10002.method_542(this);
         var10000.add(((ServerBootstrap)var10001.childHandler(var10002).group(field_8756).localAddress(var1, var2)).bind().syncUninterruptibly());
      }
   }

   // $FF: renamed from: b () java.net.SocketAddress
   public SocketAddress method_9253() {
      List var1 = this.field_8759;
      List var3 = this.field_8759;
      ChannelFuture var2;
      synchronized(this.field_8759) {
         ServerBootstrap var10000 = (ServerBootstrap)(new ServerBootstrap()).channel(LocalServerChannel.class);
         class_118 var10001 = new class_118;
         var10001.method_544(this);
         var2 = ((ServerBootstrap)var10000.childHandler(var10001).group(field_8756).localAddress(LocalAddress.ANY)).bind().syncUninterruptibly();
         this.field_8759.add(var2);
      }

      return var2.channel().localAddress();
   }

   // $FF: renamed from: c () void
   public void method_9254() {
      this.field_8758 = false;
      String[] var10000 = class_752.method_4253();
      Iterator var2 = this.field_8759.iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         ChannelFuture var3 = (ChannelFuture)var2.next();
         var3.channel().close().syncUninterruptibly();
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d () void
   public void method_9255() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () net.minecraft.server.MinecraftServer
   public MinecraftServer method_9256() {
      return this.field_8757;
   }

   // $FF: renamed from: b (uo) java.util.List
   static List method_9257(class_1680 var0) {
      return var0.field_8760;
   }

   // $FF: renamed from: c (uo) net.minecraft.server.MinecraftServer
   static MinecraftServer method_9258(class_1680 var0) {
      return var0.field_8757;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9259() {
      // $FF: Couldn't be decompiled
   }
}
