
// $FF: renamed from: tc
public class class_274 extends class_250 {

   // $FF: renamed from: c int
   private int field_1455;
   // $FF: renamed from: d short
   private short field_1456;
   // $FF: renamed from: e boolean
   private boolean field_1457;
   // $FF: renamed from: i java.lang.String
   private static final String field_1458 = "id=%d, uid=%d, accepted=%b";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, short, boolean) void
   public void method_1574(int var1, short var2, boolean var3) {
      super.method_1449();
      this.field_1455 = var1;
      this.field_1456 = var2;
      this.field_1457 = var3;
   }

   // $FF: renamed from: b (tL) void
   public void method_1575(class_63 var1) {
      var1.method_255(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_1455 = var1.readByte();
      String[] var2 = var10000;
      this.field_1456 = var1.readShort();
      int var10001 = var1.readByte();
      if(var2 != null) {
         var10001 = var10001 != 0?1:0;
      }

      this.field_1457 = (boolean)var10001;
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      var1.writeByte(this.field_1455);
      String[] var2 = var10000;
      var1.writeShort(this.field_1456);
      int var10001 = this.field_1457;
      if(var2 != null) {
         var10001 = this.field_1457?1:0;
      }

      var1.writeByte(var10001);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, uid=%d, accepted=%b", new Object[]{Integer.valueOf(this.field_1455), Short.valueOf(this.field_1456), Boolean.valueOf(this.field_1457)});
   }

   // $FF: renamed from: a () int
   public int method_1576() {
      return this.field_1455;
   }

   // $FF: renamed from: e () short
   public short method_1577() {
      return this.field_1456;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "c×ØåXDÚý\f*Ò£YØo×Øå^".toCharArray();
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
            field_1458 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 100;
            break;
         case 1:
            var10009 = 221;
            break;
         case 2:
            var10009 = 139;
            break;
         case 3:
            var10009 = 174;
            break;
         case 4:
            var10009 = 82;
            break;
         case 5:
            var10009 = 6;
            break;
         default:
            var10009 = 194;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
