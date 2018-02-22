
// $FF: renamed from: r4
public class class_347 extends class_250 {

   // $FF: renamed from: c int
   private int field_1757;
   // $FF: renamed from: d int
   private int field_1758;
   // $FF: renamed from: e int
   private int field_1759;
   // $FF: renamed from: f int
   private int field_1760;
   // $FF: renamed from: g int
   private int field_1761;
   // $FF: renamed from: i java.lang.String
   private static final String field_1762 = "id=%d, value=%d, x=%.2f, y=%.2f, z=%.2f";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (wC) void
   public void method_1981(class_715 var1) {
      super.method_1449();
      this.field_1757 = var1.method_3845();
      this.field_1758 = class_1715.method_9561(var1.field_2994 * 32.0D);
      this.field_1759 = class_1715.method_9561(var1.field_2995 * 32.0D);
      this.field_1760 = class_1715.method_9561(var1.field_2996 * 32.0D);
      this.field_1761 = var1.method_4088();
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1757 = var1.method_518();
      this.field_1758 = var1.readInt();
      this.field_1759 = var1.readInt();
      this.field_1760 = var1.readInt();
      this.field_1761 = var1.readShort();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_519(this.field_1757);
      var1.writeInt(this.field_1758);
      var1.writeInt(this.field_1759);
      var1.writeInt(this.field_1760);
      var1.writeShort(this.field_1761);
   }

   // $FF: renamed from: b (tF) void
   public void method_1982(class_64 var1) {
      var1.method_272(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, value=%d, x=%.2f, y=%.2f, z=%.2f", new Object[]{Integer.valueOf(this.field_1757), Integer.valueOf(this.field_1761), Float.valueOf((float)this.field_1758 / 32.0F), Float.valueOf((float)this.field_1759 / 32.0F), Float.valueOf((float)this.field_1760 / 32.0F)});
   }

   // $FF: renamed from: a () int
   public int method_1983() {
      return this.field_1757;
   }

   // $FF: renamed from: e () int
   public int method_1984() {
      return this.field_1758;
   }

   // $FF: renamed from: f () int
   public int method_1985() {
      return this.field_1759;
   }

   // $FF: renamed from: g () int
   public int method_1986() {
      return this.field_1760;
   }

   // $FF: renamed from: h () int
   public int method_1987() {
      return this.field_1761;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "*±ø8Ø5´ÆAù)Ý\'ùL¡1Öq³å)ÝmçÌ¼nÅfûR".toCharArray();
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
            field_1762 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 82;
            break;
         case 1:
            var10009 = 196;
            break;
         case 2:
            var10009 = 187;
            break;
         case 3:
            var10009 = 37;
            break;
         case 4:
            var10009 = 141;
            break;
         case 5:
            var10009 = 5;
            break;
         default:
            var10009 = 233;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
