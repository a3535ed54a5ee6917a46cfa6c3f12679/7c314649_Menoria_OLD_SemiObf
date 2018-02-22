import java.util.Random;

// $FF: renamed from: hM
public class class_1179 extends class_1151 {

   // $FF: renamed from: c aji
   private aji field_6010;


   // $FF: renamed from: <init> (aji) void
   public void method_6399(aji var1) {
      super.method_6349();
      this.field_6010 = var1;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      boolean var10000 = var1.method_34(var3, var4, var5);
      if(var6 != null) {
         if(var10000 && var1.getBlock(var3, var4 - 1, var5) == this.field_6010) {
            int var7 = var2.nextInt(32) + 6;
            int var8 = var2.nextInt(4) + 1;
            int var9 = var3 - var8;

            int var10;
            int var11;
            int var12;
            int var16;
            int var10001;
            label107:
            while(true) {
               var16 = var9;
               var10001 = var3 + var8;

               label104:
               while(var16 <= var10001) {
                  var16 = var5 - var8;
                  if(var6 == null) {
                     break label107;
                  }

                  var10 = var16;

                  while(var10 <= var5 + var8) {
                     var11 = var9 - var3;
                     var12 = var10 - var5;
                     if(var6 != null) {
                        var16 = var11 * var11 + var12 * var12;
                        var10001 = var8 * var8 + 1;
                        if(var6 == null) {
                           continue label104;
                        }

                        if(var16 <= var10001 && var1.getBlock(var9, var4 - 1, var10) != this.field_6010) {
                           return false;
                        }

                        ++var10;
                     }

                     if(var6 == null) {
                        break;
                     }
                  }

                  ++var9;
                  if(var6 != null) {
                     continue label107;
                  }
                  break;
               }

               var16 = var4;
               break;
            }

            var9 = var16;

            label83:
            do {
               var16 = var9;

               label80:
               while(true) {
                  if(var16 >= var4 + var7) {
                     break label83;
                  }

                  var16 = var9;
                  var10001 = 256;
                  if(var6 != null) {
                     if(var9 >= 256) {
                        break label83;
                     }

                     var16 = var3;
                     var10001 = var8;
                  }

                  var10 = var16 - var10001;

                  while(true) {
                     var16 = var10;
                     var10001 = var3 + var8;

                     label76:
                     while(true) {
                        if(var16 > var10001) {
                           break label80;
                        }

                        var16 = var5 - var8;
                        if(var6 == null) {
                           continue label80;
                        }

                        var11 = var16;

                        while(var11 <= var5 + var8) {
                           var12 = var10 - var3;
                           int var13 = var11 - var5;
                           if(var6 != null) {
                              var16 = var12 * var12 + var13 * var13;
                              var10001 = var8 * var8 + 1;
                              if(var6 == null) {
                                 continue label76;
                              }

                              if(var16 <= var10001) {
                                 var1.method_2054(var10, var9, var11, class_1192.field_6076, 0, 2);
                              }

                              ++var11;
                           }

                           if(var6 == null) {
                              break;
                           }
                        }

                        ++var10;
                        if(var6 == null) {
                           break label80;
                        }
                        break;
                     }
                  }
               }

               ++var9;
            } while(var6 != null);

            class_705 var14 = new class_705;
            var14.method_3847(var1);
            class_705 var15 = var14;
            var15.method_3887((double)((float)var3 + 0.5F), (double)(var4 + var7), (double)((float)var5 + 0.5F), var2.nextFloat() * 360.0F, 0.0F);
            var1.method_2089(var15);
            var1.method_2054(var3, var4 + var7, var5, class_1192.field_6032, 0, 2);
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }
}
