
// $FF: renamed from: xC
public class class_712 extends class_689 {

   // $FF: renamed from: at double
   private double field_3179;
   // $FF: renamed from: au double
   private double field_3180;
   // $FF: renamed from: av double
   private double field_3181;
   // $FF: renamed from: aw int
   private int field_3182;
   // $FF: renamed from: ax boolean
   private boolean field_3183;
   // $FF: renamed from: ay java.lang.String
   private static final String field_3184;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3185;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
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

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_4071(ahb var1, double var2, double var4, double var6) {
      super.method_3847(var1);
      this.field_3182 = 0;
      this.method_3852(0.25F, 0.25F);
      this.method_3854(var2, var4, var6);
      this.field_3013 = 0.0F;
   }

   // $FF: renamed from: b (double, int, double) void
   public void method_4072(double var1, int var3, double var4) {
      String[] var6;
      label23: {
         double var7 = var1 - this.field_2994;
         double var9 = var4 - this.field_2996;
         String[] var10000 = class_752.method_4253();
         float var11 = class_1715.method_9558(var7 * var7 + var9 * var9);
         var6 = var10000;
         if(var6 != null) {
            if(var11 > 12.0F) {
               this.field_3179 = this.field_2994 + var7 / (double)var11 * 12.0D;
               this.field_3181 = this.field_2996 + var9 / (double)var11 * 12.0D;
               this.field_3180 = this.field_2995 + 8.0D;
               if(var6 != null) {
                  break label23;
               }
            }

            this.field_3179 = var1;
            this.field_3180 = (double)var3;
         }

         this.field_3181 = var4;
      }

      this.field_3182 = 0;
      int var10001 = this.field_3028.nextInt(5);
      if(var6 != null) {
         var10001 = var10001 > 0?1:0;
      }

      this.field_3183 = (boolean)var10001;
   }

   // $FF: renamed from: i (double, double, double) void
   public void method_3931(double var1, double var3, double var5) {
      float var10;
      label24: {
         this.field_2997 = var1;
         String[] var10000 = class_752.method_4253();
         this.field_2998 = var3;
         this.field_2999 = var5;
         String[] var7 = var10000;
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
      String[] var10000 = class_752.method_4253();
      this.field_3022 = this.field_2995;
      String[] var1 = var10000;
      this.field_3023 = this.field_2996;
      super.method_3856();
      this.field_2994 += this.field_2997;
      this.field_2995 += this.field_2998;
      this.field_2996 += this.field_2999;
      float var2 = class_1715.method_9558(this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999);
      this.field_3000 = (float)(Math.atan2(this.field_2997, this.field_2999) * 180.0D / 3.141592653589793D);
      this.field_3001 = (float)(Math.atan2(this.field_2998, (double)var2) * 180.0D / 3.141592653589793D);

      label142: {
         label141: {
            label140:
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
                     break label140;
                  }

                  this.field_3003 += 360.0F;
                  if(var1 == null) {
                     break label141;
                  }

                  if(var1 == null) {
                     break label140;
                  }
               }
            }

            while(this.field_3000 - this.field_3002 < -180.0F) {
               this.field_3002 -= 360.0F;
               if(var1 == null) {
                  break label142;
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

      class_712 var13;
      int var14;
      label148: {
         var13 = this;
         if(var1 != null) {
            if(this.field_2990.field_1832) {
               break label148;
            }

            var13 = this;
         }

         label149: {
            double var3 = var13.field_3179 - this.field_2994;
            double var5 = this.field_3181 - this.field_2996;
            float var7 = (float)Math.sqrt(var3 * var3 + var5 * var5);
            float var8 = (float)Math.atan2(var5, var3);
            double var9 = (double)var2 + (double)(var7 - var2) * 0.0025D;
            float var17;
            var14 = (var17 = var7 - 1.0F) == 0.0F?0:(var17 < 0.0F?-1:1);
            if(var1 != null) {
               if(var14 < 0) {
                  var9 *= 0.8D;
                  this.field_2998 *= 0.8D;
               }

               this.field_2997 = Math.cos((double)var8) * var9;
               this.field_2999 = Math.sin((double)var8) * var9;
               var13 = this;
               if(var1 == null) {
                  break label149;
               }

               double var18;
               var14 = (var18 = this.field_2995 - this.field_3180) == 0.0D?0:(var18 < 0.0D?-1:1);
            }

            if(var14 < 0) {
               this.field_2998 += (1.0D - this.field_2998) * 0.014999999664723873D;
               if(var1 != null) {
                  break label148;
               }
            }

            var13 = this;
         }

         var13.field_2998 += (-1.0D - this.field_2998) * 0.014999999664723873D;
      }

      label92: {
         float var12 = 0.25F;
         var13 = this;
         if(var1 != null) {
            if(this.method_3876()) {
               int var4 = 0;

               while(var4 < 4) {
                  String[] var11 = field_3185;
                  this.field_2990.method_2087("bubble", this.field_2994 - this.field_2997 * (double)var12, this.field_2995 - this.field_2998 * (double)var12, this.field_2996 - this.field_2999 * (double)var12, this.field_2997, this.field_2998, this.field_2999);
                  ++var4;
                  if(var1 == null) {
                     break label92;
                  }

                  if(var1 == null) {
                     break;
                  }
               }

               if(var1 != null) {
                  break label92;
               }
            }

            var13 = this;
         }

         String[] var10001 = field_3185;
         var13.field_2990.method_2087("portal", this.field_2994 - this.field_2997 * (double)var12 + this.field_3028.nextDouble() * 0.6D - 0.3D, this.field_2995 - this.field_2998 * (double)var12 - 0.5D, this.field_2996 - this.field_2999 * (double)var12 + this.field_3028.nextDouble() * 0.6D - 0.3D, this.field_2997, this.field_2998, this.field_2999);
      }

      var14 = this.field_2990.field_1832;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         this.method_3854(this.field_2994, this.field_2995, this.field_2996);
         ++this.field_3182;
         var14 = this.field_3182;
      }

      if(var1 != null) {
         if(var14 <= 80) {
            return;
         }

         var14 = this.field_2990.field_1832;
      }

      label154: {
         if(var1 != null) {
            if(var14 != 0) {
               return;
            }

            this.method_3851();
            var13 = this;
            if(var1 == null) {
               break label154;
            }

            var14 = this.field_3183;
         }

         if(var14 != 0) {
            ahb var16 = this.field_2990;
            class_699 var15 = new class_699;
            ahb var10003 = this.field_2990;
            double var10004 = this.field_2994;
            double var10005 = this.field_2995;
            double var10006 = this.field_2996;
            add var10007 = new add;
            var10007.method_3724(class_1010.field_5237);
            var15.method_4025(var10003, var10004, var10005, var10006, var10007);
            var16.method_2089(var15);
            if(var1 != null) {
               return;
            }
         }

         var13 = this;
      }

      var13.field_2990.method_2210(2003, (int)Math.round(this.field_2994), (int)Math.round(this.field_2995), (int)Math.round(this.field_2996), 0);
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {}

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {}

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

   // $FF: renamed from: av () boolean
   public boolean method_3959() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4073() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "ÎDýgï}À5YZ®3Ü^íq\b";
      int var4 = "ÎDýgï}À5YZ®3Ü^íq\b".length();
      char var1 = 6;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_3185 = var5;
                  String[] var10 = field_3185;
                  field_3184 = "CL_00001716";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 158;
               break;
            case 1:
               var10009 = 3;
               break;
            case 2:
               var10009 = 173;
               break;
            case 3:
               var10009 = 55;
               break;
            case 4:
               var10009 = 91;
               break;
            case 5:
               var10009 = 88;
               break;
            default:
               var10009 = 146;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
