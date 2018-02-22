import java.util.List;

// $FF: renamed from: xI
public abstract class class_797 extends class_689 implements class_12 {

   // $FF: renamed from: at int
   private int field_3721;
   // $FF: renamed from: au int
   private int field_3722;
   // $FF: renamed from: av int
   private int field_3723;
   // $FF: renamed from: aw aji
   private aji field_3724;
   // $FF: renamed from: ax boolean
   protected boolean field_3725;
   // $FF: renamed from: ay int
   public int field_3726;
   // $FF: renamed from: az sv
   private class_752 field_3727;
   // $FF: renamed from: aA java.lang.String
   private String field_3728;
   // $FF: renamed from: aB int
   private int field_3729;
   // $FF: renamed from: aC int
   private int field_3730;
   // $FF: renamed from: aD java.lang.String
   private static final String field_3731;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3732;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3721 = -1;
      this.field_3722 = -1;
      this.field_3723 = -1;
      this.method_3852(0.25F, 0.25F);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {}

   // $FF: renamed from: a (double) boolean
   public boolean method_3901(double var1) {
      double var4 = this.field_3004.method_7106() * 4.0D;
      String[] var10000 = class_752.method_4253();
      var4 *= 64.0D;
      String[] var3 = var10000;
      double var7;
      int var6 = (var7 = var1 - var4 * var4) == 0.0D?0:(var7 < 0.0D?-1:1);
      if(var3 != null) {
         var6 = var6 < 0?1:0;
      }

      return (boolean)var6;
   }

   // $FF: renamed from: <init> (ahb, sv) void
   public void method_4682(ahb var1, class_752 var2) {
      super.method_3847(var1);
      this.field_3721 = -1;
      this.field_3722 = -1;
      this.field_3723 = -1;
      this.field_3727 = var2;
      this.method_3852(0.25F, 0.25F);
      this.method_3887(var2.field_2994, var2.field_2995 + (double)var2.method_3880(), var2.field_2996, var2.field_3000, var2.field_3001);
      this.field_2994 -= (double)(class_1715.method_9556(this.field_3000 / 180.0F * 3.1415927F) * 0.16F);
      this.field_2995 -= 0.10000000149011612D;
      this.field_2996 -= (double)(class_1715.method_9555(this.field_3000 / 180.0F * 3.1415927F) * 0.16F);
      this.method_3854(this.field_2994, this.field_2995, this.field_2996);
      this.field_3013 = 0.0F;
      float var3 = 0.4F;
      this.field_2997 = (double)(-class_1715.method_9555(this.field_3000 / 180.0F * 3.1415927F) * class_1715.method_9556(this.field_3001 / 180.0F * 3.1415927F) * var3);
      this.field_2999 = (double)(class_1715.method_9556(this.field_3000 / 180.0F * 3.1415927F) * class_1715.method_9556(this.field_3001 / 180.0F * 3.1415927F) * var3);
      this.field_2998 = (double)(-class_1715.method_9555((this.field_3001 + this.method_4685()) / 180.0F * 3.1415927F) * var3);
      this.method_29(this.field_2997, this.field_2998, this.field_2999, this.method_4684(), 1.0F);
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4683(ahb var1, double var2, double var4, double var6) {
      super.method_3847(var1);
      this.field_3721 = -1;
      this.field_3722 = -1;
      this.field_3723 = -1;
      this.field_3729 = 0;
      this.method_3852(0.25F, 0.25F);
      this.method_3854(var2, var4, var6);
      this.field_3013 = 0.0F;
   }

   // $FF: renamed from: a () float
   protected float method_4684() {
      return 1.5F;
   }

   // $FF: renamed from: b () float
   protected float method_4685() {
      return 0.0F;
   }

   // $FF: renamed from: d (double, double, double, float, float) void
   public void method_29(double var1, double var3, double var5, float var7, float var8) {
      float var9 = class_1715.method_9558(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.field_3028.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.field_3028.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.field_3028.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.field_2997 = var1;
      this.field_2998 = var3;
      this.field_2999 = var5;
      float var10 = class_1715.method_9558(var1 * var1 + var5 * var5);
      this.field_3002 = this.field_3000 = (float)(Math.atan2(var1, var5) * 180.0D / 3.141592653589793D);
      this.field_3003 = this.field_3001 = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.141592653589793D);
      this.field_3729 = 0;
   }

   // $FF: renamed from: i (double, double, double) void
   public void method_3931(double var1, double var3, double var5) {
      float var10;
      label24: {
         String[] var10000 = class_752.method_4253();
         this.field_2997 = var1;
         String[] var7 = var10000;
         this.field_2998 = var3;
         this.field_2999 = var5;
         float var11;
         int var9 = (var11 = this.field_3003 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
         if(var7 != null) {
            if(var9 != 0) {
               return;
            }

            var10 = this.field_3002;
            if(var7 == null) {
               break label24;
            }

            float var12;
            var9 = (var12 = this.field_3002 - 0.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
         }

         if(var9 != 0) {
            return;
         }

         var10 = class_1715.method_9558(var1 * var1 + var5 * var5);
      }

      float var8 = var10;
      this.field_3002 = this.field_3000 = (float)(Math.atan2(var1, var5) * 180.0D / 3.141592653589793D);
      this.field_3003 = this.field_3001 = (float)(Math.atan2(var3, (double)var8) * 180.0D / 3.141592653589793D);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1;
      class_797 var22;
      label201: {
         label204: {
            this.field_3021 = this.field_2994;
            String[] var10000 = class_752.method_4253();
            this.field_3022 = this.field_2995;
            var1 = var10000;
            this.field_3023 = this.field_2996;
            super.method_3856();
            int var21 = this.field_3726;
            if(var1 != null) {
               if(this.field_3726 > 0) {
                  --this.field_3726;
               }

               var22 = this;
               if(var1 == null) {
                  break label204;
               }

               var21 = this.field_3725;
            }

            if(var21 != 0) {
               var22 = this;
               if(var1 != null) {
                  if(this.field_2990.getBlock(this.field_3721, this.field_3722, this.field_3723) == this.field_3724) {
                     ++this.field_3729;
                     var22 = this;
                     if(var1 != null) {
                        if(this.field_3729 != 1200) {
                           return;
                        }

                        var22 = this;
                     }

                     var22.method_3851();
                     return;
                  }

                  this.field_3725 = false;
                  this.field_2997 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_2998 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_2999 *= (double)(this.field_3028.nextFloat() * 0.2F);
                  this.field_3729 = 0;
                  var22 = this;
               }

               var22.field_3730 = 0;
               if(var1 != null) {
                  break label201;
               }
            }

            var22 = this;
         }

         ++var22.field_3730;
      }

      azw var2 = azw.method_5086(this.field_2994, this.field_2995, this.field_2996);
      azw var3 = azw.method_5086(this.field_2994 + this.field_2997, this.field_2995 + this.field_2998, this.field_2996 + this.field_2999);
      azu var4 = this.field_2990.method_2079(var2, var3);
      var2 = azw.method_5086(this.field_2994, this.field_2995, this.field_2996);
      var22 = this;
      if(var1 != null) {
         var3 = azw.method_5086(this.field_2994 + this.field_2997, this.field_2995 + this.field_2998, this.field_2996 + this.field_2999);
         if(var4 != null) {
            var3 = azw.method_5086(var4.field_4217.field_4220, var4.field_4217.field_4221, var4.field_4217.field_4222);
         }

         var22 = this;
      }

      azu var25;
      if(!var22.field_2990.field_1832) {
         class_689 var5 = null;
         List var6 = this.field_2990.method_2155(this, this.field_3004.method_7096(this.field_2997, this.field_2998, this.field_2999).method_7097(1.0D, 1.0D, 1.0D));
         double var7 = 0.0D;
         class_752 var9 = this.method_4688();
         int var10 = 0;

         class_689 var23;
         while(true) {
            if(var10 < var6.size()) {
               class_689 var11 = (class_689)var6.get(var10);
               if(var1 != null) {
                  label207: {
                     var23 = var11;
                     if(var1 == null) {
                        break;
                     }

                     if(var11.method_3897() && (var11 != var9 || this.field_3730 >= 5)) {
                        float var12 = 0.3F;
                        class_1343 var13 = var11.field_3004.method_7097((double)var12, (double)var12, (double)var12);
                        azu var14 = var13.method_7109(var2, var3);
                        if(var1 == null) {
                           break label207;
                        }

                        if(var14 != null) {
                           label168: {
                              double var15 = var2.method_5094(var14.field_4217);
                              double var24 = var15;
                              if(var1 != null) {
                                 label166: {
                                    if(var15 >= var7) {
                                       var24 = var7;
                                       if(var1 == null) {
                                          break label166;
                                       }

                                       if(var7 != 0.0D) {
                                          break label168;
                                       }
                                    }

                                    var5 = var11;
                                    var24 = var15;
                                 }
                              }

                              var7 = var24;
                           }
                        }
                     }

                     ++var10;
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
            var25 = new azu;
            var25.method_5083(var5);
            var4 = var25;
         }
      }

      label209: {
         var25 = var4;
         if(var1 != null) {
            if(var4 == null) {
               break label209;
            }

            var25 = var4;
         }

         label149: {
            if(var25.field_4212 == class_100.field_85) {
               var22 = this;
               if(var1 == null) {
                  break label149;
               }

               if(this.field_2990.getBlock(var4.field_4213, var4.field_4214, var4.field_4215) == class_1192.field_6116) {
                  this.method_3929();
                  if(var1 != null) {
                     break label209;
                  }
               }
            }

            var22 = this;
         }

         var22.method_4687(var4);
      }

      this.field_2994 += this.field_2997;
      this.field_2995 += this.field_2998;
      this.field_2996 += this.field_2999;
      float var17 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
      this.field_3000 = (float)(Math.atan2(this.field_2997, this.field_2999) * 180.0D / 3.141592653589793D);
      this.field_3001 = (float)(Math.atan2(this.field_2998, (double)var17) * 180.0D / 3.141592653589793D);

      label139: {
         label138: {
            label137:
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
                     break label137;
                  }

                  this.field_3003 += 360.0F;
                  if(var1 == null) {
                     break label138;
                  }

                  if(var1 == null) {
                     break label137;
                  }
               }
            }

            while(this.field_3000 - this.field_3002 < -180.0F) {
               this.field_3002 -= 360.0F;
               if(var1 == null) {
                  break label139;
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

      float var18 = 0.99F;
      float var19 = this.method_4686();
      var22 = this;
      if(var1 != null) {
         if(this.method_3876()) {
            int var8 = 0;

            while(var8 < 4) {
               float var20 = 0.25F;
               String[] var10001 = field_3732;
               this.field_2990.method_2087("bubble", this.field_2994 - this.field_2997 * (double)var20, this.field_2995 - this.field_2998 * (double)var20, this.field_2996 - this.field_2999 * (double)var20, this.field_2997, this.field_2998, this.field_2999);
               ++var8;
               if(var1 == null) {
                  return;
               }

               if(var1 == null) {
                  break;
               }
            }

            var18 = 0.8F;
         }

         this.field_2997 *= (double)var18;
         this.field_2998 *= (double)var18;
         this.field_2999 *= (double)var18;
         this.field_2998 -= (double)var19;
         var22 = this;
      }

      var22.method_3854(this.field_2994, this.field_2995, this.field_2996);
   }

   // $FF: renamed from: d () float
   protected float method_4686() {
      return 0.03F;
   }

   // $FF: renamed from: b (azu) void
   protected abstract void method_4687(azu var1);

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var3 = field_3732;
      var1.method_8666("xTile", (short)this.field_3721);
      var1.method_8666("yTile", (short)this.field_3722);
      String[] var10000 = class_752.method_4253();
      var1.method_8666("zTile", (short)this.field_3723);
      var1.method_8665("inTile", (byte)aji.method_2415(this.field_3724));
      var1.method_8665("shake", (byte)this.field_3726);
      String[] var2 = var10000;
      int var10002 = this.field_3725;
      if(var2 != null) {
         var10002 = this.field_3725?1:0;
      }

      label58: {
         var1.method_8665("inGround", (byte)var10002);
         class_797 var4 = this;
         if(var2 != null) {
            label52: {
               if(this.field_3728 != null) {
                  var4 = this;
                  if(var2 == null) {
                     break label52;
                  }

                  if(this.field_3728.length() != 0) {
                     break label58;
                  }
               }

               var4 = this;
            }
         }

         label59: {
            class_752 var5 = var4.field_3727;
            if(var2 != null) {
               if(var5 == null) {
                  break label58;
               }

               var4 = this;
               if(var2 == null) {
                  break label59;
               }

               var5 = this.field_3727;
            }

            if(!(var5 instanceof class_792)) {
               break label58;
            }

            var4 = this;
         }

         var4.field_3728 = this.field_3727.method_64();
      }

      String var7;
      label33: {
         String[] var10001 = field_3732;
         class_797 var6 = this;
         if(var2 != null) {
            if(this.field_3728 == null) {
               var7 = "";
               break label33;
            }

            var6 = this;
         }

         var7 = var6.field_3728;
      }

      var1.initGui1("ownerName", var7);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var3 = field_3732;
      this.field_3721 = var1.method_8680("xTile");
      String[] var2 = var10000;
      this.field_3722 = var1.method_8680("yTile");
      this.field_3723 = var1.method_8680("zTile");
      this.field_3724 = aji.method_2416(var1.initGui9("inTile") & 255);
      this.field_3726 = var1.initGui9("shake") & 255;
      int var10001 = var1.initGui9("inGround");
      if(var2 != null) {
         var10001 = var10001 == 1?1:0;
      }

      class_797 var5;
      label33: {
         this.field_3725 = (boolean)var10001;
         String[] var10002 = field_3732;
         this.field_3728 = var1.method_8685("ownerName");
         String var4 = this.field_3728;
         if(var2 != null) {
            if(this.field_3728 == null) {
               return;
            }

            var5 = this;
            if(var2 == null) {
               break label33;
            }

            var4 = this.field_3728;
         }

         if(var4.length() != 0) {
            return;
         }

         var5 = this;
      }

      var5.field_3728 = null;
   }

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: e () sv
   public class_752 method_4688() {
      String[] var1 = class_752.method_4253();
      class_752 var10000 = this.field_3727;
      if(var1 != null) {
         class_797 var2;
         label22: {
            if(this.field_3727 == null) {
               var2 = this;
               if(var1 == null) {
                  break label22;
               }

               if(this.field_3728 != null) {
                  var2 = this;
                  if(var1 == null) {
                     break label22;
                  }

                  if(this.field_3728.length() > 0) {
                     this.field_3727 = this.field_2990.method_2178(this.field_3728);
                  }
               }
            }

            var2 = this;
         }

         var10000 = var2.field_3727;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4689() {
      // $FF: Couldn't be decompiled
   }
}
