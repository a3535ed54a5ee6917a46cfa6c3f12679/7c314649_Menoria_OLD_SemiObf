
// $FF: renamed from: si
public class class_291 extends class_250 {

   // $FF: renamed from: c int
   private int field_1527;
   // $FF: renamed from: d short
   private short field_1528;
   // $FF: renamed from: e boolean
   private boolean field_1529;
   // $FF: renamed from: i java.lang.String
   private static final String field_1530 = "id=%d, uid=%d, accepted=%b";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, short, boolean) void
   public void method_1672(int var1, short var2, boolean var3) {
      super.method_1449();
      this.field_1527 = var1;
      this.field_1528 = var2;
      this.field_1529 = var3;
   }

   // $FF: renamed from: b (tF) void
   public void method_1673(class_64 var1) {
      var1.method_289(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1527 = var1.readUnsignedByte();
      this.field_1528 = var1.readShort();
      this.field_1529 = var1.readBoolean();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(this.field_1527);
      var1.writeShort(this.field_1528);
      var1.writeBoolean(this.field_1529);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, uid=%d, accepted=%b", new Object[]{Integer.valueOf(this.field_1527), Short.valueOf(this.field_1528), Boolean.valueOf(this.field_1529)});
   }

   // $FF: renamed from: a () int
   public int method_1674() {
      return this.field_1527;
   }

   // $FF: renamed from: e () short
   public short method_1675() {
      return this.field_1528;
   }

   // $FF: renamed from: f () boolean
   public boolean method_1676() {
      return this.field_1529;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "\bøP\r¡HÞ7A¦#YøP".toCharArray();
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
            field_1530 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 241;
            break;
         case 1:
            var10009 = 116;
            break;
         case 2:
            var10009 = 85;
            break;
         case 3:
            var10009 = 229;
            break;
         case 4:
            var10009 = 107;
            break;
         case 5:
            var10009 = 195;
            break;
         default:
            var10009 = 189;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
