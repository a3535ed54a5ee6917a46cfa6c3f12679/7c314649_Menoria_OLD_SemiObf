
// $FF: renamed from: bk
public class class_524 extends adb {

   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2974(class_872.field_4245);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      int var10000 = var3.field_1832;
      if(var11 != null) {
         if(var3.field_1832) {
            return true;
         }

         var10000 = var7;
      }

      if(var11 != null) {
         if(var10000 == 1) {
            ++var5;
            class_435 var12 = (class_435)class_1192.field_6053;
            int var13 = class_1715.method_9561((double)(var2.field_3000 * 4.0F / 360.0F) + 0.5D) & 3;
            byte var14 = 0;
            byte var15 = 0;
            var10000 = var13;
            if(var11 != null) {
               if(var13 == 0) {
                  var15 = 1;
               }

               var10000 = var13;
            }

            byte var10001 = 1;
            if(var11 != null) {
               if(var10000 == 1) {
                  var14 = -1;
               }

               var10000 = var13;
               var10001 = 2;
            }

            label106: {
               if(var11 != null) {
                  if(var10000 == var10001) {
                     var15 = -1;
                  }

                  var10000 = var13;
                  if(var11 == null) {
                     break label106;
                  }

                  var10001 = 3;
               }

               if(var10000 == var10001) {
                  var14 = 1;
               }

               var10000 = var2.method_4628(var4, var5, var6, var7, var1);
            }

            if(var11 != null) {
               if(var10000 != 0) {
                  label108: {
                     boolean var16 = var2.method_4628(var4 + var14, var5, var6 + var15, var7, var1);
                     if(var11 != null) {
                        if(!var16) {
                           break label108;
                        }

                        var16 = var3.method_34(var4, var5, var6);
                     }

                     if(var11 != null) {
                        if(var16) {
                           var16 = var3.method_34(var4 + var14, var5, var6 + var15);
                           if(var11 == null) {
                              return var16;
                           }

                           if(var16) {
                              var16 = ahb.method_2135(var3, var4, var5 - 1, var6);
                              if(var11 == null) {
                                 return var16;
                              }

                              if(var16) {
                                 var16 = ahb.method_2135(var3, var4 + var14, var5 - 1, var6 + var15);
                                 if(var11 == null) {
                                    return var16;
                                 }

                                 if(var16) {
                                    var3.method_2054(var4, var5, var6, var12, var13, 3);
                                    if(var11 != null) {
                                       if(var3.getBlock(var4, var5, var6) == var12) {
                                          var3.method_2054(var4 + var14, var5, var6 + var15, var12, var13 + 8, 3);
                                       }

                                       --var1.field_2958;
                                    }

                                    return true;
                                 }
                              }
                           }
                        }

                        var16 = false;
                     }

                     return var16;
                  }
               }

               var10000 = 0;
            }

            return (boolean)var10000;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }
}
