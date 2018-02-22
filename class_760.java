
// $FF: renamed from: wH
public class class_760 extends class_759 implements class_10 {

   // $FF: renamed from: a1 int
   public int field_3419;
   // $FF: renamed from: a2 double
   public double field_3420;
   // $FF: renamed from: a3 double
   public double field_3421;
   // $FF: renamed from: a4 double
   public double field_3422;
   // $FF: renamed from: a5 sa
   private class_689 field_3423;
   // $FF: renamed from: a6 int
   private int field_3424;
   // $FF: renamed from: a7 int
   public int field_3425;
   // $FF: renamed from: a8 int
   public int field_3426;
   // $FF: renamed from: a9 int
   private int field_3427;
   // $FF: renamed from: by java.lang.String
   private static final String field_3428;
   // $FF: renamed from: fb java.lang.String[]
   private static final String[] field_3429;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3427 = 1;
      this.method_3852(4.0F, 4.0F);
      this.field_3035 = true;
      this.field_3367 = 5;
   }

   // $FF: renamed from: a () boolean
   public boolean method_4326() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(16);
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000) {
            return false;
         }

         String[] var4 = field_3429;
         var10000 = "fireball".equals(var1.method_9352());
      }

      if(var3 != null) {
         if(var10000) {
            var10000 = var1.method_9345() instanceof class_792;
            if(var3 == null) {
               return var10000;
            }

            if(var10000) {
               super.method_3896(var1, 1000.0F);
               ((class_792)var1.method_9345()).method_4614(class_1600.field_8350);
               return true;
            }
         }

         var10000 = super.method_3896(var1, var2);
      }

      return var10000;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(10.0D);
   }

   // $FF: renamed from: bq () void
   protected void method_4236() {
      String[] var1 = class_752.method_4253();
      class_760 var10000 = this;
      if(var1 != null) {
         label181: {
            if(!this.field_2990.field_1832) {
               var10000 = this;
               if(var1 == null) {
                  break label181;
               }

               if(this.field_2990.field_1818 == class_918.field_4627) {
                  this.method_3851();
               }
            }

            this.method_4270();
            this.field_3425 = this.field_3426;
            var10000 = this;
         }
      }

      int var23;
      Object var24;
      label185: {
         double var2;
         double var4;
         double var6;
         double var8;
         label186: {
            label173: {
               var2 = var10000.field_3420 - this.field_2994;
               var4 = this.field_3421 - this.field_2995;
               var6 = this.field_3422 - this.field_2996;
               var8 = var2 * var2 + var4 * var4 + var6 * var6;
               if(var1 != null) {
                  if(var8 >= 1.0D) {
                     double var28;
                     var23 = (var28 = var8 - 3600.0D) == 0.0D?0:(var28 < 0.0D?-1:1);
                     if(var1 == null) {
                        break label186;
                     }

                     if(var23 <= 0) {
                        break label173;
                     }
                  }

                  this.field_3420 = this.field_2994 + (double)((this.field_3028.nextFloat() * 2.0F - 1.0F) * 16.0F);
                  this.field_3421 = this.field_2995 + (double)((this.field_3028.nextFloat() * 2.0F - 1.0F) * 16.0F);
               }

               this.field_3422 = this.field_2996 + (double)((this.field_3028.nextFloat() * 2.0F - 1.0F) * 16.0F);
            }

            var24 = this;
            if(var1 == null) {
               break label185;
            }

            var23 = this.field_3419--;
         }

         if(var23 <= 0) {
            label159: {
               this.field_3419 += this.field_3028.nextInt(5) + 2;
               var8 = (double)class_1715.method_9558(var8);
               var10000 = this;
               double var10001 = this.field_3420;
               if(var1 != null) {
                  if(this.method_4327(this.field_3420, this.field_3421, this.field_3422, var8)) {
                     this.field_2997 += var2 / var8 * 0.1D;
                     this.field_2998 += var4 / var8 * 0.1D;
                     this.field_2999 += var6 / var8 * 0.1D;
                     if(var1 != null) {
                        break label159;
                     }
                  }

                  this.field_3420 = this.field_2994;
                  this.field_3421 = this.field_2995;
                  var10000 = this;
                  var10001 = this.field_2996;
               }

               var10000.field_3422 = var10001;
            }
         }

         var24 = this.field_3423;
      }

      if(var1 != null) {
         label151: {
            if(var24 != null) {
               var24 = this.field_3423;
               if(var1 == null) {
                  break label151;
               }

               if(this.field_3423.field_3012) {
                  this.field_3423 = null;
               }
            }

            var24 = this.field_3423;
         }
      }

      label145: {
         label187: {
            if(var1 != null) {
               class_760 var25;
               label138: {
                  if(var24 != null) {
                     var10000 = this;
                     var25 = this;
                     if(var1 == null) {
                        break label138;
                     }

                     if(this.field_3424-- > 0) {
                        break label145;
                     }
                  }

                  var10000 = this;
                  var25 = this;
               }

               var10000.field_3423 = var25.field_2990.method_2176(this, 100.0D);
               var10000 = this;
               if(var1 == null) {
                  break label187;
               }

               var24 = this.field_3423;
            }

            if(var24 == null) {
               break label145;
            }

            var10000 = this;
         }

         var10000.field_3424 = 20;
      }

      label128: {
         label189: {
            label126: {
               double var10 = 64.0D;
               var10000 = this;
               if(var1 != null) {
                  if(this.field_3423 != null) {
                     double var29;
                     var23 = (var29 = this.field_3423.method_3891(this) - var10 * var10) == 0.0D?0:(var29 < 0.0D?-1:1);
                     if(var1 == null) {
                        break label126;
                     }

                     if(var23 < 0) {
                        label112: {
                           label190: {
                              double var12 = this.field_3423.field_2994 - this.field_2994;
                              double var14 = this.field_3423.field_3004.field_6910 + (double)(this.field_3423.field_3015 / 2.0F) - (this.field_2995 + (double)(this.field_3015 / 2.0F));
                              double var16 = this.field_3423.field_2996 - this.field_2996;
                              this.field_3330 = this.field_3000 = -((float)Math.atan2(var12, var16)) * 180.0F / 3.1415927F;
                              var23 = this.method_4239(this.field_3423);
                              if(var1 != null) {
                                 if(var23 != 0) {
                                    label192: {
                                       var23 = this.field_3426;
                                       byte var26 = 10;
                                       if(var1 != null) {
                                          if(this.field_3426 == 10) {
                                             this.field_2990.method_2211((class_792)null, 1007, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
                                          }

                                          ++this.field_3426;
                                          var10000 = this;
                                          if(var1 == null) {
                                             break label192;
                                          }

                                          var23 = this.field_3426;
                                          var26 = 20;
                                       }

                                       if(var23 != var26) {
                                          break label112;
                                       }

                                       var10000 = this;
                                    }

                                    var10000.field_2990.method_2211((class_792)null, 1008, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
                                    class_711 var27 = new class_711;
                                    var27.method_4065(this.field_2990, this, var12, var14, var16);
                                    class_711 var18 = var27;
                                    var18.field_3177 = this.field_3427;
                                    double var19 = 4.0D;
                                    azw var21 = this.method_4240(1.0F);
                                    var18.field_2994 = this.field_2994 + var21.field_4220 * var19;
                                    var18.field_2995 = this.field_2995 + (double)(this.field_3015 / 2.0F) + 0.5D;
                                    var18.field_2996 = this.field_2996 + var21.field_4222 * var19;
                                    this.field_2990.method_2089(var18);
                                    this.field_3426 = -40;
                                    if(var1 != null) {
                                       break label112;
                                    }
                                 }

                                 var10000 = this;
                                 if(var1 == null) {
                                    break label190;
                                 }

                                 var23 = this.field_3426;
                              }

                              if(var23 <= 0) {
                                 break label112;
                              }

                              var10000 = this;
                           }

                           --var10000.field_3426;
                        }

                        if(var1 != null) {
                           break label189;
                        }
                     }
                  }

                  this.field_3330 = this.field_3000 = -((float)Math.atan2(this.field_2997, this.field_2999)) * 180.0F / 3.1415927F;
                  var10000 = this;
               }

               var23 = var10000.field_3426;
            }

            if(var1 == null) {
               break label128;
            }

            if(var23 > 0) {
               --this.field_3426;
            }
         }

         var23 = this.field_2990.field_1832;
      }

      if(var1 != null) {
         if(var23 != 0) {
            return;
         }

         var23 = this.field_3036.method_9499(16);
      }

      int var22 = var23;
      var23 = this.field_3426;
      if(var1 != null) {
         var23 = this.field_3426 > 10?1:0;
      }

      byte var13 = (byte)var23;
      if(var22 != var13) {
         this.field_3036.method_9506(16, Byte.valueOf(var13));
      }

   }

   // $FF: renamed from: b (double, double, double, double) boolean
   private boolean method_4327(double var1, double var3, double var5, double var7) {
      double var10 = (this.field_3420 - this.field_2994) / var7;
      double var12 = (this.field_3421 - this.field_2995) / var7;
      double var14 = (this.field_3422 - this.field_2996) / var7;
      String[] var10000 = class_752.method_4253();
      class_1343 var16 = this.field_3004.method_7108();
      String[] var9 = var10000;
      int var17 = 1;

      boolean var18;
      while(true) {
         if((double)var17 < var7) {
            var16.method_7104(var10, var12, var14);
            if(var9 != null) {
               var18 = this.field_2990.method_2096(this, var16).isEmpty();
               if(var9 == null) {
                  break;
               }

               if(!var18) {
                  return false;
               }

               ++var17;
            }

            if(var9 != null) {
               continue;
            }
         }

         var18 = true;
         break;
      }

      return var18;
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3429;
      return "mob.ghast.moan";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3429;
      return "mob.ghast.scream";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3429;
      return "mob.ghast.death";
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5147;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = this.field_3028.nextInt(2) + this.field_3028.nextInt(1 + var2);
      int var5 = 0;
      String[] var3 = var10000;

      while(true) {
         if(var5 < var4) {
            this.method_3914(class_1010.field_5227, 1);
            ++var5;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var4 = this.field_3028.nextInt(3) + this.field_3028.nextInt(1 + var2);
         break;
      }

      var5 = 0;

      while(var5 < var4) {
         this.method_3914(class_1010.field_5147, 1);
         ++var5;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: bf () float
   protected float method_4216() {
      return 10.0F;
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      boolean var3;
      label26: {
         class_760 var2;
         label29: {
            String[] var1 = class_752.method_4253();
            int var10000 = this.field_3028.nextInt(20);
            if(var1 != null) {
               if(var10000 != 0) {
                  break label26;
               }

               var2 = this;
               if(var1 == null) {
                  break label29;
               }

               var10000 = super.method_4274();
            }

            if(var10000 == 0) {
               break label26;
            }

            var2 = this;
         }

         if(var2.field_2990.field_1818 != class_918.field_4627) {
            var3 = true;
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: bB () int
   public int method_4276() {
      return 1;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3429;
      var1.method_8667("ExplosionPower", this.field_3427);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var2 = class_752.method_4253();
      class_760 var10000 = this;
      class_1583 var10001 = var1;
      if(var2 != null) {
         super.method_3908(var1);
         String[] var3 = field_3429;
         if(!var1.initGui8("ExplosionPower", 99)) {
            return;
         }

         var10000 = this;
         var10001 = var1;
      }

      String[] var10002 = field_3429;
      var10000.field_3427 = var10001.method_8681("ExplosionPower");
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
