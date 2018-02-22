import java.util.Iterator;
import java.util.List;

// $FF: renamed from: xa
public class class_758 extends class_753 implements class_85, class_86, class_10 {

   // $FF: renamed from: h double
   public double field_3398;
   // $FF: renamed from: i double
   public double field_3399;
   // $FF: renamed from: bm double
   public double field_3400;
   // $FF: renamed from: bn double[][]
   public double[][] field_3401;
   // $FF: renamed from: bo int
   public int field_3402;
   // $FF: renamed from: bp xj[]
   public class_706[] field_3403;
   // $FF: renamed from: bq xj
   public class_706 field_3404;
   // $FF: renamed from: br xj
   public class_706 field_3405;
   // $FF: renamed from: bs xj
   public class_706 field_3406;
   // $FF: renamed from: bt xj
   public class_706 field_3407;
   // $FF: renamed from: bu xj
   public class_706 field_3408;
   // $FF: renamed from: bv xj
   public class_706 field_3409;
   // $FF: renamed from: bw xj
   public class_706 field_3410;
   // $FF: renamed from: bx float
   public float field_3411;
   // $FF: renamed from: by float
   public float field_3412;
   // $FF: renamed from: bz boolean
   public boolean field_3413;
   // $FF: renamed from: bA boolean
   public boolean field_3414;
   // $FF: renamed from: bD sa
   private class_689 field_3415;
   // $FF: renamed from: bB int
   public int field_3416;
   // $FF: renamed from: bC xk
   public class_705 field_3417;
   private static final String __OBFID;
   // $FF: renamed from: fb java.lang.String[]
   private static final String[] field_3418;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3401 = new double[64][3];
      this.field_3402 = -1;
      class_706[] var10001 = new class_706[7];
      class_706 var10005 = new class_706;
      String[] var2 = field_3418;
      var10005.method_4061(this, "head", 6.0F, 6.0F);
      var10001[0] = this.field_3404 = var10005;
      var10005 = new class_706;
      var10005.method_4061(this, "body", 8.0F, 8.0F);
      var10001[1] = this.field_3405 = var10005;
      var10005 = new class_706;
      var10005.method_4061(this, "tail", 4.0F, 4.0F);
      var10001[2] = this.field_3406 = var10005;
      var10005 = new class_706;
      var10005.method_4061(this, "tail", 4.0F, 4.0F);
      var10001[3] = this.field_3407 = var10005;
      var10005 = new class_706;
      var10005.method_4061(this, "tail", 4.0F, 4.0F);
      var10001[4] = this.field_3408 = var10005;
      var10005 = new class_706;
      var10005.method_4061(this, "wing", 4.0F, 4.0F);
      var10001[5] = this.field_3409 = var10005;
      var10005 = new class_706;
      var10005.method_4061(this, "wing", 4.0F, 4.0F);
      var10001[6] = this.field_3410 = var10005;
      this.field_3403 = var10001;
      this.method_4188(this.method_405());
      this.method_3852(16.0F, 8.0F);
      this.field_3026 = true;
      this.field_3035 = true;
      this.field_3399 = 100.0D;
      this.field_3046 = true;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(200.0D);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
   }

   // $FF: renamed from: b (int, float) double[]
   public double[] method_4317(int var1, float var2) {
      String[] var3 = class_752.method_4253();
      float var11;
      int var10000 = (var11 = this.method_406() - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
      if(var3 != null) {
         if(var10000 <= 0) {
            var2 = 0.0F;
         }

         var2 = 1.0F - var2;
         var10000 = this.field_3402 - var1 * 1 & 63;
      }

      int var4 = var10000;
      int var5 = this.field_3402 - var1 * 1 - 1 & 63;
      double[] var6 = new double[3];
      double var7 = this.field_3401[var4][0];
      double var9 = class_1715.method_9580(this.field_3401[var5][0] - var7);
      var6[0] = var7 + var9 * (double)var2;
      var7 = this.field_3401[var4][1];
      var9 = this.field_3401[var5][1] - var7;
      var6[1] = var7 + var9 * (double)var2;
      var6[2] = this.field_3401[var4][2] + (this.field_3401[var5][2] - this.field_3401[var4][2]) * (double)var2;
      return var6;
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var1;
      float var2;
      float var3;
      float var4;
      int var10000;
      float var10001;
      float var31;
      label281: {
         var1 = class_752.method_4253();
         var10000 = this.field_2990.field_1832;
         if(var1 != null) {
            label282: {
               if(this.field_2990.field_1832) {
                  var2 = class_1715.method_9556(this.field_3412 * 3.1415927F * 2.0F);
                  var3 = class_1715.method_9556(this.field_3411 * 3.1415927F * 2.0F);
                  float var46;
                  var10000 = (var46 = var3 - -0.3F) == 0.0F?0:(var46 < 0.0F?-1:1);
                  if(var1 == null) {
                     break label282;
                  }

                  if(var10000 <= 0) {
                     float var47;
                     var10000 = (var47 = var2 - -0.3F) == 0.0F?0:(var47 < 0.0F?-1:1);
                     if(var1 == null) {
                        break label282;
                     }

                     if(var10000 >= 0) {
                        String[] var29 = field_3418;
                        this.field_2990.method_2085(this.field_2994, this.field_2995, this.field_2996, "mob.enderdragon.wings", 5.0F, 0.8F + this.field_3028.nextFloat() * 0.3F, false);
                     }
                  }
               }

               this.field_3411 = this.field_3412;
               var31 = this.method_406();
               var10001 = 0.0F;
               if(var1 == null) {
                  break label281;
               }

               float var48;
               var10000 = (var48 = var31 - 0.0F) == 0.0F?0:(var48 < 0.0F?-1:1);
            }
         }

         if(var10000 <= 0) {
            var2 = (this.field_3028.nextFloat() - 0.5F) * 8.0F;
            var3 = (this.field_3028.nextFloat() - 0.5F) * 4.0F;
            var4 = (this.field_3028.nextFloat() - 0.5F) * 8.0F;
            String[] var32 = field_3418;
            this.field_2990.method_2087("largeexplode", this.field_2994 + (double)var2, this.field_2995 + 2.0D + (double)var3, this.field_2996 + (double)var4, 0.0D, 0.0D, 0.0D);
            if(var1 != null) {
               return;
            }
         }

         this.method_4318();
         var31 = 0.2F;
         var10001 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999) * 10.0F + 1.0F;
      }

      class_758 var34;
      label259: {
         var2 = var31 / var10001;
         var2 *= (float)Math.pow(2.0D, this.field_2998);
         var34 = this;
         if(var1 != null) {
            if(this.field_3414) {
               this.field_3412 += var2 * 0.5F;
               if(var1 != null) {
                  break label259;
               }
            }

            var34 = this;
         }

         var34.field_3412 += var2;
      }

      float var11;
      float var12;
      float var13;
      float var14;
      float var17;
      label252: {
         label283: {
            double var7;
            double var9;
            double var15;
            double var30;
            label284: {
               label285: {
                  label286: {
                     this.field_3000 = class_1715.method_9579(this.field_3000);
                     var10000 = this.field_3402;
                     if(var1 != null) {
                        if(this.field_3402 < 0) {
                           int var5 = 0;

                           while(var5 < this.field_3401.length) {
                              this.field_3401[var5][0] = (double)this.field_3000;
                              this.field_3401[var5][1] = this.field_2995;
                              ++var5;
                              if(var1 == null) {
                                 break label286;
                              }

                              if(var1 == null) {
                                 break;
                              }
                           }
                        }

                        var10000 = ++this.field_3402;
                     }

                     if(var1 == null) {
                        break label285;
                     }

                     if(var10000 == this.field_3401.length) {
                        this.field_3402 = 0;
                     }

                     this.field_3401[this.field_3402][0] = (double)this.field_3000;
                     this.field_3401[this.field_3402][1] = this.field_2995;
                  }

                  var34 = this;
                  if(var1 == null) {
                     break label284;
                  }

                  var10000 = this.field_2990.field_1832;
               }

               if(var10000 != 0) {
                  var34 = this;
                  if(var1 == null) {
                     break label252;
                  }

                  if(this.field_3350 <= 0) {
                     break label283;
                  }

                  var9 = this.field_2994 + (this.field_3351 - this.field_2994) / (double)this.field_3350;
                  var15 = this.field_2995 + (this.field_3352 - this.field_2995) / (double)this.field_3350;
                  var30 = this.field_2996 + (this.field_3353 - this.field_2996) / (double)this.field_3350;
                  var7 = class_1715.method_9580(this.field_3354 - (double)this.field_3000);
                  this.field_3000 = (float)((double)this.field_3000 + var7 / (double)this.field_3350);
                  this.field_3001 = (float)((double)this.field_3001 + (this.field_3355 - (double)this.field_3001) / (double)this.field_3350);
                  --this.field_3350;
                  this.method_3854(var9, var15, var30);
                  this.method_3853(this.field_3000, this.field_3001);
                  if(var1 != null) {
                     break label283;
                  }
               }

               var34 = this;
            }

            double var18;
            double var20;
            label219: {
               var9 = var34.field_3398 - this.field_2994;
               var15 = this.field_3399 - this.field_2995;
               var30 = this.field_3400 - this.field_2996;
               var7 = var9 * var9 + var15 * var15 + var30 * var30;
               var34 = this;
               if(var1 != null) {
                  if(this.field_3415 != null) {
                     this.field_3398 = this.field_3415.field_2994;
                     this.field_3400 = this.field_3415.field_2996;
                     var18 = this.field_3398 - this.field_2994;
                     var20 = this.field_3400 - this.field_2996;
                     double var22 = Math.sqrt(var18 * var18 + var20 * var20);
                     double var24 = 0.4000000059604645D + var22 / 80.0D - 1.0D;
                     if(var1 != null) {
                        if(var24 > 10.0D) {
                           var24 = 10.0D;
                        }

                        this.field_3399 = this.field_3415.field_3004.field_6910 + var24;
                     }

                     if(var1 != null) {
                        break label219;
                     }
                  }

                  this.field_3398 += this.field_3028.nextGaussian() * 2.0D;
                  var34 = this;
               }

               var34.field_3400 += this.field_3028.nextGaussian() * 2.0D;
            }

            label211: {
               var34 = this;
               if(var1 != null) {
                  label209: {
                     if(!this.field_3413) {
                        label289: {
                           double var49;
                           var10000 = (var49 = var7 - 100.0D) == 0.0D?0:(var49 < 0.0D?-1:1);
                           if(var1 != null) {
                              if(var10000 < 0) {
                                 break label289;
                              }

                              double var50;
                              var10000 = (var50 = var7 - 22500.0D) == 0.0D?0:(var50 < 0.0D?-1:1);
                           }

                           if(var1 != null) {
                              if(var10000 > 0) {
                                 break label289;
                              }

                              var34 = this;
                              if(var1 == null) {
                                 break label209;
                              }

                              var10000 = this.field_3006;
                           }

                           if(var10000 == 0) {
                              var34 = this;
                              if(var1 == null) {
                                 break label209;
                              }

                              if(!this.field_3007) {
                                 break label211;
                              }
                           }
                        }
                     }

                     var34 = this;
                  }
               }

               var34.method_4321();
            }

            double var33;
            double var44;
            label291: {
               var15 /= (double)class_1715.method_9558(var9 * var9 + var30 * var30);
               var11 = 0.6F;
               double var51;
               var10000 = (var51 = var15 - (double)(-var11)) == 0.0D?0:(var51 < 0.0D?-1:1);
               if(var1 != null) {
                  if(var10000 < 0) {
                     var15 = (double)(-var11);
                  }

                  var44 = var15;
                  var33 = (double)var11;
                  if(var1 == null) {
                     break label291;
                  }

                  double var52;
                  var10000 = (var52 = var15 - var33) == 0.0D?0:(var52 < 0.0D?-1:1);
               }

               if(var10000 > 0) {
                  var15 = (double)var11;
               }

               this.field_2998 += var15 * 0.10000000149011612D;
               this.field_3000 = class_1715.method_9579(this.field_3000);
               var44 = 180.0D;
               var33 = Math.atan2(var9, var30) * 180.0D / 3.141592653589793D;
            }

            label293: {
               var18 = var44 - var33;
               var20 = class_1715.method_9580(var18 - (double)this.field_3000);
               double var53;
               var10000 = (var53 = var20 - 50.0D) == 0.0D?0:(var53 < 0.0D?-1:1);
               if(var1 != null) {
                  if(var10000 > 0) {
                     var20 = 50.0D;
                  }

                  var44 = var20;
                  var33 = -50.0D;
                  if(var1 == null) {
                     break label293;
                  }

                  double var54;
                  var10000 = (var54 = var20 - -50.0D) == 0.0D?0:(var54 < 0.0D?-1:1);
               }

               if(var10000 < 0) {
                  var20 = -50.0D;
               }

               var44 = this.field_3398 - this.field_2994;
               var33 = this.field_3399 - this.field_2995;
            }

            azw var38 = azw.method_5086(var44, var33, this.field_3400 - this.field_2996).method_5090();
            azw var23 = azw.method_5086((double)class_1715.method_9555(this.field_3000 * 3.1415927F / 180.0F), this.field_2998, (double)(-class_1715.method_9556(this.field_3000 * 3.1415927F / 180.0F))).method_5090();
            var17 = (float)(var23.method_5091(var38) + 0.5D) / 1.5F;
            var31 = var17;
            var10001 = 0.0F;
            if(var1 != null) {
               if(var17 < 0.0F) {
                  var17 = 0.0F;
               }

               this.field_3349 *= 0.8F;
               var31 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999) * 1.0F;
               var10001 = 1.0F;
            }

            float var41 = var31 + var10001;
            double var25 = Math.sqrt(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999) * 1.0D + 1.0D;
            var44 = var25;
            var33 = 40.0D;
            if(var1 != null) {
               if(var25 > 40.0D) {
                  var25 = 40.0D;
               }

               this.field_3349 = (float)((double)this.field_3349 + var20 * (0.699999988079071D / var25 / (double)var41));
               this.field_3000 += this.field_3349 * 0.1F;
               var44 = 2.0D;
               var33 = var25 + 1.0D;
            }

            label171: {
               var12 = (float)(var44 / var33);
               var13 = 0.06F;
               this.method_3882(0.0F, -1.0F, var13 * (var17 * var12 + (1.0F - var12)));
               var34 = this;
               if(var1 != null) {
                  if(this.field_3414) {
                     this.method_3864(this.field_2997 * 0.800000011920929D, this.field_2998 * 0.800000011920929D, this.field_2999 * 0.800000011920929D);
                     if(var1 != null) {
                        break label171;
                     }
                  }

                  var34 = this;
               }

               var34.method_3864(this.field_2997, this.field_2998, this.field_2999);
            }

            azw var27 = azw.method_5086(this.field_2997, this.field_2998, this.field_2999).method_5090();
            var14 = (float)(var27.method_5091(var23) + 1.0D) / 2.0F;
            var14 = 0.8F + 0.15F * var14;
            this.field_2997 *= (double)var14;
            this.field_2999 *= (double)var14;
            this.field_2998 *= 0.9100000262260437D;
         }

         this.field_3330 = this.field_3000;
         this.field_3404.field_3014 = this.field_3404.field_3015 = 3.0F;
         this.field_3406.field_3014 = this.field_3406.field_3015 = 2.0F;
         this.field_3407.field_3014 = this.field_3407.field_3015 = 2.0F;
         this.field_3408.field_3014 = this.field_3408.field_3015 = 2.0F;
         this.field_3405.field_3015 = 3.0F;
         this.field_3405.field_3014 = 5.0F;
         this.field_3409.field_3015 = 2.0F;
         this.field_3409.field_3014 = 4.0F;
         this.field_3410.field_3015 = 3.0F;
         this.field_3410.field_3014 = 4.0F;
         var34 = this;
      }

      var3 = (float)(var34.method_4317(5, 1.0F)[1] - this.method_4317(10, 1.0F)[1]) * 10.0F / 180.0F * 3.1415927F;
      var4 = class_1715.method_9556(var3);
      float var35 = -class_1715.method_9555(var3);
      float var19 = this.field_3000 * 3.1415927F / 180.0F;
      float var36 = class_1715.method_9555(var19);
      float var21 = class_1715.method_9556(var19);
      this.field_3405.method_3856();
      this.field_3405.method_3887(this.field_2994 + (double)(var36 * 0.5F), this.field_2995, this.field_2996 - (double)(var21 * 0.5F), 0.0F, 0.0F);
      this.field_3409.method_3856();
      this.field_3409.method_3887(this.field_2994 + (double)(var21 * 4.5F), this.field_2995 + 2.0D, this.field_2996 + (double)(var36 * 4.5F), 0.0F, 0.0F);
      this.field_3410.method_3856();
      this.field_3410.method_3887(this.field_2994 - (double)(var21 * 4.5F), this.field_2995 + 2.0D, this.field_2996 - (double)(var36 * 4.5F), 0.0F, 0.0F);
      var34 = this;
      if(var1 != null) {
         label163: {
            if(!this.field_2990.field_1832) {
               var34 = this;
               if(var1 == null) {
                  break label163;
               }

               if(this.field_3315 == 0) {
                  this.method_4319(this.field_2990.method_2155(this, this.field_3409.field_3004.method_7097(4.0D, 2.0D, 4.0D).method_7104(0.0D, -2.0D, 0.0D)));
                  this.method_4319(this.field_2990.method_2155(this, this.field_3410.field_3004.method_7097(4.0D, 2.0D, 4.0D).method_7104(0.0D, -2.0D, 0.0D)));
                  this.method_4320(this.field_2990.method_2155(this, this.field_3404.field_3004.method_7097(1.0D, 1.0D, 1.0D)));
               }
            }

            var34 = this;
         }
      }

      double[] var39 = var34.method_4317(5, 1.0F);
      double[] var40 = this.method_4317(0, 1.0F);
      var11 = class_1715.method_9555(this.field_3000 * 3.1415927F / 180.0F - this.field_3349 * 0.01F);
      var17 = class_1715.method_9556(this.field_3000 * 3.1415927F / 180.0F - this.field_3349 * 0.01F);
      this.field_3404.method_3856();
      this.field_3404.method_3887(this.field_2994 + (double)(var11 * 5.5F * var4), this.field_2995 + (var40[1] - var39[1]) * 1.0D + (double)(var35 * 5.5F), this.field_2996 - (double)(var17 * 5.5F * var4), 0.0F, 0.0F);
      int var42 = 0;

      label295: {
         while(true) {
            if(var42 < 3) {
               class_706 var43 = null;
               var10000 = var42;
               if(var1 == null) {
                  break;
               }

               if(var42 == 0) {
                  var43 = this.field_3406;
               }

               var10000 = var42;
               byte var37 = 1;
               if(var1 != null) {
                  if(var42 == 1) {
                     var43 = this.field_3407;
                  }

                  var10000 = var42;
                  var37 = 2;
               }

               if(var10000 == var37) {
                  var43 = this.field_3408;
               }

               double[] var26 = this.method_4317(12 + var42 * 2, 1.0F);
               var12 = this.field_3000 * 3.1415927F / 180.0F + this.method_4322(var26[0] - var39[0]) * 3.1415927F / 180.0F * 1.0F;
               var13 = class_1715.method_9555(var12);
               float var45 = class_1715.method_9556(var12);
               var14 = 1.5F;
               float var28 = (float)(var42 + 1) * 2.0F;
               var43.method_3856();
               var43.method_3887(this.field_2994 - (double)((var36 * var14 + var13 * var28) * var4), this.field_2995 + (var26[1] - var39[1]) * 1.0D - (double)((var28 + var14) * var35) + 1.5D, this.field_2996 + (double)((var21 * var14 + var45 * var28) * var4), 0.0F, 0.0F);
               ++var42;
               if(var1 != null) {
                  continue;
               }
            }

            var34 = this;
            if(var1 == null) {
               break label295;
            }

            var10000 = this.field_2990.field_1832;
            break;
         }

         if(var10000 != 0) {
            return;
         }

         var34 = this;
      }

      var34.field_3414 = this.method_4323(this.field_3404.field_3004) | this.method_4323(this.field_3405.field_3004);
   }

   // $FF: renamed from: bP () void
   private void method_4318() {
      String[] var1;
      int var11;
      label68: {
         var1 = class_752.method_4253();
         class_758 var10000 = this;
         if(var1 != null) {
            if(this.field_3417 != null) {
               label71: {
                  var11 = this.field_3417.field_3012;
                  if(var1 != null) {
                     if(this.field_3417.field_3012) {
                        var10000 = this;
                        if(var1 != null) {
                           if(!this.field_2990.field_1832) {
                              this.method_409(this.field_3404, class_1691.method_9334((class_1036)null), 10.0F);
                           }

                           var10000 = this;
                        }

                        var10000.field_3417 = null;
                        if(var1 != null) {
                           break label71;
                        }
                     }

                     var11 = this.field_3029 % 10;
                  }

                  if(var1 == null) {
                     break label68;
                  }

                  if(var11 == 0) {
                     float var13;
                     var11 = (var13 = this.method_406() - this.method_405()) == 0.0F?0:(var13 < 0.0F?-1:1);
                     if(var1 == null) {
                        break label68;
                     }

                     if(var11 < 0) {
                        this.method_4188(this.method_406() + 1.0F);
                     }
                  }
               }
            }

            var10000 = this;
         }

         var11 = var10000.field_3028.nextInt(10);
      }

      if(var11 == 0) {
         float var2 = 32.0F;
         List var3 = this.field_2990.method_2157(class_705.class, this.field_3004.method_7097((double)var2, (double)var2, (double)var2));
         class_705 var4 = null;
         double var5 = Double.MAX_VALUE;
         Iterator var7 = var3.iterator();

         while(true) {
            if(var7.hasNext()) {
               class_705 var8 = (class_705)var7.next();
               double var9 = var8.method_3891(this);
               if(var1 == null) {
                  break;
               }

               label43: {
                  double var12 = var9;
                  if(var1 != null) {
                     if(var9 >= var5) {
                        break label43;
                     }

                     var12 = var9;
                  }

                  var5 = var12;
                  var4 = var8;
               }

               if(var1 != null) {
                  continue;
               }
            }

            this.field_3417 = var4;
            break;
         }
      }

   }

   // $FF: renamed from: a (java.util.List) void
   private void method_4319(List var1) {
      double var3 = (this.field_3405.field_3004.field_6909 + this.field_3405.field_3004.field_6912) / 2.0D;
      String[] var10000 = class_752.method_4253();
      double var5 = (this.field_3405.field_3004.field_6911 + this.field_3405.field_3004.field_6914) / 2.0D;
      String[] var2 = var10000;
      Iterator var7 = var1.iterator();

      while(var7.hasNext()) {
         label19: {
            class_689 var8 = (class_689)var7.next();
            class_689 var15 = var8;
            if(var2 != null) {
               if(!(var8 instanceof class_752)) {
                  break label19;
               }

               var15 = var8;
            }

            double var9 = var15.field_2994 - var3;
            double var11 = var8.field_2996 - var5;
            double var13 = var9 * var9 + var11 * var11;
            var8.method_3894(var9 / var13 * 4.0D, 0.20000000298023224D, var11 / var13 * 4.0D);
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.util.List) void
   private void method_4320(List var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < var1.size()) {
         class_689 var4 = (class_689)var1.get(var3);
         if(var2 != null) {
            if(var4 instanceof class_752) {
               var4.method_3896(class_1691.method_9324(this), 10.0F);
            }

            ++var3;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: bQ () void
   private void method_4321() {
      this.field_3413 = false;
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3028.nextInt(2);
      if(var1 != null) {
         label37: {
            boolean var9;
            if(var10000 == 0) {
               var9 = this.field_2990.field_1807.isEmpty();
               if(var1 == null) {
                  break label37;
               }

               if(!var9) {
                  this.field_3415 = (class_689)this.field_2990.field_1807.get(this.field_3028.nextInt(this.field_2990.field_1807.size()));
                  if(var1 != null) {
                     return;
                  }
               }
            }

            var9 = false;
         }
      }

      while(true) {
         this.field_3398 = 0.0D;
         this.field_3399 = (double)(70.0F + this.field_3028.nextFloat() * 50.0F);
         this.field_3400 = 0.0D;
         this.field_3398 += (double)(this.field_3028.nextFloat() * 120.0F - 60.0F);
         this.field_3400 += (double)(this.field_3028.nextFloat() * 120.0F - 60.0F);
         double var3 = this.field_2994 - this.field_3398;
         double var5 = this.field_2995 - this.field_3399;
         double var7 = this.field_2996 - this.field_3400;
         boolean var2 = var3 * var3 + var5 * var5 + var7 * var7 > 100.0D;

         while(var2) {
            if(var1 != null) {
               this.field_3415 = null;
               return;
            }
         }
      }
   }

   // $FF: renamed from: b (double) float
   private float method_4322(double var1) {
      return (float)class_1715.method_9580(var1);
   }

   // $FF: renamed from: a (kg) boolean
   private boolean method_4323(class_1343 var1) {
      int var3 = class_1715.method_9561(var1.field_6909);
      String[] var10000 = class_752.method_4253();
      int var4 = class_1715.method_9561(var1.field_6910);
      String[] var2 = var10000;
      int var5 = class_1715.method_9561(var1.field_6911);
      int var6 = class_1715.method_9561(var1.field_6912);
      int var7 = class_1715.method_9561(var1.field_6913);
      int var8 = class_1715.method_9561(var1.field_6914);
      byte var9 = 0;
      byte var10 = 0;
      int var11 = var3;

      int var20;
      label109:
      while(true) {
         var20 = var11;

         label106:
         while(var20 <= var6) {
            var20 = var4;
            if(var2 == null) {
               break label109;
            }

            int var12 = var4;

            while(var12 <= var7) {
               var20 = var5;
               if(var2 == null) {
                  continue label106;
               }

               int var13 = var5;

               while(true) {
                  if(var13 <= var8) {
                     aji var14 = this.field_2990.getBlock(var11, var12, var13);
                     if(var2 == null) {
                        break;
                     }

                     if(var2 != null) {
                        if(var14.method_2424() != awt.field_4170) {
                           label92: {
                              byte var24;
                              label91: {
                                 label117: {
                                    aji var21 = var14;
                                    aji var10001 = class_1192.field_6076;
                                    if(var2 != null) {
                                       if(var14 == class_1192.field_6076) {
                                          break label117;
                                       }

                                       var21 = var14;
                                       var10001 = class_1192.field_6145;
                                    }

                                    if(var2 != null) {
                                       if(var21 == var10001) {
                                          break label117;
                                       }

                                       var21 = var14;
                                       var10001 = class_1192.field_6032;
                                    }

                                    if(var21 != var10001) {
                                       class_1038 var23 = this.field_2990.method_2196();
                                       String[] var17 = field_3418;
                                       var24 = var23.method_5878("mobGriefing");
                                       if(var2 == null) {
                                          break label91;
                                       }

                                       if(var24 != 0) {
                                          var24 = this.field_2990.method_2056(var11, var12, var13);
                                          if(var2 != null) {
                                             label71: {
                                                if(var24 == 0) {
                                                   var24 = var10;
                                                   if(var2 == null) {
                                                      break label71;
                                                   }

                                                   if(var10 == 0) {
                                                      var24 = 0;
                                                      break label71;
                                                   }
                                                }

                                                var24 = 1;
                                             }
                                          }

                                          var10 = var24;
                                          if(var2 != null) {
                                             break label92;
                                          }
                                       }
                                    }
                                 }

                                 var24 = 1;
                              }

                              var9 = var24;
                           }
                        }

                        ++var13;
                     }

                     if(var2 != null) {
                        continue;
                     }
                  }

                  ++var12;
                  break;
               }

               if(var2 == null) {
                  break;
               }
            }

            ++var11;
            if(var2 != null) {
               continue label109;
            }
            break;
         }

         var20 = var10;
         break;
      }

      if(var2 != null) {
         if(var20 != 0) {
            double var18 = var1.field_6909 + (var1.field_6912 - var1.field_6909) * (double)this.field_3028.nextFloat();
            double var19 = var1.field_6910 + (var1.field_6913 - var1.field_6910) * (double)this.field_3028.nextFloat();
            double var15 = var1.field_6911 + (var1.field_6914 - var1.field_6911) * (double)this.field_3028.nextFloat();
            String[] var22 = field_3418;
            this.field_2990.method_2087("largeexplode", var18, var19, var15, 0.0D, 0.0D, 0.0D);
         }

         var20 = var9;
      }

      return (boolean)var20;
   }

   // $FF: renamed from: a (xj, vX, float) boolean
   public boolean method_409(class_706 var1, class_1691 var2, float var3) {
      String[] var4 = class_752.method_4253();
      if(var1 != this.field_3404) {
         var3 = var3 / 4.0F + 1.0F;
      }

      float var5 = this.field_3000 * 3.1415927F / 180.0F;
      float var6 = class_1715.method_9555(var5);
      float var7 = class_1715.method_9556(var5);
      this.field_3398 = this.field_2994 + (double)(var6 * 5.0F) + (double)((this.field_3028.nextFloat() - 0.5F) * 2.0F);
      this.field_3399 = this.field_2995 + (double)(this.field_3028.nextFloat() * 3.0F) + 1.0D;
      this.field_3400 = this.field_2996 - (double)(var7 * 5.0F) + (double)((this.field_3028.nextFloat() - 0.5F) * 2.0F);
      this.field_3415 = null;
      boolean var10000 = var2.method_9345() instanceof class_792;
      if(var4 != null) {
         label21: {
            if(!var10000) {
               var10000 = var2.method_9337();
               if(var4 == null) {
                  return var10000;
               }

               if(!var10000) {
                  break label21;
               }
            }

            this.method_4324(var2, var3);
         }
      }

      var10000 = true;
      return var10000;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      return false;
   }

   // $FF: renamed from: e (vX, float) boolean
   protected boolean method_4324(class_1691 var1, float var2) {
      return super.method_3896(var1, var2);
   }

   // $FF: renamed from: aF () void
   protected void method_4160() {
      String[] var10000 = class_752.method_4253();
      ++this.field_3416;
      String[] var1 = var10000;
      int var7 = this.field_3416;
      if(var1 != null) {
         label96: {
            if(this.field_3416 >= 180) {
               var7 = this.field_3416;
               if(var1 == null) {
                  break label96;
               }

               if(this.field_3416 <= 200) {
                  float var2 = (this.field_3028.nextFloat() - 0.5F) * 8.0F;
                  float var3 = (this.field_3028.nextFloat() - 0.5F) * 4.0F;
                  float var4 = (this.field_3028.nextFloat() - 0.5F) * 8.0F;
                  String[] var10001 = field_3418;
                  this.field_2990.method_2087("hugeexplosion", this.field_2994 + (double)var2, this.field_2995 + 2.0D + (double)var3, this.field_2996 + (double)var4, 0.0D, 0.0D, 0.0D);
               }
            }

            var7 = this.field_2990.field_1832;
         }
      }

      int var5;
      int var6;
      class_715 var9;
      ahb var10;
      label101: {
         short var8;
         label102: {
            if(var1 != null) {
               label85: {
                  if(var7 == 0) {
                     var7 = this.field_3416;
                     var8 = 150;
                     if(var1 != null) {
                        label80: {
                           if(this.field_3416 > 150) {
                              var7 = this.field_3416 % 5;
                              if(var1 == null) {
                                 break label80;
                              }

                              if(var7 == 0) {
                                 var5 = 1000;

                                 while(var5 > 0) {
                                    var6 = class_715.method_4090(var5);
                                    var5 -= var6;
                                    var10 = this.field_2990;
                                    var9 = new class_715;
                                    var9.method_4087(this.field_2990, this.field_2994, this.field_2995, this.field_2996, var6);
                                    var10.method_2089(var9);
                                    if(var1 == null) {
                                       break label85;
                                    }

                                    if(var1 == null) {
                                       break;
                                    }
                                 }
                              }
                           }

                           var7 = this.field_3416;
                        }

                        var8 = 1;
                     }

                     if(var1 == null) {
                        break label102;
                     }

                     if(var7 == var8) {
                        this.field_2990.method_2209(1018, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
                     }
                  }

                  this.method_3864(0.0D, 0.10000000149011612D, 0.0D);
                  this.field_3330 = this.field_3000 += 20.0F;
               }

               var7 = this.field_3416;
            }

            if(var1 == null) {
               break label101;
            }

            var8 = 200;
         }

         if(var7 != var8) {
            return;
         }

         var7 = this.field_2990.field_1832;
      }

      if(var1 != null) {
         if(var7 != 0) {
            return;
         }

         var7 = 2000;
      }

      var5 = var7;

      while(true) {
         if(var5 > 0) {
            var6 = class_715.method_4090(var5);
            var5 -= var6;
            var10 = this.field_2990;
            var9 = new class_715;
            var9.method_4087(this.field_2990, this.field_2994, this.field_2995, this.field_2996, var6);
            var10.method_2089(var9);
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.method_4325(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2996));
         break;
      }

      this.method_3851();
   }

   // $FF: renamed from: b (int, int) void
   private void method_4325(int var1, int var2) {
      byte var4 = 64;
      String[] var3 = class_752.method_4253();
      class_482.field_2258 = true;
      byte var5 = 4;
      int var6 = var4 - 1;

      int var10000;
      label95:
      while(true) {
         var10000 = var6;

         label92:
         while(var10000 <= var4 + 32) {
            var10000 = var1 - var5;
            if(var3 == null) {
               break label95;
            }

            int var7 = var10000;

            label89:
            do {
               var10000 = var7;

               label86:
               while(true) {
                  if(var10000 > var1 + var5) {
                     break label89;
                  }

                  var10000 = var2 - var5;
                  if(var3 == null) {
                     continue label92;
                  }

                  int var8 = var10000;

                  while(true) {
                     if(var8 > var2 + var5) {
                        break label86;
                     }

                     double var9 = (double)(var7 - var1);
                     double var11 = (double)(var8 - var2);
                     double var13 = var9 * var9 + var11 * var11;
                     if(var3 != null) {
                        double var15;
                        var10000 = (var15 = var13 - ((double)var5 - 0.5D) * ((double)var5 - 0.5D)) == 0.0D?0:(var15 < 0.0D?-1:1);
                        if(var3 == null) {
                           break;
                        }

                        if(var10000 <= 0) {
                           label105: {
                              label106: {
                                 var10000 = var6;
                                 byte var10001 = var4;
                                 if(var3 != null) {
                                    if(var6 < var4) {
                                       double var16;
                                       var10000 = (var16 = var13 - ((double)(var5 - 1) - 0.5D) * ((double)(var5 - 1) - 0.5D)) == 0.0D?0:(var16 < 0.0D?-1:1);
                                       if(var3 != null) {
                                          if(var10000 > 0) {
                                             break label105;
                                          }

                                          this.field_2990.method_2058(var7, var6, var8, class_1192.field_6032);
                                       }

                                       if(var3 != null) {
                                          break label105;
                                       }
                                    }

                                    var10000 = var6;
                                    if(var3 == null) {
                                       break label106;
                                    }

                                    var10001 = var4;
                                 }

                                 if(var10000 > var10001) {
                                    this.field_2990.method_2058(var7, var6, var8, class_1192.field_6025);
                                    if(var3 != null) {
                                       break label105;
                                    }
                                 }

                                 double var17;
                                 var10000 = (var17 = var13 - ((double)(var5 - 1) - 0.5D) * ((double)(var5 - 1) - 0.5D)) == 0.0D?0:(var17 < 0.0D?-1:1);
                              }

                              if(var3 != null) {
                                 label59: {
                                    if(var10000 > 0) {
                                       this.field_2990.method_2058(var7, var6, var8, class_1192.field_6032);
                                       if(var3 != null) {
                                          break label59;
                                       }
                                    }

                                    this.field_2990.method_2058(var7, var6, var8, class_1192.field_6143);
                                 }
                              }
                           }
                        }

                        ++var8;
                     }

                     if(var3 == null) {
                        break label86;
                     }
                  }
               }

               ++var7;
            } while(var3 != null);

            ++var6;
            if(var3 != null) {
               continue label95;
            }
            break;
         }

         this.field_2990.method_2058(var1, var4 + 0, var2, class_1192.field_6032);
         this.field_2990.method_2058(var1, var4 + 1, var2, class_1192.field_6032);
         this.field_2990.method_2058(var1, var4 + 2, var2, class_1192.field_6032);
         this.field_2990.method_2058(var1 - 1, var4 + 2, var2, class_1192.field_6077);
         this.field_2990.method_2058(var1 + 1, var4 + 2, var2, class_1192.field_6077);
         this.field_2990.method_2058(var1, var4 + 2, var2 - 1, class_1192.field_6077);
         this.field_2990.method_2058(var1, var4 + 2, var2 + 1, class_1192.field_6077);
         this.field_2990.method_2058(var1, var4 + 3, var2, class_1192.field_6032);
         this.field_2990.method_2058(var1, var4 + 4, var2, class_1192.field_6146);
         var10000 = 0;
         break;
      }

      class_482.field_2258 = (boolean)var10000;
   }

   // $FF: renamed from: w () void
   public void method_4270() {}

   // $FF: renamed from: at () sa[]
   public class_689[] method_3955() {
      return this.field_3403;
   }

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      return false;
   }

   // $FF: renamed from: a () ahb
   public ahb method_408() {
      return this.field_2990;
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3418;
      return "mob.enderdragon.growl";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3418;
      return "mob.enderdragon.hit";
   }

   // $FF: renamed from: bf () float
   protected float method_4216() {
      return 5.0F;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
