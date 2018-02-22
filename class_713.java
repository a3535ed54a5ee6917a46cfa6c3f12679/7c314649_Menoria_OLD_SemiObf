import java.util.List;

// $FF: renamed from: xB
public class class_713 extends class_689 implements class_12 {

   // $FF: renamed from: at int
   private int field_3186;
   // $FF: renamed from: au int
   private int field_3187;
   // $FF: renamed from: av int
   private int field_3188;
   // $FF: renamed from: aw aji
   private aji field_3189;
   // $FF: renamed from: ax int
   private int field_3190;
   // $FF: renamed from: ay boolean
   private boolean field_3191;
   // $FF: renamed from: az int
   public int field_3192;
   // $FF: renamed from: aA int
   public int field_3193;
   // $FF: renamed from: aB sa
   public class_689 field_3194;
   // $FF: renamed from: aC int
   private int field_3195;
   // $FF: renamed from: aD int
   private int field_3196;
   // $FF: renamed from: aE double
   private double field_3197;
   // $FF: renamed from: aF int
   private int field_3198;
   // $FF: renamed from: aG java.lang.String
   private static final String field_3199;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3200;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3186 = -1;
      this.field_3187 = -1;
      this.field_3188 = -1;
      this.field_3197 = 2.0D;
      this.field_2985 = 10.0D;
      this.method_3852(0.5F, 0.5F);
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4074(ahb var1, double var2, double var4, double var6) {
      super.method_3847(var1);
      this.field_3186 = -1;
      this.field_3187 = -1;
      this.field_3188 = -1;
      this.field_3197 = 2.0D;
      this.field_2985 = 10.0D;
      this.method_3852(0.5F, 0.5F);
      this.method_3854(var2, var4, var6);
      this.field_3013 = 0.0F;
   }

   // $FF: renamed from: <init> (ahb, sv, sv, float, float) void
   public void method_4075(ahb var1, class_752 var2, class_752 var3, float var4, float var5) {
      super.method_3847(var1);
      this.field_3186 = -1;
      this.field_3187 = -1;
      this.field_3188 = -1;
      String[] var10000 = class_752.method_4253();
      this.field_3197 = 2.0D;
      this.field_2985 = 10.0D;
      this.field_3194 = var2;
      String[] var6 = var10000;
      class_752 var22 = var2;
      if(var6 != null) {
         if(var2 instanceof class_792) {
            this.field_3192 = 1;
         }

         this.field_2995 = var2.field_2995 + (double)var2.method_3880() - 0.10000000149011612D;
         var22 = var3;
      }

      double var7 = var22.field_2994 - var2.field_2994;
      double var9 = var3.field_3004.field_6910 + (double)(var3.field_3015 / 3.0F) - this.field_2995;
      double var11 = var3.field_2996 - var2.field_2996;
      double var13 = (double)class_1715.method_9558(var7 * var7 + var11 * var11);
      double var23 = var13;
      double var10001 = 1.0E-7D;
      if(var6 != null) {
         if(var13 < 1.0E-7D) {
            return;
         }

         var23 = Math.atan2(var11, var7) * 180.0D;
         var10001 = 3.141592653589793D;
      }

      float var15 = (float)(var23 / var10001) - 90.0F;
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0D / 3.141592653589793D));
      double var17 = var7 / var13;
      double var19 = var11 / var13;
      this.method_3887(var2.field_2994 + var17, this.field_2995, var2.field_2996 + var19, var15, var16);
      this.field_3013 = 0.0F;
      float var21 = (float)var13 * 0.2F;
      this.method_29(var7, var9 + (double)var21, var11, var4, var5);
   }

   // $FF: renamed from: <init> (ahb, sv, float) void
   public void method_4076(ahb var1, class_752 var2, float var3) {
      super.method_3847(var1);
      String[] var10000 = class_752.method_4253();
      this.field_3186 = -1;
      this.field_3187 = -1;
      this.field_3188 = -1;
      this.field_3197 = 2.0D;
      this.field_2985 = 10.0D;
      this.field_3194 = var2;
      String[] var4 = var10000;
      if(var4 != null) {
         if(var2 instanceof class_792) {
            this.field_3192 = 1;
         }

         this.method_3852(0.5F, 0.5F);
         this.method_3887(var2.field_2994, var2.field_2995 + (double)var2.method_3880(), var2.field_2996, var2.field_3000, var2.field_3001);
         this.field_2994 -= (double)(class_1715.method_9556(this.field_3000 / 180.0F * 3.1415927F) * 0.16F);
         this.field_2995 -= 0.10000000149011612D;
         this.field_2996 -= (double)(class_1715.method_9555(this.field_3000 / 180.0F * 3.1415927F) * 0.16F);
         this.method_3854(this.field_2994, this.field_2995, this.field_2996);
         this.field_3013 = 0.0F;
         this.field_2997 = (double)(-class_1715.method_9555(this.field_3000 / 180.0F * 3.1415927F) * class_1715.method_9556(this.field_3001 / 180.0F * 3.1415927F));
         this.field_2999 = (double)(class_1715.method_9556(this.field_3000 / 180.0F * 3.1415927F) * class_1715.method_9556(this.field_3001 / 180.0F * 3.1415927F));
         this.field_2998 = (double)(-class_1715.method_9555(this.field_3001 / 180.0F * 3.1415927F));
         this.method_29(this.field_2997, this.field_2998, this.field_2999, var3 * 1.5F, 1.0F);
      }

   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      this.field_3036.method_9497(16, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: d (double, double, double, float, float) void
   public void method_29(double var1, double var3, double var5, float var7, float var8) {
      String[] var10000 = class_752.method_4253();
      float var10 = class_1715.method_9558(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var10;
      var3 /= (double)var10;
      String[] var9 = var10000;
      var5 /= (double)var10;
      double var10001 = this.field_3028.nextGaussian();
      int var10002 = this.field_3028.nextBoolean();
      if(var9 != null) {
         var10002 = var10002 != 0?-1:1;
      }

      var1 += var10001 * (double)var10002 * 0.007499999832361937D * (double)var8;
      var10001 = this.field_3028.nextGaussian();
      var10002 = this.field_3028.nextBoolean();
      if(var9 != null) {
         var10002 = var10002 != 0?-1:1;
      }

      var3 += var10001 * (double)var10002 * 0.007499999832361937D * (double)var8;
      var10001 = this.field_3028.nextGaussian();
      var10002 = this.field_3028.nextBoolean();
      if(var9 != null) {
         var10002 = var10002 != 0?-1:1;
      }

      var5 += var10001 * (double)var10002 * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.field_2997 = var1;
      this.field_2998 = var3;
      this.field_2999 = var5;
      float var11 = class_1715.method_9558(var1 * var1 + var5 * var5);
      this.field_3002 = this.field_3000 = (float)(Math.atan2(var1, var5) * 180.0D / 3.141592653589793D);
      this.field_3003 = this.field_3001 = (float)(Math.atan2(var3, (double)var11) * 180.0D / 3.141592653589793D);
      this.field_3195 = 0;
   }

   // $FF: renamed from: a (double, double, double, float, float, int) void
   public void method_3926(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.method_3854(var1, var3, var5);
      this.method_3853(var7, var8);
   }

   // $FF: renamed from: i (double, double, double) void
   public void method_3931(double var1, double var3, double var5) {
      float var10;
      label24: {
         String[] var10000 = class_752.method_4253();
         this.field_2997 = var1;
         String[] var7 = var10000;
         this.field_2998 = var3;
         this.field_2999 = var5;
         float var11;
         int var9 = (var11 = this.field_3003 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
         if(var7 != null) {
            if(var9 != 0) {
               return;
            }

            var10 = this.field_3002;
            if(var7 == null) {
               break label24;
            }

            float var12;
            var9 = (var12 = this.field_3002 - 0.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
         }

         if(var9 != 0) {
            return;
         }

         var10 = class_1715.method_9558(var1 * var1 + var5 * var5);
      }

      float var8 = var10;
      this.field_3002 = this.field_3000 = (float)(Math.atan2(var1, var5) * 180.0D / 3.141592653589793D);
      this.field_3003 = this.field_3001 = (float)(Math.atan2(var3, (double)var8) * 180.0D / 3.141592653589793D);
      this.field_3003 = this.field_3001;
      this.field_3002 = this.field_3000;
      this.method_3887(this.field_2994, this.field_2995, this.field_2996, this.field_3000, this.field_3001);
      this.field_3195 = 0;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      super.method_3856();
      String[] var1 = var10000;
      class_713 var27 = this;
      if(var1 != null) {
         label451: {
            if(this.field_3003 == 0.0F) {
               var27 = this;
               if(var1 == null) {
                  break label451;
               }

               if(this.field_3002 == 0.0F) {
                  float var2 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
                  this.field_3002 = this.field_3000 = (float)(Math.atan2(this.field_2997, this.field_2999) * 180.0D / 3.141592653589793D);
                  this.field_3003 = this.field_3001 = (float)(Math.atan2(this.field_2998, (double)var2) * 180.0D / 3.141592653589793D);
               }
            }

            var27 = this;
         }
      }

      aji var18;
      int var33;
      label445: {
         label455: {
            var18 = var27.field_2990.getBlock(this.field_3186, this.field_3187, this.field_3188);
            aji var29 = var18;
            if(var1 != null) {
               if(var18.method_2424() == awt.field_4170) {
                  break label455;
               }

               var18.method_2486(this.field_2990, this.field_3186, this.field_3187, this.field_3188);
               var29 = var18;
            }

            class_1343 var3 = var29.method_2452(this.field_2990, this.field_3186, this.field_3187, this.field_3188);
            class_1343 var32 = var3;
            if(var1 != null) {
               if(var3 == null) {
                  break label455;
               }

               var32 = var3;
            }

            var33 = var32.method_7105(azw.method_5086(this.field_2994, this.field_2995, this.field_2996));
            if(var1 == null) {
               break label445;
            }

            if(var33 != 0) {
               this.field_3191 = true;
            }
         }

         var33 = this.field_3193;
      }

      label457: {
         if(var1 != null) {
            if(var33 > 0) {
               --this.field_3193;
            }

            var27 = this;
            if(var1 == null) {
               break label457;
            }

            var33 = this.field_3191;
         }

         if(var33 != 0) {
            label418: {
               int var19 = this.field_2990.method_33(this.field_3186, this.field_3187, this.field_3188);
               if(var1 != null) {
                  if(var18 == this.field_3189) {
                     label414: {
                        label459: {
                           var33 = var19;
                           int var10001 = this.field_3190;
                           if(var1 != null) {
                              if(var19 != this.field_3190) {
                                 break label414;
                              }

                              ++this.field_3195;
                              var27 = this;
                              if(var1 == null) {
                                 break label459;
                              }

                              var33 = this.field_3195;
                              var10001 = 1200;
                           }

                           if(var33 != var10001) {
                              break label418;
                           }

                           var27 = this;
                        }

                        var27.method_3851();
                        if(var1 != null) {
                           break label418;
                        }
                     }
                  }

                  this.field_3191 = false;
                  this.field_2997 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_2998 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_2999 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_3195 = 0;
               }

               this.field_3196 = 0;
            }

            if(var1 != null) {
               return;
            }
         }

         ++this.field_3196;
         var27 = this;
      }

      azw var4;
      azu var5;
      azw var20;
      azu var34;
      label400: {
         var20 = azw.method_5086(var27.field_2994, this.field_2995, this.field_2996);
         var4 = azw.method_5086(this.field_2994 + this.field_2997, this.field_2995 + this.field_2998, this.field_2996 + this.field_2999);
         var5 = this.field_2990.method_2081(var20, var4, false, true, false);
         var20 = azw.method_5086(this.field_2994, this.field_2995, this.field_2996);
         var4 = azw.method_5086(this.field_2994 + this.field_2997, this.field_2995 + this.field_2998, this.field_2996 + this.field_2999);
         var34 = var5;
         if(var1 != null) {
            if(var5 == null) {
               break label400;
            }

            var34 = var5;
         }

         var4 = azw.method_5086(var34.field_4217.field_4220, var5.field_4217.field_4221, var5.field_4217.field_4222);
      }

      class_689 var6 = null;
      List var7 = this.field_2990.method_2155(this, this.field_3004.method_7096(this.field_2997, this.field_2998, this.field_2999).method_7097(1.0D, 1.0D, 1.0D));
      double var8 = 0.0D;
      int var10 = 0;

      float var11;
      float var22;
      float var23;
      boolean var35;
      label461: {
         String[] var17;
         while(true) {
            if(var10 < var7.size()) {
               class_689 var12 = (class_689)var7.get(var10);
               if(var1 != null) {
                  label463: {
                     var35 = var12.method_3897();
                     if(var1 == null) {
                        break;
                     }

                     if(var35 && (var12 != this.field_3194 || this.field_3196 >= 5)) {
                        var11 = 0.3F;
                        class_1343 var13 = var12.field_3004.method_7097((double)var11, (double)var11, (double)var11);
                        azu var14 = var13.method_7109(var20, var4);
                        if(var1 == null) {
                           break label463;
                        }

                        if(var14 != null) {
                           label374: {
                              double var15 = var20.method_5094(var14.field_4217);
                              double var36 = var15;
                              if(var1 != null) {
                                 label372: {
                                    if(var15 >= var8) {
                                       var36 = var8;
                                       if(var1 == null) {
                                          break label372;
                                       }

                                       if(var8 != 0.0D) {
                                          break label374;
                                       }
                                    }

                                    var6 = var12;
                                    var36 = var15;
                                 }
                              }

                              var8 = var36;
                           }
                        }
                     }

                     ++var10;
                  }
               }

               if(var1 != null) {
                  continue;
               }
            }

            if(var6 != null) {
               var34 = new azu;
               var34.method_5083(var6);
               var5 = var34;
            }

            var34 = var5;
            if(var1 != null) {
               label481: {
                  if(var5 != null) {
                     var34 = var5;
                     if(var1 == null) {
                        break label481;
                     }

                     if(var5.field_4218 != null) {
                        var34 = var5;
                        if(var1 == null) {
                           break label481;
                        }

                        if(var5.field_4218 instanceof class_792) {
                           label346: {
                              label466: {
                                 class_792 var21 = (class_792)var5.field_4218;
                                 var35 = var21.field_3640.field_2836;
                                 if(var1 != null) {
                                    if(var21.field_3640.field_2836) {
                                       break label466;
                                    }

                                    var35 = this.field_3194 instanceof class_792;
                                 }

                                 if(var1 != null) {
                                    if(!var35) {
                                       break label346;
                                    }

                                    var35 = ((class_792)this.field_3194).method_4583(var21);
                                 }

                                 if(var35) {
                                    break label346;
                                 }
                              }

                              var5 = null;
                           }
                        }
                     }
                  }

                  var34 = var5;
               }
            }

            label334: {
               label467: {
                  if(var1 != null) {
                     if(var34 == null) {
                        break label467;
                     }

                     var34 = var5;
                  }

                  if(var34.field_4218 != null) {
                     int var24;
                     label319: {
                        var22 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2998 * this.field_2998 + this.field_2999 * this.field_2999);
                        var24 = class_1715.method_9567((double)var22 * this.field_3197);
                        var33 = this.method_4081();
                        if(var1 != null) {
                           if(var33 == 0) {
                              break label319;
                           }

                           var33 = var24 + this.field_3028.nextInt(var24 / 2 + 2);
                        }

                        var24 = var33;
                     }

                     class_1691 var25;
                     label313: {
                        var25 = null;
                        var27 = this;
                        if(var1 != null) {
                           if(this.field_3194 == null) {
                              var25 = class_1691.method_9326(this, this);
                              break label313;
                           }

                           var27 = this;
                        }

                        var25 = class_1691.method_9326(var27, this.field_3194);
                     }

                     var35 = this.method_3936();
                     if(var1 != null) {
                        label482: {
                           if(var35) {
                              var35 = var5.field_4218 instanceof class_780;
                              if(var1 == null) {
                                 break label482;
                              }

                              if(!var35) {
                                 var5.field_4218.method_3860(5);
                              }
                           }

                           var35 = var5.field_4218.method_3896(var25, (float)var24);
                        }
                     }

                     label299: {
                        label470: {
                           if(var1 != null) {
                              if(!var35) {
                                 break label470;
                              }

                              var35 = var5.field_4218 instanceof class_752;
                           }

                           label471: {
                              if(var1 != null) {
                                 label290: {
                                    Object var37;
                                    label472: {
                                       if(var35) {
                                          class_752 var16;
                                          label474: {
                                             var16 = (class_752)var5.field_4218;
                                             var33 = this.field_2990.field_1832;
                                             if(var1 != null) {
                                                if(!this.field_2990.field_1832) {
                                                   var16.method_4207(var16.method_4206() + 1);
                                                }

                                                var37 = this;
                                                if(var1 == null) {
                                                   break label474;
                                                }

                                                var33 = this.field_3198;
                                             }

                                             if(var33 > 0) {
                                                var37 = this;
                                                if(var1 == null) {
                                                   break label474;
                                                }

                                                var23 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
                                                if(var23 > 0.0F) {
                                                   var5.field_4218.method_3894(this.field_2997 * (double)this.field_3198 * 0.6000000238418579D / (double)var23, 0.1D, this.field_2999 * (double)this.field_3198 * 0.6000000238418579D / (double)var23);
                                                }
                                             }

                                             var37 = this.field_3194;
                                          }

                                          if(var1 != null) {
                                             label253: {
                                                if(var37 != null) {
                                                   var37 = this.field_3194;
                                                   if(var1 == null) {
                                                      break label253;
                                                   }

                                                   if(this.field_3194 instanceof class_752) {
                                                      class_980.method_5649(var16, this.field_3194);
                                                      class_980.method_5650((class_752)this.field_3194, var16);
                                                   }
                                                }

                                                var37 = this.field_3194;
                                             }
                                          }

                                          if(var1 == null) {
                                             break label472;
                                          }

                                          if(var37 != null) {
                                             var37 = var5.field_4218;
                                             if(var1 == null) {
                                                break label472;
                                             }

                                             if(var5.field_4218 != this.field_3194) {
                                                var35 = var5.field_4218 instanceof class_792;
                                                if(var1 == null) {
                                                   break label290;
                                                }

                                                if(var35) {
                                                   var35 = this.field_3194 instanceof class_793;
                                                   if(var1 == null) {
                                                      break label290;
                                                   }

                                                   if(var35) {
                                                      class_1684 var38 = ((class_793)this.field_3194).field_3654;
                                                      class_281 var30 = new class_281;
                                                      var30.method_1621(6, 0.0F);
                                                      var38.method_9291(var30);
                                                   }
                                                }
                                             }
                                          }
                                       }

                                       var17 = field_3200;
                                       this.method_3868("random.bowhit", 1.0F, 1.2F / (this.field_3028.nextFloat() * 0.2F + 0.9F));
                                       if(var1 == null) {
                                          break label471;
                                       }

                                       var37 = var5.field_4218;
                                    }

                                    var35 = var37 instanceof class_780;
                                 }
                              }

                              if(var35) {
                                 break label299;
                              }

                              this.method_3851();
                           }

                           if(var1 != null) {
                              break label299;
                           }
                        }

                        this.field_2997 *= -0.10000000149011612D;
                        this.field_2998 *= -0.10000000149011612D;
                        this.field_2999 *= -0.10000000149011612D;
                        this.field_3000 += 180.0F;
                        this.field_3002 += 180.0F;
                        this.field_3196 = 0;
                     }

                     if(var1 != null) {
                        break label467;
                     }
                  }

                  this.field_3186 = var5.field_4213;
                  this.field_3187 = var5.field_4214;
                  this.field_3188 = var5.field_4215;
                  this.field_3189 = this.field_2990.getBlock(this.field_3186, this.field_3187, this.field_3188);
                  this.field_3190 = this.field_2990.method_33(this.field_3186, this.field_3187, this.field_3188);
                  this.field_2997 = (double)((float)(var5.field_4217.field_4220 - this.field_2994));
                  this.field_2998 = (double)((float)(var5.field_4217.field_4221 - this.field_2995));
                  this.field_2999 = (double)((float)(var5.field_4217.field_4222 - this.field_2996));
                  var22 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2998 * this.field_2998 + this.field_2999 * this.field_2999);
                  this.field_2994 -= this.field_2997 / (double)var22 * 0.05000000074505806D;
                  this.field_2995 -= this.field_2998 / (double)var22 * 0.05000000074505806D;
                  this.field_2996 -= this.field_2999 / (double)var22 * 0.05000000074505806D;
                  var17 = field_3200;
                  this.method_3868("random.bowhit", 1.0F, 1.2F / (this.field_3028.nextFloat() * 0.2F + 0.9F));
                  this.field_3191 = true;
                  this.field_3193 = 7;
                  this.method_4080(false);
                  var27 = this;
                  if(var1 == null) {
                     break label334;
                  }

                  if(this.field_3189.method_2424() != awt.field_4170) {
                     this.field_3189.method_2498(this.field_2990, this.field_3186, this.field_3187, this.field_3188, this);
                  }
               }

               var27 = this;
            }

            if(var1 == null) {
               break label461;
            }

            var35 = var27.method_4081();
            break;
         }

         label247: {
            if(var35) {
               var10 = 0;

               while(var10 < 4) {
                  var17 = field_3200;
                  this.field_2990.method_2087("crit", this.field_2994 + this.field_2997 * (double)var10 / 4.0D, this.field_2995 + this.field_2998 * (double)var10 / 4.0D, this.field_2996 + this.field_2999 * (double)var10 / 4.0D, -this.field_2997, -this.field_2998 + 0.2D, -this.field_2999);
                  ++var10;
                  if(var1 == null) {
                     break label247;
                  }

                  if(var1 == null) {
                     break;
                  }
               }
            }

            this.field_2994 += this.field_2997;
            this.field_2995 += this.field_2998;
            this.field_2996 += this.field_2999;
         }

         var27 = this;
      }

      var22 = class_1715.method_9558(var27.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
      this.field_3000 = (float)(Math.atan2(this.field_2997, this.field_2999) * 180.0D / 3.141592653589793D);
      this.field_3001 = (float)(Math.atan2(this.field_2998, (double)var22) * 180.0D / 3.141592653589793D);

      label234: {
         label233: {
            label232:
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
                     break label232;
                  }

                  this.field_3003 += 360.0F;
                  if(var1 == null) {
                     break label233;
                  }

                  if(var1 == null) {
                     break label232;
                  }
               }
            }

            while(this.field_3000 - this.field_3002 < -180.0F) {
               this.field_3002 -= 360.0F;
               if(var1 == null) {
                  break label234;
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

      label479: {
         float var26 = 0.99F;
         var11 = 0.05F;
         var35 = this.method_3876();
         if(var1 != null) {
            if(var35) {
               int var28 = 0;

               while(true) {
                  if(var28 < 4) {
                     var23 = 0.25F;
                     String[] var31 = field_3200;
                     this.field_2990.method_2087("bubble", this.field_2994 - this.field_2997 * (double)var23, this.field_2995 - this.field_2998 * (double)var23, this.field_2996 - this.field_2999 * (double)var23, this.field_2997, this.field_2998, this.field_2999);
                     ++var28;
                     if(var1 == null) {
                        break;
                     }

                     if(var1 != null) {
                        continue;
                     }
                  }

                  var26 = 0.8F;
                  break;
               }
            }

            var27 = this;
            if(var1 == null) {
               break label479;
            }

            var35 = this.method_3875();
         }

         if(var35) {
            this.method_3861();
         }

         this.field_2997 *= (double)var26;
         this.field_2998 *= (double)var26;
         this.field_2999 *= (double)var26;
         this.field_2998 -= (double)var11;
         this.method_3854(this.field_2994, this.field_2995, this.field_2996);
         var27 = this;
      }

      var27.method_3866();
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var3 = field_3200;
      var1.method_8666("xTile", (short)this.field_3186);
      String[] var10000 = class_752.method_4253();
      var1.method_8666("yTile", (short)this.field_3187);
      var1.method_8666("zTile", (short)this.field_3188);
      String[] var2 = var10000;
      var1.method_8666("life", (short)this.field_3195);
      var1.method_8665("inTile", (byte)aji.method_2415(this.field_3189));
      var1.method_8665("inData", (byte)this.field_3190);
      var1.method_8665("shake", (byte)this.field_3193);
      int var10002 = this.field_3191;
      if(var2 != null) {
         var10002 = this.field_3191?1:0;
      }

      var1.method_8665("inGround", (byte)var10002);
      var3 = field_3200;
      var1.method_8665("pickup", (byte)this.field_3192);
      var1.initGui0("damage", this.field_3197);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var3 = field_3200;
      this.field_3186 = var1.method_8680("xTile");
      this.field_3187 = var1.method_8680("yTile");
      this.field_3188 = var1.method_8680("zTile");
      this.field_3195 = var1.method_8680("life");
      this.field_3189 = aji.method_2416(var1.initGui9("inTile") & 255);
      this.field_3190 = var1.initGui9("inData") & 255;
      String[] var10000 = class_752.method_4253();
      this.field_3193 = var1.initGui9("shake") & 255;
      String[] var2 = var10000;
      int var10001 = var1.initGui9("inGround");
      if(var2 != null) {
         var10001 = var10001 == 1?1:0;
      }

      this.field_3191 = (boolean)var10001;
      var3 = field_3200;
      boolean var4 = var1.initGui8("damage", 99);
      if(var2 != null) {
         if(var4) {
            this.field_3197 = var1.method_8684("damage");
         }

         var3 = field_3200;
         var4 = var1.initGui8("pickup", 99);
      }

      if(var2 != null) {
         if(var4) {
            var3 = field_3200;
            this.field_3192 = var1.initGui9("pickup");
            if(var2 != null) {
               return;
            }
         }

         var3 = field_3200;
         var4 = var1.initGui8("player", 99);
      }

      if(var4) {
         String[] var10002 = field_3200;
         var10001 = var1.method_8690("player");
         if(var2 != null) {
            var10001 = var10001 != 0?1:0;
         }

         this.field_3192 = var10001;
      }

   }

   // $FF: renamed from: b_ (yz) void
   public void method_3892(class_792 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_2990.field_1832;
      if(var2 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this.field_3191;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.field_3193;
      }

      if(var2 != null) {
         if(var10000 > 0) {
            return;
         }

         var10000 = this.field_3192;
      }

      if(var2 != null) {
         label53: {
            if(var10000 != 1) {
               label51: {
                  label73: {
                     var10000 = this.field_3192;
                     if(var2 != null) {
                        if(this.field_3192 != 2) {
                           break label73;
                        }

                        var10000 = var1.field_3640.field_2839;
                     }

                     if(var2 == null) {
                        break label53;
                     }

                     if(var10000 != 0) {
                        break label51;
                     }
                  }

                  var10000 = 0;
                  break label53;
               }
            }

            var10000 = 1;
         }
      }

      int var3 = var10000;
      var10000 = this.field_3192;
      if(var2 != null) {
         label38: {
            if(this.field_3192 == 1) {
               class_666 var5 = var1.field_3616;
               add var10001 = new add;
               var10001.method_3725(class_1010.field_5120, 1);
               var10000 = var5.method_3607(var10001);
               if(var2 == null) {
                  break label38;
               }

               if(var10000 == 0) {
                  var3 = 0;
               }
            }

            var10000 = var3;
         }
      }

      if(var10000 != 0) {
         String[] var4 = field_3200;
         this.method_3868("random.pop", 0.2F, ((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         var1.method_4238(this, 1);
         this.method_3851();
      }

   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: c (double) void
   public void method_4077(double var1) {
      this.field_3197 = var1;
   }

   // $FF: renamed from: a () double
   public double method_4078() {
      return this.field_3197;
   }

   // $FF: renamed from: c (int) void
   public void method_4079(int var1) {
      this.field_3198 = var1;
   }

   // $FF: renamed from: av () boolean
   public boolean method_3959() {
      return false;
   }

   // $FF: renamed from: f (boolean) void
   public void method_4080(boolean var1) {
      byte var3;
      label16: {
         String[] var10000 = class_752.method_4253();
         var3 = this.field_3036.method_9499(16);
         String[] var2 = var10000;
         if(var2 != null) {
            if(!var1) {
               break label16;
            }

            this.field_3036.method_9506(16, Byte.valueOf((byte)(var3 | 1)));
         }

         if(var2 != null) {
            return;
         }
      }

      this.field_3036.method_9506(16, Byte.valueOf((byte)(var3 & -2)));
   }

   // $FF: renamed from: b () boolean
   public boolean method_4081() {
      String[] var10000 = class_752.method_4253();
      byte var2 = this.field_3036.method_9499(16);
      String[] var1 = var10000;
      int var3 = var2 & 1;
      if(var1 != null) {
         var3 = var3 != 0?1:0;
      }

      return (boolean)var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4082() {
      // $FF: Couldn't be decompiled
   }
}
