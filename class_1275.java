
// $FF: renamed from: jq
public class class_1275 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6698(long var1, class_1265 var3) {
      super.method_6675(var1);
      this.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      int var6 = var1 - 1;
      int var7 = var2 - 1;
      int var8 = var3 + 2;
      int var9 = var4 + 2;
      int[] var10 = this.field_6573.method_6679(var6, var7, var8, var9);
      String[] var5 = class_752.method_4253();
      int[] var11 = class_1323.method_6956(var3 * var4);
      int var12 = 0;

      do {
         int var10000 = var12;

         label74:
         while(true) {
            if(var10000 >= var4) {
               return var11;
            }

            int var13 = 0;

            while(true) {
               if(var13 >= var3) {
                  break label74;
               }

               int var14 = var10[var13 + 0 + (var12 + 0) * var8];
               int var15 = var10[var13 + 2 + (var12 + 0) * var8];
               int var16 = var10[var13 + 0 + (var12 + 2) * var8];
               int var17 = var10[var13 + 2 + (var12 + 2) * var8];
               int var18 = var10[var13 + 1 + (var12 + 1) * var8];
               this.method_6677((long)(var13 + var1), (long)(var12 + var2));
               var10000 = var18;
               if(var5 == null) {
                  break;
               }

               label69: {
                  label84: {
                     if(var5 != null) {
                        if(var18 != 0) {
                           break label84;
                        }

                        var10000 = var14;
                     }

                     if(var5 != null) {
                        if(var10000 != 0) {
                           break label84;
                        }

                        var10000 = var15;
                     }

                     if(var5 != null) {
                        if(var10000 != 0) {
                           break label84;
                        }

                        var10000 = var16;
                     }

                     if(var5 != null) {
                        if(var10000 != 0) {
                           break label84;
                        }

                        var10000 = var17;
                     }

                     if(var5 != null) {
                        if(var10000 != 0) {
                           break label84;
                        }

                        var10000 = this.method_6678(100);
                     }

                     if(var10000 == 0) {
                        var11[var13 + var12 * var3] = class_985.field_5002.field_5050;
                        if(var5 != null) {
                           break label69;
                        }
                     }
                  }

                  var11[var13 + var12 * var3] = var18;
               }

               ++var13;
               if(var5 == null) {
                  break label74;
               }
            }
         }

         ++var12;
      } while(var5 != null);

      return var11;
   }
}
