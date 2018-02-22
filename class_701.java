import java.util.List;

// $FF: renamed from: xo
public class class_701 extends class_689 {

   // $FF: renamed from: at boolean
   private boolean field_3110;
   // $FF: renamed from: au double
   private double field_3111;
   // $FF: renamed from: av int
   private int field_3112;
   // $FF: renamed from: aw double
   private double field_3113;
   // $FF: renamed from: ax double
   private double field_3114;
   // $FF: renamed from: ay double
   private double field_3115;
   // $FF: renamed from: az double
   private double field_3116;
   // $FF: renamed from: aA double
   private double field_3117;
   // $FF: renamed from: aB double
   private double field_3118;
   // $FF: renamed from: aC double
   private double field_3119;
   // $FF: renamed from: aD double
   private double field_3120;
   // $FF: renamed from: aE java.lang.String
   private static final String field_3121;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3122;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3110 = true;
      this.field_3111 = 0.07D;
      this.field_2986 = true;
      this.method_3852(1.5F, 0.6F);
      this.field_3013 = this.field_3015 / 2.0F;
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      this.field_3036.method_9497(17, new Integer(0));
      this.field_3036.method_9497(18, new Integer(1));
      this.field_3036.method_9497(19, new Float(0.0F));
   }

   // $FF: renamed from: h (sa) kg
   public class_1343 method_3920(class_689 var1) {
      return var1.field_3004;
   }

   // $FF: renamed from: J () kg
   public class_1343 method_3871() {
      return this.field_3004;
   }

   // $FF: renamed from: S () boolean
   public boolean method_3898() {
      return true;
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4043(ahb var1, double var2, double var4, double var6) {
      this.method_3847(var1);
      this.method_3854(var2, var4 + (double)this.field_3013, var6);
      this.field_2997 = 0.0D;
      this.field_2998 = 0.0D;
      this.field_2999 = 0.0D;
      this.field_2991 = var2;
      this.field_2992 = var4;
      this.field_2993 = var6;
   }

   // $FF: renamed from: ae () double
   public double method_3924() {
      return (double)this.field_3015 * 0.0D - 0.30000001192092896D;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000) {
            return false;
         }

         var10000 = this.field_2990.field_1832;
      }

      if(var3 != null) {
         if(!var10000) {
            var10000 = this.field_3012;
            if(var3 == null) {
               return var10000;
            }

            if(!this.field_3012) {
               byte var5;
               label69: {
                  label82: {
                     this.method_4048(-this.method_4049());
                     this.method_4046(10);
                     this.method_4044(this.method_4045() + var2 * 10.0F);
                     this.method_3895();
                     var5 = var1.method_9345() instanceof class_792;
                     if(var3 != null) {
                        if(var5 == 0) {
                           break label82;
                        }

                        var5 = ((class_792)var1.method_9345()).field_3640.field_2839;
                     }

                     if(var3 == null) {
                        break label69;
                     }

                     if(var5 != 0) {
                        var5 = 1;
                        break label69;
                     }
                  }

                  var5 = 0;
               }

               int var6;
               label83: {
                  byte var4;
                  label84: {
                     var4 = var5;
                     var6 = var4;
                     if(var3 != null) {
                        if(var4 != 0) {
                           break label84;
                        }

                        float var8;
                        var6 = (var8 = this.method_4045() - 40.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
                     }

                     if(var3 == null) {
                        return (boolean)var6;
                     }

                     if(var6 <= 0) {
                        break label83;
                     }
                  }

                  label45: {
                     class_689 var7 = this.field_2987;
                     if(var3 != null) {
                        if(this.field_2987 == null) {
                           break label45;
                        }

                        var7 = this.field_2987;
                     }

                     var7.method_3925(this);
                  }

                  if(var4 == 0) {
                     this.method_3915(class_1010.field_5191, 1, 0.0F);
                  }

                  this.method_3851();
               }

               var6 = 1;
               return (boolean)var6;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: aj () void
   public void method_3933() {
      this.method_4048(-this.method_4049());
      this.method_4046(10);
      this.method_4044(this.method_4045() * 11.0F);
   }

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_3012;
      if(var1 != null) {
         var10000 = !this.field_3012;
      }

      return var10000;
   }

   // $FF: renamed from: a (double, double, double, float, float, int) void
   public void method_3926(double var1, double var3, double var5, float var7, float var8, int var9) {
      label23: {
         label20: {
            String[] var10 = class_752.method_4253();
            class_701 var10000 = this;
            if(var10 != null) {
               if(!this.field_3110) {
                  break label20;
               }

               var10000 = this;
            }

            var10000.field_3112 = var9 + 5;
            if(var10 != null) {
               break label23;
            }
         }

         double var11 = var1 - this.field_2994;
         double var13 = var3 - this.field_2995;
         double var15 = var5 - this.field_2996;
         double var17 = var11 * var11 + var13 * var13 + var15 * var15;
         if(var17 <= 1.0D) {
            return;
         }

         this.field_3112 = 3;
      }

      this.field_3113 = var1;
      this.field_3114 = var3;
      this.field_3115 = var5;
      this.field_3116 = (double)var7;
      this.field_3117 = (double)var8;
      this.field_2997 = this.field_3118;
      this.field_2998 = this.field_3119;
      this.field_2999 = this.field_3120;
   }

   // $FF: renamed from: i (double, double, double) void
   public void method_3931(double var1, double var3, double var5) {
      this.field_3118 = this.field_2997 = var1;
      this.field_3119 = this.field_2998 = var3;
      this.field_3120 = this.field_2999 = var5;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      super.method_3856();
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4047();
      if(var1 != null) {
         if(var10000 > 0) {
            this.method_4046(this.method_4047() - 1);
         }

         float var41;
         var10000 = (var41 = this.method_4045() - 0.0F) == 0.0F?0:(var41 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var10000 > 0) {
            this.method_4044(this.method_4045() - 1.0F);
         }

         this.field_2991 = this.field_2994;
         this.field_2992 = this.field_2995;
         this.field_2993 = this.field_2996;
         var10000 = 5;
      }

      int var2 = var10000;
      double var3 = 0.0D;
      int var5 = 0;

      class_701 var28;
      while(true) {
         if(var5 < var2) {
            double var6 = this.field_3004.field_6910 + (this.field_3004.field_6913 - this.field_3004.field_6910) * (double)(var5 + 0) / (double)var2 - 0.125D;
            double var8 = this.field_3004.field_6910 + (this.field_3004.field_6913 - this.field_3004.field_6910) * (double)(var5 + 1) / (double)var2 - 0.125D;
            class_1343 var10 = class_1343.method_7093(this.field_3004.field_6909, var6, this.field_3004.field_6911, this.field_3004.field_6912, var8, this.field_3004.field_6914);
            if(var1 != null) {
               var28 = this;
               if(var1 == null) {
                  break;
               }

               if(this.field_2990.method_2124(var10, awt.field_4177)) {
                  var3 += 1.0D / (double)var2;
               }

               ++var5;
            }

            if(var1 != null) {
               continue;
            }
         }

         var28 = this;
         break;
      }

      double var23 = Math.sqrt(var28.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
      double var42;
      var10000 = (var42 = var23 - 0.26249999999999996D) == 0.0D?0:(var42 < 0.0D?-1:1);
      double var7;
      double var9;
      int var11;
      double var12;
      double var14;
      if(var1 != null) {
         label392: {
            if(var10000 > 0) {
               var7 = Math.cos((double)this.field_3000 * 3.141592653589793D / 180.0D);
               var9 = Math.sin((double)this.field_3000 * 3.141592653589793D / 180.0D);
               var11 = 0;

               while((double)var11 < 1.0D + var23 * 60.0D) {
                  label386: {
                     var12 = (double)(this.field_3028.nextFloat() * 2.0F - 1.0F);
                     var14 = (double)(this.field_3028.nextInt(2) * 2 - 1) * 0.7D;
                     var28 = this;
                     double var16;
                     double var18;
                     if(var1 != null) {
                        var10000 = this.field_3028.nextBoolean();
                        if(var1 == null) {
                           break label392;
                        }

                        if(var10000 != 0) {
                           var16 = this.field_2994 - var7 * var12 * 0.8D + var9 * var14;
                           var18 = this.field_2996 - var9 * var12 * 0.8D - var7 * var14;
                           String[] var22 = field_3122;
                           this.field_2990.method_2087("splash", var16, this.field_2995 - 0.125D, var18, this.field_2997, this.field_2998, this.field_2999);
                           if(var1 != null) {
                              break label386;
                           }
                        }

                        var28 = this;
                     }

                     var16 = var28.field_2994 + var7 + var9 * var12 * 0.7D;
                     var18 = this.field_2996 + var9 - var7 * var12 * 0.7D;
                     String[] var10001 = field_3122;
                     this.field_2990.method_2087("splash", var16, this.field_2995 - 0.125D, var18, this.field_2997, this.field_2998, this.field_2999);
                  }

                  ++var11;
                  if(var1 == null) {
                     break;
                  }
               }
            }

            var10000 = this.field_2990.field_1832;
         }
      }

      if(var1 != null) {
         label371: {
            if(var10000 != 0) {
               var10000 = this.field_3110;
               if(var1 == null) {
                  break label371;
               }

               if(this.field_3110) {
                  var28 = this;
                  if(var1 != null) {
                     if(this.field_3112 > 0) {
                        var7 = this.field_2994 + (this.field_3113 - this.field_2994) / (double)this.field_3112;
                        var9 = this.field_2995 + (this.field_3114 - this.field_2995) / (double)this.field_3112;
                        var12 = this.field_2996 + (this.field_3115 - this.field_2996) / (double)this.field_3112;
                        var14 = class_1715.method_9580(this.field_3116 - (double)this.field_3000);
                        this.field_3000 = (float)((double)this.field_3000 + var14 / (double)this.field_3112);
                        this.field_3001 = (float)((double)this.field_3001 + (this.field_3117 - (double)this.field_3001) / (double)this.field_3112);
                        --this.field_3112;
                        this.method_3854(var7, var9, var12);
                        this.method_3853(this.field_3000, this.field_3001);
                        if(var1 != null) {
                           return;
                        }
                     }

                     var28 = this;
                  }

                  var7 = var28.field_2994 + this.field_2997;
                  var9 = this.field_2995 + this.field_2998;
                  var12 = this.field_2996 + this.field_2999;
                  this.method_3854(var7, var9, var12);
                  var28 = this;
                  if(var1 != null) {
                     if(this.field_3005) {
                        this.field_2997 *= 0.5D;
                        this.field_2998 *= 0.5D;
                        this.field_2999 *= 0.5D;
                     }

                     this.field_2997 *= 0.9900000095367432D;
                     this.field_2998 *= 0.949999988079071D;
                     var28 = this;
                  }

                  var28.field_2999 *= 0.9900000095367432D;
                  if(var1 != null) {
                     return;
                  }
               }
            }

            double var43;
            var10000 = (var43 = var3 - 1.0D) == 0.0D?0:(var43 < 0.0D?-1:1);
         }
      }

      label356: {
         label412: {
            if(var1 != null) {
               if(var10000 < 0) {
                  var7 = var3 * 2.0D - 1.0D;
                  this.field_2998 += 0.03999999910593033D * var7;
                  if(var1 != null) {
                     break label356;
                  }
               }

               var28 = this;
               if(var1 == null) {
                  break label412;
               }

               double var44;
               var10000 = (var44 = this.field_2998 - 0.0D) == 0.0D?0:(var44 < 0.0D?-1:1);
            }

            if(var10000 < 0) {
               this.field_2998 /= 2.0D;
            }

            var28 = this;
         }

         var28.field_2998 += 0.007000000216066837D;
      }

      var28 = this;
      if(var1 != null) {
         label344: {
            if(this.field_2987 != null) {
               var28 = this;
               if(var1 == null) {
                  break label344;
               }

               if(this.field_2987 instanceof class_752) {
                  class_752 var24 = (class_752)this.field_2987;
                  float var17 = this.field_2987.field_3000 + -var24.field_3347 * 90.0F;
                  this.field_2997 += -Math.sin((double)(var17 * 3.1415927F / 180.0F)) * this.field_3111 * (double)var24.field_3348 * 0.05000000074505806D;
                  this.field_2999 += Math.cos((double)(var17 * 3.1415927F / 180.0F)) * this.field_3111 * (double)var24.field_3348 * 0.05000000074505806D;
               }
            }

            var28 = this;
         }
      }

      var7 = Math.sqrt(var28.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
      double var45;
      var10000 = (var45 = var7 - 0.35D) == 0.0D?0:(var45 < 0.0D?-1:1);
      if(var1 != null) {
         if(var10000 > 0) {
            var9 = 0.35D / var7;
            this.field_2997 *= var9;
            this.field_2999 *= var9;
            var7 = 0.35D;
         }

         double var46;
         var10000 = (var46 = var7 - var23) == 0.0D?0:(var46 < 0.0D?-1:1);
      }

      label337: {
         label414: {
            if(var1 != null) {
               label334: {
                  if(var10000 > 0) {
                     double var47;
                     var10000 = (var47 = this.field_3111 - 0.35D) == 0.0D?0:(var47 < 0.0D?-1:1);
                     if(var1 == null) {
                        break label334;
                     }

                     if(var10000 < 0) {
                        this.field_3111 += (0.35D - this.field_3111) / 35.0D;
                        double var48;
                        var10000 = (var48 = this.field_3111 - 0.35D) == 0.0D?0:(var48 < 0.0D?-1:1);
                        if(var1 == null) {
                           break label337;
                        }

                        if(var10000 <= 0) {
                           break label414;
                        }

                        this.field_3111 = 0.35D;
                        if(var1 != null) {
                           break label414;
                        }
                     }
                  }

                  this.field_3111 -= (this.field_3111 - 0.07D) / 35.0D;
                  double var49;
                  var10000 = (var49 = this.field_3111 - 0.07D) == 0.0D?0:(var49 < 0.0D?-1:1);
               }
            }

            if(var1 == null) {
               break label337;
            }

            if(var10000 < 0) {
               this.field_3111 = 0.07D;
            }
         }

         var10000 = 0;
      }

      int var25 = var10000;

      boolean var34;
      while(true) {
         if(var25 < 4) {
            int var26 = class_1715.method_9561(this.field_2994 + ((double)(var25 % 2) - 0.5D) * 0.8D);
            var11 = class_1715.method_9561(this.field_2996 + ((double)(var25 / 2) - 0.5D) * 0.8D);
            var34 = false;
            if(var1 == null) {
               break;
            }

            int var31 = 0;

            while(true) {
               if(var31 < 2) {
                  int var19 = class_1715.method_9561(this.field_2995) + var31;
                  aji var20 = this.field_2990.getBlock(var26, var19, var11);
                  if(var1 == null) {
                     break;
                  }

                  label307: {
                     aji var35 = var20;
                     aji var27 = class_1192.field_6104;
                     if(var1 != null) {
                        if(var20 == class_1192.field_6104) {
                           this.field_2990.method_2056(var26, var19, var11);
                           this.field_3006 = false;
                           if(var1 != null) {
                              break label307;
                           }
                        }

                        var35 = var20;
                        var27 = class_1192.field_6136;
                     }

                     if(var35 == var27) {
                        this.field_2990.method_2057(var26, var19, var11, true);
                        this.field_3006 = false;
                     }
                  }

                  ++var31;
                  if(var1 != null) {
                     continue;
                  }
               }

               ++var25;
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         var34 = this.field_3005;
         break;
      }

      label293: {
         label292: {
            label291: {
               label418: {
                  if(var1 != null) {
                     if(var34) {
                        this.field_2997 *= 0.5D;
                        this.field_2998 *= 0.5D;
                        this.field_2999 *= 0.5D;
                     }

                     this.method_3864(this.field_2997, this.field_2998, this.field_2999);
                     var28 = this;
                     if(var1 == null) {
                        break label418;
                     }

                     var34 = this.field_3006;
                  }

                  if(var34) {
                     label420: {
                        double var50;
                        var10000 = (var50 = var23 - 0.2D) == 0.0D?0:(var50 < 0.0D?-1:1);
                        if(var1 != null) {
                           if(var10000 <= 0) {
                              break label420;
                           }

                           var28 = this;
                           if(var1 == null) {
                              break label293;
                           }

                           var10000 = this.field_2990.field_1832;
                        }

                        if(var10000 != 0) {
                           break label291;
                        }

                        var28 = this;
                        if(var1 == null) {
                           break label293;
                        }

                        if(this.field_3012) {
                           break label291;
                        }

                        this.method_3851();
                        var25 = 0;

                        while(true) {
                           if(var25 < 3) {
                              this.method_3915(adb.method_2920(class_1192.field_6030), 1, 0.0F);
                              ++var25;
                              if(var1 == null) {
                                 break;
                              }

                              if(var1 != null) {
                                 continue;
                              }
                           }

                           var25 = 0;
                           break;
                        }

                        do {
                           if(var25 >= 2) {
                              break label291;
                           }

                           this.method_3915(class_1010.field_5138, 1, 0.0F);
                           ++var25;
                           if(var1 == null) {
                              break label292;
                           }
                        } while(var1 != null);
                     }
                  }

                  this.field_2997 *= 0.9900000095367432D;
                  this.field_2998 *= 0.949999988079071D;
                  var28 = this;
               }

               var28.field_2999 *= 0.9900000095367432D;
            }

            this.field_3001 = 0.0F;
         }

         var28 = this;
      }

      var9 = (double)var28.field_3000;
      var12 = this.field_2991 - this.field_2994;
      var14 = this.field_2993 - this.field_2996;
      double var36 = var12 * var12 + var14 * var14;
      double var30 = 0.001D;
      if(var1 != null) {
         if(var36 > 0.001D) {
            var9 = (double)((float)(Math.atan2(var14, var12) * 180.0D / 3.141592653589793D));
         }

         var36 = var9;
         var30 = (double)this.field_3000;
      }

      double var29 = class_1715.method_9580(var36 - var30);
      double var51;
      var10000 = (var51 = var29 - 20.0D) == 0.0D?0:(var51 < 0.0D?-1:1);
      if(var1 != null) {
         if(var10000 > 0) {
            var29 = 20.0D;
         }

         double var52;
         var10000 = (var52 = var29 - -20.0D) == 0.0D?0:(var52 < 0.0D?-1:1);
      }

      ahb var37;
      label423: {
         if(var1 != null) {
            if(var10000 < 0) {
               var29 = -20.0D;
            }

            this.field_3000 = (float)((double)this.field_3000 + var29);
            this.method_3853(this.field_3000, this.field_3001);
            var37 = this.field_2990;
            if(var1 == null) {
               break label423;
            }

            var10000 = this.field_2990.field_1832;
         }

         if(var10000 != 0) {
            return;
         }

         var37 = this.field_2990;
      }

      class_689 var40;
      label236: {
         label425: {
            List var32 = var37.method_2155(this, this.field_3004.method_7097(0.20000000298023224D, 0.0D, 0.20000000298023224D));
            List var38 = var32;
            if(var1 != null) {
               if(var32 == null) {
                  break label425;
               }

               var38 = var32;
            }

            byte var39 = var38.isEmpty();
            if(var1 != null) {
               if(var39 != 0) {
                  break label425;
               }

               var39 = 0;
            }

            int var33 = var39;

            while(var33 < var32.size()) {
               class_689 var21 = (class_689)var32.get(var33);
               if(var1 != null) {
                  var40 = var21;
                  if(var1 == null) {
                     break label236;
                  }

                  if(var21 != this.field_2987) {
                     label212: {
                        label428: {
                           var34 = var21.method_3898();
                           if(var1 != null) {
                              if(!var34) {
                                 break label212;
                              }

                              var40 = var21;
                              if(var1 == null) {
                                 break label428;
                              }

                              var34 = var21 instanceof class_701;
                           }

                           if(!var34) {
                              break label212;
                           }

                           var40 = var21;
                        }

                        var40.method_3893(this);
                     }
                  }

                  ++var33;
               }

               if(var1 == null) {
                  break;
               }
            }
         }

         var40 = this.field_2987;
      }

      label430: {
         if(var1 != null) {
            if(var40 == null) {
               return;
            }

            var28 = this;
            if(var1 == null) {
               break label430;
            }

            var40 = this.field_2987;
         }

         if(!var40.field_3012) {
            return;
         }

         var28 = this;
      }

      var28.field_2987 = null;
   }

   // $FF: renamed from: ac () void
   public void method_3922() {
      String[] var1 = class_752.method_4253();
      class_701 var10000 = this;
      if(var1 != null) {
         if(this.field_2987 == null) {
            return;
         }

         var10000 = this;
      }

      double var2 = Math.cos((double)var10000.field_3000 * 3.141592653589793D / 180.0D) * 0.4D;
      double var4 = Math.sin((double)this.field_3000 * 3.141592653589793D / 180.0D) * 0.4D;
      this.field_2987.method_3854(this.field_2994 + var2, this.field_2995 + this.method_3924() + this.field_2987.method_3923(), this.field_2996 + var4);
   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {}

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {}

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3919(class_792 var1) {
      String[] var2;
      boolean var3;
      label33: {
         var2 = class_752.method_4253();
         class_701 var10000 = this;
         if(var2 != null) {
            label31: {
               if(this.field_2987 != null) {
                  var3 = this.field_2987 instanceof class_792;
                  if(var2 == null) {
                     break label33;
                  }

                  if(var3) {
                     var10000 = this;
                     if(var2 == null) {
                        break label31;
                     }

                     if(this.field_2987 != var1) {
                        return true;
                     }
                  }
               }

               var10000 = this;
            }
         }

         var3 = var10000.field_2990.field_1832;
      }

      if(var2 != null) {
         if(!var3) {
            var1.method_3925(this);
         }

         var3 = true;
      }

      return var3;
   }

   // $FF: renamed from: a (double, boolean) void
   protected void method_3870(double var1, boolean var3) {
      int var5;
      int var6;
      int var7;
      label72: {
         var5 = class_1715.method_9561(this.field_2994);
         String[] var10000 = class_752.method_4253();
         var6 = class_1715.method_9561(this.field_2995);
         String[] var4 = var10000;
         var7 = class_1715.method_9561(this.field_2996);
         int var9 = var3;
         if(var4 != null) {
            if(var3 == 0) {
               break label72;
            }

            float var11;
            var9 = (var11 = this.field_3019 - 3.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
         }

         label63: {
            class_701 var10;
            label73: {
               if(var4 != null) {
                  if(var9 <= 0) {
                     return;
                  }

                  this.method_3874(this.field_3019);
                  var10 = this;
                  if(var4 == null) {
                     break label73;
                  }

                  var9 = this.field_2990.field_1832;
               }

               if(var9 == 0) {
                  var10 = this;
                  if(var4 == null) {
                     break label73;
                  }

                  if(!this.field_3012) {
                     this.method_3851();
                     int var8 = 0;

                     while(true) {
                        if(var8 < 3) {
                           this.method_3915(adb.method_2920(class_1192.field_6030), 1, 0.0F);
                           ++var8;
                           if(var4 == null) {
                              break;
                           }

                           if(var4 != null) {
                              continue;
                           }
                        }

                        var8 = 0;
                        break;
                     }

                     while(var8 < 2) {
                        this.method_3915(class_1010.field_5138, 1, 0.0F);
                        ++var8;
                        if(var4 == null) {
                           break label63;
                        }

                        if(var4 == null) {
                           break;
                        }
                     }
                  }
               }

               var10 = this;
            }

            var10.field_3019 = 0.0F;
         }

         if(var4 != null) {
            return;
         }
      }

      if(this.field_2990.getBlock(var5, var6 - 1, var7).method_2424() != awt.field_4177 && var1 < 0.0D) {
         this.field_3019 = (float)((double)this.field_3019 - var1);
      }

   }

   // $FF: renamed from: f (float) void
   public void method_4044(float var1) {
      this.field_3036.method_9506(19, Float.valueOf(var1));
   }

   // $FF: renamed from: a () float
   public float method_4045() {
      return this.field_3036.method_9502(19);
   }

   // $FF: renamed from: c (int) void
   public void method_4046(int var1) {
      this.field_3036.method_9506(17, Integer.valueOf(var1));
   }

   // $FF: renamed from: b () int
   public int method_4047() {
      return this.field_3036.method_9501(17);
   }

   // $FF: renamed from: j (int) void
   public void method_4048(int var1) {
      this.field_3036.method_9506(18, Integer.valueOf(var1));
   }

   // $FF: renamed from: d () int
   public int method_4049() {
      return this.field_3036.method_9501(18);
   }

   // $FF: renamed from: f (boolean) void
   public void method_4050(boolean var1) {
      this.field_3110 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4051() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "CÍÎ@,<^U";
      int var4 = "CÍÎ@,<^U".length();
      char var1 = 6;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_3122 = var5;
                  String[] var10 = field_3122;
                  field_3121 = "CL_00001667";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 60;
               break;
            case 1:
               var10009 = 96;
               break;
            case 2:
               var10009 = 48;
               break;
            case 3:
               var10009 = 255;
               break;
            case 4:
               var10009 = 238;
               break;
            case 5:
               var10009 = 123;
               break;
            default:
               var10009 = 117;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
