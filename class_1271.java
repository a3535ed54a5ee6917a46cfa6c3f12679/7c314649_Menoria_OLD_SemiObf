
// $FF: renamed from: ju
public class class_1271 extends class_1265 {

   // $FF: renamed from: <init> (long) void
   public void method_6675(long var1) {
      super.method_6675(var1);
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int[] var6 = class_1323.method_6956(var3 * var4);
      String[] var5 = var10000;
      int var7 = 0;

      int[] var10;
      int var10001;
      int var10002;
      label71: {
         int var9;
         while(true) {
            if(var7 < var4) {
               var9 = 0;
               if(var5 == null) {
                  break;
               }

               int var8 = 0;

               while(var8 < var3) {
                  this.method_6677((long)(var1 + var8), (long)(var2 + var7));
                  var10 = var6;
                  var10001 = var8 + var7 * var3;
                  var10002 = this.method_6678(10);
                  if(var5 == null) {
                     break label71;
                  }

                  if(var5 != null) {
                     var10002 = var10002 == 0?1:0;
                  }

                  var6[var10001] = var10002;
                  ++var8;
                  if(var5 == null) {
                     break;
                  }
               }

               ++var7;
               if(var5 != null) {
                  continue;
               }
            }

            var9 = var1;
            break;
         }

         if(var5 != null) {
            if(var9 <= -var3) {
               return var6;
            }

            var9 = var1;
         }

         if(var5 != null) {
            if(var9 > 0) {
               return var6;
            }

            var9 = var2;
         }

         if(var5 != null) {
            if(var9 <= -var4) {
               return var6;
            }

            var9 = var2;
         }

         if(var9 > 0) {
            return var6;
         }

         var10 = var6;
         var10001 = -var1 + -var2 * var3;
         var10002 = 1;
      }

      var10[var10001] = var10002;
      return var6;
   }
}
