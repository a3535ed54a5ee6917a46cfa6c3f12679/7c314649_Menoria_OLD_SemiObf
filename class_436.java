
// $FF: renamed from: f0
public class class_436 extends aji {

   // $FF: renamed from: <init> (awt) void
   protected void method_2427(awt var1) {
      super.method_2427(var1);
      float var2 = 0.5F;
      float var3 = 1.0F;
      this.method_2443(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var3, 0.5F + var2);
      this.method_2521(class_872.field_4246);
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b (ahl, int, int, int) boolean
   public boolean method_2435(ahl var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = method_2748(var1.method_33(var2, var3, var4));
      if(var5 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 0;
   }

   // $FF: renamed from: g (ahb, int, int, int) kg
   public class_1343 method_2450(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2450(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2452(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.method_2746(var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      float var1 = 0.1875F;
      this.method_2443(0.0F, 0.5F - var1 / 2.0F, 0.0F, 1.0F, 0.5F + var1 / 2.0F, 1.0F);
   }

   // $FF: renamed from: c (int) void
   public void method_2746(int var1) {
      String[] var2;
      float var3;
      label53: {
         label52: {
            String[] var10000 = class_752.method_4253();
            var3 = 0.1875F;
            var2 = var10000;
            if(var2 != null) {
               if((var1 & 8) == 0) {
                  break label52;
               }

               this.method_2443(0.0F, 1.0F - var3, 0.0F, 1.0F, 1.0F, 1.0F);
            }

            if(var2 != null) {
               break label53;
            }
         }

         this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, var3, 1.0F);
      }

      int var4 = method_2748(var1);
      if(var2 != null) {
         if(var4 == 0) {
            return;
         }

         var4 = var1 & 3;
      }

      if(var2 != null) {
         if(var4 == 0) {
            this.method_2443(0.0F, 0.0F, 1.0F - var3, 1.0F, 1.0F, 1.0F);
         }

         var4 = var1 & 3;
      }

      byte var10001 = 1;
      if(var2 != null) {
         if(var4 == 1) {
            this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var3);
         }

         var4 = var1 & 3;
         var10001 = 2;
      }

      if(var2 != null) {
         if(var4 == var10001) {
            this.method_2443(1.0F - var3, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }

         var4 = var1 & 3;
         var10001 = 3;
      }

      if(var4 == var10001) {
         this.method_2443(0.0F, 0.0F, 0.0F, var3, 1.0F, 1.0F);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, yz) void
   public void method_2484(ahb var1, int var2, int var3, int var4, class_792 var5) {}

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      if(this.field_2007 == awt.field_4175) {
         return true;
      } else {
         int var10 = var1.method_33(var2, var3, var4);
         var1.method_2055(var2, var3, var4, var10 ^ 4, 2);
         var1.method_2211(var5, 1003, var2, var3, var4, 0);
         return true;
      }
   }

   // $FF: renamed from: b (ahb, int, int, int, boolean) void
   public void method_2747(ahb var1, int var2, int var3, int var4, boolean var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = var10000;
      int var9 = var7 & 4;
      if(var6 != null) {
         var9 = var9 > 0?1:0;
      }

      int var8 = var9;
      if(var6 != null) {
         if(var8 == var5) {
            return;
         }

         var1.method_2055(var2, var3, var4, var7 ^ 4, 2);
      }

      var1.method_2211((class_792)null, 1003, var2, var3, var4, 0);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      int var8 = var2;
      int var9 = var4;
      var10000 = var7 & 3;
      if(var6 != null) {
         if(var10000 == 0) {
            var9 = var4 + 1;
         }

         var10000 = var7 & 3;
      }

      byte var10001 = 1;
      if(var6 != null) {
         if(var10000 == 1) {
            --var9;
         }

         var10000 = var7 & 3;
         var10001 = 2;
      }

      label70: {
         if(var6 != null) {
            if(var10000 == var10001) {
               var8 = var2 + 1;
            }

            var10000 = var7 & 3;
            if(var6 == null) {
               break label70;
            }

            var10001 = 3;
         }

         if(var10000 == var10001) {
            --var8;
         }

         var10000 = method_2749(var1.getBlock(var8, var3, var9));
      }

      if(var6 != null) {
         if(var10000 == 0) {
            var1.method_2056(var2, var3, var4);
            this.method_2466(var1, var2, var3, var4, var7, 0);
         }

         var10000 = var1.method_2172(var2, var3, var4);
      }

      int var10;
      label54: {
         var10 = var10000;
         var10000 = var10;
         if(var6 != null) {
            if(var10 != 0) {
               break label54;
            }

            var10000 = var5.method_2497();
         }

         if(var10000 == 0) {
            return;
         }
      }

      this.method_2747(var1, var2, var3, var4, (boolean)var10);
   }

   // $FF: renamed from: a (ahb, int, int, int, azw, azw) azu
   public azu method_2472(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2472(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var11 = 0;
      String[] var10 = class_752.method_4253();
      int var10000 = var5;
      byte var10001 = 2;
      if(var10 != null) {
         if(var5 == 2) {
            var11 = 0;
         }

         var10000 = var5;
         var10001 = 3;
      }

      if(var10 != null) {
         if(var10000 == var10001) {
            var11 = 1;
         }

         var10000 = var5;
         var10001 = 4;
      }

      if(var10 != null) {
         if(var10000 == var10001) {
            var11 = 2;
         }

         var10000 = var5;
         var10001 = 5;
      }

      if(var10 != null) {
         if(var10000 == var10001) {
            var11 = 3;
         }

         var10000 = var5;
         if(var10 == null) {
            return var10000;
         }

         var10001 = 1;
      }

      if(var10000 != var10001) {
         var10000 = var5;
         if(var10 == null) {
            return var10000;
         }

         if(var5 != 0) {
            float var12;
            var10000 = (var12 = var7 - 0.5F) == 0.0F?0:(var12 < 0.0F?-1:1);
            if(var10 == null) {
               return var10000;
            }

            if(var10000 > 0) {
               var11 |= 8;
            }
         }
      }

      var10000 = var11;
      return var10000;
   }

   // $FF: renamed from: d (ahb, int, int, int, int) boolean
   public boolean method_2479(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         if(var5 == 0) {
            return false;
         }

         var10000 = var5;
      }

      byte var10001 = 1;
      if(var6 != null) {
         if(var10000 == 1) {
            return false;
         }

         var10000 = var5;
         var10001 = 2;
      }

      if(var6 != null) {
         if(var10000 == var10001) {
            ++var4;
         }

         var10000 = var5;
         var10001 = 3;
      }

      if(var6 != null) {
         if(var10000 == var10001) {
            --var4;
         }

         var10000 = var5;
         var10001 = 4;
      }

      if(var6 != null) {
         if(var10000 == var10001) {
            ++var2;
         }

         var10000 = var5;
         if(var6 == null) {
            return (boolean)var10000;
         }

         var10001 = 5;
      }

      if(var10000 == var10001) {
         --var2;
      }

      var10000 = method_2749(var1.getBlock(var2, var3, var4));
      return (boolean)var10000;
   }

   // $FF: renamed from: k (int) boolean
   public static boolean method_2748(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0 & 4;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d (aji) boolean
   private static boolean method_2749(aji var0) {
      boolean var2;
      label42: {
         String[] var1 = class_752.method_4253();
         aji var10000 = var0;
         if(var1 != null) {
            if(var0.field_2007.method_5072()) {
               var2 = var0.method_2434();
               if(var1 == null) {
                  return var2;
               }

               if(var2) {
                  break label42;
               }
            }

            var10000 = var0;
         }

         if(var1 != null) {
            if(var10000 == class_1192.field_6115) {
               break label42;
            }

            var10000 = var0;
         }

         var2 = var10000 instanceof class_378;
         if(var1 == null) {
            return var2;
         }

         if(!var2) {
            var2 = var0 instanceof class_398;
            if(var1 == null) {
               return var2;
            }

            if(!var2) {
               var2 = false;
               return var2;
            }
         }
      }

      var2 = true;
      return var2;
   }
}
