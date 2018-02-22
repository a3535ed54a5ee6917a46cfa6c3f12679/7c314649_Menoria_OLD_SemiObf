import java.util.Random;

// $FF: renamed from: d7
public class class_488 extends class_473 {

   // $FF: renamed from: M java.util.Random
   private final Random field_2274;
   // $FF: renamed from: N int
   public final int field_2275;
   // $FF: renamed from: O java.lang.String
   private static final String field_2276;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_2277;


   // $FF: renamed from: <init> (int) void
   protected void method_2853(int var1) {
      super.method_2427(awt.field_4173);
      this.field_2274 = new Random();
      this.field_2275 = var1;
      this.method_2521(class_872.field_4245);
      this.method_2443(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
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
      return 22;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      aji var10000 = var1.getBlock(var2, var3, var4 - 1);
      class_488 var10001 = this;
      if(var5 != null) {
         if(var10000 == this) {
            this.method_2443(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
            if(var5 != null) {
               return;
            }
         }

         var10000 = var1.getBlock(var2, var3, var4 + 1);
         var10001 = this;
      }

      if(var5 != null) {
         if(var10000 == var10001) {
            this.method_2443(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
            if(var5 != null) {
               return;
            }
         }

         var10000 = var1.getBlock(var2 - 1, var3, var4);
         var10001 = this;
      }

      if(var5 != null) {
         if(var10000 == var10001) {
            this.method_2443(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
            if(var5 != null) {
               return;
            }
         }

         var10000 = var1.getBlock(var2 + 1, var3, var4);
         var10001 = this;
      }

      if(var10000 == var10001) {
         this.method_2443(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
         if(var5 != null) {
            return;
         }
      }

      this.method_2443(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      super.method_2461(var1, var2, var3, var4);
      this.method_2854(var1, var2, var3, var4);
      aji var6 = var1.getBlock(var2, var3, var4 - 1);
      String[] var5 = var10000;
      aji var7 = var1.getBlock(var2, var3, var4 + 1);
      aji var8 = var1.getBlock(var2 - 1, var3, var4);
      aji var9 = var1.getBlock(var2 + 1, var3, var4);
      aji var10 = var6;
      class_488 var10001 = this;
      if(var5 != null) {
         if(var6 == this) {
            this.method_2854(var1, var2, var3, var4 - 1);
         }

         var10 = var7;
         var10001 = this;
      }

      if(var5 != null) {
         if(var10 == var10001) {
            this.method_2854(var1, var2, var3, var4 + 1);
         }

         var10 = var8;
         var10001 = this;
      }

      if(var5 != null) {
         if(var10 == var10001) {
            this.method_2854(var1, var2 - 1, var3, var4);
         }

         var10 = var9;
         var10001 = this;
      }

      if(var10 == var10001) {
         this.method_2854(var1, var2 + 1, var3, var4);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      aji var8 = var1.getBlock(var2, var3, var4 - 1);
      aji var9 = var1.getBlock(var2, var3, var4 + 1);
      aji var10 = var1.getBlock(var2 - 1, var3, var4);
      String[] var10000 = class_752.method_4253();
      aji var11 = var1.getBlock(var2 + 1, var3, var4);
      int var12 = 0;
      int var13 = class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3;
      String[] var7 = var10000;
      int var14 = var13;
      if(var7 != null) {
         if(var13 == 0) {
            var12 = 2;
         }

         var14 = var13;
      }

      byte var10001 = 1;
      if(var7 != null) {
         if(var14 == 1) {
            var12 = 5;
         }

         var14 = var13;
         var10001 = 2;
      }

      label146: {
         label152: {
            if(var7 != null) {
               if(var14 == var10001) {
                  var12 = 3;
               }

               var14 = var13;
               if(var7 == null) {
                  break label152;
               }

               var10001 = 3;
            }

            if(var14 != var10001) {
               break label146;
            }

            var14 = 4;
         }

         var12 = var14;
      }

      label135: {
         label154: {
            aji var16 = var8;
            class_488 var15 = this;
            if(var7 != null) {
               label132: {
                  if(var8 != this) {
                     var16 = var9;
                     var15 = this;
                     if(var7 == null) {
                        break label132;
                     }

                     if(var9 != this) {
                        var16 = var10;
                        var15 = this;
                        if(var7 == null) {
                           break label132;
                        }

                        if(var10 != this) {
                           var16 = var11;
                           var15 = this;
                           if(var7 == null) {
                              break label132;
                           }

                           if(var11 != this) {
                              var1.method_2055(var2, var3, var4, var12, 3);
                              if(var7 != null) {
                                 break label154;
                              }
                           }
                        }
                     }
                  }

                  var16 = var8;
                  var15 = this;
               }
            }

            label98: {
               label155: {
                  label156: {
                     if(var7 != null) {
                        if(var16 == var15) {
                           break label156;
                        }

                        var16 = var9;
                        var15 = this;
                     }

                     if(var7 == null) {
                        break label98;
                     }

                     if(var16 != var15) {
                        break label155;
                     }
                  }

                  label85: {
                     var14 = var12;
                     var10001 = 4;
                     if(var7 != null) {
                        if(var12 == 4) {
                           break label85;
                        }

                        var14 = var12;
                        var10001 = 5;
                     }

                     if(var14 != var10001) {
                        break label155;
                     }
                  }

                  label77: {
                     if(var8 == this) {
                        var1.method_2055(var2, var3, var4 - 1, var12, 3);
                        if(var7 != null) {
                           break label77;
                        }
                     }

                     var1.method_2055(var2, var3, var4 + 1, var12, 3);
                  }

                  var1.method_2055(var2, var3, var4, var12, 3);
               }

               var16 = var10;
               var15 = this;
            }

            label116: {
               if(var7 != null) {
                  if(var16 == var15) {
                     break label116;
                  }

                  var16 = var11;
                  var15 = this;
               }

               if(var16 != var15) {
                  break label154;
               }
            }

            label108: {
               var14 = var12;
               var10001 = 2;
               if(var7 != null) {
                  if(var12 == 2) {
                     break label108;
                  }

                  var14 = var12;
                  if(var7 == null) {
                     break label135;
                  }

                  var10001 = 3;
               }

               if(var14 != var10001) {
                  break label154;
               }
            }

            label72: {
               if(var10 == this) {
                  var1.method_2055(var2 - 1, var3, var4, var12, 3);
                  if(var7 != null) {
                     break label72;
                  }
               }

               var1.method_2055(var2 + 1, var3, var4, var12, 3);
            }

            var1.method_2055(var2, var3, var4, var12, 3);
         }

         var14 = var6.method_3773();
      }

      if(var14 != 0) {
         ((class_594)var1.method_31(var2, var3, var4)).method_3162(var6.method_3770());
      }

   }

   // $FF: renamed from: h (ahb, int, int, int) void
   public void method_2854(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      ahb var10000 = var1;
      if(var5 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1;
      }

      byte var16;
      label265: {
         aji var6 = var10000.getBlock(var2, var3, var4 - 1);
         aji var7 = var1.getBlock(var2, var3, var4 + 1);
         aji var8 = var1.getBlock(var2 - 1, var3, var4);
         aji var9 = var1.getBlock(var2 + 1, var3, var4);
         boolean var10 = true;
         aji var18 = var6;
         class_488 var10001 = this;
         int var11;
         aji var12;
         int var13;
         aji var14;
         boolean var15;
         int var17;
         boolean var19;
         int var20;
         if(var5 != null) {
            label253: {
               if(var6 != this) {
                  var18 = var7;
                  var10001 = this;
                  if(var5 == null) {
                     break label253;
                  }

                  if(var7 != this) {
                     var18 = var8;
                     var10001 = this;
                     if(var5 != null) {
                        label245: {
                           if(var8 != this) {
                              var18 = var9;
                              var10001 = this;
                              if(var5 == null) {
                                 break label245;
                              }

                              if(var9 != this) {
                                 var16 = 3;
                                 var19 = var6.method_2419();
                                 if(var5 != null) {
                                    label272: {
                                       if(var19) {
                                          var19 = var7.method_2419();
                                          if(var5 == null) {
                                             break label272;
                                          }

                                          if(!var19) {
                                             var16 = 3;
                                          }
                                       }

                                       var19 = var7.method_2419();
                                    }
                                 }

                                 if(var5 != null) {
                                    label273: {
                                       if(var19) {
                                          var19 = var6.method_2419();
                                          if(var5 == null) {
                                             break label273;
                                          }

                                          if(!var19) {
                                             var16 = 2;
                                          }
                                       }

                                       var19 = var8.method_2419();
                                    }
                                 }

                                 if(var5 != null) {
                                    label177: {
                                       if(var19) {
                                          var19 = var9.method_2419();
                                          if(var5 == null) {
                                             break label177;
                                          }

                                          if(!var19) {
                                             var16 = 5;
                                          }
                                       }

                                       var19 = var9.method_2419();
                                    }
                                 }

                                 if(var5 == null) {
                                    return;
                                 }

                                 if(!var19) {
                                    break label265;
                                 }

                                 var19 = var8.method_2419();
                                 if(var5 == null) {
                                    return;
                                 }

                                 if(var19) {
                                    break label265;
                                 }

                                 var16 = 4;
                                 if(var5 != null) {
                                    break label265;
                                 }
                              }
                           }

                           var18 = var8;
                           var10001 = this;
                        }
                     }

                     label170: {
                        var11 = var18 == var10001?var2 - 1:var2 + 1;
                        var12 = var1.getBlock(var11, var3, var4 - 1);
                        var13 = var8 == this?var2 - 1:var2 + 1;
                        var14 = var1.getBlock(var13, var3, var4 + 1);
                        var16 = 3;
                        var15 = true;
                        if(var8 == this) {
                           var17 = var1.method_33(var2 - 1, var3, var4);
                           if(var5 != null) {
                              break label170;
                           }
                        }

                        var17 = var1.method_33(var2 + 1, var3, var4);
                     }

                     var20 = var17;
                     if(var5 != null) {
                        if(var17 == 2) {
                           var16 = 2;
                        }

                        var20 = var6.method_2419();
                     }

                     label165: {
                        label270: {
                           if(var5 != null) {
                              if(var20 == 0) {
                                 var20 = var12.method_2419();
                                 if(var5 == null) {
                                    break label165;
                                 }

                                 if(var20 == 0) {
                                    break label270;
                                 }
                              }

                              var20 = var7.method_2419();
                           }

                           if(var5 == null) {
                              break label165;
                           }

                           if(var20 == 0) {
                              var20 = var14.method_2419();
                              if(var5 == null) {
                                 break label165;
                              }

                              if(var20 == 0) {
                                 var16 = 3;
                              }
                           }
                        }

                        var20 = var7.method_2419();
                     }

                     if(var5 != null) {
                        if(var20 == 0) {
                           var19 = var14.method_2419();
                           if(var5 == null) {
                              return;
                           }

                           if(!var19) {
                              break label265;
                           }
                        }

                        var20 = var6.method_2419();
                     }

                     if(var5 == null) {
                        return;
                     }

                     if(var20 != 0) {
                        break label265;
                     }

                     var19 = var12.method_2419();
                     if(var5 == null) {
                        return;
                     }

                     if(var19) {
                        break label265;
                     }

                     var16 = 2;
                     if(var5 != null) {
                        break label265;
                     }
                  }
               }

               var18 = var6;
               var10001 = this;
            }
         }

         label148: {
            var11 = var18 == var10001?var4 - 1:var4 + 1;
            var12 = var1.getBlock(var2 - 1, var3, var11);
            var13 = var6 == this?var4 - 1:var4 + 1;
            var14 = var1.getBlock(var2 + 1, var3, var13);
            var16 = 5;
            var15 = true;
            if(var6 == this) {
               var17 = var1.method_33(var2, var3, var4 - 1);
               if(var5 != null) {
                  break label148;
               }
            }

            var17 = var1.method_33(var2, var3, var4 + 1);
         }

         var20 = var17;
         if(var5 != null) {
            if(var17 == 4) {
               var16 = 4;
            }

            var20 = var8.method_2419();
         }

         label143: {
            label271: {
               if(var5 != null) {
                  if(var20 == 0) {
                     var20 = var12.method_2419();
                     if(var5 == null) {
                        break label143;
                     }

                     if(var20 == 0) {
                        break label271;
                     }
                  }

                  var20 = var9.method_2419();
               }

               if(var5 == null) {
                  break label143;
               }

               if(var20 == 0) {
                  var20 = var14.method_2419();
                  if(var5 == null) {
                     break label143;
                  }

                  if(var20 == 0) {
                     var16 = 5;
                  }
               }
            }

            var20 = var9.method_2419();
         }

         if(var5 != null) {
            if(var20 == 0) {
               var19 = var14.method_2419();
               if(var5 == null) {
                  return;
               }

               if(!var19) {
                  break label265;
               }
            }

            var20 = var8.method_2419();
         }

         if(var5 == null) {
            return;
         }

         if(var20 == 0) {
            var19 = var12.method_2419();
            if(var5 == null) {
               return;
            }

            if(!var19) {
               var16 = 4;
            }
         }
      }

      var1.method_2055(var2, var3, var4, var16, 3);
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      String[] var5 = var10000;
      aji var7 = var1.getBlock(var2 - 1, var3, var4);
      class_488 var10001 = this;
      if(var5 != null) {
         if(var7 == this) {
            ++var6;
         }

         var7 = var1.getBlock(var2 + 1, var3, var4);
         var10001 = this;
      }

      if(var5 != null) {
         if(var7 == var10001) {
            ++var6;
         }

         var7 = var1.getBlock(var2, var3, var4 - 1);
         var10001 = this;
      }

      if(var5 != null) {
         if(var7 == var10001) {
            ++var6;
         }

         var7 = var1.getBlock(var2, var3, var4 + 1);
         var10001 = this;
      }

      if(var7 == var10001) {
         ++var6;
      }

      int var8 = var6;
      if(var5 != null) {
         if(var6 > 1) {
            var8 = 0;
            return (boolean)var8;
         }

         var8 = this.method_2855(var1, var2 - 1, var3, var4);
      }

      if(var5 != null) {
         if(var8 != 0) {
            var8 = 0;
            return (boolean)var8;
         }

         var8 = this.method_2855(var1, var2 + 1, var3, var4);
      }

      if(var5 != null) {
         if(var8 != 0) {
            var8 = 0;
            return (boolean)var8;
         }

         var8 = this.method_2855(var1, var2, var3, var4 - 1);
      }

      if(var5 != null) {
         if(var8 != 0) {
            var8 = 0;
            return (boolean)var8;
         }

         var8 = this.method_2855(var1, var2, var3, var4 + 1);
      }

      if(var5 != null) {
         var8 = var8 == 0?1:0;
      }

      return (boolean)var8;
   }

   // $FF: renamed from: i (ahb, int, int, int) boolean
   private boolean method_2855(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      aji var10000 = var1.getBlock(var2, var3, var4);
      class_488 var10001 = this;
      boolean var6;
      if(var5 != null) {
         if(var10000 != this) {
            var6 = false;
            return var6;
         }

         var10000 = var1.getBlock(var2 - 1, var3, var4);
         var10001 = this;
      }

      if(var5 != null) {
         if(var10000 == var10001) {
            var6 = true;
            return var6;
         }

         var10000 = var1.getBlock(var2 + 1, var3, var4);
         var10001 = this;
      }

      if(var5 != null) {
         if(var10000 == var10001) {
            var6 = true;
            return var6;
         }

         var10000 = var1.getBlock(var2, var3, var4 - 1);
         var10001 = this;
      }

      if(var5 != null) {
         if(var10000 == var10001) {
            var6 = true;
            return var6;
         }

         var10000 = var1.getBlock(var2, var3, var4 + 1);
         var10001 = this;
      }

      var6 = var10000 == var10001;
      return var6;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      super.method_2459(var1, var2, var3, var4, var5);
      String[] var10000 = class_752.method_4253();
      class_594 var7 = (class_594)var1.method_31(var2, var3, var4);
      String[] var6 = var10000;
      class_594 var8 = var7;
      if(var6 != null) {
         if(var7 == null) {
            return;
         }

         var8 = var7;
      }

      var8.method_3105();
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var10000 = class_752.method_4253();
      class_594 var8 = (class_594)var1.method_31(var2, var3, var4);
      String[] var7 = var10000;
      if(var7 != null) {
         if(var8 != null) {
            int var9 = 0;

            label60:
            do {
               int var17 = var9;
               int var10001 = var8.method_83();

               label57:
               while(true) {
                  if(var17 >= var10001) {
                     break label60;
                  }

                  add var10 = var8.method_84(var9);
                  if(var7 == null) {
                     return;
                  }

                  if(var7 == null) {
                     break;
                  }

                  if(var10 != null) {
                     float var11 = this.field_2274.nextFloat() * 0.8F + 0.1F;
                     float var12 = this.field_2274.nextFloat() * 0.8F + 0.1F;
                     float var14 = this.field_2274.nextFloat() * 0.8F + 0.1F;

                     while(var10.field_2958 > 0) {
                        int var15 = this.field_2274.nextInt(21) + 10;
                        if(var7 != null) {
                           var17 = var15;
                           var10001 = var10.field_2958;
                           if(var7 == null) {
                              continue label57;
                           }

                           if(var15 > var10.field_2958) {
                              var15 = var10.field_2958;
                           }

                           var10.field_2958 -= var15;
                        }

                        class_699 var18 = new class_699;
                        double var10003 = (double)((float)var2 + var11);
                        double var10004 = (double)((float)var3 + var12);
                        double var10005 = (double)((float)var4 + var14);
                        add var10006 = new add;
                        var10006.method_3726(var10.method_3730(), var15, var10.method_3745());
                        var18.method_4025(var1, var10003, var10004, var10005, var10006);
                        class_699 var13 = var18;
                        float var16 = 0.05F;
                        var13.field_2997 = (double)((float)this.field_2274.nextGaussian() * var16);
                        var13.field_2998 = (double)((float)this.field_2274.nextGaussian() * var16 + 0.2F);
                        var13.field_2999 = (double)((float)this.field_2274.nextGaussian() * var16);
                        boolean var19 = var10.method_3766();
                        if(var7 != null) {
                           if(var19) {
                              var13.method_4030().method_3769((class_1583)var10.method_3767().method_8633());
                           }

                           var1.method_2089(var13);
                        }

                        if(var7 == null) {
                           break;
                        }
                     }
                  }

                  ++var9;
                  break;
               }
            } while(var7 != null);

            var1.method_2221(var2, var3, var4, var5);
         }

         super.method_2462(var1, var2, var3, var4, var5, var6);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var10 != null) {
         if(!var1.field_1832) {
            class_22 var11 = this.method_2856(var1, var2, var3, var4);
            if(var11 != null) {
               var5.method_4575(var11);
            }

            return true;
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: n (ahb, int, int, int) vI
   public class_22 method_2856(ahb var1, int var2, int var3, int var4) {
      Object var6 = (class_594)var1.method_31(var2, var3, var4);
      String[] var5 = class_752.method_4253();
      if(var6 == null) {
         return null;
      } else {
         ahb var8;
         boolean var10000;
         int var10001;
         int var10002;
         int var10003;
         label164: {
            var10000 = var1.getBlock(var2, var3 + 1, var4).method_2433();
            if(var5 != null) {
               if(var10000) {
                  return null;
               }

               var8 = var1;
               var10001 = var2;
               var10002 = var3;
               var10003 = var4;
               if(var5 == null) {
                  break label164;
               }

               var10000 = method_2857(var1, var2, var3, var4);
            }

            if(var10000) {
               return null;
            }

            var8 = var1;
            var10001 = var2 - 1;
            var10002 = var3;
            var10003 = var4;
         }

         aji var9 = var8.getBlock(var10001, var10002, var10003);
         class_488 var10 = this;
         if(var5 != null) {
            label151: {
               if(var9 == this) {
                  var10000 = var1.getBlock(var2 - 1, var3 + 1, var4).method_2433();
                  if(var5 != null) {
                     if(var10000) {
                        return null;
                     }

                     var8 = var1;
                     var10001 = var2 - 1;
                     var10002 = var3;
                     var10003 = var4;
                     if(var5 == null) {
                        break label151;
                     }

                     var10000 = method_2857(var1, var10001, var3, var4);
                  }

                  if(var10000) {
                     return null;
                  }
               }

               var8 = var1;
               var10001 = var2 + 1;
               var10002 = var3;
               var10003 = var4;
            }

            var9 = var8.getBlock(var10001, var10002, var10003);
            var10 = this;
         }

         if(var5 != null) {
            label133: {
               if(var9 == var10) {
                  var10000 = var1.getBlock(var2 + 1, var3 + 1, var4).method_2433();
                  if(var5 != null) {
                     if(var10000) {
                        return null;
                     }

                     var8 = var1;
                     var10001 = var2 + 1;
                     var10002 = var3;
                     var10003 = var4;
                     if(var5 == null) {
                        break label133;
                     }

                     var10000 = method_2857(var1, var10001, var3, var4);
                  }

                  if(var10000) {
                     return null;
                  }
               }

               var8 = var1;
               var10001 = var2;
               var10002 = var3;
               var10003 = var4 - 1;
            }

            var9 = var8.getBlock(var10001, var10002, var10003);
            var10 = this;
         }

         if(var5 != null) {
            label116: {
               if(var9 == var10) {
                  var10000 = var1.getBlock(var2, var3 + 1, var4 - 1).method_2433();
                  if(var5 != null) {
                     if(var10000) {
                        return null;
                     }

                     var8 = var1;
                     var10001 = var2;
                     var10002 = var3;
                     var10003 = var4 - 1;
                     if(var5 == null) {
                        break label116;
                     }

                     var10000 = method_2857(var1, var2, var3, var10003);
                  }

                  if(var10000) {
                     return null;
                  }
               }

               var8 = var1;
               var10001 = var2;
               var10002 = var3;
               var10003 = var4 + 1;
            }

            var9 = var8.getBlock(var10001, var10002, var10003);
            var10 = this;
         }

         if(var5 != null) {
            label100: {
               if(var9 == var10) {
                  var10000 = var1.getBlock(var2, var3 + 1, var4 + 1).method_2433();
                  if(var5 != null) {
                     if(var10000) {
                        return null;
                     }

                     var8 = var1;
                     var10001 = var2;
                     var10002 = var3;
                     var10003 = var4 + 1;
                     if(var5 == null) {
                        break label100;
                     }

                     var10000 = method_2857(var1, var2, var3, var10003);
                  }

                  if(var10000) {
                     return null;
                  }
               }

               var8 = var1;
               var10001 = var2 - 1;
               var10002 = var3;
               var10003 = var4;
            }

            var9 = var8.getBlock(var10001, var10002, var10003);
            var10 = this;
         }

         String[] var7;
         class_1666 var12;
         if(var5 != null) {
            if(var9 == var10) {
               var12 = new class_1666;
               var7 = field_2277;
               var12.method_9196("container.chestDouble", (class_594)var1.method_31(var2 - 1, var3, var4), (class_22)var6);
               var6 = var12;
            }

            var9 = var1.getBlock(var2 + 1, var3, var4);
            var10 = this;
         }

         if(var5 != null) {
            if(var9 == var10) {
               var12 = new class_1666;
               var7 = field_2277;
               var12.method_9196("container.chestDouble", (class_22)var6, (class_594)var1.method_31(var2 + 1, var3, var4));
               var6 = var12;
            }

            var9 = var1.getBlock(var2, var3, var4 - 1);
            var10 = this;
         }

         if(var5 != null) {
            if(var9 == var10) {
               var12 = new class_1666;
               var7 = field_2277;
               var12.method_9196("container.chestDouble", (class_594)var1.method_31(var2, var3, var4 - 1), (class_22)var6);
               var6 = var12;
            }

            var9 = var1.getBlock(var2, var3, var4 + 1);
            var10 = this;
         }

         if(var9 == var10) {
            var12 = new class_1666;
            String[] var11 = field_2277;
            var12.method_9196("container.chestDouble", (class_22)var6, (class_594)var1.method_31(var2, var3, var4 + 1));
            var6 = var12;
         }

         return (class_22)var6;
      }
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_594 var10000 = new class_594;
      var10000.getBlock88();
      class_594 var3 = var10000;
      return var3;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2275;
      if(var1 != null) {
         var10000 = this.field_2275 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.method_2497();
      if(var6 != null) {
         if(var10000 == 0) {
            return 0;
         }

         var10000 = ((class_594)var1.method_31(var2, var3, var4)).field_2533;
      }

      int var7 = var10000;
      return class_1715.method_9568(var7, 0, 15);
   }

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         var10000 = var5 == 1?this.method_2496(var1, var2, var3, var4, var5):0;
      }

      return var10000;
   }

   // $FF: renamed from: p (ahb, int, int, int) boolean
   private static boolean method_2857(ahb var0, int var1, int var2, int var3) {
      return false;
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return true;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      return class_671.method_3676(this.method_2856(var1, var2, var3, var4));
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10002 = field_2277;
      this.field_2010 = var1.method_375("planks_oak");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "©Núî2hi¯Sºù;dt¾eûï1mb\nºMõô8rX¥@ÿmËªc17ú¥®";
      int var4 = "©Núî2hi¯Sºù;dt¾eûï1mb\nºMõô8rX¥@ÿmËªc17ú¥®".length();
      char var1 = 21;
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
                  field_2277 = var5;
                  String[] var10 = field_2277;
                  field_2276 = "CL_00000214";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 12;
               break;
            case 1:
               var10009 = 231;
               break;
            case 2:
               var10009 = 82;
               break;
            case 3:
               var10009 = 92;
               break;
            case 4:
               var10009 = 149;
               break;
            case 5:
               var10009 = 199;
               break;
            default:
               var10009 = 193;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
