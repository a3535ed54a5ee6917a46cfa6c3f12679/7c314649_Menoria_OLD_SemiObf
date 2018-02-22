import java.util.Random;

// $FF: renamed from: g3
public class class_1058 extends class_1051 {

   // $FF: renamed from: a java.lang.String
   private static final String height4 = "CL_00000395";


   // $FF: renamed from: <init> () void
   public void method_5960() {
      super.method_5960();
   }

   // $FF: renamed from: b (long, int, int, aji[], double, double, double) void
   protected void method_5983(long var1, int var3, int var4, aji[] var5, double var6, double var8, double var10) {
      this.method_5984(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.field_5565.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
   }

   // $FF: renamed from: b (long, int, int, aji[], double, double, double, float, float, float, int, int, double) void
   protected void method_5984(long var1, int var3, int var4, aji[] var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      String[] var10000 = class_752.method_4253();
      double var20 = (double)(var3 * 16 + 8);
      String[] var19 = var10000;
      double var22 = (double)(var4 * 16 + 8);
      float var24 = 0.0F;
      float var25 = 0.0F;
      Random var26 = new Random(var1);
      int var62 = var16;
      int var27;
      if(var19 != null) {
         if(var16 <= 0) {
            var27 = this.field_5564 * 16 - 16;
            var16 = var27 - var26.nextInt(var27 / 4);
         }

         var62 = 0;
      }

      var27 = var62;
      var62 = var15;
      int var10001 = -1;
      if(var19 != null) {
         if(var15 == -1) {
            var15 = var16 / 2;
            var27 = 1;
         }

         var62 = var26.nextInt(var16 / 2);
         var10001 = var16 / 4;
      }

      int var28 = var62 + var10001;
      var62 = var26.nextInt(6);
      if(var19 != null) {
         var62 = var62 == 0?1:0;
      }

      int var29 = var62;

      do {
         var62 = var15;
         var10001 = var16;

         label383:
         while(true) {
            if(var62 >= var10001) {
               return;
            }

            double var30;
            double var32;
            label266: {
               label265: {
                  var30 = 1.5D + (double)(class_1715.method_9555((float)var15 * 3.1415927F / (float)var16) * var12 * 1.0F);
                  var32 = var30 * var17;
                  float var34 = class_1715.method_9556(var14);
                  float var35 = class_1715.method_9555(var14);
                  var6 += (double)(class_1715.method_9556(var13) * var34);
                  var8 += (double)var35;
                  var10 += (double)(class_1715.method_9555(var13) * var34);
                  if(var19 != null) {
                     if(var29 == 0) {
                        break label265;
                     }

                     var14 *= 0.92F;
                  }

                  if(var19 != null) {
                     break label266;
                  }
               }

               var14 *= 0.7F;
            }

            var14 += var25 * 0.1F;
            var13 += var24 * 0.1F;
            var25 *= 0.9F;
            var24 *= 0.75F;
            var25 += (var26.nextFloat() - var26.nextFloat()) * var26.nextFloat() * 2.0F;
            var24 += (var26.nextFloat() - var26.nextFloat()) * var26.nextFloat() * 4.0F;
            var62 = var27;
            if(var19 != null) {
               label257: {
                  if(var27 == 0) {
                     var62 = var15;
                     if(var19 == null) {
                        break label257;
                     }

                     if(var15 == var28) {
                        float var69;
                        var62 = (var69 = var12 - 1.0F) == 0.0F?0:(var69 < 0.0F?-1:1);
                        if(var19 == null) {
                           break label257;
                        }

                        if(var62 > 0) {
                           this.method_5984(var26.nextLong(), var3, var4, var5, var6, var8, var10, var26.nextFloat() * 0.5F + 0.5F, var13 - 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
                           this.method_5984(var26.nextLong(), var3, var4, var5, var6, var8, var10, var26.nextFloat() * 0.5F + 0.5F, var13 + 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
                           return;
                        }
                     }
                  }

                  var62 = var27;
               }
            }

            label380: {
               if(var19 != null) {
                  if(var62 != 0) {
                     break label380;
                  }

                  var62 = var26.nextInt(4);
               }

               if(var62 == 0) {
                  break;
               }
            }

            double var36 = var6 - var20;
            double var38 = var10 - var22;
            double var40 = (double)(var16 - var15);
            double var42 = (double)(var12 + 2.0F + 16.0F);
            double var70;
            var62 = (var70 = var36 * var36 + var38 * var38 - var40 * var40 - var42 * var42) == 0.0D?0:(var70 < 0.0D?-1:1);
            if(var19 != null) {
               if(var62 > 0) {
                  return;
               }

               double var71;
               var62 = (var71 = var6 - (var20 - 16.0D - var30 * 2.0D)) == 0.0D?0:(var71 < 0.0D?-1:1);
            }

            if(var19 != null) {
               if(var62 < 0) {
                  break;
               }

               double var72;
               var62 = (var72 = var10 - (var22 - 16.0D - var30 * 2.0D)) == 0.0D?0:(var72 < 0.0D?-1:1);
            }

            if(var19 != null) {
               if(var62 < 0) {
                  break;
               }

               double var73;
               var62 = (var73 = var6 - (var20 + 16.0D + var30 * 2.0D)) == 0.0D?0:(var73 < 0.0D?-1:1);
            }

            if(var19 != null) {
               if(var62 > 0) {
                  break;
               }

               double var74;
               var62 = (var74 = var10 - (var22 + 16.0D + var30 * 2.0D)) == 0.0D?0:(var74 < 0.0D?-1:1);
            }

            if(var19 != null) {
               if(var62 > 0) {
                  break;
               }

               var62 = class_1715.method_9561(var6 - var30) - var3 * 16 - 1;
            }

            int var44 = var62;
            int var45 = class_1715.method_9561(var6 + var30) - var3 * 16 + 1;
            int var46 = class_1715.method_9561(var8 - var32) - 1;
            int var47 = class_1715.method_9561(var8 + var32) + 1;
            int var48 = class_1715.method_9561(var10 - var30) - var4 * 16 - 1;
            int var49 = class_1715.method_9561(var10 + var30) - var4 * 16 + 1;
            var62 = var44;
            if(var19 != null) {
               if(var44 < 0) {
                  var44 = 0;
               }

               var62 = var45;
            }

            byte var63 = 16;
            if(var19 != null) {
               if(var62 > 16) {
                  var45 = 16;
               }

               var62 = var46;
               var63 = 1;
            }

            label392: {
               if(var19 != null) {
                  if(var62 < var63) {
                     var46 = 1;
                  }

                  var62 = var47;
                  if(var19 == null) {
                     break label392;
                  }

                  var63 = 120;
               }

               if(var62 > var63) {
                  var47 = 120;
               }

               var62 = var48;
            }

            if(var19 != null) {
               if(var62 < 0) {
                  var48 = 0;
               }

               var62 = var49;
            }

            if(var19 != null) {
               if(var62 > 16) {
                  var49 = 16;
               }

               var62 = 0;
            }

            int var50 = var62;
            int var51 = var44;

            int var52;
            aji var66;
            while(true) {
               if(var50 == 0) {
                  var62 = var51;
                  if(var19 == null) {
                     break;
                  }

                  var10001 = var45;
                  if(var19 == null) {
                     continue label383;
                  }

                  if(var51 < var45) {
                     int var53 = var48;

                     while(var50 == 0) {
                        var62 = var53;
                        var10001 = var49;
                        if(var19 == null) {
                           continue label383;
                        }

                        if(var19 != null) {
                           if(var53 >= var49) {
                              break;
                           }

                           var62 = var47;
                           var10001 = 1;
                        }

                        int var54 = var62 + var10001;

                        while(var50 == 0) {
                           var62 = var54;
                           var10001 = var46 - 1;
                           if(var19 == null) {
                              continue label383;
                           }

                           if(var19 != null) {
                              if(var54 < var10001) {
                                 break;
                              }

                              var62 = (var51 * 16 + var53) * 128;
                              var10001 = var54;
                           }

                           var52 = var62 + var10001;
                           if(var19 != null) {
                              if(var54 >= 0 && var54 < 128) {
                                 label398: {
                                    label338: {
                                       label337: {
                                          aji var55 = var5[var52];
                                          var66 = var55;
                                          Object var64 = class_1192.field_6035;
                                          if(var19 != null) {
                                             if(var55 == class_1192.field_6035) {
                                                break label337;
                                             }

                                             var66 = var55;
                                             var64 = class_1192.field_6036;
                                          }

                                          if(var66 != var64) {
                                             break label338;
                                          }
                                       }

                                       var50 = 1;
                                    }

                                    var62 = var54;
                                    var10001 = var46 - 1;
                                    if(var19 != null) {
                                       if(var54 == var10001) {
                                          break label398;
                                       }

                                       var62 = var51;
                                       var10001 = var44;
                                    }

                                    if(var19 != null) {
                                       if(var62 == var10001) {
                                          break label398;
                                       }

                                       var62 = var51;
                                       var10001 = var45 - 1;
                                    }

                                    if(var19 != null) {
                                       if(var62 == var10001) {
                                          break label398;
                                       }

                                       var62 = var53;
                                       var10001 = var48;
                                    }

                                    label399: {
                                       if(var19 != null) {
                                          if(var62 == var10001) {
                                             break label398;
                                          }

                                          var62 = var53;
                                          if(var19 == null) {
                                             break label399;
                                          }

                                          var10001 = var49 - 1;
                                       }

                                       if(var62 == var10001) {
                                          break label398;
                                       }

                                       var62 = var46;
                                    }

                                    var54 = var62;
                                 }
                              }

                              --var54;
                           }

                           if(var19 == null) {
                              break;
                           }
                        }

                        ++var53;
                        if(var19 == null) {
                           break;
                        }
                     }

                     ++var51;
                     if(var19 != null) {
                        continue;
                     }
                  }
               }

               var62 = var50;
               break;
            }

            if(var19 != null) {
               if(var62 != 0) {
                  break;
               }

               var62 = var44;
            }

            var51 = var62;

            label242:
            while(true) {
               var62 = var51;

               label239:
               while(var62 < var45) {
                  double var67 = ((double)(var51 + var3 * 16) + 0.5D - var6) / var30;
                  var62 = var48;
                  if(var19 == null) {
                     break label242;
                  }

                  var52 = var48;

                  label236:
                  do {
                     var62 = var52;

                     label233:
                     while(true) {
                        if(var62 >= var49) {
                           break label236;
                        }

                        double var68 = ((double)(var52 + var4 * 16) + 0.5D - var10) / var30;
                        int var57 = (var51 * 16 + var52) * 128 + var47;
                        var62 = var47 - 1;
                        if(var19 == null) {
                           continue label239;
                        }

                        int var58 = var62;

                        while(true) {
                           if(var58 < var46) {
                              break label233;
                           }

                           double var59 = ((double)var58 + 0.5D - var8) / var32;
                           if(var19 != null) {
                              double var75;
                              var62 = (var75 = var59 - -0.7D) == 0.0D?0:(var75 < 0.0D?-1:1);
                              if(var19 == null) {
                                 break;
                              }

                              if(var62 > 0 && var67 * var67 + var59 * var59 + var68 * var68 < 1.0D) {
                                 label223: {
                                    label222: {
                                       label407: {
                                          aji var61 = var5[var57];
                                          var66 = var61;
                                          aji var65 = class_1192.field_6113;
                                          if(var19 != null) {
                                             if(var61 == class_1192.field_6113) {
                                                break label222;
                                             }

                                             var66 = var61;
                                             if(var19 == null) {
                                                break label407;
                                             }

                                             var65 = class_1192.field_6028;
                                          }

                                          if(var66 == var65) {
                                             break label222;
                                          }

                                          var66 = var61;
                                       }

                                       if(var66 != class_1192.field_6027) {
                                          break label223;
                                       }
                                    }

                                    var5[var57] = null;
                                 }
                              }

                              --var57;
                              --var58;
                           }

                           if(var19 == null) {
                              break label233;
                           }
                        }
                     }

                     ++var52;
                  } while(var19 != null);

                  ++var51;
                  if(var19 != null) {
                     continue label242;
                  }
                  break;
               }

               var62 = var27;
               break;
            }

            if(var62 != 0 && var19 != null) {
               return;
            }
            break;
         }

         ++var15;
      } while(var19 != null);

   }

   // $FF: renamed from: b (ahb, int, int, int, int, aji[]) void
   protected void method_5962(ahb var1, int var2, int var3, int var4, int var5, aji[] var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = this.field_5565.nextInt(this.field_5565.nextInt(this.field_5565.nextInt(10) + 1) + 1);
      String[] var7 = var10000;
      int var21 = this.field_5565.nextInt(5);
      if(var7 != null) {
         if(var21 != 0) {
            var8 = 0;
         }

         var21 = 0;
      }

      int var9 = var21;

      while(var9 < var8) {
         double var10 = (double)(var2 * 16 + this.field_5565.nextInt(16));
         double var12 = (double)this.field_5565.nextInt(128);
         double var14 = (double)(var3 * 16 + this.field_5565.nextInt(16));
         int var16 = 1;
         var21 = this.field_5565.nextInt(4);
         if(var7 != null) {
            if(var21 == 0) {
               this.method_5983(this.field_5565.nextLong(), var4, var5, var6, var10, var12, var14);
               var16 += this.field_5565.nextInt(4);
            }

            var21 = 0;
         }

         int var17 = var21;

         while(true) {
            if(var17 < var16) {
               float var18 = this.field_5565.nextFloat() * 3.1415927F * 2.0F;
               float var19 = (this.field_5565.nextFloat() - 0.5F) * 2.0F / 8.0F;
               float var20 = this.field_5565.nextFloat() * 2.0F + this.field_5565.nextFloat();
               this.method_5984(this.field_5565.nextLong(), var4, var5, var6, var10, var12, var14, var20 * 2.0F, var18, var19, 0, 0, 0.5D);
               ++var17;
               if(var7 == null) {
                  break;
               }

               if(var7 != null) {
                  continue;
               }
            }

            ++var9;
            break;
         }

         if(var7 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5985() {
      boolean var10000 = true;
      char[] var10003 = "µzöÆã`".toCharArray();
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
            height4 = (new String((char[])var4)).intern();
            String var2 = height4;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 217;
            break;
         case 1:
            var10009 = 255;
            break;
         case 2:
            var10009 = 118;
            break;
         case 3:
            var10009 = 101;
            break;
         case 4:
            var10009 = 149;
            break;
         case 5:
            var10009 = 142;
            break;
         default:
            var10009 = 233;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
