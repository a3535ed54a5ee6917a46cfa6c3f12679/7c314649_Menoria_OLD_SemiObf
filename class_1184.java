import java.io.PrintStream;
import java.util.Random;

// $FF: renamed from: hH
public class class_1184 extends class_1151 {

   // $FF: renamed from: c vD[]
   private static final class_1652[] field_6017;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6018;


   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6349();
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      byte var7 = 3;
      String[] var6 = class_752.method_4253();
      int var8 = var2.nextInt(2) + 2;
      int var9 = var2.nextInt(2) + 2;
      int var10 = 0;
      int var11 = var3 - var8 - 1;

      int var12;
      int var13;
      int var10000;
      int var10001;
      label385:
      while(true) {
         var10000 = var11;

         label382:
         while(var10000 <= var3 + var8 + 1) {
            var10000 = var4 - 1;
            if(var6 == null) {
               break label385;
            }

            var12 = var10000;

            label379:
            do {
               var10000 = var12;
               var10001 = var4 + var7 + 1;

               label376:
               while(true) {
                  if(var10000 > var10001) {
                     break label379;
                  }

                  var10000 = var5 - var9 - 1;
                  if(var6 == null) {
                     continue label382;
                  }

                  var13 = var10000;

                  while(true) {
                     if(var13 > var5 + var9 + 1) {
                        break label376;
                     }

                     awt var14 = var1.getBlock(var11, var12, var13).method_2424();
                     var10000 = var12;
                     var10001 = var4 - 1;
                     if(var6 == null) {
                        break;
                     }

                     if(var6 != null) {
                        label333: {
                           if(var12 == var10001) {
                              var10000 = var14.method_5063();
                              if(var6 == null) {
                                 break label333;
                              }

                              if(var10000 == 0) {
                                 return false;
                              }
                           }

                           var10000 = var12;
                        }

                        var10001 = var4 + var7 + 1;
                     }

                     if(var6 != null) {
                        label341: {
                           if(var10000 == var10001) {
                              var10000 = var14.method_5063();
                              if(var6 == null) {
                                 break label341;
                              }

                              if(var10000 == 0) {
                                 return false;
                              }
                           }

                           var10000 = var11;
                        }

                        var10001 = var3 - var8 - 1;
                     }

                     label394: {
                        label395: {
                           if(var6 != null) {
                              label396: {
                                 if(var10000 != var10001) {
                                    var10000 = var11;
                                    var10001 = var3 + var8 + 1;
                                    if(var6 == null) {
                                       break label396;
                                    }

                                    if(var11 != var10001) {
                                       var10000 = var13;
                                       var10001 = var5 - var9 - 1;
                                       if(var6 == null) {
                                          break label396;
                                       }

                                       if(var13 != var10001) {
                                          var10000 = var13;
                                          var10001 = var5 + var9 + 1;
                                          if(var6 == null) {
                                             break label396;
                                          }

                                          if(var13 != var10001) {
                                             break label394;
                                          }
                                       }
                                    }
                                 }

                                 var10000 = var12;
                                 if(var6 == null) {
                                    break label395;
                                 }

                                 var10001 = var4;
                              }
                           }

                           if(var10000 != var10001) {
                              break label394;
                           }

                           var10000 = var1.method_34(var11, var12, var13);
                        }

                        if(var6 != null) {
                           if(var10000 == 0) {
                              break label394;
                           }

                           var10000 = var1.method_34(var11, var12 + 1, var13);
                        }

                        if(var10000 != 0) {
                           ++var10;
                        }
                     }

                     ++var13;
                     if(var6 == null) {
                        break label376;
                     }
                  }
               }

               ++var12;
            } while(var6 != null);

            ++var11;
            if(var6 != null) {
               continue label385;
            }
            break;
         }

         var10000 = var10;
         break;
      }

      if(var6 != null) {
         if(var10000 >= 1) {
            label421: {
               var10000 = var10;
               byte var21 = 5;
               if(var6 != null) {
                  if(var10 > 5) {
                     break label421;
                  }

                  var10000 = var3 - var8;
                  var21 = 1;
               }

               var11 = var10000 - var21;

               label298:
               while(true) {
                  var10000 = var11;

                  label295:
                  while(var10000 <= var3 + var8 + 1) {
                     var10000 = var4 + var7;
                     if(var6 == null) {
                        break label298;
                     }

                     var12 = var10000;

                     label292:
                     do {
                        var10000 = var12;
                        var10001 = var4 - 1;

                        label289:
                        while(true) {
                           if(var10000 < var10001) {
                              break label292;
                           }

                           var10000 = var5 - var9 - 1;
                           if(var6 == null) {
                              continue label295;
                           }

                           var13 = var10000;

                           while(true) {
                              if(var13 > var5 + var9 + 1) {
                                 break label289;
                              }

                              label283: {
                                 label403: {
                                    var10000 = var11;
                                    if(var6 != null) {
                                       label404: {
                                          var10001 = var3 - var8 - 1;
                                          if(var6 == null) {
                                             break;
                                          }

                                          if(var11 != var10001) {
                                             var10000 = var12;
                                             if(var6 == null) {
                                                break label404;
                                             }

                                             if(var12 != var4 - 1) {
                                                var10000 = var13;
                                                if(var6 == null) {
                                                   break label404;
                                                }

                                                if(var13 != var5 - var9 - 1) {
                                                   var10000 = var11;
                                                   if(var6 == null) {
                                                      break label404;
                                                   }

                                                   if(var11 != var3 + var8 + 1) {
                                                      var10000 = var12;
                                                      if(var6 == null) {
                                                         break label404;
                                                      }

                                                      if(var12 != var4 + var7 + 1) {
                                                         if(var6 == null) {
                                                            break label283;
                                                         }

                                                         if(var13 != var5 + var9 + 1) {
                                                            break label403;
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }

                                          var10000 = var12;
                                       }
                                    }

                                    if(var6 != null) {
                                       label257: {
                                          if(var10000 >= 0) {
                                             var10000 = var1.getBlock(var11, var12 - 1, var13).method_2424().method_5063();
                                             if(var6 == null) {
                                                break label257;
                                             }

                                             if(var10000 == 0) {
                                                var1.method_2056(var11, var12, var13);
                                                if(var6 != null) {
                                                   break label283;
                                                }
                                             }
                                          }

                                          var10000 = var1.getBlock(var11, var12, var13).method_2424().method_5063();
                                       }
                                    }

                                    if(var6 != null) {
                                       if(var10000 == 0) {
                                          break label283;
                                       }

                                       var10000 = var12;
                                    }

                                    if(var6 != null) {
                                       label249: {
                                          if(var10000 == var4 - 1) {
                                             var10000 = var2.nextInt(4);
                                             if(var6 == null) {
                                                break label249;
                                             }

                                             if(var10000 != 0) {
                                                var1.method_2054(var11, var12, var13, class_1192.field_6075, 0, 2);
                                                if(var6 != null) {
                                                   break label283;
                                                }
                                             }
                                          }

                                          var1.method_2054(var11, var12, var13, class_1192.field_6029, 0, 2);
                                       }
                                    }

                                    if(var6 != null) {
                                       break label283;
                                    }
                                 }

                                 var1.method_2056(var11, var12, var13);
                              }

                              ++var13;
                              if(var6 == null) {
                                 break label289;
                              }
                           }
                        }

                        --var12;
                     } while(var6 != null);

                     ++var11;
                     if(var6 != null) {
                        continue label298;
                     }
                     break;
                  }

                  var10000 = 0;
                  break;
               }

               var11 = var10000;

               label215:
               while(true) {
                  var10000 = var11;

                  label212:
                  while(var10000 < 2) {
                     if(var6 == null) {
                        break label215;
                     }

                     var12 = 0;

                     while(true) {
                        if(var12 < 3) {
                           label407: {
                              var13 = var3 + var2.nextInt(var8 * 2 + 1) - var8;
                              int var15 = var5 + var2.nextInt(var9 * 2 + 1) - var9;
                              var10000 = var1.method_34(var13, var4, var15);
                              if(var6 == null) {
                                 continue label212;
                              }

                              label414: {
                                 if(var6 != null) {
                                    if(var10000 == 0) {
                                       break label414;
                                    }

                                    var10000 = 0;
                                 }

                                 int var16 = var10000;
                                 var10000 = var1.getBlock(var13 - 1, var4, var15).method_2424().method_5063();
                                 if(var6 != null) {
                                    if(var10000 != 0) {
                                       ++var16;
                                    }

                                    var10000 = var1.getBlock(var13 + 1, var4, var15).method_2424().method_5063();
                                 }

                                 if(var6 != null) {
                                    if(var10000 != 0) {
                                       ++var16;
                                    }

                                    var10000 = var1.getBlock(var13, var4, var15 - 1).method_2424().method_5063();
                                 }

                                 if(var6 != null) {
                                    if(var10000 != 0) {
                                       ++var16;
                                    }

                                    var10000 = var1.getBlock(var13, var4, var15 + 1).method_2424().method_5063();
                                 }

                                 if(var6 != null) {
                                    if(var10000 != 0) {
                                       ++var16;
                                    }

                                    var10000 = var16;
                                 }

                                 if(var6 != null) {
                                    if(var10000 != 1) {
                                       break label414;
                                    }

                                    var1.method_2054(var13, var4, var15, class_1192.field_6081, 0, 2);
                                 }

                                 class_1652[] var17 = class_1652.method_9098(field_6017, new class_1652[]{class_1010.field_5259.getBlock06(var2)});
                                 class_594 var18 = (class_594)var1.method_31(var13, var4, var15);
                                 if(var6 == null) {
                                    break;
                                 }

                                 if(var18 == null) {
                                    break label407;
                                 }

                                 class_1652.method_9096(var2, var17, var18, 8);
                                 if(var6 != null) {
                                    break label407;
                                 }
                              }

                              ++var12;
                              if(var6 != null) {
                                 continue;
                              }
                           }
                        }

                        ++var11;
                        break;
                     }

                     if(var6 != null) {
                        continue label215;
                     }
                     break;
                  }

                  var1.method_2054(var3, var4, var5, class_1192.field_6079, 0, 2);
                  break;
               }

               label166: {
                  class_584 var20 = (class_584)var1.method_31(var3, var4, var5);
                  class_584 var23 = var20;
                  if(var6 != null) {
                     if(var20 == null) {
                        break label166;
                     }

                     var23 = var20;
                  }

                  var23.method_3123().method_5672(this.method_6404(var2));
                  if(var6 != null) {
                     return true;
                  }
               }

               PrintStream var24 = System.err;
               StringBuilder var22 = new StringBuilder();
               String[] var19 = field_6018;
               var24.println(var22.append("Failed to fetch mob spawner entity at (").append(var3).append(", ").append(var4).append(", ").append(var5).append(")").toString());
               return true;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (java.util.Random) java.lang.String
   private String method_6404(Random var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = var1.nextInt(4);
      String[] var2 = var10000;
      int var5 = var3;
      String[] var4;
      if(var2 != null) {
         if(var3 == 0) {
            var4 = field_6018;
            return "Skeleton";
         }

         var5 = var3;
      }

      byte var10001 = 1;
      if(var2 != null) {
         if(var5 == 1) {
            var4 = field_6018;
            return "Zombie";
         }

         var5 = var3;
         var10001 = 2;
      }

      if(var2 != null) {
         if(var5 == var10001) {
            var4 = field_6018;
            return "Zombie";
         }

         var5 = var3;
         var10001 = 3;
      }

      if(var5 == var10001) {
         var10000 = field_6018;
         return "Spider";
      } else {
         return "";
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_6405() {
      // $FF: Couldn't be decompiled
   }
}
