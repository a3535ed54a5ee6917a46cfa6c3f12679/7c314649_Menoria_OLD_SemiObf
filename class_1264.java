import java.util.Random;

// $FF: renamed from: i_
public class class_1264 {

   // $FF: renamed from: a int[][]
   private static int[][] field_6564;
   // $FF: renamed from: b double
   public static final double field_6565;
   // $FF: renamed from: c int[]
   private int[] field_6566;
   // $FF: renamed from: d double
   public double field_6567;
   // $FF: renamed from: e double
   public double field_6568;
   // $FF: renamed from: f double
   public double field_6569;
   // $FF: renamed from: h double
   private static final double field_6570;
   // $FF: renamed from: i double
   private static final double field_6571;


   // $FF: renamed from: <init> () void
   public void method_6667() {
      this.method_6668(new Random());
   }

   // $FF: renamed from: <init> (java.util.Random) void
   public void method_6668(Random var1) {
      super();
      this.field_6566 = new int[512];
      this.field_6567 = var1.nextDouble() * 256.0D;
      this.field_6568 = var1.nextDouble() * 256.0D;
      this.field_6569 = var1.nextDouble() * 256.0D;

      int var2;
      for(var2 = 0; var2 < 256; this.field_6566[var2] = var2++) {
         ;
      }

      for(var2 = 0; var2 < 256; ++var2) {
         int var3 = var1.nextInt(256 - var2) + var2;
         int var4 = this.field_6566[var2];
         this.field_6566[var2] = this.field_6566[var3];
         this.field_6566[var3] = var4;
         this.field_6566[var2 + 256] = this.field_6566[var2];
      }

   }

   // $FF: renamed from: b (double) int
   private static int method_6669(double var0) {
      String[] var2 = class_752.method_4253();
      double var3;
      int var10000 = (var3 = var0 - 0.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
      if(var2 != null) {
         if(var10000 > 0) {
            var10000 = (int)var0;
            return var10000;
         }

         var10000 = (int)var0;
      }

      --var10000;
      return var10000;
   }

   // $FF: renamed from: b (int[], double, double) double
   private static double method_6670(int[] var0, double var1, double var3) {
      return (double)var0[0] * var1 + (double)var0[1] * var3;
   }

   // $FF: renamed from: b (double, double) double
   public double method_6671(double var1, double var3) {
      String[] var5;
      int var16;
      int var17;
      double var18;
      double var26;
      double var28;
      int var30;
      byte var31;
      label51: {
         double var12 = 0.5D * (field_6565 - 1.0D);
         double var14 = (var1 + var3) * var12;
         String[] var10000 = class_752.method_4253();
         var16 = method_6669(var1 + var14);
         var17 = method_6669(var3 + var14);
         var18 = (3.0D - field_6565) / 6.0D;
         double var20 = (double)(var16 + var17) * var18;
         var5 = var10000;
         double var22 = (double)var16 - var20;
         double var24 = (double)var17 - var20;
         var26 = var1 - var22;
         var28 = var3 - var24;
         double var53;
         int var51 = (var53 = var26 - var28) == 0.0D?0:(var53 < 0.0D?-1:1);
         if(var5 != null) {
            if(var51 > 0) {
               var30 = 1;
               var31 = 0;
               if(var5 != null) {
                  break label51;
               }
            }

            var51 = 0;
         }

         var30 = var51;
         var31 = 1;
      }

      double var6;
      double var10001;
      double var32;
      double var34;
      double var36;
      double var38;
      int var43;
      int var44;
      double var52;
      label44: {
         var32 = var26 - (double)var30 + var18;
         var34 = var28 - (double)var31 + var18;
         var36 = var26 - 1.0D + 2.0D * var18;
         var38 = var28 - 1.0D + 2.0D * var18;
         int var40 = var16 & 255;
         int var41 = var17 & 255;
         int var42 = this.field_6566[var40 + this.field_6566[var41]] % 12;
         var43 = this.field_6566[var40 + var30 + this.field_6566[var41 + var31]] % 12;
         var44 = this.field_6566[var40 + 1 + this.field_6566[var41 + 1]] % 12;
         double var45 = 0.5D - var26 * var26 - var28 * var28;
         var52 = var45;
         var10001 = 0.0D;
         if(var5 != null) {
            if(var45 < 0.0D) {
               var6 = 0.0D;
               if(var5 != null) {
                  break label44;
               }
            }

            var45 *= var45;
            var52 = var45 * var45;
            var10001 = method_6670(field_6564[var42], var26, var28);
         }

         var6 = var52 * var10001;
      }

      double var8;
      label37: {
         double var47 = 0.5D - var32 * var32 - var34 * var34;
         var52 = var47;
         var10001 = 0.0D;
         if(var5 != null) {
            if(var47 < 0.0D) {
               var8 = 0.0D;
               if(var5 != null) {
                  break label37;
               }
            }

            var47 *= var47;
            var52 = var47 * var47;
            var10001 = method_6670(field_6564[var43], var32, var34);
         }

         var8 = var52 * var10001;
      }

      double var49 = 0.5D - var36 * var36 - var38 * var38;
      var52 = var49;
      var10001 = 0.0D;
      double var10;
      if(var5 != null) {
         if(var49 < 0.0D) {
            var10 = 0.0D;
            if(var5 != null) {
               return 70.0D * (var6 + var8 + var10);
            }
         }

         var49 *= var49;
         var52 = var49 * var49;
         var10001 = method_6670(field_6564[var44], var36, var38);
      }

      var10 = var52 * var10001;
      return 70.0D * (var6 + var8 + var10);
   }

   // $FF: renamed from: b (double[], double, double, int, int, double, double, double) void
   public void method_6672(double[] var1, double var2, double var4, int var6, int var7, double var8, double var10, double var12) {
      String[] var10000 = class_752.method_4253();
      int var15 = 0;
      String[] var14 = var10000;
      int var16 = 0;

      do {
         int var63 = var16;

         label74:
         while(true) {
            if(var63 >= var7) {
               return;
            }

            double var17 = (var4 + (double)var16) * var10 + this.field_6568;
            int var19 = 0;

            while(true) {
               if(var19 >= var6) {
                  break label74;
               }

               double var20 = (var2 + (double)var19) * var8 + this.field_6567;
               double var28 = (var20 + var17) * field_6570;
               int var30 = method_6669(var20 + var28);
               int var31 = method_6669(var17 + var28);
               double var32 = (double)(var30 + var31) * field_6571;
               double var34 = (double)var30 - var32;
               double var36 = (double)var31 - var32;
               double var38 = var20 - var34;
               double var40 = var17 - var36;
               double var66;
               var63 = (var66 = var38 - var40) == 0.0D?0:(var66 < 0.0D?-1:1);
               if(var14 == null) {
                  break;
               }

               int var42;
               byte var43;
               label69: {
                  if(var14 != null) {
                     if(var63 > 0) {
                        var42 = 1;
                        var43 = 0;
                        if(var14 != null) {
                           break label69;
                        }
                     }

                     var63 = 0;
                  }

                  var42 = var63;
                  var43 = 1;
               }

               double var64;
               double var10001;
               double var22;
               double var44;
               double var46;
               double var48;
               double var50;
               int var55;
               int var56;
               label62: {
                  var44 = var38 - (double)var42 + field_6571;
                  var46 = var40 - (double)var43 + field_6571;
                  var48 = var38 - 1.0D + 2.0D * field_6571;
                  var50 = var40 - 1.0D + 2.0D * field_6571;
                  int var52 = var30 & 255;
                  int var53 = var31 & 255;
                  int var54 = this.field_6566[var52 + this.field_6566[var53]] % 12;
                  var55 = this.field_6566[var52 + var42 + this.field_6566[var53 + var43]] % 12;
                  var56 = this.field_6566[var52 + 1 + this.field_6566[var53 + 1]] % 12;
                  double var57 = 0.5D - var38 * var38 - var40 * var40;
                  var64 = var57;
                  var10001 = 0.0D;
                  if(var14 != null) {
                     if(var57 < 0.0D) {
                        var22 = 0.0D;
                        if(var14 != null) {
                           break label62;
                        }
                     }

                     var57 *= var57;
                     var64 = var57 * var57;
                     var10001 = method_6670(field_6564[var54], var38, var40);
                  }

                  var22 = var64 * var10001;
               }

               double var24;
               label55: {
                  double var59 = 0.5D - var44 * var44 - var46 * var46;
                  var64 = var59;
                  var10001 = 0.0D;
                  if(var14 != null) {
                     if(var59 < 0.0D) {
                        var24 = 0.0D;
                        if(var14 != null) {
                           break label55;
                        }
                     }

                     var59 *= var59;
                     var64 = var59 * var59;
                     var10001 = method_6670(field_6564[var55], var44, var46);
                  }

                  var24 = var64 * var10001;
               }

               double var26;
               label48: {
                  double var61 = 0.5D - var48 * var48 - var50 * var50;
                  var64 = var61;
                  var10001 = 0.0D;
                  if(var14 != null) {
                     if(var61 < 0.0D) {
                        var26 = 0.0D;
                        if(var14 != null) {
                           break label48;
                        }
                     }

                     var61 *= var61;
                     var64 = var61 * var61;
                     var10001 = method_6670(field_6564[var56], var48, var50);
                  }

                  var26 = var64 * var10001;
               }

               int var65 = var15++;
               var1[var65] += 70.0D * (var22 + var24 + var26) * var12;
               ++var19;
               if(var14 == null) {
                  break label74;
               }
            }
         }

         ++var16;
      } while(var14 != null);

   }

   // $FF: renamed from: <clinit> () void
   static void method_6673() {
      field_6564 = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}};
      field_6565 = Math.sqrt(3.0D);
      field_6570 = 0.5D * (field_6565 - 1.0D);
      field_6571 = (3.0D - field_6565) / 6.0D;
   }
}
