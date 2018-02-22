import java.util.Random;

// $FF: renamed from: hy
public class class_1153 extends class_1151 {

   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6349();
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;

      boolean var12;
      while(true) {
         if(var7 < 64) {
            label40: {
               int var8 = var3 + var2.nextInt(8) - var2.nextInt(8);
               int var9 = var4 + var2.nextInt(4) - var2.nextInt(4);
               int var10 = var5 + var2.nextInt(8) - var2.nextInt(8);
               ahb var11 = var1;
               int var10001 = var8;
               int var10002 = var9;
               int var10003 = var10;
               if(var6 != null) {
                  var12 = var1.method_34(var8, var9, var10);
                  if(var6 == null) {
                     break;
                  }

                  if(!var12) {
                     break label40;
                  }

                  var11 = var1;
                  var10001 = var8;
                  var10002 = var9 - 1;
                  var10003 = var10;
               }

               if(var6 != null) {
                  if(var11.getBlock(var10001, var10002, var10003) != class_1192.field_6113) {
                     break label40;
                  }

                  var11 = var1;
                  var10001 = var8;
                  var10002 = var9;
                  var10003 = var10;
               }

               var11.method_2054(var10001, var10002, var10003, class_1192.field_6078, 0, 2);
            }

            ++var7;
            if(var6 != null) {
               continue;
            }
         }

         var12 = true;
         break;
      }

      return var12;
   }
}
