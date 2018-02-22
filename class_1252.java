import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// $FF: renamed from: hY
public class class_1252 {

   // $FF: renamed from: a h0[]
   private static final class_1075[] field_6493;
   // $FF: renamed from: b java.util.List
   private static List field_6494;
   // $FF: renamed from: c java.lang.Class
   private static Class field_6495;
   // $FF: renamed from: d int
   static int field_6496;
   // $FF: renamed from: f i1
   private static final class_1196 field_6497;
   // $FF: renamed from: g java.lang.String
   private static final String field_6498;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6499;


   // $FF: renamed from: <init> () void
   public void method_6591() {
      super();
   }

   // $FF: renamed from: b () void
   public static void method_6592() {
      String[] var0 = field_6499;
      class_1093.method_6184(class_1134.class, "SHCC");
      class_1093.method_6184(class_1133.class, "SHFC");
      class_1093.method_6184(class_1132.class, "SH5C");
      class_1093.method_6184(class_1143.class, "SHLT");
      class_1093.method_6184(class_1142.class, "SHLi");
      class_1093.method_6184(class_1141.class, "SHPR");
      class_1093.method_6184(class_1140.class, "SHPH");
      class_1093.method_6184(class_1144.class, "SHRT");
      class_1093.method_6184(class_1139.class, "SHRC");
      class_1093.method_6184(class_1137.class, "SHSD");
      class_1093.method_6184(class_1138.class, "SHStart");
      class_1093.method_6184(class_1136.class, "SHS");
      class_1093.method_6184(class_1135.class, "SHSSD");
   }

   // $FF: renamed from: c () void
   public static void method_6593() {
      field_6494 = new ArrayList();
      String[] var0 = class_752.method_4253();
      class_1075[] var1 = field_6493;
      int var2 = var1.length;
      int var3 = 0;

      while(true) {
         if(var3 < var2) {
            class_1075 var4 = var1[var3];
            var4.field_5668 = 0;
            field_6494.add(var4);
            ++var3;
            if(var0 == null) {
               break;
            }

            if(var0 != null) {
               continue;
            }
         }

         field_6495 = null;
         break;
      }

   }

   // $FF: renamed from: e () boolean
   private static boolean method_6594() {
      String[] var10000 = class_752.method_4253();
      byte var1 = 0;
      String[] var0 = var10000;
      field_6496 = 0;
      Iterator var3 = field_6494.iterator();

      int var4;
      while(true) {
         if(var3.hasNext()) {
            class_1075 var2 = (class_1075)var3.next();
            var4 = var2.field_5669;
            if(var0 == null) {
               break;
            }

            if(var0 != null) {
               int var10001;
               label25: {
                  if(var2.field_5669 > 0) {
                     var4 = var2.field_5668;
                     var10001 = var2.field_5669;
                     if(var0 == null) {
                        break label25;
                     }

                     if(var2.field_5668 < var2.field_5669) {
                        var1 = 1;
                     }
                  }

                  var4 = field_6496;
                  var10001 = var2.field_5667;
               }

               var4 += var10001;
            }

            field_6496 = var4;
            if(var0 != null) {
               continue;
            }
         }

         var4 = var1;
         break;
      }

      return (boolean)var4;
   }

   // $FF: renamed from: b (java.lang.Class, java.util.List, java.util.Random, int, int, int, int, int) iw
   private static class_1131 method_6595(Class var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      String[] var10000 = class_752.method_4253();
      Object var9 = null;
      String[] var8 = var10000;
      Class var10 = var0;
      Class var10001 = class_1136.class;
      if(var8 != null) {
         if(var0 == class_1136.class) {
            var9 = class_1136.method_6317(var1, var2, var3, var4, var5, var6, var7);
            return (class_1131)var9;
         }

         var10 = var0;
         var10001 = class_1140.class;
      }

      if(var8 != null) {
         if(var10 == var10001) {
            var9 = class_1140.method_6324(var1, var2, var3, var4, var5, var6, var7);
            return (class_1131)var9;
         }

         var10 = var0;
         var10001 = class_1143.class;
      }

      if(var8 != null) {
         if(var10 == var10001) {
            var9 = class_1143.method_6330(var1, var2, var3, var4, var5, var6, var7);
            return (class_1131)var9;
         }

         var10 = var0;
         var10001 = class_1144.class;
      }

      if(var8 != null) {
         if(var10 == var10001) {
            var9 = class_1144.method_6330(var1, var2, var3, var4, var5, var6, var7);
            return (class_1131)var9;
         }

         var10 = var0;
         var10001 = class_1139.class;
      }

      if(var8 != null) {
         if(var10 == var10001) {
            var9 = class_1139.method_6322(var1, var2, var3, var4, var5, var6, var7);
            return (class_1131)var9;
         }

         var10 = var0;
         var10001 = class_1135.class;
      }

      if(var8 != null) {
         if(var10 == var10001) {
            var9 = class_1135.method_6315(var1, var2, var3, var4, var5, var6, var7);
            return (class_1131)var9;
         }

         var10 = var0;
         var10001 = class_1137.class;
      }

      if(var8 != null) {
         if(var10 == var10001) {
            var9 = class_1137.method_6320(var1, var2, var3, var4, var5, var6, var7);
            return (class_1131)var9;
         }

         var10 = var0;
         var10001 = class_1132.class;
      }

      if(var8 != null) {
         if(var10 == var10001) {
            var9 = class_1132.method_6309(var1, var2, var3, var4, var5, var6, var7);
            return (class_1131)var9;
         }

         var10 = var0;
         var10001 = class_1134.class;
      }

      if(var8 != null) {
         if(var10 == var10001) {
            var9 = class_1134.method_6313(var1, var2, var3, var4, var5, var6, var7);
            return (class_1131)var9;
         }

         var10 = var0;
         var10001 = class_1142.class;
      }

      if(var8 != null) {
         if(var10 == var10001) {
            var9 = class_1142.method_6328(var1, var2, var3, var4, var5, var6, var7);
            return (class_1131)var9;
         }

         var10 = var0;
         var10001 = class_1141.class;
      }

      if(var10 == var10001) {
         var9 = class_1141.method_6326(var1, var2, var3, var4, var5, var6, var7);
      }

      return (class_1131)var9;
   }

   // $FF: renamed from: a (iH, java.util.List, java.util.Random, int, int, int, int, int) iw
   private static class_1131 method_6596(class_1138 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      String[] var8 = class_752.method_4253();
      if(!method_6594()) {
         return null;
      } else {
         label119: {
            Class var10000 = field_6495;
            if(var8 != null) {
               if(field_6495 == null) {
                  break label119;
               }

               var10000 = field_6495;
            }

            class_1131 var9 = method_6595(var10000, var1, var2, var3, var4, var5, var6, var7);
            field_6495 = null;
            class_1131 var19 = var9;
            if(var8 != null) {
               if(var9 == null) {
                  break label119;
               }

               var19 = var9;
            }

            return var19;
         }

         int var17 = 0;

         label103:
         while(true) {
            int var20 = var17;

            List var21;
            label100:
            while(true) {
               if(var20 < 5) {
                  ++var17;
                  int var10 = var2.nextInt(field_6496);
                  var21 = field_6494;
                  if(var8 == null) {
                     break;
                  }

                  Iterator var11 = field_6494.iterator();

                  while(true) {
                     if(var11.hasNext()) {
                        label122: {
                           class_1075 var12 = (class_1075)var11.next();
                           var10 -= var12.field_5667;
                           var20 = var10;
                           if(var8 == null) {
                              continue label100;
                           }

                           label134: {
                              class_1075 var22;
                              label124: {
                                 if(var8 != null) {
                                    if(var10 >= 0) {
                                       break label134;
                                    }

                                    var22 = var12;
                                    if(var8 == null) {
                                       break label124;
                                    }

                                    var20 = var12.method_6105(var7);
                                 }

                                 if(var20 == 0) {
                                    break label122;
                                 }

                                 var22 = var12;
                              }

                              if(var8 != null) {
                                 if(var22 == var0.field_5875 && var8 != null) {
                                    break label122;
                                 }

                                 var22 = var12;
                              }

                              class_1131 var13 = method_6595(var22.field_5666, var1, var2, var3, var4, var5, var6, var7);
                              Object var14;
                              if(var8 != null) {
                                 if(var13 == null) {
                                    break label134;
                                 }

                                 ++var12.field_5668;
                                 var14 = var0;
                                 if(var8 == null) {
                                    return (class_1131)var14;
                                 }

                                 var0.field_5875 = var12;
                              }

                              if(!var12.method_6106()) {
                                 field_6494.remove(var12);
                              }

                              var14 = var13;
                              return (class_1131)var14;
                           }

                           if(var8 != null) {
                              continue;
                           }
                        }
                     }

                     if(var8 != null) {
                        continue label103;
                     }
                     break;
                  }
               }

               var21 = var1;
               break;
            }

            class_1206 var18 = class_1133.method_6311(var21, var2, var3, var4, var5, var6);
            class_1206 var15 = var18;
            if(var8 != null) {
               if(var18 == null) {
                  return null;
               }

               var15 = var18;
            }

            if(var15.field_6245 > 1) {
               class_1133 var16 = new class_1133;
               var16.method_6310(var7, var2, var18, var6);
               return var16;
            }

            return null;
         }
      }
   }

   // $FF: renamed from: b (iH, java.util.List, java.util.Random, int, int, int, int, int) h7
   private static class_1094 method_6597(class_1138 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
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
         class_1131 var9 = method_6596(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         class_1131 var10 = var9;
         if(var8 != null) {
            if(var9 != null) {
               var1.add(var9);
               var0.field_5877.add(var9);
            }

            var10 = var9;
         }

         return var10;
      } else {
         return null;
      }
   }

   // $FF: renamed from: f () i1
   static class_1196 method_6598() {
      return field_6497;
   }

   // $FF: renamed from: b (java.lang.Class) java.lang.Class
   static Class method_6599(Class var0) {
      field_6495 = var0;
      return var0;
   }

   // $FF: renamed from: c (iH, java.util.List, java.util.Random, int, int, int, int, int) h7
   static class_1094 method_6600(class_1138 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return method_6597(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6601() {
      // $FF: Couldn't be decompiled
   }
}
