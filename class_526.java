
// $FF: renamed from: b_
public class class_526 extends adb {

   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2974(class_872.field_4246);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var10000;
      String[] var11;
      label85: {
         var11 = class_752.method_4253();
         if(var3.getBlock(var4, var5, var6) != class_1192.field_6104) {
            var10000 = var7;
            if(var11 != null) {
               if(var7 == 0) {
                  --var5;
               }

               var10000 = var7;
            }

            byte var10001 = 1;
            if(var11 != null) {
               if(var10000 == 1) {
                  ++var5;
               }

               var10000 = var7;
               var10001 = 2;
            }

            if(var11 != null) {
               if(var10000 == var10001) {
                  --var6;
               }

               var10000 = var7;
               var10001 = 3;
            }

            if(var11 != null) {
               if(var10000 == var10001) {
                  ++var6;
               }

               var10000 = var7;
               var10001 = 4;
            }

            label91: {
               if(var11 != null) {
                  if(var10000 == var10001) {
                     --var4;
                  }

                  var10000 = var7;
                  if(var11 == null) {
                     break label91;
                  }

                  var10001 = 5;
               }

               if(var10000 == var10001) {
                  ++var4;
               }

               var10000 = var3.method_34(var4, var5, var6);
            }

            if(var11 == null) {
               break label85;
            }

            if(var10000 == 0) {
               return false;
            }
         }

         var10000 = var2.method_4628(var4, var5, var6, var7, var1);
      }

      if(var11 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = class_1192.field_6082.method_2480(var3, var4, var5, var6);
      }

      if(var11 != null) {
         if(var10000 != 0) {
            --var1.field_2958;
            var3.method_2058(var4, var5, var6, class_1192.field_6082);
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }
}
