
// $FF: renamed from: wC
public class class_715 extends class_689 {

   // $FF: renamed from: at int
   public int field_3205;
   // $FF: renamed from: au int
   public int field_3206;
   // $FF: renamed from: av int
   public int field_3207;
   // $FF: renamed from: aw int
   private int field_3208;
   // $FF: renamed from: ax int
   private int field_3209;
   // $FF: renamed from: ay yz
   private class_792 field_3210;
   // $FF: renamed from: az int
   private int field_3211;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3212;


   // $FF: renamed from: <init> (ahb, double, double, double, int) void
   public void method_4087(ahb var1, double var2, double var4, double var6, int var8) {
      super.method_3847(var1);
      this.field_3208 = 5;
      this.method_3852(0.5F, 0.5F);
      this.field_3013 = this.field_3015 / 2.0F;
      this.method_3854(var2, var4, var6);
      this.field_3000 = (float)(Math.random() * 360.0D);
      this.field_2997 = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.field_2998 = (double)((float)(Math.random() * 0.2D) * 2.0F);
      this.field_2999 = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.field_3209 = var8;
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3208 = 5;
      this.method_3852(0.25F, 0.25F);
      this.field_3013 = this.field_3015 / 2.0F;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {}

   // $FF: renamed from: c (float) int
   public int method_3883(float var1) {
      String[] var10000 = class_752.method_4253();
      float var3 = 0.5F;
      String[] var2 = var10000;
      float var8;
      int var7 = (var8 = var3 - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
      if(var2 != null) {
         if(var7 < 0) {
            var3 = 0.0F;
         }

         float var9;
         var7 = (var9 = var3 - 1.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
      }

      if(var2 != null) {
         if(var7 > 0) {
            var3 = 1.0F;
         }

         var7 = super.method_3883(var1);
      }

      int var4 = var7;
      int var5 = var4 & 255;
      int var6 = var4 >> 16 & 255;
      var5 += (int)(var3 * 15.0F * 16.0F);
      var7 = var5;
      int var10001 = 240;
      if(var2 != null) {
         if(var5 > 240) {
            var5 = 240;
         }

         var7 = var5;
         var10001 = var6 << 16;
      }

      return var7 | var10001;
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      super.method_3856();
      String[] var1 = var10000;
      class_715 var16 = this;
      if(var1 != null) {
         if(this.field_3207 > 0) {
            --this.field_3207;
         }

         this.field_2991 = this.field_2994;
         this.field_2992 = this.field_2995;
         this.field_2993 = this.field_2996;
         this.field_2998 -= 0.029999999329447746D;
         var16 = this;
      }

      if(var1 != null) {
         if(var16.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996)).method_2424() == awt.field_4178) {
            this.field_2998 = 0.20000000298023224D;
            this.field_2997 = (double)((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F);
            this.field_2999 = (double)((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F);
            String[] var10001 = field_3212;
            this.method_3868("random.fizz", 0.4F, 2.0F + this.field_3028.nextFloat() * 0.4F);
         }

         var16 = this;
      }

      var16.method_3953(this.field_2994, (this.field_3004.field_6910 + this.field_3004.field_6913) / 2.0D, this.field_2996);
      double var2 = 8.0D;
      var16 = this;
      if(var1 != null) {
         if(this.field_3211 < this.field_3205 - 20 + this.method_3845() % 100) {
            label82: {
               label81: {
                  var16 = this;
                  if(var1 != null) {
                     if(this.field_3210 != null) {
                        var16 = this;
                        if(var1 == null) {
                           break label82;
                        }

                        if(this.field_3210.method_3891(this) <= var2 * var2) {
                           break label81;
                        }
                     }

                     var16 = this;
                  }

                  var16.field_3210 = this.field_2990.method_2174(this, var2);
               }

               var16 = this;
            }

            var16.field_3211 = this.field_3205;
         }

         var16 = this;
      }

      label71: {
         if(var1 != null) {
            if(var16.field_3210 != null) {
               double var4 = (this.field_3210.field_2994 - this.field_2994) / var2;
               double var6 = (this.field_3210.field_2995 + (double)this.field_3210.method_3880() - this.field_2995) / var2;
               double var8 = (this.field_3210.field_2996 - this.field_2996) / var2;
               double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
               double var12 = 1.0D - var10;
               if(var1 == null) {
                  break label71;
               }

               if(var12 > 0.0D) {
                  var12 *= var12;
                  this.field_2997 += var4 / var10 * var12 * 0.1D;
                  this.field_2998 += var6 / var10 * var12 * 0.1D;
                  this.field_2999 += var8 / var10 * var12 * 0.1D;
               }
            }

            var16 = this;
         }

         var16.method_3864(this.field_2997, this.field_2998, this.field_2999);
      }

      float var15 = 0.98F;
      int var14 = this.field_3005;
      if(var1 != null) {
         if(this.field_3005) {
            var15 = this.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_3004.field_6910) - 1, class_1715.method_9561(this.field_2996)).field_2008 * 0.98F;
         }

         this.field_2997 *= (double)var15;
         this.field_2998 *= 0.9800000190734863D;
         this.field_2999 *= (double)var15;
         var14 = this.field_3005;
      }

      label92: {
         if(var1 != null) {
            if(var14 != 0) {
               this.field_2998 *= -0.8999999761581421D;
            }

            ++this.field_3205;
            ++this.field_3206;
            var16 = this;
            if(var1 == null) {
               break label92;
            }

            var14 = this.field_3206;
         }

         if(var14 < 6000) {
            return;
         }

         var16 = this;
      }

      var16.method_3851();
   }

   // $FF: renamed from: N () boolean
   public boolean method_3877() {
      return this.field_2990.method_2122(this.field_3004, awt.field_4177, this);
   }

   // $FF: renamed from: f (int) void
   protected void method_3872(int var1) {
      this.method_3896(class_1691.field_8830, (float)var1);
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000 != 0) {
            return false;
         }

         this.method_3895();
         this.field_3208 = (int)((float)this.field_3208 - var2);
         var10000 = this.field_3208;
      }

      if(var3 != null) {
         if(var10000 <= 0) {
            this.method_3851();
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var2 = field_3212;
      var1.method_8666("Health", (short)((byte)this.field_3208));
      var1.method_8666("Age", (short)this.field_3206);
      var1.method_8666("Value", (short)this.field_3209);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var2 = field_3212;
      this.field_3208 = var1.method_8680("Health") & 255;
      this.field_3206 = var1.method_8680("Age");
      this.field_3209 = var1.method_8680("Value");
   }

   // $FF: renamed from: b_ (yz) void
   public void method_3892(class_792 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_2990.field_1832;
      if(var2 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this.field_3207;
      }

      class_792 var3;
      label33: {
         if(var2 != null) {
            if(var10000 != 0) {
               return;
            }

            var3 = var1;
            if(var2 == null) {
               break label33;
            }

            var10000 = var1.field_3624;
         }

         if(var10000 != 0) {
            return;
         }

         var1.field_3624 = 2;
         String[] var10002 = field_3212;
         this.field_2990.method_2082(var1, "random.orb", 0.1F, 0.5F * ((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.7F + 1.8F));
         var1.method_4238(this, 1);
         var3 = var1;
      }

      var3.method_4619(this.field_3209);
      this.method_3851();
   }

   // $FF: renamed from: a () int
   public int method_4088() {
      return this.field_3209;
   }

   // $FF: renamed from: b () int
   public int method_4089() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3209;
      short var10001 = 2477;
      if(var1 != null) {
         if(this.field_3209 >= 2477) {
            return 10;
         }

         var10000 = this.field_3209;
         var10001 = 1237;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 9;
         }

         var10000 = this.field_3209;
         var10001 = 617;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 8;
         }

         var10000 = this.field_3209;
         var10001 = 307;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 7;
         }

         var10000 = this.field_3209;
         var10001 = 149;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 6;
         }

         var10000 = this.field_3209;
         var10001 = 73;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 5;
         }

         var10000 = this.field_3209;
         var10001 = 37;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 4;
         }

         var10000 = this.field_3209;
         var10001 = 17;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 3;
         }

         var10000 = this.field_3209;
         var10001 = 7;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 2;
         }

         var10000 = this.field_3209;
         if(var1 == null) {
            return var10000;
         }

         var10001 = 3;
      }

      if(var10000 >= var10001) {
         return 1;
      } else {
         var10000 = 0;
         return var10000;
      }
   }

   // $FF: renamed from: c (int) int
   public static int method_4090(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0;
      short var10001 = 2477;
      if(var1 != null) {
         if(var0 >= 2477) {
            return 2477;
         }

         var10000 = var0;
         var10001 = 1237;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 1237;
         }

         var10000 = var0;
         var10001 = 617;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 617;
         }

         var10000 = var0;
         var10001 = 307;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 307;
         }

         var10000 = var0;
         var10001 = 149;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 149;
         }

         var10000 = var0;
         var10001 = 73;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 73;
         }

         var10000 = var0;
         var10001 = 37;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 37;
         }

         var10000 = var0;
         var10001 = 17;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 17;
         }

         var10000 = var0;
         var10001 = 7;
      }

      if(var1 != null) {
         if(var10000 >= var10001) {
            return 7;
         }

         var10000 = var0;
         if(var1 == null) {
            return var10000;
         }

         var10001 = 3;
      }

      if(var10000 >= var10001) {
         return 3;
      } else {
         var10000 = 1;
         return var10000;
      }
   }

   // $FF: renamed from: av () boolean
   public boolean method_3959() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4091() {
      // $FF: Couldn't be decompiled
   }
}
