
// $FF: renamed from: jn
public class class_1278 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6704(long var1, class_1265 var3) {
      super.method_6675(var1);
      this.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1 - 1;
      String[] var5 = var10000;
      int var7 = var2 - 1;
      int var8 = var3 + 2;
      int var9 = var4 + 2;
      int[] var10 = this.field_6573.method_6679(var6, var7, var8, var9);
      int[] var11 = class_1323.method_6956(var3 * var4);
      int var12 = 0;

      do {
         int var20 = var12;

         label74:
         while(true) {
            if(var20 >= var4) {
               return var11;
            }

            int var13 = 0;

            while(true) {
               if(var13 >= var3) {
                  break label74;
               }

               int var14 = var10[var13 + 1 + (var12 + 1 - 1) * (var3 + 2)];
               int var15 = var10[var13 + 1 + 1 + (var12 + 1) * (var3 + 2)];
               int var16 = var10[var13 + 1 - 1 + (var12 + 1) * (var3 + 2)];
               int var17 = var10[var13 + 1 + (var12 + 1 + 1) * (var3 + 2)];
               int var18 = var10[var13 + 1 + (var12 + 1) * var8];
               int var19 = 0;
               var20 = var14;
               if(var5 == null) {
                  break;
               }

               if(var5 != null) {
                  if(var14 == 0) {
                     ++var19;
                  }

                  var20 = var15;
               }

               if(var5 != null) {
                  if(var20 == 0) {
                     ++var19;
                  }

                  var20 = var16;
               }

               if(var5 != null) {
                  if(var20 == 0) {
                     ++var19;
                  }

                  var20 = var17;
               }

               if(var5 != null) {
                  if(var20 == 0) {
                     ++var19;
                  }

                  var20 = var18;
               }

               label63: {
                  label62: {
                     if(var5 != null) {
                        if(var20 != 0) {
                           break label62;
                        }

                        var20 = var19;
                     }

                     if(var20 > 3) {
                        var11[var13 + var12 * var3] = class_985.field_5012.field_5050;
                        if(var5 != null) {
                           break label63;
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
