import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;

// $FF: renamed from: rG
public class class_1530 {

   // $FF: renamed from: b javax.crypto.Cipher
   private final Cipher field_8027;
   // $FF: renamed from: c byte[]
   private byte[] field_8028;
   // $FF: renamed from: d byte[]
   private byte[] field_8029;


   // $FF: renamed from: <init> (javax.crypto.Cipher) void
   protected void method_8286(Cipher var1) {
      super();
      this.field_8028 = new byte[0];
      this.field_8029 = new byte[0];
      this.field_8027 = var1;
   }

   // $FF: renamed from: b (io.netty.buffer.ByteBuf) byte[]
   private byte[] method_8287(ByteBuf var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = var1.readableBytes();
      String[] var2 = var10000;
      byte[] var4 = this.field_8028;
      if(var2 != null) {
         if(this.field_8028.length < var3) {
            this.field_8028 = new byte[var3];
         }

         var1.readBytes(this.field_8028, 0, var3);
         var4 = this.field_8028;
      }

      return var4;
   }

   // $FF: renamed from: b (io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf) io.netty.buffer.ByteBuf
   protected ByteBuf method_8288(ChannelHandlerContext var1, ByteBuf var2) {
      int var3 = var2.readableBytes();
      byte[] var4 = this.method_8287(var2);
      ByteBuf var5 = var1.alloc().heapBuffer(this.field_8027.getOutputSize(var3));
      var5.writerIndex(this.field_8027.update(var4, 0, var3, var5.array(), var5.arrayOffset()));
      return var5;
   }

   // $FF: renamed from: b (io.netty.buffer.ByteBuf, io.netty.buffer.ByteBuf) void
   protected void method_8289(ByteBuf var1, ByteBuf var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = var1.readableBytes();
      byte[] var5 = this.method_8287(var1);
      String[] var3 = var10000;
      int var6 = this.field_8027.getOutputSize(var4);
      if(var3 != null) {
         if(this.field_8029.length < var6) {
            this.field_8029 = new byte[var6];
         }

         var2.writeBytes(this.field_8029, 0, this.field_8027.update(var5, 0, var4, this.field_8029));
      }

   }
}
