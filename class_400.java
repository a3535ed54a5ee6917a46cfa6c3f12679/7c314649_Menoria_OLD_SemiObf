import java.util.Random;

// $FF: renamed from: el
public abstract class class_400 extends aji {

   // $FF: renamed from: M java.lang.String
   private String field_2099;
   // $FF: renamed from: N java.lang.String
   private static final String field_2100 = "random.click";


   // $FF: renamed from: <init> (java.lang.String, awt) void
   protected void method_2632(String var1, awt var2) {
      super.method_2427(var2);
      this.field_2099 = var1;
      this.method_2521(class_872.field_4246);
      this.method_2440(true);
      this.method_2633(this.method_2639(15));
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.method_2633(var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: c (int) void
   protected void method_2633(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.method_2638(var1);
      if(var2 != null) {
         var10000 = var10000 > 0?1:0;
      }

      float var4;
      label23: {
         int var3 = var10000;
         var4 = 0.0625F;
         if(var2 != null) {
            if(var3 == 0) {
               break label23;
            }

            this.method_2443(var4, 0.0F, var4, 1.0F - var4, 0.03125F, 1.0F - var4);
         }

         if(var2 != null) {
            return;
         }
      }

      this.method_2443(var4, 0.0F, var4, 1.0F - var4, 0.0625F, 1.0F - var4);
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 20;
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b (ahl, int, int, int) boolean
   public boolean method_2435(ahl var1, int var2, int var3, int var4) {
      return true;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var5 != null) {
         if(!var10000) {
            var10000 = class_462.method_2808(var1.getBlock(var2, var3 - 1, var4));
            if(var5 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var10000 = class_752.method_4253();
      boolean var7 = false;
      String[] var6 = var10000;
      boolean var8 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var6 != null) {
         label26: {
            if(!var8) {
               var8 = class_462.method_2808(var1.getBlock(var2, var3 - 1, var4));
               if(var6 == null) {
                  break label26;
               }

               if(!var8) {
                  var7 = true;
               }
            }

            var8 = var7;
         }
      }

      if(var6 != null && var8) {
         this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = this.method_2638(var1.method_33(var2, var3, var4));
      }

      int var7 = var10000;
      if(var7 > 0) {
         this.method_2634(var1, var2, var3, var4, var7);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, sa) void
   public void method_2498(ahb var1, int var2, int var3, int var4, class_689 var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = this.method_2638(var1.method_33(var2, var3, var4));
      }

      int var7 = var10000;
      if(var7 == 0) {
         this.method_2634(var1, var2, var3, var4, var7);
      }

   }

   // $FF: renamed from: h (ahb, int, int, int, int) void
   protected void method_2634(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = this.method_2637(var1, var2, var3, var4);
      String[] var6 = var10000;
      int var10 = var5;
      if(var6 != null) {
         var10 = var5 > 0?1:0;
      }

      int var8 = var10;
      var10 = var7;
      if(var6 != null) {
         var10 = var7 > 0?1:0;
      }

      int var9 = var10;
      var10 = var5;
      if(var6 != null) {
         if(var5 != var7) {
            var1.method_2055(var2, var3, var4, this.method_2639(var7), 2);
            this.method_2636(var1, var2, var3, var4);
            var1.method_2062(var2, var3, var4, var2, var3, var4);
         }

         var10 = var9;
      }

      label58: {
         label65: {
            if(var6 != null) {
               label55: {
                  if(var10 == 0) {
                     var10 = var8;
                     if(var6 == null) {
                        break label55;
                     }

                     if(var8 != 0) {
                        var1.method_2084((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
                        if(var6 != null) {
                           break label65;
                        }
                     }
                  }

                  var10 = var9;
               }
            }

            if(var6 == null) {
               break label58;
            }

            if(var10 != 0) {
               var10 = var8;
               if(var6 == null) {
                  break label58;
               }

               if(var8 == 0) {
                  var1.method_2084((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
               }
            }
         }

         var10 = var9;
      }

      if(var10 != 0) {
         var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
      }

   }

   // $FF: renamed from: b (int, int, int) kg
   protected class_1343 method_2635(int var1, int var2, int var3) {
      float var4 = 0.125F;
      return class_1343.method_7093((double)((float)var1 + var4), (double)var2, (double)((float)var3 + var4), (double)((float)(var1 + 1) - var4), (double)var2 + 0.25D, (double)((float)(var3 + 1) - var4));
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var7 = class_752.method_4253();
      class_400 var10000 = this;
      if(var7 != null) {
         if(this.method_2638(var6) > 0) {
            this.method_2636(var1, var2, var3, var4);
         }

         var10000 = this;
      }

      var10000.method_2462(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: e (ahb, int, int, int) void
   protected void method_2636(ahb var1, int var2, int var3, int var4) {
      var1.method_2063(var2, var3, var4, this);
      var1.method_2063(var2, var3 - 1, var4, this);
   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      return this.method_2638(var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         if(var5 == 1) {
            return this.method_2638(var1.method_33(var2, var3, var4));
         }

         var10000 = 0;
      }

      return var10000;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      return true;
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      float var1 = 0.5F;
      float var2 = 0.125F;
      float var3 = 0.5F;
      this.method_2443(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   // $FF: renamed from: h () int
   public int method_2514() {
      return 1;
   }

   // $FF: renamed from: h (ahb, int, int, int) int
   protected abstract int method_2637(ahb var1, int var2, int var3, int var4);

   // $FF: renamed from: d (int) int
   protected abstract int method_2638(int var1);

   // $FF: renamed from: k (int) int
   protected abstract int method_2639(int var1);

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2010 = var1.method_375(this.field_2099);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "Þu(¸éÏr/¼".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2100 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 51;
            break;
         case 1:
            var10009 = 102;
            break;
         case 2:
            var10009 = 132;
            break;
         case 3:
            var10009 = 211;
            break;
         case 4:
            var10009 = 72;
            break;
         case 5:
            var10009 = 230;
            break;
         default:
            var10009 = 88;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
