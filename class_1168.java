import java.util.Random;

// $FF: renamed from: hk
public class class_1168 extends class_1162 {

   // $FF: renamed from: <init> (boolean) void
   public void method_6350(boolean var1) {
      super.method_6350(var1);
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var2.nextInt(3) + var2.nextInt(2) + 6;
      int var8 = 1;
      String[] var6 = var10000;
      int var24 = var4;
      if(var6 != null) {
         if(var4 >= 1) {
            label537: {
               var24 = var4 + var7 + 1;
               if(var6 != null) {
                  if(var24 > 256) {
                     break label537;
                  }

                  var24 = var4;
               }

               int var9 = var24;

               int var11;
               int var12;
               int var10001;
               label525:
               while(true) {
                  var24 = var9;

                  label522:
                  while(var24 <= var4 + 1 + var7) {
                     byte var10 = 1;
                     var24 = var9;
                     if(var6 == null) {
                        break label525;
                     }

                     var10001 = var4;
                     if(var6 != null) {
                        if(var9 == var4) {
                           var10 = 0;
                        }

                        var24 = var9;
                        var10001 = var4 + 1 + var7 - 2;
                     }

                     if(var6 != null) {
                        if(var24 >= var10001) {
                           var10 = 2;
                        }

                        var24 = var3;
                        var10001 = var10;
                     }

                     var11 = var24 - var10001;

                     label519:
                     do {
                        var24 = var11;

                        label516:
                        while(true) {
                           if(var24 > var3 + var10) {
                              break label519;
                           }

                           var24 = var8;
                           if(var6 == null) {
                              continue label522;
                           }

                           if(var6 != null) {
                              if(var8 == 0) {
                                 break label519;
                              }

                              var24 = var5 - var10;
                           }

                           var12 = var24;

                           while(true) {
                              if(var12 > var5 + var10) {
                                 break label516;
                              }

                              var24 = var8;
                              if(var6 == null) {
                                 break;
                              }

                              if(var6 != null) {
                                 if(var8 == 0) {
                                    break label516;
                                 }

                                 var24 = var9;
                              }

                              label511: {
                                 if(var6 != null) {
                                    label509: {
                                       if(var24 >= 0) {
                                          var24 = var9;
                                          if(var6 == null) {
                                             break label509;
                                          }

                                          if(var9 < 256) {
                                             label499: {
                                                aji var13 = var1.getBlock(var11, var9, var12);
                                                byte var28 = this.method_6362(var13);
                                                if(var6 != null) {
                                                   if(var28 != 0) {
                                                      break label499;
                                                   }

                                                   var28 = 0;
                                                }

                                                var8 = var28;
                                             }

                                             if(var6 != null) {
                                                break label511;
                                             }
                                          }
                                       }

                                       var24 = 0;
                                    }
                                 }

                                 var8 = var24;
                              }

                              ++var12;
                              if(var6 == null) {
                                 break label516;
                              }
                           }
                        }

                        ++var11;
                     } while(var6 != null);

                     ++var9;
                     if(var6 != null) {
                        continue label525;
                     }
                     break;
                  }

                  var24 = var8;
                  break;
               }

               if(var6 != null) {
                  if(var24 != 0) {
                     label462: {
                        aji var21 = var1.getBlock(var3, var4 - 1, var5);
                        aji var29 = var21;
                        Object var27 = class_1192.field_6027;
                        if(var6 != null) {
                           if(var21 == class_1192.field_6027) {
                              break label462;
                           }

                           var29 = var21;
                           var27 = class_1192.field_6028;
                        }

                        if(var29 != var27) {
                           return false;
                        }
                     }

                     var24 = var4;
                     if(var6 != null) {
                        if(var4 >= 256 - var7 - 1) {
                           return false;
                        }

                        this.method_6353(var1, var3, var4 - 1, var5, class_1192.field_6028);
                        this.method_6353(var1, var3 + 1, var4 - 1, var5, class_1192.field_6028);
                        this.method_6353(var1, var3 + 1, var4 - 1, var5 + 1, class_1192.field_6028);
                        this.method_6353(var1, var3, var4 - 1, var5 + 1, class_1192.field_6028);
                        var24 = var2.nextInt(4);
                     }

                     int var22 = var24;
                     var11 = var7 - var2.nextInt(4);
                     var12 = 2 - var2.nextInt(3);
                     int var23 = var3;
                     int var14 = var5;
                     int var15 = 0;
                     int var16 = 0;

                     int var17;
                     int var26;
                     byte var31;
                     label544: {
                        label445:
                        while(true) {
                           if(var16 < var7) {
                              label546: {
                                 var17 = var4 + var16;
                                 var24 = var16;
                                 if(var6 != null) {
                                    var10001 = var11;
                                    if(var6 == null) {
                                       break;
                                    }

                                    if(var16 < var11) {
                                       break label546;
                                    }

                                    var24 = var12;
                                 }

                                 if(var6 != null) {
                                    if(var24 <= 0) {
                                       break label546;
                                    }

                                    var23 += class_1649.field_8587[var22];
                                    var24 = var14 + class_1649.field_8588[var22];
                                 }

                                 var14 = var24;
                                 --var12;
                              }

                              label384: {
                                 aji var18 = var1.getBlock(var23, var17, var14);
                                 if(var6 != null) {
                                    if(var18.method_2424() != awt.field_4170 && var18.method_2424() != awt.field_4179) {
                                       break label384;
                                    }

                                    this.method_6354(var1, var23, var17, var14, class_1192.field_6043, 1);
                                    this.method_6354(var1, var23 + 1, var17, var14, class_1192.field_6043, 1);
                                    this.method_6354(var1, var23, var17, var14 + 1, class_1192.field_6043, 1);
                                    this.method_6354(var1, var23 + 1, var17, var14 + 1, class_1192.field_6043, 1);
                                 }

                                 var15 = var17;
                              }

                              ++var16;
                              if(var6 != null) {
                                 continue;
                              }

                              var16 = -2;
                           } else {
                              var16 = -2;
                           }

                           while(true) {
                              if(var16 <= 0) {
                                 var31 = -2;
                                 if(var6 != null) {
                                    var17 = -2;

                                    while(var17 <= 0) {
                                       byte var25 = -1;
                                       this.method_6369(var1, var23 + var16, var15 + var25, var14 + var17);
                                       this.method_6369(var1, 1 + var23 - var16, var15 + var25, var14 + var17);
                                       this.method_6369(var1, var23 + var16, var15 + var25, 1 + var14 - var17);
                                       this.method_6369(var1, 1 + var23 - var16, var15 + var25, 1 + var14 - var17);
                                       var24 = var16;
                                       var10001 = -2;
                                       if(var6 == null) {
                                          break label445;
                                       }

                                       label374: {
                                          label551: {
                                             if(var6 != null) {
                                                label552: {
                                                   if(var16 <= -2) {
                                                      var24 = var17;
                                                      var10001 = -1;
                                                      if(var6 == null) {
                                                         break label552;
                                                      }

                                                      if(var17 <= -1) {
                                                         break label374;
                                                      }
                                                   }

                                                   var24 = var16;
                                                   if(var6 == null) {
                                                      break label551;
                                                   }

                                                   var10001 = -1;
                                                }
                                             }

                                             if(var24 == var10001) {
                                                var24 = var17;
                                                if(var6 == null) {
                                                   break label551;
                                                }

                                                if(var17 == -2 && var6 != null) {
                                                   break label374;
                                                }
                                             }

                                             var24 = 1;
                                          }

                                          var26 = var24;
                                          this.method_6369(var1, var23 + var16, var15 + var26, var14 + var17);
                                          this.method_6369(var1, 1 + var23 - var16, var15 + var26, var14 + var17);
                                          this.method_6369(var1, var23 + var16, var15 + var26, 1 + var14 - var17);
                                          this.method_6369(var1, 1 + var23 - var16, var15 + var26, 1 + var14 - var17);
                                       }

                                       ++var17;
                                       if(var6 == null) {
                                          break;
                                       }
                                    }

                                    ++var16;
                                    if(var6 != null) {
                                       continue;
                                    }

                                    var31 = var2.nextBoolean();
                                 }
                              } else {
                                 var31 = var2.nextBoolean();
                              }

                              if(var6 != null) {
                                 if(var31 != 0) {
                                    this.method_6369(var1, var23, var15 + 2, var14);
                                    this.method_6369(var1, var23 + 1, var15 + 2, var14);
                                    this.method_6369(var1, var23 + 1, var15 + 2, var14 + 1);
                                    this.method_6369(var1, var23, var15 + 2, var14 + 1);
                                 }

                                 var31 = -3;
                              }

                              var16 = var31;
                              var24 = var16;
                              var10001 = 4;
                              break label445;
                           }
                        }

                        label415:
                        while(true) {
                           label406:
                           while(true) {
                              if(var24 > var10001) {
                                 break label415;
                              }

                              var31 = -3;
                              if(var6 == null) {
                                 break label544;
                              }

                              var17 = -3;

                              while(var17 <= 4) {
                                 var24 = var16;
                                 var10001 = -3;
                                 if(var6 == null) {
                                    continue label406;
                                 }

                                 label555: {
                                    if(var6 != null) {
                                       label352: {
                                          if(var16 == -3) {
                                             var24 = var17;
                                             var10001 = -3;
                                             if(var6 == null) {
                                                break label352;
                                             }

                                             if(var17 == -3) {
                                                break label555;
                                             }
                                          }

                                          var24 = var16;
                                          var10001 = -3;
                                       }
                                    }

                                    if(var6 != null) {
                                       label343: {
                                          if(var24 == var10001) {
                                             var24 = var17;
                                             var10001 = 4;
                                             if(var6 == null) {
                                                break label343;
                                             }

                                             if(var17 == 4) {
                                                break label555;
                                             }
                                          }

                                          var24 = var16;
                                          var10001 = 4;
                                       }
                                    }

                                    if(var6 != null) {
                                       label334: {
                                          if(var24 == var10001) {
                                             var24 = var17;
                                             var10001 = -3;
                                             if(var6 == null) {
                                                break label334;
                                             }

                                             if(var17 == -3) {
                                                break label555;
                                             }
                                          }

                                          var24 = var16;
                                          var10001 = 4;
                                       }
                                    }

                                    if(var6 != null) {
                                       label325: {
                                          if(var24 == var10001) {
                                             var24 = var17;
                                             var10001 = 4;
                                             if(var6 == null) {
                                                break label325;
                                             }

                                             if(var17 == 4 && var6 != null) {
                                                break label555;
                                             }
                                          }

                                          var24 = Math.abs(var16);
                                          var10001 = 3;
                                       }
                                    }

                                    label316: {
                                       if(var6 != null) {
                                          if(var24 < var10001) {
                                             break label316;
                                          }

                                          var24 = Math.abs(var17);
                                          var10001 = 3;
                                       }

                                       if(var24 >= var10001 && var6 != null) {
                                          break label555;
                                       }
                                    }

                                    this.method_6369(var1, var23 + var16, var15, var14 + var17);
                                 }

                                 ++var17;
                                 if(var6 == null) {
                                    break;
                                 }
                              }

                              ++var16;
                              if(var6 == null) {
                                 break label415;
                              }

                              var24 = var16;
                              var10001 = 4;
                           }
                        }

                        var31 = -1;
                     }

                     var16 = var31;

                     label306:
                     while(true) {
                        var24 = var16;

                        boolean var32;
                        label303:
                        while(var24 <= 2) {
                           var32 = true;
                           if(var6 == null) {
                              return var32;
                           }

                           var17 = -1;

                           label300:
                           do {
                              var24 = var17;

                              label297:
                              while(true) {
                                 if(var24 > 2) {
                                    break label300;
                                 }

                                 var24 = var16;
                                 if(var6 == null) {
                                    continue label303;
                                 }

                                 if(var6 != null) {
                                    label293: {
                                       if(var16 >= 0) {
                                          var24 = var16;
                                          if(var6 == null) {
                                             break label293;
                                          }

                                          if(var16 <= 1) {
                                             var24 = var17;
                                             if(var6 == null) {
                                                break label293;
                                             }

                                             if(var17 >= 0) {
                                                var24 = var17;
                                                if(var6 == null) {
                                                   break label293;
                                                }

                                                if(var17 <= 1 && var6 != null) {
                                                   break;
                                                }
                                             }
                                          }
                                       }

                                       var24 = var2.nextInt(3);
                                    }
                                 }

                                 if(var6 != null) {
                                    if(var24 > 0 && var6 != null) {
                                       break;
                                    }

                                    var24 = var2.nextInt(3) + 2;
                                 }

                                 var26 = var24;
                                 int var19 = 0;

                                 while(true) {
                                    if(var19 < var26) {
                                       this.method_6354(var1, var3 + var16, var15 - var19 - 1, var5 + var17, class_1192.field_6043, 1);
                                       ++var19;
                                       if(var6 == null) {
                                          break;
                                       }

                                       if(var6 != null) {
                                          continue;
                                       }
                                    }

                                    var19 = -1;
                                    break;
                                 }

                                 int var20;
                                 while(true) {
                                    if(var19 <= 1) {
                                       var31 = -1;
                                       if(var6 == null) {
                                          break;
                                       }

                                       var20 = -1;

                                       while(true) {
                                          if(var20 <= 1) {
                                             this.method_6369(var1, var23 + var16 + var19, var15 - 0, var14 + var17 + var20);
                                             ++var20;
                                             if(var6 == null) {
                                                break;
                                             }

                                             if(var6 != null) {
                                                continue;
                                             }
                                          }

                                          ++var19;
                                          break;
                                       }

                                       if(var6 != null) {
                                          continue;
                                       }
                                    }

                                    var31 = -2;
                                    break;
                                 }

                                 var19 = var31;

                                 while(true) {
                                    var24 = var19;
                                    byte var30 = 2;

                                    label253:
                                    while(true) {
                                       if(var24 > var30) {
                                          break label297;
                                       }

                                       var24 = -2;
                                       if(var6 == null) {
                                          continue label297;
                                       }

                                       var20 = -2;

                                       while(var20 <= 2) {
                                          var24 = Math.abs(var19);
                                          var30 = 2;
                                          if(var6 == null) {
                                             continue label253;
                                          }

                                          label241: {
                                             label240: {
                                                if(var6 != null) {
                                                   if(var24 != 2) {
                                                      break label240;
                                                   }

                                                   var24 = Math.abs(var20);
                                                   var30 = 2;
                                                }

                                                if(var24 == var30 && var6 != null) {
                                                   break label241;
                                                }
                                             }

                                             this.method_6369(var1, var23 + var16 + var19, var15 - 1, var14 + var17 + var20);
                                          }

                                          ++var20;
                                          if(var6 == null) {
                                             break;
                                          }
                                       }

                                       ++var19;
                                       if(var6 == null) {
                                          break label297;
                                       }
                                       break;
                                    }
                                 }
                              }

                              ++var17;
                           } while(var6 != null);

                           ++var16;
                           if(var6 != null) {
                              continue label306;
                           }
                           break;
                        }

                        var32 = true;
                        return var32;
                     }
                  }

                  var24 = 0;
               }

               return (boolean)var24;
            }
         }

         var24 = 0;
      }

      return (boolean)var24;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   private void method_6369(ahb var1, int var2, int var3, int var4) {
      aji var5 = var1.getBlock(var2, var3, var4);
      if(var5.method_2424() == awt.field_4170) {
         this.method_6354(var1, var2, var3, var4, class_1192.field_6045, 1);
      }

   }
}
