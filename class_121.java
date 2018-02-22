import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

// $FF: renamed from: m
public class class_121 extends ByteToMessageDecoder {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_252;
   // $FF: renamed from: c org.apache.logging.log4j.Marker
   private static final Marker field_253;
   // $FF: renamed from: d rJ
   private final class_1536 field_254;
   // $FF: renamed from: e java.lang.String
   private static final String field_255;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_256;


   // $FF: renamed from: <init> (rJ) void
   public void method_570(class_1536 var1) {
      super();
      this.field_254 = var1;
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = var2.readableBytes();
      String[] var4 = var10000;
      if(var5 != 0) {
         class_112 var10 = new class_112;
         var10.method_516(var2);
         class_112 var6 = var10;
         int var7 = var6.method_518();
         class_250 var8 = class_250.method_1450((BiMap)var1.channel().attr(class_120.field_237).get(), var7);
         class_250 var11 = var8;
         String[] var9;
         StringBuilder var14;
         IOException var15;
         if(var4 != null) {
            if(var8 == null) {
               var15 = new IOException;
               var14 = new StringBuilder();
               var9 = field_256;
               var15.<init>(var14.append("Bad packet id ").append(var7).toString());
               throw var15;
            }

            var11 = var8;
         }

         Logger var13;
         label36: {
            var11.method_1453(var6);
            int var12 = var6.readableBytes();
            if(var4 != null) {
               if(var12 > 0) {
                  var15 = new IOException;
                  var14 = new StringBuilder();
                  var9 = field_256;
                  var15.<init>(var14.append("Packet was larger than I expected, found ").append(var6.readableBytes()).append(" bytes extra whilst reading packet ").append(var7).toString());
                  throw var15;
               }

               var3.add(var8);
               this.field_254.method_8339(var7, (long)var5);
               var13 = field_252;
               if(var4 == null) {
                  break label36;
               }

               var12 = field_252.isDebugEnabled();
            }

            if(var12 == 0) {
               return;
            }

            var13 = field_252;
         }

         String[] var10002 = field_256;
         var13.debug(field_253, " IN: [{}:{}] {}[{}]", new Object[]{var1.channel().attr(class_120.field_236).get(), Integer.valueOf(var7), var8.getClass().getName(), var8.method_1457()});
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_571() {
      // $FF: Couldn't be decompiled
   }
}
