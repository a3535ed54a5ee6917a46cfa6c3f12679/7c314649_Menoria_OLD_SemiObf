import java.util.Random;

// $FF: renamed from: fo
public class class_367 extends class_366 {

   // $FF: renamed from: <init> (awt) void
   protected void method_2427(awt var1) {
      String[] var10000 = class_752.method_4253();
      super.method_2427(var1);
      String[] var2 = var10000;
      this.method_2440(false);
      if(var2 != null && var1 == awt.field_4178) {
         this.method_2440(true);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      class_367 var10000 = this;
      ahb var10001 = var1;
      int var10002 = var2;
      int var10003 = var3;
      int var10004 = var4;
      if(var6 != null) {
         super.method_2459(var1, var2, var3, var4, var5);
         if(var1.getBlock(var2, var3, var4) != this) {
            return;
         }

         var10000 = this;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
         var10004 = var4;
      }

      var10000.method_2560(var10001, var10002, var10003, var10004);
   }

   // $FF: renamed from: e (ahb, int, int, int) void
   private void method_2560(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.method_33(var2, var3, var4);
      var1.method_2054(var2, var3, var4, aji.method_2416(aji.method_2415(this) - 1), var5, 2);
      var1.method_2110(var2, var3, var4, aji.method_2416(aji.method_2415(this) - 1), this.method_2460(var1));
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      if(this.field_2007 == awt.field_4178) {
         int var7 = var5.nextInt(3);
         int var8 = 0;

         while(true) {
            if(var8 < var7) {
               var2 += var5.nextInt(3) - 1;
               ++var3;
               var4 += var5.nextInt(3) - 1;
               aji var9 = var1.getBlock(var2, var3, var4);
               if(var6 == null) {
                  break;
               }

               label91: {
                  awt var10000 = var9.field_2007;
                  if(var6 != null) {
                     if(var9.field_2007 == awt.field_4170) {
                        boolean var12 = this.method_2561(var1, var2 - 1, var3, var4);
                        if(var6 != null) {
                           if(!var12) {
                              var12 = this.method_2561(var1, var2 + 1, var3, var4);
                              if(var6 == null) {
                                 return;
                              }

                              if(!var12) {
                                 var12 = this.method_2561(var1, var2, var3, var4 - 1);
                                 if(var6 == null) {
                                    return;
                                 }

                                 if(!var12) {
                                    var12 = this.method_2561(var1, var2, var3, var4 + 1);
                                    if(var6 == null) {
                                       return;
                                    }

                                    if(!var12) {
                                       var12 = this.method_2561(var1, var2, var3 - 1, var4);
                                       if(var6 == null) {
                                          return;
                                       }

                                       if(!var12) {
                                          var12 = this.method_2561(var1, var2, var3 + 1, var4);
                                          if(var6 == null) {
                                             return;
                                          }

                                          if(!var12) {
                                             break label91;
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           var1.method_2058(var2, var3, var4, class_1192.field_6078);
                        }

                        return;
                     }

                     var10000 = var9.field_2007;
                  }

                  if(var10000.method_5065()) {
                     return;
                  }
               }

               ++var8;
               if(var6 != null) {
                  continue;
               }
            }

            int var13 = var7;
            if(var6 != null) {
               if(var7 != 0) {
                  break;
               }

               var8 = var2;
               var13 = var4;
            }

            int var11 = var13;
            int var10 = 0;

            do {
               if(var10 >= 3) {
                  return;
               }

               var2 = var8 + var5.nextInt(3) - 1;
               var4 = var11 + var5.nextInt(3) - 1;
               if(var6 != null) {
                  if(var1.method_34(var2, var3 + 1, var4) && var6 != null && this.method_2561(var1, var2, var3, var4)) {
                     var1.method_2058(var2, var3 + 1, var4, class_1192.field_6078);
                  }

                  ++var10;
               }
            } while(var6 != null);

            return;
         }
      }

   }

   // $FF: renamed from: m (ahb, int, int, int) boolean
   private boolean method_2561(ahb var1, int var2, int var3, int var4) {
      return var1.getBlock(var2, var3, var4).method_2424().method_5069();
   }
}
