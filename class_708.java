import java.util.List;

// $FF: renamed from: xD
public abstract class class_708 extends class_689 {

   // $FF: renamed from: at int
   private int field_3163;
   // $FF: renamed from: au int
   private int field_3164;
   // $FF: renamed from: av int
   private int field_3165;
   // $FF: renamed from: aw aji
   private aji field_3166;
   // $FF: renamed from: ax boolean
   private boolean field_3167;
   // $FF: renamed from: ay sv
   public class_752 field_3168;
   // $FF: renamed from: az int
   private int field_3169;
   // $FF: renamed from: aA int
   private int field_3170;
   // $FF: renamed from: aB double
   public double field_3171;
   // $FF: renamed from: aC double
   public double field_3172;
   // $FF: renamed from: aD double
   public double field_3173;
   // $FF: renamed from: aE java.lang.String
   private static final String field_3174;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3175;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3163 = -1;
      this.field_3164 = -1;
      this.field_3165 = -1;
      this.method_3852(1.0F, 1.0F);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {}

   // $FF: renamed from: a (double) boolean
   public boolean method_3901(double var1) {
      String[] var10000 = class_752.method_4253();
      double var4 = this.field_3004.method_7106() * 4.0D;
      var4 *= 64.0D;
      String[] var3 = var10000;
      double var7;
      int var6 = (var7 = var1 - var4 * var4) == 0.0D?0:(var7 < 0.0D?-1:1);
      if(var3 != null) {
         var6 = var6 < 0?1:0;
      }

      return (boolean)var6;
   }

   // $FF: renamed from: <init> (ahb, double, double, double, double, double, double) void
   public void method_4064(ahb var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super.method_3847(var1);
      this.field_3163 = -1;
      this.field_3164 = -1;
      this.field_3165 = -1;
      this.method_3852(1.0F, 1.0F);
      this.method_3887(var2, var4, var6, this.field_3000, this.field_3001);
      this.method_3854(var2, var4, var6);
      double var14 = (double)class_1715.method_9558(var8 * var8 + var10 * var10 + var12 * var12);
      this.field_3171 = var8 / var14 * 0.1D;
      this.field_3172 = var10 / var14 * 0.1D;
      this.field_3173 = var12 / var14 * 0.1D;
   }

   // $FF: renamed from: <init> (ahb, sv, double, double, double) void
   public void method_4065(ahb var1, class_752 var2, double var3, double var5, double var7) {
      super.method_3847(var1);
      this.field_3163 = -1;
      this.field_3164 = -1;
      this.field_3165 = -1;
      this.field_3168 = var2;
      this.method_3852(1.0F, 1.0F);
      this.method_3887(var2.field_2994, var2.field_2995, var2.field_2996, var2.field_3000, var2.field_3001);
      this.method_3854(this.field_2994, this.field_2995, this.field_2996);
      this.field_3013 = 0.0F;
      this.field_2997 = this.field_2998 = this.field_2999 = 0.0D;
      var3 += this.field_3028.nextGaussian() * 0.4D;
      var5 += this.field_3028.nextGaussian() * 0.4D;
      var7 += this.field_3028.nextGaussian() * 0.4D;
      double var9 = (double)class_1715.method_9558(var3 * var3 + var5 * var5 + var7 * var7);
      this.field_3171 = var3 / var9 * 0.1D;
      this.field_3172 = var5 / var9 * 0.1D;
      this.field_3173 = var7 / var9 * 0.1D;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1;
      class_708 var21;
      label214: {
         label218: {
            var1 = class_752.method_4253();
            boolean var10000 = this.field_2990.field_1832;
            if(var1 != null) {
               label219: {
                  if(!this.field_2990.field_1832) {
                     label209: {
                        label208: {
                           label220: {
                              var21 = this;
                              if(var1 != null) {
                                 if(this.field_3168 != null) {
                                    var21 = this;
                                    if(var1 == null) {
                                       break label208;
                                    }

                                    if(this.field_3168.field_3012) {
                                       break label220;
                                    }
                                 }

                                 var21 = this;
                              }

                              var10000 = var21.field_2990.method_2048((int)this.field_2994, (int)this.field_2995, (int)this.field_2996);
                              if(var1 == null) {
                                 break label219;
                              }

                              if(var10000) {
                                 break label209;
                              }
                           }

                           var21 = this;
                        }

                        var21.method_3851();
                        if(var1 != null) {
                           return;
                        }
                     }
                  }

                  super.method_3856();
                  this.method_3860(1);
                  var21 = this;
                  if(var1 == null) {
                     break label218;
                  }

                  var10000 = this.field_3167;
               }
            }

            if(var10000) {
               var21 = this;
               if(var1 != null) {
                  if(this.field_2990.getBlock(this.field_3163, this.field_3164, this.field_3165) == this.field_3166) {
                     ++this.field_3169;
                     var21 = this;
                     if(var1 != null) {
                        if(this.field_3169 != 600) {
                           return;
                        }

                        var21 = this;
                     }

                     var21.method_3851();
                     return;
                  }

                  this.field_3167 = false;
                  this.field_2997 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_2998 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_2999 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_3169 = 0;
                  var21 = this;
               }

               var21.field_3170 = 0;
               if(var1 != null) {
                  break label214;
               }
            }

            var21 = this;
         }

         ++var21.field_3170;
      }

      azw var2;
      azw var3;
      azu var4;
      azu var22;
      label182: {
         var2 = azw.method_5086(this.field_2994, this.field_2995, this.field_2996);
         var3 = azw.method_5086(this.field_2994 + this.field_2997, this.field_2995 + this.field_2998, this.field_2996 + this.field_2999);
         var4 = this.field_2990.method_2079(var2, var3);
         var2 = azw.method_5086(this.field_2994, this.field_2995, this.field_2996);
         var3 = azw.method_5086(this.field_2994 + this.field_2997, this.field_2995 + this.field_2998, this.field_2996 + this.field_2999);
         var22 = var4;
         if(var1 != null) {
            if(var4 == null) {
               break label182;
            }

            var22 = var4;
         }

         var3 = azw.method_5086(var22.field_4217.field_4220, var4.field_4217.field_4221, var4.field_4217.field_4222);
      }

      class_689 var5 = null;
      List var6 = this.field_2990.method_2155(this, this.field_3004.method_7096(this.field_2997, this.field_2998, this.field_2999).method_7097(1.0D, 1.0D, 1.0D));
      double var7 = 0.0D;
      int var9 = 0;

      class_689 var23;
      while(true) {
         if(var9 < var6.size()) {
            class_689 var10 = (class_689)var6.get(var9);
            if(var1 != null) {
               label221: {
                  var23 = var10;
                  if(var1 == null) {
                     break;
                  }

                  if(var10.method_3897()) {
                     label222: {
                        label166: {
                           int var24 = var10.method_3956(this.field_3168);
                           if(var1 != null) {
                              if(var24 == 0) {
                                 break label166;
                              }

                              var24 = this.field_3170;
                           }

                           if(var24 < 25) {
                              break label222;
                           }
                        }

                        float var11 = 0.3F;
                        class_1343 var12 = var10.field_3004.method_7097((double)var11, (double)var11, (double)var11);
                        azu var13 = var12.method_7109(var2, var3);
                        if(var1 == null) {
                           break label221;
                        }

                        if(var13 != null) {
                           label155: {
                              double var14 = var2.method_5094(var13.field_4217);
                              double var25 = var14;
                              if(var1 != null) {
                                 label153: {
                                    if(var14 >= var7) {
                                       var25 = var7;
                                       if(var1 == null) {
                                          break label153;
                                       }

                                       if(var7 != 0.0D) {
                                          break label155;
                                       }
                                    }

                                    var5 = var10;
                                    var25 = var14;
                                 }
                              }

                              var7 = var25;
                           }
                        }
                     }
                  }

                  ++var9;
               }
            }

            if(var1 != null) {
               continue;
            }
         }

         var23 = var5;
         break;
      }

      if(var23 != null) {
         var22 = new azu;
         var22.method_5083(var5);
         var4 = var22;
      }

      if(var4 != null) {
         this.method_4067(var4);
      }

      this.field_2994 += this.field_2997;
      this.field_2995 += this.field_2998;
      this.field_2996 += this.field_2999;
      float var17 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
      this.field_3000 = (float)(Math.atan2(this.field_2999, this.field_2997) * 180.0D / 3.141592653589793D) + 90.0F;
      this.field_3001 = (float)(Math.atan2((double)var17, this.field_2998) * 180.0D / 3.141592653589793D) - 90.0F;

      label141: {
         label140: {
            label139:
            while(true) {
               if(this.field_3001 - this.field_3003 < -180.0F) {
                  this.field_3003 -= 360.0F;
                  if(var1 == null) {
                     break;
                  }

                  if(var1 != null) {
                     continue;
                  }
               }

               while(true) {
                  if(this.field_3001 - this.field_3003 < 180.0F) {
                     break label139;
                  }

                  this.field_3003 += 360.0F;
                  if(var1 == null) {
                     break label140;
                  }

                  if(var1 == null) {
                     break label139;
                  }
               }
            }

            while(this.field_3000 - this.field_3002 < -180.0F) {
               this.field_3002 -= 360.0F;
               if(var1 == null) {
                  break label141;
               }

               if(var1 == null) {
                  break;
               }
            }
         }

         while(true) {
            if(this.field_3000 - this.field_3002 >= 180.0F) {
               this.field_3002 += 360.0F;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            }

            this.field_3001 = this.field_3003 + (this.field_3001 - this.field_3003) * 0.2F;
            this.field_3000 = this.field_3002 + (this.field_3000 - this.field_3002) * 0.2F;
            break;
         }
      }

      float var18 = this.method_4066();
      var21 = this;
      if(var1 != null) {
         label106: {
            if(this.method_3876()) {
               int var19 = 0;

               while(var19 < 4) {
                  float var20 = 0.25F;
                  String[] var16 = field_3175;
                  this.field_2990.method_2087("bubble", this.field_2994 - this.field_2997 * (double)var20, this.field_2995 - this.field_2998 * (double)var20, this.field_2996 - this.field_2999 * (double)var20, this.field_2997, this.field_2998, this.field_2999);
                  ++var19;
                  if(var1 == null) {
                     break label106;
                  }

                  if(var1 == null) {
                     break;
                  }
               }

               var18 = 0.8F;
            }

            this.field_2997 += this.field_3171;
            this.field_2998 += this.field_3172;
            this.field_2999 += this.field_3173;
            this.field_2997 *= (double)var18;
            this.field_2998 *= (double)var18;
            this.field_2999 *= (double)var18;
            String[] var10001 = field_3175;
            this.field_2990.method_2087("smoke", this.field_2994, this.field_2995 + 0.5D, this.field_2996, 0.0D, 0.0D, 0.0D);
         }

         var21 = this;
      }

      var21.method_3854(this.field_2994, this.field_2995, this.field_2996);
   }

   // $FF: renamed from: a () float
   protected float method_4066() {
      return 0.95F;
   }

   // $FF: renamed from: b (azu) void
   protected abstract void method_4067(azu var1);

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var3 = field_3175;
      var1.method_8666("xTile", (short)this.field_3163);
      String[] var2 = var10000;
      var1.method_8666("yTile", (short)this.field_3164);
      var1.method_8666("zTile", (short)this.field_3165);
      var1.method_8665("inTile", (byte)aji.method_2415(this.field_3166));
      int var10002 = this.field_3167;
      if(var2 != null) {
         var10002 = this.field_3167?1:0;
      }

      var1.method_8665("inGround", (byte)var10002);
      String[] var10001 = field_3175;
      var1.method_8664("direction", this.method_3911(new double[]{this.field_2997, this.field_2998, this.field_2999}));
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var4 = field_3175;
      this.field_3163 = var1.method_8680("xTile");
      this.field_3164 = var1.method_8680("yTile");
      this.field_3165 = var1.method_8680("zTile");
      this.field_3166 = aji.method_2416(var1.initGui9("inTile") & 255);
      String[] var2 = var10000;
      int var10001 = var1.initGui9("inGround");
      if(var2 != null) {
         var10001 = var10001 == 1?1:0;
      }

      label23: {
         this.field_3167 = (boolean)var10001;
         class_1583 var5 = var1;
         var4 = field_3175;
         String var6 = "direction";
         byte var10002 = 9;
         if(var2 != null) {
            if(!var1.initGui8("direction", 9)) {
               break label23;
            }

            var5 = var1;
            var6 = "direction";
            var10002 = 6;
         }

         class_1580 var3 = var5.method_8689(var6, var10002);
         this.field_2997 = var3.method_8655(0);
         this.field_2998 = var3.method_8655(1);
         this.field_2999 = var3.method_8655(2);
         if(var2 != null) {
            return;
         }
      }

      this.method_3851();
   }

   // $FF: renamed from: R () boolean
   public boolean method_3897() {
      return true;
   }

   // $FF: renamed from: af () float
   public float method_3927() {
      return 1.0F;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      Object var10000 = this;
      if(var3 != null) {
         if(this.method_3961()) {
            return false;
         }

         this.method_3895();
         var10000 = var1.method_9345();
      }

      if(var3 != null) {
         if(var10000 == null) {
            return false;
         }

         var10000 = var1.method_9345();
      }

      label34: {
         azw var4 = ((class_689)var10000).method_3928();
         if(var3 != null) {
            if(var4 == null) {
               break label34;
            }

            this.field_2997 = var4.field_4220;
            this.field_2998 = var4.field_4221;
            this.field_2999 = var4.field_4222;
            this.field_3171 = this.field_2997 * 0.1D;
            this.field_3172 = this.field_2998 * 0.1D;
         }

         this.field_3173 = this.field_2999 * 0.1D;
      }

      boolean var5 = var1.method_9345() instanceof class_752;
      if(var3 != null) {
         if(var5) {
            this.field_3168 = (class_752)var1.method_9345();
         }

         var5 = true;
      }

      return var5;
   }

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: d (float) float
   public float method_3884(float var1) {
      return 1.0F;
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      return 15728880;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4068() {
      // $FF: Couldn't be decompiled
   }
}
