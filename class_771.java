
// $FF: renamed from: wS
public class class_771 extends class_769 {

   // $FF: renamed from: bG yl
   private final class_1740 field_3496;
   // $FF: renamed from: bH java.lang.String
   private static final String field_3497;
   // $FF: renamed from: ib java.lang.String[]
   private static final String[] field_3498;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.9F, 0.9F);
      this.method_4257().method_9784(true);
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(0, var10002);
      var10000 = this.field_3373;
      class_1756 var2 = new class_1756;
      var2.method_9710(this, 1.25D);
      var10000.method_9766(1, var2);
      var10000 = this.field_3373;
      class_1740 var10003 = new class_1740;
      var10003.method_9675(this, 0.3F);
      var10000.method_9766(2, this.field_3496 = var10003);
      var10000 = this.field_3373;
      class_1741 var3 = new class_1741;
      var3.method_9681(this, 1.0D);
      var10000.method_9766(3, var3);
      var10000 = this.field_3373;
      class_1745 var4 = new class_1745;
      var4.method_9691(this, 1.2D, class_1010.field_5254, false);
      var10000.method_9766(4, var4);
      var10000 = this.field_3373;
      var4 = new class_1745;
      var4.method_9691(this, 1.2D, class_1010.field_5247, false);
      var10000.method_9766(4, var4);
      var10000 = this.field_3373;
      class_1732 var5 = new class_1732;
      var5.method_9662(this, 1.1D);
      var10000.method_9766(5, var5);
      var10000 = this.field_3373;
      class_1753 var6 = new class_1753;
      var6.method_9705(this, 1.0D);
      var10000.method_9766(6, var6);
      var10000 = this.field_3373;
      class_1728 var7 = new class_1728;
      var7.method_9657(this, class_792.class, 6.0F);
      var10000.method_9766(7, var7);
      var10000 = this.field_3373;
      class_1754 var8 = new class_1754;
      var8.method_9706(this);
      var10000.method_9766(8, var8);
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(10.0D);
      this.method_4211(class_1840.field_9393).method_390(0.25D);
   }

   // $FF: renamed from: bn () void
   protected void method_4232() {
      super.method_4232();
   }

   // $FF: renamed from: bE () boolean
   public boolean method_4283() {
      boolean var4;
      label17: {
         String[] var10000 = class_752.method_4253();
         add var2 = ((class_792)this.field_2987).method_4214();
         String[] var1 = var10000;
         add var3 = var2;
         if(var1 != null) {
            if(var2 == null) {
               break label17;
            }

            var3 = var2;
         }

         if(var3.method_3730() == class_1010.field_5254) {
            var4 = true;
            return var4;
         }
      }

      var4 = false;
      return var4;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3498;
      var1.initGui4("Saddle", this.method_4395());
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var10002 = field_3498;
      this.method_4396(var1.method_8690("Saddle"));
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3498;
      return "mob.pig.say";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3498;
      return "mob.pig.say";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3498;
      return "mob.pig.death";
   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      String[] var10001 = field_3498;
      this.method_3868("mob.pig.step", 0.15F, 1.0F);
   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = super.method_4295(var1);
      if(var2 != null) {
         if(var10000) {
            return true;
         }

         var10000 = this.method_4395();
      }

      if(var2 != null) {
         if(var10000) {
            var10000 = this.field_2990.field_1832;
            if(var2 == null) {
               return var10000;
            }

            if(!this.field_2990.field_1832) {
               label30: {
                  label29: {
                     class_689 var3 = this.field_2987;
                     if(var2 != null) {
                        if(this.field_2987 == null) {
                           break label29;
                        }

                        var3 = this.field_2987;
                     }

                     if(var3 != var1) {
                        break label30;
                     }
                  }

                  var1.method_3925(this);
                  return true;
               }
            }
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return this.method_3936()?class_1010.field_5178:class_1010.field_5177;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      int var4 = this.field_3028.nextInt(3) + 1 + this.field_3028.nextInt(1 + var2);
      String[] var3 = class_752.method_4253();
      int var5 = 0;

      class_771 var10000;
      label44: {
         boolean var6;
         while(true) {
            if(var5 < var4) {
               label34: {
                  var10000 = this;
                  if(var3 != null) {
                     var6 = this.method_3936();
                     if(var3 == null) {
                        break;
                     }

                     if(var6) {
                        this.method_3914(class_1010.field_5178, 1);
                        if(var3 != null) {
                           break label34;
                        }
                     }

                     var10000 = this;
                  }

                  var10000.method_3914(class_1010.field_5177, 1);
               }

               ++var5;
               if(var3 != null) {
                  continue;
               }
            }

            var10000 = this;
            if(var3 == null) {
               break label44;
            }

            var6 = this.method_4395();
            break;
         }

         if(!var6) {
            return;
         }

         var10000 = this;
      }

      var10000.method_3914(class_1010.field_5187, 1);
   }

   // $FF: renamed from: a () boolean
   public boolean method_4395() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(16) & 1;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (boolean) void
   public void method_4396(boolean var1) {
      label16: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(!var1) {
               break label16;
            }

            this.field_3036.method_9506(16, Byte.valueOf((byte)1));
         }

         if(var2 != null) {
            return;
         }
      }

      this.field_3036.method_9506(16, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: a (xn) void
   public void method_3951(class_703 var1) {
      if(!this.field_2990.field_1832) {
         class_782 var10000 = new class_782;
         var10000.method_3847(this.field_2990);
         class_782 var2 = var10000;
         add var10002 = new add;
         var10002.method_3724(class_1010.field_5141);
         var2.method_3935(0, var10002);
         var2.method_3887(this.field_2994, this.field_2995, this.field_2996, this.field_3000, this.field_3001);
         this.field_2990.method_2089(var2);
         this.method_3851();
      }

   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {
      class_689 var4;
      label24: {
         String[] var10000 = class_752.method_4253();
         super.method_3874(var1);
         String[] var2 = var10000;
         float var5;
         int var3 = (var5 = var1 - 5.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
         if(var2 != null) {
            if(var3 <= 0) {
               return;
            }

            var4 = this.field_2987;
            if(var2 == null) {
               break label24;
            }

            var3 = this.field_2987 instanceof class_792;
         }

         if(var3 == 0) {
            return;
         }

         var4 = this.field_2987;
      }

      ((class_792)var4).method_4614(class_1600.field_8345);
   }

   // $FF: renamed from: a (wJ) wS
   public class_771 method_4397(class_767 var1) {
      class_771 var10000 = new class_771;
      var10000.method_3847(this.field_2990);
      return var10000;
   }

   // $FF: renamed from: d (add) boolean
   public boolean method_4378(add var1) {
      boolean var3;
      label17: {
         String[] var2 = class_752.method_4253();
         add var10000 = var1;
         if(var2 != null) {
            if(var1 == null) {
               break label17;
            }

            var10000 = var1;
         }

         if(var10000.method_3730() == class_1010.field_5247) {
            var3 = true;
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: b () yl
   public class_1740 method_4398() {
      return this.field_3496;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4384() {
      // $FF: Couldn't be decompiled
   }
}
