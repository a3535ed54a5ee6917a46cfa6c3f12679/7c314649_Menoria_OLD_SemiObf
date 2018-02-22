import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// $FF: renamed from: i8
public class class_1249 {

   // $FF: renamed from: a java.lang.String
   private static final String field_6486;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6487;


   // $FF: renamed from: <init> () void
   public void method_6576() {
      super();
   }

   // $FF: renamed from: b () void
   public static void method_6577() {
      String[] var0 = field_6487;
      class_1093.method_6184(class_1130.class, "ViBH");
      class_1093.method_6184(class_1129.class, "ViDF");
      class_1093.method_6184(class_1128.class, "ViF");
      class_1093.method_6184(class_1127.class, "ViL");
      class_1093.method_6184(class_1126.class, "ViPH");
      class_1093.method_6184(class_1125.class, "ViSH");
      class_1093.method_6184(class_1124.class, "ViSmH");
      class_1093.method_6184(class_1123.class, "ViST");
      class_1093.method_6184(class_1122.class, "ViS");
      class_1093.method_6184(class_1118.class, "ViStart");
      class_1093.method_6184(class_1120.class, "ViSR");
      class_1093.method_6184(class_1121.class, "ViTRH");
      class_1093.method_6184(class_1117.class, "ViW");
   }

   // $FF: renamed from: b (java.util.Random, int) java.util.List
   public static List method_6578(Random var0, int var1) {
      ArrayList var3 = new ArrayList();
      String[] var10000 = class_752.method_4253();
      class_1251 var10002 = new class_1251;
      var10002.method_6587(class_1125.class, 4, class_1715.method_9575(var0, 2 + var1, 4 + var1 * 2));
      var3.add(var10002);
      var10002 = new class_1251;
      var10002.method_6587(class_1123.class, 20, class_1715.method_9575(var0, 0 + var1, 1 + var1));
      var3.add(var10002);
      var10002 = new class_1251;
      var10002.method_6587(class_1130.class, 20, class_1715.method_9575(var0, 0 + var1, 2 + var1));
      var3.add(var10002);
      String[] var2 = var10000;
      class_1251 var10001 = new class_1251;
      var10001.method_6587(class_1124.class, 3, class_1715.method_9575(var0, 2 + var1, 5 + var1 * 3));
      var3.add(var10001);
      var10001 = new class_1251;
      var10001.method_6587(class_1126.class, 15, class_1715.method_9575(var0, 0 + var1, 2 + var1));
      var3.add(var10001);
      var10001 = new class_1251;
      var10001.method_6587(class_1129.class, 3, class_1715.method_9575(var0, 1 + var1, 4 + var1));
      var3.add(var10001);
      var10001 = new class_1251;
      var10001.method_6587(class_1128.class, 3, class_1715.method_9575(var0, 2 + var1, 4 + var1 * 2));
      var3.add(var10001);
      var10001 = new class_1251;
      var10001.method_6587(class_1122.class, 15, class_1715.method_9575(var0, 0, 1 + var1));
      var3.add(var10001);
      var10001 = new class_1251;
      var10001.method_6587(class_1121.class, 8, class_1715.method_9575(var0, 0 + var1, 3 + var1 * 2));
      var3.add(var10001);
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         Iterator var5 = var4;
         if(var2 != null) {
            if(((class_1251)var4.next()).field_6491 != 0) {
               continue;
            }

            var5 = var4;
         }

         var5.remove();
         if(var2 == null) {
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: b (java.util.List) int
   private static int method_6579(List var0) {
      byte var2 = 0;
      String[] var1 = class_752.method_4253();
      int var3 = 0;
      Iterator var5 = var0.iterator();

      int var10000;
      while(true) {
         if(var5.hasNext()) {
            class_1251 var4 = (class_1251)var5.next();
            var10000 = var4.field_6491;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               int var10001;
               label33: {
                  if(var4.field_6491 > 0) {
                     var10000 = var4.field_6490;
                     var10001 = var4.field_6491;
                     if(var1 == null) {
                        break label33;
                     }

                     if(var4.field_6490 < var4.field_6491) {
                        var2 = 1;
                     }
                  }

                  var10000 = var3;
                  var10001 = var4.field_6489;
               }

               var10000 += var10001;
            }

            var3 = var10000;
            if(var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      if(var1 != null) {
         var10000 = var10000 != 0?var3:-1;
      }

      return var10000;
   }

   // $FF: renamed from: b (iY, i9, java.util.List, java.util.Random, int, int, int, int, int) iK
   private static class_1116 method_6580(class_1118 var0, class_1251 var1, List var2, Random var3, int var4, int var5, int var6, int var7, int var8) {
      Class var10 = var1.field_6488;
      Object var11 = null;
      String[] var9 = class_752.method_4253();
      Class var10000 = var10;
      Class var10001 = class_1125.class;
      if(var9 != null) {
         if(var10 == class_1125.class) {
            var11 = class_1125.method_6289(var0, var2, var3, var4, var5, var6, var7, var8);
            return (class_1116)var11;
         }

         var10000 = var10;
         var10001 = class_1123.class;
      }

      if(var9 != null) {
         if(var10000 == var10001) {
            var11 = class_1123.method_6285(var0, var2, var3, var4, var5, var6, var7, var8);
            return (class_1116)var11;
         }

         var10000 = var10;
         var10001 = class_1130.class;
      }

      if(var9 != null) {
         if(var10000 == var10001) {
            var11 = class_1130.method_6301(var0, var2, var3, var4, var5, var6, var7, var8);
            return (class_1116)var11;
         }

         var10000 = var10;
         var10001 = class_1124.class;
      }

      if(var9 != null) {
         if(var10000 == var10001) {
            var11 = class_1124.method_6287(var0, var2, var3, var4, var5, var6, var7, var8);
            return (class_1116)var11;
         }

         var10000 = var10;
         var10001 = class_1126.class;
      }

      if(var9 != null) {
         if(var10000 == var10001) {
            var11 = class_1126.method_6291(var0, var2, var3, var4, var5, var6, var7, var8);
            return (class_1116)var11;
         }

         var10000 = var10;
         var10001 = class_1129.class;
      }

      if(var9 != null) {
         if(var10000 == var10001) {
            var11 = class_1129.method_6299(var0, var2, var3, var4, var5, var6, var7, var8);
            return (class_1116)var11;
         }

         var10000 = var10;
         var10001 = class_1128.class;
      }

      if(var9 != null) {
         if(var10000 == var10001) {
            var11 = class_1128.method_6296(var0, var2, var3, var4, var5, var6, var7, var8);
            return (class_1116)var11;
         }

         var10000 = var10;
         var10001 = class_1122.class;
      }

      if(var9 != null) {
         if(var10000 == var10001) {
            var11 = class_1122.method_6283(var0, var2, var3, var4, var5, var6, var7, var8);
            return (class_1116)var11;
         }

         var10000 = var10;
         var10001 = class_1121.class;
      }

      if(var10000 == var10001) {
         var11 = class_1121.method_6281(var0, var2, var3, var4, var5, var6, var7, var8);
      }

      return (class_1116)var11;
   }

   // $FF: renamed from: a (iY, java.util.List, java.util.Random, int, int, int, int, int) iK
   private static class_1116 method_6581(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      String[] var10000 = class_752.method_4253();
      int var9 = method_6579(var0.field_5818);
      String[] var8 = var10000;
      int var17 = var9;
      if(var8 != null) {
         if(var9 <= 0) {
            return null;
         }

         var17 = 0;
      }

      int var10 = var17;

      label97:
      while(true) {
         var17 = var10;

         class_1118 var18;
         label94:
         while(true) {
            if(var17 < 5) {
               ++var10;
               int var11 = var2.nextInt(var9);
               var18 = var0;
               if(var8 == null) {
                  break;
               }

               Iterator var12 = var0.field_5818.iterator();

               while(true) {
                  if(var12.hasNext()) {
                     label102: {
                        class_1251 var13 = (class_1251)var12.next();
                        var11 -= var13.field_6489;
                        var17 = var11;
                        if(var8 == null) {
                           continue label94;
                        }

                        label110: {
                           class_1251 var19;
                           label104: {
                              if(var8 != null) {
                                 if(var11 >= 0) {
                                    break label110;
                                 }

                                 var19 = var13;
                                 if(var8 == null) {
                                    break label104;
                                 }

                                 var17 = var13.method_6588(var7);
                              }

                              if(var17 == 0) {
                                 break label102;
                              }

                              var19 = var13;
                           }

                           Object var20;
                           label72: {
                              if(var19 == var0.field_5817) {
                                 var20 = var0;
                                 if(var8 == null) {
                                    break label72;
                                 }

                                 if(var0.field_5818.size() > 1 && var8 != null) {
                                    break label102;
                                 }
                              }

                              var20 = method_6580(var0, var13, var1, var2, var3, var4, var5, var6, var7);
                           }

                           Object var14 = var20;
                           if(var8 != null) {
                              if(var14 == null) {
                                 break label110;
                              }

                              ++var13.field_6490;
                              var20 = var0;
                              if(var8 == null) {
                                 return (class_1116)var20;
                              }

                              var0.field_5817 = var13;
                           }

                           if(!var13.method_6589()) {
                              var0.field_5818.remove(var13);
                           }

                           var20 = var14;
                           return (class_1116)var20;
                        }

                        if(var8 != null) {
                           continue;
                        }
                     }
                  }

                  if(var8 != null) {
                     continue label97;
                  }
                  break;
               }
            }

            var18 = var0;
            break;
         }

         class_1206 var16 = class_1127.method_6293(var18, var1, var2, var3, var4, var5, var6);
         if(var16 != null) {
            class_1127 var15 = new class_1127;
            var15.method_6292(var0, var7, var2, var16, var6);
            return var15;
         }

         return null;
      }
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int, int) h7
   private static class_1094 method_6582(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      String[] var8 = class_752.method_4253();
      int var10000 = var7;
      byte var10001 = 50;
      if(var8 != null) {
         if(var7 > 50) {
            return null;
         }

         var10000 = Math.abs(var3 - var0.method_6199().field_6244);
         var10001 = 112;
      }

      if(var8 != null) {
         if(var10000 > var10001) {
            return null;
         }

         var10000 = Math.abs(var5 - var0.method_6199().field_6246);
         var10001 = 112;
      }

      if(var10000 <= var10001) {
         class_1116 var9 = method_6581(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         class_1116 var15 = var9;
         if(var8 != null) {
            if(var9 == null) {
               return null;
            }

            var15 = var9;
         }

         int var10 = (var15.field_5752.field_6244 + var9.field_5752.field_6247) / 2;
         int var11 = (var9.field_5752.field_6246 + var9.field_5752.field_6249) / 2;
         int var12 = var9.field_5752.field_6247 - var9.field_5752.field_6244;
         int var13 = var9.field_5752.field_6249 - var9.field_5752.field_6246;
         var10000 = var12;
         if(var8 != null) {
            var10000 = var12 > var13?var12:var13;
         }

         int var14 = var10000;
         boolean var16 = var0.method_6277().method_5543(var10, var11, var14 / 2 + 4, class_1053.field_5571);
         if(var8 != null) {
            if(!var16) {
               return null;
            }

            var1.add(var9);
            var0.field_5819.add(var9);
         }

         return var9;
      } else {
         return null;
      }
   }

   // $FF: renamed from: c (iY, java.util.List, java.util.Random, int, int, int, int, int) h7
   private static class_1094 method_6583(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      String[] var8 = class_752.method_4253();
      int var10000 = var7;
      int var10001 = 3 + var0.field_5816;
      if(var8 != null) {
         if(var7 > var10001) {
            return null;
         }

         var10000 = Math.abs(var3 - var0.method_6199().field_6244);
         var10001 = 112;
      }

      if(var8 != null) {
         if(var10000 > var10001) {
            return null;
         }

         var10000 = Math.abs(var5 - var0.method_6199().field_6246);
         var10001 = 112;
      }

      if(var10000 <= var10001) {
         class_1206 var9 = class_1120.method_6279(var0, var1, var2, var3, var4, var5, var6);
         class_1206 var16 = var9;
         if(var8 != null) {
            if(var9 == null) {
               return null;
            }

            var16 = var9;
         }

         if(var16.field_6245 > 10) {
            class_1120 var17 = new class_1120;
            var17.method_6278(var0, var7, var2, var9, var6);
            class_1120 var10 = var17;
            int var11 = (var10.field_5752.field_6244 + var10.field_5752.field_6247) / 2;
            int var12 = (var10.field_5752.field_6246 + var10.field_5752.field_6249) / 2;
            int var13 = var10.field_5752.field_6247 - var10.field_5752.field_6244;
            int var14 = var10.field_5752.field_6249 - var10.field_5752.field_6246;
            var10000 = var13;
            if(var8 != null) {
               var10000 = var13 > var14?var13:var14;
            }

            int var15 = var10000;
            boolean var18 = var0.method_6277().method_5543(var11, var12, var15 / 2 + 4, class_1053.field_5571);
            if(var8 != null) {
               if(!var18) {
                  return null;
               }

               var1.add(var10);
               var0.field_5820.add(var10);
            }

            return var10;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: d (iY, java.util.List, java.util.Random, int, int, int, int, int) h7
   static class_1094 method_6584(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return method_6583(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: e (iY, java.util.List, java.util.Random, int, int, int, int, int) h7
   static class_1094 method_6585(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return method_6582(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6586() {
      // $FF: Couldn't be decompiled
   }
}
