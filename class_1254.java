import java.util.List;
import java.util.Random;

// $FF: renamed from: ha
public class class_1254 implements class_25 {

   // $FF: renamed from: a java.util.Random
   private Random field_6502;
   // $FF: renamed from: b jc
   private class_1308 field_6503;
   // $FF: renamed from: c jc
   private class_1308 field_6504;
   // $FF: renamed from: d jc
   private class_1308 field_6505;
   // $FF: renamed from: e jc
   public class_1308 field_6506;
   // $FF: renamed from: f jc
   public class_1308 field_6507;
   // $FF: renamed from: g ahb
   private ahb field_6508;
   // $FF: renamed from: h double[]
   private double[] field_6509;
   // $FF: renamed from: i dz[]
   private class_985[] field_6510;
   // $FF: renamed from: j double[]
   double[] field_6511;
   // $FF: renamed from: k double[]
   double[] field_6512;
   // $FF: renamed from: l double[]
   double[] field_6513;
   // $FF: renamed from: m double[]
   double[] field_6514;
   // $FF: renamed from: n double[]
   double[] field_6515;
   // $FF: renamed from: o int[][]
   int[][] field_6516;
   // $FF: renamed from: p java.lang.String
   private static final String field_6517 = "RandomLevelSource";


   // $FF: renamed from: <init> (ahb, long) void
   public void method_6604(ahb var1, long var2) {
      super();
      this.field_6516 = new int[32][32];
      this.field_6508 = var1;
      this.field_6502 = new Random(var2);
      class_1308 var10001 = new class_1308;
      var10001.method_6903(this.field_6502, 16);
      this.field_6503 = var10001;
      var10001 = new class_1308;
      var10001.method_6903(this.field_6502, 16);
      this.field_6504 = var10001;
      var10001 = new class_1308;
      var10001.method_6903(this.field_6502, 8);
      this.field_6505 = var10001;
      var10001 = new class_1308;
      var10001.method_6903(this.field_6502, 10);
      this.field_6506 = var10001;
      var10001 = new class_1308;
      var10001.method_6903(this.field_6502, 16);
      this.field_6507 = var10001;
   }

   // $FF: renamed from: b (int, int, aji[], dz[]) void
   public void method_6605(int var1, int var2, aji[] var3, class_985[] var4) {
      String[] var10000 = class_752.method_4253();
      byte var6 = 2;
      int var7 = var6 + 1;
      String[] var5 = var10000;
      byte var8 = 33;
      int var9 = var6 + 1;
      this.field_6509 = this.method_6607(this.field_6509, var1 * var6, 0, var2 * var6, var7, var8, var9);
      int var10 = 0;

      do {
         int var53 = var10;

         label95:
         while(true) {
            if(var53 >= var6) {
               return;
            }

            int var11 = 0;

            while(true) {
               var53 = var11;

               label91:
               while(true) {
                  if(var53 >= var6) {
                     break label95;
                  }

                  var53 = 0;
                  if(var5 == null) {
                     continue label95;
                  }

                  int var12 = 0;

                  label88:
                  do {
                     var53 = var12;

                     label85:
                     while(true) {
                        if(var53 >= 32) {
                           break label88;
                        }

                        double var13 = 0.25D;
                        double var15 = this.field_6509[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 0];
                        double var17 = this.field_6509[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 0];
                        double var19 = this.field_6509[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 0];
                        double var21 = this.field_6509[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 0];
                        double var23 = (this.field_6509[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 1] - var15) * var13;
                        double var25 = (this.field_6509[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 1] - var17) * var13;
                        double var27 = (this.field_6509[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 1] - var19) * var13;
                        double var29 = (this.field_6509[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 1] - var21) * var13;
                        var53 = 0;
                        if(var5 == null) {
                           continue label91;
                        }

                        int var31 = 0;

                        while(true) {
                           var53 = var31;

                           label81:
                           while(true) {
                              if(var53 >= 4) {
                                 break label85;
                              }

                              double var32 = 0.125D;
                              double var34 = var15;
                              double var36 = var17;
                              double var38 = (var19 - var15) * var32;
                              double var40 = (var21 - var17) * var32;
                              var53 = 0;
                              if(var5 == null) {
                                 continue label85;
                              }

                              int var42 = 0;

                              label78:
                              do {
                                 var53 = var42;

                                 label75:
                                 while(true) {
                                    if(var53 >= 8) {
                                       break label78;
                                    }

                                    int var43 = var42 + var10 * 8 << 11 | 0 + var11 * 8 << 7 | var12 * 4 + var31;
                                    short var44 = 128;
                                    double var45 = 0.125D;
                                    double var47 = var34;
                                    double var49 = (var36 - var34) * var45;
                                    var53 = 0;
                                    if(var5 == null) {
                                       continue label81;
                                    }

                                    int var51 = 0;

                                    while(true) {
                                       if(var51 >= 8) {
                                          break label75;
                                       }

                                       aji var52 = null;
                                       double var54;
                                       var53 = (var54 = var47 - 0.0D) == 0.0D?0:(var54 < 0.0D?-1:1);
                                       if(var5 == null) {
                                          break;
                                       }

                                       if(var53 > 0) {
                                          var52 = class_1192.field_6145;
                                       }

                                       var3[var43] = var52;
                                       var43 += var44;
                                       var47 += var49;
                                       ++var51;
                                       if(var5 == null) {
                                          break label75;
                                       }
                                    }
                                 }

                                 var34 += var38;
                                 var36 += var40;
                                 ++var42;
                              } while(var5 != null);

                              var15 += var23;
                              var17 += var25;
                              var19 += var27;
                              var21 += var29;
                              ++var31;
                              if(var5 == null) {
                                 break label85;
                              }
                              break;
                           }
                        }
                     }

                     ++var12;
                  } while(var5 != null);

                  ++var11;
                  if(var5 == null) {
                     break label95;
                  }
                  break;
               }
            }
         }

         ++var10;
      } while(var5 != null);

   }

   // $FF: renamed from: c (int, int, aji[], dz[]) void
   public void method_6606(int var1, int var2, aji[] var3, class_985[] var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      String[] var5 = var10000;

      do {
         int var15 = var6;

         label97:
         while(true) {
            if(var15 >= 16) {
               return;
            }

            int var7 = 0;

            while(true) {
               if(var7 >= 16) {
                  break label97;
               }

               byte var8 = 1;
               int var9 = -1;
               aji var10 = class_1192.field_6145;
               aji var16 = class_1192.field_6145;

               label93:
               while(true) {
                  aji var11 = var16;
                  var15 = 127;
                  if(var5 == null) {
                     continue label97;
                  }

                  int var12 = 127;

                  while(var12 >= 0) {
                     label87: {
                        int var13;
                        label86: {
                           aji var14;
                           label85: {
                              var13 = (var7 * 16 + var6) * 128 + var12;
                              var14 = var3[var13];
                              if(var5 != null) {
                                 var16 = var14;
                                 if(var5 == null) {
                                    continue label93;
                                 }

                                 if(var14 != null) {
                                    var16 = var14;
                                    if(var5 == null) {
                                       break label86;
                                    }

                                    if(var14.method_2424() != awt.field_4170) {
                                       break label85;
                                    }
                                 }

                                 var9 = -1;
                              }

                              if(var5 != null) {
                                 break label87;
                              }
                           }

                           var16 = var14;
                        }

                        if(var16 == class_1192.field_6026) {
                           label72: {
                              var15 = var9;
                              if(var5 != null) {
                                 if(var9 == -1) {
                                    label110: {
                                       var15 = var8;
                                       if(var5 != null) {
                                          if(var8 <= 0) {
                                             var10 = null;
                                             var11 = class_1192.field_6145;
                                          }

                                          var9 = var8;
                                          if(var5 == null) {
                                             break label110;
                                          }

                                          var15 = var12;
                                       }

                                       if(var15 >= 0) {
                                          var3[var13] = var10;
                                          if(var5 != null) {
                                             break label72;
                                          }
                                       }

                                       var3[var13] = var11;
                                    }

                                    if(var5 != null) {
                                       break label72;
                                    }
                                 }

                                 var15 = var9;
                              }

                              if(var15 > 0) {
                                 --var9;
                                 var3[var13] = var11;
                              }
                           }
                        }
                     }

                     --var12;
                     if(var5 == null) {
                        break;
                     }
                  }

                  ++var7;
                  if(var5 == null) {
                     break label97;
                  }
                  break;
               }
            }
         }

         ++var6;
      } while(var5 != null);

   }

   // $FF: renamed from: d (int, int) gI
   public class_1069 method_105(int var1, int var2) {
      return this.method_104(var1, var2);
   }

   // $FF: renamed from: c (int, int) gI
   public class_1069 method_104(int var1, int var2) {
      this.field_6502.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      String[] var10000 = class_752.method_4253();
      aji[] var4 = new aji['\u8000'];
      String[] var3 = var10000;
      this.field_6510 = this.field_6508.method_2041().method_5541(this.field_6510, var1 * 16, var2 * 16, 16, 16);
      this.method_6605(var1, var2, var4, this.field_6510);
      this.method_6606(var1, var2, var4, this.field_6510);
      class_1069 var8 = new class_1069;
      var8.method_6014(this.field_6508, var4, var1, var2);
      class_1069 var5 = var8;
      byte[] var6 = var5.method_6060();
      int var7 = 0;

      while(true) {
         if(var7 < var6.length) {
            var6[var7] = (byte)this.field_6510[var7].field_5050;
            ++var7;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var5.method_6021();
         break;
      }

      return var5;
   }

   // $FF: renamed from: b (double[], int, int, int, int, int, int) double[]
   private double[] method_6607(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      String[] var8;
      label171: {
         var8 = class_752.method_4253();
         double[] var10000 = var1;
         if(var8 != null) {
            if(var1 != null) {
               break label171;
            }

            var10000 = new double[var5 * var6 * var7];
         }

         var1 = var10000;
      }

      double var9 = 684.412D;
      double var11 = 684.412D;
      this.field_6514 = this.field_6506.method_6905(this.field_6514, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
      this.field_6515 = this.field_6507.method_6905(this.field_6515, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
      var9 *= 2.0D;
      this.field_6511 = this.field_6505.method_6904(this.field_6511, var2, var3, var4, var5, var6, var7, var9 / 80.0D, var11 / 160.0D, var9 / 80.0D);
      this.field_6512 = this.field_6503.method_6904(this.field_6512, var2, var3, var4, var5, var6, var7, var9, var11, var9);
      this.field_6513 = this.field_6504.method_6904(this.field_6513, var2, var3, var4, var5, var6, var7, var9, var11, var9);
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;

      do {
         int var40 = var15;

         label161:
         while(true) {
            if(var40 >= var5) {
               return var1;
            }

            int var16 = 0;

            while(true) {
               var40 = var16;

               label157:
               while(true) {
                  if(var40 >= var7) {
                     break label161;
                  }

                  double var17 = (this.field_6514[var14] + 256.0D) / 512.0D;
                  double var41 = var17;
                  double var10001 = 1.0D;
                  if(var8 != null) {
                     double var43;
                     var40 = (var43 = var17 - 1.0D) == 0.0D?0:(var43 < 0.0D?-1:1);
                     if(var8 == null) {
                        continue label161;
                     }

                     if(var40 > 0) {
                        var17 = 1.0D;
                     }

                     var41 = this.field_6515[var14];
                     var10001 = 8000.0D;
                  }

                  double var19 = var41 / var10001;
                  double var44;
                  var40 = (var44 = var19 - 0.0D) == 0.0D?0:(var44 < 0.0D?-1:1);
                  if(var8 != null) {
                     if(var40 < 0) {
                        var19 = -var19 * 0.3D;
                     }

                     var19 = var19 * 3.0D - 2.0D;
                     var40 = var15 + var2 - 0;
                  }

                  float var21 = (float)var40 / 1.0F;
                  float var22 = (float)(var16 + var4 - 0) / 1.0F;
                  float var23 = 100.0F - class_1715.method_9557(var21 * var21 + var22 * var22) * 8.0F;
                  float var45;
                  var40 = (var45 = var23 - 80.0F) == 0.0F?0:(var45 < 0.0F?-1:1);
                  if(var8 != null) {
                     if(var40 > 0) {
                        var23 = 80.0F;
                     }

                     float var46;
                     var40 = (var46 = var23 - -100.0F) == 0.0F?0:(var46 < 0.0F?-1:1);
                  }

                  if(var8 != null) {
                     if(var40 < 0) {
                        var23 = -100.0F;
                     }

                     double var47;
                     var40 = (var47 = var19 - 1.0D) == 0.0D?0:(var47 < 0.0D?-1:1);
                  }

                  if(var8 != null) {
                     if(var40 > 0) {
                        var19 = 1.0D;
                     }

                     var19 /= 8.0D;
                     var19 = 0.0D;
                     double var48;
                     var40 = (var48 = var17 - 0.0D) == 0.0D?0:(var48 < 0.0D?-1:1);
                  }

                  if(var8 != null) {
                     if(var40 < 0) {
                        var17 = 0.0D;
                     }

                     var17 += 0.5D;
                     var19 = var19 * (double)var6 / 16.0D;
                     ++var14;
                     var40 = var6;
                  }

                  double var24 = (double)var40 / 2.0D;
                  int var26 = 0;

                  while(var26 < var6) {
                     double var27 = 0.0D;
                     double var29 = ((double)var26 - var24) * 8.0D / var17;
                     var41 = var29;
                     var10001 = 0.0D;
                     if(var8 != null) {
                        double var49;
                        var40 = (var49 = var29 - 0.0D) == 0.0D?0:(var49 < 0.0D?-1:1);
                        if(var8 == null) {
                           continue label157;
                        }

                        if(var40 < 0) {
                           var29 *= -1.0D;
                        }

                        var41 = this.field_6512[var13];
                        var10001 = 512.0D;
                     }

                     label151: {
                        label180: {
                           double var31 = var41 / var10001;
                           double var33 = this.field_6513[var13] / 512.0D;
                           double var35 = (this.field_6511[var13] / 10.0D + 1.0D) / 2.0D;
                           double var50;
                           var40 = (var50 = var35 - 0.0D) == 0.0D?0:(var50 < 0.0D?-1:1);
                           if(var8 != null) {
                              if(var40 < 0) {
                                 var27 = var31;
                                 if(var8 != null) {
                                    break label151;
                                 }
                              }

                              var41 = var35;
                              var10001 = 1.0D;
                              if(var8 == null) {
                                 break label180;
                              }

                              double var51;
                              var40 = (var51 = var35 - 1.0D) == 0.0D?0:(var51 < 0.0D?-1:1);
                           }

                           if(var40 > 0) {
                              var27 = var33;
                              if(var8 != null) {
                                 break label151;
                              }
                           }

                           var41 = var31;
                           var10001 = (var33 - var31) * var35;
                        }

                        var27 = var41 + var10001;
                     }

                     label182: {
                        var27 -= 8.0D;
                        var27 += (double)var23;
                        byte var37 = 2;
                        var40 = var26;
                        int var42 = var6 / 2 - var37;
                        double var38;
                        if(var8 != null) {
                           if(var26 > var42) {
                              label184: {
                                 var38 = (double)((float)(var26 - (var6 / 2 - var37)) / 64.0F);
                                 double var52;
                                 var40 = (var52 = var38 - 0.0D) == 0.0D?0:(var52 < 0.0D?-1:1);
                                 if(var8 != null) {
                                    if(var40 < 0) {
                                       var38 = 0.0D;
                                    }

                                    var41 = var38;
                                    var10001 = 1.0D;
                                    if(var8 == null) {
                                       break label184;
                                    }

                                    double var53;
                                    var40 = (var53 = var38 - 1.0D) == 0.0D?0:(var53 < 0.0D?-1:1);
                                 }

                                 if(var40 > 0) {
                                    var38 = 1.0D;
                                 }

                                 var41 = var27 * (1.0D - var38);
                                 var10001 = -3000.0D * var38;
                              }

                              var27 = var41 + var10001;
                           }

                           var37 = 8;
                           if(var8 == null) {
                              break label182;
                           }

                           var40 = var26;
                           var42 = var37;
                        }

                        if(var40 < var42) {
                           var38 = (double)((float)(var37 - var26) / ((float)var37 - 1.0F));
                           var27 = var27 * (1.0D - var38) + -30.0D * var38;
                        }

                        var1[var13] = var27;
                        ++var13;
                        ++var26;
                     }

                     if(var8 == null) {
                        break;
                     }
                  }

                  ++var16;
                  if(var8 == null) {
                     break label161;
                  }
                  break;
               }
            }
         }

         ++var15;
      } while(var8 != null);

      return var1;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_103(int var1, int var2) {
      return true;
   }

   // $FF: renamed from: b (gG, int, int) void
   public void method_106(class_25 var1, int var2, int var3) {
      class_464.field_2229 = true;
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      class_985 var6 = this.field_6508.method_35(var4 + 16, var5 + 16);
      var6.method_5714(this.field_6508, this.field_6508.field_1819, var4, var5);
      class_464.field_2229 = false;
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
      return "RandomLevelSource";
   }

   // $FF: renamed from: b (as, int, int, int) java.util.List
   public List method_111(class_922 var1, int var2, int var3, int var4) {
      class_985 var5 = this.field_6508.method_35(var2, var4);
      return var5.method_5706(var1);
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
   public void method_114(int var1, int var2) {}

   // $FF: renamed from: <clinit> () void
   static void method_6608() {
      boolean var10000 = true;
      char[] var10003 = "¤µÕ÷1Hz¢Þÿ\rJC·Þ".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6517 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 148;
            break;
         case 1:
            var10009 = 182;
            break;
         case 2:
            var10009 = 217;
            break;
         case 3:
            var10009 = 241;
            break;
         case 4:
            var10009 = 60;
            break;
         case 5:
            var10009 = 71;
            break;
         default:
            var10009 = 84;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
