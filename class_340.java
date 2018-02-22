
// $FF: renamed from: s1
public class class_340 extends class_250 {

   // $FF: renamed from: c int
   private int field_1707;
   // $FF: renamed from: d int
   private int field_1708;
   // $FF: renamed from: e int
   private int field_1709;
   // $FF: renamed from: i java.lang.String
   private static final String field_1710 = "x=%d, y=%d, z=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int) void
   public void method_1925(int var1, int var2, int var3) {
      super.method_1449();
      this.field_1707 = var1;
      this.field_1708 = var2;
      this.field_1709 = var3;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1707 = var1.readInt();
      this.field_1708 = var1.readInt();
      this.field_1709 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1707);
      var1.writeInt(this.field_1708);
      var1.writeInt(this.field_1709);
   }

   // $FF: renamed from: b (tF) void
   public void method_1926(class_64 var1) {
      var1.method_325(this);
   }

   // $FF: renamed from: b () boolean
   public boolean method_1456() {
      return false;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("x=%d, y=%d, z=%d", new Object[]{Integer.valueOf(this.field_1707), Integer.valueOf(this.field_1708), Integer.valueOf(this.field_1709)});
   }

   // $FF: renamed from: a () int
   public int method_1927() {
      return this.field_1707;
   }

   // $FF: renamed from: e () int
   public int method_1928() {
      return this.field_1708;
   }

   // $FF: renamed from: f () int
   public int method_1929() {
      return this.field_1709;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "û×í£T|¾¥¯8¦D".toCharArray();
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
            field_1710 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 255;
            break;
         case 1:
            var10009 = 92;
            break;
         case 2:
            var10009 = 142;
            break;
         case 3:
            var10009 = 245;
            break;
         case 4:
            var10009 = 243;
            break;
         case 5:
            var10009 = 8;
            break;
         default:
            var10009 = 121;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
