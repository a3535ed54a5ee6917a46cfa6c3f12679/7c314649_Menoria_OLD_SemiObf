import java.util.Random;

// $FF: renamed from: hK
public class class_1181 extends class_1151 {

   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6349();
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;

      label78:
      while(true) {
         int var13 = var7;

         boolean var14;
         label75:
         while(var13 < 20) {
            int var8 = var3 + var2.nextInt(4) - var2.nextInt(4);
            int var9 = var4;
            int var10 = var5 + var2.nextInt(4) - var2.nextInt(4);
            if(var6 != null) {
               var14 = var1.method_34(var8, var4, var10);
               if(var6 == null) {
                  return var14;
               }

               if(var14) {
                  label85: {
                     label86: {
                        awt var15 = var1.getBlock(var8 - 1, var4 - 1, var10).method_2424();
                        awt var10001 = awt.field_4177;
                        if(var6 != null) {
                           if(var15 == awt.field_4177) {
                              break label86;
                           }

                           var15 = var1.getBlock(var8 + 1, var4 - 1, var10).method_2424();
                           var10001 = awt.field_4177;
                        }

                        if(var6 != null) {
                           if(var15 == var10001) {
                              break label86;
                           }

                           var15 = var1.getBlock(var8, var4 - 1, var10 - 1).method_2424();
                           var10001 = awt.field_4177;
                        }

                        if(var6 != null) {
                           if(var15 == var10001) {
                              break label86;
                           }

                           var15 = var1.getBlock(var8, var4 - 1, var10 + 1).method_2424();
                           var10001 = awt.field_4177;
                        }

                        if(var15 != var10001) {
                           break label85;
                        }
                     }

                     int var11 = 2 + var2.nextInt(var2.nextInt(3) + 1);
                     int var12 = 0;

                     while(var12 < var11) {
                        var13 = class_1192.field_6109.method_2505(var1, var8, var9 + var12, var10);
                        if(var6 == null) {
                           continue label75;
                        }

                        if(var6 != null && var13 != 0) {
                           var1.method_2054(var8, var9 + var12, var10, class_1192.field_6109, 0, 2);
                        }

                        ++var12;
                        if(var6 == null) {
                           break;
                        }
                     }
                  }
               }

               ++var7;
            }

            if(var6 != null) {
               continue label78;
            }
            break;
         }

         var14 = true;
         return var14;
      }
   }
}
