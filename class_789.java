
// $FF: renamed from: w3
public class class_789 extends class_779 {

   // $FF: renamed from: bB int
   private int field_3595;
   // $FF: renamed from: bC int
   private int field_3596;
   // $FF: renamed from: bD int
   private int field_3597;
   // $FF: renamed from: bE int
   private int field_3598;
   // $FF: renamed from: bF java.lang.String
   private static final String field_3599;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3600;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3597 = 30;
      this.field_3598 = 3;
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(1, var10002);
      var10000 = this.field_3373;
      class_1747 var2 = new class_1747;
      var2.method_9695(this);
      var10000.method_9766(2, var2);
      var10000 = this.field_3373;
      class_1743 var3 = new class_1743;
      var3.method_9687(this, class_778.class, 6.0F, 1.0D, 1.2D);
      var10000.method_9766(3, var3);
      var10000 = this.field_3373;
      class_1764 var4 = new class_1764;
      var4.method_9727(this, 1.0D, false);
      var10000.method_9766(4, var4);
      var10000 = this.field_3373;
      class_1753 var5 = new class_1753;
      var5.method_9705(this, 0.8D);
      var10000.method_9766(5, var5);
      var10000 = this.field_3373;
      class_1728 var6 = new class_1728;
      var6.method_9657(this, class_792.class, 8.0F);
      var10000.method_9766(6, var6);
      var10000 = this.field_3373;
      class_1754 var7 = new class_1754;
      var7.method_9706(this);
      var10000.method_9766(6, var7);
      var10000 = this.field_3374;
      class_1771 var8 = new class_1771;
      var8.method_9740(this, class_792.class, 0, true);
      var10000.method_9766(1, var8);
      var10000 = this.field_3374;
      class_1767 var9 = new class_1767;
      var9.method_9732(this, false);
      var10000.method_9766(2, var9);
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9393).method_390(0.25D);
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: ax () int
   public int method_3967() {
      return this.method_4259() == null?3:3 + (int)(this.method_406() - 1.0F);
   }

   // $FF: renamed from: b (float) void
   protected void method_3874(float var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3874(var1);
      this.field_3596 = (int)((float)this.field_3596 + var1 * 1.5F);
      String[] var2 = var10000;
      class_789 var3 = this;
      if(var2 != null) {
         if(this.field_3596 <= this.field_3597 - 5) {
            return;
         }

         var3 = this;
      }

      var3.field_3596 = this.field_3597 - 5;
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, Byte.valueOf((byte)-1));
      this.field_3036.method_9497(17, Byte.valueOf((byte)0));
      this.field_3036.method_9497(18, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3909(var1);
      String[] var2 = var10000;
      if(var2 != null) {
         String[] var3;
         if(this.field_3036.method_9499(17) == 1) {
            var3 = field_3600;
            var1.initGui4("powered", true);
         }

         var3 = field_3600;
         var1.method_8666("Fuse", (short)this.field_3597);
         var1.method_8665("ExplosionRadius", (byte)this.field_3598);
         var1.initGui4("ignited", this.method_4536());
      }

   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3908(var1);
      String[] var2 = var10000;
      class_1710 var4 = this.field_3036;
      String[] var3 = field_3600;
      int var10002 = var1.method_8690("powered");
      if(var2 != null) {
         var10002 = var10002 != 0?1:0;
      }

      var4.method_9506(17, Byte.valueOf((byte)var10002));
      var3 = field_3600;
      boolean var5 = var1.initGui8("Fuse", 99);
      if(var2 != null) {
         if(var5) {
            this.field_3597 = var1.method_8680("Fuse");
         }

         var3 = field_3600;
         var5 = var1.initGui8("ExplosionRadius", 99);
      }

      if(var2 != null) {
         if(var5) {
            var3 = field_3600;
            this.field_3598 = var1.initGui9("ExplosionRadius");
         }

         String[] var10001 = field_3600;
         var5 = var1.method_8690("ignited");
      }

      if(var5) {
         this.method_4537();
      }

   }

   // $FF: renamed from: h () void
   public void method_3856() {
      String[] var1 = class_752.method_4253();
      class_789 var10000 = this;
      if(var1 != null) {
         label46: {
            if(this.method_3917()) {
               this.field_3595 = this.field_3596;
               int var3 = this.method_4536();
               if(var1 != null) {
                  if(var3 != 0) {
                     this.method_4534(1);
                  }

                  var3 = this.method_4533();
               }

               int var2 = var3;
               var3 = var2;
               if(var1 != null) {
                  label35: {
                     if(var2 > 0) {
                        var3 = this.field_3596;
                        if(var1 == null) {
                           break label35;
                        }

                        if(this.field_3596 == 0) {
                           String[] var10001 = field_3600;
                           this.method_3868("creeper.primed", 1.0F, 0.5F);
                        }
                     }

                     this.field_3596 += var2;
                     var3 = this.field_3596;
                  }
               }

               if(var1 != null) {
                  if(var3 < 0) {
                     this.field_3596 = 0;
                  }

                  var10000 = this;
                  if(var1 == null) {
                     break label46;
                  }

                  var3 = this.field_3596;
               }

               if(var3 >= this.field_3597) {
                  this.field_3596 = this.field_3597;
                  this.method_4535();
               }
            }

            var10000 = this;
         }
      }

      var10000.method_3856();
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3600;
      return "mob.creeper.say";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3600;
      return "mob.creeper.death";
   }

   // $FF: renamed from: a (vX) void
   public void method_4190(class_1691 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_4190(var1);
      String[] var2 = var10000;
      int var6 = var1.method_9345() instanceof class_786;
      if(var2 != null) {
         if(var6 == 0) {
            return;
         }

         var6 = adb.method_2918(class_1010.field_5271);
      }

      int var3 = var6;
      int var4 = adb.method_2918(class_1010.field_5282);
      int var5 = var3 + this.field_3028.nextInt(var4 - var3 + 1);
      this.method_3914(adb.method_2919(var5), 1);
   }

   // $FF: renamed from: n (sa) boolean
   public boolean method_4228(class_689 var1) {
      return true;
   }

   // $FF: renamed from: b () boolean
   public boolean method_4531() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(17);
      if(var1 != null) {
         var10000 = var10000 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: o (float) float
   public float method_4532(float var1) {
      return ((float)this.field_3595 + (float)(this.field_3596 - this.field_3595) * var1) / (float)(this.field_3597 - 2);
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5147;
   }

   // $FF: renamed from: a8 () int
   public int method_4533() {
      return this.field_3036.method_9499(16);
   }

   // $FF: renamed from: c (int) void
   public void method_4534(int var1) {
      this.field_3036.method_9506(16, Byte.valueOf((byte)var1));
   }

   // $FF: renamed from: a (xn) void
   public void method_3951(class_703 var1) {
      super.method_3951(var1);
      this.field_3036.method_9506(17, Byte.valueOf((byte)1));
   }

   // $FF: renamed from: a (yz) boolean
   protected boolean method_4295(class_792 var1) {
      boolean var5;
      label22: {
         String[] var10000 = class_752.method_4253();
         add var3 = var1.field_3616.method_3593();
         String[] var2 = var10000;
         add var4 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label22;
            }

            var4 = var3;
         }

         if(var4.method_3730() == class_1010.field_5117) {
            double var10001 = this.field_2994 + 0.5D;
            double var10002 = this.field_2995 + 0.5D;
            double var10003 = this.field_2996 + 0.5D;
            String[] var10004 = field_3600;
            this.field_2990.method_2084(var10001, var10002, var10003, "fire.ignite", 1.0F, this.field_3028.nextFloat() * 0.4F + 0.8F);
            var1.method_4209();
            var5 = this.field_2990.field_1832;
            if(var2 == null) {
               return var5;
            }

            if(!this.field_2990.field_1832) {
               this.method_4537();
               var3.method_3749(1, var1);
               return true;
            }
         }
      }

      var5 = super.method_4295(var1);
      return var5;
   }

   // $FF: renamed from: a9 () void
   private void method_4535() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_2990.field_1832;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         class_1038 var3 = this.field_2990.method_2196();
         String[] var10001 = field_3600;
         var10000 = var3.method_5878("mobGriefing");
      }

      label19: {
         boolean var2 = var10000;
         class_789 var4 = this;
         if(var1 != null) {
            if(this.method_4531()) {
               this.field_2990.method_2125(this, this.field_2994, this.field_2995, this.field_2996, (float)(this.field_3598 * 2), var2);
               if(var1 != null) {
                  break label19;
               }
            }

            var4 = this;
         }

         var4.field_2990.method_2125(this, this.field_2994, this.field_2995, this.field_2996, (float)this.field_3598, var2);
      }

      this.method_3851();
   }

   // $FF: renamed from: a_ () boolean
   public boolean method_4536() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(18);
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: bw () void
   public void method_4537() {
      this.field_3036.method_9506(18, Byte.valueOf((byte)1));
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
