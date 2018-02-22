import java.util.Random;

// $FF: renamed from: d_
public class class_484 extends class_473 {

   // $FF: renamed from: M q9
   public static final class_49 field_2263;
   // $FF: renamed from: N java.util.Random
   protected Random field_2264;
   // $FF: renamed from: O vL
   protected class_73 field_2265;
   // $FF: renamed from: P vL
   protected class_73 field_2266;
   // $FF: renamed from: Q vL
   protected class_73 field_2267;
   // $FF: renamed from: R java.lang.String[]
   private static final String[] field_2268;


   // $FF: renamed from: <init> () void
   protected void method_2844() {
      super.method_2427(awt.field_4174);
      this.field_2264 = new Random();
      this.method_2521(class_872.field_4246);
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 4;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      super.method_2461(var1, var2, var3, var4);
      this.method_2845(var1, var2, var3, var4);
   }

   // $FF: renamed from: e (ahb, int, int, int) void
   private void method_2845(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      ahb var10000 = var1;
      if(var5 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1;
      }

      aji var6 = var10000.getBlock(var2, var3, var4 - 1);
      aji var7 = var1.getBlock(var2, var3, var4 + 1);
      aji var8 = var1.getBlock(var2 - 1, var3, var4);
      aji var9 = var1.getBlock(var2 + 1, var3, var4);
      byte var10 = 3;
      boolean var11 = var6.method_2419();
      if(var5 != null) {
         label65: {
            if(var11) {
               var11 = var7.method_2419();
               if(var5 == null) {
                  break label65;
               }

               if(!var11) {
                  var10 = 3;
               }
            }

            var11 = var7.method_2419();
         }
      }

      if(var5 != null) {
         label58: {
            if(var11) {
               var11 = var6.method_2419();
               if(var5 == null) {
                  break label58;
               }

               if(!var11) {
                  var10 = 2;
               }
            }

            var11 = var8.method_2419();
         }
      }

      if(var5 != null) {
         label51: {
            if(var11) {
               var11 = var9.method_2419();
               if(var5 == null) {
                  break label51;
               }

               if(!var11) {
                  var10 = 5;
               }
            }

            var11 = var9.method_2419();
         }
      }

      if(var5 != null) {
         if(var11) {
            var11 = var8.method_2419();
            if(var5 == null) {
               return;
            }

            if(!var11) {
               var10 = 4;
            }
         }

         var1.method_2055(var2, var3, var4, var10, 2);
      }

   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3;
      int var5;
      label58: {
         String[] var10000 = class_752.method_4253();
         int var4 = var2 & 7;
         var3 = var10000;
         var5 = var1;
         int var10001 = var4;
         if(var3 != null) {
            if(var1 == var4) {
               var5 = var4;
               if(var3 != null) {
                  if(var4 == 1) {
                     return this.field_2267;
                  }

                  var5 = var4;
               }

               if(var5 != 0) {
                  return this.field_2266;
               }

               return this.field_2267;
            }

            var5 = var4;
            if(var3 == null) {
               break label58;
            }

            var10001 = 1;
         }

         if(var5 == var10001) {
            return this.field_2265;
         }

         var5 = var4;
      }

      if(var3 != null) {
         if(var5 == 0) {
            return this.field_2265;
         }

         var5 = var1;
      }

      if(var3 != null) {
         if(var5 == 1) {
            return this.field_2265;
         }

         var5 = var1;
      }

      if(var5 != 0) {
         return this.field_2010;
      } else {
         return this.field_2265;
      }
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var2 = field_2268;
      this.field_2010 = var1.method_375("furnace_side");
      this.field_2265 = var1.method_375("furnace_top");
      this.field_2266 = var1.method_375(this.method_2533() + "_front_horizontal");
      this.field_2267 = var1.method_375(this.method_2533() + "_front_vertical");
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      ahb var10000 = var1;
      if(var10 != null) {
         if(var1.field_1832) {
            return true;
         }

         var10000 = var1;
      }

      class_589 var11 = (class_589)var10000.method_31(var2, var3, var4);
      if(var11 != null) {
         var5.method_4585(var11);
      }

      return true;
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   protected void method_2846(ahb var1, int var2, int var3, int var4) {
      class_1501 var10000 = new class_1501;
      var10000.method_8131(var1, var2, var3, var4);
      class_1501 var6 = var10000;
      String[] var5 = class_752.method_4253();
      class_589 var7 = (class_589)var6.method_187();
      class_589 var12 = var7;
      if(var5 != null) {
         if(var7 == null) {
            return;
         }

         var12 = var7;
      }

      int var8;
      label36: {
         var8 = var12.method_3155();
         if(var5 != null) {
            if(var8 >= 0) {
               break label36;
            }

            var1.method_2210(1001, var2, var3, var4, 0);
         }

         if(var5 != null) {
            return;
         }
      }

      add var9 = var7.method_84(var8);
      class_41 var10 = this.method_2847(var9);
      class_41 var13 = var10;
      if(var5 != null) {
         if(var10 == class_41.field_8) {
            return;
         }

         var13 = var10;
      }

      add var11 = var13.method_176(var6, var9);
      var7.method_87(var8, var11.field_2958 == 0?null:var11);
   }

   // $FF: renamed from: b (add) q1
   protected class_41 method_2847(add var1) {
      return (class_41)field_2263.method_188(var1.method_3730());
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      byte var10000 = var1.method_2172(var2, var3, var4);
      if(var6 != null) {
         label59: {
            if(var10000 == 0) {
               var10000 = var1.method_2172(var2, var3 + 1, var4);
               if(var6 == null) {
                  break label59;
               }

               if(var10000 == 0) {
                  var10000 = 0;
                  break label59;
               }
            }

            var10000 = 1;
         }
      }

      byte var7 = var10000;
      int var8 = var1.method_33(var2, var3, var4);
      int var10 = var8 & 8;
      if(var6 != null) {
         var10 = var10 != 0?1:0;
      }

      int var9 = var10;
      var10 = var7;
      if(var6 != null) {
         label49: {
            if(var7 != 0) {
               var10 = var9;
               if(var6 == null) {
                  break label49;
               }

               if(var9 == 0) {
                  var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
                  var1.method_2055(var2, var3, var4, var8 | 8, 4);
                  if(var6 != null) {
                     return;
                  }
               }
            }

            var10 = var7;
         }
      }

      if(var6 != null) {
         if(var10 != 0) {
            return;
         }

         var10 = var9;
      }

      if(var6 != null && var10 != 0) {
         var1.method_2055(var2, var3, var4, var8 & -9, 4);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_1832) {
         this.method_2846(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_589 var10000 = new class_589;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = class_420.method_2688(var1, var2, var3, var4, var5);
      String[] var7 = var10000;
      ahb var9 = var1;
      int var10001 = var2;
      int var10002 = var3;
      int var10003 = var4;
      if(var7 != null) {
         var1.method_2055(var2, var3, var4, var8, 2);
         if(!var6.method_3773()) {
            return;
         }

         var9 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      ((class_589)var9.method_31(var10001, var10002, var10003)).method_3157(var6.method_3770());
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var10000 = class_752.method_4253();
      class_589 var8 = (class_589)var1.method_31(var2, var3, var4);
      String[] var7 = var10000;
      if(var7 != null) {
         if(var8 != null) {
            int var9 = 0;

            label62:
            do {
               int var17 = var9;
               int var10001 = var8.method_83();

               label59:
               while(true) {
                  if(var17 >= var10001) {
                     break label62;
                  }

                  add var10 = var8.method_84(var9);
                  if(var7 == null) {
                     return;
                  }

                  if(var7 == null) {
                     break;
                  }

                  if(var10 != null) {
                     float var11 = this.field_2264.nextFloat() * 0.8F + 0.1F;
                     float var12 = this.field_2264.nextFloat() * 0.8F + 0.1F;
                     float var13 = this.field_2264.nextFloat() * 0.8F + 0.1F;

                     while(var10.field_2958 > 0) {
                        int var14 = this.field_2264.nextInt(21) + 10;
                        if(var7 != null) {
                           var17 = var14;
                           var10001 = var10.field_2958;
                           if(var7 == null) {
                              continue label59;
                           }

                           if(var14 > var10.field_2958) {
                              var14 = var10.field_2958;
                           }

                           var10.field_2958 -= var14;
                        }

                        class_699 var15;
                        label35: {
                           class_699 var18 = new class_699;
                           double var10003 = (double)((float)var2 + var11);
                           double var10004 = (double)((float)var3 + var12);
                           double var10005 = (double)((float)var4 + var13);
                           add var10006 = new add;
                           var10006.method_3726(var10.method_3730(), var14, var10.method_3745());
                           var18.method_4025(var1, var10003, var10004, var10005, var10006);
                           var15 = var18;
                           add var19 = var10;
                           if(var7 != null) {
                              if(!var10.method_3766()) {
                                 break label35;
                              }

                              var19 = var15.method_4030();
                           }

                           var19.method_3769((class_1583)var10.method_3767().method_8633());
                        }

                        float var16 = 0.05F;
                        var15.field_2997 = (double)((float)this.field_2264.nextGaussian() * var16);
                        var15.field_2998 = (double)((float)this.field_2264.nextGaussian() * var16 + 0.2F);
                        var15.field_2999 = (double)((float)this.field_2264.nextGaussian() * var16);
                        var1.method_2089(var15);
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

   // $FF: renamed from: b (qH) q7
   public static class_45 method_2848(class_48 var0) {
      class_905 var1 = method_2849(var0.method_186());
      double var2 = var0.method_179() + 0.7D * (double)var1.method_5322();
      double var4 = var0.method_180() + 0.7D * (double)var1.method_5323();
      double var6 = var0.method_181() + 0.7D * (double)var1.method_5324();
      class_1485 var10000 = new class_1485;
      var10000.method_8014(var2, var4, var6);
      return var10000;
   }

   // $FF: renamed from: c (int) af
   public static class_905 method_2849(int var0) {
      return class_905.method_5325(var0 & 7);
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return true;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      return class_671.method_3676((class_22)var1.method_31(var2, var3, var4));
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
