import java.util.Random;

// $FF: renamed from: f2
public class class_426 extends aji {

   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2152;


   // $FF: renamed from: <init> () void
   public void method_2702() {
      super.method_2427(awt.field_4186);
      this.method_2521(class_872.field_4246);
      this.method_2440(true);
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
      return 29;
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 10;
   }

   // $FF: renamed from: d (ahb, int, int, int, int) boolean
   public boolean method_2479(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      byte var10001 = 2;
      if(var6 != null) {
         label65: {
            if(var5 == 2) {
               var10000 = var1.getBlock(var2, var3, var4 + 1).method_2433();
               if(var6 == null) {
                  break label65;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var5;
         }

         var10001 = 3;
      }

      if(var6 != null) {
         label57: {
            if(var10000 == var10001) {
               var10000 = var1.getBlock(var2, var3, var4 - 1).method_2433();
               if(var6 == null) {
                  break label57;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var5;
         }

         var10001 = 4;
      }

      if(var6 != null) {
         label45: {
            if(var10000 == var10001) {
               var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
               if(var6 == null) {
                  break label45;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var5;
         }

         if(var6 == null) {
            return (boolean)var10000;
         }

         var10001 = 5;
      }

      if(var10000 == var10001) {
         var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
         if(var6 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            return true;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = var1.getBlock(var2, var3, var4 - 1).method_2433();
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = var1.getBlock(var2, var3, var4 + 1).method_2433();
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      String[] var10000 = class_752.method_4253();
      byte var11 = 0;
      String[] var10 = var10000;
      int var12 = var5;
      byte var10001 = 2;
      if(var10 != null) {
         label65: {
            if(var5 == 2) {
               var12 = var1.method_2136(var2, var3, var4 + 1, true);
               if(var10 == null) {
                  break label65;
               }

               if(var12 != 0) {
                  var11 = 2;
               }
            }

            var12 = var5;
         }

         var10001 = 3;
      }

      if(var10 != null) {
         label57: {
            if(var12 == var10001) {
               var12 = var1.method_2136(var2, var3, var4 - 1, true);
               if(var10 == null) {
                  break label57;
               }

               if(var12 != 0) {
                  var11 = 0;
               }
            }

            var12 = var5;
         }

         var10001 = 4;
      }

      if(var10 != null) {
         label45: {
            if(var12 == var10001) {
               var12 = var1.method_2136(var2 + 1, var3, var4, true);
               if(var10 == null) {
                  break label45;
               }

               if(var12 != 0) {
                  var11 = 1;
               }
            }

            var12 = var5;
         }

         if(var10 == null) {
            return var12;
         }

         var10001 = 5;
      }

      if(var12 == var10001) {
         var12 = var1.method_2136(var2 - 1, var3, var4, true);
         if(var10 == null) {
            return var12;
         }

         if(var12 != 0) {
            var11 = 3;
         }
      }

      var12 = var11;
      return var12;
   }

   // $FF: renamed from: e (ahb, int, int, int, int) void
   public void method_2507(ahb var1, int var2, int var3, int var4, int var5) {
      this.method_2703(var1, var2, var3, var4, false, var5, false, -1, 0);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      if(var5 != this) {
         int var10000 = this.method_2706(var1, var2, var3, var4);
         if(var6 != null) {
            if(var10000 == 0) {
               return;
            }

            var10000 = var1.method_33(var2, var3, var4);
         }

         int var7 = var10000;
         int var8 = var7 & 3;
         byte var9 = 0;
         var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
         if(var6 != null) {
            label73: {
               if(var10000 == 0) {
                  var10000 = var8;
                  if(var6 == null) {
                     break label73;
                  }

                  if(var8 == 3) {
                     var9 = 1;
                  }
               }

               var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
            }
         }

         if(var6 != null) {
            label66: {
               if(var10000 == 0) {
                  var10000 = var8;
                  if(var6 == null) {
                     break label66;
                  }

                  if(var8 == 1) {
                     var9 = 1;
                  }
               }

               var10000 = var1.getBlock(var2, var3, var4 - 1).method_2433();
            }
         }

         if(var6 != null) {
            label59: {
               if(var10000 == 0) {
                  var10000 = var8;
                  if(var6 == null) {
                     break label59;
                  }

                  if(var8 == 0) {
                     var9 = 1;
                  }
               }

               var10000 = var1.getBlock(var2, var3, var4 + 1).method_2433();
            }
         }

         if(var6 != null) {
            label52: {
               if(var10000 == 0) {
                  var10000 = var8;
                  if(var6 == null) {
                     break label52;
                  }

                  if(var8 == 2) {
                     var9 = 1;
                  }
               }

               var10000 = var9;
            }
         }

         if(var6 != null && var10000 != 0) {
            this.method_2466(var1, var2, var3, var4, var7, 0);
            var1.method_2056(var2, var3, var4);
         }

      }
   }

   // $FF: renamed from: b (ahb, int, int, int, boolean, int, boolean, int, int) void
   public void method_2703(ahb var1, int var2, int var3, int var4, boolean var5, int var6, boolean var7, int var8, int var9) {
      String[] var10000 = class_752.method_4253();
      int var11 = var6 & 3;
      String[] var10 = var10000;
      int var29 = var6 & 4;
      if(var10 != null) {
         var29 = var29 == 4?1:0;
      }

      int var12 = var29;
      var29 = var6 & 8;
      if(var10 != null) {
         var29 = var29 == 8?1:0;
      }

      int var13 = var29;
      var29 = var5;
      if(var10 != null) {
         var29 = var5 == 0?1:0;
      }

      int var14 = var29;
      int var15 = 0;
      var29 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var10 != null) {
         var29 = var29 == 0?1:0;
      }

      int var16 = var29;
      int var17 = class_1649.field_8587[var11];
      int var18 = class_1649.field_8588[var11];
      int var19 = 0;
      int[] var20 = new int[42];
      int var21 = 1;

      int var22;
      int var23;
      int var25;
      int var30;
      label249: {
         while(true) {
            if(var21 < 42) {
               label250: {
                  var22 = var2 + var17 * var21;
                  var23 = var4 + var18 * var21;
                  aji var24 = var1.getBlock(var22, var3, var23);
                  if(var10 == null) {
                     break label249;
                  }

                  aji var31 = var24;
                  Object var10001 = class_1192.field_6155;
                  if(var10 != null) {
                     if(var24 == class_1192.field_6155) {
                        var25 = var1.method_33(var22, var3, var23);
                        var29 = var25 & 3;
                        var30 = class_1649.field_8592[var11];
                        if(var10 == null) {
                           break;
                        }

                        if(var29 != var30) {
                           break label250;
                        }

                        var19 = var21;
                        if(var10 != null) {
                           break label250;
                        }
                     }

                     var31 = var24;
                     var10001 = class_1192.field_6156;
                  }

                  label228: {
                     label227: {
                        label279: {
                           if(var31 != var10001) {
                              var29 = var21;
                              if(var10 == null) {
                                 break label227;
                              }

                              if(var21 != var8) {
                                 break label279;
                              }
                           }

                           var29 = var21;
                           if(var10 != null) {
                              var29 = var21 == var8?var9:var1.method_33(var22, var3, var23);
                           }

                           var25 = var29;
                           var29 = var25 & 8;
                           if(var10 != null) {
                              var29 = var29 != 8?1:0;
                           }

                           int var26 = var29;
                           var29 = var25 & 1;
                           if(var10 != null) {
                              var29 = var29 == 1?1:0;
                           }

                           int var27 = var29;
                           var29 = var25 & 2;
                           if(var10 != null) {
                              var29 = var29 == 2?1:0;
                           }

                           int var28 = var29;
                           var30 = var28;
                           if(var10 != null) {
                              var30 = var28 == var16?1:0;
                           }

                           label204: {
                              label253: {
                                 var14 &= var30;
                                 var30 = var26;
                                 if(var10 != null) {
                                    if(var26 == 0) {
                                       break label253;
                                    }

                                    var30 = var27;
                                 }

                                 if(var10 == null) {
                                    break label204;
                                 }

                                 if(var30 != 0) {
                                    var30 = 1;
                                    break label204;
                                 }
                              }

                              var30 = 0;
                           }

                           label194: {
                              var15 |= var30;
                              var20[var21] = var25;
                              var29 = var21;
                              var30 = var8;
                              if(var10 != null) {
                                 if(var21 != var8) {
                                    break label194;
                                 }

                                 var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
                                 var29 = var14;
                                 var30 = var26;
                              }

                              var14 = var29 & var30;
                           }

                           if(var10 != null) {
                              break label228;
                           }
                        }

                        var20[var21] = -1;
                        var29 = 0;
                     }

                     var14 = var29;
                  }

                  ++var21;
                  if(var10 != null) {
                     continue;
                  }
               }
            }

            var29 = var14;
            var30 = var19;
            break;
         }

         if(var10 != null) {
            var30 = var30 > 1?1:0;
         }

         var14 = var29 & var30;
         var15 &= var14;
      }

      var29 = var14;
      if(var10 != null) {
         var29 = var14 != 0?4:0;
      }

      var30 = var15;
      if(var10 != null) {
         var30 = var15 != 0?8:0;
      }

      var21 = var29 | var30;
      var6 = var11 | var21;
      var29 = var19;
      int var32;
      if(var10 != null) {
         if(var19 > 0) {
            var22 = var2 + var17 * var19;
            var23 = var4 + var18 * var19;
            var32 = class_1649.field_8592[var11];
            var1.method_2055(var22, var3, var23, var32 | var21, 3);
            this.method_2705(var1, var22, var3, var23, var32);
            this.method_2704(var1, var22, var3, var23, (boolean)var14, (boolean)var15, (boolean)var12, (boolean)var13);
         }

         this.method_2704(var1, var2, var3, var4, (boolean)var14, (boolean)var15, (boolean)var12, (boolean)var13);
         var29 = var5;
      }

      if(var10 != null) {
         label180: {
            if(var29 == 0) {
               var1.method_2055(var2, var3, var4, var6, 3);
               var29 = var7;
               if(var10 == null) {
                  break label180;
               }

               if(var7 != 0) {
                  this.method_2705(var1, var2, var3, var4, var11);
               }
            }

            var29 = var12;
         }
      }

      if(var10 != null) {
         if(var29 == var14) {
            return;
         }

         var29 = 1;
      }

      var22 = var29;

      while(var22 < var19) {
         label256: {
            var23 = var2 + var17 * var22;
            var32 = var4 + var18 * var22;
            var25 = var20[var22];
            var29 = var25;
            if(var10 != null) {
               if(var25 < 0) {
                  break label256;
               }

               var29 = var14;
            }

            label159: {
               if(var10 != null) {
                  if(var29 != 0) {
                     var25 |= 4;
                     if(var10 != null) {
                        break label159;
                     }
                  }

                  var29 = var25 & -5;
               }

               var25 = var29;
            }

            var1.method_2055(var23, var3, var32, var25, 3);
         }

         ++var22;
         if(var10 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      this.method_2703(var1, var2, var3, var4, false, var1.method_33(var2, var3, var4), true, -1, 0);
   }

   // $FF: renamed from: b (ahb, int, int, int, boolean, boolean, boolean, boolean) void
   private void method_2704(ahb var1, int var2, int var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      String[] var9 = class_752.method_4253();
      boolean var10000 = var6;
      String[] var10;
      double var10001;
      double var10002;
      double var10003;
      if(var9 != null) {
         label61: {
            if(var6) {
               var10000 = var8;
               if(var9 == null) {
                  break label61;
               }

               if(!var8) {
                  var10001 = (double)var2 + 0.5D;
                  var10002 = (double)var3 + 0.1D;
                  var10003 = (double)var4 + 0.5D;
                  var10 = field_2152;
                  var1.method_2084(var10001, var10002, var10003, "random.click", 0.4F, 0.6F);
                  if(var9 != null) {
                     return;
                  }
               }
            }

            var10000 = var6;
         }
      }

      if(var9 != null) {
         label51: {
            if(!var10000) {
               var10000 = var8;
               if(var9 == null) {
                  break label51;
               }

               if(var8) {
                  var10001 = (double)var2 + 0.5D;
                  var10002 = (double)var3 + 0.1D;
                  var10003 = (double)var4 + 0.5D;
                  var10 = field_2152;
                  var1.method_2084(var10001, var10002, var10003, "random.click", 0.4F, 0.5F);
                  if(var9 != null) {
                     return;
                  }
               }
            }

            var10000 = var5;
         }
      }

      if(var9 != null) {
         label41: {
            if(var10000) {
               var10000 = var7;
               if(var9 == null) {
                  break label41;
               }

               if(!var7) {
                  var10001 = (double)var2 + 0.5D;
                  var10002 = (double)var3 + 0.1D;
                  var10003 = (double)var4 + 0.5D;
                  var10 = field_2152;
                  var1.method_2084(var10001, var10002, var10003, "random.click", 0.4F, 0.7F);
                  if(var9 != null) {
                     return;
                  }
               }
            }

            var10000 = var5;
         }
      }

      if(var9 != null) {
         if(var10000) {
            return;
         }

         var10000 = var7;
      }

      if(var10000) {
         var10001 = (double)var2 + 0.5D;
         var10002 = (double)var3 + 0.1D;
         var10003 = (double)var4 + 0.5D;
         String[] var10004 = field_2152;
         var1.method_2084(var10001, var10002, var10003, "random.bowhit", 0.4F, 1.2F / (var1.field_1819.nextFloat() * 0.2F + 0.9F));
      }

   }

   // $FF: renamed from: h (ahb, int, int, int, int) void
   private void method_2705(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6;
      int var7;
      label41: {
         String[] var10000 = class_752.method_4253();
         var1.method_2063(var2, var3, var4, this);
         var6 = var10000;
         var7 = var5;
         byte var10001 = 3;
         if(var6 != null) {
            if(var5 == 3) {
               var1.method_2063(var2 - 1, var3, var4, this);
               if(var6 != null) {
                  return;
               }
            }

            var7 = var5;
            if(var6 == null) {
               break label41;
            }

            var10001 = 1;
         }

         if(var7 == var10001) {
            var1.method_2063(var2 + 1, var3, var4, this);
            if(var6 != null) {
               return;
            }
         }

         var7 = var5;
      }

      if(var6 != null) {
         if(var7 == 0) {
            var1.method_2063(var2, var3, var4 - 1, this);
            if(var6 != null) {
               return;
            }
         }

         var7 = var5;
      }

      if(var7 == 2) {
         var1.method_2063(var2, var3, var4 + 1, this);
      }

   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   private boolean method_2706(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = this.method_2480(var1, var2, var3, var4);
      if(var5 != null) {
         if(!var10000) {
            this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
            var1.method_2056(var2, var3, var4);
            return false;
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      String[] var5;
      int var6;
      float var7;
      int var8;
      label41: {
         String[] var10000 = class_752.method_4253();
         var6 = var1.method_33(var2, var3, var4) & 3;
         var5 = var10000;
         var7 = 0.1875F;
         var8 = var6;
         byte var10001 = 3;
         if(var5 != null) {
            if(var6 == 3) {
               this.method_2443(0.0F, 0.2F, 0.5F - var7, var7 * 2.0F, 0.8F, 0.5F + var7);
               if(var5 != null) {
                  return;
               }
            }

            var8 = var6;
            if(var5 == null) {
               break label41;
            }

            var10001 = 1;
         }

         if(var8 == var10001) {
            this.method_2443(1.0F - var7 * 2.0F, 0.2F, 0.5F - var7, 1.0F, 0.8F, 0.5F + var7);
            if(var5 != null) {
               return;
            }
         }

         var8 = var6;
      }

      if(var5 != null) {
         if(var8 == 0) {
            this.method_2443(0.5F - var7, 0.2F, 0.0F, 0.5F + var7, 0.8F, var7 * 2.0F);
            if(var5 != null) {
               return;
            }
         }

         var8 = var6;
      }

      if(var8 == 2) {
         this.method_2443(0.5F - var7, 0.2F, 1.0F - var7 * 2.0F, 0.5F + var7, 0.8F, 1.0F);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = var6 & 4;
      if(var7 != null) {
         var10000 = var10000 == 4?1:0;
      }

      int var8 = var10000;
      var10000 = var6 & 8;
      if(var7 != null) {
         var10000 = var10000 == 8?1:0;
      }

      label79: {
         int var9;
         label78: {
            label85: {
               var9 = var10000;
               var10000 = var8;
               if(var7 != null) {
                  if(var8 != 0) {
                     break label85;
                  }

                  var10000 = var9;
               }

               if(var7 == null) {
                  break label79;
               }

               if(var10000 == 0) {
                  break label78;
               }
            }

            this.method_2703(var1, var2, var3, var4, true, var6, false, -1, 0);
         }

         var10000 = var9;
      }

      label86: {
         if(var7 != null) {
            if(var10000 == 0) {
               break label86;
            }

            var1.method_2063(var2, var3, var4, this);
            var10000 = var6 & 3;
         }

         int var10;
         label87: {
            var10 = var10000;
            var10000 = var10;
            byte var10001 = 3;
            if(var7 != null) {
               if(var10 == 3) {
                  var1.method_2063(var2 - 1, var3, var4, this);
                  if(var7 != null) {
                     break label86;
                  }
               }

               var10000 = var10;
               if(var7 == null) {
                  break label87;
               }

               var10001 = 1;
            }

            if(var10000 == var10001) {
               var1.method_2063(var2 + 1, var3, var4, this);
               if(var7 != null) {
                  break label86;
               }
            }

            var10000 = var10;
         }

         if(var7 != null) {
            if(var10000 == 0) {
               var1.method_2063(var2, var3, var4 - 1, this);
               if(var7 != null) {
                  break label86;
               }
            }

            var10000 = var10;
         }

         if(var10000 == 2) {
            var1.method_2063(var2, var3, var4 + 1, this);
         }
      }

      super.method_2462(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.method_33(var2, var3, var4) & 8;
      if(var6 != null) {
         var10000 = var10000 == 8?15:0;
      }

      return var10000;
   }

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = var10000;
      int var9 = var7 & 8;
      byte var10001 = 8;
      if(var6 != null) {
         if(var9 != 8) {
            return 0;
         }

         var9 = var7;
         var10001 = 3;
      }

      int var8 = var9 & var10001;
      var9 = var8;
      if(var6 != null) {
         label69: {
            if(var8 == 2) {
               var9 = var5;
               if(var6 == null) {
                  break label69;
               }

               if(var5 == 2) {
                  return 15;
               }
            }

            var9 = var8;
         }
      }

      label63: {
         if(var6 != null) {
            if(var9 == 0) {
               var9 = var5;
               var10001 = 3;
               if(var6 == null) {
                  break label63;
               }

               if(var5 == 3) {
                  return 15;
               }
            }

            var9 = var8;
         }

         var10001 = 1;
      }

      if(var6 != null) {
         label75: {
            if(var9 == var10001) {
               var9 = var5;
               var10001 = 4;
               if(var6 == null) {
                  break label75;
               }

               if(var5 == 4) {
                  return 15;
               }
            }

            var9 = var8;
            if(var6 == null) {
               return var9;
            }

            var10001 = 3;
         }
      }

      if(var9 == var10001) {
         var9 = var5;
         if(var6 == null) {
            return var9;
         }

         if(var5 == 5) {
            return 15;
         }
      }

      var9 = 0;
      return var9;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "íë;B§ãò7D¾\fíë;B§àì<F";
      int var4 = "íë;B§ãò7D¾\fíë;B§àì<F".length();
      char var1 = 13;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2152 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 17;
               break;
            case 1:
               var10009 = 98;
               break;
            case 2:
               var10009 = 107;
               break;
            case 3:
               var10009 = 177;
               break;
            case 4:
               var10009 = 195;
               break;
            case 5:
               var10009 = 36;
               break;
            default:
               var10009 = 91;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
