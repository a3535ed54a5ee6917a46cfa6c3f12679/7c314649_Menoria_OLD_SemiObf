import java.util.Random;

// $FF: renamed from: e1
public class class_464 extends aji {

   // $FF: renamed from: N boolean
   public static boolean field_2229;


   // $FF: renamed from: <init> () void
   public void method_2812() {
      super.method_2427(awt.field_4185);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: <init> (awt) void
   public void method_2427(awt var1) {
      super.method_2427(var1);
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
      if(!var1.field_1832) {
         this.method_2813(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: e (ahb, int, int, int) void
   private void method_2813(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = method_2815(var1, var2, var3 - 1, var4);
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

      boolean var11;
      label58: {
         label72: {
            int var9 = var10000;
            if(var5 != null) {
               if(!field_2229) {
                  var11 = var1.method_2050(var2 - var9, var3 - var9, var4 - var9, var2 + var9, var3 + var9, var4 + var9);
                  if(var5 == null) {
                     break label58;
                  }

                  if(var11) {
                     break label72;
                  }
               }

               var1.method_2056(var2, var3, var4);
            }

            while(true) {
               if(method_2815(var1, var2, var3 - 1, var4)) {
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

               var1.method_2058(var2, var3, var4, this);
            }

            if(var5 != null) {
               return;
            }
         }

         var11 = var1.field_1832;
      }

      if(!var11) {
         class_700 var12 = new class_700;
         var12.method_4038(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this, var1.method_33(var2, var3, var4));
         class_700 var10 = var12;
         this.method_2814(var10);
         var1.method_2089(var10);
      }

   }

   // $FF: renamed from: b (xp) void
   protected void method_2814(class_700 var1) {}

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 2;
   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   public static boolean method_2815(ahb var0, int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      aji var5 = var0.getBlock(var1, var2, var3);
      String[] var4 = var10000;
      aji var7 = var5;
      if(var4 != null) {
         if(var5.field_2007 == awt.field_4170) {
            return true;
         }

         var7 = var5;
      }

      if(var4 != null) {
         if(var7 == class_1192.field_6078) {
            return true;
         }

         var7 = var5;
      }

      awt var6 = var7.field_2007;
      awt var8 = var6;
      awt var10001 = awt.field_4177;
      if(var4 != null) {
         if(var6 == awt.field_4177) {
            return true;
         }

         var8 = var6;
         var10001 = awt.field_4178;
      }

      return var8 == var10001;
   }

   // $FF: renamed from: h (ahb, int, int, int, int) void
   public void method_2816(ahb var1, int var2, int var3, int var4, int var5) {}
}
