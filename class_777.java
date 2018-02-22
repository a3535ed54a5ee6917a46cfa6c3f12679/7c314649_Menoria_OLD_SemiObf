import ca.diiza.e.class_804;
import ca.diiza.e.class_805;
import ca.diiza.e.class_806;

// $FF: renamed from: wN
public class class_777 extends class_776 {

   // $FF: renamed from: bH float
   private float field_3545;
   // $FF: renamed from: bI float
   private float field_3546;
   // $FF: renamed from: bJ boolean
   private boolean field_3547;
   // $FF: renamed from: bK boolean
   private boolean field_3548;
   // $FF: renamed from: bL float
   private float field_3549;
   // $FF: renamed from: bM float
   private float field_3550;
   // $FF: renamed from: bN java.lang.String
   private static final String field_3551;
   // $FF: renamed from: jb java.lang.String[]
   private static final String[] field_3552;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.6F, 0.8F);
      this.method_4257().method_9784(true);
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(1, var10002);
      this.field_3373.method_9766(2, this.field_3543);
      var10000 = this.field_3373;
      class_1731 var6 = new class_1731;
      var6.method_9661(this, 0.4F);
      var10000.method_9766(3, var6);
      var10000 = this.field_3373;
      class_1764 var7 = new class_1764;
      var7.method_9727(this, 1.0D, true);
      var10000.method_9766(4, var7);
      var10000 = this.field_3373;
      class_1733 var8 = new class_1733;
      var8.method_9664(this, 1.0D, 10.0F, 2.0F);
      var10000.method_9766(5, var8);
      var10000 = this.field_3373;
      class_1741 var9 = new class_1741;
      var9.method_9681(this, 1.0D);
      var10000.method_9766(6, var9);
      var10000 = this.field_3373;
      class_1753 var10 = new class_1753;
      var10.method_9705(this, 1.0D);
      var10000.method_9766(7, var10);
      var10000 = this.field_3373;
      class_1742 var11 = new class_1742;
      var11.method_9685(this, 8.0F);
      var10000.method_9766(8, var11);
      var10000 = this.field_3373;
      class_1728 var12 = new class_1728;
      var12.method_9657(this, class_792.class, 8.0F);
      var10000.method_9766(9, var12);
      var10000 = this.field_3373;
      class_1754 var13 = new class_1754;
      var13.method_9706(this);
      var10000.method_9766(9, var13);
      var10000 = this.field_3374;
      class_1770 var2 = new class_1770;
      var2.method_9739(this);
      var10000.method_9766(1, var2);
      var10000 = this.field_3374;
      class_1769 var3 = new class_1769;
      var3.method_9738(this);
      var10000.method_9766(2, var3);
      var10000 = this.field_3374;
      class_1767 var4 = new class_1767;
      var4.method_9732(this, true);
      var10000.method_9766(3, var4);
      var10000 = this.field_3374;
      class_1772 var5 = new class_1772;
      var5.method_9744(this, class_770.class, 200, false);
      var10000.method_9766(4, var5);
      this.method_4477(false);
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      String[] var1 = class_752.method_4253();
      this.method_4211(class_1840.field_9393).method_390(0.30000001192092896D);
      class_777 var10000 = this;
      if(var1 != null) {
         if(this.method_4476()) {
            this.method_4211(class_1840.field_9390).method_390(20.0D);
            if(var1 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.method_4211(class_1840.field_9390).method_390(8.0D);
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: d (sv) void
   public void method_4260(class_752 var1) {
      String[] var2 = class_752.method_4253();
      class_777 var10000 = this;
      if(var2 != null) {
         super.method_4260(var1);
         if(var1 == null) {
            this.method_4492(false);
            if(var2 != null) {
               return;
            }
         }

         var10000 = this;
      }

      if(var2 != null) {
         if(var10000.method_4476()) {
            return;
         }

         var10000 = this;
      }

      var10000.method_4492(true);
   }

   // $FF: renamed from: bp () void
   protected void method_4235() {
      this.field_3036.method_9506(18, Float.valueOf(this.method_406()));
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(18, new Float(this.method_406()));
      this.field_3036.method_9497(19, new Byte((byte)0));
      this.field_3036.method_9497(20, new Byte((byte)class_438.method_2751(1)));
   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      String[] var10001 = field_3552;
      this.method_3868("mob.wolf.step", 0.15F, 1.0F);
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var2 = field_3552;
      var1.initGui4("Angry", this.method_4491());
      var1.method_8665("CollarColor", (byte)this.method_4493());
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3908(var1);
      String[] var2 = var10000;
      class_777 var4 = this;
      String[] var3 = field_3552;
      byte var10001 = var1.method_8690("Angry");
      if(var2 != null) {
         this.method_4492((boolean)var10001);
         if(!var1.initGui8("CollarColor", 99)) {
            return;
         }

         var4 = this;
         var10001 = var1.initGui9("CollarColor");
      }

      var4.method_4494(var10001);
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4491();
      String[] var2;
      String var3;
      if(var1 != null) {
         if(var10000 != 0) {
            var2 = field_3552;
            var3 = "mob.wolf.growl";
            return var3;
         }

         var10000 = this.field_3028.nextInt(3);
      }

      if(var1 != null) {
         if(var10000 != 0) {
            String[] var4 = field_3552;
            var3 = "mob.wolf.bark";
            return var3;
         }

         var10000 = this.method_4476();
      }

      label25: {
         if(var1 != null) {
            if(var10000 == 0) {
               break label25;
            }

            float var5;
            var10000 = (var5 = this.field_3036.method_9502(18) - 10.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
         }

         if(var10000 < 0) {
            var2 = field_3552;
            var3 = "mob.wolf.whine";
            return var3;
         }
      }

      var2 = field_3552;
      var3 = "mob.wolf.panting";
      return var3;
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3552;
      return "mob.wolf.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3552;
      return "mob.wolf.death";
   }

   // $FF: renamed from: bf () float
   protected float method_4216() {
      return 0.4F;
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return adb.method_2919(-1);
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      super.method_4231();
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_2990.field_1832;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this.field_3547;
      }

      if(var1 != null) {
         if(!var10000) {
            return;
         }

         var10000 = this.field_3548;
      }

      if(var1 != null) {
         if(var10000) {
            return;
         }

         var10000 = this.method_4333();
      }

      class_777 var2;
      label49: {
         if(var1 != null) {
            if(var10000) {
               return;
            }

            var2 = this;
            if(var1 == null) {
               break label49;
            }

            var10000 = this.field_3005;
         }

         if(!var10000) {
            return;
         }

         this.field_3548 = true;
         this.field_3549 = 0.0F;
         this.field_3550 = 0.0F;
         var2 = this;
      }

      var2.field_2990.method_2191(this, (byte)8);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1;
      label91: {
         String[] var10000 = class_752.method_4253();
         super.method_3856();
         var1 = var10000;
         this.field_3546 = this.field_3545;
         class_777 var9 = this;
         if(var1 != null) {
            if(this.method_4497()) {
               this.field_3545 += (1.0F - this.field_3545) * 0.4F;
               if(var1 != null) {
                  break label91;
               }
            }

            var9 = this;
         }

         var9.field_3545 += (0.0F - this.field_3545) * 0.4F;
      }

      int var10 = this.method_4497();
      if(var1 != null) {
         if(var10 != 0) {
            this.field_3383 = 10;
         }

         var10 = this.method_3875();
      }

      if(var1 != null) {
         if(var10 != 0) {
            this.field_3547 = true;
            this.field_3548 = false;
            this.field_3549 = 0.0F;
            this.field_3550 = 0.0F;
            if(var1 != null) {
               return;
            }
         }

         var10 = this.field_3547;
      }

      if(var1 != null) {
         label75: {
            if(var10 == 0) {
               var10 = this.field_3548;
               if(var1 == null) {
                  break label75;
               }

               if(!this.field_3548) {
                  return;
               }
            }

            var10 = this.field_3548;
         }
      }

      if(var1 != null) {
         if(var10 == 0) {
            return;
         }

         float var11;
         var10 = (var11 = this.field_3549 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var10 == 0) {
            String[] var7 = field_3552;
            this.method_3868("mob.wolf.shake", this.method_4216(), (this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F);
         }

         this.field_3550 = this.field_3549;
         this.field_3549 += 0.05F;
         float var12;
         var10 = (var12 = this.field_3550 - 2.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
      }

      float var8;
      label95: {
         if(var1 != null) {
            if(var10 >= 0) {
               this.field_3547 = false;
               this.field_3548 = false;
               this.field_3550 = 0.0F;
               this.field_3549 = 0.0F;
            }

            var8 = this.field_3549;
            if(var1 == null) {
               break label95;
            }

            float var13;
            var10 = (var13 = this.field_3549 - 0.4F) == 0.0F?0:(var13 < 0.0F?-1:1);
         }

         if(var10 <= 0) {
            return;
         }

         var8 = (float)this.field_3004.field_6910;
      }

      float var2 = var8;
      int var3 = (int)(class_1715.method_9555((this.field_3549 - 0.4F) * 3.1415927F) * 7.0F);
      int var4 = 0;

      while(var4 < var3) {
         float var5 = (this.field_3028.nextFloat() * 2.0F - 1.0F) * this.field_3014 * 0.5F;
         float var6 = (this.field_3028.nextFloat() * 2.0F - 1.0F) * this.field_3014 * 0.5F;
         String[] var10001 = field_3552;
         this.field_2990.method_2087("splash", this.field_2994 + (double)var5, (double)(var2 + 0.8F), this.field_2996 + (double)var6, this.field_2997, this.field_2998, this.field_2999);
         ++var4;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: bT () boolean
   public boolean method_4486() {
      return this.field_3547;
   }

   // $FF: renamed from: q (float) float
   public float method_4487(float var1) {
      return 0.75F + (this.field_3550 + (this.field_3549 - this.field_3550) * var1) / 2.0F * 0.25F;
   }

   // $FF: renamed from: d (float, float) float
   public float method_4488(float var1, float var2) {
      float var10001;
      float var4;
      float var6;
      label22: {
         String[] var10000 = class_752.method_4253();
         var4 = (this.field_3550 + (this.field_3549 - this.field_3550) * var1 + var2) / 1.8F;
         String[] var3 = var10000;
         float var7;
         int var5 = (var7 = var4 - 0.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
         if(var3 != null) {
            if(var5 < 0) {
               var4 = 0.0F;
               if(var3 != null) {
                  break label22;
               }
            }

            var6 = var4;
            var10001 = 1.0F;
            if(var3 == null) {
               return var6 * var10001;
            }

            float var8;
            var5 = (var8 = var4 - 1.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
         }

         if(var5 > 0) {
            var4 = 1.0F;
         }
      }

      var6 = class_1715.method_9555(var4 * 3.1415927F) * class_1715.method_9555(var4 * 3.1415927F * 11.0F) * 0.15F;
      var10001 = 3.1415927F;
      return var6 * var10001;
   }

   // $FF: renamed from: r (float) float
   public float method_4489(float var1) {
      return (this.field_3546 + (this.field_3545 - this.field_3546) * var1) * 0.15F * 3.1415927F;
   }

   // $FF: renamed from: g () float
   public float method_3880() {
      return this.field_3015 * 0.8F;
   }

   // $FF: renamed from: x () int
   public int method_4271() {
      String[] var1 = class_752.method_4253();
      class_777 var10000 = this;
      int var2;
      if(var1 != null) {
         if(this.method_4478()) {
            var2 = 20;
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.method_4271();
      return var2;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      Object var10000 = this;
      if(var3 != null) {
         if(this.method_3961()) {
            return false;
         }

         var10000 = var1.method_9345();
      }

      Object var4 = var10000;
      class_777 var5 = this;
      boolean var6;
      if(var3 != null) {
         this.field_3543.method_9697(false);
         if(var4 != null) {
            var6 = var4 instanceof class_792;
            if(var3 == null) {
               return var6;
            }

            if(!var6) {
               label51: {
                  label61: {
                     var6 = var4 instanceof class_713;
                     if(var3 != null) {
                        if(!var6) {
                           break label61;
                        }

                        var6 = var4 instanceof class_806;
                     }

                     if(var3 != null) {
                        if(!var6) {
                           break label61;
                        }

                        var6 = var4 instanceof class_804;
                     }

                     if(var3 != null) {
                        if(!var6) {
                           break label61;
                        }

                        var6 = var4 instanceof class_805;
                     }

                     if(var3 == null) {
                        return var6;
                     }

                     if(var6) {
                        break label51;
                     }
                  }

                  var2 = (var2 + 1.0F) / 2.0F;
               }
            }
         }

         var5 = this;
      }

      var6 = var5.method_3896(var1, var2);
      return var6;
   }

   // $FF: renamed from: n (sa) boolean
   public boolean method_4228(class_689 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.method_4476();
      if(var2 != null) {
         var10000 = var10000 != 0?4:2;
      }

      int var3 = var10000;
      return var1.method_3896(class_1691.method_9324(this), (float)var3);
   }

   // $FF: renamed from: k (boolean) void
   public void method_4477(boolean var1) {
      String[] var2 = class_752.method_4253();
      class_777 var10000 = this;
      if(var2 != null) {
         super.method_4477(var1);
         if(var1) {
            this.method_4211(class_1840.field_9390).method_390(20.0D);
            if(var2 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.method_4211(class_1840.field_9390).method_390(8.0D);
   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      int var9;
      label176: {
         add var3 = var1.field_3616.method_3593();
         String[] var2 = class_752.method_4253();
         add var10000;
         if(this.method_4476()) {
            label146: {
               label178: {
                  var10000 = var3;
                  if(var2 != null) {
                     if(var3 == null) {
                        break label178;
                     }

                     var10000 = var3;
                  }

                  label179: {
                     adb var8 = var10000.method_3730();
                     if(var2 != null) {
                        if(var8 instanceof class_557) {
                           label181: {
                              class_557 var4 = (class_557)var3.method_3730();
                              var9 = var4.getBlock45();
                              if(var2 != null) {
                                 if(var9 == 0) {
                                    break label181;
                                 }

                                 float var10;
                                 var9 = (var10 = this.field_3036.method_9502(18) - 20.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
                              }

                              if(var2 != null) {
                                 if(var9 >= 0) {
                                    break label181;
                                 }

                                 var9 = var1.field_3640.field_2839;
                              }

                              if(var2 != null) {
                                 if(var9 == 0) {
                                    --var3.field_2958;
                                 }

                                 this.method_4187((float)var4.getBlock43(var3));
                                 var9 = var3.field_2958;
                              }

                              if(var2 != null) {
                                 if(var9 <= 0) {
                                    var1.field_3616.method_87(var1.field_3616.field_2846, (add)null);
                                 }

                                 var9 = 1;
                              }

                              return (boolean)var9;
                           }

                           if(var2 != null) {
                              break label178;
                           }
                        }

                        var10000 = var3;
                        if(var2 == null) {
                           break label179;
                        }

                        var8 = var3.method_3730();
                     }

                     if(var8 != class_1010.field_5208) {
                        break label178;
                     }

                     var10000 = var3;
                  }

                  int var6 = class_438.method_2751(var10000.method_3745());
                  var9 = var6;
                  if(var2 == null) {
                     break label146;
                  }

                  if(var6 != this.method_4493()) {
                     this.method_4494(var6);
                     var9 = var1.field_3640.field_2839;
                     if(var2 != null) {
                        if(!var1.field_3640.field_2839) {
                           var9 = --var3.field_2958;
                           if(var2 == null) {
                              return (boolean)var9;
                           }

                           if(var9 <= 0) {
                              var1.field_3616.method_87(var1.field_3616.field_2846, (add)null);
                           }
                        }

                        var9 = 1;
                     }

                     return (boolean)var9;
                  }
               }

               var9 = this.method_4482(var1);
            }

            if(var2 == null) {
               return (boolean)var9;
            }

            if(var9 == 0) {
               break label176;
            }

            var9 = this.field_2990.field_1832;
            if(var2 == null) {
               return (boolean)var9;
            }

            if(this.field_2990.field_1832) {
               break label176;
            }

            var9 = this.method_4378(var3);
            if(var2 == null) {
               return (boolean)var9;
            }

            if(var9 != 0) {
               break label176;
            }

            class_1748 var5 = this.field_3543;
            boolean var10001 = this.method_4478();
            if(var2 != null) {
               var10001 = !var10001;
            }

            var5.method_9697(var10001);
            this.field_3346 = false;
            this.method_4334((class_1289)null);
            this.method_4336((class_689)null);
            this.method_4260((class_752)null);
            if(var2 != null) {
               break label176;
            }
         }

         var10000 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label176;
            }

            var10000 = var3;
         }

         if(var10000.method_3730() == class_1010.field_5209) {
            var9 = this.method_4491();
            if(var2 == null) {
               return (boolean)var9;
            }

            if(var9 == 0) {
               var9 = var1.field_3640.field_2839;
               if(var2 != null) {
                  if(!var1.field_3640.field_2839) {
                     --var3.field_2958;
                  }

                  var9 = var3.field_2958;
               }

               if(var2 != null) {
                  if(var9 <= 0) {
                     var1.field_3616.method_87(var1.field_3616.field_2846, (add)null);
                  }

                  var9 = this.field_2990.field_1832;
               }

               if(var2 != null) {
                  if(var9 == 0) {
                     label106: {
                        class_777 var7 = this;
                        if(var2 != null) {
                           if(this.field_3028.nextInt(3) == 0) {
                              this.method_4477(true);
                              this.method_4334((class_1289)null);
                              this.method_4260((class_752)null);
                              this.field_3543.method_9697(true);
                              this.method_4188(20.0F);
                              this.method_4480(var1.method_3972().toString());
                              this.method_4475(true);
                              this.field_2990.method_2191(this, (byte)7);
                              if(var2 != null) {
                                 break label106;
                              }
                           }

                           this.method_4475(false);
                           var7 = this;
                        }

                        var7.field_2990.method_2191(this, (byte)6);
                     }
                  }

                  var9 = 1;
               }

               return (boolean)var9;
            }
         }
      }

      var9 = super.method_4295(var1);
      return (boolean)var9;
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      label16: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(var1 != 8) {
               break label16;
            }

            this.field_3548 = true;
            this.field_3549 = 0.0F;
            this.field_3550 = 0.0F;
         }

         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: bU () float
   public float method_4490() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.method_4491();
      float var2;
      if(var1 != null) {
         if(var10000) {
            var2 = 1.5393804F;
            return var2;
         }

         var10000 = this.method_4476();
      }

      var2 = var10000?(0.55F - (20.0F - this.field_3036.method_9502(18)) * 0.02F) * 3.1415927F:0.62831855F;
      return var2;
   }

   // $FF: renamed from: d (add) boolean
   public boolean method_4378(add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var1;
      boolean var4;
      if(var2 != null) {
         if(var1 == null) {
            var4 = false;
            return var4;
         }

         var10000 = var1;
      }

      adb var3 = var10000.method_3730();
      if(var2 != null) {
         if(!(var3 instanceof class_557)) {
            var4 = false;
            return var4;
         }

         var3 = var1.method_3730();
      }

      var4 = ((class_557)var3).getBlock45();
      return var4;
   }

   // $FF: renamed from: bB () int
   public int method_4276() {
      return 8;
   }

   // $FF: renamed from: bV () boolean
   public boolean method_4491() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(16) & 2;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: j (boolean) void
   public void method_4492(boolean var1) {
      byte var3;
      label16: {
         String[] var10000 = class_752.method_4253();
         var3 = this.field_3036.method_9499(16);
         String[] var2 = var10000;
         if(var2 != null) {
            if(!var1) {
               break label16;
            }

            this.field_3036.method_9506(16, Byte.valueOf((byte)(var3 | 2)));
         }

         if(var2 != null) {
            return;
         }
      }

      this.field_3036.method_9506(16, Byte.valueOf((byte)(var3 & -3)));
   }

   // $FF: renamed from: bW () int
   public int method_4493() {
      return this.field_3036.method_9499(20) & 15;
   }

   // $FF: renamed from: a (int) void
   public void method_4494(int var1) {
      this.field_3036.method_9506(20, Byte.valueOf((byte)(var1 & 15)));
   }

   // $FF: renamed from: a (wJ) wN
   public class_777 method_4495(class_767 var1) {
      String[] var10000 = class_752.method_4253();
      class_777 var10001 = new class_777;
      var10001.method_3847(this.field_2990);
      class_777 var3 = var10001;
      String var4 = this.method_382();
      String[] var2 = var10000;
      String var5 = var4;
      if(var2 != null) {
         if(var4 == null) {
            return var3;
         }

         var5 = var4.trim();
      }

      if(var5.length() > 0) {
         var3.method_4480(var4);
         var3.method_4477(true);
      }

      return var3;
   }

   // $FF: renamed from: n (boolean) void
   public void method_4496(boolean var1) {
      label16: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(!var1) {
               break label16;
            }

            this.field_3036.method_9506(19, Byte.valueOf((byte)1));
         }

         if(var2 != null) {
            return;
         }
      }

      this.field_3036.method_9506(19, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: b (wK) boolean
   public boolean method_4383(class_769 var1) {
      String[] var2 = class_752.method_4253();
      if(var1 == this) {
         return false;
      } else {
         boolean var10000;
         class_769 var4;
         label65: {
            var10000 = this.method_4476();
            if(var2 != null) {
               if(!var10000) {
                  return false;
               }

               var4 = var1;
               if(var2 == null) {
                  break label65;
               }

               var10000 = var1 instanceof class_777;
            }

            if(!var10000) {
               return false;
            }

            var4 = var1;
         }

         class_777 var3 = (class_777)var4;
         var10000 = var3.method_4476();
         if(var2 != null) {
            if(!var10000) {
               var10000 = false;
               return var10000;
            }

            var10000 = var3.method_4478();
         }

         if(var2 != null) {
            if(var10000) {
               var10000 = false;
               return var10000;
            }

            var10000 = this.method_4381();
         }

         label68: {
            if(var2 != null) {
               if(!var10000) {
                  break label68;
               }

               var10000 = var3.method_4381();
            }

            if(var2 == null) {
               return var10000;
            }

            if(var10000) {
               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      }
   }

   // $FF: renamed from: bX () boolean
   public boolean method_4497() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(19);
      if(var1 != null) {
         var10000 = var10000 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: v () boolean
   protected boolean method_4269() {
      int var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.method_4476();
         if(var1 != null) {
            if(var10000 != 0) {
               break label24;
            }

            var10000 = this.field_3029;
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 > 2400) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (sv, sv) boolean
   public boolean method_4484(class_752 var1, class_752 var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = var1 instanceof class_789;
      if(var3 != null) {
         if(!var10000) {
            var10000 = var1 instanceof class_760;
            if(var3 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = var1 instanceof class_777;
               if(var3 != null) {
                  label65: {
                     class_752 var5;
                     label64: {
                        if(var10000) {
                           class_777 var4 = (class_777)var1;
                           var10000 = var4.method_4476();
                           if(var3 == null) {
                              break label65;
                           }

                           if(var10000) {
                              var5 = var4.method_4481();
                              if(var3 == null) {
                                 break label64;
                              }

                              if(var5 == var2) {
                                 return false;
                              }
                           }
                        }

                        var5 = var1;
                     }

                     var10000 = var5 instanceof class_792;
                  }
               }

               if(var3 != null) {
                  label52: {
                     if(var10000) {
                        var10000 = var2 instanceof class_792;
                        if(var3 == null) {
                           break label52;
                        }

                        if(var10000) {
                           var10000 = ((class_792)var2).method_4583((class_792)var1);
                           if(var3 == null) {
                              break label52;
                           }

                           if(!var10000) {
                              var10000 = false;
                              return var10000;
                           }
                        }
                     }

                     var10000 = var1 instanceof class_772;
                  }
               }

               if(var3 != null) {
                  if(var10000) {
                     var10000 = ((class_772)var1).method_4406();
                     if(var3 == null) {
                        return var10000;
                     }

                     if(var10000) {
                        var10000 = false;
                        return var10000;
                     }
                  }

                  var10000 = true;
               }

               return var10000;
            }
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4384() {
      // $FF: Couldn't be decompiled
   }
}
