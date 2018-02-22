import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;

// $FF: renamed from: j
class class_118 extends ChannelInitializer {

   // $FF: renamed from: a java.lang.String
   private static final String field_226;
   // $FF: renamed from: b uo
   final class_1680 field_227;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_228;


   // $FF: renamed from: <init> (uo) void
   void method_544(class_1680 var1) {
      this.field_227 = var1;
      super();
   }

   protected void initChannel(Channel var1) {
      class_120 var10000 = new class_120;
      var10000.method_549(false);
      class_120 var2 = var10000;
      class_1673 var10001 = new class_1673;
      var10001.method_9232(class_1680.method_9258(this.field_227), var2);
      var2.method_552(var10001);
      class_1680.method_9257(this.field_227).add(var2);
      ChannelPipeline var3 = var1.pipeline();
      String[] var4 = field_228;
      var3.addLast("packet_handler", var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_545() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "±örZ¼ÿcw6)Ö£65DQæß";
      int var4 = "±örZ¼ÿcw6)Ö£65DQæß".length();
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_228 = var5;
                  String[] var10 = field_228;
                  field_226 = "CL_00001449";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 225;
               break;
            case 1:
               var10009 = 241;
               break;
            case 2:
               var10009 = 70;
               break;
            case 3:
               var10009 = 114;
               break;
            case 4:
               var10009 = 7;
               break;
            case 5:
               var10009 = 146;
               break;
            default:
               var10009 = 145;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
