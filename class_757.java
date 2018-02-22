import java.util.Calendar;

// $FF: renamed from: xc
public class class_757 extends class_756 {

   // $FF: renamed from: a1 vF
   private class_1661 field_3395;
   // $FF: renamed from: a2 java.lang.String
   private static final String field_3396;
   // $FF: renamed from: fb java.lang.String[]
   private static final String[] field_3397;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.5F, 0.9F);
      this.method_4315(true);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, new Byte((byte)0));
   }

   // $FF: renamed from: bf () float
   protected float method_4216() {
      return 0.1F;
   }

   // $FF: renamed from: bg () float
   protected float method_4217() {
      return super.method_4217() * 0.95F;
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String var2;
      label17: {
         String[] var1 = class_752.method_4253();
         int var10000 = this.method_4314();
         if(var1 != null) {
            if(var10000 == 0) {
               break label17;
            }

            var10000 = this.field_3028.nextInt(4);
         }

         if(var10000 != 0) {
            var2 = null;
            return var2;
         }
      }

      String[] var3 = field_3397;
      var2 = "mob.bat.idle";
      return var2;
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3397;
      return "mob.bat.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3397;
      return "mob.bat.death";
   }

   // $FF: renamed from: S () boolean
   public boolean method_3898() {
      return false;
   }

   // $FF: renamed from: o (sa) void
   protected void method_4234(class_689 var1) {}

   // $FF: renamed from: bo () void
   protected void method_4233() {}

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(6.0D);
   }

   // $FF: renamed from: a () boolean
   public boolean method_4314() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(16) & 1;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: i (boolean) void
   public void method_4315(boolean var1) {
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

   // $FF: renamed from: bk () boolean
   protected boolean method_4225() {
      return true;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      super.method_3856();
      String[] var1 = class_752.method_4253();
      class_757 var10000 = this;
      if(var1 != null) {
         if(this.method_4314()) {
            this.field_2997 = this.field_2998 = this.field_2999 = 0.0D;
            this.field_2995 = (double)class_1715.method_9561(this.field_2995) + 1.0D - (double)this.field_3015;
            if(var1 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.field_2998 *= 0.6000000238418579D;
   }

   // $FF: renamed from: bn () void
   protected void method_4232() {
      String[] var10000 = class_752.method_4253();
      super.method_4232();
      String[] var1 = var10000;
      class_757 var10 = this;
      int var11;
      if(var1 != null) {
         if(this.method_4314()) {
            label110: {
               var11 = this.field_2990.getBlock(class_1715.method_9561(this.field_2994), (int)this.field_2995 + 1, class_1715.method_9561(this.field_2996)).method_2433();
               if(var1 != null) {
                  if(var11 == 0) {
                     this.method_4315(false);
                     this.field_2990.method_2211((class_792)null, 1015, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
                     if(var1 != null) {
                        return;
                     }
                  }

                  var10 = this;
                  if(var1 == null) {
                     break label110;
                  }

                  var11 = this.field_3028.nextInt(200);
               }

               if(var11 == 0) {
                  this.field_3332 = (float)this.field_3028.nextInt(360);
               }

               var10 = this;
            }

            ahb var12 = var10.field_2990;
            if(var1 != null) {
               if(var12.method_2174(this, 4.0D) == null) {
                  return;
               }

               this.method_4315(false);
               var12 = this.field_2990;
            }

            var12.method_2211((class_792)null, 1015, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
            if(var1 != null) {
               return;
            }
         }

         var10 = this;
      }

      label86: {
         label85: {
            label112: {
               class_1661 var13 = var10.field_3395;
               if(var1 != null) {
                  label113: {
                     if(var13 != null) {
                        label80: {
                           var10 = this;
                           if(var1 != null) {
                              if(this.field_2990.method_34(this.field_3395.field_8646, this.field_3395.field_8647, this.field_3395.field_8648)) {
                                 var13 = this.field_3395;
                                 if(var1 == null) {
                                    break label113;
                                 }

                                 if(this.field_3395.field_8647 >= 1) {
                                    break label80;
                                 }
                              }

                              var10 = this;
                           }

                           var10.field_3395 = null;
                        }
                     }

                     var10 = this;
                     if(var1 == null) {
                        break label112;
                     }

                     var13 = this.field_3395;
                  }
               }

               if(var13 != null) {
                  var10 = this;
                  if(var1 == null) {
                     break label112;
                  }

                  if(this.field_3028.nextInt(30) != 0) {
                     float var14;
                     var11 = (var14 = this.field_3395.method_9155((int)this.field_2994, (int)this.field_2995, (int)this.field_2996) - 4.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
                     if(var1 == null) {
                        break label86;
                     }

                     if(var11 >= 0) {
                        break label85;
                     }
                  }
               }

               var10 = this;
            }

            class_1661 var10001 = new class_1661;
            var10001.method_9151((int)this.field_2994 + this.field_3028.nextInt(7) - this.field_3028.nextInt(7), (int)this.field_2995 + this.field_3028.nextInt(6) - 2, (int)this.field_2996 + this.field_3028.nextInt(7) - this.field_3028.nextInt(7));
            var10.field_3395 = var10001;
         }

         var11 = this.field_3395.field_8646;
      }

      label114: {
         double var2 = (double)var11 + 0.5D - this.field_2994;
         double var4 = (double)this.field_3395.field_8647 + 0.1D - this.field_2995;
         double var6 = (double)this.field_3395.field_8648 + 0.5D - this.field_2996;
         this.field_2997 += (Math.signum(var2) * 0.5D - this.field_2997) * 0.10000000149011612D;
         this.field_2998 += (Math.signum(var4) * 0.699999988079071D - this.field_2998) * 0.10000000149011612D;
         this.field_2999 += (Math.signum(var6) * 0.5D - this.field_2999) * 0.10000000149011612D;
         float var8 = (float)(Math.atan2(this.field_2999, this.field_2997) * 180.0D / 3.141592653589793D) - 90.0F;
         float var9 = class_1715.method_9579(var8 - this.field_3000);
         this.field_3348 = 0.5F;
         this.field_3000 += var9;
         var11 = this.field_3028.nextInt(100);
         if(var1 != null) {
            if(var11 != 0) {
               return;
            }

            var10 = this;
            if(var1 == null) {
               break label114;
            }

            var11 = this.field_2990.getBlock(class_1715.method_9561(this.field_2994), (int)this.field_2995 + 1, class_1715.method_9561(this.field_2996)).method_2433();
         }

         if(var11 == 0) {
            return;
         }

         var10 = this;
      }

      var10.method_4315(true);
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {}

   // $FF: renamed from: a (double, boolean) void
   protected void method_3870(double var1, boolean var3) {}

   // $FF: renamed from: az () boolean
   public boolean method_3969() {
      return true;
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
            var10000 = this.method_4314();
            if(var3 == null) {
               return var10000;
            }

            if(var10000) {
               this.method_4315(false);
            }
         }

         var10000 = super.method_3896(var1, var2);
      }

      return var10000;
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var10003 = field_3397;
      this.field_3036.method_9506(16, Byte.valueOf(var1.initGui9("BatFlags")));
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3397;
      var1.method_8665("BatFlags", this.field_3036.method_9499(16));
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      String[] var10000 = class_752.method_4253();
      int var2 = class_1715.method_9561(this.field_3004.field_6910);
      String[] var1 = var10000;
      int var8 = var2;
      if(var1 != null) {
         if(var2 >= 63) {
            return false;
         }

         var8 = class_1715.method_9561(this.field_2994);
      }

      int var6;
      label62: {
         int var5;
         label61: {
            label66: {
               label59: {
                  label67: {
                     int var3 = var8;
                     int var4 = class_1715.method_9561(this.field_2996);
                     var5 = this.field_2990.method_2069(var3, var2, var4);
                     var6 = 4;
                     Calendar var7 = this.field_2990.method_2218();
                     var8 = var7.get(2) + 1;
                     byte var10001 = 10;
                     if(var1 != null) {
                        if(var8 == 10) {
                           var8 = var7.get(5);
                           if(var1 == null) {
                              break label66;
                           }

                           if(var8 >= 20) {
                              break label67;
                           }
                        }

                        var8 = var7.get(2) + 1;
                        if(var1 == null) {
                           break label59;
                        }

                        var10001 = 11;
                     }

                     if(var8 == var10001) {
                        var8 = var7.get(5);
                        if(var1 == null) {
                           break label66;
                        }

                        if(var8 <= 3) {
                           break label67;
                        }
                     }

                     var8 = this.field_3028.nextBoolean();
                     break label59;
                  }

                  var8 = 7;
                  break label66;
               }

               if(var1 == null) {
                  break label62;
               }

               if(var8 != 0) {
                  return false;
               }
               break label61;
            }

            var6 = var8;
         }

         var8 = var5;
      }

      if(var1 != null) {
         var8 = var8 > this.field_3028.nextInt(var6)?0:super.method_4274();
      }

      return (boolean)var8;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4316() {
      // $FF: Couldn't be decompiled
   }
}
