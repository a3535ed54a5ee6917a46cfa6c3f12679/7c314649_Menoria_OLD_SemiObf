import ca.diiza.e.class_804;
import ca.diiza.e.class_805;
import ca.diiza.e.class_806;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: w1
public class class_791 extends class_779 implements class_85, class_84 {

   // $FF: renamed from: bB float[]
   private float[] field_3606;
   // $FF: renamed from: bC float[]
   private float[] field_3607;
   // $FF: renamed from: bD float[]
   private float[] field_3608;
   // $FF: renamed from: bE float[]
   private float[] field_3609;
   // $FF: renamed from: bF int[]
   private int[] field_3610;
   // $FF: renamed from: bG int[]
   private int[] field_3611;
   // $FF: renamed from: bH int
   private int field_3612;
   // $FF: renamed from: bI xT
   private static final class_82 field_3613;
   // $FF: renamed from: bJ java.lang.String
   private static final String field_3614;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3615;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3606 = new float[2];
      this.field_3607 = new float[2];
      this.field_3608 = new float[2];
      this.field_3609 = new float[2];
      this.field_3610 = new int[2];
      this.field_3611 = new int[2];
      this.method_4188(this.method_405());
      this.method_3852(0.9F, 4.0F);
      this.field_3035 = true;
      this.method_4257().method_9791(true);
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(0, var10002);
      var10000 = this.field_3373;
      class_1752 var2 = new class_1752;
      var2.method_9701(this, 1.0D, 40, 20.0F);
      var10000.method_9766(2, var2);
      var10000 = this.field_3373;
      class_1753 var3 = new class_1753;
      var3.method_9705(this, 1.0D);
      var10000.method_9766(5, var3);
      var10000 = this.field_3373;
      class_1728 var4 = new class_1728;
      var4.method_9657(this, class_792.class, 8.0F);
      var10000.method_9766(6, var4);
      var10000 = this.field_3373;
      class_1754 var5 = new class_1754;
      var5.method_9706(this);
      var10000.method_9766(7, var5);
      var10000 = this.field_3374;
      class_1767 var6 = new class_1767;
      var6.method_9732(this, false);
      var10000.method_9766(1, var6);
      var10000 = this.field_3374;
      class_1771 var7 = new class_1771;
      var7.method_9742(this, class_753.class, 0, false, false, field_3613);
      var10000.method_9766(2, var7);
      this.field_3367 = 50;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(17, new Integer(0));
      this.field_3036.method_9497(18, new Integer(0));
      this.field_3036.method_9497(19, new Integer(0));
      this.field_3036.method_9497(20, new Integer(0));
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3615;
      var1.method_8667("Invul", this.method_4549());
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var10002 = field_3615;
      this.method_4550(var1.method_8681("Invul"));
   }

   // $FF: renamed from: Y () float
   public float method_3913() {
      return this.field_3015 / 8.0F;
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3615;
      return "mob.wither.idle";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3615;
      return "mob.wither.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3615;
      return "mob.wither.death";
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var10000 = class_752.method_4253();
      this.field_2998 *= 0.6000000238418579D;
      String[] var1 = var10000;
      int var23 = this.field_2990.field_1832;
      double var2;
      double var4;
      double var6;
      double var9;
      if(var1 != null) {
         label160: {
            class_791 var24;
            label159: {
               if(!this.field_2990.field_1832) {
                  var23 = this.method_4551(0);
                  if(var1 == null) {
                     break label160;
                  }

                  if(var23 > 0) {
                     var24 = this;
                     if(var1 == null) {
                        break label159;
                     }

                     class_689 var8 = this.field_2990.method_2160(this.method_4551(0));
                     if(var8 != null) {
                        double var10001;
                        double var27;
                        label146: {
                           Object var26;
                           label145: {
                              label144: {
                                 label165: {
                                    double var30;
                                    var23 = (var30 = this.field_2995 - var8.field_2995) == 0.0D?0:(var30 < 0.0D?-1:1);
                                    if(var1 != null) {
                                       if(var23 >= 0) {
                                          var26 = this;
                                          if(var1 == null) {
                                             break label145;
                                          }

                                          if(this.method_4553()) {
                                             break label144;
                                          }

                                          var27 = this.field_2995;
                                          var10001 = var8.field_2995 + 5.0D;
                                          if(var1 == null) {
                                             break label146;
                                          }

                                          if(this.field_2995 >= var10001) {
                                             break label144;
                                          }
                                       }

                                       var24 = this;
                                       if(var1 == null) {
                                          break label165;
                                       }

                                       double var31;
                                       var23 = (var31 = this.field_2998 - 0.0D) == 0.0D?0:(var31 < 0.0D?-1:1);
                                    }

                                    if(var23 < 0) {
                                       this.field_2998 = 0.0D;
                                    }

                                    var24 = this;
                                 }

                                 var24.field_2998 += (0.5D - this.field_2998) * 0.6000000238418579D;
                              }

                              var26 = var8;
                           }

                           var27 = ((class_689)var26).field_2994;
                           var10001 = this.field_2994;
                        }

                        var9 = var27 - var10001;
                        var2 = var8.field_2996 - this.field_2996;
                        var4 = var9 * var9 + var2 * var2;
                        double var32;
                        var23 = (var32 = var4 - 9.0D) == 0.0D?0:(var32 < 0.0D?-1:1);
                        if(var1 == null) {
                           break label160;
                        }

                        if(var23 > 0) {
                           var6 = (double)class_1715.method_9558(var4);
                           this.field_2997 += (var9 / var6 * 0.5D - this.field_2997) * 0.6000000238418579D;
                           this.field_2999 += (var2 / var6 * 0.5D - this.field_2999) * 0.6000000238418579D;
                        }
                     }
                  }
               }

               var24 = this;
            }

            double var33;
            var23 = (var33 = var24.field_2997 * this.field_2997 + this.field_2999 * this.field_2999 - 0.05000000074505806D) == 0.0D?0:(var33 < 0.0D?-1:1);
         }
      }

      if(var1 != null) {
         if(var23 > 0) {
            this.field_3000 = (float)Math.atan2(this.field_2999, this.field_2997) * 57.295776F - 90.0F;
         }

         super.method_4231();
         var23 = 0;
      }

      int var22 = var23;

      while(true) {
         if(var22 < 2) {
            this.field_3609[var22] = this.field_3607[var22];
            this.field_3608[var22] = this.field_3606[var22];
            ++var22;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         var22 = 0;
         break;
      }

      double var11;
      double var13;
      int var15;
      while(true) {
         if(var22 < 2) {
            var15 = this.method_4551(var22 + 1);
            class_689 var16 = null;
            var23 = var15;
            if(var1 == null) {
               break;
            }

            if(var15 > 0) {
               var16 = this.field_2990.method_2160(var15);
            }

            label111: {
               if(var16 != null) {
                  var2 = this.method_4541(var22 + 1);
                  var4 = this.method_4542(var22 + 1);
                  var6 = this.method_4543(var22 + 1);
                  var9 = var16.field_2994 - var2;
                  var11 = var16.field_2995 + (double)var16.method_3880() - var4;
                  var13 = var16.field_2996 - var6;
                  double var17 = (double)class_1715.method_9558(var9 * var9 + var13 * var13);
                  float var19 = (float)(Math.atan2(var13, var9) * 180.0D / 3.141592653589793D) - 90.0F;
                  float var20 = (float)(-(Math.atan2(var11, var17) * 180.0D / 3.141592653589793D));
                  this.field_3606[var22] = this.method_4544(this.field_3606[var22], var20, 40.0F);
                  this.field_3607[var22] = this.method_4544(this.field_3607[var22], var19, 10.0F);
                  if(var1 != null) {
                     break label111;
                  }
               }

               this.field_3607[var22] = this.method_4544(this.field_3607[var22], this.field_3330, 10.0F);
            }

            ++var22;
            if(var1 != null) {
               continue;
            }
         }

         var23 = this.method_4553();
         break;
      }

      int var25 = var23;
      var15 = 0;

      while(true) {
         if(var15 < 3) {
            var9 = this.method_4541(var15);
            var11 = this.method_4542(var15);
            var13 = this.method_4543(var15);
            String[] var21 = field_3615;
            this.field_2990.method_2087("smoke", var9 + this.field_3028.nextGaussian() * 0.30000001192092896D, var11 + this.field_3028.nextGaussian() * 0.30000001192092896D, var13 + this.field_3028.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D);
            if(var1 != null) {
               var23 = var25;
               if(var1 == null) {
                  break;
               }

               if(var25 != 0) {
                  label93: {
                     ahb var29 = this.field_2990;
                     if(var1 != null) {
                        if(this.field_2990.field_1819.nextInt(4) != 0) {
                           break label93;
                        }

                        var29 = this.field_2990;
                     }

                     var21 = field_3615;
                     var29.method_2087("mobSpell", var9 + this.field_3028.nextGaussian() * 0.30000001192092896D, var11 + this.field_3028.nextGaussian() * 0.30000001192092896D, var13 + this.field_3028.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D);
                  }
               }

               ++var15;
            }

            if(var1 != null) {
               continue;
            }
         }

         var23 = this.method_4549();
         break;
      }

      if(var1 != null) {
         if(var23 <= 0) {
            return;
         }

         var23 = 0;
      }

      var15 = var23;

      while(var15 < 3) {
         String[] var28 = field_3615;
         this.field_2990.method_2087("mobSpell", this.field_2994 + this.field_3028.nextGaussian() * 1.0D, this.field_2995 + (double)(this.field_3028.nextFloat() * 3.3F), this.field_2996 + this.field_3028.nextGaussian() * 1.0D, 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D);
         ++var15;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: bn () void
   protected void method_4232() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4549();
      int var2;
      class_791 var25;
      if(var1 != null) {
         if(var10000 > 0) {
            label327: {
               var2 = this.method_4549() - 1;
               var10000 = var2;
               if(var1 != null) {
                  if(var2 <= 0) {
                     ahb var24 = this.field_2990;
                     double var10002 = this.field_2994;
                     double var10003 = this.field_2995 + (double)this.method_3880();
                     double var10004 = this.field_2996;
                     class_1038 var10007 = this.field_2990.method_2196();
                     String[] var14 = field_3615;
                     var24.method_2126(this, var10002, var10003, var10004, 7.0F, false, var10007.method_5878("mobGriefing"));
                     this.field_2990.method_2209(1013, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
                  }

                  this.method_4550(var2);
                  var25 = this;
                  if(var1 == null) {
                     break label327;
                  }

                  var10000 = this.field_3029 % 10;
               }

               if(var10000 != 0) {
                  return;
               }

               var25 = this;
            }

            var25.method_4187(10.0F);
            if(var1 != null) {
               return;
            }
         }

         super.method_4232();
         var10000 = 1;
      }

      var2 = var10000;

      label308:
      while(true) {
         var10000 = var2;

         label330: {
            label304: {
               int var10001;
               label303:
               while(true) {
                  int var3;
                  int var4;
                  if(var10000 < 3) {
                     label332: {
                        var25 = this;
                        if(var1 != null) {
                           var10000 = this.field_3029;
                           var10001 = this.field_3610[var2 - 1];
                           if(var1 == null) {
                              break;
                           }

                           if(this.field_3029 < var10001) {
                              break label332;
                           }

                           this.field_3610[var2 - 1] = this.field_3029 + 10 + this.field_3028.nextInt(10);
                           var25 = this;
                        }

                        int var5;
                        label275: {
                           label274: {
                              label334: {
                                 label272: {
                                    class_918 var29 = var25.field_2990.field_1818;
                                    class_918 var26 = class_918.field_4629;
                                    if(var1 != null) {
                                       if(var25.field_2990.field_1818 == class_918.field_4629) {
                                          break label272;
                                       }

                                       var25 = this;
                                       if(var1 == null) {
                                          break label274;
                                       }

                                       var29 = this.field_2990.field_1818;
                                       var26 = class_918.field_4630;
                                    }

                                    if(var29 != var26) {
                                       break label334;
                                    }
                                 }

                                 var4 = var2 - 1;
                                 var5 = this.field_3611[var2 - 1];
                                 this.field_3611[var4] = this.field_3611[var2 - 1] + 1;
                                 var10000 = var5;
                                 if(var1 == null) {
                                    break label275;
                                 }

                                 if(var5 > 15) {
                                    float var6 = 10.0F;
                                    float var7 = 5.0F;
                                    double var8 = class_1715.method_9577(this.field_3028, this.field_2994 - (double)var6, this.field_2994 + (double)var6);
                                    double var10 = class_1715.method_9577(this.field_3028, this.field_2995 - (double)var7, this.field_2995 + (double)var7);
                                    double var12 = class_1715.method_9577(this.field_3028, this.field_2996 - (double)var6, this.field_2996 + (double)var6);
                                    this.method_4546(var2 + 1, var8, var10, var12, true);
                                    this.field_3611[var2 - 1] = 0;
                                 }
                              }

                              var25 = this;
                           }

                           var10000 = var25.method_4551(var2);
                        }

                        var3 = var10000;
                        if(var3 > 0) {
                           label254: {
                              label253: {
                                 label336: {
                                    class_689 var16 = this.field_2990.method_2160(var3);
                                    class_689 var30 = var16;
                                    if(var1 != null) {
                                       if(var16 == null) {
                                          break label336;
                                       }

                                       var30 = var16;
                                    }

                                    var10000 = var30.method_3917();
                                    if(var1 != null) {
                                       if(var10000 == 0) {
                                          break label336;
                                       }

                                       var25 = this;
                                       if(var1 == null) {
                                          break label253;
                                       }

                                       double var36;
                                       var10000 = (var36 = this.method_3891(var16) - 900.0D) == 0.0D?0:(var36 < 0.0D?-1:1);
                                    }

                                    if(var10000 <= 0) {
                                       var25 = this;
                                       if(var1 == null) {
                                          break label253;
                                       }

                                       if(this.method_4239(var16)) {
                                          this.method_4545(var2 + 1, (class_752)var16);
                                          this.field_3610[var2 - 1] = this.field_3029 + 40 + this.field_3028.nextInt(20);
                                          this.field_3611[var2 - 1] = 0;
                                          if(var1 != null) {
                                             break label254;
                                          }
                                       }
                                    }
                                 }

                                 var25 = this;
                              }

                              var25.method_4552(var2, 0);
                           }

                           if(var1 != null) {
                              break label332;
                           }
                        }

                        List var17 = this.field_2990.method_2158(class_752.class, this.field_3004.method_7097(20.0D, 8.0D, 20.0D), field_3613);
                        var5 = 0;

                        while(var5 < 10) {
                           Object var31 = var17;
                           if(var1 != null) {
                              var10000 = var17.isEmpty();
                              if(var1 == null) {
                                 continue label303;
                              }

                              if(var10000 != 0) {
                                 break;
                              }

                              var31 = var17.get(this.field_3028.nextInt(var17.size()));
                           }

                           class_752 var19 = (class_752)var31;
                           if(var1 != null) {
                              label227: {
                                 if(var19 != this) {
                                    boolean var32 = var19.method_3917();
                                    if(var1 == null) {
                                       break label227;
                                    }

                                    if(var32) {
                                       var32 = this.method_4239(var19);
                                       if(var1 == null) {
                                          break label227;
                                       }

                                       if(var32) {
                                          label340: {
                                             var32 = var19 instanceof class_792;
                                             if(var1 != null) {
                                                if(!var32) {
                                                   break label340;
                                                }

                                                var32 = ((class_792)var19).field_3640.field_2836;
                                             }

                                             if(var32) {
                                                break;
                                             }

                                             this.method_4552(var2, var19.method_3845());
                                             if(var1 != null) {
                                                break;
                                             }
                                          }

                                          this.method_4552(var2, var19.method_3845());
                                          if(var1 != null) {
                                             break;
                                          }
                                       }
                                    }
                                 }

                                 var17.remove(var19);
                              }

                              ++var5;
                           }

                           if(var1 == null) {
                              break;
                           }
                        }
                     }

                     ++var2;
                     if(var1 != null) {
                        continue label308;
                     }
                  }

                  label192: {
                     var25 = this;
                     if(var1 != null) {
                        if(this.method_4259() != null) {
                           this.method_4552(0, this.method_4259().method_3845());
                           if(var1 != null) {
                              break label192;
                           }
                        }

                        var25 = this;
                     }

                     var25.method_4552(0, 0);
                  }

                  var10000 = this.field_3612;
                  if(var1 == null) {
                     break label304;
                  }

                  if(this.field_3612 > 0) {
                     --this.field_3612;
                     var10000 = this.field_3612;
                     if(var1 == null) {
                        break label304;
                     }

                     if(this.field_3612 == 0) {
                        class_1038 var33 = this.field_2990.method_2196();
                        String[] var27 = field_3615;
                        var10000 = var33.method_5878("mobGriefing");
                        if(var1 == null) {
                           break label304;
                        }

                        if(var10000 != 0) {
                           var2 = class_1715.method_9561(this.field_2995);
                           var3 = class_1715.method_9561(this.field_2994);
                           var4 = class_1715.method_9561(this.field_2996);
                           byte var15 = 0;
                           int var18 = -1;

                           label185:
                           while(true) {
                              var10000 = var18;

                              label182:
                              while(var10000 <= 1) {
                                 var10000 = -1;
                                 if(var1 == null) {
                                    break label185;
                                 }

                                 int var20 = -1;

                                 while(var20 <= 1) {
                                    var10000 = 0;
                                    if(var1 == null) {
                                       continue label182;
                                    }

                                    int var21 = 0;

                                    while(true) {
                                       if(var21 <= 3) {
                                          int var9 = var3 + var18;
                                          int var22 = var2 + var21;
                                          int var11 = var4 + var20;
                                          aji var23 = this.field_2990.getBlock(var9, var22, var11);
                                          if(var1 == null) {
                                             break;
                                          }

                                          if(var1 != null) {
                                             if(var23.method_2424() != awt.field_4170) {
                                                label346: {
                                                   aji var34 = var23;
                                                   aji var28 = class_1192.field_6032;
                                                   if(var1 != null) {
                                                      if(var23 == class_1192.field_6032) {
                                                         break label346;
                                                      }

                                                      var34 = var23;
                                                      var28 = class_1192.field_6143;
                                                   }

                                                   if(var1 != null) {
                                                      if(var34 == var28) {
                                                         break label346;
                                                      }

                                                      var34 = var23;
                                                      var28 = class_1192.field_6144;
                                                   }

                                                   if(var1 != null) {
                                                      if(var34 == var28) {
                                                         break label346;
                                                      }

                                                      var34 = var23;
                                                      var28 = class_1192.field_6161;
                                                   }

                                                   if(var34 != var28) {
                                                      byte var35 = this.field_2990.method_2057(var9, var22, var11, true);
                                                      if(var1 != null) {
                                                         label150: {
                                                            if(var35 == 0) {
                                                               var35 = var15;
                                                               if(var1 == null) {
                                                                  break label150;
                                                               }

                                                               if(var15 == 0) {
                                                                  var35 = 0;
                                                                  break label150;
                                                               }
                                                            }

                                                            var35 = 1;
                                                         }
                                                      }

                                                      var15 = var35;
                                                   }
                                                }
                                             }

                                             ++var21;
                                          }

                                          if(var1 != null) {
                                             continue;
                                          }
                                       }

                                       ++var20;
                                       break;
                                    }

                                    if(var1 == null) {
                                       break;
                                    }
                                 }

                                 ++var18;
                                 if(var1 != null) {
                                    continue label185;
                                 }
                                 break;
                              }

                              var10000 = var15;
                              break;
                           }

                           if(var1 == null) {
                              break label304;
                           }

                           if(var10000 != 0) {
                              this.field_2990.method_2211((class_792)null, 1012, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
                           }
                        }
                     }
                  }

                  var25 = this;
                  if(var1 == null) {
                     break label330;
                  }

                  var10000 = this.field_3029;
                  var10001 = 20;
                  break;
               }

               var10000 %= var10001;
            }

            if(var10000 != 0) {
               break;
            }

            var25 = this;
         }

         var25.method_4187(1.0F);
         break;
      }

   }

   // $FF: renamed from: b () void
   public void method_4540() {
      this.method_4550(220);
      this.method_4188(this.method_405() / 3.0F);
   }

   // $FF: renamed from: as () void
   public void method_3954() {}

   // $FF: renamed from: aV () int
   public int method_4199() {
      return 4;
   }

   // $FF: renamed from: a (int) double
   private double method_4541(int var1) {
      if(var1 <= 0) {
         return this.field_2994;
      } else {
         float var2 = (this.field_3330 + (float)(180 * (var1 - 1))) / 180.0F * 3.1415927F;
         float var3 = class_1715.method_9556(var2);
         return this.field_2994 + (double)var3 * 1.3D;
      }
   }

   // $FF: renamed from: c (int) double
   private double method_4542(int var1) {
      return var1 <= 0?this.field_2995 + 3.0D:this.field_2995 + 2.2D;
   }

   // $FF: renamed from: s (int) double
   private double method_4543(int var1) {
      if(var1 <= 0) {
         return this.field_2996;
      } else {
         float var2 = (this.field_3330 + (float)(180 * (var1 - 1))) / 180.0F * 3.1415927F;
         float var3 = class_1715.method_9555(var2);
         return this.field_2996 + (double)var3 * 1.3D;
      }
   }

   // $FF: renamed from: c (float, float, float) float
   private float method_4544(float var1, float var2, float var3) {
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

   // $FF: renamed from: b (int, sv) void
   private void method_4545(int var1, class_752 var2) {
      double var10002;
      double var10003;
      int var10005;
      label22: {
         label24: {
            String[] var3 = class_752.method_4253();
            var10002 = var2.field_2994;
            var10003 = var2.field_2995 + (double)var2.method_3880() * 0.5D;
            var10005 = var1;
            if(var3 != null) {
               if(var1 != 0) {
                  break label24;
               }

               float var4;
               var10005 = (var4 = this.field_3028.nextFloat() - 0.001F) == 0.0F?0:(var4 < 0.0F?-1:1);
            }

            if(var3 == null) {
               break label22;
            }

            if(var10005 < 0) {
               var10005 = 1;
               break label22;
            }
         }

         var10005 = 0;
      }

      this.method_4546(var1, var10002, var10003, var2.field_2996, (boolean)var10005);
   }

   // $FF: renamed from: b (int, double, double, double, boolean) void
   private void method_4546(int var1, double var2, double var4, double var6, boolean var8) {
      this.field_2990.method_2211((class_792)null, 1014, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
      String[] var10000 = class_752.method_4253();
      double var10 = this.method_4541(var1);
      double var12 = this.method_4542(var1);
      double var14 = this.method_4543(var1);
      double var16 = var2 - var10;
      double var18 = var4 - var12;
      double var20 = var6 - var14;
      class_709 var10001 = new class_709;
      var10001.method_4065(this.field_2990, this, var16, var18, var20);
      class_709 var22 = var10001;
      String[] var9 = var10000;
      if(var9 != null) {
         if(var8) {
            var22.method_4070(true);
         }

         var22.field_2995 = var12;
         var22.field_2994 = var10;
         var22.field_2996 = var14;
         this.field_2990.method_2089(var22);
      }

   }

   // $FF: renamed from: b (sv, float) void
   public void method_404(class_752 var1, float var2) {
      this.method_4545(0, var1);
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.method_3961();
      if(var3 != null) {
         if(!var10000) {
            if(var1 == class_1691.field_8834) {
               return false;
            }

            Object var4;
            int var7;
            Object var8;
            label103: {
               label113: {
                  var7 = this.method_4549();
                  if(var3 != null) {
                     if(var7 > 0) {
                        return false;
                     }

                     var8 = this;
                     if(var3 == null) {
                        break label113;
                     }

                     var7 = this.method_4553();
                  }

                  if(var7 != 0) {
                     label126: {
                        var4 = var1.method_9344();
                        var10000 = var4 instanceof class_713;
                        if(var3 == null) {
                           return var10000;
                        }

                        if(!var10000) {
                           var10000 = var4 instanceof class_806;
                           if(var3 == null) {
                              return var10000;
                           }

                           if(!var10000) {
                              var10000 = var4 instanceof class_804;
                              if(var3 == null) {
                                 return var10000;
                              }

                              if(!var10000) {
                                 var8 = var4;
                                 if(var3 == null) {
                                    break label103;
                                 }

                                 if(!(var4 instanceof class_805)) {
                                    break label126;
                                 }
                              }
                           }
                        }

                        var10000 = false;
                        return var10000;
                     }
                  }

                  var8 = var1.method_9345();
               }

               var4 = var8;
               var8 = var4;
            }

            label76: {
               label116: {
                  if(var3 != null) {
                     if(var8 == null) {
                        break label116;
                     }

                     var8 = var4;
                  }

                  var7 = var8 instanceof class_792;
                  if(var3 == null) {
                     break label76;
                  }

                  if(var7 == 0) {
                     var7 = var4 instanceof class_752;
                     if(var3 == null) {
                        break label76;
                     }

                     if(var7 != 0 && ((class_752)var4).method_4213() == this.method_4213()) {
                        return false;
                     }
                  }
               }

               var7 = this.field_3612;
            }

            if(var3 != null) {
               if(var7 <= 0) {
                  this.field_3612 = 20;
               }

               var7 = 0;
            }

            int var5 = var7;

            class_791 var6;
            while(true) {
               if(var5 < this.field_3611.length) {
                  var6 = this;
                  if(var3 == null) {
                     break;
                  }

                  this.field_3611[var5] += 3;
                  ++var5;
                  if(var3 != null) {
                     continue;
                  }
               }

               var6 = this;
               break;
            }

            return var6.method_3896(var1, var2);
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      this.method_3914(class_1010.field_5255, 1);
      String[] var3 = class_752.method_4253();
      ahb var10000 = this.field_2990;
      if(var3 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this.field_2990;
      }

      Iterator var4 = var10000.method_2157(class_792.class, this.field_3004.method_7097(50.0D, 100.0D, 50.0D)).iterator();

      while(var4.hasNext()) {
         class_792 var5 = (class_792)var4.next();
         var5.method_4614(class_1600.field_8360);
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: w () void
   public void method_4270() {
      this.field_3338 = 0;
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      return 15728880;
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {}

   // $FF: renamed from: c (v5) void
   public void method_4179(class_1645 var1) {}

   // $FF: renamed from: bk () boolean
   protected boolean method_4225() {
      return true;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(300.0D);
      this.method_4211(class_1840.field_9393).method_390(0.6000000238418579D);
      this.method_4211(class_1840.field_9391).method_390(40.0D);
   }

   // $FF: renamed from: u (int) float
   public float method_4547(int var1) {
      return this.field_3607[var1];
   }

   // $FF: renamed from: v (int) float
   public float method_4548(int var1) {
      return this.field_3606[var1];
   }

   // $FF: renamed from: a8 () int
   public int method_4549() {
      return this.field_3036.method_9501(20);
   }

   // $FF: renamed from: w (int) void
   public void method_4550(int var1) {
      this.field_3036.method_9506(20, Integer.valueOf(var1));
   }

   // $FF: renamed from: x (int) int
   public int method_4551(int var1) {
      return this.field_3036.method_9501(17 + var1);
   }

   // $FF: renamed from: c (int, int) void
   public void method_4552(int var1, int var2) {
      this.field_3036.method_9506(17 + var1, Integer.valueOf(var2));
   }

   // $FF: renamed from: a9 () boolean
   public boolean method_4553() {
      String[] var1 = class_752.method_4253();
      float var2;
      int var10000 = (var2 = this.method_406() - this.method_405() / 2.0F) == 0.0F?0:(var2 < 0.0F?-1:1);
      if(var1 != null) {
         var10000 = var10000 <= 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: bd () at
   public class_923 method_4213() {
      return class_923.field_4664;
   }

   // $FF: renamed from: a (sa) void
   public void method_3925(class_689 var1) {
      this.field_2988 = null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
