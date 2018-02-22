import com.mojang.authlib.GameProfile;

// $FF: renamed from: xh
public class class_795 extends class_794 {

   // $FF: renamed from: a5 boolean
   private boolean field_3682;
   // $FF: renamed from: a6 int
   private int field_3683;
   // $FF: renamed from: a7 double
   private double field_3684;
   // $FF: renamed from: a8 double
   private double field_3685;
   // $FF: renamed from: a9 double
   private double field_3686;
   // $FF: renamed from: a_ double
   private double field_3687;
   // $FF: renamed from: bL double
   private double field_3688;


   // $FF: renamed from: <init> (ahb, com.mojang.authlib.GameProfile) void
   public void method_4554(ahb var1, GameProfile var2) {
      super.method_4554(var1, var2);
      this.field_3013 = 0.0F;
      this.field_3025 = 0.0F;
      this.field_3026 = true;
      this.field_3635 = 0.25F;
      this.field_2985 = 10.0D;
   }

   // $FF: renamed from: e_ () void
   protected void method_4582() {
      this.field_3013 = 0.0F;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      return true;
   }

   // $FF: renamed from: a (double, double, double, float, float, int) void
   public void method_3926(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_3684 = var1;
      this.field_3685 = var3;
      this.field_3686 = var5;
      this.field_3687 = (double)var7;
      this.field_3688 = (double)var8;
      this.field_3683 = var9;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      this.field_3635 = 0.0F;
      super.method_3856();
      this.field_3322 = this.field_3323;
      double var2 = this.field_2994 - this.field_2991;
      String[] var10000 = class_752.method_4253();
      double var4 = this.field_2996 - this.field_2993;
      float var6 = class_1715.method_9558(var2 * var2 + var4 * var4) * 4.0F;
      String[] var1 = var10000;
      float var10;
      int var8 = (var10 = var6 - 1.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
      if(var1 != null) {
         if(var8 > 0) {
            var6 = 1.0F;
         }

         this.field_3323 += (var6 - this.field_3323) * 0.4F;
         this.field_3324 += this.field_3323;
         var8 = this.field_3682;
      }

      class_795 var9;
      if(var1 != null) {
         label51: {
            label50: {
               if(var8 == 0) {
                  var8 = this.method_3945();
                  if(var1 == null) {
                     break label51;
                  }

                  if(var8 != 0) {
                     var9 = this;
                     if(var1 == null) {
                        break label50;
                     }

                     if(this.field_3616.field_2844[this.field_3616.field_2846] != null) {
                        add var7 = this.field_3616.field_2844[this.field_3616.field_2846];
                        this.method_4626(this.field_3616.field_2844[this.field_3616.field_2846], var7.method_3730().method_2958(var7));
                        this.field_3682 = true;
                        if(var1 != null) {
                           return;
                        }
                     }
                  }
               }

               var9 = this;
            }

            var8 = var9.field_3682;
         }
      }

      label58: {
         if(var1 != null) {
            if(var8 == 0) {
               return;
            }

            var9 = this;
            if(var1 == null) {
               break label58;
            }

            var8 = this.method_3945();
         }

         if(var8 != 0) {
            return;
         }

         this.method_4560();
         var9 = this;
      }

      var9.field_3682 = false;
   }

   // $FF: renamed from: Y () float
   public float method_3913() {
      return 0.0F;
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var10000 = class_752.method_4253();
      super.method_4236();
      String[] var1 = var10000;
      class_795 var11 = this;
      if(var1 != null) {
         if(this.field_3683 > 0) {
            double var2 = this.field_2994 + (this.field_3684 - this.field_2994) / (double)this.field_3683;
            double var4 = this.field_2995 + (this.field_3685 - this.field_2995) / (double)this.field_3683;
            double var6 = this.field_2996 + (this.field_3686 - this.field_2996) / (double)this.field_3683;
            double var8 = this.field_3687 - (double)this.field_3000;

            label78:
            while(true) {
               if(var8 < -180.0D) {
                  var8 += 360.0D;
                  if(var1 == null) {
                     break;
                  }

                  if(var1 != null) {
                     continue;
                  }
               }

               while(true) {
                  if(var8 >= 180.0D) {
                     var8 -= 360.0D;
                     if(var1 == null) {
                        break label78;
                     }

                     if(var1 != null) {
                        continue;
                     }
                  }

                  this.field_3000 = (float)((double)this.field_3000 + var8 / (double)this.field_3683);
                  this.field_3001 = (float)((double)this.field_3001 + (this.field_3688 - (double)this.field_3001) / (double)this.field_3683);
                  --this.field_3683;
                  this.method_3854(var2, var4, var6);
                  break label78;
               }
            }

            this.method_3853(this.field_3000, this.field_3001);
         }

         this.field_3622 = this.field_3623;
         var11 = this;
      }

      float var10 = class_1715.method_9558(var11.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
      float var3 = (float)Math.atan(-this.field_2998 * 0.20000000298023224D) * 15.0F;
      float var13;
      int var12 = (var13 = var10 - 0.1F) == 0.0F?0:(var13 < 0.0F?-1:1);
      if(var1 != null) {
         if(var12 > 0) {
            var10 = 0.1F;
         }

         var12 = this.field_3005;
      }

      label62: {
         label61: {
            label87: {
               if(var1 != null) {
                  if(var12 == 0) {
                     break label87;
                  }

                  float var14;
                  var12 = (var14 = this.method_406() - 0.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
               }

               if(var1 == null) {
                  break label62;
               }

               if(var12 > 0) {
                  break label61;
               }
            }

            var10 = 0.0F;
         }

         var12 = this.field_3005;
      }

      label49: {
         label48: {
            label47: {
               if(var1 != null) {
                  if(var12 != 0) {
                     break label47;
                  }

                  var11 = this;
                  if(var1 == null) {
                     break label49;
                  }

                  float var15;
                  var12 = (var15 = this.method_406() - 0.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
               }

               if(var12 > 0) {
                  break label48;
               }
            }

            var3 = 0.0F;
         }

         this.field_3623 += (var10 - this.field_3623) * 0.4F;
         var11 = this;
      }

      var11.field_3327 += (var3 - this.field_3327) * 0.8F;
   }

   // $FF: renamed from: c (int, add) void
   public void method_3935(int var1, add var2) {
      String[] var3 = class_752.method_4253();
      if(var1 == 0) {
         this.field_3616.field_2844[this.field_3616.field_2846] = var2;
         if(var3 != null) {
            return;
         }
      }

      this.field_3616.field_2845[var1 - 1] = var2;
   }

   // $FF: renamed from: g () float
   public float method_3880() {
      return 1.82F;
   }

   // $FF: renamed from: a (rV) void
   public void method_66(class_66 var1) {
      bao.method_5273().canLoseFocus4.method_707().method_675(var1);
   }

   // $FF: renamed from: a (int, java.lang.String) boolean
   public boolean method_67(int var1, String var2) {
      return false;
   }

   // $FF: renamed from: f_ () vF
   public class_1661 method_68() {
      class_1661 var10000 = new class_1661;
      var10000.method_9151(class_1715.method_9561(this.field_2994 + 0.5D), class_1715.method_9561(this.field_2995 + 0.5D), class_1715.method_9561(this.field_2996 + 0.5D));
      return var10000;
   }
}
