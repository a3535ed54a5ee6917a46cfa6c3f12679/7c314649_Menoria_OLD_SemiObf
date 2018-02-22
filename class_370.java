import java.util.Random;

// $FF: renamed from: fk
public class class_370 extends aji {

   // $FF: renamed from: <init> () void
   protected void method_2572() {
      super.method_2427(awt.field_4186);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2452(var1, var2, var3, var4);
   }

   // $FF: renamed from: g (ahb, int, int, int) kg
   public class_1343 method_2450(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2450(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.method_2573(var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: c (int) void
   public void method_2573(int var1) {
      String[] var2 = class_752.method_4253();
      float var4 = 0.125F;
      int var10000 = var1;
      byte var10001 = 2;
      if(var2 != null) {
         if(var1 == 2) {
            this.method_2443(0.0F, 0.0F, 1.0F - var4, 1.0F, 1.0F, 1.0F);
         }

         var10000 = var1;
         var10001 = 3;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var4);
         }

         var10000 = var1;
         var10001 = 4;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.method_2443(1.0F - var4, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }

         var10000 = var1;
         var10001 = 5;
      }

      if(var10000 == var10001) {
         this.method_2443(0.0F, 0.0F, 0.0F, var4, 1.0F, 1.0F);
      }

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
      return 8;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = var1.getBlock(var2, var3, var4 - 1).method_2433();
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = var1.getBlock(var2, var3, var4 + 1).method_2433();
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      String[] var10;
      int var11;
      int var12;
      label95: {
         label98: {
            String[] var10000 = class_752.method_4253();
            var11 = var9;
            var10 = var10000;
            var12 = var9;
            if(var10 != null) {
               if(var9 != 0) {
                  var12 = var5;
                  if(var10 == null) {
                     break label95;
                  }

                  if(var5 != 2) {
                     break label98;
                  }
               }

               var12 = var1.getBlock(var2, var3, var4 + 1).method_2433();
            }

            if(var10 == null) {
               break label95;
            }

            if(var12 != 0) {
               var11 = 2;
            }
         }

         var12 = var11;
      }

      label82: {
         label99: {
            if(var10 != null) {
               if(var12 != 0) {
                  var12 = var5;
                  if(var10 == null) {
                     break label82;
                  }

                  if(var5 != 3) {
                     break label99;
                  }
               }

               var12 = var1.getBlock(var2, var3, var4 - 1).method_2433();
            }

            if(var10 == null) {
               break label82;
            }

            if(var12 != 0) {
               var11 = 3;
            }
         }

         var12 = var11;
      }

      label69: {
         label100: {
            if(var10 != null) {
               if(var12 != 0) {
                  var12 = var5;
                  if(var10 == null) {
                     break label69;
                  }

                  if(var5 != 4) {
                     break label100;
                  }
               }

               var12 = var1.getBlock(var2 + 1, var3, var4).method_2433();
            }

            if(var10 == null) {
               break label69;
            }

            if(var12 != 0) {
               var11 = 4;
            }
         }

         var12 = var11;
      }

      label101: {
         if(var10 != null) {
            if(var12 != 0) {
               var12 = var5;
               if(var10 == null) {
                  return var12;
               }

               if(var5 != 5) {
                  break label101;
               }
            }

            var12 = var1.getBlock(var2 - 1, var3, var4).method_2433();
         }

         if(var10 == null) {
            return var12;
         }

         if(var12 != 0) {
            var11 = 5;
         }
      }

      var12 = var11;
      return var12;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = var10000;
      byte var8 = 0;
      int var9 = var7;
      byte var10001 = 2;
      if(var6 != null) {
         label75: {
            if(var7 == 2) {
               var9 = var1.getBlock(var2, var3, var4 + 1).method_2433();
               if(var6 == null) {
                  break label75;
               }

               if(var9 != 0) {
                  var8 = 1;
               }
            }

            var9 = var7;
         }

         var10001 = 3;
      }

      if(var6 != null) {
         label67: {
            if(var9 == var10001) {
               var9 = var1.getBlock(var2, var3, var4 - 1).method_2433();
               if(var6 == null) {
                  break label67;
               }

               if(var9 != 0) {
                  var8 = 1;
               }
            }

            var9 = var7;
         }

         var10001 = 4;
      }

      label80: {
         if(var6 != null) {
            label55: {
               if(var9 == var10001) {
                  var9 = var1.getBlock(var2 + 1, var3, var4).method_2433();
                  if(var6 == null) {
                     break label55;
                  }

                  if(var9 != 0) {
                     var8 = 1;
                  }
               }

               var9 = var7;
            }

            if(var6 == null) {
               break label80;
            }

            var10001 = 5;
         }

         if(var9 == var10001) {
            var9 = var1.getBlock(var2 - 1, var3, var4).method_2433();
            if(var6 == null) {
               break label80;
            }

            if(var9 != 0) {
               var8 = 1;
            }
         }

         var9 = var8;
      }

      if(var6 != null && var9 == 0) {
         this.method_2466(var1, var2, var3, var4, var7, 0);
         var1.method_2056(var2, var3, var4);
      }

      super.method_2459(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 1;
   }
}
