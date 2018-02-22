
// $FF: renamed from: wg
public class class_736 extends class_716 {

   // $FF: renamed from: aJ int
   private int field_3265;
   // $FF: renamed from: aK bkn
   private final bkn field_3266;
   // $FF: renamed from: aL rr
   private class_1580 field_3267;
   // $FF: renamed from: aM boolean
   boolean field_3268;
   // $FF: renamed from: aN java.lang.String
   private static final String field_3269;
   // $FF: renamed from: eb java.lang.String[]
   private static final String[] field_3270;


   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double, bkn, ro) void
   public void method_4121(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12, bkn var14, class_1583 var15) {
      String[] var10000 = class_752.method_4253();
      super.method_4093(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      String[] var16 = var10000;
      this.field_2997 = var8;
      this.field_2998 = var10;
      this.field_2999 = var12;
      this.field_3266 = var14;
      this.field_3218 = 8;
      if(var16 != null) {
         if(var15 == null) {
            return;
         }

         String[] var19 = field_3270;
         this.field_3267 = var15.method_8689("Explosions", 10);
      }

      int var20 = this.field_3267.method_8658();
      if(var16 != null) {
         if(var20 == 0) {
            this.field_3267 = null;
            if(var16 != null) {
               return;
            }
         }

         this.field_3218 = this.field_3267.method_8658() * 2 - 1;
         var20 = 0;
      }

      int var17 = var20;

      while(var17 < this.field_3267.method_8658()) {
         class_1583 var18 = this.field_3267.method_8653(var17);
         if(var16 != null) {
            String[] var10001 = field_3270;
            if(var18.method_8690("Flicker")) {
               this.field_3268 = true;
               this.field_3218 += 15;
               if(var16 != null) {
                  break;
               }
            }

            ++var17;
         }

         if(var16 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (bmh, float, float, float, float, float, float) void
   public void method_4101(bmh var1, float var2, float var3, float var4, float var5, float var6, float var7) {}

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3265;
      boolean var2;
      String[] var15;
      byte var10001;
      class_736 var21;
      String var22;
      StringBuilder var23;
      if(var1 != null) {
         label157: {
            label156: {
               if(this.field_3265 == 0) {
                  var21 = this;
                  if(var1 == null) {
                     break label156;
                  }

                  if(this.field_3267 != null) {
                     boolean var3;
                     label163: {
                        var2 = this.method_4122();
                        var3 = false;
                        var10000 = this.field_3267.method_8658();
                        if(var1 != null) {
                           if(var10000 >= 3) {
                              var3 = true;
                              if(var1 != null) {
                                 break label163;
                              }
                           }

                           var10000 = 0;
                        }

                        int var4 = var10000;

                        while(var4 < this.field_3267.method_8658()) {
                           class_1583 var5 = this.field_3267.method_8653(var4);
                           if(var1 != null) {
                              var15 = field_3270;
                              var10000 = var5.initGui9("Type");
                              var10001 = 1;
                              if(var1 == null) {
                                 break label157;
                              }

                              if(var10000 == 1) {
                                 var3 = true;
                                 if(var1 != null) {
                                    break;
                                 }
                              }

                              ++var4;
                           }

                           if(var1 == null) {
                              break;
                           }
                        }
                     }

                     var23 = new StringBuilder();
                     var15 = field_3270;
                     var22 = "fireworks.";
                     if(var1 != null) {
                        var23 = var23.append("fireworks.");
                        if(var3) {
                           var22 = "largeBlast";
                        } else {
                           var15 = field_3270;
                           var22 = "blast";
                        }
                     }

                     var23 = var23.append(var22);
                     if(var2) {
                        var15 = field_3270;
                        var22 = "_far";
                     } else {
                        var22 = "";
                     }

                     String var18 = var23.append(var22).toString();
                     this.field_2990.method_2085(this.field_2994, this.field_2995, this.field_2996, var18, 20.0F, 0.95F + this.field_3028.nextFloat() * 0.1F, true);
                  }
               }

               var21 = this;
            }

            var10000 = var21.field_3265;
            var10001 = 2;
         }

         var10000 %= var10001;
      }

      label166: {
         label167: {
            int var24;
            label168: {
               if(var1 != null) {
                  label122: {
                     if(var10000 == 0) {
                        var21 = this;
                        if(var1 == null) {
                           break label122;
                        }

                        if(this.field_3267 != null) {
                           var10000 = this.field_3265 / 2;
                           var24 = this.field_3267.method_8658();
                           if(var1 == null) {
                              break label168;
                           }

                           if(var10000 < var24) {
                              int[] var8;
                              label169: {
                                 int var16 = this.field_3265 / 2;
                                 class_1583 var19 = this.field_3267.method_8653(var16);
                                 var15 = field_3270;
                                 byte var20 = var19.initGui9("Type");
                                 boolean var6 = var19.method_8690("Trail");
                                 boolean var7 = var19.method_8690("Flicker");
                                 var8 = var19.method_8687("Colors");
                                 int[] var9 = var19.method_8687("FadeColors");
                                 byte var25 = var20;
                                 var10001 = 1;
                                 if(var1 != null) {
                                    if(var20 == 1) {
                                       this.method_4124(0.5D, 4, var8, var9, var6, var7);
                                       if(var1 != null) {
                                          break label169;
                                       }
                                    }

                                    var25 = var20;
                                    var10001 = 2;
                                 }

                                 if(var1 != null) {
                                    if(var25 == var10001) {
                                       this.method_4125(0.5D, new double[][]{{0.0D, 1.0D}, {0.3455D, 0.309D}, {0.9511D, 0.309D}, {0.3795918367346939D, -0.12653061224489795D}, {0.6122448979591837D, -0.8040816326530612D}, {0.0D, -0.35918367346938773D}}, var8, var9, var6, var7, false);
                                       if(var1 != null) {
                                          break label169;
                                       }
                                    }

                                    var25 = var20;
                                    var10001 = 3;
                                 }

                                 if(var1 != null) {
                                    if(var25 == var10001) {
                                       this.method_4125(0.5D, new double[][]{{0.0D, 0.2D}, {0.2D, 0.2D}, {0.2D, 0.6D}, {0.6D, 0.6D}, {0.6D, 0.2D}, {0.2D, 0.2D}, {0.2D, 0.0D}, {0.4D, 0.0D}, {0.4D, -0.6D}, {0.2D, -0.6D}, {0.2D, -0.4D}, {0.0D, -0.4D}}, var8, var9, var6, var7, true);
                                       if(var1 != null) {
                                          break label169;
                                       }
                                    }

                                    var25 = var20;
                                    var10001 = 4;
                                 }

                                 if(var25 == var10001) {
                                    this.method_4126(var8, var9, var6, var7);
                                    if(var1 != null) {
                                       break label169;
                                    }
                                 }

                                 this.method_4124(0.25D, 2, var8, var9, var6, var7);
                              }

                              int var10 = var8[0];
                              float var11 = (float)((var10 & 16711680) >> 16) / 255.0F;
                              float var12 = (float)((var10 & '\uff00') >> 8) / 255.0F;
                              float var13 = (float)((var10 & 255) >> 0) / 255.0F;
                              class_738 var27 = new class_738;
                              var27.method_4092(this.field_2990, this.field_2994, this.field_2995, this.field_2996);
                              class_738 var14 = var27;
                              var14.method_4096(var11, var12, var13);
                              this.field_3266.method_6968(var14);
                           }
                        }
                     }

                     ++this.field_3265;
                     var21 = this;
                  }

                  var10000 = var21.field_3265;
               }

               if(var1 == null) {
                  break label167;
               }

               var24 = this.field_3218;
            }

            if(var10000 <= var24) {
               return;
            }

            var21 = this;
            if(var1 == null) {
               break label166;
            }

            var10000 = this.field_3268;
         }

         if(var10000 != 0) {
            var2 = this.method_4122();
            var23 = new StringBuilder();
            var15 = field_3270;
            var22 = "fireworks.";
            if(var1 != null) {
               var23 = var23.append("fireworks.");
               if(var2) {
                  var22 = "twinkle_far";
               } else {
                  String[] var26 = field_3270;
                  var22 = "twinkle";
               }
            }

            String var17 = var23.append(var22).toString();
            this.field_2990.method_2085(this.field_2994, this.field_2995, this.field_2996, var17, 20.0F, 0.9F + this.field_3028.nextFloat() * 0.15F, true);
         }

         var21 = this;
      }

      var21.method_3851();
   }

   // $FF: renamed from: i () boolean
   private boolean method_4122() {
      int var5;
      label32: {
         String[] var10000 = class_752.method_4253();
         bao var2 = bao.method_5273();
         String[] var1 = var10000;
         bao var3 = var2;
         if(var1 != null) {
            if(var2 == null) {
               break label32;
            }

            var3 = var2;
         }

         class_752 var4 = var3.cursorCounter9;
         if(var1 != null) {
            if(var4 == null) {
               break label32;
            }

            var4 = var2.cursorCounter9;
         }

         double var6;
         var5 = (var6 = var4.method_3889(this.field_2994, this.field_2995, this.field_2996) - 256.0D) == 0.0D?0:(var6 < 0.0D?-1:1);
         if(var1 == null) {
            return (boolean)var5;
         }

         if(var5 < 0) {
            var5 = 0;
            return (boolean)var5;
         }
      }

      var5 = 1;
      return (boolean)var5;
   }

   // $FF: renamed from: b (double, double, double, double, double, double, int[], int[], boolean, boolean) void
   private void method_4123(double var1, double var3, double var5, double var7, double var9, double var11, int[] var13, int[] var14, boolean var15, boolean var16) {
      class_737 var10000 = new class_737;
      var10000.method_4127(this.field_2990, var1, var3, var5, var7, var9, var11, this.field_3266);
      class_737 var18 = var10000;
      String[] var17 = class_752.method_4253();
      var18.method_4128(var15);
      var18.method_4129(var16);
      int var19 = this.field_3028.nextInt(var13.length);
      var18.method_4130(var13[var19]);
      if(var17 != null) {
         if(var14 != null && var14.length > 0) {
            var18.method_4131(var14[this.field_3028.nextInt(var14.length)]);
         }

         this.field_3266.method_6968(var18);
      }

   }

   // $FF: renamed from: b (double, int, int[], int[], boolean, boolean) void
   private void method_4124(double var1, int var3, int[] var4, int[] var5, boolean var6, boolean var7) {
      String[] var10000 = class_752.method_4253();
      double var9 = this.field_2994;
      double var11 = this.field_2995;
      String[] var8 = var10000;
      double var13 = this.field_2996;
      int var15 = -var3;

      do {
         int var26 = var15;

         label72:
         while(true) {
            if(var26 > var3) {
               return;
            }

            int var16 = -var3;

            while(true) {
               var26 = var16;
               int var10001 = var3;

               label68:
               while(true) {
                  if(var26 > var10001) {
                     break label72;
                  }

                  var26 = -var3;
                  if(var8 == null) {
                     continue label72;
                  }

                  int var17 = var26;

                  while(var17 <= var3) {
                     double var18 = (double)var16 + (this.field_3028.nextDouble() - this.field_3028.nextDouble()) * 0.5D;
                     double var20 = (double)var15 + (this.field_3028.nextDouble() - this.field_3028.nextDouble()) * 0.5D;
                     double var22 = (double)var17 + (this.field_3028.nextDouble() - this.field_3028.nextDouble()) * 0.5D;
                     double var24 = (double)class_1715.method_9558(var18 * var18 + var20 * var20 + var22 * var22) / var1 + this.field_3028.nextGaussian() * 0.05D;
                     this.method_4123(var9, var11, var13, var18 / var24, var20 / var24, var22 / var24, var4, var5, var6, var7);
                     if(var8 != null) {
                        var26 = var15;
                        var10001 = -var3;
                        if(var8 == null) {
                           continue label68;
                        }

                        if(var15 != var10001) {
                           label84: {
                              var26 = var15;
                              var10001 = var3;
                              if(var8 != null) {
                                 if(var15 == var3) {
                                    break label84;
                                 }

                                 var26 = var16;
                                 var10001 = -var3;
                              }

                              if(var8 != null) {
                                 if(var26 == var10001) {
                                    break label84;
                                 }

                                 var26 = var16;
                                 var10001 = var3;
                              }

                              if(var8 != null) {
                                 if(var26 == var10001) {
                                    break label84;
                                 }

                                 var26 = var17;
                                 var10001 = var3 * 2 - 1;
                              }

                              var17 = var26 + var10001;
                           }
                        }

                        ++var17;
                     }

                     if(var8 == null) {
                        break;
                     }
                  }

                  ++var16;
                  if(var8 == null) {
                     break label72;
                  }
                  break;
               }
            }
         }

         ++var15;
      } while(var8 != null);

   }

   // $FF: renamed from: b (double, double[][], int[], int[], boolean, boolean, boolean) void
   private void method_4125(double var1, double[][] var3, int[] var4, int[] var5, boolean var6, boolean var7, boolean var8) {
      double var10 = var3[0][0];
      double var12 = var3[0][1];
      this.method_4123(this.field_2994, this.field_2995, this.field_2996, var10 * var1, var12 * var1, 0.0D, var4, var5, var6, var7);
      String[] var10000 = class_752.method_4253();
      float var14 = this.field_3028.nextFloat() * 3.1415927F;
      String[] var9 = var10000;
      double var15 = var8?0.034D:0.34D;
      int var17 = 0;

      while(var17 < 3) {
         double var18 = (double)var14 + (double)((float)var17 * 3.1415927F) * var15;
         double var20 = var10;
         double var39 = var12;

         label58:
         while(true) {
            double var22 = var39;
            int var24 = 1;

            while(true) {
               if(var24 >= var3.length) {
                  break label58;
               }

               double var25 = var3[var24][0];
               double var27 = var3[var24][1];
               var39 = 0.25D;
               if(var9 == null) {
                  break;
               }

               double var29 = 0.25D;

               while(true) {
                  if(var29 <= 1.0D) {
                     double var31 = (var20 + (var25 - var20) * var29) * var1;
                     double var33 = (var22 + (var27 - var22) * var29) * var1;
                     double var35 = var31 * Math.sin(var18);
                     var31 *= Math.cos(var18);
                     var39 = -1.0D;
                     if(var9 == null) {
                        break;
                     }

                     double var37 = -1.0D;

                     while(true) {
                        if(var37 <= 1.0D) {
                           this.method_4123(this.field_2994, this.field_2995, this.field_2996, var31 * var37, var33, var35 * var37, var4, var5, var6, var7);
                           var37 += 2.0D;
                           if(var9 == null) {
                              break;
                           }

                           if(var9 != null) {
                              continue;
                           }
                        }

                        var29 += 0.25D;
                        break;
                     }

                     if(var9 != null) {
                        continue;
                     }
                  }

                  var20 = var25;
                  var39 = var27;
                  break;
               }

               var22 = var39;
               ++var24;
               if(var9 == null) {
                  break label58;
               }
            }
         }

         ++var17;
         if(var9 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int[], int[], boolean, boolean) void
   private void method_4126(int[] var1, int[] var2, boolean var3, boolean var4) {
      String[] var10000 = class_752.method_4253();
      double var6 = this.field_3028.nextGaussian() * 0.05D;
      String[] var5 = var10000;
      double var8 = this.field_3028.nextGaussian() * 0.05D;
      int var10 = 0;

      while(var10 < 70) {
         double var11 = this.field_2997 * 0.5D + this.field_3028.nextGaussian() * 0.15D + var6;
         double var13 = this.field_2999 * 0.5D + this.field_3028.nextGaussian() * 0.15D + var8;
         double var15 = this.field_2998 * 0.5D + this.field_3028.nextDouble() * 0.5D;
         this.method_4123(this.field_2994, this.field_2995, this.field_2996, var11, var15, var13, var1, var2, var3, var4);
         ++var10;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e () int
   public int method_4102() {
      return 0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4107() {
      // $FF: Couldn't be decompiled
   }
}
