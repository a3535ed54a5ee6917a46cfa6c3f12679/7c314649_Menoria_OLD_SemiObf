import java.util.Random;

// $FF: renamed from: g1
public class class_1060 extends class_1051 {

   // $FF: renamed from: a float[]
   private float[] height6;
   // $FF: renamed from: e java.lang.String
   private static final String height7 = "CL_00000390";


   // $FF: renamed from: <init> () void
   public void method_5960() {
      super.method_5960();
      this.height6 = new float[1024];
   }

   // $FF: renamed from: b (long, int, int, aji[], double, double, double, float, float, float, int, int, double) void
   protected void method_5989(long var1, int var3, int var4, aji[] var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      String[] var10000 = class_752.method_4253();
      Random var20 = new Random(var1);
      double var21 = (double)(var3 * 16 + 8);
      String[] var19 = var10000;
      double var23 = (double)(var4 * 16 + 8);
      float var25 = 0.0F;
      float var26 = 0.0F;
      int var62 = var16;
      int var27;
      if(var19 != null) {
         if(var16 <= 0) {
            var27 = this.field_5564 * 16 - 16;
            var16 = var27 - var20.nextInt(var27 / 4);
         }

         var62 = 0;
      }

      label417: {
         var27 = var62;
         var62 = var15;
         byte var10001 = -1;
         if(var19 != null) {
            if(var15 != -1) {
               break label417;
            }

            var62 = var16;
            var10001 = 2;
         }

         var15 = var62 / var10001;
         var27 = 1;
      }

      float var28 = 1.0F;
      int var29 = 0;

      while(true) {
         if(var29 < 256) {
            var62 = var29;
            if(var19 != null) {
               label398: {
                  label397: {
                     if(var19 != null) {
                        if(var29 == 0) {
                           break label397;
                        }

                        var62 = var20.nextInt(3);
                     }

                     if(var62 != 0) {
                        break label398;
                     }
                  }

                  var28 = 1.0F + var20.nextFloat() * var20.nextFloat() * 1.0F;
               }

               this.height6[var29] = var28 * var28;
               ++var29;
               if(var19 != null) {
                  continue;
               }

               var62 = var15;
            }
         } else {
            var62 = var15;
         }

         label405:
         while(true) {
            int var63 = var16;

            label389:
            while(var62 < var63) {
               label424: {
                  double var67 = 1.5D + (double)(class_1715.method_9555((float)var15 * 3.1415927F / (float)var16) * var12 * 1.0F);
                  double var31 = var67 * var17;
                  var67 *= (double)var20.nextFloat() * 0.25D + 0.75D;
                  var31 *= (double)var20.nextFloat() * 0.25D + 0.75D;
                  float var33 = class_1715.method_9556(var14);
                  float var34 = class_1715.method_9555(var14);
                  var6 += (double)(class_1715.method_9556(var13) * var33);
                  var8 += (double)var34;
                  double var65 = var10 + (double)(class_1715.method_9555(var13) * var33);
                  if(var19 != null) {
                     var10 = var65;
                     var14 *= 0.7F;
                     var14 += var26 * 0.05F;
                     var13 += var25 * 0.05F;
                     var26 *= 0.8F;
                     var25 *= 0.5F;
                     var26 += (var20.nextFloat() - var20.nextFloat()) * var20.nextFloat() * 2.0F;
                     var25 += (var20.nextFloat() - var20.nextFloat()) * var20.nextFloat() * 4.0F;
                     if(var27 == 0 && var20.nextInt(4) == 0) {
                        break label424;
                     }

                     var65 = var6 - var21;
                  }

                  double var35 = var65;
                  double var37 = var10 - var23;
                  double var39 = (double)(var16 - var15);
                  double var41 = (double)(var12 + 2.0F + 16.0F);
                  double var72;
                  var62 = (var72 = var35 * var35 + var37 * var37 - var39 * var39 - var41 * var41) == 0.0D?0:(var72 < 0.0D?-1:1);
                  if(var19 != null) {
                     if(var62 > 0) {
                        return;
                     }

                     double var73;
                     var62 = (var73 = var6 - (var21 - 16.0D - var67 * 2.0D)) == 0.0D?0:(var73 < 0.0D?-1:1);
                  }

                  if(var19 != null) {
                     if(var62 < 0) {
                        break label424;
                     }

                     double var74;
                     var62 = (var74 = var10 - (var23 - 16.0D - var67 * 2.0D)) == 0.0D?0:(var74 < 0.0D?-1:1);
                  }

                  if(var19 != null) {
                     if(var62 < 0) {
                        break label424;
                     }

                     double var75;
                     var62 = (var75 = var6 - (var21 + 16.0D + var67 * 2.0D)) == 0.0D?0:(var75 < 0.0D?-1:1);
                  }

                  if(var19 != null) {
                     if(var62 > 0) {
                        break label424;
                     }

                     double var76;
                     var62 = (var76 = var10 - (var23 + 16.0D + var67 * 2.0D)) == 0.0D?0:(var76 < 0.0D?-1:1);
                  }

                  if(var19 != null) {
                     if(var62 > 0) {
                        break label424;
                     }

                     var62 = class_1715.method_9561(var6 - var67) - var3 * 16 - 1;
                  }

                  int var43 = var62;
                  int var44 = class_1715.method_9561(var6 + var67) - var3 * 16 + 1;
                  int var45 = class_1715.method_9561(var8 - var31) - 1;
                  int var46 = class_1715.method_9561(var8 + var31) + 1;
                  int var47 = class_1715.method_9561(var10 - var67) - var4 * 16 - 1;
                  int var48 = class_1715.method_9561(var10 + var67) - var4 * 16 + 1;
                  var62 = var43;
                  if(var19 != null) {
                     if(var43 < 0) {
                        var43 = 0;
                     }

                     var62 = var44;
                  }

                  short var64 = 16;
                  if(var19 != null) {
                     if(var62 > 16) {
                        var44 = 16;
                     }

                     var62 = var45;
                     var64 = 1;
                  }

                  label425: {
                     if(var19 != null) {
                        if(var62 < var64) {
                           var45 = 1;
                        }

                        var62 = var46;
                        if(var19 == null) {
                           break label425;
                        }

                        var64 = 248;
                     }

                     if(var62 > var64) {
                        var46 = 248;
                     }

                     var62 = var47;
                  }

                  if(var19 != null) {
                     if(var62 < 0) {
                        var47 = 0;
                     }

                     var62 = var48;
                  }

                  if(var19 != null) {
                     if(var62 > 16) {
                        var48 = 16;
                     }

                     var62 = 0;
                  }

                  int var49 = var62;
                  int var50 = var43;

                  int var51;
                  Object var66;
                  aji var68;
                  while(true) {
                     if(var49 == 0) {
                        var62 = var50;
                        if(var19 == null) {
                           break;
                        }

                        var63 = var44;
                        if(var19 == null) {
                           continue label389;
                        }

                        if(var50 < var44) {
                           int var52 = var47;

                           while(var49 == 0) {
                              var62 = var52;
                              var63 = var48;
                              if(var19 == null) {
                                 continue label389;
                              }

                              if(var19 != null) {
                                 if(var52 >= var48) {
                                    break;
                                 }

                                 var62 = var46;
                                 var63 = 1;
                              }

                              int var53 = var62 + var63;

                              while(var49 == 0) {
                                 var62 = var53;
                                 var63 = var45 - 1;
                                 if(var19 == null) {
                                    continue label389;
                                 }

                                 if(var19 != null) {
                                    if(var53 < var63) {
                                       break;
                                    }

                                    var62 = (var50 * 16 + var52) * 256;
                                    var63 = var53;
                                 }

                                 var51 = var62 + var63;
                                 if(var19 != null) {
                                    if(var53 >= 0 && var53 < 256) {
                                       label431: {
                                          label302: {
                                             label301: {
                                                aji var54 = var5[var51];
                                                var68 = var54;
                                                var66 = class_1192.field_6033;
                                                if(var19 != null) {
                                                   if(var54 == class_1192.field_6033) {
                                                      break label301;
                                                   }

                                                   var68 = var54;
                                                   var66 = class_1192.field_6034;
                                                }

                                                if(var68 != var66) {
                                                   break label302;
                                                }
                                             }

                                             var49 = 1;
                                          }

                                          var62 = var53;
                                          var63 = var45 - 1;
                                          if(var19 != null) {
                                             if(var53 == var63) {
                                                break label431;
                                             }

                                             var62 = var50;
                                             var63 = var43;
                                          }

                                          if(var19 != null) {
                                             if(var62 == var63) {
                                                break label431;
                                             }

                                             var62 = var50;
                                             var63 = var44 - 1;
                                          }

                                          if(var19 != null) {
                                             if(var62 == var63) {
                                                break label431;
                                             }

                                             var62 = var52;
                                             var63 = var47;
                                          }

                                          label432: {
                                             if(var19 != null) {
                                                if(var62 == var63) {
                                                   break label431;
                                                }

                                                var62 = var52;
                                                if(var19 == null) {
                                                   break label432;
                                                }

                                                var63 = var48 - 1;
                                             }

                                             if(var62 == var63) {
                                                break label431;
                                             }

                                             var62 = var45;
                                          }

                                          var53 = var62;
                                       }
                                    }

                                    --var53;
                                 }

                                 if(var19 == null) {
                                    break;
                                 }
                              }

                              ++var52;
                              if(var19 == null) {
                                 break;
                              }
                           }

                           ++var50;
                           if(var19 != null) {
                              continue;
                           }
                        }
                     }

                     var62 = var49;
                     break;
                  }

                  if(var19 != null) {
                     if(var62 != 0) {
                        break label424;
                     }

                     var62 = var43;
                  }

                  var50 = var62;

                  label257:
                  while(true) {
                     var62 = var50;

                     label254:
                     while(var62 < var44) {
                        double var70 = ((double)(var50 + var3 * 16) + 0.5D - var6) / var67;
                        var62 = var47;
                        if(var19 == null) {
                           break label257;
                        }

                        var51 = var47;

                        label251:
                        do {
                           var62 = var51;

                           label248:
                           while(true) {
                              if(var62 >= var48) {
                                 break label251;
                              }

                              double var71 = ((double)(var51 + var4 * 16) + 0.5D - var10) / var67;
                              int var56 = (var50 * 16 + var51) * 256 + var46;
                              byte var57 = 0;
                              if(var19 == null) {
                                 break;
                              }

                              double var77;
                              var62 = (var77 = var70 * var70 + var71 * var71 - 1.0D) == 0.0D?0:(var77 < 0.0D?-1:1);
                              if(var19 == null) {
                                 continue label254;
                              }

                              if(var62 < 0) {
                                 int var58 = var46 - 1;

                                 while(var58 >= var45) {
                                    double var59 = ((double)var58 + 0.5D - var8) / var31;
                                    if(var19 != null) {
                                       label439: {
                                          double var78;
                                          var62 = (var78 = (var70 * var70 + var71 * var71) * (double)this.height6[var58] + var59 * var59 / 6.0D - 1.0D) == 0.0D?0:(var78 < 0.0D?-1:1);
                                          if(var19 == null) {
                                             continue label248;
                                          }

                                          if(var62 < 0) {
                                             label440: {
                                                aji var61 = var5[var56];
                                                var68 = var61;
                                                var66 = class_1192.field_6027;
                                                if(var19 != null) {
                                                   if(var61 == class_1192.field_6027) {
                                                      var57 = 1;
                                                   }

                                                   var68 = var61;
                                                   var66 = class_1192.field_6026;
                                                }

                                                label234: {
                                                   label441: {
                                                      if(var19 != null) {
                                                         if(var68 == var66) {
                                                            break label234;
                                                         }

                                                         var68 = var61;
                                                         if(var19 == null) {
                                                            break label441;
                                                         }

                                                         var66 = class_1192.field_6028;
                                                      }

                                                      if(var68 == var66) {
                                                         break label234;
                                                      }

                                                      var68 = var61;
                                                   }

                                                   if(var68 != class_1192.field_6027) {
                                                      break label440;
                                                   }
                                                }

                                                var62 = var58;
                                                if(var19 != null) {
                                                   if(var58 < 10) {
                                                      var5[var56] = class_1192.field_6035;
                                                      if(var19 != null) {
                                                         break label440;
                                                      }
                                                   }

                                                   var5[var56] = null;
                                                   if(var19 == null) {
                                                      break label439;
                                                   }

                                                   var62 = var57;
                                                }

                                                if(var62 != 0) {
                                                   label211: {
                                                      aji[] var69 = var5;
                                                      var63 = var56 - 1;
                                                      if(var19 != null) {
                                                         if(var5[var63] != class_1192.field_6028) {
                                                            break label211;
                                                         }

                                                         var69 = var5;
                                                         var63 = var56 - 1;
                                                      }

                                                      var69[var63] = this.field_5566.method_35(var50 + var3 * 16, var51 + var4 * 16).field_5034;
                                                   }
                                                }
                                             }
                                          }

                                          --var56;
                                          --var58;
                                       }
                                    }

                                    if(var19 == null) {
                                       break;
                                    }
                                 }
                              }

                              ++var51;
                              break;
                           }
                        } while(var19 != null);

                        ++var50;
                        if(var19 != null) {
                           continue label257;
                        }
                        break;
                     }

                     var62 = var27;
                     break;
                  }

                  if(var62 != 0 && var19 != null) {
                     return;
                  }
               }

               ++var15;
               if(var19 == null) {
                  return;
               }

               var62 = var15;
               continue label405;
            }

            return;
         }
      }
   }

   // $FF: renamed from: b (ahb, int, int, int, int, aji[]) void
   protected void method_5962(ahb var1, int var2, int var3, int var4, int var5, aji[] var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = this.field_5565.nextInt(50);
      if(var7 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = var2 * 16 + this.field_5565.nextInt(16);
      }

      double var8 = (double)var10000;
      double var10 = (double)(this.field_5565.nextInt(this.field_5565.nextInt(40) + 8) + 20);
      double var12 = (double)(var3 * 16 + this.field_5565.nextInt(16));
      byte var14 = 1;
      int var15 = 0;

      while(var15 < var14) {
         float var16 = this.field_5565.nextFloat() * 3.1415927F * 2.0F;
         float var17 = (this.field_5565.nextFloat() - 0.5F) * 2.0F / 8.0F;
         float var18 = (this.field_5565.nextFloat() * 2.0F + this.field_5565.nextFloat()) * 2.0F;
         this.method_5989(this.field_5565.nextLong(), var4, var5, var6, var8, var10, var12, var18, var16, var17, 0, 0, 3.0D);
         ++var15;
         if(var7 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5990() {
      boolean var10000 = true;
      char[] var10003 = "SºÜïj Åºï".toCharArray();
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
            height7 = (new String((char[])var4)).intern();
            String var2 = height7;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 6;
            break;
         case 1:
            var10009 = 224;
            break;
         case 2:
            var10009 = 149;
            break;
         case 3:
            var10009 = 201;
            break;
         case 4:
            var10009 = 172;
            break;
         case 5:
            var10009 = 76;
            break;
         default:
            var10009 = 189;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
