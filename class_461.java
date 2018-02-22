import java.util.Random;

// $FF: renamed from: e7
public class class_461 extends aji {

   // $FF: renamed from: M int[]
   private int[] field_2221;
   // $FF: renamed from: N int[]
   private int[] field_2222;
   // $FF: renamed from: O vL[]
   private IIcon[] field_2223;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_2224;


   // $FF: renamed from: <init> () void
   protected void method_2797() {
      super.method_2427(awt.field_4184);
      this.field_2221 = new int[256];
      this.field_2222 = new int[256];
      this.method_2440(true);
   }

   // $FF: renamed from: i () void
   public static void method_2798() {
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6030), 5, 20);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6149), 5, 20);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6150), 5, 20);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6111), 5, 20);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6080), 5, 20);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6159), 5, 20);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6158), 5, 20);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6160), 5, 20);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6042), 5, 5);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6043), 5, 5);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6044), 30, 60);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6045), 30, 60);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6074), 30, 20);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6073), 15, 100);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6058), 60, 100);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6191), 60, 100);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6064), 60, 100);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6065), 60, 100);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6062), 30, 60);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6131), 15, 100);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6187), 5, 5);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6184), 60, 20);
      class_1192.field_6078.method_2799(method_2415(class_1192.field_6185), 60, 20);
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_2799(int var1, int var2, int var3) {
      this.field_2221[var1] = var2;
      this.field_2222[var1] = var3;
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 3;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 30;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      ahb var10000 = var1;
      if(var6 != null) {
         class_1038 var18 = var1.method_2196();
         String[] var10001 = field_2224;
         if(!var18.method_5878("doFireTick")) {
            return;
         }

         var10000 = var1;
      }

      int var7 = var10000.getBlock(var2, var3 - 1, var4) == class_1192.field_6113?1:0;
      int var19 = var1.field_1820 instanceof class_1090;
      if(var6 != null) {
         if(var19 != 0 && var1.getBlock(var2, var3 - 1, var4) == class_1192.field_6032) {
            var7 = 1;
         }

         var19 = this.method_2480(var1, var2, var3, var4);
      }

      if(var6 != null) {
         if(var19 == 0) {
            var1.method_2056(var2, var3, var4);
         }

         var19 = var7;
      }

      if(var6 != null) {
         label300: {
            if(var19 == 0) {
               var19 = var1.method_2203();
               if(var6 == null) {
                  break label300;
               }

               if(var19 != 0) {
                  label296: {
                     boolean var21 = var1.method_2204(var2, var3, var4);
                     if(var6 != null) {
                        if(!var21) {
                           var21 = var1.method_2204(var2 - 1, var3, var4);
                           if(var6 == null) {
                              return;
                           }

                           if(!var21) {
                              var21 = var1.method_2204(var2 + 1, var3, var4);
                              if(var6 == null) {
                                 return;
                              }

                              if(!var21) {
                                 var21 = var1.method_2204(var2, var3, var4 - 1);
                                 if(var6 == null) {
                                    return;
                                 }

                                 if(!var21) {
                                    var19 = var1.method_2204(var2, var3, var4 + 1);
                                    if(var6 == null) {
                                       break label300;
                                    }

                                    if(var19 == 0) {
                                       break label296;
                                    }
                                 }
                              }
                           }
                        }

                        var1.method_2056(var2, var3, var4);
                     }

                     return;
                  }
               }
            }

            var19 = var1.method_33(var2, var3, var4);
         }
      }

      int var8 = var19;
      var19 = var8;
      if(var6 != null) {
         if(var8 < 15) {
            var1.method_2055(var2, var3, var4, var8 + var5.nextInt(3) / 2, 4);
         }

         var1.method_2110(var2, var3, var4, this, this.method_2460(var1) + var5.nextInt(10));
         var19 = var7;
      }

      if(var6 != null) {
         label272: {
            if(var19 == 0) {
               var19 = this.method_2801(var1, var2, var3, var4);
               if(var6 == null) {
                  break label272;
               }

               if(var19 == 0) {
                  if(var6 != null && (!ahb.method_2135(var1, var2, var3 - 1, var4) || var6 != null && var8 > 3)) {
                     var1.method_2056(var2, var3, var4);
                  }

                  return;
               }
            }

            var19 = var7;
         }
      }

      if(var6 != null) {
         label265: {
            if(var19 == 0) {
               var19 = this.method_2803(var1, var2, var3 - 1, var4);
               if(var6 == null) {
                  break label265;
               }

               if(var19 == 0) {
                  var19 = var8;
                  if(var6 == null) {
                     break label265;
                  }

                  if(var8 == 15) {
                     var19 = var5.nextInt(4);
                     if(var6 == null) {
                        break label265;
                     }

                     if(var19 == 0) {
                        var1.method_2056(var2, var3, var4);
                        return;
                     }
                  }
               }
            }

            var19 = var1.method_2205(var2, var3, var4);
         }
      }

      int var9 = var19;
      byte var10 = 0;
      var19 = var9;
      if(var6 != null) {
         if(var9 != 0) {
            var10 = -50;
         }

         this.method_2800(var1, var2 + 1, var3, var4, 300 + var10, var5, var8);
         this.method_2800(var1, var2 - 1, var3, var4, 300 + var10, var5, var8);
         this.method_2800(var1, var2, var3 - 1, var4, 250 + var10, var5, var8);
         this.method_2800(var1, var2, var3 + 1, var4, 250 + var10, var5, var8);
         this.method_2800(var1, var2, var3, var4 - 1, 300 + var10, var5, var8);
         this.method_2800(var1, var2, var3, var4 + 1, 300 + var10, var5, var8);
         var19 = var2 - 1;
      }

      int var11 = var19;

      do {
         var19 = var11;

         label249:
         while(true) {
            if(var19 > var2 + 1) {
               return;
            }

            int var12 = var4 - 1;

            while(true) {
               var19 = var12;
               int var20 = var4 + 1;

               label245:
               while(true) {
                  if(var19 > var20) {
                     break label249;
                  }

                  var19 = var3 - 1;
                  if(var6 == null) {
                     continue label249;
                  }

                  int var13 = var19;

                  while(var13 <= var3 + 4) {
                     label239: {
                        label314: {
                           var19 = var11;
                           if(var6 != null) {
                              label315: {
                                 var20 = var2;
                                 if(var6 == null) {
                                    continue label245;
                                 }

                                 if(var11 == var2) {
                                    var19 = var13;
                                    if(var6 == null) {
                                       break label315;
                                    }

                                    if(var13 == var3) {
                                       var19 = var12;
                                       if(var6 == null) {
                                          break label315;
                                       }

                                       if(var12 == var4) {
                                          break label314;
                                       }
                                    }
                                 }

                                 var19 = 100;
                              }
                           }

                           int var14 = var19;
                           var19 = var13;
                           if(var6 != null) {
                              if(var13 > var3 + 1) {
                                 var14 += (var13 - (var3 + 1)) * 100;
                              }

                              var19 = this.method_2802(var1, var11, var13, var12);
                           }

                           int var15 = var19;
                           if(var6 == null) {
                              break label239;
                           }

                           if(var15 > 0) {
                              label316: {
                                 int var16 = (var15 + 40 + var1.field_1818.method_5392() * 7) / (var8 + 30);
                                 var19 = var9;
                                 if(var6 != null) {
                                    if(var9 != 0) {
                                       var16 /= 2;
                                    }

                                    var19 = var16;
                                 }

                                 if(var6 != null) {
                                    if(var19 <= 0) {
                                       break label316;
                                    }

                                    var19 = var5.nextInt(var14);
                                 }

                                 if(var6 != null) {
                                    if(var19 > var16) {
                                       break label316;
                                    }

                                    var19 = var1.method_2203();
                                 }

                                 if(var6 != null) {
                                    label207: {
                                       if(var19 != 0) {
                                          var19 = var1.method_2204(var11, var13, var12);
                                          if(var6 == null) {
                                             break label207;
                                          }

                                          if(var19 != 0) {
                                             break label316;
                                          }
                                       }

                                       var19 = var1.method_2204(var11 - 1, var13, var4);
                                    }
                                 }

                                 if(var6 != null) {
                                    if(var19 != 0) {
                                       break label316;
                                    }

                                    var19 = var1.method_2204(var11 + 1, var13, var12);
                                 }

                                 if(var6 != null) {
                                    if(var19 != 0) {
                                       break label316;
                                    }

                                    var19 = var1.method_2204(var11, var13, var12 - 1);
                                 }

                                 if(var6 != null) {
                                    if(var19 != 0) {
                                       break label316;
                                    }

                                    var19 = var1.method_2204(var11, var13, var12 + 1);
                                 }

                                 if(var6 != null) {
                                    if(var19 != 0) {
                                       break label316;
                                    }

                                    var19 = var8 + var5.nextInt(5) / 4;
                                 }

                                 int var17 = var19;
                                 if(var6 != null) {
                                    if(var17 > 15) {
                                       var17 = 15;
                                    }

                                    var1.method_2054(var11, var13, var12, this, var17, 3);
                                 }
                              }
                           }
                        }

                        ++var13;
                     }

                     if(var6 == null) {
                        break;
                     }
                  }

                  ++var12;
                  if(var6 == null) {
                     break label249;
                  }
                  break;
               }
            }
         }

         ++var11;
      } while(var6 != null);

   }

   // $FF: renamed from: L () boolean
   public boolean method_2526() {
      return false;
   }

   // $FF: renamed from: b (ahb, int, int, int, int, java.util.Random, int) void
   private void method_2800(ahb var1, int var2, int var3, int var4, int var5, Random var6, int var7) {
      String[] var10000 = class_752.method_4253();
      int var9 = this.field_2222[aji.method_2415(var1.getBlock(var2, var3, var4))];
      String[] var8 = var10000;
      if(var6.nextInt(var5) < var9) {
         boolean var10 = var1.getBlock(var2, var3, var4) == class_1192.field_6073;
         int var12 = var6.nextInt(var7 + 10);
         if(var8 != null) {
            label35: {
               if(var12 < 5) {
                  boolean var13 = var1.method_2204(var2, var3, var4);
                  if(var8 == null) {
                     break label35;
                  }

                  if(!var13) {
                     int var11 = var7 + var6.nextInt(5) / 4;
                     if(var8 != null) {
                        if(var11 > 15) {
                           var11 = 15;
                        }

                        var1.method_2054(var2, var3, var4, this, var11, 3);
                     }

                     if(var8 != null) {
                        break label35;
                     }
                  }
               }

               var1.method_2056(var2, var3, var4);
            }
         }

         if(var10) {
            class_1192.field_6073.method_2458(var1, var2, var3, var4, 1);
         }
      }

   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   private boolean method_2801(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = this.method_2803(var1, var2 + 1, var3, var4);
      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = this.method_2803(var1, var2 - 1, var3, var4);
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = this.method_2803(var1, var2, var3 - 1, var4);
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = this.method_2803(var1, var2, var3 + 1, var4);
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = this.method_2803(var1, var2, var3, var4 - 1);
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = this.method_2803(var1, var2, var3, var4 + 1);
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: i (ahb, int, int, int) int
   private int method_2802(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      byte var6 = 0;
      String[] var5 = var10000;
      int var7 = var1.method_34(var2, var3, var4);
      if(var5 != null) {
         if(var7 == 0) {
            return 0;
         }

         int var8 = this.method_2804(var1, var2 + 1, var3, var4, var6);
         var8 = this.method_2804(var1, var2 - 1, var3, var4, var8);
         var8 = this.method_2804(var1, var2, var3 - 1, var4, var8);
         var8 = this.method_2804(var1, var2, var3 + 1, var4, var8);
         var8 = this.method_2804(var1, var2, var3, var4 - 1, var8);
         var8 = this.method_2804(var1, var2, var3, var4 + 1, var8);
         var7 = var8;
      }

      return var7;
   }

   // $FF: renamed from: v () boolean
   public boolean method_2455() {
      return false;
   }

   // $FF: renamed from: f (ahl, int, int, int) boolean
   public boolean method_2803(ahl var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = this.field_2221[aji.method_2415(var1.getBlock(var2, var3, var4))];
      if(var5 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int, int) int
   public int method_2804(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = this.field_2221[aji.method_2415(var1.getBlock(var2, var3, var4))];
      String[] var6 = var10000;
      int var8 = var7;
      if(var6 != null) {
         if(var7 > var5) {
            return var7;
         }

         var8 = var5;
      }

      return var8;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var5 != null) {
         if(!var10000) {
            var10000 = this.method_2801(var1, var2, var3, var4);
            if(var5 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      boolean var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var6 != null) {
         if(var10000) {
            return;
         }

         var10000 = this.method_2801(var1, var2, var3, var4);
      }

      if(var6 != null && !var10000) {
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      int var10001;
      int var10002;
      int var10003;
      ahb var6;
      label37: {
         String[] var5 = class_752.method_4253();
         int var10000 = var1.field_1820.field_5738;
         if(var5 != null) {
            label38: {
               if(var1.field_1820.field_5738 <= 0) {
                  var10000 = class_1192.field_6116.method_2579(var1, var2, var3, var4);
                  if(var5 == null) {
                     break label38;
                  }

                  if(var10000 != 0) {
                     return;
                  }
               }

               var6 = var1;
               var10001 = var2;
               var10002 = var3 - 1;
               var10003 = var4;
               if(var5 == null) {
                  break label37;
               }

               var10000 = ahb.method_2135(var1, var2, var10002, var4);
            }
         }

         if(var10000 == 0) {
            label23: {
               boolean var7 = this.method_2801(var1, var2, var3, var4);
               if(var5 != null) {
                  if(var7) {
                     break label23;
                  }

                  var1.method_2056(var2, var3, var4);
               }

               return;
            }
         }

         var6 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      var6.method_2110(var10001, var10002, var10003, this, this.method_2460(var1) + var1.field_1819.nextInt(10));
   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5.nextInt(24);
      String[] var11;
      if(var6 != null) {
         if(var10000 == 0) {
            double var10001 = (double)((float)var2 + 0.5F);
            double var10002 = (double)((float)var3 + 0.5F);
            double var10003 = (double)((float)var4 + 0.5F);
            var11 = field_2224;
            var1.method_2085(var10001, var10002, var10003, "fire.fire", 1.0F + var5.nextFloat(), var5.nextFloat() * 0.7F + 0.3F, false);
         }

         var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      }

      int var7;
      float var8;
      float var9;
      float var10;
      byte var12;
      label146: {
         label152: {
            if(var6 != null) {
               if(var10000 == 0) {
                  var12 = class_1192.field_6078.method_2803(var1, var2, var3 - 1, var4);
                  if(var6 == null) {
                     break label146;
                  }

                  if(var12 == 0) {
                     break label152;
                  }
               }

               var10000 = 0;
            }

            var7 = var10000;

            while(var7 < 3) {
               var8 = (float)var2 + var5.nextFloat();
               var9 = (float)var3 + var5.nextFloat() * 0.5F + 0.5F;
               var10 = (float)var4 + var5.nextFloat();
               var11 = field_2224;
               var1.method_2087("largesmoke", (double)var8, (double)var9, (double)var10, 0.0D, 0.0D, 0.0D);
               ++var7;
               if(var6 == null) {
                  return;
               }

               if(var6 == null) {
                  break;
               }
            }

            if(var6 != null) {
               return;
            }
         }

         var12 = class_1192.field_6078.method_2803(var1, var2 - 1, var3, var4);
      }

      label124: {
         label154: {
            label122: {
               label155: {
                  label120: {
                     label156: {
                        if(var6 != null) {
                           if(var12 != 0) {
                              var7 = 0;

                              while(var7 < 2) {
                                 var8 = (float)var2 + var5.nextFloat() * 0.1F;
                                 var9 = (float)var3 + var5.nextFloat();
                                 var10 = (float)var4 + var5.nextFloat();
                                 var11 = field_2224;
                                 var1.method_2087("largesmoke", (double)var8, (double)var9, (double)var10, 0.0D, 0.0D, 0.0D);
                                 ++var7;
                                 if(var6 == null) {
                                    break label156;
                                 }

                                 if(var6 == null) {
                                    break;
                                 }
                              }
                           }

                           var12 = class_1192.field_6078.method_2803(var1, var2 + 1, var3, var4);
                        }

                        if(var6 == null) {
                           break label120;
                        }

                        if(var12 != 0) {
                           var7 = 0;

                           while(var7 < 2) {
                              var8 = (float)(var2 + 1) - var5.nextFloat() * 0.1F;
                              var9 = (float)var3 + var5.nextFloat();
                              var10 = (float)var4 + var5.nextFloat();
                              var11 = field_2224;
                              var1.method_2087("largesmoke", (double)var8, (double)var9, (double)var10, 0.0D, 0.0D, 0.0D);
                              ++var7;
                              if(var6 == null) {
                                 break label155;
                              }

                              if(var6 == null) {
                                 break;
                              }
                           }
                        }
                     }

                     var12 = class_1192.field_6078.method_2803(var1, var2, var3, var4 - 1);
                  }

                  if(var6 == null) {
                     break label122;
                  }

                  if(var12 != 0) {
                     var7 = 0;

                     while(var7 < 2) {
                        var8 = (float)var2 + var5.nextFloat();
                        var9 = (float)var3 + var5.nextFloat();
                        var10 = (float)var4 + var5.nextFloat() * 0.1F;
                        var11 = field_2224;
                        var1.method_2087("largesmoke", (double)var8, (double)var9, (double)var10, 0.0D, 0.0D, 0.0D);
                        ++var7;
                        if(var6 == null) {
                           break label154;
                        }

                        if(var6 == null) {
                           break;
                        }
                     }
                  }
               }

               var12 = class_1192.field_6078.method_2803(var1, var2, var3, var4 + 1);
            }

            if(var6 == null) {
               break label124;
            }

            if(var12 != 0) {
               var7 = 0;

               while(var7 < 2) {
                  var8 = (float)var2 + var5.nextFloat();
                  var9 = (float)var3 + var5.nextFloat();
                  var10 = (float)(var4 + 1) - var5.nextFloat() * 0.1F;
                  var11 = field_2224;
                  var1.method_2087("largesmoke", (double)var8, (double)var9, (double)var10, 0.0D, 0.0D, 0.0D);
                  ++var7;
                  if(var6 == null) {
                     return;
                  }

                  if(var6 == null) {
                     break;
                  }
               }
            }
         }

         var12 = class_1192.field_6078.method_2803(var1, var2, var3 + 1, var4);
      }

      if(var6 != null) {
         if(var12 == 0) {
            return;
         }

         var12 = 0;
      }

      var7 = var12;

      while(var7 < 2) {
         var8 = (float)var2 + var5.nextFloat();
         var9 = (float)(var3 + 1) - var5.nextFloat() * 0.1F;
         var10 = (float)var4 + var5.nextFloat();
         String[] var13 = field_2224;
         var1.method_2087("largesmoke", (double)var8, (double)var9, (double)var10, 0.0D, 0.0D, 0.0D);
         ++var7;
         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      IIcon[] var10001 = new IIcon[2];
      StringBuilder var10005 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2224;
      var10001[0] = var1.method_375(var10005.append("_layer_0").toString());
      var10001[1] = var1.method_375(this.method_2533() + "_layer_1");
      this.field_2223 = var10001;
   }

   // $FF: renamed from: b (int) vL
   public IIcon method_2805(int var1) {
      return this.field_2223[var1];
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      return this.field_2223[0];
   }

   // $FF: renamed from: f (int) jj
   public class_1319 method_2425(int var1) {
      return class_1319.field_6751;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
