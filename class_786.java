import java.util.Calendar;
import net.minecraft.item.ItemSuperBow;

// $FF: renamed from: w6
public class class_786 extends class_779 implements class_84 {

   // $FF: renamed from: bB yN
   private class_1752 field_3589;
   // $FF: renamed from: bC yB
   private class_1764 field_3590;
   // $FF: renamed from: bD java.lang.String
   private static final String field_3591;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3592;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      class_1752 var10001 = new class_1752;
      var10001.method_9702(this, 1.0D, 20, 60, 15.0F);
      this.field_3589 = var10001;
      class_1764 var4 = new class_1764;
      var4.method_9726(this, class_792.class, 1.2D, false);
      this.field_3590 = var4;
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(1, var10002);
      var10000 = this.field_3373;
      class_1750 var7 = new class_1750;
      var7.method_9699(this);
      var10000.method_9766(2, var7);
      var10000 = this.field_3373;
      class_1735 var8 = new class_1735;
      var8.method_9666(this, 1.0D);
      var10000.method_9766(3, var8);
      String[] var3 = class_752.method_4253();
      class_1776 var6 = this.field_3373;
      class_1753 var10003 = new class_1753;
      var10003.method_9705(this, 1.0D);
      var6.method_9766(5, var10003);
      var6 = this.field_3373;
      class_1728 var9 = new class_1728;
      var9.method_9657(this, class_792.class, 8.0F);
      var6.method_9766(6, var9);
      var6 = this.field_3373;
      class_1754 var10 = new class_1754;
      var10.method_9706(this);
      var6.method_9766(6, var10);
      var6 = this.field_3374;
      class_1767 var11 = new class_1767;
      var11.method_9732(this, false);
      var6.method_9766(1, var11);
      var6 = this.field_3374;
      class_1771 var12 = new class_1771;
      var12.method_9740(this, class_792.class, 0, true);
      var6.method_9766(2, var12);
      String[] var2 = var3;
      ahb var5 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return;
         }

         var5 = var1;
      }

      if(!var5.field_1832) {
         this.method_4528();
      }

   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9393).method_390(0.25D);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(13, new Byte((byte)0));
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3592;
      return "mob.skeleton.say";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3592;
      return "mob.skeleton.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3592;
      return "mob.skeleton.death";
   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      String[] var10001 = field_3592;
      this.method_3868("mob.skeleton.step", 0.15F, 1.0F);
   }

   // $FF: renamed from: n (sa) boolean
   public boolean method_4228(class_689 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = super.method_4228(var1);
      if(var2 != null) {
         if(var10000) {
            int var3 = this.method_4529();
            if(var2 != null) {
               if(var3 == 1) {
                  var3 = var1 instanceof class_752;
                  if(var2 == null) {
                     return (boolean)var3;
                  }

                  if(var3 != 0) {
                     class_752 var4 = (class_752)var1;
                     class_1645 var10001 = new class_1645;
                     var10001.method_9011(class_1635.field_8510.field_8526, 200);
                     var4.method_4179(var10001);
                  }
               }

               var3 = 1;
            }

            return (boolean)var3;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: bd () at
   public class_923 method_4213() {
      return class_923.field_4664;
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      class_786 var6;
      label79: {
         String[] var1 = class_752.method_4253();
         int var10000 = this.field_2990.method_2078();
         if(var1 != null) {
            label80: {
               if(var10000 != 0) {
                  var10000 = this.field_2990.field_1832;
                  if(var1 == null) {
                     break label80;
                  }

                  if(!this.field_2990.field_1832) {
                     float var2 = this.method_3884(1.0F);
                     float var7;
                     var10000 = (var7 = var2 - 0.5F) == 0.0F?0:(var7 < 0.0F?-1:1);
                     if(var1 == null) {
                        break label80;
                     }

                     if(var10000 > 0) {
                        float var8;
                        var10000 = (var8 = this.field_3028.nextFloat() * 30.0F - (var2 - 0.4F) * 2.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
                        if(var1 == null) {
                           break label80;
                        }

                        if(var10000 < 0) {
                           var10000 = this.field_2990.method_2067(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996));
                           if(var1 == null) {
                              break label80;
                           }

                           if(var10000 != 0) {
                              int var3;
                              label82: {
                                 var3 = 1;
                                 add var4 = this.method_4215(4);
                                 add var5 = var4;
                                 if(var1 != null) {
                                    if(var4 == null) {
                                       break label82;
                                    }

                                    var5 = var4;
                                 }

                                 var10000 = var5.method_3741();
                                 if(var1 != null) {
                                    label47: {
                                       if(var10000 != 0) {
                                          var4.method_3746(var4.method_3744() + this.field_3028.nextInt(2));
                                          var10000 = var4.method_3744();
                                          if(var1 == null) {
                                             break label47;
                                          }

                                          if(var10000 >= var4.method_3747()) {
                                             this.method_4189(var4);
                                             this.method_3935(4, (add)null);
                                          }
                                       }

                                       var10000 = 0;
                                    }
                                 }

                                 var3 = var10000;
                              }

                              var10000 = var3;
                              if(var1 == null) {
                                 break label80;
                              }

                              if(var3 != 0) {
                                 this.method_3860(8);
                              }
                           }
                        }
                     }
                  }
               }

               var6 = this;
               if(var1 == null) {
                  break label79;
               }

               var10000 = this.field_2990.field_1832;
            }
         }

         if(var10000 != 0) {
            var6 = this;
            if(var1 == null) {
               break label79;
            }

            if(this.method_4529() == 1) {
               this.method_3852(0.72F, 2.34F);
            }
         }

         var6 = this;
      }

      var6.method_4231();
   }

   // $FF: renamed from: ab () void
   public void method_3921() {
      String[] var10000 = class_752.method_4253();
      super.method_3921();
      String[] var1 = var10000;
      class_689 var3 = this.field_2988;
      if(var1 != null) {
         if(!(this.field_2988 instanceof class_761)) {
            return;
         }

         var3 = this.field_2988;
      }

      class_761 var2 = (class_761)var3;
      this.field_3330 = var2.field_3330;
   }

   // $FF: renamed from: a (vX) void
   public void method_4190(class_1691 var1) {
      class_689 var9;
      label26: {
         String[] var10000 = class_752.method_4253();
         super.method_4190(var1);
         String[] var2 = var10000;
         boolean var8 = var1.method_9344() instanceof class_713;
         if(var2 != null) {
            if(!var8) {
               return;
            }

            var9 = var1.method_9345();
            if(var2 == null) {
               break label26;
            }

            var8 = var9 instanceof class_792;
         }

         if(!var8) {
            return;
         }

         var9 = var1.method_9345();
      }

      class_792 var3 = (class_792)var9;
      double var4 = var3.field_2994 - this.field_2994;
      double var6 = var3.field_2996 - this.field_2996;
      if(var4 * var4 + var6 * var6 >= 2500.0D) {
         var3.method_4614(class_1600.field_8346);
      }

   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5120;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      String[] var3;
      int var4;
      int var5;
      label49: {
         label52: {
            var3 = class_752.method_4253();
            int var10000 = this.method_4529();
            if(var3 != null) {
               if(var10000 == 1) {
                  var4 = this.field_3028.nextInt(3 + var2) - 1;
                  var5 = 0;

                  do {
                     if(var5 >= var4) {
                        break label52;
                     }

                     this.method_3914(class_1010.field_5121, 1);
                     ++var5;
                     if(var3 == null) {
                        break label49;
                     }
                  } while(var3 != null);
               }

               var10000 = this.field_3028.nextInt(3 + var2);
            }

            var4 = var10000;
            var5 = 0;

            while(var5 < var4) {
               this.method_3914(class_1010.field_5120, 1);
               ++var5;
               if(var3 == null) {
                  break label49;
               }

               if(var3 == null) {
                  break;
               }
            }
         }

         var4 = this.field_3028.nextInt(3 + var2);
      }

      var5 = 0;

      while(var5 < var4) {
         this.method_3914(class_1010.field_5209, 1);
         ++var5;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: n (int) void
   protected void method_4195(int var1) {
      String[] var2 = class_752.method_4253();
      class_786 var10000 = this;
      if(var2 != null) {
         if(this.method_4529() != 1) {
            return;
         }

         var10000 = this;
      }

      add var10001 = new add;
      var10001.method_3726(class_1010.field_5253, 1, 1);
      var10000.method_3916(var10001, 0.0F);
   }

   // $FF: renamed from: bC () void
   protected void method_4278() {
      super.method_4278();
      add var10002 = new add;
      var10002.method_3724(class_1010.field_5119);
      this.method_3935(0, var10002);
   }

   // $FF: renamed from: a (xY) xY
   public class_83 method_4282(class_83 var1) {
      class_786 var10000;
      String[] var2;
      add var10002;
      label70: {
         var1 = super.method_4282(var1);
         var2 = class_752.method_4253();
         var10000 = this;
         if(var2 != null) {
            label68: {
               if(this.field_2990.field_1820 instanceof class_1092) {
                  var10000 = this;
                  if(var2 == null) {
                     break label68;
                  }

                  if(this.method_4165().nextInt(5) > 0) {
                     this.field_3373.method_9766(4, this.field_3590);
                     this.method_4530(1);
                     var10002 = new add;
                     var10002.method_3724(class_1010.field_5130);
                     this.method_3935(0, var10002);
                     this.method_4211(class_1840.field_9394).method_390(4.0D);
                     if(var2 != null) {
                        break label70;
                     }
                  }
               }

               this.field_3373.method_9766(4, this.field_3589);
               this.method_4278();
               var10000 = this;
            }
         }

         var10000.method_4281();
      }

      float var6;
      int var10001 = (var6 = this.field_3028.nextFloat() - 0.55F * this.field_2990.method_2222(this.field_2994, this.field_2995, this.field_2996)) == 0.0F?0:(var6 < 0.0F?-1:1);
      if(var2 != null) {
         var10001 = var10001 < 0?1:0;
      }

      this.method_4293((boolean)var10001);
      var10000 = this;
      if(var2 != null) {
         if(this.method_4215(4) != null) {
            return var1;
         }

         var10000 = this;
      }

      label74: {
         int var5;
         label75: {
            Calendar var3 = var10000.field_2990.method_2218();
            var5 = var3.get(2) + 1;
            byte var4 = 10;
            if(var2 != null) {
               if(var5 != 10) {
                  return var1;
               }

               var5 = var3.get(5);
               if(var2 == null) {
                  break label75;
               }

               var4 = 31;
            }

            if(var5 != var4) {
               return var1;
            }

            var10000 = this;
            if(var2 == null) {
               break label74;
            }

            float var7;
            var5 = (var7 = this.field_3028.nextFloat() - 0.25F) == 0.0F?0:(var7 < 0.0F?-1:1);
         }

         if(var5 >= 0) {
            return var1;
         }

         var10000 = this;
      }

      var10002 = new add;
      var10002.method_3721(this.field_3028.nextFloat() < 0.1F?class_1192.field_6117:class_1192.field_6112);
      var10000.method_3935(4, var10002);
      this.field_3378[4] = 0.0F;
      return var1;
   }

   // $FF: renamed from: b () void
   public void method_4528() {
      label31: {
         this.field_3373.method_9767(this.field_3590);
         String[] var1 = class_752.method_4253();
         this.field_3373.method_9767(this.field_3589);
         add var2 = this.method_4214();
         add var10000 = var2;
         if(var1 != null) {
            if(var2 == null) {
               break label31;
            }

            var10000 = var2;
         }

         label22: {
            boolean var3 = var10000.method_3730() instanceof class_573;
            if(var1 != null) {
               if(var3) {
                  break label22;
               }

               var3 = var2.method_3730() instanceof ItemSuperBow;
            }

            if(!var3) {
               break label31;
            }
         }

         this.field_3373.method_9766(4, this.field_3589);
         if(var1 != null) {
            return;
         }
      }

      this.field_3373.method_9766(4, this.field_3590);
   }

   // $FF: renamed from: b (sv, float) void
   public void method_404(class_752 var1, float var2) {
      String[] var10000 = class_752.method_4253();
      class_713 var10001 = new class_713;
      var10001.method_4075(this.field_2990, this, var1, 1.6F, (float)(14 - this.field_2990.field_1818.method_5392() * 4));
      class_713 var4 = var10001;
      int var5 = class_980.method_5640(class_940.field_4802.field_4808, this.method_4214());
      int var6 = class_980.method_5640(class_940.field_4803.field_4808, this.method_4214());
      var4.method_4077((double)(var2 * 2.0F) + this.field_3028.nextGaussian() * 0.25D + (double)((float)this.field_2990.field_1818.method_5392() * 0.11F));
      String[] var3 = var10000;
      int var7 = var5;
      if(var3 != null) {
         if(var5 > 0) {
            var4.method_4077(var4.method_4078() + (double)var5 * 0.5D + 0.5D);
         }

         var7 = var6;
      }

      if(var3 != null) {
         if(var7 > 0) {
            var4.method_4079(var6);
         }

         var7 = class_980.method_5640(class_940.field_4804.field_4808, this.method_4214());
      }

      label35: {
         label42: {
            if(var3 != null) {
               if(var7 > 0) {
                  break label42;
               }

               var7 = this.method_4529();
            }

            if(var3 == null) {
               return;
            }

            if(var7 != 1) {
               break label35;
            }
         }

         var4.method_3860(100);
      }

      String[] var8 = field_3592;
      this.method_3868("random.bow", 1.0F, 1.0F / (this.method_4165().nextFloat() * 0.4F + 0.8F));
      this.field_2990.method_2089(var4);
   }

   // $FF: renamed from: a8 () int
   public int method_4529() {
      return this.field_3036.method_9499(13);
   }

   // $FF: renamed from: c (int) void
   public void method_4530(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_3036.method_9506(13, Byte.valueOf((byte)var1));
      String[] var2 = var10000;
      int var10001 = var1;
      if(var2 != null) {
         var10001 = var1 == 1?1:0;
      }

      label23: {
         this.field_3035 = (boolean)var10001;
         if(var2 != null) {
            if(var1 != 1) {
               break label23;
            }

            this.method_3852(0.72F, 2.34F);
         }

         if(var2 != null) {
            return;
         }
      }

      this.method_3852(0.6F, 1.8F);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3908(var1);
      String[] var2 = var10000;
      if(var2 != null) {
         String[] var4 = field_3592;
         if(var1.initGui8("SkeletonType", 99)) {
            byte var3 = var1.initGui9("SkeletonType");
            this.method_4530(var3);
         }

         this.method_4528();
      }

   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3592;
      var1.method_8665("SkeletonType", (byte)this.method_4529());
   }

   // $FF: renamed from: c (int, add) void
   public void method_3935(int var1, add var2) {
      String[] var10000 = class_752.method_4253();
      super.method_3935(var1, var2);
      String[] var3 = var10000;
      int var4 = this.field_2990.field_1832;
      if(var3 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var4 = var1;
      }

      if(var4 == 0) {
         this.method_4528();
      }

   }

   // $FF: renamed from: ad () double
   public double method_3923() {
      return super.method_3923() - 0.5D;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
