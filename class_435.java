import java.util.Iterator;
import java.util.Random;

// $FF: renamed from: eQ
public class class_435 extends class_428 {

   // $FF: renamed from: M int[][]
   public static final int[][] field_2164;
   // $FF: renamed from: N vL[]
   private class_73[] field_2165;
   // $FF: renamed from: O vL[]
   private class_73[] field_2166;
   // $FF: renamed from: P vL[]
   private class_73[] field_2167;
   // $FF: renamed from: Q java.lang.String[]
   private static final String[] field_2168;


   // $FF: renamed from: <init> () void
   public void method_2740() {
      super.method_2427(awt.field_4183);
      this.method_2741();
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var10 != null) {
         if(var1.field_1832) {
            return true;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var11 = var10000;
      var10000 = method_2742(var11);
      int var10001;
      ahb var24;
      if(var10 != null) {
         if(var10000 == 0) {
            int var12 = method_2711(var11);
            var2 += field_2164[var12][0];
            var4 += field_2164[var12][1];
            var24 = var1;
            var10001 = var2;
            int var10002 = var3;
            int var10003 = var4;
            if(var10 != null) {
               if(var1.getBlock(var2, var3, var4) != this) {
                  return true;
               }

               var24 = var1;
               var10001 = var2;
               var10002 = var3;
               var10003 = var4;
            }

            var11 = var24.method_33(var10001, var10002, var10003);
         }

         var10000 = var1.field_1820.method_6171();
      }

      if(var10 != null) {
         if(var10000 != 0 && var1.method_35(var2, var4) != class_985.field_4996) {
            String[] var19;
            class_1081 var25;
            if(method_2743(var11)) {
               label128: {
                  class_792 var21 = null;
                  Iterator var13 = var1.field_1807.iterator();

                  boolean var29;
                  while(true) {
                     class_792 var28;
                     if(var13.hasNext()) {
                        label130: {
                           class_792 var23 = (class_792)var13.next();
                           var28 = var23;
                           if(var10 != null) {
                              var29 = var23.method_4229();
                              if(var10 == null) {
                                 break;
                              }

                              if(!var29) {
                                 break label130;
                              }

                              var28 = var23;
                           }

                           class_1661 var15 = var28.field_3632;
                           var10000 = var15.field_8646;
                           var10001 = var2;
                           if(var10 != null) {
                              if(var15.field_8646 != var2) {
                                 break label130;
                              }

                              var10000 = var15.field_8647;
                              var10001 = var3;
                           }

                           if(var10 != null) {
                              if(var10000 != var10001) {
                                 break label130;
                              }

                              var10000 = var15.field_8648;
                              var10001 = var4;
                           }

                           if(var10000 == var10001) {
                              var21 = var23;
                           }
                        }

                        if(var10 != null) {
                           continue;
                        }
                     }

                     var28 = var21;
                     if(var10 != null) {
                        if(var21 == null) {
                           method_2744(var1, var2, var3, var4, false);
                           if(var10 != null) {
                              break label128;
                           }
                        }

                        var28 = var5;
                     }

                     var25 = new class_1081;
                     var19 = field_2168;
                     var25.method_6126("tile.bed.occupied", new Object[0]);
                     var28.method_4610(var25);
                     var29 = true;
                     break;
                  }

                  return var29;
               }
            }

            class_931 var22 = var5.method_4600(var2, var3, var4);
            class_931 var30 = var22;
            class_931 var26 = class_931.field_4744;
            if(var10 != null) {
               if(var22 == class_931.field_4744) {
                  method_2744(var1, var2, var3, var4, true);
                  return true;
               }

               var30 = var22;
               var26 = class_931.field_4746;
            }

            if(var10 != null) {
               if(var30 == var26) {
                  var25 = new class_1081;
                  var19 = field_2168;
                  var25.method_6126("tile.bed.noSleep", new Object[0]);
                  var5.method_4610(var25);
                  if(var10 != null) {
                     return true;
                  }
               }

               var30 = var22;
               var26 = class_931.field_4749;
            }

            if(var30 == var26) {
               var25 = new class_1081;
               String[] var27 = field_2168;
               var25.method_6126("tile.bed.notSafe", new Object[0]);
               var5.method_4610(var25);
            }

            return true;
         }

         var10000 = var2;
      }

      double var20 = (double)var10000 + 0.5D;
      double var14 = (double)var3 + 0.5D;
      double var16 = (double)var4 + 0.5D;
      var1.method_2056(var2, var3, var4);
      int var18 = method_2711(var11);
      var2 += field_2164[var18][0];
      var4 += field_2164[var18][1];
      var24 = var1;
      if(var10 != null) {
         if(var1.getBlock(var2, var3, var4) == this) {
            var1.method_2056(var2, var3, var4);
            var20 = (var20 + (double)var2 + 0.5D) / 2.0D;
            var14 = (var14 + (double)var3 + 0.5D) / 2.0D;
            var16 = (var16 + (double)var4 + 0.5D) / 2.0D;
         }

         var24 = var1;
      }

      var24.method_2126((class_689)null, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), 5.0F, true, true);
      return true;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 0) {
            return class_1192.field_6030.getBlockTextureFromSide(var1);
         }

         var10000 = method_2711(var2);
      }

      int var4 = var10000;
      int var5 = class_1649.field_8595[var4][var1];
      var10000 = method_2742(var2);
      if(var3 != null) {
         var10000 = var10000 != 0?1:0;
      }

      int var6 = var10000;
      var10000 = var6;
      if(var3 != null) {
         label59: {
            if(var6 == 1) {
               var10000 = var5;
               if(var3 == null) {
                  break label59;
               }

               if(var5 == 2) {
                  return this.field_2165[var6];
               }
            }

            var10000 = var6;
         }
      }

      byte var10001;
      label51: {
         if(var3 != null) {
            if(var10000 == 0) {
               var10000 = var5;
               var10001 = 3;
               if(var3 == null) {
                  break label51;
               }

               if(var5 == 3) {
                  return this.field_2165[var6];
               }
            }

            var10000 = var5;
         }

         var10001 = 5;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return this.field_2166[var6];
         }

         var10000 = var5;
         var10001 = 4;
      }

      if(var10000 != var10001) {
         return this.field_2167[var6];
      } else {
         return this.field_2166[var6];
      }
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      class_73[] var10001 = new class_73[2];
      StringBuilder var10005 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2168;
      var10001[0] = var1.method_375(var10005.append("_feet_top").toString());
      var10001[1] = var1.method_375(this.method_2533() + "_head_top");
      this.field_2167 = var10001;
      this.field_2165 = new class_73[]{var1.method_375(this.method_2533() + "_feet_end"), var1.method_375(this.method_2533() + "_head_end")};
      this.field_2166 = new class_73[]{var1.method_375(this.method_2533() + "_feet_side"), var1.method_375(this.method_2533() + "_head_side")};
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 14;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.method_2741();
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      int var7 = var1.method_33(var2, var3, var4);
      int var8 = method_2711(var7);
      String[] var6 = class_752.method_4253();
      ahb var10000;
      int var10001;
      int var10002;
      int var10003;
      if(method_2742(var7)) {
         var10000 = var1;
         var10001 = var2 - field_2164[var8][0];
         var10002 = var3;
         var10003 = var4 - field_2164[var8][1];
         if(var6 != null) {
            if(var1.getBlock(var10001, var3, var10003) == this) {
               return;
            }

            var10000 = var1;
            var10001 = var2;
            var10002 = var3;
            var10003 = var4;
         }

         var10000.method_2056(var10001, var10002, var10003);
         if(var6 != null) {
            return;
         }
      }

      var10000 = var1;
      var10001 = var2 + field_2164[var8][0];
      var10002 = var3;
      var10003 = var4 + field_2164[var8][1];
      if(var6 != null) {
         if(var1.getBlock(var10001, var3, var10003) == this) {
            return;
         }

         var10000 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      var10000.method_2056(var10001, var10002, var10003);
      if(!var1.field_1832) {
         this.method_2466(var1, var2, var3, var4, var7, 0);
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      String[] var4 = class_752.method_4253();
      byte var10000 = method_2742(var1);
      if(var4 != null) {
         if(var10000 == 0) {
            return class_1010.field_5212;
         }

         var10000 = 0;
      }

      return adb.method_2919(var10000);
   }

   // $FF: renamed from: i () void
   private void method_2741() {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
   }

   // $FF: renamed from: c (int) boolean
   public static boolean method_2742(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0 & 8;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d (int) boolean
   public static boolean method_2743(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0 & 4;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (ahb, int, int, int, boolean) void
   public static void method_2744(ahb var0, int var1, int var2, int var3, boolean var4) {
      int var6;
      label15: {
         String[] var10000 = class_752.method_4253();
         var6 = var0.method_33(var1, var2, var3);
         String[] var5 = var10000;
         int var7 = var4;
         if(var5 != null) {
            if(var4 != 0) {
               var6 |= 4;
               if(var5 != null) {
                  break label15;
               }
            }

            var7 = var6 & -5;
         }

         var6 = var7;
      }

      var0.method_2055(var1, var2, var3, var6, 4);
   }

   // $FF: renamed from: h (ahb, int, int, int, int) vF
   public static class_1661 method_2745(ahb var0, int var1, int var2, int var3, int var4) {
      int var6 = var0.method_33(var1, var2, var3);
      String[] var10000 = class_752.method_4253();
      int var7 = class_428.method_2711(var6);
      String[] var5 = var10000;
      int var8 = 0;

      label78:
      while(true) {
         int var15 = var8;

         label76:
         while(true) {
            if(var15 <= 1) {
               int var9 = var1 - field_2164[var7][0] * var8 - 1;
               int var10 = var3 - field_2164[var7][1] * var8 - 1;
               int var11 = var9 + 2;
               int var12 = var10 + 2;
               int var13 = var9;

               while(true) {
                  var15 = var13;

                  label70:
                  while(true) {
                     if(var15 <= var11) {
                        var15 = var10;
                        if(var5 == null) {
                           continue label76;
                        }

                        int var14 = var10;

                        while(var14 <= var12) {
                           var15 = ahb.method_2135(var0, var13, var2 - 1, var14);
                           if(var5 == null) {
                              continue label70;
                           }

                           label82: {
                              if(var5 != null) {
                                 if(var15 == 0) {
                                    break label82;
                                 }

                                 var15 = var0.getBlock(var13, var2, var14).method_2424().method_5072();
                              }

                              if(var5 != null) {
                                 if(var15 != 0) {
                                    break label82;
                                 }

                                 var15 = var0.getBlock(var13, var2 + 1, var14).method_2424().method_5072();
                              }

                              if(var5 != null) {
                                 if(var15 != 0) {
                                    break label82;
                                 }

                                 var15 = var4;
                              }

                              if(var15 > 0) {
                                 --var4;
                                 if(var5 != null) {
                                    break label82;
                                 }
                              }

                              class_1661 var16 = new class_1661;
                              var16.method_9151(var13, var2, var14);
                              return var16;
                           }

                           ++var14;
                           if(var5 == null) {
                              break;
                           }
                        }

                        ++var13;
                        if(var5 != null) {
                           break;
                        }
                     }

                     ++var8;
                     if(var5 != null) {
                        continue label78;
                     }

                     return null;
                  }
               }
            }

            return null;
         }
      }
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!method_2742(var5)) {
         super.method_2467(var1, var2, var3, var4, var5, var6, 0);
      }

   }

   // $FF: renamed from: h () int
   public int method_2514() {
      return 1;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5212;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, yz) void
   public void method_2522(ahb var1, int var2, int var3, int var4, int var5, class_792 var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = var6.field_3640.field_2839;
      if(var7 != null) {
         if(!var6.field_3640.field_2839) {
            return;
         }

         var10000 = method_2742(var5);
      }

      if(var7 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = method_2711(var5);
      }

      int var8 = var10000;
      var2 -= field_2164[var8][0];
      var4 -= field_2164[var8][1];
      ahb var9 = var1;
      int var10001 = var2;
      int var10002 = var3;
      int var10003 = var4;
      if(var7 != null) {
         if(var1.getBlock(var2, var3, var4) != this) {
            return;
         }

         var9 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      var9.method_2056(var10001, var10002, var10003);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
