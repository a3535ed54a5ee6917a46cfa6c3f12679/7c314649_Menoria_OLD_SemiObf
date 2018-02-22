import java.util.Random;

// $FF: renamed from: fu
public class class_363 extends aji {

   // $FF: renamed from: M vL
   private IIcon field_2023;
   // $FF: renamed from: N vL
   private IIcon field_2024;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2025;


   // $FF: renamed from: <init> () void
   protected void method_2546() {
      super.method_2427(awt.field_4171);
      this.method_2440(true);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            return this.field_2023;
         }

         var10000 = var1;
      }

      return var10000 == 0?class_1192.field_6028.getBlockTextureFromSide(var1):this.field_2010;
   }

   // $FF: renamed from: e (ahl, int, int, int, int) vL
   public IIcon method_2447(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         if(var5 == 1) {
            return this.field_2023;
         }

         var10000 = var5;
      }

      if(var10000 == 0) {
         return class_1192.field_6028.getBlockTextureFromSide(var5);
      } else {
         awt var7 = var1.getBlock(var2, var3 + 1, var4).method_2424();
         awt var8 = var7;
         awt var10001 = awt.field_4194;
         if(var6 != null) {
            if(var7 == awt.field_4194) {
               return this.field_2024;
            }

            var8 = var7;
            var10001 = awt.field_4195;
         }

         if(var8 != var10001) {
            return this.field_2010;
         } else {
            return this.field_2024;
         }
      }
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2025;
      this.field_2010 = var1.method_375(var10002.append("_side").toString());
      this.field_2023 = var1.method_375(this.method_2533() + "_top");
      this.field_2024 = var1.method_375("grass_side_snowed");
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.method_2069(var2, var3 + 1, var4);
      }

      byte var10001;
      label83: {
         var10001 = 4;
         if(var6 != null) {
            label84: {
               if(var10000 < 4) {
                  var10000 = var1.getBlock(var2, var3 + 1, var4).method_2420();
                  var10001 = 2;
                  if(var6 == null) {
                     break label84;
                  }

                  if(var10000 > 2) {
                     var1.method_2058(var2, var3, var4, class_1192.field_6028);
                     if(var6 != null) {
                        return;
                     }
                  }
               }

               var10000 = var1.method_2069(var2, var3 + 1, var4);
               if(var6 == null) {
                  break label83;
               }

               var10001 = 9;
            }
         }

         if(var10000 < var10001) {
            return;
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while(var7 < 4) {
         int var8 = var2 + var5.nextInt(3) - 1;
         int var9 = var3 + var5.nextInt(5) - 3;
         int var10 = var4 + var5.nextInt(3) - 1;
         aji var11 = var1.getBlock(var8, var9 + 1, var10);
         if(var6 != null) {
            if(var1.getBlock(var8, var9, var10) == class_1192.field_6028) {
               label89: {
                  var10000 = var1.method_33(var8, var9, var10);
                  if(var6 != null) {
                     if(var10000 != 0) {
                        break label89;
                     }

                     var10000 = var1.method_2069(var8, var9 + 1, var10);
                  }

                  var10001 = 4;
                  if(var6 != null) {
                     if(var10000 < 4) {
                        break label89;
                     }

                     var10000 = var11.method_2420();
                     if(var6 == null) {
                        break label89;
                     }

                     var10001 = 2;
                  }

                  if(var10000 <= var10001) {
                     var1.method_2058(var8, var9, var10, this);
                  }
               }
            }

            ++var7;
         }

         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      super.method_2457(var1, var2, var3, var4, var5);
      if(var5.nextInt(10) == 0) {
         String[] var10001 = field_2025;
         var1.method_2087("townaura", (double)((float)var2 + var5.nextFloat()), (double)((float)var3 + 1.1F), (double)((float)var4 + var5.nextFloat()), 0.0D, 0.0D, 0.0D);
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1192.field_6028.method_2464(0, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
