import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// $FF: renamed from: w8
public class class_783 extends class_779 implements class_84 {

   // $FF: renamed from: bB java.util.UUID
   private static final UUID field_3582;
   // $FF: renamed from: bC x5
   private static final class_1716 field_3583;
   // $FF: renamed from: bD adb[]
   private static final adb[] field_3584;
   // $FF: renamed from: bE int
   private int field_3585;
   // $FF: renamed from: bF java.lang.String
   private static final String field_3586;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3587;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(1, var10002);
      var10000 = this.field_3373;
      class_1752 var2 = new class_1752;
      var2.method_9701(this, 1.0D, 60, 10.0F);
      var10000.method_9766(2, var2);
      var10000 = this.field_3373;
      class_1753 var3 = new class_1753;
      var3.method_9705(this, 1.0D);
      var10000.method_9766(2, var3);
      var10000 = this.field_3373;
      class_1728 var4 = new class_1728;
      var4.method_9657(this, class_792.class, 8.0F);
      var10000.method_9766(3, var4);
      var10000 = this.field_3373;
      class_1754 var5 = new class_1754;
      var5.method_9706(this);
      var10000.method_9766(3, var5);
      var10000 = this.field_3374;
      class_1767 var6 = new class_1767;
      var6.method_9732(this, false);
      var10000.method_9766(1, var6);
      var10000 = this.field_3374;
      class_1771 var7 = new class_1771;
      var7.method_9740(this, class_792.class, 0, true);
      var10000.method_9766(2, var7);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.method_3849().method_9497(21, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3587;
      return "mob.witch.idle";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3587;
      return "mob.witch.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3587;
      return "mob.witch.death";
   }

   // $FF: renamed from: i (boolean) void
   public void method_4524(boolean var1) {
      String[] var2 = class_752.method_4253();
      class_1710 var10000 = this.method_3849();
      int var10002 = var1;
      if(var2 != null) {
         var10002 = var1 != 0?1:0;
      }

      var10000.method_9506(21, Byte.valueOf((byte)var10002));
   }

   // $FF: renamed from: b () boolean
   public boolean method_4525() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_3849().method_9499(21);
      if(var1 != null) {
         var10000 = var10000 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(26.0D);
      this.method_4211(class_1840.field_9393).method_390(0.25D);
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var1 = class_752.method_4253();
      class_783 var10000 = this;
      if(var1 != null) {
         label184: {
            if(!this.field_2990.field_1832) {
               int var9;
               label187: {
                  label188: {
                     byte var8 = this.method_4525();
                     if(var1 != null) {
                        if(var8 != 0) {
                           var9 = this.field_3585--;
                           if(var1 == null) {
                              break label187;
                           }

                           if(var9 > 0) {
                              break label188;
                           }

                           this.method_4524(false);
                           add var2 = this.method_4214();
                           this.method_3935(0, (add)null);
                           if(var1 != null) {
                              label161: {
                                 if(var2 != null && var2.method_3730() == class_1010.field_5230) {
                                    List var3 = class_1010.field_5230.getBlock28(var2);
                                    if(var1 == null) {
                                       break label161;
                                    }

                                    if(var3 != null) {
                                       Iterator var4 = var3.iterator();

                                       while(var4.hasNext()) {
                                          class_1645 var5 = (class_1645)var4.next();
                                          class_1645 var10001 = new class_1645;
                                          var10001.method_9014(var5);
                                          this.method_4179(var10001);
                                          if(var1 == null) {
                                             break label161;
                                          }

                                          if(var1 == null) {
                                             break;
                                          }
                                       }
                                    }
                                 }

                                 this.method_4211(class_1840.field_9393).method_394(field_3583);
                              }
                           }

                           if(var1 != null) {
                              break label188;
                           }
                        }

                        var8 = -1;
                     }

                     short var6;
                     label146: {
                        label191: {
                           var6 = var8;
                           float var10;
                           var9 = (var10 = this.field_3028.nextFloat() - 0.15F) == 0.0F?0:(var10 < 0.0F?-1:1);
                           if(var1 != null) {
                              label143: {
                                 if(var9 < 0) {
                                    var9 = this.method_3879(awt.field_4177);
                                    if(var1 == null) {
                                       break label143;
                                    }

                                    if(var9 != 0) {
                                       var9 = this.method_4177(class_1635.field_8503);
                                       if(var1 == null) {
                                          break label143;
                                       }

                                       if(var9 == 0) {
                                          var6 = 8237;
                                          if(var1 != null) {
                                             break label191;
                                          }
                                       }
                                    }
                                 }

                                 float var11;
                                 var9 = (var11 = this.field_3028.nextFloat() - 0.15F) == 0.0F?0:(var11 < 0.0F?-1:1);
                              }
                           }

                           if(var1 != null) {
                              label130: {
                                 if(var9 < 0) {
                                    var9 = this.method_3936();
                                    if(var1 == null) {
                                       break label130;
                                    }

                                    if(var9 != 0) {
                                       var9 = this.method_4177(class_1635.field_8502);
                                       if(var1 == null) {
                                          break label130;
                                       }

                                       if(var9 == 0) {
                                          var6 = 16307;
                                          if(var1 != null) {
                                             break label191;
                                          }
                                       }
                                    }
                                 }

                                 float var12;
                                 var9 = (var12 = this.field_3028.nextFloat() - 0.05F) == 0.0F?0:(var12 < 0.0F?-1:1);
                              }
                           }

                           if(var1 != null) {
                              label117: {
                                 if(var9 < 0) {
                                    float var13;
                                    var9 = (var13 = this.method_406() - this.method_405()) == 0.0F?0:(var13 < 0.0F?-1:1);
                                    if(var1 == null) {
                                       break label117;
                                    }

                                    if(var9 < 0) {
                                       var6 = 16341;
                                       if(var1 != null) {
                                          break label191;
                                       }
                                    }
                                 }

                                 float var14;
                                 var9 = (var14 = this.field_3028.nextFloat() - 0.25F) == 0.0F?0:(var14 < 0.0F?-1:1);
                              }
                           }

                           if(var1 != null) {
                              label107: {
                                 label106: {
                                    if(var9 < 0) {
                                       var10000 = this;
                                       if(var1 == null) {
                                          break label106;
                                       }

                                       if(this.method_4259() != null) {
                                          var9 = this.method_4177(class_1635.field_8491);
                                          if(var1 == null) {
                                             break label107;
                                          }

                                          if(var9 == 0) {
                                             double var15;
                                             var9 = (var15 = this.method_4259().method_3891(this) - 121.0D) == 0.0D?0:(var15 < 0.0D?-1:1);
                                             if(var1 == null) {
                                                break label107;
                                             }

                                             if(var9 > 0) {
                                                var6 = 16274;
                                                if(var1 != null) {
                                                   break label191;
                                                }
                                             }
                                          }
                                       }
                                    }

                                    var10000 = this;
                                 }

                                 float var16;
                                 var9 = (var16 = var10000.field_3028.nextFloat() - 0.25F) == 0.0F?0:(var16 < 0.0F?-1:1);
                              }
                           }

                           if(var1 == null) {
                              break label146;
                           }

                           if(var9 < 0) {
                              label192: {
                                 var10000 = this;
                                 if(var1 != null) {
                                    if(this.method_4259() == null) {
                                       break label192;
                                    }

                                    var10000 = this;
                                 }

                                 var9 = var10000.method_4177(class_1635.field_8491);
                                 if(var1 == null) {
                                    break label146;
                                 }

                                 if(var9 == 0) {
                                    double var17;
                                    var9 = (var17 = this.method_4259().method_3891(this) - 121.0D) == 0.0D?0:(var17 < 0.0D?-1:1);
                                    if(var1 == null) {
                                       break label146;
                                    }

                                    if(var9 > 0) {
                                       var6 = 16274;
                                    }
                                 }
                              }
                           }
                        }

                        var9 = var6;
                     }

                     if(var1 == null) {
                        break label187;
                     }

                     if(var9 > -1) {
                        add var10002 = new add;
                        var10002.method_3726(class_1010.field_5230, 1, var6);
                        this.method_3935(0, var10002);
                        this.field_3585 = this.method_4214().method_3763();
                        this.method_4524(true);
                        class_80 var7 = this.method_4211(class_1840.field_9393);
                        var7.method_394(field_3583);
                        var7.method_393(field_3583);
                     }
                  }

                  var10000 = this;
                  if(var1 == null) {
                     break label184;
                  }

                  float var18;
                  var9 = (var18 = this.field_3028.nextFloat() - 7.5E-4F) == 0.0F?0:(var18 < 0.0F?-1:1);
               }

               if(var9 < 0) {
                  this.field_2990.method_2191(this, (byte)15);
               }
            }

            var10000 = this;
         }
      }

      var10000.method_4231();
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      label32: {
         String[] var2 = class_752.method_4253();
         byte var10000 = var1;
         if(var2 != null) {
            if(var1 != 15) {
               break label32;
            }

            var10000 = 0;
         }

         int var3 = var10000;

         while(var3 < this.field_3028.nextInt(35) + 10) {
            String[] var10001 = field_3587;
            this.field_2990.method_2087("witchMagic", this.field_2994 + this.field_3028.nextGaussian() * 0.12999999523162842D, this.field_3004.field_6913 + 0.5D + this.field_3028.nextGaussian() * 0.12999999523162842D, this.field_2996 + this.field_3028.nextGaussian() * 0.12999999523162842D, 0.0D, 0.0D, 0.0D);
            ++var3;
            if(var2 == null) {
               return;
            }

            if(var2 == null) {
               break;
            }
         }

         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: c (vX, float) float
   protected float method_4202(class_1691 var1, float var2) {
      String[] var10000 = class_752.method_4253();
      var2 = super.method_4202(var1, var2);
      String[] var3 = var10000;
      class_1691 var4 = var1;
      if(var3 != null) {
         if(var1.method_9345() == this) {
            var2 = 0.0F;
         }

         var4 = var1;
      }

      if(var4.method_9355()) {
         var2 = (float)((double)var2 * 0.15D);
      }

      return var2;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = this.field_3028.nextInt(3) + 1;
      String[] var3 = var10000;
      int var5 = 0;

      while(var5 < var4) {
         int var6 = this.field_3028.nextInt(3);
         adb var7 = field_3584[this.field_3028.nextInt(field_3584.length)];
         int var9 = var2;
         if(var3 != null) {
            if(var2 > 0) {
               var6 += this.field_3028.nextInt(var2 + 1);
            }

            var9 = 0;
         }

         int var8 = var9;

         while(true) {
            if(var8 < var6) {
               this.method_3914(var7, 1);
               ++var8;
               if(var3 == null) {
                  break;
               }

               if(var3 != null) {
                  continue;
               }
            }

            ++var5;
            break;
         }

         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (sv, float) void
   public void method_404(class_752 var1, float var2) {
      String[] var3 = class_752.method_4253();
      if(!this.method_4525()) {
         class_798 var4;
         double var5;
         double var7;
         double var9;
         float var11;
         label61: {
            class_798 var10000 = new class_798;
            var10000.method_4690(this.field_2990, this, 32732);
            var4 = var10000;
            var4.field_3001 -= -20.0F;
            var5 = var1.field_2994 + var1.field_2997 - this.field_2994;
            var7 = var1.field_2995 + (double)var1.method_3880() - 1.100000023841858D - this.field_2995;
            var9 = var1.field_2996 + var1.field_2999 - this.field_2996;
            var11 = class_1715.method_9558(var5 * var5 + var9 * var9);
            float var14;
            int var12 = (var14 = var11 - 8.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
            if(var3 != null) {
               label54: {
                  if(var12 >= 0) {
                     var12 = var1.method_4177(class_1635.field_8492);
                     if(var3 == null) {
                        break label54;
                     }

                     if(var12 == 0) {
                        var4.method_4694(32698);
                        if(var3 != null) {
                           break label61;
                        }
                     }
                  }

                  float var15;
                  var12 = (var15 = var1.method_406() - 8.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
               }
            }

            if(var3 != null) {
               label44: {
                  if(var12 >= 0) {
                     var12 = var1.method_4177(class_1635.field_8509);
                     if(var3 == null) {
                        break label44;
                     }

                     if(var12 == 0) {
                        var4.method_4694(32660);
                        if(var3 != null) {
                           break label61;
                        }
                     }
                  }

                  float var16;
                  var12 = (var16 = var11 - 3.0F) == 0.0F?0:(var16 < 0.0F?-1:1);
               }
            }

            if(var3 == null) {
               return;
            }

            if(var12 <= 0) {
               boolean var13 = var1.method_4177(class_1635.field_8508);
               if(var3 == null) {
                  return;
               }

               if(!var13) {
                  float var17;
                  var12 = (var17 = this.field_3028.nextFloat() - 0.25F) == 0.0F?0:(var17 < 0.0F?-1:1);
                  if(var3 == null) {
                     return;
                  }

                  if(var12 < 0) {
                     var4.method_4694(32696);
                  }
               }
            }
         }

         var4.method_29(var5, var7 + (double)(var11 * 0.2F), var9, 0.75F, 8.0F);
         this.field_2990.method_2089(var4);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
