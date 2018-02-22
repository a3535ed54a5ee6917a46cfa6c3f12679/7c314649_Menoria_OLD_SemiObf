
// $FF: renamed from: sP
public class class_315 extends class_250 {

   // $FF: renamed from: c int
   private int field_1606;
   // $FF: renamed from: d byte
   private byte field_1607;
   // $FF: renamed from: i java.lang.String
   private static final String field_1608 = "id=%d, rot=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sa, byte) void
   public void method_1791(class_689 var1, byte var2) {
      super.method_1449();
      this.field_1606 = var1.method_3845();
      this.field_1607 = var2;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1606 = var1.readInt();
      this.field_1607 = var1.readByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1606);
      var1.writeByte(this.field_1607);
   }

   // $FF: renamed from: b (tF) void
   public void method_1792(class_64 var1) {
      var1.method_315(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, rot=%d", new Object[]{Integer.valueOf(this.field_1606), Byte.valueOf(this.field_1607)});
   }

   // $FF: renamed from: b (ahb) sa
   public class_689 method_1793(ahb var1) {
      return var1.method_2160(this.field_1606);
   }

   // $FF: renamed from: a () byte
   public byte method_1794() {
      return this.field_1607;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "øª\bT¨ã¡ÔJ".toCharArray();
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
            field_1608 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 113;
            break;
         case 1:
            var10009 = 46;
            break;
         case 2:
            var10009 = 64;
            break;
         case 3:
            var10009 = 205;
            break;
         case 4:
            var10009 = 143;
            break;
         case 5:
            var10009 = 152;
            break;
         default:
            var10009 = 104;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
