
// $FF: renamed from: jy
public class class_1267 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6688(long var1, class_1265 var3) {
      super.method_6675(var1);
      this.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int[] var6 = this.field_6573.method_6679(var1, var2, var3, var4);
      String[] var5 = var10000;
      int[] var7 = class_1323.method_6956(var3 * var4);
      int var8 = 0;

      while(true) {
         int[] var10;
         if(var8 < var4) {
            int var9 = 0;

            while(var9 < var3) {
               this.method_6677((long)(var9 + var1), (long)(var8 + var2));
               var10 = var7;
               if(var5 == null) {
                  return var10;
               }

               int var10001 = var9 + var8 * var3;
               int var10002 = var6[var9 + var8 * var3];
               if(var5 != null) {
                  var10002 = var10002 > 0?this.method_6678(299999) + 2:0;
               }

               var7[var10001] = var10002;
               ++var9;
               if(var5 == null) {
                  break;
               }
            }

            ++var8;
            if(var5 != null) {
               continue;
            }
         }

         var10 = var7;
         return var10;
      }
   }
}
