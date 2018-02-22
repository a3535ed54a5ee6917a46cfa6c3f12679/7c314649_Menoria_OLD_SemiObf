
public class bmx implements bmv {

   // $FF: renamed from: a od
   private class_1447 field_7343;
   // $FF: renamed from: b double
   private double field_7344;
   // $FF: renamed from: c double
   private double field_7345;
   // $FF: renamed from: d double
   private double field_7346;
   private static final String __OBFID = "CL_00000976";


   // $FF: renamed from: <init> () void
   public void method_7538() {
      super();
      this.field_7343 = class_1448.method_7890();
   }

   // $FF: renamed from: a (double, double, double) void
   public void method_159(double var1, double var3, double var5) {
      this.field_7344 = var1;
      this.field_7345 = var3;
      this.field_7346 = var5;
   }

   // $FF: renamed from: b (double, double, double, double, double, double) boolean
   public boolean method_7539(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.field_7343.method_7887(var1 - this.field_7344, var3 - this.field_7345, var5 - this.field_7346, var7 - this.field_7344, var9 - this.field_7345, var11 - this.field_7346);
   }

   // $FF: renamed from: a (kg) boolean
   public boolean method_158(class_1343 var1) {
      return this.method_7539(var1.field_6909, var1.field_6910, var1.field_6911, var1.field_6912, var1.field_6913, var1.field_6914);
   }

   public boolean isBoxInFrustumFully(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.field_7343.method_7888(var1 - this.field_7344, var3 - this.field_7345, var5 - this.field_7346, var7 - this.field_7344, var9 - this.field_7345, var11 - this.field_7346);
   }

   public boolean isBoundingBoxInFrustumFully(class_1343 var1) {
      return this.isBoxInFrustumFully(var1.field_6909, var1.field_6910, var1.field_6911, var1.field_6912, var1.field_6913, var1.field_6914);
   }

   // $FF: renamed from: <clinit> () void
   static void method_7540() {
      boolean var10000 = true;
      char[] var10003 = "¥ZçVÇÒÖ/P".toCharArray();
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
            __OBFID = (new String((char[])var4)).intern();
            String var2 = __OBFID;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 148;
            break;
         case 1:
            var10009 = 100;
            break;
         case 2:
            var10009 = 202;
            break;
         case 3:
            var10009 = 20;
            break;
         case 4:
            var10009 = 133;
            break;
         case 5:
            var10009 = 144;
            break;
         default:
            var10009 = 65;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
