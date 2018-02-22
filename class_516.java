
// $FF: renamed from: ce
public class class_516 extends adb {

   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.field_2333 = 16;
      this.method_2974(class_872.field_4245);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      int var10000 = var7;
      if(var11 != null) {
         if(var7 == 0) {
            return false;
         }

         var10000 = var3.getBlock(var4, var5, var6).method_2424().method_5063();
      }

      if(var11 != null) {
         if(var10000 == 0) {
            return false;
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

      label104: {
         if(var11 != null) {
            if(var10000 == var10001) {
               --var4;
            }

            var10000 = var7;
            if(var11 == null) {
               break label104;
            }

            var10001 = 5;
         }

         if(var10000 == var10001) {
            ++var4;
         }

         var10000 = var2.method_4628(var4, var5, var6, var7, var1);
      }

      if(var11 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = class_1192.field_6089.method_2480(var3, var4, var5, var6);
      }

      if(var11 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = var3.field_1832;
      }

      if(var11 != null) {
         if(var10000 != 0) {
            return true;
         }

         var10000 = var7;
      }

      if(var11 != null) {
         label81: {
            if(var10000 == 1) {
               int var12 = class_1715.method_9561((double)((var2.field_3000 + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
               var3.method_2054(var4, var5, var6, class_1192.field_6089, var12, 3);
               if(var11 != null) {
                  break label81;
               }
            }

            var3.method_2054(var4, var5, var6, class_1192.field_6094, var7, 3);
         }
      }

      --var1.field_2958;
      class_582 var13 = (class_582)var3.method_31(var4, var5, var6);
      if(var13 != null) {
         var2.method_4586(var13);
      }

      return true;
   }
}
