import java.util.Random;

// $FF: renamed from: f3
public class class_425 extends aji {

   // $FF: renamed from: <init> () void
   public void method_2699() {
      super.method_2427(awt.field_4181);
      this.method_2440(true);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 20;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      float var6 = 0.0625F;
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      float var8 = 1.0F;
      float var9 = 1.0F;
      float var10 = 1.0F;
      String[] var5 = var10000;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float var13 = 0.0F;
      int var15 = var7;
      if(var5 != null) {
         var15 = var7 > 0?1:0;
      }

      int var14 = var15;
      var15 = var7 & 2;
      if(var5 != null) {
         if(var15 != 0) {
            var11 = Math.max(var11, 0.0625F);
            var8 = 0.0F;
            var9 = 0.0F;
            var12 = 1.0F;
            var10 = 0.0F;
            var13 = 1.0F;
            var14 = 1;
         }

         var15 = var7 & 8;
      }

      if(var5 != null) {
         if(var15 != 0) {
            var8 = Math.min(var8, 0.9375F);
            var11 = 1.0F;
            var9 = 0.0F;
            var12 = 1.0F;
            var10 = 0.0F;
            var13 = 1.0F;
            var14 = 1;
         }

         var15 = var7 & 4;
      }

      if(var5 != null) {
         if(var15 != 0) {
            var13 = Math.max(var13, 0.0625F);
            var10 = 0.0F;
            var8 = 0.0F;
            var11 = 1.0F;
            var9 = 0.0F;
            var12 = 1.0F;
            var14 = 1;
         }

         var15 = var7 & 1;
      }

      if(var5 != null) {
         if(var15 != 0) {
            var10 = Math.min(var10, 0.9375F);
            var13 = 1.0F;
            var8 = 0.0F;
            var11 = 1.0F;
            var9 = 0.0F;
            var12 = 1.0F;
            var14 = 1;
         }

         var15 = var14;
      }

      class_425 var16;
      label54: {
         label53: {
            if(var5 != null) {
               if(var15 != 0) {
                  break label53;
               }

               var16 = this;
               if(var5 == null) {
                  break label54;
               }

               var15 = this.method_2700(var1.getBlock(var2, var3 + 1, var4));
            }

            if(var15 != 0) {
               var9 = Math.min(var9, 0.9375F);
               var12 = 1.0F;
               var8 = 0.0F;
               var11 = 1.0F;
               var10 = 0.0F;
               var13 = 1.0F;
            }
         }

         var16 = this;
      }

      var16.method_2443(var8, var9, var10, var11, var12, var13);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: d (ahb, int, int, int, int) boolean
   public boolean method_2479(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         switch(var5) {
         case 1:
            return this.method_2700(var1.getBlock(var2, var3 + 1, var4));
         case 2:
            return this.method_2700(var1.getBlock(var2, var3, var4 + 1));
         case 3:
            return this.method_2700(var1.getBlock(var2, var3, var4 - 1));
         case 4:
            var10000 = this.method_2700(var1.getBlock(var2 + 1, var3, var4));
            break;
         case 5:
            return this.method_2700(var1.getBlock(var2 - 1, var3, var4));
         default:
            return false;
         }
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d (aji) boolean
   private boolean method_2700(aji var1) {
      boolean var10000;
      label24: {
         String[] var2 = class_752.method_4253();
         var10000 = var1.method_2434();
         if(var2 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = var1.field_2007.method_5065();
         }

         if(var2 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   private boolean method_2701(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      int var7 = var6;
      String[] var5 = var10000;
      int var10 = var6;
      if(var5 != null) {
         label79: {
            if(var6 > 0) {
               int var8 = 0;

               while(var8 <= 3) {
                  int var9 = 1 << var8;
                  if(var5 != null) {
                     var10 = var6 & var9;
                     if(var5 == null) {
                        break label79;
                     }

                     if(var10 != 0) {
                        label64: {
                           label63: {
                              label85: {
                                 ahb var12;
                                 int var10001;
                                 int var10002;
                                 int var10003;
                                 label86: {
                                    Object var11 = this;
                                    if(var5 != null) {
                                       if(this.method_2700(var1.getBlock(var2 + class_1649.field_8587[var8], var3, var4 + class_1649.field_8588[var8]))) {
                                          break label64;
                                       }

                                       var12 = var1;
                                       var10001 = var2;
                                       var10002 = var3 + 1;
                                       var10003 = var4;
                                       if(var5 == null) {
                                          break label86;
                                       }

                                       var11 = var1.getBlock(var2, var10002, var4);
                                    }

                                    if(var11 != this) {
                                       break label85;
                                    }

                                    var12 = var1;
                                    var10001 = var2;
                                    var10002 = var3 + 1;
                                    var10003 = var4;
                                 }

                                 var10 = var12.method_33(var10001, var10002, var10003) & var9;
                                 if(var5 == null) {
                                    break label63;
                                 }

                                 if(var10 != 0) {
                                    break label64;
                                 }
                              }

                              var10 = var7 & ~var9;
                           }

                           var7 = var10;
                        }
                     }

                     ++var8;
                  }

                  if(var5 == null) {
                     break;
                  }
               }
            }

            var10 = var7;
         }
      }

      if(var5 != null) {
         label44: {
            if(var10 == 0) {
               var10 = this.method_2700(var1.getBlock(var2, var3 + 1, var4));
               if(var5 == null) {
                  break label44;
               }

               if(var10 == 0) {
                  return false;
               }
            }

            var10 = var7;
         }
      }

      if(var5 != null) {
         if(var10 != var6) {
            var1.method_2055(var2, var3, var4, var7, 2);
         }

         var10 = 1;
      }

      return (boolean)var10;
   }

   // $FF: renamed from: D () int
   public int method_2493() {
      return class_1037.method_5872();
   }

   // $FF: renamed from: i (int) int
   public int method_2494(int var1) {
      return class_1037.method_5872();
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      return var1.method_35(var2, var4).method_5716(var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = this.method_2701(var1, var2, var3, var4);
      }

      if(var6 != null && !var10000) {
         this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.field_1819.nextInt(4);
      }

      if(var6 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = 4;
      }

      int var7 = var10000;
      int var8 = 5;
      byte var9 = 0;
      int var10 = var2 - var7;

      label314:
      while(true) {
         var10000 = var10;

         int var14;
         int var15;
         aji var16;
         aji var17;
         label329: {
            int var11;
            int var12;
            label310:
            while(true) {
               if(var10000 <= var2 + var7) {
                  var10000 = var4 - var7;
                  if(var6 == null) {
                     break;
                  }

                  var11 = var10000;

                  label303:
                  while(true) {
                     if(var11 <= var4 + var7) {
                        var10000 = var3 - 1;
                        if(var6 == null) {
                           continue label310;
                        }

                        var12 = var10000;

                        while(var12 <= var3 + 1) {
                           var17 = var1.getBlock(var10, var12, var11);
                           if(var6 == null) {
                              break label329;
                           }

                           label295: {
                              if(var17 == this) {
                                 --var8;
                                 if(var6 == null) {
                                    break label295;
                                 }

                                 if(var8 <= 0) {
                                    var9 = 1;
                                    if(var6 != null) {
                                       break label303;
                                    }
                                 }
                              }

                              ++var12;
                           }

                           if(var6 == null) {
                              break;
                           }
                        }

                        ++var11;
                        if(var6 != null) {
                           continue;
                        }
                     }

                     ++var10;
                     if(var6 != null) {
                        continue label314;
                     }
                     break;
                  }
               }

               var10 = var1.method_33(var2, var3, var4);
               var10000 = var1.field_1819.nextInt(6);
               break;
            }

            var11 = var10000;
            var12 = class_1649.field_8591[var11];
            var10000 = var11;
            short var10001 = 1;
            if(var6 != null) {
               label276: {
                  label275: {
                     if(var11 == 1) {
                        var10000 = var3;
                        var10001 = 255;
                        if(var6 == null) {
                           break label276;
                        }

                        if(var3 < 255) {
                           var10000 = var1.method_34(var2, var3 + 1, var4);
                           if(var6 == null) {
                              break label275;
                           }

                           if(var10000 != 0) {
                              var10000 = var9;
                              if(var6 != null) {
                                 if(var9 != 0) {
                                    return;
                                 }

                                 var10000 = var1.field_1819.nextInt(16) & var10;
                              }

                              label334: {
                                 int var13 = var10000;
                                 var10000 = var13;
                                 if(var6 != null) {
                                    if(var13 <= 0) {
                                       break label334;
                                    }

                                    var10000 = 0;
                                 }

                                 var14 = var10000;

                                 while(true) {
                                    if(var14 <= 3) {
                                       var10000 = this.method_2700(var1.getBlock(var2 + class_1649.field_8587[var14], var3 + 1, var4 + class_1649.field_8588[var14]));
                                       if(var6 == null) {
                                          break;
                                       }

                                       label231: {
                                          if(var6 != null) {
                                             if(var10000 != 0) {
                                                break label231;
                                             }

                                             var10000 = var13 & ~(1 << var14);
                                          }

                                          var13 = var10000;
                                       }

                                       ++var14;
                                       if(var6 != null) {
                                          continue;
                                       }
                                    }

                                    var10000 = var13;
                                    break;
                                 }

                                 if(var6 != null && var10000 > 0) {
                                    var1.method_2054(var2, var3 + 1, var4, this, var13, 2);
                                 }
                              }

                              if(var6 != null) {
                                 break;
                              }
                           }
                        }
                     }

                     var10000 = var11;
                  }

                  var10001 = 2;
               }
            }

            if(var6 != null) {
               label264: {
                  label263: {
                     if(var10000 >= var10001) {
                        var10000 = var11;
                        var10001 = 5;
                        if(var6 == null) {
                           break label264;
                        }

                        if(var11 <= 5) {
                           var10000 = var10 & 1 << var12;
                           if(var6 == null) {
                              break label263;
                           }

                           if(var10000 == 0) {
                              if(var9 != 0) {
                                 return;
                              }

                              label337: {
                                 var16 = var1.getBlock(var2 + class_1649.field_8587[var12], var3, var4 + class_1649.field_8588[var12]);
                                 awt var18 = var16.field_2007;
                                 if(var6 != null) {
                                    if(var16.field_2007 == awt.field_4170) {
                                       label338: {
                                          var14 = var12 + 1 & 3;
                                          var15 = var12 + 3 & 3;
                                          var10000 = var10 & 1 << var14;
                                          if(var6 != null) {
                                             label208: {
                                                if(var10000 != 0) {
                                                   var10000 = this.method_2700(var1.getBlock(var2 + class_1649.field_8587[var12] + class_1649.field_8587[var14], var3, var4 + class_1649.field_8588[var12] + class_1649.field_8588[var14]));
                                                   if(var6 == null) {
                                                      break label208;
                                                   }

                                                   if(var10000 != 0) {
                                                      var1.method_2054(var2 + class_1649.field_8587[var12], var3, var4 + class_1649.field_8588[var12], this, 1 << var14, 2);
                                                      if(var6 != null) {
                                                         break label338;
                                                      }
                                                   }
                                                }

                                                var10000 = var10 & 1 << var15;
                                             }
                                          }

                                          if(var6 != null) {
                                             label198: {
                                                if(var10000 != 0) {
                                                   var10000 = this.method_2700(var1.getBlock(var2 + class_1649.field_8587[var12] + class_1649.field_8587[var15], var3, var4 + class_1649.field_8588[var12] + class_1649.field_8588[var15]));
                                                   if(var6 == null) {
                                                      break label198;
                                                   }

                                                   if(var10000 != 0) {
                                                      var1.method_2054(var2 + class_1649.field_8587[var12], var3, var4 + class_1649.field_8588[var12], this, 1 << var15, 2);
                                                      if(var6 != null) {
                                                         break label338;
                                                      }
                                                   }
                                                }

                                                var10000 = var10 & 1 << var14;
                                             }
                                          }

                                          if(var6 != null) {
                                             label188: {
                                                if(var10000 != 0) {
                                                   var10000 = var1.method_34(var2 + class_1649.field_8587[var12] + class_1649.field_8587[var14], var3, var4 + class_1649.field_8588[var12] + class_1649.field_8588[var14]);
                                                   if(var6 == null) {
                                                      break label188;
                                                   }

                                                   if(var10000 != 0) {
                                                      var10000 = this.method_2700(var1.getBlock(var2 + class_1649.field_8587[var14], var3, var4 + class_1649.field_8588[var14]));
                                                      if(var6 == null) {
                                                         break label188;
                                                      }

                                                      if(var10000 != 0) {
                                                         var1.method_2054(var2 + class_1649.field_8587[var12] + class_1649.field_8587[var14], var3, var4 + class_1649.field_8588[var12] + class_1649.field_8588[var14], this, 1 << (var12 + 2 & 3), 2);
                                                         if(var6 != null) {
                                                            break label338;
                                                         }
                                                      }
                                                   }
                                                }

                                                var10000 = var10 & 1 << var15;
                                             }
                                          }

                                          if(var6 != null) {
                                             label175: {
                                                if(var10000 != 0) {
                                                   var10000 = var1.method_34(var2 + class_1649.field_8587[var12] + class_1649.field_8587[var15], var3, var4 + class_1649.field_8588[var12] + class_1649.field_8588[var15]);
                                                   if(var6 == null) {
                                                      break label175;
                                                   }

                                                   if(var10000 != 0) {
                                                      var10000 = this.method_2700(var1.getBlock(var2 + class_1649.field_8587[var15], var3, var4 + class_1649.field_8588[var15]));
                                                      if(var6 == null) {
                                                         break label175;
                                                      }

                                                      if(var10000 != 0) {
                                                         var1.method_2054(var2 + class_1649.field_8587[var12] + class_1649.field_8587[var15], var3, var4 + class_1649.field_8588[var12] + class_1649.field_8588[var15], this, 1 << (var12 + 2 & 3), 2);
                                                         if(var6 != null) {
                                                            break label338;
                                                         }
                                                      }
                                                   }
                                                }

                                                var10000 = this.method_2700(var1.getBlock(var2 + class_1649.field_8587[var12], var3 + 1, var4 + class_1649.field_8588[var12]));
                                             }
                                          }

                                          if(var6 != null && var10000 != 0) {
                                             var1.method_2054(var2 + class_1649.field_8587[var12], var3, var4 + class_1649.field_8588[var12], this, 0, 2);
                                          }
                                       }

                                       if(var6 != null) {
                                          break label337;
                                       }
                                    }

                                    var18 = var16.field_2007;
                                 }

                                 boolean var19 = var18.method_5072();
                                 if(var6 != null) {
                                    if(!var19) {
                                       break label337;
                                    }

                                    var19 = var16.method_2434();
                                 }

                                 if(var6 != null && var19) {
                                    var1.method_2055(var2, var3, var4, var10 | 1 << var12, 2);
                                 }
                              }

                              if(var6 != null) {
                                 break;
                              }
                           }
                        }
                     }

                     var10000 = var3;
                  }

                  var10001 = 1;
               }
            }

            if(var10000 <= var10001) {
               break;
            }

            var17 = var1.getBlock(var2, var3 - 1, var4);
         }

         var16 = var17;
         var17 = var16;
         if(var6 != null) {
            if(var16.field_2007 == awt.field_4170) {
               var14 = var1.field_1819.nextInt(16) & var10;
               if(var6 != null && var14 > 0) {
                  var1.method_2054(var2, var3 - 1, var4, this, var14, 2);
               }

               if(var6 != null) {
                  break;
               }
            }

            var17 = var16;
         }

         if(var17 == this) {
            var14 = var1.field_1819.nextInt(16) & var10;
            var15 = var1.method_33(var2, var3 - 1, var4);
            if(var6 != null && var15 != (var15 | var14)) {
               var1.method_2055(var2, var3 - 1, var4, var15 | var14, 2);
            }
         }
         break;
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      byte var11 = 0;
      String[] var10 = class_752.method_4253();
      int var10000 = var5;
      if(var10 != null) {
         switch(var5) {
         case 2:
            var11 = 1;
            if(var10 != null) {
               break;
            }
         case 3:
            var11 = 4;
            if(var10 != null) {
               break;
            }
         case 4:
            var11 = 8;
            if(var10 != null) {
               break;
            }
         case 5:
            var11 = 2;
         }

         var10000 = var11;
      }

      if(var10 != null) {
         if(var10000 != 0) {
            return var11;
         }

         var10000 = var9;
      }

      return var10000;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return null;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: a (ahb, yz, int, int, int, int) void
   public void method_2501(ahb var1, class_792 var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      if(!var1.field_1832) {
         label26: {
            class_792 var8;
            label30: {
               add var10000 = var2.method_4593();
               if(var7 != null) {
                  if(var10000 == null) {
                     break label26;
                  }

                  var8 = var2;
                  if(var7 == null) {
                     break label30;
                  }

                  var10000 = var2.method_4593();
               }

               if(var10000.method_3730() != class_1010.field_5216) {
                  break label26;
               }

               var8 = var2;
            }

            var8.method_4615(class_1698.field_8908[aji.method_2415(this)], 1);
            add var10005 = new add;
            var10005.method_3723(class_1192.field_6131, 1, 0);
            this.method_2468(var1, var3, var4, var5, var10005);
            if(var7 != null) {
               return;
            }
         }
      }

      super.method_2501(var1, var2, var3, var4, var5, var6);
   }
}
