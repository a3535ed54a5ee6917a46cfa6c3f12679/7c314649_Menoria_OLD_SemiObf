
// $FF: renamed from: yn
public class class_784 extends class_779 {

   private static final String __OBFID;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3588;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(1.4F, 0.9F);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(16, new Byte((byte)0));
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      super.method_3856();
      String[] var1 = class_752.method_4253();
      class_784 var10000 = this;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this;
      }

      var10000.method_4527(this.field_3006);
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(16.0D);
      this.method_4211(class_1840.field_9393).method_390(0.800000011920929D);
   }

   // $FF: renamed from: bR () sa
   protected class_689 method_4332() {
      float var1 = this.method_3884(1.0F);
      if(var1 < 0.5F) {
         double var2 = 16.0D;
         return this.field_2990.method_2176(this, var2);
      } else {
         return null;
      }
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3588;
      return "mob.spider.say";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3588;
      return "mob.spider.say";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3588;
      return "mob.spider.death";
   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      String[] var10001 = field_3588;
      this.method_3868("mob.spider.step", 0.15F, 1.0F);
   }

   // $FF: renamed from: a (sa, float) void
   protected void method_4330(class_689 var1, float var2) {
      float var4 = this.method_3884(1.0F);
      String[] var3 = class_752.method_4253();
      float var12;
      int var10000 = (var12 = var4 - 0.5F) == 0.0F?0:(var12 < 0.0F?-1:1);
      if(var3 != null) {
         label54: {
            if(var10000 > 0) {
               var10000 = this.field_3028.nextInt(100);
               if(var3 == null) {
                  break label54;
               }

               if(var10000 == 0) {
                  this.field_3433 = null;
                  if(var3 != null) {
                     return;
                  }
               }
            }

            float var13;
            var10000 = (var13 = var2 - 2.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
         }
      }

      class_784 var10;
      label45: {
         label59: {
            if(var3 != null) {
               if(var10000 <= 0) {
                  break label59;
               }

               float var14;
               var10000 = (var14 = var2 - 6.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
            }

            if(var3 != null) {
               if(var10000 >= 0) {
                  break label59;
               }

               var10 = this;
               if(var3 == null) {
                  break label45;
               }

               var10000 = this.field_3028.nextInt(10);
            }

            if(var10000 == 0) {
               Object var11 = this;
               if(var3 != null) {
                  if(!this.field_3005) {
                     return;
                  }

                  var11 = var1;
               }

               double var5 = ((class_689)var11).field_2994 - this.field_2994;
               double var7 = var1.field_2996 - this.field_2996;
               float var9 = class_1715.method_9558(var5 * var5 + var7 * var7);
               this.field_2997 = var5 / (double)var9 * 0.5D * 0.800000011920929D + this.field_2997 * 0.20000000298023224D;
               this.field_2999 = var7 / (double)var9 * 0.5D * 0.800000011920929D + this.field_2999 * 0.20000000298023224D;
               this.field_2998 = 0.4000000059604645D;
               if(var3 != null) {
                  return;
               }
            }
         }

         var10 = this;
      }

      var10.method_4330(var1, var2);
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5145;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      class_784 var5;
      label30: {
         String[] var10000 = class_752.method_4253();
         super.method_4196((boolean)var1, var2);
         String[] var3 = var10000;
         int var4 = var1;
         if(var3 != null) {
            if(var1 == 0) {
               return;
            }

            var5 = this;
            if(var3 == null) {
               break label30;
            }

            var4 = this.field_3028.nextInt(3);
         }

         if(var4 != 0) {
            var5 = this;
            if(var3 == null) {
               break label30;
            }

            if(this.field_3028.nextInt(1 + var2) <= 0) {
               return;
            }
         }

         var5 = this;
      }

      var5.method_3914(class_1010.field_5232, 1);
   }

   // $FF: renamed from: h_ () boolean
   public boolean method_4197() {
      return this.method_4526();
   }

   // $FF: renamed from: as () void
   public void method_3954() {}

   // $FF: renamed from: bd () at
   public class_923 method_4213() {
      return class_923.field_4665;
   }

   // $FF: renamed from: d (v5) boolean
   public boolean method_4180(class_1645 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.method_9016();
      if(var2 != null) {
         var10000 = var10000 == class_1635.field_8509.field_8526?0:super.method_4180(var1);
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: bZ () boolean
   public boolean method_4526() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(16) & 1;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (boolean) void
   public void method_4527(boolean var1) {
      byte var3;
      label15: {
         var3 = this.field_3036.method_9499(16);
         String[] var2 = class_752.method_4253();
         byte var10000 = var1;
         if(var2 != null) {
            if(var1 != 0) {
               var3 = (byte)(var3 | 1);
               if(var2 != null) {
                  break label15;
               }
            }

            var10000 = (byte)(var3 & -2);
         }

         var3 = var10000;
      }

      this.field_3036.method_9506(16, Byte.valueOf(var3));
   }

   // $FF: renamed from: a (xY) xY
   public class_83 method_4282(class_83 var1) {
      String[] var10000 = class_752.method_4253();
      Object var3 = super.method_4282(var1);
      String[] var2 = var10000;
      if(this.field_2990.field_1819.nextInt(100) == 0) {
         class_786 var6 = new class_786;
         var6.method_3847(this.field_2990);
         class_786 var4 = var6;
         var4.method_3887(this.field_2994, this.field_2995, this.field_2996, this.field_3000, 0.0F);
         var4.method_4282((class_83)null);
         this.field_2990.method_2089(var4);
         var4.method_3925(this);
      }

      Object var7;
      int var8;
      label51: {
         var7 = var3;
         if(var2 != null) {
            label43: {
               if(var3 == null) {
                  var7 = new class_1848;
                  ((class_1848)var7).method_9992();
                  if(var2 == null) {
                     break label43;
                  }

                  var3 = var7;
                  if(this.field_2990.field_1818 == class_918.field_4630) {
                     float var9;
                     var8 = (var9 = this.field_2990.field_1819.nextFloat() - 0.1F * this.field_2990.method_2222(this.field_2994, this.field_2995, this.field_2996)) == 0.0F?0:(var9 < 0.0F?-1:1);
                     if(var2 == null) {
                        break label51;
                     }

                     if(var8 < 0) {
                        ((class_1848)var3).method_9993(this.field_2990.field_1819);
                     }
                  }
               }

               var7 = var3;
            }
         }

         if(var2 == null) {
            return (class_83)var7;
         }

         var8 = var7 instanceof class_1848;
      }

      if(var8 != 0) {
         var7 = (class_1848)var3;
         if(var2 == null) {
            return (class_83)var7;
         }

         int var5 = ((class_1848)var7).field_9429;
         if(var5 > 0 && class_1635.field_8489[var5] != null) {
            class_1645 var10001 = new class_1645;
            var10001.method_9011(var5, Integer.MAX_VALUE);
            this.method_4179(var10001);
         }
      }

      var7 = (class_83)var3;
      return (class_83)var7;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
