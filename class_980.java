import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

// $FF: renamed from: cY
public class class_980 {

   // $FF: renamed from: b java.util.Random
   private static final Random field_4946;
   // $FF: renamed from: c c4
   private static final class_921 field_4947;
   // $FF: renamed from: d c3
   private static final class_919 field_4948;
   // $FF: renamed from: e c1
   private static final class_916 field_4949;
   // $FF: renamed from: f c0
   private static final class_914 field_4950;
   // $FF: renamed from: g java.lang.String
   private static final String field_4951;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_4952;


   // $FF: renamed from: <init> () void
   public void method_5639() {
      super();
   }

   // $FF: renamed from: b (int, add) int
   public static int method_5640(int var0, add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return 0;
         }

         var10000 = var1;
      }

      class_1580 var3 = var10000.method_3768();
      if(var3 == null) {
         return 0;
      } else {
         int var4 = 0;

         short var9;
         while(true) {
            if(var4 < var3.method_8658()) {
               class_1583 var8 = var3.method_8653(var4);
               String[] var7 = field_4952;
               short var5 = var8.method_8680("id");
               short var6 = var3.method_8653(var4).method_8680("lvl");
               if(var2 != null) {
                  var9 = var5;
                  if(var2 == null) {
                     break;
                  }

                  if(var5 == var0) {
                     return var6;
                  }

                  ++var4;
               }

               if(var2 != null) {
                  continue;
               }
            }

            var9 = 0;
            break;
         }

         return var9;
      }
   }

   // $FF: renamed from: b (add) java.util.Map
   public static Map method_5641(add var0) {
      String[] var1;
      LinkedHashMap var2;
      class_1580 var9;
      label32: {
         String[] var10000 = class_752.method_4253();
         var2 = new LinkedHashMap();
         var1 = var10000;
         add var8 = var0;
         if(var1 != null) {
            if(var0.method_3730() == class_1010.field_5259) {
               var9 = class_1010.field_5259.getBlock02(var0);
               break label32;
            }

            var8 = var0;
         }

         var9 = var8.method_3768();
      }

      class_1580 var3 = var9;
      LinkedHashMap var11;
      if(var3 != null) {
         int var4 = 0;

         while(var4 < var3.method_8658()) {
            class_1583 var10 = var3.method_8653(var4);
            String[] var7 = field_4952;
            short var5 = var10.method_8680("id");
            short var6 = var3.method_8653(var4).method_8680("lvl");
            var11 = var2;
            if(var1 == null) {
               return var11;
            }

            var2.put(Integer.valueOf(var5), Integer.valueOf(var6));
            ++var4;
            if(var1 == null) {
               break;
            }
         }
      }

      var11 = var2;
      return var11;
   }

   // $FF: renamed from: b (java.util.Map, add) void
   public static void method_5642(Map var0, add var1) {
      class_1580 var10000 = new class_1580;
      var10000.method_8628();
      class_1580 var3 = var10000;
      String[] var8 = class_752.method_4253();
      Iterator var4 = var0.keySet().iterator();
      String[] var2 = var8;

      class_1583 var9;
      add var13;
      label58: {
         int var12;
         label59: {
            label51: {
               String[] var7;
               label60: {
                  adb var10;
                  class_535 var10001;
                  while(true) {
                     if(var4.hasNext()) {
                        int var5 = ((Integer)var4.next()).intValue();
                        var9 = new class_1583;
                        var9.method_8628();
                        class_1583 var6 = var9;
                        var7 = field_4952;
                        var6.method_8666("id", (short)var5);
                        var6.method_8666("lvl", (short)((Integer)var0.get(Integer.valueOf(var5))).intValue());
                        var3.method_8650(var6);
                        var10 = var1.method_3730();
                        var10001 = class_1010.field_5259;
                        if(var2 == null) {
                           break;
                        }

                        if(var10 == class_1010.field_5259) {
                           class_535 var11 = class_1010.field_5259;
                           class_1655 var10002 = new class_1655;
                           var10002.method_9104(var5, ((Integer)var0.get(Integer.valueOf(var5))).intValue());
                           var11.getBlock03(var1, var10002);
                        }

                        if(var2 != null) {
                           continue;
                        }
                     }

                     var12 = var3.method_8658();
                     if(var2 == null) {
                        break label59;
                     }

                     if(var12 <= 0) {
                        break label51;
                     }

                     var13 = var1;
                     if(var2 == null) {
                        break label60;
                     }

                     var10 = var1.method_3730();
                     var10001 = class_1010.field_5259;
                     break;
                  }

                  if(var10 == var10001) {
                     return;
                  }

                  var13 = var1;
               }

               var7 = field_4952;
               var13.method_3780("ench", var3);
               if(var2 != null) {
                  return;
               }
            }

            var13 = var1;
            if(var2 == null) {
               break label58;
            }

            var12 = var1.method_3766();
         }

         if(var12 == 0) {
            return;
         }

         var13 = var1;
      }

      var9 = var13.method_3767();
      String[] var14 = field_4952;
      var9.method_8691("ench");
   }

   // $FF: renamed from: b (int, add[]) int
   public static int method_5643(int var0, add[] var1) {
      String[] var2 = class_752.method_4253();
      if(var1 == null) {
         return 0;
      } else {
         int var3 = 0;
         add[] var4 = var1;
         int var5 = var1.length;
         int var6 = 0;

         int var10000;
         while(true) {
            if(var6 < var5) {
               add var7 = var4[var6];
               int var8 = method_5640(var0, var7);
               if(var2 != null) {
                  var10000 = var8;
                  if(var2 == null) {
                     break;
                  }

                  if(var8 > var3) {
                     var3 = var8;
                  }

                  ++var6;
               }

               if(var2 != null) {
                  continue;
               }
            }

            var10000 = var3;
            break;
         }

         return var10000;
      }
   }

   // $FF: renamed from: b (c2, add) void
   private static void method_5644(class_17 var0, add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return;
         }

         var10000 = var1;
      }

      class_1580 var3 = var10000.method_3768();
      if(var3 != null) {
         int var4 = 0;

         while(var4 < var3.method_8658()) {
            class_1583 var8 = var3.method_8653(var4);
            String[] var7 = field_4952;
            short var5 = var8.method_8680("id");
            short var6 = var3.method_8653(var4).method_8680("lvl");
            if(var2 != null) {
               if(class_940.field_4782[var5] != null) {
                  var0.method_53(class_940.field_4782[var5], var6);
               }

               ++var4;
            }

            if(var2 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: b (c2, add[]) void
   private static void method_5645(class_17 var0, add[] var1) {
      add[] var3 = var1;
      String[] var10000 = class_752.method_4253();
      int var4 = var1.length;
      String[] var2 = var10000;
      int var5 = 0;

      while(var5 < var4) {
         add var6 = var3[var5];
         method_5644(var0, var6);
         ++var5;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (add[], vX) int
   public static int method_5646(add[] var0, class_1691 var1) {
      field_4947.field_4649 = 0;
      String[] var10000 = class_752.method_4253();
      field_4947.field_4650 = var1;
      method_5645(field_4947, var0);
      String[] var2 = var10000;
      int var3 = field_4947.field_4649;
      int var10001 = 25;
      if(var2 != null) {
         if(field_4947.field_4649 > 25) {
            field_4947.field_4649 = 25;
         }

         var3 = field_4947.field_4649 + 1 >> 1;
         var10001 = field_4946.nextInt((field_4947.field_4649 >> 1) + 1);
      }

      return var3 + var10001;
   }

   // $FF: renamed from: b (sv, sv) float
   public static float method_5647(class_752 var0, class_752 var1) {
      return method_5648(var0.method_4214(), var1.method_4213());
   }

   // $FF: renamed from: b (add, at) float
   public static float method_5648(add var0, class_923 var1) {
      field_4948.field_4636 = 0.0F;
      field_4948.field_4637 = var1;
      method_5644(field_4948, var0);
      return field_4948.field_4636;
   }

   // $FF: renamed from: b (sv, sa) void
   public static void method_5649(class_752 var0, class_689 var1) {
      String[] var10000 = class_752.method_4253();
      field_4949.field_4617 = var1;
      String[] var2 = var10000;
      field_4949.field_4616 = var0;
      class_916 var3 = field_4949;
      class_752 var10001 = var0;
      if(var2 != null) {
         method_5645(field_4949, var0.method_3934());
         if(!(var1 instanceof class_792)) {
            return;
         }

         var3 = field_4949;
         var10001 = var0;
      }

      method_5644(var3, var10001.method_4214());
   }

   // $FF: renamed from: c (sv, sa) void
   public static void method_5650(class_752 var0, class_689 var1) {
      field_4950.field_4606 = var0;
      String[] var10000 = class_752.method_4253();
      field_4950.field_4607 = var1;
      String[] var2 = var10000;
      class_914 var3 = field_4950;
      class_752 var10001 = var0;
      if(var2 != null) {
         method_5645(field_4950, var0.method_3934());
         if(!(var0 instanceof class_792)) {
            return;
         }

         var3 = field_4950;
         var10001 = var0;
      }

      method_5644(var3, var10001.method_4214());
   }

   // $FF: renamed from: c (sv, sv) int
   public static int method_5651(class_752 var0, class_752 var1) {
      return method_5640(class_940.field_4795.field_4808, var0.method_4214());
   }

   // $FF: renamed from: b (sv) int
   public static int method_5652(class_752 var0) {
      return method_5640(class_940.field_4796.field_4808, var0.method_4214());
   }

   // $FF: renamed from: c (sv) int
   public static int method_5653(class_752 var0) {
      return method_5643(class_940.field_4789.field_4808, var0.method_3934());
   }

   // $FF: renamed from: d (sv) int
   public static int method_5654(class_752 var0) {
      return method_5640(class_940.field_4798.field_4808, var0.method_4214());
   }

   // $FF: renamed from: f (sv) boolean
   public static boolean method_5655(class_752 var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = method_5640(class_940.field_4799.field_4808, var0.method_4214());
      if(var1 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: g (sv) int
   public static int method_5656(class_752 var0) {
      return method_5640(class_940.field_4801.field_4808, var0.method_4214());
   }

   // $FF: renamed from: h (sv) int
   public static int method_5657(class_752 var0) {
      return method_5640(class_940.field_4806.field_4808, var0.method_4214());
   }

   // $FF: renamed from: i (sv) int
   public static int method_5658(class_752 var0) {
      return method_5640(class_940.field_4807.field_4808, var0.method_4214());
   }

   // $FF: renamed from: j (sv) int
   public static int method_5659(class_752 var0) {
      return method_5640(class_940.field_4797.field_4808, var0.method_4214());
   }

   // $FF: renamed from: k (sv) boolean
   public static boolean method_5660(class_752 var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = method_5643(class_940.field_4790.field_4808, var0.method_3934());
      if(var1 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (cH, sv) add
   public static add method_5661(class_940 var0, class_752 var1) {
      add[] var3 = var1.method_3934();
      String[] var10000 = class_752.method_4253();
      int var4 = var3.length;
      int var5 = 0;
      String[] var2 = var10000;

      while(var5 < var4) {
         add var6 = var3[var5];
         if(var2 != null) {
            if(var6 != null && method_5640(var0.field_4808, var6) > 0) {
               return var6;
            }

            ++var5;
         }

         if(var2 == null) {
            break;
         }
      }

      return null;
   }

   // $FF: renamed from: b (java.util.Random, int, int, add) int
   public static int method_5662(Random var0, int var1, int var2, add var3) {
      adb var5 = var3.method_3730();
      String[] var10000 = class_752.method_4253();
      int var6 = var5.method_2969();
      String[] var4 = var10000;
      int var8 = var6;
      if(var4 != null) {
         if(var6 <= 0) {
            return 0;
         }

         var8 = var2;
      }

      int var10001 = 15;
      if(var4 != null) {
         if(var8 > 15) {
            var2 = 15;
         }

         var8 = var0.nextInt(8) + 1 + (var2 >> 1);
         var10001 = var0.nextInt(var2 + 1);
      }

      int var7 = var8 + var10001;
      var8 = var1;
      if(var4 != null) {
         if(var1 == 0) {
            var8 = Math.max(var7 / 3, 1);
            return var8;
         }

         var8 = var1;
      }

      var10001 = 1;
      if(var4 != null) {
         if(var8 == 1) {
            var8 = var7 * 2 / 3 + 1;
            return var8;
         }

         var8 = var7;
         var10001 = var2 * 2;
      }

      var8 = Math.max(var8, var10001);
      return var8;
   }

   // $FF: renamed from: b (java.util.Random, add, int) add
   public static add method_5663(Random var0, add var1, int var2) {
      String[] var10000 = class_752.method_4253();
      List var4 = method_5664(var0, var1, var2);
      String[] var3 = var10000;
      boolean var5 = var1.method_3730() == class_1010.field_5198;
      if(var5) {
         var1.method_3788(class_1010.field_5259);
      }

      List var8 = var4;
      if(var3 != null) {
         if(var4 == null) {
            return var1;
         }

         var8 = var4;
      }

      Iterator var6 = var8.iterator();

      while(var6.hasNext()) {
         label34: {
            class_1655 var7;
            label33: {
               var7 = (class_1655)var6.next();
               if(var3 != null) {
                  if(!var5) {
                     break label33;
                  }

                  class_1010.field_5259.getBlock03(var1, var7);
               }

               if(var3 != null) {
                  break label34;
               }
            }

            var1.method_3778(var7.field_8614, var7.field_8615);
         }

         if(var3 == null) {
            break;
         }
      }

      return var1;
   }

   // $FF: renamed from: c (java.util.Random, add, int) java.util.List
   public static List method_5664(Random var0, add var1, int var2) {
      adb var4 = var1.method_3730();
      String[] var10000 = class_752.method_4253();
      int var5 = var4.method_2969();
      String[] var3 = var10000;
      int var19 = var5;
      if(var3 != null) {
         if(var5 <= 0) {
            return null;
         }

         var5 /= 2;
         var5 = 1 + var0.nextInt((var5 >> 1) + 1) + var0.nextInt((var5 >> 1) + 1);
         var19 = var5 + var2;
      }

      int var8;
      label92: {
         int var6 = var19;
         float var7 = (var0.nextFloat() + var0.nextFloat() - 1.0F) * 0.15F;
         var8 = (int)((float)var6 * (1.0F + var7) + 0.5F);
         var19 = var8;
         if(var3 != null) {
            if(var8 >= 1) {
               break label92;
            }

            var19 = 1;
         }

         var8 = var19;
      }

      ArrayList var9 = null;
      Map var10 = method_5665(var8, var1);
      Map var20 = var10;
      if(var3 != null) {
         if(var10 == null) {
            return var9;
         }

         var20 = var10;
      }

      if(!var20.isEmpty()) {
         class_1655 var11 = (class_1655)class_1725.method_9638(var0, var10.values());
         if(var11 != null) {
            var9 = new ArrayList();
            var9.add(var11);
            int var12 = var8;

            while(var0.nextInt(50) <= var12) {
               Iterator var21 = var10.keySet().iterator();

               label75:
               while(true) {
                  Iterator var13 = var21;

                  while(true) {
                     if(!var13.hasNext()) {
                        break label75;
                     }

                     Integer var14 = (Integer)var13.next();
                     boolean var15 = true;
                     var21 = var9.iterator();
                     if(var3 == null) {
                        break;
                     }

                     Iterator var16 = var21;

                     boolean var22;
                     while(true) {
                        if(var16.hasNext()) {
                           class_1655 var17 = (class_1655)var16.next();
                           var22 = var17.field_8614.method_5487(class_940.field_4782[var14.intValue()]);
                           if(var3 == null) {
                              break;
                           }

                           if(var3 != null) {
                              if(var22 && var3 != null) {
                                 continue;
                              }

                              var22 = false;
                           }

                           var15 = var22;
                        }

                        var22 = var15;
                        break;
                     }

                     if(!var22) {
                        var13.remove();
                     }

                     if(var3 == null) {
                        break label75;
                     }
                  }
               }

               var19 = var10.isEmpty();
               if(var3 != null) {
                  if(var19 == 0) {
                     class_1655 var18 = (class_1655)class_1725.method_9638(var0, var10.values());
                     var9.add(var18);
                  }

                  var19 = var12 >> 1;
               }

               var12 = var19;
               if(var3 == null) {
                  break;
               }
            }
         }
      }

      return var9;
   }

   // $FF: renamed from: c (int, add) java.util.Map
   public static Map method_5665(int var0, add var1) {
      adb var3 = var1.method_3730();
      String[] var10000 = class_752.method_4253();
      HashMap var4 = null;
      String[] var2 = var10000;
      int var5 = var1.method_3730() == class_1010.field_5198?1:0;
      class_940[] var6 = class_940.field_4782;
      int var7 = var6.length;
      int var8 = 0;

      label75:
      do {
         int var11 = var8;
         int var10001 = var7;

         label72:
         while(var11 < var10001) {
            class_940 var9 = var6[var8];
            if(var2 == null) {
               continue label75;
            }

            if(var9 != null) {
               label81: {
                  var11 = var9.field_4810.method_440(var3);
                  if(var2 != null) {
                     label66: {
                        if(var11 == 0) {
                           var11 = var5;
                           if(var2 == null) {
                              break label66;
                           }

                           if(var5 == 0) {
                              break label81;
                           }
                        }

                        var11 = var9.method_5481();
                     }
                  }

                  int var10 = var11;

                  while(var10 <= var9.method_5482()) {
                     var11 = var0;
                     var10001 = var9.method_5483(var10);
                     if(var2 == null) {
                        continue label72;
                     }

                     label55: {
                        if(var2 != null) {
                           if(var0 < var10001) {
                              break label55;
                           }

                           var11 = var0;
                           var10001 = var9.method_5484(var10);
                        }

                        if(var11 <= var10001 && var2 != null) {
                           if(var4 == null) {
                              var4 = new HashMap();
                           }

                           Integer var12 = Integer.valueOf(var9.field_4808);
                           class_1655 var10002 = new class_1655;
                           var10002.method_9103(var9, var10);
                           var4.put(var12, var10002);
                        }
                     }

                     ++var10;
                     if(var2 == null) {
                        break;
                     }
                  }
               }
            }

            ++var8;
            continue label75;
         }

         return var4;
      } while(var2 != null);

      return var4;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5666() {
      // $FF: Couldn't be decompiled
   }
}
