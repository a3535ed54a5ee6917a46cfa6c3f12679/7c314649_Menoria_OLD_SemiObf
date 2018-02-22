import java.util.List;
import java.util.Random;

// $FF: renamed from: fN
public class class_398 extends aji {

   // $FF: renamed from: M int[][]
   private static final int[][] field_2094;
   // $FF: renamed from: N aji
   private final aji field_2095;
   // $FF: renamed from: O int
   private final int field_2096;
   // $FF: renamed from: P boolean
   private boolean field_2097;
   // $FF: renamed from: Q int
   private int field_2098;


   // $FF: renamed from: <init> (aji, int) void
   protected void method_2625(aji var1, int var2) {
      super.method_2427(var1.field_2007);
      this.field_2095 = var1;
      this.field_2096 = var2;
      this.method_2437(var1.field_1993);
      this.method_2431(var1.field_1994 / 3.0F);
      this.method_2428(var1.field_2005);
      this.method_2429(255);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      class_398 var10000 = this;
      if(var5 != null) {
         if(this.field_2097) {
            this.method_2443(0.5F * (float)(this.field_2098 % 2), 0.5F * (float)(this.field_2098 / 2 % 2), 0.5F * (float)(this.field_2098 / 4 % 2), 0.5F + 0.5F * (float)(this.field_2098 % 2), 0.5F + 0.5F * (float)(this.field_2098 / 2 % 2), 0.5F + 0.5F * (float)(this.field_2098 / 4 % 2));
            if(var5 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
      return 10;
   }

   // $FF: renamed from: f (ahl, int, int, int) void
   public void method_2626(ahl var1, int var2, int var3, int var4) {
      label16: {
         String[] var10000 = class_752.method_4253();
         int var6 = var1.method_33(var2, var3, var4);
         String[] var5 = var10000;
         if(var5 != null) {
            if((var6 & 4) == 0) {
               break label16;
            }

            this.method_2443(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
         }

         if(var5 != null) {
            return;
         }
      }

      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
   }

   // $FF: renamed from: d (aji) boolean
   public static boolean method_2627(aji var0) {
      return var0 instanceof class_398;
   }

   // $FF: renamed from: g (ahl, int, int, int, int) boolean
   private boolean method_2628(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      aji var7 = var1.getBlock(var2, var3, var4);
      String[] var6 = var10000;
      int var8 = method_2627(var7);
      if(var6 != null) {
         if(var8 != 0) {
            var8 = var1.method_33(var2, var3, var4);
            if(var6 == null) {
               return (boolean)var8;
            }

            if(var8 == var5) {
               return true;
            }
         }

         var8 = 0;
      }

      return (boolean)var8;
   }

   // $FF: renamed from: g (ahl, int, int, int) boolean
   public boolean method_2629(ahl var1, int var2, int var3, int var4) {
      String[] var5;
      int var6;
      int var7;
      float var8;
      float var9;
      label245: {
         var6 = var1.method_33(var2, var3, var4);
         var7 = var6 & 3;
         var5 = class_752.method_4253();
         var8 = 0.5F;
         var9 = 1.0F;
         if(var5 != null) {
            if((var6 & 4) == 0) {
               break label245;
            }

            var8 = 0.0F;
         }

         var9 = 0.5F;
      }

      float var10;
      float var11;
      float var12;
      float var13;
      int var14;
      int var10000;
      label248: {
         var10 = 0.0F;
         var11 = 1.0F;
         var12 = 0.0F;
         var13 = 0.5F;
         var14 = 1;
         var10000 = var7;
         aji var15;
         int var16;
         int var10001;
         int var17;
         byte var18;
         if(var5 != null) {
            if(var7 == 0) {
               label249: {
                  var10 = 0.5F;
                  var13 = 1.0F;
                  var15 = var1.getBlock(var2 + 1, var3, var4);
                  var16 = var1.method_33(var2 + 1, var3, var4);
                  var10000 = method_2627(var15);
                  if(var5 != null) {
                     if(var10000 == 0) {
                        break label249;
                     }

                     var10000 = var6 & 4;
                  }

                  var10001 = var16 & 4;
                  if(var5 != null) {
                     if(var10000 != var10001) {
                        break label249;
                     }

                     var10000 = var16;
                     var10001 = 3;
                  }

                  label250: {
                     var17 = var10000 & var10001;
                     var10000 = var17;
                     var18 = 3;
                     if(var5 != null) {
                        label175: {
                           if(var17 == 3) {
                              var10000 = this.method_2628(var1, var2, var3, var4 + 1, var6);
                              if(var5 == null) {
                                 break label175;
                              }

                              if(var10000 == 0) {
                                 var13 = 0.5F;
                                 var14 = 0;
                                 if(var5 != null) {
                                    break label249;
                                 }
                              }
                           }

                           var10000 = var17;
                        }

                        if(var5 == null) {
                           break label250;
                        }

                        var18 = 2;
                     }

                     if(var10000 != var18) {
                        break label249;
                     }

                     var10000 = this.method_2628(var1, var2, var3, var4 - 1, var6);
                  }

                  if(var5 != null) {
                     if(var10000 != 0) {
                        break label249;
                     }

                     var12 = 0.5F;
                     var10000 = 0;
                  }

                  var14 = var10000;
               }

               if(var5 != null) {
                  break label248;
               }
            }

            var10000 = var7;
         }

         var18 = 1;
         if(var5 != null) {
            if(var10000 == 1) {
               label252: {
                  var11 = 0.5F;
                  var13 = 1.0F;
                  var15 = var1.getBlock(var2 - 1, var3, var4);
                  var16 = var1.method_33(var2 - 1, var3, var4);
                  var10000 = method_2627(var15);
                  if(var5 != null) {
                     if(var10000 == 0) {
                        break label252;
                     }

                     var10000 = var6 & 4;
                  }

                  var10001 = var16 & 4;
                  if(var5 != null) {
                     if(var10000 != var10001) {
                        break label252;
                     }

                     var10000 = var16;
                     var10001 = 3;
                  }

                  label253: {
                     var17 = var10000 & var10001;
                     var10000 = var17;
                     var18 = 3;
                     if(var5 != null) {
                        label143: {
                           if(var17 == 3) {
                              var10000 = this.method_2628(var1, var2, var3, var4 + 1, var6);
                              if(var5 == null) {
                                 break label143;
                              }

                              if(var10000 == 0) {
                                 var13 = 0.5F;
                                 var14 = 0;
                                 if(var5 != null) {
                                    break label252;
                                 }
                              }
                           }

                           var10000 = var17;
                        }

                        if(var5 == null) {
                           break label253;
                        }

                        var18 = 2;
                     }

                     if(var10000 != var18) {
                        break label252;
                     }

                     var10000 = this.method_2628(var1, var2, var3, var4 - 1, var6);
                  }

                  if(var5 != null) {
                     if(var10000 != 0) {
                        break label252;
                     }

                     var12 = 0.5F;
                     var10000 = 0;
                  }

                  var14 = var10000;
               }

               if(var5 != null) {
                  break label248;
               }
            }

            var10000 = var7;
            var18 = 2;
         }

         if(var5 != null) {
            if(var10000 == var18) {
               label256: {
                  var12 = 0.5F;
                  var13 = 1.0F;
                  var15 = var1.getBlock(var2, var3, var4 + 1);
                  var16 = var1.method_33(var2, var3, var4 + 1);
                  var10000 = method_2627(var15);
                  if(var5 != null) {
                     if(var10000 == 0) {
                        break label256;
                     }

                     var10000 = var6 & 4;
                  }

                  var10001 = var16 & 4;
                  if(var5 != null) {
                     if(var10000 != var10001) {
                        break label256;
                     }

                     var10000 = var16;
                     var10001 = 3;
                  }

                  var17 = var10000 & var10001;
                  var10000 = var17;
                  if(var5 != null) {
                     label116: {
                        if(var17 == 1) {
                           var10000 = this.method_2628(var1, var2 + 1, var3, var4, var6);
                           if(var5 == null) {
                              break label116;
                           }

                           if(var10000 == 0) {
                              var11 = 0.5F;
                              var14 = 0;
                              if(var5 != null) {
                                 break label256;
                              }
                           }
                        }

                        var10000 = var17;
                     }
                  }

                  if(var5 != null) {
                     if(var10000 != 0) {
                        break label256;
                     }

                     var10000 = this.method_2628(var1, var2 - 1, var3, var4, var6);
                  }

                  if(var5 != null) {
                     if(var10000 != 0) {
                        break label256;
                     }

                     var10 = 0.5F;
                     var10000 = 0;
                  }

                  var14 = var10000;
               }

               if(var5 != null) {
                  break label248;
               }
            }

            var10000 = var7;
            if(var5 == null) {
               return (boolean)var10000;
            }

            var18 = 3;
         }

         if(var10000 == var18) {
            var15 = var1.getBlock(var2, var3, var4 - 1);
            var16 = var1.method_33(var2, var3, var4 - 1);
            var10000 = method_2627(var15);
            if(var5 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               var10000 = var6 & 4;
               if(var5 == null) {
                  return (boolean)var10000;
               }

               if(var10000 == (var16 & 4)) {
                  label257: {
                     var17 = var16 & 3;
                     var10000 = var17;
                     if(var5 != null) {
                        label210: {
                           if(var17 == 1) {
                              var10000 = this.method_2628(var1, var2 + 1, var3, var4, var6);
                              if(var5 == null) {
                                 break label210;
                              }

                              if(var10000 == 0) {
                                 var11 = 0.5F;
                                 var14 = 0;
                                 if(var5 != null) {
                                    break label257;
                                 }
                              }
                           }

                           var10000 = var17;
                        }
                     }

                     if(var5 == null) {
                        return (boolean)var10000;
                     }

                     if(var10000 == 0) {
                        var10000 = this.method_2628(var1, var2 - 1, var3, var4, var6);
                        if(var5 == null) {
                           return (boolean)var10000;
                        }

                        if(var10000 == 0) {
                           var10 = 0.5F;
                           var14 = 0;
                        }
                     }
                  }
               }
            }
         }
      }

      this.method_2443(var10, var8, var12, var11, var9, var13);
      var10000 = var14;
      return (boolean)var10000;
   }

   // $FF: renamed from: h (ahl, int, int, int) boolean
   public boolean method_2630(ahl var1, int var2, int var3, int var4) {
      String[] var5;
      int var6;
      int var7;
      float var8;
      float var9;
      label253: {
         String[] var10000 = class_752.method_4253();
         var6 = var1.method_33(var2, var3, var4);
         var7 = var6 & 3;
         var5 = var10000;
         var8 = 0.5F;
         var9 = 1.0F;
         if(var5 != null) {
            if((var6 & 4) == 0) {
               break label253;
            }

            var8 = 0.0F;
         }

         var9 = 0.5F;
      }

      float var10;
      float var11;
      float var12;
      float var13;
      int var14;
      int var18;
      label247: {
         label256: {
            var10 = 0.0F;
            var11 = 0.5F;
            var12 = 0.5F;
            var13 = 1.0F;
            var14 = 0;
            var18 = var7;
            aji var15;
            int var16;
            int var10001;
            int var17;
            byte var19;
            if(var5 != null) {
               if(var7 == 0) {
                  label257: {
                     var15 = var1.getBlock(var2 - 1, var3, var4);
                     var16 = var1.method_33(var2 - 1, var3, var4);
                     var18 = method_2627(var15);
                     if(var5 != null) {
                        if(var18 == 0) {
                           break label257;
                        }

                        var18 = var6 & 4;
                     }

                     var10001 = var16 & 4;
                     if(var5 != null) {
                        if(var18 != var10001) {
                           break label257;
                        }

                        var18 = var16;
                        var10001 = 3;
                     }

                     label258: {
                        var17 = var18 & var10001;
                        var18 = var17;
                        var19 = 3;
                        if(var5 != null) {
                           label183: {
                              if(var17 == 3) {
                                 var18 = this.method_2628(var1, var2, var3, var4 - 1, var6);
                                 if(var5 == null) {
                                    break label183;
                                 }

                                 if(var18 == 0) {
                                    var12 = 0.0F;
                                    var13 = 0.5F;
                                    var14 = 1;
                                    if(var5 != null) {
                                       break label257;
                                    }
                                 }
                              }

                              var18 = var17;
                           }

                           if(var5 == null) {
                              break label258;
                           }

                           var19 = 2;
                        }

                        if(var18 != var19) {
                           break label257;
                        }

                        var18 = this.method_2628(var1, var2, var3, var4 + 1, var6);
                     }

                     if(var5 != null) {
                        if(var18 != 0) {
                           break label257;
                        }

                        var12 = 0.5F;
                        var13 = 1.0F;
                        var18 = 1;
                     }

                     var14 = var18;
                  }

                  if(var5 != null) {
                     break label256;
                  }
               }

               var18 = var7;
            }

            var19 = 1;
            if(var5 != null) {
               if(var18 == 1) {
                  label260: {
                     var15 = var1.getBlock(var2 + 1, var3, var4);
                     var16 = var1.method_33(var2 + 1, var3, var4);
                     var18 = method_2627(var15);
                     if(var5 != null) {
                        if(var18 == 0) {
                           break label260;
                        }

                        var18 = var6 & 4;
                     }

                     var10001 = var16 & 4;
                     if(var5 != null) {
                        if(var18 != var10001) {
                           break label260;
                        }

                        var10 = 0.5F;
                        var11 = 1.0F;
                        var18 = var16;
                        var10001 = 3;
                     }

                     label261: {
                        var17 = var18 & var10001;
                        var18 = var17;
                        var19 = 3;
                        if(var5 != null) {
                           label151: {
                              if(var17 == 3) {
                                 var18 = this.method_2628(var1, var2, var3, var4 - 1, var6);
                                 if(var5 == null) {
                                    break label151;
                                 }

                                 if(var18 == 0) {
                                    var12 = 0.0F;
                                    var13 = 0.5F;
                                    var14 = 1;
                                    if(var5 != null) {
                                       break label260;
                                    }
                                 }
                              }

                              var18 = var17;
                           }

                           if(var5 == null) {
                              break label261;
                           }

                           var19 = 2;
                        }

                        if(var18 != var19) {
                           break label260;
                        }

                        var18 = this.method_2628(var1, var2, var3, var4 + 1, var6);
                     }

                     if(var5 != null) {
                        if(var18 != 0) {
                           break label260;
                        }

                        var12 = 0.5F;
                        var13 = 1.0F;
                        var18 = 1;
                     }

                     var14 = var18;
                  }

                  if(var5 != null) {
                     break label256;
                  }
               }

               var18 = var7;
               var19 = 2;
            }

            if(var5 != null) {
               if(var18 == var19) {
                  label264: {
                     var15 = var1.getBlock(var2, var3, var4 - 1);
                     var16 = var1.method_33(var2, var3, var4 - 1);
                     var18 = method_2627(var15);
                     if(var5 != null) {
                        if(var18 == 0) {
                           break label264;
                        }

                        var18 = var6 & 4;
                     }

                     var10001 = var16 & 4;
                     if(var5 != null) {
                        if(var18 != var10001) {
                           break label264;
                        }

                        var12 = 0.0F;
                        var13 = 0.5F;
                        var18 = var16;
                        var10001 = 3;
                     }

                     var17 = var18 & var10001;
                     var18 = var17;
                     if(var5 != null) {
                        label124: {
                           if(var17 == 1) {
                              var18 = this.method_2628(var1, var2 - 1, var3, var4, var6);
                              if(var5 == null) {
                                 break label124;
                              }

                              if(var18 == 0) {
                                 var14 = 1;
                                 if(var5 != null) {
                                    break label264;
                                 }
                              }
                           }

                           var18 = var17;
                        }
                     }

                     if(var5 != null) {
                        if(var18 != 0) {
                           break label264;
                        }

                        var18 = this.method_2628(var1, var2 + 1, var3, var4, var6);
                     }

                     if(var5 != null) {
                        if(var18 != 0) {
                           break label264;
                        }

                        var10 = 0.5F;
                        var11 = 1.0F;
                        var18 = 1;
                     }

                     var14 = var18;
                  }

                  if(var5 != null) {
                     break label256;
                  }
               }

               var18 = var7;
               if(var5 == null) {
                  break label247;
               }

               var19 = 3;
            }

            if(var18 == var19) {
               var15 = var1.getBlock(var2, var3, var4 + 1);
               var16 = var1.method_33(var2, var3, var4 + 1);
               var18 = method_2627(var15);
               if(var5 == null) {
                  break label247;
               }

               if(var18 != 0) {
                  var18 = var6 & 4;
                  if(var5 == null) {
                     break label247;
                  }

                  if(var18 == (var16 & 4)) {
                     label265: {
                        var17 = var16 & 3;
                        var18 = var17;
                        if(var5 != null) {
                           label218: {
                              if(var17 == 1) {
                                 var18 = this.method_2628(var1, var2 - 1, var3, var4, var6);
                                 if(var5 == null) {
                                    break label218;
                                 }

                                 if(var18 == 0) {
                                    var14 = 1;
                                    if(var5 != null) {
                                       break label265;
                                    }
                                 }
                              }

                              var18 = var17;
                           }
                        }

                        if(var5 == null) {
                           break label247;
                        }

                        if(var18 == 0) {
                           var18 = this.method_2628(var1, var2 + 1, var3, var4, var6);
                           if(var5 == null) {
                              break label247;
                           }

                           if(var18 == 0) {
                              var10 = 0.5F;
                              var11 = 1.0F;
                              var14 = 1;
                           }
                        }
                     }
                  }
               }
            }
         }

         var18 = var14;
      }

      if(var5 != null) {
         if(var18 != 0) {
            this.method_2443(var10, var8, var12, var11, var9, var13);
         }

         var18 = var14;
      }

      return (boolean)var18;
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      this.method_2626(var1, var2, var3, var4);
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
      String[] var8 = class_752.method_4253();
      boolean var9 = this.method_2629(var1, var2, var3, var4);
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
      if(var8 != null) {
         class_398 var10000;
         label17: {
            if(var9) {
               var10000 = this;
               if(var8 == null) {
                  break label17;
               }

               if(this.method_2630(var1, var2, var3, var4)) {
                  super.method_2451(var1, var2, var3, var4, var5, var6, var7);
               }
            }

            var10000 = this;
         }

         var10000.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      this.field_2095.method_2457(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz) void
   public void method_2484(ahb var1, int var2, int var3, int var4, class_792 var5) {
      this.field_2095.method_2484(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: b (ahb, int, int, int, int) void
   public void method_2458(ahb var1, int var2, int var3, int var4, int var5) {
      this.field_2095.method_2458(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: c (ahl, int, int, int) int
   public int method_2444(ahl var1, int var2, int var3, int var4) {
      return this.field_2095.method_2444(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (sa) float
   public float method_2471(class_689 var1) {
      return this.field_2095.method_2471(var1);
   }

   // $FF: renamed from: w () int
   public int method_2477() {
      return this.field_2095.method_2477();
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      return this.field_2095.method_2448(var1, this.field_2096);
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return this.field_2095.method_2460(var1);
   }

   // $FF: renamed from: g (ahb, int, int, int) kg
   public class_1343 method_2450(ahb var1, int var2, int var3, int var4) {
      return this.field_2095.method_2450(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, sa, azw) void
   public void method_2485(ahb var1, int var2, int var3, int var4, class_689 var5, azw var6) {
      this.field_2095.method_2485(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: v () boolean
   public boolean method_2455() {
      return this.field_2095.method_2455();
   }

   // $FF: renamed from: a (int, boolean) boolean
   public boolean method_2454(int var1, boolean var2) {
      return this.field_2095.method_2454(var1, var2);
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      return this.field_2095.method_2480(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      this.method_2459(var1, var2, var3, var4, class_1192.field_6025);
      this.field_2095.method_2461(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      this.field_2095.method_2462(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: b (ahb, int, int, int, sa) void
   public void method_2482(ahb var1, int var2, int var3, int var4, class_689 var5) {
      this.field_2095.method_2482(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      this.field_2095.method_2456(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      return this.field_2095.method_2481(var1, var2, var3, var4, var5, 0, 0.0F, 0.0F, 0.0F);
   }

   // $FF: renamed from: a (ahb, int, int, int, df) void
   public void method_2476(ahb var1, int var2, int var3, int var4, class_1036 var5) {
      this.field_2095.method_2476(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: f (int) jj
   public class_1319 method_2425(int var1) {
      return this.field_2095.method_2425(this.field_2096);
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      int var8 = class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3;
      String[] var10000 = class_752.method_4253();
      int var9 = var1.method_33(var2, var3, var4) & 4;
      String[] var7 = var10000;
      int var10 = var8;
      if(var7 != null) {
         if(var8 == 0) {
            var1.method_2055(var2, var3, var4, 2 | var9, 2);
         }

         var10 = var8;
      }

      byte var10001 = 1;
      if(var7 != null) {
         if(var10 == 1) {
            var1.method_2055(var2, var3, var4, 1 | var9, 2);
         }

         var10 = var8;
         var10001 = 2;
      }

      if(var7 != null) {
         if(var10 == var10001) {
            var1.method_2055(var2, var3, var4, 3 | var9, 2);
         }

         var10 = var8;
         if(var7 == null) {
            return;
         }

         var10001 = 3;
      }

      if(var10 == var10001) {
         var1.method_2055(var2, var3, var4, 0 | var9, 2);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      String[] var10 = class_752.method_4253();
      int var10000 = var5;
      if(var10 != null) {
         if(var5 != 0) {
            label22: {
               var10000 = var5;
               if(var10 != null) {
                  if(var5 != 1) {
                     double var11;
                     var10000 = (var11 = (double)var7 - 0.5D) == 0.0D?0:(var11 < 0.0D?-1:1);
                     if(var10 == null) {
                        return var10000;
                     }

                     if(var10000 > 0) {
                        break label22;
                     }
                  }

                  var10000 = var9;
               }

               return var10000;
            }
         }

         var10000 = var9 | 4;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, azw, azw) azu
   public azu method_2472(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      azu[] var8 = new azu[8];
      String[] var7 = class_752.method_4253();
      int var9 = var1.method_33(var2, var3, var4);
      int var10 = var9 & 3;
      int var10000 = var9 & 4;
      if(var7 != null) {
         var10000 = var10000 == 4?1:0;
      }

      int var11 = var10000;
      int var10002 = var11;
      if(var7 != null) {
         var10002 = var11 != 0?4:0;
      }

      int[] var12 = field_2094[var10 + var10002];
      this.field_2097 = true;
      int var13 = 0;

      int var15;
      int var16;
      int var17;
      int[] var27;
      label96:
      while(true) {
         var10000 = var13;
         int var10001 = 8;

         label93:
         while(var10000 < var10001) {
            this.field_2098 = var13;
            int[] var14 = var12;
            var27 = var12;
            if(var7 == null) {
               break label96;
            }

            var15 = var12.length;
            var16 = 0;

            while(var16 < var15) {
               var17 = var14[var16];
               if(var7 != null) {
                  var10000 = var17;
                  var10001 = var13;
                  if(var7 == null) {
                     continue label93;
                  }

                  if(var17 == var13) {
                     ;
                  }

                  ++var16;
               }

               if(var7 == null) {
                  break;
               }
            }

            var8[var13] = super.method_2472(var1, var2, var3, var4, var5, var6);
            ++var13;
            if(var7 != null) {
               continue label96;
            }
            break;
         }

         var27 = var12;
         break;
      }

      int[] var22 = var27;
      int var24 = var22.length;
      var15 = 0;

      while(var15 < var24) {
         var16 = var22[var15];
         var8[var16] = null;
         ++var15;
         if(var7 == null) {
            break;
         }
      }

      azu var23 = null;
      double var25 = 0.0D;
      azu[] var26 = var8;
      var17 = var8.length;
      int var18 = 0;

      azu var28;
      while(true) {
         if(var18 < var17) {
            azu var19 = var26[var18];
            if(var7 != null) {
               label104: {
                  var28 = var19;
                  if(var7 == null) {
                     break;
                  }

                  if(var19 != null) {
                     double var20 = var19.field_4217.method_5095(var6);
                     if(var7 == null) {
                        break label104;
                     }

                     if(var20 > var25) {
                        var23 = var19;
                        var25 = var20;
                     }
                  }

                  ++var18;
               }
            }

            if(var7 != null) {
               continue;
            }
         }

         var28 = var23;
         break;
      }

      return var28;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {}

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      field_2094 = new int[][]{{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};
   }
}
