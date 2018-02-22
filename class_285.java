import io.netty.buffer.ByteBuf;

// $FF: renamed from: so
public class class_285 extends class_250 {

   // $FF: renamed from: c java.lang.String
   private String field_1509;
   // $FF: renamed from: d byte[]
   private byte[] field_1510;
   // $FF: renamed from: i java.lang.String
   private static final String field_1511 = "Payload may not be larger than 1048576 bytes";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.lang.String, io.netty.buffer.ByteBuf) void
   public void method_1642(String var1, ByteBuf var2) {
      this.method_1643(var1, var2.array());
   }

   // $FF: renamed from: <init> (java.lang.String, byte[]) void
   public void method_1643(String var1, byte[] var2) {
      super.method_1449();
      this.field_1509 = var1;
      this.field_1510 = var2;
      if(var2.length >= 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1509 = var1.method_524(20);
      this.field_1510 = new byte[var1.readUnsignedShort()];
      var1.readBytes(this.field_1510);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(this.field_1509);
      var1.writeShort(this.field_1510.length);
      var1.writeBytes(this.field_1510);
   }

   // $FF: renamed from: b (tF) void
   public void method_1644(class_64 var1) {
      var1.method_295(this);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1645() {
      return this.field_1509;
   }

   // $FF: renamed from: e () byte[]
   public byte[] method_1646() {
      return this.field_1510;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "M;,@vi=74ybiz7{lo=0ce|4uÈ#5(mcÙMnyx)".toCharArray();
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
            field_1511 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 25;
            break;
         case 1:
            var10009 = 94;
            break;
         case 2:
            var10009 = 81;
            break;
         case 3:
            var10009 = 253;
            break;
         case 4:
            var10009 = 43;
            break;
         case 5:
            var10009 = 19;
            break;
         default:
            var10009 = 9;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
