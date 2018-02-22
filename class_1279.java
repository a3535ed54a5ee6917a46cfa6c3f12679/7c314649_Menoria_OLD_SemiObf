
// $FF: renamed from: jE
public class class_1279 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6705(long var1, class_1265 var3) {
      super.method_6675(var1);
      super.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      int var6 = var1 >> 1;
      String[] var5 = class_752.method_4253();
      int var7 = var2 >> 1;
      int var8 = (var3 >> 1) + 2;
      int var9 = (var4 >> 1) + 2;
      int[] var10 = this.field_6573.method_6679(var6, var7, var8, var9);
      int var11 = var8 - 1 << 1;
      int var12 = var9 - 1 << 1;
      int[] var13 = class_1323.method_6956(var11 * var12);
      int var14 = 0;

      int var15;
      int var10000;
      while(true) {
         if(var14 < var9 - 1) {
            var15 = (var14 << 1) * var11;
            int var16 = 0;
            int var17 = var10[var16 + 0 + (var14 + 0) * var8];
            var10000 = var10[var16 + 0 + (var14 + 1) * var8];
            if(var5 == null) {
               break;
            }

            int var18 = var10000;

            while(true) {
               if(var16 < var8 - 1) {
                  this.method_6677((long)(var16 + var6 << 1), (long)(var14 + var7 << 1));
                  int var19 = var10[var16 + 1 + (var14 + 0) * var8];
                  int var20 = var10[var16 + 1 + (var14 + 1) * var8];
                  var13[var15] = var17;
                  var13[var15++ + var11] = this.method_6682(new int[]{var17, var18});
                  var13[var15] = this.method_6682(new int[]{var17, var19});
                  var13[var15++ + var11] = this.method_6683(var17, var19, var18, var20);
                  var17 = var19;
                  var18 = var20;
                  ++var16;
                  if(var5 == null) {
                     break;
                  }

                  if(var5 != null) {
                     continue;
                  }
               }

               ++var14;
               break;
            }

            if(var5 != null) {
               continue;
            }
         }

         var10000 = var3 * var4;
         break;
      }

      int[] var21 = class_1323.method_6956(var10000);
      var15 = 0;

      int[] var22;
      while(true) {
         if(var15 < var4) {
            var22 = var13;
            if(var5 == null) {
               break;
            }

            System.arraycopy(var13, (var15 + (var2 & 1)) * var11 + (var1 & 1), var21, var15 * var3, var3);
            ++var15;
            if(var5 != null) {
               continue;
            }
         }

         var22 = var21;
         break;
      }

      return var22;
   }

   // $FF: renamed from: a (long, jm, int) jm
   public static class_1265 method_6706(long var0, class_1265 var2, int var3) {
      Object var5 = var2;
      String[] var10000 = class_752.method_4253();
      int var6 = 0;
      String[] var4 = var10000;

      Object var7;
      while(true) {
         if(var6 < var3) {
            var7 = new class_1279;
            ((class_1279)var7).method_6705(var0 + (long)var6, (class_1265)var5);
            if(var4 == null) {
               break;
            }

            var5 = var7;
            ++var6;
            if(var4 != null) {
               continue;
            }
         }

         var7 = var5;
         break;
      }

      return (class_1265)var7;
   }
}
