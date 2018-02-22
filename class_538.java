
// $FF: renamed from: bL
public class class_538 extends adb {

   // $FF: renamed from: n awt
   private awt field_2390;


   // $FF: renamed from: <init> (awt) void
   public void getBlock10(awt var1) {
      super.method_2917();
      this.field_2390 = var1;
      this.field_2333 = 1;
      this.method_2974(class_872.field_4246);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      int var10000 = var7;
      if(var11 != null) {
         if(var7 == 1) {
            aji var12;
            label40: {
               ++var5;
               if(this.field_2390 == awt.field_4173) {
                  var12 = class_1192.field_6090;
                  if(var11 != null) {
                     break label40;
                  }
               }

               var12 = class_1192.field_6097;
            }

            boolean var14 = var2.method_4628(var4, var5, var6, var7, var1);
            if(var11 != null) {
               if(var14) {
                  label47: {
                     var10000 = var2.method_4628(var4, var5 + 1, var6, var7, var1);
                     if(var11 != null) {
                        if(var10000 == 0) {
                           break label47;
                        }

                        var10000 = var12.method_2480(var3, var4, var5, var6);
                     }

                     if(var11 != null) {
                        if(var10000 == 0) {
                           return false;
                        }

                        var10000 = class_1715.method_9561((double)((var2.field_3000 + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
                     }

                     int var13 = var10000;
                     getBlock11(var3, var4, var5, var6, var13, var12);
                     --var1.field_2958;
                     return true;
                  }
               }

               var14 = false;
            }

            return var14;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (ahb, int, int, int, int, aji) void
   public static void getBlock11(ahb var0, int var1, int var2, int var3, int var4, aji var5) {
      String[] var10000 = class_752.method_4253();
      byte var7 = 0;
      String[] var6 = var10000;
      byte var8 = 0;
      int var14 = var4;
      if(var6 != null) {
         if(var4 == 0) {
            var8 = 1;
         }

         var14 = var4;
      }

      byte var10001 = 1;
      if(var6 != null) {
         if(var14 == 1) {
            var7 = -1;
         }

         var14 = var4;
         var10001 = 2;
      }

      label136: {
         if(var6 != null) {
            if(var14 == var10001) {
               var8 = -1;
            }

            var14 = var4;
            if(var6 == null) {
               break label136;
            }

            var10001 = 3;
         }

         if(var14 == var10001) {
            var7 = 1;
         }

         var14 = var0.getBlock(var1 - var7, var2, var3 - var8).method_2433();
      }

      if(var6 != null) {
         var14 = var14 != 0?1:0;
      }

      int var15 = var0.getBlock(var1 - var7, var2 + 1, var3 - var8).method_2433();
      if(var6 != null) {
         var15 = var15 != 0?1:0;
      }

      int var9 = var14 + var15;
      var14 = var0.getBlock(var1 + var7, var2, var3 + var8).method_2433();
      if(var6 != null) {
         var14 = var14 != 0?1:0;
      }

      var15 = var0.getBlock(var1 + var7, var2 + 1, var3 + var8).method_2433();
      if(var6 != null) {
         var15 = var15 != 0?1:0;
      }

      int var10;
      aji var16;
      aji var17;
      byte var18;
      label117: {
         label116: {
            var10 = var14 + var15;
            var17 = var0.getBlock(var1 - var7, var2, var3 - var8);
            var16 = var5;
            if(var6 != null) {
               if(var17 == var5) {
                  break label116;
               }

               var17 = var0.getBlock(var1 - var7, var2 + 1, var3 - var8);
               var16 = var5;
            }

            if(var17 != var16) {
               var18 = 0;
               break label117;
            }
         }

         var18 = 1;
      }

      byte var11;
      label108: {
         label107: {
            var11 = var18;
            var17 = var0.getBlock(var1 + var7, var2, var3 + var8);
            var16 = var5;
            if(var6 != null) {
               if(var17 == var5) {
                  break label107;
               }

               var17 = var0.getBlock(var1 + var7, var2 + 1, var3 + var8);
               var16 = var5;
            }

            if(var17 != var16) {
               var18 = 0;
               break label108;
            }
         }

         var18 = 1;
      }

      byte var13;
      label99: {
         label138: {
            byte var12 = var18;
            var13 = 0;
            var14 = var11;
            if(var6 != null) {
               label96: {
                  if(var11 != 0) {
                     var14 = var12;
                     if(var6 == null) {
                        break label96;
                     }

                     if(var12 == 0) {
                        var13 = 1;
                        if(var6 != null) {
                           break label138;
                        }
                     }
                  }

                  var14 = var10;
               }
            }

            if(var6 == null) {
               break label99;
            }

            if(var14 > var9) {
               var13 = 1;
            }
         }

         var0.method_2054(var1, var2, var3, var5, var4, 2);
      }

      int var10002 = var2 + 1;
      int var10006 = var13;
      if(var6 != null) {
         var10006 = var13 != 0?1:0;
      }

      var0.method_2054(var1, var10002, var3, var5, 8 | var10006, 2);
      var0.method_2063(var1, var2, var3, var5);
      var0.method_2063(var1, var2 + 1, var3, var5);
   }
}
