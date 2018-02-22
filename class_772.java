import java.util.Iterator;
import java.util.List;

// $FF: renamed from: wR
public class class_772 extends class_769 implements class_72 {

   // $FF: renamed from: bG xT
   private static final class_82 field_3499;
   // $FF: renamed from: bH x3
   private static final class_79 field_3500;
   // $FF: renamed from: bI java.lang.String[]
   private static final String[] field_3501;
   // $FF: renamed from: bJ java.lang.String[]
   private static final String[] field_3502;
   // $FF: renamed from: bK int[]
   private static final int[] field_3503;
   // $FF: renamed from: bL java.lang.String[]
   private static final String[] field_3504;
   // $FF: renamed from: bM java.lang.String[]
   private static final String[] field_3505;
   // $FF: renamed from: bN java.lang.String[]
   private static final String[] field_3506;
   // $FF: renamed from: bO java.lang.String[]
   private static final String[] field_3507;
   // $FF: renamed from: bP int
   private int field_3508;
   // $FF: renamed from: bQ int
   private int field_3509;
   // $FF: renamed from: bR int
   private int field_3510;
   // $FF: renamed from: bS int
   public int field_3511;
   // $FF: renamed from: bT int
   public int field_3512;
   // $FF: renamed from: bU boolean
   protected boolean field_3513;
   // $FF: renamed from: bV vQ
   private class_1676 field_3514;
   // $FF: renamed from: bW boolean
   private boolean field_3515;
   // $FF: renamed from: bX int
   protected int field_3516;
   // $FF: renamed from: bY float
   protected float field_3517;
   // $FF: renamed from: b0 boolean
   private boolean field_3518;
   // $FF: renamed from: b1 float
   private float field_3519;
   // $FF: renamed from: b2 float
   private float field_3520;
   // $FF: renamed from: b3 float
   private float field_3521;
   // $FF: renamed from: b4 float
   private float field_3522;
   // $FF: renamed from: b5 float
   private float field_3523;
   // $FF: renamed from: b6 float
   private float field_3524;
   // $FF: renamed from: b7 int
   private int field_3525;
   // $FF: renamed from: b8 java.lang.String
   private String field_3526;
   // $FF: renamed from: b9 java.lang.String[]
   private String[] field_3527;
   // $FF: renamed from: b_ java.lang.String
   private static final String field_3528;
   // $FF: renamed from: ib java.lang.String[]
   private static final String[] field_3529;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3527 = new String[3];
      this.method_3852(1.4F, 1.6F);
      this.field_3035 = false;
      this.method_4423(false);
      this.method_4257().method_9784(true);
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(0, var10002);
      var10000 = this.field_3373;
      class_1756 var2 = new class_1756;
      var2.method_9710(this, 1.2D);
      var10000.method_9766(1, var2);
      var10000 = this.field_3373;
      class_1749 var3 = new class_1749;
      var3.method_9698(this, 1.2D);
      var10000.method_9766(1, var3);
      var10000 = this.field_3373;
      class_1741 var4 = new class_1741;
      var4.method_9681(this, 1.0D);
      var10000.method_9766(2, var4);
      var10000 = this.field_3373;
      class_1732 var5 = new class_1732;
      var5.method_9662(this, 1.0D);
      var10000.method_9766(4, var5);
      var10000 = this.field_3373;
      class_1753 var6 = new class_1753;
      var6.method_9705(this, 0.7D);
      var10000.method_9766(6, var6);
      var10000 = this.field_3373;
      class_1728 var7 = new class_1728;
      var7.method_9657(this, class_792.class, 6.0F);
      var10000.method_9766(7, var7);
      var10000 = this.field_3373;
      class_1754 var8 = new class_1754;
      var8.method_9706(this);
      var10000.method_9766(8, var8);
      this.method_4433();
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, Integer.valueOf(0));
      this.field_3036.method_9497(19, Byte.valueOf((byte)0));
      this.field_3036.method_9497(20, Integer.valueOf(0));
      this.field_3036.method_9497(21, String.valueOf(""));
      this.field_3036.method_9497(22, Integer.valueOf(0));
   }

   // $FF: renamed from: a (int) void
   public void method_4399(int var1) {
      this.field_3036.method_9506(19, Byte.valueOf((byte)var1));
      this.method_4441();
   }

   // $FF: renamed from: a () int
   public int method_4400() {
      return this.field_3036.method_9499(19);
   }

   // $FF: renamed from: u (int) void
   public void method_4401(int var1) {
      this.field_3036.method_9506(20, Integer.valueOf(var1));
      this.method_4441();
   }

   // $FF: renamed from: b () int
   public int method_4402() {
      return this.field_3036.method_9501(20);
   }

   // $FF: renamed from: b_ () java.lang.String
   public String method_4284() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4288();
      if(var1 != null) {
         if(var10000 != 0) {
            return this.method_4287();
         }

         var10000 = this.method_4400();
      }

      int var2 = var10000;
      String[] var3;
      switch(var2) {
      case 0:
      default:
         var3 = field_3529;
         return class_1563.method_8581("entity.horse.name");
      case 1:
         var3 = field_3529;
         return class_1563.method_8581("entity.donkey.name");
      case 2:
         var3 = field_3529;
         return class_1563.method_8581("entity.mule.name");
      case 3:
         var3 = field_3529;
         return class_1563.method_8581("entity.zombiehorse.name");
      case 4:
         String[] var4 = field_3529;
         return class_1563.method_8581("entity.skeletonhorse.name");
      }
   }

   // $FF: renamed from: v (int) boolean
   private boolean method_4403(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_3036.method_9501(16) & var1;
      if(var2 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (int, boolean) void
   private void method_4404(int var1, boolean var2) {
      int var4;
      label16: {
         String[] var10000 = class_752.method_4253();
         var4 = this.field_3036.method_9501(16);
         String[] var3 = var10000;
         if(var3 != null) {
            if(!var2) {
               break label16;
            }

            this.field_3036.method_9506(16, Integer.valueOf(var4 | var1));
         }

         if(var3 != null) {
            return;
         }
      }

      this.field_3036.method_9506(16, Integer.valueOf(var4 & ~var1));
   }

   // $FF: renamed from: bx () boolean
   public boolean method_4405() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.method_4159();
      if(var1 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: bA () boolean
   public boolean method_4406() {
      return this.method_4403(2);
   }

   // $FF: renamed from: bQ () boolean
   public boolean method_4407() {
      return this.method_4405();
   }

   // $FF: renamed from: bS () java.lang.String
   public String method_4408() {
      return this.field_3036.method_9503(21);
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_4409(String var1) {
      this.field_3036.method_9506(21, var1);
   }

   // $FF: renamed from: bT () float
   public float method_4410() {
      int var1 = this.method_4354();
      return var1 >= 0?1.0F:0.5F + (float)(-24000 - var1) / -24000.0F * 0.5F;
   }

   // $FF: renamed from: i (boolean) void
   public void method_4357(boolean var1) {
      label16: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(!var1) {
               break label16;
            }

            this.method_4358(this.method_4410());
         }

         if(var2 != null) {
            return;
         }
      }

      this.method_4358(1.0F);
   }

   // $FF: renamed from: bU () boolean
   public boolean method_4411() {
      return this.field_3513;
   }

   // $FF: renamed from: a (boolean) void
   public void method_4412(boolean var1) {
      this.method_4404(2, var1);
   }

   // $FF: renamed from: k (boolean) void
   public void method_4413(boolean var1) {
      this.field_3513 = var1;
   }

   // $FF: renamed from: bM () boolean
   public boolean method_4298() {
      boolean var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.method_4449();
         if(var1 != null) {
            if(var10000) {
               break label24;
            }

            var10000 = super.method_4298();
         }

         if(var1 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: a (float) void
   protected void method_4344(float var1) {
      class_772 var3;
      label24: {
         String[] var2 = class_752.method_4253();
         float var4;
         int var10000 = (var4 = var1 - 6.0F) == 0.0F?0:(var4 < 0.0F?-1:1);
         if(var2 != null) {
            if(var10000 <= 0) {
               return;
            }

            var3 = this;
            if(var2 == null) {
               break label24;
            }

            var10000 = this.method_4417();
         }

         if(var10000 == 0) {
            return;
         }

         var3 = this;
      }

      var3.method_4454(false);
   }

   // $FF: renamed from: bV () boolean
   public boolean method_4414() {
      return this.method_4403(8);
   }

   // $FF: renamed from: bW () int
   public int method_4415() {
      return this.field_3036.method_9501(22);
   }

   // $FF: renamed from: c (add) int
   private int method_4416(add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return 0;
         }

         var10000 = var1;
      }

      adb var3 = var10000.method_3730();
      adb var4 = var3;
      adb var10001 = class_1010.field_5265;
      int var5;
      if(var2 != null) {
         if(var3 == class_1010.field_5265) {
            var5 = 1;
            return var5;
         }

         var4 = var3;
         var10001 = class_1010.field_5266;
      }

      if(var2 != null) {
         if(var4 == var10001) {
            var5 = 2;
            return var5;
         }

         var4 = var3;
         var10001 = class_1010.field_5267;
      }

      var5 = var4 == var10001?3:0;
      return var5;
   }

   // $FF: renamed from: bX () boolean
   public boolean method_4417() {
      return this.method_4403(32);
   }

   // $FF: renamed from: bY () boolean
   public boolean method_4418() {
      return this.method_4403(64);
   }

   // $FF: renamed from: bZ () boolean
   public boolean method_4419() {
      return this.method_4403(16);
   }

   // $FF: renamed from: b0 () boolean
   public boolean method_4420() {
      return this.field_3515;
   }

   // $FF: renamed from: e (add) void
   public void method_4421(add var1) {
      this.field_3036.method_9506(22, Integer.valueOf(this.method_4416(var1)));
      this.method_4441();
   }

   // $FF: renamed from: l (boolean) void
   public void method_4422(boolean var1) {
      this.method_4404(16, var1);
   }

   // $FF: renamed from: m (boolean) void
   public void method_4423(boolean var1) {
      this.method_4404(8, var1);
   }

   // $FF: renamed from: n (boolean) void
   public void method_4424(boolean var1) {
      this.field_3515 = var1;
   }

   // $FF: renamed from: o (boolean) void
   public void method_4425(boolean var1) {
      this.method_4404(4, var1);
   }

   // $FF: renamed from: b1 () int
   public int method_4426() {
      return this.field_3516;
   }

   // $FF: renamed from: w (int) void
   public void method_4427(int var1) {
      this.field_3516 = var1;
   }

   // $FF: renamed from: x (int) int
   public int method_4428(int var1) {
      int var2 = class_1715.method_9568(this.method_4426() + var1, 0, this.method_4439());
      this.method_4427(var2);
      return var2;
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      class_689 var4 = var1.method_9345();
      String[] var3 = class_752.method_4253();
      class_772 var10000 = this;
      boolean var5;
      if(var3 != null) {
         label18: {
            if(this.field_2987 != null) {
               var10000 = this;
               if(var3 == null) {
                  break label18;
               }

               if(this.field_2987.equals(var4)) {
                  var5 = false;
                  return var5;
               }
            }

            var10000 = this;
         }
      }

      var5 = var10000.method_3896(var1, var2);
      return var5;
   }

   // $FF: renamed from: aV () int
   public int method_4199() {
      return field_3503[this.method_4415()];
   }

   // $FF: renamed from: S () boolean
   public boolean method_3898() {
      return this.field_2987 == null;
   }

   // $FF: renamed from: b2 () boolean
   public boolean method_4429() {
      int var1 = class_1715.method_9561(this.field_2994);
      int var2 = class_1715.method_9561(this.field_2996);
      this.field_2990.method_35(var1, var2);
      return true;
   }

   // $FF: renamed from: b3 () void
   public void method_4430() {
      class_772 var2;
      label24: {
         String[] var1 = class_752.method_4253();
         boolean var10000 = this.field_2990.field_1832;
         if(var1 != null) {
            if(this.field_2990.field_1832) {
               return;
            }

            var2 = this;
            if(var1 == null) {
               break label24;
            }

            var10000 = this.method_4414();
         }

         if(!var10000) {
            return;
         }

         this.method_3914(adb.method_2920(class_1192.field_6081), 1);
         var2 = this;
      }

      var2.method_4423(false);
   }

   // $FF: renamed from: b4 () void
   private void method_4431() {
      this.method_4452();
      String[] var10002 = field_3529;
      this.field_2990.method_2082(this, "eating", 1.0F, 1.0F + (this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F);
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {
      String[] var2 = class_752.method_4253();
      float var8;
      int var10000 = (var8 = var1 - 1.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
      if(var2 != null) {
         if(var10000 > 0) {
            String[] var10001 = field_3529;
            this.method_3868("mob.horse.land", 0.4F, 1.0F);
         }

         var10000 = class_1715.method_9566(var1 * 0.5F - 3.0F);
      }

      int var3 = var10000;
      if(var2 != null) {
         if(var3 <= 0) {
            return;
         }

         this.method_3896(class_1691.field_8837, (float)var3);
      }

      class_772 var6 = this;
      if(var2 != null) {
         if(this.field_2987 != null) {
            this.field_2987.method_3896(class_1691.field_8837, (float)var3);
         }

         var6 = this;
      }

      aji var4 = var6.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995 - 0.2D - (double)this.field_3002), class_1715.method_9561(this.field_2996));
      aji var7 = var4;
      if(var2 != null) {
         if(var4.method_2424() == awt.field_4170) {
            return;
         }

         var7 = var4;
      }

      class_1061 var5 = var7.field_2005;
      this.field_2990.method_2082(this, var5.method_5995(), var5.method_5992() * 0.5F, var5.method_5993() * 0.75F);
   }

   // $FF: renamed from: b5 () int
   private int method_4432() {
      int var3;
      label40: {
         String[] var10000 = class_752.method_4253();
         int var2 = this.method_4400();
         String[] var1 = var10000;
         var3 = this.method_4414();
         if(var1 != null) {
            if(var3 == 0) {
               break label40;
            }

            var3 = var2;
         }

         if(var1 == null) {
            return var3;
         }

         if(var3 != 1) {
            var3 = var2;
            if(var1 == null) {
               return var3;
            }

            if(var2 != 2) {
               break label40;
            }
         }

         var3 = 17;
         return var3;
      }

      var3 = 2;
      return var3;
   }

   // $FF: renamed from: b6 () void
   private void method_4433() {
      String[] var10000 = class_752.method_4253();
      class_1676 var2 = this.field_3514;
      class_1676 var10002 = new class_1676;
      String[] var10004 = field_3529;
      var10002.method_9241("HorseChest", this.method_4432());
      this.field_3514 = var10002;
      this.field_3514.method_9238(this.method_4284());
      String[] var1 = var10000;
      class_1676 var6 = var2;
      if(var1 != null) {
         if(var2 != null) {
            var2.method_9237(this);
            int var3 = Math.min(var2.method_83(), this.field_3514.method_83());
            int var4 = 0;

            while(var4 < var3) {
               add var5 = var2.method_84(var4);
               if(var1 == null) {
                  return;
               }

               if(var1 != null) {
                  if(var5 != null) {
                     this.field_3514.method_87(var4, var5.method_3754());
                  }

                  ++var4;
               }

               if(var1 == null) {
                  break;
               }
            }

            var2 = null;
         }

         var6 = this.field_3514;
      }

      var6.method_9236(this);
      this.method_4434();
   }

   // $FF: renamed from: b7 () void
   private void method_4434() {
      String[] var1 = class_752.method_4253();
      class_772 var10000 = this;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this;
      }

      var10000.method_4425(this.field_3514.method_84(0) != null);
      var10000 = this;
      if(var1 != null) {
         if(!this.method_4447()) {
            return;
         }

         var10000 = this;
      }

      var10000.method_4421(this.field_3514.method_84(1));
   }

   // $FF: renamed from: b (vN) void
   public void method_365(class_1674 var1) {
      int var3 = this.method_4415();
      String[] var10000 = class_752.method_4253();
      byte var4 = this.method_4437();
      String[] var2 = var10000;
      this.method_4434();
      int var6 = this.field_3029;
      if(var2 != null) {
         if(this.field_3029 <= 20) {
            return;
         }

         var6 = var3;
      }

      label52: {
         label51: {
            int var10001;
            String[] var5;
            label61: {
               if(var2 != null) {
                  if(var6 == 0) {
                     var6 = var3;
                     var10001 = this.method_4415();
                     if(var2 == null) {
                        break label61;
                     }

                     if(var3 != var10001) {
                        var5 = field_3529;
                        this.method_3868("mob.horse.armor", 0.5F, 1.0F);
                        if(var2 != null) {
                           break label51;
                        }
                     }
                  }

                  var6 = var3;
               }

               if(var2 == null) {
                  break label52;
               }

               var10001 = this.method_4415();
            }

            if(var6 != var10001) {
               var5 = field_3529;
               this.method_3868("mob.horse.armor", 0.5F, 1.0F);
            }
         }

         var6 = var4;
      }

      class_772 var8;
      label62: {
         if(var2 != null) {
            if(var6 != 0) {
               return;
            }

            var8 = this;
            if(var2 == null) {
               break label62;
            }

            var6 = this.method_4437();
         }

         if(var6 == 0) {
            return;
         }

         var8 = this;
      }

      String[] var7 = field_3529;
      var8.method_3868("mob.horse.leather", 0.5F, 1.0F);
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      this.method_4429();
      return super.method_4274();
   }

   // $FF: renamed from: b (sa, double) wR
   protected class_772 method_4435(class_689 var1, double var2) {
      String[] var10000 = class_752.method_4253();
      double var5 = Double.MAX_VALUE;
      String[] var4 = var10000;
      class_689 var7 = null;
      List var8 = this.field_2990.method_2156(var1, var1.field_3004.method_7096(var2, var2, var2), field_3499);
      Iterator var9 = var8.iterator();

      class_689 var13;
      while(true) {
         if(var9.hasNext()) {
            class_689 var10 = (class_689)var9.next();
            var13 = var10;
            if(var4 == null) {
               break;
            }

            label21: {
               double var11 = var10.method_3889(var1.field_2994, var1.field_2995, var1.field_2996);
               double var14 = var11;
               if(var4 != null) {
                  if(var11 >= var5) {
                     break label21;
                  }

                  var7 = var10;
                  var14 = var11;
               }

               var5 = var14;
            }

            if(var4 != null) {
               continue;
            }
         }

         var13 = var7;
         break;
      }

      return (class_772)var13;
   }

   // $FF: renamed from: b8 () double
   public double method_4436() {
      return this.method_4211(field_3500).method_396();
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      this.method_4452();
      String[] var10000 = class_752.method_4253();
      int var2 = this.method_4400();
      String[] var1 = var10000;
      int var4 = var2;
      byte var10001 = 3;
      String[] var3;
      String var5;
      if(var1 != null) {
         if(var2 == 3) {
            var3 = field_3529;
            var5 = "mob.horse.zombie.death";
            return var5;
         }

         var4 = var2;
         var10001 = 4;
      }

      if(var1 != null) {
         if(var4 == var10001) {
            var3 = field_3529;
            var5 = "mob.horse.skeleton.death";
            return var5;
         }

         var4 = var2;
         var10001 = 1;
      }

      label25: {
         if(var1 != null) {
            if(var4 == var10001) {
               break label25;
            }

            var4 = var2;
            var10001 = 2;
         }

         if(var4 != var10001) {
            var3 = field_3529;
            var5 = "mob.horse.death";
            return var5;
         }
      }

      var10000 = field_3529;
      var5 = "mob.horse.donkey.death";
      return var5;
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3028.nextInt(4);
      if(var1 != null) {
         var10000 = var10000 == 0?1:0;
      }

      adb var4;
      label45: {
         int var2 = var10000;
         int var3 = this.method_4400();
         var10000 = var3;
         byte var10001 = 4;
         if(var1 != null) {
            if(var3 == 4) {
               var4 = class_1010.field_5209;
               return var4;
            }

            var10000 = var3;
            if(var1 == null) {
               break label45;
            }

            var10001 = 3;
         }

         if(var10000 != var10001) {
            var4 = class_1010.field_5192;
            return var4;
         }

         var10000 = var2;
      }

      if(var1 != null) {
         if(var10000 == 0) {
            var4 = class_1010.field_5224;
            return var4;
         }

         var10000 = 0;
      }

      var4 = adb.method_2919(var10000);
      return var4;
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = class_752.method_4253();
      this.method_4452();
      String[] var1 = var10000;
      int var4 = this.field_3028.nextInt(3);
      if(var1 != null) {
         if(var4 == 0) {
            this.method_4456();
         }

         var4 = this.method_4400();
      }

      int var2 = var4;
      var4 = var2;
      byte var10001 = 3;
      String[] var3;
      String var5;
      if(var1 != null) {
         if(var2 == 3) {
            var3 = field_3529;
            var5 = "mob.horse.zombie.hit";
            return var5;
         }

         var4 = var2;
         var10001 = 4;
      }

      if(var1 != null) {
         if(var4 == var10001) {
            var3 = field_3529;
            var5 = "mob.horse.skeleton.hit";
            return var5;
         }

         var4 = var2;
         var10001 = 1;
      }

      label32: {
         if(var1 != null) {
            if(var4 == var10001) {
               break label32;
            }

            var4 = var2;
            var10001 = 2;
         }

         if(var4 != var10001) {
            var3 = field_3529;
            var5 = "mob.horse.hit";
            return var5;
         }
      }

      var10000 = field_3529;
      var5 = "mob.horse.donkey.hit";
      return var5;
   }

   // $FF: renamed from: b9 () boolean
   public boolean method_4437() {
      return this.method_4403(4);
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = class_752.method_4253();
      this.method_4452();
      String[] var1 = var10000;
      int var4 = this.field_3028.nextInt(10);
      if(var1 != null) {
         label49: {
            if(var4 == 0) {
               var4 = this.method_4218();
               if(var1 == null) {
                  break label49;
               }

               if(var4 == 0) {
                  this.method_4456();
               }
            }

            var4 = this.method_4400();
         }
      }

      int var2 = var4;
      var4 = var2;
      byte var10001 = 3;
      String[] var3;
      String var5;
      if(var1 != null) {
         if(var2 == 3) {
            var3 = field_3529;
            var5 = "mob.horse.zombie.idle";
            return var5;
         }

         var4 = var2;
         var10001 = 4;
      }

      if(var1 != null) {
         if(var4 == var10001) {
            var3 = field_3529;
            var5 = "mob.horse.skeleton.idle";
            return var5;
         }

         var4 = var2;
         var10001 = 1;
      }

      label32: {
         if(var1 != null) {
            if(var4 == var10001) {
               break label32;
            }

            var4 = var2;
            var10001 = 2;
         }

         if(var4 != var10001) {
            var3 = field_3529;
            var5 = "mob.horse.idle";
            return var5;
         }
      }

      var10000 = field_3529;
      var5 = "mob.horse.donkey.idle";
      return var5;
   }

   // $FF: renamed from: ca () java.lang.String
   protected String method_4438() {
      String var5;
      label47: {
         this.method_4452();
         this.method_4456();
         String[] var10000 = class_752.method_4253();
         int var2 = this.method_4400();
         String[] var1 = var10000;
         int var4 = var2;
         byte var10001 = 3;
         if(var1 != null) {
            if(var2 == 3) {
               break label47;
            }

            var4 = var2;
            var10001 = 4;
         }

         if(var1 != null) {
            if(var4 == var10001) {
               break label47;
            }

            var4 = var2;
            var10001 = 1;
         }

         label24: {
            if(var1 != null) {
               if(var4 == var10001) {
                  break label24;
               }

               var4 = var2;
               var10001 = 2;
            }

            if(var4 != var10001) {
               String[] var3 = field_3529;
               var5 = "mob.horse.angry";
               return var5;
            }
         }

         var10000 = field_3529;
         var5 = "mob.horse.donkey.angry";
         return var5;
      }

      var5 = null;
      return var5;
   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      class_1061 var6 = var4.field_2005;
      String[] var5 = class_752.method_4253();
      aji var10000 = this.field_2990.getBlock(var1, var2 + 1, var3);
      if(var5 != null) {
         if(var10000 == class_1192.field_6104) {
            var6 = class_1192.field_6104.field_2005;
         }

         var10000 = var4;
      }

      int var9 = var10000.method_2424().method_5062();
      if(var5 != null) {
         if(var9 != 0) {
            return;
         }

         var9 = this.method_4400();
      }

      int var7 = var9;
      String[] var8;
      if(this.field_2987 != null) {
         label95: {
            var9 = var7;
            byte var10001 = 1;
            if(var5 != null) {
               if(var7 == 1) {
                  break label95;
               }

               var9 = var7;
               var10001 = 2;
            }

            if(var5 != null) {
               if(var9 == var10001) {
                  break label95;
               }

               ++this.field_3525;
               var9 = this.field_3525;
               var10001 = 5;
            }

            class_772 var11;
            label96: {
               if(var5 != null) {
                  label97: {
                     if(var9 > var10001) {
                        var9 = this.field_3525 % 3;
                        if(var5 == null) {
                           break label97;
                        }

                        if(var9 == 0) {
                           label98: {
                              var8 = field_3529;
                              this.method_3868("mob.horse.gallop", var6.method_5992() * 0.15F, var6.method_5993());
                              var9 = var7;
                              if(var5 != null) {
                                 if(var7 != 0) {
                                    return;
                                 }

                                 var11 = this;
                                 if(var5 == null) {
                                    break label98;
                                 }

                                 var9 = this.field_3028.nextInt(10);
                              }

                              if(var9 != 0) {
                                 return;
                              }

                              var11 = this;
                           }

                           var8 = field_3529;
                           var11.method_3868("mob.horse.breathe", var6.method_5992() * 0.6F, var6.method_5993());
                           if(var5 != null) {
                              return;
                           }
                        }
                     }

                     var11 = this;
                     if(var5 == null) {
                        break label96;
                     }

                     var9 = this.field_3525;
                  }

                  var10001 = 5;
               }

               if(var9 > var10001) {
                  return;
               }

               var11 = this;
            }

            var8 = field_3529;
            var11.method_3868("mob.horse.wood", var6.method_5992() * 0.15F, var6.method_5993());
            if(var5 != null) {
               return;
            }
         }
      }

      if(var6 == aji.field_1977) {
         var8 = field_3529;
         this.method_3868("mob.horse.wood", var6.method_5992() * 0.15F, var6.method_5993());
         if(var5 != null) {
            return;
         }
      }

      String[] var10 = field_3529;
      this.method_3868("mob.horse.soft", var6.method_5992() * 0.15F, var6.method_5993());
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4212().method_9617(field_3500);
      this.method_4211(class_1840.field_9390).method_390(53.0D);
      this.method_4211(class_1840.field_9393).method_390(0.22499999403953552D);
   }

   // $FF: renamed from: bB () int
   public int method_4276() {
      return 6;
   }

   // $FF: renamed from: cb () int
   public int method_4439() {
      return 100;
   }

   // $FF: renamed from: bf () float
   protected float method_4216() {
      return 0.8F;
   }

   // $FF: renamed from: q () int
   public int method_4263() {
      return 400;
   }

   // $FF: renamed from: cc () boolean
   public boolean method_4440() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4400();
      if(var1 != null) {
         if(var10000 != 0) {
            var10000 = this.method_4415();
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 <= 0) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: cd () void
   private void method_4441() {
      this.field_3526 = null;
   }

   // $FF: renamed from: ce () void
   private void method_4442() {
      int var4;
      label15: {
         String[] var10000 = class_752.method_4253();
         String[] var10002 = field_3529;
         this.field_3526 = "horse/";
         this.field_3527[0] = null;
         this.field_3527[1] = null;
         this.field_3527[2] = null;
         String[] var1 = var10000;
         int var2 = this.method_4400();
         int var3 = this.method_4402();
         if(var1 != null) {
            if(var2 == 0) {
               var4 = var3 & 255;
               int var5 = (var3 & '\uff00') >> 8;
               this.field_3527[0] = field_3504[var4];
               this.field_3526 = this.field_3526 + field_3505[var4];
               this.field_3527[1] = field_3506[var5];
               this.field_3526 = this.field_3526 + field_3507[var5];
               if(var1 != null) {
                  break label15;
               }
            }

            this.field_3527[0] = "";
         }

         this.field_3526 = this.field_3526 + "_" + var2 + "_";
      }

      var4 = this.method_4415();
      this.field_3527[2] = field_3501[var4];
      this.field_3526 = this.field_3526 + field_3502[var4];
   }

   // $FF: renamed from: cf () java.lang.String
   public String method_4443() {
      String[] var1 = class_752.method_4253();
      String var10000 = this.field_3526;
      if(var1 != null) {
         if(this.field_3526 == null) {
            this.method_4442();
         }

         var10000 = this.field_3526;
      }

      return var10000;
   }

   // $FF: renamed from: cg () java.lang.String[]
   public String[] method_4444() {
      String[] var1 = class_752.method_4253();
      class_772 var10000 = this;
      if(var1 != null) {
         if(this.field_3526 == null) {
            this.method_4442();
         }

         var10000 = this;
      }

      return var10000.field_3527;
   }

   // $FF: renamed from: f (yz) void
   public void method_4445(class_792 var1) {
      String[] var2;
      class_772 var3;
      label39: {
         var2 = class_752.method_4253();
         Object var10000 = this;
         if(var2 != null) {
            if(this.field_2990.field_1832) {
               return;
            }

            var3 = this;
            if(var2 == null) {
               break label39;
            }

            var10000 = this.field_2987;
         }

         if(var10000 != null) {
            var3 = this;
            if(var2 == null) {
               break label39;
            }

            if(this.field_2987 != var1) {
               return;
            }
         }

         var3 = this;
      }

      if(var2 != null) {
         if(!var3.method_4406()) {
            return;
         }

         var3 = this;
      }

      var3.field_3514.method_9238(this.method_4284());
      var1.method_4578(this, this.field_3514);
   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      String[] var2;
      add var3;
      add var9;
      label426: {
         String[] var10000 = class_752.method_4253();
         var3 = var1.field_3616.method_3593();
         var2 = var10000;
         var9 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label426;
            }

            var9 = var3;
         }

         if(var9.method_3730() == class_1010.field_5239) {
            return super.method_4295(var1);
         }
      }

      boolean var10 = this.method_4406();
      if(var2 != null) {
         label419: {
            if(!var10) {
               var10 = this.method_4449();
               if(var2 == null) {
                  break label419;
               }

               if(var10) {
                  return false;
               }
            }

            var10 = this.method_4406();
         }
      }

      class_772 var12;
      label465: {
         Object var11;
         label430: {
            if(var2 != null) {
               label431: {
                  if(var10) {
                     var10 = this.method_4405();
                     if(var2 == null) {
                        break label431;
                     }

                     if(var10) {
                        var10 = var1.method_3938();
                        if(var2 == null) {
                           break label431;
                        }

                        if(var10) {
                           this.method_4445(var1);
                           return true;
                        }
                     }
                  }

                  var11 = this;
                  if(var2 == null) {
                     break label430;
                  }

                  var10 = this.method_4407();
               }
            }

            if(!var10) {
               break label465;
            }

            var12 = this;
            if(var2 == null) {
               return var12.method_4295(var1);
            }

            var11 = this.field_2987;
         }

         if(var11 != null) {
            var12 = this;
            return var12.method_4295(var1);
         }
      }

      int var13;
      label388: {
         if(var3 != null) {
            byte var4 = 0;
            var13 = this.method_4447();
            adb var15;
            adb var10001;
            if(var2 != null) {
               label449: {
                  if(var13 != 0) {
                     byte var5;
                     label435: {
                        var5 = -1;
                        var15 = var3.method_3730();
                        var10001 = class_1010.field_5265;
                        if(var2 != null) {
                           if(var15 == class_1010.field_5265) {
                              var5 = 1;
                              if(var2 != null) {
                                 break label435;
                              }
                           }

                           var15 = var3.method_3730();
                           var10001 = class_1010.field_5266;
                        }

                        if(var2 != null) {
                           if(var15 == var10001) {
                              var5 = 2;
                              if(var2 != null) {
                                 break label435;
                              }
                           }

                           var15 = var3.method_3730();
                           var10001 = class_1010.field_5267;
                        }

                        if(var15 == var10001) {
                           var5 = 3;
                        }
                     }

                     var13 = var5;
                     if(var2 == null) {
                        break label449;
                     }

                     if(var5 >= 0) {
                        var10 = this.method_4406();
                        if(var2 != null) {
                           if(!var10) {
                              this.method_4457();
                              return true;
                           }

                           this.method_4445(var1);
                           var10 = true;
                        }

                        return var10;
                     }
                  }

                  var13 = var4;
               }
            }

            if(var2 != null) {
               label450: {
                  if(var13 == 0) {
                     var13 = this.method_4449();
                     if(var2 == null) {
                        break label450;
                     }

                     if(var13 == 0) {
                        short var6;
                        byte var7;
                        float var8;
                        label346: {
                           label438: {
                              var8 = 0.0F;
                              var6 = 0;
                              var7 = 0;
                              var15 = var3.method_3730();
                              var10001 = class_1010.field_5154;
                              if(var2 != null) {
                                 if(var15 == class_1010.field_5154) {
                                    var8 = 2.0F;
                                    var6 = 60;
                                    var7 = 3;
                                    if(var2 != null) {
                                       break label438;
                                    }
                                 }

                                 var15 = var3.method_3730();
                                 var10001 = class_1010.field_5210;
                              }

                              label439: {
                                 if(var2 != null) {
                                    if(var15 == var10001) {
                                       var8 = 1.0F;
                                       var6 = 30;
                                       var7 = 3;
                                       if(var2 != null) {
                                          break label438;
                                       }
                                    }

                                    var15 = var3.method_3730();
                                    if(var2 == null) {
                                       break label439;
                                    }

                                    var10001 = class_1010.field_5155;
                                 }

                                 if(var15 == var10001) {
                                    var8 = 7.0F;
                                    var6 = 180;
                                    var7 = 3;
                                    if(var2 != null) {
                                       break label438;
                                    }
                                 }

                                 var15 = var3.method_3730();
                              }

                              if(var2 != null) {
                                 if(aji.method_2417(var15) == class_1192.field_6184) {
                                    var8 = 20.0F;
                                    var6 = 180;
                                    if(var2 != null) {
                                       break label438;
                                    }
                                 }

                                 var15 = var3.method_3730();
                              }

                              var10001 = class_1010.field_5118;
                              if(var2 != null) {
                                 if(var15 == class_1010.field_5118) {
                                    var8 = 3.0F;
                                    var6 = 60;
                                    var7 = 3;
                                    if(var2 != null) {
                                       break label438;
                                    }
                                 }

                                 var15 = var3.method_3730();
                                 var10001 = class_1010.field_5252;
                              }

                              if(var2 != null) {
                                 if(var15 == var10001) {
                                    var8 = 4.0F;
                                    var6 = 60;
                                    var7 = 5;
                                    var13 = this.method_4406();
                                    if(var2 == null) {
                                       break label346;
                                    }

                                    if(var13 == 0) {
                                       break label438;
                                    }

                                    var13 = this.method_4354();
                                    if(var2 == null) {
                                       break label346;
                                    }

                                    if(var13 != 0) {
                                       break label438;
                                    }

                                    var4 = 1;
                                    this.method_4379(var1);
                                    if(var2 != null) {
                                       break label438;
                                    }
                                 }

                                 var15 = var3.method_3730();
                                 var10001 = class_1010.field_5180;
                              }

                              if(var15 == var10001) {
                                 var8 = 10.0F;
                                 var6 = 240;
                                 var7 = 10;
                                 var13 = this.method_4406();
                                 if(var2 == null) {
                                    break label346;
                                 }

                                 if(var13 != 0) {
                                    var13 = this.method_4354();
                                    if(var2 == null) {
                                       break label346;
                                    }

                                    if(var13 == 0) {
                                       var4 = 1;
                                       this.method_4379(var1);
                                    }
                                 }
                              }
                           }

                           float var16;
                           var13 = (var16 = this.method_406() - this.method_405()) == 0.0F?0:(var16 < 0.0F?-1:1);
                        }

                        if(var2 != null) {
                           label451: {
                              if(var13 < 0) {
                                 float var17;
                                 var13 = (var17 = var8 - 0.0F) == 0.0F?0:(var17 < 0.0F?-1:1);
                                 if(var2 == null) {
                                    break label451;
                                 }

                                 if(var13 > 0) {
                                    this.method_4187(var8);
                                    var4 = 1;
                                 }
                              }

                              var13 = this.method_4405();
                           }
                        }

                        if(var2 != null) {
                           label452: {
                              if(var13 == 0) {
                                 var13 = var6;
                                 if(var2 == null) {
                                    break label452;
                                 }

                                 if(var6 > 0) {
                                    this.method_4355(var6);
                                    var4 = 1;
                                 }
                              }

                              var13 = var7;
                           }
                        }

                        if(var2 != null) {
                           label274: {
                              if(var13 > 0) {
                                 label444: {
                                    var13 = var4;
                                    if(var2 != null) {
                                       if(var4 == 0) {
                                          var13 = this.method_4406();
                                          if(var2 == null) {
                                             break label274;
                                          }

                                          if(var13 != 0) {
                                             break label444;
                                          }
                                       }

                                       var13 = var7;
                                    }

                                    if(var2 == null) {
                                       break label274;
                                    }

                                    if(var13 < this.method_4439()) {
                                       var4 = 1;
                                       this.method_4428(var7);
                                    }
                                 }
                              }

                              var13 = var4;
                           }
                        }

                        if(var2 == null) {
                           break label450;
                        }

                        if(var13 != 0) {
                           this.method_4431();
                        }
                     }
                  }

                  var13 = this.method_4406();
               }
            }

            if(var2 != null) {
               label453: {
                  if(var13 == 0) {
                     var13 = var4;
                     if(var2 == null) {
                        break label453;
                     }

                     if(var4 == 0) {
                        label446: {
                           var9 = var3;
                           if(var2 != null) {
                              if(var3 == null) {
                                 break label446;
                              }

                              var9 = var3;
                           }

                           var10 = var9.method_3753(var1, this);
                           if(var2 == null) {
                              return var10;
                           }

                           if(var10) {
                              return true;
                           }
                        }

                        this.method_4457();
                        var10 = true;
                        return var10;
                     }
                  }

                  var13 = var4;
               }
            }

            if(var2 != null) {
               label454: {
                  if(var13 == 0) {
                     var13 = this.method_4448();
                     if(var2 == null) {
                        break label454;
                     }

                     if(var13 != 0) {
                        var13 = this.method_4414();
                        if(var2 == null) {
                           break label454;
                        }

                        if(var13 == 0 && var3.method_3730() == adb.method_2920(class_1192.field_6081)) {
                           this.method_4423(true);
                           String[] var14 = field_3529;
                           this.method_3868("mob.chickenplop", 1.0F, (this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.2F + 1.0F);
                           var4 = 1;
                           this.method_4433();
                        }
                     }
                  }

                  var13 = var4;
               }
            }

            if(var2 != null) {
               label239: {
                  if(var13 == 0) {
                     var13 = this.method_4407();
                     if(var2 == null) {
                        break label239;
                     }

                     if(var13 != 0) {
                        var13 = this.method_4437();
                        if(var2 == null) {
                           break label239;
                        }

                        if(var13 == 0 && var3.method_3730() == class_1010.field_5187) {
                           this.method_4445(var1);
                           return true;
                        }
                     }
                  }

                  var13 = var4;
               }
            }

            if(var2 == null) {
               break label388;
            }

            if(var13 != 0) {
               var13 = var1.field_3640.field_2839;
               if(var2 != null) {
                  if(!var1.field_3640.field_2839) {
                     var13 = --var3.field_2958;
                     if(var2 == null) {
                        return (boolean)var13;
                     }

                     if(var13 == 0) {
                        var1.field_3616.method_87(var1.field_3616.field_2846, (add)null);
                     }
                  }

                  var13 = 1;
               }

               return (boolean)var13;
            }
         }

         var13 = this.method_4407();
      }

      if(var2 != null) {
         label228: {
            if(var13 != 0) {
               var12 = this;
               if(var2 == null) {
                  break label228;
               }

               if(this.field_2987 == null) {
                  label448: {
                     var9 = var3;
                     if(var2 != null) {
                        if(var3 == null) {
                           break label448;
                        }

                        var9 = var3;
                     }

                     var10 = var9.method_3753(var1, this);
                     if(var2 == null) {
                        return var10;
                     }

                     if(var10) {
                        return true;
                     }
                  }

                  this.method_4446(var1);
                  var10 = true;
                  return var10;
               }
            }

            var12 = this;
         }

         var13 = var12.method_4295(var1);
      }

      return (boolean)var13;
   }

   // $FF: renamed from: g (yz) void
   private void method_4446(class_792 var1) {
      String[] var10000 = class_752.method_4253();
      var1.field_3000 = this.field_3000;
      String[] var2 = var10000;
      class_792 var3 = var1;
      class_772 var10001 = this;
      if(var2 != null) {
         var1.field_3001 = this.field_3001;
         this.method_4454(false);
         this.method_4455(false);
         if(this.field_2990.field_1832) {
            return;
         }

         var3 = var1;
         var10001 = this;
      }

      var3.method_3925(var10001);
   }

   // $FF: renamed from: ch () boolean
   public boolean method_4447() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4400();
      if(var1 != null) {
         var10000 = var10000 == 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: ci () boolean
   public boolean method_4448() {
      String[] var10000 = class_752.method_4253();
      int var2 = this.method_4400();
      String[] var1 = var10000;
      int var3 = var2;
      if(var1 != null) {
         if(var2 != 2) {
            var3 = var2;
            if(var1 == null) {
               return (boolean)var3;
            }

            if(var2 != 1) {
               var3 = 0;
               return (boolean)var3;
            }
         }

         var3 = 1;
      }

      return (boolean)var3;
   }

   // $FF: renamed from: bh () boolean
   protected boolean method_4218() {
      String[] var1;
      boolean var2;
      label34: {
         var1 = class_752.method_4253();
         class_772 var10000 = this;
         if(var1 != null) {
            if(this.field_2987 != null) {
               var2 = this.method_4437();
               if(var1 == null) {
                  break label34;
               }

               if(var2) {
                  var2 = true;
                  return var2;
               }
            }

            var10000 = this;
         }

         var2 = var10000.method_4417();
      }

      if(var1 != null) {
         if(!var2) {
            var2 = this.method_4418();
            if(var1 == null) {
               return var2;
            }

            if(!var2) {
               var2 = false;
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   // $FF: renamed from: cj () boolean
   public boolean method_4449() {
      String[] var10000 = class_752.method_4253();
      int var2 = this.method_4400();
      String[] var1 = var10000;
      int var3 = var2;
      if(var1 != null) {
         if(var2 != 3) {
            var3 = var2;
            if(var1 == null) {
               return (boolean)var3;
            }

            if(var2 != 4) {
               var3 = 0;
               return (boolean)var3;
            }
         }

         var3 = 1;
      }

      return (boolean)var3;
   }

   // $FF: renamed from: ck () boolean
   public boolean method_4450() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_4449();
      if(var1 != null) {
         if(var10000 == 0) {
            var10000 = this.method_4400();
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 2) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d (add) boolean
   public boolean method_4378(add var1) {
      return false;
   }

   // $FF: renamed from: cl () void
   private void method_4451() {
      this.field_3511 = 1;
   }

   // $FF: renamed from: a (vX) void
   public void method_4190(class_1691 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_4190(var1);
      String[] var2 = var10000;
      class_772 var3 = this;
      if(var2 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var3 = this;
      }

      var3.method_4458();
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3028.nextInt(200);
      if(var1 != null) {
         if(var10000 == 0) {
            this.method_4451();
         }

         super.method_4231();
         var10000 = this.field_2990.field_1832;
      }

      if(var1 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = this.field_3028.nextInt(900);
      }

      if(var1 != null) {
         label109: {
            if(var10000 == 0) {
               var10000 = this.field_3318;
               if(var1 == null) {
                  break label109;
               }

               if(this.field_3318 == 0) {
                  this.method_4187(1.0F);
               }
            }

            var10000 = this.method_4417();
         }
      }

      class_772 var4;
      if(var1 != null) {
         label102: {
            label101: {
               if(var10000 == 0) {
                  var4 = this;
                  if(var1 == null) {
                     break label101;
                  }

                  if(this.field_2987 == null) {
                     var10000 = this.field_3028.nextInt(300);
                     if(var1 == null) {
                        break label102;
                     }

                     if(var10000 == 0) {
                        var4 = this;
                        if(var1 == null) {
                           break label101;
                        }

                        if(this.field_2990.getBlock(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995) - 1, class_1715.method_9561(this.field_2996)) == class_1192.field_6027) {
                           this.method_4454(true);
                        }
                     }
                  }
               }

               var4 = this;
            }

            var10000 = var4.method_4417();
         }
      }

      if(var1 != null) {
         label87: {
            if(var10000 != 0) {
               var10000 = ++this.field_3508;
               if(var1 == null) {
                  break label87;
               }

               if(var10000 > 50) {
                  this.field_3508 = 0;
                  this.method_4454(false);
               }
            }

            var10000 = this.method_4419();
         }
      }

      if(var1 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.method_4405();
      }

      label121: {
         if(var1 != null) {
            if(var10000 != 0) {
               return;
            }

            var4 = this;
            if(var1 == null) {
               break label121;
            }

            var10000 = this.method_4417();
         }

         if(var10000 != 0) {
            return;
         }

         var4 = this.method_4435(this, 16.0D);
      }

      class_772 var2 = var4;
      var4 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return;
         }

         var4 = this;
      }

      if(var1 != null) {
         if(var4.method_3891(var2) <= 4.0D) {
            return;
         }

         var4 = this;
      }

      class_1289 var3 = var4.field_2990.method_2167(this, var2, 16.0F, true, false, false, true);
      this.method_4334(var3);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var10000 = class_752.method_4253();
      super.method_3856();
      String[] var1 = var10000;
      int var3 = this.field_2990.field_1832;
      if(var1 != null) {
         label157: {
            if(this.field_2990.field_1832) {
               var3 = this.field_3036.method_9508();
               if(var1 == null) {
                  break label157;
               }

               if(var3 != 0) {
                  this.field_3036.method_9517();
                  this.method_4441();
               }
            }

            var3 = this.field_3509;
         }
      }

      if(var1 != null) {
         label150: {
            if(var3 > 0) {
               var3 = ++this.field_3509;
               if(var1 == null) {
                  break label150;
               }

               if(var3 > 30) {
                  this.field_3509 = 0;
                  this.method_4404(128, false);
               }
            }

            var3 = this.field_2990.field_1832;
         }
      }

      if(var1 != null) {
         label143: {
            if(var3 == 0) {
               var3 = this.field_3510;
               if(var1 == null) {
                  break label143;
               }

               if(this.field_3510 > 0) {
                  var3 = ++this.field_3510;
                  if(var1 == null) {
                     break label143;
                  }

                  if(var3 > 20) {
                     this.field_3510 = 0;
                     this.method_4455(false);
                  }
               }
            }

            var3 = this.field_3511;
         }
      }

      if(var1 != null) {
         label133: {
            if(var3 > 0) {
               var3 = ++this.field_3511;
               if(var1 == null) {
                  break label133;
               }

               if(var3 > 8) {
                  this.field_3511 = 0;
               }
            }

            var3 = this.field_3512;
         }
      }

      if(var1 != null) {
         label126: {
            if(var3 > 0) {
               ++this.field_3512;
               var3 = this.field_3512;
               if(var1 == null) {
                  break label126;
               }

               if(this.field_3512 > 300) {
                  this.field_3512 = 0;
               }
            }

            this.field_3520 = this.field_3519;
            var3 = this.method_4417();
         }
      }

      label120: {
         label161: {
            if(var1 != null) {
               if(var3 != 0) {
                  this.field_3519 += (1.0F - this.field_3519) * 0.4F + 0.05F;
                  float var4;
                  var3 = (var4 = this.field_3519 - 1.0F) == 0.0F?0:(var4 < 0.0F?-1:1);
                  if(var1 == null) {
                     break label120;
                  }

                  if(var3 <= 0) {
                     break label161;
                  }

                  this.field_3519 = 1.0F;
                  if(var1 != null) {
                     break label161;
                  }
               }

               this.field_3519 += (0.0F - this.field_3519) * 0.4F - 0.05F;
               float var5;
               var3 = (var5 = this.field_3519 - 0.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
            }

            if(var1 == null) {
               break label120;
            }

            if(var3 < 0) {
               this.field_3519 = 0.0F;
            }
         }

         this.field_3522 = this.field_3521;
         var3 = this.method_4418();
      }

      label105: {
         label163: {
            if(var1 != null) {
               if(var3 != 0) {
                  this.field_3520 = this.field_3519 = 0.0F;
                  this.field_3521 += (1.0F - this.field_3521) * 0.4F + 0.05F;
                  float var6;
                  var3 = (var6 = this.field_3521 - 1.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
                  if(var1 == null) {
                     break label105;
                  }

                  if(var3 <= 0) {
                     break label163;
                  }

                  this.field_3521 = 1.0F;
                  if(var1 != null) {
                     break label163;
                  }
               }

               this.field_3518 = false;
               this.field_3521 += (0.8F * this.field_3521 * this.field_3521 * this.field_3521 - this.field_3521) * 0.6F - 0.05F;
               float var7;
               var3 = (var7 = this.field_3521 - 0.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
            }

            if(var1 == null) {
               break label105;
            }

            if(var3 < 0) {
               this.field_3521 = 0.0F;
            }
         }

         this.field_3524 = this.field_3523;
         var3 = this.method_4403(128);
      }

      class_772 var2;
      label165: {
         if(var1 != null) {
            if(var3 != 0) {
               this.field_3523 += (1.0F - this.field_3523) * 0.7F + 0.05F;
               var2 = this;
               if(var1 != null) {
                  if(this.field_3523 <= 1.0F) {
                     return;
                  }

                  var2 = this;
               }

               var2.field_3523 = 1.0F;
               if(var1 != null) {
                  return;
               }
            }

            this.field_3523 += (0.0F - this.field_3523) * 0.7F - 0.05F;
            var2 = this;
            if(var1 == null) {
               break label165;
            }

            float var8;
            var3 = (var8 = this.field_3523 - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
         }

         if(var3 >= 0) {
            return;
         }

         var2 = this;
      }

      var2.field_3523 = 0.0F;
   }

   // $FF: renamed from: cm () void
   private void method_4452() {
      String[] var1 = class_752.method_4253();
      class_772 var10000 = this;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         this.field_3509 = 1;
         var10000 = this;
      }

      var10000.method_4404(128, true);
   }

   // $FF: renamed from: cn () boolean
   private boolean method_4453() {
      int var3;
      label57: {
         String[] var1;
         class_772 var2;
         label58: {
            var1 = class_752.method_4253();
            class_689 var10000 = this.field_2987;
            if(var1 != null) {
               if(this.field_2987 != null) {
                  break label57;
               }

               var2 = this;
               if(var1 == null) {
                  break label58;
               }

               var10000 = this.field_2988;
            }

            if(var10000 != null) {
               break label57;
            }

            var2 = this;
         }

         var3 = var2.method_4406();
         if(var1 != null) {
            if(var3 == 0) {
               break label57;
            }

            var3 = this.method_4405();
         }

         if(var1 != null) {
            if(var3 == 0) {
               break label57;
            }

            var3 = this.method_4450();
         }

         if(var1 != null) {
            if(var3 != 0) {
               break label57;
            }

            float var4;
            var3 = (var4 = this.method_406() - this.method_405()) == 0.0F?0:(var4 < 0.0F?-1:1);
         }

         if(var1 == null) {
            return (boolean)var3;
         }

         if(var3 >= 0) {
            var3 = 1;
            return (boolean)var3;
         }
      }

      var3 = 0;
      return (boolean)var3;
   }

   // $FF: renamed from: e (boolean) void
   public void method_3946(boolean var1) {
      this.method_4404(32, var1);
   }

   // $FF: renamed from: p (boolean) void
   public void method_4454(boolean var1) {
      this.method_3946(var1);
   }

   // $FF: renamed from: q (boolean) void
   public void method_4455(boolean var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         if(var1) {
            this.method_4454(false);
         }

         this.method_4404(64, var1);
      }

   }

   // $FF: renamed from: co () void
   private void method_4456() {
      String[] var1 = class_752.method_4253();
      class_772 var10000 = this;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         this.field_3510 = 1;
         var10000 = this;
      }

      var10000.method_4455(true);
   }

   // $FF: renamed from: cp () void
   public void method_4457() {
      this.method_4456();
      String var1 = this.method_4438();
      if(var1 != null) {
         this.method_3868(var1, this.method_4216(), this.method_4217());
      }

   }

   // $FF: renamed from: cq () void
   public void method_4458() {
      this.method_4459(this, this.field_3514);
      this.method_4430();
   }

   // $FF: renamed from: b (sa, vQ) void
   private void method_4459(class_689 var1, class_1676 var2) {
      String[] var3 = class_752.method_4253();
      if(var2 != null) {
         byte var10000 = this.field_2990.field_1832;
         if(var3 != null) {
            if(this.field_2990.field_1832) {
               return;
            }

            var10000 = 0;
         }

         int var4 = var10000;

         while(var4 < var2.method_83()) {
            add var5 = var2.method_84(var4);
            if(var3 != null) {
               if(var5 != null) {
                  this.method_3916(var5, 0.0F);
               }

               ++var4;
            }

            if(var3 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: i (yz) boolean
   public boolean method_4460(class_792 var1) {
      this.method_4409(var1.method_3972().toString());
      this.method_4412(true);
      return true;
   }

   // $FF: renamed from: e (float, float) void
   public void method_4224(float var1, float var2) {
      String[] var3 = class_752.method_4253();
      class_772 var10000 = this;
      if(var3 != null) {
         label123: {
            if(this.field_2987 != null) {
               var10000 = this;
               if(var3 == null) {
                  break label123;
               }

               if(this.field_2987 instanceof class_752) {
                  var10000 = this;
                  if(var3 == null) {
                     break label123;
                  }

                  if(this.method_4437()) {
                     this.field_3002 = this.field_3000 = this.field_2987.field_3000;
                     this.field_3001 = this.field_2987.field_3001 * 0.5F;
                     this.method_3853(this.field_3000, this.field_3001);
                     this.field_3332 = this.field_3330 = this.field_3000;
                     var1 = ((class_752)this.field_2987).field_3347 * 0.5F;
                     var2 = ((class_752)this.field_2987).field_3348;
                     float var11;
                     int var10 = (var11 = var2 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
                     if(var3 != null) {
                        if(var10 <= 0) {
                           var2 *= 0.25F;
                           this.field_3525 = 0;
                        }

                        var10 = this.field_3005;
                     }

                     if(var3 != null) {
                        label134: {
                           if(var10 != 0) {
                              float var12;
                              var10 = (var12 = this.field_3517 - 0.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
                              if(var3 == null) {
                                 break label134;
                              }

                              if(var10 == 0) {
                                 var10 = this.method_4418();
                                 if(var3 == null) {
                                    break label134;
                                 }

                                 if(var10 != 0) {
                                    var10 = this.field_3518;
                                    if(var3 == null) {
                                       break label134;
                                    }

                                    if(!this.field_3518) {
                                       var1 = 0.0F;
                                       var2 = 0.0F;
                                    }
                                 }
                              }
                           }

                           float var13;
                           var10 = (var13 = this.field_3517 - 0.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
                        }
                     }

                     if(var3 != null) {
                        label135: {
                           if(var10 > 0) {
                              var10 = this.method_4411();
                              if(var3 == null) {
                                 break label135;
                              }

                              if(var10 == 0) {
                                 var10 = this.field_3005;
                                 if(var3 == null) {
                                    break label135;
                                 }

                                 if(this.field_3005) {
                                    label130: {
                                       this.field_2998 = this.method_4436() * (double)this.field_3517;
                                       var10 = this.method_4177(class_1635.field_8498);
                                       if(var3 != null) {
                                          if(var10 != 0) {
                                             this.field_2998 += (double)((float)(this.method_4178(class_1635.field_8498).method_9018() + 1) * 0.1F);
                                          }

                                          this.method_4413(true);
                                          var10000 = this;
                                          if(var3 == null) {
                                             break label130;
                                          }

                                          this.field_3047 = true;
                                          float var14;
                                          var10 = (var14 = var2 - 0.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
                                       }

                                       if(var10 > 0) {
                                          float var4 = class_1715.method_9555(this.field_3000 * 3.1415927F / 180.0F);
                                          float var5 = class_1715.method_9556(this.field_3000 * 3.1415927F / 180.0F);
                                          this.field_2997 += (double)(-0.4F * var4 * this.field_3517);
                                          this.field_2999 += (double)(0.4F * var5 * this.field_3517);
                                          String[] var10001 = field_3529;
                                          this.method_3868("mob.horse.jump", 0.4F, 1.0F);
                                       }

                                       var10000 = this;
                                    }

                                    var10000.field_3517 = 0.0F;
                                 }
                              }
                           }

                           this.field_3025 = 1.0F;
                           this.field_3334 = this.method_4226() * 0.1F;
                           var10 = this.field_2990.field_1832;
                        }
                     }

                     label132: {
                        if(var3 != null) {
                           if(var10 == 0) {
                              this.method_4227((float)this.method_4211(class_1840.field_9393).method_396());
                              super.method_4224(var1, var2);
                           }

                           var10000 = this;
                           if(var3 == null) {
                              break label132;
                           }

                           var10 = this.field_3005;
                        }

                        if(var10 != 0) {
                           this.field_3517 = 0.0F;
                           this.method_4413(false);
                        }

                        this.field_3322 = this.field_3323;
                        var10000 = this;
                     }

                     double var9 = var10000.field_2994 - this.field_2991;
                     double var6 = this.field_2996 - this.field_2993;
                     float var8 = class_1715.method_9558(var9 * var9 + var6 * var6) * 4.0F;
                     if(var3 != null) {
                        if(var8 > 1.0F) {
                           var8 = 1.0F;
                        }

                        this.field_3323 += (var8 - this.field_3323) * 0.4F;
                        this.field_3324 += this.field_3323;
                     }

                     if(var3 != null) {
                        return;
                     }
                  }
               }
            }

            this.field_3025 = 0.5F;
            this.field_3334 = 0.02F;
            var10000 = this;
         }
      }

      var10000.method_4224(var1, var2);
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var2;
      String[] var7;
      add var10;
      label47: {
         super.method_3909(var1);
         var7 = field_3529;
         var1.initGui4("EatingHaystack", this.method_4417());
         var1.initGui4("ChestedHorse", this.method_4414());
         String[] var10000 = class_752.method_4253();
         var1.initGui4("HasReproduced", this.method_4420());
         var1.initGui4("Bred", this.method_4419());
         var1.method_8667("Type", this.method_4400());
         var1.method_8667("Variant", this.method_4402());
         var1.method_8667("Temper", this.method_4426());
         var1.initGui4("Tame", this.method_4406());
         var2 = var10000;
         var1.initGui1("OwnerUUID", this.method_4408());
         class_772 var8 = this;
         if(var2 != null) {
            if(this.method_4414()) {
               class_1580 var9 = new class_1580;
               var9.method_8628();
               class_1580 var3 = var9;
               int var4 = 2;

               while(var4 < this.field_3514.method_83()) {
                  add var5 = this.field_3514.method_84(var4);
                  if(var2 != null) {
                     var10 = var5;
                     if(var2 == null) {
                        break label47;
                     }

                     if(var5 != null) {
                        class_1583 var11 = new class_1583;
                        var11.method_8628();
                        class_1583 var6 = var11;
                        var7 = field_3529;
                        var6.method_8665("Slot", (byte)var4);
                        var5.method_3737(var6);
                        var3.method_8650(var6);
                     }

                     ++var4;
                  }

                  if(var2 == null) {
                     break;
                  }
               }

               var7 = field_3529;
               var1.method_8664("Items", var3);
            }

            var8 = this;
         }

         var10 = var8.field_3514.method_84(1);
      }

      add var10002;
      class_1583 var10003;
      if(var2 != null) {
         if(var10 != null) {
            var7 = field_3529;
            var10002 = this.field_3514.method_84(1);
            var10003 = new class_1583;
            var10003.method_8628();
            var1.method_8664("ArmorItem", var10002.method_3737(var10003));
         }

         var10 = this.field_3514.method_84(0);
      }

      if(var10 != null) {
         String[] var10001 = field_3529;
         var10002 = this.field_3514.method_84(0);
         var10003 = new class_1583;
         var10003.method_8628();
         var1.method_8664("SaddleItem", var10002.method_3737(var10003));
      }

   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var10000 = class_752.method_4253();
      String[] var8 = field_3529;
      this.method_4454(var1.method_8690("EatingHaystack"));
      this.method_4422(var1.method_8690("Bred"));
      String[] var2 = var10000;
      this.method_4423(var1.method_8690("ChestedHorse"));
      this.method_4424(var1.method_8690("HasReproduced"));
      this.method_4399(var1.method_8681("Type"));
      this.method_4401(var1.method_8681("Variant"));
      this.method_4427(var1.method_8681("Temper"));
      class_772 var11 = this;
      if(var2 != null) {
         this.method_4412(var1.method_8690("Tame"));
         if(var1.initGui8("OwnerUUID", 8)) {
            this.method_4409(var1.method_8685("OwnerUUID"));
         }

         var11 = this;
      }

      label98: {
         class_1721 var12 = var11.method_4212();
         var8 = field_3529;
         class_80 var3 = var12.method_9616("Speed");
         class_80 var13 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label98;
            }

            var13 = this.method_4211(class_1840.field_9393);
         }

         var13.method_390(var3.method_389() * 0.25D);
      }

      int var14 = this.method_4414();
      if(var2 != null) {
         label91: {
            if(var14 != 0) {
               var8 = field_3529;
               class_1580 var4 = var1.method_8689("Items", 10);
               this.method_4433();
               int var5 = 0;

               while(var5 < var4.method_8658()) {
                  class_1583 var6 = var4.method_8653(var5);
                  var8 = field_3529;
                  int var7 = var6.initGui9("Slot") & 255;
                  if(var2 != null) {
                     var14 = var7;
                     if(var2 == null) {
                        break label91;
                     }

                     if(var7 >= 2 && var7 < this.field_3514.method_83()) {
                        this.field_3514.method_87(var7, add.method_3727(var6));
                     }

                     ++var5;
                  }

                  if(var2 == null) {
                     break;
                  }
               }
            }

            var8 = field_3529;
            var14 = var1.initGui8("ArmorItem", 10);
         }
      }

      add var10;
      if(var2 != null) {
         label76: {
            class_1583 var15;
            label75: {
               if(var14 != 0) {
                  var8 = field_3529;
                  var15 = var1.method_8688("ArmorItem");
                  if(var2 == null) {
                     break label75;
                  }

                  var10 = add.method_3727(var15);
                  if(var10 != null) {
                     var14 = method_4469(var10.method_3730());
                     if(var2 == null) {
                        break label76;
                     }

                     if(var14 != 0) {
                        this.field_3514.method_87(1, var10);
                     }
                  }
               }

               var15 = var1;
            }

            var8 = field_3529;
            var14 = var15.initGui8("SaddleItem", 10);
         }
      }

      label64: {
         if(var2 != null) {
            if(var14 != 0) {
               var8 = field_3529;
               var10 = add.method_3727(var1.method_8688("SaddleItem"));
               if(var2 == null) {
                  return;
               }

               if(var10 == null || var10.method_3730() != class_1010.field_5187) {
                  break label64;
               }

               this.field_3514.method_87(0, var10);
               if(var2 != null) {
                  break label64;
               }
            }

            String[] var10001 = field_3529;
            var14 = var1.method_8690("Saddle");
         }

         if(var14 != 0) {
            class_1676 var9 = this.field_3514;
            add var10002 = new add;
            var10002.method_3724(class_1010.field_5187);
            var9.method_87(0, var10002);
         }
      }

      this.method_4434();
   }

   // $FF: renamed from: b (wK) boolean
   public boolean method_4383(class_769 var1) {
      String[] var2 = class_752.method_4253();
      class_769 var10000 = var1;
      if(var2 != null) {
         if(var1 == this) {
            return false;
         }

         var10000 = var1;
      }

      if(var2 != null) {
         if(var10000.getClass() != this.getClass()) {
            return false;
         }

         var10000 = var1;
      }

      class_772 var3 = (class_772)var10000;
      boolean var6 = this.method_4453();
      if(var2 != null) {
         if(var6) {
            var6 = var3.method_4453();
            if(var2 == null) {
               return var6;
            }

            if(var6) {
               int var4 = this.method_4400();
               int var5 = var3.method_4400();
               int var7 = var4;
               if(var2 != null) {
                  if(var4 != var5) {
                     label85: {
                        var7 = var4;
                        if(var2 != null) {
                           if(var4 == 0) {
                              var7 = var5;
                              if(var2 == null) {
                                 return (boolean)var7;
                              }

                              if(var5 == 1) {
                                 break label85;
                              }
                           }

                           var7 = var4;
                        }

                        label75: {
                           if(var2 != null) {
                              if(var7 != 1) {
                                 break label75;
                              }

                              var7 = var5;
                           }

                           if(var2 == null) {
                              return (boolean)var7;
                           }

                           if(var7 == 0) {
                              break label85;
                           }
                        }

                        var7 = 0;
                        return (boolean)var7;
                     }
                  }

                  var7 = 1;
               }

               return (boolean)var7;
            }
         }

         var6 = false;
      }

      return var6;
   }

   // $FF: renamed from: b (wJ) wJ
   public class_767 method_4353(class_767 var1) {
      String[] var2;
      class_772 var3;
      class_772 var4;
      int var7;
      int var17;
      label102: {
         label105: {
            var3 = (class_772)var1;
            class_772 var10000 = new class_772;
            var10000.method_3847(this.field_2990);
            var4 = var10000;
            String[] var16 = class_752.method_4253();
            int var5 = this.method_4400();
            var2 = var16;
            int var6 = var3.method_4400();
            var7 = 0;
            var17 = var5;
            if(var2 != null) {
               if(var5 == var6) {
                  var7 = var5;
                  if(var2 != null) {
                     break label105;
                  }
               }

               var17 = var5;
            }

            label94: {
               label106: {
                  if(var2 != null) {
                     if(var17 == 0) {
                        var17 = var6;
                        if(var2 == null) {
                           break label94;
                        }

                        if(var6 == 1) {
                           break label106;
                        }
                     }

                     var17 = var5;
                  }

                  if(var2 == null) {
                     break label102;
                  }

                  if(var17 != 1) {
                     break label105;
                  }

                  var17 = var6;
                  if(var2 == null) {
                     break label102;
                  }

                  if(var6 != 0) {
                     break label105;
                  }
               }

               var17 = 2;
            }

            var7 = var17;
         }

         var17 = var7;
      }

      label107: {
         if(var2 != null) {
            if(var17 != 0) {
               break label107;
            }

            var17 = this.field_3028.nextInt(9);
         }

         int var9;
         label68: {
            label108: {
               int var8 = var17;
               var17 = var8;
               byte var10001 = 4;
               if(var2 != null) {
                  if(var8 < 4) {
                     var9 = this.method_4402() & 255;
                     if(var2 != null) {
                        break label68;
                     }
                  }

                  var17 = var8;
                  if(var2 == null) {
                     break label108;
                  }

                  var10001 = 8;
               }

               if(var17 < var10001) {
                  var9 = var3.method_4402() & 255;
                  if(var2 != null) {
                     break label68;
                  }
               }

               var17 = this.field_3028.nextInt(7);
            }

            var9 = var17;
         }

         label110: {
            int var10 = this.field_3028.nextInt(5);
            var17 = var10;
            int var18 = 2;
            if(var2 != null) {
               if(var10 < 2) {
                  var9 |= this.method_4402() & '\uff00';
                  if(var2 != null) {
                     break label110;
                  }
               }

               var17 = var10;
               var18 = 4;
            }

            if(var2 != null) {
               if(var17 < var18) {
                  var9 |= var3.method_4402() & '\uff00';
                  if(var2 != null) {
                     break label110;
                  }
               }

               var17 = var9;
               var18 = this.field_3028.nextInt(5) << 8 & '\uff00';
            }

            var9 = var17 | var18;
         }

         var4.method_4401(var9);
      }

      var4.method_4399(var7);
      double var14 = this.method_4211(class_1840.field_9390).method_389() + var1.method_4211(class_1840.field_9390).method_389() + (double)this.method_4466();
      var4.method_4211(class_1840.field_9390).method_390(var14 / 3.0D);
      double var15 = this.method_4211(field_3500).method_389() + var1.method_4211(field_3500).method_389() + this.method_4467();
      var4.method_4211(field_3500).method_390(var15 / 3.0D);
      double var12 = this.method_4211(class_1840.field_9393).method_389() + var1.method_4211(class_1840.field_9393).method_389() + this.method_4468();
      var4.method_4211(class_1840.field_9393).method_390(var12 / 3.0D);
      return var4;
   }

   // $FF: renamed from: a (xY) xY
   public class_83 method_4282(class_83 var1) {
      String[] var2;
      Object var3;
      int var5;
      int var6;
      int var9;
      label88: {
         var3 = super.method_4282(var1);
         boolean var4 = false;
         String[] var10000 = class_752.method_4253();
         var5 = 0;
         var2 = var10000;
         var9 = var3 instanceof class_1853;
         if(var2 != null) {
            if(var9 != 0) {
               var6 = ((class_1853)var3).field_9460;
               var5 = ((class_1853)var3).field_9461 & 255 | this.field_3028.nextInt(5) << 8;
               if(var2 != null) {
                  break label88;
               }
            }

            var9 = this.field_3028.nextInt(10);
         }

         label78: {
            if(var2 != null) {
               if(var9 == 0) {
                  var6 = 1;
                  if(var2 != null) {
                     break label78;
                  }
               }

               var9 = this.field_3028.nextInt(7);
            }

            int var7 = var9;
            int var8 = this.field_3028.nextInt(5);
            var6 = 0;
            var5 = var7 | var8 << 8;
         }

         class_1853 var10 = new class_1853;
         var10.method_10041(var6, var5);
         var3 = var10;
      }

      this.method_4399(var6);
      this.method_4401(var5);
      var9 = this.field_3028.nextInt(5);
      if(var2 != null) {
         if(var9 == 0) {
            this.method_4356(-24000);
         }

         var9 = var6;
      }

      byte var10001;
      label70: {
         label69: {
            label89: {
               label90: {
                  var10001 = 4;
                  if(var2 != null) {
                     if(var9 == 4) {
                        break label69;
                     }

                     var9 = var6;
                     if(var2 == null) {
                        break label90;
                     }

                     var10001 = 3;
                  }

                  if(var9 == var10001) {
                     break label69;
                  }

                  this.method_4211(class_1840.field_9390).method_390((double)this.method_4466());
                  if(var2 == null) {
                     break label89;
                  }

                  var9 = var6;
               }

               if(var9 == 0) {
                  this.method_4211(class_1840.field_9393).method_390(this.method_4468());
                  if(var2 != null) {
                     break label70;
                  }
               }

               this.method_4211(class_1840.field_9393).method_390(0.17499999701976776D);
            }

            if(var2 != null) {
               break label70;
            }
         }

         this.method_4211(class_1840.field_9390).method_390(15.0D);
         this.method_4211(class_1840.field_9393).method_390(0.20000000298023224D);
      }

      label48: {
         label47: {
            var9 = var6;
            var10001 = 2;
            if(var2 != null) {
               if(var6 == 2) {
                  break label47;
               }

               var9 = var6;
               var10001 = 1;
            }

            if(var9 != var10001) {
               this.method_4211(field_3500).method_390(this.method_4467());
               if(var2 != null) {
                  break label48;
               }
            }
         }

         this.method_4211(field_3500).method_390(0.5D);
      }

      this.method_4188(this.method_405());
      return (class_83)var3;
   }

   // $FF: renamed from: q (float) float
   public float method_4461(float var1) {
      return this.field_3520 + (this.field_3519 - this.field_3520) * var1;
   }

   // $FF: renamed from: r (float) float
   public float method_4462(float var1) {
      return this.field_3522 + (this.field_3521 - this.field_3522) * var1;
   }

   // $FF: renamed from: s (float) float
   public float method_4463(float var1) {
      return this.field_3524 + (this.field_3523 - this.field_3524) * var1;
   }

   // $FF: renamed from: bk () boolean
   protected boolean method_4225() {
      return true;
   }

   // $FF: renamed from: y (int) void
   public void method_4464(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.method_4437();
      if(var2 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var1;
      }

      label27: {
         label26: {
            if(var2 != null) {
               if(var10000 >= 0) {
                  break label26;
               }

               var10000 = 0;
            }

            var1 = var10000;
            if(var2 != null) {
               break label27;
            }
         }

         this.field_3518 = true;
         this.method_4456();
      }

      if(var1 >= 90) {
         this.field_3517 = 1.0F;
         if(var2 != null) {
            return;
         }
      }

      this.field_3517 = 0.4F + 0.4F * (float)var1 / 90.0F;
   }

   // $FF: renamed from: r (boolean) void
   protected void method_4465(boolean var1) {
      String[] var2 = class_752.method_4253();
      String var10000;
      if(var1) {
         String[] var11 = field_3529;
         var10000 = "heart";
      } else {
         String[] var12 = field_3529;
         var10000 = "smoke";
      }

      String var3 = var10000;
      int var4 = 0;

      while(var4 < 7) {
         double var5 = this.field_3028.nextGaussian() * 0.02D;
         double var7 = this.field_3028.nextGaussian() * 0.02D;
         double var9 = this.field_3028.nextGaussian() * 0.02D;
         this.field_2990.method_2087(var3, this.field_2994 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, this.field_2995 + 0.5D + (double)(this.field_3028.nextFloat() * this.field_3015), this.field_2996 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014, var5, var7, var9);
         ++var4;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      String[] var2 = class_752.method_4253();
      byte var10000 = var1;
      byte var10001 = 7;
      if(var2 != null) {
         if(var1 == 7) {
            this.method_4465(true);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1;
         var10001 = 6;
      }

      if(var10000 == var10001) {
         this.method_4465(false);
         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: ac () void
   public void method_3922() {
      super.method_3922();
      String[] var1 = class_752.method_4253();
      float var10000 = this.field_3522;
      float var10001 = 0.0F;
      if(var1 != null) {
         if(this.field_3522 <= 0.0F) {
            return;
         }

         var10000 = this.field_3330 * 3.1415927F;
         var10001 = 180.0F;
      }

      float var2 = class_1715.method_9555(var10000 / var10001);
      float var3 = class_1715.method_9556(this.field_3330 * 3.1415927F / 180.0F);
      float var4 = 0.7F * this.field_3522;
      float var5 = 0.15F * this.field_3522;
      this.field_2987.method_3854(this.field_2994 + (double)(var4 * var2), this.field_2995 + this.method_3924() + this.field_2987.method_3923() + (double)var5, this.field_2996 - (double)(var4 * var3));
      class_689 var6 = this.field_2987;
      if(var1 != null) {
         if(!(this.field_2987 instanceof class_752)) {
            return;
         }

         var6 = this.field_2987;
      }

      ((class_752)var6).field_3330 = this.field_3330;
   }

   // $FF: renamed from: cr () float
   private float method_4466() {
      return 15.0F + (float)this.field_3028.nextInt(8) + (float)this.field_3028.nextInt(9);
   }

   // $FF: renamed from: cs () double
   private double method_4467() {
      return 0.4000000059604645D + this.field_3028.nextDouble() * 0.2D + this.field_3028.nextDouble() * 0.2D + this.field_3028.nextDouble() * 0.2D;
   }

   // $FF: renamed from: ct () double
   private double method_4468() {
      return (0.44999998807907104D + this.field_3028.nextDouble() * 0.3D + this.field_3028.nextDouble() * 0.3D + this.field_3028.nextDouble() * 0.3D) * 0.25D;
   }

   // $FF: renamed from: b (adb) boolean
   public static boolean method_4469(adb var0) {
      boolean var2;
      label28: {
         String[] var1 = class_752.method_4253();
         adb var10000 = var0;
         adb var10001 = class_1010.field_5265;
         if(var1 != null) {
            if(var0 == class_1010.field_5265) {
               break label28;
            }

            var10000 = var0;
            var10001 = class_1010.field_5266;
         }

         if(var1 != null) {
            if(var10000 == var10001) {
               break label28;
            }

            var10000 = var0;
            var10001 = class_1010.field_5267;
         }

         if(var10000 != var10001) {
            var2 = false;
            return var2;
         }
      }

      var2 = true;
      return var2;
   }

   // $FF: renamed from: h_ () boolean
   public boolean method_4197() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4384() {
      // $FF: Couldn't be decompiled
   }
}
