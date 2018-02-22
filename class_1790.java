import java.util.Collection;
import java.util.List;

// $FF: renamed from: zj
public abstract class class_1790 implements class_15 {

   // $FF: renamed from: b zh
   private static class_87 field_9329;
   // $FF: renamed from: c java.lang.String
   private static final String field_9330;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9331;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super();
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 4;
   }

   // $FF: renamed from: c () java.util.List
   public List method_45() {
      return null;
   }

   // $FF: renamed from: b (bh) boolean
   public boolean method_47(class_20 var1) {
      return var1.method_67(this.method_9833(), this.method_43());
   }

   // $FF: renamed from: b (bh, java.lang.String[]) java.util.List
   public List method_48(class_20 var1, String[] var2) {
      return null;
   }

   // $FF: renamed from: b (bh, java.lang.String) int
   public static int method_9834(class_20 var0, String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var3) {
         class_642 var10000 = new class_642;
         String[] var10002 = field_9331;
         var10000.method_3515("commands.generic.num.invalid", new Object[]{var1});
         throw var10000;
      }
   }

   // $FF: renamed from: b (bh, java.lang.String, int) int
   public static int method_9835(class_20 var0, String var1, int var2) {
      return method_9836(var0, var1, var2, Integer.MAX_VALUE);
   }

   // $FF: renamed from: b (bh, java.lang.String, int, int) int
   public static int method_9836(class_20 param0, String param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (bh, java.lang.String) double
   public static double method_9837(class_20 param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, java.lang.String, double) double
   public static double method_9838(class_20 var0, String var1, double var2) {
      return method_9839(var0, var1, var2, Double.MAX_VALUE);
   }

   // $FF: renamed from: b (bh, java.lang.String, double, double) double
   public static double method_9839(class_20 param0, String param1, double param2, double param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (bh, java.lang.String) boolean
   public static boolean method_9840(class_20 param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (bh) xi
   public static class_793 method_9841(class_20 param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (bh, java.lang.String) xi
   public static class_793 method_9842(class_20 param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (bh, java.lang.String) java.lang.String
   public static String method_9843(class_20 param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, java.lang.String[], int) rV
   public static class_66 method_9844(class_20 var0, String[] var1, int var2) {
      return method_9845(var0, var1, var2, false);
   }

   // $FF: renamed from: b (bh, java.lang.String[], int, boolean) rV
   public static class_66 method_9845(class_20 var0, String[] var1, int var2, boolean var3) {
      String[] var10000 = class_752.method_4253();
      class_1082 var10001 = new class_1082;
      var10001.method_6134("");
      class_1082 var5 = var10001;
      String[] var4 = var10000;
      int var6 = var2;

      while(var6 < var1.length) {
         try {
            if(var6 > var2) {
               var5.method_339(" ");
            }
         } catch (NumberFormatException var12) {
            throw method_9861(var12);
         }

         class_1082 var13 = new class_1082;
         var13.method_6134(var1[var6]);
         Object var7 = var13;

         label56: {
            label70: {
               try {
                  if(var4 == null) {
                     break label56;
                  }

                  if(!var3) {
                     break label70;
                  }
               } catch (NumberFormatException var11) {
                  throw method_9861(var11);
               }

               class_66 var8 = class_957.method_5517(var0, var1[var6]);

               label46: {
                  class_66 var14;
                  label45: {
                     try {
                        var14 = var8;
                        if(var4 == null) {
                           break label45;
                        }

                        if(var8 == null) {
                           break label46;
                        }
                     } catch (NumberFormatException var10) {
                        throw method_9861(var10);
                     }

                     var14 = var8;
                  }

                  var7 = var14;
                  break label70;
               }

               try {
                  if(class_957.method_5522(var1[var6])) {
                     class_639 var15 = new class_639;
                     var15.method_3519();
                     throw var15;
                  }
               } catch (NumberFormatException var9) {
                  throw method_9861(var9);
               }
            }

            var5.method_340((class_66)var7);
            ++var6;
         }

         if(var4 == null) {
            break;
         }
      }

      return var5;
   }

   // $FF: renamed from: c (bh, java.lang.String[], int) java.lang.String
   public static String method_9846(class_20 var0, String[] var1, int var2) {
      String[] var10000 = class_752.method_4253();
      StringBuilder var4 = new StringBuilder();
      String[] var3 = var10000;
      int var5 = var2;

      while(var5 < var1.length) {
         try {
            if(var5 > var2) {
               var4.append(" ");
            }
         } catch (NumberFormatException var7) {
            throw method_9861(var7);
         }

         String var6 = var1[var5];
         var4.append(var6);
         ++var5;
         if(var3 == null) {
            break;
         }
      }

      return var4.toString();
   }

   // $FF: renamed from: b (bh, double, java.lang.String) double
   public static double method_9847(class_20 var0, double var1, String var3) {
      return method_9848(var0, var1, var3, -30000000, 30000000);
   }

   // $FF: renamed from: b (bh, double, java.lang.String, int, int) double
   public static double method_9848(class_20 param0, double param1, String param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g (bh, java.lang.String) adb
   public static adb method_9849(class_20 param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h (bh, java.lang.String) aji
   public static aji method_9850(class_20 param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Object[]) java.lang.String
   public static String method_9851(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (rV[]) rV
   public static class_66 method_9852(class_66[] param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.Collection) java.lang.String
   public static String method_9853(Collection var0) {
      return method_9851(var0.toArray(new String[var0.size()]));
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) boolean
   public static boolean method_9854(String var0, String var1) {
      return var1.regionMatches(true, 0, var0, 0, var0.length());
   }

   // $FF: renamed from: b (java.lang.String[], java.lang.String[]) java.util.List
   public static List method_9855(String[] param0, String ... param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String[], java.lang.Iterable) java.util.List
   public static List method_9856(String[] param0, Iterable param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String[], int) boolean
   public boolean method_49(String[] var1, int var2) {
      return false;
   }

   // $FF: renamed from: b (bh, aM, java.lang.String, java.lang.Object[]) void
   public static void method_9857(class_20 var0, class_15 var1, String var2, Object ... var3) {
      method_9858(var0, var1, 0, var2, var3);
   }

   // $FF: renamed from: b (bh, aM, int, java.lang.String, java.lang.Object[]) void
   public static void method_9858(class_20 var0, class_15 var1, int var2, String var3, Object ... var4) {
      String[] var5 = class_752.method_4253();

      class_87 var10000;
      label20: {
         try {
            var10000 = field_9329;
            if(var5 == null) {
               break label20;
            }

            if(field_9329 == null) {
               return;
            }
         } catch (NumberFormatException var6) {
            throw method_9861(var6);
         }

         var10000 = field_9329;
      }

      var10000.method_410(var0, var1, var2, var3, var4);
   }

   // $FF: renamed from: b (zh) void
   public static void method_9859(class_87 var0) {
      field_9329 = var0;
   }

   // $FF: renamed from: b (aM) int
   public int method_9860(class_15 var1) {
      return this.method_43().compareTo(var1.method_43());
   }

   public int compareTo(Object var1) {
      return this.method_9860((class_15)var1);
   }

   // $FF: renamed from: b (java.lang.NumberFormatException) java.lang.NumberFormatException
   private static NumberFormatException method_9861(NumberFormatException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}
