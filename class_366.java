import java.util.Random;

// $FF: renamed from: fm
public abstract class class_366 extends aji {

   // $FF: renamed from: M vL[]
   private IIcon[] field_2029;
   // $FF: renamed from: N java.lang.String
   private static final String field_2030;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2031;


   // $FF: renamed from: <init> (awt) void
   protected void method_2427(awt var1) {
      super.method_2427(var1);
      float var2 = 0.0F;
      float var3 = 0.0F;
      this.method_2443(0.0F + var3, 0.0F + var2, 0.0F + var3, 1.0F + var3, 1.0F + var2, 1.0F + var3);
      this.method_2440(true);
   }

   // $FF: renamed from: b (ahl, int, int, int) boolean
   public boolean method_2435(ahl var1, int var2, int var3, int var4) {
      return this.field_2007 != awt.field_4178;
   }

   // $FF: renamed from: D () int
   public int method_2493() {
      return 16777215;
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      if(this.field_2007 != awt.field_4177) {
         return 16777215;
      } else {
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = -1;

         int var10000;
         while(true) {
            if(var9 <= 1) {
               var10000 = -1;
               if(var5 == null) {
                  break;
               }

               int var10 = -1;

               while(true) {
                  if(var10 <= 1) {
                     int var11 = var1.method_35(var2 + var10, var4 + var9).field_5042;
                     var6 += (var11 & 16711680) >> 16;
                     var7 += (var11 & '\uff00') >> 8;
                     var8 += var11 & 255;
                     ++var10;
                     if(var5 == null) {
                        break;
                     }

                     if(var5 != null) {
                        continue;
                     }
                  }

                  ++var9;
                  break;
               }

               if(var5 != null) {
                  continue;
               }
            }

            var10000 = (var6 / 9 & 255) << 16 | (var7 / 9 & 255) << 8 | var8 / 9 & 255;
            break;
         }

         return var10000;
      }
   }

   // $FF: renamed from: c (int) float
   public static float method_2552(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0;
      byte var10001 = 8;
      if(var1 != null) {
         if(var0 >= 8) {
            var0 = 0;
         }

         var10000 = var0;
         var10001 = 1;
      }

      return (float)(var10000 + var10001) / 9.0F;
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      IIcon var4;
      label17: {
         String[] var3 = class_752.method_4253();
         int var10000 = var1;
         if(var3 != null) {
            if(var1 == 0) {
               break label17;
            }

            var10000 = var1;
         }

         if(var10000 != 1) {
            var4 = this.field_2029[1];
            return var4;
         }
      }

      var4 = this.field_2029[0];
      return var4;
   }

   // $FF: renamed from: h (ahb, int, int, int) int
   protected int method_2553(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      ahb var10000 = var1;
      int var10001 = var2;
      int var10002 = var3;
      int var10003 = var4;
      int var6;
      if(var5 != null) {
         if(var1.getBlock(var2, var3, var4).method_2424() != this.field_2007) {
            var6 = -1;
            return var6;
         }

         var10000 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      var6 = var10000.method_33(var10001, var10002, var10003);
      return var6;
   }

   // $FF: renamed from: f (ahl, int, int, int) int
   protected int method_2554(ahl var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      ahl var10000 = var1;
      int var10001 = var2;
      int var10002 = var3;
      int var10003 = var4;
      if(var5 != null) {
         if(var1.getBlock(var2, var3, var4).method_2424() != this.field_2007) {
            return -1;
         }

         var10000 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      int var6 = var10000.method_33(var10001, var10002, var10003);
      int var7 = var6;
      if(var5 != null) {
         if(var6 >= 8) {
            var6 = 0;
         }

         var7 = var6;
      }

      return var7;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (int, boolean) boolean
   public boolean method_2454(int var1, boolean var2) {
      int var10000;
      label24: {
         String[] var3 = class_752.method_4253();
         var10000 = var2;
         if(var3 != null) {
            if(var2 == 0) {
               break label24;
            }

            var10000 = var1;
         }

         if(var3 == null) {
            return (boolean)var10000;
         }

         if(var10000 == 1) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: d (ahl, int, int, int, int) boolean
   public boolean method_2446(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      awt var7 = var1.getBlock(var2, var3, var4).method_2424();
      String[] var6 = var10000;
      int var8;
      if(var7 == this.field_2007) {
         var8 = 0;
      } else {
         var8 = var5;
         if(var6 != null) {
            var8 = var5 == 1?1:(var7 == awt.field_4192?0:super.method_2446(var1, var2, var3, var4, var5));
         }
      }

      return (boolean)var8;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      awt var7 = var1.getBlock(var2, var3, var4).method_2424();
      String[] var6 = var10000;
      int var8;
      if(var7 == this.field_2007) {
         var8 = 0;
      } else {
         var8 = var5;
         if(var6 != null) {
            var8 = var5 == 1?1:super.method_2445(var1, var2, var3, var4, var5);
         }
      }

      return (boolean)var8;
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 4;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return null;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: g (ahl, int, int, int) azw
   private azw method_2555(ahl var1, int var2, int var3, int var4) {
      azw var6 = azw.method_5086(0.0D, 0.0D, 0.0D);
      String[] var10000 = class_752.method_4253();
      int var7 = this.method_2554(var1, var2, var3, var4);
      String[] var5 = var10000;
      int var8 = 0;

      int var13;
      while(true) {
         if(var8 < 4) {
            int var9 = var2;
            int var10 = var4;
            var13 = var8;
            if(var5 == null) {
               break;
            }

            if(var5 != null) {
               if(var8 == 0) {
                  var9 = var2 - 1;
               }

               var13 = var8;
            }

            byte var10001 = 1;
            if(var5 != null) {
               if(var13 == 1) {
                  var10 = var4 - 1;
               }

               var13 = var8;
               var10001 = 2;
            }

            label247: {
               if(var5 != null) {
                  if(var13 == var10001) {
                     ++var9;
                  }

                  var13 = var8;
                  if(var5 == null) {
                     break label247;
                  }

                  var10001 = 3;
               }

               if(var13 == var10001) {
                  ++var10;
               }

               var13 = this.method_2554(var1, var9, var3, var10);
            }

            label227: {
               label249: {
                  int var11 = var13;
                  var13 = var11;
                  int var12;
                  if(var5 != null) {
                     if(var11 < 0) {
                        var13 = var1.getBlock(var9, var3, var10).method_2424().method_5065();
                        if(var5 != null) {
                           if(var13 != 0) {
                              break label249;
                           }

                           var11 = this.method_2554(var1, var9, var3 - 1, var10);
                           if(var5 == null) {
                              break label227;
                           }

                           var13 = var11;
                        }

                        if(var13 < 0) {
                           break label249;
                        }

                        var12 = var11 - (var7 - 8);
                        var6 = var6.method_5093((double)((var9 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
                        if(var5 != null) {
                           break label249;
                        }
                     }

                     var13 = var11;
                  }

                  if(var5 != null) {
                     if(var13 < 0) {
                        break label249;
                     }

                     var13 = var11 - var7;
                  }

                  var12 = var13;
                  var6 = var6.method_5093((double)((var9 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
               }

               ++var8;
            }

            if(var5 != null) {
               continue;
            }
         }

         var13 = var1.method_33(var2, var3, var4);
         break;
      }

      label252: {
         if(var5 != null) {
            if(var13 < 8) {
               break label252;
            }

            var8 = 0;
            var13 = var8;
         }

         label196: {
            label195: {
               if(var5 != null) {
                  if(var13 == 0) {
                     var13 = this.method_2446(var1, var2, var3, var4 - 1, 2);
                     if(var5 == null) {
                        break label196;
                     }

                     if(var13 == 0) {
                        break label195;
                     }
                  }

                  var13 = 1;
               }

               var8 = var13;
            }

            var13 = var8;
         }

         label185: {
            label184: {
               if(var5 != null) {
                  if(var13 == 0) {
                     var13 = this.method_2446(var1, var2, var3, var4 + 1, 3);
                     if(var5 == null) {
                        break label185;
                     }

                     if(var13 == 0) {
                        break label184;
                     }
                  }

                  var13 = 1;
               }

               var8 = var13;
            }

            var13 = var8;
         }

         label174: {
            label173: {
               if(var5 != null) {
                  if(var13 == 0) {
                     var13 = this.method_2446(var1, var2 - 1, var3, var4, 4);
                     if(var5 == null) {
                        break label174;
                     }

                     if(var13 == 0) {
                        break label173;
                     }
                  }

                  var13 = 1;
               }

               var8 = var13;
            }

            var13 = var8;
         }

         label163: {
            label162: {
               if(var5 != null) {
                  if(var13 == 0) {
                     var13 = this.method_2446(var1, var2 + 1, var3, var4, 5);
                     if(var5 == null) {
                        break label163;
                     }

                     if(var13 == 0) {
                        break label162;
                     }
                  }

                  var13 = 1;
               }

               var8 = var13;
            }

            var13 = var8;
         }

         label152: {
            label151: {
               if(var5 != null) {
                  if(var13 == 0) {
                     var13 = this.method_2446(var1, var2, var3 + 1, var4 - 1, 2);
                     if(var5 == null) {
                        break label152;
                     }

                     if(var13 == 0) {
                        break label151;
                     }
                  }

                  var13 = 1;
               }

               var8 = var13;
            }

            var13 = var8;
         }

         label141: {
            label140: {
               if(var5 != null) {
                  if(var13 == 0) {
                     var13 = this.method_2446(var1, var2, var3 + 1, var4 + 1, 3);
                     if(var5 == null) {
                        break label141;
                     }

                     if(var13 == 0) {
                        break label140;
                     }
                  }

                  var13 = 1;
               }

               var8 = var13;
            }

            var13 = var8;
         }

         label130: {
            label129: {
               if(var5 != null) {
                  if(var13 == 0) {
                     var13 = this.method_2446(var1, var2 - 1, var3 + 1, var4, 4);
                     if(var5 == null) {
                        break label130;
                     }

                     if(var13 == 0) {
                        break label129;
                     }
                  }

                  var13 = 1;
               }

               var8 = var13;
            }

            var13 = var8;
         }

         label119: {
            label118: {
               if(var5 != null) {
                  if(var13 == 0) {
                     var13 = this.method_2446(var1, var2 + 1, var3 + 1, var4, 5);
                     if(var5 == null) {
                        break label119;
                     }

                     if(var13 == 0) {
                        break label118;
                     }
                  }

                  var13 = 1;
               }

               var8 = var13;
            }

            var13 = var8;
         }

         if(var13 != 0) {
            var6 = var6.method_5090().method_5093(0.0D, -6.0D, 0.0D);
         }
      }

      var6 = var6.method_5090();
      return var6;
   }

   // $FF: renamed from: a (ahb, int, int, int, sa, azw) void
   public void method_2485(ahb var1, int var2, int var3, int var4, class_689 var5, azw var6) {
      azw var7 = this.method_2555(var1, var2, var3, var4);
      var6.field_4220 += var7.field_4220;
      var6.field_4221 += var7.field_4221;
      var6.field_4222 += var7.field_4222;
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      String[] var2 = class_752.method_4253();
      awt var10000 = this.field_2007;
      awt var10001 = awt.field_4177;
      int var3;
      if(var2 != null) {
         if(this.field_2007 == awt.field_4177) {
            var3 = 5;
            return var3;
         }

         var10000 = this.field_2007;
         var10001 = awt.field_4178;
      }

      if(var10000 == var10001) {
         var3 = var1.field_1820.field_5736;
         if(var2 != null) {
            var3 = var1.field_1820.field_5736?10:30;
         }
      } else {
         var3 = 0;
      }

      return var3;
   }

   // $FF: renamed from: c (ahl, int, int, int) int
   public int method_2444(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_32(var2, var3, var4, 0);
      int var7 = var1.method_32(var2, var3 + 1, var4, 0);
      int var8 = var6 & 255;
      String[] var5 = var10000;
      int var9 = var7 & 255;
      int var10 = var6 >> 16 & 255;
      int var11 = var7 >> 16 & 255;
      int var12 = var8;
      if(var5 != null) {
         var12 = var8 > var9?var8:var9;
      }

      int var10001 = var10;
      if(var5 != null) {
         var10001 = var10 > var11?var10:var11;
      }

      return var12 | var10001 << 16;
   }

   // $FF: renamed from: w () int
   public int method_2477() {
      return this.field_2007 == awt.field_4177?1:0;
   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6;
      double var12;
      String[] var22;
      double var23;
      double var24;
      int var25;
      label270: {
         var6 = class_752.method_4253();
         awt var10000 = this.field_2007;
         awt var10001 = awt.field_4177;
         int var7;
         if(var6 != null) {
            if(this.field_2007 == awt.field_4177) {
               var25 = var5.nextInt(10);
               if(var6 != null) {
                  label251: {
                     if(var25 == 0) {
                        label249: {
                           label272: {
                              var7 = var1.method_33(var2, var3, var4);
                              var25 = var7;
                              if(var6 != null) {
                                 if(var7 <= 0) {
                                    break label272;
                                 }

                                 var25 = var7;
                              }

                              if(var6 == null) {
                                 break label251;
                              }

                              if(var25 < 8) {
                                 break label249;
                              }
                           }

                           var22 = field_2031;
                           var1.method_2087("suspended", (double)((float)var2 + var5.nextFloat()), (double)((float)var3 + var5.nextFloat()), (double)((float)var4 + var5.nextFloat()), 0.0D, 0.0D, 0.0D);
                        }
                     }

                     var25 = 0;
                  }
               }

               var7 = var25;

               while(var7 < 0) {
                  int var8 = var5.nextInt(4);
                  int var9 = var2;
                  int var10 = var4;
                  var25 = var8;
                  if(var6 == null) {
                     break label270;
                  }

                  if(var6 != null) {
                     if(var8 == 0) {
                        var9 = var2 - 1;
                     }

                     var25 = var8;
                  }

                  byte var26 = 1;
                  if(var6 != null) {
                     if(var25 == 1) {
                        ++var9;
                     }

                     var25 = var8;
                     var26 = 2;
                  }

                  if(var6 != null) {
                     if(var25 == var26) {
                        var10 = var4 - 1;
                     }

                     var25 = var8;
                     var26 = 3;
                  }

                  if(var25 == var26) {
                     ++var10;
                  }

                  label276: {
                     var10000 = var1.getBlock(var9, var3, var10).method_2424();
                     if(var6 != null) {
                        if(var10000 != awt.field_4170) {
                           break label276;
                        }

                        var10000 = var1.getBlock(var9, var3 - 1, var10).method_2424();
                     }

                     label222: {
                        boolean var27 = var10000.method_5065();
                        if(var6 != null) {
                           if(var27) {
                              break label222;
                           }

                           var27 = var1.getBlock(var9, var3 - 1, var10).method_2424().method_5062();
                        }

                        if(!var27) {
                           break label276;
                        }
                     }

                     float var11 = 0.0625F;
                     var12 = (double)((float)var2 + var5.nextFloat());
                     double var14 = (double)((float)var3 + var5.nextFloat());
                     double var16 = (double)((float)var4 + var5.nextFloat());
                     var25 = var8;
                     if(var6 != null) {
                        if(var8 == 0) {
                           var12 = (double)((float)var2 - var11);
                        }

                        var25 = var8;
                     }

                     var26 = 1;
                     if(var6 != null) {
                        if(var25 == 1) {
                           var12 = (double)((float)(var2 + 1) + var11);
                        }

                        var25 = var8;
                        var26 = 2;
                     }

                     if(var6 != null) {
                        if(var25 == var26) {
                           var16 = (double)((float)var4 - var11);
                        }

                        var25 = var8;
                        var26 = 3;
                     }

                     label210: {
                        if(var6 != null) {
                           if(var25 != var26) {
                              break label210;
                           }

                           var25 = var4;
                           var26 = 1;
                        }

                        var16 = (double)((float)(var25 + var26) + var11);
                     }

                     double var18 = 0.0D;
                     double var20 = 0.0D;
                     var25 = var8;
                     if(var6 != null) {
                        if(var8 == 0) {
                           var18 = (double)(-var11);
                        }

                        var25 = var8;
                     }

                     var26 = 1;
                     if(var6 != null) {
                        if(var25 == 1) {
                           var18 = (double)var11;
                        }

                        var25 = var8;
                        var26 = 2;
                     }

                     if(var6 != null) {
                        if(var25 == var26) {
                           var20 = (double)(-var11);
                        }

                        var25 = var8;
                        var26 = 3;
                     }

                     if(var25 == var26) {
                        var20 = (double)var11;
                     }

                     var22 = field_2031;
                     var1.method_2087("splash", var12, var14, var16, var18, 0.0D, var20);
                  }

                  ++var7;
                  if(var6 == null) {
                     break;
                  }
               }
            }

            var10000 = this.field_2007;
            var10001 = awt.field_4177;
         }

         double var10002;
         double var10003;
         double var28;
         if(var6 != null) {
            if(var10000 == var10001) {
               label277: {
                  var25 = var5.nextInt(64);
                  if(var6 != null) {
                     if(var25 != 0) {
                        break label277;
                     }

                     var25 = var1.method_33(var2, var3, var4);
                  }

                  var7 = var25;
                  var25 = var7;
                  if(var6 != null) {
                     if(var7 <= 0) {
                        break label277;
                     }

                     var25 = var7;
                  }

                  if(var25 < 8) {
                     var28 = (double)((float)var2 + 0.5F);
                     var10002 = (double)((float)var3 + 0.5F);
                     var10003 = (double)((float)var4 + 0.5F);
                     var22 = field_2031;
                     var1.method_2085(var28, var10002, var10003, "liquid.water", var5.nextFloat() * 0.25F + 0.75F, var5.nextFloat() * 1.0F + 0.5F, false);
                  }
               }
            }

            var10000 = this.field_2007;
            var10001 = awt.field_4178;
         }

         label278: {
            aji var30;
            label279: {
               if(var6 != null) {
                  if(var10000 != var10001) {
                     break label278;
                  }

                  var30 = var1.getBlock(var2, var3 + 1, var4);
                  if(var6 == null) {
                     break label279;
                  }

                  var10000 = var30.method_2424();
                  var10001 = awt.field_4170;
               }

               if(var10000 != var10001) {
                  break label278;
               }

               var30 = var1.getBlock(var2, var3 + 1, var4);
            }

            var25 = var30.method_2453();
            if(var6 == null) {
               break label270;
            }

            if(var25 == 0) {
               var25 = var5.nextInt(100);
               if(var6 != null) {
                  if(var25 == 0) {
                     var23 = (double)((float)var2 + var5.nextFloat());
                     var24 = (double)var3 + this.field_2003;
                     var12 = (double)((float)var4 + var5.nextFloat());
                     var22 = field_2031;
                     var1.method_2087("lava", var23, var24, var12, 0.0D, 0.0D, 0.0D);
                     var1.method_2085(var23, var24, var12, "liquid.lavapop", 0.2F + var5.nextFloat() * 0.2F, 0.9F + var5.nextFloat() * 0.15F, false);
                  }

                  var25 = var5.nextInt(200);
               }

               if(var6 == null) {
                  break label270;
               }

               if(var25 == 0) {
                  var28 = (double)var2;
                  var10002 = (double)var3;
                  var10003 = (double)var4;
                  var22 = field_2031;
                  var1.method_2085(var28, var10002, var10003, "liquid.lava", 0.2F + var5.nextFloat() * 0.2F, 0.9F + var5.nextFloat() * 0.15F, false);
               }
            }
         }

         var25 = var5.nextInt(10);
      }

      if(var6 != null) {
         if(var25 != 0) {
            return;
         }

         var25 = ahb.method_2135(var1, var2, var3 - 1, var4);
      }

      if(var6 != null) {
         if(var25 == 0) {
            return;
         }

         var25 = var1.getBlock(var2, var3 - 2, var4).method_2424().method_5065();
      }

      if(var6 != null) {
         if(var25 != 0) {
            return;
         }

         var25 = var2;
      }

      label155: {
         var23 = (double)((float)var25 + var5.nextFloat());
         var24 = (double)var3 - 1.05D;
         var12 = (double)((float)var4 + var5.nextFloat());
         if(var6 != null) {
            if(this.field_2007 != awt.field_4177) {
               break label155;
            }

            var22 = field_2031;
            var1.method_2087("dripWater", var23, var24, var12, 0.0D, 0.0D, 0.0D);
         }

         if(var6 != null) {
            return;
         }
      }

      String[] var29 = field_2031;
      var1.method_2087("dripLava", var23, var24, var12, 0.0D, 0.0D, 0.0D);
   }

   // $FF: renamed from: b (ahl, int, int, int, awt) double
   public static double method_2556(ahl var0, int var1, int var2, int var3, awt var4) {
      String[] var10000 = class_752.method_4253();
      azw var6 = null;
      String[] var5 = var10000;
      if(var4 == awt.field_4177) {
         var6 = class_1192.field_6033.method_2555(var0, var1, var2, var3);
      }

      if(var4 == awt.field_4178) {
         var6 = class_1192.field_6035.method_2555(var0, var1, var2, var3);
      }

      double var7 = var6.field_4220;
      double var10001 = 0.0D;
      if(var5 != null) {
         label23: {
            if(var6.field_4220 == 0.0D) {
               var7 = var6.field_4222;
               var10001 = 0.0D;
               if(var5 == null) {
                  break label23;
               }

               if(var6.field_4222 == 0.0D) {
                  var7 = -1000.0D;
                  return var7;
               }
            }

            var7 = Math.atan2(var6.field_4222, var6.field_4220);
            var10001 = 1.5707963267948966D;
         }
      }

      var7 -= var10001;
      return var7;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      this.method_2557(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      this.method_2557(var1, var2, var3, var4);
   }

   // $FF: renamed from: i (ahb, int, int, int) void
   private void method_2557(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      if(var1.getBlock(var2, var3, var4) == this && this.field_2007 == awt.field_4178) {
         byte var10000;
         byte var6;
         label94: {
            var6 = 0;
            var10000 = var6;
            if(var5 != null) {
               if(var6 == 0 && var1.getBlock(var2, var3, var4 - 1).method_2424() != awt.field_4177) {
                  break label94;
               }

               var10000 = 1;
            }

            var6 = var10000;
         }

         label87: {
            var10000 = var6;
            if(var5 != null) {
               if(var6 == 0 && var1.getBlock(var2, var3, var4 + 1).method_2424() != awt.field_4177) {
                  break label87;
               }

               var10000 = 1;
            }

            var6 = var10000;
         }

         label80: {
            var10000 = var6;
            if(var5 != null) {
               if(var6 == 0 && var1.getBlock(var2 - 1, var3, var4).method_2424() != awt.field_4177) {
                  break label80;
               }

               var10000 = 1;
            }

            var6 = var10000;
         }

         label73: {
            var10000 = var6;
            if(var5 != null) {
               if(var6 == 0 && var1.getBlock(var2 + 1, var3, var4).method_2424() != awt.field_4177) {
                  break label73;
               }

               var10000 = 1;
            }

            var6 = var10000;
         }

         label66: {
            var10000 = var6;
            if(var5 != null) {
               if(var6 == 0 && var1.getBlock(var2, var3 + 1, var4).method_2424() != awt.field_4177) {
                  break label66;
               }

               var10000 = 1;
            }

            var6 = var10000;
         }

         int var8 = var6;
         if(var5 != null) {
            if(var6 == 0) {
               return;
            }

            var8 = var1.method_33(var2, var3, var4);
         }

         label100: {
            int var7 = var8;
            var8 = var7;
            if(var5 != null) {
               if(var7 == 0) {
                  var1.method_2058(var2, var3, var4, class_1192.field_6076);
                  if(var5 != null) {
                     break label100;
                  }
               }

               var8 = var7;
            }

            if(var5 != null && var8 <= 4) {
               var1.method_2058(var2, var3, var4, class_1192.field_6029);
            }
         }

         this.method_2558(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: n (ahb, int, int, int) void
   protected void method_2558(ahb var1, int var2, int var3, int var4) {
      double var10001 = (double)((float)var2 + 0.5F);
      double var10002 = (double)((float)var3 + 0.5F);
      double var10003 = (double)((float)var4 + 0.5F);
      String[] var7 = field_2031;
      var1.method_2084(var10001, var10002, var10003, "random.fizz", 0.5F, 2.6F + (var1.field_1819.nextFloat() - var1.field_1819.nextFloat()) * 0.8F);
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      String[] var5 = var10000;

      while(var6 < 8) {
         String[] var8 = field_2031;
         var1.method_2087("largesmoke", (double)var2 + Math.random(), (double)var3 + 1.2D, (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
         ++var6;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var2 = class_752.method_4253();
      class_366 var10000 = this;
      IIcon[] var10001;
      String[] var3;
      if(var2 != null) {
         if(this.field_2007 == awt.field_4178) {
            var10001 = new IIcon[2];
            var3 = field_2031;
            var10001[0] = var1.method_375("lava_still");
            var10001[1] = var1.method_375("lava_flow");
            this.field_2029 = var10001;
            if(var2 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10001 = new IIcon[2];
      var3 = field_2031;
      var10001[0] = var1.method_375("water_still");
      var10001[1] = var1.method_375("water_flow");
      var10000.field_2029 = var10001;
   }

   // $FF: renamed from: a (java.lang.String) vL
   public static IIcon method_2559(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      String[] var2 = field_2031;
      String var10001 = "water_still";
      IIcon var3;
      if(var1 != null) {
         if(var0 == "water_still") {
            var3 = class_1192.field_6033.field_2029[0];
            return var3;
         }

         var10000 = var0;
         var2 = field_2031;
         var10001 = "water_flow";
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var3 = class_1192.field_6033.field_2029[1];
            return var3;
         }

         var10000 = var0;
         var2 = field_2031;
         var10001 = "lava_still";
      }

      if(var1 != null) {
         if(var10000 == var10001) {
            var3 = class_1192.field_6035.field_2029[0];
            return var3;
         }

         var10000 = var0;
         String[] var4 = field_2031;
         var10001 = "lava_flow";
      }

      var3 = var10000 == var10001?class_1192.field_6035.field_2029[1]:null;
      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
