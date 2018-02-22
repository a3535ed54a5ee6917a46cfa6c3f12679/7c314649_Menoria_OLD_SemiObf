
// $FF: renamed from: yd
public class class_1844 {

   // $FF: renamed from: b sw
   private class_753 field_9410;
   // $FF: renamed from: c float
   private float field_9411;
   // $FF: renamed from: d float
   private float field_9412;
   // $FF: renamed from: e boolean
   private boolean field_9413;
   // $FF: renamed from: f double
   private double field_9414;
   // $FF: renamed from: g double
   private double field_9415;
   // $FF: renamed from: h double
   private double field_9416;
   // $FF: renamed from: i java.lang.String
   private static final String field_9417 = "CL_00001572";


   // $FF: renamed from: <init> (sw) void
   public void method_9974(class_753 var1) {
      super();
      this.field_9410 = var1;
   }

   // $FF: renamed from: b (sa, float, float) void
   public void method_9975(class_689 var1, float var2, float var3) {
      label15: {
         String[] var4 = class_752.method_4253();
         class_1844 var10000 = this;
         double var10001 = var1.field_2994;
         if(var4 != null) {
            this.field_9414 = var1.field_2994;
            if(var1 instanceof class_752) {
               this.field_9415 = var1.field_2995 + (double)var1.method_3880();
               if(var4 != null) {
                  break label15;
               }
            }

            var10000 = this;
            var10001 = (var1.field_3004.field_6910 + var1.field_3004.field_6913) / 2.0D;
         }

         var10000.field_9415 = var10001;
      }

      this.field_9416 = var1.field_2996;
      this.field_9411 = var2;
      this.field_9412 = var3;
      this.field_9413 = true;
   }

   // $FF: renamed from: b (double, double, double, float, float) void
   public void method_9976(double var1, double var3, double var5, float var7, float var8) {
      this.field_9414 = var1;
      this.field_9415 = var3;
      this.field_9416 = var5;
      this.field_9411 = var7;
      this.field_9412 = var8;
      this.field_9413 = true;
   }

   // $FF: renamed from: b () void
   public void method_9977() {
      String[] var1;
      label35: {
         String[] var10000 = class_752.method_4253();
         this.field_9410.field_3001 = 0.0F;
         var1 = var10000;
         class_1844 var13 = this;
         if(var1 != null) {
            if(this.field_9413) {
               this.field_9413 = false;
               double var2 = this.field_9414 - this.field_9410.field_2994;
               double var4 = this.field_9415 - (this.field_9410.field_2995 + (double)this.field_9410.method_3880());
               double var6 = this.field_9416 - this.field_9410.field_2996;
               double var8 = (double)class_1715.method_9558(var2 * var2 + var6 * var6);
               float var10 = (float)(Math.atan2(var6, var2) * 180.0D / 3.141592653589793D) - 90.0F;
               float var11 = (float)(-(Math.atan2(var4, var8) * 180.0D / 3.141592653589793D));
               this.field_9410.field_3001 = this.method_9978(this.field_9410.field_3001, var11, this.field_9412);
               this.field_9410.field_3332 = this.method_9978(this.field_9410.field_3332, var10, this.field_9411);
               if(var1 != null) {
                  break label35;
               }
            }

            var13 = this;
         }

         var13.field_9410.field_3332 = this.method_9978(this.field_9410.field_3332, this.field_9410.field_3330, 10.0F);
      }

      float var12 = class_1715.method_9579(this.field_9410.field_3332 - this.field_9410.field_3330);
      int var14 = this.field_9410.method_4257().method_9801();
      if(var1 != null) {
         if(var14 != 0) {
            return;
         }

         float var15;
         var14 = (var15 = var12 - -75.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var14 < 0) {
            this.field_9410.field_3332 = this.field_9410.field_3330 - 75.0F;
         }

         float var16;
         var14 = (var16 = var12 - 75.0F) == 0.0F?0:(var16 < 0.0F?-1:1);
      }

      if(var14 > 0) {
         this.field_9410.field_3332 = this.field_9410.field_3330 + 75.0F;
      }

   }

   // $FF: renamed from: b (float, float, float) float
   private float method_9978(float var1, float var2, float var3) {
      float var5 = class_1715.method_9579(var2 - var1);
      String[] var4 = class_752.method_4253();
      float var7;
      int var10000 = (var7 = var5 - var3) == 0.0F?0:(var7 < 0.0F?-1:1);
      float var10001;
      float var6;
      if(var4 != null) {
         if(var10000 > 0) {
            var5 = var3;
         }

         var6 = var5;
         var10001 = -var3;
         if(var4 == null) {
            return var6 + var10001;
         }

         float var8;
         var10000 = (var8 = var5 - var10001) == 0.0F?0:(var8 < 0.0F?-1:1);
      }

      if(var10000 < 0) {
         var5 = -var3;
      }

      var6 = var1;
      var10001 = var5;
      return var6 + var10001;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9979() {
      boolean var10000 = true;
      char[] var10003 = "ÙdduSú«\fw".toCharArray();
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
            field_9417 = (new String((char[])var4)).intern();
            String var2 = field_9417;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 43;
            break;
         case 1:
            var10009 = 153;
            break;
         case 2:
            var10009 = 138;
            break;
         case 3:
            var10009 = 244;
            break;
         case 4:
            var10009 = 29;
            break;
         case 5:
            var10009 = 210;
            break;
         default:
            var10009 = 123;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
