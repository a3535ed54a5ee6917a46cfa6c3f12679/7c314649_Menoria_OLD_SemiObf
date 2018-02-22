
// $FF: renamed from: jp
public class class_1276 extends class_1265 {

   // $FF: renamed from: <init> (long, jm) void
   public void method_6699(long var1, class_1265 var3) {
      super.method_6675(var1);
      this.field_6573 = var3;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      int var6 = var1 - 1;
      int var7 = var2 - 1;
      int var8 = var3 + 2;
      String[] var10000 = class_752.method_4253();
      int var9 = var4 + 2;
      int[] var10 = this.field_6573.method_6679(var6, var7, var8, var9);
      String[] var5 = var10000;
      int[] var11 = class_1323.method_6956(var3 * var4);
      int var12 = 0;

      do {
         int var21 = var12;

         label197:
         while(true) {
            if(var21 >= var4) {
               return var11;
            }

            int var13 = 0;

            while(true) {
               if(var13 >= var3) {
                  break label197;
               }

               int var14 = var10[var13 + 0 + (var12 + 0) * var8];
               int var15 = var10[var13 + 2 + (var12 + 0) * var8];
               int var16 = var10[var13 + 0 + (var12 + 2) * var8];
               int var17 = var10[var13 + 2 + (var12 + 2) * var8];
               int var18 = var10[var13 + 1 + (var12 + 1) * var8];
               this.method_6677((long)(var13 + var1), (long)(var12 + var2));
               var21 = var18;
               if(var5 == null) {
                  break;
               }

               label207: {
                  if(var5 != null) {
                     label190: {
                        if(var18 == 0) {
                           label220: {
                              var21 = var14;
                              if(var5 != null) {
                                 label186: {
                                    if(var14 == 0) {
                                       var21 = var15;
                                       if(var5 == null) {
                                          break label186;
                                       }

                                       if(var15 == 0) {
                                          var21 = var16;
                                          if(var5 == null) {
                                             break label186;
                                          }

                                          if(var16 == 0) {
                                             var21 = var17;
                                             if(var5 == null) {
                                                break label190;
                                             }

                                             if(var17 == 0) {
                                                break label220;
                                             }
                                          }
                                       }
                                    }

                                    var21 = 1;
                                 }
                              }

                              int var19 = var21;
                              int var20 = 1;
                              var21 = var14;
                              if(var5 != null) {
                                 label216: {
                                    if(var14 != 0) {
                                       var21 = this.method_6678(var19++);
                                       if(var5 == null) {
                                          break label216;
                                       }

                                       if(var21 == 0) {
                                          var20 = var14;
                                       }
                                    }

                                    var21 = var15;
                                 }
                              }

                              if(var5 != null) {
                                 label217: {
                                    if(var21 != 0) {
                                       var21 = this.method_6678(var19++);
                                       if(var5 == null) {
                                          break label217;
                                       }

                                       if(var21 == 0) {
                                          var20 = var15;
                                       }
                                    }

                                    var21 = var16;
                                 }
                              }

                              if(var5 != null) {
                                 label218: {
                                    if(var21 != 0) {
                                       var21 = this.method_6678(var19++);
                                       if(var5 == null) {
                                          break label218;
                                       }

                                       if(var21 == 0) {
                                          var20 = var16;
                                       }
                                    }

                                    var21 = var17;
                                 }
                              }

                              if(var5 != null) {
                                 label219: {
                                    if(var21 != 0) {
                                       var21 = this.method_6678(var19++);
                                       if(var5 == null) {
                                          break label219;
                                       }

                                       if(var21 == 0) {
                                          var20 = var17;
                                       }
                                    }

                                    var21 = this.method_6678(3);
                                 }
                              }

                              label213: {
                                 if(var5 != null) {
                                    if(var21 == 0) {
                                       var11[var13 + var12 * var3] = var20;
                                       if(var5 != null) {
                                          break label213;
                                       }
                                    }

                                    var21 = var20;
                                 }

                                 if(var21 == 4) {
                                    var11[var13 + var12 * var3] = 4;
                                    if(var5 != null) {
                                       break label213;
                                    }
                                 }

                                 var11[var13 + var12 * var3] = 0;
                              }

                              if(var5 != null) {
                                 break label207;
                              }
                           }
                        }

                        var21 = var18;
                     }
                  }

                  label214: {
                     if(var5 != null) {
                        if(var21 <= 0) {
                           break label214;
                        }

                        var21 = var14;
                     }

                     if(var5 != null) {
                        label115: {
                           if(var21 != 0) {
                              var21 = var15;
                              if(var5 == null) {
                                 break label115;
                              }

                              if(var15 != 0) {
                                 var21 = var16;
                                 if(var5 == null) {
                                    break label115;
                                 }

                                 if(var16 != 0) {
                                    var21 = var17;
                                    if(var5 == null) {
                                       break label115;
                                    }

                                    if(var17 != 0) {
                                       break label214;
                                    }
                                 }
                              }
                           }

                           var21 = this.method_6678(5);
                        }
                     }

                     label215: {
                        if(var5 != null) {
                           if(var21 != 0) {
                              break label215;
                           }

                           var21 = var18;
                        }

                        if(var21 == 4) {
                           var11[var13 + var12 * var3] = 4;
                           if(var5 != null) {
                              break label207;
                           }
                        }

                        var11[var13 + var12 * var3] = 0;
                        if(var5 != null) {
                           break label207;
                        }
                     }

                     var11[var13 + var12 * var3] = var18;
                     if(var5 != null) {
                        break label207;
                     }
                  }

                  var11[var13 + var12 * var3] = var18;
               }

               ++var13;
               if(var5 == null) {
                  break label197;
               }
            }
         }

         ++var12;
      } while(var5 != null);

      return var11;
   }
}
