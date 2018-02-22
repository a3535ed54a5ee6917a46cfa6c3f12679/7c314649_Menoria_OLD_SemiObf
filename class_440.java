import java.util.List;
import java.util.Random;

// $FF: renamed from: eL
public class class_440 extends aji {

   // $FF: renamed from: M vL
   private class_73 field_2173;
   // $FF: renamed from: N vL
   private class_73 field_2174;
   // $FF: renamed from: O vL
   private class_73 field_2175;
   // $FF: renamed from: P java.lang.String
   private static final String field_2176;
   // $FF: renamed from: Q java.lang.String[]
   private static final String[] field_2177;


   // $FF: renamed from: <init> () void
   public void method_2754() {
      super.method_2427(awt.field_4175);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      class_73 var4;
      if(var3 != null) {
         if(var1 == 1) {
            var4 = this.field_2174;
            return var4;
         }

         var10000 = var1;
      }

      var4 = var10000 == 0?this.field_2175:this.field_2010;
      return var4;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533()).append("_");
      String[] var2 = field_2177;
      this.field_2173 = var1.method_375(var10002.append("inner").toString());
      this.field_2174 = var1.method_375(this.method_2533() + "_top");
      this.field_2175 = var1.method_375(this.method_2533() + "_" + "bottom");
      this.field_2010 = var1.method_375(this.method_2533() + "_side");
   }

   // $FF: renamed from: a (java.lang.String) vL
   public static class_73 method_2755(String var0) {
      return null;
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
      float var8 = 0.125F;
      this.method_2443(0.0F, 0.0F, 0.0F, var8, 1.0F, 1.0F);
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var8);
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
      this.method_2443(1.0F - var8, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
      this.method_2443(0.0F, 0.0F, 1.0F - var8, 1.0F, 1.0F, 1.0F);
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
      this.method_2500();
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 24;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int, sa) void
   public void method_2498(ahb var1, int var2, int var3, int var4, class_689 var5) {
      int var7 = method_2757(var1.method_33(var2, var3, var4));
      String[] var10000 = class_752.method_4253();
      float var8 = (float)var3 + (6.0F + (float)(3 * var7)) / 16.0F;
      String[] var6 = var10000;
      int var9 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var9 = var5.method_3936();
      }

      if(var6 != null) {
         if(var9 == 0) {
            return;
         }

         var9 = var7;
      }

      class_689 var10;
      label41: {
         if(var6 != null) {
            if(var9 <= 0) {
               return;
            }

            var10 = var5;
            if(var6 == null) {
               break label41;
            }

            double var11;
            var9 = (var11 = var5.field_3004.field_6910 - (double)var8) == 0.0D?0:(var11 < 0.0D?-1:1);
         }

         if(var9 > 0) {
            return;
         }

         var10 = var5;
      }

      var10.method_3861();
      this.method_2756(var1, var2, var3, var4, var7 - 1);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var10 != null) {
         if(!var1.field_1832) {
            add var11 = var5.field_3616.method_3593();
            if(var11 == null) {
               return true;
            }

            int var12 = var1.method_33(var2, var3, var4);
            int var13 = method_2757(var12);
            adb var16 = var11.method_3730();
            adb var10001 = class_1010.field_5184;
            int var17;
            if(var10 != null) {
               if(var16 == class_1010.field_5184) {
                  var17 = var13;
                  if(var10 != null) {
                     if(var13 < 3) {
                        label56: {
                           class_792 var22 = var5;
                           if(var10 != null) {
                              if(var5.field_3640.field_2839) {
                                 break label56;
                              }

                              var22 = var5;
                           }

                           class_666 var23 = var22.field_3616;
                           int var19 = var5.field_3616.field_2846;
                           add var10002 = new add;
                           var10002.method_3724(class_1010.field_5183);
                           var23.method_87(var19, var10002);
                        }

                        this.method_2756(var1, var2, var3, var4, 3);
                     }

                     var17 = 1;
                  }

                  return (boolean)var17;
               }

               var16 = var11.method_3730();
               var10001 = class_1010.field_5231;
            }

            label112: {
               if(var16 == var10001) {
                  var17 = var13;
                  if(var10 == null) {
                     return (boolean)var17;
                  }

                  if(var13 <= 0) {
                     break label112;
                  }

                  label81: {
                     if(!var5.field_3640.field_2839) {
                        label114: {
                           label115: {
                              add var20 = new add;
                              var20.method_3726(class_1010.field_5230, 1, 0);
                              add var14 = var20;
                              var17 = var5.field_3616.method_3607(var14);
                              if(var10 != null) {
                                 if(var17 == 0) {
                                    class_699 var18 = new class_699;
                                    var18.method_4025(var1, (double)var2 + 0.5D, (double)var3 + 1.5D, (double)var4 + 0.5D, var14);
                                    var1.method_2089(var18);
                                    if(var10 != null) {
                                       break label115;
                                    }
                                 }

                                 var17 = var5 instanceof class_793;
                              }

                              if(var10 == null) {
                                 break label114;
                              }

                              if(var17 != 0) {
                                 ((class_793)var5).method_4644(var5.field_3618);
                              }
                           }

                           --var11.field_2958;
                           if(var10 == null) {
                              break label81;
                           }

                           var17 = var11.field_2958;
                        }

                        if(var17 <= 0) {
                           var5.field_3616.method_87(var5.field_3616.field_2846, (add)null);
                        }
                     }

                     this.method_2756(var1, var2, var3, var4, var13 - 1);
                  }

                  if(var10 != null) {
                     break label112;
                  }
               }

               var17 = var13;
               if(var10 == null) {
                  return (boolean)var17;
               }

               if(var13 > 0) {
                  var17 = var11.method_3730() instanceof class_525;
                  if(var10 == null) {
                     return (boolean)var17;
                  }

                  if(var17 != 0) {
                     label87: {
                        class_525 var21 = (class_525)var11.method_3730();
                        if(var10 != null) {
                           if(var21.method_2991() != class_131.field_306) {
                              break label87;
                           }

                           var21 = (class_525)var11.method_3730();
                        }

                        class_525 var15 = var21;
                        var15.method_2994(var11);
                        this.method_2756(var1, var2, var3, var4, var13 - 1);
                        return true;
                     }
                  }
               }
            }

            var17 = 0;
            return (boolean)var17;
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int, int) void
   public void method_2756(ahb var1, int var2, int var3, int var4, int var5) {
      var1.method_2055(var2, var3, var4, class_1715.method_9568(var5, 0, 3), 2);
      var1.method_2221(var2, var3, var4, this);
   }

   // $FF: renamed from: l (ahb, int, int, int) void
   public void method_2524(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var1.field_1819.nextInt(20);
      if(var5 != null) {
         if(var10000 != 1) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var6 = var10000;
      if(var5 != null && var6 < 3) {
         var1.method_2055(var2, var3, var4, var6 + 1, 2);
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return null;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return true;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_33(var2, var3, var4);
      return method_2757(var6);
   }

   // $FF: renamed from: c (int) int
   public static int method_2757(int var0) {
      return var0;
   }

   // $FF: renamed from: d (int) float
   public static float method_2758(int var0) {
      int var1 = class_1715.method_9568(var0, 0, 3);
      return (float)(6 + 3 * var1) / 16.0F;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
