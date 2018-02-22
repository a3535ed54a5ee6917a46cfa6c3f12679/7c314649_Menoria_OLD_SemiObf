
// $FF: renamed from: xw
public class class_694 extends class_690 {

   // $FF: renamed from: aG int
   private int field_3076;
   // $FF: renamed from: aH double
   public double field_3077;
   // $FF: renamed from: aI double
   public double field_3078;
   // $FF: renamed from: aJ java.lang.String
   private static final String field_3079;
   // $FF: renamed from: eb java.lang.String[]
   private static final String[] field_3080;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
   }

   // $FF: renamed from: <init> (ahb, double, double, double) void
   public void method_3980(ahb var1, double var2, double var4, double var6) {
      super.method_3980(var1, var2, var4, var6);
   }

   // $FF: renamed from: s () int
   public int method_3994() {
      return 2;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, new Byte((byte)0));
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      int var10000;
      String[] var1;
      class_694 var2;
      label51: {
         super.method_3856();
         var1 = class_752.method_4253();
         var10000 = this.field_3076;
         if(var1 != null) {
            if(this.field_3076 > 0) {
               --this.field_3076;
            }

            var2 = this;
            if(var1 == null) {
               break label51;
            }

            var10000 = this.field_3076;
         }

         if(var10000 <= 0) {
            this.field_3077 = this.field_3078 = 0.0D;
         }

         var2 = this;
      }

      int var10001 = this.field_3076;
      if(var1 != null) {
         var10001 = this.field_3076 > 0?1:0;
      }

      label53: {
         var2.method_4016((boolean)var10001);
         var10000 = this.method_4015();
         if(var1 != null) {
            if(var10000 == 0) {
               return;
            }

            var2 = this;
            if(var1 == null) {
               break label53;
            }

            var10000 = this.field_3028.nextInt(4);
         }

         if(var10000 != 0) {
            return;
         }

         var2 = this;
      }

      String[] var3 = field_3080;
      var2.field_2990.method_2087("largesmoke", this.field_2994, this.field_2995 + 0.8D, this.field_2996, 0.0D, 0.0D, 0.0D);
   }

   // $FF: renamed from: b (vX) void
   public void method_3981(class_1691 var1) {
      String[] var2 = class_752.method_4253();
      class_694 var10000 = this;
      if(var2 != null) {
         super.method_3981(var1);
         if(var1.method_9337()) {
            return;
         }

         var10000 = this;
      }

      add var10001 = new add;
      var10001.method_3722(class_1192.field_6088, 1);
      var10000.method_3916(var10001, 0.0F);
   }

   // $FF: renamed from: b (int, int, int, double, double, aji, int) void
   protected void method_3984(int var1, int var2, int var3, double var4, double var6, aji var8, int var9) {
      String[] var10000 = class_752.method_4253();
      super.method_3984(var1, var2, var3, var4, var6, var8, var9);
      String[] var10 = var10000;
      double var11 = this.field_3077 * this.field_3077 + this.field_3078 * this.field_3078;
      double var15;
      int var13 = (var15 = var11 - 1.0E-4D) == 0.0D?0:(var15 < 0.0D?-1:1);
      if(var10 != null) {
         if(var13 <= 0) {
            return;
         }

         double var16;
         var13 = (var16 = this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999 - 0.001D) == 0.0D?0:(var16 < 0.0D?-1:1);
      }

      class_694 var14;
      label35: {
         if(var10 != null) {
            if(var13 <= 0) {
               return;
            }

            var11 = (double)class_1715.method_9558(var11);
            this.field_3077 /= var11;
            this.field_3078 /= var11;
            var14 = this;
            if(var10 == null) {
               break label35;
            }

            double var17;
            var13 = (var17 = this.field_3077 * this.field_2997 + this.field_3078 * this.field_2999 - 0.0D) == 0.0D?0:(var17 < 0.0D?-1:1);
         }

         if(var13 < 0) {
            this.field_3077 = 0.0D;
            this.field_3078 = 0.0D;
            if(var10 != null) {
               return;
            }
         }

         this.field_3077 = this.field_2997;
         var14 = this;
      }

      var14.field_3078 = this.field_2999;
   }

   // $FF: renamed from: o () void
   protected void method_3985() {
      label15: {
         String[] var10000 = class_752.method_4253();
         double var2 = this.field_3077 * this.field_3077 + this.field_3078 * this.field_3078;
         String[] var1 = var10000;
         if(var1 != null) {
            if(var2 > 1.0E-4D) {
               var2 = (double)class_1715.method_9558(var2);
               this.field_3077 /= var2;
               this.field_3078 /= var2;
               double var4 = 0.05D;
               this.field_2997 *= 0.800000011920929D;
               this.field_2998 *= 0.0D;
               this.field_2999 *= 0.800000011920929D;
               this.field_2997 += this.field_3077 * var4;
               this.field_2999 += this.field_3078 * var4;
               if(var1 != null) {
                  break label15;
               }
            }

            this.field_2997 *= 0.9800000190734863D;
            this.field_2998 *= 0.0D;
         }

         this.field_2999 *= 0.9800000190734863D;
      }

      super.method_3985();
   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3919(class_792 var1) {
      String[] var10000 = class_752.method_4253();
      add var3 = var1.field_3616.method_3593();
      String[] var2 = var10000;
      if(var2 != null) {
         if(var3 != null && var3.method_3730() == class_1010.field_5121) {
            label20: {
               int var4 = var1.field_3640.field_2839;
               if(var2 != null) {
                  if(var1.field_3640.field_2839) {
                     break label20;
                  }

                  var4 = --var3.field_2958;
               }

               if(var4 == 0) {
                  var1.field_3616.method_87(var1.field_3616.field_2846, (add)null);
               }
            }

            this.field_3076 += 3600;
         }

         this.field_3077 = this.field_2994 - var1.field_2994;
         this.field_3078 = this.field_2996 - var1.field_2996;
      }

      return true;
   }

   // $FF: renamed from: b (ro) void
   protected void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var2 = field_3080;
      var1.initGui0("PushX", this.field_3077);
      var1.initGui0("PushZ", this.field_3078);
      var1.method_8666("Fuel", (short)this.field_3076);
   }

   // $FF: renamed from: a (ro) void
   protected void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var2 = field_3080;
      this.field_3077 = var1.method_8684("PushX");
      this.field_3078 = var1.method_8684("PushZ");
      this.field_3076 = var1.method_8680("Fuel");
   }

   // $FF: renamed from: a () boolean
   protected boolean method_4015() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(16) & 1;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (boolean) void
   protected void method_4016(boolean var1) {
      label16: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(!var1) {
               break label16;
            }

            this.field_3036.method_9506(16, Byte.valueOf((byte)(this.field_3036.method_9499(16) | 1)));
         }

         if(var2 != null) {
            return;
         }
      }

      this.field_3036.method_9506(16, Byte.valueOf((byte)(this.field_3036.method_9499(16) & -2)));
   }

   // $FF: renamed from: u () aji
   public aji method_3996() {
      return class_1192.field_6088;
   }

   // $FF: renamed from: w () int
   public int method_3998() {
      return 2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4009() {
      // $FF: Couldn't be decompiled
   }
}
