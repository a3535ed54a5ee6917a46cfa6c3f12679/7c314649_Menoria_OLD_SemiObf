
// $FF: renamed from: bm
public class class_572 extends class_571 {

   // $FF: renamed from: <init> (aji, aji) void
   public void getBlock61(aji var1, aji var2) {
      super.getBlock61(var1, var2);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      int var10000 = var1.field_2958;
      if(var11 != null) {
         if(var1.field_2958 == 0) {
            return false;
         }

         var10000 = var2.method_4628(var4, var5, var6, var7, var1);
      }

      if(var11 != null) {
         if(var10000 != 0) {
            aji var12 = var3.getBlock(var4, var5, var6);
            if(var12 == class_1192.field_6104) {
               int var13 = var3.method_33(var4, var5, var6);
               int var14 = var13 & 7;
               var10000 = var14;
               if(var11 == null) {
                  return (boolean)var10000;
               }

               if(var14 <= 6) {
                  var10000 = var3.method_2117(this.blockInstance.method_2452(var3, var4, var5, var6));
                  if(var11 == null) {
                     return (boolean)var10000;
                  }

                  if(var10000 != 0) {
                     var10000 = var3.method_2055(var4, var5, var6, var14 + 1 | var13 & -8, 2);
                     if(var11 == null) {
                        return (boolean)var10000;
                     }

                     if(var10000 != 0) {
                        var3.method_2084((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.blockInstance.field_2005.method_5996(), (this.blockInstance.field_2005.method_5992() + 1.0F) / 2.0F, this.blockInstance.field_2005.method_5993() * 0.8F);
                        --var1.field_2958;
                        return true;
                     }
                  }
               }
            }

            var10000 = super.method_2926(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
            return (boolean)var10000;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }
}
