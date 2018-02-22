import java.util.Random;

// $FF: renamed from: pW
class class_1484 {

   // $FF: renamed from: b double
   double field_7800;
   // $FF: renamed from: c double
   double field_7801;
   // $FF: renamed from: d java.lang.String
   private static final String field_7802 = "CL_00001105";


   // $FF: renamed from: <init> () void
   void method_8003() {
      super();
   }

   // $FF: renamed from: <init> (double, double) void
   void method_8004(double var1, double var3) {
      super();
      this.field_7800 = var1;
      this.field_7801 = var3;
   }

   // $FF: renamed from: b (pW) double
   double method_8005(class_1484 var1) {
      double var2 = this.field_7800 - var1.field_7800;
      double var4 = this.field_7801 - var1.field_7801;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   // $FF: renamed from: b () void
   void method_8006() {
      double var1 = (double)this.method_8007();
      this.field_7800 /= var1;
      this.field_7801 /= var1;
   }

   // $FF: renamed from: c () float
   float method_8007() {
      return class_1715.method_9558(this.field_7800 * this.field_7800 + this.field_7801 * this.field_7801);
   }

   // $FF: renamed from: c (pW) void
   public void method_8008(class_1484 var1) {
      this.field_7800 -= var1.field_7800;
      this.field_7801 -= var1.field_7801;
   }

   // $FF: renamed from: b (double, double, double, double) boolean
   public boolean method_8009(double var1, double var3, double var5, double var7) {
      String[] var9;
      byte var10;
      int var11;
      label43: {
         label46: {
            String[] var10000 = class_752.method_4253();
            var10 = 0;
            var9 = var10000;
            double var12;
            var11 = (var12 = this.field_7800 - var1) == 0.0D?0:(var12 < 0.0D?-1:1);
            if(var9 != null) {
               if(var11 < 0) {
                  this.field_7800 = var1;
                  var10 = 1;
                  if(var9 != null) {
                     break label46;
                  }
               }

               double var13;
               var11 = (var13 = this.field_7800 - var5) == 0.0D?0:(var13 < 0.0D?-1:1);
            }

            if(var9 == null) {
               break label43;
            }

            if(var11 > 0) {
               this.field_7800 = var5;
               var10 = 1;
            }
         }

         double var14;
         var11 = (var14 = this.field_7801 - var3) == 0.0D?0:(var14 < 0.0D?-1:1);
      }

      label47: {
         if(var9 != null) {
            if(var11 < 0) {
               this.field_7801 = var3;
               var10 = 1;
               if(var9 != null) {
                  break label47;
               }
            }

            double var15;
            var11 = (var15 = this.field_7801 - var7) == 0.0D?0:(var15 < 0.0D?-1:1);
         }

         if(var9 == null) {
            return (boolean)var11;
         }

         if(var11 > 0) {
            this.field_7801 = var7;
            var10 = 1;
         }
      }

      var11 = var10;
      return (boolean)var11;
   }

   // $FF: renamed from: b (ahb) int
   public int method_8010(ahb var1) {
      int var3 = class_1715.method_9561(this.field_7800);
      String[] var10000 = class_752.method_4253();
      int var4 = class_1715.method_9561(this.field_7801);
      String[] var2 = var10000;
      int var5 = 256;

      while(var5 > 0) {
         if(var1.getBlock(var3, var5, var4).method_2424() != awt.field_4170) {
            return var5 + 1;
         }

         --var5;
         if(var2 == null) {
            break;
         }
      }

      return 257;
   }

   // $FF: renamed from: c (ahb) boolean
   public boolean method_8011(ahb var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = class_1715.method_9561(this.field_7800);
      String[] var2 = var10000;
      int var4 = class_1715.method_9561(this.field_7801);
      short var5 = 256;
      short var7 = var5;
      if(var2 != null) {
         if(var5 > 0) {
            boolean var9;
            label21: {
               awt var6 = var1.getBlock(var3, var5, var4).method_2424();
               awt var8 = var6;
               if(var2 != null) {
                  if(var6.method_5062()) {
                     break label21;
                  }

                  var8 = var6;
               }

               if(var8 != awt.field_4184) {
                  var9 = true;
                  return var9;
               }
            }

            var9 = false;
            return var9;
         }

         var7 = 0;
      }

      return (boolean)var7;
   }

   // $FF: renamed from: b (java.util.Random, double, double, double, double) void
   public void method_8012(Random var1, double var2, double var4, double var6, double var8) {
      this.field_7800 = class_1715.method_9577(var1, var2, var6);
      this.field_7801 = class_1715.method_9577(var1, var4, var8);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8013() {
      boolean var10000 = true;
      char[] var10003 = "òóuêëp".toCharArray();
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
            field_7802 = (new String((char[])var4)).intern();
            String var2 = field_7802;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 185;
            break;
         case 1:
            var10009 = 183;
            break;
         case 2:
            var10009 = 211;
            break;
         case 3:
            var10009 = 77;
            break;
         case 4:
            var10009 = 210;
            break;
         case 5:
            var10009 = 176;
            break;
         default:
            var10009 = 51;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
