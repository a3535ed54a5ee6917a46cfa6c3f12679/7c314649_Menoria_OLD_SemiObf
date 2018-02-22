
// $FF: renamed from: jo
public class class_1277 extends class_1265 {

   // $FF: renamed from: f N
   private final class_99 field_6585;
   // $FF: renamed from: g java.lang.String
   private static final String field_6586 = "CL_00000547";


   // $FF: renamed from: <init> (long, jm, N) void
   public void method_6700(long var1, class_1265 var3, class_99 var4) {
      super.method_6675(var1);
      this.field_6573 = var3;
      this.field_6585 = var4;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int[] var10000 = class_1321.field_6789;
      if(var5 != null) {
         switch(class_1321.field_6789[this.field_6585.ordinal()]) {
         case 1:
         default:
            return this.method_6701(var1, var2, var3, var4);
         case 2:
            return this.method_6702(var1, var2, var3, var4);
         case 3:
            var10000 = this.method_6703(var1, var2, var3, var4);
         }
      }

      return var10000;
   }

   // $FF: renamed from: a (int, int, int, int) int[]
   private int[] method_6701(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1 - 1;
      String[] var5 = var10000;
      int var7 = var2 - 1;
      int var8 = 1 + var3 + 1;
      int var9 = 1 + var4 + 1;
      int[] var10 = this.field_6573.method_6679(var6, var7, var8, var9);
      int[] var11 = class_1323.method_6956(var3 * var4);
      int var12 = 0;

      do {
         int var21 = var12;
         int var10001 = var4;

         label97:
         while(true) {
            if(var21 >= var10001) {
               return var11;
            }

            int var13 = 0;

            while(true) {
               if(var13 >= var3) {
                  break label97;
               }

               this.method_6677((long)(var13 + var1), (long)(var12 + var2));
               int var14 = var10[var13 + 1 + (var12 + 1) * var8];
               if(var5 != null) {
                  var21 = var14;
                  var10001 = 1;
                  if(var5 == null) {
                     break;
                  }

                  if(var14 == 1) {
                     label108: {
                        int var15 = var10[var13 + 1 + (var12 + 1 - 1) * var8];
                        int var16 = var10[var13 + 1 + 1 + (var12 + 1) * var8];
                        int var17 = var10[var13 + 1 - 1 + (var12 + 1) * var8];
                        int var18 = var10[var13 + 1 + (var12 + 1 + 1) * var8];
                        var21 = var15;
                        if(var5 != null) {
                           label63: {
                              if(var15 != 3) {
                                 var21 = var16;
                                 if(var5 == null) {
                                    break label63;
                                 }

                                 if(var16 != 3) {
                                    var21 = var17;
                                    if(var5 == null) {
                                       break label63;
                                    }

                                    if(var17 != 3) {
                                       var21 = var18;
                                       if(var5 == null) {
                                          break label63;
                                       }

                                       if(var18 != 3) {
                                          var21 = 0;
                                          break label63;
                                       }
                                    }
                                 }
                              }

                              var21 = 1;
                           }
                        }

                        int var19 = var21;
                        var21 = var15;
                        if(var5 != null) {
                           label76: {
                              if(var15 != 4) {
                                 var21 = var16;
                                 if(var5 == null) {
                                    break label76;
                                 }

                                 if(var16 != 4) {
                                    var21 = var17;
                                    if(var5 == null) {
                                       break label76;
                                    }

                                    if(var17 != 4) {
                                       var21 = var18;
                                       if(var5 == null) {
                                          break label76;
                                       }

                                       if(var18 != 4) {
                                          var21 = 0;
                                          break label76;
                                       }
                                    }
                                 }
                              }

                              var21 = 1;
                           }
                        }

                        int var20 = var21;
                        var21 = var19;
                        if(var5 != null) {
                           label85: {
                              if(var19 == 0) {
                                 var21 = var20;
                                 if(var5 == null) {
                                    break label85;
                                 }

                                 if(var20 == 0) {
                                    break label108;
                                 }
                              }

                              var21 = 2;
                           }
                        }

                        var14 = var21;
                     }
                  }

                  var11[var13 + var12 * var3] = var14;
                  ++var13;
               }

               if(var5 == null) {
                  break label97;
               }
            }
         }

         ++var12;
      } while(var5 != null);

      return var11;
   }

   // $FF: renamed from: e (int, int, int, int) int[]
   private int[] method_6702(int var1, int var2, int var3, int var4) {
      int var6 = var1 - 1;
      int var7 = var2 - 1;
      int var8 = 1 + var3 + 1;
      String[] var10000 = class_752.method_4253();
      int var9 = 1 + var4 + 1;
      String[] var5 = var10000;
      int[] var10 = this.field_6573.method_6679(var6, var7, var8, var9);
      int[] var11 = class_1323.method_6956(var3 * var4);
      int var12 = 0;

      do {
         int var21 = var12;
         int var10001 = var4;

         label97:
         while(true) {
            if(var21 >= var10001) {
               return var11;
            }

            int var13 = 0;

            while(true) {
               if(var13 >= var3) {
                  break label97;
               }

               int var14 = var10[var13 + 1 + (var12 + 1) * var8];
               if(var5 != null) {
                  var21 = var14;
                  var10001 = 4;
                  if(var5 == null) {
                     break;
                  }

                  if(var14 == 4) {
                     label108: {
                        int var15 = var10[var13 + 1 + (var12 + 1 - 1) * var8];
                        int var16 = var10[var13 + 1 + 1 + (var12 + 1) * var8];
                        int var17 = var10[var13 + 1 - 1 + (var12 + 1) * var8];
                        int var18 = var10[var13 + 1 + (var12 + 1 + 1) * var8];
                        var21 = var15;
                        if(var5 != null) {
                           label63: {
                              if(var15 != 2) {
                                 var21 = var16;
                                 if(var5 == null) {
                                    break label63;
                                 }

                                 if(var16 != 2) {
                                    var21 = var17;
                                    if(var5 == null) {
                                       break label63;
                                    }

                                    if(var17 != 2) {
                                       var21 = var18;
                                       if(var5 == null) {
                                          break label63;
                                       }

                                       if(var18 != 2) {
                                          var21 = 0;
                                          break label63;
                                       }
                                    }
                                 }
                              }

                              var21 = 1;
                           }
                        }

                        int var19 = var21;
                        var21 = var15;
                        if(var5 != null) {
                           label76: {
                              if(var15 != 1) {
                                 var21 = var16;
                                 if(var5 == null) {
                                    break label76;
                                 }

                                 if(var16 != 1) {
                                    var21 = var17;
                                    if(var5 == null) {
                                       break label76;
                                    }

                                    if(var17 != 1) {
                                       var21 = var18;
                                       if(var5 == null) {
                                          break label76;
                                       }

                                       if(var18 != 1) {
                                          var21 = 0;
                                          break label76;
                                       }
                                    }
                                 }
                              }

                              var21 = 1;
                           }
                        }

                        int var20 = var21;
                        var21 = var20;
                        if(var5 != null) {
                           label85: {
                              if(var20 == 0) {
                                 var21 = var19;
                                 if(var5 == null) {
                                    break label85;
                                 }

                                 if(var19 == 0) {
                                    break label108;
                                 }
                              }

                              var21 = 3;
                           }
                        }

                        var14 = var21;
                     }
                  }

                  var11[var13 + var12 * var3] = var14;
                  ++var13;
               }

               if(var5 == null) {
                  break label97;
               }
            }
         }

         ++var12;
      } while(var5 != null);

      return var11;
   }

   // $FF: renamed from: f (int, int, int, int) int[]
   private int[] method_6703(int var1, int var2, int var3, int var4) {
      int[] var6 = this.field_6573.method_6679(var1, var2, var3, var4);
      int[] var7 = class_1323.method_6956(var3 * var4);
      String[] var5 = class_752.method_4253();
      int var8 = 0;

      do {
         int var10000 = var8;

         label41:
         while(true) {
            if(var10000 >= var4) {
               return var7;
            }

            int var9 = 0;

            while(true) {
               if(var9 >= var3) {
                  break label41;
               }

               this.method_6677((long)(var9 + var1), (long)(var8 + var2));
               int var10 = var6[var9 + var8 * var3];
               if(var5 != null) {
                  var10000 = var10;
                  if(var5 == null) {
                     break;
                  }

                  if(var10 != 0) {
                     label32: {
                        var10000 = this.method_6678(13);
                        if(var5 != null) {
                           if(var10000 != 0) {
                              break label32;
                           }

                           var10000 = var10 | 1 + this.method_6678(15) << 8 & 3840;
                        }

                        var10 = var10000;
                     }
                  }

                  var7[var9 + var8 * var3] = var10;
                  ++var9;
               }

               if(var5 == null) {
                  break label41;
               }
            }
         }

         ++var8;
      } while(var5 != null);

      return var7;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6685() {
      boolean var10000 = true;
      char[] var10003 = "¶®äÂ$ºÅ×".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6586 = (new String((char[])var4)).intern();
            String var2 = field_6586;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 218;
            break;
         case 1:
            var10009 = 205;
            break;
         case 2:
            var10009 = 148;
            break;
         case 3:
            var10009 = 141;
            break;
         case 4:
            var10009 = 221;
            break;
         case 5:
            var10009 = 59;
            break;
         default:
            var10009 = 165;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
