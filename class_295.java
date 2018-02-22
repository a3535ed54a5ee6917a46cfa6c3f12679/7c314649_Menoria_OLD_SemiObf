
// $FF: renamed from: se
public class class_295 extends class_250 {

   // $FF: renamed from: c int
   private int field_1541;
   // $FF: renamed from: d int
   private int field_1542;
   // $FF: renamed from: e int
   private int field_1543;
   // $FF: renamed from: f aji
   private aji field_1544;
   // $FF: renamed from: g int
   private int field_1545;
   // $FF: renamed from: i java.lang.String
   private static final String field_1546 = "type=%d, data=%d, x=%d, y=%d, z=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int, int, ahb) void
   public void method_1691(int var1, int var2, int var3, ahb var4) {
      super.method_1449();
      this.field_1541 = var1;
      this.field_1542 = var2;
      this.field_1543 = var3;
      this.field_1544 = var4.getBlock(var1, var2, var3);
      this.field_1545 = var4.method_33(var1, var2, var3);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1541 = var1.readInt();
      this.field_1542 = var1.readUnsignedByte();
      this.field_1543 = var1.readInt();
      this.field_1544 = aji.method_2416(var1.method_518());
      this.field_1545 = var1.readUnsignedByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1541);
      var1.writeByte(this.field_1542);
      var1.writeInt(this.field_1543);
      var1.method_519(aji.method_2415(this.field_1544));
      var1.writeByte(this.field_1545);
   }

   // $FF: renamed from: b (tF) void
   public void method_1692(class_64 var1) {
      var1.method_284(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("type=%d, data=%d, x=%d, y=%d, z=%d", new Object[]{Integer.valueOf(aji.method_2415(this.field_1544)), Integer.valueOf(this.field_1545), Integer.valueOf(this.field_1541), Integer.valueOf(this.field_1542), Integer.valueOf(this.field_1543)});
   }

   // $FF: renamed from: a () aji
   public aji method_1693() {
      return this.field_1544;
   }

   // $FF: renamed from: e () int
   public int method_1694() {
      return this.field_1541;
   }

   // $FF: renamed from: f () int
   public int method_1695() {
      return this.field_1542;
   }

   // $FF: renamed from: g () int
   public int method_1696() {
      return this.field_1543;
   }

   // $FF: renamed from: h () int
   public int method_1697() {
      return this.field_1545;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "µ>*¦íg.ÛÉÿä#Oo×ç¥kC6¦ígrÌ".toCharArray();
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
            field_1546 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 217;
            break;
         case 1:
            var10009 = 95;
            break;
         case 2:
            var10009 = 123;
            break;
         case 3:
            var10009 = 87;
            break;
         case 4:
            var10009 = 183;
            break;
         case 5:
            var10009 = 176;
            break;
         default:
            var10009 = 218;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
