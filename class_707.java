
// $FF: renamed from: xH
public class class_707 extends class_689 {

   // $FF: renamed from: at int
   private int field_3159;
   // $FF: renamed from: au int
   private int field_3160;
   // $FF: renamed from: av java.lang.String
   private static final String field_3161;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3162;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.25F, 0.25F);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      this.field_3036.method_9498(8, 5);
   }

   // $FF: renamed from: a (double) boolean
   public boolean method_3901(double var1) {
      String[] var3 = class_752.method_4253();
      double var4;
      int var10000 = (var4 = var1 - 4096.0D) == 0.0D?0:(var4 < 0.0D?-1:1);
      if(var3 != null) {
         var10000 = var10000 < 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <init> (ahb, double, double, double, add) void
   public void method_4062(ahb var1, double var2, double var4, double var6, add var8) {
      super.method_3847(var1);
      this.field_3159 = 0;
      String[] var10000 = class_752.method_4253();
      this.method_3852(0.25F, 0.25F);
      String[] var9 = var10000;
      this.method_3854(var2, var4, var6);
      this.field_3013 = 0.0F;
      int var10 = 1;
      if(var9 != null) {
         if(var8 != null) {
            label27: {
               add var14 = var8;
               if(var9 != null) {
                  if(!var8.method_3766()) {
                     break label27;
                  }

                  this.field_3036.method_9506(8, var8);
                  var14 = var8;
               }

               class_1583 var11 = var14.method_3767();
               String[] var13 = field_3162;
               class_1583 var12 = var11.method_8688("Fireworks");
               if(var9 == null) {
                  return;
               }

               if(var12 != null) {
                  var10 += var12.initGui9("Flight");
               }
            }
         }

         this.field_2997 = this.field_3028.nextGaussian() * 0.001D;
         this.field_2999 = this.field_3028.nextGaussian() * 0.001D;
         this.field_2998 = 0.05D;
         this.field_3160 = 10 * var10 + this.field_3028.nextInt(6) + this.field_3028.nextInt(7);
      }

   }

   // $FF: renamed from: i (double, double, double) void
   public void method_3931(double var1, double var3, double var5) {
      float var10;
      label24: {
         this.field_2997 = var1;
         String[] var10000 = class_752.method_4253();
         this.field_2998 = var3;
         String[] var7 = var10000;
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
      this.field_3021 = this.field_2994;
      this.field_3022 = this.field_2995;
      this.field_3023 = this.field_2996;
      String[] var10000 = class_752.method_4253();
      super.method_3856();
      this.field_2997 *= 1.15D;
      this.field_2999 *= 1.15D;
      String[] var1 = var10000;
      this.field_2998 += 0.04D;
      this.method_3864(this.field_2997, this.field_2998, this.field_2999);
      float var2 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
      this.field_3000 = (float)(Math.atan2(this.field_2997, this.field_2999) * 180.0D / 3.141592653589793D);
      this.field_3001 = (float)(Math.atan2(this.field_2998, (double)var2) * 180.0D / 3.141592653589793D);

      label91: {
         label90: {
            label89:
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
                     break label89;
                  }

                  this.field_3003 += 360.0F;
                  if(var1 == null) {
                     break label90;
                  }

                  if(var1 == null) {
                     break label89;
                  }
               }
            }

            while(this.field_3000 - this.field_3002 < -180.0F) {
               this.field_3002 -= 360.0F;
               if(var1 == null) {
                  break label91;
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

      int var4 = this.field_3159;
      if(var1 != null) {
         if(this.field_3159 == 0) {
            String[] var3 = field_3162;
            this.field_2990.method_2082(this, "fireworks.launch", 3.0F, 1.0F);
         }

         ++this.field_3159;
         var4 = this.field_2990.field_1832;
      }

      if(var1 != null) {
         label56: {
            if(var4 != 0) {
               var4 = this.field_3159 % 2;
               if(var1 == null) {
                  break label56;
               }

               if(var4 < 2) {
                  String[] var10001 = field_3162;
                  this.field_2990.method_2087("fireworksSpark", this.field_2994, this.field_2995 - 0.3D, this.field_2996, this.field_3028.nextGaussian() * 0.05D, -this.field_2998 * 0.5D, this.field_3028.nextGaussian() * 0.05D);
               }
            }

            var4 = this.field_2990.field_1832;
         }
      }

      class_707 var5;
      label97: {
         if(var1 != null) {
            if(var4 != 0) {
               return;
            }

            var5 = this;
            if(var1 == null) {
               break label97;
            }

            var4 = this.field_3159;
         }

         if(var4 <= this.field_3160) {
            return;
         }

         this.field_2990.method_2191(this, (byte)17);
         var5 = this;
      }

      var5.method_3851();
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         class_707 var10000;
         label35: {
            if(var1 == 17) {
               var10000 = this;
               if(var2 == null) {
                  break label35;
               }

               if(this.field_2990.field_1832) {
                  class_1583 var4;
                  label39: {
                     add var3 = this.field_3036.method_9504(8);
                     var4 = null;
                     add var5 = var3;
                     if(var2 != null) {
                        if(var3 == null) {
                           break label39;
                        }

                        var5 = var3;
                     }

                     if(var2 != null) {
                        if(!var5.method_3766()) {
                           break label39;
                        }

                        var5 = var3;
                     }

                     class_1583 var6 = var5.method_3767();
                     String[] var10001 = field_3162;
                     var4 = var6.method_8688("Fireworks");
                  }

                  this.field_2990.method_2219(this.field_2994, this.field_2995, this.field_2996, this.field_2997, this.field_2998, this.field_2999, var4);
               }
            }

            var10000 = this;
         }

         var10000.method_3932(var1);
      }

   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var4 = field_3162;
      var1.method_8667("Life", this.field_3159);
      var1.method_8667("LifeTime", this.field_3160);
      add var2 = this.field_3036.method_9504(8);
      if(var2 != null) {
         class_1583 var10000 = new class_1583;
         var10000.method_8628();
         class_1583 var3 = var10000;
         var2.method_3737(var3);
         var1.method_8664("FireworksItem", var3);
      }

   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var5 = field_3162;
      this.field_3159 = var1.method_8681("Life");
      String[] var2 = var10000;
      this.field_3160 = var1.method_8681("LifeTime");
      class_1583 var3 = var1.method_8688("FireworksItem");
      class_1583 var6 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return;
         }

         var6 = var3;
      }

      add var4 = add.method_3727(var6);
      if(var4 != null) {
         this.field_3036.method_9506(8, var4);
      }

   }

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: d (float) float
   public float method_3884(float var1) {
      return super.method_3884(var1);
   }

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      return super.method_3883(var1);
   }

   // $FF: renamed from: av () boolean
   public boolean method_3959() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4063() {
      // $FF: Couldn't be decompiled
   }
}
