import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

// $FF: renamed from: q
public class class_125 extends MessageToByteEncoder {

   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_265;


   // $FF: renamed from: <init> () void
   public void method_580() {
      super();
   }

   // $FF: renamed from: b (io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf, io.netty.buffer.ByteBuf) void
   protected void method_581(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) {
      int var4 = var2.readableBytes();
      int var5 = class_112.method_517(var4);

      try {
         if(var5 > 3) {
            IllegalArgumentException var9 = new IllegalArgumentException;
            StringBuilder var10002 = new StringBuilder();
            String[] var7 = field_265;
            var9.<init>(var10002.append("unable to fit ").append(var4).append(" into ").append(3).toString());
            throw var9;
         }
      } catch (IllegalArgumentException var8) {
         throw method_582(var8);
      }

      class_112 var10000 = new class_112;
      var10000.method_516(var3);
      class_112 var6 = var10000;
      var6.ensureWritable(var5 + var4);
      var6.method_519(var4);
      var6.writeBytes(var2, var2.readerIndex(), var4);
   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.method_581(var1, (ByteBuf)var2, var3);
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_582(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_583() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "§ö7÷[Z¦·3òJZÕ ù!ô";
      int var4 = "§ö7÷[Z¦·3òJZÕ ù!ô".length();
      char var1 = 14;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_265 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 131;
               break;
            case 1:
               var10009 = 191;
               break;
            case 2:
               var10009 = 225;
               break;
            case 3:
               var10009 = 35;
               break;
            case 4:
               var10009 = 237;
               break;
            case 5:
               var10009 = 72;
               break;
            default:
               var10009 = 12;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
