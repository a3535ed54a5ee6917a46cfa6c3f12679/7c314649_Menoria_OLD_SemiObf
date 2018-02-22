
// $FF: renamed from: r5
public class class_346 extends class_250 {

   // $FF: renamed from: c int
   private int field_1751;
   // $FF: renamed from: d int
   private int field_1752;
   // $FF: renamed from: e int
   private int field_1753;
   // $FF: renamed from: f int
   private int field_1754;
   // $FF: renamed from: g int
   private int field_1755;
   // $FF: renamed from: i java.lang.String
   private static final String field_1756 = "id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sa) void
   public void method_1974(class_689 var1) {
      super.method_1449();
      this.field_1751 = var1.method_3845();
      this.field_1752 = class_1715.method_9561(var1.field_2994 * 32.0D);
      String[] var2 = class_752.method_4253();
      this.field_1753 = class_1715.method_9561(var1.field_2995 * 32.0D);
      class_346 var10000 = this;
      int var10001 = class_1715.method_9561(var1.field_2996 * 32.0D);
      if(var2 != null) {
         this.field_1754 = var10001;
         if(!(var1 instanceof class_703)) {
            return;
         }

         var10000 = this;
         var10001 = 1;
      }

      var10000.field_1755 = var10001;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1751 = var1.method_518();
      this.field_1755 = var1.readByte();
      this.field_1752 = var1.readInt();
      this.field_1753 = var1.readInt();
      this.field_1754 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_519(this.field_1751);
      var1.writeByte(this.field_1755);
      var1.writeInt(this.field_1752);
      var1.writeInt(this.field_1753);
      var1.writeInt(this.field_1754);
   }

   // $FF: renamed from: b (tF) void
   public void method_1975(class_64 var1) {
      var1.method_273(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f", new Object[]{Integer.valueOf(this.field_1751), Integer.valueOf(this.field_1755), Float.valueOf((float)this.field_1752 / 32.0F), Float.valueOf((float)this.field_1753 / 32.0F), Float.valueOf((float)this.field_1754 / 32.0F)});
   }

   // $FF: renamed from: a () int
   public int method_1976() {
      return this.field_1751;
   }

   // $FF: renamed from: e () int
   public int method_1977() {
      return this.field_1752;
   }

   // $FF: renamed from: f () int
   public int method_1978() {
      return this.field_1753;
   }

   // $FF: renamed from: g () int
   public int method_1979() {
      return this.field_1754;
   }

   // $FF: renamed from: h () int
   public int method_1980() {
      return this.field_1755;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "òÍÊxÂïÐDNq·VzÐý×XNqÌ©ÏÛ\tiÇµ".toCharArray();
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
            field_1756 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 31;
            break;
         case 1:
            var10009 = 45;
            break;
         case 2:
            var10009 = 115;
            break;
         case 3:
            var10009 = 165;
            break;
         case 4:
            var10009 = 247;
            break;
         case 5:
            var10009 = 208;
            break;
         default:
            var10009 = 102;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
