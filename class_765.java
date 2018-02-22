
// $FF: renamed from: wX
public class class_765 extends class_764 {

   // $FF: renamed from: bA int
   private int field_3458;
   // $FF: renamed from: bB za
   class_1849 field_3459;
   // $FF: renamed from: bC int
   private int field_3460;
   // $FF: renamed from: bD int
   private int field_3461;
   // $FF: renamed from: bE java.lang.String
   private static final String field_3462;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3463;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(1.4F, 2.9F);
      this.method_4257().method_9784(true);
      class_1776 var10000 = this.field_3373;
      class_1764 var10002 = new class_1764;
      var10002.method_9727(this, 1.0D, true);
      var10000.method_9766(1, var10002);
      var10000 = this.field_3373;
      class_1760 var4 = new class_1760;
      var4.method_9718(this, 0.9D, 32.0F);
      var10000.method_9766(2, var4);
      var10000 = this.field_3373;
      class_1762 var5 = new class_1762;
      var5.method_9720(this, 0.6D, true);
      var10000.method_9766(3, var5);
      var10000 = this.field_3373;
      class_1761 var6 = new class_1761;
      var6.method_9719(this, 1.0D);
      var10000.method_9766(4, var6);
      var10000 = this.field_3373;
      class_1757 var7 = new class_1757;
      var7.method_9711(this);
      var10000.method_9766(5, var7);
      var10000 = this.field_3373;
      class_1753 var8 = new class_1753;
      var8.method_9705(this, 0.6D);
      var10000.method_9766(6, var8);
      var10000 = this.field_3373;
      class_1728 var9 = new class_1728;
      var9.method_9657(this, class_792.class, 6.0F);
      var10000.method_9766(7, var9);
      var10000 = this.field_3373;
      class_1754 var10 = new class_1754;
      var10.method_9706(this);
      var10000.method_9766(8, var10);
      var10000 = this.field_3374;
      class_1768 var11 = new class_1768;
      var11.method_9737(this);
      var10000.method_9766(1, var11);
      var10000 = this.field_3374;
      class_1767 var2 = new class_1767;
      var2.method_9732(this, false);
      var10000.method_9766(2, var2);
      var10000 = this.field_3374;
      class_1771 var3 = new class_1771;
      var3.method_9742(this, class_753.class, 0, false, true, class_10.field_0);
      var10000.method_9766(3, var3);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: bp () void
   protected void method_4235() {
      String[] var1 = class_752.method_4253();
      class_765 var10000 = this;
      if(var1 != null) {
         if(--this.field_3458 <= 0) {
            label18: {
               this.field_3458 = 70 + this.field_3028.nextInt(50);
               this.field_3459 = this.field_2990.field_1827.method_6780(class_1715.method_9561(this.field_2994), class_1715.method_9561(this.field_2995), class_1715.method_9561(this.field_2996), 32);
               class_1849 var3 = this.field_3459;
               if(var1 != null) {
                  if(this.field_3459 == null) {
                     this.method_4342();
                     if(var1 != null) {
                        break label18;
                     }
                  }

                  var3 = this.field_3459;
               }

               class_1661 var2 = var3.method_10003();
               this.method_4339(var2.field_8646, var2.field_8647, var2.field_8648, (int)((float)this.field_3459.method_10004() * 0.6F));
            }
         }

         var10000 = this;
      }

      var10000.method_4235();
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(100.0D);
      this.method_4211(class_1840.field_9393).method_390(0.25D);
   }

   // $FF: renamed from: j (int) int
   protected int method_4162(int var1) {
      return var1;
   }

   // $FF: renamed from: o (sa) void
   protected void method_4234(class_689 var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         class_765 var10000;
         label17: {
            if(var1 instanceof class_10) {
               var10000 = this;
               if(var2 == null) {
                  break label17;
               }

               if(this.method_4165().nextInt(20) == 0) {
                  this.method_4260((class_752)var1);
               }
            }

            var10000 = this;
         }

         var10000.method_4234(var1);
      }

   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var10000 = class_752.method_4253();
      super.method_4231();
      String[] var1 = var10000;
      int var6 = this.field_3460;
      if(var1 != null) {
         if(this.field_3460 > 0) {
            --this.field_3460;
         }

         var6 = this.field_3461;
      }

      if(var1 != null) {
         if(var6 > 0) {
            --this.field_3461;
         }

         double var8;
         var6 = (var8 = this.field_2997 * this.field_2997 + this.field_2999 * this.field_2999 - 2.500000277905201E-7D) == 0.0D?0:(var8 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var6 <= 0) {
            return;
         }

         var6 = this.field_3028.nextInt(5);
      }

      if(var1 != null) {
         if(var6 != 0) {
            return;
         }

         var6 = class_1715.method_9561(this.field_2994);
      }

      int var2 = var6;
      int var3 = class_1715.method_9561(this.field_2995 - 0.20000000298023224D - (double)this.field_3013);
      int var4 = class_1715.method_9561(this.field_2996);
      aji var5 = this.field_2990.getBlock(var2, var3, var4);
      if(var5.method_2424() != awt.field_4170) {
         ahb var7 = this.field_2990;
         StringBuilder var10001 = new StringBuilder();
         String[] var10002 = field_3463;
         var7.method_2087(var10001.append("blockcrack_").append(aji.method_2415(var5)).append("_").append(this.field_2990.method_33(var2, var3, var4)).toString(), this.field_2994 + ((double)this.field_3028.nextFloat() - 0.5D) * (double)this.field_3014, this.field_3004.field_6910 + 0.1D, this.field_2996 + ((double)this.field_3028.nextFloat() - 0.5D) * (double)this.field_3014, 4.0D * ((double)this.field_3028.nextFloat() - 0.5D), 0.5D, ((double)this.field_3028.nextFloat() - 0.5D) * 4.0D);
      }

   }

   // $FF: renamed from: a (java.lang.Class) boolean
   public boolean method_4261(Class var1) {
      String[] var2 = class_752.method_4253();
      class_765 var10000 = this;
      boolean var3;
      if(var2 != null) {
         if(this.method_4350()) {
            var3 = class_792.class.isAssignableFrom(var1);
            if(var2 == null) {
               return var3;
            }

            if(var3) {
               var3 = false;
               return var3;
            }
         }

         var10000 = this;
      }

      var3 = var10000.method_4261(var1);
      return var3;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var10001 = field_3463;
      var1.initGui4("PlayerCreated", this.method_4350());
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var10002 = field_3463;
      this.method_4351(var1.method_8690("PlayerCreated"));
   }

   // $FF: renamed from: n (sa) boolean
   public boolean method_4228(class_689 var1) {
      this.field_3460 = 10;
      String[] var2 = class_752.method_4253();
      this.field_2990.method_2191(this, (byte)4);
      boolean var3 = var1.method_3896(class_1691.method_9324(this), (float)(7 + this.field_3028.nextInt(15)));
      boolean var10000 = var3;
      if(var2 != null) {
         if(var3) {
            var1.field_2998 += 0.4000000059604645D;
         }

         String[] var10001 = field_3463;
         this.method_3868("mob.irongolem.throw", 1.0F, 1.0F);
         var10000 = var3;
      }

      return var10000;
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      String[] var2 = class_752.method_4253();
      byte var10000 = var1;
      byte var10001 = 4;
      if(var2 != null) {
         if(var1 == 4) {
            this.field_3460 = 10;
            String[] var3 = field_3463;
            this.method_3868("mob.irongolem.throw", 1.0F, 1.0F);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1;
         var10001 = 11;
      }

      if(var10000 == var10001) {
         this.field_3461 = 400;
         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: a () za
   public class_1849 method_4346() {
      return this.field_3459;
   }

   // $FF: renamed from: b () int
   public int method_4347() {
      return this.field_3460;
   }

   // $FF: renamed from: i (boolean) void
   public void method_4348(boolean var1) {
      String[] var2 = class_752.method_4253();
      int var10001 = var1;
      if(var2 != null) {
         var10001 = var1 != 0?400:0;
      }

      this.field_3461 = var10001;
      this.field_2990.method_2191(this, (byte)11);
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3463;
      return "mob.irongolem.hit";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3463;
      return "mob.irongolem.death";
   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      String[] var10001 = field_3463;
      this.method_3868("mob.irongolem.walk", 1.0F, 1.0F);
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      int var4 = this.field_3028.nextInt(3);
      String[] var3 = class_752.method_4253();
      int var5 = 0;

      while(true) {
         if(var5 < var4) {
            this.method_3915(adb.method_2920(class_1192.field_6065), 1, 0.0F);
            ++var5;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var5 = 3 + this.field_3028.nextInt(3);
         break;
      }

      int var6 = 0;

      while(var6 < var5) {
         this.method_3914(class_1010.field_5123, 1);
         ++var6;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a8 () int
   public int method_4349() {
      return this.field_3461;
   }

   // $FF: renamed from: a9 () boolean
   public boolean method_4350() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(16) & 1;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: j (boolean) void
   public void method_4351(boolean var1) {
      byte var3;
      label16: {
         String[] var10000 = class_752.method_4253();
         var3 = this.field_3036.method_9499(16);
         String[] var2 = var10000;
         if(var2 != null) {
            if(!var1) {
               break label16;
            }

            this.field_3036.method_9506(16, Byte.valueOf((byte)(var3 | 1)));
         }

         if(var2 != null) {
            return;
         }
      }

      this.field_3036.method_9506(16, Byte.valueOf((byte)(var3 & -2)));
   }

   // $FF: renamed from: a (vX) void
   public void method_4190(class_1691 var1) {
      String[] var2 = class_752.method_4253();
      class_765 var10000 = this;
      if(var2 != null) {
         label21: {
            if(!this.method_4350()) {
               var10000 = this;
               if(var2 == null) {
                  break label21;
               }

               if(this.field_3335 != null) {
                  var10000 = this;
                  if(var2 == null) {
                     break label21;
                  }

                  if(this.field_3459 != null) {
                     this.field_3459.method_10023(this.field_3335.method_64(), -5);
                  }
               }
            }

            var10000 = this;
         }
      }

      var10000.method_4190(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4352() {
      // $FF: Couldn't be decompiled
   }
}
