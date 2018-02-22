import ca.diiza.e.class_804;
import ca.diiza.e.class_805;
import ca.diiza.e.class_806;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

// $FF: renamed from: sv
public abstract class class_752 extends class_689 {

   // $FF: renamed from: b java.util.UUID
   private static final UUID field_3305;
   // $FF: renamed from: c x5
   private static final class_1716 field_3306;
   // $FF: renamed from: d x8
   private class_1721 field_3307;
   // $FF: renamed from: e vW
   private final class_1689 field_3308;
   // $FF: renamed from: f java.util.HashMap
   private final HashMap field_3309;
   // $FF: renamed from: g add[]
   private final add[] field_3310;
   // $FF: renamed from: at boolean
   public boolean field_3311;
   // $FF: renamed from: au int
   public int field_3312;
   // $FF: renamed from: av int
   public int field_3313;
   // $FF: renamed from: aw float
   public float field_3314;
   // $FF: renamed from: ax int
   public int field_3315;
   // $FF: renamed from: ay int
   public int field_3316;
   // $FF: renamed from: az float
   public float field_3317;
   // $FF: renamed from: aA int
   public int field_3318;
   // $FF: renamed from: aB int
   public int field_3319;
   // $FF: renamed from: aC float
   public float field_3320;
   // $FF: renamed from: aD float
   public float field_3321;
   // $FF: renamed from: aE float
   public float field_3322;
   // $FF: renamed from: aF float
   public float field_3323;
   // $FF: renamed from: aG float
   public float field_3324;
   // $FF: renamed from: aH int
   public int field_3325;
   // $FF: renamed from: aI float
   public float field_3326;
   // $FF: renamed from: aJ float
   public float field_3327;
   // $FF: renamed from: aK float
   public float field_3328;
   // $FF: renamed from: aL float
   public float field_3329;
   // $FF: renamed from: aM float
   public float field_3330;
   // $FF: renamed from: aN float
   public float field_3331;
   // $FF: renamed from: aO float
   public float field_3332;
   // $FF: renamed from: aP float
   public float field_3333;
   // $FF: renamed from: aQ float
   public float field_3334;
   // $FF: renamed from: aR yz
   protected class_792 field_3335;
   // $FF: renamed from: aS int
   protected int field_3336;
   // $FF: renamed from: aT boolean
   protected boolean field_3337;
   // $FF: renamed from: aU int
   public int field_3338;
   // $FF: renamed from: aV float
   protected float field_3339;
   // $FF: renamed from: aW float
   protected float field_3340;
   // $FF: renamed from: aX float
   protected float field_3341;
   // $FF: renamed from: aY float
   protected float field_3342;
   // $FF: renamed from: aZ float
   protected float field_3343;
   // $FF: renamed from: ba int
   protected int field_3344;
   // $FF: renamed from: bb float
   protected float field_3345;
   // $FF: renamed from: bc boolean
   protected boolean field_3346;
   // $FF: renamed from: bd float
   public float field_3347;
   // $FF: renamed from: be float
   public float field_3348;
   // $FF: renamed from: bf float
   protected float field_3349;
   // $FF: renamed from: bg int
   protected int field_3350;
   // $FF: renamed from: bh double
   protected double field_3351;
   // $FF: renamed from: bi double
   protected double field_3352;
   // $FF: renamed from: bj double
   protected double field_3353;
   // $FF: renamed from: bk double
   protected double field_3354;
   // $FF: renamed from: bl double
   protected double field_3355;
   // $FF: renamed from: h boolean
   private boolean field_3356;
   // $FF: renamed from: i sv
   private class_752 field_3357;
   // $FF: renamed from: bm int
   private int field_3358;
   // $FF: renamed from: bn sv
   private class_752 field_3359;
   // $FF: renamed from: bo int
   private int field_3360;
   // $FF: renamed from: bp float
   private float field_3361;
   // $FF: renamed from: bq int
   private int field_3362;
   // $FF: renamed from: br float
   private float field_3363;
   private static final String __OBFID;
   // $FF: renamed from: a0 java.lang.String[]
   private static String[] field_3364;
   // $FF: renamed from: eb java.lang.String[]
   private static final String[] field_3365;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      class_1689 var10001 = new class_1689;
      var10001.method_9311(this);
      this.field_3308 = var10001;
      this.field_3309 = new HashMap();
      this.field_3310 = new add[5];
      this.field_3325 = 20;
      this.field_3334 = 0.02F;
      this.field_3356 = true;
      this.method_4157();
      this.method_4188(this.method_405());
      this.field_2986 = true;
      this.field_3329 = (float)(Math.random() + 1.0D) * 0.01F;
      this.method_3854(this.field_2994, this.field_2995, this.field_2996);
      this.field_3328 = (float)Math.random() * 12398.0F;
      this.field_3000 = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.field_3332 = this.field_3000;
      this.field_3025 = 0.5F;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      this.field_3036.method_9497(7, Integer.valueOf(0));
      this.field_3036.method_9497(8, Byte.valueOf((byte)0));
      this.field_3036.method_9497(9, Byte.valueOf((byte)0));
      this.field_3036.method_9497(6, Float.valueOf(1.0F));
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      String[] var10000 = method_4253();
      this.method_4212().method_9617(class_1840.field_9390);
      String[] var1 = var10000;
      this.method_4212().method_9617(class_1840.field_9392);
      this.method_4212().method_9617(class_1840.field_9393);
      class_752 var2 = this;
      if(var1 != null) {
         if(this.method_4225()) {
            return;
         }

         var2 = this;
      }

      var2.method_4211(class_1840.field_9393).method_390(0.10000000149011612D);
   }

   // $FF: renamed from: a (double, boolean) void
   protected void method_3870(double var1, boolean var3) {
      String[] var4 = method_4253();
      int var10000 = this.method_3876();
      if(var4 != null) {
         if(var10000 == 0) {
            this.method_3877();
         }

         var10000 = var3;
      }

      class_752 var10;
      label81: {
         label80: {
            if(var4 != null) {
               if(var10000 == 0) {
                  break label80;
               }

               var10 = this;
               if(var4 == null) {
                  break label81;
               }

               float var12;
               var10000 = (var12 = this.field_3019 - 0.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
            }

            if(var10000 > 0) {
               int var5;
               int var6;
               int var7;
               aji var8;
               label86: {
                  label87: {
                     var5 = class_1715.method_9561(this.field_2994);
                     var6 = class_1715.method_9561(this.field_2995 - 0.20000000298023224D - (double)this.field_3013);
                     var7 = class_1715.method_9561(this.field_2996);
                     var8 = this.field_2990.getBlock(var5, var6, var7);
                     aji var11 = var8;
                     if(var4 != null) {
                        if(var8.method_2424() != awt.field_4170) {
                           break label87;
                        }

                        var11 = this.field_2990.getBlock(var5, var6 - 1, var7);
                     }

                     label61: {
                        label88: {
                           int var9 = var11.method_2436();
                           var10000 = var9;
                           byte var10001 = 11;
                           if(var4 != null) {
                              if(var9 == 11) {
                                 break label88;
                              }

                              var10000 = var9;
                              var10001 = 32;
                           }

                           if(var4 != null) {
                              if(var10000 == var10001) {
                                 break label88;
                              }

                              var10000 = var9;
                              var10001 = 21;
                           }

                           if(var10000 != var10001) {
                              break label61;
                           }
                        }

                        var8 = this.field_2990.getBlock(var5, var6 - 1, var7);
                     }

                     if(var4 != null) {
                        break label86;
                     }
                  }

                  label89: {
                     var10000 = this.field_2990.field_1832;
                     if(var4 != null) {
                        if(this.field_2990.field_1832) {
                           break label86;
                        }

                        var10 = this;
                        if(var4 == null) {
                           break label89;
                        }

                        float var13;
                        var10000 = (var13 = this.field_3019 - 3.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
                     }

                     if(var10000 <= 0) {
                        break label86;
                     }

                     var10 = this;
                  }

                  var10.field_2990.method_2210(2006, var5, var6, var7, class_1715.method_9566(this.field_3019 - 3.0F));
               }

               var8.method_2516(this.field_2990, var5, var6, var7, this, this.field_3019);
            }
         }

         var10 = this;
      }

      var10.method_3870(var1, (boolean)var3);
   }

   // $FF: renamed from: aE () boolean
   public boolean method_4158() {
      return false;
   }

   // $FF: renamed from: C () void
   public void method_3857() {
      String[] var1;
      class_752 var9;
      byte var10;
      label235: {
         label234: {
            label238: {
               String[] var10000 = method_4253();
               this.field_3320 = this.field_3321;
               var1 = var10000;
               super.method_3857();
               String[] var7 = field_3365;
               this.field_2990.field_1829.method_8332("livingEntityBaseTick");
               boolean var8 = this.method_3917();
               if(var1 != null) {
                  label239: {
                     if(var8) {
                        var8 = this.method_3918();
                        if(var1 == null) {
                           break label239;
                        }

                        if(var8) {
                           this.method_3896(class_1691.field_8833, 1.0F);
                        }
                     }

                     var9 = this;
                     if(var1 == null) {
                        break label238;
                     }

                     var8 = this.method_3873();
                  }
               }

               if(!var8) {
                  var10 = this.field_2990.field_1832;
                  if(var1 == null) {
                     break label235;
                  }

                  if(!this.field_2990.field_1832) {
                     break label234;
                  }
               }

               var9 = this;
            }

            var9.method_3861();
         }

         var10 = this instanceof class_792;
      }

      label215: {
         label240: {
            if(var1 != null) {
               if(var10 == 0) {
                  break label240;
               }

               var10 = ((class_792)this).field_3640.field_2836;
            }

            if(var1 == null) {
               break label215;
            }

            if(var10 != 0) {
               var10 = 1;
               break label215;
            }
         }

         var10 = 0;
      }

      int var11;
      label204: {
         label203: {
            byte var2 = var10;
            var9 = this;
            if(var1 != null) {
               label201: {
                  if(this.method_3917()) {
                     var9 = this;
                     if(var1 == null) {
                        break label201;
                     }

                     if(this.method_3879(awt.field_4177)) {
                        var11 = this.method_4158();
                        if(var1 != null) {
                           label178: {
                              if(var11 == 0) {
                                 var11 = this.method_4176(class_1635.field_8503.field_8526);
                                 if(var1 == null) {
                                    break label178;
                                 }

                                 if(var11 == 0) {
                                    var11 = var2;
                                    if(var1 == null) {
                                       break label178;
                                    }

                                    if(var2 == 0) {
                                       this.method_3950(this.method_4162(this.method_3949()));
                                       var11 = this.method_3949();
                                       if(var1 == null) {
                                          break label178;
                                       }

                                       if(var11 == -20) {
                                          this.method_3950(0);
                                          int var3 = 0;

                                          while(true) {
                                             if(var3 < 8) {
                                                float var4 = this.field_3028.nextFloat() - this.field_3028.nextFloat();
                                                float var5 = this.field_3028.nextFloat() - this.field_3028.nextFloat();
                                                float var6 = this.field_3028.nextFloat() - this.field_3028.nextFloat();
                                                String[] var10001 = field_3365;
                                                this.field_2990.method_2087("bubble", this.field_2994 + (double)var4, this.field_2995 + (double)var5, this.field_2996 + (double)var6, this.field_2997, this.field_2998, this.field_2999);
                                                ++var3;
                                                if(var1 == null) {
                                                   break;
                                                }

                                                if(var1 != null) {
                                                   continue;
                                                }
                                             }

                                             this.method_3896(class_1691.field_8834, 2.0F);
                                             break;
                                          }
                                       }
                                    }
                                 }
                              }

                              var11 = this.field_2990.field_1832;
                           }
                        }

                        if(var1 == null) {
                           break label204;
                        }

                        if(var11 != 0) {
                           break label203;
                        }

                        var11 = this.method_3937();
                        if(var1 == null) {
                           break label204;
                        }

                        if(var11 == 0) {
                           break label203;
                        }

                        var11 = this.field_2988 instanceof class_752;
                        if(var1 == null) {
                           break label204;
                        }

                        if(var11 == 0) {
                           break label203;
                        }

                        this.method_3925((class_689)null);
                        if(var1 != null) {
                           break label203;
                        }
                     }
                  }

                  var9 = this;
               }
            }

            var9.method_3950(300);
         }

         var11 = this.method_3917();
      }

      if(var1 != null) {
         label156: {
            if(var11 != 0) {
               var11 = this.method_3875();
               if(var1 == null) {
                  break label156;
               }

               if(var11 != 0) {
                  this.method_3861();
               }
            }

            this.field_3326 = this.field_3327;
            var11 = this.field_3319;
         }
      }

      if(var1 != null) {
         if(var11 > 0) {
            --this.field_3319;
         }

         var11 = this.field_3315;
      }

      if(var1 != null) {
         if(var11 > 0) {
            --this.field_3315;
         }

         var11 = this.field_3033;
      }

      if(var1 != null) {
         label146: {
            if(var11 > 0) {
               var11 = this instanceof class_793;
               if(var1 == null) {
                  break label146;
               }

               if(var11 == 0) {
                  --this.field_3033;
               }
            }

            float var12;
            var11 = (var12 = this.method_406() - 0.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
         }
      }

      label140: {
         label242: {
            if(var1 != null) {
               if(var11 <= 0) {
                  this.method_4160();
               }

               var9 = this;
               if(var1 == null) {
                  break label242;
               }

               var11 = this.field_3336;
            }

            if(var11 > 0) {
               --this.field_3336;
               if(var1 != null) {
                  break label140;
               }
            }

            var9 = this;
         }

         var9.field_3335 = null;
      }

      var9 = this.field_3359;
      if(var1 != null) {
         label127: {
            if(this.field_3359 != null) {
               var9 = this.field_3359;
               if(var1 == null) {
                  break label127;
               }

               if(!this.field_3359.method_3917()) {
                  this.field_3359 = null;
               }
            }

            var9 = this.field_3357;
         }
      }

      if(var1 != null) {
         label120: {
            if(var9 != null) {
               label118: {
                  var11 = this.field_3357.method_3917();
                  if(var1 != null) {
                     if(var11 == 0) {
                        this.method_4168((class_752)null);
                        if(var1 != null) {
                           break label118;
                        }
                     }

                     var9 = this;
                     if(var1 == null) {
                        break label120;
                     }

                     var11 = this.field_3029 - this.field_3358;
                  }

                  if(var11 > 100) {
                     this.method_4168((class_752)null);
                  }
               }
            }

            this.method_4173();
            this.field_3342 = this.field_3341;
            this.field_3331 = this.field_3330;
            this.field_3333 = this.field_3332;
            this.field_3002 = this.field_3000;
            this.field_3003 = this.field_3001;
            var9 = this;
         }
      }

      var9.field_2990.field_1829.method_8333();
   }

   // $FF: renamed from: f () boolean
   public boolean method_4159() {
      return false;
   }

   // $FF: renamed from: aF () void
   protected void method_4160() {
      ++this.field_3318;
      String[] var1 = method_4253();
      int var10000 = this.field_3318;
      if(var1 != null) {
         if(this.field_3318 != 20) {
            return;
         }

         var10000 = this.field_2990.field_1832;
      }

      int var2;
      if(var1 != null) {
         label60: {
            label59: {
               if(var10000 == 0) {
                  label70: {
                     var10000 = this.field_3336;
                     if(var1 != null) {
                        if(this.field_3336 <= 0) {
                           var10000 = this.method_4164();
                           if(var1 == null) {
                              break label60;
                           }

                           if(var10000 == 0) {
                              break label70;
                           }
                        }

                        var10000 = this.method_4161();
                     }

                     if(var1 == null) {
                        break label60;
                     }

                     if(var10000 != 0) {
                        class_1038 var12 = this.field_2990.method_2196();
                        String[] var9 = field_3365;
                        var10000 = var12.method_5878("doMobLoot");
                        if(var1 == null) {
                           break label60;
                        }

                        if(var10000 != 0) {
                           var2 = this.method_4163(this.field_3335);

                           while(var2 > 0) {
                              int var3 = class_715.method_4090(var2);
                              var2 -= var3;
                              ahb var13 = this.field_2990;
                              class_715 var10001 = new class_715;
                              var10001.method_4087(this.field_2990, this.field_2994, this.field_2995, this.field_2996, var3);
                              var13.method_2089(var10001);
                              if(var1 == null) {
                                 break label59;
                              }

                              if(var1 == null) {
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               this.method_3851();
            }

            var10000 = 0;
         }
      }

      var2 = var10000;

      while(var2 < 20) {
         double var10 = this.field_3028.nextGaussian() * 0.02D;
         double var5 = this.field_3028.nextGaussian() * 0.02D;
         double var7 = this.field_3028.nextGaussian() * 0.02D;
         String[] var11 = field_3365;
         this.field_2990.method_2087("explode", this.field_2994 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, this.field_2995 + (double)(this.field_3028.nextFloat() * this.field_3015), this.field_2996 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, var10, var5, var7);
         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: aG () boolean
   protected boolean method_4161() {
      String[] var1 = method_4253();
      boolean var10000 = this.method_4159();
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: j (int) int
   protected int method_4162(int var1) {
      String[] var10000 = method_4253();
      int var3 = class_980.method_5653(this);
      String[] var2 = var10000;
      int var4 = var3;
      if(var2 != null) {
         label18: {
            if(var3 > 0) {
               var4 = this.field_3028.nextInt(var3 + 1);
               if(var2 == null) {
                  break label18;
               }

               if(var4 > 0) {
                  var4 = var1;
                  return var4;
               }
            }

            var4 = var1;
         }
      }

      --var4;
      return var4;
   }

   // $FF: renamed from: e (yz) int
   protected int method_4163(class_792 var1) {
      return 0;
   }

   // $FF: renamed from: aH () boolean
   protected boolean method_4164() {
      return false;
   }

   // $FF: renamed from: aI () java.util.Random
   public Random method_4165() {
      return this.field_3028;
   }

   // $FF: renamed from: aJ () sv
   public class_752 method_4166() {
      return this.field_3357;
   }

   // $FF: renamed from: aK () int
   public int method_4167() {
      return this.field_3358;
   }

   // $FF: renamed from: b (sv) void
   public void method_4168(class_752 var1) {
      this.field_3357 = var1;
      this.field_3358 = this.field_3029;
   }

   // $FF: renamed from: aL () sv
   public class_752 method_4169() {
      return this.field_3359;
   }

   // $FF: renamed from: aM () int
   public int method_4170() {
      return this.field_3360;
   }

   // $FF: renamed from: l (sa) void
   public void method_4171(class_689 var1) {
      label17: {
         label16: {
            String[] var2 = method_4253();
            if(var2 != null) {
               if(!(var1 instanceof class_752)) {
                  break label16;
               }

               this.field_3359 = (class_752)var1;
            }

            if(var2 != null) {
               break label17;
            }
         }

         this.field_3359 = null;
      }

      this.field_3360 = this.field_3029;
   }

   // $FF: renamed from: aN () int
   public int method_4172() {
      return this.field_3338;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var10000 = method_4253();
      String[] var10 = field_3365;
      var1.method_8669("HealF", this.method_406());
      var1.method_8666("Health", (short)((int)Math.ceil((double)this.method_406())));
      String[] var2 = var10000;
      var1.method_8666("HurtTime", (short)this.field_3315);
      var1.method_8666("DeathTime", (short)this.field_3318);
      var1.method_8666("AttackTime", (short)this.field_3319);
      var1.method_8669("AbsorptionAmount", this.method_4245());
      add[] var3 = this.method_3934();
      int var4 = var3.length;
      int var5 = 0;

      label83: {
         add var6;
         while(true) {
            if(var5 < var4) {
               var6 = var3[var5];
               if(var2 != null) {
                  if(var2 == null) {
                     if(var6 != null) {
                        this.field_3307.method_9621(var6.method_3787());
                     }

                     ++var5;
                     if(var2 == null) {
                        break label83;
                     }
                     break;
                  }

                  if(var6 != null) {
                     this.field_3307.method_9620(var6.method_3787());
                  }

                  ++var5;
                  if(var2 != null) {
                     continue;
                  }
               } else if(var2 != null) {
                  continue;
               }
            }

            var10 = field_3365;
            var1.method_8664("Attributes", class_1840.method_9951(this.method_4212()));
            var3 = this.method_3934();
            var4 = var3.length;
            var5 = 0;
            break;
         }

         label75:
         do {
            while(true) {
               if(var5 >= var4) {
                  break label75;
               }

               var6 = var3[var5];
               if(var2 == null) {
                  return;
               }

               if(var2 != null) {
                  if(var6 != null) {
                     this.field_3307.method_9621(var6.method_3787());
                  }

                  ++var5;
                  break;
               }

               if(var2 == null) {
                  break label75;
               }
            }
         } while(var2 != null);
      }

      if(!this.field_3309.isEmpty()) {
         class_1580 var11 = new class_1580;
         var11.method_8628();
         class_1580 var7 = var11;
         Iterator var8 = this.field_3309.values().iterator();

         while(true) {
            if(var8.hasNext()) {
               class_1645 var9 = (class_1645)var8.next();
               class_1583 var10002 = new class_1583;
               var10002.method_8628();
               var7.method_8650(var9.method_9025(var10002));
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            }

            String[] var10001 = field_3365;
            var1.method_8664("ActiveEffects", var7);
            break;
         }
      }

   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10000 = method_4253();
      String[] var7 = field_3365;
      this.method_4246(var1.method_8683("AbsorptionAmount"));
      String[] var2 = var10000;
      boolean var9 = var1.initGui8("Attributes", 9);
      if(var2 != null) {
         label90: {
            if(var9) {
               label94: {
                  ahb var10 = this.field_2990;
                  if(var2 != null) {
                     if(this.field_2990 == null) {
                        break label94;
                     }

                     var10 = this.field_2990;
                  }

                  var9 = var10.field_1832;
                  if(var2 == null) {
                     break label90;
                  }

                  if(!var10.field_1832) {
                     class_1721 var11 = this.method_4212();
                     var7 = field_3365;
                     class_1840.method_9954(var11, var1.method_8689("Attributes", 10));
                  }
               }
            }

            var7 = field_3365;
            var9 = var1.initGui8("ActiveEffects", 9);
         }
      }

      label95: {
         Object var3;
         label78: {
            class_1583 var13;
            String var10001;
            label96: {
               if(var2 != null) {
                  if(var9) {
                     var7 = field_3365;
                     var3 = var1.method_8689("ActiveEffects", 10);
                     int var4 = 0;

                     while(var4 < ((class_1580)var3).method_8658()) {
                        class_1583 var5 = ((class_1580)var3).method_8653(var4);
                        class_1645 var6 = class_1645.method_9026(var5);
                        if(var2 == null) {
                           break label78;
                        }

                        if(var2 != null) {
                           if(var6 != null) {
                              this.field_3309.put(Integer.valueOf(var6.method_9016()), var6);
                           }

                           ++var4;
                        }

                        if(var2 == null) {
                           break;
                        }
                     }
                  }

                  var13 = var1;
                  var7 = field_3365;
                  var10001 = "HealF";
                  if(var2 == null) {
                     break label96;
                  }

                  var9 = var1.initGui8("HealF", 99);
               }

               if(var9) {
                  var7 = field_3365;
                  this.method_4188(var1.method_8683("HealF"));
                  if(var2 != null) {
                     break label95;
                  }
               }

               var13 = var1;
               var7 = field_3365;
               var10001 = "Health";
            }

            var3 = var13.initGui5(var10001);
         }

         Object var14 = var3;
         if(var2 != null) {
            if(var3 == null) {
               this.method_4188(this.method_405());
               if(var2 != null) {
                  break label95;
               }
            }

            var14 = var3;
         }

         byte var8 = ((class_1571)var14).method_8631();
         byte var12 = 5;
         if(var2 != null) {
            if(var8 == 5) {
               this.method_4188(((class_1576)var3).method_8641());
               if(var2 != null) {
                  break label95;
               }
            }

            var8 = ((class_1571)var3).method_8631();
            var12 = 2;
         }

         if(var8 == var12) {
            this.method_4188((float)((class_1573)var3).method_8638());
         }
      }

      var7 = field_3365;
      this.field_3315 = var1.method_8680("HurtTime");
      this.field_3318 = var1.method_8680("DeathTime");
      this.field_3319 = var1.method_8680("AttackTime");
   }

   // $FF: renamed from: aO () void
   protected void method_4173() {
      String[] var10000 = method_4253();
      Iterator var2 = this.field_3309.keySet().iterator();
      String[] var1 = var10000;

      int var15;
      class_752 var16;
      while(true) {
         if(var2.hasNext()) {
            Integer var3 = (Integer)var2.next();
            class_1645 var4 = (class_1645)this.field_3309.get(var3);
            var15 = var4.method_9021(this);
            if(var1 == null) {
               break;
            }

            label141: {
               if(var1 != null) {
                  if(var15 == 0) {
                     var16 = this;
                     if(var1 != null) {
                        if(this.field_2990.field_1832) {
                           break label141;
                        }

                        var2.remove();
                        var16 = this;
                     }

                     var16.method_4186(var4);
                     if(var1 != null) {
                        break label141;
                     }
                  }

                  var15 = var4.method_9017() % 600;
               }

               if(var15 == 0) {
                  this.method_4185(var4, false);
               }
            }

            if(var1 != null) {
               continue;
            }
         }

         var15 = this.field_3356;
         break;
      }

      int var13;
      if(var1 != null) {
         if(var15 != 0) {
            var16 = this;
            if(var1 != null) {
               if(!this.field_2990.field_1832) {
                  label151: {
                     var15 = this.field_3309.isEmpty();
                     if(var1 != null) {
                        if(var15 != 0) {
                           this.field_3036.method_9506(8, Byte.valueOf((byte)0));
                           this.field_3036.method_9506(7, Integer.valueOf(0));
                           this.method_3944(false);
                           if(var1 != null) {
                              break label151;
                           }
                        }

                        var15 = class_1011.method_5758(this.field_3309.values());
                     }

                     var13 = var15;
                     class_1710 var19 = this.field_3036;
                     int var10002 = class_1011.method_5759(this.field_3309.values());
                     if(var1 != null) {
                        var10002 = var10002 != 0?1:0;
                     }

                     var19.method_9506(8, Byte.valueOf((byte)var10002));
                     this.field_3036.method_9506(7, Integer.valueOf(var13));
                     this.method_3944(this.method_4176(class_1635.field_8504.field_8526));
                  }
               }

               var16 = this;
            }

            var16.field_3356 = false;
         }

         var15 = this.field_3036.method_9501(7);
      }

      var13 = var15;
      var15 = this.field_3036.method_9499(8);
      if(var1 != null) {
         var15 = var15 > 0?1:0;
      }

      int var14 = var15;
      if(var1 != null) {
         if(var13 <= 0) {
            return;
         }

         boolean var20 = false;
      }

      int var5;
      label153: {
         var15 = this.method_3942();
         if(var1 != null) {
            if(var15 == 0) {
               var5 = this.field_3028.nextBoolean();
               if(var1 != null) {
                  break label153;
               }
            }

            var15 = this.field_3028.nextInt(15);
         }

         if(var1 != null) {
            var15 = var15 == 0?1:0;
         }

         var5 = var15;
      }

      var15 = var14;
      if(var1 != null) {
         if(var14 != 0) {
            int var10001 = this.field_3028.nextInt(5);
            if(var1 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var5 &= var10001;
         }

         var15 = var5;
      }

      if(var1 != null) {
         if(var15 == 0) {
            return;
         }

         var15 = var13;
      }

      if(var1 != null) {
         if(var15 <= 0) {
            return;
         }

         var15 = var13 >> 16 & 255;
      }

      double var6 = (double)var15 / 255.0D;
      double var8 = (double)(var13 >> 8 & 255) / 255.0D;
      double var10 = (double)(var13 >> 0 & 255) / 255.0D;
      String var17;
      if(var14 != 0) {
         String[] var12 = field_3365;
         var17 = "mobSpellAmbient";
      } else {
         String[] var18 = field_3365;
         var17 = "mobSpell";
      }

      this.field_2990.method_2087(var17, this.field_2994 + (this.field_3028.nextDouble() - 0.5D) * (double)this.field_3014, this.field_2995 + this.field_3028.nextDouble() * (double)this.field_3015 - (double)this.field_3013, this.field_2996 + (this.field_3028.nextDouble() - 0.5D) * (double)this.field_3014, var6, var8, var10);
   }

   // $FF: renamed from: aP () void
   public void method_4174() {
      String[] var10000 = method_4253();
      Iterator var2 = this.field_3309.keySet().iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         label19: {
            Integer var3 = (Integer)var2.next();
            class_1645 var4 = (class_1645)this.field_3309.get(var3);
            class_752 var5 = this;
            if(var1 != null) {
               if(this.field_2990.field_1832) {
                  break label19;
               }

               var2.remove();
               var5 = this;
            }

            var5.method_4186(var4);
         }

         if(var1 == null) {
            break;
         }
      }

   }

   public void clearActiveDebuffs() {
      String[] var10000 = method_4253();
      Iterator var2 = this.field_3309.keySet().iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         label55: {
            Integer var3 = (Integer)var2.next();
            class_1645 var4 = (class_1645)this.field_3309.get(var3);
            boolean var6 = this.field_2990.field_1832;
            String[] var5;
            String var7;
            if(var1 != null) {
               if(this.field_2990.field_1832) {
                  break label55;
               }

               var7 = var4.method_9024();
               var5 = field_3365;
               var6 = var7.equals("potion.poison");
            }

            label56: {
               if(var1 != null) {
                  if(var6) {
                     break label56;
                  }

                  var7 = var4.method_9024();
                  var5 = field_3365;
                  var6 = var7.equals("potion.noTp");
               }

               if(var1 != null) {
                  if(var6) {
                     break label56;
                  }

                  var7 = var4.method_9024();
                  var5 = field_3365;
                  var6 = var7.equals("potion.moveSlowdown");
               }

               if(var1 != null) {
                  if(var6) {
                     break label56;
                  }

                  var7 = var4.method_9024();
                  String[] var10001 = field_3365;
                  var6 = var7.equals("potion.weakness");
               }

               if(!var6) {
                  break label55;
               }
            }

            var2.remove();
            this.method_4186(var4);
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: aQ () java.util.Collection
   public Collection method_4175() {
      return this.field_3309.values();
   }

   // $FF: renamed from: k (int) boolean
   public boolean method_4176(int var1) {
      return this.field_3309.containsKey(Integer.valueOf(var1));
   }

   // $FF: renamed from: a (v0) boolean
   public boolean method_4177(class_1635 var1) {
      return this.field_3309.containsKey(Integer.valueOf(var1.field_8526));
   }

   // $FF: renamed from: b (v0) v5
   public class_1645 method_4178(class_1635 var1) {
      return (class_1645)this.field_3309.get(Integer.valueOf(var1.field_8526));
   }

   // $FF: renamed from: c (v5) void
   public void method_4179(class_1645 var1) {
      Integer var10001;
      HashMap var3;
      label26: {
         String[] var2 = method_4253();
         boolean var10000 = this.method_4180(var1);
         if(var2 != null) {
            if(!var10000) {
               return;
            }

            var3 = this.field_3309;
            var10001 = Integer.valueOf(var1.method_9016());
            if(var2 == null) {
               break label26;
            }

            var10000 = var3.containsKey(var10001);
         }

         if(var10000) {
            ((class_1645)this.field_3309.get(Integer.valueOf(var1.method_9016()))).method_9015(var1);
            this.method_4185((class_1645)this.field_3309.get(Integer.valueOf(var1.method_9016())), true);
            if(var2 != null) {
               return;
            }
         }

         var3 = this.field_3309;
         var10001 = Integer.valueOf(var1.method_9016());
      }

      var3.put(var10001, var1);
      this.method_4184(var1);
   }

   // $FF: renamed from: d (v5) boolean
   public boolean method_4180(class_1645 var1) {
      String[] var2 = method_4253();
      int var10000;
      if(this.method_4213() == class_923.field_4664) {
         label35: {
            int var3 = var1.method_9016();
            var10000 = var3;
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(var3 != class_1635.field_8500.field_8526) {
               var10000 = var3;
               if(var2 == null) {
                  return (boolean)var10000;
               }

               if(var3 != class_1635.field_8509.field_8526) {
                  break label35;
               }
            }

            var10000 = 0;
            return (boolean)var10000;
         }
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: aR () boolean
   public boolean method_4181() {
      return this.method_4213() == class_923.field_4664;
   }

   // $FF: renamed from: l (int) void
   public void method_4182(int var1) {
      this.field_3309.remove(Integer.valueOf(var1));
   }

   // $FF: renamed from: m (int) void
   public void method_4183(int var1) {
      class_1645 var2 = (class_1645)this.field_3309.remove(Integer.valueOf(var1));
      if(var2 != null) {
         this.method_4186(var2);
      }

   }

   // $FF: renamed from: a (v5) void
   protected void method_4184(class_1645 var1) {
      this.field_3356 = true;
      if(!this.field_2990.field_1832) {
         class_1635.field_8489[var1.method_9016()].method_8984(this, this.method_4212(), var1.method_9018());
      }

   }

   // $FF: renamed from: a (v5, boolean) void
   protected void method_4185(class_1645 var1, boolean var2) {
      String[] var10000 = method_4253();
      this.field_3356 = true;
      String[] var3 = var10000;
      boolean var4 = var2;
      if(var3 != null) {
         if(!var2) {
            return;
         }

         var4 = this.field_2990.field_1832;
      }

      if(!var4) {
         class_1635.field_8489[var1.method_9016()].method_8983(this, this.method_4212(), var1.method_9018());
         class_1635.field_8489[var1.method_9016()].method_8984(this, this.method_4212(), var1.method_9018());
      }

   }

   // $FF: renamed from: b (v5) void
   protected void method_4186(class_1645 var1) {
      this.field_3356 = true;
      if(!this.field_2990.field_1832) {
         class_1635.field_8489[var1.method_9016()].method_8983(this, this.method_4212(), var1.method_9018());
      }

   }

   // $FF: renamed from: f (float) void
   public void method_4187(float var1) {
      float var2 = this.method_406();
      if(var2 > 0.0F) {
         this.method_4188(var2 + var1);
      }

   }

   // $FF: renamed from: aS () float
   public final float method_406() {
      return this.field_3036.method_9502(6);
   }

   // $FF: renamed from: g (float) void
   public void method_4188(float var1) {
      this.field_3036.method_9506(6, Float.valueOf(class_1715.method_9569(var1, 0.0F, this.method_405())));
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = method_4253();
      int var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000 != 0) {
            return false;
         }

         var10000 = this.field_2990.field_1832;
      }

      if(var3 != null) {
         if(var10000 != 0) {
            return false;
         }

         this.field_3338 = 0;
         float var17;
         var10000 = (var17 = this.method_406() - 0.0F) == 0.0F?0:(var17 < 0.0F?-1:1);
      }

      class_1691 var12;
      label208: {
         if(var3 != null) {
            if(var10000 <= 0) {
               return false;
            }

            var12 = var1;
            if(var3 == null) {
               break label208;
            }

            var10000 = var1.method_9351();
         }

         if(var10000 != 0) {
            label194: {
               boolean var13 = this.method_4177(class_1635.field_8502);
               if(var3 != null) {
                  if(!var13) {
                     break label194;
                  }

                  var13 = false;
               }

               return var13;
            }
         }

         var12 = var1;
      }

      class_752 var14;
      label187: {
         label210: {
            label185: {
               class_1691 var10001 = class_1691.field_8842;
               if(var3 != null) {
                  if(var12 == class_1691.field_8842) {
                     break label185;
                  }

                  var12 = var1;
                  var10001 = class_1691.field_8843;
               }

               if(var12 != var10001) {
                  break label210;
               }
            }

            var14 = this;
            if(var3 == null) {
               break label187;
            }

            if(this.method_4215(4) != null) {
               this.method_4215(4).method_3749((int)(var2 * 4.0F + this.field_3028.nextFloat() * var2 * 2.0F), this);
               var2 *= 0.75F;
            }
         }

         var14 = this;
      }

      int var4;
      label174: {
         var14.field_3323 = 1.5F;
         var4 = 1;
         var14 = this;
         if(var3 != null) {
            if((float)this.field_3033 > (float)this.field_3325 / 2.0F) {
               float var18;
               var10000 = (var18 = var2 - this.field_3345) == 0.0F?0:(var18 < 0.0F?-1:1);
               if(var3 != null) {
                  if(var10000 <= 0) {
                     return false;
                  }

                  this.method_4203(var1, var2 - this.field_3345);
                  this.field_3345 = var2;
                  var10000 = 0;
               }

               var4 = var10000;
               if(var3 != null) {
                  break label174;
               }
            }

            this.field_3345 = var2;
            this.field_3314 = this.method_406();
            this.field_3033 = this.field_3325;
            this.method_4203(var1, var2);
            var14 = this;
         }

         var14.field_3315 = this.field_3316 = 10;
      }

      class_689 var5;
      label166: {
         label211: {
            this.field_3317 = 0.0F;
            var5 = var1.method_9345();
            class_689 var15 = var5;
            if(var3 != null) {
               if(var5 == null) {
                  break label211;
               }

               var15 = var5;
            }

            var10000 = var15 instanceof class_752;
            if(var3 != null) {
               if(var10000 != 0) {
                  this.method_4168((class_752)var5);
               }

               var10000 = var5 instanceof class_792;
            }

            if(var3 != null) {
               if(var10000 != 0) {
                  this.field_3336 = 100;
                  this.field_3335 = (class_792)var5;
                  if(var3 != null) {
                     break label211;
                  }
               }

               var10000 = var5 instanceof class_777;
            }

            if(var3 == null) {
               break label166;
            }

            if(var10000 != 0) {
               class_777 var6 = (class_777)var5;
               var10000 = var6.method_4476();
               if(var3 == null) {
                  break label166;
               }

               if(var10000 != 0) {
                  this.field_3336 = 100;
                  this.field_3335 = null;
               }
            }
         }

         var10000 = var4;
      }

      label212: {
         String var11;
         label213: {
            if(var3 != null) {
               if(var10000 != 0) {
                  label215: {
                     Object var16 = this;
                     if(var3 != null) {
                        this.field_2990.method_2191(this, (byte)2);
                        if(var1 != class_1691.field_8834) {
                           this.method_3895();
                        }

                        var16 = var5;
                     }

                     label216: {
                        if(var3 != null) {
                           if(var16 == null) {
                              break label216;
                           }

                           var16 = var5;
                        }

                        double var10 = ((class_689)var16).field_2994 - this.field_2994;
                        double var8 = var5.field_2996 - this.field_2996;

                        while(true) {
                           if(var10 * var10 + var8 * var8 < 1.0E-4D) {
                              var10 = (Math.random() - Math.random()) * 0.01D;
                              var8 = (Math.random() - Math.random()) * 0.01D;
                              if(var3 == null) {
                                 break;
                              }

                              if(var3 != null) {
                                 continue;
                              }
                           }

                           this.field_3317 = (float)(Math.atan2(var8, var10) * 180.0D / 3.141592653589793D) - this.field_3000;
                           this.method_4192(var5, var2, var10, var8);
                           break;
                        }

                        if(var3 != null) {
                           break label215;
                        }
                     }

                     this.field_3317 = (float)((int)(Math.random() * 2.0D) * 180);
                  }
               }

               var14 = this;
               if(var3 == null) {
                  break label213;
               }

               float var19;
               var10000 = (var19 = this.method_406() - 0.0F) == 0.0F?0:(var19 < 0.0F?-1:1);
            }

            if(var10000 <= 0) {
               var11 = this.method_4194();
               if(var3 != null) {
                  if(var4 != 0 && var11 != null) {
                     this.method_3868(var11, this.method_4216(), this.method_4217());
                  }

                  this.method_4190(var1);
               }

               if(var3 != null) {
                  break label212;
               }
            }

            var14 = this;
         }

         var11 = var14.method_4193();
         var10000 = var4;
         if(var3 == null) {
            return (boolean)var10000;
         }

         if(var4 != 0 && var11 != null) {
            this.method_3868(var11, this.method_4216(), this.method_4217());
         }
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (add) void
   public void method_4189(add var1) {
      String[] var6 = field_3365;
      this.method_3868("random.break", 0.8F, 0.8F + this.field_2990.field_1819.nextFloat() * 0.4F);
      String[] var10000 = method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < 5) {
         azw var4 = azw.method_5086(((double)this.field_3028.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
         var4.method_5101(-this.field_3001 * 3.1415927F / 180.0F);
         var4.method_5102(-this.field_3000 * 3.1415927F / 180.0F);
         azw var5 = azw.method_5086(((double)this.field_3028.nextFloat() - 0.5D) * 0.3D, (double)(-this.field_3028.nextFloat()) * 0.6D - 0.3D, 0.6D);
         var5.method_5101(-this.field_3001 * 3.1415927F / 180.0F);
         var5.method_5102(-this.field_3000 * 3.1415927F / 180.0F);
         var5 = var5.method_5093(this.field_2994, this.field_2995 + (double)this.method_3880(), this.field_2996);
         ahb var7 = this.field_2990;
         StringBuilder var10001 = new StringBuilder();
         String[] var10002 = field_3365;
         var7.method_2087(var10001.append("iconcrack_").append(adb.method_2918(var1.method_3730())).toString(), var5.field_4220, var5.field_4221, var5.field_4222, var4.field_4220, var4.field_4221 + 0.05D, var4.field_4222);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (vX) void
   public void method_4190(class_1691 var1) {
      class_689 var3 = var1.method_9345();
      String[] var10000 = method_4253();
      class_752 var4 = this.method_4205();
      String[] var2 = var10000;
      Object var7 = this;
      if(var2 != null) {
         label95: {
            if(this.field_3344 >= 0) {
               var7 = var4;
               if(var2 == null) {
                  break label95;
               }

               if(var4 != null) {
                  var4.method_3899(this, this.field_3344);
               }
            }

            var7 = var3;
         }
      }

      label89: {
         if(var2 != null) {
            if(var7 == null) {
               break label89;
            }

            var7 = var3;
         }

         ((class_689)var7).method_3952(this);
      }

      this.field_3337 = true;
      this.method_4204().method_9319();
      ahb var9 = this.field_2990;
      if(var2 != null) {
         label81: {
            class_752 var11;
            label80: {
               if(!this.field_2990.field_1832) {
                  int var5 = 0;
                  boolean var10 = var3 instanceof class_792;
                  if(var2 != null) {
                     if(var10) {
                        var5 = class_980.method_5659((class_752)var3);
                     }

                     var11 = this;
                     if(var2 == null) {
                        break label80;
                     }

                     var10 = this.method_4161();
                  }

                  if(var10) {
                     var9 = this.field_2990;
                     if(var2 == null) {
                        break label81;
                     }

                     class_1038 var12 = this.field_2990.method_2196();
                     String[] var10001 = field_3365;
                     if(var12.method_5878("doMobLoot")) {
                        int var8 = this.field_3336;
                        if(var2 != null) {
                           var8 = this.field_3336 > 0?1:0;
                        }

                        this.method_4196((boolean)var8, var5);
                        var8 = this.field_3336;
                        if(var2 != null) {
                           var8 = this.field_3336 > 0?1:0;
                        }

                        this.method_4191((boolean)var8, var5);
                        var11 = this;
                        if(var2 == null) {
                           break label80;
                        }

                        if(this.field_3336 > 0) {
                           int var6 = this.field_3028.nextInt(200) - var5;
                           if(var2 == null) {
                              return;
                           }

                           if(var6 < 5) {
                              var8 = var6;
                              if(var2 != null) {
                                 var8 = var6 <= 0?1:0;
                              }

                              this.method_4195(var8);
                           }
                        }
                     }
                  }
               }

               var11 = this;
            }

            var9 = var11.field_2990;
         }
      }

      var9.method_2191(this, (byte)3);
   }

   // $FF: renamed from: a (boolean, int) void
   protected void method_4191(boolean var1, int var2) {}

   // $FF: renamed from: a (sa, float, double, double) void
   public void method_4192(class_689 var1, float var2, double var3, double var5) {
      String[] var7 = method_4253();
      double var10000 = this.field_3028.nextDouble();
      double var10001 = this.method_4211(class_1840.field_9392).method_396();
      if(var7 != null) {
         if(var10000 < var10001) {
            return;
         }

         this.field_3047 = true;
         var10000 = var3 * var3;
         var10001 = var5 * var5;
      }

      float var8 = class_1715.method_9558(var10000 + var10001);
      float var9 = 0.4F;
      this.field_2997 /= 2.0D;
      this.field_2998 /= 2.0D;
      this.field_2999 /= 2.0D;
      this.field_2997 -= var3 / (double)var8 * (double)var9;
      this.field_2998 += (double)var9;
      this.field_2999 -= var5 / (double)var8 * (double)var9;
      class_752 var10 = this;
      if(var7 != null) {
         if(this.field_2998 <= 0.4000000059604645D) {
            return;
         }

         var10 = this;
      }

      var10.field_2998 = 0.4000000059604645D;
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3365;
      return "game.neutral.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3365;
      return "game.neutral.die";
   }

   // $FF: renamed from: n (int) void
   protected void method_4195(int var1) {}

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {}

   // $FF: renamed from: h_ () boolean
   public boolean method_4197() {
      boolean var7;
      label17: {
         int var2 = class_1715.method_9561(this.field_2994);
         String[] var10000 = method_4253();
         int var3 = class_1715.method_9561(this.field_3004.field_6910);
         String[] var1 = var10000;
         int var4 = class_1715.method_9561(this.field_2996);
         aji var5 = this.field_2990.getBlock(var2, var3, var4);
         aji var6 = var5;
         aji var10001 = class_1192.field_6091;
         if(var1 != null) {
            if(var5 == class_1192.field_6091) {
               break label17;
            }

            var6 = var5;
            var10001 = class_1192.field_6131;
         }

         if(var6 != var10001) {
            var7 = false;
            return var7;
         }
      }

      var7 = true;
      return var7;
   }

   public boolean isOnCustomLadder() {
      int var1 = class_1715.method_9561(this.field_2994);
      int var2 = class_1715.method_9561(this.field_3004.field_6910);
      int var3 = class_1715.method_9561(this.field_2996);
      aji var4 = this.field_2990.getBlock(var1, var2, var3);
      return var4 == class_1192.field_6204;
   }

   // $FF: renamed from: Z () boolean
   public boolean method_3917() {
      int var10000;
      label24: {
         String[] var1 = method_4253();
         var10000 = this.field_3012;
         if(var1 != null) {
            if(this.field_3012) {
               break label24;
            }

            float var2;
            var10000 = (var2 = this.method_406() - 0.0F) == 0.0F?0:(var2 < 0.0F?-1:1);
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 > 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {
      String[] var2;
      class_1645 var14;
      float var15;
      label43: {
         String[] var10000 = method_4253();
         super.method_3874(var1);
         var2 = var10000;
         class_1645 var3 = this.method_4178(class_1635.field_8498);
         var14 = var3;
         if(var2 != null) {
            if(var3 == null) {
               var15 = 0.0F;
               break label43;
            }

            var14 = var3;
         }

         var15 = (float)(var14.method_9018() + 1);
      }

      label37: {
         float var4 = var15;
         class_1715.method_9566(var1 - 3.0F - var4);
         class_1645 var5 = this.method_4178(class_1635.field_8515);
         var14 = var5;
         if(var2 != null) {
            if(var5 == null) {
               var15 = 0.0F;
               break label37;
            }

            var14 = var5;
         }

         var15 = (float)(var14.method_9018() + 256);
      }

      float var6 = var15;
      int var7 = class_1715.method_9566(var1 - 3.0F - var6);
      int var16 = var7;
      if(var2 != null) {
         if(var7 <= 0) {
            return;
         }

         this.method_3868(this.method_4198(var7), 1.0F, 1.0F);
         this.method_3896(class_1691.field_8837, (float)var7);
         var16 = class_1715.method_9561(this.field_2994);
      }

      int var8 = var16;
      int var9 = class_1715.method_9561(this.field_2995 - 0.20000000298023224D - (double)this.field_3013);
      int var10 = class_1715.method_9561(this.field_2996);
      aji var11 = this.field_2990.getBlock(var8, var9, var10);
      aji var13 = var11;
      if(var2 != null) {
         if(var11.method_2424() == awt.field_4170) {
            return;
         }

         var13 = var11;
      }

      class_1061 var12 = var13.field_2005;
      this.method_3868(var12.method_5995(), var12.method_5992() * 0.5F, var12.method_5993() * 0.75F);
   }

   // $FF: renamed from: o (int) java.lang.String
   protected String method_4198(int var1) {
      String var10000;
      if(var1 > 4) {
         String[] var2 = field_3365;
         var10000 = "game.neutral.hurt.fall.big";
      } else {
         String[] var3 = field_3365;
         var10000 = "game.neutral.hurt.fall.small";
      }

      return var10000;
   }

   // $FF: renamed from: aj () void
   public void method_3933() {
      this.field_3315 = this.field_3316 = 10;
      this.field_3317 = 0.0F;
   }

   // $FF: renamed from: aV () int
   public int method_4199() {
      int var2 = 0;
      String[] var10000 = method_4253();
      add[] var3 = this.method_3934();
      int var4 = var3.length;
      String[] var1 = var10000;
      int var5 = 0;

      while(var5 < var4) {
         add var6 = var3[var5];
         if(var1 != null) {
            if(var6 != null) {
               label22: {
                  int var8 = var6.method_3730() instanceof class_525;
                  if(var1 != null) {
                     if(var8 == 0) {
                        break label22;
                     }

                     var8 = ((class_525)var6.method_3730()).field_2366;
                  }

                  int var7 = var8;
                  var2 += var7;
               }
            }

            ++var5;
         }

         if(var1 == null) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: h (float) void
   protected void method_4200(float var1) {}

   // $FF: renamed from: b (vX, float) float
   protected float method_4201(class_1691 var1, float var2) {
      String[] var3 = method_4253();
      int var10000 = var1.method_9339();
      if(var3 != null) {
         if(var10000 != 0) {
            return var2;
         }

         var10000 = 25 - this.method_4199();
      }

      int var4 = var10000;
      float var5 = var2 * (float)var4;
      this.method_4200(var2);
      var2 = var5 / 25.0F;
      return var2;
   }

   // $FF: renamed from: c (vX, float) float
   protected float method_4202(class_1691 var1, float var2) {
      String[] var3 = method_4253();
      int var10000 = var1.method_9342();
      if(var3 != null) {
         if(var10000 != 0) {
            return var2;
         }

         var10000 = this instanceof class_781;
      }

      if(var3 != null) {
         if(var10000 != 0) {
            var2 = var2;
         }

         var10000 = this.method_4177(class_1635.field_8501);
      }

      int var4;
      int var5;
      float var6;
      if(var3 != null) {
         if(var10000 != 0 && var1 != class_1691.field_8838) {
            var4 = (this.method_4178(class_1635.field_8501).method_9018() + 1) * 5;
            var5 = 25 - var4;
            var6 = var2 * (float)var5;
            var2 = var6 / 25.0F;
         }

         float var7;
         var10000 = (var7 = var2 - 0.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
      }

      if(var3 != null) {
         if(var10000 <= 0) {
            return 0.0F;
         }

         var10000 = class_980.method_5646(this.method_3934(), var1);
      }

      var4 = var10000;
      var10000 = var4;
      if(var3 != null) {
         if(var4 > 20) {
            var4 = 20;
         }

         var10000 = var4;
      }

      if(var3 != null) {
         if(var10000 <= 0) {
            return var2;
         }

         var10000 = var4;
      }

      int var10001 = 20;
      if(var3 != null) {
         if(var10000 > 20) {
            return var2;
         }

         var10000 = 25;
         var10001 = var4;
      }

      var5 = var10000 - var10001;
      var6 = var2 * (float)var5;
      var2 = var6 / 25.0F;
      return var2;
   }

   // $FF: renamed from: d (vX, float) void
   protected void method_4203(class_1691 var1, float var2) {
      String[] var3 = method_4253();
      class_752 var10000 = this;
      if(var3 != null) {
         if(this.method_3961()) {
            return;
         }

         var2 = this.method_4201(var1, var2);
         var10000 = this;
      }

      var2 = var10000.method_4202(var1, var2);
      float var4 = var2;
      var2 = Math.max(var2 - this.method_4245(), 0.0F);
      this.method_4246(this.method_4245() - (var4 - var2));
      float var6 = var2;
      if(var3 != null) {
         if(var2 == 0.0F) {
            return;
         }

         var6 = this.method_406();
      }

      float var5 = var6;
      this.method_4188(var5 - var2);
      this.method_4204().method_9313(var1, var5, var2);
      this.method_4246(this.method_4245() - var2);
   }

   // $FF: renamed from: aW () vW
   public class_1689 method_4204() {
      return this.field_3308;
   }

   // $FF: renamed from: aX () sv
   public class_752 method_4205() {
      String[] var1 = method_4253();
      class_752 var10000 = this.field_3308.method_9315();
      Object var2;
      if(var1 != null) {
         if(var10000 != null) {
            var2 = this.field_3308.method_9315();
            return (class_752)var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_3335;
      if(var1 != null) {
         if(var2 != null) {
            var2 = this.field_3335;
            return (class_752)var2;
         }

         var2 = this.field_3357;
      }

      if(var1 != null) {
         var2 = var2 != null?this.field_3357:null;
      }

      return (class_752)var2;
   }

   // $FF: renamed from: aY () float
   public final float method_405() {
      return (float)this.method_4211(class_1840.field_9390).method_396();
   }

   // $FF: renamed from: aZ () int
   public final int method_4206() {
      return this.field_3036.method_9499(9);
   }

   // $FF: renamed from: p (int) void
   public final void method_4207(int var1) {
      this.field_3036.method_9506(9, Byte.valueOf((byte)var1));
   }

   // $FF: renamed from: j () int
   private int method_4208() {
      String[] var1 = method_4253();
      int var10000 = this.method_4177(class_1635.field_8493);
      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = 6 - (1 + this.method_4178(class_1635.field_8493).method_9018()) * 1;
            return var10000;
         }

         var10000 = this.method_4177(class_1635.field_8494);
      }

      if(var1 != null) {
         var10000 = var10000 != 0?6 + (1 + this.method_4178(class_1635.field_8494).method_9018()) * 2:6;
      }

      return var10000;
   }

   // $FF: renamed from: ba () void
   public void method_4209() {
      ahb var2;
      label35: {
         String[] var1 = method_4253();
         int var10000 = this.field_3311;
         if(var1 != null) {
            label36: {
               if(this.field_3311) {
                  var10000 = this.field_3312;
                  if(var1 == null) {
                     break label36;
                  }

                  if(this.field_3312 < this.method_4208() / 2) {
                     var10000 = this.field_3312;
                     if(var1 == null) {
                        break label36;
                     }

                     if(this.field_3312 >= 0) {
                        return;
                     }
                  }
               }

               this.field_3312 = -1;
               this.field_3311 = true;
               var2 = this.field_2990;
               if(var1 == null) {
                  break label35;
               }

               var10000 = this.field_2990 instanceof class_354;
            }
         }

         if(var10000 == 0) {
            return;
         }

         var2 = this.field_2990;
      }

      class_1657 var3 = ((class_354)var2).method_2256();
      class_342 var10002 = new class_342;
      var10002.method_1937(this, 0);
      var3.method_9119(this, var10002);
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      String[] var2 = method_4253();
      byte var10000 = var1;
      byte var10001 = 2;
      if(var2 != null) {
         if(var1 == 2) {
            this.field_3323 = 1.5F;
            this.field_3033 = this.field_3325;
            this.field_3315 = this.field_3316 = 10;
            this.field_3317 = 0.0F;
            this.method_3868(this.method_4193(), this.method_4216(), (this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F);
            this.method_3896(class_1691.field_8839, 0.0F);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1;
         var10001 = 3;
      }

      if(var10000 == var10001) {
         this.method_3868(this.method_4194(), this.method_4216(), (this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F);
         this.method_4188(0.0F);
         this.method_4190(class_1691.field_8839);
         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: G () void
   protected void method_3862() {
      this.method_3896(class_1691.field_8838, 4.0F);
   }

   // $FF: renamed from: bb () void
   protected void method_4210() {
      int var2;
      class_752 var3;
      label24: {
         label23: {
            String[] var10000 = method_4253();
            var2 = this.method_4208();
            String[] var1 = var10000;
            var3 = this;
            if(var1 != null) {
               if(this.field_3311) {
                  ++this.field_3312;
                  var3 = this;
                  if(var1 == null) {
                     break label24;
                  }

                  if(this.field_3312 < var2) {
                     break label23;
                  }

                  this.field_3312 = 0;
                  this.field_3311 = false;
                  if(var1 != null) {
                     break label23;
                  }
               }

               var3 = this;
            }

            var3.field_3312 = 0;
         }

         var3 = this;
      }

      var3.field_3321 = (float)this.field_3312 / (float)var2;
   }

   // $FF: renamed from: a (x3) x4
   public class_80 method_4211(class_79 var1) {
      return this.method_4212().method_9615(var1);
   }

   // $FF: renamed from: bc () x8
   public class_1721 method_4212() {
      String[] var1 = method_4253();
      class_1721 var10000 = this.field_3307;
      if(var1 != null) {
         if(this.field_3307 == null) {
            class_1722 var10001 = new class_1722;
            var10001.method_9614();
            this.field_3307 = var10001;
         }

         var10000 = this.field_3307;
      }

      return var10000;
   }

   // $FF: renamed from: bd () at
   public class_923 method_4213() {
      return class_923.field_4663;
   }

   // $FF: renamed from: be () add
   public abstract add method_4214();

   // $FF: renamed from: q (int) add
   public abstract add method_4215(int var1);

   // $FF: renamed from: c (int, add) void
   public abstract void method_3935(int var1, add var2);

   // $FF: renamed from: c (boolean) void
   public void method_3941(boolean var1) {
      class_80 var3;
      label17: {
         String[] var10000 = method_4253();
         super.method_3941(var1);
         String[] var2 = var10000;
         var3 = this.method_4211(class_1840.field_9393);
         class_80 var4 = var3;
         if(var2 != null) {
            if(var3.method_392(field_3305) == null) {
               break label17;
            }

            var4 = var3;
         }

         var4.method_394(field_3306);
      }

      if(var1) {
         var3.method_393(field_3306);
      }

   }

   // $FF: renamed from: ak () add[]
   public abstract add[] method_3934();

   // $FF: renamed from: bf () float
   protected float method_4216() {
      return 1.0F;
   }

   // $FF: renamed from: bg () float
   protected float method_4217() {
      String[] var1 = method_4253();
      class_752 var10000 = this;
      float var2;
      if(var1 != null) {
         if(this.method_4159()) {
            var2 = (this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.5F;
            return var2;
         }

         var10000 = this;
      }

      var2 = (var10000.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F;
      return var2;
   }

   // $FF: renamed from: bh () boolean
   protected boolean method_4218() {
      String[] var1 = method_4253();
      float var2;
      int var10000 = (var2 = this.method_406() - 0.0F) == 0.0F?0:(var2 < 0.0F?-1:1);
      if(var1 != null) {
         var10000 = var10000 <= 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (double, double, double) void
   public void method_4219(double var1, double var3, double var5) {
      this.method_3887(var1, var3, var5, this.field_3000, this.field_3001);
   }

   // $FF: renamed from: m (sa) void
   public void method_4220(class_689 var1) {
      double var3 = var1.field_2994;
      double var5 = var1.field_3004.field_6910 + (double)var1.field_3015;
      double var7 = var1.field_2996;
      byte var9 = 1;
      String[] var2 = method_4253();
      int var10 = -var9;

      label82:
      while(true) {
         int var10000 = var10;

         label79:
         while(var10000 <= var9) {
            if(var2 == null) {
               return;
            }

            int var11 = -var9;

            while(var11 < var9) {
               var10000 = var10;
               if(var2 == null) {
                  continue label79;
               }

               label73: {
                  label89: {
                     if(var2 != null) {
                        label70: {
                           if(var10 == 0) {
                              var10000 = var11;
                              if(var2 == null) {
                                 break label70;
                              }

                              if(var11 == 0) {
                                 break label89;
                              }
                           }

                           var10000 = (int)(this.field_2994 + (double)var10);
                        }
                     }

                     int var12 = var10000;
                     int var13 = (int)(this.field_2996 + (double)var11);
                     class_1343 var14 = this.field_3004.method_7099((double)var10, 1.0D, (double)var11);
                     if(var2 == null) {
                        break label73;
                     }

                     if(this.field_2990.method_2097(var14).isEmpty()) {
                        label59: {
                           class_752 var16;
                           label90: {
                              boolean var15 = ahb.method_2135(this.field_2990, var12, (int)this.field_2995, var13);
                              if(var2 != null) {
                                 if(var15) {
                                    this.method_4219(this.field_2994 + (double)var10, this.field_2995 + 1.0D, this.field_2996 + (double)var11);
                                    return;
                                 }

                                 var16 = this;
                                 if(var2 == null) {
                                    break label90;
                                 }

                                 var15 = ahb.method_2135(this.field_2990, var12, (int)this.field_2995 - 1, var13);
                              }

                              if(!var15) {
                                 var16 = this;
                                 if(var2 == null) {
                                    break label90;
                                 }

                                 if(this.field_2990.getBlock(var12, (int)this.field_2995 - 1, var13).method_2424() != awt.field_4177) {
                                    break label59;
                                 }
                              }

                              var3 = this.field_2994 + (double)var10;
                              var5 = this.field_2995 + 1.0D;
                              var16 = this;
                           }

                           var7 = var16.field_2996 + (double)var11;
                        }
                     }
                  }

                  ++var11;
               }

               if(var2 == null) {
                  break;
               }
            }

            ++var10;
            if(var2 != null) {
               continue label82;
            }
            break;
         }

         this.method_4219(var3, var5, var7);
         return;
      }
   }

   // $FF: renamed from: bi () boolean
   public boolean method_4221() {
      return false;
   }

   // $FF: renamed from: b (add, int) vL
   public class_73 method_4222(add var1, int var2) {
      String[] var3 = method_4253();
      add var10000 = var1;
      class_73 var4;
      if(var3 != null) {
         if(var1.method_3730().method_2970()) {
            var4 = var1.method_3730().method_2971(var1.method_3745(), var2);
            return var4;
         }

         var10000 = var1;
      }

      var4 = var10000.method_3731();
      return var4;
   }

   // $FF: renamed from: bj () void
   protected void method_4223() {
      class_752 var4;
      label23: {
         String[] var10000 = method_4253();
         this.field_2998 = 0.41999998688697815D;
         String[] var1 = var10000;
         boolean var3 = this.method_4177(class_1635.field_8498);
         if(var1 != null) {
            if(var3) {
               this.field_2998 += (double)((float)(this.method_4178(class_1635.field_8498).method_9018() + 1) * 0.1F);
            }

            var4 = this;
            if(var1 == null) {
               break label23;
            }

            var3 = this.method_3940();
         }

         if(var3) {
            float var2 = this.field_3000 * 0.017453292F;
            this.field_2997 -= (double)(class_1715.method_9555(var2) * 0.2F);
            this.field_2999 += (double)(class_1715.method_9556(var2) * 0.2F);
         }

         var4 = this;
      }

      var4.field_3047 = true;
   }

   // $FF: renamed from: e (float, float) void
   public void method_4224(float var1, float var2) {
      String[] var3;
      double var4;
      float var6;
      class_752 var12;
      label365: {
         class_752 var10001;
         label364: {
            label368: {
               var3 = method_4253();
               boolean var10000 = this.method_3876();
               if(var3 != null) {
                  label361: {
                     if(var10000) {
                        label369: {
                           var12 = this;
                           if(var3 != null) {
                              if(this instanceof class_792) {
                                 var10000 = ((class_792)this).field_3640.field_2837;
                                 if(var3 == null) {
                                    break label361;
                                 }

                                 if(((class_792)this).field_3640.field_2837) {
                                    break label369;
                                 }
                              }

                              var12 = this;
                           }

                           var4 = var12.field_2995;
                           this.method_3882(var1, var2, this.method_4225()?0.04F:0.02F);
                           this.method_3864(this.field_2997, this.field_2998, this.field_2999);
                           this.field_2997 *= 0.800000011920929D;
                           this.field_2998 *= 0.800000011920929D;
                           this.field_2999 *= 0.800000011920929D;
                           this.field_2998 -= 0.02D;
                           var12 = this;
                           if(var3 == null) {
                              break label365;
                           }

                           if(!this.field_3006) {
                              break label368;
                           }

                           var12 = this;
                           var10001 = this;
                           if(var3 == null) {
                              break label364;
                           }

                           if(!this.method_3863(this.field_2997, this.field_2998 + 0.6000000238418579D - this.field_2995 + var4, this.field_2999)) {
                              break label368;
                           }

                           this.field_2998 = 0.30000001192092896D;
                           if(var3 != null) {
                              break label368;
                           }
                        }
                     }

                     var10000 = this.method_3881();
                  }
               }

               label370: {
                  Object var13;
                  label371: {
                     if(var3 != null) {
                        if(!var10000) {
                           break label370;
                        }

                        var13 = this;
                        if(var3 == null) {
                           break label371;
                        }

                        var10000 = this instanceof class_792;
                     }

                     if(var10000) {
                        var13 = (class_792)this;
                        if(var3 == null) {
                           break label371;
                        }

                        if(((class_792)var13).field_3640.field_2837) {
                           break label370;
                        }
                     }

                     var13 = this;
                  }

                  var4 = ((class_752)var13).field_2995;
                  this.method_3882(var1, var2, 0.02F);
                  this.method_3864(this.field_2997, this.field_2998, this.field_2999);
                  this.field_2997 *= 0.5D;
                  this.field_2998 *= 0.5D;
                  this.field_2999 *= 0.5D;
                  this.field_2998 -= 0.02D;
                  var12 = this;
                  if(var3 == null) {
                     break label365;
                  }

                  if(!this.field_3006) {
                     break label368;
                  }

                  var12 = this;
                  var10001 = this;
                  if(var3 == null) {
                     break label364;
                  }

                  if(!this.method_3863(this.field_2997, this.field_2998 + 0.6000000238418579D - this.field_2995 + var4, this.field_2999)) {
                     break label368;
                  }

                  this.field_2998 = 0.30000001192092896D;
                  if(var3 != null) {
                     break label368;
                  }
               }

               float var7;
               label310: {
                  var7 = 0.91F;
                  var12 = this;
                  if(var3 != null) {
                     if(!this.field_3005) {
                        break label310;
                     }

                     var12 = this;
                  }

                  var7 = var12.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_3004.field_6910) - 1, class_1715.method_9561(this.field_2996)).field_2008 * 0.91F;
               }

               label304: {
                  float var8 = 0.16277136F / (var7 * var7 * var7);
                  var12 = this;
                  if(var3 != null) {
                     if(this.field_3005) {
                        var6 = this.method_4226() * var8;
                        if(var3 != null) {
                           break label304;
                        }
                     }

                     var12 = this;
                  }

                  var6 = var12.field_3334;
               }

               this.method_3882(var1, var2, var6);
               var7 = 0.91F;
               int var14 = this.field_3005;
               if(var3 != null) {
                  if(this.field_3005) {
                     var7 = this.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_3004.field_6910) - 1, class_1715.method_9561(this.field_2996)).field_2008 * 0.91F;
                  }

                  var14 = this.method_4197();
               }

               float var9;
               int var10;
               if(var3 != null) {
                  label295: {
                     if(var14 != 0) {
                        var9 = 0.15F;
                        double var15;
                        var14 = (var15 = this.field_2997 - (double)(-var9)) == 0.0D?0:(var15 < 0.0D?-1:1);
                        if(var3 != null) {
                           if(var14 < 0) {
                              this.field_2997 = (double)(-var9);
                           }

                           double var16;
                           var14 = (var16 = this.field_2997 - (double)var9) == 0.0D?0:(var16 < 0.0D?-1:1);
                        }

                        if(var3 != null) {
                           if(var14 > 0) {
                              this.field_2997 = (double)var9;
                           }

                           double var17;
                           var14 = (var17 = this.field_2999 - (double)(-var9)) == 0.0D?0:(var17 < 0.0D?-1:1);
                        }

                        if(var3 != null) {
                           if(var14 < 0) {
                              this.field_2999 = (double)(-var9);
                           }

                           double var18;
                           var14 = (var18 = this.field_2999 - (double)var9) == 0.0D?0:(var18 < 0.0D?-1:1);
                        }

                        if(var3 != null) {
                           if(var14 > 0) {
                              this.field_2999 = (double)var9;
                           }

                           this.field_3019 = 0.0F;
                           double var19;
                           var14 = (var19 = this.field_2998 - -0.15D) == 0.0D?0:(var19 < 0.0D?-1:1);
                        }

                        if(var3 != null) {
                           if(var14 < 0) {
                              this.field_2998 = -0.15D;
                           }

                           var14 = this.method_3938();
                        }

                        label275: {
                           label376: {
                              if(var3 != null) {
                                 if(var14 == 0) {
                                    break label376;
                                 }

                                 var14 = this instanceof class_792;
                              }

                              if(var3 == null) {
                                 break label275;
                              }

                              if(var14 != 0) {
                                 var14 = 1;
                                 break label275;
                              }
                           }

                           var14 = 0;
                        }

                        var10 = var14;
                        var14 = var10;
                        if(var3 == null) {
                           break label295;
                        }

                        if(var10 != 0) {
                           double var20;
                           var14 = (var20 = this.field_2998 - 0.0D) == 0.0D?0:(var20 < 0.0D?-1:1);
                           if(var3 == null) {
                              break label295;
                           }

                           if(var14 < 0) {
                              this.field_2998 = 0.0D;
                           }
                        }
                     }

                     var14 = this.isOnCustomLadder();
                  }
               }

               if(var3 != null) {
                  label263: {
                     if(var14 != 0) {
                        var9 = 0.15F;
                        double var21;
                        var14 = (var21 = this.field_2997 - (double)(-var9)) == 0.0D?0:(var21 < 0.0D?-1:1);
                        if(var3 != null) {
                           if(var14 < 0) {
                              this.field_2997 = (double)(-var9);
                           }

                           double var22;
                           var14 = (var22 = this.field_2997 - (double)var9) == 0.0D?0:(var22 < 0.0D?-1:1);
                        }

                        if(var3 != null) {
                           if(var14 > 0) {
                              this.field_2997 = (double)var9;
                           }

                           double var23;
                           var14 = (var23 = this.field_2999 - (double)(-var9)) == 0.0D?0:(var23 < 0.0D?-1:1);
                        }

                        if(var3 != null) {
                           if(var14 < 0) {
                              this.field_2999 = (double)(-var9);
                           }

                           double var24;
                           var14 = (var24 = this.field_2999 - (double)var9) == 0.0D?0:(var24 < 0.0D?-1:1);
                        }

                        if(var3 != null) {
                           if(var14 > 0) {
                              this.field_2999 = (double)var9;
                           }

                           this.field_3019 = 0.0F;
                           double var25;
                           var14 = (var25 = this.field_2998 - -0.375D) == 0.0D?0:(var25 < 0.0D?-1:1);
                        }

                        if(var3 != null) {
                           if(var14 < 0) {
                              this.field_2998 = -0.375D;
                           }

                           var14 = this.method_3938();
                        }

                        label243: {
                           label380: {
                              if(var3 != null) {
                                 if(var14 == 0) {
                                    break label380;
                                 }

                                 var14 = this instanceof class_792;
                              }

                              if(var3 == null) {
                                 break label243;
                              }

                              if(var14 != 0) {
                                 var14 = 1;
                                 break label243;
                              }
                           }

                           var14 = 0;
                        }

                        var10 = var14;
                        var14 = var10;
                        if(var3 == null) {
                           break label263;
                        }

                        if(var10 != 0) {
                           double var26;
                           var14 = (var26 = this.field_2998 - 0.0D) == 0.0D?0:(var26 < 0.0D?-1:1);
                           if(var3 == null) {
                              break label263;
                           }

                           if(var14 < 0) {
                              this.field_2998 = 0.0D;
                           }
                        }
                     }

                     this.method_3864(this.field_2997, this.field_2998, this.field_2999);
                     var14 = this.field_3006;
                  }
               }

               label232: {
                  label381: {
                     if(var3 != null) {
                        label382: {
                           if(var14 != 0) {
                              label227: {
                                 label383: {
                                    var10000 = this.method_4197();
                                    if(var3 != null) {
                                       if(!var10000) {
                                          var14 = this.isOnCustomLadder();
                                          if(var3 == null) {
                                             break label382;
                                          }

                                          if(var14 == 0) {
                                             break label227;
                                          }
                                       }

                                       var12 = this;
                                       if(var3 == null) {
                                          break label383;
                                       }

                                       var10000 = this.isOnCustomLadder();
                                    }

                                    if(var10000) {
                                       this.field_2998 = 0.5D;
                                       if(var3 != null) {
                                          break label227;
                                       }
                                    }

                                    var12 = this;
                                 }

                                 var12.field_2998 = 0.2D;
                              }
                           }

                           var12 = this;
                           if(var3 == null) {
                              break label381;
                           }

                           var14 = this.field_2990.field_1832;
                        }
                     }

                     if(var14 != 0) {
                        label206: {
                           label385: {
                              var14 = this.field_2990.method_2048((int)this.field_2994, 0, (int)this.field_2996);
                              if(var3 != null) {
                                 if(var14 != 0) {
                                    var12 = this;
                                    if(var3 == null) {
                                       break label381;
                                    }

                                    if(this.field_2990.method_2052((int)this.field_2994, (int)this.field_2996).field_5628) {
                                       break label206;
                                    }
                                 }

                                 var12 = this;
                                 if(var3 == null) {
                                    break label385;
                                 }

                                 double var27;
                                 var14 = (var27 = this.field_2995 - 0.0D) == 0.0D?0:(var27 < 0.0D?-1:1);
                              }

                              if(var14 > 0) {
                                 this.field_2998 = -0.1D;
                                 if(var3 != null) {
                                    break label232;
                                 }
                              }

                              var12 = this;
                           }

                           var12.field_2998 = 0.0D;
                           if(var3 != null) {
                              break label232;
                           }
                        }
                     }

                     var12 = this;
                  }

                  var12.field_2998 -= 0.08D;
               }

               this.field_2998 *= 0.9800000190734863D;
               this.field_2997 *= (double)var7;
               this.field_2999 *= (double)var7;
            }

            var12 = this;
            var10001 = this;
         }

         var12.field_3322 = var10001.field_3323;
         var4 = this.field_2994 - this.field_2991;
         var12 = this;
      }

      double var11 = var12.field_2996 - this.field_2993;
      var6 = class_1715.method_9558(var4 * var4 + var11 * var11) * 4.0F;
      if(var3 != null) {
         if(var6 > 1.0F) {
            var6 = 1.0F;
         }

         this.field_3323 += (var6 - this.field_3323) * 0.4F;
         this.field_3324 += this.field_3323;
      }

   }

   // $FF: renamed from: bk () boolean
   protected boolean method_4225() {
      return false;
   }

   // $FF: renamed from: bl () float
   public float method_4226() {
      String[] var1 = method_4253();
      class_752 var10000 = this;
      float var2;
      if(var1 != null) {
         if(!this.method_4225()) {
            var2 = 0.1F;
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_3361;
      return var2;
   }

   // $FF: renamed from: i (float) void
   public void method_4227(float var1) {
      this.field_3361 = var1;
   }

   // $FF: renamed from: n (sa) boolean
   public boolean method_4228(class_689 var1) {
      this.method_4171(var1);
      return false;
   }

   // $FF: renamed from: bm () boolean
   public boolean method_4229() {
      return false;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = method_4253();
      super.method_3856();
      String[] var1 = var10000;
      class_752 var14 = this;
      int var15;
      if(var1 != null) {
         label205: {
            if(!this.field_2990.field_1832) {
               int var2 = this.method_4206();
               var15 = var2;
               if(var1 != null) {
                  label187: {
                     if(var2 > 0) {
                        var15 = this.field_3313;
                        if(var1 != null) {
                           if(this.field_3313 <= 0) {
                              this.field_3313 = 20 * (30 - var2);
                           }

                           --this.field_3313;
                           var15 = this.field_3313;
                        }

                        if(var1 == null) {
                           break label187;
                        }

                        if(var15 <= 0) {
                           this.method_4207(var2 - 1);
                        }
                     }

                     var15 = 0;
                  }
               }

               int var3 = var15;

               while(true) {
                  if(var3 < 5) {
                     add var4 = this.field_3310[var3];
                     add var5 = this.method_4215(var3);
                     if(var1 != null) {
                        var15 = add.method_3756(var5, var4);
                        if(var1 == null) {
                           break;
                        }

                        if(var15 == 0) {
                           class_1657 var17 = ((class_354)this.field_2990).method_2256();
                           class_309 var10002 = new class_309;
                           var10002.method_1763(this.method_3845(), var3, var5);
                           var17.method_9119(this, var10002);
                           add var18 = var4;
                           if(var1 != null) {
                              if(var4 != null) {
                                 this.field_3307.method_9620(var4.method_3787());
                              }

                              var18 = var5;
                           }

                           if(var18 != null) {
                              this.field_3307.method_9621(var5.method_3787());
                           }

                           add var16;
                           label175: {
                              var16 = var5;
                              if(var1 != null) {
                                 if(var5 == null) {
                                    var16 = null;
                                    break label175;
                                 }

                                 var16 = var5;
                              }

                              var16 = var16.method_3754();
                           }

                           this.field_3310[var3] = var16;
                        }

                        ++var3;
                     }

                     if(var1 != null) {
                        continue;
                     }
                  }

                  var14 = this;
                  if(var1 == null) {
                     break label205;
                  }

                  var15 = this.field_3029 % 20;
                  break;
               }

               if(var15 == 0) {
                  this.method_4204().method_9319();
               }
            }

            this.method_4231();
            var14 = this;
         }
      }

      double var11 = var14.field_2994 - this.field_2991;
      double var13 = this.field_2996 - this.field_2993;
      float var6 = (float)(var11 * var11 + var13 * var13);
      float var7 = this.field_3330;
      float var8 = 0.0F;
      this.field_3339 = this.field_3340;
      float var9 = 0.0F;
      float var19;
      var15 = (var19 = var6 - 0.0025000002F) == 0.0F?0:(var19 < 0.0F?-1:1);
      if(var1 != null) {
         if(var15 > 0) {
            var9 = 1.0F;
            var8 = (float)Math.sqrt((double)var6) * 3.0F;
            var7 = (float)Math.atan2(var13, var11) * 180.0F / 3.1415927F - 90.0F;
         }

         float var20;
         var15 = (var20 = this.field_3321 - 0.0F) == 0.0F?0:(var20 < 0.0F?-1:1);
      }

      label214: {
         if(var1 != null) {
            if(var15 > 0) {
               var7 = this.field_3000;
            }

            var14 = this;
            if(var1 == null) {
               break label214;
            }

            var15 = this.field_3005;
         }

         if(var15 == 0) {
            var9 = 0.0F;
         }

         this.field_3340 += (var9 - this.field_3340) * 0.3F;
         String[] var10 = field_3365;
         this.field_2990.field_1829.method_8332("headTurn");
         var8 = this.method_4230(var7, var8);
         this.field_2990.field_1829.method_8333();
         var14 = this;
      }

      String[] var10001 = field_3365;
      var14.field_2990.field_1829.method_8332("rangeChecks");

      label159: {
         label158: {
            label157: {
               label156: {
                  label155: {
                     label154:
                     while(true) {
                        if(this.field_3000 - this.field_3002 < -180.0F) {
                           this.field_3002 -= 360.0F;
                           if(var1 == null) {
                              break;
                           }

                           if(var1 != null) {
                              continue;
                           }
                        }

                        while(true) {
                           if(this.field_3000 - this.field_3002 < 180.0F) {
                              break label154;
                           }

                           this.field_3002 += 360.0F;
                           if(var1 == null) {
                              break label155;
                           }

                           if(var1 == null) {
                              break label154;
                           }
                        }
                     }

                     while(this.field_3330 - this.field_3331 < -180.0F) {
                        this.field_3331 -= 360.0F;
                        if(var1 == null) {
                           break label156;
                        }

                        if(var1 == null) {
                           break;
                        }
                     }
                  }

                  while(this.field_3330 - this.field_3331 >= 180.0F) {
                     this.field_3331 += 360.0F;
                     if(var1 == null) {
                        break label157;
                     }

                     if(var1 == null) {
                        break;
                     }
                  }
               }

               while(this.field_3001 - this.field_3003 < -180.0F) {
                  this.field_3003 -= 360.0F;
                  if(var1 == null) {
                     break label158;
                  }

                  if(var1 == null) {
                     break;
                  }
               }
            }

            while(this.field_3001 - this.field_3003 >= 180.0F) {
               this.field_3003 += 360.0F;
               if(var1 == null) {
                  break label159;
               }

               if(var1 == null) {
                  break;
               }
            }
         }

         while(this.field_3332 - this.field_3333 < -180.0F) {
            this.field_3333 -= 360.0F;
            if(var1 == null) {
               return;
            }

            if(var1 == null) {
               break;
            }
         }
      }

      while(true) {
         if(this.field_3332 - this.field_3333 >= 180.0F) {
            this.field_3333 += 360.0F;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_2990.field_1829.method_8333();
         this.field_3341 += var8;
         break;
      }

   }

   // $FF: renamed from: f (float, float) float
   protected float method_4230(float var1, float var2) {
      String[] var10000 = method_4253();
      float var4 = class_1715.method_9579(var1 - this.field_3330);
      String[] var3 = var10000;
      this.field_3330 += var4 * 0.3F;
      float var5 = class_1715.method_9579(this.field_3000 - this.field_3330);
      float var8;
      int var7 = (var8 = var5 - -90.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
      if(var3 != null) {
         label45: {
            if(var7 >= 0) {
               float var9;
               var7 = (var9 = var5 - 90.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
               if(var3 == null) {
                  break label45;
               }

               if(var7 < 0) {
                  var7 = 0;
                  break label45;
               }
            }

            var7 = 1;
         }
      }

      int var6 = var7;
      float var10;
      var7 = (var10 = var5 - -75.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
      if(var3 != null) {
         if(var7 < 0) {
            var5 = -75.0F;
         }

         float var11;
         var7 = (var11 = var5 - 75.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
      }

      if(var3 != null) {
         if(var7 >= 0) {
            var5 = 75.0F;
         }

         this.field_3330 = this.field_3000 - var5;
         float var12;
         var7 = (var12 = var5 * var5 - 2500.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
      }

      if(var3 != null) {
         if(var7 > 0) {
            this.field_3330 += var5 * 0.2F;
         }

         var7 = var6;
      }

      if(var7 != 0) {
         var2 *= -1.0F;
      }

      return var2;
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var1 = method_4253();
      int var10000 = this.field_3362;
      if(var1 != null) {
         if(this.field_3362 > 0) {
            --this.field_3362;
         }

         var10000 = this.field_3350;
      }

      label138: {
         label142: {
            if(var1 != null) {
               if(var10000 > 0) {
                  double var2 = this.field_2994 + (this.field_3351 - this.field_2994) / (double)this.field_3350;
                  double var4 = this.field_2995 + (this.field_3352 - this.field_2995) / (double)this.field_3350;
                  double var6 = this.field_2996 + (this.field_3353 - this.field_2996) / (double)this.field_3350;
                  double var8 = class_1715.method_9580(this.field_3354 - (double)this.field_3000);
                  this.field_3000 = (float)((double)this.field_3000 + var8 / (double)this.field_3350);
                  this.field_3001 = (float)((double)this.field_3001 + (this.field_3355 - (double)this.field_3001) / (double)this.field_3350);
                  --this.field_3350;
                  this.method_3854(var2, var4, var6);
                  this.method_3853(this.field_3000, this.field_3001);
                  if(var1 != null) {
                     break label142;
                  }
               }

               var10000 = this.method_4244();
            }

            if(var1 == null) {
               break label138;
            }

            if(var10000 == 0) {
               this.field_2997 *= 0.98D;
               this.field_2998 *= 0.98D;
               this.field_2999 *= 0.98D;
            }
         }

         double var13;
         var10000 = (var13 = Math.abs(this.field_2997) - 0.005D) == 0.0D?0:(var13 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var10000 < 0) {
            this.field_2997 = 0.0D;
         }

         double var14;
         var10000 = (var14 = Math.abs(this.field_2998) - 0.005D) == 0.0D?0:(var14 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var10000 < 0) {
            this.field_2998 = 0.0D;
         }

         double var15;
         var10000 = (var15 = Math.abs(this.field_2999) - 0.005D) == 0.0D?0:(var15 < 0.0D?-1:1);
      }

      String[] var10;
      if(var1 != null) {
         if(var10000 < 0) {
            this.field_2999 = 0.0D;
         }

         var10 = field_3365;
         this.field_2990.field_1829.method_8332("ai");
         var10000 = this.method_4218();
      }

      ahb var12;
      label143: {
         label144: {
            label121: {
               class_752 var11;
               label145: {
                  label146: {
                     label147: {
                        if(var1 != null) {
                           if(var10000 != 0) {
                              this.field_3346 = false;
                              this.field_3347 = 0.0F;
                              this.field_3348 = 0.0F;
                              this.field_3349 = 0.0F;
                              if(var1 != null) {
                                 break label147;
                              }
                           }

                           var10000 = this.method_4244();
                        }

                        if(var1 == null) {
                           break label146;
                        }

                        if(var10000 != 0) {
                           label80: {
                              var11 = this;
                              if(var1 != null) {
                                 if(this.method_4225()) {
                                    var10 = field_3365;
                                    this.field_2990.field_1829.method_8332("newAi");
                                    this.method_4232();
                                    this.field_2990.field_1829.method_8333();
                                    if(var1 != null) {
                                       break label80;
                                    }
                                 }

                                 var10 = field_3365;
                                 this.field_2990.field_1829.method_8332("oldAi");
                                 this.method_4236();
                                 this.field_2990.field_1829.method_8333();
                                 var11 = this;
                              }

                              var11.field_3332 = this.field_3000;
                           }
                        }
                     }

                     this.field_2990.field_1829.method_8333();
                     var10 = field_3365;
                     this.field_2990.field_1829.method_8332("jump");
                     var11 = this;
                     if(var1 == null) {
                        break label145;
                     }

                     var10000 = this.field_3346;
                  }

                  if(var10000 != 0) {
                     var11 = this;
                     if(var1 != null) {
                        label102: {
                           if(!this.method_3876()) {
                              var11 = this;
                              if(var1 == null) {
                                 break label102;
                              }

                              if(!this.method_3881()) {
                                 var10000 = this.field_3005;
                                 if(var1 == null) {
                                    break label144;
                                 }

                                 if(!this.field_3005) {
                                    break label121;
                                 }

                                 var10000 = this.field_3362;
                                 if(var1 == null) {
                                    break label144;
                                 }

                                 if(this.field_3362 != 0) {
                                    break label121;
                                 }

                                 this.method_4223();
                                 this.field_3362 = 10;
                                 if(var1 != null) {
                                    break label121;
                                 }
                              }
                           }

                           var11 = this;
                        }
                     }

                     var11.field_2998 += 0.03999999910593033D;
                     if(var1 != null) {
                        break label121;
                     }
                  }

                  var11 = this;
               }

               var11.field_3362 = 0;
            }

            this.field_2990.field_1829.method_8333();
            var10 = field_3365;
            this.field_2990.field_1829.method_8332("travel");
            this.field_3347 *= 0.98F;
            this.field_3348 *= 0.98F;
            this.field_3349 *= 0.9F;
            this.method_4224(this.field_3347, this.field_3348);
            this.field_2990.field_1829.method_8333();
            this.field_2990.field_1829.method_8332("push");
            var12 = this.field_2990;
            if(var1 == null) {
               break label143;
            }

            var10000 = this.field_2990.field_1832;
         }

         if(var10000 == 0) {
            this.method_4233();
         }

         var12 = this.field_2990;
      }

      var12.field_1829.method_8333();
   }

   // $FF: renamed from: bn () void
   protected void method_4232() {}

   // $FF: renamed from: bo () void
   protected void method_4233() {
      List var2 = this.field_2990.method_2155(this, this.field_3004.method_7097(0.20000000298023224D, 0.0D, 0.20000000298023224D));
      String[] var1 = method_4253();
      List var10000 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return;
         }

         var10000 = var2;
      }

      byte var5 = var10000.isEmpty();
      if(var1 != null) {
         if(var5 != 0) {
            return;
         }

         var5 = 0;
      }

      int var3 = var5;

      while(var3 < var2.size()) {
         class_689 var4 = (class_689)var2.get(var3);
         if(var1 != null) {
            if(var4.method_3898()) {
               this.method_4234(var4);
            }

            ++var3;
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: o (sa) void
   protected void method_4234(class_689 var1) {
      var1.method_3893(this);
   }

   // $FF: renamed from: ab () void
   public void method_3921() {
      super.method_3921();
      this.field_3339 = this.field_3340;
      this.field_3340 = 0.0F;
      this.field_3019 = 0.0F;
   }

   // $FF: renamed from: a (double, double, double, float, float, int) void
   public void method_3926(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_3013 = 0.0F;
      this.field_3351 = var1;
      this.field_3352 = var3;
      this.field_3353 = var5;
      this.field_3354 = (double)var7;
      this.field_3355 = (double)var8;
      this.field_3350 = var9;
   }

   // $FF: renamed from: bp () void
   protected void method_4235() {}

   // $FF: renamed from: bq () void
   protected void method_4236() {
      ++this.field_3338;
   }

   // $FF: renamed from: f (boolean) void
   public void method_4237(boolean var1) {
      this.field_3346 = var1;
   }

   // $FF: renamed from: a (sa, int) void
   public void method_4238(class_689 var1, int var2) {
      boolean var10000;
      String[] var3;
      ahb var5;
      label71: {
         var3 = method_4253();
         var10000 = var1.field_3012;
         if(var3 != null) {
            if(var1.field_3012) {
               return;
            }

            var5 = this.field_2990;
            if(var3 == null) {
               break label71;
            }

            var10000 = this.field_2990.field_1832;
         }

         if(var10000) {
            return;
         }

         var5 = this.field_2990;
      }

      class_1657 var4 = ((class_354)var5).method_2256();
      var10000 = var1 instanceof class_699;
      class_337 var10002;
      if(var3 != null) {
         if(var10000) {
            var10002 = new class_337;
            var10002.method_1911(var1.method_3845(), this.method_3845());
            var4.method_9119(var1, var10002);
         }

         var10000 = var1 instanceof class_713;
      }

      label55: {
         label54: {
            label73: {
               if(var3 != null) {
                  if(var10000) {
                     break label73;
                  }

                  var10000 = var1 instanceof class_805;
               }

               if(var3 != null) {
                  if(var10000) {
                     break label73;
                  }

                  var10000 = var1 instanceof class_804;
               }

               if(var3 != null) {
                  if(var10000) {
                     break label73;
                  }

                  var10000 = var1 instanceof class_806;
               }

               if(var3 == null) {
                  break label55;
               }

               if(!var10000) {
                  break label54;
               }
            }

            var10002 = new class_337;
            var10002.method_1911(var1.method_3845(), this.method_3845());
            var4.method_9119(var1, var10002);
         }

         var10000 = var1 instanceof class_715;
      }

      if(var10000) {
         var10002 = new class_337;
         var10002.method_1911(var1.method_3845(), this.method_3845());
         var4.method_9119(var1, var10002);
      }

   }

   // $FF: renamed from: p (sa) boolean
   public boolean method_4239(class_689 var1) {
      return this.field_2990.method_2079(azw.method_5086(this.field_2994, this.field_2995 + (double)this.method_3880(), this.field_2996), azw.method_5086(var1.field_2994, var1.field_2995 + (double)var1.method_3880(), var1.field_2996)) == null;
   }

   // $FF: renamed from: ag () azw
   public azw method_3928() {
      return this.method_4240(1.0F);
   }

   // $FF: renamed from: j (float) azw
   public azw method_4240(float var1) {
      String[] var2 = method_4253();
      float var10000 = var1;
      float var10001 = 1.0F;
      float var3;
      float var4;
      float var5;
      float var6;
      if(var2 != null) {
         if(var1 == 1.0F) {
            var3 = class_1715.method_9556(-this.field_3000 * 0.017453292F - 3.1415927F);
            var4 = class_1715.method_9555(-this.field_3000 * 0.017453292F - 3.1415927F);
            var5 = -class_1715.method_9556(-this.field_3001 * 0.017453292F);
            var6 = class_1715.method_9555(-this.field_3001 * 0.017453292F);
            return azw.method_5086((double)(var4 * var5), (double)var6, (double)(var3 * var5));
         }

         var10000 = this.field_3003;
         var10001 = (this.field_3001 - this.field_3003) * var1;
      }

      var3 = var10000 + var10001;
      var4 = this.field_3002 + (this.field_3000 - this.field_3002) * var1;
      var5 = class_1715.method_9556(-var4 * 0.017453292F - 3.1415927F);
      var6 = class_1715.method_9555(-var4 * 0.017453292F - 3.1415927F);
      float var7 = -class_1715.method_9556(-var3 * 0.017453292F);
      float var8 = class_1715.method_9555(-var3 * 0.017453292F);
      return azw.method_5086((double)(var6 * var7), (double)var8, (double)(var5 * var7));
   }

   // $FF: renamed from: k (float) float
   public float method_4241(float var1) {
      String[] var10000 = method_4253();
      float var3 = this.field_3321 - this.field_3320;
      String[] var2 = var10000;
      float var4 = var3;
      float var10001 = 0.0F;
      if(var2 != null) {
         if(var3 < 0.0F) {
            ++var3;
         }

         var4 = this.field_3320;
         var10001 = var3 * var1;
      }

      return var4 + var10001;
   }

   // $FF: renamed from: l (float) azw
   public azw method_4242(float var1) {
      if(var1 == 1.0F) {
         return azw.method_5086(this.field_2994, this.field_2995, this.field_2996);
      } else {
         double var2 = this.field_2991 + (this.field_2994 - this.field_2991) * (double)var1;
         double var4 = this.field_2992 + (this.field_2995 - this.field_2992) * (double)var1;
         double var6 = this.field_2993 + (this.field_2996 - this.field_2993) * (double)var1;
         return azw.method_5086(var2, var4, var6);
      }
   }

   // $FF: renamed from: a (double, float) azu
   public azu method_4243(double var1, float var3) {
      azw var4 = this.method_4242(var3);
      azw var5 = this.method_4240(var3);
      azw var6 = var4.method_5093(var5.field_4220 * var1, var5.field_4221 * var1, var5.field_4222 * var1);
      return this.field_2990.method_2081(var4, var6, false, false, true);
   }

   // $FF: renamed from: br () boolean
   public boolean method_4244() {
      String[] var1 = method_4253();
      boolean var10000 = this.field_2990.field_1832;
      if(var1 != null) {
         var10000 = !this.field_2990.field_1832;
      }

      return var10000;
   }

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      String[] var1 = method_4253();
      boolean var10000 = this.field_3012;
      if(var1 != null) {
         var10000 = !this.field_3012;
      }

      return var10000;
   }

   // $FF: renamed from: S () boolean
   public boolean method_3898() {
      String[] var1 = method_4253();
      boolean var10000 = this.field_3012;
      if(var1 != null) {
         var10000 = !this.field_3012;
      }

      return var10000;
   }

   // $FF: renamed from: g () float
   public float method_3880() {
      return this.field_3015 * 0.85F;
   }

   // $FF: renamed from: Q () void
   protected void method_3895() {
      String[] var1 = method_4253();
      double var2;
      int var10001 = (var2 = this.field_3028.nextDouble() - this.method_4211(class_1840.field_9392).method_396()) == 0.0D?0:(var2 < 0.0D?-1:1);
      if(var1 != null) {
         var10001 = var10001 >= 0?1:0;
      }

      this.field_3009 = (boolean)var10001;
   }

   // $FF: renamed from: au () float
   public float method_3957() {
      return this.field_3332;
   }

   // $FF: renamed from: e (float) void
   public void method_3958(float var1) {
      this.field_3332 = var1;
   }

   // $FF: renamed from: bs () float
   public float method_4245() {
      return this.field_3363;
   }

   // $FF: renamed from: m (float) void
   public void method_4246(float var1) {
      String[] var2 = method_4253();
      if(var2 != null) {
         if(var1 < 0.0F) {
            var1 = 0.0F;
         }

         this.field_3363 = var1;
      }

   }

   // $FF: renamed from: bt () kn
   public class_1350 method_4247() {
      return null;
   }

   // $FF: renamed from: c (sv) boolean
   public boolean method_4248(class_752 var1) {
      return this.method_4249(var1.method_4247());
   }

   // $FF: renamed from: a (kn) boolean
   public boolean method_4249(class_1350 var1) {
      String[] var2 = method_4253();
      class_1350 var10000 = this.method_4247();
      boolean var3;
      if(var2 != null) {
         if(var10000 == null) {
            var3 = false;
            return var3;
         }

         var10000 = this.method_4247();
      }

      var3 = var10000.method_7295(var1);
      return var3;
   }

   // $FF: renamed from: bu () void
   public void method_4250() {}

   // $FF: renamed from: bv () void
   public void method_4251() {}

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String[]) void
   public static void method_4252(String[] var0) {
      field_3364 = var0;
   }

   // $FF: renamed from: a0 () java.lang.String[]
   public static String[] method_4253() {
      return field_3364;
   }
}
