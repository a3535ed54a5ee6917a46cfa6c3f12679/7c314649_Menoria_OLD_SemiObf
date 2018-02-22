
// $FF: renamed from: oI
public class class_845 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3904;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1221 var10001 = new class_1221;
      var10001.method_6510();
      super.method_4798(var10001, 0.3F);
   }

   // $FF: renamed from: b (w5) float
   protected float method_4896(class_787 var1) {
      return 180.0F;
   }

   // $FF: renamed from: b (w5, double, double, double, float, float) void
   public void method_4897(class_787 var1, double var2, double var4, double var6, float var8, float var9) {
      super.method_4830(var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: c (w5) bqx
   protected bqx method_4898(class_787 var1) {
      return field_3904;
   }

   // $FF: renamed from: b (w5, int, float) int
   protected int method_4899(class_787 var1, int var2, float var3) {
      return -1;
   }

   // $FF: renamed from: a (sa) bqx
   // $FF: synthetic method
   protected bqx method_4729(class_689 var1) {
      return this.method_4898((class_787)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "L9ÏBExRKsÒXDcCAsÄ_\\|RJ:ÞEX$GV;".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var5)).intern();
            bqx var3 = new bqx;
            var3.method_8227(var0);
            field_3904 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 60;
            break;
         case 1:
            var10009 = 88;
            break;
         case 2:
            var10009 = 179;
            break;
         case 3:
            var10009 = 50;
            break;
         case 4:
            var10009 = 52;
            break;
         case 5:
            var10009 = 14;
            break;
         default:
            var10009 = 51;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
