import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.timeout.ReadTimeoutHandler;

// $FF: renamed from: i
class class_117 extends ChannelInitializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_223;
   // $FF: renamed from: b uo
   final class_1680 field_224;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_225;


   // $FF: renamed from: <init> (uo) void
   void method_542(class_1680 var1) {
      this.field_224 = var1;
      super();
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.IP_TOS, Integer.valueOf(24));
      } catch (ChannelException var5) {
         ;
      }

      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
      } catch (ChannelException var4) {
         ;
      }

      ChannelPipeline var10000 = var1.pipeline();
      String[] var3 = field_225;
      var10000 = var10000.addLast("timeout", new ReadTimeoutHandler(30));
      class_113 var10002 = new class_113;
      var10002.method_531(this.field_224);
      var10000 = var10000.addLast("legacy_query", var10002);
      class_122 var7 = new class_122;
      var7.method_572();
      var10000 = var10000.addLast("splitter", var7);
      class_121 var8 = new class_121;
      var8.method_570(class_120.field_240);
      var10000 = var10000.addLast("decoder", var8);
      class_125 var9 = new class_125;
      var9.method_580();
      var10000 = var10000.addLast("prepender", var9);
      class_124 var10 = new class_124;
      var10.method_577(class_120.field_240);
      var10000.addLast("encoder", var10);
      class_120 var6 = new class_120;
      var6.method_549(false);
      class_120 var2 = var6;
      class_1680.method_9257(this.field_224).add(var2);
      var1.pipeline().addLast("packet_handler", var2);
      class_1690 var10001 = new class_1690;
      var10001.method_9321(class_1680.method_9258(this.field_224), var2);
      var2.method_552(var10001);
   }

   // $FF: renamed from: <clinit> () void
   static void method_543() {
      // $FF: Couldn't be decompiled
   }
}
