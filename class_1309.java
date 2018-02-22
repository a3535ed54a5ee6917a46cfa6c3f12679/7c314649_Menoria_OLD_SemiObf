import java.util.Random;

// $FF: renamed from: jb
public class class_1309 extends class_1306 {

   // $FF: renamed from: a int[]
   private int[] field_6716;
   // $FF: renamed from: b double
   public double field_6717;
   // $FF: renamed from: c double
   public double field_6718;
   // $FF: renamed from: d double
   public double field_6719;
   // $FF: renamed from: f double[]
   private static final double[] field_6720;
   // $FF: renamed from: g double[]
   private static final double[] field_6721;
   // $FF: renamed from: h double[]
   private static final double[] field_6722;
   // $FF: renamed from: i double[]
   private static final double[] field_6723;
   // $FF: renamed from: j double[]
   private static final double[] field_6724;


   // $FF: renamed from: <init> () void
   public void method_6898() {
      this.method_6906(new Random());
   }

   // $FF: renamed from: <init> (java.util.Random) void
   public void method_6906(Random var1) {
      String[] var10000 = class_752.method_4253();
      super.method_6898();
      String[] var2 = var10000;
      this.field_6716 = new int[512];
      this.field_6717 = var1.nextDouble() * 256.0D;
      this.field_6718 = var1.nextDouble() * 256.0D;
      this.field_6719 = var1.nextDouble() * 256.0D;
      int var3 = 0;

      while(true) {
         if(var3 < 256) {
            this.field_6716[var3] = var3++;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         var3 = 0;
         break;
      }

      while(var3 < 256) {
         int var4 = var1.nextInt(256 - var3) + var3;
         int var5 = this.field_6716[var3];
         this.field_6716[var3] = this.field_6716[var4];
         this.field_6716[var4] = var5;
         this.field_6716[var3 + 256] = this.field_6716[var3];
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (double, double, double) double
   public final double method_6907(double var1, double var3, double var5) {
      return var3 + var1 * (var5 - var3);
   }

   // $FF: renamed from: b (int, double, double) double
   public final double method_6908(int var1, double var2, double var4) {
      int var6 = var1 & 15;
      return field_6723[var6] * var2 + field_6724[var6] * var4;
   }

   // $FF: renamed from: b (int, double, double, double) double
   public final double method_6909(int var1, double var2, double var4, double var6) {
      int var8 = var1 & 15;
      return field_6720[var8] * var2 + field_6721[var8] * var4 + field_6722[var8] * var6;
   }

   // $FF: renamed from: b (double[], double, double, double, int, int, int, double, double, double, double) void
   public void method_6910(double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15, double var17) {
      String[] var19 = class_752.method_4253();
      int var10000 = var9;
      int var10001;
      int var20;
      int var23;
      int var28;
      double var32;
      double var36;
      int var38;
      double var39;
      int var41;
      int var42;
      double var43;
      if(var19 != null) {
         if(var9 == 1) {
            boolean var65 = false;
            boolean var66 = false;
            boolean var22 = false;
            boolean var69 = false;
            double var71 = 0.0D;
            double var72 = 0.0D;
            var28 = 0;
            double var75 = 1.0D / var17;
            int var31 = 0;

            do {
               var10000 = var31;

               label88:
               while(true) {
                  if(var10000 >= var8) {
                     return;
                  }

                  var32 = var2 + (double)var31 * var11 + this.field_6717;
                  int var76 = (int)var32;
                  double var78;
                  var10000 = (var78 = var32 - (double)var76) == 0.0D?0:(var78 < 0.0D?-1:1);
                  if(var19 != null) {
                     if(var10000 < 0) {
                        --var76;
                     }

                     var10000 = var76 & 255;
                  }

                  int var35 = var10000;
                  var32 -= (double)var76;
                  var36 = var32 * var32 * var32 * (var32 * (var32 * 6.0D - 15.0D) + 10.0D);
                  var38 = 0;

                  while(true) {
                     if(var38 >= var10) {
                        break label88;
                     }

                     var39 = var6 + (double)var38 * var15 + this.field_6719;
                     var41 = (int)var39;
                     double var79;
                     var10000 = (var79 = var39 - (double)var41) == 0.0D?0:(var79 < 0.0D?-1:1);
                     if(var19 == null) {
                        break;
                     }

                     if(var19 != null) {
                        if(var10000 < 0) {
                           --var41;
                        }

                        var10000 = var41 & 255;
                     }

                     var42 = var10000;
                     var39 -= (double)var41;
                     var43 = var39 * var39 * var39 * (var39 * (var39 * 6.0D - 15.0D) + 10.0D);
                     var20 = this.field_6716[var35] + 0;
                     int var67 = this.field_6716[var20] + var42;
                     int var68 = this.field_6716[var35 + 1] + 0;
                     var23 = this.field_6716[var68] + var42;
                     var71 = this.method_6907(var36, this.method_6908(this.field_6716[var67], var32, var39), this.method_6909(this.field_6716[var23], var32 - 1.0D, 0.0D, var39));
                     var72 = this.method_6907(var36, this.method_6909(this.field_6716[var67 + 1], var32, 0.0D, var39 - 1.0D), this.method_6909(this.field_6716[var23 + 1], var32 - 1.0D, 0.0D, var39 - 1.0D));
                     double var77 = this.method_6907(var43, var71, var72);
                     var10001 = var28++;
                     var1[var10001] += var77 * var75;
                     ++var38;
                     if(var19 == null) {
                        break label88;
                     }
                  }
               }

               ++var31;
            } while(var19 != null);

            return;
         }

         var10000 = 0;
      }

      var20 = var10000;
      double var21 = 1.0D / var17;
      var23 = -1;
      boolean var24 = false;
      int var25 = 0;
      int var26 = 0;
      boolean var27 = false;
      var28 = 0;
      boolean var29 = false;
      double var30 = 0.0D;
      var32 = 0.0D;
      double var34 = 0.0D;
      var36 = 0.0D;
      var38 = 0;

      do {
         var10000 = var38;

         label134:
         while(true) {
            if(var10000 >= var8) {
               return;
            }

            var39 = var2 + (double)var38 * var11 + this.field_6717;
            var41 = (int)var39;
            double var80;
            var10000 = (var80 = var39 - (double)var41) == 0.0D?0:(var80 < 0.0D?-1:1);
            if(var19 != null) {
               if(var10000 < 0) {
                  --var41;
               }

               var10000 = var41 & 255;
            }

            var42 = var10000;
            var39 -= (double)var41;
            var43 = var39 * var39 * var39 * (var39 * (var39 * 6.0D - 15.0D) + 10.0D);
            int var45 = 0;

            while(true) {
               var10000 = var45;

               label130:
               while(true) {
                  if(var10000 >= var10) {
                     break label134;
                  }

                  double var46 = var6 + (double)var45 * var15 + this.field_6719;
                  int var48 = (int)var46;
                  double var81;
                  var10000 = (var81 = var46 - (double)var48) == 0.0D?0:(var81 < 0.0D?-1:1);
                  if(var19 == null) {
                     continue label134;
                  }

                  if(var19 != null) {
                     if(var10000 < 0) {
                        --var48;
                     }

                     var10000 = var48 & 255;
                  }

                  int var49 = var10000;
                  var46 -= (double)var48;
                  double var50 = var46 * var46 * var46 * (var46 * (var46 * 6.0D - 15.0D) + 10.0D);
                  int var52 = 0;

                  while(var52 < var9) {
                     double var53 = var4 + (double)var52 * var13 + this.field_6718;
                     int var55 = (int)var53;
                     double var82;
                     var10000 = (var82 = var53 - (double)var55) == 0.0D?0:(var82 < 0.0D?-1:1);
                     if(var19 == null) {
                        continue label130;
                     }

                     if(var19 != null) {
                        if(var10000 < 0) {
                           --var55;
                        }

                        var10000 = var55 & 255;
                     }

                     double var57;
                     label117: {
                        int var56 = var10000;
                        var53 -= (double)var55;
                        var57 = var53 * var53 * var53 * (var53 * (var53 * 6.0D - 15.0D) + 10.0D);
                        var10000 = var52;
                        if(var19 != null) {
                           label114: {
                              if(var52 != 0) {
                                 var10000 = var56;
                                 var10001 = var23;
                                 if(var19 == null) {
                                    break label114;
                                 }

                                 if(var56 == var23) {
                                    break label117;
                                 }
                              }

                              var23 = var56;
                              int var70 = this.field_6716[var42] + var56;
                              var25 = this.field_6716[var70] + var49;
                              var26 = this.field_6716[var70 + 1] + var49;
                              int var73 = this.field_6716[var42 + 1] + var56;
                              var28 = this.field_6716[var73] + var49;
                              var10000 = this.field_6716[var73 + 1];
                              var10001 = var49;
                           }

                           var10000 += var10001;
                        }

                        int var74 = var10000;
                        var30 = this.method_6907(var43, this.method_6909(this.field_6716[var25], var39, var53, var46), this.method_6909(this.field_6716[var28], var39 - 1.0D, var53, var46));
                        var32 = this.method_6907(var43, this.method_6909(this.field_6716[var26], var39, var53 - 1.0D, var46), this.method_6909(this.field_6716[var74], var39 - 1.0D, var53 - 1.0D, var46));
                        var34 = this.method_6907(var43, this.method_6909(this.field_6716[var25 + 1], var39, var53, var46 - 1.0D), this.method_6909(this.field_6716[var28 + 1], var39 - 1.0D, var53, var46 - 1.0D));
                        var36 = this.method_6907(var43, this.method_6909(this.field_6716[var26 + 1], var39, var53 - 1.0D, var46 - 1.0D), this.method_6909(this.field_6716[var74 + 1], var39 - 1.0D, var53 - 1.0D, var46 - 1.0D));
                     }

                     double var59 = this.method_6907(var57, var30, var32);
                     double var61 = this.method_6907(var57, var34, var36);
                     double var63 = this.method_6907(var50, var59, var61);
                     var10001 = var20++;
                     var1[var10001] += var63 * var21;
                     ++var52;
                     if(var19 == null) {
                        break;
                     }
                  }

                  ++var45;
                  if(var19 == null) {
                     break label134;
                  }
                  break;
               }
            }
         }

         ++var38;
      } while(var19 != null);

   }

   // $FF: renamed from: <clinit> () void
   static void method_6911() {
      field_6720 = new double[]{1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D};
      field_6721 = new double[]{1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D};
      field_6722 = new double[]{0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D};
      field_6723 = new double[]{1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D};
      field_6724 = new double[]{0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D};
   }
}
