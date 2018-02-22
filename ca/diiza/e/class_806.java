package ca.diiza.e;

import ca.diiza.e.class_805;
import java.util.List;

// $FF: renamed from: ca.diiza.e.a
public class class_806 extends class_689 implements class_12 {

   // $FF: renamed from: at int
   private int field_3771;
   // $FF: renamed from: au int
   private int field_3772;
   // $FF: renamed from: av int
   private int field_3773;
   // $FF: renamed from: aw aji
   private aji field_3774;
   // $FF: renamed from: ax int
   private int field_3775;
   // $FF: renamed from: ay boolean
   private boolean field_3776;
   // $FF: renamed from: az int
   public int field_3777;
   // $FF: renamed from: aA int
   public int field_3778;
   // $FF: renamed from: aB sa
   public class_689 field_3779;
   // $FF: renamed from: aC int
   private int field_3780;
   // $FF: renamed from: aD int
   private int field_3781;
   // $FF: renamed from: aE double
   private double field_3782;
   // $FF: renamed from: aF int
   private int field_3783;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3784;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3771 = -1;
      this.field_3772 = -1;
      this.field_3773 = -1;
      this.field_3782 = 2.0D;
      this.field_2985 = 10.0D;
      this.method_3852(0.5F, 0.5F);
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4717(ahb var1, double var2, double var4, double var6) {
      super.method_3847(var1);
      this.field_3771 = -1;
      this.field_3772 = -1;
      this.field_3773 = -1;
      this.field_3782 = 2.0D;
      this.field_2985 = 10.0D;
      this.method_3852(0.5F, 0.5F);
      this.method_3854(var2, var4, var6);
      this.field_3013 = 0.0F;
   }

   // $FF: renamed from: <init> (ahb, sv, sv, float, float) void
   public void method_4718(ahb var1, class_752 var2, class_752 var3, float var4, float var5) {
      super.method_3847(var1);
      boolean var6 = class_805.method_4715();
      this.field_3771 = -1;
      this.field_3772 = -1;
      this.field_3773 = -1;
      this.field_3782 = 2.0D;
      this.field_2985 = 10.0D;
      this.field_3779 = var2;
      class_752 var10000 = var2;
      if(!var6) {
         if(var2 instanceof class_792) {
            this.field_3777 = 1;
         }

         this.field_2995 = var2.field_2995 + (double)var2.method_3880() - 0.10000000149011612D;
         var10000 = var3;
      }

      double var7 = var10000.field_2994 - var2.field_2994;
      double var9 = var3.field_3004.field_6910 + (double)(var3.field_3015 / 3.0F) - this.field_2995;
      double var11 = var3.field_2996 - var2.field_2996;
      double var13 = (double)class_1715.method_9558(var7 * var7 + var11 * var11);
      double var22 = var13;
      double var10001 = 1.0E-7D;
      if(!var6) {
         if(var13 < 1.0E-7D) {
            return;
         }

         var22 = Math.atan2(var11, var7) * 180.0D;
         var10001 = 3.141592653589793D;
      }

      float var15 = (float)(var22 / var10001) - 90.0F;
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0D / 3.141592653589793D));
      double var17 = var7 / var13;
      double var19 = var11 / var13;
      this.method_3887(var2.field_2994 + var17, this.field_2995, var2.field_2996 + var19, var15, var16);
      this.field_3013 = 0.0F;
      float var21 = (float)var13 * 0.2F;
      this.method_29(var7, var9 + (double)var21, var11, var4, var5);
   }

   // $FF: renamed from: <init> (ahb, sv, float) void
   public void method_4719(ahb var1, class_752 var2, float var3) {
      boolean var10000 = class_805.method_4715();
      super.method_3847(var1);
      this.field_3771 = -1;
      this.field_3772 = -1;
      boolean var4 = var10000;
      this.field_3773 = -1;
      this.field_3782 = 2.0D;
      this.field_2985 = 10.0D;
      this.field_3779 = var2;
      if(!var4) {
         if(var2 instanceof class_792) {
            this.field_3777 = 1;
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

      if(var4) {
         int var5 = class_689.method_3976();
         ++var5;
         class_689.method_3975(var5);
      }

   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      this.field_3036.method_9497(16, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: d (double, double, double, float, float) void
   public void method_29(double var1, double var3, double var5, float var7, float var8) {
      boolean var10000 = class_805.method_4714();
      float var10 = class_1715.method_9558(var1 * var1 + var3 * var3 + var5 * var5);
      boolean var9 = var10000;
      var1 /= (double)var10;
      var3 /= (double)var10;
      var5 /= (double)var10;
      double var10001 = this.field_3028.nextGaussian();
      int var10002 = this.field_3028.nextBoolean();
      if(var9) {
         var10002 = var10002 != 0?-1:1;
      }

      var1 += var10001 * (double)var10002 * 0.007499999832361937D * (double)var8;
      var10001 = this.field_3028.nextGaussian();
      var10002 = this.field_3028.nextBoolean();
      if(var9) {
         var10002 = var10002 != 0?-1:1;
      }

      var3 += var10001 * (double)var10002 * 0.007499999832361937D * (double)var8;
      var10001 = this.field_3028.nextGaussian();
      var10002 = this.field_3028.nextBoolean();
      if(var9) {
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
      this.field_3780 = 0;
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
         boolean var10000 = class_805.method_4715();
         this.field_2997 = var1;
         boolean var7 = var10000;
         this.field_2998 = var3;
         this.field_2999 = var5;
         float var11;
         int var9 = (var11 = this.field_3003 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
         if(!var7) {
            if(var9 != 0) {
               return;
            }

            var10 = this.field_3002;
            if(var7) {
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
      this.field_3780 = 0;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      boolean var10000 = class_805.method_4715();
      super.method_3856();
      boolean var1 = var10000;
      class_806 var27 = this;
      if(!var1) {
         label451: {
            if(this.field_3003 == 0.0F) {
               var27 = this;
               if(var1) {
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
            var18 = var27.field_2990.getBlock(this.field_3771, this.field_3772, this.field_3773);
            aji var29 = var18;
            if(!var1) {
               if(var18.method_2424() == awt.field_4170) {
                  break label455;
               }

               var18.method_2486(this.field_2990, this.field_3771, this.field_3772, this.field_3773);
               var29 = var18;
            }

            class_1343 var3 = var29.method_2452(this.field_2990, this.field_3771, this.field_3772, this.field_3773);
            class_1343 var32 = var3;
            if(!var1) {
               if(var3 == null) {
                  break label455;
               }

               var32 = var3;
            }

            var33 = var32.method_7105(azw.method_5086(this.field_2994, this.field_2995, this.field_2996));
            if(var1) {
               break label445;
            }

            if(var33 != 0) {
               this.field_3776 = true;
            }
         }

         var33 = this.field_3778;
      }

      label457: {
         if(!var1) {
            if(var33 > 0) {
               --this.field_3778;
            }

            var27 = this;
            if(var1) {
               break label457;
            }

            var33 = this.field_3776;
         }

         if(var33 != 0) {
            label418: {
               int var19 = this.field_2990.method_33(this.field_3771, this.field_3772, this.field_3773);
               if(!var1) {
                  if(var18 == this.field_3774) {
                     label414: {
                        label459: {
                           var33 = var19;
                           int var10001 = this.field_3775;
                           if(!var1) {
                              if(var19 != this.field_3775) {
                                 break label414;
                              }

                              ++this.field_3780;
                              var27 = this;
                              if(var1) {
                                 break label459;
                              }

                              var33 = this.field_3780;
                              var10001 = 1200;
                           }

                           if(var33 != var10001) {
                              break label418;
                           }

                           var27 = this;
                        }

                        var27.method_3851();
                        if(!var1) {
                           break label418;
                        }
                     }
                  }

                  this.field_3776 = false;
                  this.field_2997 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_2998 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_2999 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_3780 = 0;
               }

               this.field_3781 = 0;
            }

            if(!var1) {
               return;
            }
         }

         ++this.field_3781;
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
         if(!var1) {
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
      label461: {
         String[] var17;
         while(true) {
            if(var10 < var7.size()) {
               class_689 var12 = (class_689)var7.get(var10);
               if(!var1) {
                  label463: {
                     var10000 = var12.method_3897();
                     if(var1) {
                        break;
                     }

                     if(var10000 && (var12 != this.field_3779 || this.field_3781 >= 5)) {
                        var11 = 0.3F;
                        class_1343 var13 = var12.field_3004.method_7097((double)var11, (double)var11, (double)var11);
                        azu var14 = var13.method_7109(var20, var4);
                        if(var1) {
                           break label463;
                        }

                        if(var14 != null) {
                           label374: {
                              double var15 = var20.method_5094(var14.field_4217);
                              double var35 = var15;
                              if(!var1) {
                                 label372: {
                                    if(var15 >= var8) {
                                       var35 = var8;
                                       if(var1) {
                                          break label372;
                                       }

                                       if(var8 != 0.0D) {
                                          break label374;
                                       }
                                    }

                                    var6 = var12;
                                    var35 = var15;
                                 }
                              }

                              var8 = var35;
                           }
                        }
                     }

                     ++var10;
                  }
               }

               if(!var1) {
                  continue;
               }
            }

            if(var6 != null) {
               var34 = new azu;
               var34.method_5083(var6);
               var5 = var34;
            }

            var34 = var5;
            if(!var1) {
               label481: {
                  if(var5 != null) {
                     var34 = var5;
                     if(var1) {
                        break label481;
                     }

                     if(var5.field_4218 != null) {
                        var34 = var5;
                        if(var1) {
                           break label481;
                        }

                        if(var5.field_4218 instanceof class_792) {
                           label346: {
                              label466: {
                                 class_792 var21 = (class_792)var5.field_4218;
                                 var10000 = var21.field_3640.field_2836;
                                 if(!var1) {
                                    if(var21.field_3640.field_2836) {
                                       break label466;
                                    }

                                    var10000 = this.field_3779 instanceof class_792;
                                 }

                                 if(!var1) {
                                    if(!var10000) {
                                       break label346;
                                    }

                                    var10000 = ((class_792)this.field_3779).method_4583(var21);
                                 }

                                 if(var10000) {
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
                  if(!var1) {
                     if(var34 == null) {
                        break label467;
                     }

                     var34 = var5;
                  }

                  if(var34.field_4218 != null) {
                     int var24;
                     label319: {
                        var22 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2998 * this.field_2998 + this.field_2999 * this.field_2999);
                        var24 = class_1715.method_9567((double)var22 * this.field_3782);
                        var33 = this.method_4724();
                        if(!var1) {
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
                        if(!var1) {
                           if(this.field_3779 == null) {
                              var25 = class_1691.method_9327(this, this);
                              break label313;
                           }

                           var27 = this;
                        }

                        var25 = class_1691.method_9327(var27, this.field_3779);
                     }

                     var10000 = this.method_3936();
                     if(!var1) {
                        label482: {
                           if(var10000) {
                              var10000 = var5.field_4218 instanceof class_780;
                              if(var1) {
                                 break label482;
                              }

                              if(!var10000) {
                                 var5.field_4218.method_3860(5);
                              }
                           }

                           var10000 = var5.field_4218.method_3896(var25, (float)var24);
                        }
                     }

                     label299: {
                        label470: {
                           if(!var1) {
                              if(!var10000) {
                                 break label470;
                              }

                              var10000 = var5.field_4218 instanceof class_752;
                           }

                           label471: {
                              if(!var1) {
                                 label290: {
                                    Object var36;
                                    label472: {
                                       if(var10000) {
                                          class_752 var16;
                                          label474: {
                                             var16 = (class_752)var5.field_4218;
                                             var33 = this.field_2990.field_1832;
                                             if(!var1) {
                                                if(!this.field_2990.field_1832) {
                                                   var16.method_4207(var16.method_4206() + 1);
                                                }

                                                var36 = this;
                                                if(var1) {
                                                   break label474;
                                                }

                                                var33 = this.field_3783;
                                             }

                                             if(var33 > 0) {
                                                var36 = this;
                                                if(var1) {
                                                   break label474;
                                                }

                                                var23 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
                                                if(var23 > 0.0F) {
                                                   var5.field_4218.method_3894(this.field_2997 * (double)this.field_3783 * 0.6000000238418579D / (double)var23, 0.1D, this.field_2999 * (double)this.field_3783 * 0.6000000238418579D / (double)var23);
                                                }
                                             }

                                             var36 = this.field_3779;
                                          }

                                          if(!var1) {
                                             label253: {
                                                if(var36 != null) {
                                                   var36 = this.field_3779;
                                                   if(var1) {
                                                      break label253;
                                                   }

                                                   if(this.field_3779 instanceof class_752) {
                                                      class_980.method_5649(var16, this.field_3779);
                                                      class_980.method_5650((class_752)this.field_3779, var16);
                                                   }
                                                }

                                                var36 = this.field_3779;
                                             }
                                          }

                                          if(var1) {
                                             break label472;
                                          }

                                          if(var36 != null) {
                                             var36 = var5.field_4218;
                                             if(var1) {
                                                break label472;
                                             }

                                             if(var5.field_4218 != this.field_3779) {
                                                var10000 = var5.field_4218 instanceof class_792;
                                                if(var1) {
                                                   break label290;
                                                }

                                                if(var10000) {
                                                   var10000 = this.field_3779 instanceof class_793;
                                                   if(var1) {
                                                      break label290;
                                                   }

                                                   if(var10000) {
                                                      class_1684 var37 = ((class_793)this.field_3779).field_3654;
                                                      class_281 var30 = new class_281;
                                                      var30.method_1621(6, 0.0F);
                                                      var37.method_9291(var30);
                                                   }
                                                }
                                             }
                                          }
                                       }

                                       var17 = field_3784;
                                       this.method_3868("random.bowhit", 1.0F, 1.2F / (this.field_3028.nextFloat() * 0.2F + 0.9F));
                                       if(var1) {
                                          break label471;
                                       }

                                       var36 = var5.field_4218;
                                    }

                                    var10000 = var36 instanceof class_780;
                                 }
                              }

                              if(var10000) {
                                 break label299;
                              }

                              this.method_3851();
                           }

                           if(!var1) {
                              break label299;
                           }
                        }

                        this.field_2997 *= -0.10000000149011612D;
                        this.field_2998 *= -0.10000000149011612D;
                        this.field_2999 *= -0.10000000149011612D;
                        this.field_3000 += 180.0F;
                        this.field_3002 += 180.0F;
                        this.field_3781 = 0;
                     }

                     if(!var1) {
                        break label467;
                     }
                  }

                  this.field_3771 = var5.field_4213;
                  this.field_3772 = var5.field_4214;
                  this.field_3773 = var5.field_4215;
                  this.field_3774 = this.field_2990.getBlock(this.field_3771, this.field_3772, this.field_3773);
                  this.field_3775 = this.field_2990.method_33(this.field_3771, this.field_3772, this.field_3773);
                  this.field_2997 = (double)((float)(var5.field_4217.field_4220 - this.field_2994));
                  this.field_2998 = (double)((float)(var5.field_4217.field_4221 - this.field_2995));
                  this.field_2999 = (double)((float)(var5.field_4217.field_4222 - this.field_2996));
                  var22 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2998 * this.field_2998 + this.field_2999 * this.field_2999);
                  this.field_2994 -= this.field_2997 / (double)var22 * 0.05000000074505806D;
                  this.field_2995 -= this.field_2998 / (double)var22 * 0.05000000074505806D;
                  this.field_2996 -= this.field_2999 / (double)var22 * 0.05000000074505806D;
                  var17 = field_3784;
                  this.method_3868("random.bowhit", 1.0F, 1.2F / (this.field_3028.nextFloat() * 0.2F + 0.9F));
                  this.field_3776 = true;
                  this.field_3778 = 7;
                  this.method_4723(false);
                  var27 = this;
                  if(var1) {
                     break label334;
                  }

                  if(this.field_3774.method_2424() != awt.field_4170) {
                     this.field_3774.method_2498(this.field_2990, this.field_3771, this.field_3772, this.field_3773, this);
                  }
               }

               var27 = this;
            }

            if(var1) {
               break label461;
            }

            var10000 = var27.method_4724();
            break;
         }

         label247: {
            if(var10000) {
               var10 = 0;

               while(var10 < 4) {
                  var17 = field_3784;
                  this.field_2990.method_2087("crit", this.field_2994 + this.field_2997 * (double)var10 / 4.0D, this.field_2995 + this.field_2998 * (double)var10 / 4.0D, this.field_2996 + this.field_2999 * (double)var10 / 4.0D, -this.field_2997, -this.field_2998 + 0.2D, -this.field_2999);
                  ++var10;
                  if(var1) {
                     break label247;
                  }

                  if(var1) {
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
                  if(var1) {
                     break;
                  }

                  if(!var1) {
                     continue;
                  }
               }

               while(true) {
                  if(this.field_3001 - this.field_3003 < 180.0F) {
                     break label232;
                  }

                  this.field_3003 += 360.0F;
                  if(var1) {
                     break label233;
                  }

                  if(var1) {
                     break label232;
                  }
               }
            }

            while(this.field_3000 - this.field_3002 < -180.0F) {
               this.field_3002 -= 360.0F;
               if(var1) {
                  break label234;
               }

               if(var1) {
                  break;
               }
            }
         }

         while(true) {
            if(this.field_3000 - this.field_3002 >= 180.0F) {
               this.field_3002 += 360.0F;
               if(var1) {
                  break;
               }

               if(!var1) {
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
         var10000 = this.method_3876();
         if(!var1) {
            if(var10000) {
               int var28 = 0;

               while(true) {
                  if(var28 < 4) {
                     var23 = 0.25F;
                     String[] var31 = field_3784;
                     this.field_2990.method_2087("bubble", this.field_2994 - this.field_2997 * (double)var23, this.field_2995 - this.field_2998 * (double)var23, this.field_2996 - this.field_2999 * (double)var23, this.field_2997, this.field_2998, this.field_2999);
                     ++var28;
                     if(var1) {
                        break;
                     }

                     if(!var1) {
                        continue;
                     }
                  }

                  var26 = 0.8F;
                  break;
               }
            }

            var27 = this;
            if(var1) {
               break label479;
            }

            var10000 = this.method_3875();
         }

         if(var10000) {
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
      String[] var3 = field_3784;
      var1.method_8666("xTile", (short)this.field_3771);
      boolean var10000 = class_805.method_4714();
      var1.method_8666("yTile", (short)this.field_3772);
      boolean var2 = var10000;
      var1.method_8666("zTile", (short)this.field_3773);
      var1.method_8666("life", (short)this.field_3780);
      var1.method_8665("inTile", (byte)aji.method_2415(this.field_3774));
      var1.method_8665("inData", (byte)this.field_3775);
      var1.method_8665("shake", (byte)this.field_3778);
      int var10002 = this.field_3776;
      if(var2) {
         var10002 = this.field_3776?1:0;
      }

      var1.method_8665("inGround", (byte)var10002);
      var3 = field_3784;
      var1.method_8665("pickup", (byte)this.field_3777);
      var1.initGui0("damage", this.field_3782);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      boolean var10000 = class_805.method_4714();
      String[] var3 = field_3784;
      this.field_3771 = var1.method_8680("xTile");
      boolean var2 = var10000;
      this.field_3772 = var1.method_8680("yTile");
      this.field_3773 = var1.method_8680("zTile");
      this.field_3780 = var1.method_8680("life");
      this.field_3774 = aji.method_2416(var1.initGui9("inTile") & 255);
      this.field_3775 = var1.initGui9("inData") & 255;
      this.field_3778 = var1.initGui9("shake") & 255;
      int var10001 = var1.initGui9("inGround");
      if(var2) {
         var10001 = var10001 == 1?1:0;
      }

      this.field_3776 = (boolean)var10001;
      var3 = field_3784;
      var10000 = var1.initGui8("damage", 99);
      if(var2) {
         if(var10000) {
            this.field_3782 = var1.method_8684("damage");
         }

         var3 = field_3784;
         var10000 = var1.initGui8("pickup", 99);
      }

      if(var2) {
         if(var10000) {
            var3 = field_3784;
            this.field_3777 = var1.initGui9("pickup");
            if(var2) {
               return;
            }
         }

         var3 = field_3784;
         var10000 = var1.initGui8("player", 99);
      }

      if(var10000) {
         String[] var10002 = field_3784;
         var10001 = var1.method_8690("player");
         if(var2) {
            var10001 = var10001 != 0?1:0;
         }

         this.field_3777 = var10001;
      }

   }

   // $FF: renamed from: b_ (yz) void
   public void method_3892(class_792 var1) {
      boolean var2 = class_805.method_4714();
      int var10000 = this.field_2990.field_1832;
      if(var2) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this.field_3776;
      }

      if(var2) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.field_3778;
      }

      if(var2) {
         if(var10000 > 0) {
            return;
         }

         var10000 = this.field_3777;
      }

      if(var2) {
         label53: {
            if(var10000 != 1) {
               label51: {
                  label73: {
                     var10000 = this.field_3777;
                     if(var2) {
                        if(this.field_3777 != 2) {
                           break label73;
                        }

                        var10000 = var1.field_3640.field_2839;
                     }

                     if(!var2) {
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
      var10000 = this.field_3777;
      if(var2) {
         label38: {
            if(this.field_3777 == 1) {
               class_666 var5 = var1.field_3616;
               add var10001 = new add;
               var10001.method_3725(class_1010.field_5349, 1);
               var10000 = var5.method_3607(var10001);
               if(!var2) {
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
         String[] var4 = field_3784;
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

   // $FF: renamed from: b (double) void
   public void method_4720(double var1) {
      this.field_3782 = var1;
   }

   // $FF: renamed from: a () double
   public double method_4721() {
      return this.field_3782;
   }

   // $FF: renamed from: a (int) void
   public void method_4722(int var1) {
      this.field_3783 = var1;
   }

   // $FF: renamed from: av () boolean
   public boolean method_3959() {
      return false;
   }

   // $FF: renamed from: a (boolean) void
   public void method_4723(boolean var1) {
      byte var3;
      label16: {
         boolean var10000 = class_805.method_4715();
         var3 = this.field_3036.method_9499(16);
         boolean var2 = var10000;
         if(!var2) {
            if(!var1) {
               break label16;
            }

            this.field_3036.method_9506(16, Byte.valueOf((byte)(var3 | 1)));
         }

         if(!var2) {
            return;
         }
      }

      this.field_3036.method_9506(16, Byte.valueOf((byte)(var3 & -2)));
   }

   // $FF: renamed from: b () boolean
   public boolean method_4724() {
      byte var2 = this.field_3036.method_9499(16);
      boolean var1 = class_805.method_4715();
      int var10000 = var2 & 1;
      if(!var1) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4725() {
      // $FF: Couldn't be decompiled
   }
}
