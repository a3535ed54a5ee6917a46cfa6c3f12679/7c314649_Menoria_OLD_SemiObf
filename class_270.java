import io.netty.buffer.ByteBuf;

// $FF: renamed from: tg
public class class_270 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1440;
   // $FF: renamed from: d int
   private int field_1441;
   // $FF: renamed from: e byte[]
   private byte[] field_1442;
   // $FF: renamed from: i java.lang.String
   private static final String field_1443 = "Payload may not be larger than 32k";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.lang.String, io.netty.buffer.ByteBuf) void
   public void method_1554(String var1, ByteBuf var2) {
      this.method_1555(var1, var2.array());
   }

   // $FF: renamed from: <init> (java.lang.String, byte[]) void
   public void method_1555(String param1, byte[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tL) void
   public void method_1556(class_63 var1) {
      var1.method_259(this);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1557() {
      return this.field_1440;
   }

   // $FF: renamed from: d () byte[]
   public byte[] method_1558() {
      return this.field_1442;
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_1559(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "Æº#{4¶¶64?âû*41ä¼=48÷µZ|&".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_1443 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 62;
            break;
         case 1:
            var10009 = 115;
            break;
         case 2:
            var10009 = 210;
            break;
         case 3:
            var10009 = 231;
            break;
         case 4:
            var10009 = 188;
            break;
         case 5:
            var10009 = 217;
            break;
         default:
            var10009 = 248;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
