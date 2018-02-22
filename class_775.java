
// $FF: renamed from: wO
public class class_775 extends class_769 {

   // $FF: renamed from: bG float
   public float field_3534;
   // $FF: renamed from: bH float
   public float field_3535;
   // $FF: renamed from: bI float
   public float field_3536;
   // $FF: renamed from: bJ float
   public float field_3537;
   // $FF: renamed from: bK float
   public float field_3538;
   // $FF: renamed from: bL int
   public int field_3539;
   // $FF: renamed from: bM boolean
   public boolean field_3540;
   // $FF: renamed from: bN java.lang.String
   private static final String field_3541;
   // $FF: renamed from: ib java.lang.String[]
   private static final String[] field_3542;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3538 = 1.0F;
      this.method_3852(0.3F, 0.7F);
      this.field_3539 = this.field_3028.nextInt(6000) + 6000;
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(0, var10002);
      var10000 = this.field_3373;
      class_1756 var2 = new class_1756;
      var2.method_9710(this, 1.4D);
      var10000.method_9766(1, var2);
      var10000 = this.field_3373;
      class_1741 var3 = new class_1741;
      var3.method_9681(this, 1.0D);
      var10000.method_9766(2, var3);
      var10000 = this.field_3373;
      class_1745 var4 = new class_1745;
      var4.method_9691(this, 1.0D, class_1010.field_5153, false);
      var10000.method_9766(3, var4);
      var10000 = this.field_3373;
      class_1732 var5 = new class_1732;
      var5.method_9662(this, 1.1D);
      var10000.method_9766(4, var5);
      var10000 = this.field_3373;
      class_1753 var6 = new class_1753;
      var6.method_9705(this, 1.0D);
      var10000.method_9766(5, var6);
      var10000 = this.field_3373;
      class_1728 var7 = new class_1728;
      var7.method_9657(this, class_792.class, 6.0F);
      var10000.method_9766(6, var7);
      var10000 = this.field_3373;
      class_1754 var8 = new class_1754;
      var8.method_9706(this);
      var10000.method_9766(7, var8);
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(4.0D);
      this.method_4211(class_1840.field_9393).method_390(0.25D);
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      super.method_4231();
      String[] var1 = class_752.method_4253();
      this.field_3537 = this.field_3534;
      this.field_3536 = this.field_3535;
      double var10001 = (double)this.field_3535;
      int var10002 = this.field_3005;
      if(var1 != null) {
         var10002 = this.field_3005?-1:4;
      }

      this.field_3535 = (float)(var10001 + (double)var10002 * 0.3D);
      float var5;
      int var10000 = (var5 = this.field_3535 - 0.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
      if(var1 != null) {
         if(var10000 < 0) {
            this.field_3535 = 0.0F;
         }

         float var6;
         var10000 = (var6 = this.field_3535 - 1.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var10000 > 0) {
            this.field_3535 = 1.0F;
         }

         var10000 = this.field_3005;
      }

      if(var1 != null) {
         label85: {
            if(var10000 == 0) {
               float var7;
               var10000 = (var7 = this.field_3538 - 1.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
               if(var1 == null) {
                  break label85;
               }

               if(var10000 < 0) {
                  this.field_3538 = 1.0F;
               }
            }

            this.field_3538 = (float)((double)this.field_3538 * 0.9D);
            var10000 = this.field_3005;
         }
      }

      if(var1 != null) {
         label78: {
            if(var10000 == 0) {
               double var8;
               var10000 = (var8 = this.field_2998 - 0.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
               if(var1 == null) {
                  break label78;
               }

               if(var10000 < 0) {
                  this.field_2998 *= 0.6D;
               }
            }

            this.field_3534 += this.field_3538 * 2.0F;
            var10000 = this.field_2990.field_1832;
         }
      }

      if(var1 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = this.method_4159();
      }

      if(var1 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = this.method_4473();
      }

      class_775 var2;
      int var3;
      label94: {
         if(var1 != null) {
            if(var10000 != 0) {
               return;
            }

            var2 = this;
            var3 = this.field_3539 - 1;
            if(var1 == null) {
               break label94;
            }

            var10000 = this.field_3539 = var3;
         }

         if(var10000 > 0) {
            return;
         }

         String[] var4 = field_3542;
         this.method_3868("mob.chicken.plop", 1.0F, (this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F);
         this.method_3914(class_1010.field_5201, 1);
         var2 = this;
         var3 = this.field_3028.nextInt(6000) + 6000;
      }

      var2.field_3539 = var3;
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {}

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3542;
      return "mob.chicken.say";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3542;
      return "mob.chicken.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3542;
      return "mob.chicken.hurt";
   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      String[] var10001 = field_3542;
      this.method_3868("mob.chicken.step", 0.15F, 1.0F);
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5146;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = this.field_3028.nextInt(3) + this.field_3028.nextInt(1 + var2);
      String[] var3 = var10000;
      int var5 = 0;

      class_775 var6;
      label27: {
         while(true) {
            if(var5 < var4) {
               this.method_3914(class_1010.field_5146, 1);
               ++var5;
               if(var3 == null) {
                  break;
               }

               if(var3 != null) {
                  continue;
               }
            }

            var6 = this;
            if(var3 == null) {
               break label27;
            }

            if(this.method_3936()) {
               this.method_3914(class_1010.field_5223, 1);
               if(var3 != null) {
                  return;
               }
            }
            break;
         }

         var6 = this;
      }

      var6.method_3914(class_1010.field_5222, 1);
   }

   // $FF: renamed from: a (wJ) wO
   public class_775 method_4472(class_767 var1) {
      class_775 var10000 = new class_775;
      var10000.method_3847(this.field_2990);
      return var10000;
   }

   // $FF: renamed from: d (add) boolean
   public boolean method_4378(add var1) {
      boolean var3;
      label24: {
         String[] var2 = class_752.method_4253();
         add var10000 = var1;
         if(var2 != null) {
            if(var1 == null) {
               break label24;
            }

            var10000 = var1;
         }

         var3 = var10000.method_3730() instanceof class_518;
         if(var2 == null) {
            return var3;
         }

         if(var3) {
            var3 = true;
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var10002 = field_3542;
      this.field_3540 = var1.method_8690("IsChickenJockey");
   }

   // $FF: renamed from: e (yz) int
   protected int method_4163(class_792 var1) {
      String[] var2 = class_752.method_4253();
      class_775 var10000 = this;
      int var3;
      if(var2 != null) {
         if(this.method_4473()) {
            var3 = 10;
            return var3;
         }

         var10000 = this;
      }

      var3 = var10000.method_4163(var1);
      return var3;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3542;
      var1.initGui4("IsChickenJockey", this.field_3540);
   }

   // $FF: renamed from: v () boolean
   protected boolean method_4269() {
      boolean var2;
      label17: {
         String[] var1 = class_752.method_4253();
         Object var10000 = this;
         if(var1 != null) {
            if(!this.method_4473()) {
               break label17;
            }

            var10000 = this.field_2987;
         }

         if(var10000 == null) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: ac () void
   public void method_3922() {
      super.method_3922();
      float var2 = class_1715.method_9555(this.field_3330 * 3.1415927F / 180.0F);
      String[] var10000 = class_752.method_4253();
      float var3 = class_1715.method_9556(this.field_3330 * 3.1415927F / 180.0F);
      float var4 = 0.1F;
      String[] var1 = var10000;
      float var5 = 0.0F;
      this.field_2987.method_3854(this.field_2994 + (double)(var4 * var2), this.field_2995 + (double)(this.field_3015 * 0.5F) + this.field_2987.method_3923() + (double)var5, this.field_2996 - (double)(var4 * var3));
      class_689 var6 = this.field_2987;
      if(var1 != null) {
         if(!(this.field_2987 instanceof class_752)) {
            return;
         }

         var6 = this.field_2987;
      }

      ((class_752)var6).field_3330 = this.field_3330;
   }

   // $FF: renamed from: a () boolean
   public boolean method_4473() {
      return this.field_3540;
   }

   // $FF: renamed from: a (boolean) void
   public void method_4474(boolean var1) {
      this.field_3540 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4384() {
      // $FF: Couldn't be decompiled
   }
}
