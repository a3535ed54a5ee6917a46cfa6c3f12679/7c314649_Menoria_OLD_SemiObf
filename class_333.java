
// $FF: renamed from: s8
public class class_333 extends class_250 {

   // $FF: renamed from: c int
   private int field_1681;
   // $FF: renamed from: d int
   private int field_1682;
   // $FF: renamed from: i java.lang.String
   private static final String field_1683 = "id=%d, type=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (sa, int) void
   public void method_1888(class_689 var1, int var2) {
      super.method_1449();
      this.field_1681 = var1.method_3845();
      this.field_1682 = var2;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1681 = var1.readInt();
      this.field_1682 = var1.readByte();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1681);
      var1.writeByte(this.field_1682);
   }

   // $FF: renamed from: b (tL) void
   public void method_1889(class_63 var1) {
      var1.method_250(this);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("id=%d, type=%d", new Object[]{Integer.valueOf(this.field_1681), Integer.valueOf(this.field_1682)});
   }

   // $FF: renamed from: a () int
   public int method_1890() {
      return this.field_1682;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "£8ùæß9¾%´¦0X".toCharArray();
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
            field_1683 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 250;
            break;
         case 1:
            var10009 = 108;
            break;
         case 2:
            var10009 = 244;
            break;
         case 3:
            var10009 = 243;
            break;
         case 4:
            var10009 = 139;
            break;
         case 5:
            var10009 = 37;
            break;
         default:
            var10009 = 12;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
