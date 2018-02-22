import java.util.List;
import net.minecraft.server.MinecraftServer;

// $FF: renamed from: xr
public abstract class class_690 extends class_689 {

   // $FF: renamed from: at boolean
   private boolean field_3058;
   // $FF: renamed from: au java.lang.String
   private String field_3059;
   // $FF: renamed from: av int[][][]
   private static final int[][][] field_3060;
   // $FF: renamed from: aw int
   private int field_3061;
   // $FF: renamed from: ax double
   private double field_3062;
   // $FF: renamed from: ay double
   private double field_3063;
   // $FF: renamed from: az double
   private double field_3064;
   // $FF: renamed from: aA double
   private double field_3065;
   // $FF: renamed from: aB double
   private double field_3066;
   // $FF: renamed from: aC double
   private double field_3067;
   // $FF: renamed from: aD double
   private double field_3068;
   // $FF: renamed from: aE double
   private double field_3069;
   // $FF: renamed from: aF java.lang.String
   private static final String field_3070;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3071;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_2986 = true;
      this.method_3852(0.98F, 0.7F);
      this.field_3013 = this.field_3015 / 2.0F;
   }

   // $FF: renamed from: b (ahb, double, double, double, int) xr
   public static class_690 method_3979(ahb var0, double var1, double var3, double var5, int var7) {
      switch(var7) {
      case 1:
         class_697 var12 = new class_697;
         var12.method_3980(var0, var1, var3, var5);
         return var12;
      case 2:
         class_694 var11 = new class_694;
         var11.method_3980(var0, var1, var3, var5);
         return var11;
      case 3:
         class_691 var10 = new class_691;
         var10.method_3980(var0, var1, var3, var5);
         return var10;
      case 4:
         class_692 var9 = new class_692;
         var9.method_3980(var0, var1, var3, var5);
         return var9;
      case 5:
         class_696 var8 = new class_696;
         var8.method_3980(var0, var1, var3, var5);
         return var8;
      case 6:
         class_698 var10000 = new class_698;
         var10000.method_3980(var0, var1, var3, var5);
         return var10000;
      default:
         class_693 var13 = new class_693;
         var13.method_3980(var0, var1, var3, var5);
         return var13;
      }
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      this.field_3036.method_9497(17, new Integer(0));
      this.field_3036.method_9497(18, new Integer(1));
      this.field_3036.method_9497(19, new Float(0.0F));
      this.field_3036.method_9497(20, new Integer(0));
      this.field_3036.method_9497(21, new Integer(6));
      this.field_3036.method_9497(22, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: h (sa) kg
   public class_1343 method_3920(class_689 var1) {
      String[] var2 = class_752.method_4253();
      class_689 var10000 = var1;
      class_1343 var3;
      if(var2 != null) {
         if(!var1.method_3898()) {
            var3 = null;
            return var3;
         }

         var10000 = var1;
      }

      var3 = var10000.field_3004;
      return var3;
   }

   // $FF: renamed from: J () kg
   public class_1343 method_3871() {
      return null;
   }

   // $FF: renamed from: S () boolean
   public boolean method_3898() {
      return true;
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_3980(ahb var1, double var2, double var4, double var6) {
      this.method_3847(var1);
      this.method_3854(var2, var4, var6);
      this.field_2997 = 0.0D;
      this.field_2998 = 0.0D;
      this.field_2999 = 0.0D;
      this.field_2991 = var2;
      this.field_2992 = var4;
      this.field_2993 = var6;
   }

   // $FF: renamed from: ae () double
   public double method_3924() {
      return (double)this.field_3015 * 0.0D - 0.30000001192092896D;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.field_2990.field_1832;
      if(var3 != null) {
         if(!this.field_2990.field_1832) {
            var10000 = this.field_3012;
            if(var3 == null) {
               return var10000;
            }

            if(!this.field_3012) {
               byte var6 = this.method_3961();
               if(var3 != null) {
                  if(var6 != 0) {
                     return false;
                  }

                  this.method_3992(-this.method_3993());
                  this.method_3990(10);
                  this.method_3895();
                  this.method_3988(this.method_3989() + var2 * 10.0F);
                  var6 = var1.method_9345() instanceof class_792;
               }

               label85: {
                  label97: {
                     if(var3 != null) {
                        if(var6 == 0) {
                           break label97;
                        }

                        var6 = ((class_792)var1.method_9345()).field_3640.field_2839;
                     }

                     if(var3 == null) {
                        break label85;
                     }

                     if(var6 != 0) {
                        var6 = 1;
                        break label85;
                     }
                  }

                  var6 = 0;
               }

               int var7;
               label98: {
                  byte var4;
                  label99: {
                     var4 = var6;
                     var7 = var4;
                     if(var3 != null) {
                        if(var4 != 0) {
                           break label99;
                        }

                        float var9;
                        var7 = (var9 = this.method_3989() - 40.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
                     }

                     if(var3 == null) {
                        return (boolean)var7;
                     }

                     if(var7 <= 0) {
                        break label98;
                     }
                  }

                  label61: {
                     class_689 var8 = this.field_2987;
                     if(var3 != null) {
                        if(this.field_2987 == null) {
                           break label61;
                        }

                        var8 = this.field_2987;
                     }

                     var8.method_3925(this);
                  }

                  class_690 var5;
                  label55: {
                     label54: {
                        var6 = var4;
                        if(var3 != null) {
                           if(var4 == 0) {
                              break label54;
                           }

                           var5 = this;
                           if(var3 == null) {
                              break label55;
                           }

                           var6 = this.method_89();
                        }

                        if(var6 == 0) {
                           this.method_3851();
                           if(var3 != null) {
                              break label98;
                           }
                        }
                     }

                     var5 = this;
                  }

                  var5.method_3981(var1);
               }

               var7 = 1;
               return (boolean)var7;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: b (vX) void
   public void method_3981(class_1691 var1) {
      this.method_3851();
      String[] var10000 = class_752.method_4253();
      add var10001 = new add;
      var10001.method_3725(class_1010.field_5186, 1);
      add var3 = var10001;
      String[] var2 = var10000;
      class_690 var4 = this;
      if(var2 != null) {
         if(this.field_3059 != null) {
            var3.method_3771(this.field_3059);
         }

         var4 = this;
      }

      var4.method_3916(var3, 0.0F);
   }

   // $FF: renamed from: aj () void
   public void method_3933() {
      this.method_3992(-this.method_3993());
      this.method_3990(10);
      this.method_3988(this.method_3989() + this.method_3989() * 10.0F);
   }

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_3012;
      if(var1 != null) {
         var10000 = !this.field_3012;
      }

      return var10000;
   }

   // $FF: renamed from: B () void
   public void method_3851() {
      super.method_3851();
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_3991();
      if(var1 != null) {
         if(var10000 > 0) {
            this.method_3990(this.method_3991() - 1);
         }

         float var32;
         var10000 = (var32 = this.method_3989() - 0.0F) == 0.0F?0:(var32 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var10000 > 0) {
            this.method_3988(this.method_3989() - 1.0F);
         }

         double var33;
         var10000 = (var33 = this.field_2995 - -64.0D) == 0.0D?0:(var33 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var10000 < 0) {
            this.method_3862();
         }

         var10000 = this.field_2990.field_1832;
      }

      int var2;
      int var4;
      int var23;
      class_690 var25;
      if(var1 != null) {
         label283: {
            if(var10000 == 0) {
               var10000 = this.field_2990 instanceof class_354;
               if(var1 == null) {
                  break label283;
               }

               if(var10000 != 0) {
                  label291: {
                     label292: {
                        label293: {
                           String[] var10001 = field_3071;
                           this.field_2990.field_1829.method_8332("portal");
                           MinecraftServer var3 = ((class_354)this.field_2990).method_2255();
                           var2 = this.method_3858();
                           var10000 = this.field_3049;
                           if(var1 != null) {
                              if(this.field_3049) {
                                 var10000 = var3.method_2336();
                                 if(var1 == null) {
                                    break label292;
                                 }

                                 if(var10000 == 0) {
                                    break label293;
                                 }

                                 label256: {
                                    var25 = this;
                                    if(var1 != null) {
                                       if(this.field_2988 == null) {
                                          var25 = this;
                                          var23 = this.field_3050;
                                          if(var1 == null) {
                                             break label256;
                                          }

                                          if(this.field_3050++ >= var2) {
                                             label247: {
                                                this.field_3050 = var2;
                                                this.field_3048 = this.method_3930();
                                                var10000 = this.field_2990.field_1820.field_5738;
                                                if(var1 != null) {
                                                   if(this.field_2990.field_1820.field_5738 == -1) {
                                                      var4 = 0;
                                                      if(var1 != null) {
                                                         break label247;
                                                      }
                                                   }

                                                   var10000 = -1;
                                                }

                                                var4 = var10000;
                                             }

                                             this.method_3964(var4);
                                          }
                                       }

                                       var25 = this;
                                    }

                                    var23 = 0;
                                 }

                                 var25.field_3049 = (boolean)var23;
                                 if(var1 != null) {
                                    break label293;
                                 }
                              }

                              var10000 = this.field_3050;
                           }

                           if(var1 != null) {
                              if(var10000 > 0) {
                                 this.field_3050 -= 4;
                              }

                              var10000 = this.field_3050;
                           }

                           if(var1 == null) {
                              break label292;
                           }

                           if(var10000 < 0) {
                              this.field_3050 = 0;
                           }
                        }

                        var25 = this;
                        if(var1 == null) {
                           break label291;
                        }

                        var10000 = this.field_3048;
                     }

                     if(var10000 > 0) {
                        --this.field_3048;
                     }

                     var25 = this;
                  }

                  var25.field_2990.field_1829.method_8333();
               }
            }

            var10000 = this.field_2990.field_1832;
         }
      }

      double var5;
      double var7;
      if(var1 != null) {
         if(var10000 != 0) {
            var25 = this;
            if(var1 != null) {
               if(this.field_3061 > 0) {
                  double var19 = this.field_2994 + (this.field_3062 - this.field_2994) / (double)this.field_3061;
                  var5 = this.field_2995 + (this.field_3063 - this.field_2995) / (double)this.field_3061;
                  var7 = this.field_2996 + (this.field_3064 - this.field_2996) / (double)this.field_3061;
                  double var9 = class_1715.method_9580(this.field_3065 - (double)this.field_3000);
                  this.field_3000 = (float)((double)this.field_3000 + var9 / (double)this.field_3061);
                  this.field_3001 = (float)((double)this.field_3001 + (this.field_3066 - (double)this.field_3001) / (double)this.field_3061);
                  --this.field_3061;
                  this.method_3854(var19, var5, var7);
                  this.method_3853(this.field_3000, this.field_3001);
                  if(var1 != null) {
                     return;
                  }
               }

               this.method_3854(this.field_2994, this.field_2995, this.field_2996);
               var25 = this;
            }

            var25.method_3853(this.field_3000, this.field_3001);
            if(var1 != null) {
               return;
            }
         }

         this.field_2991 = this.field_2994;
         this.field_2992 = this.field_2995;
         this.field_2993 = this.field_2996;
         this.field_2998 -= 0.03999999910593033D;
         var10000 = class_1715.method_9561(this.field_2994);
      }

      int var20 = var10000;
      var2 = class_1715.method_9561(this.field_2995);
      var4 = class_1715.method_9561(this.field_2996);
      if(class_392.method_2612(this.field_2990, var20, var2 - 1, var4)) {
         --var2;
      }

      label227: {
         label296: {
            var5 = 0.4D;
            var7 = 0.0078125D;
            aji var21 = this.field_2990.getBlock(var20, var2, var4);
            var10000 = class_392.method_2613(var21);
            if(var1 != null) {
               if(var10000 == 0) {
                  break label296;
               }

               var10000 = this.field_2990.method_33(var20, var2, var4);
            }

            label297: {
               int var10 = var10000;
               var25 = this;
               var23 = var20;
               int var10002 = var2;
               int var10003 = var4;
               if(var1 != null) {
                  this.method_3984(var20, var2, var4, var5, var7, var21, var10);
                  if(var21 != class_1192.field_6181) {
                     break label297;
                  }

                  var25 = this;
                  var23 = var20;
                  var10002 = var2;
                  var10003 = var4;
               }

               int var10004 = var10 & 8;
               if(var1 != null) {
                  var10004 = var10004 != 0?1:0;
               }

               var25.method_3982(var23, var10002, var10003, (boolean)var10004);
            }

            if(var1 != null) {
               break label227;
            }
         }

         this.method_3983(var5);
      }

      this.method_3866();
      this.field_3001 = 0.0F;
      double var22 = this.field_2991 - this.field_2994;
      double var12 = this.field_2993 - this.field_2996;
      double var27 = var22 * var22 + var12 * var12;
      if(var1 != null) {
         label210: {
            if(var27 > 0.001D) {
               this.field_3000 = (float)(Math.atan2(var12, var22) * 180.0D / 3.141592653589793D);
               var25 = this;
               if(var1 == null) {
                  break label210;
               }

               if(this.field_3058) {
                  this.field_3000 += 180.0F;
               }
            }

            var25 = this;
         }

         var27 = (double)class_1715.method_9579(var25.field_3000 - this.field_3002);
      }

      label298: {
         double var14 = var27;
         if(var1 != null) {
            if(var14 >= -170.0D && var14 < 170.0D) {
               break label298;
            }

            this.field_3000 += 180.0F;
         }

         boolean var24 = this.field_3058;
         if(var1 != null) {
            var24 = !this.field_3058;
         }

         this.field_3058 = var24;
      }

      label299: {
         class_690 var26;
         class_689 var30;
         label300: {
            label301: {
               this.method_3853(this.field_3000, this.field_3001);
               List var16 = this.field_2990.method_2155(this, this.field_3004.method_7097(0.20000000298023224D, 0.0D, 0.20000000298023224D));
               List var28 = var16;
               if(var1 != null) {
                  if(var16 == null) {
                     break label301;
                  }

                  var28 = var16;
               }

               byte var29 = var28.isEmpty();
               if(var1 != null) {
                  if(var29 != 0) {
                     break label301;
                  }

                  var29 = 0;
               }

               int var17 = var29;

               while(var17 < var16.size()) {
                  class_689 var18 = (class_689)var16.get(var17);
                  if(var1 != null) {
                     var30 = var18;
                     var26 = this;
                     if(var1 == null) {
                        break label300;
                     }

                     if(var18 != this.field_2987) {
                        label160: {
                           label304: {
                              boolean var31 = var18.method_3898();
                              if(var1 != null) {
                                 if(!var31) {
                                    break label160;
                                 }

                                 var30 = var18;
                                 if(var1 == null) {
                                    break label304;
                                 }

                                 var31 = var18 instanceof class_690;
                              }

                              if(!var31) {
                                 break label160;
                              }

                              var30 = var18;
                           }

                           var30.method_3893(this);
                        }
                     }

                     ++var17;
                  }

                  if(var1 == null) {
                     break;
                  }
               }
            }

            var30 = this.field_2987;
            if(var1 != null) {
               if(this.field_2987 == null) {
                  return;
               }

               var30 = this.field_2987;
            }

            if(var1 != null) {
               if(!var30.field_3012) {
                  return;
               }

               var25 = this;
               if(var1 == null) {
                  break label299;
               }

               var30 = this.field_2987.field_2988;
            }

            var26 = this;
         }

         if(var30 == var26) {
            this.field_2987.field_2988 = null;
         }

         var25 = this;
      }

      var25.field_2987 = null;
   }

   // $FF: renamed from: b (int, int, int, boolean) void
   public void method_3982(int var1, int var2, int var3, boolean var4) {}

   // $FF: renamed from: c (double) void
   protected void method_3983(double var1) {
      String[] var3 = class_752.method_4253();
      double var5;
      int var10000 = (var5 = this.field_2997 - -var1) == 0.0D?0:(var5 < 0.0D?-1:1);
      if(var3 != null) {
         if(var10000 < 0) {
            this.field_2997 = -var1;
         }

         double var6;
         var10000 = (var6 = this.field_2997 - var1) == 0.0D?0:(var6 < 0.0D?-1:1);
      }

      if(var3 != null) {
         if(var10000 > 0) {
            this.field_2997 = var1;
         }

         double var7;
         var10000 = (var7 = this.field_2999 - -var1) == 0.0D?0:(var7 < 0.0D?-1:1);
      }

      if(var3 != null) {
         if(var10000 < 0) {
            this.field_2999 = -var1;
         }

         double var8;
         var10000 = (var8 = this.field_2999 - var1) == 0.0D?0:(var8 < 0.0D?-1:1);
      }

      if(var3 != null) {
         if(var10000 > 0) {
            this.field_2999 = var1;
         }

         var10000 = this.field_3005;
      }

      class_690 var4;
      label58: {
         if(var3 != null) {
            if(var10000 != 0) {
               this.field_2997 *= 0.5D;
               this.field_2998 *= 0.5D;
               this.field_2999 *= 0.5D;
            }

            this.method_3864(this.field_2997, this.field_2998, this.field_2999);
            var4 = this;
            if(var3 == null) {
               break label58;
            }

            var10000 = this.field_3005;
         }

         if(var10000 != 0) {
            return;
         }

         this.field_2997 *= 0.949999988079071D;
         this.field_2998 *= 0.949999988079071D;
         var4 = this;
      }

      var4.field_2999 *= 0.949999988079071D;
   }

   // $FF: renamed from: b (int, int, int, double, double, aji, int) void
   protected void method_3984(int var1, int var2, int var3, double var4, double var6, aji var8, int var9) {
      this.field_3019 = 0.0F;
      azw var11 = this.method_3987(this.field_2994, this.field_2995, this.field_2996);
      String[] var10000 = class_752.method_4253();
      this.field_2995 = (double)var2;
      int var12 = 0;
      int var13 = 0;
      String[] var10 = var10000;
      aji var46 = var8;
      int var47;
      if(var10 != null) {
         if(var8 == class_1192.field_6054) {
            var47 = var9 & 8;
            if(var10 != null) {
               var47 = var47 != 0?1:0;
            }

            var12 = var47;
            var47 = var12;
            if(var10 != null) {
               var47 = var12 == 0?1:0;
            }

            var13 = var47;
         }

         var46 = var8;
      }

      var47 = ((class_392)var46).method_2615();
      if(var10 != null) {
         if(var47 != 0) {
            var9 &= 7;
         }

         var47 = var9;
      }

      byte var10001 = 2;
      if(var10 != null) {
         label353: {
            if(var47 >= 2) {
               var47 = var9;
               var10001 = 5;
               if(var10 == null) {
                  break label353;
               }

               if(var9 <= 5) {
                  this.field_2995 = (double)(var2 + 1);
               }
            }

            var47 = var9;
            var10001 = 2;
         }
      }

      if(var10 != null) {
         if(var47 == var10001) {
            this.field_2997 -= var6;
         }

         var47 = var9;
         var10001 = 3;
      }

      if(var10 != null) {
         if(var47 == var10001) {
            this.field_2997 += var6;
         }

         var47 = var9;
         var10001 = 4;
      }

      if(var10 != null) {
         if(var47 == var10001) {
            this.field_2999 += var6;
         }

         var47 = var9;
         var10001 = 5;
      }

      if(var47 == var10001) {
         this.field_2999 -= var6;
      }

      int[][] var14 = field_3060[var9];
      double var15 = (double)(var14[1][0] - var14[0][0]);
      double var17 = (double)(var14[1][2] - var14[0][2]);
      double var19 = Math.sqrt(var15 * var15 + var17 * var17);
      double var21 = this.field_2997 * var15 + this.field_2999 * var17;
      double var49 = var21;
      double var48 = 0.0D;
      if(var10 != null) {
         if(var21 < 0.0D) {
            var15 = -var15;
            var17 = -var17;
         }

         var49 = this.field_2997 * this.field_2997;
         var48 = this.field_2999 * this.field_2999;
      }

      double var23 = Math.sqrt(var49 + var48);
      if(var10 != null) {
         if(var23 > 2.0D) {
            var23 = 2.0D;
         }

         this.field_2997 = var23 * var15 / var19;
         this.field_2999 = var23 * var17 / var19;
      }

      double var25;
      double var27;
      double var29;
      double var31;
      label338: {
         label361: {
            class_689 var50 = this.field_2987;
            if(var10 != null) {
               if(this.field_2987 == null) {
                  break label361;
               }

               var50 = this.field_2987;
            }

            var47 = var50 instanceof class_752;
            if(var10 == null) {
               break label338;
            }

            if(var47 != 0) {
               var25 = (double)((class_752)this.field_2987).field_3348;
               double var55;
               var47 = (var55 = var25 - 0.0D) == 0.0D?0:(var55 < 0.0D?-1:1);
               if(var10 == null) {
                  break label338;
               }

               if(var47 > 0) {
                  var27 = -Math.sin((double)(this.field_2987.field_3000 * 3.1415927F / 180.0F));
                  var29 = Math.cos((double)(this.field_2987.field_3000 * 3.1415927F / 180.0F));
                  var31 = this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999;
                  double var56;
                  var47 = (var56 = var31 - 0.01D) == 0.0D?0:(var56 < 0.0D?-1:1);
                  if(var10 == null) {
                     break label338;
                  }

                  if(var47 < 0) {
                     this.field_2997 += var27 * 0.1D;
                     this.field_2999 += var29 * 0.1D;
                     var13 = 0;
                  }
               }
            }
         }

         var47 = var13;
      }

      if(var47 != 0) {
         label321: {
            var25 = Math.sqrt(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
            if(var10 != null) {
               if(var25 < 0.03D) {
                  this.field_2997 *= 0.0D;
                  this.field_2998 *= 0.0D;
                  this.field_2999 *= 0.0D;
                  if(var10 != null) {
                     break label321;
                  }
               }

               this.field_2997 *= 0.5D;
               this.field_2998 *= 0.0D;
            }

            this.field_2999 *= 0.5D;
         }
      }

      double var35;
      double var37;
      label314: {
         label362: {
            var25 = 0.0D;
            var27 = (double)var1 + 0.5D + (double)var14[0][0] * 0.5D;
            var29 = (double)var3 + 0.5D + (double)var14[0][2] * 0.5D;
            var31 = (double)var1 + 0.5D + (double)var14[1][0] * 0.5D;
            double var33 = (double)var3 + 0.5D + (double)var14[1][2] * 0.5D;
            var15 = var31 - var27;
            var17 = var33 - var29;
            double var57;
            var47 = (var57 = var15 - 0.0D) == 0.0D?0:(var57 < 0.0D?-1:1);
            if(var10 != null) {
               if(var47 == 0) {
                  this.field_2994 = (double)var1 + 0.5D;
                  var25 = this.field_2996 - (double)var3;
                  if(var10 != null) {
                     break label314;
                  }
               }

               var49 = var17;
               var48 = 0.0D;
               if(var10 == null) {
                  break label362;
               }

               double var58;
               var47 = (var58 = var17 - 0.0D) == 0.0D?0:(var58 < 0.0D?-1:1);
            }

            if(var47 == 0) {
               this.field_2996 = (double)var3 + 0.5D;
               var25 = this.field_2994 - (double)var1;
               if(var10 != null) {
                  break label314;
               }
            }

            var49 = this.field_2994;
            var48 = var27;
         }

         var35 = var49 - var48;
         var37 = this.field_2996 - var29;
         var25 = (var35 * var15 + var37 * var17) * 2.0D;
      }

      label300: {
         this.field_2994 = var27 + var15 * var25;
         this.field_2996 = var29 + var17 * var25;
         this.method_3854(this.field_2994, this.field_2995 + (double)this.field_3013, this.field_2996);
         var35 = this.field_2997;
         var37 = this.field_2999;
         if(var10 != null) {
            if(this.field_2987 == null) {
               break label300;
            }

            var35 *= 0.75D;
         }

         var37 *= 0.75D;
      }

      double var59;
      var47 = (var59 = var35 - -var4) == 0.0D?0:(var59 < 0.0D?-1:1);
      if(var10 != null) {
         if(var47 < 0) {
            var35 = -var4;
         }

         double var60;
         var47 = (var60 = var35 - var4) == 0.0D?0:(var60 < 0.0D?-1:1);
      }

      if(var10 != null) {
         if(var47 > 0) {
            var35 = var4;
         }

         double var61;
         var47 = (var61 = var37 - -var4) == 0.0D?0:(var61 < 0.0D?-1:1);
      }

      if(var10 != null) {
         if(var47 < 0) {
            var37 = -var4;
         }

         double var62;
         var47 = (var62 = var37 - var4) == 0.0D?0:(var62 < 0.0D?-1:1);
      }

      if(var10 != null) {
         if(var47 > 0) {
            var37 = var4;
         }

         this.method_3864(var35, 0.0D, var37);
         var47 = var14[0][1];
      }

      class_690 var51;
      label288: {
         label364: {
            if(var10 != null) {
               label285: {
                  if(var47 != 0) {
                     var47 = class_1715.method_9561(this.field_2994) - var1;
                     if(var10 == null) {
                        break label285;
                     }

                     if(var47 == var14[0][0]) {
                        var47 = class_1715.method_9561(this.field_2996) - var3;
                        if(var10 == null) {
                           break label285;
                        }

                        if(var47 == var14[0][2]) {
                           this.method_3854(this.field_2994, this.field_2995 + (double)var14[0][1], this.field_2996);
                           if(var10 != null) {
                              break label364;
                           }
                        }
                     }
                  }

                  var47 = var14[1][1];
               }
            }

            if(var10 != null) {
               if(var47 == 0) {
                  break label364;
               }

               var51 = this;
               if(var10 == null) {
                  break label288;
               }

               var47 = class_1715.method_9561(this.field_2994) - var1;
            }

            if(var47 == var14[1][0]) {
               var51 = this;
               if(var10 == null) {
                  break label288;
               }

               if(class_1715.method_9561(this.field_2996) - var3 == var14[1][2]) {
                  this.method_3854(this.field_2994, this.field_2995 + (double)var14[1][1], this.field_2996);
               }
            }
         }

         this.method_3985();
         var51 = this;
      }

      label366: {
         azw var39 = var51.method_3987(this.field_2994, this.field_2995, this.field_2996);
         azw var52 = var39;
         if(var10 != null) {
            if(var39 == null) {
               break label366;
            }

            var52 = var11;
         }

         if(var10 != null) {
            if(var52 == null) {
               break label366;
            }

            var52 = var11;
         }

         double var40 = (var52.field_4221 - var39.field_4221) * 0.05D;
         var51 = this;
         if(var10 != null) {
            var23 = Math.sqrt(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
            if(var23 > 0.0D) {
               this.field_2997 = this.field_2997 / var23 * (var23 + var40);
               this.field_2999 = this.field_2999 / var23 * (var23 + var40);
            }

            var51 = this;
         }

         var51.method_3854(this.field_2994, var39.field_4221, this.field_2996);
      }

      label251: {
         label250: {
            int var54 = class_1715.method_9561(this.field_2994);
            int var41 = class_1715.method_9561(this.field_2996);
            if(var10 != null) {
               if(var54 == var1) {
                  var47 = var41;
                  if(var10 == null) {
                     break label251;
                  }

                  if(var41 == var3) {
                     break label250;
                  }
               }

               var23 = Math.sqrt(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
               this.field_2997 = var23 * (double)(var54 - var1);
            }

            this.field_2999 = var23 * (double)(var41 - var3);
         }

         var47 = var12;
      }

      if(var47 != 0) {
         double var42 = Math.sqrt(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
         double var63;
         var47 = (var63 = var42 - 0.01D) == 0.0D?0:(var63 < 0.0D?-1:1);
         if(var10 != null) {
            if(var47 > 0) {
               double var44 = 0.06D;
               this.field_2997 += this.field_2997 / var42 * var44;
               this.field_2999 += this.field_2999 / var42 * var44;
               if(var10 != null) {
                  return;
               }
            }

            var47 = var9;
         }

         if(var10 != null) {
            if(var47 == 1) {
               label368: {
                  boolean var53 = this.field_2990.getBlock(var1 - 1, var2, var3).method_2433();
                  if(var10 != null) {
                     if(var53) {
                        this.field_2997 = 0.02D;
                        if(var10 != null) {
                           return;
                        }
                     }

                     var51 = this;
                     if(var10 == null) {
                        break label368;
                     }

                     var53 = this.field_2990.getBlock(var1 + 1, var2, var3).method_2433();
                  }

                  if(!var53) {
                     return;
                  }

                  var51 = this;
               }

               var51.field_2997 = -0.02D;
               if(var10 != null) {
                  return;
               }
            }

            var47 = var9;
         }

         if(var10 != null) {
            if(var47 != 0) {
               return;
            }

            var47 = this.field_2990.getBlock(var1, var2, var3 - 1).method_2433();
         }

         label370: {
            if(var10 != null) {
               if(var47 != 0) {
                  this.field_2999 = 0.02D;
                  if(var10 != null) {
                     return;
                  }
               }

               var51 = this;
               if(var10 == null) {
                  break label370;
               }

               var47 = this.field_2990.getBlock(var1, var2, var3 + 1).method_2433();
            }

            if(var47 == 0) {
               return;
            }

            var51 = this;
         }

         var51.field_2999 = -0.02D;
      }

   }

   // $FF: renamed from: o () void
   protected void method_3985() {
      String[] var1 = class_752.method_4253();
      class_690 var10000 = this;
      if(var1 != null) {
         if(this.field_2987 != null) {
            this.field_2997 *= 0.996999979019165D;
            this.field_2998 *= 0.0D;
            this.field_2999 *= 0.996999979019165D;
            if(var1 != null) {
               return;
            }
         }

         this.field_2997 *= 0.9599999785423279D;
         this.field_2998 *= 0.0D;
         var10000 = this;
      }

      var10000.field_2999 *= 0.9599999785423279D;
   }

   // $FF: renamed from: b (double, double, double, double) azw
   public azw method_3986(double var1, double var3, double var5, double var7) {
      String[] var10000 = class_752.method_4253();
      int var10 = class_1715.method_9561(var1);
      int var11 = class_1715.method_9561(var3);
      String[] var9 = var10000;
      int var12 = class_1715.method_9561(var5);
      ahb var22 = this.field_2990;
      int var10001 = var10;
      int var10002 = var11 - 1;
      int var10003 = var12;
      if(var9 != null) {
         if(class_392.method_2612(this.field_2990, var10, var10002, var12)) {
            --var11;
         }

         var22 = this.field_2990;
         var10001 = var10;
         var10002 = var11;
         var10003 = var12;
      }

      aji var13 = var22.getBlock(var10001, var10002, var10003);
      int var23 = class_392.method_2613(var13);
      if(var9 != null) {
         if(var23 == 0) {
            return null;
         }

         var23 = this.field_2990.method_33(var10, var11, var12);
      }

      int var14 = var23;
      var23 = ((class_392)var13).method_2615();
      if(var9 != null) {
         if(var23 != 0) {
            var14 &= 7;
         }

         var3 = (double)var11;
         var23 = var14;
      }

      label96: {
         byte var24 = 2;
         if(var9 != null) {
            if(var23 < 2) {
               break label96;
            }

            var23 = var14;
            var24 = 5;
         }

         if(var9 != null) {
            if(var23 > var24) {
               break label96;
            }

            var23 = var11;
            var24 = 1;
         }

         var3 = (double)(var23 + var24);
      }

      int[][] var15 = field_3060[var14];
      double var16 = (double)(var15[1][0] - var15[0][0]);
      double var18 = (double)(var15[1][2] - var15[0][2]);
      double var20 = Math.sqrt(var16 * var16 + var18 * var18);
      var16 /= var20;
      var18 /= var20;
      var1 += var16 * var7;
      var5 += var18 * var7;
      var23 = var15[0][1];
      if(var9 != null) {
         label76: {
            if(var23 != 0) {
               var23 = class_1715.method_9561(var1) - var10;
               if(var9 == null) {
                  break label76;
               }

               if(var23 == var15[0][0]) {
                  var23 = class_1715.method_9561(var5) - var12;
                  if(var9 == null) {
                     break label76;
                  }

                  if(var23 == var15[0][2]) {
                     var3 += (double)var15[0][1];
                     if(var9 != null) {
                        return this.method_3987(var1, var3, var5);
                     }
                  }
               }
            }

            var23 = var15[1][1];
         }
      }

      if(var9 != null) {
         if(var23 == 0) {
            return this.method_3987(var1, var3, var5);
         }

         var23 = class_1715.method_9561(var1) - var10;
      }

      double var25;
      label98: {
         var10001 = var15[1][0];
         if(var9 != null) {
            if(var23 != var10001) {
               return this.method_3987(var1, var3, var5);
            }

            var25 = var5;
            if(var9 == null) {
               break label98;
            }

            var23 = class_1715.method_9561(var5) - var12;
            var10001 = var15[1][2];
         }

         if(var23 != var10001) {
            return this.method_3987(var1, var3, var5);
         }

         var25 = var3 + (double)var15[1][1];
      }

      var3 = var25;
      return this.method_3987(var1, var3, var5);
   }

   // $FF: renamed from: k (double, double, double) azw
   public azw method_3987(double var1, double var3, double var5) {
      int var8 = class_1715.method_9561(var1);
      String[] var7 = class_752.method_4253();
      int var9 = class_1715.method_9561(var3);
      int var10 = class_1715.method_9561(var5);
      ahb var10000 = this.field_2990;
      int var10001 = var8;
      int var10002 = var9 - 1;
      int var10003 = var10;
      if(var7 != null) {
         if(class_392.method_2612(this.field_2990, var8, var10002, var10)) {
            --var9;
         }

         var10000 = this.field_2990;
         var10001 = var8;
         var10002 = var9;
         var10003 = var10;
      }

      aji var11 = var10000.getBlock(var10001, var10002, var10003);
      int var38 = class_392.method_2613(var11);
      if(var7 != null) {
         if(var38 == 0) {
            return null;
         }

         var38 = this.field_2990.method_33(var8, var9, var10);
      }

      int var12 = var38;
      var3 = (double)var9;
      var38 = ((class_392)var11).method_2615();
      if(var7 != null) {
         if(var38 != 0) {
            var12 &= 7;
         }

         var38 = var12;
      }

      label89: {
         byte var39 = 2;
         if(var7 != null) {
            if(var38 < 2) {
               break label89;
            }

            var38 = var12;
            var39 = 5;
         }

         if(var7 != null) {
            if(var38 > var39) {
               break label89;
            }

            var38 = var9;
            var39 = 1;
         }

         var3 = (double)(var38 + var39);
      }

      double var14;
      double var16;
      double var18;
      double var20;
      double var28;
      double var30;
      double var32;
      double var40;
      double var41;
      label71: {
         label90: {
            int[][] var13 = field_3060[var12];
            var14 = 0.0D;
            var16 = (double)var8 + 0.5D + (double)var13[0][0] * 0.5D;
            var18 = (double)var9 + 0.5D + (double)var13[0][1] * 0.5D;
            var20 = (double)var10 + 0.5D + (double)var13[0][2] * 0.5D;
            double var22 = (double)var8 + 0.5D + (double)var13[1][0] * 0.5D;
            double var24 = (double)var9 + 0.5D + (double)var13[1][1] * 0.5D;
            double var26 = (double)var10 + 0.5D + (double)var13[1][2] * 0.5D;
            var28 = var22 - var16;
            var30 = (var24 - var18) * 2.0D;
            var32 = var26 - var20;
            double var42;
            var38 = (var42 = var28 - 0.0D) == 0.0D?0:(var42 < 0.0D?-1:1);
            if(var7 != null) {
               if(var38 == 0) {
                  var1 = (double)var8 + 0.5D;
                  var14 = var5 - (double)var10;
                  if(var7 != null) {
                     break label71;
                  }
               }

               var41 = var32;
               var40 = 0.0D;
               if(var7 == null) {
                  break label90;
               }

               double var43;
               var38 = (var43 = var32 - 0.0D) == 0.0D?0:(var43 < 0.0D?-1:1);
            }

            if(var38 == 0) {
               var5 = (double)var10 + 0.5D;
               var14 = var1 - (double)var8;
               if(var7 != null) {
                  break label71;
               }
            }

            var41 = var1;
            var40 = var16;
         }

         double var34 = var41 - var40;
         double var36 = var5 - var20;
         var14 = (var34 * var28 + var36 * var32) * 2.0D;
      }

      var1 = var16 + var28 * var14;
      var3 = var18 + var30 * var14;
      var5 = var20 + var32 * var14;
      double var44;
      var38 = (var44 = var30 - 0.0D) == 0.0D?0:(var44 < 0.0D?-1:1);
      if(var7 != null) {
         if(var38 < 0) {
            ++var3;
         }

         var41 = var30;
         var40 = 0.0D;
         if(var7 == null) {
            return azw.method_5086(var41, var40, var5);
         }

         double var45;
         var38 = (var45 = var30 - 0.0D) == 0.0D?0:(var45 < 0.0D?-1:1);
      }

      if(var38 > 0) {
         var3 += 0.5D;
      }

      var41 = var1;
      var40 = var3;
      return azw.method_5086(var41, var40, var5);
   }

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {
      String[] var2 = class_752.method_4253();
      String[] var3 = field_3071;
      int var10000 = var1.method_8690("CustomDisplayTile");
      if(var2 != null) {
         if(var10000 != 0) {
            this.method_4001(var1.method_8681("DisplayTile"));
            this.method_4002(var1.method_8681("DisplayData"));
            this.method_4003(var1.method_8681("DisplayOffset"));
         }

         var3 = field_3071;
         var10000 = var1.initGui8("CustomName", 8);
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         var3 = field_3071;
         var10000 = var1.method_8685("CustomName").length();
      }

      if(var10000 > 0) {
         String[] var10002 = field_3071;
         this.field_3059 = var1.method_8685("CustomName");
      }

   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {
      String[] var2 = class_752.method_4253();
      class_690 var10000 = this;
      if(var2 != null) {
         if(this.method_4004()) {
            String[] var3;
            int var5;
            label30: {
               var3 = field_3071;
               var1.initGui4("CustomDisplayTile", true);
               aji var10002 = this.method_3995();
               if(var2 != null) {
                  if(var10002.method_2424() == awt.field_4170) {
                     var5 = 0;
                     break label30;
                  }

                  var10002 = this.method_3995();
               }

               var5 = aji.method_2415(var10002);
            }

            var1.method_8667("DisplayTile", var5);
            var3 = field_3071;
            var1.method_8667("DisplayData", this.method_3997());
            var1.method_8667("DisplayOffset", this.method_3999());
         }

         var10000 = this;
      }

      String var4 = var10000.field_3059;
      if(var2 != null) {
         if(var4 == null) {
            return;
         }

         var4 = this.field_3059;
      }

      if(var4.length() > 0) {
         String[] var10001 = field_3071;
         var1.initGui1("CustomName", this.field_3059);
      }

   }

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: g (sa) void
   public void method_3893(class_689 var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = var1;
      }

      if(var2 != null) {
         if(var10000 == this.field_2987) {
            return;
         }

         var10000 = var1;
      }

      double var10001;
      double var25;
      label123: {
         if(var2 != null) {
            label121: {
               if(var10000 instanceof class_752) {
                  var10000 = var1;
                  if(var2 == null) {
                     break label121;
                  }

                  if(!(var1 instanceof class_792)) {
                     var10000 = var1;
                     if(var2 == null) {
                        break label121;
                     }

                     if(!(var1 instanceof class_765)) {
                        var10000 = this;
                        if(var2 == null) {
                           break label121;
                        }

                        if(this.method_3994() == 0) {
                           var25 = this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999;
                           var10001 = 0.01D;
                           if(var2 == null) {
                              break label123;
                           }

                           if(var25 > 0.01D) {
                              var10000 = this.field_2987;
                              if(var2 == null) {
                                 break label121;
                              }

                              if(this.field_2987 == null) {
                                 var10000 = var1.field_2988;
                                 if(var2 == null) {
                                    break label121;
                                 }

                                 if(var1.field_2988 == null) {
                                    var1.method_3925(this);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var10000 = var1;
            }
         }

         var25 = ((class_689)var10000).field_2994;
         var10001 = this.field_2994;
      }

      double var3 = var25 - var10001;
      double var5 = var1.field_2996 - this.field_2996;
      double var7 = var3 * var3 + var5 * var5;
      var25 = var7;
      var10001 = 9.999999747378752E-5D;
      if(var2 != null) {
         if(var7 < 9.999999747378752E-5D) {
            return;
         }

         var7 = (double)class_1715.method_9558(var7);
         var3 /= var7;
         var5 /= var7;
         var25 = 1.0D;
         var10001 = var7;
      }

      class_689 var24;
      label137: {
         double var9 = var25 / var10001;
         double var27;
         int var23 = (var27 = var9 - 1.0D) == 0.0D?0:(var27 < 0.0D?-1:1);
         if(var2 != null) {
            if(var23 > 0) {
               var9 = 1.0D;
            }

            var3 *= var9;
            var5 *= var9;
            var3 *= 0.10000000149011612D;
            var5 *= 0.10000000149011612D;
            var3 *= (double)(1.0F - this.field_3027);
            var5 *= (double)(1.0F - this.field_3027);
            var3 *= 0.5D;
            var5 *= 0.5D;
            var24 = var1;
            if(var2 == null) {
               break label137;
            }

            var23 = var1 instanceof class_690;
         }

         if(var23 != 0) {
            double var11 = var1.field_2994 - this.field_2994;
            double var13 = var1.field_2996 - this.field_2996;
            azw var15 = azw.method_5086(var11, 0.0D, var13).method_5090();
            azw var16 = azw.method_5086((double)class_1715.method_9556(this.field_3000 * 3.1415927F / 180.0F), 0.0D, (double)class_1715.method_9555(this.field_3000 * 3.1415927F / 180.0F)).method_5090();
            double var17 = Math.abs(var15.method_5091(var16));
            var25 = var17;
            var10001 = 0.800000011920929D;
            if(var2 != null) {
               if(var17 < 0.800000011920929D) {
                  return;
               }

               var25 = var1.field_2997;
               var10001 = this.field_2997;
            }

            label82: {
               double var19;
               double var21;
               label140: {
                  var19 = var25 + var10001;
                  var21 = var1.field_2999 + this.field_2999;
                  var23 = ((class_690)var1).method_3994();
                  byte var26 = 2;
                  if(var2 != null) {
                     label141: {
                        if(var23 == 2) {
                           var23 = this.method_3994();
                           var26 = 2;
                           if(var2 == null) {
                              break label141;
                           }

                           if(var23 != 2) {
                              this.field_2997 *= 0.20000000298023224D;
                              this.field_2999 *= 0.20000000298023224D;
                              this.method_3894(var1.field_2997 - var3, 0.0D, var1.field_2999 - var5);
                              var1.field_2997 *= 0.949999988079071D;
                              var1.field_2999 *= 0.949999988079071D;
                              if(var2 != null) {
                                 break label82;
                              }
                           }
                        }

                        var10000 = (class_690)var1;
                        if(var2 == null) {
                           break label140;
                        }

                        var23 = ((class_690)var10000).method_3994();
                        var26 = 2;
                     }
                  }

                  if(var23 != var26) {
                     var10000 = this;
                     if(var2 == null) {
                        break label140;
                     }

                     if(this.method_3994() == 2) {
                        var1.field_2997 *= 0.20000000298023224D;
                        var1.field_2999 *= 0.20000000298023224D;
                        var1.method_3894(this.field_2997 + var3, 0.0D, this.field_2999 + var5);
                        this.field_2997 *= 0.949999988079071D;
                        this.field_2999 *= 0.949999988079071D;
                        if(var2 != null) {
                           break label82;
                        }
                     }
                  }

                  var19 /= 2.0D;
                  var21 /= 2.0D;
                  this.field_2997 *= 0.20000000298023224D;
                  this.field_2999 *= 0.20000000298023224D;
                  this.method_3894(var19 - var3, 0.0D, var21 - var5);
                  var1.field_2997 *= 0.20000000298023224D;
                  var1.field_2999 *= 0.20000000298023224D;
                  var10000 = var1;
               }

               ((class_689)var10000).method_3894(var19 + var3, 0.0D, var21 + var5);
            }

            if(var2 != null) {
               return;
            }
         }

         this.method_3894(-var3, 0.0D, -var5);
         var24 = var1;
      }

      var24.method_3894(var3 / 4.0D, 0.0D, var5 / 4.0D);
   }

   // $FF: renamed from: a (double, double, double, float, float, int) void
   public void method_3926(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_3062 = var1;
      this.field_3063 = var3;
      this.field_3064 = var5;
      this.field_3065 = (double)var7;
      this.field_3066 = (double)var8;
      this.field_3061 = var9 + 2;
      this.field_2997 = this.field_3067;
      this.field_2998 = this.field_3068;
      this.field_2999 = this.field_3069;
   }

   // $FF: renamed from: i (double, double, double) void
   public void method_3931(double var1, double var3, double var5) {
      this.field_3067 = this.field_2997 = var1;
      this.field_3068 = this.field_2998 = var3;
      this.field_3069 = this.field_2999 = var5;
   }

   // $FF: renamed from: f (float) void
   public void method_3988(float var1) {
      this.field_3036.method_9506(19, Float.valueOf(var1));
   }

   // $FF: renamed from: p () float
   public float method_3989() {
      return this.field_3036.method_9502(19);
   }

   // $FF: renamed from: a (int) void
   public void method_3990(int var1) {
      this.field_3036.method_9506(17, Integer.valueOf(var1));
   }

   // $FF: renamed from: q () int
   public int method_3991() {
      return this.field_3036.method_9501(17);
   }

   // $FF: renamed from: k (int) void
   public void method_3992(int var1) {
      this.field_3036.method_9506(18, Integer.valueOf(var1));
   }

   // $FF: renamed from: r () int
   public int method_3993() {
      return this.field_3036.method_9501(18);
   }

   // $FF: renamed from: s () int
   public abstract int method_3994();

   // $FF: renamed from: t () aji
   public aji method_3995() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4004();
      if(var1 != null) {
         if(var10000 == 0) {
            return this.method_3996();
         }

         var10000 = this.method_3849().method_9501(20) & '\uffff';
      }

      int var2 = var10000;
      return aji.method_2416(var2);
   }

   // $FF: renamed from: u () aji
   public aji method_3996() {
      return class_1192.field_6025;
   }

   // $FF: renamed from: v () int
   public int method_3997() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4004();
      if(var1 != null) {
         if(var10000 == 0) {
            var10000 = this.method_3998();
            return var10000;
         }

         var10000 = this.method_3849().method_9501(20);
      }

      var10000 >>= 16;
      return var10000;
   }

   // $FF: renamed from: w () int
   public int method_3998() {
      return 0;
   }

   // $FF: renamed from: x () int
   public int method_3999() {
      String[] var1 = class_752.method_4253();
      class_690 var10000 = this;
      int var2;
      if(var1 != null) {
         if(!this.method_4004()) {
            var2 = this.method_4000();
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.method_3849().method_9501(21);
      return var2;
   }

   // $FF: renamed from: aD () int
   public int method_4000() {
      return 6;
   }

   // $FF: renamed from: l (int) void
   public void method_4001(int var1) {
      this.method_3849().method_9506(20, Integer.valueOf(var1 & '\uffff' | this.method_3997() << 16));
      this.method_4005(true);
   }

   // $FF: renamed from: m (int) void
   public void method_4002(int var1) {
      this.method_3849().method_9506(20, Integer.valueOf(aji.method_2415(this.method_3995()) & '\uffff' | var1 << 16));
      this.method_4005(true);
   }

   // $FF: renamed from: n (int) void
   public void method_4003(int var1) {
      this.method_3849().method_9506(21, Integer.valueOf(var1));
      this.method_4005(true);
   }

   // $FF: renamed from: aE () boolean
   public boolean method_4004() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_3849().method_9499(22);
      if(var1 != null) {
         var10000 = var10000 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f (boolean) void
   public void method_4005(boolean var1) {
      String[] var2 = class_752.method_4253();
      class_1710 var10000 = this.method_3849();
      int var10002 = var1;
      if(var2 != null) {
         var10002 = var1 != 0?1:0;
      }

      var10000.method_9506(22, Byte.valueOf((byte)var10002));
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_4006(String var1) {
      this.field_3059 = var1;
   }

   // $FF: renamed from: b_ () java.lang.String
   public String method_4007() {
      String[] var1 = class_752.method_4253();
      class_690 var10000 = this;
      String var2;
      if(var1 != null) {
         if(this.field_3059 != null) {
            var2 = this.field_3059;
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.method_64();
      return var2;
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      return this.field_3059 != null;
   }

   // $FF: renamed from: aF () java.lang.String
   public String method_4008() {
      return this.field_3059;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4009() {
      // $FF: Couldn't be decompiled
   }
}
