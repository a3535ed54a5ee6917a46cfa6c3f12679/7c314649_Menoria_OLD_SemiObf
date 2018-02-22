import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;

// $FF: renamed from: rH
class class_1532 implements Runnable {

   // $FF: renamed from: a java.lang.String
   private static final String field_8034 = "CL_00001241";
   // $FF: renamed from: b ag
   final class_906 field_8035;
   // $FF: renamed from: c ag
   final class_906 field_8036;
   // $FF: renamed from: d r1
   final class_250 field_8037;
   // $FF: renamed from: e io.netty.util.concurrent.GenericFutureListener[]
   final GenericFutureListener[] field_8038;
   // $FF: renamed from: f l
   final class_120 field_8039;


   // $FF: renamed from: <init> (l, ag, ag, r1, io.netty.util.concurrent.GenericFutureListener[]) void
   void method_8298(class_120 var1, class_906 var2, class_906 var3, class_250 var4, GenericFutureListener[] var5) {
      this.field_8039 = var1;
      this.field_8035 = var2;
      this.field_8036 = var3;
      this.field_8037 = var4;
      this.field_8038 = var5;
      super();
   }

   public void run() {
      String[] var1 = class_752.method_4253();
      class_1532 var10000 = this;
      if(var1 != null) {
         if(this.field_8035 != this.field_8036) {
            this.field_8039.method_550(this.field_8035);
         }

         var10000 = this;
      }

      class_120.method_567(var10000.field_8039).writeAndFlush(this.field_8037).addListeners(this.field_8038).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8299() {
      boolean var10000 = true;
      char[] var10003 = "ÒÛ¢ï¬ó".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8034 = (new String((char[])var4)).intern();
            String var2 = field_8034;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 198;
            break;
         case 1:
            var10009 = 134;
            break;
         case 2:
            var10009 = 223;
            break;
         case 3:
            var10009 = 180;
            break;
         case 4:
            var10009 = 243;
            break;
         case 5:
            var10009 = 181;
            break;
         default:
            var10009 = 138;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
