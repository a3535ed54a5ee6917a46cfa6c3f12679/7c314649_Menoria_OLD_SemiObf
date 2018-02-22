import java.util.Random;

// $FF: renamed from: fF
public abstract class class_408 extends class_407 {

   // $FF: renamed from: N vL[]
   protected IIcon[] field_2113;
   // $FF: renamed from: O vL[]
   protected IIcon[] field_2114;


   // $FF: renamed from: <init> () void
   public void method_2651() {
      super.method_2427(awt.field_4173);
      this.method_2521(class_872.field_4244);
      this.method_2437(2.0F);
      this.method_2428(field_1977);
   }

   // $FF: renamed from: b (int) int
   public static int method_2652(int var0) {
      return var0 & 3;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 1;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return adb.method_2920(this);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var10000 = class_752.method_4253();
      byte var8 = 4;
      String[] var7 = var10000;
      int var9 = var8 + 1;
      int var14 = var1.method_2050(var2 - var9, var3 - var9, var4 - var9, var2 + var9, var3 + var9, var4 + var9);
      if(var7 != null) {
         if(var14 == 0) {
            return;
         }

         var14 = -var8;
      }

      int var10 = var14;

      do {
         var14 = var10;

         label61:
         while(true) {
            if(var14 > var8) {
               return;
            }

            int var11 = -var8;

            while(true) {
               if(var11 > var8) {
                  break label61;
               }

               var14 = -var8;
               if(var7 == null) {
                  break;
               }

               int var12 = var14;

               while(true) {
                  if(var12 <= var8) {
                     if(var7 == null) {
                        break;
                     }

                     label47: {
                        label77: {
                           ahb var15 = var1;
                           int var10001 = var2 + var10;
                           int var10002 = var3 + var11;
                           int var10003 = var4 + var12;
                           if(var7 != null) {
                              if(var1.getBlock(var10001, var10002, var10003).method_2424() != awt.field_4179) {
                                 break label77;
                              }

                              var15 = var1;
                              var10001 = var2 + var10;
                              var10002 = var3 + var11;
                              var10003 = var4 + var12;
                           }

                           int var13 = var15.method_33(var10001, var10002, var10003);
                           if(var7 == null) {
                              break label47;
                           }

                           if((var13 & 8) == 0) {
                              var1.method_2055(var2 + var10, var3 + var11, var4 + var12, var13 | 8, 4);
                           }
                        }

                        ++var12;
                     }

                     if(var7 != null) {
                        continue;
                     }
                  }

                  ++var11;
                  break;
               }

               if(var7 == null) {
                  break label61;
               }
            }
         }

         ++var10;
      } while(var7 != null);

   }

   // $FF: renamed from: c (int) vL
   protected IIcon method_2648(int var1) {
      return this.field_2113[var1 % this.field_2113.length];
   }

   // $FF: renamed from: k (int) vL
   protected IIcon method_2649(int var1) {
      return this.field_2114[var1 % this.field_2114.length];
   }
}
