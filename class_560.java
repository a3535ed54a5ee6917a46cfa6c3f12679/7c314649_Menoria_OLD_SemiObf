
// $FF: renamed from: b1
public class class_560 extends class_557 {

   // $FF: renamed from: w aji
   private aji field_2435;
   // $FF: renamed from: x aji
   private aji field_2436;


   // $FF: renamed from: <init> (int, float, aji, aji) void
   public void getBlock50(int var1, float var2, aji var3, aji var4) {
      super.getBlock40(var1, var2, false);
      this.field_2435 = var3;
      this.field_2436 = var4;
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      int var10000 = var7;
      if(var11 != null) {
         if(var7 != 1) {
            return false;
         }

         var10000 = var2.method_4628(var4, var5, var6, var7, var1);
      }

      if(var11 != null) {
         if(var10000 != 0) {
            var10000 = var2.method_4628(var4, var5 + 1, var6, var7, var1);
            if(var11 == null) {
               return (boolean)var10000;
            }

            if(var10000 != 0) {
               boolean var13;
               label46: {
                  ahb var12 = var3;
                  int var10001 = var4;
                  int var10002 = var5;
                  int var10003 = var6;
                  if(var11 != null) {
                     if(var3.getBlock(var4, var5, var6) != this.field_2436) {
                        break label46;
                     }

                     var12 = var3;
                     var10001 = var4;
                     var10002 = var5 + 1;
                     var10003 = var6;
                  }

                  var13 = var12.method_34(var10001, var10002, var10003);
                  if(var11 == null) {
                     return var13;
                  }

                  if(var13) {
                     var3.method_2058(var4, var5 + 1, var6, this.field_2435);
                     --var1.field_2958;
                     return true;
                  }
               }

               var13 = false;
               return var13;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }
}
