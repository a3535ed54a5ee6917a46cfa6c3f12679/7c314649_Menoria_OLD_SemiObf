import java.util.Random;

// $FF: renamed from: hm
public class class_1166 extends class_1162 {

   // $FF: renamed from: <init> (boolean) void
   public void method_6350(boolean var1) {
      super.method_6350(var1);
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      int var7 = var2.nextInt(4) + 6;
      int var8 = 1 + var2.nextInt(2);
      String[] var6 = class_752.method_4253();
      int var9 = var7 - var8;
      int var10 = 2 + var2.nextInt(2);
      int var11 = 1;
      int var10000 = var4;
      if(var6 != null) {
         if(var4 >= 1) {
            label288: {
               var10000 = var4 + var7 + 1;
               if(var6 != null) {
                  if(var10000 > 256) {
                     break label288;
                  }

                  var10000 = var4;
               }

               int var12 = var10000;

               int var14;
               awt var10001;
               int var23;
               awt var29;
               label276:
               while(true) {
                  var10000 = var12;

                  label273:
                  while(var10000 <= var4 + 1 + var7) {
                     var10000 = var11;
                     if(var6 == null || var6 == null) {
                        break label276;
                     }

                     if(var11 == 0) {
                        break;
                     }

                     label270: {
                        boolean var13 = true;
                        var10000 = var12 - var4;
                        if(var6 != null) {
                           if(var10000 < var8) {
                              var23 = 0;
                              if(var6 != null) {
                                 break label270;
                              }
                           }

                           var10000 = var10;
                        }

                        var23 = var10000;
                     }

                     var14 = var3 - var23;

                     label262:
                     do {
                        var10000 = var14;

                        label259:
                        while(true) {
                           if(var10000 > var3 + var23) {
                              break label262;
                           }

                           var10000 = var11;
                           if(var6 == null) {
                              continue label273;
                           }

                           if(var6 != null) {
                              if(var11 == 0) {
                                 break label262;
                              }

                              var10000 = var5 - var23;
                           }

                           int var15 = var10000;

                           while(true) {
                              if(var15 > var5 + var23) {
                                 break label259;
                              }

                              var10000 = var11;
                              if(var6 == null) {
                                 break;
                              }

                              if(var6 != null) {
                                 if(var11 == 0) {
                                    break label259;
                                 }

                                 var10000 = var12;
                              }

                              label254: {
                                 if(var6 != null) {
                                    label252: {
                                       if(var10000 >= 0) {
                                          var10000 = var12;
                                          if(var6 == null) {
                                             break label252;
                                          }

                                          if(var12 < 256) {
                                             label242: {
                                                aji var16 = var1.getBlock(var14, var12, var15);
                                                var29 = var16.method_2424();
                                                var10001 = awt.field_4170;
                                                if(var6 != null) {
                                                   if(var29 == awt.field_4170) {
                                                      break label242;
                                                   }

                                                   var29 = var16.method_2424();
                                                   var10001 = awt.field_4179;
                                                }

                                                if(var29 != var10001) {
                                                   var11 = 0;
                                                }
                                             }

                                             if(var6 != null) {
                                                break label254;
                                             }
                                          }
                                       }

                                       var10000 = 0;
                                    }
                                 }

                                 var11 = var10000;
                              }

                              ++var15;
                              if(var6 == null) {
                                 break label259;
                              }
                           }
                        }

                        ++var14;
                     } while(var6 != null);

                     ++var12;
                     if(var6 != null) {
                        continue label276;
                     }
                     break;
                  }

                  var10000 = var11;
                  break;
               }

               if(var6 != null) {
                  if(var10000 != 0) {
                     label295: {
                        aji var22 = var1.getBlock(var3, var4 - 1, var5);
                        aji var30 = var22;
                        Object var26 = class_1192.field_6027;
                        if(var6 != null) {
                           if(var22 == class_1192.field_6027) {
                              break label295;
                           }

                           var30 = var22;
                           var26 = class_1192.field_6028;
                        }

                        if(var6 != null) {
                           if(var30 == var26) {
                              break label295;
                           }

                           var30 = var22;
                           var26 = class_1192.field_6087;
                        }

                        if(var30 != var26) {
                           return false;
                        }
                     }

                     var10000 = var4;
                     if(var6 != null) {
                        if(var4 >= 256 - var7 - 1) {
                           return false;
                        }

                        this.method_6353(var1, var3, var4 - 1, var5, class_1192.field_6028);
                        var10000 = var2.nextInt(2);
                     }

                     var23 = var10000;
                     var14 = 1;
                     byte var24 = 0;
                     int var25 = 0;

                     int var17;
                     while(true) {
                        if(var25 <= var9) {
                           var17 = var4 + var7 - var25;
                           var10000 = var3 - var23;
                           if(var6 == null) {
                              break;
                           }

                           int var18 = var10000;

                           int var28;
                           label177:
                           while(true) {
                              var10000 = var18;
                              var28 = var3 + var23;

                              label174:
                              while(var10000 <= var28) {
                                 int var19 = var18 - var3;
                                 var10000 = var5 - var23;
                                 if(var6 == null) {
                                    break label177;
                                 }

                                 int var20 = var10000;

                                 while(var20 <= var5 + var23) {
                                    label168: {
                                       int var21 = var20 - var5;
                                       var10000 = Math.abs(var19);
                                       if(var6 != null) {
                                          label300: {
                                             var28 = var23;
                                             if(var6 == null) {
                                                continue label174;
                                             }

                                             if(var10000 == var23) {
                                                var10000 = Math.abs(var21);
                                                if(var6 == null) {
                                                   break label300;
                                                }

                                                if(var10000 == var23) {
                                                   var10000 = var23;
                                                   if(var6 == null) {
                                                      break label300;
                                                   }

                                                   if(var23 > 0) {
                                                      break label168;
                                                   }
                                                }
                                             }

                                             var10000 = var1.getBlock(var18, var17, var20).method_2419();
                                          }
                                       }

                                       if(var10000 == 0) {
                                          this.method_6354(var1, var18, var17, var20, class_1192.field_6044, 1);
                                       }
                                    }

                                    ++var20;
                                    if(var6 == null) {
                                       break;
                                    }
                                 }

                                 ++var18;
                                 if(var6 != null) {
                                    continue label177;
                                 }
                                 break;
                              }

                              var10000 = var23;
                              break;
                           }

                           label143: {
                              label142: {
                                 label301: {
                                    var28 = var14;
                                    if(var6 != null) {
                                       if(var10000 < var14) {
                                          break label301;
                                       }

                                       var23 = var24;
                                       var24 = 1;
                                       ++var14;
                                       if(var6 == null) {
                                          break label143;
                                       }

                                       var10000 = var14;
                                       var28 = var10;
                                    }

                                    if(var10000 <= var28) {
                                       break label142;
                                    }

                                    var14 = var10;
                                    if(var6 != null) {
                                       break label142;
                                    }
                                 }

                                 ++var23;
                              }

                              ++var25;
                           }

                           if(var6 != null) {
                              continue;
                           }
                        }

                        var25 = var2.nextInt(3);
                        var10000 = 0;
                        break;
                     }

                     var17 = var10000;

                     while(var17 < var7 - var25) {
                        label120: {
                           label119: {
                              aji var27 = var1.getBlock(var3, var4 + var17, var5);
                              var29 = var27.method_2424();
                              var10001 = awt.field_4170;
                              if(var6 != null) {
                                 if(var29 == awt.field_4170) {
                                    break label119;
                                 }

                                 var29 = var27.method_2424();
                                 var10001 = awt.field_4179;
                              }

                              if(var29 != var10001) {
                                 break label120;
                              }
                           }

                           this.method_6354(var1, var3, var4 + var17, var5, class_1192.field_6042, 1);
                        }

                        ++var17;
                        if(var6 == null) {
                           break;
                        }
                     }

                     return true;
                  }

                  var10000 = 0;
               }

               return (boolean)var10000;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }
}
