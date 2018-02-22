
// $FF: renamed from: go
public class class_592 extends class_580 {

   // $FF: renamed from: m int
   private int field_2521;
   // $FF: renamed from: n java.lang.String
   private static final String field_2522 = "OutputSignal";


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      var1.method_8667("OutputSignal", this.field_2521);
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      super.getBlock92(var1);
      this.field_2521 = var1.method_8681("OutputSignal");
   }

   // $FF: renamed from: b () int
   public int method_3158() {
      return this.field_2521;
   }

   // $FF: renamed from: b (int) void
   public void method_3159(int var1) {
      this.field_2521 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      boolean var10000 = true;
      char[] var10003 = "#Ey;Ôb_h\"".toCharArray();
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
            field_2522 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 239;
            break;
         case 1:
            var10009 = 106;
            break;
         case 2:
            var10009 = 178;
            break;
         case 3:
            var10009 = 138;
            break;
         case 4:
            var10009 = 205;
            break;
         case 5:
            var10009 = 35;
            break;
         default:
            var10009 = 178;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
