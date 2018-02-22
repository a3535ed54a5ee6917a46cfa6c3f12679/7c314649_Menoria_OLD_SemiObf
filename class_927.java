import io.netty.buffer.ByteBuf;

// $FF: renamed from: c9
class class_927 extends class_926 {

   // $FF: renamed from: a java.lang.String
   private static final String field_4717 = "CL_00001673";
   // $FF: renamed from: i xs
   final class_698 field_4718;


   // $FF: renamed from: <init> (xs) void
   void method_5447(class_698 var1) {
      this.field_4718 = var1;
      super.method_5433();
   }

   // $FF: renamed from: f () void
   public void method_5442() {
      this.field_4718.method_3849().method_9506(23, this.method_5439());
      this.field_4718.method_3849().method_9506(24, class_1556.method_8482(this.method_5435()));
   }

   // $FF: renamed from: g () int
   public int method_5443() {
      return 1;
   }

   // $FF: renamed from: b (io.netty.buffer.ByteBuf) void
   public void method_5444(ByteBuf var1) {
      var1.writeInt(this.field_4718.method_3845());
   }

   // $FF: renamed from: f_ () vF
   public class_1661 method_68() {
      class_1661 var10000 = new class_1661;
      var10000.method_9151(class_1715.method_9561(this.field_4718.field_2994), class_1715.method_9561(this.field_4718.field_2995 + 0.5D), class_1715.method_9561(this.field_4718.field_2996));
      return var10000;
   }

   // $FF: renamed from: d () ahb
   public ahb method_69() {
      return this.field_4718.field_2990;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5446() {
      boolean var10000 = true;
      char[] var10003 = "úømíOû>î".toCharArray();
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
            field_4717 = (new String((char[])var4)).intern();
            String var2 = field_4717;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 148;
            break;
         case 1:
            var10009 = 153;
            break;
         case 2:
            var10009 = 31;
            break;
         case 3:
            var10009 = 240;
            break;
         case 4:
            var10009 = 82;
            break;
         case 5:
            var10009 = 230;
            break;
         default:
            var10009 = 35;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
