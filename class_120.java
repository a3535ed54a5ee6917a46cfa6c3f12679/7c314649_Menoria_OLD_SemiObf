import com.google.common.collect.Queues;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

// $FF: renamed from: l
public class class_120 extends SimpleChannelInboundHandler {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_232;
   // $FF: renamed from: b org.apache.logging.log4j.Marker
   public static final Marker field_233;
   // $FF: renamed from: c org.apache.logging.log4j.Marker
   public static final Marker field_234;
   // $FF: renamed from: d org.apache.logging.log4j.Marker
   public static final Marker field_235;
   // $FF: renamed from: e io.netty.util.AttributeKey
   public static final AttributeKey field_236;
   // $FF: renamed from: f io.netty.util.AttributeKey
   public static final AttributeKey field_237;
   // $FF: renamed from: g io.netty.util.AttributeKey
   public static final AttributeKey field_238;
   // $FF: renamed from: h io.netty.channel.nio.NioEventLoopGroup
   public static final NioEventLoopGroup field_239;
   // $FF: renamed from: i rJ
   public static final class_1536 field_240;
   // $FF: renamed from: k boolean
   private final boolean field_241;
   // $FF: renamed from: l java.util.Queue
   private final Queue field_242;
   // $FF: renamed from: m java.util.Queue
   private final Queue field_243;
   // $FF: renamed from: n io.netty.channel.Channel
   private Channel field_244;
   // $FF: renamed from: o java.net.SocketAddress
   private SocketAddress field_245;
   // $FF: renamed from: p rP
   private class_57 field_246;
   // $FF: renamed from: q ag
   private class_906 field_247;
   // $FF: renamed from: r rV
   private class_66 field_248;
   // $FF: renamed from: s boolean
   private boolean field_249;
   // $FF: renamed from: t java.lang.String
   private static final String field_250;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_251;


   // $FF: renamed from: <init> (boolean) void
   public void method_549(boolean var1) {
      super();
      this.field_242 = Queues.newConcurrentLinkedQueue();
      this.field_243 = Queues.newConcurrentLinkedQueue();
      this.field_241 = var1;
   }

   public void channelActive(ChannelHandlerContext var1) {
      super.channelActive(var1);
      this.field_244 = var1.channel();
      this.field_245 = this.field_244.remoteAddress();
      this.method_550(class_906.field_4459);
   }

   // $FF: renamed from: b (ag) void
   public void method_550(class_906 var1) {
      this.field_247 = (class_906)this.field_244.attr(field_236).getAndSet(var1);
      this.field_244.attr(field_237).set(var1.method_5332(this.field_241));
      this.field_244.attr(field_238).set(var1.method_5333(this.field_241));
      this.field_244.config().setAutoRead(true);
      String[] var10001 = field_251;
      field_232.debug("Enabled auto read");
   }

   public void channelInactive(ChannelHandlerContext var1) {
      class_1081 var10001 = new class_1081;
      String[] var10003 = field_251;
      var10001.method_6126("disconnect.endOfStream", new Object[0]);
      this.method_558(var10001);
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      class_1081 var4;
      label11: {
         String[] var3 = class_752.method_4253();
         class_1081 var10000;
         String[] var5;
         if(var2 instanceof TimeoutException) {
            var10000 = new class_1081;
            var5 = field_251;
            var10000.method_6126("disconnect.timeout", new Object[0]);
            var4 = var10000;
            if(var3 != null) {
               break label11;
            }
         }

         var10000 = new class_1081;
         var5 = field_251;
         var10000.method_6126("disconnect.genericReason", new Object[]{"Internal Exception: " + var2});
         var4 = var10000;
      }

      this.method_558(var4);
   }

   // $FF: renamed from: b (io.netty.channel.ChannelHandlerContext, r1) void
   protected void method_551(ChannelHandlerContext param1, class_250 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (rP) void
   public void method_552(class_57 var1) {
      String[] var2 = field_251;
      Validate.notNull(var1, "packetListener", new Object[0]);
      field_232.debug("Set listener of {} to {}", new Object[]{this, var1});
      this.field_246 = var1;
   }

   // $FF: renamed from: b (r1, io.netty.util.concurrent.GenericFutureListener[]) void
   public void method_553(class_250 param1, GenericFutureListener ... param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (r1, io.netty.util.concurrent.GenericFutureListener[]) void
   private void method_554(class_250 param1, GenericFutureListener[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   private void method_555() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_556() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () java.net.SocketAddress
   public SocketAddress method_557() {
      return this.field_245;
   }

   // $FF: renamed from: b (rV) void
   public void method_558(class_66 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () boolean
   public boolean method_559() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.net.InetAddress, int) l
   public static class_120 method_560(InetAddress var0, int var1) {
      class_120 var10000 = new class_120;
      var10000.method_549(true);
      class_120 var2 = var10000;
      Bootstrap var3 = (Bootstrap)(new Bootstrap()).group(field_239);
      class_115 var10001 = new class_115;
      var10001.method_538(var2);
      ((Bootstrap)((Bootstrap)var3.handler(var10001)).channel(NioSocketChannel.class)).connect(var0, var1).syncUninterruptibly();
      return var2;
   }

   // $FF: renamed from: b (java.net.SocketAddress) l
   public static class_120 method_561(SocketAddress var0) {
      class_120 var10000 = new class_120;
      var10000.method_549(true);
      class_120 var1 = var10000;
      Bootstrap var2 = (Bootstrap)(new Bootstrap()).group(field_239);
      class_116 var10001 = new class_116;
      var10001.method_540(var1);
      ((Bootstrap)((Bootstrap)var2.handler(var10001)).channel(LocalChannel.class)).connect(var0).syncUninterruptibly();
      return var1;
   }

   // $FF: renamed from: b (javax.crypto.SecretKey) void
   public void method_562(SecretKey var1) {
      ChannelPipeline var10000 = this.field_244.pipeline();
      String[] var2 = field_251;
      class_126 var10003 = new class_126;
      var10003.method_584(class_1701.method_9428(2, var1));
      var10000.addBefore("splitter", "decrypt", var10003);
      var10000 = this.field_244.pipeline();
      class_123 var3 = new class_123;
      var3.method_575(class_1701.method_9428(1, var1));
      var10000.addBefore("prepender", "encrypt", var3);
      this.field_249 = true;
   }

   // $FF: renamed from: e () boolean
   public boolean method_563() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () rP
   public class_57 method_564() {
      return this.field_246;
   }

   // $FF: renamed from: g () rV
   public class_66 method_565() {
      return this.field_248;
   }

   // $FF: renamed from: h () void
   public void method_566() {
      this.field_244.config().setAutoRead(false);
   }

   protected void channelRead0(ChannelHandlerContext var1, Object var2) {
      this.method_551(var1, (class_250)var2);
   }

   // $FF: renamed from: b (l) io.netty.channel.Channel
   static Channel method_567(class_120 var0) {
      return var0.field_244;
   }

   // $FF: renamed from: <clinit> () void
   static void method_568() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (io.netty.handler.timeout.TimeoutException) io.netty.handler.timeout.TimeoutException
   private static TimeoutException method_569(TimeoutException var0) {
      return var0;
   }
}
