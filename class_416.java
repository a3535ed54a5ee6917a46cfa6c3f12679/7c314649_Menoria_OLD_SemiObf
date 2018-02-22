import java.util.Random;

// $FF: renamed from: eZ
public class class_416 extends aji {

   // $FF: renamed from: N java.lang.String
   private static final String field_2133 = "portal";


   // $FF: renamed from: <init> () void
   public void method_2667() {
      super.method_2427(awt.field_4199);
      this.method_2443(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      this.method_2668(var1, var2, var3, var4);
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   private void method_2668(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = class_464.method_2815(var1, var2, var3 - 1, var4);
      if(var5 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = var3;
      }

      if(var5 != null) {
         if(var10000 < 0) {
            return;
         }

         var10000 = 32;
      }

      label68: {
         int var6 = var10000;
         if(var5 != null) {
            label52: {
               if(!class_464.field_2229) {
                  boolean var8 = var1.method_2050(var2 - var6, var3 - var6, var4 - var6, var2 + var6, var3 + var6, var4 + var6);
                  if(var5 == null) {
                     break label52;
                  }

                  if(var8) {
                     break label68;
                  }
               }

               var1.method_2056(var2, var3, var4);
            }
         }

         while(true) {
            if(class_464.method_2815(var1, var2, var3 - 1, var4)) {
               var10000 = var3;
               if(var5 == null || var5 == null) {
                  break;
               }

               if(var3 > 0) {
                  --var3;
                  if(var5 != null) {
                     continue;
                  }
               }
            }

            var10000 = var3;
            break;
         }

         if(var5 != null) {
            if(var10000 <= 0) {
               return;
            }

            var1.method_2054(var2, var3, var4, this, 0, 2);
         }

         if(var5 != null) {
            return;
         }
      }

      class_700 var9 = new class_700;
      var9.method_4037(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this);
      class_700 var7 = var9;
      var1.method_2089(var7);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      this.method_2669(var1, var2, var3, var4);
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz) void
   public void method_2484(ahb var1, int var2, int var3, int var4, class_792 var5) {
      this.method_2669(var1, var2, var3, var4);
   }

   // $FF: renamed from: i (ahb, int, int, int) void
   private void method_2669(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      if(var1.getBlock(var2, var3, var4) == this) {
         int var6 = 0;

         while(var6 < 1000) {
            int var7 = var2 + var1.field_1819.nextInt(16) - var1.field_1819.nextInt(16);
            int var8 = var3 + var1.field_1819.nextInt(8) - var1.field_1819.nextInt(8);
            int var9 = var4 + var1.field_1819.nextInt(16) - var1.field_1819.nextInt(16);
            if(var5 != null) {
               if(var1.getBlock(var7, var8, var9).field_2007 == awt.field_4170) {
                  short var10000 = var1.field_1832;
                  if(var5 != null) {
                     if(!var1.field_1832) {
                        var1.method_2054(var7, var8, var9, this, var1.method_33(var2, var3, var4), 2);
                        var1.method_2056(var2, var3, var4);
                        if(var5 != null) {
                           return;
                        }
                     }

                     var10000 = 128;
                  }

                  short var10 = var10000;
                  int var11 = 0;

                  while(var11 < var10) {
                     double var12 = var1.field_1819.nextDouble();
                     float var14 = (var1.field_1819.nextFloat() - 0.5F) * 0.2F;
                     float var15 = (var1.field_1819.nextFloat() - 0.5F) * 0.2F;
                     float var16 = (var1.field_1819.nextFloat() - 0.5F) * 0.2F;
                     double var17 = (double)var7 + (double)(var2 - var7) * var12 + (var1.field_1819.nextDouble() - 0.5D) * 1.0D + 0.5D;
                     double var19 = (double)var8 + (double)(var3 - var8) * var12 + var1.field_1819.nextDouble() * 1.0D - 0.5D;
                     double var21 = (double)var9 + (double)(var4 - var9) * var12 + (var1.field_1819.nextDouble() - 0.5D) * 1.0D + 0.5D;
                     var1.method_2087("portal", var17, var19, var21, (double)var14, (double)var15, (double)var16);
                     ++var11;
                     if(var5 == null) {
                        break;
                     }
                  }

                  return;
               }

               ++var6;
            }

            if(var5 == null) {
               break;
            }
         }

      }
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 5;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 27;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return adb.method_2919(0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "²AJ".toCharArray();
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
            field_2133 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 79;
            break;
         case 1:
            var10009 = 120;
            break;
         case 2:
            var10009 = 240;
            break;
         case 3:
            var10009 = 184;
            break;
         case 4:
            var10009 = 255;
            break;
         case 5:
            var10009 = 171;
            break;
         default:
            var10009 = 142;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
