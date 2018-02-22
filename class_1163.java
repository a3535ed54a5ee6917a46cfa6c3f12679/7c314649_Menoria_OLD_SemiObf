import java.util.Random;

// $FF: renamed from: ho
public class class_1163 extends class_1162 {

   // $FF: renamed from: c int
   private final int field_5978;
   // $FF: renamed from: d boolean
   private final boolean field_5979;
   // $FF: renamed from: e int
   private final int field_5980;
   // $FF: renamed from: f int
   private final int field_5981;


   // $FF: renamed from: <init> (boolean) void
   public void method_6350(boolean var1) {
      this.method_6364(var1, 4, 0, 0, false);
   }

   // $FF: renamed from: <init> (boolean, int, int, int, boolean) void
   public void method_6364(boolean var1, int var2, int var3, int var4, boolean var5) {
      super.method_6350(var1);
      this.field_5978 = var2;
      this.field_5980 = var3;
      this.field_5981 = var4;
      this.field_5979 = var5;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      int var7 = var2.nextInt(3) + this.field_5978;
      String[] var10000 = class_752.method_4253();
      int var8 = 1;
      String[] var6 = var10000;
      int var24 = var4;
      if(var6 != null) {
         if(var4 >= 1) {
            label492: {
               var24 = var4 + var7 + 1;
               if(var6 != null) {
                  if(var24 > 256) {
                     break label492;
                  }

                  var24 = var4;
               }

               int var9 = var24;

               int var12;
               aji var13;
               int var10001;
               label480:
               while(true) {
                  var24 = var9;

                  label477:
                  while(var24 <= var4 + 1 + var7) {
                     byte var10 = 1;
                     var24 = var9;
                     if(var6 == null) {
                        break label480;
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

                     int var11 = var24 - var10001;

                     label474:
                     do {
                        var24 = var11;

                        label471:
                        while(true) {
                           if(var24 > var3 + var10) {
                              break label474;
                           }

                           var24 = var8;
                           if(var6 == null) {
                              continue label477;
                           }

                           if(var6 != null) {
                              if(var8 == 0) {
                                 break label474;
                              }

                              var24 = var5 - var10;
                           }

                           var12 = var24;

                           while(true) {
                              if(var12 > var5 + var10) {
                                 break label471;
                              }

                              var24 = var8;
                              if(var6 == null) {
                                 break;
                              }

                              if(var6 != null) {
                                 if(var8 == 0) {
                                    break label471;
                                 }

                                 var24 = var9;
                              }

                              label466: {
                                 if(var6 != null) {
                                    label464: {
                                       if(var24 >= 0) {
                                          var24 = var9;
                                          if(var6 == null) {
                                             break label464;
                                          }

                                          if(var9 < 256) {
                                             label454: {
                                                var13 = var1.getBlock(var11, var9, var12);
                                                byte var27 = this.method_6362(var13);
                                                if(var6 != null) {
                                                   if(var27 != 0) {
                                                      break label454;
                                                   }

                                                   var27 = 0;
                                                }

                                                var8 = var27;
                                             }

                                             if(var6 != null) {
                                                break label466;
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
                                 break label471;
                              }
                           }
                        }

                        ++var11;
                     } while(var6 != null);

                     ++var9;
                     if(var6 != null) {
                        continue label480;
                     }
                     break;
                  }

                  var24 = var8;
                  break;
               }

               if(var6 != null) {
                  if(var24 != 0) {
                     label499: {
                        aji var20 = var1.getBlock(var3, var4 - 1, var5);
                        aji var28 = var20;
                        Object var25 = class_1192.field_6027;
                        if(var6 != null) {
                           if(var20 == class_1192.field_6027) {
                              break label499;
                           }

                           var28 = var20;
                           var25 = class_1192.field_6028;
                        }

                        if(var6 != null) {
                           if(var28 == var25) {
                              break label499;
                           }

                           var28 = var20;
                           var25 = class_1192.field_6087;
                        }

                        if(var28 != var25) {
                           return false;
                        }
                     }

                     var24 = var4;
                     if(var6 != null) {
                        if(var4 >= 256 - var7 - 1) {
                           return false;
                        }

                        this.method_6353(var1, var3, var4 - 1, var5, class_1192.field_6028);
                        var24 = 3;
                     }

                     int var21 = var24;
                     byte var22 = 0;
                     var12 = var4 - var21 + var7;

                     int var14;
                     int var15;
                     int var16;
                     int var23;
                     label397:
                     while(true) {
                        var24 = var12;

                        label394:
                        while(var24 <= var4 + var7) {
                           var23 = var12 - (var4 + var7);
                           var14 = var22 + 1 - var23 / 2;
                           var24 = var3 - var14;
                           if(var6 == null) {
                              break label397;
                           }

                           var15 = var24;

                           label391:
                           do {
                              var24 = var15;
                              var10001 = var3 + var14;

                              label388:
                              while(true) {
                                 if(var24 > var10001) {
                                    break label391;
                                 }

                                 var16 = var15 - var3;
                                 var24 = var5 - var14;
                                 if(var6 == null) {
                                    continue label394;
                                 }

                                 int var17 = var24;

                                 while(true) {
                                    if(var17 > var5 + var14) {
                                       break label388;
                                    }

                                    int var18 = var17 - var5;
                                    var24 = Math.abs(var16);
                                    var10001 = var14;
                                    if(var6 == null) {
                                       break;
                                    }

                                    label505: {
                                       label506: {
                                          label507: {
                                             if(var6 != null) {
                                                if(var24 != var14) {
                                                   break label506;
                                                }

                                                var24 = Math.abs(var18);
                                                if(var6 == null) {
                                                   break label507;
                                                }

                                                var10001 = var14;
                                             }

                                             if(var24 != var10001) {
                                                break label506;
                                             }

                                             var24 = var2.nextInt(2);
                                          }

                                          if(var6 != null) {
                                             if(var24 == 0) {
                                                break label505;
                                             }

                                             var24 = var23;
                                          }

                                          if(var24 == 0) {
                                             break label505;
                                          }
                                       }

                                       label364: {
                                          aji var19 = var1.getBlock(var15, var12, var17);
                                          awt var29 = var19.method_2424();
                                          awt var26 = awt.field_4170;
                                          if(var6 != null) {
                                             if(var29 == awt.field_4170) {
                                                break label364;
                                             }

                                             var29 = var19.method_2424();
                                             var26 = awt.field_4179;
                                          }

                                          if(var29 != var26) {
                                             break label505;
                                          }
                                       }

                                       this.method_6354(var1, var15, var12, var17, class_1192.field_6044, this.field_5981);
                                    }

                                    ++var17;
                                    if(var6 == null) {
                                       break label388;
                                    }
                                 }
                              }

                              ++var15;
                           } while(var6 != null);

                           ++var12;
                           if(var6 != null) {
                              continue label397;
                           }
                           break;
                        }

                        var24 = 0;
                        break;
                     }

                     var12 = var24;

                     label335:
                     while(true) {
                        if(var12 < var7) {
                           var13 = var1.getBlock(var3, var4 + var12, var5);
                           if(var6 == null) {
                              break;
                           }

                           label328: {
                              label511: {
                                 if(var6 != null) {
                                    if(var13.method_2424() != awt.field_4170 && var13.method_2424() != awt.field_4179) {
                                       break label511;
                                    }

                                    this.method_6354(var1, var3, var4 + var12, var5, class_1192.field_6042, this.field_5980);
                                 }

                                 if(var6 == null) {
                                    break label328;
                                 }

                                 if(this.field_5979) {
                                    label512: {
                                       var24 = var12;
                                       if(var6 != null) {
                                          if(var12 <= 0) {
                                             break label512;
                                          }

                                          var24 = var2.nextInt(3);
                                       }

                                       if(var6 != null) {
                                          label310: {
                                             if(var24 > 0) {
                                                var24 = var1.method_34(var3 - 1, var4 + var12, var5);
                                                if(var6 == null) {
                                                   break label310;
                                                }

                                                if(var24 != 0) {
                                                   this.method_6354(var1, var3 - 1, var4 + var12, var5, class_1192.field_6131, 8);
                                                }
                                             }

                                             var24 = var2.nextInt(3);
                                          }
                                       }

                                       if(var6 != null) {
                                          label303: {
                                             if(var24 > 0) {
                                                var24 = var1.method_34(var3 + 1, var4 + var12, var5);
                                                if(var6 == null) {
                                                   break label303;
                                                }

                                                if(var24 != 0) {
                                                   this.method_6354(var1, var3 + 1, var4 + var12, var5, class_1192.field_6131, 2);
                                                }
                                             }

                                             var24 = var2.nextInt(3);
                                          }
                                       }

                                       if(var6 != null) {
                                          label296: {
                                             if(var24 > 0) {
                                                var24 = var1.method_34(var3, var4 + var12, var5 - 1);
                                                if(var6 == null) {
                                                   break label296;
                                                }

                                                if(var24 != 0) {
                                                   this.method_6354(var1, var3, var4 + var12, var5 - 1, class_1192.field_6131, 1);
                                                }
                                             }

                                             var24 = var2.nextInt(3);
                                          }
                                       }

                                       if(var6 != null) {
                                          if(var24 <= 0) {
                                             break label512;
                                          }

                                          var24 = var1.method_34(var3, var4 + var12, var5 + 1);
                                       }

                                       if(var24 != 0) {
                                          this.method_6354(var1, var3, var4 + var12, var5 + 1, class_1192.field_6131, 4);
                                       }
                                    }
                                 }
                              }

                              ++var12;
                           }

                           if(var6 != null) {
                              continue;
                           }
                        }

                        var24 = this.field_5979;
                        if(var6 == null) {
                           return (boolean)var24;
                        }

                        if(this.field_5979) {
                           var12 = var4 - 3 + var7;

                           label253:
                           while(true) {
                              var24 = var12;

                              label250:
                              while(var24 <= var4 + var7) {
                                 var23 = var12 - (var4 + var7);
                                 var14 = 2 - var23 / 2;
                                 var24 = var3 - var14;
                                 if(var6 == null) {
                                    break label253;
                                 }

                                 var15 = var24;

                                 while(var15 <= var3 + var14) {
                                    var24 = var5 - var14;
                                    if(var6 == null) {
                                       continue label250;
                                    }

                                    var16 = var24;

                                    while(true) {
                                       if(var16 <= var5 + var14) {
                                          if(var6 == null) {
                                             break;
                                          }

                                          if(var1.getBlock(var15, var12, var16).method_2424() == awt.field_4179) {
                                             var24 = var2.nextInt(4);
                                             if(var6 != null) {
                                                if(var24 == 0 && var1.getBlock(var15 - 1, var12, var16).method_2424() == awt.field_4170) {
                                                   this.method_6365(var1, var15 - 1, var12, var16, 8);
                                                }

                                                var24 = var2.nextInt(4);
                                             }

                                             if(var6 != null) {
                                                if(var24 == 0 && var1.getBlock(var15 + 1, var12, var16).method_2424() == awt.field_4170) {
                                                   this.method_6365(var1, var15 + 1, var12, var16, 2);
                                                }

                                                var24 = var2.nextInt(4);
                                             }

                                             if(var6 != null) {
                                                if(var24 == 0 && var1.getBlock(var15, var12, var16 - 1).method_2424() == awt.field_4170) {
                                                   this.method_6365(var1, var15, var12, var16 - 1, 1);
                                                }

                                                var24 = var2.nextInt(4);
                                             }

                                             if(var24 == 0 && var1.getBlock(var15, var12, var16 + 1).method_2424() == awt.field_4170) {
                                                this.method_6365(var1, var15, var12, var16 + 1, 4);
                                             }
                                          }

                                          ++var16;
                                          if(var6 != null) {
                                             continue;
                                          }
                                       }

                                       ++var15;
                                       break;
                                    }

                                    if(var6 == null) {
                                       break;
                                    }
                                 }

                                 ++var12;
                                 if(var6 != null) {
                                    continue label253;
                                 }
                                 break;
                              }

                              var24 = var2.nextInt(5);
                              break;
                           }

                           if(var6 == null) {
                              return (boolean)var24;
                           }

                           if(var24 == 0) {
                              var24 = var7;
                              if(var6 == null) {
                                 return (boolean)var24;
                              }

                              if(var7 > 5) {
                                 var12 = 0;

                                 do {
                                    var24 = var12;

                                    label276:
                                    while(true) {
                                       if(var24 >= 2) {
                                          break label335;
                                       }

                                       var24 = 0;
                                       if(var6 == null) {
                                          return (boolean)var24;
                                       }

                                       var23 = 0;

                                       while(true) {
                                          if(var23 >= 4) {
                                             break label276;
                                          }

                                          var24 = var2.nextInt(4 - var12);
                                          if(var6 == null) {
                                             break;
                                          }

                                          label223: {
                                             if(var6 != null) {
                                                if(var24 != 0) {
                                                   break label223;
                                                }

                                                var24 = var2.nextInt(3);
                                             }

                                             var14 = var24;
                                             this.method_6354(var1, var3 + class_1649.field_8587[class_1649.field_8592[var23]], var4 + var7 - 5 + var12, var5 + class_1649.field_8588[class_1649.field_8592[var23]], class_1192.field_6151, var14 << 2 | var23);
                                          }

                                          ++var23;
                                          if(var6 == null) {
                                             break label276;
                                          }
                                       }
                                    }

                                    ++var12;
                                 } while(var6 != null);
                              }
                           }
                        }
                        break;
                     }

                     var24 = 1;
                     return (boolean)var24;
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

   // $FF: renamed from: b (ahb, int, int, int, int) void
   private void method_6365(ahb var1, int var2, int var3, int var4, int var5) {
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
