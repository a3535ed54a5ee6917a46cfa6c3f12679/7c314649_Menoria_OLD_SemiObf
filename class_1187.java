import java.util.Random;

// $FF: renamed from: hE
public class class_1187 extends class_1151 {

   // $FF: renamed from: c aji
   private aji field_6019;


   // $FF: renamed from: <init> (aji) void
   public void method_6406(aji var1) {
      super.method_6349();
      this.field_6019 = var1;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      var3 -= 8;
      String[] var6 = class_752.method_4253();
      var5 -= 8;

      int var10000;
      while(true) {
         if(var4 > 5) {
            var10000 = var1.method_34(var3, var4, var5);
            if(var6 == null || var6 == null) {
               break;
            }

            if(var10000 != 0) {
               --var4;
               if(var6 != null) {
                  continue;
               }
            }
         }

         var10000 = var4;
         break;
      }

      if(var6 != null) {
         if(var10000 <= 4) {
            return false;
         }

         var4 -= 4;
         var10000 = 2048;
      }

      boolean[] var7 = new boolean[var10000];
      int var8 = var2.nextInt(4) + 4;
      int var9 = 0;

      byte var37;
      label621:
      while(true) {
         var10000 = var9;

         label618:
         while(var10000 < var8) {
            double var10 = var2.nextDouble() * 6.0D + 3.0D;
            double var12 = var2.nextDouble() * 4.0D + 2.0D;
            double var14 = var2.nextDouble() * 6.0D + 3.0D;
            double var16 = var2.nextDouble() * (16.0D - var10 - 2.0D) + 1.0D + var10 / 2.0D;
            double var18 = var2.nextDouble() * (8.0D - var12 - 4.0D) + 2.0D + var12 / 2.0D;
            double var20 = var2.nextDouble() * (16.0D - var14 - 2.0D) + 1.0D + var14 / 2.0D;
            var37 = 1;
            if(var6 == null) {
               break label621;
            }

            int var22 = 1;

            label615:
            do {
               var10000 = var22;

               label612:
               while(true) {
                  if(var10000 >= 15) {
                     break label615;
                  }

                  var10000 = 1;
                  if(var6 == null) {
                     continue label618;
                  }

                  int var23 = 1;

                  while(true) {
                     var10000 = var23;

                     label608:
                     while(true) {
                        if(var10000 >= 15) {
                           break label612;
                        }

                        var10000 = 1;
                        if(var6 == null) {
                           continue label612;
                        }

                        int var24 = 1;

                        while(var24 < 7) {
                           double var25 = ((double)var22 - var16) / (var10 / 2.0D);
                           double var27 = ((double)var24 - var18) / (var12 / 2.0D);
                           double var29 = ((double)var23 - var20) / (var14 / 2.0D);
                           double var31 = var25 * var25 + var27 * var27 + var29 * var29;
                           if(var6 != null) {
                              double var42;
                              var10000 = (var42 = var31 - 1.0D) == 0.0D?0:(var42 < 0.0D?-1:1);
                              if(var6 == null) {
                                 continue label608;
                              }

                              if(var10000 < 0) {
                                 var7[(var22 * 16 + var23) * 8 + var24] = true;
                              }

                              ++var24;
                           }

                           if(var6 == null) {
                              break;
                           }
                        }

                        ++var23;
                        if(var6 == null) {
                           break label612;
                        }
                        break;
                     }
                  }
               }

               ++var22;
            } while(var6 != null);

            ++var9;
            if(var6 != null) {
               continue label621;
            }
            break;
         }

         var37 = 0;
         break;
      }

      var9 = var37;

      int var11;
      int var33;
      int var34;
      label574:
      while(true) {
         var10000 = var9;

         label571:
         while(var10000 < 16) {
            var37 = 0;
            if(var6 == null) {
               break label574;
            }

            var33 = 0;

            label568:
            do {
               var10000 = var33;

               label565:
               while(true) {
                  if(var10000 >= 16) {
                     break label568;
                  }

                  var10000 = 0;
                  if(var6 == null) {
                     continue label571;
                  }

                  var11 = 0;

                  while(true) {
                     if(var11 >= 8) {
                        break label565;
                     }

                     var10000 = var7[(var9 * 16 + var33) * 8 + var11];
                     if(var6 == null) {
                        break;
                     }

                     label560: {
                        label650: {
                           if(var6 != null) {
                              if(var10000 != 0) {
                                 break label650;
                              }

                              var10000 = var9;
                           }

                           label651: {
                              if(var6 != null) {
                                 if(var10000 < 15) {
                                    var10000 = var7[((var9 + 1) * 16 + var33) * 8 + var11];
                                    if(var6 == null) {
                                       break label560;
                                    }

                                    if(var10000 != 0) {
                                       break label651;
                                    }
                                 }

                                 var10000 = var9;
                              }

                              if(var6 != null) {
                                 if(var10000 > 0) {
                                    var10000 = var7[((var9 - 1) * 16 + var33) * 8 + var11];
                                    if(var6 == null) {
                                       break label560;
                                    }

                                    if(var10000 != 0) {
                                       break label651;
                                    }
                                 }

                                 var10000 = var33;
                              }

                              if(var6 != null) {
                                 if(var10000 < 15) {
                                    var10000 = var7[(var9 * 16 + var33 + 1) * 8 + var11];
                                    if(var6 == null) {
                                       break label560;
                                    }

                                    if(var10000 != 0) {
                                       break label651;
                                    }
                                 }

                                 var10000 = var33;
                              }

                              if(var6 != null) {
                                 if(var10000 > 0) {
                                    var10000 = var7[(var9 * 16 + (var33 - 1)) * 8 + var11];
                                    if(var6 == null) {
                                       break label560;
                                    }

                                    if(var10000 != 0) {
                                       break label651;
                                    }
                                 }

                                 var10000 = var11;
                              }

                              if(var6 != null) {
                                 if(var10000 < 7) {
                                    var10000 = var7[(var9 * 16 + var33) * 8 + var11 + 1];
                                    if(var6 == null) {
                                       break label560;
                                    }

                                    if(var10000 != 0) {
                                       break label651;
                                    }
                                 }

                                 var10000 = var11;
                              }

                              if(var6 != null) {
                                 if(var10000 <= 0) {
                                    break label650;
                                 }

                                 var10000 = var7[(var9 * 16 + var33) * 8 + (var11 - 1)];
                              }

                              if(var6 == null) {
                                 break label560;
                              }

                              if(var10000 == 0) {
                                 break label650;
                              }
                           }

                           var10000 = 1;
                           break label560;
                        }

                        var10000 = 0;
                     }

                     var34 = var10000;
                     if(var6 != null) {
                        if(var34 != 0) {
                           label500: {
                              label652: {
                                 awt var13 = var1.getBlock(var3 + var9, var4 + var11, var5 + var33).method_2424();
                                 var10000 = var11;
                                 byte var10001 = 4;
                                 if(var6 != null) {
                                    label490: {
                                       if(var11 >= 4) {
                                          var10000 = var13.method_5062();
                                          if(var6 == null) {
                                             break label490;
                                          }

                                          if(var10000 != 0) {
                                             return false;
                                          }
                                       }

                                       var10000 = var11;
                                    }

                                    if(var6 == null) {
                                       break label652;
                                    }

                                    var10001 = 4;
                                 }

                                 if(var10000 >= var10001) {
                                    break label500;
                                 }

                                 var10000 = var13.method_5063();
                              }

                              if(var10000 == 0 && var1.getBlock(var3 + var9, var4 + var11, var5 + var33) != this.field_6019) {
                                 return false;
                              }
                           }
                        }

                        ++var11;
                     }

                     if(var6 == null) {
                        break label565;
                     }
                  }
               }

               ++var33;
            } while(var6 != null);

            ++var9;
            if(var6 != null) {
               continue label574;
            }
            break;
         }

         var37 = 0;
         break;
      }

      var9 = var37;

      label464:
      while(true) {
         var10000 = var9;

         label461:
         while(var10000 < 16) {
            var37 = 0;
            if(var6 == null) {
               break label464;
            }

            var33 = 0;

            label458:
            do {
               var10000 = var33;

               label455:
               while(true) {
                  if(var10000 >= 16) {
                     break label458;
                  }

                  var10000 = 0;
                  if(var6 == null) {
                     continue label461;
                  }

                  var11 = 0;

                  while(true) {
                     if(var11 >= 8) {
                        break label455;
                     }

                     var10000 = var7[(var9 * 16 + var33) * 8 + var11];
                     if(var6 == null) {
                        break;
                     }

                     if(var10000 != 0) {
                        var1.method_2054(var3 + var9, var4 + var11, var5 + var33, var11 >= 4?class_1192.field_6025:this.field_6019, 0, 2);
                     }

                     ++var11;
                     if(var6 == null) {
                        break label455;
                     }
                  }
               }

               ++var33;
            } while(var6 != null);

            ++var9;
            if(var6 != null) {
               continue label464;
            }
            break;
         }

         var37 = 0;
         break;
      }

      var9 = var37;

      label430:
      while(true) {
         var10000 = var9;

         boolean var39;
         label427:
         while(var10000 < 16) {
            var39 = false;
            if(var6 == null) {
               return var39;
            }

            var33 = 0;

            label424:
            do {
               var10000 = var33;

               label421:
               while(true) {
                  if(var10000 >= 16) {
                     break label424;
                  }

                  var10000 = 4;
                  if(var6 == null) {
                     continue label427;
                  }

                  var11 = 4;

                  while(true) {
                     if(var11 >= 8) {
                        break label421;
                     }

                     var10000 = var7[(var9 * 16 + var33) * 8 + var11];
                     if(var6 == null) {
                        break;
                     }

                     if(var10000 != 0) {
                        label664: {
                           ahb var40 = var1;
                           if(var6 != null) {
                              if(var1.getBlock(var3 + var9, var4 + var11 - 1, var5 + var33) != class_1192.field_6028) {
                                 break label664;
                              }

                              var40 = var1;
                           }

                           if(var6 != null) {
                              if(var40.method_2074(class_95.field_53, var3 + var9, var4 + var11, var5 + var33) <= 0) {
                                 break label664;
                              }

                              var40 = var1;
                           }

                           label411: {
                              class_985 var35 = var40.method_35(var3 + var9, var5 + var33);
                              if(var6 != null) {
                                 if(var35.field_5034 != class_1192.field_6135) {
                                    break label411;
                                 }

                                 var1.method_2054(var3 + var9, var4 + var11 - 1, var5 + var33, class_1192.field_6135, 0, 2);
                              }

                              if(var6 != null) {
                                 break label664;
                              }
                           }

                           var1.method_2054(var3 + var9, var4 + var11 - 1, var5 + var33, class_1192.field_6027, 0, 2);
                        }
                     }

                     ++var11;
                     if(var6 == null) {
                        break label421;
                     }
                  }
               }

               ++var33;
            } while(var6 != null);

            ++var9;
            if(var6 != null) {
               continue label430;
            }
            break;
         }

         awt var41 = this.field_6019.method_2424();
         awt var38 = awt.field_4178;
         if(var6 != null) {
            if(var41 == awt.field_4178) {
               var9 = 0;

               label376:
               do {
                  var10000 = var9;

                  label373:
                  while(true) {
                     if(var10000 >= 16) {
                        break label376;
                     }

                     var39 = false;
                     if(var6 == null) {
                        return var39;
                     }

                     var33 = 0;

                     while(true) {
                        var10000 = var33;

                        label369:
                        while(true) {
                           if(var10000 >= 16) {
                              break label373;
                           }

                           var10000 = 0;
                           if(var6 == null) {
                              continue label373;
                           }

                           var11 = 0;

                           while(var11 < 8) {
                              var10000 = var7[(var9 * 16 + var33) * 8 + var11];
                              if(var6 == null) {
                                 continue label369;
                              }

                              label343: {
                                 label669: {
                                    if(var6 != null) {
                                       if(var10000 != 0) {
                                          break label669;
                                       }

                                       var10000 = var9;
                                    }

                                    label670: {
                                       if(var6 != null) {
                                          if(var10000 < 15) {
                                             var10000 = var7[((var9 + 1) * 16 + var33) * 8 + var11];
                                             if(var6 == null) {
                                                break label343;
                                             }

                                             if(var10000 != 0) {
                                                break label670;
                                             }
                                          }

                                          var10000 = var9;
                                       }

                                       if(var6 != null) {
                                          if(var10000 > 0) {
                                             var10000 = var7[((var9 - 1) * 16 + var33) * 8 + var11];
                                             if(var6 == null) {
                                                break label343;
                                             }

                                             if(var10000 != 0) {
                                                break label670;
                                             }
                                          }

                                          var10000 = var33;
                                       }

                                       if(var6 != null) {
                                          if(var10000 < 15) {
                                             var10000 = var7[(var9 * 16 + var33 + 1) * 8 + var11];
                                             if(var6 == null) {
                                                break label343;
                                             }

                                             if(var10000 != 0) {
                                                break label670;
                                             }
                                          }

                                          var10000 = var33;
                                       }

                                       if(var6 != null) {
                                          if(var10000 > 0) {
                                             var10000 = var7[(var9 * 16 + (var33 - 1)) * 8 + var11];
                                             if(var6 == null) {
                                                break label343;
                                             }

                                             if(var10000 != 0) {
                                                break label670;
                                             }
                                          }

                                          var10000 = var11;
                                       }

                                       if(var6 != null) {
                                          if(var10000 < 7) {
                                             var10000 = var7[(var9 * 16 + var33) * 8 + var11 + 1];
                                             if(var6 == null) {
                                                break label343;
                                             }

                                             if(var10000 != 0) {
                                                break label670;
                                             }
                                          }

                                          var10000 = var11;
                                       }

                                       if(var6 != null) {
                                          if(var10000 <= 0) {
                                             break label669;
                                          }

                                          var10000 = var7[(var9 * 16 + var33) * 8 + (var11 - 1)];
                                       }

                                       if(var6 == null) {
                                          break label343;
                                       }

                                       if(var10000 == 0) {
                                          break label669;
                                       }
                                    }

                                    var10000 = 1;
                                    break label343;
                                 }

                                 var10000 = 0;
                              }

                              var34 = var10000;
                              if(var6 != null) {
                                 if(var34 != 0) {
                                    label671: {
                                       var10000 = var11;
                                       if(var6 != null) {
                                          label282: {
                                             if(var11 >= 4) {
                                                var10000 = var2.nextInt(2);
                                                if(var6 == null) {
                                                   break label282;
                                                }

                                                if(var10000 == 0) {
                                                   break label671;
                                                }
                                             }

                                             var10000 = var1.getBlock(var3 + var9, var4 + var11, var5 + var33).method_2424().method_5063();
                                          }
                                       }

                                       if(var6 != null && var10000 != 0) {
                                          var1.method_2054(var3 + var9, var4 + var11, var5 + var33, class_1192.field_6026, 0, 2);
                                       }
                                    }
                                 }

                                 ++var11;
                              }

                              if(var6 == null) {
                                 break;
                              }
                           }

                           ++var33;
                           if(var6 == null) {
                              break label373;
                           }
                           break;
                        }
                     }
                  }

                  ++var9;
               } while(var6 != null);
            }

            var41 = this.field_6019.method_2424();
            var38 = awt.field_4177;
         }

         if(var41 == var38) {
            var9 = 0;

            label267:
            do {
               var10000 = var9;

               label264:
               while(true) {
                  if(var10000 >= 16) {
                     break label267;
                  }

                  var39 = false;
                  if(var6 == null) {
                     return var39;
                  }

                  var33 = 0;

                  while(true) {
                     if(var33 >= 16) {
                        break label264;
                     }

                     byte var36 = 4;
                     if(var6 != null) {
                        var10000 = var1.method_2146(var3 + var9, var4 + var36, var5 + var33);
                        if(var6 == null) {
                           break;
                        }

                        if(var10000 != 0) {
                           var1.method_2054(var3 + var9, var4 + var36, var5 + var33, class_1192.field_6105, 0, 2);
                        }

                        ++var33;
                     }

                     if(var6 == null) {
                        break label264;
                     }
                  }
               }

               ++var9;
            } while(var6 != null);
         }

         var39 = true;
         return var39;
      }
   }
}
