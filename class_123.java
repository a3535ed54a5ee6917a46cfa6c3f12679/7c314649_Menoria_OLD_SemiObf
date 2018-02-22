import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

// $FF: renamed from: o
public class class_123 extends MessageToByteEncoder {

   // $FF: renamed from: b rG
   private final class_1530 field_259;


   // $FF: renamed from: <init> (javax.crypto.Cipher) void
   public void method_575(Cipher var1) {
      super();
      class_1530 var10001 = new class_1530;
      var10001.method_8286(var1);
      this.field_259 = var10001;
   }

   // $FF: renamed from: b (io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf, io.netty.buffer.ByteBuf) void
   protected void method_576(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) {
      this.field_259.method_8289(var2, var3);
   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.method_576(var1, (ByteBuf)var2, var3);
   }
}
