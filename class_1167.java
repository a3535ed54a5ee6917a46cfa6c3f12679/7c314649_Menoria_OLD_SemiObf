import java.util.Random;

// $FF: renamed from: hl
public class class_1167 extends class_1162 {

   // $FF: renamed from: <init> (boolean) void
   public void method_6350(boolean var1) {
      super.method_6350(var1);
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      int var7 = var2.nextInt(3) + var2.nextInt(3) + 5;
      String[] var10000 = class_752.method_4253();
      int var8 = 1;
      String[] var6 = var10000;
      int var25 = var4;
      if(var6 != null) {
         if(var4 >= 1) {
            label412: {
               var25 = var4 + var7 + 1;
               if(var6 != null) {
                  if(var25 > 256) {
                     break label412;
                  }

                  var25 = var4;
               }

               int var9 = var25;

               int var11;
               int var12;
               int var10001;
               label400:
               while(true) {
                  var25 = var9;

                  label397:
                  while(var25 <= var4 + 1 + var7) {
                     byte var10 = 1;
                     var25 = var9;
                     if(var6 == null) {
                        break label400;
                     }

                     var10001 = var4;
                     if(var6 != null) {
                        if(var9 == var4) {
                           var10 = 0;
                        }

                        var25 = var9;
                        var10001 = var4 + 1 + var7 - 2;
                     }

                     if(var6 != null) {
                        if(var25 >= var10001) {
                           var10 = 2;
                        }

                        var25 = var3;
                        var10001 = var10;
                     }

                     var11 = var25 - var10001;

                     label394:
                     do {
                        var25 = var11;

                        label391:
                        while(true) {
                           if(var25 > var3 + var10) {
                              break label394;
                           }

                           var25 = var8;
                           if(var6 == null) {
                              continue label397;
                           }

                           if(var6 != null) {
                              if(var8 == 0) {
                                 break label394;
                              }

                              var25 = var5 - var10;
                           }

                           var12 = var25;

                           while(true) {
                              if(var12 > var5 + var10) {
                                 break label391;
                              }

                              var25 = var8;
                              if(var6 == null) {
                                 break;
                              }

                              if(var6 != null) {
                                 if(var8 == 0) {
                                    break label391;
                                 }

                                 var25 = var9;
                              }

                              label386: {
                                 if(var6 != null) {
                                    label384: {
                                       if(var25 >= 0) {
                                          var25 = var9;
                                          if(var6 == null) {
                                             break label384;
                                          }

                                          if(var9 < 256) {
                                             label374: {
                                                aji var13 = var1.getBlock(var11, var9, var12);
                                                byte var29 = this.method_6362(var13);
                                                if(var6 != null) {
                                                   if(var29 != 0) {
                                                      break label374;
                                                   }

                                                   var29 = 0;
                                                }

                                                var8 = var29;
                                             }

                                             if(var6 != null) {
                                                break label386;
                                             }
                                          }
                                       }

                                       var25 = 0;
                                    }
                                 }

                                 var8 = var25;
                              }

                              ++var12;
                              if(var6 == null) {
                                 break label391;
                              }
                           }
                        }

                        ++var11;
                     } while(var6 != null);

                     ++var9;
                     if(var6 != null) {
                        continue label400;
                     }
                     break;
                  }

                  var25 = var8;
                  break;
               }

               if(var6 != null) {
                  if(var25 != 0) {
                     label337: {
                        aji var22 = var1.getBlock(var3, var4 - 1, var5);
                        aji var30 = var22;
                        Object var27 = class_1192.field_6027;
                        if(var6 != null) {
                           if(var22 == class_1192.field_6027) {
                              break label337;
                           }

                           var30 = var22;
                           var27 = class_1192.field_6028;
                        }

                        if(var30 != var27) {
                           return false;
                        }
                     }

                     var25 = var4;
                     if(var6 != null) {
                        if(var4 >= 256 - var7 - 1) {
                           return false;
                        }

                        this.method_6353(var1, var3, var4 - 1, var5, class_1192.field_6028);
                        var25 = var2.nextInt(4);
                     }

                     int var23 = var25;
                     var11 = var7 - var2.nextInt(4) - 1;
                     var12 = 3 - var2.nextInt(3);
                     int var24 = var3;
                     int var14 = var5;
                     int var15 = 0;
                     int var16 = 0;

                     int var17;
                     byte var31;
                     label419: {
                        while(true) {
                           if(var16 < var7) {
                              label421: {
                                 var17 = var4 + var16;
                                 var25 = var16;
                                 if(var6 != null) {
                                    var10001 = var11;
                                    if(var6 == null) {
                                       break;
                                    }

                                    if(var16 < var11) {
                                       break label421;
                                    }

                                    var25 = var12;
                                 }

                                 if(var6 != null) {
                                    if(var25 <= 0) {
                                       break label421;
                                    }

                                    var24 += class_1649.field_8587[var23];
                                    var25 = var14 + class_1649.field_8588[var23];
                                 }

                                 var14 = var25;
                                 --var12;
                              }

                              label290: {
                                 aji var18 = var1.getBlock(var24, var17, var14);
                                 if(var6 != null) {
                                    if(var18.method_2424() != awt.field_4170 && var18.method_2424() != awt.field_4179) {
                                       break label290;
                                    }

                                    this.method_6354(var1, var24, var17, var14, class_1192.field_6043, 0);
                                 }

                                 var15 = var17;
                              }

                              ++var16;
                              if(var6 != null) {
                                 continue;
                              }

                              var16 = -1;
                           } else {
                              var16 = -1;
                           }

                           var25 = var16;
                           var10001 = 1;
                           break;
                        }

                        while(var25 <= var10001) {
                           var31 = -1;
                           if(var6 == null) {
                              break label419;
                           }

                           var17 = -1;

                           while(true) {
                              if(var17 <= 1) {
                                 this.method_6368(var1, var24 + var16, var15 + 1, var14 + var17);
                                 ++var17;
                                 if(var6 == null) {
                                    break;
                                 }

                                 if(var6 != null) {
                                    continue;
                                 }
                              }

                              ++var16;
                              break;
                           }

                           if(var6 == null) {
                              break;
                           }

                           var25 = var16;
                           var10001 = 1;
                        }

                        this.method_6368(var1, var24 + 2, var15 + 1, var14);
                        this.method_6368(var1, var24 - 2, var15 + 1, var14);
                        this.method_6368(var1, var24, var15 + 1, var14 + 2);
                        this.method_6368(var1, var24, var15 + 1, var14 - 2);
                        var31 = -3;
                     }

                     var16 = var31;

                     byte var28;
                     label270:
                     while(true) {
                        var25 = var16;
                        var28 = 3;

                        label267:
                        while(var25 <= var28) {
                           var25 = -3;
                           if(var6 == null) {
                              break label270;
                           }

                           var17 = -3;

                           while(var17 <= 3) {
                              var25 = Math.abs(var16);
                              var28 = 3;
                              if(var6 == null) {
                                 continue label267;
                              }

                              label261: {
                                 label260: {
                                    if(var6 != null) {
                                       if(var25 != 3) {
                                          break label260;
                                       }

                                       var25 = Math.abs(var17);
                                       var28 = 3;
                                    }

                                    if(var25 == var28 && var6 != null) {
                                       break label261;
                                    }
                                 }

                                 this.method_6368(var1, var24 + var16, var15, var14 + var17);
                              }

                              ++var17;
                              if(var6 == null) {
                                 break;
                              }
                           }

                           ++var16;
                           if(var6 != null) {
                              continue label270;
                           }
                           break;
                        }

                        var24 = var3;
                        var14 = var5;
                        var16 = var2.nextInt(4);
                        var25 = var16;
                        break;
                     }

                     if(var6 != null) {
                        if(var25 != var23) {
                           var17 = var11 - var2.nextInt(2) - 1;
                           int var26 = 1 + var2.nextInt(3);
                           var15 = 0;
                           int var19 = var17;

                           int var20;
                           while(true) {
                              if(var19 < var7) {
                                 var25 = var26;
                                 if(var6 == null || var6 == null) {
                                    break;
                                 }

                                 if(var26 > 0) {
                                    label429: {
                                       var25 = var19;
                                       var10001 = 1;
                                       if(var6 != null) {
                                          if(var19 < 1 && var6 != null) {
                                             break label429;
                                          }

                                          var25 = var4;
                                          var10001 = var19;
                                       }

                                       var20 = var25 + var10001;
                                       var24 += class_1649.field_8587[var16];
                                       var14 += class_1649.field_8588[var16];
                                       aji var21 = var1.getBlock(var24, var20, var14);
                                       if(var6 != null) {
                                          if(var21.method_2424() != awt.field_4170 && var21.method_2424() != awt.field_4179) {
                                             break label429;
                                          }

                                          this.method_6354(var1, var24, var20, var14, class_1192.field_6043, 0);
                                       }

                                       var15 = var20;
                                    }

                                    ++var19;
                                    --var26;
                                    if(var6 != null) {
                                       continue;
                                    }
                                 }
                              }

                              var25 = var15;
                              break;
                           }

                           if(var6 == null) {
                              return (boolean)var25;
                           }

                           if(var25 > 0) {
                              var19 = -1;

                              while(true) {
                                 if(var19 <= 1) {
                                    var31 = -1;
                                    if(var6 == null) {
                                       break;
                                    }

                                    var20 = -1;

                                    while(true) {
                                       if(var20 <= 1) {
                                          this.method_6368(var1, var24 + var19, var15 + 1, var14 + var20);
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

                              label233:
                              do {
                                 var25 = var19;
                                 var28 = 2;

                                 label230:
                                 while(true) {
                                    if(var25 > var28) {
                                       break label233;
                                    }

                                    var25 = -2;
                                    if(var6 == null) {
                                       return (boolean)var25;
                                    }

                                    var20 = -2;

                                    while(true) {
                                       if(var20 > 2) {
                                          break label230;
                                       }

                                       var25 = Math.abs(var19);
                                       var28 = 2;
                                       if(var6 == null) {
                                          break;
                                       }

                                       label169: {
                                          label168: {
                                             if(var6 != null) {
                                                if(var25 != 2) {
                                                   break label168;
                                                }

                                                var25 = Math.abs(var20);
                                                var28 = 2;
                                             }

                                             if(var25 == var28 && var6 != null) {
                                                break label169;
                                             }
                                          }

                                          this.method_6368(var1, var24 + var19, var15, var14 + var20);
                                       }

                                       ++var20;
                                       if(var6 == null) {
                                          break label230;
                                       }
                                    }
                                 }

                                 ++var19;
                              } while(var6 != null);
                           }
                        }

                        var25 = 1;
                     }

                     return (boolean)var25;
                  }

                  var25 = 0;
               }

               return (boolean)var25;
            }
         }

         var25 = 0;
      }

      return (boolean)var25;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   private void method_6368(ahb var1, int var2, int var3, int var4) {
      label16: {
         String[] var10000 = class_752.method_4253();
         aji var6 = var1.getBlock(var2, var3, var4);
         String[] var5 = var10000;
         awt var7 = var6.method_2424();
         awt var10001 = awt.field_4170;
         if(var5 != null) {
            if(var7 == awt.field_4170) {
               break label16;
            }

            var7 = var6.method_2424();
            var10001 = awt.field_4179;
         }

         if(var7 != var10001) {
            return;
         }
      }

      this.method_6354(var1, var2, var3, var4, class_1192.field_6045, 0);
   }
}
