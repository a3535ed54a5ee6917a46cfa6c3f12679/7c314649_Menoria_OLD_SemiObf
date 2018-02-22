import java.util.Random;

// $FF: renamed from: hp
public class class_1164 extends class_1163 {

   // $FF: renamed from: g int
   private int field_5982;
   // $FF: renamed from: h int
   private int field_5983;


   // $FF: renamed from: <init> (int, int) void
   public void method_6366(int var1, int var2) {
      super.method_6350(false);
      this.field_5983 = var1;
      this.field_5982 = var2;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();

      aji var10000;
      label108: {
         while(true) {
            aji var7;
            if((var7 = var1.getBlock(var3, var4, var5)).method_2424() != awt.field_4170) {
               var10000 = var7;
               if(var6 == null || var6 == null) {
                  break label108;
               }

               if(var7.method_2424() != awt.field_4179) {
                  break;
               }
            }

            if(var4 > 0) {
               --var4;
               if(var6 != null) {
                  continue;
               }
            }
            break;
         }

         var10000 = var1.getBlock(var3, var4, var5);
      }

      int var16;
      label113: {
         aji var8 = var10000;
         if(var6 != null) {
            if(var8 != class_1192.field_6028 && var8 != class_1192.field_6027) {
               break label113;
            }

            ++var4;
            this.method_6354(var1, var3, var4, var5, class_1192.field_6042, this.field_5983);
         }

         int var9 = var4;

         label86:
         do {
            var16 = var9;

            label83:
            while(true) {
               if(var16 > var4 + 2) {
                  break label86;
               }

               int var10 = var9 - var4;
               int var11 = 2 - var10;
               var16 = var3 - var11;
               if(var6 == null) {
                  return (boolean)var16;
               }

               int var12 = var16;

               while(true) {
                  var16 = var12;
                  int var10001 = var3 + var11;

                  label79:
                  while(true) {
                     if(var16 > var10001) {
                        break label83;
                     }

                     int var13 = var12 - var3;
                     var16 = var5 - var11;
                     if(var6 == null) {
                        continue label83;
                     }

                     int var14 = var16;

                     while(var14 <= var5 + var11) {
                        label73: {
                           int var15 = var14 - var5;
                           var16 = Math.abs(var13);
                           if(var6 != null) {
                              label118: {
                                 var10001 = var11;
                                 if(var6 == null) {
                                    continue label79;
                                 }

                                 if(var16 == var11) {
                                    var16 = Math.abs(var15);
                                    if(var6 == null) {
                                       break label118;
                                    }

                                    if(var16 == var11) {
                                       var16 = var2.nextInt(2);
                                       if(var6 == null) {
                                          break label118;
                                       }

                                       if(var16 == 0) {
                                          break label73;
                                       }
                                    }
                                 }

                                 var16 = var1.getBlock(var12, var9, var14).method_2419();
                              }
                           }

                           if(var16 == 0) {
                              this.method_6354(var1, var12, var9, var14, class_1192.field_6044, this.field_5982);
                           }
                        }

                        ++var14;
                        if(var6 == null) {
                           break;
                        }
                     }

                     ++var12;
                     if(var6 == null) {
                        break label83;
                     }
                     break;
                  }
               }
            }

            ++var9;
         } while(var6 != null);
      }

      var16 = 1;
      return (boolean)var16;
   }
}
