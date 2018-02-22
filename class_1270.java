
// $FF: renamed from: jv
public class class_1270 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6691(long var1, class_1265 var3) {
      super.method_6675(var1);
      this.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int[] var6 = this.field_6573.method_6679(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      String[] var5 = var10000;
      int[] var7 = class_1323.method_6956(var3 * var4);
      int var8 = 0;

      do {
         int var11 = var8;

         label45:
         while(true) {
            if(var11 >= var4) {
               return var7;
            }

            int var9 = 0;

            while(true) {
               if(var9 >= var3) {
                  break label45;
               }

               this.method_6677((long)(var9 + var1), (long)(var8 + var2));
               int var10 = var6[var9 + 1 + (var8 + 1) * (var3 + 2)];
               var11 = this.method_6678(57);
               if(var5 == null) {
                  break;
               }

               label40: {
                  label55: {
                     if(var5 != null) {
                        if(var11 != 0) {
                           break label55;
                        }

                        var11 = var10;
                     }

                     if(var11 == class_985.field_4989.field_5050) {
                        var7[var9 + var8 * var3] = class_985.field_4989.field_5050 + 128;
                        if(var5 != null) {
                           break label40;
                        }
                     }

                     var7[var9 + var8 * var3] = var10;
                     if(var5 != null) {
                        break label40;
                     }
                  }

                  var7[var9 + var8 * var3] = var10;
               }

               ++var9;
               if(var5 == null) {
                  break label45;
               }
            }
         }

         ++var8;
      } while(var5 != null);

      return var7;
   }
}
