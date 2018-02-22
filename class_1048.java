import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// $FF: renamed from: dw
public class class_1048 {

   // $FF: renamed from: b dk
   private final class_354 field_5544;
   // $FF: renamed from: c java.util.Random
   private final Random field_5545;
   // $FF: renamed from: d vp
   private final class_1711 field_5546;
   // $FF: renamed from: e java.util.List
   private final List field_5547;
   // $FF: renamed from: f java.lang.String
   private static final String field_5548 = "CL_00000153";


   // $FF: renamed from: <init> (dk) void
   public void method_5943(class_354 var1) {
      super();
      class_1711 var10001 = new class_1711;
      var10001.method_9520();
      this.field_5546 = var10001;
      this.field_5547 = new ArrayList();
      this.field_5544 = var1;
      this.field_5545 = new Random(var1.method_2183());
   }

   // $FF: renamed from: b (sa, double, double, double, float) void
   public void method_5944(class_689 var1, double var2, double var4, double var6, float var8) {
      String[] var9 = class_752.method_4253();
      int var10000 = this.field_5544.field_1820.field_5738;
      if(var9 != null) {
         if(this.field_5544.field_1820.field_5738 != 1) {
            boolean var22 = this.method_5945(var1, var2, var4, var6, var8);
            if(var9 != null) {
               if(var22) {
                  return;
               }

               this.method_5946(var1);
               this.method_5945(var1, var2, var4, var6, var8);
            }

            if(var9 != null) {
               return;
            }
         }

         var10000 = class_1715.method_9561(var1.field_2994);
      }

      int var10 = var10000;
      int var11 = class_1715.method_9561(var1.field_2995) - 1;
      int var12 = class_1715.method_9561(var1.field_2996);
      byte var13 = 1;
      byte var14 = 0;
      int var15 = -2;

      label71:
      while(true) {
         var10000 = var15;

         label68:
         while(var10000 <= 2) {
            if(var9 == null) {
               break label71;
            }

            int var16 = -2;

            label65:
            do {
               var10000 = var16;

               label62:
               while(true) {
                  if(var10000 > 2) {
                     break label65;
                  }

                  var10000 = -1;
                  if(var9 == null) {
                     continue label68;
                  }

                  int var17 = -1;

                  while(true) {
                     if(var17 >= 3) {
                        break label62;
                     }

                     int var18 = var10 + var16 * var13 + var15 * var14;
                     int var19 = var11 + var17;
                     int var20 = var12 + var16 * var14 - var15 * var13;
                     var10000 = var17;
                     if(var9 == null) {
                        break;
                     }

                     if(var9 != null) {
                        var10000 = var17 < 0?1:0;
                     }

                     int var21 = var10000;
                     this.field_5544.method_2058(var18, var19, var20, var21 != 0?class_1192.field_6076:class_1192.field_6025);
                     ++var17;
                     if(var9 == null) {
                        break label62;
                     }
                  }
               }

               ++var16;
            } while(var9 != null);

            ++var15;
            if(var9 != null) {
               continue label71;
            }
            break;
         }

         var1.method_3887((double)var10, (double)var11, (double)var12, var1.field_3000, 0.0F);
         break;
      }

      var1.field_2997 = var1.field_2998 = var1.field_2999 = 0.0D;
   }

   // $FF: renamed from: c (sa, double, double, double, float) boolean
   public boolean method_5945(class_689 var1, double var2, double var4, double var6, float var8) {
      String[] var9;
      int var13;
      int var14;
      int var15;
      class_375 var10001;
      long var18;
      byte var20;
      double var21;
      int var23;
      int var29;
      int var47;
      aji var49;
      double var51;
      label332: {
         double var11;
         label335: {
            String[] var10000 = class_752.method_4253();
            short var10 = 128;
            var9 = var10000;
            var11 = -1.0D;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            int var16 = class_1715.method_9561(var1.field_2994);
            int var17 = class_1715.method_9561(var1.field_2996);
            var18 = class_1035.method_5857(var16, var17);
            var20 = 1;
            var47 = this.field_5546.method_9526(var18);
            if(var9 != null) {
               if(var47 != 0) {
                  class_1662 var24 = (class_1662)this.field_5546.method_9525(var18);
                  var11 = 0.0D;
                  var13 = var24.field_8646;
                  var14 = var24.field_8647;
                  var15 = var24.field_8648;
                  var24.field_8650 = this.field_5544.method_2184();
                  var20 = 0;
                  if(var9 != null) {
                     break label335;
                  }
               }

               var47 = var16 - var10;
            }

            var23 = var47;

            label324:
            do {
               var47 = var23;

               label321:
               while(true) {
                  if(var47 > var16 + var10) {
                     break label324;
                  }

                  var51 = (double)var23 + 0.5D - var1.field_2994;
                  var47 = var17 - var10;
                  if(var9 == null) {
                     break label332;
                  }

                  int var26 = var47;

                  while(true) {
                     if(var26 > var17 + var10) {
                        break label321;
                     }

                     double var27 = (double)var26 + 0.5D - var1.field_2996;
                     class_354 var48 = this.field_5544;

                     label317:
                     while(true) {
                        var47 = var48.method_2212() - 1;
                        if(var9 == null) {
                           continue label321;
                        }

                        var29 = var47;

                        while(var29 >= 0) {
                           var48 = this.field_5544;
                           if(var9 == null) {
                              continue label317;
                           }

                           label292: {
                              label291: {
                                 var49 = this.field_5544.getBlock(var23, var29, var26);
                                 var10001 = class_1192.field_6116;
                                 if(var9 != null) {
                                    if(var49 != class_1192.field_6116) {
                                       break label291;
                                    }

                                    var49 = this.field_5544.getBlock(var23, var29 - 1, var26);
                                    var10001 = class_1192.field_6116;
                                 }

                                 while(true) {
                                    double var30;
                                    if(var49 != var10001) {
                                       var21 = (double)var29 + 0.5D - var1.field_2995;
                                       var30 = var51 * var51 + var21 * var21 + var27 * var27;
                                       double var57;
                                       var47 = (var57 = var11 - 0.0D) == 0.0D?0:(var57 < 0.0D?-1:1);
                                       if(var9 != null) {
                                          label268: {
                                             if(var47 >= 0) {
                                                double var58;
                                                var47 = (var58 = var30 - var11) == 0.0D?0:(var58 < 0.0D?-1:1);
                                                if(var9 == null) {
                                                   break label268;
                                                }

                                                if(var47 >= 0) {
                                                   break;
                                                }
                                             }

                                             var11 = var30;
                                             var13 = var23;
                                             var14 = var29;
                                             var47 = var26;
                                          }
                                       }

                                       var15 = var47;
                                       break;
                                    }

                                    --var29;
                                    if(var9 == null) {
                                       break label292;
                                    }

                                    if(var9 == null) {
                                       var21 = (double)var29 + 0.5D - var1.field_2995;
                                       var30 = var51 * var51 + var21 * var21 + var27 * var27;
                                       double var59;
                                       var47 = (var59 = var11 - 0.0D) == 0.0D?0:(var59 < 0.0D?-1:1);
                                       if(var9 != null) {
                                          label255: {
                                             if(var47 >= 0) {
                                                double var60;
                                                var47 = (var60 = var30 - var11) == 0.0D?0:(var60 < 0.0D?-1:1);
                                                if(var9 == null) {
                                                   break label255;
                                                }

                                                if(var47 >= 0) {
                                                   break;
                                                }
                                             }

                                             var11 = var30;
                                             var13 = var23;
                                             var14 = var29;
                                             var47 = var26;
                                          }
                                       }

                                       var15 = var47;
                                       break;
                                    }

                                    var49 = this.field_5544.getBlock(var23, var29 - 1, var26);
                                    var10001 = class_1192.field_6116;
                                 }
                              }

                              --var29;
                           }

                           if(var9 == null) {
                              break;
                           }
                        }

                        ++var26;
                        if(var9 == null) {
                           break label321;
                        }
                        break;
                     }
                  }
               }

               ++var23;
            } while(var9 != null);
         }

         double var61;
         var47 = (var61 = var11 - 0.0D) == 0.0D?0:(var61 < 0.0D?-1:1);
      }

      if(var9 != null) {
         if(var47 >= 0) {
            var47 = var20;
            if(var9 != null) {
               if(var20 != 0) {
                  class_1711 var52 = this.field_5546;
                  class_1662 var10002 = new class_1662;
                  var10002.method_9158(this, var13, var14, var15, this.field_5544.method_2184());
                  var52.method_9528(var18, var10002);
                  this.field_5547.add(Long.valueOf(var18));
               }

               var47 = var13;
            }

            var51 = (double)var47 + 0.5D;
            double var53 = (double)var14 + 0.5D;
            var21 = (double)var15 + 0.5D;
            int var28 = -1;
            var49 = this.field_5544.getBlock(var13 - 1, var14, var15);
            var10001 = class_1192.field_6116;
            if(var9 != null) {
               if(var49 == class_1192.field_6116) {
                  var28 = 2;
               }

               var49 = this.field_5544.getBlock(var13 + 1, var14, var15);
               var10001 = class_1192.field_6116;
            }

            if(var9 != null) {
               if(var49 == var10001) {
                  var28 = 0;
               }

               var49 = this.field_5544.getBlock(var13, var14, var15 - 1);
               var10001 = class_1192.field_6116;
            }

            if(var9 != null) {
               if(var49 == var10001) {
                  var28 = 3;
               }

               var49 = this.field_5544.getBlock(var13, var14, var15 + 1);
               var10001 = class_1192.field_6116;
            }

            if(var49 == var10001) {
               var28 = 1;
            }

            label236: {
               label351: {
                  var29 = var1.method_3968();
                  var47 = var28;
                  if(var9 != null) {
                     if(var28 <= -1) {
                        break label351;
                     }

                     var47 = class_1649.field_8594[var28];
                  }

                  int var55 = var47;
                  int var31 = class_1649.field_8587[var28];
                  int var32 = class_1649.field_8588[var28];
                  int var33 = class_1649.field_8587[var55];
                  int var34 = class_1649.field_8588[var55];
                  byte var54 = this.field_5544.method_34(var13 + var31 + var33, var14, var15 + var32 + var34);
                  if(var9 != null) {
                     label349: {
                        if(var54 != 0) {
                           var54 = this.field_5544.method_34(var13 + var31 + var33, var14 + 1, var15 + var32 + var34);
                           if(var9 == null) {
                              break label349;
                           }

                           if(var54 != 0) {
                              var54 = 0;
                              break label349;
                           }
                        }

                        var54 = 1;
                     }
                  }

                  byte var35 = var54;
                  var54 = this.field_5544.method_34(var13 + var31, var14, var15 + var32);
                  if(var9 != null) {
                     label350: {
                        if(var54 != 0) {
                           var54 = this.field_5544.method_34(var13 + var31, var14 + 1, var15 + var32);
                           if(var9 == null) {
                              break label350;
                           }

                           if(var54 != 0) {
                              var54 = 0;
                              break label350;
                           }
                        }

                        var54 = 1;
                     }
                  }

                  byte var36;
                  label346: {
                     var36 = var54;
                     var47 = var35;
                     if(var9 != null) {
                        if(var35 == 0) {
                           break label346;
                        }

                        var47 = var36;
                     }

                     if(var9 != null) {
                        if(var47 == 0) {
                           break label346;
                        }

                        var28 = class_1649.field_8592[var28];
                        var55 = class_1649.field_8592[var55];
                        var31 = class_1649.field_8587[var28];
                        var32 = class_1649.field_8588[var28];
                        var33 = class_1649.field_8587[var55];
                        var34 = class_1649.field_8588[var55];
                        var47 = var13 - var33;
                     }

                     var23 = var47;
                     var51 -= (double)var33;
                     int var37 = var15 - var34;
                     var21 -= (double)var34;
                     var54 = this.field_5544.method_34(var23 + var31 + var33, var14, var37 + var32 + var34);
                     if(var9 != null) {
                        label194: {
                           if(var54 != 0) {
                              var54 = this.field_5544.method_34(var23 + var31 + var33, var14 + 1, var37 + var32 + var34);
                              if(var9 == null) {
                                 break label194;
                              }

                              if(var54 != 0) {
                                 var54 = 0;
                                 break label194;
                              }
                           }

                           var54 = 1;
                        }
                     }

                     var35 = var54;
                     var54 = this.field_5544.method_34(var23 + var31, var14, var37 + var32);
                     if(var9 != null) {
                        label186: {
                           if(var54 != 0) {
                              var54 = this.field_5544.method_34(var23 + var31, var14 + 1, var37 + var32);
                              if(var9 == null) {
                                 break label186;
                              }

                              if(var54 != 0) {
                                 var54 = 0;
                                 break label186;
                              }
                           }

                           var54 = 1;
                        }
                     }

                     var36 = var54;
                  }

                  float var38;
                  float var56;
                  label347: {
                     var56 = 0.5F;
                     var38 = 0.5F;
                     var54 = var35;
                     if(var9 != null) {
                        label177: {
                           if(var35 == 0) {
                              var54 = var36;
                              if(var9 == null) {
                                 break label177;
                              }

                              if(var36 != 0) {
                                 var56 = 1.0F;
                                 if(var9 != null) {
                                    break label347;
                                 }
                              }
                           }

                           var54 = var35;
                        }
                     }

                     if(var9 != null) {
                        label167: {
                           if(var54 != 0) {
                              var54 = var36;
                              if(var9 == null) {
                                 break label167;
                              }

                              if(var36 == 0) {
                                 var56 = 0.0F;
                                 if(var9 != null) {
                                    break label347;
                                 }
                              }
                           }

                           var54 = var35;
                        }
                     }

                     if(var9 != null) {
                        if(var54 == 0) {
                           break label347;
                        }

                        var54 = var36;
                     }

                     if(var54 != 0) {
                        var38 = 0.0F;
                     }
                  }

                  float var39;
                  float var40;
                  float var41;
                  float var42;
                  label348: {
                     var51 += (double)((float)var33 * var56 + var38 * (float)var31);
                     var21 += (double)((float)var34 * var56 + var38 * (float)var32);
                     var39 = 0.0F;
                     var40 = 0.0F;
                     var41 = 0.0F;
                     var42 = 0.0F;
                     var47 = var28;
                     int var50 = var29;
                     if(var9 != null) {
                        if(var28 == var29) {
                           var39 = 1.0F;
                           var40 = 1.0F;
                           if(var9 != null) {
                              break label348;
                           }
                        }

                        var47 = var28;
                        var50 = class_1649.field_8592[var29];
                     }

                     if(var9 != null) {
                        if(var47 == var50) {
                           var39 = -1.0F;
                           var40 = -1.0F;
                           if(var9 != null) {
                              break label348;
                           }
                        }

                        var47 = var28;
                        var50 = class_1649.field_8593[var29];
                     }

                     if(var47 == var50) {
                        var41 = 1.0F;
                        var42 = -1.0F;
                        if(var9 != null) {
                           break label348;
                        }
                     }

                     var41 = -1.0F;
                     var42 = 1.0F;
                  }

                  double var43 = var1.field_2997;
                  double var45 = var1.field_2999;
                  var1.field_2997 = var43 * (double)var39 + var45 * (double)var42;
                  var1.field_2999 = var43 * (double)var41 + var45 * (double)var40;
                  var1.field_3000 = var8 - (float)(var29 * 90) + (float)(var28 * 90);
                  if(var9 != null) {
                     break label236;
                  }
               }

               var1.field_2997 = var1.field_2998 = var1.field_2999 = 0.0D;
            }

            var1.method_3887(var51, var53, var21, var1.field_3000, var1.field_3001);
            return true;
         }

         var47 = 0;
      }

      return (boolean)var47;
   }

   // $FF: renamed from: b (sa) boolean
   public boolean method_5946(class_689 var1) {
      byte var3 = 16;
      double var4 = -1.0D;
      int var6 = class_1715.method_9561(var1.field_2994);
      int var7 = class_1715.method_9561(var1.field_2995);
      int var8 = class_1715.method_9561(var1.field_2996);
      String[] var10000 = class_752.method_4253();
      int var9 = var6;
      int var10 = var7;
      int var11 = var8;
      int var12 = 0;
      int var13 = this.field_5545.nextInt(4);
      String[] var2 = var10000;
      int var14 = var6 - var3;

      double var15;
      int var17;
      int var10001;
      double var18;
      int var20;
      int var21;
      int var22;
      int var23;
      int var24;
      int var25;
      int var26;
      int var27;
      int var28;
      double var29;
      double var31;
      int var33;
      int var38;
      label569:
      while(true) {
         var38 = var14;

         label566:
         while(var38 <= var6 + var3) {
            var15 = (double)var14 + 0.5D - var1.field_2994;
            var38 = var8 - var3;
            if(var2 == null) {
               break label569;
            }

            var17 = var38;

            label563:
            do {
               var38 = var17;

               label560:
               while(true) {
                  var10001 = var8 + var3;

                  label558:
                  while(true) {
                     if(var38 > var10001) {
                        break label563;
                     }

                     var18 = (double)var17 + 0.5D - var1.field_2996;
                     var38 = this.field_5544.method_2212() - 1;
                     if(var2 == null) {
                        continue label566;
                     }

                     var20 = var38;

                     while(true) {
                        if(var20 < 0) {
                           break label560;
                        }

                        var38 = this.field_5544.method_34(var14, var20, var17);
                        if(var2 == null) {
                           continue label560;
                        }

                        label578: {
                           if(var2 != null) {
                              if(var38 == 0) {
                                 break label578;
                              }

                              var38 = var20;
                           }

                           while(true) {
                              if(var38 > 0) {
                                 var38 = this.field_5544.method_34(var14, var20 - 1, var17);
                                 if(var2 == null || var2 == null) {
                                    break;
                                 }

                                 if(var38 != 0) {
                                    --var20;
                                    if(var2 != null) {
                                       var38 = var20;
                                       continue;
                                    }
                                 }
                              }

                              var38 = var13;
                              break;
                           }

                           var21 = var38;

                           label532:
                           while(var21 < var13 + 4) {
                              var22 = var21 % 2;
                              var23 = 1 - var22;
                              var38 = var21 % 4;
                              if(var2 != null) {
                                 var10001 = 2;
                                 if(var2 == null) {
                                    continue label558;
                                 }

                                 if(var38 >= 2) {
                                    var22 = -var22;
                                    var23 = -var23;
                                 }

                                 var38 = 0;
                              }

                              var24 = var38;

                              label529:
                              while(true) {
                                 var38 = var24;

                                 label526:
                                 while(var38 < 3) {
                                    var38 = 0;
                                    if(var2 == null) {
                                       break label529;
                                    }

                                    var25 = 0;

                                    label523:
                                    do {
                                       var38 = var25;

                                       label520:
                                       while(true) {
                                          if(var38 >= 4) {
                                             break label523;
                                          }

                                          var38 = -1;
                                          if(var2 == null) {
                                             continue label526;
                                          }

                                          var26 = -1;

                                          while(true) {
                                             if(var26 >= 4) {
                                                break label520;
                                             }

                                             var27 = var14 + (var25 - 1) * var22 + var24 * var23;
                                             var28 = var20 + var26;
                                             var33 = var17 + (var25 - 1) * var23 - var24 * var22;
                                             var38 = var26;
                                             if(var2 == null) {
                                                break;
                                             }

                                             if(var2 != null) {
                                                label507: {
                                                   if(var26 < 0) {
                                                      var38 = this.field_5544.getBlock(var27, var28, var33).method_2424().method_5063();
                                                      if(var2 == null) {
                                                         break label507;
                                                      }

                                                      if(var38 == 0) {
                                                         break label532;
                                                      }
                                                   }

                                                   var38 = var26;
                                                }
                                             }

                                             label515: {
                                                if(var2 != null) {
                                                   if(var38 < 0) {
                                                      break label515;
                                                   }

                                                   var38 = this.field_5544.method_34(var27, var28, var33);
                                                }

                                                if(var38 == 0 && var2 != null) {
                                                   break label532;
                                                }
                                             }

                                             ++var26;
                                             if(var2 == null) {
                                                break label520;
                                             }
                                          }
                                       }

                                       ++var25;
                                    } while(var2 != null);

                                    ++var24;
                                    if(var2 != null) {
                                       continue label529;
                                    }
                                    break;
                                 }

                                 var38 = var20;
                                 break;
                              }

                              label483: {
                                 var29 = (double)var38 + 0.5D - var1.field_2995;
                                 var31 = var15 * var15 + var29 * var29 + var18 * var18;
                                 double var41;
                                 var38 = (var41 = var4 - 0.0D) == 0.0D?0:(var41 < 0.0D?-1:1);
                                 if(var2 != null) {
                                    label481: {
                                       if(var38 >= 0) {
                                          double var42;
                                          var38 = (var42 = var31 - var4) == 0.0D?0:(var42 < 0.0D?-1:1);
                                          if(var2 == null) {
                                             break label481;
                                          }

                                          if(var38 >= 0) {
                                             break label483;
                                          }
                                       }

                                       var4 = var31;
                                       var9 = var14;
                                       var10 = var20;
                                       var11 = var17;
                                       var38 = var21 % 4;
                                    }
                                 }

                                 var12 = var38;
                              }

                              ++var21;
                              if(var2 == null) {
                                 break;
                              }
                           }
                        }

                        --var20;
                        if(var2 == null) {
                           break label560;
                        }
                     }
                  }
               }

               ++var17;
            } while(var2 != null);

            ++var14;
            if(var2 != null) {
               continue label569;
            }
            break;
         }

         double var43;
         var38 = (var43 = var4 - 0.0D) == 0.0D?0:(var43 < 0.0D?-1:1);
         break;
      }

      if(var2 != null) {
         label442: {
            if(var38 < 0) {
               var14 = var6 - var3;

               label439:
               do {
                  var38 = var14;

                  label436:
                  while(true) {
                     if(var38 > var6 + var3) {
                        break label439;
                     }

                     var15 = (double)var14 + 0.5D - var1.field_2994;
                     var38 = var8 - var3;
                     if(var2 == null) {
                        break label442;
                     }

                     var17 = var38;

                     while(true) {
                        var38 = var17;

                        label432:
                        while(true) {
                           if(var38 > var8 + var3) {
                              break label436;
                           }

                           var18 = (double)var17 + 0.5D - var1.field_2996;
                           var38 = this.field_5544.method_2212() - 1;
                           if(var2 == null) {
                              continue label436;
                           }

                           var20 = var38;

                           label429:
                           do {
                              var38 = var20;

                              label426:
                              while(true) {
                                 if(var38 < 0) {
                                    break label429;
                                 }

                                 var38 = this.field_5544.method_34(var14, var20, var17);
                                 if(var2 == null) {
                                    continue label432;
                                 }

                                 label592: {
                                    if(var2 != null) {
                                       if(var38 == 0) {
                                          break;
                                       }

                                       var38 = var20;
                                    }

                                    while(var38 > 0) {
                                       var38 = this.field_5544.method_34(var14, var20 - 1, var17);
                                       if(var2 == null || var2 == null) {
                                          break label592;
                                       }

                                       if(var38 == 0) {
                                          break;
                                       }

                                       --var20;
                                       if(var2 == null) {
                                          break;
                                       }

                                       var38 = var20;
                                    }

                                    var38 = var13;
                                 }

                                 var21 = var38;

                                 while(true) {
                                    if(var21 >= var13 + 2) {
                                       break label426;
                                    }

                                    var22 = var21 % 2;
                                    var23 = 1 - var22;
                                    var38 = 0;
                                    if(var2 == null) {
                                       break;
                                    }

                                    var24 = 0;

                                    label401:
                                    while(true) {
                                       var38 = var24;

                                       label398:
                                       while(true) {
                                          if(var38 < 4) {
                                             var38 = -1;
                                             if(var2 == null) {
                                                break;
                                             }

                                             var25 = -1;

                                             while(var25 < 4) {
                                                var26 = var14 + (var24 - 1) * var22;
                                                var27 = var20 + var25;
                                                var28 = var17 + (var24 - 1) * var23;
                                                var38 = var25;
                                                if(var2 == null) {
                                                   continue label398;
                                                }

                                                if(var2 != null) {
                                                   label373: {
                                                      if(var25 < 0) {
                                                         var38 = this.field_5544.getBlock(var26, var27, var28).method_2424().method_5063();
                                                         if(var2 == null) {
                                                            break label373;
                                                         }

                                                         if(var38 == 0) {
                                                            break label426;
                                                         }
                                                      }

                                                      var38 = var25;
                                                   }
                                                }

                                                label379: {
                                                   if(var2 != null) {
                                                      if(var38 < 0) {
                                                         break label379;
                                                      }

                                                      var38 = this.field_5544.method_34(var26, var27, var28);
                                                   }

                                                   if(var38 == 0 && var2 != null) {
                                                      break label426;
                                                   }
                                                }

                                                ++var25;
                                                if(var2 == null) {
                                                   break;
                                                }
                                             }

                                             ++var24;
                                             if(var2 != null) {
                                                continue label401;
                                             }
                                          }

                                          var38 = var20;
                                          break;
                                       }

                                       label338: {
                                          var29 = (double)var38 + 0.5D - var1.field_2995;
                                          var31 = var15 * var15 + var29 * var29 + var18 * var18;
                                          double var44;
                                          var38 = (var44 = var4 - 0.0D) == 0.0D?0:(var44 < 0.0D?-1:1);
                                          if(var2 != null) {
                                             label336: {
                                                if(var38 >= 0) {
                                                   double var45;
                                                   var38 = (var45 = var31 - var4) == 0.0D?0:(var45 < 0.0D?-1:1);
                                                   if(var2 == null) {
                                                      break label336;
                                                   }

                                                   if(var38 >= 0) {
                                                      break label338;
                                                   }
                                                }

                                                var4 = var31;
                                                var9 = var14;
                                                var10 = var20;
                                                var11 = var17;
                                                var38 = var21 % 2;
                                             }
                                          }

                                          var12 = var38;
                                       }

                                       ++var21;
                                       if(var2 == null) {
                                          break label426;
                                       }
                                       break;
                                    }
                                 }
                              }

                              --var20;
                           } while(var2 != null);

                           ++var17;
                           if(var2 == null) {
                              break label436;
                           }
                           break;
                        }
                     }
                  }

                  ++var14;
               } while(var2 != null);
            }

            var38 = var9;
         }
      }

      var33 = var38;
      int var34 = var10;
      var17 = var11;
      int var35 = var12 % 2;
      int var36 = 1 - var35;
      var38 = var12 % 4;
      if(var2 != null) {
         if(var38 >= 2) {
            var35 = -var35;
            var36 = -var36;
         }

         double var46;
         var38 = (var46 = var4 - 0.0D) == 0.0D?0:(var46 < 0.0D?-1:1);
      }

      int var37;
      if(var2 != null) {
         label326: {
            if(var38 < 0) {
               label599: {
                  var38 = var10;
                  var10001 = 70;
                  if(var2 != null) {
                     if(var10 < 70) {
                        var10 = 70;
                     }

                     var38 = var10;
                     if(var2 == null) {
                        break label599;
                     }

                     var10001 = this.field_5544.method_2212() - 10;
                  }

                  if(var38 > var10001) {
                     var10 = this.field_5544.method_2212() - 10;
                  }

                  var34 = var10;
                  var38 = -1;
               }

               var20 = var38;

               label323:
               do {
                  var38 = var20;

                  label320:
                  while(true) {
                     if(var38 > 1) {
                        break label323;
                     }

                     var38 = 1;
                     if(var2 == null) {
                        break label326;
                     }

                     var21 = 1;

                     while(true) {
                        var38 = var21;

                        label316:
                        while(true) {
                           if(var38 >= 3) {
                              break label320;
                           }

                           var38 = -1;
                           if(var2 == null) {
                              continue label320;
                           }

                           var22 = -1;

                           while(var22 < 3) {
                              var23 = var33 + (var21 - 1) * var35 + var20 * var36;
                              var24 = var34 + var22;
                              var25 = var17 + (var21 - 1) * var36 - var20 * var35;
                              var38 = var22;
                              if(var2 == null) {
                                 continue label316;
                              }

                              if(var2 != null) {
                                 var38 = var22 < 0?1:0;
                              }

                              var37 = var38;
                              this.field_5544.method_2058(var23, var24, var25, var37 != 0?class_1192.field_6076:class_1192.field_6025);
                              ++var22;
                              if(var2 == null) {
                                 break;
                              }
                           }

                           ++var21;
                           if(var2 == null) {
                              break label320;
                           }
                           break;
                        }
                     }
                  }

                  ++var20;
               } while(var2 != null);
            }

            var38 = 0;
         }
      }

      var20 = var38;

      label278:
      while(true) {
         var38 = var20;

         boolean var39;
         label275:
         while(var38 < 4) {
            var39 = false;
            if(var2 == null) {
               return var39;
            }

            var21 = 0;

            byte var40;
            label272:
            while(true) {
               var38 = var21;

               label269:
               while(var38 < 4) {
                  var40 = -1;
                  if(var2 == null) {
                     break label272;
                  }

                  var22 = -1;

                  while(var22 < 4) {
                     var23 = var33 + (var21 - 1) * var35;
                     var24 = var34 + var22;
                     var25 = var17 + (var21 - 1) * var36;
                     var38 = var21;
                     if(var2 == null) {
                        continue label269;
                     }

                     if(var2 != null) {
                        label262: {
                           if(var21 != 0) {
                              var38 = var21;
                              if(var2 == null) {
                                 break label262;
                              }

                              if(var21 != 3) {
                                 var38 = var22;
                                 if(var2 == null) {
                                    break label262;
                                 }

                                 if(var22 != -1) {
                                    var38 = var22;
                                    if(var2 == null) {
                                       break label262;
                                    }

                                    if(var22 != 3) {
                                       var38 = 0;
                                       break label262;
                                    }
                                 }
                              }
                           }

                           var38 = 1;
                        }
                     }

                     var37 = var38;
                     this.field_5544.method_2054(var23, var24, var25, (aji)(var37 != 0?class_1192.field_6076:class_1192.field_6116), 0, 2);
                     ++var22;
                     if(var2 == null) {
                        break;
                     }
                  }

                  ++var21;
                  if(var2 != null) {
                     continue label272;
                  }
                  break;
               }

               var40 = 0;
               break;
            }

            var21 = var40;

            while(var21 < 4) {
               var38 = -1;
               if(var2 == null) {
                  continue label275;
               }

               var22 = -1;

               while(true) {
                  if(var22 < 4) {
                     var23 = var33 + (var21 - 1) * var35;
                     var24 = var34 + var22;
                     var25 = var17 + (var21 - 1) * var36;
                     this.field_5544.method_2063(var23, var24, var25, this.field_5544.getBlock(var23, var24, var25));
                     ++var22;
                     if(var2 == null) {
                        break;
                     }

                     if(var2 != null) {
                        continue;
                     }
                  }

                  ++var21;
                  break;
               }

               if(var2 == null) {
                  break;
               }
            }

            ++var20;
            if(var2 != null) {
               continue label278;
            }
            break;
         }

         var39 = true;
         return var39;
      }
   }

   // $FF: renamed from: b (long) void
   public void method_5947(long var1) {
      String[] var3 = class_752.method_4253();
      if(var1 % 100L == 0L) {
         Iterator var4 = this.field_5547.iterator();
         long var5 = var1 - 600L;

         while(var4.hasNext()) {
            Long var7 = (Long)var4.next();
            class_1662 var8 = (class_1662)this.field_5546.method_9525(var7.longValue());
            if(var3 != null && (var8 == null || var3 != null && var8.field_8650 < var5)) {
               var4.remove();
               this.field_5546.method_9531(var7.longValue());
            }

            if(var3 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5948() {
      boolean var10000 = true;
      char[] var10003 = "©\t<Õí×ÚtVÖ".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_5548 = (new String((char[])var4)).intern();
            String var2 = field_5548;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 24;
            break;
         case 1:
            var10009 = 183;
            break;
         case 2:
            var10009 = 145;
            break;
         case 3:
            var10009 = 23;
            break;
         case 4:
            var10009 = 47;
            break;
         case 5:
            var10009 = 84;
            break;
         default:
            var10009 = 21;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
