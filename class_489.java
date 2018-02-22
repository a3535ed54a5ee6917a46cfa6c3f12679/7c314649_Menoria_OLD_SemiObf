import java.util.List;
import java.util.Random;

// $FF: renamed from: d6
public class class_489 extends class_473 {

   // $FF: renamed from: M java.util.Random
   private Random field_2278;
   // $FF: renamed from: N vL
   private class_73 field_2279;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2280;


   // $FF: renamed from: <init> () void
   public void method_2858() {
      super.method_2427(awt.field_4175);
      this.field_2278 = new Random();
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 25;
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_595 var10000 = new class_595;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      this.method_2443(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
      this.method_2500();
      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
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

      class_595 var11 = (class_595)var10000.method_31(var2, var3, var4);
      if(var11 != null) {
         var5.method_4588(var11);
      }

      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      if(var6.method_3773()) {
         ((class_595)var1.method_31(var2, var3, var4)).method_3167(var6.method_3770());
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      double var6 = (double)((float)var2 + 0.4F + var5.nextFloat() * 0.2F);
      double var8 = (double)((float)var3 + 0.7F + var5.nextFloat() * 0.3F);
      double var10 = (double)((float)var4 + 0.4F + var5.nextFloat() * 0.2F);
      String[] var10001 = field_2280;
      var1.method_2087("smoke", var6, var8, var10, 0.0D, 0.0D, 0.0D);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var10000 = class_752.method_4253();
      class_580 var8 = var1.method_31(var2, var3, var4);
      String[] var7 = var10000;
      if(var7 != null) {
         if(var8 instanceof class_595) {
            class_595 var9 = (class_595)var8;
            int var10 = 0;

            label51:
            do {
               int var18 = var10;
               int var10001 = var9.method_83();

               label48:
               while(true) {
                  if(var18 >= var10001) {
                     break label51;
                  }

                  add var11 = var9.method_84(var10);
                  if(var7 == null) {
                     return;
                  }

                  if(var7 == null) {
                     break;
                  }

                  if(var11 != null) {
                     float var12 = this.field_2278.nextFloat() * 0.8F + 0.1F;
                     float var13 = this.field_2278.nextFloat() * 0.8F + 0.1F;
                     float var14 = this.field_2278.nextFloat() * 0.8F + 0.1F;

                     while(var11.field_2958 > 0) {
                        int var15 = this.field_2278.nextInt(21) + 10;
                        if(var7 != null) {
                           var18 = var15;
                           var10001 = var11.field_2958;
                           if(var7 == null) {
                              continue label48;
                           }

                           if(var15 > var11.field_2958) {
                              var15 = var11.field_2958;
                           }

                           var11.field_2958 -= var15;
                        }

                        class_699 var19 = new class_699;
                        double var10003 = (double)((float)var2 + var12);
                        double var10004 = (double)((float)var3 + var13);
                        double var10005 = (double)((float)var4 + var14);
                        add var10006 = new add;
                        var10006.method_3726(var11.method_3730(), var15, var11.method_3745());
                        var19.method_4025(var1, var10003, var10004, var10005, var10006);
                        class_699 var16 = var19;
                        float var17 = 0.05F;
                        var16.field_2997 = (double)((float)this.field_2278.nextGaussian() * var17);
                        var16.field_2998 = (double)((float)this.field_2278.nextGaussian() * var17 + 0.2F);
                        var16.field_2999 = (double)((float)this.field_2278.nextGaussian() * var17);
                        var1.method_2089(var16);
                        if(var7 == null) {
                           break;
                        }
                     }
                  }

                  ++var10;
                  break;
               }
            } while(var7 != null);
         }

         super.method_2462(var1, var2, var3, var4, var5, var6);
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5236;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5236;
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return true;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      return class_671.method_3676((class_22)var1.method_31(var2, var3, var4));
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      super.method_2535(var1);
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var10003 = field_2280;
      this.field_2279 = var1.method_375(var10002.append("_base").toString());
   }

   // $FF: renamed from: i () vL
   public class_73 method_2859() {
      return this.field_2279;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "~ÎJ~RÁDf";
      int var4 = "~ÎJ~RÁDf".length();
      char var1 = 5;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2280 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 178;
               break;
            case 1:
               var10009 = 28;
               break;
            case 2:
               var10009 = 154;
               break;
            case 3:
               var10009 = 170;
               break;
            case 4:
               var10009 = 88;
               break;
            case 5:
               var10009 = 199;
               break;
            default:
               var10009 = 216;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
