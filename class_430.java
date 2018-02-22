
// $FF: renamed from: eV
public class class_430 extends class_428 {

   // $FF: renamed from: <init> () void
   public void method_2713() {
      super.method_2427(awt.field_4173);
      this.method_2521(class_872.field_4246);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      return class_1192.field_6030.getBlockTextureFromSide(var1);
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = var1.getBlock(var2, var3 - 1, var4).method_2424().method_5063();
      if(var5 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = super.method_2480(var1, var2, var3, var4);
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = class_752.method_4253();
      int var10000 = method_2714(var6);
      if(var5 != null) {
         if(var10000 != 0) {
            return null;
         }

         var10000 = var6;
      }

      if(var5 != null) {
         if(var10000 != 2) {
            label24: {
               var10000 = var6;
               if(var5 != null) {
                  if(var6 == 0) {
                     break label24;
                  }

                  var10000 = var2;
               }

               return class_1343.method_7093((double)((float)var10000 + 0.375F), (double)var3, (double)var4, (double)((float)var2 + 0.625F), (double)((float)var3 + 1.5F), (double)(var4 + 1));
            }
         }

         var10000 = var2;
      }

      return class_1343.method_7093((double)var10000, (double)var3, (double)((float)var4 + 0.375F), (double)(var2 + 1), (double)((float)var3 + 1.5F), (double)((float)var4 + 0.625F));
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      label18: {
         String[] var10000 = class_752.method_4253();
         int var6 = method_2711(var1.method_33(var2, var3, var4));
         String[] var5 = var10000;
         if(var5 != null) {
            if(var6 != 2 && var6 != 0) {
               break label18;
            }

            this.method_2443(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
         }

         if(var5 != null) {
            return;
         }
      }

      this.method_2443(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
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
      return method_2714(var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 21;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      int var7 = (class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3) % 4;
      var1.method_2055(var2, var3, var4, var7, 2);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      label25: {
         String[] var10000 = class_752.method_4253();
         int var11 = var1.method_33(var2, var3, var4);
         String[] var10 = var10000;
         int var14 = method_2714(var11);
         if(var10 != null) {
            if(var14 != 0) {
               var1.method_2055(var2, var3, var4, var11 & -5, 2);
               if(var10 != null) {
                  break label25;
               }
            }

            var14 = (class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3) % 4;
         }

         int var12 = var14;
         int var13 = method_2711(var11);
         if(var10 != null) {
            if(var13 == (var12 + 2) % 4) {
               var11 = var12;
            }

            var1.method_2055(var2, var3, var4, var11 | 4, 2);
         }
      }

      var1.method_2211(var5, 1003, var2, var3, var4, 0);
      return true;
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
      boolean var8 = var1.method_2172(var2, var3, var4);
      boolean var9 = var8;
      if(var6 != null) {
         label56: {
            if(!var8) {
               var9 = var5.method_2497();
               if(var6 == null) {
                  break label56;
               }

               if(!var9) {
                  return;
               }
            }

            var9 = var8;
         }
      }

      if(var6 != null) {
         label47: {
            if(var9) {
               var9 = method_2714(var7);
               if(var6 == null) {
                  break label47;
               }

               if(!var9) {
                  var1.method_2055(var2, var3, var4, var7 | 4, 2);
                  var1.method_2211((class_792)null, 1003, var2, var3, var4, 0);
                  if(var6 != null) {
                     return;
                  }
               }
            }

            var9 = var8;
         }
      }

      if(var6 != null) {
         if(var9) {
            return;
         }

         var9 = method_2714(var7);
      }

      if(var6 != null) {
         if(!var9) {
            return;
         }

         var1.method_2055(var2, var3, var4, var7 & -5, 2);
      }

      var1.method_2211((class_792)null, 1003, var2, var3, var4, 0);
   }

   // $FF: renamed from: c (int) boolean
   public static boolean method_2714(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0 & 4;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {}
}
