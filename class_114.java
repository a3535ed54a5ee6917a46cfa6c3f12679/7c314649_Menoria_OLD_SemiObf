import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;

// $FF: renamed from: f
class class_114 extends ChannelInitializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_213 = "CL_00000894";
   // $FF: renamed from: b nE
   final class_1385 field_214;
   // $FF: renamed from: c nF
   final class_1386 field_215;
   // $FF: renamed from: d nH
   final class_1388 field_216;


   // $FF: renamed from: <init> (nH, nE, nF) void
   void method_536(class_1388 var1, class_1385 var2, class_1386 var3) {
      this.field_216 = var1;
      this.field_214 = var2;
      this.field_215 = var3;
      super();
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.IP_TOS, Integer.valueOf(24));
      } catch (ChannelException var4) {
         ;
      }

      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
      } catch (ChannelException var3) {
         ;
      }

      ChannelPipeline var10000 = var1.pipeline();
      ChannelHandler[] var10001 = new ChannelHandler[1];
      class_119 var10004 = new class_119;
      var10004.method_546(this);
      var10001[0] = var10004;
      var10000.addLast(var10001);
   }

   // $FF: renamed from: <clinit> () void
   static void method_537() {
      boolean var10000 = true;
      char[] var10003 = "=Ì£¾v N¸Åº".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_213 = (new String((char[])var4)).intern();
            String var2 = field_213;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 195;
            break;
         case 1:
            var10009 = 61;
            break;
         case 2:
            var10009 = 65;
            break;
         case 3:
            var10009 = 51;
            break;
         case 4:
            var10009 = 19;
            break;
         case 5:
            var10009 = 251;
            break;
         default:
            var10009 = 173;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
