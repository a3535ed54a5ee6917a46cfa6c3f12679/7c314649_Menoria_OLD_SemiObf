import java.util.List;
import java.util.Random;

// $FF: renamed from: bM
public class class_537 extends adb {

   // $FF: renamed from: n java.lang.String[]
   public static final String[] field_2385;
   // $FF: renamed from: o java.lang.String[]
   public static final String[] field_2386;
   // $FF: renamed from: p int[]
   public static final int[] field_2387;
   // $FF: renamed from: q vL[]
   private class_73[] field_2388;
   // $FF: renamed from: r java.lang.String[]
   private static final String[] field_2389;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2933(true);
      this.method_2935(0);
      this.method_2974(class_872.fontRendererInstance4);
   }

   // $FF: renamed from: b_ (int) vL
   public class_73 getIconFromDamage(int var1) {
      int var2 = class_1715.method_9568(var1, 0, 15);
      return this.field_2388[var2];
   }

   // $FF: renamed from: a (add) java.lang.String
   public String getUnlocalizedName(add var1) {
      int var2 = class_1715.method_9568(var1.method_3745(), 0, 15);
      return super.getUnlocalizedName() + "." + field_2385[var2];
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      int var10000 = var2.method_4628(var4, var5, var6, var7, var1);
      if(var11 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = var1.method_3745();
      }

      label115: {
         byte var10001 = 15;
         if(var11 != null) {
            if(var10000 == 15) {
               var10000 = getBlock08(var1, var3, var4, var5, var6);
               if(var11 == null) {
                  return (boolean)var10000;
               }

               if(var10000 != 0) {
                  boolean var15 = var3.field_1832;
                  if(var11 != null) {
                     if(!var3.field_1832) {
                        var3.method_2210(2005, var4, var5, var6, 0);
                     }

                     var15 = true;
                  }

                  return var15;
               }
               break label115;
            }

            var10000 = var1.method_3745();
            if(var11 == null) {
               return (boolean)var10000;
            }

            var10001 = 3;
         }

         if(var10000 == var10001) {
            aji var12 = var3.getBlock(var4, var5, var6);
            var10000 = var3.method_33(var4, var5, var6);
            if(var11 == null) {
               return (boolean)var10000;
            }

            int var13 = var10000;
            if(var12 == class_1192.field_6042) {
               var10000 = class_408.method_2652(var13);
               if(var11 == null) {
                  return (boolean)var10000;
               }

               if(var10000 == 3) {
                  var10000 = var7;
                  if(var11 != null) {
                     if(var7 == 0) {
                        return false;
                     }

                     var10000 = var7;
                  }

                  var10001 = 1;
                  if(var11 != null) {
                     if(var10000 == 1) {
                        return false;
                     }

                     var10000 = var7;
                     var10001 = 2;
                  }

                  if(var11 != null) {
                     if(var10000 == var10001) {
                        --var6;
                     }

                     var10000 = var7;
                     var10001 = 3;
                  }

                  if(var11 != null) {
                     if(var10000 == var10001) {
                        ++var6;
                     }

                     var10000 = var7;
                     var10001 = 4;
                  }

                  label122: {
                     if(var11 != null) {
                        if(var10000 == var10001) {
                           --var4;
                        }

                        var10000 = var7;
                        if(var11 == null) {
                           break label122;
                        }

                        var10001 = 5;
                     }

                     if(var10000 == var10001) {
                        ++var4;
                     }

                     var10000 = var3.method_34(var4, var5, var6);
                  }

                  if(var11 != null) {
                     if(var10000 != 0) {
                        int var14 = class_1192.field_6151.method_2483(var3, var4, var5, var6, var7, var8, var9, var10, 0);
                        var3.method_2054(var4, var5, var6, class_1192.field_6151, var14, 2);
                        var10000 = var2.field_3640.field_2839;
                        if(var11 == null) {
                           return (boolean)var10000;
                        }

                        if(!var2.field_3640.field_2839) {
                           --var1.field_2958;
                        }
                     }

                     var10000 = 1;
                  }

                  return (boolean)var10000;
               }
            }
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (add, ahb, int, int, int) boolean
   public static boolean getBlock08(add var0, ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      aji var6 = var1.getBlock(var2, var3, var4);
      String[] var5 = var10000;
      boolean var8 = var6 instanceof class_27;
      if(var5 != null) {
         if(var8) {
            class_27 var7 = (class_27)var6;
            var8 = var7.method_121(var1, var2, var3, var4, var1.field_1832);
            if(var5 == null) {
               return var8;
            }

            if(var8) {
               var8 = var1.field_1832;
               if(var5 != null) {
                  if(!var1.field_1832) {
                     label23: {
                        class_27 var9 = var7;
                        ahb var10001 = var1;
                        Random var10002 = var1.field_1819;
                        int var10003 = var2;
                        int var10004 = var3;
                        int var10005 = var4;
                        if(var5 != null) {
                           if(!var7.method_122(var1, var1.field_1819, var2, var3, var4)) {
                              break label23;
                           }

                           var9 = var7;
                           var10001 = var1;
                           var10002 = var1.field_1819;
                           var10003 = var2;
                           var10004 = var3;
                           var10005 = var4;
                        }

                        var9.method_123(var10001, var10002, var10003, var10004, var10005);
                     }

                     --var0.field_2958;
                  }

                  var8 = true;
               }

               return var8;
            }
         }

         var8 = false;
      }

      return var8;
   }

   // $FF: renamed from: b (ahb, int, int, int, int) void
   public static void getBlock09(ahb var0, int var1, int var2, int var3, int var4) {
      String[] var5;
      label31: {
         var5 = class_752.method_4253();
         int var10000 = var4;
         if(var5 != null) {
            if(var4 != 0) {
               break label31;
            }

            var10000 = 15;
         }

         var4 = var10000;
      }

      aji var6 = var0.getBlock(var1, var2, var3);
      aji var14 = var6;
      if(var5 != null) {
         if(var6.method_2424() == awt.field_4170) {
            return;
         }

         var14 = var6;
      }

      var14.method_2486(var0, var1, var2, var3);
      int var7 = 0;

      while(var7 < var4) {
         double var8 = field_2332.nextGaussian() * 0.02D;
         double var10 = field_2332.nextGaussian() * 0.02D;
         double var12 = field_2332.nextGaussian() * 0.02D;
         String[] var10001 = field_2389;
         var0.method_2087("happyVillager", (double)((float)var1 + field_2332.nextFloat()), (double)var2 + (double)field_2332.nextFloat() * var6.method_2490(), (double)((float)var3 + field_2332.nextFloat()), var8, var10, var12);
         ++var7;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (add, yz, sv) boolean
   public boolean method_2940(add var1, class_792 var2, class_752 var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = var3 instanceof class_770;
      if(var4 != null) {
         if(var10000) {
            class_770 var5 = (class_770)var3;
            int var6 = class_438.method_2751(var1.method_3745());
            int var7 = var5.method_4389();
            if(var4 != null) {
               if(var7 == 0) {
                  var7 = var5.method_4387();
                  if(var4 == null) {
                     return (boolean)var7;
                  }

                  if(var7 != var6) {
                     var5.method_4388(var6);
                     --var1.field_2958;
                  }
               }

               var7 = 1;
            }

            return (boolean)var7;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void getSubItems(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < 16) {
         add var10001 = new add;
         var10001.method_3726(var1, 1, var5);
         var3.add(var10001);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      this.field_2388 = new class_73[field_2386.length];
      String[] var2 = class_752.method_4253();
      int var3 = 0;

      while(var3 < field_2386.length) {
         this.field_2388[var3] = var1.method_375(this.method_2980() + "_" + field_2386[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      // $FF: Couldn't be decompiled
   }
}
