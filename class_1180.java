import java.util.Random;

// $FF: renamed from: hL
public class class_1180 extends class_1151 {

   // $FF: renamed from: c aji
   private aji field_6011;
   // $FF: renamed from: d int
   private int field_6012;


   // $FF: renamed from: <init> (aji, int) void
   public void method_6400(aji var1, int var2) {
      super.method_6349();
      this.field_6011 = var1;
      this.field_6012 = var2;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      if(var1.getBlock(var3, var4, var5).method_2424() != awt.field_4177) {
         return false;
      } else {
         int var7 = var2.nextInt(this.field_6012 - 2) + 2;
         byte var8 = 2;
         int var9 = var3 - var7;

         label77:
         while(true) {
            int var10000 = var9;
            int var10001 = var3 + var7;

            label74:
            while(var10000 <= var10001) {
               var10000 = var5 - var7;
               if(var6 == null) {
                  return (boolean)var10000;
               }

               int var10 = var10000;

               while(var10 <= var5 + var7) {
                  int var11 = var9 - var3;
                  int var12 = var10 - var5;
                  var10000 = var11 * var11 + var12 * var12;
                  var10001 = var7 * var7;
                  if(var6 == null) {
                     continue label74;
                  }

                  label68: {
                     label84: {
                        if(var6 != null) {
                           if(var10000 > var10001) {
                              break label84;
                           }

                           var10000 = var4;
                           var10001 = var8;
                        }

                        int var13 = var10000 - var10001;

                        while(var13 <= var4 + var8) {
                           aji var14 = var1.getBlock(var9, var13, var10);
                           if(var6 == null) {
                              break label68;
                           }

                           label52: {
                              label51: {
                                 aji var15 = var14;
                                 if(var6 != null) {
                                    if(var14 == class_1192.field_6028) {
                                       break label51;
                                    }

                                    var15 = var14;
                                 }

                                 if(var15 != class_1192.field_6027) {
                                    break label52;
                                 }
                              }

                              var1.method_2054(var9, var13, var10, this.field_6011, 0, 2);
                           }

                           ++var13;
                           if(var6 == null) {
                              break;
                           }
                        }
                     }

                     ++var10;
                  }

                  if(var6 == null) {
                     break;
                  }
               }

               ++var9;
               if(var6 != null) {
                  continue label77;
               }
               break;
            }

            var10000 = 1;
            return (boolean)var10000;
         }
      }
   }
}
