
// $FF: renamed from: td
public class class_273 extends class_250 {

   // $FF: renamed from: c int
   private int field_1452;
   // $FF: renamed from: d int
   private int field_1453;
   // $FF: renamed from: i java.lang.String
   private static final String field_1454 = "id=%d, button=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_1570(int var1, int var2) {
      super.method_1449();
      this.field_1452 = var1;
      this.field_1453 = var2;
   }

   // $FF: renamed from: b (tL) void
   public void method_1571(class_63 var1) {
      var1.method_256(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1452 = var1.readByte();
      this.field_1453 = var1.readByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeByte(this.field_1452);
      var1.writeByte(this.field_1453);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, button=%d", new Object[]{Integer.valueOf(this.field_1452), Integer.valueOf(this.field_1453)});
   }

   // $FF: renamed from: a () int
   public int method_1572() {
      return this.field_1452;
   }

   // $FF: renamed from: e () int
   public int method_1573() {
      return this.field_1453;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "Û<@Êù·Ð-\tÉÁ»ª<".toCharArray();
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
            field_1454 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 221;
            break;
         case 1:
            var10009 = 55;
            break;
         case 2:
            var10009 = 18;
            break;
         case 3:
            var10009 = 210;
            break;
         case 4:
            var10009 = 193;
            break;
         case 5:
            var10009 = 186;
            break;
         default:
            var10009 = 248;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
