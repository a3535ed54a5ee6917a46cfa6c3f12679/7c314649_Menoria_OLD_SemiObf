import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

// $FF: renamed from: n
public class class_122 extends ByteToMessageDecoder {

   // $FF: renamed from: a java.lang.String
   private static final String field_257;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_258;


   // $FF: renamed from: <init> () void
   public void method_572() {
      super();
   }

   protected void decode(ChannelHandlerContext param1, ByteBuf param2, List param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (io.netty.handler.codec.CorruptedFrameException) io.netty.handler.codec.CorruptedFrameException
   private static CorruptedFrameException method_573(CorruptedFrameException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_574() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "V ;öM\f\t9Ä¢R|ÀÕûX\fy)2lÂÔæWXi";
      int var4 = "V ;öM\f\t9Ä¢R|ÀÕûX\fy)2lÂÔæWXi".length();
      char var1 = 24;
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
                  field_258 = var5;
                  String[] var10 = field_258;
                  field_257 = "CL_00001255";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 212;
               break;
            case 1:
               var10009 = 139;
               break;
            case 2:
               var10009 = 131;
               break;
            case 3:
               var10009 = 178;
               break;
            case 4:
               var10009 = 28;
               break;
            case 5:
               var10009 = 10;
               break;
            default:
               var10009 = 56;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
