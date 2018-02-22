import com.google.common.base.Charsets;
import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

// $FF: renamed from: k
class class_119 extends SimpleChannelInboundHandler {

   // $FF: renamed from: a java.lang.String
   private static final String field_229;
   // $FF: renamed from: b f
   final class_114 field_230;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_231;


   // $FF: renamed from: <init> (f) void
   void method_546(class_114 var1) {
      this.field_230 = var1;
      super();
   }

   public void channelActive(ChannelHandlerContext var1) {
      String[] var10000 = class_752.method_4253();
      super.channelActive(var1);
      String[] var2 = var10000;
      ByteBuf var3 = Unpooled.buffer();
      boolean var11 = false;

      try {
         var11 = true;
         var3.writeByte(254);
         var3.writeByte(1);
         var3.writeByte(250);
         var10000 = field_231;
         char[] var4 = "MC|PingHost".toCharArray();
         var3.writeShort(var4.length);
         char[] var5 = var4;
         int var6 = var4.length;
         int var7 = 0;

         char var8;
         label75: {
            while(var7 < var6) {
               var8 = var5[var7];
               var3.writeChar(var8);
               ++var7;
               if(var2 == null) {
                  break label75;
               }

               if(var2 == null) {
                  break;
               }
            }

            var3.writeShort(7 + 2 * this.field_230.field_214.method_7552().length());
            var3.writeByte(127);
            var4 = this.field_230.field_214.method_7552().toCharArray();
            var3.writeShort(var4.length);
            var5 = var4;
            var6 = var4.length;
         }

         var7 = 0;

         while(var7 < var6) {
            var8 = var5[var7];
            var3.writeChar(var8);
            ++var7;
            if(var2 == null) {
               var11 = false;
               return;
            }

            if(var2 == null) {
               break;
            }
         }

         var3.writeInt(this.field_230.field_214.method_7553());
         var1.channel().writeAndFlush(var3).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
         var11 = false;
      } finally {
         if(var11) {
            var3.release();
         }
      }

      var3.release();
   }

   // $FF: renamed from: b (io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf) void
   protected void method_547(ChannelHandlerContext var1, ByteBuf var2) {
      String[] var10000 = class_752.method_4253();
      short var4 = var2.readUnsignedByte();
      String[] var3 = var10000;
      if(var3 != null) {
         if(var4 == 255) {
            String var5 = new String(var2.readBytes(var2.readShort() * 2).array(), Charsets.UTF_16BE);
            String[] var6 = (String[])((String[])((String[])Iterables.toArray(class_1388.method_7588().split(var5), String.class)));
            if(var3 == null) {
               return;
            }

            var10000 = field_231;
            if("§1".equals(var6[0])) {
               int var7 = class_1715.method_9581(var6[1], 0);
               String var8 = var6[2];
               String var9 = var6[3];
               int var10 = class_1715.method_9581(var6[4], -1);
               int var11 = class_1715.method_9581(var6[5], -1);
               this.field_230.field_215.field_7366 = -1;
               this.field_230.field_215.field_7367 = var8;
               this.field_230.field_215.field_7364 = var9;
               this.field_230.field_215.field_7363 = class_130.field_283 + "" + var10 + "" + class_130.field_284 + "/" + class_130.field_283 + var11;
            }
         }

         var1.close();
      }

   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      var1.close();
   }

   protected void channelRead0(ChannelHandlerContext var1, Object var2) {
      this.method_547(var1, (ByteBuf)var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_548() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "R<3îW<5\\3qA°È/Gvt¸N";
      int var4 = "R<3îW<5\\3qA°È/Gvt¸N".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_231 = var5;
                  String[] var10 = field_231;
                  field_229 = "CL_00000895";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 254;
               break;
            case 1:
               var10009 = 158;
               break;
            case 2:
               var10009 = 174;
               break;
            case 3:
               var10009 = 160;
               break;
            case 4:
               var10009 = 144;
               break;
            case 5:
               var10009 = 97;
               break;
            default:
               var10009 = 25;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
