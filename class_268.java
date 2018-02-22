
// $FF: renamed from: ti
public class class_268 extends class_250 {

   // $FF: renamed from: c int
   private int field_1434;
   // $FF: renamed from: d int
   private int field_1435;
   // $FF: renamed from: e java.lang.String
   private static final String field_1436 = "CL_00001359";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_1547(int var1, int var2) {
      super.method_1449();
      this.field_1434 = var1;
      this.field_1435 = var2;
   }

   // $FF: renamed from: b (tL) void
   public void method_1548(class_63 var1) {
      var1.method_261(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1434 = var1.readInt();
      this.field_1435 = var1.readInt();
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.writeInt(this.field_1434);
      var1.writeInt(this.field_1435);
   }

   // $FF: renamed from: b () boolean
   public boolean method_1456() {
      return true;
   }

   // $FF: renamed from: a () int
   public int method_1549() {
      return this.field_1434;
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_1548((class_63)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "/\fë%mwH]s,".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_1436 = (new String((char[])var4)).intern();
            String var2 = field_1436;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 220;
            break;
         case 1:
            var10009 = 240;
            break;
         case 2:
            var10009 = 4;
            break;
         case 3:
            var10009 = 165;
            break;
         case 4:
            var10009 = 237;
            break;
         case 5:
            var10009 = 247;
            break;
         default:
            var10009 = 200;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
