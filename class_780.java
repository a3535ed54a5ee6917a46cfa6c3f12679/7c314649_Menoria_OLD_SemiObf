import java.util.UUID;

// $FF: renamed from: ya
public class class_780 extends class_779 {

   // $FF: renamed from: bp java.util.UUID
   private static final UUID field_3558;
   // $FF: renamed from: bq x5
   private static final class_1716 field_3559;
   // $FF: renamed from: br boolean[]
   private static boolean[] field_3560;
   // $FF: renamed from: bs int
   private int field_3561;
   // $FF: renamed from: bt int
   private int field_3562;
   // $FF: renamed from: bu sa
   private class_689 field_3563;
   // $FF: renamed from: bv boolean
   private boolean field_3564;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3565;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.6F, 2.9F);
      this.field_3025 = 1.0F;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(40.0D);
      this.method_4211(class_1840.field_9393).method_390(0.30000001192092896D);
      this.method_4211(class_1840.field_9394).method_390(7.0D);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, new Byte((byte)0));
      this.field_3036.method_9497(17, new Byte((byte)0));
      this.field_3036.method_9497(18, new Byte((byte)0));
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var2 = field_3565;
      var1.method_8666("carried", (short)aji.method_2415(this.method_4507()));
      var1.method_8666("carriedData", (short)this.method_4509());
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var2 = field_3565;
      this.method_4506(aji.method_2416(var1.method_8680("carried")));
      this.method_4508(var1.method_8680("carriedData"));
   }

   // $FF: renamed from: bR () sa
   protected class_689 method_4332() {
      String[] var10000 = class_752.method_4253();
      class_792 var2 = this.field_2990.method_2176(this, 64.0D);
      String[] var1 = var10000;
      if(var2 != null) {
         class_780 var3 = this;
         if(var1 != null) {
            if(this.method_4502(var2)) {
               int var10001;
               label36: {
                  this.field_3564 = true;
                  int var4 = this.field_3562;
                  if(var1 != null) {
                     if(this.field_3562 == 0) {
                        String[] var10004 = field_3565;
                        this.field_2990.method_2084(var2.field_2994, var2.field_2995, var2.field_2996, "mob.endermen.stare", 1.0F, 1.0F);
                     }

                     var3 = this;
                     var10001 = this.field_3562;
                     if(var1 == null) {
                        break label36;
                     }

                     var4 = this.field_3562++;
                  }

                  if(var4 != 5) {
                     return null;
                  }

                  this.field_3562 = 0;
                  var3 = this;
                  var10001 = 1;
               }

               var3.method_4511((boolean)var10001);
               return var2;
            }

            var3 = this;
         }

         var3.field_3562 = 0;
      }

      return null;
   }

   // $FF: renamed from: f (yz) boolean
   private boolean method_4502(class_792 var1) {
      String[] var2;
      label34: {
         String[] var10000 = class_752.method_4253();
         add var3 = var1.field_3616.field_2845[3];
         var2 = var10000;
         add var10 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label34;
            }

            var10 = var3;
         }

         if(var10.method_3730() == adb.method_2920(class_1192.field_6112)) {
            return false;
         }
      }

      int var11;
      label37: {
         azw var4 = var1.method_4240(1.0F).method_5090();
         azw var5 = azw.method_5086(this.field_2994 - var1.field_2994, this.field_3004.field_6910 + (double)(this.field_3015 / 2.0F) - (var1.field_2995 + (double)var1.method_3880()), this.field_2996 - var1.field_2996);
         double var6 = var5.method_5097();
         var5 = var5.method_5090();
         double var8 = var4.method_5091(var5);
         double var12;
         var11 = (var12 = var8 - (1.0D - 0.025D / var6)) == 0.0D?0:(var12 < 0.0D?-1:1);
         if(var2 != null) {
            if(var11 <= 0) {
               break label37;
            }

            var11 = var1.method_4239(this);
         }

         if(var2 == null) {
            return (boolean)var11;
         }

         if(var11 != 0) {
            var11 = 1;
            return (boolean)var11;
         }
      }

      var11 = 0;
      return (boolean)var11;
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var1;
      class_780 var10;
      Object var10000;
      label249: {
         var1 = class_752.method_4253();
         var10000 = this;
         if(var1 != null) {
            if(this.method_3875()) {
               this.method_3896(class_1691.field_8834, 1.0F);
            }

            var10 = this;
            if(var1 == null) {
               break label249;
            }

            var10000 = this.field_3563;
         }

         if(var10000 != this.field_3433) {
            class_80 var2 = this.method_4211(class_1840.field_9393);
            var2.method_394(field_3559);
            var10 = this;
            if(var1 == null) {
               break label249;
            }

            if(this.field_3433 != null) {
               var2.method_393(field_3559);
            }
         }

         this.field_3563 = this.field_3433;
         var10 = this;
      }

      int var11 = var10.field_2990.field_1832;
      int var8;
      if(var1 != null) {
         label233: {
            if(!var10.field_2990.field_1832) {
               class_1038 var12 = this.field_2990.method_2196();
               String[] var7 = field_3565;
               var11 = var12.method_5878("mobGriefing");
               if(var1 == null) {
                  break label233;
               }

               if(var11 != 0) {
                  label251: {
                     var10 = this;
                     int var3;
                     int var4;
                     aji var5;
                     if(var1 != null) {
                        if(this.method_4507().method_2424() == awt.field_4170) {
                           var11 = this.field_3028.nextInt(20);
                           if(var1 == null) {
                              break label233;
                           }

                           if(var11 != 0) {
                              break label251;
                           }

                           var8 = class_1715.method_9561(this.field_2994 - 2.0D + this.field_3028.nextDouble() * 4.0D);
                           var3 = class_1715.method_9561(this.field_2995 + this.field_3028.nextDouble() * 3.0D);
                           var4 = class_1715.method_9561(this.field_2996 - 2.0D + this.field_3028.nextDouble() * 4.0D);
                           var5 = this.field_2990.getBlock(var8, var3, var4);
                           if(var1 != null && field_3560[aji.method_2415(var5)]) {
                              this.method_4506(var5);
                              this.method_4508(this.field_2990.method_33(var8, var3, var4));
                              this.field_2990.method_2058(var8, var3, var4, class_1192.field_6025);
                           }

                           if(var1 != null) {
                              break label251;
                           }
                        }

                        var10 = this;
                     }

                     var11 = var10.field_3028.nextInt(2000);
                     if(var1 == null) {
                        break label233;
                     }

                     if(var11 == 0) {
                        var8 = class_1715.method_9561(this.field_2994 - 1.0D + this.field_3028.nextDouble() * 2.0D);
                        var3 = class_1715.method_9561(this.field_2995 + this.field_3028.nextDouble() * 2.0D);
                        var11 = class_1715.method_9561(this.field_2996 - 1.0D + this.field_3028.nextDouble() * 2.0D);
                        if(var1 == null) {
                           break label233;
                        }

                        var4 = var11;
                        var5 = this.field_2990.getBlock(var8, var3, var4);
                        aji var6 = this.field_2990.getBlock(var8, var3 - 1, var4);
                        if(var5.method_2424() == awt.field_4170) {
                           label253: {
                              aji var13 = var6;
                              if(var1 != null) {
                                 if(var6.method_2424() == awt.field_4170) {
                                    break label253;
                                 }

                                 var13 = var6;
                              }

                              var11 = var13.method_2434();
                              if(var1 == null) {
                                 break label233;
                              }

                              if(var11 != 0) {
                                 this.field_2990.method_2054(var8, var3, var4, this.method_4507(), this.method_4509(), 3);
                                 this.method_4506(class_1192.field_6025);
                              }
                           }
                        }
                     }
                  }
               }
            }

            var11 = 0;
         }
      }

      var8 = var11;

      label196: {
         while(true) {
            if(var8 < 2) {
               String[] var10001 = field_3565;
               this.field_2990.method_2087("portal", this.field_2994 + (this.field_3028.nextDouble() - 0.5D) * (double)this.field_3014, this.field_2995 + this.field_3028.nextDouble() * (double)this.field_3015 - 0.25D, this.field_2996 + (this.field_3028.nextDouble() - 0.5D) * (double)this.field_3014, (this.field_3028.nextDouble() - 0.5D) * 2.0D, -this.field_3028.nextDouble(), (this.field_3028.nextDouble() - 0.5D) * 2.0D);
               ++var8;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            }

            var11 = this.field_2990.method_2078();
            if(var1 == null) {
               break label196;
            }

            if(var11 != 0) {
               var11 = this.field_2990.field_1832;
               if(var1 == null) {
                  break label196;
               }

               if(!this.field_2990.field_1832) {
                  float var9 = this.method_3884(1.0F);
                  float var15;
                  var11 = (var15 = var9 - 0.5F) == 0.0F?0:(var15 < 0.0F?-1:1);
                  if(var1 == null) {
                     break label196;
                  }

                  if(var11 > 0) {
                     var11 = this.field_2990.method_2067(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996));
                     if(var1 == null) {
                        break label196;
                     }

                     if(var11 != 0) {
                        float var16;
                        var11 = (var16 = this.field_3028.nextFloat() * 30.0F - (var9 - 0.4F) * 2.0F) == 0.0F?0:(var16 < 0.0F?-1:1);
                        if(var1 == null) {
                           break label196;
                        }

                        if(var11 < 0) {
                           this.field_3433 = null;
                           this.method_4511(false);
                           this.field_3564 = false;
                           this.method_4503();
                        }
                     }
                  }
               }
            }
            break;
         }

         var11 = this.method_3875();
      }

      label255: {
         label256: {
            boolean var14;
            label261: {
               if(var1 != null) {
                  label167: {
                     if(var11 == 0) {
                        var14 = this.method_3936();
                        if(var1 == null) {
                           break label261;
                        }

                        if(!var14) {
                           break label167;
                        }
                     }

                     this.field_3433 = null;
                     this.method_4511(false);
                     this.field_3564 = false;
                     this.method_4503();
                  }
               }

               var10000 = this;
               if(var1 == null) {
                  break label256;
               }

               var14 = this.method_4510();
            }

            if(var14) {
               var10000 = this;
               if(var1 == null) {
                  break label256;
               }

               if(!this.field_3564) {
                  var10000 = this;
                  if(var1 == null) {
                     break label256;
                  }

                  if(this.field_3028.nextInt(100) == 0) {
                     this.method_4511(false);
                  }
               }
            }

            this.field_3346 = false;
            var10 = this;
            if(var1 == null) {
               break label255;
            }

            var10000 = this.field_3433;
         }

         if(var10000 != null) {
            this.method_4272(this.field_3433, 100.0F, 100.0F);
         }

         var10 = this;
      }

      if(var1 != null) {
         label144: {
            if(!var10.field_2990.field_1832) {
               var10 = this;
               if(var1 == null) {
                  break label144;
               }

               if(this.method_3917()) {
                  label140: {
                     var10 = this;
                     if(var1 != null) {
                        if(this.field_3433 != null) {
                           var11 = this.field_3433 instanceof class_792;
                           if(var1 != null) {
                              label259: {
                                 if(var11 != 0) {
                                    var11 = this.method_4502((class_792)this.field_3433);
                                    if(var1 == null) {
                                       break label259;
                                    }

                                    if(var11 != 0) {
                                       var10 = this;
                                       if(var1 != null) {
                                          if(this.field_3433.method_3891(this) < 16.0D) {
                                             this.method_4503();
                                          }

                                          var10 = this;
                                       }

                                       var10.field_3561 = 0;
                                       if(var1 != null) {
                                          break label140;
                                       }
                                    }
                                 }

                                 var10 = this;
                                 if(var1 == null) {
                                    break label144;
                                 }

                                 double var17;
                                 var11 = (var17 = this.field_3433.method_3891(this) - 256.0D) == 0.0D?0:(var17 < 0.0D?-1:1);
                              }
                           }

                           if(var11 <= 0) {
                              break label140;
                           }

                           var10 = this;
                           if(var1 == null) {
                              break label144;
                           }

                           if(this.field_3561++ < 30) {
                              break label140;
                           }

                           var10 = this;
                           if(var1 == null) {
                              break label144;
                           }

                           if(!this.method_4504(this.field_3433)) {
                              break label140;
                           }

                           this.field_3561 = 0;
                           if(var1 != null) {
                              break label140;
                           }
                        }

                        this.method_4511(false);
                        var10 = this;
                     }

                     var10.field_3561 = 0;
                  }
               }
            }

            var10 = this;
         }
      }

      var10.method_4231();
   }

   // $FF: renamed from: bZ () boolean
   protected boolean method_4503() {
      double var1 = this.field_2994 + (this.field_3028.nextDouble() - 0.5D) * 64.0D;
      double var3 = this.field_2995 + (double)(this.field_3028.nextInt(64) - 32);
      double var5 = this.field_2996 + (this.field_3028.nextDouble() - 0.5D) * 64.0D;
      return this.method_4505(var1, var3, var5);
   }

   // $FF: renamed from: c (sa) boolean
   protected boolean method_4504(class_689 var1) {
      azw var2 = azw.method_5086(this.field_2994 - var1.field_2994, this.field_3004.field_6910 + (double)(this.field_3015 / 2.0F) - var1.field_2995 + (double)var1.method_3880(), this.field_2996 - var1.field_2996);
      var2 = var2.method_5090();
      double var3 = 16.0D;
      double var5 = this.field_2994 + (this.field_3028.nextDouble() - 0.5D) * 8.0D - var2.field_4220 * var3;
      double var7 = this.field_2995 + (double)(this.field_3028.nextInt(16) - 8) - var2.field_4221 * var3;
      double var9 = this.field_2996 + (this.field_3028.nextDouble() - 0.5D) * 8.0D - var2.field_4222 * var3;
      return this.method_4505(var5, var7, var9);
   }

   // $FF: renamed from: k (double, double, double) boolean
   protected boolean method_4505(double var1, double var3, double var5) {
      double var8 = this.field_2994;
      String[] var10000 = class_752.method_4253();
      double var10 = this.field_2995;
      String[] var7 = var10000;
      double var12 = this.field_2996;
      this.field_2994 = var1;
      this.field_2995 = var3;
      this.field_2996 = var5;
      byte var14 = 0;
      int var15 = class_1715.method_9561(this.field_2994);
      int var16 = class_1715.method_9561(this.field_2995);
      int var17 = class_1715.method_9561(this.field_2996);
      int var32 = this.field_2990.method_2048(var15, var16, var17);
      if(var7 != null) {
         label79: {
            if(var32 != 0) {
               byte var18 = 0;

               while(true) {
                  if(var18 == 0) {
                     var32 = var16;
                     if(var7 == null || var7 == null) {
                        break;
                     }

                     if(var16 > 0) {
                        label60: {
                           aji var19 = this.field_2990.getBlock(var15, var16 - 1, var17);
                           if(var7 != null) {
                              if(var19.method_2424().method_5065()) {
                                 var18 = 1;
                                 if(var7 != null) {
                                    break label60;
                                 }
                              }

                              --this.field_2995;
                           }

                           --var16;
                        }

                        if(var7 != null) {
                           continue;
                        }
                     }
                  }

                  var32 = var18;
                  break;
               }

               if(var7 == null) {
                  break label79;
               }

               if(var32 != 0) {
                  this.method_3854(this.field_2994, this.field_2995, this.field_2996);
                  var32 = this.field_2990.method_2096(this, this.field_3004).isEmpty();
                  if(var7 == null) {
                     break label79;
                  }

                  if(var32 != 0) {
                     var32 = this.field_2990.method_2120(this.field_3004);
                     if(var7 == null) {
                        break label79;
                     }

                     if(var32 == 0) {
                        var14 = 1;
                     }
                  }
               }
            }

            var32 = var14;
         }
      }

      if(var7 != null) {
         if(var32 != 0) {
            short var33 = 128;
            int var34 = 0;

            while(true) {
               String[] var31;
               if(var34 < var33) {
                  double var20 = (double)var34 / ((double)var33 - 1.0D);
                  float var22 = (this.field_3028.nextFloat() - 0.5F) * 0.2F;
                  float var23 = (this.field_3028.nextFloat() - 0.5F) * 0.2F;
                  float var24 = (this.field_3028.nextFloat() - 0.5F) * 0.2F;
                  double var25 = var8 + (this.field_2994 - var8) * var20 + (this.field_3028.nextDouble() - 0.5D) * (double)this.field_3014 * 2.0D;
                  double var27 = var10 + (this.field_2995 - var10) * var20 + this.field_3028.nextDouble() * (double)this.field_3015;
                  double var29 = var12 + (this.field_2996 - var12) * var20 + (this.field_3028.nextDouble() - 0.5D) * (double)this.field_3014 * 2.0D;
                  var31 = field_3565;
                  this.field_2990.method_2087("portal", var25, var27, var29, (double)var22, (double)var23, (double)var24);
                  ++var34;
                  if(var7 == null) {
                     break;
                  }

                  if(var7 != null) {
                     continue;
                  }
               }

               var31 = field_3565;
               this.field_2990.method_2084(var8, var10, var12, "mob.endermen.portal", 1.0F, 1.0F);
               this.method_3868("mob.endermen.portal", 1.0F, 1.0F);
               break;
            }

            return true;
         }

         this.method_3854(var8, var10, var12);
         var32 = 0;
      }

      return (boolean)var32;
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String var10000;
      if(this.method_4510()) {
         String[] var1 = field_3565;
         var10000 = "mob.endermen.scream";
      } else {
         String[] var2 = field_3565;
         var10000 = "mob.endermen.idle";
      }

      return var10000;
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3565;
      return "mob.endermen.hit";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3565;
      return "mob.endermen.death";
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5225;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      String[] var10000 = class_752.method_4253();
      adb var4 = this.method_4267();
      String[] var3 = var10000;
      if(var4 != null) {
         int var5 = this.field_3028.nextInt(2 + var2);
         int var6 = 0;

         while(var6 < var5) {
            this.method_3914(var4, 1);
            ++var6;
            if(var3 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: a (aji) void
   public void method_4506(aji var1) {
      this.field_3036.method_9506(16, Byte.valueOf((byte)(aji.method_2415(var1) & 255)));
   }

   // $FF: renamed from: cb () aji
   public aji method_4507() {
      return aji.method_2416(this.field_3036.method_9499(16));
   }

   // $FF: renamed from: a (int) void
   public void method_4508(int var1) {
      this.field_3036.method_9506(17, Byte.valueOf((byte)(var1 & 255)));
   }

   // $FF: renamed from: cc () int
   public int method_4509() {
      return this.field_3036.method_9499(17);
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000) {
            return false;
         }

         this.method_4511(true);
         var10000 = var1 instanceof class_1692;
      }

      if(var3 != null) {
         label56: {
            if(var10000) {
               var10000 = var1.method_9345() instanceof class_792;
               if(var3 == null) {
                  break label56;
               }

               if(var10000) {
                  this.field_3564 = true;
               }
            }

            var10000 = var1 instanceof class_1693;
         }
      }

      if(var3 != null) {
         if(var10000) {
            this.field_3564 = false;
            int var4 = 0;

            while(true) {
               if(var4 < 64) {
                  label64: {
                     var10000 = this.method_4503();
                     if(var3 == null) {
                        break;
                     }

                     if(var3 != null) {
                        if(!var10000) {
                           ++var4;
                           if(var3 != null) {
                              continue;
                           }
                           break label64;
                        }

                        var10000 = true;
                     }

                     return var10000;
                  }
               }

               var10000 = false;
               break;
            }

            return var10000;
         }

         var10000 = super.method_3896(var1, var2);
      }

      return var10000;
   }

   // $FF: renamed from: cd () boolean
   public boolean method_4510() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(18);
      if(var1 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (boolean) void
   public void method_4511(boolean var1) {
      String[] var2 = class_752.method_4253();
      int var10002 = var1;
      if(var2 != null) {
         var10002 = var1 != 0?1:0;
      }

      this.field_3036.method_9506(18, Byte.valueOf((byte)var10002));
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
