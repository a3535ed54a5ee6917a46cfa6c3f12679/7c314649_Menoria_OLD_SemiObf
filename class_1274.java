
// $FF: renamed from: jr
public class class_1274 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6697(long var1, class_1265 var3) {
      super.method_6675(var1);
      this.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      int var6 = var1 - 1;
      String[] var10000 = class_752.method_4253();
      int var7 = var2 - 1;
      int var8 = var3 + 2;
      String[] var5 = var10000;
      int var9 = var4 + 2;
      int[] var10 = this.field_6573.method_6679(var6, var7, var8, var9);
      int[] var11 = class_1323.method_6956(var3 * var4);
      int var12 = 0;

      do {
         int var16 = var12;

         label60:
         while(true) {
            if(var16 >= var4) {
               return var11;
            }

            int var13 = 0;

            while(true) {
               if(var13 >= var3) {
                  break label60;
               }

               int var14 = var10[var13 + 1 + (var12 + 1) * var8];
               this.method_6677((long)(var13 + var1), (long)(var12 + var2));
               var16 = var14;
               if(var5 == null) {
                  break;
               }

               label70: {
                  if(var5 != null) {
                     if(var14 == 0) {
                        var11[var13 + var12 * var3] = 0;
                        if(var5 != null) {
                           break label70;
                        }
                     }

                     var16 = this.method_6678(6);
                  }

                  int var15;
                  label71: {
                     var15 = var16;
                     var16 = var15;
                     if(var5 != null) {
                        if(var15 == 0) {
                           var15 = 4;
                           if(var5 != null) {
                              break label71;
                           }
                        }

                        var16 = var15;
                     }

                     if(var5 != null) {
                        if(var16 <= 1) {
                           var15 = 3;
                           if(var5 != null) {
                              break label71;
                           }
                        }

                        var16 = 1;
                     }

                     var15 = var16;
                  }

                  var11[var13 + var12 * var3] = var15;
               }

               ++var13;
               if(var5 == null) {
                  break label60;
               }
            }
         }

         ++var12;
      } while(var5 != null);

      return var11;
   }
}
