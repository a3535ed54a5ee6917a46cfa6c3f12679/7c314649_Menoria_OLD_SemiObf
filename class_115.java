import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.timeout.ReadTimeoutHandler;

// $FF: renamed from: g
final class class_115 extends ChannelInitializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_217;
   // $FF: renamed from: b l
   final class_120 field_218;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_219;


   // $FF: renamed from: <init> (l) void
   void method_538(class_120 var1) {
      this.field_218 = var1;
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
      String[] var3 = field_219;
      var10000 = var10000.addLast("timeout", new ReadTimeoutHandler(20));
      class_122 var10002 = new class_122;
      var10002.method_572();
      var10000 = var10000.addLast("splitter", var10002);
      class_121 var6 = new class_121;
      var6.method_570(class_120.field_240);
      var10000 = var10000.addLast("decoder", var6);
      class_125 var7 = new class_125;
      var7.method_580();
      var10000 = var10000.addLast("prepender", var7);
      class_124 var8 = new class_124;
      var8.method_577(class_120.field_240);
      var10000.addLast("encoder", var8).addLast("packet_handler", this.field_218);
   }

   // $FF: renamed from: <clinit> () void
   static void method_539() {
      // $FF: Couldn't be decompiled
   }
}
