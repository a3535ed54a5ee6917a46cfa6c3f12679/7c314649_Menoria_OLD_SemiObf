
// $FF: renamed from: r9
public class class_342 extends class_250 {

   // $FF: renamed from: c int
   private int field_1715;
   // $FF: renamed from: d int
   private int field_1716;
   // $FF: renamed from: i java.lang.String
   private static final String field_1717 = "id=%d, type=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sa, int) void
   public void method_1937(class_689 var1, int var2) {
      super.method_1449();
      this.field_1715 = var1.method_3845();
      this.field_1716 = var2;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1715 = var1.method_518();
      this.field_1716 = var1.readUnsignedByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_519(this.field_1715);
      var1.writeByte(this.field_1716);
   }

   // $FF: renamed from: b (tF) void
   public void method_1938(class_64 var1) {
      var1.method_278(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, type=%d", new Object[]{Integer.valueOf(this.field_1715), Integer.valueOf(this.field_1716)});
   }

   // $FF: renamed from: a () int
   public int method_1939() {
      return this.field_1715;
   }

   // $FF: renamed from: e () int
   public int method_1940() {
      return this.field_1716;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "\bÀn\f\frLÝ#LU{\b".toCharArray();
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
            field_1717 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 52;
            break;
         case 1:
            var10009 = 241;
            break;
         case 2:
            var10009 = 6;
            break;
         case 3:
            var10009 = 124;
            break;
         case 4:
            var10009 = 61;
            break;
         case 5:
            var10009 = 11;
            break;
         default:
            var10009 = 57;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
