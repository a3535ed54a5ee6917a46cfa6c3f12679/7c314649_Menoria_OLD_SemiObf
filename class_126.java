import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

// $FF: renamed from: r
public class class_126 extends MessageToMessageDecoder {

   // $FF: renamed from: b rG
   private final class_1530 field_266;


   // $FF: renamed from: <init> (javax.crypto.Cipher) void
   public void method_584(Cipher var1) {
      super();
      class_1530 var10001 = new class_1530;
      var10001.method_8286(var1);
      this.field_266 = var10001;
   }

   // $FF: renamed from: b (io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf, java.util.List) void
   protected void method_585(ChannelHandlerContext var1, ByteBuf var2, List var3) {
      var3.add(this.field_266.method_8288(var1, var2));
   }

   // $FF: synthetic method
   protected void decode(ChannelHandlerContext var1, Object var2, List var3) {
      this.method_585(var1, (ByteBuf)var2, var3);
   }
}
