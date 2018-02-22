
// $FF: renamed from: jz
public class class_1266 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6686(long var1, class_1265 var3) {
      super.method_6675(var1);
      super.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      int var6 = var1 - 1;
      int var7 = var2 - 1;
      int var8 = var3 + 2;
      String[] var10000 = class_752.method_4253();
      int var9 = var4 + 2;
      String[] var5 = var10000;
      int[] var10 = this.field_6573.method_6679(var6, var7, var8, var9);
      int[] var11 = class_1323.method_6956(var3 * var4);
      int var12 = 0;

      do {
         int var19 = var12;
         int var10001 = var4;

         label58:
         while(true) {
            if(var19 >= var10001) {
               return var11;
            }

            int var13 = 0;

            while(true) {
               if(var13 >= var3) {
                  break label58;
               }

               label53: {
                  label52: {
                     int var14 = this.method_6687(var10[var13 + 0 + (var12 + 1) * var8]);
                     int var15 = this.method_6687(var10[var13 + 2 + (var12 + 1) * var8]);
                     int var16 = this.method_6687(var10[var13 + 1 + (var12 + 0) * var8]);
                     int var17 = this.method_6687(var10[var13 + 1 + (var12 + 2) * var8]);
                     int var18 = this.method_6687(var10[var13 + 1 + (var12 + 1) * var8]);
                     if(var5 != null) {
                        var19 = var18;
                        var10001 = var14;
                        if(var5 == null) {
                           break;
                        }

                        if(var18 == var14) {
                           label69: {
                              var19 = var18;
                              var10001 = var16;
                              if(var5 != null) {
                                 if(var18 != var16) {
                                    break label69;
                                 }

                                 var19 = var18;
                                 var10001 = var15;
                              }

                              if(var5 != null) {
                                 if(var19 != var10001) {
                                    break label69;
                                 }

                                 var19 = var18;
                                 var10001 = var17;
                              }

                              if(var19 == var10001) {
                                 break label52;
                              }
                           }
                        }

                        var11[var13 + var12 * var3] = class_985.field_4995.field_5050;
                     }

                     if(var5 != null) {
                        break label53;
                     }
                  }

                  var11[var13 + var12 * var3] = -1;
               }

               ++var13;
               if(var5 == null) {
                  break label58;
               }
            }
         }

         ++var12;
      } while(var5 != null);

      return var11;
   }

   // $FF: renamed from: a (int) int
   private int method_6687(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 >= 2) {
            return 2 + (var1 & 1);
         }

         var10000 = var1;
      }

      return var10000;
   }
}
