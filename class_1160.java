import java.util.Random;

// $FF: renamed from: hr
public class class_1160 extends class_1151 {

   // $FF: renamed from: c vD[]
   private final class_1652[] field_5974;
   // $FF: renamed from: d int
   private final int field_5975;


   // $FF: renamed from: <init> (vD[], int) void
   public void method_6360(class_1652[] var1, int var2) {
      super.method_6349();
      this.field_5974 = var1;
      this.field_5975 = var2;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();

      int var10000;
      label135: {
         byte var10001;
         label136: {
            aji var7;
            while((var7 = var1.getBlock(var3, var4, var5)).method_2424() == awt.field_4170 || var7.method_2424() == awt.field_4179) {
               var10000 = var4;
               var10001 = 1;
               if(var6 == null) {
                  break label136;
               }

               if(var4 > 1) {
                  --var4;
                  if(var6 != null) {
                     continue;
                  }
               }
               break;
            }

            var10000 = var4;
            if(var6 == null) {
               break label135;
            }

            var10001 = 1;
         }

         if(var10000 < var10001) {
            return false;
         }

         ++var4;
         var10000 = 0;
      }

      int var8 = var10000;

      boolean var13;
      while(true) {
         if(var8 < 4) {
            int var9 = var3 + var2.nextInt(4) - var2.nextInt(4);
            int var10 = var4 + var2.nextInt(3) - var2.nextInt(3);
            int var11 = var5 + var2.nextInt(4) - var2.nextInt(4);
            if(var6 != null) {
               var13 = var1.method_34(var9, var10, var11);
               if(var6 == null) {
                  break;
               }

               if(var13) {
                  label139: {
                     var13 = ahb.method_2135(var1, var9, var10 - 1, var11);
                     if(var6 != null) {
                        if(!var13) {
                           break label139;
                        }

                        var1.method_2054(var9, var10, var11, class_1192.field_6081, 0, 2);
                     }

                     label96: {
                        class_594 var12 = (class_594)var1.method_31(var9, var10, var11);
                        class_594 var14 = var12;
                        if(var6 != null) {
                           if(var12 == null) {
                              break label96;
                           }

                           var14 = var12;
                        }

                        if(var14 != null) {
                           class_1652.method_9096(var2, this.field_5974, var12, this.field_5975);
                        }
                     }

                     var13 = var1.method_34(var9 - 1, var10, var11);
                     if(var6 != null) {
                        label89: {
                           if(var13) {
                              var13 = ahb.method_2135(var1, var9 - 1, var10 - 1, var11);
                              if(var6 == null) {
                                 break label89;
                              }

                              if(var13) {
                                 var1.method_2054(var9 - 1, var10, var11, class_1192.field_6077, 0, 2);
                              }
                           }

                           var13 = var1.method_34(var9 + 1, var10, var11);
                        }
                     }

                     if(var6 != null) {
                        label82: {
                           if(var13) {
                              var13 = ahb.method_2135(var1, var9 - 1, var10 - 1, var11);
                              if(var6 == null) {
                                 break label82;
                              }

                              if(var13) {
                                 var1.method_2054(var9 + 1, var10, var11, class_1192.field_6077, 0, 2);
                              }
                           }

                           var13 = var1.method_34(var9, var10, var11 - 1);
                        }
                     }

                     if(var6 != null) {
                        label75: {
                           if(var13) {
                              var13 = ahb.method_2135(var1, var9 - 1, var10 - 1, var11);
                              if(var6 == null) {
                                 break label75;
                              }

                              if(var13) {
                                 var1.method_2054(var9, var10, var11 - 1, class_1192.field_6077, 0, 2);
                              }
                           }

                           var13 = var1.method_34(var9, var10, var11 + 1);
                        }
                     }

                     if(var6 != null) {
                        if(var13) {
                           var13 = ahb.method_2135(var1, var9 - 1, var10 - 1, var11);
                           if(var6 == null) {
                              return var13;
                           }

                           if(var13) {
                              var1.method_2054(var9, var10, var11 + 1, class_1192.field_6077, 0, 2);
                           }
                        }

                        var13 = true;
                     }

                     return var13;
                  }
               }

               ++var8;
            }

            if(var6 != null) {
               continue;
            }
         }

         var13 = false;
         break;
      }

      return var13;
   }
}
