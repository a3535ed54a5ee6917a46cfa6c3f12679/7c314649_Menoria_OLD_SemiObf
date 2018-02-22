import java.util.Random;

// $FF: renamed from: fX
public abstract class class_382 extends class_381 {

   // $FF: renamed from: N int[]
   int[] field_2058;
   // $FF: renamed from: O int
   protected int field_2059;
   // $FF: renamed from: P vL[][]
   protected class_73[][] field_2060;
   // $FF: renamed from: Q java.lang.String
   private static final String field_2061 = "dripWater";


   // $FF: renamed from: <init> () void
   public void method_2589() {
      super.method_2588(awt.field_4179, false);
      this.field_2060 = new class_73[2][];
      this.method_2440(true);
      this.method_2521(class_872.field_4245);
      this.method_2437(0.2F);
      this.method_2429(1);
      this.method_2428(field_1979);
   }

   // $FF: renamed from: D () int
   public int method_2493() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return class_1037.method_5869(var1, var3);
   }

   // $FF: renamed from: i (int) int
   public int method_2494(int var1) {
      return class_1037.method_5872();
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      String[] var10000 = class_752.method_4253();
      int var9 = -1;
      String[] var5 = var10000;

      int var12;
      while(true) {
         if(var9 <= 1) {
            var12 = -1;
            if(var5 == null) {
               break;
            }

            int var10 = -1;

            while(true) {
               if(var10 <= 1) {
                  int var11 = var1.method_35(var2 + var10, var4 + var9).method_5716(var2 + var10, var3, var4 + var9);
                  var6 += (var11 & 16711680) >> 16;
                  var7 += (var11 & '\uff00') >> 8;
                  var8 += var11 & 255;
                  ++var10;
                  if(var5 == null) {
                     break;
                  }

                  if(var5 != null) {
                     continue;
                  }
               }

               ++var9;
               break;
            }

            if(var5 != null) {
               continue;
            }
         }

         var12 = (var6 / 9 & 255) << 16 | (var7 / 9 & 255) << 8 | var8 / 9 & 255;
         break;
      }

      return var12;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      byte var8 = 1;
      int var9 = var8 + 1;
      String[] var7 = class_752.method_4253();
      int var10000 = var1.method_2050(var2 - var9, var3 - var9, var4 - var9, var2 + var9, var3 + var9, var4 + var9);
      if(var7 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = -var8;
      }

      int var10 = var10000;

      do {
         var10000 = var10;

         label53:
         while(true) {
            if(var10000 > var8) {
               return;
            }

            int var11 = -var8;

            while(true) {
               if(var11 > var8) {
                  break label53;
               }

               var10000 = -var8;
               if(var7 == null) {
                  break;
               }

               int var12 = var10000;

               while(true) {
                  if(var12 <= var8) {
                     if(var7 == null) {
                        break;
                     }

                     label39: {
                        ahb var14 = var1;
                        int var10001 = var2 + var10;
                        int var10002 = var3 + var11;
                        int var10003 = var4 + var12;
                        if(var7 != null) {
                           if(var1.getBlock(var10001, var10002, var10003).method_2424() != awt.field_4179) {
                              break label39;
                           }

                           var14 = var1;
                           var10001 = var2 + var10;
                           var10002 = var3 + var11;
                           var10003 = var4 + var12;
                        }

                        int var13 = var14.method_33(var10001, var10002, var10003);
                        var1.method_2055(var2 + var10, var3 + var11, var4 + var12, var13 | 8, 4);
                     }

                     ++var12;
                     if(var7 != null) {
                        continue;
                     }
                  }

                  ++var11;
                  break;
               }

               if(var7 == null) {
                  break label53;
               }
            }
         }

         ++var10;
      } while(var7 != null);

   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      var10000 = var7 & 8;
      if(var6 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var7 & 4;
      }

      if(var6 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = 4;
      }

      int var8;
      int var9;
      byte var10;
      int var11;
      int var12;
      label244: {
         var8 = var10000;
         var9 = var8 + 1;
         var10 = 32;
         var11 = var10 * var10;
         var12 = var10 / 2;
         class_382 var18 = this;
         if(var6 != null) {
            if(this.field_2058 != null) {
               break label244;
            }

            var18 = this;
         }

         var18.field_2058 = new int[var10 * var10 * var10];
      }

      label238: {
         var10000 = var1.method_2050(var2 - var9, var3 - var9, var4 - var9, var2 + var9, var3 + var9, var4 + var9);
         int var13;
         if(var6 != null) {
            if(var10000 != 0) {
               var13 = -var8;

               int var14;
               int var15;
               label188:
               while(true) {
                  var10000 = var13;

                  label185:
                  while(var10000 <= var8) {
                     var10000 = -var8;
                     if(var6 == null) {
                        break label188;
                     }

                     var14 = var10000;

                     while(var14 <= var8) {
                        var10000 = -var8;
                        if(var6 == null) {
                           continue label185;
                        }

                        var15 = var10000;

                        while(true) {
                           if(var15 <= var8) {
                              aji var16 = var1.getBlock(var2 + var13, var3 + var14, var4 + var15);
                              if(var6 == null) {
                                 break;
                              }

                              label265: {
                                 aji var19;
                                 label173: {
                                    label172: {
                                       if(var6 != null) {
                                          if(var16 != class_1192.field_6042) {
                                             var19 = var16;
                                             if(var6 == null) {
                                                break label173;
                                             }

                                             if(var16 != class_1192.field_6043) {
                                                break label172;
                                             }
                                          }

                                          this.field_2058[(var13 + var12) * var11 + (var14 + var12) * var10 + var15 + var12] = 0;
                                       }

                                       if(var6 != null) {
                                          break label265;
                                       }
                                    }

                                    var19 = var16;
                                 }

                                 if(var19.method_2424() == awt.field_4179) {
                                    this.field_2058[(var13 + var12) * var11 + (var14 + var12) * var10 + var15 + var12] = -2;
                                    if(var6 != null) {
                                       break label265;
                                    }
                                 }

                                 this.field_2058[(var13 + var12) * var11 + (var14 + var12) * var10 + var15 + var12] = -1;
                              }

                              ++var15;
                              if(var6 != null) {
                                 continue;
                              }
                           }

                           ++var14;
                           break;
                        }

                        if(var6 == null) {
                           break;
                        }
                     }

                     ++var13;
                     if(var6 != null) {
                        continue label188;
                     }
                     break;
                  }

                  var10000 = 1;
                  break;
               }

               var13 = var10000;

               label233:
               do {
                  var10000 = var13;

                  label230:
                  while(true) {
                     if(var10000 > 4) {
                        break label233;
                     }

                     var10000 = -var8;
                     if(var6 == null) {
                        break label238;
                     }

                     var14 = var10000;

                     while(true) {
                        var10000 = var14;

                        label226:
                        while(true) {
                           if(var10000 > var8) {
                              break label230;
                           }

                           var10000 = -var8;
                           if(var6 == null) {
                              continue label230;
                           }

                           var15 = var10000;

                           label223:
                           do {
                              var10000 = var15;
                              int var10001 = var8;

                              label220:
                              while(true) {
                                 if(var10000 > var10001) {
                                    break label223;
                                 }

                                 var10000 = -var8;
                                 if(var6 == null) {
                                    continue label226;
                                 }

                                 int var17 = var10000;

                                 while(true) {
                                    if(var17 > var8) {
                                       break label220;
                                    }

                                    var10000 = this.field_2058[(var14 + var12) * var11 + (var15 + var12) * var10 + var17 + var12];
                                    var10001 = var13 - 1;
                                    if(var6 == null) {
                                       break;
                                    }

                                    label272: {
                                       if(var6 != null) {
                                          if(var10000 != var10001) {
                                             break label272;
                                          }

                                          var10000 = this.field_2058[(var14 + var12 - 1) * var11 + (var15 + var12) * var10 + var17 + var12];
                                          var10001 = -2;
                                       }

                                       if(var6 != null) {
                                          if(var10000 == var10001) {
                                             this.field_2058[(var14 + var12 - 1) * var11 + (var15 + var12) * var10 + var17 + var12] = var13;
                                          }

                                          var10000 = this.field_2058[(var14 + var12 + 1) * var11 + (var15 + var12) * var10 + var17 + var12];
                                          var10001 = -2;
                                       }

                                       if(var6 != null) {
                                          if(var10000 == var10001) {
                                             this.field_2058[(var14 + var12 + 1) * var11 + (var15 + var12) * var10 + var17 + var12] = var13;
                                          }

                                          var10000 = this.field_2058[(var14 + var12) * var11 + (var15 + var12 - 1) * var10 + var17 + var12];
                                          var10001 = -2;
                                       }

                                       if(var6 != null) {
                                          if(var10000 == var10001) {
                                             this.field_2058[(var14 + var12) * var11 + (var15 + var12 - 1) * var10 + var17 + var12] = var13;
                                          }

                                          var10000 = this.field_2058[(var14 + var12) * var11 + (var15 + var12 + 1) * var10 + var17 + var12];
                                          var10001 = -2;
                                       }

                                       if(var6 != null) {
                                          if(var10000 == var10001) {
                                             this.field_2058[(var14 + var12) * var11 + (var15 + var12 + 1) * var10 + var17 + var12] = var13;
                                          }

                                          var10000 = this.field_2058[(var14 + var12) * var11 + (var15 + var12) * var10 + (var17 + var12 - 1)];
                                          var10001 = -2;
                                       }

                                       int[] var20;
                                       label273: {
                                          if(var6 != null) {
                                             if(var10000 == var10001) {
                                                this.field_2058[(var14 + var12) * var11 + (var15 + var12) * var10 + (var17 + var12 - 1)] = var13;
                                             }

                                             var20 = this.field_2058;
                                             var10001 = (var14 + var12) * var11 + (var15 + var12) * var10 + var17 + var12 + 1;
                                             if(var6 == null) {
                                                break label273;
                                             }

                                             var10000 = this.field_2058[var10001];
                                             var10001 = -2;
                                          }

                                          if(var10000 != var10001) {
                                             break label272;
                                          }

                                          var20 = this.field_2058;
                                          var10001 = (var14 + var12) * var11 + (var15 + var12) * var10 + var17 + var12 + 1;
                                       }

                                       var20[var10001] = var13;
                                    }

                                    ++var17;
                                    if(var6 == null) {
                                       break label220;
                                    }
                                 }
                              }

                              ++var15;
                           } while(var6 != null);

                           ++var14;
                           if(var6 == null) {
                              break label230;
                           }
                           break;
                        }
                     }
                  }

                  ++var13;
               } while(var6 != null);
            }

            var10000 = this.field_2058[var12 * var11 + var12 * var10 + var12];
         }

         var13 = var10000;
         var10000 = var13;
      }

      label119: {
         if(var6 != null) {
            if(var10000 < 0) {
               break label119;
            }

            var1.method_2055(var2, var3, var4, var7 & -9, 4);
         }

         if(var6 != null) {
            return;
         }
      }

      this.method_2590(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.method_2204(var2, var3 + 1, var4);
      if(var6 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      }

      if(var6 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = var5.nextInt(15);
      }

      if(var6 != null) {
         if(var10000 != 1) {
            return;
         }

         var10000 = var2;
      }

      double var7 = (double)((float)var10000 + var5.nextFloat());
      double var9 = (double)var3 - 0.05D;
      double var11 = (double)((float)var4 + var5.nextFloat());
      var1.method_2087("dripWater", var7, var9, var11, 0.0D, 0.0D, 0.0D);
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   private void method_2590(ahb var1, int var2, int var3, int var4) {
      this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
      var1.method_2056(var2, var3, var4);
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.nextInt(20);
      if(var2 != null) {
         var10000 = var10000 == 0?1:0;
      }

      return var10000;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return adb.method_2920(class_1192.field_6031);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      String[] var8 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var8 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = this.method_2592(var5);
      }

      int var9 = var10000;
      var10000 = var7;
      if(var8 != null) {
         label46: {
            if(var7 > 0) {
               var9 -= 2 << var7;
               var10000 = var9;
               if(var8 == null) {
                  break label46;
               }

               if(var9 < 10) {
                  var9 = 10;
               }
            }

            var10000 = var1.field_1819.nextInt(var9);
         }
      }

      if(var8 != null) {
         if(var10000 == 0) {
            adb var10 = this.method_2464(var5, var1.field_1819, var7);
            add var10005 = new add;
            var10005.method_3726(var10, 1, this.method_2470(var5));
            this.method_2468(var1, var2, var3, var4, var10005);
         }

         var9 = 200;
         var10000 = var7;
      }

      label56: {
         if(var8 != null) {
            if(var10000 <= 0) {
               break label56;
            }

            var9 -= 10 << var7;
            var10000 = var9;
         }

         if(var8 != null) {
            if(var10000 >= 40) {
               break label56;
            }

            var10000 = 40;
         }

         var9 = var10000;
      }

      this.method_2591(var1, var2, var3, var4, var5, var9);
   }

   // $FF: renamed from: d (ahb, int, int, int, int, int) void
   protected void method_2591(ahb var1, int var2, int var3, int var4, int var5, int var6) {}

   // $FF: renamed from: c (int) int
   protected int method_2592(int var1) {
      return 20;
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
            var10005.method_3726(adb.method_2920(this), 1, var6 & 3);
            this.method_2468(var1, var3, var4, var5, var10005);
            if(var7 != null) {
               return;
            }
         }
      }

      super.method_2501(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1 & 3;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_2057;
      if(var1 != null) {
         var10000 = !this.field_2057;
      }

      return var10000;
   }

   // $FF: renamed from: a (int, int) vL
   public abstract class_73 method_2448(int var1, int var2);

   // $FF: renamed from: c (boolean) void
   public void method_2593(boolean var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2057 = (boolean)var1;
      String[] var2 = var10000;
      int var10001 = var1;
      if(var2 != null) {
         var10001 = var1 != 0?0:1;
      }

      this.field_2059 = var10001;
   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      add var10000 = new add;
      var10000.method_3726(adb.method_2920(this), 1, var1 & 3);
      return var10000;
   }

   // $FF: renamed from: i () java.lang.String[]
   public abstract String[] method_2594();

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "%®ÒF£%".toCharArray();
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
            field_2061 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 134;
            break;
         case 1:
            var10009 = 43;
            break;
         case 2:
            var10009 = 187;
            break;
         case 3:
            var10009 = 222;
            break;
         case 4:
            var10009 = 180;
            break;
         case 5:
            var10009 = 91;
            break;
         default:
            var10009 = 171;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
