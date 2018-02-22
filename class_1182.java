import java.util.Random;

// $FF: renamed from: hJ
public class class_1182 extends class_1151 {

   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6349();
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;

      boolean var11;
      while(true) {
         if(var7 < 64) {
            int var8 = var3 + var2.nextInt(8) - var2.nextInt(8);
            int var9 = var4 + var2.nextInt(4) - var2.nextInt(4);
            int var10 = var5 + var2.nextInt(8) - var2.nextInt(8);
            if(var6 != null) {
               var11 = var1.method_34(var8, var9, var10);
               if(var6 == null) {
                  break;
               }

               if(var11) {
                  label45: {
                     aji var12 = var1.getBlock(var8, var9 - 1, var10);
                     if(var6 != null) {
                        if(var12 != class_1192.field_6027) {
                           break label45;
                        }

                        var12 = class_1192.field_6112;
                     }

                     if(var6 != null && var12.method_2480(var1, var8, var9, var10)) {
                        var1.method_2054(var8, var9, var10, class_1192.field_6112, var2.nextInt(4), 2);
                     }
                  }
               }

               ++var7;
            }

            if(var6 != null) {
               continue;
            }
         }

         var11 = true;
         break;
      }

      return var11;
   }
}
