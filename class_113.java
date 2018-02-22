import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: e
public class class_113 extends ChannelInboundHandlerAdapter {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_209;
   // $FF: renamed from: c uo
   private class_1680 field_210;
   // $FF: renamed from: d java.lang.String
   private static final String field_211;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_212;


   // $FF: renamed from: <init> (uo) void
   public void method_531(class_1680 var1) {
      super();
      this.field_210 = var1;
   }

   public void channelRead(ChannelHandlerContext param1, Object param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf) void
   private void method_532(ChannelHandlerContext var1, ByteBuf var2) {
      var1.pipeline().firstContext().writeAndFlush(var2).addListener(ChannelFutureListener.CLOSE);
   }

   // $FF: renamed from: b (java.lang.String) io.netty.buffer.ByteBuf
   private ByteBuf method_533(String var1) {
      ByteBuf var3 = Unpooled.buffer();
      String[] var10000 = class_752.method_4253();
      var3.writeByte(255);
      char[] var4 = var1.toCharArray();
      var3.writeShort(var4.length);
      char[] var5 = var4;
      int var6 = var4.length;
      String[] var2 = var10000;
      int var7 = 0;

      ByteBuf var10;
      while(true) {
         if(var7 < var6) {
            char var8 = var5[var7];

            try {
               var10 = var3.writeChar(var8);
               if(var2 == null) {
                  break;
               }

               ++var7;
               if(var2 != null) {
                  continue;
               }
            } catch (RuntimeException var9) {
               throw method_535(var9);
            }
         }

         var10 = var3;
         break;
      }

      return var10;
   }

   // $FF: renamed from: <clinit> () void
   static void method_534() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_535(RuntimeException var0) {
      return var0;
   }
}
