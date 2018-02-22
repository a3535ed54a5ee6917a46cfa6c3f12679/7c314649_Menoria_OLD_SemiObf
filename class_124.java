import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

// $FF: renamed from: p
public class class_124 extends MessageToByteEncoder {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_260;
   // $FF: renamed from: c org.apache.logging.log4j.Marker
   private static final Marker field_261;
   // $FF: renamed from: d rJ
   private final class_1536 field_262;
   // $FF: renamed from: e java.lang.String
   private static final String field_263;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_264;


   // $FF: renamed from: <init> (rJ) void
   public void method_577(class_1536 var1) {
      super();
      this.field_262 = var1;
   }

   // $FF: renamed from: b (io.netty.channel.ChannelHandlerContext, r1, io.netty.buffer.ByteBuf) void
   protected void method_578(ChannelHandlerContext var1, class_250 var2, ByteBuf var3) {
      Integer var5;
      label17: {
         String[] var10000 = class_752.method_4253();
         var5 = (Integer)((BiMap)var1.channel().attr(class_120.field_238).get()).inverse().get(var2.getClass());
         String[] var4 = var10000;
         Logger var8 = field_260;
         if(var4 != null) {
            if(!field_260.isDebugEnabled()) {
               break label17;
            }

            var8 = field_260;
         }

         String[] var7 = field_264;
         var8.debug(field_261, "OUT: [{}:{}] {}[{}]", new Object[]{var1.channel().attr(class_120.field_236).get(), var5, var2.getClass().getName(), var2.method_1457()});
      }

      if(var5 == null) {
         IOException var10 = new IOException("Can\'t serialize unregistered packet");
         String[] var10002 = field_264;
         throw var10;
      } else {
         class_112 var9 = new class_112;
         var9.method_516(var3);
         class_112 var6 = var9;
         var6.method_519(var5.intValue());
         var2.method_1454(var6);
         this.field_262.method_8340(var5.intValue(), (long)var6.readableBytes());
      }
   }

   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.method_578(var1, (class_250)var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_579() {
      // $FF: Couldn't be decompiled
   }
}
