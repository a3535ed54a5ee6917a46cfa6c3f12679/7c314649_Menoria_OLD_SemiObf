
// $FF: renamed from: w0
public abstract class class_779 extends class_761 implements class_10 {

   // $FF: renamed from: bA java.lang.String
   private static final String field_3556;
   // $FF: renamed from: gb java.lang.String[]
   private static final String[] field_3557;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3367 = 5;
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var10000 = class_752.method_4253();
      this.method_4210();
      String[] var1 = var10000;
      float var2 = this.method_3884(1.0F);
      if(var1 != null) {
         if(var2 > 0.5F) {
            this.field_3338 += 2;
         }

         super.method_4231();
      }

   }

   // $FF: renamed from: h () void
   public void method_3856() {
      class_779 var2;
      label24: {
         super.method_3856();
         String[] var1 = class_752.method_4253();
         ahb var10000 = this.field_2990;
         if(var1 != null) {
            if(this.field_2990.field_1832) {
               return;
            }

            var2 = this;
            if(var1 == null) {
               break label24;
            }

            var10000 = this.field_2990;
         }

         if(var10000.field_1818 != class_918.field_4627) {
            return;
         }

         var2 = this;
      }

      var2.method_3851();
   }

   // $FF: renamed from: H () java.lang.String
   protected String method_3865() {
      String[] var10000 = field_3557;
      return "game.hostile.swim";
   }

   // $FF: renamed from: O () java.lang.String
   protected String method_3878() {
      String[] var10000 = field_3557;
      return "game.hostile.swim.splash";
   }

   // $FF: renamed from: bR () sa
   protected class_689 method_4332() {
      class_792 var1 = this.field_2990.method_2176(this, 16.0D);
      return var1 != null && this.method_4239(var1)?var1:null;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000) {
            return false;
         }

         var10000 = super.method_3896(var1, var2);
      }

      if(var3 != null) {
         if(var10000) {
            class_689 var4;
            class_689 var5;
            label47: {
               var4 = var1.method_9345();
               var5 = this.field_2987;
               class_689 var10001 = var4;
               if(var3 != null) {
                  if(this.field_2987 == var4) {
                     return true;
                  }

                  var5 = this.field_2988;
                  if(var3 == null) {
                     break label47;
                  }

                  var10001 = var4;
               }

               if(var5 == var10001) {
                  return true;
               }

               var5 = var4;
            }

            if(var5 != this) {
               this.field_3433 = var4;
            }

            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3557;
      return "game.hostile.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3557;
      return "game.hostile.die";
   }

   // $FF: renamed from: o (int) java.lang.String
   protected String method_4198(int var1) {
      String var10000;
      if(var1 > 4) {
         String[] var2 = field_3557;
         var10000 = "game.hostile.hurt.fall.big";
      } else {
         String[] var3 = field_3557;
         var10000 = "game.hostile.hurt.fall.small";
      }

      return var10000;
   }

   // $FF: renamed from: n (sa) boolean
   public boolean method_4228(class_689 var1) {
      float var3 = (float)this.method_4211(class_1840.field_9394).method_396();
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var2 = var10000;
      boolean var7 = var1 instanceof class_752;
      if(var2 != null) {
         if(var7) {
            var3 += class_980.method_5647(this, (class_752)var1);
            var4 += class_980.method_5651(this, (class_752)var1);
         }

         var7 = var1.method_3896(class_1691.method_9324(this), var3);
      }

      boolean var5 = var7;
      var7 = var5;
      if(var2 != null) {
         if(var5) {
            int var8 = var4;
            if(var2 != null) {
               if(var4 > 0) {
                  var1.method_3894((double)(-class_1715.method_9555(this.field_3000 * 3.1415927F / 180.0F) * (float)var4 * 0.5F), 0.1D, (double)(class_1715.method_9556(this.field_3000 * 3.1415927F / 180.0F) * (float)var4 * 0.5F));
                  this.field_2997 *= 0.6D;
                  this.field_2999 *= 0.6D;
               }

               var8 = class_980.method_5652(this);
            }

            label41: {
               class_689 var9;
               label51: {
                  int var6 = var8;
                  var8 = var6;
                  if(var2 != null) {
                     if(var6 > 0) {
                        var1.method_3860(var6 * 4);
                     }

                     var9 = var1;
                     if(var2 == null) {
                        break label51;
                     }

                     var8 = var1 instanceof class_752;
                  }

                  if(var8 == 0) {
                     break label41;
                  }

                  var9 = var1;
               }

               class_980.method_5649((class_752)var9, this);
            }

            class_980.method_5650(this, var1);
         }

         var7 = var5;
      }

      return var7;
   }

   // $FF: renamed from: a (sa, float) void
   protected void method_4330(class_689 var1, float var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_3319;
      if(var3 != null) {
         if(this.field_3319 > 0) {
            return;
         }

         float var4;
         var10000 = (var4 = var2 - 2.0F) == 0.0F?0:(var4 < 0.0F?-1:1);
      }

      if(var3 != null) {
         if(var10000 >= 0) {
            return;
         }

         double var5;
         var10000 = (var5 = var1.field_3004.field_6913 - this.field_3004.field_6910) == 0.0D?0:(var5 < 0.0D?-1:1);
      }

      if(var3 != null) {
         if(var10000 <= 0) {
            return;
         }

         double var6;
         var10000 = (var6 = var1.field_3004.field_6910 - this.field_3004.field_6913) == 0.0D?0:(var6 < 0.0D?-1:1);
      }

      if(var3 != null && var10000 < 0) {
         this.field_3319 = 20;
         this.method_4228(var1);
      }

   }

   // $FF: renamed from: b (int, int, int) float
   public float method_4331(int var1, int var2, int var3) {
      return 0.5F - this.field_2990.method_2077(var1, var2, var3);
   }

   // $FF: renamed from: a () boolean
   protected boolean method_4501() {
      String[] var10000 = class_752.method_4253();
      int var2 = class_1715.method_9561(this.field_2994);
      String[] var1 = var10000;
      int var3 = class_1715.method_9561(this.field_3004.field_6910);
      int var4 = class_1715.method_9561(this.field_2996);
      int var7 = this.field_2990.method_2074(class_95.field_53, var2, var3, var4);
      if(var1 != null) {
         if(var7 > this.field_3028.nextInt(32)) {
            return false;
         }

         var7 = this.field_2990.method_2069(var2, var3, var4);
      }

      int var5 = var7;
      var7 = this.field_2990.method_2202();
      if(var1 != null) {
         if(var7 != 0) {
            int var6 = this.field_2990.field_1810;
            this.field_2990.field_1810 = 10;
            var5 = this.field_2990.method_2069(var2, var3, var4);
            this.field_2990.field_1810 = var6;
         }

         var7 = var5;
      }

      if(var1 != null) {
         var7 = var7 <= this.field_3028.nextInt(8)?1:0;
      }

      return (boolean)var7;
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      boolean var2;
      label32: {
         String[] var1 = class_752.method_4253();
         class_779 var10000 = this;
         if(var1 != null) {
            if(this.field_2990.field_1818 == class_918.field_4627) {
               break label32;
            }

            var10000 = this;
         }

         var2 = var10000.method_4501();
         if(var1 != null) {
            if(!var2) {
               break label32;
            }

            var2 = super.method_4274();
         }

         if(var1 == null) {
            return var2;
         }

         if(var2) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4212().method_9617(class_1840.field_9394);
   }

   // $FF: renamed from: aG () boolean
   protected boolean method_4161() {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
