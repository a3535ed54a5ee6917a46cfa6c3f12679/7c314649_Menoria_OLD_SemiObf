import java.util.Random;

// $FF: renamed from: hB
public class class_1190 extends class_1151 {

   // $FF: renamed from: c int
   private int field_6022;


   // $FF: renamed from: <init> (int) void
   public void method_6408(int var1) {
      super.method_6350(true);
      this.field_6022 = -1;
      this.field_6022 = var1;
   }

   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6350(false);
      this.field_6022 = -1;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var2.nextInt(2);
      String[] var6 = var10000;
      int var21 = this.field_6022;
      if(var6 != null) {
         if(this.field_6022 >= 0) {
            var7 = this.field_6022;
         }

         var21 = var2.nextInt(3) + 4;
      }

      int var8 = var21;
      int var9 = 1;
      var21 = var4;
      if(var6 != null) {
         if(var4 >= 1) {
            label497: {
               var21 = var4 + var8 + 1;
               if(var6 != null) {
                  if(var21 >= 256) {
                     break label497;
                  }

                  var21 = var4;
               }

               int var10 = var21;

               int var12;
               int var13;
               int var10001;
               label482:
               while(true) {
                  var21 = var10;

                  label479:
                  while(var21 <= var4 + 1 + var8) {
                     byte var11 = 3;
                     var21 = var10;
                     if(var6 == null) {
                        break label482;
                     }

                     var10001 = var4 + 3;
                     if(var6 != null) {
                        if(var10 <= var10001) {
                           var11 = 0;
                        }

                        var21 = var3;
                        var10001 = var11;
                     }

                     var12 = var21 - var10001;

                     label476:
                     do {
                        var21 = var12;

                        label473:
                        while(true) {
                           if(var21 > var3 + var11) {
                              break label476;
                           }

                           var21 = var9;
                           if(var6 == null) {
                              continue label479;
                           }

                           if(var6 != null) {
                              if(var9 == 0) {
                                 break label476;
                              }

                              var21 = var5 - var11;
                           }

                           var13 = var21;

                           while(true) {
                              if(var13 > var5 + var11) {
                                 break label473;
                              }

                              var21 = var9;
                              if(var6 == null) {
                                 break;
                              }

                              if(var6 != null) {
                                 if(var9 == 0) {
                                    break label473;
                                 }

                                 var21 = var10;
                              }

                              label468: {
                                 if(var6 != null) {
                                    label466: {
                                       if(var21 >= 0) {
                                          var21 = var10;
                                          if(var6 == null) {
                                             break label466;
                                          }

                                          if(var10 < 256) {
                                             label456: {
                                                aji var14 = var1.getBlock(var12, var10, var13);
                                                awt var23 = var14.method_2424();
                                                awt var22 = awt.field_4170;
                                                if(var6 != null) {
                                                   if(var23 == awt.field_4170) {
                                                      break label456;
                                                   }

                                                   var23 = var14.method_2424();
                                                   var22 = awt.field_4179;
                                                }

                                                if(var23 != var22) {
                                                   var9 = 0;
                                                }
                                             }

                                             if(var6 != null) {
                                                break label468;
                                             }
                                          }
                                       }

                                       var21 = 0;
                                    }
                                 }

                                 var9 = var21;
                              }

                              ++var13;
                              if(var6 == null) {
                                 break label473;
                              }
                           }
                        }

                        ++var12;
                     } while(var6 != null);

                     ++var10;
                     if(var6 != null) {
                        continue label482;
                     }
                     break;
                  }

                  var21 = var9;
                  break;
               }

               if(var6 != null) {
                  if(var21 != 0) {
                     label504: {
                        aji var17 = var1.getBlock(var3, var4 - 1, var5);
                        aji var24 = var17;
                        if(var6 != null) {
                           if(var17 == class_1192.field_6028) {
                              break label504;
                           }

                           var24 = var17;
                        }

                        if(var6 != null) {
                           if(var24 == class_1192.field_6027) {
                              break label504;
                           }

                           var24 = var17;
                        }

                        if(var24 != class_1192.field_6135) {
                           return false;
                        }
                     }

                     int var18 = var4 + var8;
                     var21 = var7;
                     if(var6 != null) {
                        if(var7 == 1) {
                           var18 = var4 + var8 - 3;
                        }

                        var21 = var18;
                     }

                     var12 = var21;

                     label408:
                     while(true) {
                        var21 = var12;

                        label404:
                        while(true) {
                           if(var21 <= var4 + var8) {
                              var13 = 1;
                              var21 = var12;
                              if(var6 != null) {
                                 var10001 = var4 + var8;
                                 if(var6 == null) {
                                    break;
                                 }

                                 if(var12 < var10001) {
                                    ++var13;
                                 }

                                 var21 = var7;
                              }

                              if(var6 != null) {
                                 if(var21 == 0) {
                                    var13 = 3;
                                 }

                                 var21 = var3 - var13;
                              }

                              int var19 = var21;

                              label387:
                              do {
                                 var21 = var19;
                                 var10001 = var3 + var13;

                                 label384:
                                 while(true) {
                                    if(var21 > var10001) {
                                       break label387;
                                    }

                                    var21 = var5 - var13;
                                    if(var6 == null) {
                                       continue label404;
                                    }

                                    int var15 = var21;

                                    while(true) {
                                       if(var15 > var5 + var13) {
                                          break label384;
                                       }

                                       int var16 = 5;
                                       var21 = var19;
                                       var10001 = var3 - var13;
                                       if(var6 == null) {
                                          break;
                                       }

                                       if(var6 != null) {
                                          if(var19 == var10001) {
                                             --var16;
                                          }

                                          var21 = var19;
                                          var10001 = var3 + var13;
                                       }

                                       if(var6 != null) {
                                          if(var21 == var10001) {
                                             ++var16;
                                          }

                                          var21 = var15;
                                          var10001 = var5 - var13;
                                       }

                                       label511: {
                                          if(var6 != null) {
                                             if(var21 == var10001) {
                                                var16 -= 3;
                                             }

                                             var21 = var15;
                                             if(var6 == null) {
                                                break label511;
                                             }

                                             var10001 = var5 + var13;
                                          }

                                          if(var21 == var10001) {
                                             var16 += 3;
                                          }

                                          var21 = var7;
                                       }

                                       label513: {
                                          label514: {
                                             label515: {
                                                label532: {
                                                   if(var6 != null) {
                                                      if(var21 != 0) {
                                                         var21 = var12;
                                                         var10001 = var4 + var8;
                                                         if(var6 == null) {
                                                            break label515;
                                                         }

                                                         if(var12 >= var10001) {
                                                            break label532;
                                                         }
                                                      }

                                                      var21 = var19;
                                                   }

                                                   label347: {
                                                      label517: {
                                                         var10001 = var3 - var13;
                                                         if(var6 != null) {
                                                            if(var21 != var10001) {
                                                               var21 = var19;
                                                               var10001 = var3 + var13;
                                                               if(var6 == null) {
                                                                  break label347;
                                                               }

                                                               if(var19 != var10001) {
                                                                  break label517;
                                                               }
                                                            }

                                                            var21 = var15;
                                                            var10001 = var5 - var13;
                                                         }

                                                         if(var6 != null) {
                                                            if(var21 == var10001) {
                                                               break label513;
                                                            }

                                                            var21 = var15;
                                                            var10001 = var5 + var13;
                                                         }

                                                         if(var6 == null) {
                                                            break label347;
                                                         }

                                                         if(var21 == var10001) {
                                                            break label513;
                                                         }
                                                      }

                                                      var21 = var19;
                                                      var10001 = var3 - (var13 - 1);
                                                   }

                                                   if(var6 != null) {
                                                      label526: {
                                                         if(var21 == var10001) {
                                                            var21 = var15;
                                                            var10001 = var5 - var13;
                                                            if(var6 == null) {
                                                               break label526;
                                                            }

                                                            if(var15 == var10001) {
                                                               var16 = 1;
                                                            }
                                                         }

                                                         var21 = var19;
                                                         var10001 = var3 - var13;
                                                      }
                                                   }

                                                   if(var6 != null) {
                                                      label527: {
                                                         if(var21 == var10001) {
                                                            var21 = var15;
                                                            var10001 = var5 - (var13 - 1);
                                                            if(var6 == null) {
                                                               break label527;
                                                            }

                                                            if(var15 == var10001) {
                                                               var16 = 1;
                                                            }
                                                         }

                                                         var21 = var19;
                                                         var10001 = var3 + (var13 - 1);
                                                      }
                                                   }

                                                   if(var6 != null) {
                                                      label528: {
                                                         if(var21 == var10001) {
                                                            var21 = var15;
                                                            var10001 = var5 - var13;
                                                            if(var6 == null) {
                                                               break label528;
                                                            }

                                                            if(var15 == var10001) {
                                                               var16 = 3;
                                                            }
                                                         }

                                                         var21 = var19;
                                                         var10001 = var3 + var13;
                                                      }
                                                   }

                                                   if(var6 != null) {
                                                      label529: {
                                                         if(var21 == var10001) {
                                                            var21 = var15;
                                                            var10001 = var5 - (var13 - 1);
                                                            if(var6 == null) {
                                                               break label529;
                                                            }

                                                            if(var15 == var10001) {
                                                               var16 = 3;
                                                            }
                                                         }

                                                         var21 = var19;
                                                         var10001 = var3 - (var13 - 1);
                                                      }
                                                   }

                                                   if(var6 != null) {
                                                      label530: {
                                                         if(var21 == var10001) {
                                                            var21 = var15;
                                                            var10001 = var5 + var13;
                                                            if(var6 == null) {
                                                               break label530;
                                                            }

                                                            if(var15 == var10001) {
                                                               var16 = 7;
                                                            }
                                                         }

                                                         var21 = var19;
                                                         var10001 = var3 - var13;
                                                      }
                                                   }

                                                   if(var6 != null) {
                                                      label531: {
                                                         if(var21 == var10001) {
                                                            var21 = var15;
                                                            var10001 = var5 + (var13 - 1);
                                                            if(var6 == null) {
                                                               break label531;
                                                            }

                                                            if(var15 == var10001) {
                                                               var16 = 7;
                                                            }
                                                         }

                                                         var21 = var19;
                                                         var10001 = var3 + (var13 - 1);
                                                      }
                                                   }

                                                   if(var6 != null) {
                                                      label274: {
                                                         if(var21 == var10001) {
                                                            var21 = var15;
                                                            var10001 = var5 + var13;
                                                            if(var6 == null) {
                                                               break label274;
                                                            }

                                                            if(var15 == var10001) {
                                                               var16 = 9;
                                                            }
                                                         }

                                                         var21 = var19;
                                                         var10001 = var3 + var13;
                                                      }
                                                   }

                                                   if(var6 == null) {
                                                      break label515;
                                                   }

                                                   if(var21 == var10001) {
                                                      var21 = var15;
                                                      var10001 = var5 + (var13 - 1);
                                                      if(var6 == null) {
                                                         break label515;
                                                      }

                                                      if(var15 == var10001) {
                                                         var16 = 9;
                                                      }
                                                   }
                                                }

                                                var21 = var16;
                                                if(var6 == null) {
                                                   break label514;
                                                }

                                                var10001 = 5;
                                             }

                                             if(var21 == var10001) {
                                                var21 = var12;
                                                if(var6 == null) {
                                                   break label514;
                                                }

                                                if(var12 < var4 + var8) {
                                                   var16 = 0;
                                                }
                                             }

                                             var21 = var16;
                                          }

                                          if(var6 != null) {
                                             label262: {
                                                if(var21 == 0) {
                                                   var21 = var4;
                                                   if(var6 == null) {
                                                      break label262;
                                                   }

                                                   if(var4 < var4 + var8 - 1) {
                                                      break label513;
                                                   }
                                                }

                                                var21 = var1.getBlock(var19, var12, var15).method_2419();
                                             }
                                          }

                                          if(var21 == 0) {
                                             this.method_6354(var1, var19, var12, var15, aji.method_2416(aji.method_2415(class_1192.field_6124) + var7), var16);
                                          }
                                       }

                                       ++var15;
                                       if(var6 == null) {
                                          break label384;
                                       }
                                    }
                                 }

                                 ++var19;
                              } while(var6 != null);

                              ++var12;
                              if(var6 != null) {
                                 continue label408;
                              }

                              var12 = 0;
                           } else {
                              var12 = 0;
                           }

                           var21 = var12;
                           var10001 = var8;
                           break;
                        }

                        boolean var25;
                        while(var21 < var10001) {
                           aji var20 = var1.getBlock(var3, var4 + var12, var5);
                           if(var6 != null) {
                              var25 = var20.method_2419();
                              if(var6 == null) {
                                 return var25;
                              }

                              if(!var25) {
                                 this.method_6354(var1, var3, var4 + var12, var5, aji.method_2416(aji.method_2415(class_1192.field_6124) + var7), 10);
                              }

                              ++var12;
                           }

                           if(var6 == null) {
                              break;
                           }

                           var21 = var12;
                           var10001 = var8;
                        }

                        var25 = true;
                        return var25;
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
}
