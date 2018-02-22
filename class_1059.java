import java.util.Random;

// $FF: renamed from: g2
public class class_1059 extends class_1051 {

   // $FF: renamed from: a java.lang.String
   private static final String height5 = "CL_00000393";


   // $FF: renamed from: <init> () void
   public void method_5960() {
      super.method_5960();
   }

   // $FF: renamed from: b (long, int, int, aji[], double, double, double) void
   protected void method_5986(long var1, int var3, int var4, aji[] var5, double var6, double var8, double var10) {
      this.method_5987(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.field_5565.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
   }

   // $FF: renamed from: b (long, int, int, aji[], double, double, double, float, float, float, int, int, double) void
   protected void method_5987(long var1, int var3, int var4, aji[] var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      double var20 = (double)(var3 * 16 + 8);
      double var22 = (double)(var4 * 16 + 8);
      float var24 = 0.0F;
      float var25 = 0.0F;
      Random var26 = new Random(var1);
      String[] var19 = class_752.method_4253();
      int var10000 = var16;
      int var27;
      if(var19 != null) {
         if(var16 <= 0) {
            var27 = this.field_5564 * 16 - 16;
            var16 = var27 - var26.nextInt(var27 / 4);
         }

         var10000 = 0;
      }

      var27 = var10000;
      var10000 = var15;
      int var10001 = -1;
      if(var19 != null) {
         if(var15 == -1) {
            var15 = var16 / 2;
            var27 = 1;
         }

         var10000 = var26.nextInt(var16 / 2);
         var10001 = var16 / 4;
      }

      int var28 = var10000 + var10001;
      var10000 = var26.nextInt(6);
      if(var19 != null) {
         var10000 = var10000 == 0?1:0;
      }

      int var29 = var10000;

      do {
         var10000 = var15;
         var10001 = var16;

         label428:
         while(true) {
            if(var10000 >= var10001) {
               return;
            }

            double var30;
            double var32;
            label311: {
               label310: {
                  var30 = 1.5D + (double)(class_1715.method_9555((float)var15 * 3.1415927F / (float)var16) * var12 * 1.0F);
                  var32 = var30 * var17;
                  float var34 = class_1715.method_9556(var14);
                  float var35 = class_1715.method_9555(var14);
                  var6 += (double)(class_1715.method_9556(var13) * var34);
                  var8 += (double)var35;
                  var10 += (double)(class_1715.method_9555(var13) * var34);
                  if(var19 != null) {
                     if(var29 == 0) {
                        break label310;
                     }

                     var14 *= 0.92F;
                  }

                  if(var19 != null) {
                     break label311;
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
            var10000 = var27;
            if(var19 != null) {
               label302: {
                  if(var27 == 0) {
                     var10000 = var15;
                     if(var19 == null) {
                        break label302;
                     }

                     if(var15 == var28) {
                        float var69;
                        var10000 = (var69 = var12 - 1.0F) == 0.0F?0:(var69 < 0.0F?-1:1);
                        if(var19 == null) {
                           break label302;
                        }

                        if(var10000 > 0) {
                           var10000 = var16;
                           if(var19 == null) {
                              break label302;
                           }

                           if(var16 > 0) {
                              this.method_5987(var26.nextLong(), var3, var4, var5, var6, var8, var10, var26.nextFloat() * 0.5F + 0.5F, var13 - 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
                              this.method_5987(var26.nextLong(), var3, var4, var5, var6, var8, var10, var26.nextFloat() * 0.5F + 0.5F, var13 + 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
                              return;
                           }
                        }
                     }
                  }

                  var10000 = var27;
               }
            }

            label425: {
               if(var19 != null) {
                  if(var10000 != 0) {
                     break label425;
                  }

                  var10000 = var26.nextInt(4);
               }

               if(var10000 == 0) {
                  break;
               }
            }

            double var36 = var6 - var20;
            double var38 = var10 - var22;
            double var40 = (double)(var16 - var15);
            double var42 = (double)(var12 + 2.0F + 16.0F);
            double var70;
            var10000 = (var70 = var36 * var36 + var38 * var38 - var40 * var40 - var42 * var42) == 0.0D?0:(var70 < 0.0D?-1:1);
            if(var19 != null) {
               if(var10000 > 0) {
                  return;
               }

               double var71;
               var10000 = (var71 = var6 - (var20 - 16.0D - var30 * 2.0D)) == 0.0D?0:(var71 < 0.0D?-1:1);
            }

            if(var19 != null) {
               if(var10000 < 0) {
                  break;
               }

               double var72;
               var10000 = (var72 = var10 - (var22 - 16.0D - var30 * 2.0D)) == 0.0D?0:(var72 < 0.0D?-1:1);
            }

            if(var19 != null) {
               if(var10000 < 0) {
                  break;
               }

               double var73;
               var10000 = (var73 = var6 - (var20 + 16.0D + var30 * 2.0D)) == 0.0D?0:(var73 < 0.0D?-1:1);
            }

            if(var19 != null) {
               if(var10000 > 0) {
                  break;
               }

               double var74;
               var10000 = (var74 = var10 - (var22 + 16.0D + var30 * 2.0D)) == 0.0D?0:(var74 < 0.0D?-1:1);
            }

            if(var19 != null) {
               if(var10000 > 0) {
                  break;
               }

               var10000 = class_1715.method_9561(var6 - var30) - var3 * 16 - 1;
            }

            int var44 = var10000;
            int var45 = class_1715.method_9561(var6 + var30) - var3 * 16 + 1;
            int var46 = class_1715.method_9561(var8 - var32) - 1;
            int var47 = class_1715.method_9561(var8 + var32) + 1;
            int var48 = class_1715.method_9561(var10 - var30) - var4 * 16 - 1;
            int var49 = class_1715.method_9561(var10 + var30) - var4 * 16 + 1;
            var10000 = var44;
            if(var19 != null) {
               if(var44 < 0) {
                  var44 = 0;
               }

               var10000 = var45;
            }

            short var63 = 16;
            if(var19 != null) {
               if(var10000 > 16) {
                  var45 = 16;
               }

               var10000 = var46;
               var63 = 1;
            }

            label437: {
               if(var19 != null) {
                  if(var10000 < var63) {
                     var46 = 1;
                  }

                  var10000 = var47;
                  if(var19 == null) {
                     break label437;
                  }

                  var63 = 248;
               }

               if(var10000 > var63) {
                  var47 = 248;
               }

               var10000 = var48;
            }

            if(var19 != null) {
               if(var10000 < 0) {
                  var48 = 0;
               }

               var10000 = var49;
            }

            if(var19 != null) {
               if(var10000 > 16) {
                  var49 = 16;
               }

               var10000 = 0;
            }

            int var50 = var10000;
            int var51 = var44;

            int var52;
            Object var64;
            aji var65;
            while(true) {
               if(var50 == 0) {
                  var10000 = var51;
                  if(var19 == null) {
                     break;
                  }

                  var10001 = var45;
                  if(var19 == null) {
                     continue label428;
                  }

                  if(var51 < var45) {
                     int var53 = var48;

                     while(var50 == 0) {
                        var10000 = var53;
                        var10001 = var49;
                        if(var19 == null) {
                           continue label428;
                        }

                        if(var19 != null) {
                           if(var53 >= var49) {
                              break;
                           }

                           var10000 = var47;
                           var10001 = 1;
                        }

                        int var54 = var10000 + var10001;

                        while(var50 == 0) {
                           var10000 = var54;
                           var10001 = var46 - 1;
                           if(var19 == null) {
                              continue label428;
                           }

                           if(var19 != null) {
                              if(var54 < var10001) {
                                 break;
                              }

                              var10000 = (var51 * 16 + var53) * 256;
                              var10001 = var54;
                           }

                           var52 = var10000 + var10001;
                           if(var19 != null) {
                              if(var54 >= 0 && var54 < 256) {
                                 label443: {
                                    label383: {
                                       label382: {
                                          aji var55 = var5[var52];
                                          var65 = var55;
                                          var64 = class_1192.field_6033;
                                          if(var19 != null) {
                                             if(var55 == class_1192.field_6033) {
                                                break label382;
                                             }

                                             var65 = var55;
                                             var64 = class_1192.field_6034;
                                          }

                                          if(var65 != var64) {
                                             break label383;
                                          }
                                       }

                                       var50 = 1;
                                    }

                                    var10000 = var54;
                                    var10001 = var46 - 1;
                                    if(var19 != null) {
                                       if(var54 == var10001) {
                                          break label443;
                                       }

                                       var10000 = var51;
                                       var10001 = var44;
                                    }

                                    if(var19 != null) {
                                       if(var10000 == var10001) {
                                          break label443;
                                       }

                                       var10000 = var51;
                                       var10001 = var45 - 1;
                                    }

                                    if(var19 != null) {
                                       if(var10000 == var10001) {
                                          break label443;
                                       }

                                       var10000 = var53;
                                       var10001 = var48;
                                    }

                                    label444: {
                                       if(var19 != null) {
                                          if(var10000 == var10001) {
                                             break label443;
                                          }

                                          var10000 = var53;
                                          if(var19 == null) {
                                             break label444;
                                          }

                                          var10001 = var49 - 1;
                                       }

                                       if(var10000 == var10001) {
                                          break label443;
                                       }

                                       var10000 = var46;
                                    }

                                    var54 = var10000;
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

               var10000 = var50;
               break;
            }

            if(var19 != null) {
               if(var10000 != 0) {
                  break;
               }

               var10000 = var44;
            }

            var51 = var10000;

            label284:
            while(true) {
               var10000 = var51;

               label281:
               while(var10000 < var45) {
                  double var67 = ((double)(var51 + var3 * 16) + 0.5D - var6) / var30;
                  var10000 = var48;
                  if(var19 == null) {
                     break label284;
                  }

                  var52 = var48;

                  label278:
                  do {
                     var10000 = var52;

                     label275:
                     while(true) {
                        if(var10000 >= var49) {
                           break label278;
                        }

                        double var68 = ((double)(var52 + var4 * 16) + 0.5D - var10) / var30;
                        int var57 = (var51 * 16 + var52) * 256 + var47;
                        byte var58 = 0;
                        if(var19 == null) {
                           break;
                        }

                        double var75;
                        var10000 = (var75 = var67 * var67 + var68 * var68 - 1.0D) == 0.0D?0:(var75 < 0.0D?-1:1);
                        if(var19 == null) {
                           continue label281;
                        }

                        if(var10000 < 0) {
                           int var59 = var47 - 1;

                           while(var59 >= var46) {
                              double var60 = ((double)var59 + 0.5D - var8) / var32;
                              if(var19 != null) {
                                 label451: {
                                    double var76;
                                    var10000 = (var76 = var60 - -0.7D) == 0.0D?0:(var76 < 0.0D?-1:1);
                                    if(var19 == null) {
                                       continue label275;
                                    }

                                    if(var10000 > 0 && var67 * var67 + var60 * var60 + var68 * var68 < 1.0D) {
                                       label452: {
                                          aji var62 = var5[var57];
                                          var65 = var62;
                                          var64 = class_1192.field_6027;
                                          if(var19 != null) {
                                             if(var62 == class_1192.field_6027) {
                                                var58 = 1;
                                             }

                                             var65 = var62;
                                             var64 = class_1192.field_6026;
                                          }

                                          label260: {
                                             label453: {
                                                if(var19 != null) {
                                                   if(var65 == var64) {
                                                      break label260;
                                                   }

                                                   var65 = var62;
                                                   if(var19 == null) {
                                                      break label453;
                                                   }

                                                   var64 = class_1192.field_6028;
                                                }

                                                if(var65 == var64) {
                                                   break label260;
                                                }

                                                var65 = var62;
                                             }

                                             if(var65 != class_1192.field_6027) {
                                                break label452;
                                             }
                                          }

                                          var10000 = var59;
                                          if(var19 != null) {
                                             if(var59 < 10) {
                                                var5[var57] = class_1192.field_6036;
                                                if(var19 != null) {
                                                   break label452;
                                                }
                                             }

                                             var5[var57] = null;
                                             if(var19 == null) {
                                                break label451;
                                             }

                                             var10000 = var58;
                                          }

                                          if(var10000 != 0) {
                                             label237: {
                                                aji[] var66 = var5;
                                                var10001 = var57 - 1;
                                                if(var19 != null) {
                                                   if(var5[var10001] != class_1192.field_6028) {
                                                      break label237;
                                                   }

                                                   var66 = var5;
                                                   var10001 = var57 - 1;
                                                }

                                                var66[var10001] = this.field_5566.method_35(var51 + var3 * 16, var52 + var4 * 16).field_5034;
                                             }
                                          }
                                       }
                                    }

                                    --var57;
                                    --var59;
                                 }
                              }

                              if(var19 == null) {
                                 break;
                              }
                           }
                        }

                        ++var52;
                        break;
                     }
                  } while(var19 != null);

                  ++var51;
                  if(var19 != null) {
                     continue label284;
                  }
                  break;
               }

               var10000 = var27;
               break;
            }

            if(var10000 != 0 && var19 != null) {
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
      int var8 = this.field_5565.nextInt(this.field_5565.nextInt(this.field_5565.nextInt(15) + 1) + 1);
      String[] var7 = var10000;
      int var21 = this.field_5565.nextInt(7);
      if(var7 != null) {
         if(var21 != 0) {
            var8 = 0;
         }

         var21 = 0;
      }

      int var9 = var21;

      do {
         var21 = var9;

         label49:
         while(true) {
            if(var21 >= var8) {
               return;
            }

            double var10 = (double)(var2 * 16 + this.field_5565.nextInt(16));
            double var12 = (double)this.field_5565.nextInt(this.field_5565.nextInt(120) + 8);
            double var14 = (double)(var3 * 16 + this.field_5565.nextInt(16));
            int var16 = 1;
            var21 = this.field_5565.nextInt(4);
            if(var7 != null) {
               if(var21 == 0) {
                  this.method_5986(this.field_5565.nextLong(), var4, var5, var6, var10, var12, var14);
                  var16 += this.field_5565.nextInt(4);
               }

               var21 = 0;
            }

            int var17 = var21;

            while(true) {
               if(var17 >= var16) {
                  break label49;
               }

               float var18 = this.field_5565.nextFloat() * 3.1415927F * 2.0F;
               float var19 = (this.field_5565.nextFloat() - 0.5F) * 2.0F / 8.0F;
               float var20 = this.field_5565.nextFloat() * 2.0F + this.field_5565.nextFloat();
               class_1059 var22 = this;
               if(var7 != null) {
                  var21 = this.field_5565.nextInt(10);
                  if(var7 == null) {
                     break;
                  }

                  if(var21 == 0) {
                     var20 *= this.field_5565.nextFloat() * this.field_5565.nextFloat() * 3.0F + 1.0F;
                  }

                  var22 = this;
               }

               var22.method_5987(this.field_5565.nextLong(), var4, var5, var6, var10, var12, var14, var20, var18, var19, 0, 0, 1.0D);
               ++var17;
               if(var7 == null) {
                  break label49;
               }
            }
         }

         ++var9;
      } while(var7 != null);

   }

   // $FF: renamed from: <clinit> () void
   static void method_5988() {
      boolean var10000 = true;
      char[] var10003 = "ù­ù@¿ÑÒ".toCharArray();
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
            height5 = (new String((char[])var4)).intern();
            String var2 = height5;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 49;
            break;
         case 1:
            var10009 = 106;
            break;
         case 2:
            var10009 = 45;
            break;
         case 3:
            var10009 = 36;
            break;
         case 4:
            var10009 = 251;
            break;
         case 5:
            var10009 = 4;
            break;
         default:
            var10009 = 106;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
