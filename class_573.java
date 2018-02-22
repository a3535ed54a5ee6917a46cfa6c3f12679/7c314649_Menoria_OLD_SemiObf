
// $FF: renamed from: bA
public class class_573 extends adb {

   // $FF: renamed from: n java.lang.String[]
   public static final String[] field_2449;
   // $FF: renamed from: o vL[]
   protected class_73[] field_2450;
   // $FF: renamed from: p java.lang.String
   private static final String field_2451;
   // $FF: renamed from: q java.lang.String[]
   private static final String[] field_2452;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.field_2333 = 1;
      this.method_2935(384);
      this.method_2974(class_872.fontRendererInstance2);
   }

   // $FF: renamed from: a (add, ahb, yz, int) void
   public void method_2959(add var1, ahb var2, class_792 var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var3.field_3640.field_2839;
      if(var5 != null) {
         label105: {
            if(!var3.field_3640.field_2839) {
               var10000 = class_980.method_5640(class_940.field_4805.field_4808, var1);
               if(var5 == null) {
                  break label105;
               }

               if(var10000 <= 0) {
                  var10000 = 0;
                  break label105;
               }
            }

            var10000 = 1;
         }
      }

      int var6 = var10000;
      var10000 = var6;
      if(var5 != null) {
         label96: {
            if(var6 == 0) {
               var10000 = var3.field_3616.method_3606(class_1010.field_5120);
               if(var5 == null) {
                  break label96;
               }

               if(var10000 == 0) {
                  return;
               }
            }

            var10000 = this.method_2958(var1) - var4;
         }
      }

      float var8;
      label88: {
         float var13;
         label110: {
            int var7 = var10000;
            var8 = (float)var7 / 20.0F;
            var8 = (var8 * var8 + var8 * 2.0F) / 3.0F;
            double var14;
            var10000 = (var14 = (double)var8 - 0.1D) == 0.0D?0:(var14 < 0.0D?-1:1);
            if(var5 != null) {
               if(var10000 < 0) {
                  return;
               }

               var13 = var8;
               if(var5 == null) {
                  break label110;
               }

               float var15;
               var10000 = (var15 = var8 - 1.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
            }

            if(var10000 <= 0) {
               break label88;
            }

            var13 = 1.0F;
         }

         var8 = var13;
      }

      class_713 var12 = new class_713;
      var12.method_4076(var2, var3, var8 * 2.0F);
      class_713 var9 = var12;
      float var16;
      var10000 = (var16 = var8 - 1.0F) == 0.0F?0:(var16 < 0.0F?-1:1);
      if(var5 != null) {
         if(var10000 == 0) {
            var9.method_4080(true);
         }

         var10000 = class_980.method_5640(class_940.field_4802.field_4808, var1);
      }

      int var10 = var10000;
      var10000 = var10;
      if(var5 != null) {
         if(var10 > 0) {
            var9.method_4077(var9.method_4078() + (double)var10 * 0.5D + 0.5D);
         }

         var10000 = class_980.method_5640(class_940.field_4803.field_4808, var1);
      }

      int var11 = var10000;
      var10000 = var11;
      if(var5 != null) {
         if(var11 > 0) {
            var9.method_4079(var11);
         }

         var10000 = class_980.method_5640(class_940.field_4804.field_4808, var1);
      }

      if(var5 != null) {
         if(var10000 > 0) {
            var9.method_3860(100);
         }

         var1.method_3749(1, var3);
         String[] var10002 = field_2452;
         var2.method_2082(var3, "random.bow", 1.0F, 1.0F / (field_2332.nextFloat() * 0.4F + 1.2F) + var8 * 0.5F);
         var10000 = var6;
      }

      if(var5 != null) {
         label69: {
            if(var10000 != 0) {
               var9.field_3192 = 2;
               if(var5 != null) {
                  break label69;
               }
            }

            var3.field_3616.method_3605(class_1010.field_5120);
         }
      }

      if(var5 != null && !var2.field_1832) {
         var2.method_2089(var9);
      }

   }

   // $FF: renamed from: b (add, ahb, yz) add
   public add method_2929(add var1, ahb var2, class_792 var3) {
      return var1;
   }

   // $FF: renamed from: d_ (add) int
   public int method_2958(add var1) {
      return 72000;
   }

   // $FF: renamed from: d (add) A
   public class_92 method_2957(add var1) {
      return class_92.field_27;
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      class_792 var10000 = var3;
      if(var4 != null) {
         label17: {
            if(!var3.field_3640.field_2839) {
               var10000 = var3;
               if(var4 == null) {
                  break label17;
               }

               if(!var3.field_3616.method_3606(class_1010.field_5120)) {
                  return var1;
               }
            }

            var10000 = var3;
         }
      }

      var10000.method_4626(var1, this.method_2958(var1));
      return var1;
   }

   // $FF: renamed from: c () int
   public int method_2969() {
      return 1;
   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2980());
      String[] var10003 = field_2452;
      this.field_2340 = var1.method_375(var10002.append("_standby").toString());
      this.field_2450 = new class_73[field_2449.length];
      String[] var2 = class_752.method_4253();
      int var3 = 0;

      while(var3 < this.field_2450.length) {
         this.field_2450[var3] = var1.method_375(this.method_2980() + "_" + field_2449[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (int) vL
   public class_73 getBlock62(int var1) {
      return this.field_2450[var1];
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      // $FF: Couldn't be decompiled
   }
}
