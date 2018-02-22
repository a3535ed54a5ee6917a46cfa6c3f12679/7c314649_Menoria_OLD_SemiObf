import java.util.Random;

// $FF: renamed from: hj
public class class_1169 extends class_1162 {

   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6350(false);
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      int var7 = var2.nextInt(5) + 7;
      String[] var10000 = class_752.method_4253();
      int var8 = var7 - var2.nextInt(2) - 3;
      int var9 = var7 - var8;
      String[] var6 = var10000;
      int var10 = 1 + var2.nextInt(var9 + 1);
      int var11 = 1;
      int var21 = var4;
      if(var6 != null) {
         if(var4 >= 1) {
            label275: {
               var21 = var4 + var7 + 1;
               if(var6 != null) {
                  if(var21 > 256) {
                     break label275;
                  }

                  var21 = var4;
               }

               int var12 = var21;

               int var14;
               int var15;
               int var20;
               label263:
               while(true) {
                  var21 = var12;

                  label260:
                  while(var21 <= var4 + 1 + var7) {
                     var21 = var11;
                     if(var6 == null || var6 == null) {
                        break label263;
                     }

                     if(var11 == 0) {
                        break;
                     }

                     label257: {
                        boolean var13 = true;
                        var21 = var12 - var4;
                        if(var6 != null) {
                           if(var21 < var8) {
                              var20 = 0;
                              if(var6 != null) {
                                 break label257;
                              }
                           }

                           var21 = var10;
                        }

                        var20 = var21;
                     }

                     var14 = var3 - var20;

                     label249:
                     do {
                        var21 = var14;

                        label246:
                        while(true) {
                           if(var21 > var3 + var20) {
                              break label249;
                           }

                           var21 = var11;
                           if(var6 == null) {
                              continue label260;
                           }

                           if(var6 != null) {
                              if(var11 == 0) {
                                 break label249;
                              }

                              var21 = var5 - var20;
                           }

                           var15 = var21;

                           while(true) {
                              if(var15 > var5 + var20) {
                                 break label246;
                              }

                              var21 = var11;
                              if(var6 == null) {
                                 break;
                              }

                              if(var6 != null) {
                                 if(var11 == 0) {
                                    break label246;
                                 }

                                 var21 = var12;
                              }

                              label241: {
                                 if(var6 != null) {
                                    label239: {
                                       if(var21 >= 0) {
                                          var21 = var12;
                                          if(var6 == null) {
                                             break label239;
                                          }

                                          if(var12 < 256) {
                                             label229: {
                                                aji var16 = var1.getBlock(var14, var12, var15);
                                                byte var26 = this.method_6362(var16);
                                                if(var6 != null) {
                                                   if(var26 != 0) {
                                                      break label229;
                                                   }

                                                   var26 = 0;
                                                }

                                                var11 = var26;
                                             }

                                             if(var6 != null) {
                                                break label241;
                                             }
                                          }
                                       }

                                       var21 = 0;
                                    }
                                 }

                                 var11 = var21;
                              }

                              ++var15;
                              if(var6 == null) {
                                 break label246;
                              }
                           }
                        }

                        ++var14;
                     } while(var6 != null);

                     ++var12;
                     if(var6 != null) {
                        continue label263;
                     }
                     break;
                  }

                  var21 = var11;
                  break;
               }

               if(var6 != null) {
                  if(var21 != 0) {
                     label189: {
                        aji var19 = var1.getBlock(var3, var4 - 1, var5);
                        aji var27 = var19;
                        Object var10001 = class_1192.field_6027;
                        if(var6 != null) {
                           if(var19 == class_1192.field_6027) {
                              break label189;
                           }

                           var27 = var19;
                           var10001 = class_1192.field_6028;
                        }

                        if(var27 != var10001) {
                           return false;
                        }
                     }

                     var21 = var4;
                     if(var6 != null) {
                        if(var4 >= 256 - var7 - 1) {
                           return false;
                        }

                        this.method_6353(var1, var3, var4 - 1, var5, class_1192.field_6028);
                        var21 = 0;
                     }

                     var20 = var21;
                     var14 = var4 + var7;

                     while(true) {
                        if(var14 >= var4 + var8) {
                           var21 = var3 - var20;
                           if(var6 == null) {
                              break;
                           }

                           var15 = var21;

                           int var24;
                           label169:
                           while(true) {
                              var21 = var15;
                              var24 = var3 + var20;

                              label166:
                              while(var21 <= var24) {
                                 int var23 = var15 - var3;
                                 var21 = var5 - var20;
                                 if(var6 == null) {
                                    break label169;
                                 }

                                 int var17 = var21;

                                 while(var17 <= var5 + var20) {
                                    label160: {
                                       int var18 = var17 - var5;
                                       var21 = Math.abs(var23);
                                       if(var6 != null) {
                                          label286: {
                                             var24 = var20;
                                             if(var6 == null) {
                                                continue label166;
                                             }

                                             if(var21 == var20) {
                                                var21 = Math.abs(var18);
                                                if(var6 == null) {
                                                   break label286;
                                                }

                                                if(var21 == var20) {
                                                   var21 = var20;
                                                   if(var6 == null) {
                                                      break label286;
                                                   }

                                                   if(var20 > 0) {
                                                      break label160;
                                                   }
                                                }
                                             }

                                             var21 = var1.getBlock(var15, var14, var17).method_2419();
                                          }
                                       }

                                       if(var21 == 0) {
                                          this.method_6354(var1, var15, var14, var17, class_1192.field_6044, 1);
                                       }
                                    }

                                    ++var17;
                                    if(var6 == null) {
                                       break;
                                    }
                                 }

                                 ++var15;
                                 if(var6 != null) {
                                    continue label169;
                                 }
                                 break;
                              }

                              var21 = var20;
                              break;
                           }

                           label135: {
                              var24 = 1;
                              if(var6 != null) {
                                 label133: {
                                    if(var21 >= 1) {
                                       var21 = var14;
                                       var24 = var4 + var8 + 1;
                                       if(var6 == null) {
                                          break label133;
                                       }

                                       if(var14 == var24) {
                                          --var20;
                                          if(var6 != null) {
                                             break label135;
                                          }
                                       }
                                    }

                                    var21 = var20;
                                    var24 = var10;
                                 }
                              }

                              if(var21 < var24) {
                                 ++var20;
                              }
                           }

                           --var14;
                           if(var6 != null) {
                              continue;
                           }
                        }

                        var21 = 0;
                        break;
                     }

                     var14 = var21;

                     while(var14 < var7 - 1) {
                        label116: {
                           label115: {
                              aji var22 = var1.getBlock(var3, var4 + var14, var5);
                              awt var28 = var22.method_2424();
                              awt var25 = awt.field_4170;
                              if(var6 != null) {
                                 if(var28 == awt.field_4170) {
                                    break label115;
                                 }

                                 var28 = var22.method_2424();
                                 var25 = awt.field_4179;
                              }

                              if(var28 != var25) {
                                 break label116;
                              }
                           }

                           this.method_6354(var1, var3, var4 + var14, var5, class_1192.field_6042, 1);
                        }

                        ++var14;
                        if(var6 == null) {
                           break;
                        }
                     }

                     return true;
                  }

                  var21 = 0;
               }

               return (boolean)var21;
            }
         }

         var21 = 0;
      }

      return (boolean)var21;
   }
}
