
// $FF: renamed from: fl
public class class_369 extends aji {

   // $FF: renamed from: N java.lang.String
   private static final String field_2037 = "random.click";


   // $FF: renamed from: <init> () void
   protected void method_2569() {
      super.method_2427(awt.field_4186);
      this.method_2521(class_872.field_4246);
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
      return 12;
   }

   // $FF: renamed from: d (ahb, int, int, int, int) boolean
   public boolean method_2479(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         label96: {
            if(var5 == 0) {
               var10000 = var1.getBlock(var2, var3 + 1, var4).method_2433();
               if(var6 == null) {
                  break label96;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var5;
         }
      }

      byte var10001 = 1;
      if(var6 != null) {
         label88: {
            if(var10000 == 1) {
               var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
               if(var6 == null) {
                  break label88;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var5;
         }

         var10001 = 2;
      }

      if(var6 != null) {
         label80: {
            if(var10000 == var10001) {
               var10000 = var1.getBlock(var2, var3, var4 + 1).method_2433();
               if(var6 == null) {
                  break label80;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var5;
         }

         var10001 = 3;
      }

      if(var6 != null) {
         label72: {
            if(var10000 == var10001) {
               var10000 = var1.getBlock(var2, var3, var4 - 1).method_2433();
               if(var6 == null) {
                  break label72;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var5;
         }

         var10001 = 4;
      }

      if(var6 != null) {
         label60: {
            if(var10000 == var10001) {
               var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
               if(var6 == null) {
                  break label60;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var5;
         }

         if(var6 == null) {
            return (boolean)var10000;
         }

         var10001 = 5;
      }

      if(var10000 == var10001) {
         var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
         if(var6 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            return true;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
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

         var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      }

      if(var5 != null) {
         if(var10000) {
            return true;
         }

         var10000 = var1.getBlock(var2, var3 + 1, var4).method_2433();
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
      String[] var10000 = class_752.method_4253();
      int var12 = var9 & 8;
      String[] var10 = var10000;
      int var11 = var9 & 7;
      byte var13 = -1;
      int var14 = var5;
      if(var10 != null) {
         label96: {
            if(var5 == 0) {
               var14 = var1.getBlock(var2, var3 + 1, var4).method_2433();
               if(var10 == null) {
                  break label96;
               }

               if(var14 != 0) {
                  var13 = 0;
               }
            }

            var14 = var5;
         }
      }

      int var10001 = 1;
      if(var10 != null) {
         label88: {
            if(var14 == 1) {
               var14 = ahb.method_2135(var1, var2, var3 - 1, var4);
               if(var10 == null) {
                  break label88;
               }

               if(var14 != 0) {
                  var13 = 5;
               }
            }

            var14 = var5;
         }

         var10001 = 2;
      }

      if(var10 != null) {
         label80: {
            if(var14 == var10001) {
               var14 = var1.getBlock(var2, var3, var4 + 1).method_2433();
               if(var10 == null) {
                  break label80;
               }

               if(var14 != 0) {
                  var13 = 4;
               }
            }

            var14 = var5;
         }

         var10001 = 3;
      }

      if(var10 != null) {
         label72: {
            if(var14 == var10001) {
               var14 = var1.getBlock(var2, var3, var4 - 1).method_2433();
               if(var10 == null) {
                  break label72;
               }

               if(var14 != 0) {
                  var13 = 3;
               }
            }

            var14 = var5;
         }

         var10001 = 4;
      }

      if(var10 != null) {
         label64: {
            if(var14 == var10001) {
               var14 = var1.getBlock(var2 + 1, var3, var4).method_2433();
               if(var10 == null) {
                  break label64;
               }

               if(var14 != 0) {
                  var13 = 2;
               }
            }

            var14 = var5;
         }

         var10001 = 5;
      }

      if(var10 != null) {
         if(var14 == var10001) {
            var14 = var1.getBlock(var2 - 1, var3, var4).method_2433();
            if(var10 == null) {
               return var14;
            }

            if(var14 != 0) {
               var13 = 1;
            }
         }

         var14 = var13;
         var10001 = var12;
      }

      var14 += var10001;
      return var14;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = var1.method_33(var2, var3, var4);
      int var9 = var8 & 7;
      String[] var7 = var10000;
      int var10 = var8 & 8;
      int var11 = var9;
      int var10001 = method_2570(1);
      if(var7 != null) {
         if(var9 == var10001) {
            var11 = class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 1;
            if(var7 != null) {
               if(var11 == 0) {
                  var1.method_2055(var2, var3, var4, 5 | var10, 2);
                  if(var7 != null) {
                     return;
                  }
               }

               var1.method_2055(var2, var3, var4, 6 | var10, 2);
            }

            if(var7 != null) {
               return;
            }
         }

         var11 = var9;
         var10001 = method_2570(0);
      }

      if(var7 != null) {
         if(var11 != var10001) {
            return;
         }

         var11 = class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D);
         var10001 = 1;
      }

      var11 &= var10001;
      if(var7 != null) {
         if(var11 == 0) {
            var1.method_2055(var2, var3, var4, 7 | var10, 2);
            if(var7 != null) {
               return;
            }
         }

         var1.method_2055(var2, var3, var4, 0 | var10, 2);
      }

   }

   // $FF: renamed from: c (int) int
   public static int method_2570(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0;
      if(var1 != null) {
         switch(var0) {
         case 0:
            return 0;
         case 1:
            return 5;
         case 2:
            return 4;
         case 3:
            return 3;
         case 4:
            return 2;
         case 5:
            return 1;
         default:
            var10000 = -1;
         }
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.method_2571(var1, var2, var3, var4);
      if(var6 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4) & 7;
      }

      int var7 = var10000;
      byte var8 = 0;
      var10000 = var1.getBlock(var2 - 1, var3, var4).method_2433();
      if(var6 != null) {
         label126: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label126;
               }

               if(var7 == 1) {
                  var8 = 1;
               }
            }

            var10000 = var1.getBlock(var2 + 1, var3, var4).method_2433();
         }
      }

      if(var6 != null) {
         label119: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label119;
               }

               if(var7 == 2) {
                  var8 = 1;
               }
            }

            var10000 = var1.getBlock(var2, var3, var4 - 1).method_2433();
         }
      }

      if(var6 != null) {
         label112: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label112;
               }

               if(var7 == 3) {
                  var8 = 1;
               }
            }

            var10000 = var1.getBlock(var2, var3, var4 + 1).method_2433();
         }
      }

      if(var6 != null) {
         label105: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label105;
               }

               if(var7 == 4) {
                  var8 = 1;
               }
            }

            var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
         }
      }

      if(var6 != null) {
         label98: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label98;
               }

               if(var7 == 5) {
                  var8 = 1;
               }
            }

            var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
         }
      }

      if(var6 != null) {
         label91: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label91;
               }

               if(var7 == 6) {
                  var8 = 1;
               }
            }

            var10000 = var1.getBlock(var2, var3 + 1, var4).method_2433();
         }
      }

      if(var6 != null) {
         label84: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label84;
               }

               if(var7 == 0) {
                  var8 = 1;
               }
            }

            var10000 = var1.getBlock(var2, var3 + 1, var4).method_2433();
         }
      }

      if(var6 != null) {
         label77: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label77;
               }

               if(var7 == 7) {
                  var8 = 1;
               }
            }

            var10000 = var8;
         }
      }

      if(var6 != null && var10000 != 0) {
         this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   private boolean method_2571(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = this.method_2480(var1, var2, var3, var4);
      if(var5 != null) {
         if(!var10000) {
            this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
            var1.method_2056(var2, var3, var4);
            return false;
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      int var6 = var1.method_33(var2, var3, var4) & 7;
      String[] var10000 = class_752.method_4253();
      float var7 = 0.1875F;
      String[] var5 = var10000;
      int var8 = var6;
      byte var10001 = 1;
      if(var5 != null) {
         if(var6 == 1) {
            this.method_2443(0.0F, 0.2F, 0.5F - var7, var7 * 2.0F, 0.8F, 0.5F + var7);
            if(var5 != null) {
               return;
            }
         }

         var8 = var6;
         var10001 = 2;
      }

      if(var5 != null) {
         if(var8 == var10001) {
            this.method_2443(1.0F - var7 * 2.0F, 0.2F, 0.5F - var7, 1.0F, 0.8F, 0.5F + var7);
            if(var5 != null) {
               return;
            }
         }

         var8 = var6;
         var10001 = 3;
      }

      if(var5 != null) {
         if(var8 == var10001) {
            this.method_2443(0.5F - var7, 0.2F, 0.0F, 0.5F + var7, 0.8F, var7 * 2.0F);
            if(var5 != null) {
               return;
            }
         }

         var8 = var6;
         var10001 = 4;
      }

      if(var5 != null) {
         if(var8 == var10001) {
            this.method_2443(0.5F - var7, 0.2F, 1.0F - var7 * 2.0F, 0.5F + var7, 0.8F, 1.0F);
            if(var5 != null) {
               return;
            }
         }

         var8 = var6;
         var10001 = 5;
      }

      label54: {
         label53: {
            label52: {
               if(var5 != null) {
                  if(var8 == var10001) {
                     break label52;
                  }

                  var8 = var6;
                  if(var5 == null) {
                     break label54;
                  }

                  var10001 = 6;
               }

               if(var8 != var10001) {
                  break label53;
               }
            }

            var7 = 0.25F;
            this.method_2443(0.5F - var7, 0.0F, 0.5F - var7, 0.5F + var7, 0.6F, 0.5F + var7);
            if(var5 != null) {
               return;
            }
         }

         var8 = var6;
      }

      label39: {
         if(var5 != null) {
            if(var8 == 0) {
               break label39;
            }

            var8 = var6;
         }

         if(var8 != 7) {
            return;
         }
      }

      var7 = 0.25F;
      this.method_2443(0.5F - var7, 0.4F, 0.5F - var7, 0.5F + var7, 1.0F, 0.5F + var7);
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

      label101: {
         int var11 = var10000;
         int var12 = var11 & 7;
         int var13 = 8 - (var11 & 8);
         var1.method_2055(var2, var3, var4, var12 + var13, 3);
         var1.method_2084((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, var13 > 0?0.6F:0.5F);
         var1.method_2063(var2, var3, var4, this);
         var10000 = var12;
         byte var10001 = 1;
         if(var10 != null) {
            if(var12 == 1) {
               var1.method_2063(var2 - 1, var3, var4, this);
               if(var10 != null) {
                  break label101;
               }
            }

            var10000 = var12;
            var10001 = 2;
         }

         if(var10 != null) {
            if(var10000 == var10001) {
               var1.method_2063(var2 + 1, var3, var4, this);
               if(var10 != null) {
                  break label101;
               }
            }

            var10000 = var12;
            var10001 = 3;
         }

         if(var10 != null) {
            if(var10000 == var10001) {
               var1.method_2063(var2, var3, var4 - 1, this);
               if(var10 != null) {
                  break label101;
               }
            }

            var10000 = var12;
            var10001 = 4;
         }

         if(var10 != null) {
            if(var10000 == var10001) {
               var1.method_2063(var2, var3, var4 + 1, this);
               if(var10 != null) {
                  break label101;
               }
            }

            var10000 = var12;
            var10001 = 5;
         }

         label69: {
            label68: {
               label67: {
                  if(var10 != null) {
                     if(var10000 == var10001) {
                        break label67;
                     }

                     var10000 = var12;
                     if(var10 == null) {
                        break label69;
                     }

                     var10001 = 6;
                  }

                  if(var10000 != var10001) {
                     break label68;
                  }
               }

               var1.method_2063(var2, var3 - 1, var4, this);
               if(var10 != null) {
                  break label101;
               }
            }

            var10000 = var12;
         }

         label103: {
            if(var10 != null) {
               if(var10000 == 0) {
                  break label103;
               }

               var10000 = var12;
            }

            if(var10 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 7) {
               break label101;
            }
         }

         var1.method_2063(var2, var3 + 1, var4, this);
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      label89: {
         String[] var7 = class_752.method_4253();
         int var10000 = var6 & 8;
         if(var7 != null) {
            if(var10000 <= 0) {
               break label89;
            }

            var1.method_2063(var2, var3, var4, this);
            var10000 = var6 & 7;
         }

         int var8 = var10000;
         var10000 = var8;
         byte var10001 = 1;
         if(var7 != null) {
            if(var8 == 1) {
               var1.method_2063(var2 - 1, var3, var4, this);
               if(var7 != null) {
                  break label89;
               }
            }

            var10000 = var8;
            var10001 = 2;
         }

         if(var7 != null) {
            if(var10000 == var10001) {
               var1.method_2063(var2 + 1, var3, var4, this);
               if(var7 != null) {
                  break label89;
               }
            }

            var10000 = var8;
            var10001 = 3;
         }

         if(var7 != null) {
            if(var10000 == var10001) {
               var1.method_2063(var2, var3, var4 - 1, this);
               if(var7 != null) {
                  break label89;
               }
            }

            var10000 = var8;
            var10001 = 4;
         }

         if(var7 != null) {
            if(var10000 == var10001) {
               var1.method_2063(var2, var3, var4 + 1, this);
               if(var7 != null) {
                  break label89;
               }
            }

            var10000 = var8;
            var10001 = 5;
         }

         label57: {
            label56: {
               label55: {
                  if(var7 != null) {
                     if(var10000 == var10001) {
                        break label55;
                     }

                     var10000 = var8;
                     if(var7 == null) {
                        break label57;
                     }

                     var10001 = 6;
                  }

                  if(var10000 != var10001) {
                     break label56;
                  }
               }

               var1.method_2063(var2, var3 - 1, var4, this);
               if(var7 != null) {
                  break label89;
               }
            }

            var10000 = var8;
         }

         label42: {
            if(var7 != null) {
               if(var10000 == 0) {
                  break label42;
               }

               var10000 = var8;
            }

            if(var10000 != 7) {
               break label89;
            }
         }

         var1.method_2063(var2, var3 + 1, var4, this);
      }

      super.method_2462(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.method_33(var2, var3, var4) & 8;
      if(var6 != null) {
         var10000 = var10000 > 0?15:0;
      }

      return var10000;
   }

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = var10000;
      int var9 = var7 & 8;
      if(var6 != null) {
         if(var9 == 0) {
            return 0;
         }

         var9 = var7 & 7;
      }

      int var8 = var9;
      var9 = var8;
      if(var6 != null) {
         label125: {
            if(var8 == 0) {
               var9 = var5;
               if(var6 == null) {
                  break label125;
               }

               if(var5 == 0) {
                  return 15;
               }
            }

            var9 = var8;
         }
      }

      byte var10001 = 7;
      if(var6 != null) {
         label117: {
            if(var9 == 7) {
               var9 = var5;
               if(var6 == null) {
                  break label117;
               }

               if(var5 == 0) {
                  return 15;
               }
            }

            var9 = var8;
         }

         var10001 = 6;
      }

      if(var6 != null) {
         label110: {
            if(var9 == var10001) {
               var9 = var5;
               var10001 = 1;
               if(var6 == null) {
                  break label110;
               }

               if(var5 == 1) {
                  return 15;
               }
            }

            var9 = var8;
            var10001 = 5;
         }
      }

      if(var6 != null) {
         label103: {
            if(var9 == var10001) {
               var9 = var5;
               var10001 = 1;
               if(var6 == null) {
                  break label103;
               }

               if(var5 == 1) {
                  return 15;
               }
            }

            var9 = var8;
            var10001 = 4;
         }
      }

      if(var6 != null) {
         label96: {
            if(var9 == var10001) {
               var9 = var5;
               var10001 = 2;
               if(var6 == null) {
                  break label96;
               }

               if(var5 == 2) {
                  return 15;
               }
            }

            var9 = var8;
            var10001 = 3;
         }
      }

      if(var6 != null) {
         label89: {
            if(var9 == var10001) {
               var9 = var5;
               var10001 = 3;
               if(var6 == null) {
                  break label89;
               }

               if(var5 == 3) {
                  return 15;
               }
            }

            var9 = var8;
            var10001 = 2;
         }
      }

      if(var6 != null) {
         label131: {
            if(var9 == var10001) {
               var9 = var5;
               var10001 = 4;
               if(var6 == null) {
                  break label131;
               }

               if(var5 == 4) {
                  return 15;
               }
            }

            var9 = var8;
            if(var6 == null) {
               return var9;
            }

            var10001 = 1;
         }
      }

      if(var9 == var10001) {
         var9 = var5;
         if(var6 == null) {
            return var9;
         }

         if(var5 == 5) {
            return 15;
         }
      }

      var9 = 0;
      return var9;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "YRTë!«H_Sï".toCharArray();
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
            field_2037 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 223;
            break;
         case 1:
            var10009 = 199;
            break;
         case 2:
            var10009 = 30;
            break;
         case 3:
            var10009 = 196;
            break;
         case 4:
            var10009 = 112;
            break;
         case 5:
            var10009 = 184;
            break;
         default:
            var10009 = 113;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
