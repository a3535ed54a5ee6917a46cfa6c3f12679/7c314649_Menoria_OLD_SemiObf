import java.util.List;
import java.util.Random;

// $FF: renamed from: ee
public class class_480 extends class_473 {

   // $FF: renamed from: M java.util.Random
   private final Random field_2252;
   // $FF: renamed from: N vL
   private class_73 field_2253;
   // $FF: renamed from: O vL
   private class_73 field_2254;
   // $FF: renamed from: P vL
   private class_73 field_2255;
   // $FF: renamed from: Q java.lang.String[]
   private static final String[] field_2256;


   // $FF: renamed from: <init> () void
   public void method_2836() {
      super.method_2427(awt.field_4175);
      this.field_2252 = new Random();
      this.method_2521(class_872.field_4246);
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
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
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, float, float, int) int
   public int method_2483(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var11 = class_1707.field_8946[var5];
      String[] var10 = class_752.method_4253();
      int var10000 = var11;
      if(var10 != null) {
         if(var11 == 1) {
            var11 = 0;
         }

         var10000 = var11;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_585 var10000 = new class_585;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      super.method_2506(var1, var2, var3, var4, var5, var6);
      if(var6.method_3773()) {
         class_585 var7 = method_2841(var1, var2, var3, var4);
         var7.method_3124(var6.method_3770());
      }

   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      super.method_2461(var1, var2, var3, var4);
      this.method_2837(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      ahb var10000 = var1;
      if(var10 != null) {
         if(var1.field_1832) {
            return true;
         }

         var10000 = var1;
      }

      class_585 var11 = method_2841(var10000, var2, var3, var4);
      if(var11 != null) {
         var5.method_4576(var11);
      }

      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      this.method_2837(var1, var2, var3, var4);
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   private void method_2837(ahb var1, int var2, int var3, int var4) {
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = class_752.method_4253();
      int var7 = method_2838(var6);
      int var10000 = var1.method_2172(var2, var3, var4);
      if(var5 != null) {
         var10000 = var10000 == 0?1:0;
      }

      int var8 = var10000;
      byte var9 = method_2839(var6);
      if(var8 != var9) {
         int var10005 = var8;
         if(var5 != null) {
            var10005 = var8 != 0?0:8;
         }

         var1.method_2055(var2, var3, var4, var7 | var10005, 4);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var10000 = class_752.method_4253();
      class_585 var8 = (class_585)var1.method_31(var2, var3, var4);
      String[] var7 = var10000;
      if(var7 != null) {
         if(var8 != null) {
            int var9 = 0;

            label62:
            do {
               int var17 = var9;
               int var10001 = var8.method_83();

               label59:
               while(true) {
                  if(var17 >= var10001) {
                     break label62;
                  }

                  add var10 = var8.method_84(var9);
                  if(var7 == null) {
                     return;
                  }

                  if(var7 == null) {
                     break;
                  }

                  if(var10 != null) {
                     float var11 = this.field_2252.nextFloat() * 0.8F + 0.1F;
                     float var12 = this.field_2252.nextFloat() * 0.8F + 0.1F;
                     float var13 = this.field_2252.nextFloat() * 0.8F + 0.1F;

                     while(var10.field_2958 > 0) {
                        int var14 = this.field_2252.nextInt(21) + 10;
                        if(var7 != null) {
                           var17 = var14;
                           var10001 = var10.field_2958;
                           if(var7 == null) {
                              continue label59;
                           }

                           if(var14 > var10.field_2958) {
                              var14 = var10.field_2958;
                           }

                           var10.field_2958 -= var14;
                        }

                        class_699 var15;
                        label35: {
                           class_699 var18 = new class_699;
                           double var10003 = (double)((float)var2 + var11);
                           double var10004 = (double)((float)var3 + var12);
                           double var10005 = (double)((float)var4 + var13);
                           add var10006 = new add;
                           var10006.method_3726(var10.method_3730(), var14, var10.method_3745());
                           var18.method_4025(var1, var10003, var10004, var10005, var10006);
                           var15 = var18;
                           add var19 = var10;
                           if(var7 != null) {
                              if(!var10.method_3766()) {
                                 break label35;
                              }

                              var19 = var15.method_4030();
                           }

                           var19.method_3769((class_1583)var10.method_3767().method_8633());
                        }

                        float var16 = 0.05F;
                        var15.field_2997 = (double)((float)this.field_2252.nextGaussian() * var16);
                        var15.field_2998 = (double)((float)this.field_2252.nextGaussian() * var16 + 0.2F);
                        var15.field_2999 = (double)((float)this.field_2252.nextGaussian() * var16);
                        var1.method_2089(var15);
                        if(var7 == null) {
                           break;
                        }
                     }
                  }

                  ++var9;
                  break;
               }
            } while(var7 != null);

            var1.method_2221(var2, var3, var4, var5);
         }

         super.method_2462(var1, var2, var3, var4, var5, var6);
      }

   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 38;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return var1 == 1?this.field_2254:this.field_2253;
   }

   // $FF: renamed from: c (int) int
   public static int method_2838(int var0) {
      return var0 & 7;
   }

   // $FF: renamed from: d (int) boolean
   public static boolean method_2839(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0 & 8;
      if(var1 != null) {
         var10000 = var10000 != 8?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return true;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      return class_671.method_3676(method_2841(var1, var2, var3, var4));
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var2 = field_2256;
      this.field_2253 = var1.method_375("hopper_outside");
      this.field_2254 = var1.method_375("hopper_top");
      this.field_2255 = var1.method_375("hopper_inside");
   }

   // $FF: renamed from: a (java.lang.String) vL
   public static class_73 method_2840(String var0) {
      String[] var1 = class_752.method_4253();
      String[] var2 = field_2256;
      boolean var10000 = var0.equals("hopper_outside");
      if(var1 != null) {
         if(var10000) {
            return class_1192.field_6178.field_2253;
         }

         String[] var10001 = field_2256;
         var10000 = var0.equals("hopper_inside");
      }

      return var10000?class_1192.field_6178.field_2255:null;
   }

   // $FF: renamed from: O () java.lang.String
   public String getItemIconName() {
      String[] var10000 = field_2256;
      return "hopper";
   }

   // $FF: renamed from: f (ahl, int, int, int) gv
   public static class_585 method_2841(ahl var0, int var1, int var2, int var3) {
      return (class_585)var0.method_31(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
