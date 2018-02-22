import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

// $FF: renamed from: wU
public class class_768 extends class_767 implements class_18, class_11 {

   // $FF: renamed from: bC int
   private int field_3469;
   // $FF: renamed from: bD boolean
   private boolean field_3470;
   // $FF: renamed from: bE boolean
   private boolean field_3471;
   // $FF: renamed from: bF za
   class_1849 field_3472;
   // $FF: renamed from: bG yz
   private class_792 field_3473;
   // $FF: renamed from: bH AV
   private class_658 field_3474;
   // $FF: renamed from: bI int
   private int field_3475;
   // $FF: renamed from: bJ boolean
   private boolean field_3476;
   // $FF: renamed from: bK int
   private int field_3477;
   // $FF: renamed from: bL java.lang.String
   private String field_3478;
   // $FF: renamed from: bM boolean
   private boolean field_3479;
   // $FF: renamed from: bN float
   private float field_3480;
   // $FF: renamed from: bO java.util.Map
   private static final Map field_3481;
   // $FF: renamed from: bP java.util.Map
   private static final Map field_3482;
   // $FF: renamed from: bQ java.lang.String
   private static final String field_3483;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3484;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      this.method_4359(var1, 0);
   }

   // $FF: renamed from: <init> (ahb, int) void
   public void method_4359(ahb var1, int var2) {
      super.method_3847(var1);
      this.method_4360(var2);
      this.method_3852(0.6F, 1.8F);
      this.method_4257().method_9786(true);
      this.method_4257().method_9784(true);
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(0, var10002);
      var10000 = this.field_3373;
      class_1743 var8 = new class_1743;
      var8.method_9687(this, class_781.class, 8.0F, 0.6D, 0.6D);
      var10000.method_9766(1, var8);
      var10000 = this.field_3373;
      class_1744 var9 = new class_1744;
      var9.method_9690(this);
      var10000.method_9766(1, var9);
      var10000 = this.field_3373;
      class_1729 var10 = new class_1729;
      var10.method_9660(this);
      var10000.method_9766(1, var10);
      var10000 = this.field_3373;
      class_1763 var11 = new class_1763;
      var11.method_9725(this);
      var10000.method_9766(2, var11);
      var10000 = this.field_3373;
      class_1751 var12 = new class_1751;
      var12.method_9700(this);
      var10000.method_9766(3, var12);
      var10000 = this.field_3373;
      class_1738 var13 = new class_1738;
      var13.method_9673(this, true);
      var10000.method_9766(4, var13);
      var10000 = this.field_3373;
      class_1761 var14 = new class_1761;
      var14.method_9719(this, 0.6D);
      var10000.method_9766(5, var14);
      var10000 = this.field_3373;
      class_1765 var15 = new class_1765;
      var15.method_9728(this);
      var10000.method_9766(6, var15);
      var10000 = this.field_3373;
      class_1746 var3 = new class_1746;
      var3.method_9693(this);
      var10000.method_9766(7, var3);
      var10000 = this.field_3373;
      class_1755 var4 = new class_1755;
      var4.method_9708(this, 0.32D);
      var10000.method_9766(8, var4);
      var10000 = this.field_3373;
      class_1730 var5 = new class_1730;
      var5.method_9658(this, class_792.class, 3.0F, 1.0F);
      var10000.method_9766(9, var5);
      var10000 = this.field_3373;
      var5 = new class_1730;
      var5.method_9658(this, class_768.class, 5.0F, 0.02F);
      var10000.method_9766(9, var5);
      var10000 = this.field_3373;
      class_1753 var6 = new class_1753;
      var6.method_9705(this, 0.6D);
      var10000.method_9766(9, var6);
      var10000 = this.field_3373;
      class_1728 var7 = new class_1728;
      var7.method_9657(this, class_753.class, 8.0F);
      var10000.method_9766(10, var7);
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9393).method_390(0.5D);
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: bp () void
   protected void method_4235() {
      class_768 var6;
      label104: {
         String[] var1 = class_752.method_4253();
         int var10000 = --this.field_3469;
         if(var1 != null) {
            label105: {
               if(var10000 <= 0) {
                  label106: {
                     this.field_2990.field_1827.method_6776(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996));
                     this.field_3469 = 70 + this.field_3028.nextInt(50);
                     this.field_3472 = this.field_2990.field_1827.method_6780(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996), 32);
                     class_1849 var5 = this.field_3472;
                     if(var1 != null) {
                        if(this.field_3472 == null) {
                           this.method_4342();
                           if(var1 != null) {
                              break label106;
                           }
                        }

                        var5 = this.field_3472;
                     }

                     class_1661 var2 = var5.method_10003();
                     this.method_4339(var2.field_8646, var2.field_8647, var2.field_8648, (int)((float)this.field_3472.method_10004() * 0.6F));
                     var10000 = this.field_3479;
                     if(var1 == null) {
                        break label105;
                     }

                     if(this.field_3479) {
                        this.field_3479 = false;
                        this.field_3472.method_10029(5);
                     }
                  }
               }

               var6 = this;
               if(var1 == null) {
                  break label104;
               }

               var10000 = this.method_4366();
            }
         }

         if(var10000 == 0) {
            var6 = this;
            if(var1 == null) {
               break label104;
            }

            if(this.field_3475 > 0) {
               --this.field_3475;
               var6 = this;
               if(var1 == null) {
                  break label104;
               }

               if(this.field_3475 <= 0) {
                  var6 = this;
                  if(var1 != null) {
                     label75: {
                        if(this.field_3476) {
                           label107: {
                              var6 = this;
                              if(var1 != null) {
                                 if(this.field_3474.size() > 1) {
                                    Iterator var4 = this.field_3474.iterator();

                                    while(var4.hasNext()) {
                                       label64: {
                                          class_924 var3 = (class_924)var4.next();
                                          class_924 var7 = var3;
                                          if(var1 != null) {
                                             boolean var8 = var3.method_5426();
                                             if(var1 == null) {
                                                break label107;
                                             }

                                             if(!var8) {
                                                break label64;
                                             }

                                             var7 = var3;
                                          }

                                          var7.method_5425(this.field_3028.nextInt(6) + this.field_3028.nextInt(6) + 2);
                                       }

                                       if(var1 == null) {
                                          break;
                                       }
                                    }
                                 }

                                 this.method_4368(1);
                                 this.field_3476 = false;
                                 var6 = this;
                              }

                              if(var1 == null) {
                                 break label75;
                              }

                              if(var6.field_3472 != null) {
                                 var6 = this;
                                 if(var1 == null) {
                                    break label75;
                                 }

                                 if(this.field_3478 != null) {
                                    this.field_2990.method_2191(this, (byte)14);
                                    this.field_3472.method_10023(this.field_3478, 1);
                                 }
                              }
                           }
                        }

                        var6 = this;
                     }
                  }

                  class_1645 var10001 = new class_1645;
                  var10001.method_9012(class_1635.field_8500.field_8526, 200, 0);
                  var6.method_4179(var10001);
               }
            }
         }

         var6 = this;
      }

      var6.method_4235();
   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      String[] var2;
      boolean var6;
      label50: {
         label49: {
            String[] var10000 = class_752.method_4253();
            add var3 = var1.field_3616.method_3593();
            var2 = var10000;
            add var5 = var3;
            if(var2 != null) {
               if(var3 == null) {
                  break label49;
               }

               var5 = var3;
            }

            if(var5.method_3730() == class_1010.field_5239) {
               var6 = true;
               break label50;
            }
         }

         var6 = false;
      }

      boolean var4 = var6;
      var6 = var4;
      if(var2 != null) {
         if(!var4) {
            var6 = this.method_3917();
            if(var2 == null) {
               return var6;
            }

            if(var6) {
               var6 = this.method_4366();
               if(var2 == null) {
                  return var6;
               }

               if(!var6) {
                  var6 = this.method_4159();
                  if(var2 == null) {
                     return var6;
                  }

                  if(!var6) {
                     var6 = this.field_2990.field_1832;
                     if(var2 != null) {
                        if(!this.field_2990.field_1832) {
                           this.method_54(var1);
                           var1.method_4590(this, this.method_4287());
                        }

                        var6 = true;
                     }

                     return var6;
                  }
               }
            }
         }

         var6 = super.method_4295(var1);
      }

      return var6;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, Integer.valueOf(0));
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3909(var1);
      String[] var2 = var10000;
      String[] var3 = field_3484;
      var1.method_8667("Profession", this.method_4361());
      class_1583 var4 = var1;
      String var10001 = "Riches";
      class_768 var10002 = this;
      if(var2 != null) {
         var1.method_8667("Riches", this.field_3477);
         if(this.field_3474 == null) {
            return;
         }

         var4 = var1;
         var10001 = "Offers";
         var10002 = this;
      }

      var4.method_8664(var10001, var10002.field_3474.method_3570());
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3908(var1);
      String[] var2 = var10000;
      String[] var4 = field_3484;
      this.method_4360(var1.method_8681("Profession"));
      this.field_3477 = var1.method_8681("Riches");
      class_1583 var5 = var1;
      String var10001 = "Offers";
      if(var2 != null) {
         if(!var1.initGui8("Offers", 10)) {
            return;
         }

         var5 = var1;
         var10001 = "Offers";
      }

      class_1583 var3 = var5.method_8688(var10001);
      class_658 var6 = new class_658;
      var6.method_3564(var3);
      this.field_3474 = var6;
   }

   // $FF: renamed from: v () boolean
   protected boolean method_4269() {
      return false;
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String var10000;
      if(this.method_4366()) {
         String[] var1 = field_3484;
         var10000 = "mob.villager.haggle";
      } else {
         String[] var2 = field_3484;
         var10000 = "mob.villager.idle";
      }

      return var10000;
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3484;
      return "mob.villager.hit";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3484;
      return "mob.villager.death";
   }

   // $FF: renamed from: a (int) void
   public void method_4360(int var1) {
      this.field_3036.method_9506(16, Integer.valueOf(var1));
   }

   // $FF: renamed from: b () int
   public int method_4361() {
      return this.field_3036.method_9501(16);
   }

   // $FF: renamed from: a9 () boolean
   public boolean method_4362() {
      return this.field_3470;
   }

   // $FF: renamed from: a (boolean) void
   public void method_4363(boolean var1) {
      this.field_3470 = var1;
   }

   // $FF: renamed from: k (boolean) void
   public void method_4364(boolean var1) {
      this.field_3471 = var1;
   }

   // $FF: renamed from: a_ () boolean
   public boolean method_4365() {
      return this.field_3471;
   }

   // $FF: renamed from: b (sv) void
   public void method_4168(class_752 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_4168(var1);
      String[] var2 = var10000;
      Object var4 = this;
      if(var2 != null) {
         if(this.field_3472 == null) {
            return;
         }

         var4 = var1;
      }

      if(var2 != null) {
         if(var4 == null) {
            return;
         }

         this.field_3472.method_10015(var1);
         var4 = var1;
      }

      byte var5 = var4 instanceof class_792;
      if(var2 != null) {
         if(var5 == 0) {
            return;
         }

         var5 = -1;
      }

      class_768 var7;
      label50: {
         byte var3 = var5;
         boolean var6 = this.method_4159();
         if(var2 != null) {
            if(var6) {
               var3 = -3;
            }

            this.field_3472.method_10023(var1.method_64(), var3);
            var7 = this;
            if(var2 == null) {
               break label50;
            }

            var6 = this.method_3917();
         }

         if(!var6) {
            return;
         }

         var7 = this;
      }

      var7.field_2990.method_2191(this, (byte)13);
   }

   // $FF: renamed from: a (vX) void
   public void method_4190(class_1691 var1) {
      String[] var2 = class_752.method_4253();
      class_768 var10000 = this;
      if(var2 != null) {
         if(this.field_3472 != null) {
            label39: {
               class_689 var3 = var1.method_9345();
               class_689 var5 = var3;
               if(var2 != null) {
                  if(var3 != null) {
                     boolean var6 = var3 instanceof class_792;
                     if(var2 != null) {
                        if(var6) {
                           this.field_3472.method_10023(var3.method_64(), -2);
                           if(var2 != null) {
                              break label39;
                           }
                        }

                        var6 = var3 instanceof class_10;
                     }

                     if(!var6) {
                        break label39;
                     }

                     this.field_3472.method_10027();
                     if(var2 != null) {
                        break label39;
                     }
                  }

                  var5 = var3;
               }

               if(var5 == null) {
                  class_792 var4 = this.field_2990.method_2174(this, 16.0D);
                  if(var2 == null) {
                     return;
                  }

                  if(var4 != null) {
                     this.field_3472.method_10027();
                  }
               }
            }
         }

         var10000 = this;
      }

      var10000.method_4190(var1);
   }

   // $FF: renamed from: b (yz) void
   public void method_54(class_792 var1) {
      this.field_3473 = var1;
   }

   // $FF: renamed from: a () yz
   public class_792 method_55() {
      return this.field_3473;
   }

   // $FF: renamed from: bw () boolean
   public boolean method_4366() {
      return this.field_3473 != null;
   }

   // $FF: renamed from: b (c6) void
   public void method_58(class_924 var1) {
      var1.method_5424();
      String[] var2 = class_752.method_4253();
      this.field_3366 = -this.method_4263();
      String[] var10001 = field_3484;
      this.method_3868("mob.villager.yes", this.method_4216(), this.method_4217());
      class_924 var10000 = var1;
      if(var2 != null) {
         if(var1.method_5422((class_924)this.field_3474.get(this.field_3474.size() - 1))) {
            label22: {
               this.field_3475 = 40;
               this.field_3476 = true;
               class_768 var3 = this;
               if(var2 != null) {
                  if(this.field_3473 != null) {
                     this.field_3478 = this.field_3473.method_64();
                     if(var2 != null) {
                        break label22;
                     }
                  }

                  var3 = this;
               }

               var3.field_3478 = null;
            }
         }

         var10000 = var1;
      }

      if(var10000.method_5418().method_3730() == class_1010.field_5244) {
         this.field_3477 += var1.method_5418().field_2958;
      }

   }

   // $FF: renamed from: b (add) void
   public void method_59(add var1) {
      String[] var2;
      class_768 var4;
      label35: {
         var2 = class_752.method_4253();
         int var10000 = this.field_2990.field_1832;
         if(var2 != null) {
            if(this.field_2990.field_1832) {
               return;
            }

            var4 = this;
            if(var2 == null) {
               break label35;
            }

            var10000 = this.field_3366;
         }

         if(var10000 <= -this.method_4263() + 20) {
            return;
         }

         var4 = this;
      }

      if(var2 != null) {
         var4.field_3366 = -this.method_4263();
         if(var1 != null) {
            String[] var3 = field_3484;
            this.method_3868("mob.villager.yes", this.method_4216(), this.method_4217());
            if(var2 != null) {
               return;
            }
         }

         var4 = this;
      }

      String[] var10001 = field_3484;
      var4.method_3868("mob.villager.no", this.method_4216(), this.method_4217());
   }

   // $FF: renamed from: f (yz) AV
   public class_658 method_56(class_792 var1) {
      String[] var2 = class_752.method_4253();
      class_658 var10000 = this.field_3474;
      if(var2 != null) {
         if(this.field_3474 == null) {
            this.method_4368(1);
         }

         var10000 = this.field_3474;
      }

      return var10000;
   }

   // $FF: renamed from: q (float) float
   private float method_4367(float var1) {
      String[] var10000 = class_752.method_4253();
      float var3 = var1 + this.field_3480;
      String[] var2 = var10000;
      float var4 = var3;
      float var10001 = 0.9F;
      if(var2 != null) {
         if(var3 <= 0.9F) {
            var4 = var3;
            return var4;
         }

         var4 = 0.9F;
         var10001 = var3 - 0.9F;
      }

      var4 -= var10001;
      return var4;
   }

   // $FF: renamed from: u (int) void
   private void method_4368(int var1) {
      String[] var2;
      class_768 var10000;
      label101: {
         var2 = class_752.method_4253();
         var10000 = this;
         if(var2 != null) {
            if(this.field_3474 != null) {
               this.field_3480 = class_1715.method_9557((float)this.field_3474.size()) * 0.2F;
               if(var2 != null) {
                  break label101;
               }
            }

            var10000 = this;
         }

         var10000.field_3480 = 0.0F;
      }

      class_658 var3;
      label94: {
         label104: {
            class_658 var13;
            label105: {
               var13 = new class_658;
               var13.method_3563();
               var3 = var13;
               int var14 = this.method_4361();
               if(var2 != null) {
                  label106: {
                     int var4;
                     class_924 var10001;
                     add var10003;
                     add var10004;
                     label87:
                     switch(var14) {
                     case 0:
                        method_4369(var3, class_1010.field_5154, this.field_3028, this.method_4367(0.9F));
                        method_4369(var3, adb.method_2920(class_1192.field_6062), this.field_3028, this.method_4367(0.5F));
                        method_4369(var3, class_1010.field_5222, this.field_3028, this.method_4367(0.5F));
                        method_4369(var3, class_1010.field_5207, this.field_3028, this.method_4367(0.4F));
                        method_4372(var3, class_1010.field_5155, this.field_3028, this.method_4367(0.9F));
                        method_4372(var3, class_1010.field_5217, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5118, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5214, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5216, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5117, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5223, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5120, this.field_3028, this.method_4367(0.5F));
                        float var19;
                        var14 = (var19 = this.field_3028.nextFloat() - this.method_4367(0.5F)) == 0.0F?0:(var19 < 0.0F?-1:1);
                        if(var2 == null) {
                           break label106;
                        }

                        if(var14 >= 0) {
                           break;
                        }

                        var10001 = new class_924;
                        var10003 = new add;
                        var10003.method_3722(class_1192.field_6038, 10);
                        var10004 = new add;
                        var10004.method_3724(class_1010.field_5244);
                        add var10005 = new add;
                        var10005.method_3726(class_1010.field_5176, 4 + this.field_3028.nextInt(2), 0);
                        var10001.method_5415(var10003, var10004, var10005);
                        var3.add(var10001);
                        if(var2 != null) {
                           break;
                        }
                     case 1:
                        method_4369(var3, class_1010.field_5197, this.field_3028, this.method_4367(0.8F));
                        method_4369(var3, class_1010.field_5198, this.field_3028, this.method_4367(0.8F));
                        method_4369(var3, class_1010.field_5243, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, adb.method_2920(class_1192.field_6074), this.field_3028, this.method_4367(0.8F));
                        method_4372(var3, adb.method_2920(class_1192.field_6047), this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5202, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5204, this.field_3028, this.method_4367(0.2F));
                        float var20;
                        var14 = (var20 = this.field_3028.nextFloat() - this.method_4367(0.07F)) == 0.0F?0:(var20 < 0.0F?-1:1);
                        if(var2 == null) {
                           break label106;
                        }

                        if(var14 >= 0) {
                           break;
                        }

                        class_940 var5 = class_940.field_4783[this.field_3028.nextInt(class_940.field_4783.length)];
                        int var6 = class_1715.method_9575(this.field_3028, var5.method_5481(), var5.method_5482());
                        class_535 var17 = class_1010.field_5259;
                        class_1655 var15 = new class_1655;
                        var15.method_9103(var5, var6);
                        add var7 = var17.getBlock04(var15);
                        var4 = 2 + this.field_3028.nextInt(5 + var6 * 10) + 3 * var6;
                        var10001 = new class_924;
                        var10003 = new add;
                        var10003.method_3724(class_1010.field_5198);
                        var10004 = new add;
                        var10004.method_3725(class_1010.field_5244, var4);
                        var10001.method_5415(var10003, var10004, var7);
                        var3.add(var10001);
                        if(var2 != null) {
                           break;
                        }
                     case 2:
                        method_4372(var3, class_1010.field_5237, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5240, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5189, this.field_3028, this.method_4367(0.4F));
                        method_4372(var3, adb.method_2920(class_1192.field_6115), this.field_3028, this.method_4367(0.3F));
                        adb[] var9 = new adb[]{class_1010.field_5125, class_1010.field_5134, class_1010.field_5165, class_1010.field_5169, class_1010.field_5116, class_1010.field_5137, class_1010.field_5115, class_1010.field_5136};
                        adb[] var11 = var9;
                        int var12 = var9.length;
                        var4 = 0;

                        do {
                           if(var4 >= var12 && var2 != null) {
                              break label87;
                           }

                           adb var8 = var11[var4];
                           if(var2 != null) {
                              if(this.field_3028.nextFloat() < this.method_4367(0.05F)) {
                                 var10001 = new class_924;
                                 var10003 = new add;
                                 var10003.method_3726(var8, 1, 0);
                                 var10004 = new add;
                                 var10004.method_3726(class_1010.field_5244, 2 + this.field_3028.nextInt(3), 0);
                                 Random var18 = this.field_3028;
                                 add var10006 = new add;
                                 var10006.method_3726(var8, 1, 0);
                                 var10001.method_5415(var10003, var10004, class_980.method_5663(var18, var10006, 5 + this.field_3028.nextInt(15)));
                                 var3.add(var10001);
                              }

                              ++var4;
                           }
                        } while(var2 != null);
                     case 3:
                        method_4369(var3, class_1010.field_5121, this.field_3028, this.method_4367(0.7F));
                        method_4369(var3, class_1010.field_5123, this.field_3028, this.method_4367(0.5F));
                        method_4369(var3, class_1010.field_5124, this.field_3028, this.method_4367(0.5F));
                        method_4369(var3, class_1010.field_5122, this.field_3028, this.method_4367(0.5F));
                        method_4372(var3, class_1010.field_5125, this.field_3028, this.method_4367(0.5F));
                        method_4372(var3, class_1010.field_5134, this.field_3028, this.method_4367(0.5F));
                        method_4372(var3, class_1010.field_5116, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5137, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5115, this.field_3028, this.method_4367(0.5F));
                        method_4372(var3, class_1010.field_5136, this.field_3028, this.method_4367(0.5F));
                        method_4372(var3, class_1010.field_5114, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5135, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5150, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5151, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5167, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5171, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5164, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5168, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5165, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5169, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5166, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5170, this.field_3028, this.method_4367(0.2F));
                        method_4372(var3, class_1010.field_5163, this.field_3028, this.method_4367(0.1F));
                        method_4372(var3, class_1010.field_5160, this.field_3028, this.method_4367(0.1F));
                        method_4372(var3, class_1010.field_5161, this.field_3028, this.method_4367(0.1F));
                        method_4372(var3, class_1010.field_5162, this.field_3028, this.method_4367(0.1F));
                        if(var2 != null) {
                           break;
                        }
                     case 4:
                        method_4369(var3, class_1010.field_5121, this.field_3028, this.method_4367(0.7F));
                        method_4369(var3, class_1010.field_5177, this.field_3028, this.method_4367(0.5F));
                        method_4369(var3, class_1010.field_5220, this.field_3028, this.method_4367(0.5F));
                        method_4372(var3, class_1010.field_5187, this.field_3028, this.method_4367(0.1F));
                        method_4372(var3, class_1010.field_5157, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5159, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5156, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5158, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5178, this.field_3028, this.method_4367(0.3F));
                        method_4372(var3, class_1010.field_5221, this.field_3028, this.method_4367(0.3F));
                     }

                     var13 = var3;
                     if(var2 == null) {
                        break label105;
                     }

                     var14 = var3.isEmpty();
                  }
               }

               if(var14 != 0) {
                  method_4369(var3, class_1010.field_5124, this.field_3028, 1.0F);
               }

               Collections.shuffle(var3);
               var10000 = this;
               if(var2 == null) {
                  break label104;
               }

               var13 = this.field_3474;
            }

            if(var13 != null) {
               break label94;
            }

            var10000 = this;
         }

         class_658 var16 = new class_658;
         var16.method_3563();
         var10000.field_3474 = var16;
      }

      int var10 = 0;

      while(var10 < var1 && var10 < var3.size()) {
         this.field_3474.method_3566((class_924)var3.get(var10));
         ++var10;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (AV) void
   public void method_57(class_658 var1) {}

   // $FF: renamed from: b (AV, adb, java.util.Random, float) void
   private static void method_4369(class_658 var0, adb var1, Random var2, float var3) {
      String[] var4 = class_752.method_4253();
      if(var4 != null && var2.nextFloat() < var3) {
         class_924 var10001 = new class_924;
         var10001.method_5417(method_4370(var1, var2), class_1010.field_5244);
         var0.add(var10001);
      }

   }

   // $FF: renamed from: b (adb, java.util.Random) add
   private static add method_4370(adb var0, Random var1) {
      add var10000 = new add;
      var10000.method_3726(var0, method_4371(var0, var1), 0);
      return var10000;
   }

   // $FF: renamed from: c (adb, java.util.Random) int
   private static int method_4371(adb var0, Random var1) {
      String[] var10000 = class_752.method_4253();
      class_1724 var3 = (class_1724)field_3481.get(var0);
      String[] var2 = var10000;
      Object var4 = var3;
      int var5;
      if(var2 != null) {
         if(var3 == null) {
            var5 = 1;
            return var5;
         }

         var4 = var3.method_9633();
      }

      var5 = ((Integer)var4).intValue();
      int var10001 = ((Integer)var3.method_9634()).intValue();
      if(var2 != null) {
         if(var5 >= var10001) {
            var5 = ((Integer)var3.method_9633()).intValue();
            return var5;
         }

         var5 = ((Integer)var3.method_9633()).intValue();
         var10001 = var1.nextInt(((Integer)var3.method_9634()).intValue() - ((Integer)var3.method_9633()).intValue());
      }

      var5 += var10001;
      return var5;
   }

   // $FF: renamed from: c (AV, adb, java.util.Random, float) void
   private static void method_4372(class_658 var0, adb var1, Random var2, float var3) {
      String[] var4 = class_752.method_4253();
      float var9;
      int var10000 = (var9 = var2.nextFloat() - var3) == 0.0F?0:(var9 < 0.0F?-1:1);
      if(var4 != null) {
         if(var10000 >= 0) {
            return;
         }

         var10000 = method_4373(var1, var2);
      }

      add var6;
      add var7;
      label15: {
         int var5 = var10000;
         add var8;
         if(var5 < 0) {
            var8 = new add;
            var8.method_3726(class_1010.field_5244, 1, 0);
            var6 = var8;
            var8 = new add;
            var8.method_3726(var1, -var5, 0);
            var7 = var8;
            if(var4 != null) {
               break label15;
            }
         }

         var8 = new add;
         var8.method_3726(class_1010.field_5244, var5, 0);
         var6 = var8;
         var8 = new add;
         var8.method_3726(var1, 1, 0);
         var7 = var8;
      }

      class_924 var10001 = new class_924;
      var10001.method_5416(var6, var7);
      var0.add(var10001);
   }

   // $FF: renamed from: d (adb, java.util.Random) int
   private static int method_4373(adb var0, Random var1) {
      String[] var10000 = class_752.method_4253();
      class_1724 var3 = (class_1724)field_3482.get(var0);
      String[] var2 = var10000;
      Object var4 = var3;
      int var5;
      if(var2 != null) {
         if(var3 == null) {
            var5 = 1;
            return var5;
         }

         var4 = var3.method_9633();
      }

      var5 = ((Integer)var4).intValue();
      int var10001 = ((Integer)var3.method_9634()).intValue();
      if(var2 != null) {
         if(var5 >= var10001) {
            var5 = ((Integer)var3.method_9633()).intValue();
            return var5;
         }

         var5 = ((Integer)var3.method_9633()).intValue();
         var10001 = var1.nextInt(((Integer)var3.method_9634()).intValue() - ((Integer)var3.method_9633()).intValue());
      }

      var5 += var10001;
      return var5;
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      String[] var2 = class_752.method_4253();
      byte var10000 = var1;
      byte var10001 = 12;
      String[] var3;
      if(var2 != null) {
         if(var1 == 12) {
            var3 = field_3484;
            this.method_4374("heart");
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1;
         var10001 = 13;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            var3 = field_3484;
            this.method_4374("angryVillager");
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1;
         var10001 = 14;
      }

      if(var10000 == var10001) {
         String[] var4 = field_3484;
         this.method_4374("happyVillager");
         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: c (java.lang.String) void
   private void method_4374(String var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < 5) {
         double var4 = this.field_3028.nextGaussian() * 0.02D;
         double var6 = this.field_3028.nextGaussian() * 0.02D;
         double var8 = this.field_3028.nextGaussian() * 0.02D;
         this.field_2990.method_2087(var1, this.field_2994 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, this.field_2995 + 1.0D + (double)(this.field_3028.nextFloat() * this.field_3015), this.field_2996 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, var4, var6, var8);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (xY) xY
   public class_83 method_4282(class_83 var1) {
      var1 = super.method_4282(var1);
      this.method_4360(this.field_2990.field_1819.nextInt(5));
      return var1;
   }

   // $FF: renamed from: bx () void
   public void method_4375() {
      this.field_3479 = true;
   }

   // $FF: renamed from: a (wJ) wU
   public class_768 method_4376(class_767 var1) {
      class_768 var10000 = new class_768;
      var10000.method_3847(this.field_2990);
      class_768 var2 = var10000;
      var2.method_4282((class_83)null);
      return var2;
   }

   // $FF: renamed from: bM () boolean
   public boolean method_4298() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
