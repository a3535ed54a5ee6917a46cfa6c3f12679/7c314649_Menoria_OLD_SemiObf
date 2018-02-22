
// $FF: renamed from: sD
public class class_327 extends class_250 {

   // $FF: renamed from: c int
   private int field_1649;
   // $FF: renamed from: d byte[]
   private byte[] field_1650;
   // $FF: renamed from: i java.lang.String
   private static final String field_1651 = "id=%d, length=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, byte[]) void
   public void method_1850(int var1, byte[] var2) {
      super.method_1449();
      this.field_1649 = var1;
      this.field_1650 = var2;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1649 = var1.method_518();
      this.field_1650 = new byte[var1.readUnsignedShort()];
      var1.readBytes(this.field_1650);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_519(this.field_1649);
      var1.writeShort(this.field_1650.length);
      var1.writeBytes(this.field_1650);
   }

   // $FF: renamed from: b (tF) void
   public void method_1851(class_64 var1) {
      var1.method_288(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, length=%d", new Object[]{Integer.valueOf(this.field_1649), Integer.valueOf(this.field_1650.length)});
   }

   // $FF: renamed from: a () int
   public int method_1852() {
      return this.field_1649;
   }

   // $FF: renamed from: e () byte[]
   public byte[] method_1853() {
      return this.field_1650;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "ûÎø²?þÏ«=ö\"·Î".toCharArray();
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
            field_1651 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 129;
            break;
         case 1:
            var10009 = 185;
            break;
         case 2:
            var10009 = 214;
            break;
         case 3:
            var10009 = 73;
            break;
         case 4:
            var10009 = 251;
            break;
         case 5:
            var10009 = 141;
            break;
         default:
            var10009 = 12;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
