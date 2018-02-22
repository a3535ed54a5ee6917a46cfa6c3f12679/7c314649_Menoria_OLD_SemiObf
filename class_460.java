import java.util.Random;

// $FF: renamed from: e8
public class class_460 extends aji {

   // $FF: renamed from: M java.util.Random
   private final Random field_2214;
   // $FF: renamed from: N boolean
   private final boolean field_2215;
   // $FF: renamed from: O boolean
   private static boolean field_2216;
   // $FF: renamed from: P vL
   private IIcon field_2217;
   // $FF: renamed from: Q vL
   private IIcon field_2218;
   // $FF: renamed from: R java.lang.String
   private static final String field_2219;
   // $FF: renamed from: S java.lang.String[]
   private static final String[] field_2220;


   // $FF: renamed from: <init> () void
   protected void method_2795() {
      super.method_2427(awt.field_4174);
      this.field_2214 = new Random();
      this.field_2215 = false;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      super.method_2461(var1, var2, var3, var4);
      this.method_2796(var1, var2, var3, var4);
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   private void method_2796(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      ahb var10000 = var1;
      if(var5 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1;
      }

      aji var6 = var10000.getBlock(var2, var3, var4 - 1);
      aji var7 = var1.getBlock(var2, var3, var4 + 1);
      aji var8 = var1.getBlock(var2 - 1, var3, var4);
      aji var9 = var1.getBlock(var2 + 1, var3, var4);
      byte var10 = 3;
      boolean var11 = var6.method_2419();
      if(var5 != null) {
         label62: {
            if(var11) {
               var11 = var7.method_2419();
               if(var5 == null) {
                  break label62;
               }

               if(!var11) {
                  var10 = 3;
               }
            }

            var11 = var7.method_2419();
         }
      }

      if(var5 != null) {
         label55: {
            if(var11) {
               var11 = var6.method_2419();
               if(var5 == null) {
                  break label55;
               }

               if(!var11) {
                  var10 = 2;
               }
            }

            var11 = var8.method_2419();
         }
      }

      if(var5 != null) {
         label48: {
            if(var11) {
               var11 = var9.method_2419();
               if(var5 == null) {
                  break label48;
               }

               if(!var11) {
                  var10 = 5;
               }
            }

            var11 = var9.method_2419();
         }
      }

      if(var5 != null) {
         if(var11) {
            var11 = var8.method_2419();
            if(var5 == null) {
               return;
            }

            if(!var11) {
               var10 = 4;
            }
         }

         var1.method_2055(var2, var3, var4, var10, 2);
      }

   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      IIcon var4;
      if(var3 != null) {
         if(var1 == 1) {
            var4 = this.field_2217;
            return var4;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(var10000 == 0) {
            var4 = this.field_2217;
            return var4;
         }

         var10000 = var1;
      }

      var4 = var10000 != var2?this.field_2010:this.field_2218;
      return var4;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var2 = field_2220;
      this.field_2010 = var1.method_375("furnace_side");
      this.getClass();
      this.field_2218 = var1.method_375("furnace_front_off");
      this.field_2217 = var1.method_375("furnace_top");
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      int var8 = class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3;
      String[] var7 = class_752.method_4253();
      int var10000 = var8;
      if(var7 != null) {
         if(var8 == 0) {
            var1.method_2055(var2, var3, var4, 2, 2);
         }

         var10000 = var8;
      }

      byte var10001 = 1;
      if(var7 != null) {
         if(var10000 == 1) {
            var1.method_2055(var2, var3, var4, 5, 2);
         }

         var10000 = var8;
         var10001 = 2;
      }

      if(var7 != null) {
         if(var10000 == var10001) {
            var1.method_2055(var2, var3, var4, 3, 2);
         }

         var10000 = var8;
         if(var7 == null) {
            return;
         }

         var10001 = 3;
      }

      if(var10000 == var10001) {
         var1.method_2055(var2, var3, var4, 4, 2);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
