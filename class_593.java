
// $FF: renamed from: gn
public class class_593 extends class_580 {

   // $FF: renamed from: m c7
   private final class_926 field_2523;
   // $FF: renamed from: n java.lang.String
   private static final String field_2524 = "CL_00000347";


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      class_928 var10001 = new class_928;
      var10001.method_5448(this);
      this.field_2523 = var10001;
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      this.field_2523.method_5436(var1);
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      super.getBlock92(var1);
      this.field_2523.method_5437(var1);
   }

   // $FF: renamed from: q () r1
   public class_250 method_3100() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var1 = var10000;
      this.getBlock93(var1);
      class_299 var2 = new class_299;
      var2.method_1710(this.field_2465, this.field_2466, this.field_2467, 2, var1);
      return var2;
   }

   // $FF: renamed from: b () c7
   public class_926 method_3160() {
      return this.field_2523;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      boolean var10000 = true;
      char[] var10003 = "mN,heÎ­1Go".toCharArray();
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
            field_2524 = (new String((char[])var4)).intern();
            String var2 = field_2524;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 29;
            break;
         case 1:
            var10009 = 49;
            break;
         case 2:
            var10009 = 64;
            break;
         case 3:
            var10009 = 107;
            break;
         case 4:
            var10009 = 102;
            break;
         case 5:
            var10009 = 205;
            break;
         default:
            var10009 = 174;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
