
// $FF: renamed from: jD
public class class_1281 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6707(long var1, class_1265 var3) {
      super.method_6675(var1);
      super.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      var1 -= 2;
      var2 -= 2;
      int var6 = var1 >> 2;
      int var7 = var2 >> 2;
      String[] var10000 = class_752.method_4253();
      int var8 = (var3 >> 2) + 2;
      String[] var5 = var10000;
      int var9 = (var4 >> 2) + 2;
      int[] var10 = this.field_6573.method_6679(var6, var7, var8, var9);
      int var11 = var8 - 1 << 2;
      int var12 = var9 - 1 << 2;
      int[] var13 = class_1323.method_6956(var11 * var12);
      int var14 = 0;

      int var15;
      int var50;
      label146:
      while(true) {
         var50 = var14;

         label143:
         while(var50 < var9 - 1) {
            var15 = 0;
            int var16 = var10[var15 + 0 + (var14 + 0) * var8];
            var50 = var10[var15 + 0 + (var14 + 1) * var8];
            if(var5 == null) {
               break label146;
            }

            int var17 = var50;

            while(var15 < var8 - 1) {
               double var18 = 3.6D;
               this.method_6677((long)(var15 + var6 << 2), (long)(var14 + var7 << 2));
               double var20 = ((double)this.method_6678(1024) / 1024.0D - 0.5D) * 3.6D;
               double var22 = ((double)this.method_6678(1024) / 1024.0D - 0.5D) * 3.6D;
               this.method_6677((long)(var15 + var6 + 1 << 2), (long)(var14 + var7 << 2));
               double var24 = ((double)this.method_6678(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
               double var26 = ((double)this.method_6678(1024) / 1024.0D - 0.5D) * 3.6D;
               this.method_6677((long)(var15 + var6 << 2), (long)(var14 + var7 + 1 << 2));
               double var28 = ((double)this.method_6678(1024) / 1024.0D - 0.5D) * 3.6D;
               double var30 = ((double)this.method_6678(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
               this.method_6677((long)(var15 + var6 + 1 << 2), (long)(var14 + var7 + 1 << 2));
               double var32 = ((double)this.method_6678(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
               double var34 = ((double)this.method_6678(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
               int var36 = var10[var15 + 1 + (var14 + 0) * var8] & 255;
               int var37 = var10[var15 + 1 + (var14 + 1) * var8] & 255;
               var50 = 0;
               if(var5 == null) {
                  continue label143;
               }

               int var38 = 0;

               label137:
               while(true) {
                  var50 = var38;

                  label134:
                  while(var50 < 4) {
                     int var39 = ((var14 << 2) + var38) * var11 + (var15 << 2);
                     var50 = 0;
                     if(var5 == null) {
                        break label137;
                     }

                     int var40 = 0;

                     while(var40 < 4) {
                        double var41 = ((double)var38 - var22) * ((double)var38 - var22) + ((double)var40 - var20) * ((double)var40 - var20);
                        double var43 = ((double)var38 - var26) * ((double)var38 - var26) + ((double)var40 - var24) * ((double)var40 - var24);
                        double var45 = ((double)var38 - var30) * ((double)var38 - var30) + ((double)var40 - var28) * ((double)var40 - var28);
                        double var47 = ((double)var38 - var34) * ((double)var38 - var34) + ((double)var40 - var32) * ((double)var40 - var32);
                        double var52;
                        var50 = (var52 = var41 - var43) == 0.0D?0:(var52 < 0.0D?-1:1);
                        if(var5 == null) {
                           continue label134;
                        }

                        label156: {
                           if(var5 != null) {
                              label126: {
                                 if(var50 < 0) {
                                    double var53;
                                    var50 = (var53 = var41 - var45) == 0.0D?0:(var53 < 0.0D?-1:1);
                                    if(var5 == null) {
                                       break label126;
                                    }

                                    if(var50 < 0) {
                                       double var54;
                                       var50 = (var54 = var41 - var47) == 0.0D?0:(var54 < 0.0D?-1:1);
                                       if(var5 == null) {
                                          break label126;
                                       }

                                       if(var50 < 0) {
                                          var13[var39++] = var16;
                                          if(var5 != null) {
                                             break label156;
                                          }
                                       }
                                    }
                                 }

                                 double var55;
                                 var50 = (var55 = var43 - var41) == 0.0D?0:(var55 < 0.0D?-1:1);
                              }
                           }

                           if(var5 != null) {
                              label113: {
                                 if(var50 < 0) {
                                    double var56;
                                    var50 = (var56 = var43 - var45) == 0.0D?0:(var56 < 0.0D?-1:1);
                                    if(var5 == null) {
                                       break label113;
                                    }

                                    if(var50 < 0) {
                                       double var57;
                                       var50 = (var57 = var43 - var47) == 0.0D?0:(var57 < 0.0D?-1:1);
                                       if(var5 == null) {
                                          break label113;
                                       }

                                       if(var50 < 0) {
                                          var13[var39++] = var36;
                                          if(var5 != null) {
                                             break label156;
                                          }
                                       }
                                    }
                                 }

                                 double var58;
                                 var50 = (var58 = var45 - var41) == 0.0D?0:(var58 < 0.0D?-1:1);
                              }
                           }

                           label157: {
                              if(var5 != null) {
                                 if(var50 >= 0) {
                                    break label157;
                                 }

                                 double var59;
                                 var50 = (var59 = var45 - var43) == 0.0D?0:(var59 < 0.0D?-1:1);
                              }

                              if(var5 != null) {
                                 if(var50 >= 0) {
                                    break label157;
                                 }

                                 double var60;
                                 var50 = (var60 = var45 - var47) == 0.0D?0:(var60 < 0.0D?-1:1);
                              }

                              if(var50 < 0) {
                                 var13[var39++] = var17;
                                 if(var5 != null) {
                                    break label156;
                                 }
                              }
                           }

                           var13[var39++] = var37;
                        }

                        ++var40;
                        if(var5 == null) {
                           break;
                        }
                     }

                     ++var38;
                     if(var5 != null) {
                        continue label137;
                     }
                     break;
                  }

                  var16 = var36;
                  var50 = var37;
                  break;
               }

               var17 = var50;
               ++var15;
               if(var5 == null) {
                  break;
               }
            }

            ++var14;
            if(var5 != null) {
               continue label146;
            }
            break;
         }

         var50 = var3 * var4;
         break;
      }

      int[] var49 = class_1323.method_6956(var50);
      var15 = 0;

      int[] var51;
      while(true) {
         if(var15 < var4) {
            var51 = var13;
            if(var5 == null) {
               break;
            }

            System.arraycopy(var13, (var15 + (var2 & 3)) * var11 + (var1 & 3), var49, var15 * var3, var3);
            ++var15;
            if(var5 != null) {
               continue;
            }
         }

         var51 = var49;
         break;
      }

      return var51;
   }
}
