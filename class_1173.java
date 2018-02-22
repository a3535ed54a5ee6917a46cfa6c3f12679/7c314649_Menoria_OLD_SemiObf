import java.util.Random;

// $FF: renamed from: hf
public class class_1173 extends class_1162 {

   // $FF: renamed from: c boolean
   private boolean field_5990;


   // $FF: renamed from: <init> (boolean, boolean) void
   public void method_6383(boolean var1, boolean var2) {
      super.method_6350(var1);
      this.field_5990 = var2;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var2.nextInt(3) + 5;
      String[] var6 = var10000;
      byte var22 = this.field_5990;
      if(var6 != null) {
         if(this.field_5990) {
            var7 += var2.nextInt(7);
         }

         var22 = 1;
      }

      int var8 = var22;
      int var23 = var4;
      if(var6 != null) {
         if(var4 >= 1) {
            label293: {
               var23 = var4 + var7 + 1;
               if(var6 != null) {
                  if(var23 > 256) {
                     break label293;
                  }

                  var23 = var4;
               }

               int var9 = var23;

               int var11;
               int var12;
               int var10001;
               label278:
               while(true) {
                  var23 = var9;

                  label275:
                  while(var23 <= var4 + 1 + var7) {
                     byte var10 = 1;
                     var23 = var9;
                     if(var6 == null) {
                        break label278;
                     }

                     var10001 = var4;
                     if(var6 != null) {
                        if(var9 == var4) {
                           var10 = 0;
                        }

                        var23 = var9;
                        var10001 = var4 + 1 + var7 - 2;
                     }

                     if(var6 != null) {
                        if(var23 >= var10001) {
                           var10 = 2;
                        }

                        var23 = var3;
                        var10001 = var10;
                     }

                     var11 = var23 - var10001;

                     label272:
                     do {
                        var23 = var11;

                        label269:
                        while(true) {
                           if(var23 > var3 + var10) {
                              break label272;
                           }

                           var23 = var8;
                           if(var6 == null) {
                              continue label275;
                           }

                           if(var6 != null) {
                              if(var8 == 0) {
                                 break label272;
                              }

                              var23 = var5 - var10;
                           }

                           var12 = var23;

                           while(true) {
                              if(var12 > var5 + var10) {
                                 break label269;
                              }

                              var23 = var8;
                              if(var6 == null) {
                                 break;
                              }

                              if(var6 != null) {
                                 if(var8 == 0) {
                                    break label269;
                                 }

                                 var23 = var9;
                              }

                              label264: {
                                 if(var6 != null) {
                                    label262: {
                                       if(var23 >= 0) {
                                          var23 = var9;
                                          if(var6 == null) {
                                             break label262;
                                          }

                                          if(var9 < 256) {
                                             label252: {
                                                aji var13 = var1.getBlock(var11, var9, var12);
                                                var22 = this.method_6362(var13);
                                                if(var6 != null) {
                                                   if(var22 != 0) {
                                                      break label252;
                                                   }

                                                   var22 = 0;
                                                }

                                                var8 = var22;
                                             }

                                             if(var6 != null) {
                                                break label264;
                                             }
                                          }
                                       }

                                       var23 = 0;
                                    }
                                 }

                                 var8 = var23;
                              }

                              ++var12;
                              if(var6 == null) {
                                 break label269;
                              }
                           }
                        }

                        ++var11;
                     } while(var6 != null);

                     ++var9;
                     if(var6 != null) {
                        continue label278;
                     }
                     break;
                  }

                  var23 = var8;
                  break;
               }

               if(var6 != null) {
                  if(var23 != 0) {
                     label300: {
                        aji var18 = var1.getBlock(var3, var4 - 1, var5);
                        aji var26 = var18;
                        Object var24 = class_1192.field_6027;
                        if(var6 != null) {
                           if(var18 == class_1192.field_6027) {
                              break label300;
                           }

                           var26 = var18;
                           var24 = class_1192.field_6028;
                        }

                        if(var6 != null) {
                           if(var26 == var24) {
                              break label300;
                           }

                           var26 = var18;
                           var24 = class_1192.field_6087;
                        }

                        if(var26 != var24) {
                           return false;
                        }
                     }

                     var23 = var4;
                     var10001 = 256 - var7 - 1;
                     if(var6 != null) {
                        if(var4 >= var10001) {
                           return false;
                        }

                        this.method_6353(var1, var3, var4 - 1, var5, class_1192.field_6028);
                        var23 = var4 - 3;
                        var10001 = var7;
                     }

                     int var19 = var23 + var10001;

                     awt var25;
                     awt var27;
                     label195:
                     while(true) {
                        var23 = var19;

                        label192:
                        while(var23 <= var4 + var7) {
                           var11 = var19 - (var4 + var7);
                           var12 = 1 - var11 / 2;
                           var23 = var3 - var12;
                           if(var6 == null) {
                              break label195;
                           }

                           int var21 = var23;

                           label189:
                           do {
                              var23 = var21;
                              var10001 = var3 + var12;

                              label186:
                              while(true) {
                                 if(var23 > var10001) {
                                    break label189;
                                 }

                                 int var14 = var21 - var3;
                                 var23 = var5 - var12;
                                 if(var6 == null) {
                                    continue label192;
                                 }

                                 int var15 = var23;

                                 while(true) {
                                    if(var15 > var5 + var12) {
                                       break label186;
                                    }

                                    int var16 = var15 - var5;
                                    var23 = Math.abs(var14);
                                    var10001 = var12;
                                    if(var6 == null) {
                                       break;
                                    }

                                    label306: {
                                       label307: {
                                          label308: {
                                             if(var6 != null) {
                                                if(var23 != var12) {
                                                   break label307;
                                                }

                                                var23 = Math.abs(var16);
                                                if(var6 == null) {
                                                   break label308;
                                                }

                                                var10001 = var12;
                                             }

                                             if(var23 != var10001) {
                                                break label307;
                                             }

                                             var23 = var2.nextInt(2);
                                          }

                                          if(var6 != null) {
                                             if(var23 == 0) {
                                                break label306;
                                             }

                                             var23 = var11;
                                          }

                                          if(var23 == 0) {
                                             break label306;
                                          }
                                       }

                                       label162: {
                                          aji var17 = var1.getBlock(var21, var19, var15);
                                          var27 = var17.method_2424();
                                          var25 = awt.field_4170;
                                          if(var6 != null) {
                                             if(var27 == awt.field_4170) {
                                                break label162;
                                             }

                                             var27 = var17.method_2424();
                                             var25 = awt.field_4179;
                                          }

                                          if(var27 != var25) {
                                             break label306;
                                          }
                                       }

                                       this.method_6354(var1, var21, var19, var15, class_1192.field_6044, 2);
                                    }

                                    ++var15;
                                    if(var6 == null) {
                                       break label186;
                                    }
                                 }
                              }

                              ++var21;
                           } while(var6 != null);

                           ++var19;
                           if(var6 != null) {
                              continue label195;
                           }
                           break;
                        }

                        var23 = 0;
                        break;
                     }

                     var19 = var23;

                     while(var19 < var7) {
                        label131: {
                           label130: {
                              aji var20 = var1.getBlock(var3, var4 + var19, var5);
                              var27 = var20.method_2424();
                              var25 = awt.field_4170;
                              if(var6 != null) {
                                 if(var27 == awt.field_4170) {
                                    break label130;
                                 }

                                 var27 = var20.method_2424();
                                 var25 = awt.field_4179;
                              }

                              if(var27 != var25) {
                                 break label131;
                              }
                           }

                           this.method_6354(var1, var3, var4 + var19, var5, class_1192.field_6042, 2);
                        }

                        ++var19;
                        if(var6 == null) {
                           break;
                        }
                     }

                     return true;
                  }

                  var23 = 0;
               }

               return (boolean)var23;
            }
         }

         var23 = 0;
      }

      return (boolean)var23;
   }
}
