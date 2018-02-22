
// $FF: renamed from: bw
public class class_523 extends adb {

   // $FF: renamed from: n aji
   private aji field_2360;


   // $FF: renamed from: <init> (aji) void
   public void method_2989(aji var1) {
      super.method_2917();
      this.field_2360 = var1;
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11;
      int var15;
      label133: {
         label136: {
            aji var12;
            aji var14;
            label137: {
               String[] var10000 = class_752.method_4253();
               var12 = var3.getBlock(var4, var5, var6);
               var11 = var10000;
               var14 = var12;
               aji var10001 = class_1192.field_6104;
               if(var11 != null) {
                  if(var12 == class_1192.field_6104) {
                     label124: {
                        var15 = var3.method_33(var4, var5, var6) & 7;
                        if(var11 != null) {
                           if(var15 >= 1) {
                              break label124;
                           }

                           var15 = 1;
                        }

                        var7 = var15;
                        if(var11 != null) {
                           break label136;
                        }
                     }
                  }

                  var14 = var12;
                  if(var11 == null) {
                     break label137;
                  }

                  var10001 = class_1192.field_6131;
               }

               if(var14 == var10001) {
                  break label136;
               }

               var14 = var12;
            }

            if(var11 != null) {
               if(var14 == class_1192.field_6058) {
                  break label136;
               }

               var14 = var12;
            }

            if(var14 != class_1192.field_6059) {
               var15 = var7;
               if(var11 != null) {
                  if(var7 == 0) {
                     --var5;
                  }

                  var15 = var7;
               }

               byte var16 = 1;
               if(var11 != null) {
                  if(var15 == 1) {
                     ++var5;
                  }

                  var15 = var7;
                  var16 = 2;
               }

               if(var11 != null) {
                  if(var15 == var16) {
                     --var6;
                  }

                  var15 = var7;
                  var16 = 3;
               }

               if(var11 != null) {
                  if(var15 == var16) {
                     ++var6;
                  }

                  var15 = var7;
                  var16 = 4;
               }

               if(var11 != null) {
                  if(var15 == var16) {
                     --var4;
                  }

                  var15 = var7;
                  if(var11 == null) {
                     break label133;
                  }

                  var16 = 5;
               }

               if(var15 == var16) {
                  ++var4;
               }
            }
         }

         var15 = var2.method_4628(var4, var5, var6, var7, var1);
      }

      if(var11 != null) {
         if(var15 == 0) {
            return false;
         }

         var15 = var1.field_2958;
      }

      if(var11 != null) {
         if(var15 == 0) {
            return false;
         }

         var15 = var3.canPlaceEntityOnSide(this.field_2360, var4, var5, var6, false, var7, (class_689)null, var1);
      }

      if(var11 != null) {
         if(var15 != 0) {
            int var13 = this.field_2360.method_2483(var3, var4, var5, var6, var7, var8, var9, var10, 0);
            var15 = var3.method_2054(var4, var5, var6, this.field_2360, var13, 3);
            if(var11 == null) {
               return (boolean)var15;
            }

            if(var15 != 0) {
               ahb var18 = var3;
               int var17 = var4;
               if(var11 != null) {
                  if(var3.getBlock(var4, var5, var6) == this.field_2360) {
                     this.field_2360.method_2506(var3, var4, var5, var6, var2, var1);
                     this.field_2360.method_2507(var3, var4, var5, var6, var13);
                  }

                  var18 = var3;
                  var17 = var4;
               }

               var18.method_2084((double)((float)var17 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.field_2360.field_2005.method_5996(), (this.field_2360.field_2005.method_5992() + 1.0F) / 2.0F, this.field_2360.field_2005.method_5993() * 0.8F);
               --var1.field_2958;
            }
         }

         var15 = 1;
      }

      return (boolean)var15;
   }
}
