
// $FF: renamed from: ye
public class class_1845 {

   // $FF: renamed from: b sw
   private class_753 field_9418;
   // $FF: renamed from: c double
   private double field_9419;
   // $FF: renamed from: d double
   private double field_9420;
   // $FF: renamed from: e double
   private double field_9421;
   // $FF: renamed from: f double
   private double field_9422;
   // $FF: renamed from: g boolean
   private boolean field_9423;
   // $FF: renamed from: h java.lang.String
   private static final String field_9424 = "CL_00001573";


   // $FF: renamed from: <init> (sw) void
   public void method_9980(class_753 var1) {
      super();
      this.field_9418 = var1;
      this.field_9419 = var1.field_2994;
      this.field_9420 = var1.field_2995;
      this.field_9421 = var1.field_2996;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9981() {
      return this.field_9423;
   }

   // $FF: renamed from: c () double
   public double method_9982() {
      return this.field_9422;
   }

   // $FF: renamed from: b (double, double, double, double) void
   public void method_9983(double var1, double var3, double var5, double var7) {
      this.field_9419 = var1;
      this.field_9420 = var3;
      this.field_9421 = var5;
      this.field_9422 = var7;
      this.field_9423 = true;
   }

   // $FF: renamed from: d () void
   public void method_9984() {
      String[] var10000 = class_752.method_4253();
      this.field_9418.method_4268(0.0F);
      String[] var1 = var10000;
      int var12 = this.field_9423;
      if(var1 != null) {
         if(!this.field_9423) {
            return;
         }

         this.field_9423 = false;
         var12 = class_1715.method_9561(this.field_9418.field_3004.field_6910 + 0.5D);
      }

      int var2 = var12;
      double var3 = this.field_9419 - this.field_9418.field_2994;
      double var5 = this.field_9421 - this.field_9418.field_2996;
      double var7 = this.field_9420 - (double)var2;
      double var9 = var3 * var3 + var7 * var7 + var5 * var5;
      double var13 = var9;
      double var10001 = 2.500000277905201E-7D;
      if(var1 != null) {
         if(var9 < 2.500000277905201E-7D) {
            return;
         }

         var13 = Math.atan2(var5, var3) * 180.0D;
         var10001 = 3.141592653589793D;
      }

      float var11 = (float)(var13 / var10001) - 90.0F;
      this.field_9418.field_3000 = this.method_9985(this.field_9418.field_3000, var11, 30.0F);
      this.field_9418.method_4227((float)(this.field_9422 * this.field_9418.method_4211(class_1840.field_9393).method_396()));
      double var14;
      var12 = (var14 = var7 - 0.0D) == 0.0D?0:(var14 < 0.0D?-1:1);
      if(var1 != null) {
         if(var12 <= 0) {
            return;
         }

         double var15;
         var12 = (var15 = var3 * var3 + var5 * var5 - 1.0D) == 0.0D?0:(var15 < 0.0D?-1:1);
      }

      if(var12 < 0) {
         this.field_9418.method_4256().method_9972();
      }

   }

   // $FF: renamed from: b (float, float, float) float
   private float method_9985(float var1, float var2, float var3) {
      String[] var10000 = class_752.method_4253();
      float var5 = class_1715.method_9579(var2 - var1);
      String[] var4 = var10000;
      float var8;
      int var6 = (var8 = var5 - var3) == 0.0F?0:(var8 < 0.0F?-1:1);
      float var10001;
      float var7;
      if(var4 != null) {
         if(var6 > 0) {
            var5 = var3;
         }

         var7 = var5;
         var10001 = -var3;
         if(var4 == null) {
            return var7 + var10001;
         }

         float var9;
         var6 = (var9 = var5 - var10001) == 0.0F?0:(var9 < 0.0F?-1:1);
      }

      if(var6 < 0) {
         var5 = -var3;
      }

      var7 = var1;
      var10001 = var5;
      return var7 + var10001;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9986() {
      boolean var10000 = true;
      char[] var10003 = "ty¬WìA ï¯".toCharArray();
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
            field_9424 = (new String((char[])var4)).intern();
            String var2 = field_9424;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 30;
            break;
         case 1:
            var10009 = 28;
            break;
         case 2:
            var10009 = 241;
            break;
         case 3:
            var10009 = 181;
            break;
         case 4:
            var10009 = 78;
            break;
         case 5:
            var10009 = 245;
            break;
         default:
            var10009 = 88;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
