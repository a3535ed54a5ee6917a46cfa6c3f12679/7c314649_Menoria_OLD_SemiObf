import java.util.List;
import java.util.Random;

// $FF: renamed from: gZ
public class class_1149 implements class_25 {

   // $FF: renamed from: a java.util.Random
   private Random field_5918;
   // $FF: renamed from: b jc
   private class_1308 field_5919;
   // $FF: renamed from: c jc
   private class_1308 field_5920;
   // $FF: renamed from: d jc
   private class_1308 field_5921;
   // $FF: renamed from: e jc
   private class_1308 field_5922;
   // $FF: renamed from: f jc
   private class_1308 field_5923;
   // $FF: renamed from: g jc
   public class_1308 field_5924;
   // $FF: renamed from: h jc
   public class_1308 field_5925;
   // $FF: renamed from: i ahb
   private ahb field_5926;
   // $FF: renamed from: j double[]
   private double[] field_5927;
   // $FF: renamed from: k g6
   public class_1056 field_5928;
   // $FF: renamed from: l double[]
   private double[] field_5929;
   // $FF: renamed from: m double[]
   private double[] field_5930;
   // $FF: renamed from: n double[]
   private double[] field_5931;
   // $FF: renamed from: o g0
   private class_1051 field_5932;
   // $FF: renamed from: p double[]
   double[] field_5933;
   // $FF: renamed from: q double[]
   double[] field_5934;
   // $FF: renamed from: r double[]
   double[] field_5935;
   // $FF: renamed from: s double[]
   double[] field_5936;
   // $FF: renamed from: t double[]
   double[] field_5937;
   // $FF: renamed from: u java.lang.String
   private static final String field_5938;
   // $FF: renamed from: v java.lang.String[]
   private static final String[] field_5939;


   // $FF: renamed from: <init> (ahb, long) void
   public void method_6339(ahb var1, long var2) {
      super();
      class_1056 var10001 = new class_1056;
      var10001.method_5960();
      this.field_5928 = var10001;
      this.field_5929 = new double[256];
      this.field_5930 = new double[256];
      this.field_5931 = new double[256];
      class_1058 var4 = new class_1058;
      var4.method_5960();
      this.field_5932 = var4;
      this.field_5926 = var1;
      this.field_5918 = new Random(var2);
      class_1308 var5 = new class_1308;
      var5.method_6903(this.field_5918, 16);
      this.field_5919 = var5;
      var5 = new class_1308;
      var5.method_6903(this.field_5918, 16);
      this.field_5920 = var5;
      var5 = new class_1308;
      var5.method_6903(this.field_5918, 8);
      this.field_5921 = var5;
      var5 = new class_1308;
      var5.method_6903(this.field_5918, 4);
      this.field_5922 = var5;
      var5 = new class_1308;
      var5.method_6903(this.field_5918, 4);
      this.field_5923 = var5;
      var5 = new class_1308;
      var5.method_6903(this.field_5918, 10);
      this.field_5924 = var5;
      var5 = new class_1308;
      var5.method_6903(this.field_5918, 16);
      this.field_5925 = var5;
   }

   // $FF: renamed from: b (int, int, aji[]) void
   public void method_6340(int var1, int var2, aji[] var3) {
      byte var5 = 4;
      byte var6 = 32;
      String[] var10000 = class_752.method_4253();
      int var7 = var5 + 1;
      String[] var4 = var10000;
      byte var8 = 17;
      int var9 = var5 + 1;
      this.field_5927 = this.method_6342(this.field_5927, var1 * var5, 0, var2 * var5, var7, var8, var9);
      int var10 = 0;

      do {
         int var53 = var10;

         label105:
         while(true) {
            if(var53 >= var5) {
               return;
            }

            int var11 = 0;

            while(true) {
               var53 = var11;

               label101:
               while(true) {
                  if(var53 >= var5) {
                     break label105;
                  }

                  var53 = 0;
                  if(var4 == null) {
                     continue label105;
                  }

                  int var12 = 0;

                  label98:
                  do {
                     var53 = var12;

                     label95:
                     while(true) {
                        if(var53 >= 16) {
                           break label98;
                        }

                        double var13 = 0.125D;
                        double var15 = this.field_5927[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 0];
                        double var17 = this.field_5927[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 0];
                        double var19 = this.field_5927[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 0];
                        double var21 = this.field_5927[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 0];
                        double var23 = (this.field_5927[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 1] - var15) * var13;
                        double var25 = (this.field_5927[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 1] - var17) * var13;
                        double var27 = (this.field_5927[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 1] - var19) * var13;
                        double var29 = (this.field_5927[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 1] - var21) * var13;
                        var53 = 0;
                        if(var4 == null) {
                           continue label101;
                        }

                        int var31 = 0;

                        while(true) {
                           var53 = var31;

                           label91:
                           while(true) {
                              if(var53 >= 8) {
                                 break label95;
                              }

                              double var32 = 0.25D;
                              double var34 = var15;
                              double var36 = var17;
                              double var38 = (var19 - var15) * var32;
                              double var40 = (var21 - var17) * var32;
                              var53 = 0;
                              if(var4 == null) {
                                 continue label95;
                              }

                              int var42 = 0;

                              label88:
                              do {
                                 var53 = var42;
                                 byte var10001 = 4;

                                 label85:
                                 while(true) {
                                    if(var53 >= var10001) {
                                       break label88;
                                    }

                                    int var43 = var42 + var10 * 4 << 11 | 0 + var11 * 4 << 7 | var12 * 8 + var31;
                                    short var44 = 128;
                                    double var45 = 0.25D;
                                    double var47 = var34;
                                    double var49 = (var36 - var34) * var45;
                                    var53 = 0;
                                    if(var4 == null) {
                                       continue label91;
                                    }

                                    int var51 = 0;

                                    while(true) {
                                       if(var51 >= 4) {
                                          break label85;
                                       }

                                       aji var52 = null;
                                       var53 = var12 * 8 + var31;
                                       var10001 = var6;
                                       if(var4 == null) {
                                          break;
                                       }

                                       if(var53 < var6) {
                                          var52 = class_1192.field_6036;
                                       }

                                       double var54;
                                       var53 = (var54 = var47 - 0.0D) == 0.0D?0:(var54 < 0.0D?-1:1);
                                       if(var4 != null) {
                                          if(var53 > 0) {
                                             var52 = class_1192.field_6113;
                                          }

                                          var3[var43] = var52;
                                          var53 = var43 + var44;
                                       }

                                       var43 = var53;
                                       var47 += var49;
                                       ++var51;
                                       if(var4 == null) {
                                          break label85;
                                       }
                                    }
                                 }

                                 var34 += var38;
                                 var36 += var40;
                                 ++var42;
                              } while(var4 != null);

                              var15 += var23;
                              var17 += var25;
                              var19 += var27;
                              var21 += var29;
                              ++var31;
                              if(var4 == null) {
                                 break label95;
                              }
                              break;
                           }
                        }
                     }

                     ++var12;
                  } while(var4 != null);

                  ++var11;
                  if(var4 == null) {
                     break label105;
                  }
                  break;
               }
            }
         }

         ++var10;
      } while(var4 != null);

   }

   // $FF: renamed from: c (int, int, aji[]) void
   public void method_6341(int var1, int var2, aji[] var3) {
      byte var5 = 64;
      double var6 = 0.03125D;
      this.field_5929 = this.field_5922.method_6904(this.field_5929, var1 * 16, var2 * 16, 0, 16, 16, 1, var6, var6, 1.0D);
      this.field_5930 = this.field_5922.method_6904(this.field_5930, var1 * 16, 109, var2 * 16, 16, 1, 16, var6, 1.0D, var6);
      String[] var10000 = class_752.method_4253();
      this.field_5931 = this.field_5923.method_6904(this.field_5931, var1 * 16, var2 * 16, 0, 16, 16, 1, var6 * 2.0D, var6 * 2.0D, var6 * 2.0D);
      String[] var4 = var10000;
      int var8 = 0;

      do {
         int var19 = var8;

         label184:
         while(true) {
            if(var19 >= 16) {
               return;
            }

            int var9 = 0;

            while(true) {
               var19 = var9;
               int var10001 = 16;

               label180:
               while(true) {
                  if(var19 >= var10001) {
                     break label184;
                  }

                  double var21;
                  var19 = (var21 = this.field_5929[var8 + var9 * 16] + this.field_5918.nextDouble() * 0.2D - 0.0D) == 0.0D?0:(var21 < 0.0D?-1:1);
                  if(var4 == null) {
                     continue label184;
                  }

                  if(var4 != null) {
                     var19 = var19 > 0?1:0;
                  }

                  int var10 = var19;
                  double var22;
                  var19 = (var22 = this.field_5930[var8 + var9 * 16] + this.field_5918.nextDouble() * 0.2D - 0.0D) == 0.0D?0:(var22 < 0.0D?-1:1);
                  if(var4 != null) {
                     var19 = var19 > 0?1:0;
                  }

                  int var11 = var19;
                  int var12 = (int)(this.field_5931[var8 + var9 * 16] / 3.0D + 3.0D + this.field_5918.nextDouble() * 0.25D);
                  int var13 = -1;
                  aji var14 = class_1192.field_6113;
                  aji var15 = class_1192.field_6113;
                  int var16 = 127;

                  while(var16 >= 0) {
                     int var17 = (var9 * 16 + var8) * 128 + var16;
                     var19 = var16;
                     var10001 = 127 - this.field_5918.nextInt(5);
                     if(var4 == null) {
                        continue label180;
                     }

                     label168: {
                        label167: {
                           if(var4 != null) {
                              if(var16 >= var10001) {
                                 break label167;
                              }

                              var19 = var16;
                              var10001 = 0 + this.field_5918.nextInt(5);
                           }

                           if(var19 > var10001) {
                              label160: {
                                 label195: {
                                    aji var18 = var3[var17];
                                    aji var20 = var18;
                                    if(var4 != null) {
                                       if(var18 == null) {
                                          break label195;
                                       }

                                       var20 = var18;
                                    }

                                    if(var4 != null) {
                                       if(var20.method_2424() == awt.field_4170) {
                                          break label195;
                                       }

                                       var20 = var18;
                                    }

                                    if(var20 != class_1192.field_6113) {
                                       break label160;
                                    }

                                    var19 = var13;
                                    if(var4 != null) {
                                       if(var13 == -1) {
                                          label127: {
                                             label126: {
                                                label197: {
                                                   var19 = var12;
                                                   if(var4 != null) {
                                                      if(var12 <= 0) {
                                                         var14 = null;
                                                         var15 = class_1192.field_6113;
                                                         break label197;
                                                      }

                                                      var19 = var16;
                                                   }

                                                   var10001 = var5 - 4;
                                                   if(var4 == null) {
                                                      break label127;
                                                   }

                                                   if(var19 >= var10001) {
                                                      var19 = var16;
                                                      var10001 = var5 + 1;
                                                      if(var4 == null) {
                                                         break label127;
                                                      }

                                                      if(var16 <= var10001) {
                                                         var14 = class_1192.field_6113;
                                                         var15 = class_1192.field_6113;
                                                         var19 = var11;
                                                         if(var4 != null) {
                                                            if(var11 != 0) {
                                                               var14 = class_1192.field_6038;
                                                               var15 = class_1192.field_6113;
                                                            }

                                                            var19 = var10;
                                                         }

                                                         if(var4 == null) {
                                                            break label126;
                                                         }

                                                         if(var19 != 0) {
                                                            var14 = class_1192.field_6114;
                                                            var15 = class_1192.field_6114;
                                                         }
                                                      }
                                                   }
                                                }

                                                var19 = var16;
                                             }

                                             var10001 = var5;
                                          }

                                          label199: {
                                             if(var4 != null) {
                                                if(var19 < var10001) {
                                                   label108: {
                                                      var20 = var14;
                                                      if(var4 != null) {
                                                         label106: {
                                                            if(var14 != null) {
                                                               var20 = var14;
                                                               if(var4 == null) {
                                                                  break label106;
                                                               }

                                                               if(var14.method_2424() != awt.field_4170) {
                                                                  break label108;
                                                               }
                                                            }

                                                            var20 = class_1192.field_6036;
                                                         }
                                                      }

                                                      var14 = var20;
                                                   }
                                                }

                                                var13 = var12;
                                                if(var4 == null) {
                                                   break label199;
                                                }

                                                var19 = var16;
                                                var10001 = var5 - 1;
                                             }

                                             if(var19 >= var10001) {
                                                var3[var17] = var14;
                                                if(var4 != null) {
                                                   break label160;
                                                }
                                             }

                                             var3[var17] = var15;
                                          }

                                          if(var4 != null) {
                                             break label160;
                                          }
                                       }

                                       var19 = var13;
                                    }

                                    if(var19 <= 0) {
                                       break label160;
                                    }

                                    --var13;
                                    var3[var17] = var15;
                                    if(var4 != null) {
                                       break label160;
                                    }
                                 }

                                 var13 = -1;
                              }

                              if(var4 != null) {
                                 break label168;
                              }
                           }
                        }

                        var3[var17] = class_1192.field_6032;
                     }

                     --var16;
                     if(var4 == null) {
                        break;
                     }
                  }

                  ++var9;
                  if(var4 == null) {
                     break label184;
                  }
                  break;
               }
            }
         }

         ++var8;
      } while(var4 != null);

   }

   // $FF: renamed from: d (int, int) gI
   public class_1069 method_105(int var1, int var2) {
      return this.method_104(var1, var2);
   }

   // $FF: renamed from: c (int, int) gI
   public class_1069 method_104(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      this.field_5918.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      String[] var3 = var10000;
      aji[] var4 = new aji['\u8000'];
      this.method_6340(var1, var2, var4);
      this.method_6341(var1, var2, var4);
      this.field_5932.method_5961(this, this.field_5926, var1, var2, var4);
      this.field_5928.method_5961(this, this.field_5926, var1, var2, var4);
      class_1069 var9 = new class_1069;
      var9.method_6014(this.field_5926, var4, var1, var2);
      class_1069 var5 = var9;
      class_985[] var6 = this.field_5926.method_2041().method_5541((class_985[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var7 = var5.method_6060();
      int var8 = 0;

      while(true) {
         if(var8 < var7.length) {
            var7[var8] = (byte)var6[var8].field_5050;
            ++var8;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var5.method_6062();
         break;
      }

      return var5;
   }

   // $FF: renamed from: b (double[], int, int, int, int, int, int) double[]
   private double[] method_6342(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      String[] var8;
      label202: {
         var8 = class_752.method_4253();
         double[] var10000 = var1;
         if(var8 != null) {
            if(var1 != null) {
               break label202;
            }

            var10000 = new double[var5 * var6 * var7];
         }

         var1 = var10000;
      }

      double var9 = 684.412D;
      double var11 = 2053.236D;
      this.field_5936 = this.field_5924.method_6904(this.field_5936, var2, var3, var4, var5, 1, var7, 1.0D, 0.0D, 1.0D);
      this.field_5937 = this.field_5925.method_6904(this.field_5937, var2, var3, var4, var5, 1, var7, 100.0D, 0.0D, 100.0D);
      this.field_5933 = this.field_5921.method_6904(this.field_5933, var2, var3, var4, var5, var6, var7, var9 / 80.0D, var11 / 60.0D, var9 / 80.0D);
      this.field_5934 = this.field_5919.method_6904(this.field_5934, var2, var3, var4, var5, var6, var7, var9, var11, var9);
      this.field_5935 = this.field_5920.method_6904(this.field_5935, var2, var3, var4, var5, var6, var7, var9, var11, var9);
      int var13 = 0;
      int var14 = 0;
      double[] var15 = new double[var6];
      int var16 = 0;

      int var10001;
      int var37;
      double var38;
      double var39;
      while(true) {
         if(var16 < var6) {
            label190: {
               double var17;
               label206: {
                  var15[var16] = Math.cos((double)var16 * 3.141592653589793D * 6.0D / (double)var6) * 2.0D;
                  var17 = (double)var16;
                  var37 = var16;
                  if(var8 != null) {
                     var10001 = var6 / 2;
                     if(var8 == null) {
                        break;
                     }

                     if(var16 > var10001) {
                        var17 = (double)(var6 - 1 - var16);
                     }

                     var38 = var17;
                     var39 = 4.0D;
                     if(var8 == null) {
                        break label206;
                     }

                     double var41;
                     var37 = (var41 = var17 - 4.0D) == 0.0D?0:(var41 < 0.0D?-1:1);
                  }

                  if(var37 >= 0) {
                     break label190;
                  }

                  var38 = 4.0D;
                  var39 = var17;
               }

               var17 = var38 - var39;
               var15[var16] -= var17 * var17 * var17 * 10.0D;
            }

            ++var16;
            if(var8 != null) {
               continue;
            }
         }

         var16 = 0;
         var37 = var16;
         var10001 = var5;
         break;
      }

      label176:
      for(; var37 < var10001; var10001 = var5) {
         int var40 = 0;

         label171:
         while(true) {
            var37 = var40;

            label168:
            while(var37 < var7) {
               double var18 = (this.field_5936[var14] + 256.0D) / 512.0D;
               var38 = var18;
               if(var8 != null) {
                  double var42;
                  var37 = (var42 = var18 - 1.0D) == 0.0D?0:(var42 < 0.0D?-1:1);
                  if(var8 == null) {
                     continue label176;
                  }

                  if(var37 > 0) {
                     var18 = 1.0D;
                  }

                  var38 = 0.0D;
               }

               double var20 = var38;
               double var22 = this.field_5937[var14] / 8000.0D;
               double var43;
               var37 = (var43 = var22 - 0.0D) == 0.0D?0:(var43 < 0.0D?-1:1);
               if(var8 != null) {
                  if(var37 < 0) {
                     var22 = -var22;
                  }

                  var22 = var22 * 3.0D - 3.0D;
                  double var44;
                  var37 = (var44 = var22 - 0.0D) == 0.0D?0:(var44 < 0.0D?-1:1);
               }

               label137: {
                  label212: {
                     if(var8 != null) {
                        if(var37 < 0) {
                           var22 /= 2.0D;
                           var38 = var22;
                           var39 = -1.0D;
                           if(var8 != null) {
                              if(var22 < -1.0D) {
                                 var22 = -1.0D;
                              }

                              var22 /= 1.4D;
                              var38 = var22;
                              var39 = 2.0D;
                           }

                           var22 = var38 / var39;
                           var18 = 0.0D;
                           if(var8 != null) {
                              break label137;
                           }
                        }

                        var38 = var22;
                        var39 = 1.0D;
                        if(var8 == null) {
                           break label212;
                        }

                        double var45;
                        var37 = (var45 = var22 - 1.0D) == 0.0D?0:(var45 < 0.0D?-1:1);
                     }

                     if(var37 > 0) {
                        var22 = 1.0D;
                     }

                     var38 = var22;
                     var39 = 6.0D;
                  }

                  var22 = var38 / var39;
               }

               var18 += 0.5D;
               var22 = var22 * (double)var6 / 16.0D;
               ++var14;
               int var24 = 0;

               while(var24 < var6) {
                  double var25 = 0.0D;
                  double var27 = var15[var24];
                  double var29 = this.field_5934[var13] / 512.0D;
                  double var31 = this.field_5935[var13] / 512.0D;
                  double var33 = (this.field_5933[var13] / 10.0D + 1.0D) / 2.0D;
                  double var46;
                  var37 = (var46 = var33 - 0.0D) == 0.0D?0:(var46 < 0.0D?-1:1);
                  if(var8 == null) {
                     continue label168;
                  }

                  label125: {
                     label215: {
                        if(var8 != null) {
                           if(var37 < 0) {
                              var25 = var29;
                              if(var8 != null) {
                                 break label125;
                              }
                           }

                           var38 = var33;
                           var39 = 1.0D;
                           if(var8 == null) {
                              break label215;
                           }

                           double var47;
                           var37 = (var47 = var33 - 1.0D) == 0.0D?0:(var47 < 0.0D?-1:1);
                        }

                        if(var37 > 0) {
                           var25 = var31;
                           if(var8 != null) {
                              break label125;
                           }
                        }

                        var38 = var29;
                        var39 = (var31 - var29) * var33;
                     }

                     var25 = var38 + var39;
                  }

                  label217: {
                     double var35;
                     label218: {
                        var25 -= var27;
                        var37 = var24;
                        if(var8 != null) {
                           if(var24 > var6 - 4) {
                              var35 = (double)((float)(var24 - (var6 - 4)) / 3.0F);
                              var25 = var25 * (1.0D - var35) + -10.0D * var35;
                           }

                           var38 = (double)var24;
                           var39 = var20;
                           if(var8 == null) {
                              break label218;
                           }

                           double var48;
                           var37 = (var48 = var38 - var20) == 0.0D?0:(var48 < 0.0D?-1:1);
                        }

                        if(var37 >= 0) {
                           break label217;
                        }

                        var38 = var20 - (double)var24;
                        var39 = 4.0D;
                     }

                     label220: {
                        var35 = var38 / var39;
                        double var49;
                        var37 = (var49 = var35 - 0.0D) == 0.0D?0:(var49 < 0.0D?-1:1);
                        if(var8 != null) {
                           if(var37 < 0) {
                              var35 = 0.0D;
                           }

                           var38 = var35;
                           var39 = 1.0D;
                           if(var8 == null) {
                              break label220;
                           }

                           double var50;
                           var37 = (var50 = var35 - 1.0D) == 0.0D?0:(var50 < 0.0D?-1:1);
                        }

                        if(var37 > 0) {
                           var35 = 1.0D;
                        }

                        var38 = var25 * (1.0D - var35);
                        var39 = -10.0D * var35;
                     }

                     var25 = var38 + var39;
                  }

                  var1[var13] = var25;
                  ++var13;
                  ++var24;
                  if(var8 == null) {
                     break;
                  }
               }

               ++var40;
               if(var8 != null) {
                  continue label171;
               }
               break;
            }

            ++var16;
            if(var8 == null) {
               return var1;
            }

            var37 = var16;
            break;
         }
      }

      return var1;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_103(int var1, int var2) {
      return true;
   }

   // $FF: renamed from: b (gG, int, int) void
   public void method_106(class_25 var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      class_464.field_2229 = true;
      String[] var4 = var10000;
      int var5 = var2 * 16;
      int var6 = var3 * 16;
      this.field_5928.method_5964(this.field_5926, this.field_5918, var2, var3);
      int var7 = 0;

      int var8;
      int var9;
      int var10;
      class_1191 var14;
      while(true) {
         if(var7 < 8) {
            var8 = var5 + this.field_5918.nextInt(16) + 8;
            var9 = this.field_5918.nextInt(120) + 4;
            var10 = var6 + this.field_5918.nextInt(16) + 8;
            var14 = new class_1191;
            var14.method_6409(class_1192.field_6035, false);
            var14.method_6351(this.field_5926, this.field_5918, var8, var9, var10);
            ++var7;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var7 = this.field_5918.nextInt(this.field_5918.nextInt(10) + 1) + 1;
         break;
      }

      var8 = 0;

      int var11;
      while(true) {
         if(var8 < var7) {
            var9 = var5 + this.field_5918.nextInt(16) + 8;
            var10 = this.field_5918.nextInt(120) + 4;
            var11 = var6 + this.field_5918.nextInt(16) + 8;
            class_1153 var15 = new class_1153;
            var15.method_6349();
            var15.method_6351(this.field_5926, this.field_5918, var9, var10, var11);
            ++var8;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var7 = this.field_5918.nextInt(this.field_5918.nextInt(10) + 1);
         break;
      }

      var8 = 0;

      while(true) {
         if(var8 < var7) {
            var9 = var5 + this.field_5918.nextInt(16) + 8;
            var10 = this.field_5918.nextInt(120) + 4;
            var11 = var6 + this.field_5918.nextInt(16) + 8;
            class_1186 var16 = new class_1186;
            var16.method_6349();
            var16.method_6351(this.field_5926, this.field_5918, var9, var10, var11);
            ++var8;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var8 = 0;
         break;
      }

      int var18;
      class_1154 var19;
      label74: {
         while(true) {
            if(var8 < 10) {
               var9 = var5 + this.field_5918.nextInt(16) + 8;
               var10 = this.field_5918.nextInt(128);
               var11 = var6 + this.field_5918.nextInt(16) + 8;
               class_1152 var17 = new class_1152;
               var17.method_6349();
               var17.method_6351(this.field_5926, this.field_5918, var9, var10, var11);
               ++var8;
               if(var4 == null) {
                  break;
               }

               if(var4 != null) {
                  continue;
               }
            }

            var18 = this.field_5918.nextInt(1);
            if(var4 == null) {
               break label74;
            }

            if(var18 == 0) {
               var8 = var5 + this.field_5918.nextInt(16) + 8;
               var9 = this.field_5918.nextInt(128);
               var10 = var6 + this.field_5918.nextInt(16) + 8;
               var19 = new class_1154;
               var19.method_6355(class_1192.field_6066);
               var19.method_6351(this.field_5926, this.field_5918, var8, var9, var10);
            }
            break;
         }

         var18 = this.field_5918.nextInt(1);
      }

      label62: {
         if(var4 != null) {
            if(var18 != 0) {
               break label62;
            }

            var8 = var5 + this.field_5918.nextInt(16) + 8;
            var18 = this.field_5918.nextInt(128);
         }

         var9 = var18;
         var10 = var6 + this.field_5918.nextInt(16) + 8;
         var19 = new class_1154;
         var19.method_6355(class_1192.field_6067);
         var19.method_6351(this.field_5926, this.field_5918, var8, var9, var10);
      }

      class_1183 var20 = new class_1183;
      var20.method_6402(class_1192.field_6177, 13, class_1192.field_6113);
      class_1183 var12 = var20;
      var9 = 0;

      int var13;
      while(true) {
         if(var9 < 16) {
            var10 = var5 + this.field_5918.nextInt(16);
            var11 = this.field_5918.nextInt(108) + 10;
            var13 = var6 + this.field_5918.nextInt(16);
            var12.method_6351(this.field_5926, this.field_5918, var10, var11, var13);
            ++var9;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var9 = 0;
         break;
      }

      while(true) {
         if(var9 < 16) {
            var10 = var5 + this.field_5918.nextInt(16);
            var11 = this.field_5918.nextInt(108) + 10;
            var13 = var6 + this.field_5918.nextInt(16);
            var14 = new class_1191;
            var14.method_6409(class_1192.field_6035, true);
            var14.method_6351(this.field_5926, this.field_5918, var10, var11, var13);
            ++var9;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         class_464.field_2229 = false;
         break;
      }

   }

   // $FF: renamed from: b (boolean, vu) boolean
   public boolean method_107(boolean var1, class_81 var2) {
      return true;
   }

   // $FF: renamed from: e () void
   public void method_115() {}

   // $FF: renamed from: a () boolean
   public boolean method_108() {
      return false;
   }

   // $FF: renamed from: b () boolean
   public boolean method_109() {
      return true;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_110() {
      String[] var10000 = field_5939;
      return "HellRandomLevelSource";
   }

   // $FF: renamed from: b (as, int, int, int) java.util.List
   public List method_111(class_922 var1, int var2, int var3, int var4) {
      int var10001;
      int var10002;
      ahb var8;
      label31: {
         class_1149 var7;
         label30: {
            String[] var5 = class_752.method_4253();
            if(var1 == class_922.field_4652) {
               boolean var10000 = this.field_5928.method_5965(var2, var3, var4);
               if(var5 != null) {
                  if(var10000) {
                     return this.field_5928.method_5981();
                  }

                  var7 = this;
                  if(var5 == null) {
                     break label30;
                  }

                  var10000 = this.field_5928.method_5967(var2, var3, var4);
               }

               if(var10000) {
                  var8 = this.field_5926;
                  var10001 = var2;
                  var10002 = var3 - 1;
                  if(var5 == null) {
                     break label31;
                  }

                  if(this.field_5926.getBlock(var2, var10002, var4) == class_1192.field_6137) {
                     return this.field_5928.method_5981();
                  }
               }
            }

            var7 = this;
         }

         var8 = var7.field_5926;
         var10001 = var2;
         var10002 = var4;
      }

      class_985 var6 = var8.method_35(var10001, var10002);
      return var6.method_5706(var1);
   }

   // $FF: renamed from: b (ahb, java.lang.String, int, int, int) dd
   public class_1034 method_112(ahb var1, String var2, int var3, int var4, int var5) {
      return null;
   }

   // $FF: renamed from: d () int
   public int method_113() {
      return 0;
   }

   // $FF: renamed from: f (int, int) void
   public void method_114(int var1, int var2) {
      this.field_5928.method_5961(this, this.field_5926, var1, var2, (aji[])null);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6343() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "eRácT-an{Ò?6IÏBqÓ^ÄJMÑ&KÄ";
      int var4 = "eRácT-an{Ò?6IÏBqÓ^ÄJMÑ&KÄ".length();
      char var1 = 11;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5939 = var5;
                  String[] var10 = field_5939;
                  field_5938 = "CL_00000392";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 43;
               break;
            case 1:
               var10009 = 19;
               break;
            case 2:
               var10009 = 179;
               break;
            case 3:
               var10009 = 94;
               break;
            case 4:
               var10009 = 105;
               break;
            case 5:
               var10009 = 37;
               break;
            default:
               var10009 = 172;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
