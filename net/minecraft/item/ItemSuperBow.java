package net.minecraft.item;

import ca.diiza.e.class_804;
import ca.diiza.e.class_805;
import ca.diiza.e.class_806;
import ca.diiza.v.a.class_1009;

public class ItemSuperBow extends class_573 {

   public static final String[] bowPullIconNameArray;
   private class_73[] iconArray;
   public static class_1009 arrowType;
   // $FF: renamed from: q boolean
   private static boolean field_2454;
   // $FF: renamed from: r java.lang.String[]
   private static final String[] field_2455;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.field_2333 = 1;
      this.method_2935(2500);
      this.method_2974(class_872.fontRendererInstance2);
   }

   // $FF: renamed from: a (add, ahb, yz, int) void
   public void method_2959(add var1, ahb var2, class_792 var3, int var4) {
      boolean var5 = getBlock67();
      int var10000 = var3.field_3640.field_2839;
      if(var5) {
         label286: {
            if(!var3.field_3640.field_2839) {
               label284: {
                  if(arrowType == class_1009.NORMAL) {
                     var10000 = class_980.method_5640(class_940.field_4805.field_4808, var1);
                     if(!var5) {
                        break label286;
                     }

                     if(var10000 > 0) {
                        break label284;
                     }
                  }

                  var10000 = 0;
                  break label286;
               }
            }

            var10000 = 1;
         }
      }

      label290: {
         int var6 = var10000;
         var10000 = var6;
         if(var5) {
            label274: {
               if(var6 == 0) {
                  var10000 = var3.field_3616.method_3606(arrowType.method_5745());
                  if(!var5) {
                     break label274;
                  }

                  if(var10000 == 0) {
                     break label290;
                  }
               }

               var10000 = this.method_2958(var1) - var4;
            }
         }

         float var8;
         label266: {
            float var16;
            label291: {
               int var7 = var10000;
               var8 = (float)var7 / 20.0F;
               var8 = (var8 * var8 + var8 * 2.0F) / 3.0F;
               double var22;
               var10000 = (var22 = (double)var8 - 0.1D) == 0.0D?0:(var22 < 0.0D?-1:1);
               if(var5) {
                  if(var10000 < 0) {
                     return;
                  }

                  var16 = var8;
                  if(!var5) {
                     break label291;
                  }

                  float var23;
                  var10000 = (var23 = var8 - 1.0F) == 0.0F?0:(var23 < 0.0F?-1:1);
               }

               if(var10000 <= 0) {
                  break label266;
               }

               var16 = 1.0F;
            }

            var8 = var16;
         }

         class_1009 var17 = arrowType;
         class_1009 var10001 = class_1009.NORMAL;
         int var10;
         int var11;
         String[] var12;
         if(var5) {
            if(arrowType == class_1009.NORMAL) {
               class_713 var18 = new class_713;
               var18.method_4076(var2, var3, var8 * 2.0F);
               class_713 var9 = var18;
               float var24;
               var10000 = (var24 = var8 - 1.0F) == 0.0F?0:(var24 < 0.0F?-1:1);
               if(var5) {
                  if(var10000 == 0) {
                     var9.method_4080(true);
                  }

                  var10000 = class_980.method_5640(class_940.field_4802.field_4808, var1);
               }

               var10 = var10000;
               var10000 = var10;
               if(var5) {
                  if(var10 > 0) {
                     var9.method_4077(var9.method_4078() + (double)var10 * 0.5D + 0.5D);
                  }

                  var10000 = class_980.method_5640(class_940.field_4803.field_4808, var1);
               }

               var11 = var10000;
               var10000 = var11;
               if(var5) {
                  if(var11 > 0) {
                     var9.method_4079(var11);
                  }

                  var1.method_3749(1, var3);
                  var12 = field_2455;
                  var2.method_2082(var3, "random.bow", 1.0F, 1.0F / (field_2332.nextFloat() * 0.4F + 1.2F) + var8 * 0.5F);
                  var10000 = var6;
               }

               if(var5) {
                  label240: {
                     if(var10000 != 0) {
                        var9.field_3192 = 2;
                        if(var5) {
                           break label240;
                        }
                     }

                     var3.field_3616.method_3605(arrowType.method_5745());
                  }
               }

               if(var5 && !var2.field_1832) {
                  var2.method_2089(var9);
               }

               if(var5) {
                  break label290;
               }
            }

            var17 = arrowType;
            var10001 = class_1009.FIRE;
         }

         if(var5) {
            if(var17 == var10001) {
               class_806 var19 = new class_806;
               var19.method_4719(var2, var3, var8 * 2.0F);
               class_806 var13 = var19;
               float var25;
               var10000 = (var25 = var8 - 1.0F) == 0.0F?0:(var25 < 0.0F?-1:1);
               if(var5) {
                  if(var10000 == 0) {
                     var13.method_4723(true);
                  }

                  var10000 = class_980.method_5640(class_940.field_4802.field_4808, var1);
               }

               var10 = var10000;
               var10000 = var10;
               if(var5) {
                  if(var10 > 0) {
                     var13.method_4720(var13.method_4721() + (double)var10 * 0.5D + 0.5D);
                  }

                  var10000 = class_980.method_5640(class_940.field_4803.field_4808, var1);
               }

               var11 = var10000;
               var10000 = var11;
               if(var5) {
                  if(var11 > 0) {
                     var13.method_4722(var11);
                  }

                  var13.method_3860(200);
                  var1.method_3749(1, var3);
                  var12 = field_2455;
                  var2.method_2082(var3, "random.bow", 1.0F, 1.0F / (field_2332.nextFloat() * 0.4F + 1.2F) + var8 * 0.5F);
                  var10000 = var6;
               }

               if(var5) {
                  label215: {
                     if(var10000 != 0) {
                        var13.field_3777 = 2;
                        if(var5) {
                           break label215;
                        }
                     }

                     var3.field_3616.method_3605(arrowType.method_5745());
                  }
               }

               if(var5 && !var2.field_1832) {
                  var2.method_2089(var13);
               }

               if(var5) {
                  break label290;
               }
            }

            var17 = arrowType;
            var10001 = class_1009.SLOW;
         }

         if(var5) {
            if(var17 == var10001) {
               class_804 var20 = new class_804;
               var20.method_4698(var2, var3, var8 * 2.0F);
               class_804 var14 = var20;
               float var26;
               var10000 = (var26 = var8 - 1.0F) == 0.0F?0:(var26 < 0.0F?-1:1);
               if(var5) {
                  if(var10000 == 0) {
                     var14.method_4702(true);
                  }

                  var10000 = class_980.method_5640(class_940.field_4802.field_4808, var1);
               }

               var10 = var10000;
               var10000 = var10;
               if(var5) {
                  if(var10 > 0) {
                     var14.method_4699(var14.method_4700() + (double)var10 * 0.5D + 0.5D);
                  }

                  var10000 = class_980.method_5640(class_940.field_4803.field_4808, var1);
               }

               var11 = var10000;
               var10000 = var11;
               if(var5) {
                  if(var11 > 0) {
                     var14.method_4701(var11);
                  }

                  var1.method_3749(1, var3);
                  var12 = field_2455;
                  var2.method_2082(var3, "random.bow", 1.0F, 1.0F / (field_2332.nextFloat() * 0.4F + 1.2F) + var8 * 0.5F);
                  var10000 = var6;
               }

               if(var5) {
                  label190: {
                     if(var10000 != 0) {
                        var14.field_3746 = 2;
                        if(var5) {
                           break label190;
                        }
                     }

                     var3.field_3616.method_3605(arrowType.method_5745());
                  }
               }

               if(var5 && !var2.field_1832) {
                  var2.method_2089(var14);
               }

               if(var5) {
                  break label290;
               }
            }

            var17 = arrowType;
            var10001 = class_1009.POISON;
         }

         if(var17 == var10001) {
            class_805 var21 = new class_805;
            var21.method_4707(var2, var3, var8 * 2.0F);
            class_805 var15 = var21;
            float var27;
            var10000 = (var27 = var8 - 1.0F) == 0.0F?0:(var27 < 0.0F?-1:1);
            if(var5) {
               if(var10000 == 0) {
                  var15.method_4711(true);
               }

               var10000 = class_980.method_5640(class_940.field_4802.field_4808, var1);
            }

            var10 = var10000;
            var10000 = var10;
            if(var5) {
               if(var10 > 0) {
                  var15.method_4708(var15.method_4709() + (double)var10 * 0.5D + 0.5D);
               }

               var10000 = class_980.method_5640(class_940.field_4803.field_4808, var1);
            }

            var11 = var10000;
            var10000 = var11;
            if(var5) {
               if(var11 > 0) {
                  var15.method_4710(var11);
               }

               var1.method_3749(1, var3);
               String[] var10002 = field_2455;
               var2.method_2082(var3, "random.bow", 1.0F, 1.0F / (field_2332.nextFloat() * 0.4F + 1.2F) + var8 * 0.5F);
               var10000 = var6;
            }

            if(var5) {
               label173: {
                  if(var10000 != 0) {
                     var15.field_3761 = 2;
                     if(var5) {
                        break label173;
                     }
                  }

                  var3.field_3616.method_3605(arrowType.method_5745());
               }
            }

            if(var5 && !var2.field_1832) {
               var2.method_2089(var15);
            }
         }
      }

      if(class_689.method_3976() != 0) {
         getBlock66(!var5);
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
      boolean var4 = getBlock67();
      class_792 var10000 = var3;
      if(var4) {
         label17: {
            if(!var3.field_3640.field_2839) {
               var10000 = var3;
               if(!var4) {
                  break label17;
               }

               if(!var3.field_3616.method_3606(arrowType.method_5745())) {
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
      String[] var10003 = field_2455;
      this.field_2340 = var1.method_375(var10002.append("_standby").toString());
      boolean var10000 = getBlock68();
      this.iconArray = new class_73[bowPullIconNameArray.length];
      boolean var2 = var10000;
      int var4 = 0;

      while(var4 < this.iconArray.length) {
         this.iconArray[var4] = var1.method_375(this.method_2980() + "_" + bowPullIconNameArray[var4]);
         ++var4;
         if(var2) {
            int var3 = class_689.method_3976();
            ++var3;
            class_689.method_3975(var3);
            break;
         }
      }

   }

   // $FF: renamed from: c (int) vL
   public class_73 getBlock62(int var1) {
      return this.iconArray[var1];
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (boolean) void
   public static void getBlock66(boolean var0) {
      field_2454 = var0;
   }

   // $FF: renamed from: e () boolean
   public static boolean getBlock67() {
      return field_2454;
   }

   // $FF: renamed from: i () boolean
   public static boolean getBlock68() {
      boolean var0 = getBlock67();
      return !var0;
   }
}
