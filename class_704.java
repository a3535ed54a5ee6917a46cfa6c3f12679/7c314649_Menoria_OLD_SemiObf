import java.util.List;

// $FF: renamed from: xl
public class class_704 extends class_689 {

   // $FF: renamed from: at java.util.List
   private static final List field_3127;
   // $FF: renamed from: au java.util.List
   private static final List field_3128;
   // $FF: renamed from: av java.util.List
   private static final List field_3129;
   // $FF: renamed from: aw int
   private int field_3130;
   // $FF: renamed from: ax int
   private int field_3131;
   // $FF: renamed from: ay int
   private int field_3132;
   // $FF: renamed from: az aji
   private aji field_3133;
   // $FF: renamed from: aA boolean
   private boolean field_3134;
   // $FF: renamed from: aB int
   public int field_3135;
   // $FF: renamed from: aC yz
   public class_792 field_3136;
   // $FF: renamed from: aD int
   private int field_3137;
   // $FF: renamed from: aE int
   private int field_3138;
   // $FF: renamed from: aF int
   private int field_3139;
   // $FF: renamed from: aG int
   private int field_3140;
   // $FF: renamed from: aH int
   private int field_3141;
   // $FF: renamed from: aI float
   private float field_3142;
   // $FF: renamed from: aJ sa
   public class_689 field_3143;
   // $FF: renamed from: aK int
   private int field_3144;
   // $FF: renamed from: aL double
   private double field_3145;
   // $FF: renamed from: aM double
   private double field_3146;
   // $FF: renamed from: aN double
   private double field_3147;
   // $FF: renamed from: aO double
   private double field_3148;
   // $FF: renamed from: aP double
   private double field_3149;
   // $FF: renamed from: aQ double
   private double field_3150;
   // $FF: renamed from: aR double
   private double field_3151;
   // $FF: renamed from: aS double
   private double field_3152;
   // $FF: renamed from: aT java.lang.String
   private static final String field_3153;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3154;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3130 = -1;
      this.field_3131 = -1;
      this.field_3132 = -1;
      this.method_3852(0.25F, 0.25F);
      this.field_3046 = true;
   }

   // $FF: renamed from: <init> (ahb, double, double, double, yz) void
   public void method_4054(ahb var1, double var2, double var4, double var6, class_792 var8) {
      this.method_3847(var1);
      this.method_3854(var2, var4, var6);
      this.field_3046 = true;
      this.field_3136 = var8;
      var8.field_3650 = this;
   }

   // $FF: renamed from: <init> (ahb, yz) void
   public void method_4055(ahb var1, class_792 var2) {
      super.method_3847(var1);
      this.field_3130 = -1;
      this.field_3131 = -1;
      this.field_3132 = -1;
      this.field_3046 = true;
      this.field_3136 = var2;
      this.field_3136.field_3650 = this;
      this.method_3852(0.25F, 0.25F);
      this.method_3887(var2.field_2994, var2.field_2995 + 1.62D - (double)var2.field_3013, var2.field_2996, var2.field_3000, var2.field_3001);
      this.field_2994 -= (double)(class_1715.method_9556(this.field_3000 / 180.0F * 3.1415927F) * 0.16F);
      this.field_2995 -= 0.10000000149011612D;
      this.field_2996 -= (double)(class_1715.method_9555(this.field_3000 / 180.0F * 3.1415927F) * 0.16F);
      this.method_3854(this.field_2994, this.field_2995, this.field_2996);
      this.field_3013 = 0.0F;
      float var3 = 0.4F;
      this.field_2997 = (double)(-class_1715.method_9555(this.field_3000 / 180.0F * 3.1415927F) * class_1715.method_9556(this.field_3001 / 180.0F * 3.1415927F) * var3);
      this.field_2999 = (double)(class_1715.method_9556(this.field_3000 / 180.0F * 3.1415927F) * class_1715.method_9556(this.field_3001 / 180.0F * 3.1415927F) * var3);
      this.field_2998 = (double)(-class_1715.method_9555(this.field_3001 / 180.0F * 3.1415927F) * var3);
      this.method_4056(this.field_2997, this.field_2998, this.field_2999, 1.5F, 1.0F);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {}

   // $FF: renamed from: a (double) boolean
   public boolean method_3901(double var1) {
      double var4 = this.field_3004.method_7106() * 4.0D;
      String[] var10000 = class_752.method_4253();
      var4 *= 64.0D;
      String[] var3 = var10000;
      double var7;
      int var6 = (var7 = var1 - var4 * var4) == 0.0D?0:(var7 < 0.0D?-1:1);
      if(var3 != null) {
         var6 = var6 < 0?1:0;
      }

      return (boolean)var6;
   }

   // $FF: renamed from: d (double, double, double, float, float) void
   public void method_4056(double var1, double var3, double var5, float var7, float var8) {
      float var9 = class_1715.method_9558(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.field_3028.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.field_3028.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.field_3028.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.field_2997 = var1;
      this.field_2998 = var3;
      this.field_2999 = var5;
      float var10 = class_1715.method_9558(var1 * var1 + var5 * var5);
      this.field_3002 = this.field_3000 = (float)(Math.atan2(var1, var5) * 180.0D / 3.141592653589793D);
      this.field_3003 = this.field_3001 = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.141592653589793D);
      this.field_3137 = 0;
   }

   // $FF: renamed from: a (double, double, double, float, float, int) void
   public void method_3926(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_3145 = var1;
      this.field_3146 = var3;
      this.field_3147 = var5;
      this.field_3148 = (double)var7;
      this.field_3149 = (double)var8;
      this.field_3144 = var9;
      this.field_2997 = this.field_3150;
      this.field_2998 = this.field_3151;
      this.field_2999 = this.field_3152;
   }

   // $FF: renamed from: i (double, double, double) void
   public void method_3931(double var1, double var3, double var5) {
      this.field_3150 = this.field_2997 = var1;
      this.field_3151 = this.field_2998 = var3;
      this.field_3152 = this.field_2999 = var5;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      super.method_3856();
      String[] var1 = var10000;
      int var38 = this.field_3144;
      if(var1 != null) {
         if(this.field_3144 > 0) {
            double var2 = this.field_2994 + (this.field_3145 - this.field_2994) / (double)this.field_3144;
            double var4 = this.field_2995 + (this.field_3146 - this.field_2995) / (double)this.field_3144;
            double var6 = this.field_2996 + (this.field_3147 - this.field_2996) / (double)this.field_3144;
            double var8 = class_1715.method_9580(this.field_3148 - (double)this.field_3000);
            this.field_3000 = (float)((double)this.field_3000 + var8 / (double)this.field_3144);
            this.field_3001 = (float)((double)this.field_3001 + (this.field_3149 - (double)this.field_3001) / (double)this.field_3144);
            --this.field_3144;
            this.method_3854(var2, var4, var6);
            this.method_3853(this.field_3000, this.field_3001);
            if(var1 != null) {
               return;
            }
         }

         var38 = this.field_2990.field_1832;
      }

      class_704 var46;
      if(var1 != null) {
         label464: {
            class_792 var40;
            label463: {
               label462: {
                  if(var38 == 0) {
                     label475: {
                        add var30 = this.field_3136.method_4593();
                        var40 = this.field_3136;
                        if(var1 == null) {
                           break label463;
                        }

                        if(!this.field_3136.field_3012) {
                           var40 = this.field_3136;
                           if(var1 == null) {
                              break label463;
                           }

                           if(this.field_3136.method_3917()) {
                              label455: {
                                 add var43 = var30;
                                 if(var1 != null) {
                                    if(var30 == null) {
                                       break label455;
                                    }

                                    var43 = var30;
                                 }

                                 if(var43.method_3730() == class_1010.field_5203) {
                                    label449: {
                                       Object var45 = this;
                                       if(var1 != null) {
                                          if(this.method_3891(this.field_3136) > 1024.0D) {
                                             break label449;
                                          }

                                          var46 = this;
                                          if(var1 == null) {
                                             break label462;
                                          }

                                          var45 = this.field_3143;
                                       }

                                       if(var45 != null) {
                                          var46 = this;
                                          if(var1 != null) {
                                             if(!this.field_3143.field_3012) {
                                                this.field_2994 = this.field_3143.field_2994;
                                                this.field_2995 = this.field_3143.field_3004.field_6910 + (double)this.field_3143.field_3015 * 0.8D;
                                                this.field_2996 = this.field_3143.field_2996;
                                                return;
                                             }

                                             var46 = this;
                                          }

                                          var46.field_3143 = null;
                                       }
                                       break label475;
                                    }
                                 }
                              }
                           }
                        }

                        this.method_3851();
                        var40 = this.field_3136;
                        break label463;
                     }
                  }

                  var46 = this;
               }

               var38 = var46.field_3135;
               break label464;
            }

            var40.field_3650 = null;
            return;
         }
      }

      label435: {
         label477: {
            if(var1 != null) {
               if(var38 > 0) {
                  --this.field_3135;
               }

               var46 = this;
               if(var1 == null) {
                  break label477;
               }

               var38 = this.field_3134;
            }

            if(var38 != 0) {
               var46 = this;
               if(var1 != null) {
                  if(this.field_2990.getBlock(this.field_3130, this.field_3131, this.field_3132) == this.field_3133) {
                     ++this.field_3137;
                     var46 = this;
                     if(var1 != null) {
                        if(this.field_3137 != 1200) {
                           return;
                        }

                        var46 = this;
                     }

                     var46.method_3851();
                     return;
                  }

                  this.field_3134 = false;
                  this.field_2997 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_2998 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_2999 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_3137 = 0;
                  var46 = this;
               }

               var46.field_3138 = 0;
               if(var1 != null) {
                  break label435;
               }
            }

            var46 = this;
         }

         ++var46.field_3138;
      }

      azw var3;
      azw var31;
      azu var32;
      azu var49;
      label422: {
         var31 = azw.method_5086(this.field_2994, this.field_2995, this.field_2996);
         var3 = azw.method_5086(this.field_2994 + this.field_2997, this.field_2995 + this.field_2998, this.field_2996 + this.field_2999);
         var32 = this.field_2990.method_2079(var31, var3);
         var31 = azw.method_5086(this.field_2994, this.field_2995, this.field_2996);
         var3 = azw.method_5086(this.field_2994 + this.field_2997, this.field_2995 + this.field_2998, this.field_2996 + this.field_2999);
         var49 = var32;
         if(var1 != null) {
            if(var32 == null) {
               break label422;
            }

            var49 = var32;
         }

         var3 = azw.method_5086(var49.field_4217.field_4220, var32.field_4217.field_4221, var32.field_4217.field_4222);
      }

      class_689 var5 = null;
      List var33 = this.field_2990.method_2155(this, this.field_3004.method_7096(this.field_2997, this.field_2998, this.field_2999).method_7097(1.0D, 1.0D, 1.0D));
      double var7 = 0.0D;
      int var11 = 0;

      double var9;
      double var51;
      label479: {
         boolean var50;
         while(true) {
            if(var11 < var33.size()) {
               class_689 var12 = (class_689)var33.get(var11);
               if(var1 != null) {
                  label481: {
                     var50 = var12.method_3897();
                     if(var1 == null) {
                        break;
                     }

                     if(var50 && (var12 != this.field_3136 || this.field_3138 >= 5)) {
                        float var13 = 0.3F;
                        class_1343 var14 = var12.field_3004.method_7097((double)var13, (double)var13, (double)var13);
                        azu var15 = var14.method_7109(var31, var3);
                        if(var1 == null) {
                           break label481;
                        }

                        if(var15 != null) {
                           label373: {
                              var9 = var31.method_5094(var15.field_4217);
                              var51 = var9;
                              if(var1 != null) {
                                 label371: {
                                    if(var9 >= var7) {
                                       var51 = var7;
                                       if(var1 == null) {
                                          break label371;
                                       }

                                       if(var7 != 0.0D) {
                                          break label373;
                                       }
                                    }

                                    var5 = var12;
                                    var51 = var9;
                                 }
                              }

                              var7 = var51;
                           }
                        }
                     }

                     ++var11;
                  }
               }

               if(var1 != null) {
                  continue;
               }
            }

            if(var5 != null) {
               var49 = new azu;
               var49.method_5083(var5);
               var32 = var49;
            }

            label483: {
               var49 = var32;
               if(var1 != null) {
                  if(var32 == null) {
                     break label483;
                  }

                  var49 = var32;
               }

               label484: {
                  class_689 var52 = var49.field_4218;
                  if(var1 != null) {
                     if(var49.field_4218 == null) {
                        break label484;
                     }

                     var52 = var32.field_4218;
                  }

                  var50 = var52.method_3896(class_1691.method_9331(this, this.field_3136), 0.0F);
                  if(var1 == null) {
                     break;
                  }

                  if(!var50) {
                     break label483;
                  }

                  this.field_3143 = var32.field_4218;
                  if(var1 != null) {
                     break label483;
                  }
               }

               this.field_3134 = true;
            }

            var46 = this;
            if(var1 == null) {
               break label479;
            }

            var50 = this.field_3134;
            break;
         }

         if(var50) {
            return;
         }

         this.method_3864(this.field_2997, this.field_2998, this.field_2999);
         var46 = this;
      }

      float var34 = class_1715.method_9558(var46.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
      this.field_3000 = (float)(Math.atan2(this.field_2997, this.field_2999) * 180.0D / 3.141592653589793D);
      this.field_3001 = (float)(Math.atan2(this.field_2998, (double)var34) * 180.0D / 3.141592653589793D);

      label358: {
         label357: {
            label356:
            while(true) {
               if(this.field_3001 - this.field_3003 < -180.0F) {
                  this.field_3003 -= 360.0F;
                  if(var1 == null) {
                     break;
                  }

                  if(var1 != null) {
                     continue;
                  }
               }

               while(true) {
                  if(this.field_3001 - this.field_3003 < 180.0F) {
                     break label356;
                  }

                  this.field_3003 += 360.0F;
                  if(var1 == null) {
                     break label357;
                  }

                  if(var1 == null) {
                     break label356;
                  }
               }
            }

            while(this.field_3000 - this.field_3002 < -180.0F) {
               this.field_3002 -= 360.0F;
               if(var1 == null) {
                  break label358;
               }

               if(var1 == null) {
                  break;
               }
            }
         }

         while(true) {
            if(this.field_3000 - this.field_3002 >= 180.0F) {
               this.field_3002 += 360.0F;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            }

            this.field_3001 = this.field_3003 + (this.field_3001 - this.field_3003) * 0.2F;
            this.field_3000 = this.field_3002 + (this.field_3000 - this.field_3002) * 0.2F;
            break;
         }
      }

      float var35;
      byte var53;
      label325: {
         label324: {
            label487: {
               var35 = 0.92F;
               var53 = this.field_3005;
               if(var1 != null) {
                  if(this.field_3005) {
                     break label487;
                  }

                  var53 = this.field_3006;
               }

               if(var1 == null) {
                  break label325;
               }

               if(var53 == 0) {
                  break label324;
               }
            }

            var35 = 0.5F;
         }

         var53 = 5;
      }

      byte var36 = var53;
      double var37 = 0.0D;
      int var16 = 0;

      while(true) {
         if(var16 < var36) {
            double var17 = this.field_3004.field_6910 + (this.field_3004.field_6913 - this.field_3004.field_6910) * (double)(var16 + 0) / (double)var36 - 0.125D + 0.125D;
            double var19 = this.field_3004.field_6910 + (this.field_3004.field_6913 - this.field_3004.field_6910) * (double)(var16 + 1) / (double)var36 - 0.125D + 0.125D;
            class_1343 var21 = class_1343.method_7093(this.field_3004.field_6909, var17, this.field_3004.field_6911, this.field_3004.field_6912, var19, this.field_3004.field_6914);
            if(var1 != null) {
               var38 = this.field_2990.method_2124(var21, awt.field_4177);
               if(var1 == null) {
                  break;
               }

               if(var38 != 0) {
                  var37 += 1.0D / (double)var36;
               }

               ++var16;
            }

            if(var1 != null) {
               continue;
            }
         }

         var38 = this.field_2990.field_1832;
         break;
      }

      double var10001;
      label301: {
         label300: {
            if(var1 != null) {
               if(var38 != 0) {
                  break label300;
               }

               var51 = var37;
               var10001 = 0.0D;
               if(var1 == null) {
                  break label301;
               }

               double var55;
               var38 = (var55 = var37 - 0.0D) == 0.0D?0:(var55 < 0.0D?-1:1);
            }

            if(var38 > 0) {
               label490: {
                  class_354 var39 = (class_354)this.field_2990;
                  int var41 = 1;
                  float var56;
                  var38 = (var56 = this.field_3028.nextFloat() - 0.25F) == 0.0F?0:(var56 < 0.0F?-1:1);
                  if(var1 != null) {
                     label289: {
                        if(var38 < 0) {
                           var38 = this.field_2990.method_2204(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995) + 1, class_1715.method_9561(this.field_2996));
                           if(var1 == null) {
                              break label289;
                           }

                           if(var38 != 0) {
                              var41 = 2;
                           }
                        }

                        float var57;
                        var38 = (var57 = this.field_3028.nextFloat() - 0.5F) == 0.0F?0:(var57 < 0.0F?-1:1);
                     }
                  }

                  if(var1 != null) {
                     label282: {
                        if(var38 < 0) {
                           var38 = this.field_2990.method_2067(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995) + 1, class_1715.method_9561(this.field_2996));
                           if(var1 == null) {
                              break label282;
                           }

                           if(var38 == 0) {
                              --var41;
                           }
                        }

                        var38 = this.field_3139;
                     }
                  }

                  label491: {
                     label492: {
                        label493: {
                           if(var1 != null) {
                              if(var38 > 0) {
                                 --this.field_3139;
                                 var38 = this.field_3139;
                                 if(var1 == null) {
                                    break label492;
                                 }

                                 if(this.field_3139 > 0) {
                                    break label493;
                                 }

                                 this.field_3140 = 0;
                                 this.field_3141 = 0;
                                 if(var1 != null) {
                                    break label493;
                                 }
                              }

                              var38 = this.field_3141;
                           }

                           label495: {
                              float var18;
                              double var20;
                              double var22;
                              float var24;
                              double var25;
                              float var47;
                              if(var1 != null) {
                                 if(var38 > 0) {
                                    this.field_3141 -= var41;
                                    var46 = this;
                                    String[] var29;
                                    if(var1 != null) {
                                       if(this.field_3141 <= 0) {
                                          this.field_2998 -= 0.20000000298023224D;
                                          var29 = field_3154;
                                          this.method_3868("random.splash", 0.25F, 1.0F + (this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.4F);
                                          var18 = (float)class_1715.method_9561(this.field_3004.field_6910);
                                          var39.method_2259("bubble", this.field_2994, (double)(var18 + 1.0F), this.field_2996, (int)(1.0F + this.field_3014 * 20.0F), (double)this.field_3014, 0.0D, (double)this.field_3014, 0.20000000298023224D);
                                          var39.method_2259("wake", this.field_2994, (double)(var18 + 1.0F), this.field_2996, (int)(1.0F + this.field_3014 * 20.0F), (double)this.field_3014, 0.0D, (double)this.field_3014, 0.20000000298023224D);
                                          this.field_3139 = class_1715.method_9575(this.field_3028, 10, 30);
                                          if(var1 != null) {
                                             break label493;
                                          }
                                       }

                                       this.field_3142 = (float)((double)this.field_3142 + this.field_3028.nextGaussian() * 4.0D);
                                       var46 = this;
                                    }

                                    var18 = var46.field_3142 * 0.017453292F;
                                    var24 = class_1715.method_9555(var18);
                                    var47 = class_1715.method_9556(var18);
                                    var25 = this.field_2994 + (double)(var24 * (float)this.field_3141 * 0.1F);
                                    var20 = (double)((float)class_1715.method_9561(this.field_3004.field_6910) + 1.0F);
                                    var22 = this.field_2996 + (double)(var47 * (float)this.field_3141 * 0.1F);
                                    float var54 = this.field_3028.nextFloat();
                                    float var42 = 0.15F;
                                    if(var1 != null) {
                                       if(var54 < 0.15F) {
                                          var29 = field_3154;
                                          var39.method_2259("bubble", var25, var20 - 0.10000000149011612D, var22, 1, (double)var24, 0.1D, (double)var47, 0.0D);
                                       }

                                       var54 = var24;
                                       var42 = 0.04F;
                                    }

                                    float var27 = var54 * var42;
                                    float var28 = var47 * 0.04F;
                                    var29 = field_3154;
                                    var39.method_2259("wake", var25, var20, var22, 0, (double)var28, 0.01D, (double)(-var27), 1.0D);
                                    var39.method_2259("wake", var25, var20, var22, 0, (double)(-var28), 0.01D, (double)var27, 1.0D);
                                    if(var1 != null) {
                                       break label493;
                                    }
                                 }

                                 var46 = this;
                                 if(var1 == null) {
                                    break label495;
                                 }

                                 var38 = this.field_3140;
                              }

                              if(var38 > 0) {
                                 label232: {
                                    label499: {
                                       this.field_3140 -= var41;
                                       var18 = 0.15F;
                                       var38 = this.field_3140;
                                       byte var44 = 20;
                                       if(var1 != null) {
                                          if(this.field_3140 < 20) {
                                             var18 = (float)((double)var18 + (double)(20 - this.field_3140) * 0.05D);
                                             if(var1 != null) {
                                                break label499;
                                             }
                                          }

                                          var38 = this.field_3140;
                                          var44 = 40;
                                       }

                                       if(var1 != null) {
                                          if(var38 < var44) {
                                             var18 = (float)((double)var18 + (double)(40 - this.field_3140) * 0.02D);
                                             if(var1 != null) {
                                                break label499;
                                             }
                                          }

                                          var38 = this.field_3140;
                                          if(var1 == null) {
                                             break label232;
                                          }

                                          var44 = 60;
                                       }

                                       if(var38 < var44) {
                                          var18 = (float)((double)var18 + (double)(60 - this.field_3140) * 0.01D);
                                       }
                                    }

                                    float var58;
                                    var38 = (var58 = this.field_3028.nextFloat() - var18) == 0.0F?0:(var58 < 0.0F?-1:1);
                                 }

                                 if(var1 != null) {
                                    if(var38 < 0) {
                                       var24 = class_1715.method_9576(this.field_3028, 0.0F, 360.0F) * 0.017453292F;
                                       var47 = class_1715.method_9576(this.field_3028, 25.0F, 60.0F);
                                       var25 = this.field_2994 + (double)(class_1715.method_9555(var24) * var47 * 0.1F);
                                       var20 = (double)((float)class_1715.method_9561(this.field_3004.field_6910) + 1.0F);
                                       var22 = this.field_2996 + (double)(class_1715.method_9556(var24) * var47 * 0.1F);
                                       String[] var48 = field_3154;
                                       var39.method_2259("splash", var25, var20, var22, 2 + this.field_3028.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.0D);
                                    }

                                    var38 = this.field_3140;
                                 }

                                 if(var1 == null) {
                                    break label492;
                                 }

                                 if(var38 > 0) {
                                    break label493;
                                 }

                                 this.field_3142 = class_1715.method_9576(this.field_3028, 0.0F, 360.0F);
                                 this.field_3141 = class_1715.method_9575(this.field_3028, 20, 80);
                                 if(var1 != null) {
                                    break label493;
                                 }
                              }

                              this.field_3140 = class_1715.method_9575(this.field_3028, 100, 900);
                              var46 = this;
                           }

                           var46.field_3140 -= class_980.method_5658(this.field_3136) * 20 * 5;
                        }

                        var46 = this;
                        if(var1 == null) {
                           break label491;
                        }

                        var38 = this.field_3139;
                     }

                     if(var38 <= 0) {
                        break label490;
                     }

                     var46 = this;
                  }

                  var46.field_2998 -= (double)(this.field_3028.nextFloat() * this.field_3028.nextFloat() * this.field_3028.nextFloat()) * 0.2D;
               }
            }
         }

         var51 = var37 * 2.0D;
         var10001 = 1.0D;
      }

      var9 = var51 - var10001;
      this.field_2998 += 0.03999999910593033D * var9;
      if(var1 != null) {
         if(var37 > 0.0D) {
            var35 = (float)((double)var35 * 0.9D);
            this.field_2998 *= 0.8D;
         }

         this.field_2997 *= (double)var35;
         this.field_2998 *= (double)var35;
         this.field_2999 *= (double)var35;
      }

      this.method_3854(this.field_2994, this.field_2995, this.field_2996);
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var3 = field_3154;
      var1.method_8666("xTile", (short)this.field_3130);
      String[] var10000 = class_752.method_4253();
      var1.method_8666("yTile", (short)this.field_3131);
      var1.method_8666("zTile", (short)this.field_3132);
      var1.method_8665("inTile", (byte)aji.method_2415(this.field_3133));
      var1.method_8665("shake", (byte)this.field_3135);
      String[] var2 = var10000;
      int var10002 = this.field_3134;
      if(var2 != null) {
         var10002 = this.field_3134?1:0;
      }

      var1.method_8665("inGround", (byte)var10002);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var3 = field_3154;
      this.field_3130 = var1.method_8680("xTile");
      this.field_3131 = var1.method_8680("yTile");
      String[] var10000 = class_752.method_4253();
      this.field_3132 = var1.method_8680("zTile");
      String[] var2 = var10000;
      this.field_3133 = aji.method_2416(var1.initGui9("inTile") & 255);
      this.field_3135 = var1.initGui9("shake") & 255;
      int var10001 = var1.initGui9("inGround");
      if(var2 != null) {
         var10001 = var10001 == 1?1:0;
      }

      this.field_3134 = (boolean)var10001;
   }

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: a () int
   public int method_4057() {
      String[] var1 = class_752.method_4253();
      byte var10000 = this.field_2990.field_1832;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return 0;
         }

         var10000 = 0;
      }

      byte var2;
      int var16;
      label38: {
         label42: {
            var2 = var10000;
            class_704 var15 = this;
            if(var1 != null) {
               if(this.field_3143 != null) {
                  double var3 = this.field_3136.field_2994 - this.field_2994;
                  double var5 = this.field_3136.field_2995 - this.field_2995;
                  double var7 = this.field_3136.field_2996 - this.field_2996;
                  double var9 = (double)class_1715.method_9558(var3 * var3 + var5 * var5 + var7 * var7);
                  double var11 = 0.1D;
                  this.field_3143.field_2997 += var3 * var11;
                  this.field_3143.field_2998 += var5 * var11 + (double)class_1715.method_9558(var9) * 0.08D;
                  this.field_3143.field_2999 += var7 * var11;
                  var2 = 3;
                  if(var1 != null) {
                     break label42;
                  }
               }

               var15 = this;
            }

            var16 = var15.field_3139;
            if(var1 == null) {
               break label38;
            }

            if(var16 > 0) {
               class_699 var17 = new class_699;
               var17.method_4025(this.field_2990, this.field_2994, this.field_2995, this.field_2996, this.method_4058());
               class_699 var14 = var17;
               double var4 = this.field_3136.field_2994 - this.field_2994;
               double var6 = this.field_3136.field_2995 - this.field_2995;
               double var8 = this.field_3136.field_2996 - this.field_2996;
               double var10 = (double)class_1715.method_9558(var4 * var4 + var6 * var6 + var8 * var8);
               double var12 = 0.1D;
               var14.field_2997 = var4 * var12;
               var14.field_2998 = var6 * var12 + (double)class_1715.method_9558(var10) * 0.08D;
               var14.field_2999 = var8 * var12;
               this.field_2990.method_2089(var14);
               ahb var18 = this.field_3136.field_2990;
               class_715 var10001 = new class_715;
               var10001.method_4087(this.field_3136.field_2990, this.field_3136.field_2994, this.field_3136.field_2995 + 0.5D, this.field_3136.field_2996 + 0.5D, this.field_3028.nextInt(6) + 1);
               var18.method_2089(var10001);
               var2 = 1;
            }
         }

         var16 = this.field_3134;
      }

      if(var1 != null) {
         if(var16 != 0) {
            var2 = 2;
         }

         this.method_3851();
         this.field_3136.field_3650 = null;
         var16 = var2;
      }

      return var16;
   }

   // $FF: renamed from: b () add
   private add method_4058() {
      float var9;
      float var10001;
      label23: {
         float var2 = this.field_2990.field_1819.nextFloat();
         int var3 = class_980.method_5657(this.field_3136);
         String[] var10000 = class_752.method_4253();
         int var4 = class_980.method_5658(this.field_3136);
         float var5 = 0.1F - (float)var3 * 0.025F - (float)var4 * 0.01F;
         String[] var1 = var10000;
         float var6 = 0.05F + (float)var3 * 0.01F - (float)var4 * 0.01F;
         var5 = class_1715.method_9569(var5, 0.0F, 1.0F);
         var6 = class_1715.method_9569(var6, 0.0F, 1.0F);
         float var10;
         int var8 = (var10 = var2 - var5) == 0.0F?0:(var10 < 0.0F?-1:1);
         if(var1 != null) {
            if(var8 < 0) {
               this.field_3136.method_4615(class_1698.field_8906, 1);
               return ((class_1651)class_1725.method_9638(this.field_3028, field_3127)).method_9091(this.field_3028);
            }

            var2 -= var5;
            var9 = var2;
            var10001 = var6;
            if(var1 == null) {
               break label23;
            }

            float var11;
            var8 = (var11 = var2 - var6) == 0.0F?0:(var11 < 0.0F?-1:1);
         }

         if(var8 < 0) {
            this.field_3136.method_4615(class_1698.field_8907, 1);
            return ((class_1651)class_1725.method_9638(this.field_3028, field_3128)).method_9091(this.field_3028);
         }

         var9 = var2;
         var10001 = var6;
      }

      float var7 = var9 - var10001;
      this.field_3136.method_4615(class_1698.field_8905, 1);
      return ((class_1651)class_1725.method_9638(this.field_3028, field_3129)).method_9091(this.field_3028);
   }

   // $FF: renamed from: B () void
   public void method_3851() {
      String[] var10000 = class_752.method_4253();
      super.method_3851();
      String[] var1 = var10000;
      class_792 var2 = this.field_3136;
      if(var1 != null) {
         if(this.field_3136 == null) {
            return;
         }

         var2 = this.field_3136;
      }

      var2.field_3650 = null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4059() {
      // $FF: Couldn't be decompiled
   }
}
