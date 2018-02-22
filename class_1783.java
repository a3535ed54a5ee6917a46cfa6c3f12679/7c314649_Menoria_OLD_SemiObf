
// $FF: renamed from: y7
public class class_1783 {

   // $FF: renamed from: b sw
   private class_753 field_9297;
   // $FF: renamed from: c ahb
   private ahb field_9298;
   // $FF: renamed from: d jK
   private class_1289 field_9299;
   // $FF: renamed from: e double
   private double field_9300;
   // $FF: renamed from: f x4
   private class_80 field_9301;
   // $FF: renamed from: g boolean
   private boolean field_9302;
   // $FF: renamed from: h int
   private int field_9303;
   // $FF: renamed from: i int
   private int field_9304;
   // $FF: renamed from: j azw
   private azw field_9305;
   // $FF: renamed from: k boolean
   private boolean field_9306;
   // $FF: renamed from: l boolean
   private boolean field_9307;
   // $FF: renamed from: m boolean
   private boolean field_9308;
   // $FF: renamed from: n boolean
   private boolean field_9309;


   // $FF: renamed from: <init> (sw, ahb) void
   public void method_9783(class_753 var1, ahb var2) {
      super();
      this.field_9305 = azw.method_5086(0.0D, 0.0D, 0.0D);
      this.field_9306 = true;
      this.field_9297 = var1;
      this.field_9298 = var2;
      this.field_9301 = var1.method_4211(class_1840.field_9391);
   }

   // $FF: renamed from: b (boolean) void
   public void method_9784(boolean var1) {
      this.field_9308 = var1;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9785() {
      return this.field_9308;
   }

   // $FF: renamed from: c (boolean) void
   public void method_9786(boolean var1) {
      this.field_9307 = var1;
   }

   // $FF: renamed from: d (boolean) void
   public void method_9787(boolean var1) {
      this.field_9306 = var1;
   }

   // $FF: renamed from: d () boolean
   public boolean method_9788() {
      return this.field_9307;
   }

   // $FF: renamed from: e (boolean) void
   public void method_9789(boolean var1) {
      this.field_9302 = var1;
   }

   // $FF: renamed from: b (double) void
   public void method_9790(double var1) {
      this.field_9300 = var1;
   }

   // $FF: renamed from: f (boolean) void
   public void method_9791(boolean var1) {
      this.field_9309 = var1;
   }

   // $FF: renamed from: e () float
   public float method_9792() {
      return (float)this.field_9301.method_396();
   }

   // $FF: renamed from: b (double, double, double) jK
   public class_1289 method_9793(double var1, double var3, double var5) {
      String[] var7 = class_752.method_4253();
      class_1783 var10000 = this;
      if(var7 != null) {
         if(!this.method_9805()) {
            return null;
         }

         var10000 = this;
      }

      return var10000.field_9298.method_2168(this.field_9297, class_1715.method_9561(var1), (int)var3, class_1715.method_9561(var5), this.method_9792(), this.field_9306, this.field_9307, this.field_9308, this.field_9309);
   }

   // $FF: renamed from: b (double, double, double, double) boolean
   public boolean method_9794(double var1, double var3, double var5, double var7) {
      class_1289 var9 = this.method_9793((double)class_1715.method_9561(var1), (double)((int)var3), (double)class_1715.method_9561(var5));
      return this.method_9797(var9, var7);
   }

   // $FF: renamed from: b (sa) jK
   public class_1289 method_9795(class_689 var1) {
      String[] var2 = class_752.method_4253();
      class_1783 var10000 = this;
      if(var2 != null) {
         if(!this.method_9805()) {
            return null;
         }

         var10000 = this;
      }

      return var10000.field_9298.method_2167(this.field_9297, var1, this.method_9792(), this.field_9306, this.field_9307, this.field_9308, this.field_9309);
   }

   // $FF: renamed from: b (sa, double) boolean
   public boolean method_9796(class_689 var1, double var2) {
      class_1289 var4 = this.method_9795(var1);
      return var4 != null?this.method_9797(var4, var2):false;
   }

   // $FF: renamed from: b (jK, double) boolean
   public boolean method_9797(class_1289 var1, double var2) {
      String[] var4 = class_752.method_4253();
      class_1289 var10000 = var1;
      if(var4 != null) {
         if(var1 == null) {
            this.field_9299 = null;
            return false;
         }

         var10000 = var1;
      }

      int var6 = var10000.method_6750(this.field_9299);
      if(var4 != null) {
         if(var6 == 0) {
            this.field_9299 = var1;
         }

         var6 = this.field_9302;
      }

      class_1783 var7;
      label40: {
         if(var4 != null) {
            if(var6 != 0) {
               this.method_9807();
            }

            var7 = this;
            if(var4 == null) {
               break label40;
            }

            var6 = this.field_9299.method_6744();
         }

         if(var6 == 0) {
            return false;
         }

         this.field_9300 = var2;
         var7 = this;
      }

      azw var5 = var7.method_9803();
      this.field_9304 = this.field_9303;
      this.field_9305.field_4220 = var5.field_4220;
      this.field_9305.field_4221 = var5.field_4221;
      this.field_9305.field_4222 = var5.field_4222;
      return true;
   }

   // $FF: renamed from: f () jK
   public class_1289 method_9798() {
      return this.field_9299;
   }

   // $FF: renamed from: g () void
   public void method_9799() {
      ++this.field_9303;
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.method_9801();
      if(var1 != null) {
         if(var10000) {
            return;
         }

         var10000 = this.method_9805();
      }

      class_1783 var3;
      label40: {
         if(var1 != null) {
            if(var10000) {
               this.method_9800();
            }

            var3 = this;
            if(var1 == null) {
               break label40;
            }

            var10000 = this.method_9801();
         }

         if(var10000) {
            return;
         }

         var3 = this;
      }

      azw var2 = var3.field_9299.method_6749(this.field_9297);
      if(var1 != null) {
         if(var2 == null) {
            return;
         }

         this.field_9297.method_4255().method_9983(var2.field_4220, var2.field_4221, var2.field_4222, this.field_9300);
      }

   }

   // $FF: renamed from: h () void
   private void method_9800() {
      String[] var10000 = class_752.method_4253();
      azw var2 = this.method_9803();
      String[] var1 = var10000;
      int var3 = this.field_9299.method_6744();
      int var4 = this.field_9299.method_6746();

      class_1783 var11;
      int var12;
      while(true) {
         if(var4 < this.field_9299.method_6744()) {
            label96: {
               var11 = this;
               if(var1 == null) {
                  break;
               }

               label87: {
                  var12 = this.field_9299.method_6743(var4).field_6600;
                  if(var1 != null) {
                     if(var12 == (int)var2.field_4221) {
                        break label87;
                     }

                     var12 = var4;
                  }

                  var3 = var12;
                  if(var1 != null) {
                     break label96;
                  }
               }

               ++var4;
               if(var1 != null) {
                  continue;
               }
            }
         }

         var11 = this;
         break;
      }

      float var10 = var11.field_9297.field_3014 * this.field_9297.field_3014;
      int var5 = this.field_9299.method_6746();

      while(true) {
         if(var5 < var3) {
            double var13;
            var12 = (var13 = var2.method_5095(this.field_9299.method_6748(this.field_9297, var5)) - (double)var10) == 0.0D?0:(var13 < 0.0D?-1:1);
            if(var1 == null) {
               break;
            }

            if(var12 < 0) {
               this.field_9299.method_6747(var5 + 1);
            }

            ++var5;
            if(var1 != null) {
               continue;
            }
         }

         var5 = class_1715.method_9566(this.field_9297.field_3014);
         var12 = (int)this.field_9297.field_3015 + 1;
         break;
      }

      int var6 = var12;
      int var7 = var5;
      int var8 = var3 - 1;

      while(true) {
         if(var8 >= this.field_9299.method_6746()) {
            label62: {
               label61: {
                  var11 = this;
                  if(var1 != null) {
                     var12 = this.method_9808(var2, this.field_9299.method_6748(this.field_9297, var8), var5, var6, var7);
                     if(var1 == null) {
                        break;
                     }

                     if(var12 == 0) {
                        break label61;
                     }

                     var11 = this;
                  }

                  var11.field_9299.method_6747(var8);
                  if(var1 != null) {
                     break label62;
                  }
               }

               --var8;
               if(var1 != null) {
                  continue;
               }
            }
         }

         var12 = this.field_9303 - this.field_9304;
         break;
      }

      azw var9;
      azw var10001;
      label99: {
         if(var1 != null) {
            if(var12 <= 100) {
               return;
            }

            var9 = var2;
            var10001 = this.field_9305;
            if(var1 == null) {
               break label99;
            }

            double var14;
            var12 = (var14 = var2.method_5095(this.field_9305) - 2.25D) == 0.0D?0:(var14 < 0.0D?-1:1);
         }

         if(var12 < 0) {
            this.method_9802();
         }

         this.field_9304 = this.field_9303;
         this.field_9305.field_4220 = var2.field_4220;
         this.field_9305.field_4221 = var2.field_4221;
         var9 = this.field_9305;
         var10001 = var2;
      }

      var9.field_4222 = var10001.field_4222;
   }

   // $FF: renamed from: i () boolean
   public boolean method_9801() {
      boolean var2;
      label24: {
         String[] var1 = class_752.method_4253();
         class_1289 var10000 = this.field_9299;
         if(var1 != null) {
            if(this.field_9299 == null) {
               break label24;
            }

            var10000 = this.field_9299;
         }

         var2 = var10000.method_6741();
         if(var1 == null) {
            return var2;
         }

         if(!var2) {
            var2 = false;
            return var2;
         }
      }

      var2 = true;
      return var2;
   }

   // $FF: renamed from: j () void
   public void method_9802() {
      this.field_9299 = null;
   }

   // $FF: renamed from: k () azw
   private azw method_9803() {
      return azw.method_5086(this.field_9297.field_2994, (double)this.method_9804(), this.field_9297.field_2996);
   }

   // $FF: renamed from: l () int
   private int method_9804() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_9297.method_3876();
      if(var1 != null) {
         if(var10000 != 0) {
            label44: {
               var10000 = this.field_9309;
               if(var1 != null) {
                  if(!this.field_9309) {
                     break label44;
                  }

                  var10000 = (int)this.field_9297.field_3004.field_6910;
               }

               int var2 = var10000;
               aji var3 = this.field_9298.getBlock(class_1715.method_9561(this.field_9297.field_2994), var2, class_1715.method_9561(this.field_9297.field_2996));
               int var4 = 0;

               while(true) {
                  aji var5;
                  label30: {
                     if(var3 != class_1192.field_6033) {
                        var5 = var3;
                        if(var1 == null) {
                           break label30;
                        }

                        if(var3 != class_1192.field_6034) {
                           var10000 = var2;
                           break;
                        }
                     }

                     ++var2;
                     var5 = this.field_9298.getBlock(class_1715.method_9561(this.field_9297.field_2994), var2, class_1715.method_9561(this.field_9297.field_2996));
                  }

                  var3 = var5;
                  ++var4;
                  if(var4 > 16) {
                     var10000 = (int)this.field_9297.field_3004.field_6910;
                     if(var1 != null) {
                        return var10000;
                     }
                     break;
                  }
               }

               return var10000;
            }
         }

         var10000 = (int)(this.field_9297.field_3004.field_6910 + 0.5D);
      }

      return var10000;
   }

   // $FF: renamed from: m () boolean
   private boolean method_9805() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9297.field_3005;
      if(var1 != null) {
         if(!this.field_9297.field_3005) {
            label60: {
               var10000 = this.field_9309;
               if(var1 != null) {
                  if(this.field_9309) {
                     var10000 = this.method_9806();
                     if(var1 == null) {
                        return var10000;
                     }

                     if(var10000) {
                        break label60;
                     }
                  }

                  var10000 = this.field_9297.method_3937();
               }

               label52: {
                  if(var1 != null) {
                     if(!var10000) {
                        break label52;
                     }

                     var10000 = this.field_9297 instanceof class_781;
                  }

                  if(var1 != null) {
                     if(!var10000) {
                        break label52;
                     }

                     var10000 = this.field_9297.field_2988 instanceof class_775;
                  }

                  if(var1 == null) {
                     return var10000;
                  }

                  if(var10000) {
                     break label60;
                  }
               }

               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: n () boolean
   private boolean method_9806() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9297.method_3876();
      if(var1 != null) {
         if(!var10000) {
            var10000 = this.field_9297.method_3881();
            if(var1 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: o () void
   private void method_9807() {
      String[] var1 = class_752.method_4253();
      byte var10000 = this.field_9298.method_2067(class_1715.method_9561(this.field_9297.field_2994), (int)(this.field_9297.field_3004.field_6910 + 0.5D), class_1715.method_9561(this.field_9297.field_2996));
      if(var1 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = 0;
      }

      int var2 = var10000;

      while(var2 < this.field_9299.method_6744()) {
         class_1288 var3 = this.field_9299.method_6743(var2);
         if(var1 != null) {
            if(this.field_9298.method_2067(var3.field_6599, var3.field_6600, var3.field_6601)) {
               this.field_9299.method_6745(var2 - 1);
               return;
            }

            ++var2;
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (azw, azw, int, int, int) boolean
   private boolean method_9808(azw var1, azw var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = class_1715.method_9561(var1.field_4220);
      int var8 = class_1715.method_9561(var1.field_4222);
      double var9 = var2.field_4220 - var1.field_4220;
      double var11 = var2.field_4222 - var1.field_4222;
      String[] var6 = var10000;
      double var13 = var9 * var9 + var11 * var11;
      double var31 = var13;
      double var10001 = 1.0E-8D;
      if(var6 != null) {
         if(var13 < 1.0E-8D) {
            return false;
         }

         var31 = 1.0D;
         var10001 = Math.sqrt(var13);
      }

      double var15 = var31 / var10001;
      var9 *= var15;
      var11 *= var15;
      var3 += 2;
      var5 += 2;
      if(var6 != null) {
         if(!this.method_9809(var7, (int)var1.field_4221, var8, var3, var4, var5, var1, var9, var11)) {
            return false;
         }

         var3 -= 2;
         var5 -= 2;
      }

      double var17 = 1.0D / Math.abs(var9);
      double var19 = 1.0D / Math.abs(var11);
      double var21 = (double)(var7 * 1) - var1.field_4220;
      double var23 = (double)(var8 * 1) - var1.field_4222;
      double var33;
      int var32 = (var33 = var9 - 0.0D) == 0.0D?0:(var33 < 0.0D?-1:1);
      if(var6 != null) {
         if(var32 >= 0) {
            ++var21;
         }

         double var34;
         var32 = (var34 = var11 - 0.0D) == 0.0D?0:(var34 < 0.0D?-1:1);
      }

      if(var6 != null) {
         if(var32 >= 0) {
            ++var23;
         }

         var21 /= var9;
         var23 /= var11;
         double var35;
         var32 = (var35 = var9 - 0.0D) == 0.0D?0:(var35 < 0.0D?-1:1);
      }

      if(var6 != null) {
         var32 = var32 < 0?-1:1;
      }

      int var25 = var32;
      double var36;
      var32 = (var36 = var11 - 0.0D) == 0.0D?0:(var36 < 0.0D?-1:1);
      if(var6 != null) {
         var32 = var32 < 0?-1:1;
      }

      int var26 = var32;
      int var27 = class_1715.method_9561(var2.field_4220);
      int var28 = class_1715.method_9561(var2.field_4222);
      int var29 = var27 - var7;
      int var30 = var28 - var8;

      label95:
      while(true) {
         if(var29 * var25 <= 0) {
            var32 = var30 * var26;
            if(var6 == null) {
               break;
            }

            if(var32 <= 0) {
               var32 = 1;
               break;
            }
         }

         do {
            label79: {
               double var37;
               var32 = (var37 = var21 - var23) == 0.0D?0:(var37 < 0.0D?-1:1);
               if(var6 != null) {
                  if(var32 < 0) {
                     var21 += var17;
                     var7 += var25;
                     var29 = var27 - var7;
                     if(var6 != null) {
                        break label79;
                     }
                  }

                  var23 += var19;
                  var8 += var26;
                  var32 = var28 - var8;
               }

               var30 = var32;
            }

            if(this.method_9809(var7, (int)var1.field_4221, var8, var3, var4, var5, var1, var9, var11)) {
               continue label95;
            }

            var32 = 0;
            if(var6 != null) {
               return false;
            }

            if(var6 == null) {
               return (boolean)var32;
            }
         } while(0 > 0);

         var32 = 1;
         break;
      }

      return (boolean)var32;
   }

   // $FF: renamed from: b (int, int, int, int, int, int, azw, double, double) boolean
   private boolean method_9809(int var1, int var2, int var3, int var4, int var5, int var6, azw var7, double var8, double var10) {
      String[] var10000 = class_752.method_4253();
      int var13 = var1 - var4 / 2;
      String[] var12 = var10000;
      int var14 = var3 - var6 / 2;
      int var23 = this.method_9810(var13, var2, var14, var4, var5, var6, var7, var8, var10);
      if(var12 != null) {
         if(var23 == 0) {
            return false;
         }

         var23 = var13;
      }

      int var15 = var23;

      label75:
      while(true) {
         var23 = var15;

         label72:
         while(true) {
            if(var23 < var13 + var4) {
               var23 = var14;
               if(var12 == null) {
                  break;
               }

               int var16 = var14;

               while(var16 < var14 + var6) {
                  double var17 = (double)var15 + 0.5D - var7.field_4220;
                  double var19 = (double)var16 + 0.5D - var7.field_4222;
                  double var26;
                  var23 = (var26 = var17 * var8 + var19 * var10 - 0.0D) == 0.0D?0:(var26 < 0.0D?-1:1);
                  if(var12 == null) {
                     continue label72;
                  }

                  if(var23 >= 0) {
                     aji var21 = this.field_9298.getBlock(var15, var2 - 1, var16);
                     awt var22 = var21.method_2424();
                     awt var24 = var22;
                     awt var10001 = awt.field_4170;
                     if(var12 != null) {
                        if(var22 == awt.field_4170) {
                           return false;
                        }

                        var24 = var22;
                        var10001 = awt.field_4177;
                     }

                     if(var12 != null) {
                        if(var24 == var10001) {
                           label55: {
                              boolean var25 = this.field_9297.method_3876();
                              if(var12 != null) {
                                 if(var25) {
                                    break label55;
                                 }

                                 var25 = false;
                              }

                              return var25;
                           }
                        }

                        var24 = var22;
                        var10001 = awt.field_4178;
                     }

                     if(var24 == var10001) {
                        return false;
                     }
                  }

                  ++var16;
                  if(var12 == null) {
                     break;
                  }
               }

               ++var15;
               if(var12 != null) {
                  continue label75;
               }
            }

            var23 = 1;
            break;
         }

         return (boolean)var23;
      }
   }

   // $FF: renamed from: c (int, int, int, int, int, int, azw, double, double) boolean
   private boolean method_9810(int var1, int var2, int var3, int var4, int var5, int var6, azw var7, double var8, double var10) {
      String[] var10000 = class_752.method_4253();
      int var13 = var1;
      String[] var12 = var10000;

      label64:
      while(true) {
         int var21 = var13;

         label61:
         while(var21 < var1 + var4) {
            var21 = var2;
            if(var12 == null) {
               return (boolean)var21;
            }

            int var14 = var2;

            label58:
            do {
               var21 = var14;

               label55:
               while(true) {
                  if(var21 >= var2 + var5) {
                     break label58;
                  }

                  var21 = var3;
                  if(var12 == null) {
                     continue label61;
                  }

                  int var15 = var3;

                  while(true) {
                     if(var15 >= var3 + var6) {
                        break label55;
                     }

                     double var16 = (double)var13 + 0.5D - var7.field_4220;
                     double var18 = (double)var15 + 0.5D - var7.field_4222;
                     double var22;
                     var21 = (var22 = var16 * var8 + var18 * var10 - 0.0D) == 0.0D?0:(var22 < 0.0D?-1:1);
                     if(var12 == null) {
                        break;
                     }

                     label50: {
                        if(var21 >= 0) {
                           aji var20 = this.field_9298.getBlock(var13, var14, var15);
                           if(var12 == null) {
                              break label50;
                           }

                           if(!var20.method_2435(this.field_9298, var13, var14, var15)) {
                              return false;
                           }
                        }

                        ++var15;
                     }

                     if(var12 == null) {
                        break label55;
                     }
                  }
               }

               ++var14;
            } while(var12 != null);

            ++var13;
            if(var12 != null) {
               continue label64;
            }
            break;
         }

         var21 = 1;
         return (boolean)var21;
      }
   }
}
