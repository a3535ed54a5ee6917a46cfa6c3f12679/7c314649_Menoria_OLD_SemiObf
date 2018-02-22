
// $FF: renamed from: jx
public class class_1268 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6689(long var1, class_1265 var3) {
      super.method_6675(var1);
      this.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      int var6 = var1 - 1;
      int var7 = var2 - 1;
      String[] var10000 = class_752.method_4253();
      int var8 = var3 + 2;
      int var9 = var4 + 2;
      String[] var5 = var10000;
      int[] var10 = this.field_6573.method_6679(var6, var7, var8, var9);
      int[] var11 = class_1323.method_6956(var3 * var4);
      int var12 = 0;

      do {
         int var19 = var12;

         label64:
         while(true) {
            if(var19 >= var4) {
               return var11;
            }

            int var13 = 0;

            while(true) {
               if(var13 >= var3) {
                  break label64;
               }

               int var14 = var10[var13 + 1 + (var12 + 1 - 1) * (var3 + 2)];
               int var15 = var10[var13 + 1 + 1 + (var12 + 1) * (var3 + 2)];
               int var16 = var10[var13 + 1 - 1 + (var12 + 1) * (var3 + 2)];
               int var17 = var10[var13 + 1 + (var12 + 1 + 1) * (var3 + 2)];
               int var18 = var10[var13 + 1 + (var12 + 1) * var8];
               var11[var13 + var12 * var3] = var18;
               this.method_6677((long)(var13 + var1), (long)(var12 + var2));
               if(var5 != null) {
                  var19 = var18;
                  if(var5 == null) {
                     break;
                  }

                  if(var18 == 0) {
                     label75: {
                        var19 = var14;
                        if(var5 != null) {
                           if(var14 != 0) {
                              break label75;
                           }

                           var19 = var15;
                        }

                        if(var5 != null) {
                           if(var19 != 0) {
                              break label75;
                           }

                           var19 = var16;
                        }

                        if(var5 != null) {
                           if(var19 != 0) {
                              break label75;
                           }

                           var19 = var17;
                        }

                        if(var5 != null) {
                           if(var19 != 0) {
                              break label75;
                           }

                           var19 = this.method_6678(2);
                        }

                        if(var19 == 0) {
                           var11[var13 + var12 * var3] = 1;
                        }
                     }
                  }

                  ++var13;
               }

               if(var5 == null) {
                  break label64;
               }
            }
         }

         ++var12;
      } while(var5 != null);

      return var11;
   }
}
