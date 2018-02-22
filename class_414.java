import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// $FF: renamed from: fA
public class class_414 extends aji {

   // $FF: renamed from: M boolean
   private boolean field_2121;
   // $FF: renamed from: N java.util.Set
   private Set field_2122;
   // $FF: renamed from: O vL
   private class_73 field_2123;
   // $FF: renamed from: P vL
   private class_73 field_2124;
   // $FF: renamed from: Q vL
   private class_73 field_2125;
   // $FF: renamed from: R vL
   private class_73 field_2126;
   // $FF: renamed from: S java.lang.String[]
   private static final String[] field_2127;


   // $FF: renamed from: <init> () void
   public void method_2657() {
      super.method_2427(awt.field_4186);
      this.field_2121 = true;
      this.field_2122 = new HashSet();
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
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
      return 5;
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      return 8388608;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var5 != null) {
         var10000 = var10000 || var1.getBlock(var2, var3 - 1, var4) == class_1192.field_6115;
      }

      return var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   private void method_2658(ahb var1, int var2, int var3, int var4) {
      this.method_2659(var1, var2, var3, var4, var2, var3, var4);
      String[] var10000 = class_752.method_4253();
      ArrayList var6 = new ArrayList(this.field_2122);
      this.field_2122.clear();
      String[] var5 = var10000;
      int var7 = 0;

      while(var7 < var6.size()) {
         class_1034 var8 = (class_1034)var6.get(var7);
         var1.method_2063(var8.field_5472, var8.field_5473, var8.field_5474, this);
         ++var7;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, int, int, int) void
   private void method_2659(ahb var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var9 = var1.method_33(var2, var3, var4);
      byte var10 = 0;
      String[] var10000 = class_752.method_4253();
      int var16 = this.method_2661(var1, var5, var6, var7, var10);
      this.field_2121 = false;
      String[] var8 = var10000;
      int var11 = var1.method_2173(var2, var3, var4);
      this.field_2121 = true;
      int var17 = var11;
      if(var8 != null) {
         label195: {
            if(var11 > 0) {
               var17 = var11;
               if(var8 == null) {
                  break label195;
               }

               if(var11 > var16 - 1) {
                  var16 = var11;
               }
            }

            var17 = 0;
         }
      }

      int var12 = var17;
      int var13 = 0;

      int var10001;
      while(true) {
         if(var13 < 4) {
            int var14 = var2;
            int var15 = var4;
            var17 = var13;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               if(var13 == 0) {
                  var14 = var2 - 1;
               }

               var17 = var13;
            }

            var10001 = 1;
            if(var8 != null) {
               if(var17 == 1) {
                  ++var14;
               }

               var17 = var13;
               var10001 = 2;
            }

            if(var8 != null) {
               if(var17 == var10001) {
                  var15 = var4 - 1;
               }

               var17 = var13;
               var10001 = 3;
            }

            label180: {
               label179: {
                  label200: {
                     if(var8 != null) {
                        if(var17 == var10001) {
                           ++var15;
                        }

                        var17 = var14;
                        if(var8 == null) {
                           break label200;
                        }

                        var10001 = var5;
                     }

                     if(var17 == var10001) {
                        var17 = var15;
                        if(var8 == null) {
                           break label180;
                        }

                        if(var15 == var7) {
                           break label179;
                        }
                     }

                     var17 = this.method_2661(var1, var14, var3, var15, var12);
                  }

                  var12 = var17;
               }

               var17 = var1.getBlock(var14, var3, var15).method_2433();
            }

            label202: {
               if(var8 != null) {
                  label162: {
                     if(var17 != 0) {
                        var17 = var1.getBlock(var2, var3 + 1, var4).method_2433();
                        if(var8 == null) {
                           break label162;
                        }

                        if(var17 == 0) {
                           label203: {
                              var17 = var14;
                              var10001 = var5;
                              if(var8 != null) {
                                 label204: {
                                    if(var14 == var5) {
                                       var17 = var15;
                                       var10001 = var7;
                                       if(var8 == null) {
                                          break label204;
                                       }

                                       if(var15 == var7) {
                                          break label202;
                                       }
                                    }

                                    var17 = var3;
                                    if(var8 == null) {
                                       break label203;
                                    }

                                    var10001 = var6;
                                 }
                              }

                              if(var17 < var10001) {
                                 break label202;
                              }

                              var17 = this.method_2661(var1, var14, var3 + 1, var15, var12);
                           }

                           var12 = var17;
                           if(var8 != null) {
                              break label202;
                           }
                        }
                     }

                     var17 = var1.getBlock(var14, var3, var15).method_2433();
                  }
               }

               if(var8 != null) {
                  if(var17 != 0) {
                     break label202;
                  }

                  var17 = var14;
               }

               label205: {
                  var10001 = var5;
                  if(var8 != null) {
                     label206: {
                        if(var17 == var5) {
                           var17 = var15;
                           var10001 = var7;
                           if(var8 == null) {
                              break label206;
                           }

                           if(var15 == var7) {
                              break label202;
                           }
                        }

                        var17 = var3;
                        if(var8 == null) {
                           break label205;
                        }

                        var10001 = var6;
                     }
                  }

                  if(var17 > var10001) {
                     break label202;
                  }

                  var17 = this.method_2661(var1, var14, var3 - 1, var15, var12);
               }

               var12 = var17;
            }

            ++var13;
            if(var8 != null) {
               continue;
            }
         }

         var17 = var12;
         break;
      }

      label207: {
         if(var8 != null) {
            if(var17 > var16) {
               var16 = var12 - 1;
               if(var8 != null) {
                  break label207;
               }
            }

            var17 = var16;
         }

         if(var8 != null) {
            if(var17 > 0) {
               --var16;
               if(var8 != null) {
                  break label207;
               }
            }

            var17 = 0;
         }

         var16 = var17;
      }

      var17 = var11;
      var10001 = var16 - 1;
      if(var8 != null) {
         if(var11 > var10001) {
            var16 = var11;
         }

         var17 = var9;
         if(var8 == null) {
            return;
         }

         var10001 = var16;
      }

      if(var17 != var10001) {
         var1.method_2055(var2, var3, var4, var16, 2);
         Set var19 = this.field_2122;
         class_1034 var18 = new class_1034;
         var18.method_5854(var2, var3, var4);
         var19.add(var18);
         var19 = this.field_2122;
         var18 = new class_1034;
         var18.method_5854(var2 - 1, var3, var4);
         var19.add(var18);
         var19 = this.field_2122;
         var18 = new class_1034;
         var18.method_5854(var2 + 1, var3, var4);
         var19.add(var18);
         var19 = this.field_2122;
         var18 = new class_1034;
         var18.method_5854(var2, var3 - 1, var4);
         var19.add(var18);
         var19 = this.field_2122;
         var18 = new class_1034;
         var18.method_5854(var2, var3 + 1, var4);
         var19.add(var18);
         var19 = this.field_2122;
         var18 = new class_1034;
         var18.method_5854(var2, var3, var4 - 1);
         var19.add(var18);
         var19 = this.field_2122;
         var18 = new class_1034;
         var18.method_5854(var2, var3, var4 + 1);
         var19.add(var18);
      }

   }

   // $FF: renamed from: i (ahb, int, int, int) void
   private void method_2660(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      ahb var10000 = var1;
      int var10001 = var2;
      int var10002 = var3;
      int var10003 = var4;
      if(var5 != null) {
         if(var1.getBlock(var2, var3, var4) != this) {
            return;
         }

         var1.method_2063(var2, var3, var4, this);
         var1.method_2063(var2 - 1, var3, var4, this);
         var1.method_2063(var2 + 1, var3, var4, this);
         var1.method_2063(var2, var3, var4 - 1, this);
         var1.method_2063(var2, var3, var4 + 1, this);
         var1.method_2063(var2, var3 - 1, var4, this);
         var10000 = var1;
         var10001 = var2;
         var10002 = var3 + 1;
         var10003 = var4;
      }

      var10000.method_2063(var10001, var10002, var10003, this);
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var5;
      label49: {
         ahb var10001;
         int var10002;
         int var10003;
         int var10004;
         class_414 var6;
         label52: {
            super.method_2461(var1, var2, var3, var4);
            var5 = class_752.method_4253();
            boolean var10000 = var1.field_1832;
            if(var5 != null) {
               if(var1.field_1832) {
                  return;
               }

               this.method_2658(var1, var2, var3, var4);
               var1.method_2063(var2, var3 + 1, var4, this);
               var1.method_2063(var2, var3 - 1, var4, this);
               this.method_2660(var1, var2 - 1, var3, var4);
               this.method_2660(var1, var2 + 1, var3, var4);
               this.method_2660(var1, var2, var3, var4 - 1);
               var6 = this;
               var10001 = var1;
               var10002 = var2;
               var10003 = var3;
               var10004 = var4 + 1;
               if(var5 == null) {
                  break label52;
               }

               this.method_2660(var1, var2, var3, var10004);
               var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
            }

            if(var10000) {
               this.method_2660(var1, var2 - 1, var3 + 1, var4);
               if(var5 != null) {
                  break label49;
               }
            }

            var6 = this;
            var10001 = var1;
            var10002 = var2 - 1;
            var10003 = var3 - 1;
            var10004 = var4;
         }

         var6.method_2660(var10001, var10002, var10003, var10004);
      }

      label37: {
         if(var1.getBlock(var2 + 1, var3, var4).method_2433()) {
            this.method_2660(var1, var2 + 1, var3 + 1, var4);
            if(var5 != null) {
               break label37;
            }
         }

         this.method_2660(var1, var2 + 1, var3 - 1, var4);
      }

      label32: {
         if(var1.getBlock(var2, var3, var4 - 1).method_2433()) {
            this.method_2660(var1, var2, var3 + 1, var4 - 1);
            if(var5 != null) {
               break label32;
            }
         }

         this.method_2660(var1, var2, var3 - 1, var4 - 1);
      }

      if(var1.getBlock(var2, var3, var4 + 1).method_2433()) {
         this.method_2660(var1, var2, var3 + 1, var4 + 1);
         if(var5 != null) {
            return;
         }
      }

      this.method_2660(var1, var2, var3 - 1, var4 + 1);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var7;
      label49: {
         class_414 var9;
         ahb var10001;
         int var10002;
         int var10003;
         int var10004;
         label52: {
            String[] var10000 = class_752.method_4253();
            super.method_2462(var1, var2, var3, var4, var5, var6);
            var7 = var10000;
            boolean var8 = var1.field_1832;
            if(var7 != null) {
               if(var1.field_1832) {
                  return;
               }

               var1.method_2063(var2, var3 + 1, var4, this);
               var1.method_2063(var2, var3 - 1, var4, this);
               var1.method_2063(var2 + 1, var3, var4, this);
               var1.method_2063(var2 - 1, var3, var4, this);
               var1.method_2063(var2, var3, var4 + 1, this);
               var1.method_2063(var2, var3, var4 - 1, this);
               this.method_2658(var1, var2, var3, var4);
               this.method_2660(var1, var2 - 1, var3, var4);
               this.method_2660(var1, var2 + 1, var3, var4);
               this.method_2660(var1, var2, var3, var4 - 1);
               var9 = this;
               var10001 = var1;
               var10002 = var2;
               var10003 = var3;
               var10004 = var4 + 1;
               if(var7 == null) {
                  break label52;
               }

               this.method_2660(var1, var2, var3, var10004);
               var8 = var1.getBlock(var2 - 1, var3, var4).method_2433();
            }

            if(var8) {
               this.method_2660(var1, var2 - 1, var3 + 1, var4);
               if(var7 != null) {
                  break label49;
               }
            }

            var9 = this;
            var10001 = var1;
            var10002 = var2 - 1;
            var10003 = var3 - 1;
            var10004 = var4;
         }

         var9.method_2660(var10001, var10002, var10003, var10004);
      }

      label37: {
         if(var1.getBlock(var2 + 1, var3, var4).method_2433()) {
            this.method_2660(var1, var2 + 1, var3 + 1, var4);
            if(var7 != null) {
               break label37;
            }
         }

         this.method_2660(var1, var2 + 1, var3 - 1, var4);
      }

      label32: {
         if(var1.getBlock(var2, var3, var4 - 1).method_2433()) {
            this.method_2660(var1, var2, var3 + 1, var4 - 1);
            if(var7 != null) {
               break label32;
            }
         }

         this.method_2660(var1, var2, var3 - 1, var4 - 1);
      }

      if(var1.getBlock(var2, var3, var4 + 1).method_2433()) {
         this.method_2660(var1, var2, var3 + 1, var4 + 1);
         if(var7 != null) {
            return;
         }
      }

      this.method_2660(var1, var2, var3 - 1, var4 + 1);
   }

   // $FF: renamed from: h (ahb, int, int, int, int) int
   private int method_2661(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      ahb var10000 = var1;
      int var10001 = var2;
      int var10002 = var3;
      int var10003 = var4;
      if(var6 != null) {
         if(var1.getBlock(var2, var3, var4) != this) {
            return var5;
         }

         var10000 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      int var7 = var10000.method_33(var10001, var10002, var10003);
      int var8 = var7;
      if(var6 != null) {
         if(var7 > var5) {
            return var7;
         }

         var8 = var5;
      }

      return var8;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = this.method_2480(var1, var2, var3, var4);
      }

      boolean var7 = var10000;
      if(var6 != null) {
         label20: {
            if(var7) {
               this.method_2658(var1, var2, var3, var4);
               if(var6 != null) {
                  break label20;
               }
            }

            this.method_2466(var1, var2, var3, var4, 0, 0);
            var1.method_2056(var2, var3, var4);
         }
      }

      super.method_2459(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5189;
   }

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.field_2121;
      if(var6 != null) {
         if(!this.field_2121) {
            return 0;
         }

         var10000 = this.method_2496(var1, var2, var3, var4, var5);
      }

      return var10000;
   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.field_2121;
      if(var6 != null) {
         if(!this.field_2121) {
            return 0;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      var10000 = var7;
      if(var6 != null) {
         if(var7 == 0) {
            return 0;
         }

         var10000 = var5;
      }

      if(var6 != null) {
         if(var10000 == 1) {
            return var7;
         }

         var10000 = method_2663(var1, var2 - 1, var3, var4, 1);
      }

      if(var6 != null) {
         label328: {
            if(var10000 == 0) {
               label326: {
                  label336: {
                     var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
                     if(var6 != null) {
                        if(var10000 != 0) {
                           break label336;
                        }

                        var10000 = method_2663(var1, var2 - 1, var3 - 1, var4, -1);
                     }

                     if(var6 == null) {
                        break label328;
                     }

                     if(var10000 != 0) {
                        break label326;
                     }
                  }

                  var10000 = 0;
                  break label328;
               }
            }

            var10000 = 1;
         }
      }

      int var8 = var10000;
      byte var12 = method_2663(var1, var2 + 1, var3, var4, 3);
      if(var6 != null) {
         label313: {
            if(var12 == 0) {
               label311: {
                  label337: {
                     var12 = var1.getBlock(var2 + 1, var3, var4).method_2433();
                     if(var6 != null) {
                        if(var12 != 0) {
                           break label337;
                        }

                        var12 = method_2663(var1, var2 + 1, var3 - 1, var4, -1);
                     }

                     if(var6 == null) {
                        break label313;
                     }

                     if(var12 != 0) {
                        break label311;
                     }
                  }

                  var12 = 0;
                  break label313;
               }
            }

            var12 = 1;
         }
      }

      byte var9 = var12;
      var12 = method_2663(var1, var2, var3, var4 - 1, 2);
      if(var6 != null) {
         label298: {
            if(var12 == 0) {
               label296: {
                  label338: {
                     var12 = var1.getBlock(var2, var3, var4 - 1).method_2433();
                     if(var6 != null) {
                        if(var12 != 0) {
                           break label338;
                        }

                        var12 = method_2663(var1, var2, var3 - 1, var4 - 1, -1);
                     }

                     if(var6 == null) {
                        break label298;
                     }

                     if(var12 != 0) {
                        break label296;
                     }
                  }

                  var12 = 0;
                  break label298;
               }
            }

            var12 = 1;
         }
      }

      byte var10 = var12;
      var12 = method_2663(var1, var2, var3, var4 + 1, 0);
      if(var6 != null) {
         label283: {
            if(var12 == 0) {
               label281: {
                  label339: {
                     var12 = var1.getBlock(var2, var3, var4 + 1).method_2433();
                     if(var6 != null) {
                        if(var12 != 0) {
                           break label339;
                        }

                        var12 = method_2663(var1, var2, var3 - 1, var4 + 1, -1);
                     }

                     if(var6 == null) {
                        break label283;
                     }

                     if(var12 != 0) {
                        break label281;
                     }
                  }

                  var12 = 0;
                  break label283;
               }
            }

            var12 = 1;
         }
      }

      byte var11 = var12;
      var10000 = var1.getBlock(var2, var3 + 1, var4).method_2433();
      if(var6 != null) {
         label268: {
            if(var10000 == 0) {
               var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
               if(var6 != null) {
                  label345: {
                     if(var10000 != 0) {
                        var10000 = method_2663(var1, var2 - 1, var3 + 1, var4, -1);
                        if(var6 == null) {
                           break label345;
                        }

                        if(var10000 != 0) {
                           var8 = 1;
                        }
                     }

                     var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
                  }
               }

               if(var6 != null) {
                  label346: {
                     if(var10000 != 0) {
                        var10000 = method_2663(var1, var2 + 1, var3 + 1, var4, -1);
                        if(var6 == null) {
                           break label346;
                        }

                        if(var10000 != 0) {
                           var9 = 1;
                        }
                     }

                     var10000 = var1.getBlock(var2, var3, var4 - 1).method_2433();
                  }
               }

               if(var6 != null) {
                  label240: {
                     if(var10000 != 0) {
                        var10000 = method_2663(var1, var2, var3 + 1, var4 - 1, -1);
                        if(var6 == null) {
                           break label240;
                        }

                        if(var10000 != 0) {
                           var10 = 1;
                        }
                     }

                     var10000 = var1.getBlock(var2, var3, var4 + 1).method_2433();
                  }
               }

               if(var6 == null) {
                  break label268;
               }

               if(var10000 != 0) {
                  var10000 = method_2663(var1, var2, var3 + 1, var4 + 1, -1);
                  if(var6 == null) {
                     break label268;
                  }

                  if(var10000 != 0) {
                     var11 = 1;
                  }
               }
            }

            var10000 = var10;
         }
      }

      byte var10001;
      label234: {
         if(var6 != null) {
            label232: {
               if(var10000 == 0) {
                  var10000 = var9;
                  if(var6 == null) {
                     break label232;
                  }

                  if(var9 == 0) {
                     var10000 = var8;
                     if(var6 == null) {
                        break label232;
                     }

                     if(var8 == 0) {
                        var10000 = var11;
                        if(var6 == null) {
                           break label232;
                        }

                        if(var11 == 0) {
                           var10000 = var5;
                           var10001 = 2;
                           if(var6 == null) {
                              break label234;
                           }

                           if(var5 >= 2) {
                              var10000 = var5;
                              var10001 = 5;
                              if(var6 == null) {
                                 break label234;
                              }

                              if(var5 <= 5) {
                                 return var7;
                              }
                           }
                        }
                     }
                  }
               }

               var10000 = var5;
            }
         }

         var10001 = 2;
      }

      if(var6 != null) {
         label211: {
            if(var10000 == var10001) {
               var10000 = var10;
               if(var6 == null) {
                  break label211;
               }

               if(var10 != 0) {
                  var10000 = var8;
                  if(var6 == null) {
                     break label211;
                  }

                  if(var8 == 0) {
                     var10000 = var9;
                     if(var6 == null) {
                        break label211;
                     }

                     if(var9 == 0) {
                        return var7;
                     }
                  }
               }
            }

            var10000 = var5;
         }

         var10001 = 3;
      }

      if(var6 != null) {
         label197: {
            if(var10000 == var10001) {
               var10000 = var11;
               if(var6 == null) {
                  break label197;
               }

               if(var11 != 0) {
                  var10000 = var8;
                  if(var6 == null) {
                     break label197;
                  }

                  if(var8 == 0) {
                     var10000 = var9;
                     if(var6 == null) {
                        break label197;
                     }

                     if(var9 == 0) {
                        return var7;
                     }
                  }
               }
            }

            var10000 = var5;
         }

         var10001 = 4;
      }

      if(var6 != null) {
         label179: {
            if(var10000 == var10001) {
               var10000 = var8;
               if(var6 == null) {
                  break label179;
               }

               if(var8 != 0) {
                  var10000 = var10;
                  if(var6 == null) {
                     break label179;
                  }

                  if(var10 == 0) {
                     var10000 = var11;
                     if(var6 == null) {
                        break label179;
                     }

                     if(var11 == 0) {
                        return var7;
                     }
                  }
               }
            }

            var10000 = var5;
         }

         if(var6 == null) {
            return var10000;
         }

         var10001 = 5;
      }

      if(var10000 == var10001) {
         var10000 = var9;
         if(var6 == null) {
            return var10000;
         }

         if(var9 != 0) {
            var10000 = var10;
            if(var6 == null) {
               return var10000;
            }

            if(var10 == 0) {
               var10000 = var11;
               if(var6 == null) {
                  return var10000;
               }

               if(var11 == 0) {
                  return var7;
               }
            }
         }
      }

      var10000 = 0;
      return var10000;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      return this.field_2121;
   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = var10000;
      int var18 = var7;
      if(var6 != null) {
         if(var7 <= 0) {
            return;
         }

         var18 = var2;
      }

      double var8 = (double)var18 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
      double var10 = (double)((float)var3 + 0.0625F);
      double var12 = (double)var4 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
      float var14 = (float)var7 / 15.0F;
      float var15 = var14 * 0.6F + 0.4F;
      if(var7 == 0) {
         var15 = 0.0F;
      }

      float var16;
      float var17;
      label30: {
         float var19;
         label40: {
            var16 = var14 * var14 * 0.7F - 0.5F;
            var17 = var14 * var14 * 0.6F - 0.7F;
            float var20;
            var18 = (var20 = var16 - 0.0F) == 0.0F?0:(var20 < 0.0F?-1:1);
            if(var6 != null) {
               if(var18 < 0) {
                  var16 = 0.0F;
               }

               var19 = var17;
               if(var6 == null) {
                  break label40;
               }

               float var21;
               var18 = (var21 = var17 - 0.0F) == 0.0F?0:(var21 < 0.0F?-1:1);
            }

            if(var18 >= 0) {
               break label30;
            }

            var19 = 0.0F;
         }

         var17 = var19;
      }

      String[] var10001 = field_2127;
      var1.method_2087("reddust", var8, var10, var12, (double)var15, (double)var16, (double)var17);
   }

   // $FF: renamed from: g (ahl, int, int, int, int) boolean
   public static boolean method_2662(ahl var0, int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      aji var6 = var0.getBlock(var1, var2, var3);
      String[] var5 = var10000;
      if(var6 == class_1192.field_6082) {
         return true;
      } else {
         int var8 = class_1192.field_6119.method_2727(var6);
         if(var5 != null) {
            if(var8 != 0) {
               int var7 = var0.method_33(var1, var2, var3);
               var8 = var4;
               if(var5 != null) {
                  if(var4 != (var7 & 3)) {
                     var8 = var4;
                     if(var5 == null) {
                        return (boolean)var8;
                     }

                     if(var4 != class_1649.field_8592[var7 & 3]) {
                        var8 = 0;
                        return (boolean)var8;
                     }
                  }

                  var8 = 1;
               }

               return (boolean)var8;
            }

            var8 = var6.method_2497();
         }

         if(var5 != null) {
            if(var8 != 0) {
               var8 = var4;
               if(var5 == null) {
                  return (boolean)var8;
               }

               if(var4 != -1) {
                  return true;
               }
            }

            var8 = 0;
         }

         return (boolean)var8;
      }
   }

   // $FF: renamed from: h (ahl, int, int, int, int) boolean
   public static boolean method_2663(ahl var0, int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      ahl var10000 = var0;
      int var10001 = var1;
      int var10002 = var2;
      int var10003 = var3;
      if(var5 != null) {
         if(method_2662(var0, var1, var2, var3, var4)) {
            return true;
         }

         var10000 = var0;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
      }

      if(var5 != null) {
         if(var10000.getBlock(var10001, var10002, var10003) != class_1192.field_6120) {
            return false;
         }

         var10000 = var0;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
      }

      int var6 = var10000.method_33(var10001, var10002, var10003);
      int var7 = var4;
      if(var5 != null) {
         var7 = var4 == (var6 & 3)?1:0;
      }

      return (boolean)var7;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5189;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533()).append("_");
      String[] var2 = field_2127;
      this.field_2123 = var1.method_375(var10002.append("cross").toString());
      this.field_2124 = var1.method_375(this.method_2533() + "_" + "line");
      this.field_2125 = var1.method_375(this.method_2533() + "_" + "cross_overlay");
      this.field_2126 = var1.method_375(this.method_2533() + "_" + "line_overlay");
      this.field_2010 = this.field_2123;
   }

   // $FF: renamed from: a (java.lang.String) vL
   public static class_73 method_2664(String var0) {
      String[] var1 = class_752.method_4253();
      String[] var2 = field_2127;
      boolean var10000 = var0.equals("cross");
      if(var1 != null) {
         if(var10000) {
            return class_1192.field_6082.field_2123;
         }

         var2 = field_2127;
         var10000 = var0.equals("line");
      }

      if(var1 != null) {
         if(var10000) {
            return class_1192.field_6082.field_2124;
         }

         var2 = field_2127;
         var10000 = var0.equals("cross_overlay");
      }

      if(var1 != null) {
         if(var10000) {
            return class_1192.field_6082.field_2125;
         }

         String[] var10001 = field_2127;
         var10000 = var0.equals("line_overlay");
      }

      return var10000?class_1192.field_6082.field_2126:null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
