
// $FF: renamed from: bP
public class class_534 extends adb {

   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2382;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2974(class_872.field_4248);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var10000 = class_752.method_4253();
      aji var12 = var3.getBlock(var4, var5, var6);
      int var13 = var3.method_33(var4, var5, var6);
      String[] var11 = var10000;
      boolean var28 = var2.method_4628(var4, var5, var6, var7, var1);
      if(var11 != null) {
         if(var28 && var12 == class_1192.field_6144) {
            var28 = class_468.method_2819(var13);
            if(var11 == null) {
               return var28;
            }

            if(!var28) {
               byte var30 = var3.field_1832;
               if(var11 != null) {
                  if(var3.field_1832) {
                     return true;
                  }

                  var3.method_2055(var4, var5, var6, var13 + 4, 2);
                  var3.method_2221(var4, var5, var6, class_1192.field_6144);
                  --var1.field_2958;
                  var30 = 0;
               }

               int var14 = var30;

               while(true) {
                  if(var14 < 16) {
                     double var15 = (double)((float)var4 + (5.0F + field_2332.nextFloat() * 6.0F) / 16.0F);
                     double var17 = (double)((float)var5 + 0.8125F);
                     double var19 = (double)((float)var6 + (5.0F + field_2332.nextFloat() * 6.0F) / 16.0F);
                     double var21 = 0.0D;
                     double var23 = 0.0D;
                     double var25 = 0.0D;
                     String[] var10001 = field_2382;
                     var3.method_2087("smoke", var15, var17, var19, var21, var23, var25);
                     ++var14;
                     if(var11 == null) {
                        break;
                     }

                     if(var11 != null) {
                        continue;
                     }
                  }

                  var14 = var13 & 3;
                  break;
               }

               int var27 = 0;
               int var16 = 0;
               boolean var29 = false;
               byte var18 = 1;
               int var32 = class_1649.field_8593[var14];
               int var20 = -2;

               int var33;
               label733: {
                  int var22;
                  int var34;
                  int var35;
                  label709: {
                     while(true) {
                        if(var20 <= 2) {
                           var34 = var4 + class_1649.field_8587[var32] * var20;
                           var22 = var6 + class_1649.field_8588[var32] * var20;
                           if(var11 != null) {
                              label735: {
                                 aji var31 = var3.getBlock(var34, var5, var22);
                                 if(var11 == null) {
                                    if(var31 == class_1192.field_6144) {
                                       var30 = class_468.method_2819(var3.method_33(var34, var5, var22));
                                       if(var11 != null) {
                                          if(var30 != 0) {
                                             ++var20;
                                             if(var11 == null) {
                                                break label709;
                                             }
                                             break;
                                          }

                                          var18 = 0;
                                       } else {
                                          var18 = var30;
                                       }
                                    } else {
                                       var18 = 0;
                                    }

                                    if(var11 != null) {
                                       break label709;
                                    }

                                    ++var20;
                                    if(var11 == null) {
                                       break label709;
                                    }
                                    break;
                                 }

                                 if(var31 == class_1192.field_6144) {
                                    label738: {
                                       var28 = class_468.method_2819(var3.method_33(var34, var5, var22));
                                       if(var11 != null) {
                                          if(!var28) {
                                             var18 = 0;
                                             if(var11 != null) {
                                                break label735;
                                             }
                                          }

                                          var16 = var20;
                                          if(var11 == null) {
                                             break label738;
                                          }

                                          var28 = var29;
                                       }

                                       if(!var28) {
                                          var27 = var20;
                                          var29 = true;
                                       }

                                       ++var20;
                                    }
                                 } else {
                                    ++var20;
                                 }

                                 if(var11 != null) {
                                    continue;
                                 }
                              }
                           } else if(var11 != null) {
                              continue;
                           }
                        }

                        var33 = var18;
                        if(var11 == null) {
                           return (boolean)var33;
                        }

                        if(var18 == 0) {
                           break label733;
                        }

                        var33 = var16;
                        if(var11 == null) {
                           return (boolean)var33;
                        }

                        if(var16 != var27 + 2) {
                           break label733;
                        }

                        var20 = var27;
                        break;
                     }

                     label701:
                     while(true) {
                        while(true) {
                           if(var20 > var16) {
                              break label701;
                           }

                           var34 = var4 + class_1649.field_8587[var32] * var20;
                           var22 = var6 + class_1649.field_8588[var32] * var20;
                           var34 += class_1649.field_8587[var14] * 4;
                           var22 += class_1649.field_8588[var14] * 4;
                           if(var11 == null) {
                              label329:
                              while(true) {
                                 if(var20 <= var16 + 1) {
                                    var33 = 1;
                                    if(var11 != null) {
                                       var34 = 1;

                                       while(true) {
                                          if(var34 > 3) {
                                             var20 += 4;
                                             if(var11 != null) {
                                                continue label329;
                                             }

                                             var33 = var18;
                                             if(var11 == null) {
                                                return (boolean)var33;
                                             }

                                             if(var18 == 0) {
                                                break label733;
                                             }

                                             var20 = var27;
                                             if(var27 > var16) {
                                                break label733;
                                             }

                                             var33 = 1;
                                             if(var11 == null) {
                                                return (boolean)var33;
                                             }

                                             var34 = 1;
                                             break;
                                          }

                                          label377: {
                                             var22 = var4 + class_1649.field_8587[var32] * var20;
                                             var35 = var6 + class_1649.field_8588[var32] * var20;
                                             var22 += class_1649.field_8587[var14] * var34;
                                             var35 += class_1649.field_8588[var14] * var34;
                                             if(var11 != null) {
                                                if(var11 == null) {
                                                   var3.method_2054(var22, var5, var35, class_1192.field_6143, 0, 2);
                                                   ++var34;
                                                   if(var11 != null) {
                                                      if(var11 == null) {
                                                         ++var20;
                                                         if(var11 == null || var20 > var16) {
                                                            break label733;
                                                         }

                                                         var33 = 1;
                                                         if(var11 == null) {
                                                            return (boolean)var33;
                                                         }

                                                         var34 = 1;
                                                      }
                                                   } else {
                                                      if(var11 == null || var20 > var16) {
                                                         break label733;
                                                      }

                                                      var33 = 1;
                                                      if(var11 == null) {
                                                         return (boolean)var33;
                                                      }

                                                      var34 = 1;
                                                   }
                                                   break;
                                                }

                                                if(var3.getBlock(var22, var5, var35) == class_1192.field_6144) {
                                                   var30 = class_468.method_2819(var3.method_33(var22, var5, var35));
                                                   if(var11 != null) {
                                                      if(var30 != 0) {
                                                         break label377;
                                                      }

                                                      var18 = 0;
                                                   } else {
                                                      var18 = var30;
                                                   }
                                                } else {
                                                   var18 = 0;
                                                }
                                             }

                                             if(var11 != null) {
                                                var20 += 4;
                                                if(var11 != null) {
                                                   continue label329;
                                                }

                                                var33 = var18;
                                                if(var11 == null) {
                                                   return (boolean)var33;
                                                }

                                                if(var18 == 0) {
                                                   break label733;
                                                }

                                                var20 = var27;
                                                if(var27 > var16) {
                                                   break label733;
                                                }

                                                var33 = 1;
                                                if(var11 == null) {
                                                   return (boolean)var33;
                                                }

                                                var34 = 1;
                                                break;
                                             }
                                          }

                                          ++var34;
                                          if(var11 == null) {
                                             var20 += 4;
                                             if(var11 != null) {
                                                continue label329;
                                             }

                                             var33 = var18;
                                             if(var11 == null) {
                                                return (boolean)var33;
                                             }

                                             if(var18 == 0) {
                                                break label733;
                                             }

                                             var20 = var27;
                                             if(var27 > var16) {
                                                break label733;
                                             }

                                             var33 = 1;
                                             if(var11 == null) {
                                                return (boolean)var33;
                                             }

                                             var34 = 1;
                                             break;
                                          }
                                       }
                                    } else {
                                       if(var11 == null) {
                                          return (boolean)var33;
                                       }

                                       if(false) {
                                          break label733;
                                       }

                                       var20 = var27;
                                       if(var27 > var16) {
                                          break label733;
                                       }

                                       var33 = 1;
                                       if(var11 == null) {
                                          return (boolean)var33;
                                       }

                                       var34 = 1;
                                    }
                                 } else {
                                    var33 = var18;
                                    if(var11 == null) {
                                       return (boolean)var33;
                                    }

                                    if(var18 == 0) {
                                       break label733;
                                    }

                                    var20 = var27;
                                    if(var27 > var16) {
                                       break label733;
                                    }

                                    var33 = 1;
                                    if(var11 == null) {
                                       return (boolean)var33;
                                    }

                                    var34 = 1;
                                 }

                                 while(true) {
                                    while(true) {
                                       if(var34 > 3) {
                                          ++var20;
                                          if(var11 == null || var20 > var16) {
                                             break label733;
                                          }

                                          var33 = 1;
                                          if(var11 == null) {
                                             return (boolean)var33;
                                          }

                                          var34 = 1;
                                       } else {
                                          var22 = var4 + class_1649.field_8587[var32] * var20;
                                          var35 = var6 + class_1649.field_8588[var32] * var20;
                                          var22 += class_1649.field_8587[var14] * var34;
                                          var35 += class_1649.field_8588[var14] * var34;
                                          var3.method_2054(var22, var5, var35, class_1192.field_6143, 0, 2);
                                          ++var34;
                                          if(var11 != null) {
                                             if(var11 == null) {
                                                ++var20;
                                                if(var11 == null || var20 > var16) {
                                                   break label733;
                                                }

                                                var33 = 1;
                                                if(var11 == null) {
                                                   return (boolean)var33;
                                                }

                                                var34 = 1;
                                             }
                                          } else {
                                             if(var11 == null || var20 > var16) {
                                                break label733;
                                             }

                                             var33 = 1;
                                             if(var11 == null) {
                                                return (boolean)var33;
                                             }

                                             var34 = 1;
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           if(var11 != null) {
                              if(var3.getBlock(var34, var5, var22) == class_1192.field_6144) {
                                 var30 = class_468.method_2819(var3.method_33(var34, var5, var22));
                                 if(var11 != null) {
                                    if(var30 != 0) {
                                       ++var20;
                                       if(var11 == null) {
                                          break label701;
                                       }
                                       continue;
                                    }

                                    var18 = 0;
                                 } else {
                                    var18 = var30;
                                 }
                              } else {
                                 var18 = 0;
                              }

                              if(var11 != null) {
                                 break label701;
                              }

                              ++var20;
                              if(var11 == null) {
                                 break label701;
                              }
                           } else {
                              if(var11 != null) {
                                 break label701;
                              }

                              ++var20;
                              if(var11 == null) {
                                 break label701;
                              }
                           }
                        }
                     }
                  }

                  var20 = var27 - 1;

                  label321:
                  while(true) {
                     if(var20 <= var16 + 1) {
                        var33 = 1;
                        if(var11 != null) {
                           var34 = 1;

                           while(true) {
                              if(var34 > 3) {
                                 var20 += 4;
                                 if(var11 != null) {
                                    continue label321;
                                 }

                                 var33 = var18;
                                 if(var11 == null) {
                                    return (boolean)var33;
                                 }

                                 if(var18 == 0) {
                                    break label321;
                                 }

                                 var20 = var27;
                                 if(var27 > var16) {
                                    break label321;
                                 }

                                 var33 = 1;
                                 if(var11 == null) {
                                    return (boolean)var33;
                                 }

                                 var34 = 1;
                                 break;
                              }

                              label313: {
                                 var22 = var4 + class_1649.field_8587[var32] * var20;
                                 var35 = var6 + class_1649.field_8588[var32] * var20;
                                 var22 += class_1649.field_8587[var14] * var34;
                                 var35 += class_1649.field_8588[var14] * var34;
                                 if(var11 != null) {
                                    if(var11 == null) {
                                       var3.method_2054(var22, var5, var35, class_1192.field_6143, 0, 2);
                                       ++var34;
                                       if(var11 != null) {
                                          if(var11 == null) {
                                             ++var20;
                                             if(var11 == null || var20 > var16) {
                                                break label321;
                                             }

                                             var33 = 1;
                                             if(var11 == null) {
                                                return (boolean)var33;
                                             }

                                             var34 = 1;
                                          }
                                       } else {
                                          if(var11 == null || var20 > var16) {
                                             break label321;
                                          }

                                          var33 = 1;
                                          if(var11 == null) {
                                             return (boolean)var33;
                                          }

                                          var34 = 1;
                                       }
                                       break;
                                    }

                                    if(var3.getBlock(var22, var5, var35) == class_1192.field_6144) {
                                       var30 = class_468.method_2819(var3.method_33(var22, var5, var35));
                                       if(var11 != null) {
                                          if(var30 != 0) {
                                             break label313;
                                          }

                                          var18 = 0;
                                       } else {
                                          var18 = var30;
                                       }
                                    } else {
                                       var18 = 0;
                                    }
                                 }

                                 if(var11 != null) {
                                    var20 += 4;
                                    if(var11 != null) {
                                       continue label321;
                                    }

                                    var33 = var18;
                                    if(var11 == null) {
                                       return (boolean)var33;
                                    }

                                    if(var18 == 0) {
                                       break label321;
                                    }

                                    var20 = var27;
                                    if(var27 > var16) {
                                       break label321;
                                    }

                                    var33 = 1;
                                    if(var11 == null) {
                                       return (boolean)var33;
                                    }

                                    var34 = 1;
                                    break;
                                 }
                              }

                              ++var34;
                              if(var11 == null) {
                                 var20 += 4;
                                 if(var11 != null) {
                                    continue label321;
                                 }

                                 var33 = var18;
                                 if(var11 == null) {
                                    return (boolean)var33;
                                 }

                                 if(var18 == 0) {
                                    break label321;
                                 }

                                 var20 = var27;
                                 if(var27 > var16) {
                                    break label321;
                                 }

                                 var33 = 1;
                                 if(var11 == null) {
                                    return (boolean)var33;
                                 }

                                 var34 = 1;
                                 break;
                              }
                           }
                        } else {
                           if(var11 == null) {
                              return (boolean)var33;
                           }

                           if(false) {
                              break;
                           }

                           var20 = var27;
                           if(var27 > var16) {
                              break;
                           }

                           var33 = 1;
                           if(var11 == null) {
                              return (boolean)var33;
                           }

                           var34 = 1;
                        }
                     } else {
                        var33 = var18;
                        if(var11 == null) {
                           return (boolean)var33;
                        }

                        if(var18 == 0) {
                           break;
                        }

                        var20 = var27;
                        if(var27 > var16) {
                           break;
                        }

                        var33 = 1;
                        if(var11 == null) {
                           return (boolean)var33;
                        }

                        var34 = 1;
                     }

                     while(true) {
                        while(true) {
                           if(var34 > 3) {
                              ++var20;
                              if(var11 == null || var20 > var16) {
                                 break label321;
                              }

                              var33 = 1;
                              if(var11 == null) {
                                 return (boolean)var33;
                              }

                              var34 = 1;
                           } else {
                              var22 = var4 + class_1649.field_8587[var32] * var20;
                              var35 = var6 + class_1649.field_8588[var32] * var20;
                              var22 += class_1649.field_8587[var14] * var34;
                              var35 += class_1649.field_8588[var14] * var34;
                              var3.method_2054(var22, var5, var35, class_1192.field_6143, 0, 2);
                              ++var34;
                              if(var11 != null) {
                                 if(var11 == null) {
                                    ++var20;
                                    if(var11 == null || var20 > var16) {
                                       break label321;
                                    }

                                    var33 = 1;
                                    if(var11 == null) {
                                       return (boolean)var33;
                                    }

                                    var34 = 1;
                                 }
                              } else {
                                 if(var11 == null || var20 > var16) {
                                    break label321;
                                 }

                                 var33 = 1;
                                 if(var11 == null) {
                                    return (boolean)var33;
                                 }

                                 var34 = 1;
                              }
                           }
                        }
                     }
                  }
               }

               var33 = 1;
               return (boolean)var33;
            }
         }

         var28 = false;
      }

      return var28;
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      String[] var4;
      ahb var10;
      label37: {
         label36: {
            String[] var10000 = class_752.method_4253();
            azu var5 = this.method_2968(var2, var3, false);
            var4 = var10000;
            azu var9 = var5;
            if(var4 != null) {
               if(var5 == null) {
                  break label36;
               }

               var9 = var5;
            }

            if(var9.field_4212 == class_100.field_85) {
               var10 = var2;
               if(var4 == null) {
                  break label37;
               }

               if(var2.getBlock(var5.field_4213, var5.field_4214, var5.field_4215) == class_1192.field_6144) {
                  return var1;
               }
            }
         }

         var10 = var2;
      }

      if(var4 != null) {
         if(var10.field_1832) {
            return var1;
         }

         var10 = var2;
      }

      String[] var8 = field_2382;
      class_1034 var6 = var10.method_2214("Stronghold", (int)var3.field_2994, (int)var3.field_2995, (int)var3.field_2996);
      if(var6 != null) {
         class_712 var11 = new class_712;
         var11.method_4071(var2, var3.field_2994, var3.field_2995 + 1.62D - (double)var3.field_3013, var3.field_2996);
         class_712 var7 = var11;
         var7.method_4072((double)var6.field_5472, var6.field_5473, (double)var6.field_5474);
         var2.method_2089(var7);
         var2.method_2082(var3, "random.bow", 0.5F, 0.4F / (field_2332.nextFloat() * 0.4F + 0.8F));
         var2.method_2211((class_792)null, 1002, (int)var3.field_2994, (int)var3.field_2995, (int)var3.field_2996, 0);
         if(!var3.field_3640.field_2839) {
            --var1.field_2958;
         }
      }

      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Ö*Iàrê<ö7Më\n÷6Báx@ç\f/";
      int var4 = "Ö*Iàrê<ö7Më\n÷6Báx@ç\f/".length();
      char var1 = 10;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2382 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 217;
               break;
            case 1:
               var10009 = 63;
               break;
            case 2:
               var10009 = 4;
               break;
            case 3:
               var10009 = 122;
               break;
            case 4:
               var10009 = 210;
               break;
            case 5:
               var10009 = 73;
               break;
            default:
               var10009 = 50;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
