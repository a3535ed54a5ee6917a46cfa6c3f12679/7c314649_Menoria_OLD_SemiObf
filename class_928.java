import io.netty.buffer.ByteBuf;

// $FF: renamed from: c8
class class_928 extends class_926 {

   // $FF: renamed from: a java.lang.String
   private static final String field_4719 = "CL_00000348";
   // $FF: renamed from: i gn
   final class_593 field_4720;


   // $FF: renamed from: <init> (gn) void
   void method_5448(class_593 var1) {
      this.field_4720 = var1;
      super.method_5433();
   }

   // $FF: renamed from: f_ () vF
   public class_1661 method_68() {
      class_1661 var10000 = new class_1661;
      var10000.method_9151(this.field_4720.field_2465, this.field_4720.field_2466, this.field_4720.field_2467);
      return var10000;
   }

   // $FF: renamed from: d () ahb
   public ahb method_69() {
      return this.field_4720.method_99();
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_5438(String var1) {
      super.method_5438(var1);
      this.field_4720.method_91();
   }

   // $FF: renamed from: f () void
   public void method_5442() {
      this.field_4720.method_99().method_2059(this.field_4720.field_2465, this.field_4720.field_2466, this.field_4720.field_2467);
   }

   // $FF: renamed from: g () int
   public int method_5443() {
      return 0;
   }

   // $FF: renamed from: b (io.netty.buffer.ByteBuf) void
   public void method_5444(ByteBuf var1) {
      var1.writeInt(this.field_4720.field_2465);
      var1.writeInt(this.field_4720.field_2466);
      var1.writeInt(this.field_4720.field_2467);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5446() {
      boolean var10000 = true;
      char[] var10003 = "ß¾` ÂE¬Á(".toCharArray();
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
            field_4719 = (new String((char[])var4)).intern();
            String var2 = field_4719;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 53;
            break;
         case 1:
            var10009 = 91;
            break;
         case 2:
            var10009 = 150;
            break;
         case 3:
            var10009 = 185;
            break;
         case 4:
            var10009 = 91;
            break;
         case 5:
            var10009 = 23;
            break;
         default:
            var10009 = 220;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
