import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

// $FF: renamed from: w9
public class class_781 extends class_779 {

   // $FF: renamed from: bB x3
   protected static final class_79 field_3566;
   // $FF: renamed from: bC java.util.UUID
   private static final UUID field_3567;
   // $FF: renamed from: bD x5
   private static final class_1716 field_3568;
   // $FF: renamed from: bE yo
   private final class_1739 field_3569;
   // $FF: renamed from: bF int
   private int field_3570;
   // $FF: renamed from: bG boolean
   private boolean field_3571;
   // $FF: renamed from: bH float
   private float field_3572;
   // $FF: renamed from: bI float
   private float field_3573;
   // $FF: renamed from: bJ java.lang.String
   private static final String field_3574;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3575;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      class_1739 var10001 = new class_1739;
      var10001.method_9671(this);
      this.field_3569 = var10001;
      this.field_3571 = false;
      this.field_3572 = -1.0F;
      this.method_4257().method_9786(true);
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(0, var10002);
      var10000 = this.field_3373;
      class_1764 var3 = new class_1764;
      var3.method_9726(this, class_792.class, 1.0D, false);
      var10000.method_9766(2, var3);
      var10000 = this.field_3373;
      var3 = new class_1764;
      var3.method_9726(this, class_768.class, 1.0D, true);
      var10000.method_9766(4, var3);
      var10000 = this.field_3373;
      class_1761 var4 = new class_1761;
      var4.method_9719(this, 1.0D);
      var10000.method_9766(5, var4);
      var10000 = this.field_3373;
      class_1762 var5 = new class_1762;
      var5.method_9720(this, 1.0D, false);
      var10000.method_9766(6, var5);
      var10000 = this.field_3373;
      class_1753 var6 = new class_1753;
      var6.method_9705(this, 1.0D);
      var10000.method_9766(7, var6);
      var10000 = this.field_3373;
      class_1728 var7 = new class_1728;
      var7.method_9657(this, class_792.class, 8.0F);
      var10000.method_9766(8, var7);
      var10000 = this.field_3373;
      class_1754 var8 = new class_1754;
      var8.method_9706(this);
      var10000.method_9766(8, var8);
      var10000 = this.field_3374;
      class_1767 var9 = new class_1767;
      var9.method_9732(this, true);
      var10000.method_9766(1, var9);
      var10000 = this.field_3374;
      class_1771 var2 = new class_1771;
      var2.method_9740(this, class_792.class, 0, true);
      var10000.method_9766(2, var2);
      var10000 = this.field_3374;
      var2 = new class_1771;
      var2.method_9740(this, class_768.class, 0, false);
      var10000.method_9766(2, var2);
      this.method_3852(0.6F, 1.8F);
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9391).method_390(40.0D);
      this.method_4211(class_1840.field_9393).method_390(0.23000000417232513D);
      this.method_4211(class_1840.field_9394).method_390(3.0D);
      this.method_4212().method_9617(field_3566).method_390(this.field_3028.nextDouble() * 0.10000000149011612D);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.method_3849().method_9497(12, Byte.valueOf((byte)0));
      this.method_3849().method_9497(13, Byte.valueOf((byte)0));
      this.method_3849().method_9497(14, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: aV () int
   public int method_4199() {
      String[] var10000 = class_752.method_4253();
      int var2 = super.method_4199() + 2;
      String[] var1 = var10000;
      int var3 = var2;
      if(var1 != null) {
         if(var2 > 20) {
            var2 = 20;
         }

         var3 = var2;
      }

      return var3;
   }

   // $FF: renamed from: bk () boolean
   protected boolean method_4225() {
      return true;
   }

   // $FF: renamed from: b () boolean
   public boolean method_4512() {
      return this.field_3571;
   }

   // $FF: renamed from: i (boolean) void
   public void method_4513(boolean var1) {
      class_781 var3;
      label26: {
         String[] var2 = class_752.method_4253();
         boolean var10000 = this.field_3571;
         if(var2 != null) {
            if(this.field_3571 == var1) {
               return;
            }

            var3 = this;
            if(var2 == null) {
               break label26;
            }

            this.field_3571 = var1;
            var10000 = var1;
         }

         if(var10000) {
            this.field_3373.method_9766(1, this.field_3569);
            if(var2 != null) {
               return;
            }
         }

         var3 = this;
      }

      var3.field_3373.method_9767(this.field_3569);
   }

   // $FF: renamed from: f () boolean
   public boolean method_4159() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_3849().method_9499(12);
      if(var1 != null) {
         var10000 = var10000 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: e (yz) int
   protected int method_4163(class_792 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.method_4159();
      if(var2 != null) {
         if(var10000 != 0) {
            this.field_3367 = (int)((float)this.field_3367 * 2.5F);
         }

         var10000 = super.method_4163(var1);
      }

      return var10000;
   }

   // $FF: renamed from: j (boolean) void
   public void method_4514(boolean var1) {
      String[] var2 = class_752.method_4253();
      class_1710 var10000 = this.method_3849();
      int var10002 = var1;
      if(var2 != null) {
         var10002 = var1 != 0?1:0;
      }

      var10000.method_9506(12, Byte.valueOf((byte)var10002));
      class_781 var4 = this;
      if(var2 != null) {
         label30: {
            if(this.field_2990 != null) {
               var4 = this;
               if(var2 == null) {
                  break label30;
               }

               if(!this.field_2990.field_1832) {
                  class_80 var3 = this.method_4211(class_1840.field_9393);
                  var3.method_394(field_3568);
                  if(var2 == null) {
                     return;
                  }

                  if(var1 != 0) {
                     var3.method_393(field_3568);
                  }
               }
            }

            var4 = this;
         }
      }

      var4.method_4521((boolean)var1);
   }

   // $FF: renamed from: a8 () boolean
   public boolean method_4515() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_3849().method_9499(13);
      if(var1 != null) {
         var10000 = var10000 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: k (boolean) void
   public void method_4516(boolean var1) {
      String[] var2 = class_752.method_4253();
      class_1710 var10000 = this.method_3849();
      int var10002 = var1;
      if(var2 != null) {
         var10002 = var1 != 0?1:0;
      }

      var10000.method_9506(13, Byte.valueOf((byte)var10002));
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      class_781 var6;
      label89: {
         String[] var1 = class_752.method_4253();
         int var10000 = this.field_2990.method_2078();
         if(var1 != null) {
            label90: {
               if(var10000 != 0) {
                  var10000 = this.field_2990.field_1832;
                  if(var1 == null) {
                     break label90;
                  }

                  if(!this.field_2990.field_1832) {
                     var10000 = this.method_4159();
                     if(var1 == null) {
                        break label90;
                     }

                     if(var10000 == 0) {
                        float var2 = this.method_3884(1.0F);
                        float var7;
                        var10000 = (var7 = var2 - 0.5F) == 0.0F?0:(var7 < 0.0F?-1:1);
                        if(var1 == null) {
                           break label90;
                        }

                        if(var10000 > 0) {
                           float var8;
                           var10000 = (var8 = this.field_3028.nextFloat() * 30.0F - (var2 - 0.4F) * 2.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
                           if(var1 == null) {
                              break label90;
                           }

                           if(var10000 < 0) {
                              var10000 = this.field_2990.method_2067(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996));
                              if(var1 == null) {
                                 break label90;
                              }

                              if(var10000 != 0) {
                                 int var3;
                                 label92: {
                                    var3 = 1;
                                    add var4 = this.method_4215(4);
                                    add var5 = var4;
                                    if(var1 != null) {
                                       if(var4 == null) {
                                          break label92;
                                       }

                                       var5 = var4;
                                    }

                                    var10000 = var5.method_3741();
                                    if(var1 != null) {
                                       label54: {
                                          if(var10000 != 0) {
                                             var4.method_3746(var4.method_3744() + this.field_3028.nextInt(2));
                                             var10000 = var4.method_3744();
                                             if(var1 == null) {
                                                break label54;
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
                                    break label90;
                                 }

                                 if(var3 != 0) {
                                    this.method_3860(8);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var6 = this;
               if(var1 == null) {
                  break label89;
               }

               var10000 = this.method_3937();
            }
         }

         if(var10000 != 0) {
            var6 = this;
            if(var1 == null) {
               break label89;
            }

            if(this.method_4259() != null) {
               var6 = this;
               if(var1 == null) {
                  break label89;
               }

               if(this.field_2988 instanceof class_775) {
                  ((class_753)this.field_2988).method_4257().method_9797(this.method_4257().method_9798(), 1.5D);
               }
            }
         }

         var6 = this;
      }

      var6.method_4231();
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      Object var10000 = this;
      if(var3 != null) {
         if(!super.method_3896(var1, var2)) {
            return false;
         }

         var10000 = this.method_4259();
      }

      Object var4 = var10000;
      var10000 = var4;
      if(var3 != null) {
         label109: {
            if(var4 == null) {
               var10000 = this;
               if(var3 == null) {
                  break label109;
               }

               if(this.method_4335() instanceof class_752) {
                  var4 = (class_752)this.method_4335();
               }
            }

            var10000 = var4;
         }
      }

      if(var3 != null) {
         if(var10000 == null) {
            label100: {
               class_689 var14 = var1.method_9345();
               if(var3 != null) {
                  if(!(var14 instanceof class_752)) {
                     break label100;
                  }

                  var14 = var1.method_9345();
               }

               var4 = (class_752)var14;
            }
         }

         var10000 = var4;
      }

      int var16;
      if(var10000 != null) {
         label114: {
            class_781 var15 = this;
            if(var3 != null) {
               if(this.field_2990.field_1818 != class_918.field_4630) {
                  break label114;
               }

               var15 = this;
            }

            double var19;
            var16 = (var19 = (double)var15.field_3028.nextFloat() - this.method_4211(field_3566).method_396()) == 0.0D?0:(var19 < 0.0D?-1:1);
            if(var3 == null) {
               return (boolean)var16;
            }

            if(var16 < 0) {
               int var5 = class_1715.method_9561(this.field_2994);
               int var6 = class_1715.method_9561(this.field_2995);
               int var7 = class_1715.method_9561(this.field_2996);
               var15 = new class_781;
               var15.method_3847(this.field_2990);
               class_781 var8 = var15;
               int var9 = 0;

               while(var9 < 50) {
                  int var10 = var5 + class_1715.method_9575(this.field_3028, 7, 40) * class_1715.method_9575(this.field_3028, -1, 1);
                  int var11 = var6 + class_1715.method_9575(this.field_3028, 7, 40) * class_1715.method_9575(this.field_3028, -1, 1);
                  int var12 = var7 + class_1715.method_9575(this.field_3028, 7, 40) * class_1715.method_9575(this.field_3028, -1, 1);
                  if(var3 != null) {
                     label116: {
                        var16 = ahb.method_2135(this.field_2990, var10, var11 - 1, var12);
                        if(var3 == null) {
                           return (boolean)var16;
                        }

                        if(var16 != 0) {
                           label77: {
                              var16 = this.field_2990.method_2069(var10, var11, var12);
                              if(var3 != null) {
                                 if(var16 >= 10) {
                                    break label77;
                                 }

                                 var8.method_3854((double)var10, (double)var11, (double)var12);
                                 if(var3 == null) {
                                    break label116;
                                 }

                                 var16 = this.field_2990.method_2117(var8.field_3004);
                              }

                              if(var16 != 0) {
                                 label118: {
                                    boolean var17 = this.field_2990.method_2096(var8, var8.field_3004).isEmpty();
                                    if(var3 != null) {
                                       if(!var17) {
                                          break label118;
                                       }

                                       var17 = this.field_2990.method_2120(var8.field_3004);
                                    }

                                    if(var3 != null) {
                                       if(var17) {
                                          break label118;
                                       }

                                       this.field_2990.method_2089(var8);
                                    }

                                    var8.method_4260((class_752)var4);
                                    var8.method_4282((class_83)null);
                                    class_80 var18 = this.method_4211(field_3566);
                                    class_1716 var10001 = new class_1716;
                                    String[] var13 = field_3575;
                                    var10001.method_9592("Zombie reinforcement caller charge", -0.05000000074505806D, 0);
                                    var18.method_393(var10001);
                                    var18 = var8.method_4211(field_3566);
                                    var10001 = new class_1716;
                                    var10001.method_9592("Zombie reinforcement callee charge", -0.05000000074505806D, 0);
                                    var18.method_393(var10001);
                                    if(var3 != null) {
                                       break;
                                    }
                                 }
                              }
                           }
                        }

                        ++var9;
                     }
                  }

                  if(var3 == null) {
                     break;
                  }
               }
            }
         }
      }

      var16 = 1;
      return (boolean)var16;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1 = class_752.method_4253();
      class_781 var10000 = this;
      if(var1 != null) {
         label21: {
            if(!this.field_2990.field_1832) {
               var10000 = this;
               if(var1 == null) {
                  break label21;
               }

               if(this.method_4518()) {
                  int var2 = this.method_4520();
                  this.field_3570 -= var2;
                  var10000 = this;
                  if(var1 == null) {
                     break label21;
                  }

                  if(this.field_3570 <= 0) {
                     this.method_4519();
                  }
               }
            }

            var10000 = this;
         }
      }

      var10000.method_3856();
   }

   // $FF: renamed from: n (sa) boolean
   public boolean method_4228(class_689 var1) {
      String[] var10000 = class_752.method_4253();
      byte var3 = super.method_4228(var1);
      String[] var2 = var10000;
      int var5 = var3;
      if(var2 != null) {
         if(var3 != 0) {
            var5 = this.field_2990.field_1818.method_5392();
            if(var2 == null) {
               return (boolean)var5;
            }

            int var4 = var5;
            if(this.method_4214() == null) {
               var5 = this.method_3936();
               if(var2 == null) {
                  return (boolean)var5;
               }

               if(var5 != 0) {
                  float var6;
                  var5 = (var6 = this.field_3028.nextFloat() - (float)var4 * 0.3F) == 0.0F?0:(var6 < 0.0F?-1:1);
                  if(var2 == null) {
                     return (boolean)var5;
                  }

                  if(var5 < 0) {
                     var1.method_3860(2 * var4);
                  }
               }
            }
         }

         var5 = var3;
      }

      return (boolean)var5;
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3575;
      return "mob.zombie.say";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3575;
      return "mob.zombie.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3575;
      return "mob.zombie.death";
   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      String[] var10001 = field_3575;
      this.method_3868("mob.zombie.step", 0.15F, 1.0F);
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5224;
   }

   // $FF: renamed from: bd () at
   public class_923 method_4213() {
      return class_923.field_4664;
   }

   // $FF: renamed from: n (int) void
   protected void method_4195(int var1) {
      label25: {
         String[] var2;
         label24: {
            var2 = class_752.method_4253();
            class_781 var10000 = this;
            if(var2 != null) {
               switch(this.field_3028.nextInt(3)) {
               case 0:
                  var10000 = this;
                  break;
               case 1:
                  break label24;
               case 2:
                  break label25;
               default:
                  return;
               }
            }

            var10000.method_3914(class_1010.field_5123, 1);
            if(var2 != null) {
               return;
            }
         }

         this.method_3914(class_1010.field_5247, 1);
         if(var2 != null) {
            return;
         }
      }

      this.method_3914(class_1010.field_5248, 1);
   }

   // $FF: renamed from: bC () void
   protected void method_4278() {
      String[] var10000 = class_752.method_4253();
      super.method_4278();
      String[] var1 = var10000;
      float var4;
      int var3 = (var4 = this.field_3028.nextFloat() - (this.field_2990.field_1818 == class_918.field_4630?0.05F:0.01F)) == 0.0F?0:(var4 < 0.0F?-1:1);
      if(var1 != null) {
         if(var3 >= 0) {
            return;
         }

         var3 = this.field_3028.nextInt(3);
      }

      add var10002;
      label23: {
         int var2 = var3;
         if(var1 != null) {
            if(var2 != 0) {
               break label23;
            }

            var10002 = new add;
            var10002.method_3724(class_1010.field_5125);
            this.method_3935(0, var10002);
         }

         if(var1 != null) {
            return;
         }
      }

      var10002 = new add;
      var10002.method_3724(class_1010.field_5114);
      this.method_3935(0, var10002);
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3909(var1);
      String[] var2 = var10000;
      boolean var4 = this.method_4159();
      String[] var3;
      if(var2 != null) {
         if(var4) {
            var3 = field_3575;
            var1.initGui4("IsBaby", true);
         }

         var4 = this.method_4515();
      }

      if(var4) {
         var3 = field_3575;
         var1.initGui4("IsVillager", true);
      }

      var3 = field_3575;
      int var10002 = this.method_4518();
      if(var2 != null) {
         var10002 = var10002 != 0?this.field_3570:-1;
      }

      var1.method_8667("ConversionTime", var10002);
      String[] var10001 = field_3575;
      var1.initGui4("CanBreakDoors", this.method_4512());
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var2 = class_752.method_4253();
      String[] var3 = field_3575;
      int var10000 = var1.method_8690("IsBaby");
      if(var2 != null) {
         if(var10000 != 0) {
            this.method_4514(true);
         }

         var3 = field_3575;
         var10000 = var1.method_8690("IsVillager");
      }

      if(var2 != null) {
         if(var10000 != 0) {
            this.method_4516(true);
         }

         var3 = field_3575;
         var10000 = var1.initGui8("ConversionTime", 99);
      }

      label28: {
         if(var2 != null) {
            if(var10000 == 0) {
               break label28;
            }

            var3 = field_3575;
            var10000 = var1.method_8681("ConversionTime");
         }

         if(var10000 > -1) {
            var3 = field_3575;
            this.method_4517(var1.method_8681("ConversionTime"));
         }
      }

      String[] var10002 = field_3575;
      this.method_4513(var1.method_8690("CanBreakDoors"));
   }

   // $FF: renamed from: a (sv) void
   public void method_3952(class_752 var1) {
      super.method_3952(var1);
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         label41: {
            if(this.field_2990.field_1818 != class_918.field_4629) {
               var10000 = this;
               if(var2 == null) {
                  break label41;
               }

               if(this.field_2990.field_1818 != class_918.field_4630) {
                  return;
               }
            }

            var10000 = var1;
         }
      }

      if(var10000 instanceof class_768) {
         class_781 var4 = this;
         if(var2 != null) {
            label31: {
               if(this.field_2990.field_1818 != class_918.field_4630) {
                  var4 = this;
                  if(var2 == null) {
                     break label31;
                  }

                  if(this.field_3028.nextBoolean()) {
                     return;
                  }
               }

               var4 = new class_781;
               var4.method_3847(this.field_2990);
            }
         }

         class_781 var3 = var4;
         var3.method_3962(var1);
         this.field_2990.method_2092(var1);
         var3.method_4282((class_83)null);
         var3.method_4516(true);
         boolean var5 = var1.method_4159();
         if(var2 != null) {
            if(var5) {
               var3.method_4514(true);
            }

            this.field_2990.method_2089(var3);
         }

         this.field_2990.method_2211((class_792)null, 1016, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
      }

   }

   // $FF: renamed from: a (xY) xY
   public class_83 method_4282(class_83 var1) {
      String[] var10000 = class_752.method_4253();
      Object var3 = super.method_4282(var1);
      String[] var2 = var10000;
      float var4 = this.field_2990.method_2222(this.field_2994, this.field_2995, this.field_2996);
      float var20;
      int var10001 = (var20 = this.field_3028.nextFloat() - 0.55F * var4) == 0.0F?0:(var20 < 0.0F?-1:1);
      if(var2 != null) {
         var10001 = var10001 < 0?1:0;
      }

      this.method_4293((boolean)var10001);
      Object var12 = var3;
      if(var2 != null) {
         if(var3 == null) {
            class_663 var13 = new class_663;
            var13.method_3581(this, this.field_2990.field_1819.nextFloat() < 0.05F, this.field_2990.field_1819.nextFloat() < 0.05F, (Object)null);
            var3 = var13;
         }

         var12 = var3;
      }

      int var14;
      class_781 var16;
      label145: {
         label152: {
            if(var2 != null) {
               if(!(var12 instanceof class_663)) {
                  break label152;
               }

               var12 = var3;
            }

            class_663 var5 = (class_663)var12;
            var14 = var5.field_2830;
            if(var2 != null) {
               if(var5.field_2830) {
                  this.method_4516(true);
               }

               var14 = var5.field_2829;
            }

            if(var2 != null) {
               if(var14 == 0) {
                  break label152;
               }

               this.method_4514(true);
               double var21;
               var14 = (var21 = (double)this.field_2990.field_1819.nextFloat() - 0.05D) == 0.0D?0:(var21 < 0.0D?-1:1);
            }

            if(var2 != null) {
               if(var14 < 0) {
                  label123: {
                     List var6 = this.field_2990.method_2158(class_775.class, this.field_3004.method_7097(5.0D, 3.0D, 5.0D), class_82.field_10);
                     var12 = var6;
                     if(var2 != null) {
                        if(var6.isEmpty()) {
                           break label123;
                        }

                        var12 = var6.get(0);
                     }

                     class_775 var7 = (class_775)var12;
                     var7.method_4474(true);
                     this.method_3925(var7);
                  }

                  if(var2 != null) {
                     break label152;
                  }
               }

               var16 = this;
               if(var2 == null) {
                  break label145;
               }

               double var22;
               var14 = (var22 = (double)this.field_2990.field_1819.nextFloat() - 0.05D) == 0.0D?0:(var22 < 0.0D?-1:1);
            }

            if(var14 < 0) {
               class_775 var17 = new class_775;
               var17.method_3847(this.field_2990);
               class_775 var11 = var17;
               var11.method_3887(this.field_2994, this.field_2995, this.field_2996, this.field_3000, 0.0F);
               var11.method_4282((class_83)null);
               var11.method_4474(true);
               this.field_2990.method_2089(var11);
               this.method_3925(var11);
            }
         }

         var16 = this;
      }

      float var23;
      var10001 = (var23 = this.field_3028.nextFloat() - var4 * 0.1F) == 0.0F?0:(var23 < 0.0F?-1:1);
      if(var2 != null) {
         var10001 = var10001 < 0?1:0;
      }

      String[] var8;
      class_1716 var15;
      Random var18;
      class_80 var19;
      label116: {
         var16.method_4513((boolean)var10001);
         this.method_4278();
         this.method_4281();
         var16 = this;
         if(var2 != null) {
            label113: {
               if(this.method_4215(4) == null) {
                  Calendar var9 = this.field_2990.method_2218();
                  if(var2 == null) {
                     break label113;
                  }

                  if(var9.get(2) + 1 == 10) {
                     label107: {
                        var14 = var9.get(5);
                        if(var2 != null) {
                           if(var14 != 31) {
                              break label107;
                           }

                           var18 = this.field_3028;
                           if(var2 == null) {
                              break label116;
                           }

                           float var24;
                           var14 = (var24 = this.field_3028.nextFloat() - 0.25F) == 0.0F?0:(var24 < 0.0F?-1:1);
                        }

                        if(var14 < 0) {
                           add var10002 = new add;
                           var10002.method_3721(this.field_3028.nextFloat() < 0.1F?class_1192.field_6117:class_1192.field_6112);
                           this.method_3935(4, var10002);
                           this.field_3378[4] = 0.0F;
                        }
                     }
                  }
               }

               var19 = this.method_4211(class_1840.field_9392);
               var15 = new class_1716;
               var8 = field_3575;
               var15.method_9592("Random spawn bonus", this.field_3028.nextDouble() * 0.05000000074505806D, 0);
               var19.method_393(var15);
            }

            var16 = this;
         }

         var18 = var16.field_3028;
      }

      label155: {
         double var10 = var18.nextDouble() * 1.5D * (double)this.field_2990.method_2222(this.field_2994, this.field_2995, this.field_2996);
         double var25;
         var14 = (var25 = var10 - 1.0D) == 0.0D?0:(var25 < 0.0D?-1:1);
         if(var2 != null) {
            if(var14 > 0) {
               var19 = this.method_4211(class_1840.field_9391);
               var15 = new class_1716;
               var8 = field_3575;
               var15.method_9592("Random zombie-spawn bonus", var10, 2);
               var19.method_393(var15);
            }

            var16 = this;
            if(var2 == null) {
               break label155;
            }

            float var26;
            var14 = (var26 = this.field_3028.nextFloat() - var4 * 0.05F) == 0.0F?0:(var26 < 0.0F?-1:1);
         }

         if(var14 >= 0) {
            return (class_83)var3;
         }

         var19 = this.method_4211(field_3566);
         var15 = new class_1716;
         var8 = field_3575;
         var15.method_9592("Leader zombie bonus", this.field_3028.nextDouble() * 0.25D + 0.5D, 0);
         var19.method_393(var15);
         var19 = this.method_4211(class_1840.field_9390);
         var15 = new class_1716;
         var15.method_9592("Leader zombie bonus", this.field_3028.nextDouble() * 3.0D + 1.0D, 2);
         var19.method_393(var15);
         var16 = this;
      }

      var16.method_4513(true);
      return (class_83)var3;
   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      int var5;
      label65: {
         String[] var10000 = class_752.method_4253();
         add var3 = var1.method_4593();
         String[] var2 = var10000;
         add var4 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label65;
            }

            var4 = var3;
         }

         if(var2 != null) {
            if(var4.method_3730() != class_1010.field_5180) {
               break label65;
            }

            var4 = var3;
         }

         var5 = var4.method_3745();
         if(var2 == null) {
            return (boolean)var5;
         }

         if(var5 == 0) {
            var5 = this.method_4515();
            if(var2 == null) {
               return (boolean)var5;
            }

            if(var5 != 0) {
               var5 = this.method_4177(class_1635.field_8508);
               if(var2 == null) {
                  return (boolean)var5;
               }

               if(var5 != 0) {
                  var5 = var1.field_3640.field_2839;
                  if(var2 != null) {
                     if(!var1.field_3640.field_2839) {
                        --var3.field_2958;
                     }

                     var5 = var3.field_2958;
                  }

                  if(var2 != null) {
                     if(var5 <= 0) {
                        var1.field_3616.method_87(var1.field_3616.field_2846, (add)null);
                     }

                     var5 = this.field_2990.field_1832;
                  }

                  if(var2 != null) {
                     if(var5 == 0) {
                        this.method_4517(this.field_3028.nextInt(2401) + 3600);
                     }

                     var5 = 1;
                  }

                  return (boolean)var5;
               }
            }
         }
      }

      var5 = 0;
      return (boolean)var5;
   }

   // $FF: renamed from: c (int) void
   protected void method_4517(int var1) {
      this.field_3570 = var1;
      this.method_3849().method_9506(14, Byte.valueOf((byte)1));
      this.method_4183(class_1635.field_8508.field_8526);
      class_1645 var10001 = new class_1645;
      var10001.method_9012(class_1635.field_8495.field_8526, var1, Math.min(this.field_2990.field_1818.method_5392() - 1, 0));
      this.method_4179(var10001);
      this.field_2990.method_2191(this, (byte)16);
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      label16: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(var1 != 16) {
               break label16;
            }

            double var10001 = this.field_2994 + 0.5D;
            double var10002 = this.field_2995 + 0.5D;
            double var10003 = this.field_2996 + 0.5D;
            String[] var10004 = field_3575;
            this.field_2990.method_2085(var10001, var10002, var10003, "mob.zombie.remedy", 1.0F + this.field_3028.nextFloat(), this.field_3028.nextFloat() * 0.7F + 0.3F, false);
         }

         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: v () boolean
   protected boolean method_4269() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.method_4518();
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: a9 () boolean
   public boolean method_4518() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_3849().method_9499(14);
      if(var1 != null) {
         var10000 = var10000 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a_ () void
   protected void method_4519() {
      String[] var10000 = class_752.method_4253();
      class_768 var10001 = new class_768;
      var10001.method_3847(this.field_2990);
      class_768 var2 = var10001;
      String[] var1 = var10000;
      var2.method_3962(this);
      var2.method_4282((class_83)null);
      var2.method_4375();
      boolean var3 = this.method_4159();
      if(var1 != null) {
         if(var3) {
            var2.method_4356(-24000);
         }

         this.field_2990.method_2092(this);
         this.field_2990.method_2089(var2);
      }

      class_1645 var4 = new class_1645;
      var4.method_9012(class_1635.field_8499.field_8526, 200, 0);
      var2.method_4179(var4);
      this.field_2990.method_2211((class_792)null, 1017, (int)this.field_2994, (int)this.field_2995, (int)this.field_2996, 0);
   }

   // $FF: renamed from: bw () int
   protected int method_4520() {
      String[] var10000 = class_752.method_4253();
      int var2 = 1;
      String[] var1 = var10000;
      float var11;
      int var8 = (var11 = this.field_3028.nextFloat() - 0.01F) == 0.0F?0:(var11 < 0.0F?-1:1);
      if(var1 != null) {
         if(var8 < 0) {
            int var3 = 0;
            int var4 = (int)this.field_2994 - 4;

            label86:
            do {
               var8 = var4;
               int var10001 = (int)this.field_2994 + 4;

               label83:
               while(true) {
                  if(var8 >= var10001) {
                     break label86;
                  }

                  var8 = var3;
                  if(var1 == null || var1 == null) {
                     return var8;
                  }

                  if(var3 >= 14) {
                     break label86;
                  }

                  int var5 = (int)this.field_2995 - 4;

                  while(true) {
                     var8 = var5;
                     var10001 = (int)this.field_2995 + 4;

                     label79:
                     while(true) {
                        if(var8 >= var10001) {
                           break label83;
                        }

                        var8 = var3;
                        var10001 = 14;
                        if(var1 == null) {
                           continue label83;
                        }

                        if(var1 != null) {
                           if(var3 >= 14) {
                              break label83;
                           }

                           var8 = (int)this.field_2996;
                           var10001 = 4;
                        }

                        int var6 = var8 - var10001;

                        while(var6 < (int)this.field_2996 + 4) {
                           var8 = var3;
                           var10001 = 14;
                           if(var1 == null) {
                              continue label79;
                           }

                           if(var3 >= 14) {
                              break;
                           }

                           label96: {
                              label43: {
                                 aji var7 = this.field_2990.getBlock(var4, var5, var6);
                                 aji var9 = var7;
                                 aji var10 = class_1192.field_6126;
                                 if(var1 != null) {
                                    if(var7 == class_1192.field_6126) {
                                       break label43;
                                    }

                                    var9 = var7;
                                    var10 = class_1192.field_6053;
                                 }

                                 if(var9 != var10) {
                                    break label96;
                                 }
                              }

                              if(this.field_3028.nextFloat() < 0.3F) {
                                 ++var2;
                              }

                              ++var3;
                           }

                           ++var6;
                           if(var1 == null) {
                              break;
                           }
                        }

                        ++var5;
                        if(var1 == null) {
                           break label83;
                        }
                        break;
                     }
                  }
               }

               ++var4;
            } while(var1 != null);
         }

         var8 = var2;
      }

      return var8;
   }

   // $FF: renamed from: l (boolean) void
   public void method_4521(boolean var1) {
      this.method_4522(var1?0.5F:1.0F);
   }

   // $FF: renamed from: a (float, float) void
   protected final void method_3852(float var1, float var2) {
      int var10000;
      String[] var3;
      label32: {
         label35: {
            var3 = class_752.method_4253();
            float var6;
            var10000 = (var6 = this.field_3572 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
            if(var3 != null) {
               if(var10000 <= 0) {
                  break label35;
               }

               float var7;
               var10000 = (var7 = this.field_3573 - 0.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
            }

            if(var3 == null) {
               break label32;
            }

            if(var10000 > 0) {
               var10000 = 1;
               break label32;
            }
         }

         var10000 = 0;
      }

      int var4 = var10000;
      this.field_3572 = var1;
      class_781 var5 = this;
      float var10001 = var2;
      if(var3 != null) {
         this.field_3573 = var2;
         if(var4 != 0) {
            return;
         }

         var5 = this;
         var10001 = 1.0F;
      }

      var5.method_4522(var10001);
   }

   // $FF: renamed from: o (float) void
   protected final void method_4522(float var1) {
      super.method_3852(this.field_3572 * var1, this.field_3573 * var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
