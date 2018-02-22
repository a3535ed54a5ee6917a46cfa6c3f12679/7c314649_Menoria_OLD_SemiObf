import java.util.Iterator;
import java.util.List;
import java.util.Random;

// $FF: renamed from: f1
public class class_427 extends aji {

   // $FF: renamed from: <init> () void
   public void method_2707() {
      super.method_2427(awt.field_4186);
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
      this.method_2440(true);
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 10;
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

   // $FF: renamed from: w () int
   public int method_2477() {
      return 1;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 30;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5145;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5145;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = var10000;
      int var10 = var7 & 2;
      if(var6 != null) {
         var10 = var10 == 2?1:0;
      }

      int var8 = var10;
      var10 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var6 != null) {
         var10 = var10 == 0?1:0;
      }

      int var9 = var10;
      if(var6 != null && var8 != var9) {
         this.method_2466(var1, var2, var3, var4, var7, 0);
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var9 = var6 & 4;
      if(var5 != null) {
         var9 = var9 == 4?1:0;
      }

      int var7 = var9;
      var9 = var6 & 2;
      if(var5 != null) {
         var9 = var9 == 2?1:0;
      }

      int var8 = var9;
      var9 = var8;
      if(var5 != null) {
         if(var8 == 0) {
            this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.09375F, 1.0F);
            if(var5 != null) {
               return;
            }
         }

         var9 = var7;
      }

      if(var9 == 0) {
         this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         if(var5 != null) {
            return;
         }
      }

      this.method_2443(0.0F, 0.0625F, 0.0F, 1.0F, 0.15625F, 1.0F);
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var5 != null) {
         var10000 = var10000 != 0?0:2;
      }

      int var6 = var10000;
      var1.method_2055(var2, var3, var4, var6, 3);
      this.method_2708(var1, var2, var3, var4, var6);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      this.method_2708(var1, var2, var3, var4, var6 | 1);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, yz) void
   public void method_2522(ahb var1, int var2, int var3, int var4, int var5, class_792 var6) {
      String[] var7 = class_752.method_4253();
      if(!var1.field_1832) {
         add var10000 = var6.method_4593();
         if(var7 != null) {
            if(var10000 == null) {
               return;
            }

            var10000 = var6.method_4593();
         }

         if(var10000.method_3730() == class_1010.field_5216) {
            var1.method_2055(var2, var3, var4, var5 | 8, 4);
         }

      }
   }

   // $FF: renamed from: h (ahb, int, int, int, int) void
   private void method_2708(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;

      while(var7 < 2) {
         int var8 = 1;

         while(true) {
            if(var8 < 42) {
               label53: {
                  int var9 = var2 + class_1649.field_8587[var7] * var8;
                  int var10 = var4 + class_1649.field_8588[var7] * var8;
                  aji var11 = var1.getBlock(var9, var3, var10);
                  if(var6 == null) {
                     break;
                  }

                  aji var13 = var11;
                  Object var10001 = class_1192.field_6155;
                  if(var6 != null) {
                     if(var11 == class_1192.field_6155) {
                        int var12 = var1.method_33(var9, var3, var10) & 3;
                        if(var6 == null) {
                           break;
                        }

                        if(var12 != class_1649.field_8592[var7]) {
                           break label53;
                        }

                        class_1192.field_6155.method_2703(var1, var9, var3, var10, false, var1.method_33(var9, var3, var10), true, var8, var5);
                        if(var6 != null) {
                           break label53;
                        }
                     }

                     var13 = var11;
                     var10001 = class_1192.field_6156;
                  }

                  if(var13 == var10001 || var6 == null) {
                     ++var8;
                     if(var6 != null) {
                        continue;
                     }
                  }
               }
            }

            ++var7;
            break;
         }

         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, sa) void
   public void method_2498(ahb var1, int var2, int var3, int var4, class_689 var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4) & 1;
      }

      if(var10000 != 1) {
         this.method_2709(var1, var2, var3, var4);
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

         var10000 = var1.method_33(var2, var3, var4) & 1;
      }

      if(var10000 == 1) {
         this.method_2709(var1, var2, var3, var4);
      }
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   private void method_2709(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var12 = var6 & 1;
      if(var5 != null) {
         var12 = var12 == 1?1:0;
      }

      int var7 = var12;
      int var8 = 0;
      List var9 = var1.method_2155((class_689)null, class_1343.method_7093((double)var2 + this.field_1999, (double)var3 + this.field_2000, (double)var4 + this.field_2001, (double)var2 + this.field_2002, (double)var3 + this.field_2003, (double)var4 + this.field_2004));
      var12 = var9.isEmpty();
      if(var5 != null) {
         label80: {
            if(var12 == 0) {
               Iterator var10 = var9.iterator();

               while(var10.hasNext()) {
                  class_689 var11 = (class_689)var10.next();
                  var12 = var11.method_3969();
                  if(var5 == null) {
                     break label80;
                  }

                  label74: {
                     if(var5 != null) {
                        if(var12 != 0) {
                           break label74;
                        }

                        var12 = 1;
                     }

                     var8 = var12;
                     if(var5 != null) {
                        break;
                     }
                  }

                  if(var5 == null) {
                     break;
                  }
               }
            }

            var12 = var8;
         }
      }

      if(var5 != null) {
         label60: {
            if(var12 != 0) {
               var12 = var7;
               if(var5 == null) {
                  break label60;
               }

               if(var7 == 0) {
                  var6 |= 1;
               }
            }

            var12 = var8;
         }
      }

      if(var5 != null) {
         label53: {
            if(var12 == 0) {
               var12 = var7;
               if(var5 == null) {
                  break label53;
               }

               if(var7 != 0) {
                  var6 &= -2;
               }
            }

            var12 = var8;
         }
      }

      if(var5 != null) {
         if(var12 != var7) {
            var1.method_2055(var2, var3, var4, var6, 3);
            this.method_2708(var1, var2, var3, var4, var6);
         }

         var12 = var8;
      }

      if(var12 != 0) {
         var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
      }

   }

   // $FF: renamed from: b (ahl, int, int, int, int, int) boolean
   public static boolean method_2710(ahl var0, int var1, int var2, int var3, int var4, int var5) {
      int var7 = var1 + class_1649.field_8587[var5];
      String[] var6 = class_752.method_4253();
      int var9 = var3 + class_1649.field_8588[var5];
      aji var10 = var0.getBlock(var7, var2, var9);
      int var10000 = var4 & 2;
      if(var6 != null) {
         var10000 = var10000 == 2?1:0;
      }

      int var11 = var10000;
      aji var14 = var10;
      Object var10001 = class_1192.field_6155;
      int var12;
      int var13;
      if(var6 != null) {
         if(var10 == class_1192.field_6155) {
            var12 = var0.method_33(var7, var2, var9);
            var13 = var12 & 3;
            var10000 = var13;
            if(var6 != null) {
               var10000 = var13 == class_1649.field_8592[var5]?1:0;
            }

            return (boolean)var10000;
         }

         var14 = var10;
         var10001 = class_1192.field_6156;
      }

      if(var14 == var10001) {
         var12 = var0.method_33(var7, var2, var9);
         var10000 = var12 & 2;
         if(var6 != null) {
            var10000 = var10000 == 2?1:0;
         }

         var13 = var10000;
         var10000 = var11;
         if(var6 != null) {
            var10000 = var11 == var13?1:0;
         }

         return (boolean)var10000;
      } else {
         return false;
      }
   }
}
