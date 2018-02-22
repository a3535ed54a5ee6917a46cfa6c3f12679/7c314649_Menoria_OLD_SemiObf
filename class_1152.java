import java.util.Random;

// $FF: renamed from: hz
public class class_1152 extends class_1151 {

   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6349();
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      ahb var10000 = var1;
      int var10001 = var3;
      int var10002 = var4;
      int var10003 = var5;
      if(var6 != null) {
         if(!var1.method_34(var3, var4, var5)) {
            return false;
         }

         var10000 = var1;
         var10001 = var3;
         var10002 = var4 + 1;
         var10003 = var5;
      }

      if(var6 != null) {
         if(var10000.getBlock(var10001, var10002, var10003) != class_1192.field_6113) {
            return false;
         }

         var10000 = var1;
         var10001 = var3;
         var10002 = var4;
         var10003 = var5;
      }

      var10000.method_2054(var10001, var10002, var10003, class_1192.field_6115, 0, 2);
      int var7 = 0;

      int var14;
      while(true) {
         if(var7 < 1500) {
            int var8 = var3 + var2.nextInt(8) - var2.nextInt(8);
            int var9 = var4 - var2.nextInt(12);
            var14 = var5 + var2.nextInt(8) - var2.nextInt(8);
            if(var6 == null) {
               break;
            }

            int var10 = var14;
            if(var1.getBlock(var8, var9, var10).method_2424() == awt.field_4170) {
               int var11 = 0;
               int var12 = 0;

               while(true) {
                  if(var12 < 6) {
                     aji var13 = null;
                     var14 = var12;
                     if(var6 == null) {
                        break;
                     }

                     if(var12 == 0) {
                        var13 = var1.getBlock(var8 - 1, var9, var10);
                     }

                     var14 = var12;
                     byte var15 = 1;
                     if(var6 != null) {
                        if(var12 == 1) {
                           var13 = var1.getBlock(var8 + 1, var9, var10);
                        }

                        var14 = var12;
                        var15 = 2;
                     }

                     if(var6 != null) {
                        if(var14 == var15) {
                           var13 = var1.getBlock(var8, var9 - 1, var10);
                        }

                        var14 = var12;
                        var15 = 3;
                     }

                     if(var6 != null) {
                        if(var14 == var15) {
                           var13 = var1.getBlock(var8, var9 + 1, var10);
                        }

                        var14 = var12;
                        var15 = 4;
                     }

                     if(var6 != null) {
                        if(var14 == var15) {
                           var13 = var1.getBlock(var8, var9, var10 - 1);
                        }

                        var14 = var12;
                        var15 = 5;
                     }

                     if(var14 == var15) {
                        var13 = var1.getBlock(var8, var9, var10 + 1);
                     }

                     if(var13 == class_1192.field_6115) {
                        ++var11;
                     }

                     ++var12;
                     if(var6 != null) {
                        continue;
                     }
                  }

                  var14 = var11;
                  break;
               }

               if(var6 != null && var14 == 1) {
                  var1.method_2054(var8, var9, var10, class_1192.field_6115, 0, 2);
               }
            }

            ++var7;
            if(var6 != null) {
               continue;
            }
         }

         var14 = 1;
         break;
      }

      return (boolean)var14;
   }
}
