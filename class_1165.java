import java.util.Random;

// $FF: renamed from: hn
public class class_1165 extends class_1162 {

   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6350(false);
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var2.nextInt(4) + 5;
      String[] var6 = var10000;

      while(var1.getBlock(var3, var4 - 1, var5).method_2424() == awt.field_4177) {
         --var4;
         if(var6 == null) {
            break;
         }
      }

      int var8 = 1;
      int var21 = var4;
      if(var6 != null) {
         if(var4 >= 1) {
            label409: {
               var21 = var4 + var7 + 1;
               if(var6 != null) {
                  if(var21 > 256) {
                     break label409;
                  }

                  var21 = var4;
               }

               int var9 = var21;

               int var11;
               int var12;
               int var10001;
               awt var22;
               awt var24;
               aji var25;
               label388:
               while(true) {
                  var21 = var9;

                  label385:
                  while(var21 <= var4 + 1 + var7) {
                     byte var10 = 1;
                     var21 = var9;
                     if(var6 == null) {
                        break label388;
                     }

                     var10001 = var4;
                     if(var6 != null) {
                        if(var9 == var4) {
                           var10 = 0;
                        }

                        var21 = var9;
                        var10001 = var4 + 1 + var7 - 2;
                     }

                     if(var6 != null) {
                        if(var21 >= var10001) {
                           var10 = 3;
                        }

                        var21 = var3;
                        var10001 = var10;
                     }

                     var11 = var21 - var10001;

                     label382:
                     do {
                        var21 = var11;

                        label379:
                        while(true) {
                           if(var21 > var3 + var10) {
                              break label382;
                           }

                           var21 = var8;
                           if(var6 == null) {
                              continue label385;
                           }

                           if(var6 != null) {
                              if(var8 == 0) {
                                 break label382;
                              }

                              var21 = var5 - var10;
                           }

                           var12 = var21;

                           while(true) {
                              if(var12 > var5 + var10) {
                                 break label379;
                              }

                              var21 = var8;
                              if(var6 == null) {
                                 break;
                              }

                              if(var6 != null) {
                                 if(var8 == 0) {
                                    break label379;
                                 }

                                 var21 = var9;
                              }

                              label374: {
                                 if(var6 != null) {
                                    label372: {
                                       if(var21 >= 0) {
                                          var21 = var9;
                                          if(var6 == null) {
                                             break label372;
                                          }

                                          if(var9 < 256) {
                                             label415: {
                                                aji var13;
                                                label416: {
                                                   var13 = var1.getBlock(var11, var9, var12);
                                                   var24 = var13.method_2424();
                                                   var22 = awt.field_4170;
                                                   if(var6 != null) {
                                                      if(var24 == awt.field_4170) {
                                                         break label415;
                                                      }

                                                      var25 = var13;
                                                      if(var6 == null) {
                                                         break label416;
                                                      }

                                                      var24 = var13.method_2424();
                                                      var22 = awt.field_4179;
                                                   }

                                                   if(var24 == var22) {
                                                      break label415;
                                                   }

                                                   var25 = var13;
                                                }

                                                label418: {
                                                   label353: {
                                                      if(var6 != null) {
                                                         if(var25 == class_1192.field_6034) {
                                                            break label353;
                                                         }

                                                         var25 = var13;
                                                      }

                                                      if(var25 != class_1192.field_6033) {
                                                         break label418;
                                                      }
                                                   }

                                                   var21 = var9;
                                                   if(var6 != null) {
                                                      if(var9 <= var4) {
                                                         break label415;
                                                      }

                                                      var21 = 0;
                                                   }

                                                   var8 = var21;
                                                   if(var6 != null) {
                                                      break label415;
                                                   }
                                                }

                                                var8 = 0;
                                             }

                                             if(var6 != null) {
                                                break label374;
                                             }
                                          }
                                       }

                                       var21 = 0;
                                    }
                                 }

                                 var8 = var21;
                              }

                              ++var12;
                              if(var6 == null) {
                                 break label379;
                              }
                           }
                        }

                        ++var11;
                     } while(var6 != null);

                     ++var9;
                     if(var6 != null) {
                        continue label388;
                     }
                     break;
                  }

                  var21 = var8;
                  break;
               }

               if(var6 != null) {
                  if(var21 != 0) {
                     Object var23;
                     label305: {
                        aji var17 = var1.getBlock(var3, var4 - 1, var5);
                        var25 = var17;
                        var23 = class_1192.field_6027;
                        if(var6 != null) {
                           if(var17 == class_1192.field_6027) {
                              break label305;
                           }

                           var25 = var17;
                           var23 = class_1192.field_6028;
                        }

                        if(var25 != var23) {
                           return false;
                        }
                     }

                     var21 = var4;
                     var10001 = 256 - var7 - 1;
                     if(var6 != null) {
                        if(var4 >= var10001) {
                           return false;
                        }

                        this.method_6353(var1, var3, var4 - 1, var5, class_1192.field_6028);
                        var21 = var4 - 3;
                        var10001 = var7;
                     }

                     int var18 = var21 + var10001;

                     int var14;
                     int var20;
                     label290:
                     while(true) {
                        var21 = var18;

                        label287:
                        while(var21 <= var4 + var7) {
                           var11 = var18 - (var4 + var7);
                           var12 = 2 - var11 / 2;
                           var21 = var3 - var12;
                           if(var6 == null) {
                              break label290;
                           }

                           var20 = var21;

                           label284:
                           do {
                              var21 = var20;
                              var10001 = var3 + var12;

                              label281:
                              while(true) {
                                 if(var21 > var10001) {
                                    break label284;
                                 }

                                 var14 = var20 - var3;
                                 var21 = var5 - var12;
                                 if(var6 == null) {
                                    continue label287;
                                 }

                                 int var15 = var21;

                                 while(true) {
                                    if(var15 > var5 + var12) {
                                       break label281;
                                    }

                                    label276: {
                                       int var16 = var15 - var5;
                                       var21 = Math.abs(var14);
                                       if(var6 != null) {
                                          label425: {
                                             var10001 = var12;
                                             if(var6 == null) {
                                                break;
                                             }

                                             if(var21 == var12) {
                                                var21 = Math.abs(var16);
                                                if(var6 == null) {
                                                   break label425;
                                                }

                                                if(var21 == var12) {
                                                   var21 = var2.nextInt(2);
                                                   if(var6 != null) {
                                                      if(var21 == 0) {
                                                         break label276;
                                                      }

                                                      var21 = var11;
                                                   }

                                                   if(var6 == null) {
                                                      break label425;
                                                   }

                                                   if(var21 == 0) {
                                                      break label276;
                                                   }
                                                }
                                             }

                                             var21 = var1.getBlock(var20, var18, var15).method_2419();
                                          }
                                       }

                                       if(var21 == 0) {
                                          this.method_6353(var1, var20, var18, var15, class_1192.field_6044);
                                       }
                                    }

                                    ++var15;
                                    if(var6 == null) {
                                       break label281;
                                    }
                                 }
                              }

                              ++var20;
                           } while(var6 != null);

                           ++var18;
                           if(var6 != null) {
                              continue label290;
                           }
                           break;
                        }

                        var21 = 0;
                        break;
                     }

                     var18 = var21;

                     while(true) {
                        if(var18 < var7) {
                           aji var19 = var1.getBlock(var3, var4 + var18, var5);
                           if(var6 == null) {
                              break;
                           }

                           label234: {
                              label428: {
                                 label429: {
                                    var24 = var19.method_2424();
                                    var22 = awt.field_4170;
                                    if(var6 != null) {
                                       if(var24 == awt.field_4170) {
                                          break label428;
                                       }

                                       var25 = var19;
                                       if(var6 == null) {
                                          break label429;
                                       }

                                       var24 = var19.method_2424();
                                       var22 = awt.field_4179;
                                    }

                                    if(var24 == var22) {
                                       break label428;
                                    }

                                    var25 = var19;
                                 }

                                 var23 = class_1192.field_6033;
                                 if(var6 != null) {
                                    if(var25 == class_1192.field_6033) {
                                       break label428;
                                    }

                                    var25 = var19;
                                    var23 = class_1192.field_6034;
                                 }

                                 if(var25 != var23) {
                                    break label234;
                                 }
                              }

                              this.method_6353(var1, var3, var4 + var18, var5, class_1192.field_6042);
                           }

                           ++var18;
                           if(var6 != null) {
                              continue;
                           }
                        }

                        var18 = var4 - 3 + var7;
                        break;
                     }

                     label211:
                     while(true) {
                        var21 = var18;

                        label208:
                        while(var21 <= var4 + var7) {
                           var11 = var18 - (var4 + var7);
                           var12 = 2 - var11 / 2;
                           var21 = var3 - var12;
                           if(var6 == null) {
                              return (boolean)var21;
                           }

                           var20 = var21;

                           while(var20 <= var3 + var12) {
                              var21 = var5 - var12;
                              if(var6 == null) {
                                 continue label208;
                              }

                              var14 = var21;

                              while(true) {
                                 if(var14 <= var5 + var12) {
                                    if(var6 == null) {
                                       break;
                                    }

                                    if(var1.getBlock(var20, var18, var14).method_2424() == awt.field_4179) {
                                       var21 = var2.nextInt(4);
                                       if(var6 != null) {
                                          if(var21 == 0 && var1.getBlock(var20 - 1, var18, var14).method_2424() == awt.field_4170) {
                                             this.method_6367(var1, var20 - 1, var18, var14, 8);
                                          }

                                          var21 = var2.nextInt(4);
                                       }

                                       if(var6 != null) {
                                          if(var21 == 0 && var1.getBlock(var20 + 1, var18, var14).method_2424() == awt.field_4170) {
                                             this.method_6367(var1, var20 + 1, var18, var14, 2);
                                          }

                                          var21 = var2.nextInt(4);
                                       }

                                       if(var6 != null) {
                                          if(var21 == 0 && var1.getBlock(var20, var18, var14 - 1).method_2424() == awt.field_4170) {
                                             this.method_6367(var1, var20, var18, var14 - 1, 1);
                                          }

                                          var21 = var2.nextInt(4);
                                       }

                                       if(var21 == 0 && var1.getBlock(var20, var18, var14 + 1).method_2424() == awt.field_4170) {
                                          this.method_6367(var1, var20, var18, var14 + 1, 4);
                                       }
                                    }

                                    ++var14;
                                    if(var6 != null) {
                                       continue;
                                    }
                                 }

                                 ++var20;
                                 break;
                              }

                              if(var6 == null) {
                                 break;
                              }
                           }

                           ++var18;
                           if(var6 != null) {
                              continue label211;
                           }
                           break;
                        }

                        var21 = 1;
                        return (boolean)var21;
                     }
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

   // $FF: renamed from: b (ahb, int, int, int, int) void
   private void method_6367(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      this.method_6354(var1, var2, var3, var4, class_1192.field_6131, var5);
      String[] var6 = var10000;
      int var7 = 4;

      do {
         --var3;
         if(var1.getBlock(var2, var3, var4).method_2424() != awt.field_4170 || var7 <= 0) {
            break;
         }

         this.method_6354(var1, var2, var3, var4, class_1192.field_6131, var5);
         --var7;
      } while(var6 != null);

   }
}
