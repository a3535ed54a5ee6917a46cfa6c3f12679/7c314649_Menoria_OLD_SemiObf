import java.util.List;
import java.util.Random;

// $FF: renamed from: g_
public class class_1150 implements class_25 {

   // $FF: renamed from: a java.util.Random
   private Random field_5940;
   // $FF: renamed from: b jc
   private class_1308 field_5941;
   // $FF: renamed from: c jc
   private class_1308 field_5942;
   // $FF: renamed from: d jc
   private class_1308 field_5943;
   // $FF: renamed from: e jd
   private class_1307 field_5944;
   // $FF: renamed from: f jc
   public class_1308 field_5945;
   // $FF: renamed from: g jc
   public class_1308 field_5946;
   // $FF: renamed from: h jc
   public class_1308 field_5947;
   // $FF: renamed from: i ahb
   private ahb field_5948;
   // $FF: renamed from: j boolean
   private final boolean field_5949;
   // $FF: renamed from: k du
   private class_1046 field_5950;
   // $FF: renamed from: l double[]
   private final double[] field_5951;
   // $FF: renamed from: m float[]
   private final float[] field_5952;
   // $FF: renamed from: n double[]
   private double[] field_5953;
   // $FF: renamed from: o g0
   private class_1051 field_5954;
   // $FF: renamed from: p g8
   private class_1054 field_5955;
   // $FF: renamed from: q g9
   private class_1053 field_5956;
   // $FF: renamed from: r g5
   private class_1057 field_5957;
   // $FF: renamed from: s g7
   private class_1055 field_5958;
   // $FF: renamed from: t g0
   private class_1051 field_5959;
   // $FF: renamed from: u dz[]
   private class_985[] field_5960;
   // $FF: renamed from: v double[]
   double[] field_5961;
   // $FF: renamed from: w double[]
   double[] field_5962;
   // $FF: renamed from: x double[]
   double[] field_5963;
   // $FF: renamed from: y double[]
   double[] field_5964;
   // $FF: renamed from: z int[][]
   int[][] field_5965;
   // $FF: renamed from: A java.lang.String[]
   private static final String[] field_5966;


   // $FF: renamed from: <init> (ahb, long, boolean) void
   public void method_6344(ahb var1, long var2, boolean var4) {
      String[] var10000 = class_752.method_4253();
      super();
      this.field_5953 = new double[256];
      class_1059 var10002 = new class_1059;
      var10002.method_5960();
      this.field_5954 = var10002;
      class_1054 var10 = new class_1054;
      var10.method_5960();
      this.field_5955 = var10;
      class_1053 var11 = new class_1053;
      var11.method_5960();
      this.field_5956 = var11;
      class_1057 var12 = new class_1057;
      var12.method_5960();
      this.field_5957 = var12;
      class_1055 var13 = new class_1055;
      var13.method_5960();
      this.field_5958 = var13;
      class_1060 var14 = new class_1060;
      var14.method_5960();
      this.field_5959 = var14;
      this.field_5965 = new int[32][32];
      this.field_5948 = var1;
      this.field_5949 = var4;
      this.field_5950 = var1.method_2195().method_6868();
      this.field_5940 = new Random(var2);
      String[] var5 = var10000;
      class_1308 var10001 = new class_1308;
      var10001.method_6903(this.field_5940, 16);
      this.field_5941 = var10001;
      var10001 = new class_1308;
      var10001.method_6903(this.field_5940, 16);
      this.field_5942 = var10001;
      var10001 = new class_1308;
      var10001.method_6903(this.field_5940, 8);
      this.field_5943 = var10001;
      class_1307 var9 = new class_1307;
      var9.method_6899(this.field_5940, 4);
      this.field_5944 = var9;
      var10001 = new class_1308;
      var10001.method_6903(this.field_5940, 10);
      this.field_5945 = var10001;
      var10001 = new class_1308;
      var10001.method_6903(this.field_5940, 16);
      this.field_5946 = var10001;
      var10001 = new class_1308;
      var10001.method_6903(this.field_5940, 8);
      this.field_5947 = var10001;
      this.field_5951 = new double[825];
      this.field_5952 = new float[25];
      int var6 = -2;

      while(var6 <= 2) {
         int var7 = -2;

         while(true) {
            if(var7 <= 2) {
               float var8 = 10.0F / class_1715.method_9557((float)(var6 * var6 + var7 * var7) + 0.2F);
               this.field_5952[var6 + 2 + (var7 + 2) * 5] = var8;
               ++var7;
               if(var5 == null) {
                  break;
               }

               if(var5 != null) {
                  continue;
               }
            }

            ++var6;
            break;
         }

         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int, int, aji[]) void
   public void method_6345(int var1, int var2, aji[] var3) {
      byte var5 = 63;
      this.field_5960 = this.field_5948.method_2041().method_5540(this.field_5960, var1 * 4 - 2, var2 * 4 - 2, 10, 10);
      String[] var10000 = class_752.method_4253();
      this.method_6347(var1 * 4, 0, var2 * 4);
      String[] var4 = var10000;
      int var6 = 0;

      do {
         int var54 = var6;

         label108:
         while(true) {
            if(var54 >= 4) {
               return;
            }

            int var7 = var6 * 5;
            int var8 = (var6 + 1) * 5;
            int var9 = 0;

            while(true) {
               var54 = var9;

               label104:
               while(true) {
                  if(var54 >= 4) {
                     break label108;
                  }

                  int var10 = (var7 + var9) * 33;
                  int var11 = (var7 + var9 + 1) * 33;
                  int var12 = (var8 + var9) * 33;
                  int var13 = (var8 + var9 + 1) * 33;
                  var54 = 0;
                  if(var4 == null) {
                     continue label108;
                  }

                  int var14 = 0;

                  label101:
                  do {
                     var54 = var14;

                     label98:
                     while(true) {
                        if(var54 >= 32) {
                           break label101;
                        }

                        double var15 = 0.125D;
                        double var17 = this.field_5951[var10 + var14];
                        double var19 = this.field_5951[var11 + var14];
                        double var21 = this.field_5951[var12 + var14];
                        double var23 = this.field_5951[var13 + var14];
                        double var25 = (this.field_5951[var10 + var14 + 1] - var17) * var15;
                        double var27 = (this.field_5951[var11 + var14 + 1] - var19) * var15;
                        double var29 = (this.field_5951[var12 + var14 + 1] - var21) * var15;
                        double var31 = (this.field_5951[var13 + var14 + 1] - var23) * var15;
                        var54 = 0;
                        if(var4 == null) {
                           continue label104;
                        }

                        int var33 = 0;

                        while(true) {
                           var54 = var33;

                           label94:
                           while(true) {
                              if(var54 >= 8) {
                                 break label98;
                              }

                              double var34 = 0.25D;
                              double var36 = var17;
                              double var38 = var19;
                              double var40 = (var21 - var17) * var34;
                              double var42 = (var23 - var19) * var34;
                              var54 = 0;
                              if(var4 == null) {
                                 continue label98;
                              }

                              int var44 = 0;

                              label91:
                              do {
                                 var54 = var44;

                                 label88:
                                 while(true) {
                                    if(var54 >= 4) {
                                       break label91;
                                    }

                                    int var45 = var44 + var6 * 4 << 12 | 0 + var9 * 4 << 8 | var14 * 8 + var33;
                                    short var46 = 256;
                                    var45 -= var46;
                                    double var47 = 0.25D;
                                    double var51 = (var38 - var36) * var47;
                                    double var49 = var36 - var51;
                                    var54 = 0;
                                    if(var4 == null) {
                                       continue label94;
                                    }

                                    int var53 = 0;

                                    while(true) {
                                       if(var53 >= 4) {
                                          break label88;
                                       }

                                       double var55;
                                       var54 = (var55 = (var49 += var51) - 0.0D) == 0.0D?0:(var55 < 0.0D?-1:1);
                                       if(var4 == null) {
                                          break;
                                       }

                                       label124: {
                                          if(var4 != null) {
                                             if(var54 > 0) {
                                                var3[var45 += var46] = class_1192.field_6026;
                                                if(var4 != null) {
                                                   break label124;
                                                }
                                             }

                                             var54 = var14 * 8 + var33;
                                          }

                                          if(var54 < var5) {
                                             var3[var45 += var46] = class_1192.field_6034;
                                             if(var4 != null) {
                                                break label124;
                                             }
                                          }

                                          var3[var45 += var46] = null;
                                       }

                                       ++var53;
                                       if(var4 == null) {
                                          break label88;
                                       }
                                    }
                                 }

                                 var36 += var40;
                                 var38 += var42;
                                 ++var44;
                              } while(var4 != null);

                              var17 += var25;
                              var19 += var27;
                              var21 += var29;
                              var23 += var31;
                              ++var33;
                              if(var4 == null) {
                                 break label98;
                              }
                              break;
                           }
                        }
                     }

                     ++var14;
                  } while(var4 != null);

                  ++var9;
                  if(var4 == null) {
                     break label108;
                  }
                  break;
               }
            }
         }

         ++var6;
      } while(var4 != null);

   }

   // $FF: renamed from: b (int, int, aji[], byte[], dz[]) void
   public void method_6346(int var1, int var2, aji[] var3, byte[] var4, class_985[] var5) {
      String[] var10000 = class_752.method_4253();
      double var7 = 0.03125D;
      this.field_5953 = this.field_5944.method_6901(this.field_5953, (double)(var1 * 16), (double)(var2 * 16), 16, 16, var7 * 2.0D, var7 * 2.0D, 1.0D);
      int var9 = 0;
      String[] var6 = var10000;

      while(var9 < 16) {
         int var10 = 0;

         while(true) {
            if(var10 < 16) {
               class_985 var11 = var5[var10 + var9 * 16];
               var11.method_5718(this.field_5948, this.field_5940, var3, var4, var1 * 16 + var9, var2 * 16 + var10, this.field_5953[var10 + var9 * 16]);
               ++var10;
               if(var6 == null) {
                  break;
               }

               if(var6 != null) {
                  continue;
               }
            }

            ++var9;
            break;
         }

         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (int, int) gI
   public class_1069 method_105(int var1, int var2) {
      return this.method_104(var1, var2);
   }

   // $FF: renamed from: c (int, int) gI
   public class_1069 method_104(int var1, int var2) {
      String[] var3;
      aji[] var4;
      byte[] var5;
      label27: {
         this.field_5940.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
         String[] var10000 = class_752.method_4253();
         var4 = new aji[65536];
         var5 = new byte[65536];
         this.method_6345(var1, var2, var4);
         var3 = var10000;
         this.field_5960 = this.field_5948.method_2041().method_5541(this.field_5960, var1 * 16, var2 * 16, 16, 16);
         this.method_6346(var1, var2, var4, var5, this.field_5960);
         this.field_5954.method_5961(this, this.field_5948, var1, var2, var4);
         this.field_5959.method_5961(this, this.field_5948, var1, var2, var4);
         class_1150 var9 = this;
         if(var3 != null) {
            if(!this.field_5949) {
               break label27;
            }

            this.field_5957.method_5961(this, this.field_5948, var1, var2, var4);
            this.field_5956.method_5961(this, this.field_5948, var1, var2, var4);
            this.field_5955.method_5961(this, this.field_5948, var1, var2, var4);
            var9 = this;
         }

         var9.field_5958.method_5961(this, this.field_5948, var1, var2, var4);
      }

      class_1069 var10 = new class_1069;
      var10.method_6015(this.field_5948, var4, var5, var1, var2);
      class_1069 var6 = var10;
      byte[] var7 = var6.method_6060();
      int var8 = 0;

      while(true) {
         if(var8 < var7.length) {
            var7[var8] = (byte)this.field_5960[var8].field_5050;
            ++var8;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var6.method_6021();
         break;
      }

      return var6;
   }

   // $FF: renamed from: b (int, int, int) void
   private void method_6347(int var1, int var2, int var3) {
      double var5 = 684.412D;
      double var7 = 684.412D;
      double var9 = 512.0D;
      double var11 = 512.0D;
      this.field_5964 = this.field_5946.method_6905(this.field_5964, var1, var3, 5, 5, 200.0D, 200.0D, 0.5D);
      this.field_5961 = this.field_5943.method_6904(this.field_5961, var1, var2, var3, 5, 33, 5, 8.555150000000001D, 4.277575000000001D, 8.555150000000001D);
      String[] var10000 = class_752.method_4253();
      this.field_5962 = this.field_5941.method_6904(this.field_5962, var1, var2, var3, 5, 33, 5, 684.412D, 684.412D, 684.412D);
      this.field_5963 = this.field_5942.method_6904(this.field_5963, var1, var2, var3, 5, 33, 5, 684.412D, 684.412D, 684.412D);
      boolean var46 = false;
      boolean var45 = false;
      int var13 = 0;
      String[] var4 = var10000;
      int var14 = 0;
      double var15 = 8.5D;
      int var17 = 0;

      do {
         int var47 = var17;

         label147:
         while(true) {
            if(var47 >= 5) {
               return;
            }

            int var18 = 0;

            while(true) {
               var47 = var18;

               label143:
               while(true) {
                  if(var47 >= 5) {
                     break label147;
                  }

                  float var19 = 0.0F;
                  float var20 = 0.0F;
                  float var21 = 0.0F;
                  byte var22 = 2;
                  class_985 var23 = this.field_5960[var17 + 2 + (var18 + 2) * 10];
                  var47 = -var22;
                  if(var4 == null) {
                     continue label147;
                  }

                  int var24 = var47;

                  class_1150 var48;
                  label140:
                  while(true) {
                     if(var24 <= var22) {
                        var47 = -var22;
                        if(var4 == null) {
                           continue label143;
                        }

                        int var25 = var47;

                        while(var25 <= var22) {
                           class_985 var26 = this.field_5960[var17 + var24 + 2 + (var18 + var25 + 2) * 10];
                           float var27 = var26.field_5038;
                           float var28 = var26.field_5039;
                           var48 = this;
                           if(var4 == null) {
                              break label140;
                           }

                           float var10001;
                           float var49;
                           label96: {
                              if(var4 != null) {
                                 if(this.field_5950 == class_1046.field_5530) {
                                    var49 = var27;
                                    var10001 = 0.0F;
                                    if(var4 == null) {
                                       break label96;
                                    }

                                    if(var27 > 0.0F) {
                                       var27 = 1.0F + var27 * 2.0F;
                                       var28 = 1.0F + var28 * 4.0F;
                                    }
                                 }

                                 var48 = this;
                              }

                              var49 = var48.field_5952[var24 + 2 + (var25 + 2) * 5];
                              var10001 = var27 + 2.0F;
                           }

                           float var29 = var49 / var10001;
                           var49 = var26.field_5038;
                           var10001 = var23.field_5038;
                           if(var4 != null) {
                              if(var26.field_5038 > var23.field_5038) {
                                 var29 /= 2.0F;
                              }

                              var19 += var28 * var29;
                              var20 += var27 * var29;
                              var49 = var21;
                              var10001 = var29;
                           }

                           var21 = var49 + var10001;
                           ++var25;
                           if(var4 == null) {
                              break;
                           }
                        }

                        ++var24;
                        if(var4 != null) {
                           continue;
                        }
                     }

                     var19 /= var21;
                     var20 /= var21;
                     var19 = var19 * 0.9F + 0.1F;
                     var20 = (var20 * 4.0F - 1.0F) / 8.0F;
                     var48 = this;
                     break;
                  }

                  double var52 = var48.field_5964[var14] / 8000.0D;
                  double var55;
                  var47 = (var55 = var52 - 0.0D) == 0.0D?0:(var55 < 0.0D?-1:1);
                  if(var4 != null) {
                     if(var47 < 0) {
                        var52 = -var52 * 0.3D;
                     }

                     var52 = var52 * 3.0D - 2.0D;
                     double var56;
                     var47 = (var56 = var52 - 0.0D) == 0.0D?0:(var56 < 0.0D?-1:1);
                  }

                  double var50;
                  double var51;
                  label123: {
                     label159: {
                        if(var4 != null) {
                           if(var47 < 0) {
                              var52 /= 2.0D;
                              var51 = var52;
                              var50 = -1.0D;
                              if(var4 != null) {
                                 if(var52 < -1.0D) {
                                    var52 = -1.0D;
                                 }

                                 var52 /= 1.4D;
                                 var51 = var52;
                                 var50 = 2.0D;
                              }

                              var52 = var51 / var50;
                              if(var4 != null) {
                                 break label123;
                              }
                           }

                           var51 = var52;
                           var50 = 1.0D;
                           if(var4 == null) {
                              break label159;
                           }

                           double var57;
                           var47 = (var57 = var52 - 1.0D) == 0.0D?0:(var57 < 0.0D?-1:1);
                        }

                        if(var47 > 0) {
                           var52 = 1.0D;
                        }

                        var51 = var52;
                        var50 = 8.0D;
                     }

                     var52 = var51 / var50;
                  }

                  ++var14;
                  double var53 = (double)var20;
                  double var54 = (double)var19;
                  var53 += var52 * 0.2D;
                  var53 = var53 * 8.5D / 8.0D;
                  double var30 = 8.5D + var53 * 4.0D;
                  int var32 = 0;

                  while(var32 < 33) {
                     double var33 = ((double)var32 - var30) * 12.0D * 128.0D / 256.0D / var54;
                     var51 = var33;
                     var50 = 0.0D;
                     if(var4 != null) {
                        double var58;
                        var47 = (var58 = var33 - 0.0D) == 0.0D?0:(var58 < 0.0D?-1:1);
                        if(var4 == null) {
                           continue label143;
                        }

                        if(var47 < 0) {
                           var33 *= 4.0D;
                        }

                        var51 = this.field_5962[var13];
                        var50 = 512.0D;
                     }

                     double var35 = var51 / var50;
                     double var37 = this.field_5963[var13] / 512.0D;
                     double var39 = (this.field_5961[var13] / 10.0D + 1.0D) / 2.0D;
                     double var41 = class_1715.method_9571(var35, var37, var39) - var33;
                     if(var4 != null) {
                        if(var32 > 29) {
                           double var43 = (double)((float)(var32 - 29) / 3.0F);
                           var41 = var41 * (1.0D - var43) + -10.0D * var43;
                        }

                        this.field_5951[var13] = var41;
                        ++var13;
                        ++var32;
                     }

                     if(var4 == null) {
                        break;
                     }
                  }

                  ++var18;
                  if(var4 == null) {
                     break label147;
                  }
                  break;
               }
            }
         }

         ++var17;
      } while(var4 != null);

   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_103(int var1, int var2) {
      return true;
   }

   // $FF: renamed from: b (gG, int, int) void
   public void method_106(class_25 var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      class_464.field_2229 = true;
      int var5 = var2 * 16;
      int var6 = var3 * 16;
      class_985 var7 = this.field_5948.method_35(var5 + 16, var6 + 16);
      String[] var4 = var10000;
      this.field_5940.setSeed(this.field_5948.method_2183());
      long var8 = this.field_5940.nextLong() / 2L * 2L + 1L;
      long var10 = this.field_5940.nextLong() / 2L * 2L + 1L;
      this.field_5940.setSeed((long)var2 * var8 + (long)var3 * var10 ^ this.field_5948.method_2183());
      byte var12 = 0;
      if(var4 != null && this.field_5949) {
         this.field_5957.method_5964(this.field_5948, this.field_5940, var2, var3);
         var12 = this.field_5956.method_5964(this.field_5948, this.field_5940, var2, var3);
         this.field_5955.method_5964(this.field_5948, this.field_5940, var2, var3);
         this.field_5958.method_5964(this.field_5948, this.field_5940, var2, var3);
      }

      int var13;
      int var14;
      int var15;
      int var18;
      class_1187 var19;
      label123: {
         label122: {
            class_985 var17 = var7;
            class_985 var10001 = class_985.field_4990;
            if(var4 != null) {
               if(var7 == class_985.field_4990) {
                  break label122;
               }

               var17 = var7;
               var10001 = class_985.field_5005;
            }

            if(var17 != var10001) {
               var18 = var12;
               if(var4 == null) {
                  break label123;
               }

               if(var12 == 0) {
                  var18 = this.field_5940.nextInt(4);
                  if(var4 == null) {
                     break label123;
                  }

                  if(var18 == 0) {
                     var13 = var5 + this.field_5940.nextInt(16) + 8;
                     var14 = this.field_5940.nextInt(256);
                     var15 = var6 + this.field_5940.nextInt(16) + 8;
                     var19 = new class_1187;
                     var19.method_6406(class_1192.field_6034);
                     var19.method_6351(this.field_5948, this.field_5940, var13, var14, var15);
                  }
               }
            }
         }

         var18 = var12;
      }

      if(var4 != null) {
         label108: {
            if(var18 == 0) {
               var18 = this.field_5940.nextInt(8);
               if(var4 == null) {
                  break label108;
               }

               if(var18 == 0) {
                  var13 = var5 + this.field_5940.nextInt(16) + 8;
                  var14 = this.field_5940.nextInt(this.field_5940.nextInt(248) + 8);
                  var15 = var6 + this.field_5940.nextInt(16) + 8;
                  if(var4 != null) {
                     label102: {
                        if(var14 >= 63) {
                           var18 = this.field_5940.nextInt(10);
                           if(var4 == null) {
                              break label108;
                           }

                           if(var18 != 0) {
                              break label102;
                           }
                        }

                        var19 = new class_1187;
                        var19.method_6406(class_1192.field_6036);
                        var19.method_6351(this.field_5948, this.field_5940, var13, var14, var15);
                     }
                  }
               }
            }

            var18 = 0;
         }
      }

      var13 = var18;

      while(true) {
         if(var13 < 8) {
            var14 = var5 + this.field_5940.nextInt(16) + 8;
            var15 = this.field_5940.nextInt(256);
            int var16 = var6 + this.field_5940.nextInt(16) + 8;
            class_1184 var20 = new class_1184;
            var20.method_6349();
            var20.method_6351(this.field_5948, this.field_5940, var14, var15, var16);
            ++var13;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var7.method_5714(this.field_5948, this.field_5940, var5, var6);
         class_1047.method_5940(this.field_5948, var7, var5 + 8, var6 + 8, 16, 16, this.field_5940);
         var5 += 8;
         var6 += 8;
         break;
      }

      var13 = 0;

      boolean var21;
      label83:
      while(true) {
         var18 = var13;

         label80:
         while(var18 < 16) {
            var21 = false;
            if(var4 == null) {
               break label83;
            }

            var14 = 0;

            while(var14 < 16) {
               var15 = this.field_5948.method_2107(var5 + var13, var6 + var14);
               var18 = this.field_5948.method_2146(var13 + var5, var15 - 1, var14 + var6);
               if(var4 == null) {
                  continue label80;
               }

               if(var4 != null) {
                  if(var18 != 0) {
                     this.field_5948.method_2054(var13 + var5, var15 - 1, var14 + var6, class_1192.field_6105, 0, 2);
                  }

                  var18 = this.field_5948.method_2149(var13 + var5, var15, var14 + var6, true);
               }

               if(var4 != null && var18 != 0) {
                  this.field_5948.method_2054(var13 + var5, var15, var14 + var6, class_1192.field_6104, 0, 2);
               }

               ++var14;
               if(var4 == null) {
                  break;
               }
            }

            ++var13;
            if(var4 != null) {
               continue label83;
            }
            break;
         }

         var21 = false;
         break;
      }

      class_464.field_2229 = var21;
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
      String[] var10000 = field_5966;
      return "RandomLevelSource";
   }

   // $FF: renamed from: b (as, int, int, int) java.util.List
   public List method_111(class_922 var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      class_985 var6 = this.field_5948.method_35(var2, var4);
      String[] var5 = var10000;
      if(var1 == class_922.field_4652) {
         class_1055 var7 = this.field_5958;
         if(var5 != null) {
            if(!this.field_5958.method_5979(var2, var3, var4)) {
               return var6.method_5706(var1);
            }

            var7 = this.field_5958;
         }

         return var7.method_5980();
      } else {
         return var6.method_5706(var1);
      }
   }

   // $FF: renamed from: b (ahb, java.lang.String, int, int, int) dd
   public class_1034 method_112(ahb var1, String var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      String[] var10000 = field_5966;
      if("Stronghold".equals(var2)) {
         class_1054 var7 = this.field_5955;
         if(var6 != null) {
            if(this.field_5955 == null) {
               return null;
            }

            var7 = this.field_5955;
         }

         return var7.method_5968(var1, var3, var4, var5);
      } else {
         return null;
      }
   }

   // $FF: renamed from: d () int
   public int method_113() {
      return 0;
   }

   // $FF: renamed from: f (int, int) void
   public void method_114(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_1150 var10000 = this;
      if(var3 != null) {
         if(!this.field_5949) {
            return;
         }

         this.field_5957.method_5961(this, this.field_5948, var1, var2, (aji[])null);
         this.field_5956.method_5961(this, this.field_5948, var1, var2, (aji[])null);
         this.field_5955.method_5961(this, this.field_5948, var1, var2, (aji[])null);
         var10000 = this;
      }

      var10000.field_5958.method_5961(this, this.field_5948, var1, var2, (aji[])null);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6348() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "¿;ÎaÛA¬§-ª\'Å`Ñe¦½,Í\\Ó\\±¨,";
      int var4 = "¿;ÎaÛA¬§-ª\'Å`Ñe¦½,Í\\Ó\\±¨,".length();
      char var1 = 10;
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
                  field_5966 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 93;
               break;
            case 1:
               var10009 = 85;
               break;
            case 2:
               var10009 = 215;
               break;
            case 3:
               var10009 = 63;
               break;
            case 4:
               var10009 = 145;
               break;
            case 5:
               var10009 = 34;
               break;
            default:
               var10009 = 183;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
