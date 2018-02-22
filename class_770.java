import java.util.Random;

// $FF: renamed from: wT
public class class_770 extends class_769 {

   // $FF: renamed from: bG aO
   private final class_897 field_3490;
   // $FF: renamed from: bH float[][]
   public static final float[][] field_3491;
   // $FF: renamed from: bI int
   private int field_3492;
   // $FF: renamed from: bJ yq
   private class_1736 field_3493;
   // $FF: renamed from: bK java.lang.String
   private static final String field_3494;
   // $FF: renamed from: ib java.lang.String[]
   private static final String[] field_3495;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      class_897 var10001 = new class_897;
      class_676 var10003 = new class_676;
      var10003.method_3692(this);
      var10001.method_5202(var10003, 2, 1);
      this.field_3490 = var10001;
      class_1736 var2 = new class_1736;
      var2.method_9668(this);
      this.field_3493 = var2;
      this.method_3852(0.9F, 1.3F);
      this.method_4257().method_9784(true);
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(0, var10002);
      var10000 = this.field_3373;
      class_1756 var3 = new class_1756;
      var3.method_9710(this, 1.25D);
      var10000.method_9766(1, var3);
      var10000 = this.field_3373;
      class_1741 var4 = new class_1741;
      var4.method_9681(this, 1.0D);
      var10000.method_9766(2, var4);
      var10000 = this.field_3373;
      class_1745 var6 = new class_1745;
      var6.method_9691(this, 1.1D, class_1010.field_5154, false);
      var10000.method_9766(3, var6);
      var10000 = this.field_3373;
      class_1732 var7 = new class_1732;
      var7.method_9662(this, 1.1D);
      var10000.method_9766(4, var7);
      this.field_3373.method_9766(5, this.field_3493);
      var10000 = this.field_3373;
      class_1753 var8 = new class_1753;
      var8.method_9705(this, 1.0D);
      var10000.method_9766(6, var8);
      var10000 = this.field_3373;
      class_1728 var9 = new class_1728;
      var9.method_9657(this, class_792.class, 6.0F);
      var10000.method_9766(7, var9);
      var10000 = this.field_3373;
      class_1754 var10 = new class_1754;
      var10.method_9706(this);
      var10000.method_9766(8, var10);
      class_897 var5 = this.field_3490;
      add var11 = new add;
      var11.method_3726(class_1010.field_5208, 1, 0);
      var5.method_87(0, var11);
      var5 = this.field_3490;
      var11 = new add;
      var11.method_3726(class_1010.field_5208, 1, 0);
      var5.method_87(1, var11);
   }

   // $FF: renamed from: bk () boolean
   protected boolean method_4225() {
      return true;
   }

   // $FF: renamed from: bn () void
   protected void method_4232() {
      this.field_3492 = this.field_3493.method_9669();
      super.method_4232();
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var1 = class_752.method_4253();
      class_770 var10000 = this;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            this.field_3492 = Math.max(0, this.field_3492 - 1);
         }

         var10000 = this;
      }

      var10000.method_4231();
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(8.0D);
      this.method_4211(class_1840.field_9393).method_390(0.23000000417232513D);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, new Byte((byte)0));
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_770 var10000 = this;
      if(var3 != null) {
         if(this.method_4389()) {
            return;
         }

         var10000 = this;
      }

      add var10001 = new add;
      var10001.method_3726(adb.method_2920(class_1192.field_6062), 1, this.method_4387());
      var10000.method_3916(var10001, 0.0F);
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return adb.method_2920(class_1192.field_6062);
   }

   // $FF: renamed from: a (byte) void
   public void method_3932(byte var1) {
      label16: {
         String[] var2 = class_752.method_4253();
         if(var2 != null) {
            if(var1 != 10) {
               break label16;
            }

            this.field_3492 = 40;
         }

         if(var2 != null) {
            return;
         }
      }

      super.method_3932(var1);
   }

   // $FF: renamed from: q (float) float
   public float method_4385(float var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_3492;
      float var3;
      if(var2 != null) {
         if(this.field_3492 <= 0) {
            var3 = 0.0F;
            return var3;
         }

         var10000 = this.field_3492;
      }

      byte var10001 = 4;
      if(var2 != null) {
         label31: {
            if(var10000 >= 4) {
               var10000 = this.field_3492;
               var10001 = 36;
               if(var2 == null) {
                  break label31;
               }

               if(this.field_3492 <= 36) {
                  var3 = 1.0F;
                  return var3;
               }
            }

            var10000 = this.field_3492;
            var10001 = 4;
         }
      }

      if(var2 != null) {
         if(var10000 < var10001) {
            var3 = ((float)this.field_3492 - var1) / 4.0F;
            return var3;
         }

         var10000 = this.field_3492;
         var10001 = 40;
      }

      var3 = -((float)(var10000 - var10001) - var1) / 4.0F;
      return var3;
   }

   // $FF: renamed from: r (float) float
   public float method_4386(float var1) {
      class_770 var4;
      float var5;
      label32: {
         String[] var2 = class_752.method_4253();
         int var10000 = this.field_3492;
         if(var2 != null) {
            label33: {
               if(this.field_3492 > 4) {
                  var10000 = this.field_3492;
                  if(var2 == null) {
                     break label33;
                  }

                  if(this.field_3492 <= 36) {
                     float var3 = ((float)(this.field_3492 - 4) - var1) / 32.0F;
                     return 0.62831855F + 0.2199115F * class_1715.method_9555(var3 * 28.7F);
                  }
               }

               var4 = this;
               if(var2 == null) {
                  break label32;
               }

               var10000 = this.field_3492;
            }
         }

         if(var10000 > 0) {
            var5 = 0.62831855F;
            return var5;
         }

         var4 = this;
      }

      var5 = var4.field_3001 / 57.295776F;
      return var5;
   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      boolean var7;
      label49: {
         add var3 = var1.field_3616.method_3593();
         String[] var2 = class_752.method_4253();
         add var10000 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label49;
            }

            var10000 = var3;
         }

         if(var10000.method_3730() == class_1010.field_5216) {
            var7 = this.method_4389();
            if(var2 == null) {
               return var7;
            }

            if(!var7) {
               var7 = this.method_4159();
               if(var2 == null) {
                  return var7;
               }

               if(!var7) {
                  class_770 var9 = this;
                  if(var2 != null) {
                     label33: {
                        if(!this.field_2990.field_1832) {
                           this.method_4390(true);
                           int var4 = 1 + this.field_3028.nextInt(3);
                           int var5 = 0;

                           while(var5 < var4) {
                              add var10001 = new add;
                              var10001.method_3726(adb.method_2920(class_1192.field_6062), 1, this.method_4387());
                              class_699 var6 = this.method_3916(var10001, 1.0F);
                              var6.field_2998 += (double)(this.field_3028.nextFloat() * 0.05F);
                              var6.field_2997 += (double)((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.1F);
                              var6.field_2999 += (double)((this.field_3028.nextFloat() - this.field_3028.nextFloat()) * 0.1F);
                              ++var5;
                              if(var2 == null) {
                                 break label33;
                              }

                              if(var2 == null) {
                                 break;
                              }
                           }
                        }

                        var3.method_3749(1, var1);
                     }

                     var9 = this;
                  }

                  String[] var8 = field_3495;
                  var9.method_3868("mob.sheep.shear", 1.0F, 1.0F);
               }
            }
         }
      }

      var7 = super.method_4295(var1);
      return var7;
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      super.method_3909(var1);
      String[] var2 = field_3495;
      var1.initGui4("Sheared", this.method_4389());
      var1.method_8665("Color", (byte)this.method_4387());
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      super.method_3908(var1);
      String[] var2 = field_3495;
      this.method_4390(var1.method_8690("Sheared"));
      this.method_4388(var1.initGui9("Color"));
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3495;
      return "mob.sheep.say";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3495;
      return "mob.sheep.say";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3495;
      return "mob.sheep.say";
   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      String[] var10001 = field_3495;
      this.method_3868("mob.sheep.step", 0.15F, 1.0F);
   }

   // $FF: renamed from: a () int
   public int method_4387() {
      return this.field_3036.method_9499(16) & 15;
   }

   // $FF: renamed from: a (int) void
   public void method_4388(int var1) {
      byte var2 = this.field_3036.method_9499(16);
      this.field_3036.method_9506(16, Byte.valueOf((byte)(var2 & 240 | var1 & 15)));
   }

   // $FF: renamed from: b () boolean
   public boolean method_4389() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(16) & 16;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (boolean) void
   public void method_4390(boolean var1) {
      byte var3;
      label16: {
         String[] var10000 = class_752.method_4253();
         var3 = this.field_3036.method_9499(16);
         String[] var2 = var10000;
         if(var2 != null) {
            if(!var1) {
               break label16;
            }

            this.field_3036.method_9506(16, Byte.valueOf((byte)(var3 | 16)));
         }

         if(var2 != null) {
            return;
         }
      }

      this.field_3036.method_9506(16, Byte.valueOf((byte)(var3 & -17)));
   }

   // $FF: renamed from: b (java.util.Random) int
   public static int method_4391(Random var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = var0.nextInt(100);
      String[] var1 = var10000;
      int var3 = var2;
      byte var10001 = 5;
      if(var1 != null) {
         if(var2 < 5) {
            var3 = 15;
            return var3;
         }

         var3 = var2;
         var10001 = 10;
      }

      if(var1 != null) {
         if(var3 < var10001) {
            var3 = 7;
            return var3;
         }

         var3 = var2;
         var10001 = 15;
      }

      label51: {
         if(var1 != null) {
            if(var3 < var10001) {
               var3 = 8;
               return var3;
            }

            var3 = var2;
            if(var1 == null) {
               break label51;
            }

            var10001 = 18;
         }

         if(var3 < var10001) {
            var3 = 12;
            return var3;
         }

         var3 = var0.nextInt(500);
      }

      if(var1 != null) {
         var3 = var3 == 0?6:0;
      }

      return var3;
   }

   // $FF: renamed from: a (wJ) wT
   public class_770 method_4392(class_767 var1) {
      class_770 var2 = (class_770)var1;
      class_770 var10000 = new class_770;
      var10000.method_3847(this.field_2990);
      class_770 var3 = var10000;
      int var4 = this.method_4393(this, var2);
      var3.method_4388(15 - var4);
      return var3;
   }

   // $FF: renamed from: p () void
   public void method_4262() {
      this.method_4390(false);
      String[] var1 = class_752.method_4253();
      class_770 var10000 = this;
      if(var1 != null) {
         if(!this.method_4159()) {
            return;
         }

         var10000 = this;
      }

      var10000.method_4355(60);
   }

   // $FF: renamed from: a (xY) xY
   public class_83 method_4282(class_83 var1) {
      var1 = super.method_4282(var1);
      this.method_4388(method_4391(this.field_2990.field_1819));
      return var1;
   }

   // $FF: renamed from: b (wK, wK) int
   private int method_4393(class_769 var1, class_769 var2) {
      String[] var3;
      int var4;
      int var5;
      int var7;
      label36: {
         var4 = this.method_4394(var1);
         String[] var10000 = class_752.method_4253();
         var5 = this.method_4394(var2);
         var3 = var10000;
         this.field_3490.method_84(0).method_3746(var4);
         this.field_3490.method_84(1).method_3746(var5);
         add var6 = class_1031.method_5835().method_5839(this.field_3490, ((class_770)var1).field_2990);
         add var8 = var6;
         if(var3 != null) {
            if(var6 == null) {
               break label36;
            }

            var8 = var6;
         }

         if(var3 != null) {
            if(var8.method_3730() != class_1010.field_5208) {
               break label36;
            }

            var8 = var6;
         }

         var7 = var8.method_3745();
         if(var3 != null) {
            return var7;
         }
      }

      int var9 = this.field_2990.field_1819.nextBoolean();
      if(var3 != null) {
         var9 = var9 != 0?var4:var5;
      }

      var7 = var9;
      return var7;
   }

   // $FF: renamed from: c (wK) int
   private int method_4394(class_769 var1) {
      return 15 - ((class_770)var1).method_4387();
   }

   // $FF: renamed from: <clinit> () void
   static void method_4384() {
      // $FF: Couldn't be decompiled
   }
}
